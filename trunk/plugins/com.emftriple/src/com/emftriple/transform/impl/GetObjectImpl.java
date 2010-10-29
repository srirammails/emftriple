/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import static com.emftriple.transform.impl.GetUtil.getURI;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.transform.Describe;
import com.emftriple.transform.GetObject;
import com.emftriple.util.Functions;
import com.google.common.collect.Lists;

/**
 *  
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetObjectImpl extends AbstractGetObject implements GetObject {

	protected Map<Class<GetObjectRule>, Map<URI, EObject>> mappings = Collections.synchronizedMap(new HashMap<Class<GetObjectRule>, Map<URI, EObject>>());
	
	protected Map<URI, Map<EReference, List<URI>>> properties = Collections.synchronizedMap(new HashMap<URI, Map<EReference,List<URI>>>());
	
	public GetObjectImpl(Mapping mapping, EntityDataSourceManager dataSourceManager) {
		super(mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, URI key) {
		T object = null;
		try {
			final DescribeQuery aQuery = Functions.transform(key, new Describe());
			final RDFGraph aGraph = dataSourceManager.executeDescribeQuery(aQuery);

			Resource source = aGraph.getResource(key.toString());
			final EClass eClass = getType(source);
			final EFactory eFactory = eClass.getEPackage().getEFactoryInstance();

			object = (T) eFactory.create(eClass);	
			((InternalEObject)object).eSetProxyURI(URI.createURI(source.getURI()));
			
//			object = (T) transform(aGraph.getResource(key.toString()));
//			if (object instanceof ETripleObjectImpl) {
////				((ETripleStoreEObject) object).eSetStore();
//				return object;
//			}
		} finally {
			SparqlBuilder.clear();
		}

//		Set<URI> uris = mappings.get(GetObjectRule.class).keySet();
//		for (URI source: uris) {
//			EObject target = mappings.get(GetObjectRule.class).get(source);
//			Map<EReference, List<URI>> map = properties.get(source);
//			for (EReference reference: map.keySet()) {
//				List<URI> nodes = map.get(reference);
//				List<Object> objects = new BasicEList();
//				for (URI u: nodes) {
//					Object o = dataSourceManager.get(u);
//					if (o != null) {
//						objects.add(o);
//					}
//				}
//				target.eSet(reference, objects);
//			}
//		}
				
		return object;
	}

	@SuppressWarnings("unchecked")
	public <T> T transform(Resource source) {
		Object obj = dataSourceManager.get(getURI(source));

		if (obj == null) 
		{
			obj = doTransform(source);
			if (obj != null) {
				dataSourceManager.add(obj);
			}
		}

		return (T) obj;
	}

	<T> List<T> transform(List<T> sourceObjects) {
		
		return Lists.newArrayList();
	}
	
	private EObject doTransform(Resource source) {	
		final GetObjectRule rule = new GetObjectRule();
		Boolean b = false;
		try {
			b = rule.check(source, mapping);
		} catch (ClassCastException e) {}
		if (b) {
			return applyRule(source);
		}
		return null;
	}

	Map<URI, EObject> getRuleMappings(Class<GetObjectRule> rule) {
		Map<URI, EObject> ruleMappings = mappings.get(rule);
		if (ruleMappings == null) {
			ruleMappings = new HashMap<URI, EObject>();
			mappings.put(rule, ruleMappings);
		}
		return ruleMappings;
	}

	void recordMaping(Class<GetObjectRule> rule, URI source, EObject target) {
		getRuleMappings(rule).put(source, target);
	}

	EObject getExistingTargetFor(Class<GetObjectRule> rule, Resource source) {
		return getRuleMappings(rule).get(source);
	}

	EObject applyRule(Resource source) {
		final GetObjectRule r = new GetObjectRule();
		final Class<GetObjectRule> ruleType = GetObjectRule.class;
		EObject target = getExistingTargetFor(GetObjectRule.class, source);
		
		if (target == null) {
			target = r.build(source, this);
			recordMaping(ruleType, URI.createURI(source.getURI()), target);
			//			r.setProperties(target, source, this);
		}

		return target;
	}

	EClass getType(com.emf4sw.rdf.Resource subject) {
		final EList<String> types = subject.getURIValues(RDF.type);
		if (types.isEmpty()) {
			return null;
		}
		final String typeURI = types.get(0);
		return typeURI == null ? null : mapping.getEClassWithRdfType(typeURI);
	}

	boolean isSubject(Node aNode) {
		return (aNode.getSubjectOf().size() > 0);
	}

}
