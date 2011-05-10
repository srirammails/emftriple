package com.emftriple;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.config.persistence.Property;
import com.google.inject.Module;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface IMappingModule extends Module {

	void setPackages(List<EPackage> packages);
	
	void setProperties(List<Property> properties);
	
}
