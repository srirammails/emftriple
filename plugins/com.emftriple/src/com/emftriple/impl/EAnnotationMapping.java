/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Property;
import com.emftriple.query.MQueryBuilder;
import com.emftriple.query.mql.SelectStatement;
import com.emftriple.util.EntityUtil;
import com.google.common.collect.BiMap;
import com.google.common.collect.Maps;

/**
 * {@link EAnnotationMapping} stores correspondances between model and ontology classes 
 * according to model annotations.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class EAnnotationMapping extends AbstractMapping implements Mapping {

	protected BiMap<URI, EClass> classMap;

	protected Map<EStructuralFeature, URI> featureMap;
	
	protected BiMap<Class<?>, EClass> mappedClasses;

	public EAnnotationMapping(List<EPackage> packages) {
		this(packages, new ArrayList<Property>());
	}
	
	public EAnnotationMapping(List<EPackage> packages, List<Property> properties) {
		super(packages, properties);
		this.classMap = Maps.newHashBiMap();
		this.featureMap = Maps.newHashMap();
		this.mappedClasses = Maps.newHashBiMap();
		
		for (EClass eClass: getEClasses()) 
		{
			URI aURI = EntityUtil.getEntityURI(eClass);
			if (aURI != null) 
			{
				classMap.put(aURI, eClass);
			}
			Class<?> c = eClass.getInstanceClass();
			if (c != null) 
			{
				mappedClasses.put(c, eClass);
			}
			
			EAnnotation namedQueryAnn = EntityUtil.getETripleAnnotation(eClass, "NamedQuery");
			if (namedQueryAnn != null)
			{
				String name = namedQueryAnn.getDetails().get("name");
				String queryString = namedQueryAnn.getDetails().get("queryString");
				if (name != null && queryString != null)
				{
					SelectStatement q = MQueryBuilder.getSelect(queryString);
					if (q != null)
					{
						namedQueries.put(name, q);
					}	
				}
			}
			
			for (EStructuralFeature eFeature: eClass.getEStructuralFeatures()) 
			{
				URI featureURI = EntityUtil.getEntityURI(eFeature);
				if (featureURI != null) 
				{
					featureMap.put(eFeature, featureURI);
				}
			}
		}
	}

	@Override
	public EClass getEClassWithRdfType(String uri) {
		return classMap.get( URI.createURI(uri) );
	}

	@Override
	public EClass getEClass(Class<?> c) {
		return mappedClasses.get(c);
	}
	
	@Override
	public boolean isMappedClass(Class<?> aClass) {
		return mappedClasses.containsKey(aClass);
	}

	@Override
	public URI getRdfType(EClass eClass) {
		return classMap.inverse().get(eClass);
	}

	@Override
	public URI getRdfType(EStructuralFeature eFeature) {
		return featureMap.get(eFeature);
	}

	@Override
	public <T> URI getNamedGraph(Class<T> aClass) {
		String uri = EntityUtil.getNamedGraph(getEClass(aClass));
		
		return uri == null ? null : URI.createURI(uri);
	}
	
}