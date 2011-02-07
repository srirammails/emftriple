/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdfizer;

import static com.atl.common.models.Models.register;
import static com.atl.common.trans.Transformations.transform;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.atl.EPackage2Ontology;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdfizer.atl.Model2RDF;
import com.emf4sw.rdfizer.atl.RDF2Model;
import com.emf4sw.rdfizer.impl.RDFIzerExec;

/**
 *  
 * <p>
 * {@link RDFIzer} can be used to save/load any EMF Models to/from RDF documents. 
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFIzer {

//	private final Model2RDF model2rdf;
	
	private final RDF2Model rdf2model;

	private final EPackage ePackage;
	
	public RDFIzer(EPackage metamodel) {
		register(metamodel);
		this.ePackage = metamodel;
//		this.model2rdf = new Model2RDF();
		this.rdf2model = new RDF2Model(ePackage);
	}

	public RDFIzer(Resource metamodel) {
		checkIsEPackageAsRoot(metamodel);
		register(metamodel);
		this.ePackage = (EPackage) metamodel.getContents().get(0);
//		this.model2rdf = new Model2RDF();
		this.rdf2model = new RDF2Model(ePackage);
	}
		
	/**
	 * @return Ontology generated from current EPackage
	 */
	public Ontology getOntology() {
		return transform(getEPackage(), new EPackage2Ontology());
	}

	/**
	 * @return current EPackage
	 */
	public EPackage getEPackage() {
		return ePackage;
	}

	/**
	 * Returns a {@link Resource} containing a {@link RDFGraph} made of rdf triples generated from the 
	 * input model.
	 * @param Resource containing a model conforms to the metamodel set in {@link RDFIzer} constructor.
	 * @return Resource containing a {@link RDFGraph}.
	 */
	public Resource toRdf(Resource aResource) {
		return toRdf(aResource, RDFFormats.RDF_XML_ABBREV_FORMAT);
	}
	
	public Resource toRdf(Resource aResource, RDFFormats format) {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(Model2RDF.OPTION_RDF_FORMAT, format);
		
		return toRdf(aResource, options);
	}
	
	public Resource toRdf(Resource aResource, Map<String, Object> options) {
//		return model2rdf.transform(aResource, options);
		return RDFIzerExec.Call.transform(aResource, options);
	}
	
	/**
	 * Returns a {@link Resource} containing a model generated from a set of rdf triples. 
	 * @param Resource corresponding to a rdf document.
	 * @return a Resource containg a model conforms to the metamodel set in {@link RDFIzer} constructor.
	 */
	public Resource toModel(Resource aResource) {
		return rdf2model.transform(aResource);
	}
	
	private static void checkIsEPackageAsRoot(Resource metamodel) {
		if (metamodel != null && !metamodel.getContents().isEmpty()) {
			if (metamodel.getContents().get(0) instanceof EPackage) {
				return;
			}
		}
		throw new IllegalArgumentException("Resource does not contain EPackage.");
	}
	
	public static enum Annotations {
		OWLClass,
		GeneretedId,
		Id,
		ObjectProperty,
		DataProperty
	}
	
	public static void annotate(EPackage ePackage, String annotationName, Map<String, String> details) {
		final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setSource(annotationName);
		eAnnotation.getDetails().putAll(details);
		
		ePackage.getEAnnotations().add(eAnnotation);
	}
	
	public static void annotate(EClass eClass, String annotationName, Map<String, String> details) {
		final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setSource(annotationName);
		eAnnotation.getDetails().putAll(details);
		
		eClass.getEAnnotations().add(eAnnotation);
	}
	
	public static void annotate(EAttribute eAttribute, String annotationName, Map<String, String> details) {
		final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setSource(annotationName);
		eAnnotation.getDetails().putAll(details);
		
		eAttribute.getEAnnotations().add(eAnnotation);
	}
	
}
