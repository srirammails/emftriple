package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.EntityManagerDelegate;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.query.NativeQueryFactoryImpl;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.resource.ETripleResource.ResourceManagerImpl;
import com.emftriple.resource.ETripleStore;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public abstract class DataSourceModule extends AbstractModule implements IDataSourceModule {

	protected com.emftriple.config.persistence.Federation federation;
	
	protected Mapping mapping;
	
	public DataSourceModule() {}
	
	@Override
	public void setFederation(Federation federation) {
		this.federation = federation;
	}
	
	@Override
	public void setMapping(Mapping mapping) {
		this.mapping = mapping;
	}
	
	@Override
	protected void configure() {
		bind(Federation.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(federation);
		bind(Mapping.class)
			.toInstance(mapping);
	}

	public static class EntityDataSourceModule extends DataSourceModule {

		public EntityDataSourceModule() {}
	
		@Override
		protected void configure() {
			super.configure();
			
			bind(QueryFactory.class)
				.to(NativeQueryFactoryImpl.class);
			bind(ResourceManager.class)
				.to(ResourceManagerImpl.class);
			bind(EntityManagerDelegate.class)
				.to(EntityDataSourceManagerImpl.class);
			bind(EntityDataSourceManager.class)
				.to(EntityDataSourceManagerImpl.class);
		}
	}
	
	public static class EStoreDataSourceModule extends DataSourceModule {

		private EStore eStore;
		
		public EStoreDataSourceModule(ETripleStore eStore) {
			this.eStore = eStore;
		}
		
		protected void configure() {
			super.configure();
			
			bind(QueryFactory.class)
				.to(NativeQueryFactoryImpl.class);
			bind(ResourceManager.class)
				.to(ResourceManagerImpl.class);
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
