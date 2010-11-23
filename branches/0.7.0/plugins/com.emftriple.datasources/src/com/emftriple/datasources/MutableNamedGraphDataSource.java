/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;

/**
 * The {@link MutableNamedGraphDataSource} interface represents {@link DataSource} being both mutable 
 * and that supports named graphs.
 * 
 * @see MutableDataSource
 * @see NamedGraphDataSource
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface MutableNamedGraphDataSource extends NamedGraphDataSource, MutableDataSource {

	/**
	 * 
	 * @param graph
	 * @throws DataSourceException
	 */
	void add(NamedGraph graph) throws DataSourceException;
	
	/**
	 * 
	 * @param graph
	 * @throws DataSourceException
	 */
	void remove(NamedGraph graph) throws DataSourceException;

	/**
	 * 
	 * @param graphURI
	 */
	void createGraph(URI graphURI);
	
}
