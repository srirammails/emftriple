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

import com.emftriple.ETriple;
import com.emftriple.impl.FileDescriptorModule;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class PersistenceProviderImpl implements javax.persistence.spi.PersistenceProvider {
	
	private javax.persistence.spi.PersistenceProvider persistenceProvider;

	@Override
	public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo arg0, @SuppressWarnings("rawtypes") Map arg1) {
		return getPersistenceProvider().createContainerEntityManagerFactory(arg0, arg1);
	}

	@Override
	public EntityManagerFactory createEntityManagerFactory(String arg0, @SuppressWarnings("rawtypes") Map arg1) {
		return getPersistenceProvider().createEntityManagerFactory(arg0, arg1);
	}

	@Override
	public ProviderUtil getProviderUtil() {
		return getPersistenceProvider().getProviderUtil();
	}
	
	private javax.persistence.spi.PersistenceProvider getPersistenceProvider() {
		if (persistenceProvider == null) {
			persistenceProvider = ETriple.inject(new FileDescriptorModule()).getInstance(PersistenceProvider.class);
		}
		return persistenceProvider;
	}

}
