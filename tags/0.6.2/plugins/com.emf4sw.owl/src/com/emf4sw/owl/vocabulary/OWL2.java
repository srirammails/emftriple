/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.vocabulary;

import com.emf4sw.rdf.vocabulary.XSD;

/**
 * OWL2 vocabulary.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWL2 extends OWL {

	final public static String AllDisjointClasses = NS + "AllDisjointClasses";
	
	final public static String AllDisjointProperties = NS + "AllDisjointProperties";
	
	final public static String ReflexiveProperty = NS + "ReflexiveProperty";
	
	final public static String IrreflexiveProperty = NS + "IrreflexiveProperty";
	
	final public static String AsymmetricProperty = NS + "AsymmetricProperty";
	
	final public static String NegativePropertyAssertion = NS + "NegativePropertyAssertion";
		
	final public static String NamedIndividual = NS + "NamedIndividual";
	
	
	final public static String versionIRI = NS + "versionIRI";
	
	final public static String datatypeComplementOf = NS + "datatypeComplementOf";
	
	final public static String onClass  = NS + "onClass";
	
	final public static String onDataRange = NS + "onDatarange";
	
	final public static String onDatatype = NS + "onDatatype";
	
	final public static String withRestrictions = NS + "withRestrictions";
	
	final public static String disjointDataProperties = NS + "disjointDataProperties";
	
	final public static String minQualifiedCardinality = NS + "minQualifiedCardinality";
	
	final public static String maxQualifiedCardinality = NS + "maxQualifiedCardinality";
	
	final public static String qualifiedCardinality = NS + "qualifiedCardinality";
	
	final public static String disjointUnionOf = NS + "disjointUnionOf";
	
	final public static String propertyDisjointWith = NS + "propertyDisjointWith";
	
	final public static String propertyChainAxiom = NS + "propertyChainAxiom";
	
	final public static String members = NS + "members";
	
	final public static String hasKey = NS + "hasKey";
	
	final public static String hasSelf = NS + "hasSelf";
	
	final public static String sourceIndividual = NS + "sourceIndividual";
	
	final public static String assertionProperty = NS + "assertionProperty";
	
	final public static String targetIndividual = NS + "targetIndividual";
	
	final public static String targetValue = NS + "targetValue";
	
	
	final public static String length = XSD.NS + "length";
	
	final public static String maxLength = XSD.NS + "maxLength";
	
	final public static String minLength = XSD.NS + "minLength";
	
	final public static String totalDigits = XSD.NS + "totalDigits";
	
	final public static String fractionDigits = XSD.NS + "fractionDigits";
	
	final public static String minInclusive = XSD.NS + "minInclusive";
	
	final public static String minExclusive = XSD.NS + "minExclusive";
	
	final public static String maxInclusive = XSD.NS + "maxInclusive";
	
	final public static String maxExclusive = XSD.NS + "maxExclusive";
	
	final public static String pattern = XSD.NS + "pattern";
	
}
