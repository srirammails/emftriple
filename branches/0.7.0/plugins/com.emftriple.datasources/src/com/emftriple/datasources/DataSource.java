/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import com.emf4sw.rdf.RDFGraph;

/**
 * The {@link DataSource} interface provides an abstraction over diverse kinds of RDF data sources. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract interface DataSource {
	
	/**
	 * Returns the name of the DataSource.
	 * 
	 */
	String getName();
	
	/**
	 * Returns a {@link ResultSet} against a Select SPARQL Query. 
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	ResultSet selectQuery(String query);
	
	/**
	 * Returns a {@link RDFGraph} against a Construct SPARQL Query.
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	RDFGraph constructQuery(String query);

	/**
	 * Add result of a construct query in the graph given as parameter.
	 * 
	 * @param aQuery
	 * @param aGraph
	 */
	void constructQuery(String aQuery, RDFGraph aGraph);
	
	/**
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	RDFGraph describeQuery(String query);
	
	/**
	 * Add result of a describe query in the graph given as parameter.
	 * 
	 * @param aQuery
	 * @param aGraph
	 */
	void describeQuery(String aQuery, RDFGraph aGraph);
	
	/**
	 * Returns the value obtained from the execution of an ask query against the 
	 * {@link DataSource}
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	boolean askQuery(String query);

	/**
	 * Test if the current {@link DataSource} supports transactions
	 * 
	 * @return true if transactions are supported
	 */
	boolean supportsTransaction();
		
	/**
	 * Returns true if the {@link DataSource} if connected
	 * 
	 * @return true if connected
	 */
	boolean isConnected();
	
	/**
	 * Connect the {@link DataSource}
	 */
	void connect();
	
	/**
	 * Disconnect the {@link DataSource}
	 */
	void disconnect();

}
