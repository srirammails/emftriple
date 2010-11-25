package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.EntityManagerDelegate;
import com.emftriple.query.SparqlRuntimeModule;
import com.emftriple.resource.ETripleStore;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public abstract class DataSourceModule extends AbstractModule {

	protected com.emftriple.config.persistence.Federation sources;
	
	protected Mapping mapping;
	
	public DataSourceModule(Mapping mapping, Federation sources) {
		this.mapping = mapping;
		this.sources = sources;
	}
	
	@Override
	protected void configure() {
		install(new SparqlRuntimeModule());
	
		bind(Federation.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(sources);
		bind(Mapping.class)
			.toInstance(mapping);
	}

	public static class EntityDataSourceModule extends DataSourceModule {

		public EntityDataSourceModule(Mapping mapping, Federation sources) {
			super(mapping, sources);
		}
	
		@Override
		protected void configure() {
			super.configure();
			
			bind(EntityManagerDelegate.class)
				.to(EntityDataSourceManagerImpl.class);
			bind(EntityDataSourceManager.class)
				.to(EntityDataSourceManagerImpl.class);
		}
	}
	
	public static class EStoreDataSourceModule extends DataSourceModule {

		private EStore eStore;
		
		public EStoreDataSourceModule(Mapping mapping, Federation sources, ETripleStore eStore) {
			super(mapping, sources);
			this.eStore = eStore;
		}
		
		protected void configure() {
			super.configure();
			
			bind(EStore.class)
				.annotatedWith(Names.named("EStore"))
				.toInstance(eStore);
			bind(EntityManagerDelegate.class)
				.to(EStoreDataSourceManagerImpl.class);
			bind(EntityDataSourceManager.class)
				.to(EStoreDataSourceManagerImpl.class);			
		}
	}
}