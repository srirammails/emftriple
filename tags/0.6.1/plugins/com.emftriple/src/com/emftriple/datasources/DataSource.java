/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;

/**
 * The {@link DataSource} interface provides an abstraction over diverse kinds of RDF data sources. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract interface DataSource {
	
	/**
	 * Returns the ID of the {@link DataSource}
	 * 
	 * @return URI identifying the {@link DataSource}
	 */
	URI getDefaultGraph();
	
	/**
	 * Returns a {@link ResultSet} against a Select SPARQL Query. 
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	ResultSet selectQuery(SelectQuery query);
	
	/**
	 * Returns a {@link RDFGraph} against a Construct SPARQL Query.
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	RDFGraph constructQuery(ConstructQuery query);
	
	/**
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	RDFGraph describeQuery(DescribeQuery query);
	
	/**
	 * Returns the value obtained from the execution of an ask query against the 
	 * {@link DataSource}
	 * 
	 * @param query to execute
	 * @return query execution value
	 */
	boolean askQuery(AskQuery query);

	/**
	 * Test if the current {@link DataSource} supports transactions
	 * 
	 * @return true if transactions are supported
	 */
	boolean supportsTransaction();
	
	/**
	 * Sets a {@link QueryFactory} to the {@link DataSource}
	 * 
	 * @param queryFactory
	 */
	void setQueryFactory(QueryFactory queryFactory);
	
	/**
	 * Returns the {@link QueryFactory} attached to the {@link DataSource}
	 * 
	 * @return query factory
	 */
	QueryFactory getQueryFactory();
	
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
