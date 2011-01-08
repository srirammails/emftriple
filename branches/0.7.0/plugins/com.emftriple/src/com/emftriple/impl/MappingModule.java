package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Property;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MappingModule extends AbstractModule {

	private final List<EPackage> packages;
	
	private final List<Property> properties;

	public MappingModule(List<EPackage> packages, List<Property> properties) {
		this.packages = packages;
		this.properties = properties;
	}

	@Override
	protected void configure() {
		bind(Mapping.class)
			.to(EAnnotationMapping.class);
		bind(List.class)
			.annotatedWith(Names.named("Packages"))
			.toInstance(packages);
		bind(List.class)
			.annotatedWith(Names.named("Properties"))
			.toInstance(properties);
	}

}
