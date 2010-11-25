/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdfizer.impl;

import static com.atl.common.trans.Transformations.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.atl.common.trans.Transformation;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class IDGenerator {

	private static final String TYPE = "type";

	private static final String ID = "Id";

	private static final String BASE = "base";

	private static final String GENERATED_ID = "GeneratedId";

	private String BASE_NAMESPACE = null;

	private static final String HTTP = "http://";

	private Long id = 0l;


	public IDGenerator() {}

	public IDGenerator(String namespace) {
		BASE_NAMESPACE = namespace;
	}

//	private Map<EClass, Long> getGeneratedIds() {
//		if (generatedIds == null) {
//			generatedIds = new HashMap<EClass, Long>();
//		}
//		return generatedIds;
//	}

	/**
	 * Return the value of object id.
	 */
	public Object getId(EObject object) {
		return isURI( getId(object.eClass()) ) ? valueOf(object, getId(object.eClass())) : processId(object, getId( object.eClass())); 
	}

	private static boolean isURI(final EAttribute id) {
		return (id != null && id.getName() != null) ? id.getName().equals("URI") : false;
	}

	/**
	 * Return the value of object id.
	 */
	private String processId(EObject object, EAttribute id) {
		String value = null;

		if (id == null) {
			if (object.eClass().getEAnnotation(GENERATED_ID) != null) {
				return processGeneratedId(object);
			} else {
				throw new IllegalArgumentException("Object of type " + object.eClass() + " must declare an Id attribute");
			}
		}

		final EAnnotation eAnnotation = id.getEAnnotation(ID);
		final Boolean annotatedId = eAnnotation != null;
		final Boolean hasBase = annotatedId ? eAnnotation.getDetails().containsKey(BASE) : false;

		final Boolean hasType = annotatedId ? eAnnotation.getDetails().containsKey(TYPE) : false;
		final Boolean conExpr = hasBase ? containsExpr(eAnnotation) : false;

		if (!annotatedId) {
			value = BASE_NAMESPACE == null ? namespace(object) : BASE_NAMESPACE + valueOf(object, id).toString();
		}

		if (hasBase) {
			final String base;
			if (conExpr) {
				base = transform(eAnnotation.getDetails().get(BASE), new IdParser(object.eClass()));
			} else {
				base = eAnnotation.getDetails().get(BASE);
			}
			if (hasType) {
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

//	private static Object valueOf(EObject object, String attrName) { 
//		return object.eGet(object.eClass().getEStructuralFeature(attrName)); 
//	}
//
//	private static boolean hasFeature(EObject object, String name) { 
//		return object.eClass().getEStructuralFeature(name) != null; 
//	}

	private String processGeneratedId(EObject object) {
		String value = null;
		final String namespace;

		if (object.eClass().getEAnnotation(GENERATED_ID) != null &&
				object.eClass().getEAnnotation(GENERATED_ID).getDetails().containsKey(IDGenerator.BASE)) 
		{
				namespace = object.eClass().getEAnnotation(GENERATED_ID).getDetails().get(IDGenerator.BASE);
		} 
		else 
		{
			namespace = BASE_NAMESPACE == null ? namespace(object) : BASE_NAMESPACE;
		}

		final Long number = id + 1;
		value = namespace + number.toString();
		id = number;

		return value;
	}

//	private String processGeneratedId(EObject object, EAttribute id) {
//		
//		return null;
//	}

	/**
	 * Return the namespace of an EObject corresponding to its EPackage nsURI value.
	 */
	private String namespace(EObject object) {
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

	private EAttribute getId(EClass eClass) {
		if (eClass.getEIDAttribute() != null) {
			return eClass.getEIDAttribute();
		}

		EAttribute theId = getId(eClass, eClass.getEAttributes());
		if (theId == null) {
			theId = getId(eClass, eClass.getEAllAttributes());
		}
		return theId;
	}

	private EAttribute getId(EClass eClass, EList<EAttribute> attributes) {
		final List<EAttribute> ids = new ArrayList<EAttribute>();
		for (EAttribute eAttribute: attributes) {
			if (eAttribute.getEAnnotation(ID) != null) {
				ids.add( eAttribute );
			}
		}
		return transform(ids, new MatchId());
	}

	private static boolean containsExpr(EAnnotation eAnnotation) {
		return eAnnotation.getDetails().containsKey(BASE) ? 
				eAnnotation.getDetails().get(BASE).indexOf("[") > -1 : false;
	}

	private class MatchId implements Transformation<List<EAttribute>, EAttribute> {
		@Override
		public EAttribute apply(List<EAttribute> from) {
			EAttribute match = null;
			for (EAttribute eAttribute: from) { 
				match =  eAttribute.getEAnnotation(ID) != null ? eAttribute : null;
			}
			return match != null ? match : from.size() > 0 ? from.get(0) : null; 
		}
	}

	private class IdParser implements Transformation<String, String> {
		final EClass eClass;
		
		IdParser(EClass eClass){
			this.eClass = eClass;
		}
		@Override
		public String apply(String from) {
			return from.replaceAll("\\[Class\\]", eClass.getName().toLowerCase());
		}
	}

	private class URIValidator implements Transformation<String, String> {
		@Override
		public String apply(String from) {
			return ((from.indexOf(":") > -1) ? 
					(from.charAt(from.indexOf(":") + 1 ) == '/') ? from : 
						from.replaceFirst(":", "://") : HTTP + from).replaceAll("\\%", "");
		}	
	}
}
