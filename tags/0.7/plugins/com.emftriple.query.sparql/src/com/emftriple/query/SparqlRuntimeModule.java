/*
 * generated by Xtext
 */
package com.emftriple.query;

import org.eclipse.xtext.conversion.IValueConverterService;

import com.emftriple.query.formatting.SparqlValueConverterService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SparqlRuntimeModule extends com.emftriple.query.AbstractSparqlRuntimeModule {

	public SparqlRuntimeModule() {
		super();
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return SparqlValueConverterService.class;
	}
}