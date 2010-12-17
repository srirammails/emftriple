/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.util;

import static com.emftriple.util.Functions.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Function;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */

public class EntityUtil {
	
	private static final Map<EClass, List<URI>> cache = new HashMap<EClass, List<URI>>();

	private static final Map<EStructuralFeature, URI> cacheFeature = new HashMap<EStructuralFeature, URI>();
	
	private static final Map<EClass, EAttribute> cacheid = new HashMap<EClass, EAttribute>();
	
	public static EAnnotation getETripleAnnotation(EModelElement element, String name) {
		EAnnotation ann = element.getEAnnotation(name);
		if (ann != null)
		{
			return ann;
		}
		return element.getEAnnotation("etriple." + name);
	}
	
	public static URI getNamedGraph(EClass aClass) {
		EAnnotation graphURI = getETripleAnnotation(aClass, "NamedGraph");
		if (graphURI == null) 
		{
			for (EClass eClass: aClass.getEAllSuperTypes()) 
			{
				graphURI = getETripleAnnotation(eClass, "NamedGraph");
				if (graphURI != null) 
				{
					break;
				}
			}
		}
		
		if (graphURI == null) 
		{
			graphURI = getETripleAnnotation(aClass.getEPackage(), "NamedGraph");
		}
		
		return graphURI == null ? null : URI.createURI(graphURI.getDetails().get("uri"));
	}
	
	public static String getDataSet(EClass eClass) {
		EAnnotation dataSetAnn = getETripleAnnotation(eClass, "DataSet");
		if (dataSetAnn != null) {
			return dataSetAnn.getDetails().get("name");
		}
		return null;
	}

//	public static List<EClass> computeTopEntities(Mapping mapping) {
//		final List<EClass> topEntities = new ArrayList<EClass>();
//		topEntities.addAll(mapping.getEClasses());
//		final List<EClass> removedEntities = new ArrayList<EClass>();
//		Set<EReference> allReferences = new HashSet<EReference>();
//
//		for (EClass eClass: mapping.getEClasses()) 
//		{
//			allReferences.addAll(eClass.getEReferences());
//		}
//
//		for (EReference eReference: allReferences) 
//		{
//			if (eReference.isContainment()) 
//			{
//				if (topEntities.contains(eReference.getEType())) 
//				{
//					removedEntities.add((EClass) eReference.getEType());
//					topEntities.remove(eReference.getEType());
//				}
//			}
//		}
//
//		final List<EClass> finalTopEntities = new ArrayList<EClass>();
//		finalTopEntities.addAll(topEntities);
//
//		for (EClass eClass: topEntities) 
//		{
//			if (eClass.isAbstract()) 
//			{
//				if (finalTopEntities.contains(eClass)) 
//				{
//					finalTopEntities.remove(eClass);
//				}
//			} 
//			else 
//			{
//				for (EClass superClass: eClass.getEAllSuperTypes()) 
//				{
//					if (removedEntities.contains(superClass)) 
//					{
//						if (finalTopEntities.contains(eClass)) 
//						{
//							finalTopEntities.remove(eClass);
//						}
//					}
//				} 
//			}
//		}
//		topEntities.clear();
//		removedEntities.clear();
//
//		return finalTopEntities;
//	}
	
	public static void checkState(Object obj) {
		checkIsSupported(obj);
	}

	public static void checkIsSupported(Object obj) throws IllegalArgumentException {
		if (obj == null) 
		{
			throw new IllegalArgumentException("null objects are not supported.");
		}
		checkIsEntity(obj);
	}

	public static void checkIsEntity(Object obj) throws IllegalArgumentException {
		if (!(obj instanceof EObject)) 
		{
			throw new IllegalArgumentException("only EObject instances are suppported.");
		}
	}

