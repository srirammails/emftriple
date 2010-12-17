/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;

/**
 * The {@link NamedGraphDataSource} interface represents a {@link DataSource} that supports named graphs.
 * 
 * @see DataSource
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface NamedGraphDataSource extends DataSource {

	/**
	 * 
	 * @param graphURI
	 * @return the NamedGraph identified by the given URI.
	 */
	NamedGraph getNamedGraph(URI graphURI);
	
	/**
	 * Returns the List of {@link URI} identifying the {@link DataSource} Named Graphs.
	 */
	List<URI> getNamedGraphs();

	/**
	 * 
	 * @param graph
	 * @return
	 */
	boolean containsGraph(URI graph);
	
	/**
	 * 
	 * @param query
	 * @param graph
	 * @return
	 */
	ResultSet selectQuery(String query, URI graph);
	
	/**
	 * 
	 * @param query
	 * @param graph
	 * @return
	 */
	RDFGraph constructQuery(String query, URI graph);
	
	/**
	 * 
	 * @param query
	 * @param graph
	 * @return
	 */
	RDFGraph describeQuery(String query, URI graph);
	
	
	/**
	 * 
	 * @param query
	 * @param graph
	 * @return
	 */
	boolean askQuery(String query, URI graph);
	
}
