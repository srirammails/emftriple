package com.emftriple.impl;

import java.util.List;

import com.emftriple.Mapping;
import com.google.inject.name.Names;

public class MappingModule extends AbstractMappingModule {

	public MappingModule() {}

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
