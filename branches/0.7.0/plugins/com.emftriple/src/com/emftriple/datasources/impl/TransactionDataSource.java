/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.TransactionEnableDataSource;

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
		super(dataSource.getName());
		this.dataSource = dataSource;
	}
	
	@Override
	public void begin() {
		if (isRunning) {
			throw new IllegalStateException("DataSource is currently in an active transaction.");
		}
		isRunning = true;
		addedGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		removedGraph = RDFFactory.eINSTANCE.createDocumentGraph();
	}

	@Override
	public void commit() {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		isRunning = false;
		addedGraph = null;
		removedGraph = null;
	}

	@Override
	public void rollback() {
		if (!isRunning) {
			throw new IllegalStateException("DataSource is not in an active transaction.");
		}
		if (addedGraph != null && dataSource instanceof MutableDataSource) {
			((MutableDataSource) dataSource).remove( addedGraph );
		}
		if (removedGraph != null && dataSource instanceof MutableDataSource) {
			((MutableDataSource) dataSource).add( removedGraph );
		}
		commit();
	}

	@Override
	public boolean askQuery(String query) {
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
	public RDFGraph constructQuery(String query) {
		return dataSource.constructQuery(query);
	}

	@Override
	public boolean isConnected() {
		return dataSource.isConnected();
	}

	@Override
	public ResultSet selectQuery(String query) {
		return dataSource.selectQuery(query);
	}

	@Override
	public boolean supportsTransaction() {
		return Boolean.TRUE;
	}

	@Override
	public void add(RDFGraph graph) {
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
	public void remove(RDFGraph graph) {
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
	public RDFGraph describeQuery(String query) {
		return dataSource.describeQuery(query);
	}

	@Override
	public void constructQuery(String aQuery, RDFGraph aGraph) {
		dataSource.constructQuery(aQuery, aGraph);
	}

	@Override
	public void describeQuery(String aQuery, RDFGraph aGraph) {
		dataSource.describeQuery(aQuery, aGraph);
	}

}
