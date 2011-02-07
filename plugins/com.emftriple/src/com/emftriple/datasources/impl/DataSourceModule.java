package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.DataSources;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.EntityManagerDelegate;
import com.emftriple.query.SparqlRuntimeModule;
import com.emftriple.resource.ETripleStore;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public abstract class DataSourceModule extends AbstractModule {

	protected com.emftriple.config.persistence.DataSources sources;
	
	protected Mapping mapping;
	
	public DataSourceModule(Mapping mapping, DataSources sources) {
		this.mapping = mapping;
		this.sources = sources;
	}
	
	@Override
	protected void configure() {
		install(new SparqlRuntimeModule());
	
		bind(DataSources.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(sources);
		bind(Mapping.class)
			.toInstance(mapping);
	}

	public static class EntityDataSourceModule extends DataSourceModule {

		public EntityDataSourceModule(Mapping mapping, DataSources sources) {
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
		
		public EStoreDataSourceModule(Mapping mapping, DataSources sources, ETripleStore eStore) {
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
