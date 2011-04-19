/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emftriple.IMapping;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;
import com.emftriple.util.EntityUtil;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public abstract class AbstractGetObject implements IGetObject {

	protected IMapping mapping;

	protected IEntityDataSourceManager dataSourceManager; 

	protected ResourceManager manager;

	protected AbstractGetObject(ResourceManager manager, IMapping mapping, IEntityDataSourceManager dataSourceManager) {
		this.manager = manager;
		this.mapping = mapping;
		this.dataSourceManager = dataSourceManager;
	}

//	protected RDFGraph getGraph(EClass eClass, URI key) {
//		final List<String> queries = SparqlQueries.constructSubjectService(key, eClass);
//		final List<RDFGraph> graphs = new ArrayList<RDFGraph>();
//		final ExecutorService executor = Executors.newFixedThreadPool(4);
//		final CompletionService<RDFGraph> cs = new ExecutorCompletionService<RDFGraph>(executor);
//		
//		for (final String str: queries) {
//			cs.submit(new Callable<RDFGraph>() {
//				@Override
//				public RDFGraph call() throws Exception {
//					return dataSourceManager.executeConctructQuery(str);
//				}});
//		}
//
//		RDFGraph merge = null;
//		
//		for (int i=0; i< queries.size(); i++) {
//			RDFGraph g;
//			try {
//				g = cs.take().get();
//				if (g != null) {
//					if (merge == null)
//						merge = g;
//					else merge.add(g);
//				}
//				graphs.add(g);
//			} catch (ExecutionException e) {
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return merge;
//	}

//	protected <T> RDFGraph getGraph(Class<T> entityClass, URI key) {
//		try {
//			final EClass eClass = mapping.getEClass(entityClass);
//
//			return getGraph(eClass, key);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}

	protected void setIdValue(EObject returnedObject, String key, EAttribute id) {
		if (id == null)
			return;

		EAnnotation ann = EntityUtil.getETripleAnnotation(id, "Id");

		if (ann == null) {
			ann = EntityUtil.getETripleAnnotation(id, "GeneratedValue");
			if (ann == null) {
				returnedObject.eSet(id, key);
				return;
			}
		}

		if (ann.getDetails().containsKey("base")) {
			String base = ann.getDetails().get("base");
			if (key.startsWith(base)) {
				String localName = key.substring(base.length(), key.length());
				if (localName != null && localName.length() > 0)
					returnedObject.eSet(id, EcoreUtil.createFromString((EDataType) id.getEType(), localName));
			}
		}
	}

}
