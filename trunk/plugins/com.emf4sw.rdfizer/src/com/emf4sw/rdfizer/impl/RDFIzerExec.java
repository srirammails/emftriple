/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdfizer.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class RDFIzerExec {

	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.6.1
	 */
	public static final class Call {

		public static final String OPTION_INCLUDE_ONTOLOGY = "OPTION_INCLUDE_ONTOLOGY"; 

		public static final String OPTION_INCLUDE_ECORE_TYPES = "OPTION_INCLUDE_ECORE_TYPES";

		public static final String OPTION_BASE_NAMESPACE = "OPTION_BASE_NAMESPACE";

		public static final String OPTION_RDF_FORMAT = "OPTION_RDF_FORMAT"; 

		public static Resource transform(Resource resource, Map<String, Object> options) {
			if (options == null) {
				options = new HashMap<String, Object>();
			}
			options.put(OPTION_INCLUDE_ECORE_TYPES, Boolean.TRUE);
			
			final RDFIzerExec exec = new RDFIzerExec(options);
			final RDFFormats format = 
				options.containsKey(OPTION_RDF_FORMAT) ? (RDFFormats) options.get(OPTION_RDF_FORMAT) : RDFFormats.RDF_XML_FORMAT;

			Resource rdf = format.factory().createResource(null);
			exec.transform(resource, rdf);
			
			return rdf;
		}
	}

	private final Map<EObject, Node> cache;

	private Map<String, Object> options;

	private static final RDFFactory factory = RDFFactory.eINSTANCE;

	public RDFIzerExec(Map<String, Object> options) {
		this.cache = Collections.synchronizedMap(new HashMap<EObject, Node>());
		this.options = options;
		NodeResolver.clear();
	}

	public void transform(Resource resource, Resource rdf) {
		final RDFGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		rdf.getContents().add( aGraph );

		final Namespace rdf1 = factory.createNamespace();
		rdf1.setPrefix("rdf");
		rdf1.setURI(RDF.NS);
		((DocumentGraph) aGraph).getNamespaces().add(rdf1);

		final Namespace rdfs = factory.createNamespace();
		rdfs.setPrefix("rdfs");
		rdfs.setURI(RDFS.NS);
		((DocumentGraph) aGraph).getNamespaces().add(rdfs);

		final Namespace owl = factory.createNamespace();
		owl.setPrefix("owl");
		owl.setURI(OWL.NS);
		((DocumentGraph) aGraph).getNamespaces().add(owl);

		for (EObject obj: resource.getContents()) {
			convert(obj, aGraph);
		}
	}

	private com.emf4sw.rdf.Resource convert(EObject obj, RDFGraph aGraph) {
		final EObjectConverter oc = new EObjectConverter(obj, options);
		final com.emf4sw.rdf.Resource subject = oc.convert(aGraph);
		cache.put(obj, subject);

		for (EStructuralFeature feature: obj.eClass().getEAllStructuralFeatures())
		{
			Object val = obj.eGet(feature);
			if (val != null) {
				if (feature instanceof EAttribute)
				{
					create(subject, (EAttribute)feature, val, aGraph);
				} 
				else 
				{
					create(subject, (EReference)feature, val, aGraph);
				}
			}
			oc.addActionAxioms(subject, feature, aGraph);
			oc.addOwlAxioms(subject, feature, aGraph);
		}

		return subject;
	}

	private void create(com.emf4sw.rdf.Resource subject, EAttribute feature, Object val, RDFGraph aGraph) {
		if (Collection.class.isAssignableFrom(val.getClass()))
		{
			@SuppressWarnings("unchecked")
			Collection<Object> col = (Collection<Object>) val;
			for (Object obj: col)
			{
				aGraph.addTriple(subject,
						EFeatureConverter.getRdfType(feature, aGraph), 
						createLiteral(obj, (EDataType) feature.getEType(), aGraph));
			}
		} 
		else if (val.getClass().isArray()) {
			Object[] array = (Object[]) val;
			for (Object obj: array)
			{
				aGraph.addTriple(subject,
						EFeatureConverter.getRdfType(feature, aGraph), 
						createLiteral(obj, (EDataType) feature.getEType(), aGraph));
			}
		} 
		else {
			aGraph.addTriple(subject, 
					EFeatureConverter.getRdfType(feature, aGraph), 
					createLiteral(val, (EDataType) feature.getEType(), aGraph));
		}
	}

	private Node createLiteral(Object val, EDataType datatype, RDFGraph aGraph) {
		final Datatype elem = aGraph.getDatatype(DatatypeConverter.get(datatype));

		final Literal literal = factory.createLiteral();
		literal.setLexicalForm(DatatypeConverter.toString(datatype.getName(), val));
		literal.setDatatype( elem );
		aGraph.getLiterals().add(literal);

		return literal;
	}

	private void create(com.emf4sw.rdf.Resource subject, EReference feature, Object val, RDFGraph aGraph) {
		if (Collection.class.isAssignableFrom(val.getClass()))
		{
			@SuppressWarnings("unchecked")
			Collection<Object> col = (Collection<Object>) val;
			for (Object obj: col)
			{
				com.emf4sw.rdf.Resource res = cache.containsKey(obj) ? 
					(com.emf4sw.rdf.Resource) cache.get(obj) : 
					convert((EObject) obj, aGraph);

				aGraph.addTriple(subject, EFeatureConverter.getRdfType(feature, aGraph), res);
			}
		} else {
			com.emf4sw.rdf.Resource res = cache.containsKey(val) ? 
					(com.emf4sw.rdf.Resource) cache.get(val) : 
						convert((EObject) val, aGraph);

			aGraph.addTriple(subject, EFeatureConverter.getRdfType(feature, aGraph), res);
		}
	}
	
	static class NodeResolver {
		
		private static final Map<String, Node> cache2 = new HashMap<String, Node>();
		
		static void clear() {
			cache2.clear();
		}
		
		static Boolean contains(String uri) {
			return cache2.containsKey(uri);
		}
		
		static Node get(String uri) {
			if (cache2.containsKey(uri)) {
				return cache2.get(uri);
			}
			return null;
		}
		
		static void put(String uri, Node node) {
			cache2.put(uri, node);
		}
	}

	static class EFeatureConverter {

		static Property getRdfType(EStructuralFeature feature, RDFGraph aGraph) {
			if (feature.getEAnnotations().size() < 1)
				return getEcoreType(feature, aGraph);
			if (feature.getEAnnotations().size() == 1)
				if (feature.getEAnnotations().get(0).getSource().equals("http:///org/eclipse/emf/ecore/util/ExtendedMetaData")) {
					return getEcoreType(feature, aGraph);
				}
			
			EList<EAnnotation> annotations = feature.getEAnnotations();
			for (EAnnotation ann: annotations)
			{
				final String[] names = ann.getSource().split("\\.");
				final String name = names.length == 0 ? ann.getSource() : names[names.length-1];
				if (name.equals("ObjectProperty"))
				{
					if (ann.getDetails().get("uri") != null) {
						final String uri = ann.getDetails().get("uri");
						final Node n = NodeResolver.get(uri); 
						if (n != null && n instanceof Property) {
							return (Property) n;
						} else {
							Property prop = aGraph.getProperty(uri);
							NodeResolver.put(uri, prop);
							return prop;
						}

					}
				}
				if (name.equals("DatatypeProperty"))
				{
					if (ann.getDetails().get("uri") != null) {
						final String uri = ann.getDetails().get("uri");
						final Node n = NodeResolver.get(uri); 
						if (n != null && n instanceof Property) {
							return (Property) n;
						} else {
							Property prop = aGraph.getProperty(uri);
							NodeResolver.put(uri, prop);
							return prop;
						}
					}
				}
			}

			return getEcoreType(feature, aGraph);
		}


		static Property getEcoreType(EStructuralFeature feature, RDFGraph aGraph) {
			final String uri = RDFUtil.isValid(feature.getEContainingClass().getEPackage().getNsURI()) ? 
					feature.getEContainingClass().getEPackage().getNsURI() + feature.getName() :
					feature.getEContainingClass().getEPackage().getNsURI() + "#" + feature.getName();

			final Node n = NodeResolver.get(uri); 
			if (n != null && n instanceof Property) {
				return (Property) n;
			} else {
				final Property property = RDFFactory.eINSTANCE.createProperty();
				property.setURI(uri);
				aGraph.getProperties().add(property);
				NodeResolver.put(uri, property);
				return property;
			}
			
		}

	}
	
	static void checkHasAnnotations(EModelElement element) {
		if (element.getEAnnotations().size() < 1)
			return;
		if (element.getEAnnotations().size() == 1)
			if (element.getEAnnotations().get(0).getSource().equals("http:///org/eclipse/emf/ecore/util/ExtendedMetaData")) {
				return;
			}
	}
}
