package com.emftriple.datasources.impl;

import com.emftriple.config.persistence.DataSources;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.query.SparqlRuntimeModule;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class SparqlDataSourceModule extends AbstractModule {

	private DataSources sources;

	public SparqlDataSourceModule(DataSources sources) {
		this.sources = sources;
	}
	
	@Override
	protected void configure() {
		install(new SparqlRuntimeModule());
	
		bind(DataSourceManager.class)
			.to(SparqlDataSourceManager.class);
		bind(com.emftriple.config.persistence.DataSources.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(sources);
	}
}
