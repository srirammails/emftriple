/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.checkIsEntity;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityExistsException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.IMapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.ETripleLocalCache;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;
import com.emftriple.transform.IPutObject;
import com.emftriple.util.EntityUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public abstract class EntityManagerDelegateImpl extends SparqlDataSourceManager implements IEntityDataSourceManager {

	protected final IMapping mapping;

	protected final ResourceManager manager;

	private final EntityManagerLevelCache localCache;

	@Inject
	EntityManagerDelegateImpl(ResourceManager manager, IMapping mapping, @Named("DataSources") Federation dataSources) {
		super(dataSources);

		this.mapping = mapping;
		this.manager = manager;
		this.localCache = new EntityManagerLevelCache();
	}

	protected abstract IPutObject put();

	protected abstract IGetObject get();

	protected abstract int lastIndexOf(EClass eClass);

	@Override 
	public void clear() {
		localCache.evictAll();
		manager.clear();
	}
	
	@Override
	public void addToContext(EObject object) {
		checkIsEntity(object);
		
		localCache.addToCache(id(object), object);
	}

	@Override 
	public boolean contains(EObject object) {
		return localCache.contains( object.eClass(), id(object) );
	}

	@Override 
	public EObject getByKey(URI key) {
		return localCache.get(key);
	}

	@Override 
	public void persist(EObject object) throws EntityExistsException, IllegalArgumentException {
		final URI entityKey = id( object );
		
		if (entityKey != null) {
			if (localCache.save.contains(entityKey)) {
				throw new EntityExistsException();
			}

			localCache.addToCache(entityKey, object);
			localCache.setAsSave(entityKey);
		}
	}

	@Override 
	public void remove(EObject object) throws IllegalArgumentException {
		final URI entityKey = id( object );

		if (entityKey != null) {
			localCache.setAsDelete(entityKey);
		}
	}

	/**
	 * Remove the given entity from the persistence context, causing a managed entity to become detached.
	 */
	@Override 
	public void detach(EObject object) throws IllegalArgumentException {
		final URI entityKey = id( object );

		if (entityKey != null) {
			localCache.evict(entityKey);
		}
	}

	/**
	 * Synchronize the persistence context to the underlying database.
	 */
	@Override 
	public void flush() {
		for (String key: localCache.save)
			save(localCache.get(key));
		for (String key: localCache.delete)
			delete(localCache.get(key));
		
		localCache.clearAfterPersist();
		put().clearCache();
	}

	@Override
	public boolean containsKey(URI primaryKey) {
		return localCache.contains(primaryKey);
	}

	@Override
	public boolean entityExists(URI key, EClass eClass) {
		boolean exists = false;

		for (URI rdfType: mapping.getRdfTypes(eClass)) {
			final String query = 
				"ASK WHERE { <" + key + "> <" + RDF.type + "> <" + rdfType + "> }";
			exists = exists || 	executeAskQuery(query);
		}

		return exists;
	}
	
	@Override
	public URI id(EObject object) {
		checkIsEntity(object);

		return URI.createURI(doID(object));
	}

	private String doID(EObject object) {
		String entityKey = localCache.getKey(object);
		if (entityKey != null) {
			return entityKey;
		}

		if ( isGeneratedId(object) )
		{
			EAttribute attrId = EntityUtil.getId(object.eClass());				
			if (object.eIsSet(attrId)) {
				String base = EntityUtil.getETripleAnnotation(attrId, "Id").getDetails().get("base");
				entityKey = base != null ? base + object.eGet(attrId) : object.eGet(attrId).toString(); 
			}
			
			entityKey = generateId(object);
		}
		else {
			entityKey = ID.id(object);		
		}

		return entityKey;
	}

	private String generateId(EObject object) {
		int dbindex = lastIndexOf(object.eClass());

		List<Object> objs = Lists.newArrayList();
		for (EObject obj: localCache.cachedObjects.values() )
		{
			if (object.eClass().getInstanceClass().isInstance(obj))
			{
				objs.add(obj);
			}
		}
		int cacheindex = objs.size();

		return ID.generate(object, dbindex + cacheindex + 1);
	}

	private boolean isGeneratedId(EObject object) {
		final EAttribute attr = EntityUtil.getId(object.eClass());
		final EAnnotation ann = attr.getEAnnotation(ID.GENERATED_ID);

		return ann != null;
	}

	private static final class ID {

		private static final String GENERATED_ID = "GeneratedValue";

		static String id(EObject object) { 
			return IDGenerator.getId(object); 
		}

		static String generate(EObject object, int index) {
			String value = null;
			final String namespace;

			EAttribute attr = EntityUtil.getId(object.eClass());

			if (EntityUtil.getETripleAnnotation(attr, "Id").getDetails().containsKey(IDGenerator.BASE)) 
			{
				namespace = EntityUtil.getETripleAnnotation(attr, "Id").getDetails().get(IDGenerator.BASE);
			}
			else
			{
				namespace = EntityUtil.namespace(object);
			}

			value = EntityUtil.validNamespace(namespace) + index;

			return value;
		}

	}
	
	/**
	 * 
	 * Level 1 Cache
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.7.1
	 *
	 */
	protected class EntityManagerLevelCache implements ETripleLocalCache {
		
		private Map<String, EObject> cachedObjects = Maps.newConcurrentHashMap();
		
		private Map<EObject, String> cachedKeys = Maps.newConcurrentHashMap();
		
		private List<String> delete = Lists.newArrayList();
		
		private List<String> save = Lists.newArrayList(); 
		
		/**
		 * Whether the cache contains data for the given entity.
		 */
		@Override
		public boolean contains(@SuppressWarnings("rawtypes") Class arg0, Object primaryKey) {
			return cachedObjects.containsKey(primaryKey.toString());
		}

		/**
		 *  Remove the data for entities of the specified class (and its subclasses) from the cache.
		 */
		@Override
		public void evict(@SuppressWarnings("rawtypes") Class arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Remove the data for the given entity from the cache.
		 */
		@Override
		public void evict(@SuppressWarnings("rawtypes") Class arg0, Object primaryKey) {
			cachedObjects.remove(primaryKey.toString());
		}

		/**
		 * Clear the cache.
		 */
		@Override
		public void evictAll() {
			cachedObjects.clear();
		}

		/**
		 * Whether the cache contains data for the given key.
		 */
		@Override
		public boolean contains(URI key) {
			return cachedObjects.containsKey(key.toString());
		}

		/**
		 * Whether the cache contains data for the given entity.
		 */
		@Override
		public boolean contains(EClass eClass, URI key) {
			return cachedObjects.containsKey(key.toString());
		}

		@Override
		public void evict(URI key) {
			if (cachedObjects.containsKey(key.toString()))
				cachedObjects.remove(key.toString());
		}

		@Override
		public void addToCache(Object primaryKey, EObject object) {
			cachedObjects.put(primaryKey.toString(), object);
			cachedKeys.put(object, primaryKey.toString());
		}

		@Override
		public void setAsDelete(Object primaryKey) {
			delete.add(primaryKey.toString());
		}

		@Override
		public void setAsSave(Object primaryKey) {
			save.add(primaryKey.toString());
		}

		@Override
		public void clearAfterPersist() {
			save.clear();
			delete.clear();
		}

		@Override
		public EObject get(Object primaryKey) {
			return cachedObjects.get(primaryKey.toString());
		}

		@Override
		public String getKey(EObject object) {
			return cachedKeys.get(object);
		}
		
	}
}
