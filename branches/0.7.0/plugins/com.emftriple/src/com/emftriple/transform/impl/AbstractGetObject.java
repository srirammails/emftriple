/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.transform.Describe;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.Functions;

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
		final DescribeQuery aQuery;
		final URI graphURI = EntityUtil.getNamedGraph(eClass);
		
		if (graphURI == null) {
			aQuery = Functions.transform(key, new Describe());
		} else {
			aQuery = Functions.transform(key, new Describe(graphURI));
		}
		
		return dataSourceManager.executeDescribeQuery(aQuery);
	}
	
	protected <T> RDFGraph getGraph(Class<T> entityClass, URI key) {
		final DescribeQuery aQuery;
		final URI graphURI = mapping.getNamedGraph(entityClass);
		
		if (graphURI == null) {
			aQuery = Functions.transform(key, new Describe());
		} else {
			aQuery = Functions.transform(key, new Describe(graphURI));
		}
		
		return dataSourceManager.executeDescribeQuery(aQuery);
	}
	
}
