/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.spi;

import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;

import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.impl.ETripleEntityManagerFactory;
import com.emftriple.util.ProviderUtilImpl;
import com.google.inject.Inject;

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

		return new ETripleEntityManagerFactory(unit);
	}

	@Override
	public EntityManagerFactory createEntityManagerFactory(String name, @SuppressWarnings("rawtypes") Map options)
	throws IllegalArgumentException {
		final PersistenceUnit unit = getUnitByName( name );
		if (unit == null) {
			throw new IllegalArgumentException("Found no persistence unit with name " + name);
		}

		return new ETripleEntityManagerFactory(unit);
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