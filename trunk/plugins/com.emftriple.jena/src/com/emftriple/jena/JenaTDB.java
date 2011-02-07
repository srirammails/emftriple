/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
import com.emf4sw.rdf.resource.RDFResourceImpl;
import com.emftriple.datasources.ISparqlUpdateDataSource;
import com.emftriple.datasources.ITransactionEnableDataSource;
import com.google.inject.internal.Lists;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.update.GraphStore;
import com.hp.hpl.jena.update.GraphStoreFactory;
import com.hp.hpl.jena.update.UpdateAction;

/**
 * TDB DataSource 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JenaTDB extends ModelNamedGraphDataSource implements ITransactionEnableDataSource, ISparqlUpdateDataSource {

	private final Dataset dataSet;
	
	protected JenaTDB(String name, String fileLocation) {
		super( name );
		dataSet = TDBFactory.createDataset(fileLocation);
	}

	@Override
	public Model getModel() {
		return dataSet.getDefaultModel();
	}

	@Override
	public Model getModel(URI graph) {
		if (dataSet.containsNamedModel(graph.toString()))
			return dataSet.getNamedModel(graph.toString());
		return null;
	}

	@Override
	public QueryExecution getQueryExecution(String query, Model model) {
		return QueryExecutionFactory.create(query, model);
	}
	
	@Override
	public void begin() {
		dataSet.getDefaultModel().begin();
	}

	@Override
	public void commit() {
		dataSet.getDefaultModel().commit();
	}

	@Override
	public void rollback() {
		dataSet.getDefaultModel().abort();
	}

	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		NamedGraph aGraph = new RDFResourceImpl.DummyRDFResource().createNamedGraph(graphURI);
		
		constructQuery(
				"construct { ?s ?p ?o } " +
				"where { " +
				"	graph <" + graphURI.toString() + "> { ?s ?p ?o } " +
				"}", 
				aGraph);
		
		return aGraph;
	}

	@Override
	public Iterable<String> getNamedGraphs() {
		return Lists.newArrayList(dataSet.listNames());
	}

	@Override
	public boolean containsGraph(URI graph) {
		return dataSet.containsNamedModel(graph.toString());
	}

	@Override
	public void add(RDFGraph graph) {
		final Model model = getModel();
		
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.add( new RDFGraphExtractor().extract(graph) );	
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}	
	}

	@Override
	public void remove(RDFGraph graph) {
		final Model model = getModel();
		
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.remove( new RDFGraphExtractor().extract(graph) );
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}
	}

	@Override
	public void deleteGraph(URI graph) {
		if (containsGraph(graph))
			dataSet.getNamedModel(graph.toString()).removeAll();
		
	}

	@Override
	public void add(NamedGraph graph) {
		final Model model = getModel(URI.createURI(graph.getURI()));
		
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.add( new RDFGraphExtractor().extract(graph) );
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}
	}

	@Override
	public void remove(NamedGraph graph) {
		final Model model = getModel(URI.createURI(graph.getURI()));
		
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.remove( new RDFGraphExtractor().extract(graph) );
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}
	}
	
	@Override
	public void update(String query) {
		final Model model = getModel();
		
		model.enterCriticalSection(Lock.WRITE);
		try {
			GraphStore graphStore = GraphStoreFactory.create(model);
			UpdateAction.parseExecute( query, graphStore);
		} finally {
			model.leaveCriticalSection();
		}
	}

	@Override
	public boolean supportsTransaction() {
		return true;
	}

	@Override
	public void connect() {
		setConnected(true);
	}

	@Override
	public void disconnect() {
		setConnected(false);
	}

}
