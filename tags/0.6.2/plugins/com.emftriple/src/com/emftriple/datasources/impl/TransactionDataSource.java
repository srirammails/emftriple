/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceException;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class TransactionDataSource extends AbstractDataSource implements MutableDataSource, TransactionEnableDataSource {

	private DataSource dataSource;

	private boolean isRunning = false;

	private RDFGraph removedGraph;

	private RDFGraph addedGraph;

	public TransactionDataSource(DataSource dataSource) {
		super(null);
		this.dataSource = dataSource;
	}

	@Override
	public void begin() throws DataSourceException {
		if (isRunning) {
			throw new IllegalStateException("DataSource is currently in an active transaction.");
		}
		isRunning = true;
		addedGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		removedGraph = RDFFactory.eINSTANCE.createDocumentGraph();
	}

	@Override
	public void commit() throws DataSourceException {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		isRunning = false;
		addedGraph = null;
		removedGraph = null;
	}

	@Override
	public void rollback() throws DataSourceException {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		if (addedGraph != null && dataSource instanceof MutableDataSource) {
			((MutableDataSource) dataSource).remove( addedGraph );
		}
		if (removedGraph != null && dataSource instanceof MutableDataSource) {
			((RDFGraph) dataSource).add( removedGraph );
		}
		commit();
	}

	@Override
	public boolean askQuery(AskQuery query) {
		return dataSource.askQuery(query);
	}

	@Override
	public void connect() {
		dataSource.connect();
	}

	@Override
	public void disconnect() {
		dataSource.disconnect();
	}
	
	@Override
	public RDFGraph constructQuery(ConstructQuery query) {
		return dataSource.constructQuery(query);
	}

	@Override
	public boolean isConnected() {
		return dataSource.isConnected();
	}

	@Override
	public ResultSet selectQuery(SelectQuery query) {
		return dataSource.selectQuery(query);
	}

	@Override
	public boolean supportsTransaction() {
		return Boolean.TRUE;
	}

	@Override
	public URI getDefaultGraph() {
		return dataSource.getDefaultGraph();
	}

	@Override
	public void add(RDFGraph graph) throws DataSourceException {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		if (dataSource instanceof MutableDataSource) {
			if (addedGraph == RDFFactory.eINSTANCE.createDocumentGraph()) {
				addedGraph = graph;
			}
			addedGraph.add(graph);
			((MutableDataSource) dataSource).add(graph);
		}
	}

	@Override
	public void remove(RDFGraph graph) throws DataSourceException {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		if (dataSource instanceof MutableDataSource) {
			if (removedGraph == RDFFactory.eINSTANCE.createDocumentGraph()) {
				removedGraph = graph;
			}
			removedGraph.add(graph);
			((MutableDataSource) dataSource).remove(graph);
		}
	}

	@Override
	public RDFGraph describeQuery(DescribeQuery query) {
		return dataSource.describeQuery(query);
	}

}
