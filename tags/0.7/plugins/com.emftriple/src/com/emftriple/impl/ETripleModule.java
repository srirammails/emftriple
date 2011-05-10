/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import javax.persistence.spi.PersistenceProvider;

import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.spi.ETriplePersistenceProvider;
import com.google.inject.AbstractModule;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETripleModule extends AbstractModule {

	private final PersistenceMetaData configuration;

	public ETripleModule(PersistenceMetaData configuration) {
		super();
		this.configuration = configuration;
	}

	@Override
	protected void configure() {
		bind(PersistenceMetaData.class)
			.toInstance(configuration);
		bind(PersistenceProvider.class)
			.to(ETriplePersistenceProvider.class);
	}

}
