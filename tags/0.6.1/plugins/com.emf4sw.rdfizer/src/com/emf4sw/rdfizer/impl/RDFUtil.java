package com.emf4sw.rdfizer.impl;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.Triple;

public class RDFUtil {
	
	public static Triple createTriple(final Node subject, final Property property, final Node object) {
		final Triple aTriple = RDFFactory.eINSTANCE.createTriple();
		aTriple.setSubject(subject);
		aTriple.setPredicate(property);
		aTriple.setObject(object);

		return aTriple;
	}

	public static boolean isValid(String nsURI) {
		return nsURI.endsWith("/") || nsURI.endsWith("#");
	}
}
