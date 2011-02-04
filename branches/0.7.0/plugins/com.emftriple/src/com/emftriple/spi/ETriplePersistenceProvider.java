/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.spi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.config.persistence.Property;
import com.emftriple.impl.ETripleEntityManagerFactory;
import com.emftriple.impl.MappingModule;
import com.emftriple.util.ModuleUtil;
import com.emftriple.util.ProviderUtilImpl;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.internal.Lists;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETriplePersistenceProvider implements PersistenceProvider {

	private PersistenceMetaData persistence;

	@Inject
	public ETriplePersistenceProvider(PersistenceMetaData persistence) {
		this.persistence = persistence;
	}

	@Override
	public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo info, @SuppressWarnings("rawtypes") Map options) {
		final PersistenceUnit unit = getUnitByName( info.getPersistenceUnitName() );
		if (unit == null) {
			throw new IllegalArgumentException("Found no persistence unit with name " + info.getPersistenceUnitName());
		}

		final Mapping mapping = createMapping(unit);
		final EntityManagerFactory entityManagerFactory = new ETripleEntityManagerFactory(unit, mapping);

		return entityManagerFactory;
	}

	@Override
	public EntityManagerFactory createEntityManagerFactory(String name, @SuppressWarnings("rawtypes") Map options)
	throws IllegalArgumentException {
		final PersistenceUnit unit = getUnitByName( name );
		if (unit == null) {
			throw new IllegalArgumentException("Found no persistence unit with name " + name);
		}

		final Mapping mapping = createMapping(unit);
		final EntityManagerFactory entityManagerFactory = new ETripleEntityManagerFactory(unit, mapping);

		return entityManagerFactory;
	}

	private Mapping createMapping(PersistenceUnit unit) {
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

		Module m;
		Class<? extends Module> cm = ModuleUtil.getModuleClass("com.emftriple.impl.QueryMappingModule");
		if (cm != null) {
			m = load(cm, packages);
		} else {
			m = unit.getProperties() == null ? 
				new MappingModule(packages, new ArrayList<Property>()) : 
					new MappingModule(packages, unit.getProperties().getProperties());
		}
		
		Injector injector = Guice.createInjector( m );
		return injector.getInstance(Mapping.class);
	}
	
	public static Module load(Class<? extends Module> cm, List<EPackage> packages) {
		Module m = null;
		Constructor<? extends Module> c = null;
		try {
			c = cm.getConstructor(List.class, List.class);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		if (c != null) {
			try {
				m = c.newInstance(packages, new ArrayList<Property>());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return m;
	}

	@Override
	public ProviderUtil getProviderUtil() {
		return new ProviderUtilImpl();
	}

	private PersistenceUnit getUnitByName(String name) {
		for (PersistenceUnit unit: persistence.getPersistenceUnit()) {
			if (unit.getName().equals(name)) {
				return unit;
			}
		}
		return null;
	}
}