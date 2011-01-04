/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.checkIsEntity;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.util.EntityUtil;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public abstract class EntityManagerDelegateImpl extends SparqlDataSourceManager implements EntityDataSourceManager {

	protected final Mapping mapping;

	private final Map<URI, EObject> allEntitiesByURI;
	
	private final Map<EObject, URI> allEntities;

	private final List<Object> markAsToSaveEntities;

	private final List<Object> markAsToDeleteEntities;

	private final List<Object> markAsDetachEntities;

	protected final ResourceManager manager;
	
	@Inject
	EntityManagerDelegateImpl(ResourceManager manager, Mapping mapping, @Named("DataSources") Federation dataSources) {
		super(dataSources);

		this.mapping = mapping;
		this.manager = manager;
		this.allEntitiesByURI = new HashMap<URI, EObject>();
		this.allEntities = new HashMap<EObject, URI>();
		this.markAsToSaveEntities = new ArrayList<Object>();
		this.markAsToDeleteEntities = new ArrayList<Object>();
		this.markAsDetachEntities = new ArrayList<Object>();
	}

	protected abstract PutObject put();

	protected abstract GetObject get();

	protected abstract int lastIndexOf(EClass eClass);
		
	@Override 
	public void put(URI uri, EObject eObject) {
		checkNotNull(uri);
		checkNotNull(eObject);
		
		if (!eObject.eIsProxy()) {
			if (allEntitiesByURI.containsKey(uri)) {
				EObject oldProxy = allEntitiesByURI.remove(uri);
				checkArgument(allEntitiesByURI.containsKey(uri) == false);
				checkArgument(allEntitiesByURI.get(uri) == null);
				
				if (allEntities.containsKey(oldProxy)) {
					allEntities.remove(oldProxy);
//					EcoreUtil.delete(oldProxy);
				}
			}
			allEntitiesByURI.put(uri, eObject);
			allEntities.put(eObject, uri);
		}
	}

	@Override 
	public void add(Object object) {
		checkIsEntity(object);
		
		final URI entityKey = id( object );
		
		if (entityKey != null) 
		{
			if ( ((EObject) object).eResource() == null )
			{
				manager.getResource(((EObject) object).eClass()).getContents().add((EObject) object);
			}
			
			put(entityKey, (EObject) object);
		}
	}

	@Override 
	public void clear() {
		getDetachEntities().clear();
		getDeleteEntities().clear();
		getAllEntities().clear();
		manager.clear();
	}

	@Override 
	public boolean contains(Object object) {
		checkIsEntity(object);
				
		return getAllEntities().containsKey( object );
	}

	@Override
	public URI id(Object object) {
		checkIsEntity(object);
		
		return doID((EObject) object);
	}
	
	private URI doID(EObject object) {
		URI entityKey = null;
		
		if ( allEntities.containsKey(object) ){
			entityKey = allEntities.get(object);
		} 
		else if ( isGeneratedId((EObject)object) )
		{
			entityKey = allEntities.get(object);
			if (entityKey == null)
			{
				EAttribute attrId = EntityUtil.getId(object.eClass());				
				if (object.eIsSet(attrId)) {
					String base = attrId.getEAnnotation("GenereatedId").getDetails().get("base");
					entityKey = base != null ? EntityUtil.URI(base + object.eGet(attrId)) : EntityUtil.URI(object.eGet(attrId)); 
				}
				entityKey = generateId(object);
				put(entityKey, object);
			}
		}
		else {
			entityKey = ID.id(object);
			put(entityKey, object);
		}
		
		return entityKey;
	}
	
	private URI generateId(EObject object) {
		int dbindex = lastIndexOf(object.eClass());
		
		List<Object> objs = Lists.newArrayList();
		for (Object obj: getAllEntities().values() )
		{
			if (object.eClass().getInstanceClass().isInstance(obj))
			{
				objs.add(obj);
			}
		}
		int cacheindex = objs.size();
		
		return ID.generate((EObject)object, dbindex + cacheindex + 1);
	}

	private boolean isGeneratedId(EObject object) {
		final EAttribute attr = EntityUtil.getId(object.eClass());
		final EAnnotation ann = attr.getEAnnotation("GeneratedId");
				
		return ann != null;
	}
	
	@Override 
	public EObject getByKey(URI key) {
		for (Entry<EObject, URI> uri: getAllEntities().entrySet()) {
			if (key.equals(uri.getValue()))
				return uri.getKey();
		}
		return null;
	}

	@Override 
	public void persist(Object object) {
		final URI entityKey = id( object );
		
		if (entityKey != null) 
		{
			if (!getAllEntities().containsKey(entityKey)) 
			{
				add(object);
			}
			if (!getSaveEntities().contains(object)) 
			{
				getSaveEntities().add(object);	
			}
		}
	}

	@Override 
	public void remove(Object object) {
		final URI entityKey = id( object );
		
		if (entityKey != null) 
		{
			if (!getAllEntities().containsKey(entityKey)) 
			{
				put(entityKey, (EObject)object);
			}
			if (!getDeleteEntities().contains(object)) 
			{
				getDeleteEntities().add(object);
			}
		}
	}

	@Override 
	public void detach(Object object) {
		final URI entityKey = id( object );
		
		if (entityKey != null) 
		{
			if (getAllEntities().containsKey(entityKey)) 
			{
				if (!getDetachEntities().contains(object)) 
				{
					getDetachEntities().add(object);
				}
			} 
			else 
			{
				put(entityKey, (EObject)object);
			}
		}
	}

	@Override 
	public void flush() {
		final List<Object> removed = Lists.newArrayList();
		
		saveAll(getSaveEntities());
		
		for (Object obj: getAllEntities().values()) 
		{
			if (getDeleteEntities().contains(obj)) 
			{
				remove(obj);
				getDeleteEntities().remove(obj);
				removed.add(obj);
			} 
//			if (getSaveEntities().contains(obj))
//			{		
//				getSaveEntities().remove(obj);
//			}
		}

		getAllEntities().clear();
		getDetachEntities().clear();
		getDetachEntities().clear();
		getSaveEntities().clear();
	}

	private synchronized List<Object> getDetachEntities() {
		return markAsDetachEntities;
	}

	private synchronized List<Object> getDeleteEntities() {
		return markAsToDeleteEntities;
	}

	private synchronized List<Object> getSaveEntities() {
		return markAsToSaveEntities;
	}

	private synchronized Map<EObject, URI> getAllEntities() {
		return allEntities;
	}

	@Override
	public boolean containsKey(URI primaryKey) {
		return getAllEntities().containsKey(primaryKey);
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
	
	private static final class ID {
		
		private static final String GENERATED_ID = "GeneratedId";
		
		static URI id(EObject object) { 
			return IDGenerator.getId(object); 
		}
			
		static URI generate(EObject object, int index) {
			String value = null;
			final String namespace;
			
			EAttribute attr = EntityUtil.getId(object.eClass());

			if (attr.getEAnnotation(GENERATED_ID).getDetails().containsKey(IDGenerator.BASE)) 
			{
				namespace = attr.getEAnnotation(GENERATED_ID).getDetails().get(IDGenerator.BASE);
			}
			else
			{
				namespace = EntityUtil.namespace(object);
			}

			value = EntityUtil.validNamespace(namespace) + index;
			
			return URI.createURI( value );
		}
		
	}
}
