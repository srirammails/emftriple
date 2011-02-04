package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.config.persistence.Property;

public interface IMappingModule {

	void setPackages(List<EPackage> packages);
	
	void setProperties(List<Property> properties);
	
}
