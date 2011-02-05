package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.ETriple;
import com.emftriple.IDataSourceModule;
import com.emftriple.IMapping;
import com.emftriple.IMappingModule;
import com.emftriple.config.persistence.Federation;
import com.emftriple.config.persistence.Property;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IEntityManagerDelegate;
import com.emftriple.datasources.IQueryFactory;
import com.emftriple.datasources.impl.EntityDataSourceManagerImpl;
import com.emftriple.query.QueryFactoryImpl;
import com.emftriple.query.QueryMapping;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.resource.ETripleResource.ResourceManagerImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class JPQLModule extends AbstractModule implements IDataSourceModule, IMappingModule {

	protected Federation federation;
	protected IMapping mapping;
	protected List<EPackage> packages;
	protected List<Property> properties;
	
	public JPQLModule() {
		ETriple.init(new JPQLMappingModule());
	}
	
	@Override
	protected void configure() {
		bind(Federation.class)
			.annotatedWith(Names.named("DataSources"))
			.toInstance(federation);
		bind(IMapping.class)
			.toInstance(mapping);
		bind(QueryMapping.class)
			.toInstance((QueryMapping) mapping);
		bind(IQueryFactory.class)
			.to(QueryFactoryImpl.class);
		bind(ResourceManager.class)
			.to(ResourceManagerImpl.class);
		bind(IEntityManagerDelegate.class)
			.to(EntityDataSourceManagerImpl.class);
		bind(IEntityDataSourceManager.class)
			.to(EntityDataSourceManagerImpl.class);
	}

	@Override
	public void setMapping(IMapping mapping) {
		this.mapping = mapping;
	}

	@Override
	public void setFederation(Federation federation) {
		this.federation = federation;
	}
	
	@Override
	public void setPackages(List<EPackage> packages) {
		this.packages = packages;
	}

	@Override
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	private class JPQLMappingModule extends AbstractMappingModule {

		@Override
		protected void configure() {
			bind(IMapping.class)
				.to(QueryAnnotationMapping.class);
			bind(List.class)
				.annotatedWith(Names.named("Packages"))
				.toInstance(packages);
			bind(List.class)
				.annotatedWith(Names.named("Properties"))
				.toInstance(properties);
		}
		
	}
}
