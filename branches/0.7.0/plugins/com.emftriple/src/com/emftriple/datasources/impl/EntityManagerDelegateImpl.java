/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.checkIsEntity;
import static com.emftriple.util.EntityUtil.getETripleAnnotation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.util.EntityUtil;
import com.google.common.collect.BiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public abstract class EntityManagerDelegateImpl extends SparqlDataSourceManager implements EntityDataSourceManager {

	protected final Mapping mapping;

	private final BiMap<URI, Object> allEntities;

	private final List<Object> markAsToSaveEntities;

	private final List<Object> markAsToDeleteEntities;

	private final List<Object> markAsDetachEntities;

	@Inject
	EntityManagerDelegateImpl(Mapping mapping, @Named("DataSources") Federation dataSources) {
		super(dataSources);

		this.mapping = mapping;
		this.allEntities = Maps.newHashBiMap();
		this.markAsToSaveEntities = new ArrayList<Object>();
		this.markAsToDeleteEntities = new ArrayList<Object>();
		this.markAsDetachEntities = new ArrayList<Object>();
	}

	protected abstract PutObject put();

	protected abstract GetObject get(boolean getProxy);

	protected abstract int lastIndexOf(EClass eClass);
	
	@Override 
	public void put(URI uri, EObject eObject) {
		if ( eObject.eResource() == null )
		{
			((ETripleEntityTransaction)getTransaction())
				.getTransactionResource().getContents().add(eObject);
		}		
		if ( !getAllEntities().containsKey(uri) ) 
		{
			getAllEntities().put(uri, eObject);
		}
	}

	@Override 
	public void add(Object object) {
		final URI entityKey = id( object );
		
		if (entityKey != null) 
		{
			if (!getAllEntities().containsKey(entityKey)) 
			{
				getAllEntities().put(entityKey, object);
			}
		}
	}

	@Override 
	public void clear() {
		getDetachEntities().clear();
		getDeleteEntities().clear();
		getAllEntities().clear();
	}

	@Override 
	public boolean contains(Object object) {
		checkIsEntity(object);
				
		return getAllEntities().inverse().containsKey( object );
	}

	@Override
	public URI id(Object object) {
		checkIsEntity(object);
		
		return id((EObject) object);
	}
	
	private URI id(EObject object) {
		URI entityKey = null;
		
		if ( isGeneratedId((EObject)object) )
		{
			entityKey = allEntities.inverse().get(object);
			if (entityKey == null)
			{
				entityKey = generateId((EObject)object);
			}
		}
		else
		{
			entityKey = ID.id(object);
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
		EAnnotation ann = getETripleAnnotation(object.eClass(), "GeneratedId");
		
		if (ann == null)
		{
			for (EClass eClass: object.eClass().getEAllSuperTypes())
			{
				if (getETripleAnnotation(eClass, "GeneratedId") != null)
				{
					return true;
				}
			}
		}
		
		return ann != null;
	}
	
	@Override 
	public Object get(Object key) {
		return getAllEntities().get(key);
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
		for (Object obj: getAllEntities().values()) 
		{
			if (getDeleteEntities().contains(obj)) 
			{
				remove(obj);
				getDeleteEntities().remove(obj);
				removed.add(obj);
			} 
			if (getSaveEntities().contains(obj))
			{
				save(obj);
				getSaveEntities().remove(obj);
			}
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

	private synchronized BiMap<URI, Object> getAllEntities() {
		return allEntities;
	}

	@Override
	public boolean containsKey(Object primaryKey) {
		return getAllEntities().containsKey(primaryKey);
	}

	private static final class ID {
		
		private static final String GENERATED_ID = "GeneratedId";
		

		static URI id(EObject object) { 
			return EntityUtil.ID.getId(object); 
		}
			
		static URI generate(EObject object, int index) {
			String value = null;
			final String namespace;

			if (getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().containsKey(EntityUtil.ID.BASE)) 
			{
					namespace = getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().get(EntityUtil.ID.BASE);
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