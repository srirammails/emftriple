package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.config.persistence.Property;
import com.google.inject.AbstractModule;

public class AbstractMappingModule extends AbstractModule implements IMappingModule {

	protected List<EPackage> packages;
	
	protected List<Property> properties;
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPackages(List<EPackage> packages) {
		this.packages = packages;
	}

	@Override
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

}
