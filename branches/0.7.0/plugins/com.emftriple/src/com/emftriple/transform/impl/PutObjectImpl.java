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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import com.emf4sw.rdf.RDFSeq;
import com.emf4sw.rdf.Resource;
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

	public RDFGraph put(EObject from, RDFGraph graph) {
		objectCache = new HashMap<EObject, Resource>();
		objectIdCache = new HashMap<EObject, Object>();

		new Object2RDF().process( from, graph );

		return graph;
	}

	private class Object2RDF {
		
		private final Set<EObject> containedObjects = Collections.synchronizedSet(new HashSet<EObject>());

		Object2RDF() {
		
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
					if ( !(aFeature.isTransient() || aFeature.isDerived() || aFeature.isVolatile()) ) {
						if (aObject.eIsSet(aFeature)) {
							Object value = aObject.eGet(aFeature, true);

							if (aFeature instanceof EAttribute) {
								if (aFeature.isMany()) {
									//								if (aFeature.isOrdered()) {
									//
									//								} else {
									createManyLiteralTriples(aObject, aFeature, value, graph);
									//								}
								} else {
									createLiteralTriple(aObject, aFeature, value, graph);
								}
							} else {
								if (aFeature.isMany()) {
//									if (aFeature.isOrdered()) {
//										createListTriple(aObject, aFeature, value, graph);
//									} else {
										createManyTriples(aObject, aFeature, value, graph);
//									}
								} else {
									createTriple(aObject, aFeature, value, graph);
								}
							}
						}
					}
				}
			}

			for (EObject obj: containedObjects) {
				new Object2RDF().process(obj, graph);
			}
			
			return graph;
		}

		// TODO
		@SuppressWarnings("unused")
		private void createListTriple(EObject aObject, EStructuralFeature aFeature, Object value, RDFGraph graph) {
			if (Collection.class.isInstance(value)) {
				final Collection<?> all = (Collection<?>) value;
				if (all.isEmpty())
					return;

				final Resource subject = objectCache.get(aObject);
				final Property property = getProperty((EReference)aFeature, graph);

				final RDFSeq aList = RDFFactory.eINSTANCE.createRDFSeq();
				graph.getBlankNodes().add(aList);

				for (final Object obj: all) 
				{
					Resource object = getResource((EObject) obj, graph);
					aList.getElements().add(object);

					if (((EReference)aFeature).isContainment()) {
						containedObjects.add((EObject) obj);
					}
				}

				graph.addTriple(subject, property, aList);
			}
		}

		private void createTriple(EObject aObject, EStructuralFeature aFeature, Object value, RDFGraph graph) {
			final Resource subject = objectCache.get(aObject);
			final Property property = getProperty((EReference)aFeature, graph);
			final Resource object = getResource((EObject) value, graph);

			if (((EReference)aFeature).isContainment()) {
				containedObjects.add((EObject) value);
			}

			if (subject != null && property != null && object != null) {
				graph.addTriple(subject, property, object);
			}
		}

		private void createManyTriples(EObject aObject, EStructuralFeature aFeature, Object value, RDFGraph graph) {
			if (Collection.class.isInstance(value)) {
				Collection<?> all = (Collection<?>) value;
				for (Object obj: all) {
					createTriple(aObject, aFeature, obj, graph);
				}
			}
		}

		private void createManyLiteralTriples(EObject aObject, EStructuralFeature aFeature, Object value, RDFGraph graph) {
			if (Collection.class.isInstance(value)) {
				Collection<?> all = (Collection<?>) value;
				for (Object obj: all) 
					createLiteralTriple(aObject, aFeature, obj, graph);
			} else if (value.getClass().isArray()) {
				Object[] all = (Object[]) value;
				for (Object obj: all) 
					createLiteralTriple(aObject, aFeature, obj, graph);
			}
		}

		private void createLiteralTriple(EObject aObject, EStructuralFeature aFeature, Object obj, RDFGraph graph) {
			final Resource subject = objectCache.get(aObject);
			final String literalValue = DatatypeConverter.toString( aFeature.getEType().getName(), obj );
			final Literal aLiteral = factory.createLiteral();
			aLiteral.setLexicalForm( literalValue );
			aLiteral.setDatatype( graph.getDatatype(DatatypeConverter.get((EDataType) aFeature.getEType())) );

			graph.getLiterals().add(aLiteral);
			graph.addTriple(subject, getProperty((EAttribute) aFeature, graph), aLiteral);
		}

		private void doAddNamespaces(RDFGraph aGraph, EClass eClass) {
			final String namespace = doGetEPackageNamespace(eClass);
			final String prefix = doGetEPackagePrefix(eClass);

			final Namespace aNamespace = factory.createNamespace();
			aNamespace.setPrefix(prefix);
			aNamespace.setURI(namespace);
			aNamespace.setGraph((DocumentGraph) aGraph);
		}

		private void createTypeTriple(EObject aObject, RDFGraph aGraph) {
			checkIsMappedObject(aObject, mapping);

			final Resource subject = getResource(aObject, aGraph);
			final Property property = aGraph.getProperty(RDF.type);
			final Resource object = aGraph.getResource(mapping.getRdfType(aObject.eClass()).toString());

			aGraph.addTriple(subject, property, object);
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
