/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.impl.ETripleEntityTransaction;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.transform.Describe;
import com.emftriple.transform.GetObject;
import com.emftriple.util.Functions;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public abstract class AbstractGetObject implements GetObject {
	
	protected Mapping mapping;

	protected final org.eclipse.emf.ecore.resource.Resource resource;

	protected EntityDataSourceManager dataSourceManager; 
	
	protected AbstractGetObject(Mapping mapping, EntityDataSourceManager dataSourceManager) {
		this.mapping = mapping;
		this.dataSourceManager = dataSourceManager;
		this.resource = ((ETripleEntityTransaction)dataSourceManager.getTransaction()).getTransactionResource();
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
