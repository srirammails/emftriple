/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import static com.emftriple.util.ETripleEcoreUtil.filter;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.impl.DataSourceModule;
import com.emftriple.datasources.impl.DataSourceModule.EStoreDataSourceModule;
import com.emftriple.datasources.impl.DataSourceModule.EntityDataSourceModule;
import com.emftriple.resource.ETripleObject;
import com.emftriple.resource.ETripleStore;
import com.emftriple.util.PersistenceUnitUtilImpl;
import com.google.common.base.Preconditions;
import com.google.inject.Guice;
import com.google.inject.internal.Maps;

/**
 * Implementation of {@link EntityManagerFactory}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ETripleEntityManagerFactory implements EntityManagerFactory {

	private final Collection<EntityManager> createdEntityManagers;

	private final Mapping mapping;

	private final PersistenceUnit unit;

	private boolean isOpen = true;

	private Map<String, Object> properties;

	public ETripleEntityManagerFactory(PersistenceUnit unit, Mapping mapping) {
		this.mapping = mapping;
		this.unit = unit;
		this.createdEntityManagers = new HashSet<EntityManager>();
		this.properties = new HashMap<String, Object>();
	}

	@Override
	public EntityManager createEntityManager() throws IllegalArgumentException {
		if (!isOpen()) {
			throw new IllegalStateException("EntityManagerFactory is not open.");
		}

		try {
			return doCreateEntityManager(new HashMap<String, String>());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public EntityManager createEntityManager(@SuppressWarnings("rawtypes") Map options) throws IllegalArgumentException {
		if (!isOpen()) {
			throw new IllegalStateException("EntityManagerFactory is not open.");
		}

		try {
			return doCreateEntityManager(options);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private EntityManager doCreateEntityManager(@SuppressWarnings("rawtypes") Map options) throws IllegalStateException {

		EntityManager entityManager = null;
		final DataSourceModule module;
		EntityDataSourceManager dataSourceManager = null;

		if (isEStoreEnable(mapping.getEPackages())) 
		{
			ETripleStore eStore = new ETripleStore();

			try {
				module = new EStoreDataSourceModule( mapping, unit.getDataSources(), eStore );
				dataSourceManager = Guice.createInjector(module).getInstance( EntityDataSourceManager.class );
				if (dataSourceManager == null) 
				{
					throw new IllegalStateException("Cannot create DataSourceManager");
				}
				entityManager = new EStoreEntityManager(this, dataSourceManager, mapping, eStore);
				eStore.setEntityManager(entityManager);
			} catch (Exception e) {
				e.printStackTrace();
			}

			Registry.INSTANCE.put(entityManager, eStore);
		} 
		else 
		{
			module = new EntityDataSourceModule( mapping, unit.getDataSources() );
			try {
				dataSourceManager = Guice.createInjector(module).getInstance( EntityDataSourceManager.class );
				if (dataSourceManager == null) 
				{
					throw new IllegalStateException("Cannot create DataSourceManager");
				}
				entityManager = new EObjectEntityManager(this, dataSourceManager, mapping);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Registry.INSTANCE.put(entityManager, null);
		}

		createdEntityManagers.add(entityManager);
		dataSourceManager.connect();

		return entityManager;

	}

	private boolean isEStoreEnable(List<EPackage> ePackages) {
		Boolean res = false;
		for (EPackage ePackage: ePackages) {
			for (EClass eClass: filter(ePackage.getEClassifiers(), EClass.class)) {
				if (ETripleObject.class.isAssignableFrom(eClass.getInstanceClass())) {
					res = res || Boolean.TRUE;
				} else {
					res = res || Boolean.FALSE;
				}
			}
		}
		return res;
	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}

	@Override
	public void close() {
		isOpen = false;
		clear();
	}

	private void clear() {
		for (EntityManager em: createdEntityManagers) {
			if (em.isOpen()) {
				em.clear();
				em.close();
			}
		}
		createdEntityManagers.clear();
	}

	@Override
	public Cache getCache() {
		throw new UnsupportedOperationException();
	}

	@Override
	public CriteriaBuilder getCriteriaBuilder() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Metamodel getMetamodel() {
		throw new UnsupportedOperationException();
	}

	@Override
	public PersistenceUnitUtil getPersistenceUnitUtil() {
		return new PersistenceUnitUtilImpl();
	}

	@Override
	public Map<String, Object> getProperties() {
		return properties;
	}

	public static class Registry {

		public static final Registry INSTANCE = new Registry();

		public static final Map<EntityManager, EStore> entityManagers = Maps.newHashMap();

		void put(EntityManager em, EStore e) {
			Preconditions.checkNotNull(em);
			//			Preconditions.checkNotNull(e);

			entityManagers.put(em, e);
		}

		public EntityManager getActiveEntityManager() {
			for (EntityManager em: entityManagers.keySet())
			{
				if (em.isOpen())
				{
					return em;
				}
			}
			return null;
		}

	}
}
