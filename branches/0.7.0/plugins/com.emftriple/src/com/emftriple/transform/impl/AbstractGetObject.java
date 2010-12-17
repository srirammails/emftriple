/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
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
		final String aQuery;
//		final URI graphURI = EntityUtil.getNamedGraph(eClass);
		
//		if (graphURI == null) {
			aQuery = SparqlQueries.constructSubject(key, eClass);
//		} else {
//			aQuery = SparqlQueries.describe(key, graphURI);
//		}
		
		return dataSourceManager.executeDescribeQuery(aQuery);
	}
	
	protected <T> RDFGraph getGraph(Class<T> entityClass, URI key) {
		final String aQuery;
//		final URI graphURI = mapping.getNamedGraph(entityClass);
		final EClass eClass = mapping.getEClass(entityClass);
		
//		if (graphURI == null) {
			aQuery = SparqlQueries.constructSubject(key, eClass);
//		} else {
//			aQuery = SparqlQueries.constructSubject(key, eClass);
//		}
		
		return dataSourceManager.executeConctructQuery(aQuery);
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