	public static List<URI> getRdfTypes(EClass eClass) {
		if (cache .containsKey(eClass)) {
			return cache.get(eClass);
		}
		
		final List<URI> uris = new ArrayList<URI>();
		
		for (EAnnotation annotation: eClass.getEAnnotations()) {
			if (annotation.getSource().contains("Entity") || annotation.getSource().contains("OWLClass")) {
				try {
					uris.add( URI.createURI( annotation.getDetails().get("uri") ) );
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
		}
		
		if (uris.isEmpty()) 
		{
			try {
				uris.add( URI.createURI(wellFormedURI(getPackageNamespace(eClass.getEPackage())) + eClass.getName()) );
			}  catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		
		cache.put(eClass, uris);
		
		return uris;
	}

	public static URI getRdfType(EStructuralFeature feature) {
		if (cacheFeature.containsKey(feature)) {
			return cacheFeature.get(feature);
		}
		
		EAnnotation ann = getETripleAnnotation(feature, "DataProperty");
		String annotationURI = null;
		if (ann != null)
		{
			annotationURI = ann.getDetails().get("uri");
		}
		if (annotationURI == null)
		{
			ann = getETripleAnnotation(feature, "ObjectProperty");
			if (ann != null)
			{
				annotationURI = ann.getDetails().get("uri");
			}
		}
		if (annotationURI == null)
		{
			ann = getETripleAnnotation(feature, "rdf");
			if (ann != null)
			{
				annotationURI = ann.getDetails().get("uri");
			}
		}
		if (annotationURI == null) 
		{
			annotationURI = wellFormedURI(getPackageNamespace(feature.getEContainingClass().getEPackage())) + feature.getName();
		}
		
		cacheFeature.put(feature, URI.createURI(annotationURI));
		
		return URI.createURI(annotationURI);
	}
	
	public static URI URI(Object key) {
		return (key instanceof URI) ? (URI) key : URI.createURI(key.toString());
	}

	public static EAttribute getId(EClass eClass) {
		if (cacheid.containsKey(eClass)) {
			return cacheid.get(eClass);
		}
		
		EAttribute theId = eClass.getEIDAttribute();
		if (theId != null) {
			cacheid.put(eClass, theId);
			return theId;
		}

		theId = getId(eClass, eClass.getEAttributes());
		if (theId == null) {
			theId = getId(eClass, eClass.getEAllAttributes());
		}
		
		return theId;
	}
	
	private static EAttribute getId(EClass eClass, EList<EAttribute> attributes) {
		for (EAttribute eAttribute: attributes) {
			for (EAnnotation ann: eAttribute.getEAnnotations()) {
				if (ann.getSource().equals("Id") || ann.getSource().equals("GeneratedId") || ann.getSource().equals("CompositeId")) {
					cacheid.put(eClass, eAttribute);
					return eAttribute;
				}
			}
		}
		return null;
	}
	
	private static String getPackageNamespace(EPackage ePackage) {
		EAnnotation ann = getETripleAnnotation(ePackage, "Ontology");
		String namespace = null;
		if (ann != null)
		{
			namespace = ann.getDetails().get("uri");
		}
		if (namespace == null) 
		{
			namespace = ePackage.getNsURI();
		}
		return namespace;
	}

	/**
	 * Return the namespace of an EObject corresponding to its EPackage nsURI value.
	 */
	public static String namespace(EObject object) {
		String nsURI = null;
		if (object instanceof EPackage) {
			nsURI = ((EPackage) object).getNsURI();
		}
		if (object instanceof EClassifier) {
			nsURI = ((EClassifier) object).getEPackage().getNsURI();
		}
		else if (object instanceof EStructuralFeature) {
			nsURI = ((EStructuralFeature) object).getEContainingClass().getEPackage().getNsURI();
		}
		else {
			nsURI = object.eClass().getEPackage().getNsURI();
		}
		return nsURI.endsWith("/") || nsURI.endsWith("#") ? nsURI : nsURI + "/";
	}

	public static String validNamespace(String namespace) {
		return transform(namespace, new URIValidator());
	}

	public static String wellFormedURI(String namespace) {
		return 
			!((namespace.endsWith("#") || namespace.endsWith("/"))) ? 
					namespace + "#" : 
						namespace;
	}

//	private static class MatchId implements Function<List<EAttribute>, EAttribute> {
//		@Override
//		public EAttribute apply(List<EAttribute> from) {
//			EAttribute match = null;
//			for (EAttribute eAttribute: from) { 
//				match =  EntityUtil.getETripleAnnotation(eAttribute, "Id") != null ? eAttribute : null;
//			}
//			return match != null ? match : from.size() > 0 ? from.get(0) : null; 
//		}
//	}
	
	public static class URIValidator implements Function<String, String> {
		private static final String HTTP = "http://";
		
		@Override
		public String apply(String from) {
			return ((from.indexOf(":") > -1) ? 
					(from.charAt(from.indexOf(":") + 1 ) == '/') ? from : 
						from.replaceFirst(":", "://") : HTTP + from).replaceAll("\\s", "_");
		}	
	}
}
