package com.emftriple.datasources.impl;

import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.DataSourceManager;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class SparqlDataSourceModule extends AbstractModule {

	private Federation sources;

	public SparqlDataSourceModule(Federation sources) {
		this.sources = sources;
	}
	
	@Override
	protected void configure() {
//		install(new SparqlRuntimeModule());
	
		bind(DataSourceManager.class)
			.to(SparqlDataSourceManager.class);
		bind(com.emftriple.config.persistence.Federation.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(sources);
	}
}