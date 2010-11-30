/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emf4sw.rdf.NamedGraph;
import com.emftriple.config.persistence.Property;
import com.emftriple.query.mql.MQuery;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface Mapping {

	/**
	 * @return the EPackage currently mapped.
	 */
	List<EPackage> getEPackages();
		
    /**
     * @return the List of EClass being part of the mapping.
     */
    List<EClass> getEClasses();
    
	/**
	 * 
	 * @param aClass
	 * @return
	 */
	boolean isMappedClass(Class<?> aClass);
	
	/**
	 * 
	 * @param aClass
	 * @return
	 */
	EClass getEClass(Class<?> aClass) throws IllegalArgumentException;

	/**
	 * 
	 * @param string
	 * @return
	 */
	EClass getEClassWithRdfType(String URI);
	
	/**
	 * 
	 * @param eClass
	 * @return
	 */
	URI getRdfType(EClass eClass);
	
	/**
	 * 
	 * @param eFeature
	 * @return
	 */
	URI getRdfType(EStructuralFeature eFeature);
	
	/**
	 * 
	 * @return
	 */
	List<Property> getProperties();

	/**
	 * 
	 * @param queryString
	 * @return
	 */
	MQuery getNamedQuery(String queryString);
	
//	/**
//	 * 
//	 * @param <T>
//	 * @return
//	 */
//	<T> TypedQuery<T>getNamedTypedQuery(String queryString, Class<T> arg1);
	
	/**
	 * 
	 * @param aClass
	 * @return URI of the {@link NamedGraph} or null
	 */
	<T> URI getNamedGraph(Class<T> aClass) throws IllegalArgumentException;
	
}
