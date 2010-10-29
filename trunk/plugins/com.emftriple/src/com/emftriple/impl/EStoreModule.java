package com.emftriple.impl;

import javax.persistence.spi.PersistenceProvider;

import com.emftriple.config.persistence.PersistenceConfig;
import com.emftriple.spi.ETriplePersistenceProvider;
import com.google.inject.AbstractModule;

public class EStoreModule extends AbstractModule {

	private final PersistenceConfig configuration;
	
	public EStoreModule(PersistenceConfig configuration) {
		this.configuration = configuration;
	}
	
	@Override
	protected void configure() {
		bind(PersistenceConfig.class)
		.toInstance(configuration);
		bind(PersistenceProvider.class)
			.to(ETriplePersistenceProvider.class);
	}

}
