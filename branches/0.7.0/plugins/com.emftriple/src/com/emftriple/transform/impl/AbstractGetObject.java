/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl.DummyRDFResource;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.SparqlQueries;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public abstract class AbstractGetObject implements GetObject {

	protected Mapping mapping;

	protected EntityDataSourceManager dataSourceManager; 

	protected ResourceManager manager;

	protected AbstractGetObject(ResourceManager manager, Mapping mapping, EntityDataSourceManager dataSourceManager) {
		this.manager = manager;
		this.mapping = mapping;
		this.dataSourceManager = dataSourceManager;
	}

	protected RDFGraph getGraph(EClass eClass, URI key) {
		final List<String> queries = SparqlQueries.constructSubjectService(key, eClass);
		final List<RDFGraph> graphs = new ArrayList<RDFGraph>();
		
		for (final String str: queries) {
			System.out.println("call " + str);
			RDFGraph aGraph = null;
			try {
				aGraph = 
					dataSourceManager.executeConctructQuery(str);
			} catch (Exception e) {
				System.out.println("recall " + str);
				aGraph = 
					dataSourceManager.executeConctructQuery(str);
			}
			if (aGraph != null)
				graphs.add(aGraph);
		}
		
		return graphs.isEmpty() ? null : (graphs.size() == 1 ? graphs.get(0) : merge(graphs));
	}
	
//	protected RDFGraph getGraph(EClass eClass, URI key) {
//		final List<String> queries = SparqlQueries.constructSubjectService(key, eClass);
//		final List<RDFGraph> graphs = new ArrayList<RDFGraph>();
//		final ExecutorService executor = Executors.newFixedThreadPool(4);
//		final List<Future<RDFGraph>> futures = new ArrayList<Future<RDFGraph>>();
//
//		for (final String str: queries) {
//			Callable<RDFGraph> call = new Callable<RDFGraph>() {
//				@Override
//				public RDFGraph call() throws Exception {
//					System.out.println("call " + str);
//					return dataSourceManager.executeConctructQuery(str);
//				}};
//				futures.add( executor.submit(call) );
//		}
//
//		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
//
//		System.out.println(key + " > " + executor.isTerminated());
//		
//		for (Future<RDFGraph> f: futures) {
//			RDFGraph g;
//			try {
//				g = f.get();
//				if (g != null)
//					graphs.add(g);
//			} catch (ExecutionException e) {
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return graphs.isEmpty() ? null : (graphs.size() == 1 ? graphs.get(0) : merge(graphs));
//	}

	protected <T> RDFGraph getGraph(Class<T> entityClass, URI key) {
		try {
			final EClass eClass = mapping.getEClass(entityClass);
			
			return getGraph(eClass, key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private static RDFGraph merge(List<RDFGraph> graphs) {
		RDFGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		RDFResource res = new DummyRDFResource();
		res.getContents().add(aGraph);
		for (RDFGraph g: graphs)
			aGraph.add(g);

		return aGraph;
	}

	protected void setIdValue(EObject returnedObject, Resource from, EAttribute id) {
		if (id == null)
			return;

		EAnnotation ann = EntityUtil.getETripleAnnotation(id, "Id");

		if (ann == null) {
			ann = EntityUtil.getETripleAnnotation(id, "GeneratedId");
			if (ann == null) {
				returnedObject.eSet(id, from.getURI());
				return;
			}
		}

		if (ann.getDetails().containsKey("base")) {
			String base = ann.getDetails().get("base");
			if (from.getURI().startsWith(base)) {
				String localName = from.getURI().substring(base.length(), from.getURI().length());
				if (localName != null && localName.length() > 0)
					returnedObject.eSet(id, localName);
			}
		}
	}

}
