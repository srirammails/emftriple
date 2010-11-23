/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.Mapping;
import com.emftriple.transform.PutObject;
import com.emftriple.util.EntityUtil.ID;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class PutObjectImpl implements PutObject {

	private static final RDFFactory factory = RDFFactory.eINSTANCE;

	private final Mapping mapping;

	private Map<EObject, Resource> objectCache;

	private Map<EObject, Object> objectIdCache;

	public PutObjectImpl(Mapping mapping) {
		this.mapping = mapping;
	}

	public RDFGraph put(EObject from, URI uri) {
		objectCache = new HashMap<EObject, Resource>();
		objectIdCache = new HashMap<EObject, Object>();

		final RDFGraph graph = RDFFactory.eINSTANCE.createDocumentGraph();
		graph.setURI( uri.toString() );

		return process( from, graph );
	}

	private RDFGraph process(EObject aObject, RDFGraph graph) {
		if (!objectCache.containsKey(aObject)) 
		{
			if (graph instanceof DocumentGraph) 
			{
				doAddNamespaces(graph, aObject.eClass());
			}

			createTypeTriple(aObject, graph);
			objectCache.put(aObject, getResource(aObject, graph));

			for (EStructuralFeature aFeature: aObject.eClass().getEAllStructuralFeatures()) 
			{
				createTriples( aObject, aFeature, graph );
			}
		}

		return graph;
	}

	private void doAddNamespaces(RDFGraph aGraph, EClass eClass) {
		final String namespace = doGetEPackageNamespace(eClass);
		final String prefix = doGetEPackagePrefix(eClass);

		final Namespace aNamespace = factory.createNamespace();
		aNamespace.setPrefix(prefix);
		aNamespace.setURI(namespace);
		aNamespace.setGraph((DocumentGraph) aGraph);
	}

	private void createTriples(EObject aObject, EStructuralFeature aFeature, RDFGraph aGraph) {
		if (aFeature.isMany()) 
		{
			createManyTriples( aObject, aFeature, aGraph );
		} 
		else 
		{
			createOneTriple( aObject, aFeature, aGraph );
		}
	}

	private void createTypeTriple(EObject aObject, RDFGraph aGraph) {
		checkIsMappedObject(aObject, mapping);

		final Resource subject = getResource(aObject, aGraph);
		final Property property = aGraph.getProperty(RDF.type);
		final Resource object = aGraph.getResource(mapping.getRdfType(aObject.eClass()).toString());

		aGraph.addTriple(subject, property, object);
	}

	private void createOneTriple(final EObject aObject, final EStructuralFeature aFeature, final RDFGraph aGraph) {
		if (aObject.eGet(aFeature) != null) 
		{
			final Resource subject = getResource(aObject, aGraph);
			final Property property = aFeature instanceof EAttribute ?  getProperty((EAttribute)aFeature, aGraph) : getProperty((EReference)aFeature, aGraph);
			
			if (subject != null && property != null) 
			{
				doTriple( subject, property, aFeature.getEType(), aObject.eGet(aFeature), aGraph );
			}

			if (aFeature instanceof EReference) 
			{
				process((EObject) aObject.eGet(aFeature), aGraph);
			}
		}
	}

	private void createManyTriples(EObject aObject, EStructuralFeature aFeature, final RDFGraph aGraph) {
		if (aObject.eGet(aFeature) != null) 
		{
			final Object aValue = aObject.eGet(aFeature);
			final Resource subject = getResource(aObject, aGraph);
			final Property property = aFeature instanceof EAttribute ? getProperty((EAttribute)aFeature, aGraph) : getProperty((EReference)aFeature, aGraph);

			if (subject != null && property != null) 
			{
				if (Collection.class.isInstance(aValue))
				{
					for (final Object oneValue: (Collection<?>) aValue) 
					{
						doTriple(subject, property, aFeature.getEType(), oneValue, aGraph);
						if (aFeature instanceof EReference) 
						{
							process((EObject) oneValue, aGraph);
						}
					}
				} else if (aValue.getClass().isArray())
				{
					for (final Object oneValue: (Object[]) aValue) 
					{
						doTriple(subject, property, aFeature.getEType(), oneValue, aGraph);
						if (aFeature instanceof EReference) 
						{
							process((EObject) oneValue, aGraph);
						}
					}
				}
			}
		}
	}

	private void doTriple(Resource resource, Property property, EClassifier aType, Object aValue, RDFGraph aGraph) {
		if (aType instanceof EClass) 
		{
			doTripleAsIriValue(resource, property, aValue, aGraph);
		} 
		else if (aType instanceof EDataType) 
		{
			doTripleAsLiteralValue(resource, property, aValue, (EDataType)aType, aGraph);
		} 
	}

	private void doTripleAsLiteralValue(Resource subject, Property property, Object aValue, EDataType aType, RDFGraph aGraph) {
		final String literalValue = DatatypeConverter.toString( aType.getName(), aValue );
		final Literal aLiteral = factory.createLiteral();
		aLiteral.setLexicalForm( literalValue );
		aLiteral.setDatatype( aGraph.getDatatype(DatatypeConverter.get(aType)) );

		aGraph.addTriple(subject, property, aLiteral);
	}

	private Triple doTripleAsIriValue(Resource subject, Property property, Object aValue, RDFGraph aGraph) {
		if (!(aValue instanceof EObject)) {
			throw new IllegalArgumentException();
		}

		return aGraph.addTriple(subject, property, getResource((EObject) aValue, aGraph));
	}

	private Resource getResource(EObject aObject, RDFGraph aGraph) {
		final Object id;

		synchronized (this) {
			if (objectIdCache.containsKey(aObject)) {
				id = objectIdCache.get(aObject);
			} else {
				id = ID.getId((EObject) aObject);
				objectIdCache.put(aObject, id);
			}

			if (id == null) {
				throw new IllegalArgumentException();
			}	
		}

		return aGraph.getResource(id.toString());
	}

	private Property getProperty(EAttribute aFeature, RDFGraph aGraph) {
		return aGraph.getProperty(mapping.getRdfType(aFeature).toString());
	}

	private Property getProperty(EReference aFeature, RDFGraph aGraph) {
		return aGraph.getProperty(mapping.getRdfType(aFeature).toString());
	}

	private String doGetEPackageNamespace(EClass aClass) {
		String namespace = EcoreUtil.getAnnotation(aClass.getEPackage(), "Ontology", "uri");
		if (namespace == null) {
			namespace = aClass.getEPackage().getNsURI();
		}
		return namespace;
	}

	private String doGetEPackagePrefix(EClass aClass) {
		String prefix = EcoreUtil.getAnnotation(aClass.getEPackage(), "Ontology", "prefix");
		if (prefix == null) {
			prefix = aClass.getEPackage().getNsPrefix();
		}
		return prefix;
	}

	private static void checkIsMappedObject(EObject aObject, Mapping mapping) {
		checkNotNull(mapping);

		if (mapping == null) {
			throw new IllegalStateException("Cannot execute runtime transformation with no mapping set.");
		}

		if (!mapping.getEPackages().contains( aObject.eClass().getEPackage()) ) {
			throw new IllegalArgumentException("EObject is not mapped by current mapping.");
		}
	}
}
