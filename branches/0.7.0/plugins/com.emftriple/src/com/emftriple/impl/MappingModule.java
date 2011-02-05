package com.emftriple.impl;

import java.util.List;

import com.emftriple.IMapping;
import com.google.inject.name.Names;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class MappingModule extends AbstractMappingModule {

	public MappingModule() {}

	@Override
	protected void configure() {
		bind(IMapping.class)
			.to(EAnnotationMapping.class);
		bind(List.class)
			.annotatedWith(Names.named("Packages"))
			.toInstance(packages);
		bind(List.class)
			.annotatedWith(Names.named("Properties"))
			.toInstance(properties);
	}

}
