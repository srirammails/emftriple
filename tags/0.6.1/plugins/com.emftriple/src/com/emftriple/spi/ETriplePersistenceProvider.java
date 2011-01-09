/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.spi;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.PersistenceConfig;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.impl.EAnnotationMapping;
import com.emftriple.impl.ETripleEntityManagerFactory;
import com.emftriple.util.ProviderUtilImpl;
import com.google.inject.Inject;
import com.google.inject.internal.Lists;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETriplePersistenceProvider implements PersistenceProvider {

	private PersistenceConfig persistence;
	
	@Inject
	public ETriplePersistenceProvider(PersistenceConfig persistence) {
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
	public EntityManagerFactory createEntityManagerFactory(String name, @SuppressWarnings("rawtypes") Map options) {
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
		
		return unit.getProperties() == null ? new EAnnotationMapping(packages) : 
			new EAnnotationMapping(packages, unit.getProperties().getProperties());
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