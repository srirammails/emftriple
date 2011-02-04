package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Property;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class QueryMappingModule extends AbstractModule {

	private final List<EPackage> packages;
	
	private final List<Property> properties;

	public QueryMappingModule(List<EPackage> packages, List<Property> properties) {
		this.packages = packages;
		this.properties = properties;
	}

	@Override
	protected void configure() {
		bind(Mapping.class)
			.to(QueryAnnotationMapping.class);
		bind(List.class)
			.annotatedWith(Names.named("Packages"))
			.toInstance(packages);
		bind(List.class)
			.annotatedWith(Names.named("Properties"))
			.toInstance(properties);
	}

}
