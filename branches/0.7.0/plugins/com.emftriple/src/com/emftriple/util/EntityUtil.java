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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emftriple.Mapping;
import com.emftriple.resource.ETripleObject;
import com.google.common.base.Function;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class EntityUtil {

	public static EAnnotation getETripleAnnotation(EModelElement element, String name) {
		EAnnotation ann = element.getEAnnotation(name);
		if (ann != null)
		{
			return ann;
		}
		return element.getEAnnotation("etriple." + name);
	}
	
	public static String getNamedGraph(EClass aClass) {
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
		
		return graphURI == null ? null : graphURI.getDetails().get("uri");
	}

	public static List<EClass> computeTopEntities(Mapping mapping) {
		final List<EClass> topEntities = new ArrayList<EClass>();
		topEntities.addAll(mapping.getEClasses());
		final List<EClass> removedEntities = new ArrayList<EClass>();
		Set<EReference> allReferences = new HashSet<EReference>();

		for (EClass eClass: mapping.getEClasses()) 
		{
			allReferences.addAll(eClass.getEReferences());
		}

		for (EReference eReference: allReferences) 
		{
			if (eReference.isContainment()) 
			{
				if (topEntities.contains(eReference.getEType())) 
				{
					removedEntities.add((EClass) eReference.getEType());
					topEntities.remove(eReference.getEType());
				}
			}
		}

		final List<EClass> finalTopEntities = new ArrayList<EClass>();
		finalTopEntities.addAll(topEntities);

		for (EClass eClass: topEntities) 
		{
			if (eClass.isAbstract()) 
			{
				if (finalTopEntities.contains(eClass)) 
				{
					finalTopEntities.remove(eClass);
				}
			} 
			else 
			{
				for (EClass superClass: eClass.getEAllSuperTypes()) 
				{
					if (removedEntities.contains(superClass)) 
					{
						if (finalTopEntities.contains(eClass)) 
						{
							finalTopEntities.remove(eClass);
						}
					}
				} 
			}
		}
		topEntities.clear();
		removedEntities.clear();

		return finalTopEntities;
	}
	
	public static void checkState(Object obj) {
		checkIsSupported(obj);
	}

	public static void checkIsSupported(Object obj) {
		if (obj == null) 
		{
			throw new IllegalArgumentException("null objects are not supported.");
		}
		checkIsEntity(obj);
	}

	public static void checkIsEntity(Object obj) {
		if (!(obj instanceof EObject)) 
		{
			throw new IllegalArgumentException("only EObject instances are suppported.");
		}
	}

	public static URI getEntityURI(EClass eClass) {
		URI aURI = null;
		EAnnotation ann = getETripleAnnotation(eClass, "Entity");
		if (ann == null)
		{
			ann = getETripleAnnotation(eClass, "OWLClass");
		}
		String annotationURI = null;
		if (ann != null)
		{
			annotationURI = ann.getDetails().get("uri");
		}
		if (annotationURI == null) 
		{
			annotationURI = wellFormedURI(getPackageNamespace(eClass.getEPackage())) + eClass.getName();
		}
		aURI = URI.createURI(annotationURI);
		
		return aURI;
	}

	public static URI getEntityURI(EStructuralFeature feature) {
		EAnnotation ann = getETripleAnnotation(feature, "DataProperty");
		String annotationURI = null;
		if (ann != null)
		{
			annotationURI = ann.getDetails().get("uri");
		}
		if (annotationURI == null) 
		{
			annotationURI = wellFormedURI(getPackageNamespace(feature.getEContainingClass().getEPackage())) + feature.getName();
		}
		return URI.createURI(annotationURI);
	}
	
	public static String wellFormedURI(String namespace) {
		return 
			!((namespace.endsWith("#") || namespace.endsWith("/"))) ? 
					namespace + "#" : 
						namespace;
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

	public static URI URI(Object key) {
		if (key instanceof URI) 
		{
			return (URI) key;
		} 
		else 
		{
			return URI.createURI(key.toString());
		}
	}
	
	public static final class ID {
		
		private static final String HTTP = "http://";
		
		private static final String TYPE = "type";

		private static final String ID = "Id";

		public static final String BASE = "base";

		private static final String GENERATED_ID = "GeneratedId";

		private static final String COMPOSITE_ID = "CompositeId";
		
		public static URI getId(Object object) {
			checkState(object);
			
			return getId((EObject)object);
		}
		
		/**
		 * Return the value of object id.
		 */
		public static URI getId(EObject object) {
			return object instanceof ETripleObject ? 
					((ETripleObject)object).eGetURI() : 
						isURI( getId(object.eClass()) ) ? URI(valueOf(object, getId(object.eClass()))) : 
							URI(processId(object, getId( object.eClass()))); 
		}

		private static boolean isURI(final EAttribute id) {
			return (id != null && id.getName() != null) ? id.getName().equals("URI") : false;
		}

		/**
		 * Return the value of object id.
		 */
		private static String processId(EObject object, EAttribute id) {
			String value = null;

			if (id == null) 
			{
				if (getETripleAnnotation(object.eClass(), COMPOSITE_ID) != null) 
				{
					return processCompositeId(object);
				} 
				else
				{
					throw new IllegalArgumentException("Object of type " + object.eClass() + " must declare an Id attribute");
				}
			}

			final EAnnotation eAnnotation = getETripleAnnotation(id, ID);
			final Boolean annotatedId = eAnnotation != null;
			final Boolean hasBase = annotatedId ? eAnnotation.getDetails().containsKey(BASE) : false;

			final Boolean hasType = annotatedId ? eAnnotation.getDetails().containsKey(TYPE) : false;
			final Boolean conExpr = hasBase ? containsExpr(eAnnotation) : false;

			if (!annotatedId) {
				value = namespace(object) + valueOf(object, id).toString();
			}

			if (hasBase) 
			{
				final String base;
				if (conExpr) 
				{
					base = transform(eAnnotation.getDetails().get(BASE), new IdParser(object, object.eClass()));
				} 
				else 
				{
					base = eAnnotation.getDetails().get(BASE);
				}
				if (hasType)
				{
					if (eAnnotation.getDetails().get(TYPE).equals(GENERATED_ID)) {
						
					}
				} else {
					Object val = valueOf(object, id);
					value = val == null ? null : 
						transform(base + val.toString(), new URIValidator());
				}
			}

			return value == null ? processGeneratedId(object) : value;
		}

		private static Object valueOf(EObject object, EAttribute attr) { 
			return object.eGet(attr); 
		}

//		private static Object valueOf(EObject object, String attrName) { 
//			return object.eGet(object.eClass().getEStructuralFeature(attrName)); 
//		}
//
//		private static boolean hasFeature(EObject object, String name) { 
//			return object.eClass().getEStructuralFeature(name) != null; 
//		}

		private static Map<EClass, Long> generatedIds;
		
		private static Map<EClass, Long> getGeneratedIds() {
			if (generatedIds == null) {
				generatedIds = new HashMap<EClass, Long>();
			}
			return generatedIds;
		}
		
		public static String processCompositeId(EObject object) {
			final String namespace;
			
			if (getETripleAnnotation(object.eClass(), COMPOSITE_ID).getDetails().containsKey(EntityUtil.ID.BASE)) 
			{
				namespace = getETripleAnnotation(object.eClass(), COMPOSITE_ID).getDetails().get(EntityUtil.ID.BASE);
			} 
			else
			{
				namespace = namespace(object);
			}
			
			return new IdParser(object, object.eClass()).apply(namespace);
		}
		
		public static String processGeneratedId(EObject object) {
			String value = null;
			final String namespace;

			if (getETripleAnnotation(object.eClass(), GENERATED_ID) != null &&
					getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().containsKey(EntityUtil.ID.BASE)) 
			{
					namespace = getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().get(EntityUtil.ID.BASE);
			} 
			else 
			{
				namespace = namespace(object);
			}

			if (getGeneratedIds().containsKey(object.eClass())) 
			{
				final Long number = getGeneratedIds().get(object.eClass()) + 1;
				value = namespace + number.toString();
				getGeneratedIds().put(object.eClass(), number);
			} 
			else 
			{
				final Long number = 1l;
				value = namespace + number.toString();
				getGeneratedIds().put(object.eClass(), number);
			}

			return value;
		}

		private static EAttribute getId(EClass eClass) {
			if (eClass.getEIDAttribute() != null) {
				return eClass.getEIDAttribute();
			}

			EAttribute theId = getId(eClass, eClass.getEAttributes());
			if (theId == null) {
				theId = getId(eClass, eClass.getEAllAttributes());
			}
			return theId;
		}

		private static EAttribute getId(EClass eClass, EList<EAttribute> attributes) {
			final List<EAttribute> ids = new ArrayList<EAttribute>();
			for (EAttribute eAttribute: attributes) {
				if (getETripleAnnotation(eAttribute, ID) != null) {
					ids.add( eAttribute );
				}
			}
			return transform(ids, new MatchId());
		}

		private static boolean containsExpr(EAnnotation eAnnotation) {
			return eAnnotation.getDetails().containsKey(BASE) ? 
					eAnnotation.getDetails().get(BASE).indexOf("[") > -1 : false;
		}

		private static class MatchId implements Function<List<EAttribute>, EAttribute> {
			@Override
			public EAttribute apply(List<EAttribute> from) {
				EAttribute match = null;
				for (EAttribute eAttribute: from) { 
					match =  getETripleAnnotation(eAttribute, ID) != null ? eAttribute : null;
				}
				return match != null ? match : from.size() > 0 ? from.get(0) : null; 
			}
		}

		private static class IdParser implements Function<String, String> {
			final EClass eClass;
			private EObject eObject;
			final String[] properties;
			
			IdParser(EObject eObject, EClass eClass) {
				this.eClass = eClass;
				this.eObject = eObject;
				this.properties = properties(eClass);
			}
			
			String[] properties(EClass eClass) {
				String[] props = new String[20];
				int i = 0;
				for (EStructuralFeature feature: eClass.getEAllStructuralFeatures())
				{
					if (i < props.length) {
						props[i++] = feature.getName();
					}
				}
				return props;
			}
			
			@Override
			public String apply(String from) {
				Pattern pattern = Pattern.compile("\\[");
				
				if (pattern.matcher(from).find()) 
				{
					for (String str: properties)
					{
						if (str != null) 
						{
							pattern = Pattern.compile("\\[" + str + "\\]");
							if (pattern.matcher(from).find())
							{
								from = from.replaceAll("\\[" + str + "\\]", 
										eObject.eGet(eClass.getEStructuralFeature(str)).toString().toLowerCase());		
							}
							else
							{
								pattern = Pattern.compile("\\[" + str.toLowerCase() + "\\]");
								if (pattern.matcher(from).find())
								{
									from = from.replaceAll("\\[" + str.toLowerCase() + "\\]", 
											eObject.eGet(eClass.getEStructuralFeature(str)).toString().toLowerCase());
								}
							}
						}
					}
					from = from.replaceAll("\\[Class\\]", eClass.getName().toLowerCase());
				}
				
				return from;
			}
		}

		private static class URIValidator implements Function<String, String> {
			@Override
			public String apply(String from) {
				return ((from.indexOf(":") > -1) ? 
						(from.charAt(from.indexOf(":") + 1 ) == '/') ? from : 
							from.replaceFirst(":", "://") : HTTP + from).replaceAll("\\s", "_");
			}	
		}
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
		return transform(namespace, new ID.URIValidator());
	}

}
