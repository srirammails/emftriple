package com.emftriple.impl;

import javax.persistence.spi.PersistenceProvider;

import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.spi.ETriplePersistenceProvider;
import com.google.inject.AbstractModule;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class EStoreModule extends AbstractModule {

	private final PersistenceMetaData configuration;
	
	public EStoreModule(PersistenceMetaData configuration) {
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
