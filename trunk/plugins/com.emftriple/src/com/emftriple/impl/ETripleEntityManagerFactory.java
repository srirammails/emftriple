/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import static com.emftriple.util.ETripleEcoreUtil.filter;

import java.util.ArrayList;
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

import com.emftriple.ETriple;
import com.emftriple.IDataSourceModule;
import com.emftriple.IMapping;
import com.emftriple.IMappingModule;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.config.persistence.Property;
import com.emftriple.datasources.IDataSourceManager;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.impl.DataSourceModule.EntityDataSourceModule;
import com.emftriple.resource.IETripleObject;
import com.emftriple.util.PersistenceUnitUtilImpl;
import com.google.common.base.Preconditions;
import com.google.inject.internal.Lists;
import com.google.inject.internal.Maps;

/**
 * Implementation of {@link EntityManagerFactory}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ETripleEntityManagerFactory implements EntityManagerFactory {

	private final Collection<EntityManager> createdEntityManagers;

	private final PersistenceUnit unit;

	private boolean isOpen = true;

	private Map<String, Object> properties;

	public ETripleEntityManagerFactory(PersistenceUnit unit) {
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
		IMappingModule mappingModule = (IMappingModule) ETriple.get(IMappingModule.class);
		if (mappingModule == null) {
			mappingModule = new MappingModule();
		}
		mappingModule.setPackages(getEPackages(unit));
		mappingModule.setProperties(unit.getProperties() == null ? 
				new ArrayList<Property>() : unit.getProperties().getProperties());
		
		final IMapping mapping = ETriple.inject(mappingModule).getInstance(IMapping.class);
		if (mapping == null) {
			throw new IllegalStateException("Cannot create mapping");
		}
		
		IDataSourceModule module = (IDataSourceModule) ETriple.get(IDataSourceModule.class);
		if (module == null) {
			module = new EntityDataSourceModule();
		}
		
		module.setFederation(unit.getDataSources());
		module.setMapping(mapping);
		
		final IEntityDataSourceManager dataSourceManager = ETriple.inject(module).getInstance( IEntityDataSourceManager.class );
		
		final EntityManager entityManager = 
			isEStoreEnable(mapping.getEPackages()) ? createEStore(dataSourceManager) : create(dataSourceManager, mapping);
			
		dataSourceManager.connect();
		
		return entityManager;
	}

	private EntityManager createEStore(IDataSourceManager dataSourceManager) {
//		final EntityManager entityManager = new EStoreEntityManager(this, dataSourceManager, mapping, null);
//		eStore.setEntityManager(entityManager);
			
//		createdEntityManagers.add(entityManager);
//		Registry.INSTANCE.put(entityManager, null);
		
		return null;
	}
	
	private EntityManager create(IDataSourceManager dataSourceManager, IMapping mapping) {
		final EntityManager entityManager = new EObjectEntityManager(this, (IEntityDataSourceManager) dataSourceManager, mapping);
		createdEntityManagers.add(entityManager);
		Registry.INSTANCE.put(entityManager, null);
		
		return entityManager;
	}

	private List<EPackage> getEPackages(PersistenceUnit unit) {
		final List<EPackage> packages = Lists.newArrayList();

		for (String nsURI: unit.getPackage()) {
			EPackage findPackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
			if (findPackage != null) {
				packages.add(findPackage);
			}
		}

		if (packages.isEmpty()) {
			throw new IllegalArgumentException("No EPackage(s) found in persistence unit");
		}
		
		return packages;
	}
		
	private boolean isEStoreEnable(List<EPackage> ePackages) {
		Boolean res = false;
		for (EPackage ePackage: ePackages) {
			for (EClass eClass: filter(ePackage.getEClassifiers(), EClass.class)) {
				if (IETripleObject.class.isAssignableFrom(eClass.getInstanceClass())) {
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
