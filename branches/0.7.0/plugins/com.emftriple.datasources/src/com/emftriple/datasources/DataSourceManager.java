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

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.UpdateQuery;

/**
 * The {@link DataSourceManager} interface represents the set of methods relative to the management of {@link DataSource}.
 * A {@link DataSourceManager} is supposed to manage a set of {@link DataSource}. The implementation of a {@link DataSourceManager} 
 * must take into account the delivery of SPAQRL queries to the required data sources.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface DataSourceManager {
	
	/**
	 * Adds an {@link RDFGraph} to a {@link DataSource}. 
	 * The implementation must locate the {@link DataSource} according to
	 * the value of the URI attribute of the {@link RDFGraph}.
	 *  
	 * @param graph
	 */
	void add(RDFGraph graph);

	/**
	 * Removes an {@link RDFGraph} to a {@link DataSource}. 
	 * The implementation must locate the {@link DataSource} according to
	 * the value of the URI attribute of the {@link RDFGraph}.
	 * 
	 * @param graph
	 */
	void remove(RDFGraph graph);

	/**
	 * Connect the managed {@link DataSource}.
	 */
	void connect();

	/**
	 * Disconnect the managed {@link DataSource}
	 */
	void disconnect();
	
	/**
	 * Returns the list of managed {@link DataSource}
	 * 
	 * @return list of data sources
	 */
	List<DataSource> getDataSources();
	
	/**
	 * Returns the {@link DataSource} identify by a URI, or containing a corresponding 
	 * named graph.
	 *  
	 * @param graphURI identifying a data source
	 * 
	 * @return data source
	 */
	DataSource getDataSourceByGraph(URI graphURI);
	
	/**
	 * Executes a {@link SelectQuery} against a {@link DataSource}
	 * 
	 * @param aQuery to execute
	 * @return query execution
	 */
	ResultSet executeSelectQuery(SelectQuery aQuery);

	/**
	 * Executes an {@link AskQuery} against a {@link DataSource}
	 * 
	 * @param aQuery to execute
	 * @return query execution
	 */
	boolean executeAskQuery(AskQuery aQuery);

	/**
	 * Executes a {@link ConstructQuery} against a {@link DataSource}
	 * 
	 * @param aQuery to execute
	 * @return query execution
	 */
	RDFGraph executeConctructQuery(ConstructQuery aQuery);

	/**
	 * Executes a {@link DescribeQuery} against a {@link DataSource}
	 * 
	 * @param aQuery to execute
	 * @return query execution
	 */
	RDFGraph executeDescribeQuery(DescribeQuery query);
	
	/**
	 * Executes an {@link UpdateQuery} against a {@link DataSource}
	 * 
	 * @param aQuery to execute
	 * @return query execution
	 */
	int executeUpdateQuery(UpdateQuery aQuery);

	/**
	 * Returns the default data source
	 * 
	 * @return data source
	 */
	DataSource getDefaultDataSource();

}
