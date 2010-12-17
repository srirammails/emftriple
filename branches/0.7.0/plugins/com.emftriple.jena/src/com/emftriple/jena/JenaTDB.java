/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.jena.JenaDataSourceExecution.doDescribeQuery;

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.NamedGraphInjector;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
import com.emftriple.datasources.MutableNamedGraphDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.SparqlUpdateDataSource;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.jena.util.JenaResultSet;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
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
public class JenaTDB extends AbstractNamedGraphDataSource 
implements SparqlUpdateDataSource, MutableNamedGraphDataSource, TransactionEnableDataSource {

	private final Dataset dataSet;
	
	protected JenaTDB(String name, String fileLocation, List<URI> graphs) {
		super( name, graphs );
		this.dataSet = TDBFactory.createDataset(fileLocation);
	}

	@Override
	public RDFGraph constructQuery(String query) {
		return JenaDataSourceExecution.doContstructQuery(query, dataSet, null); 
	}

	@Override
	public RDFGraph constructQuery(String query, URI graph) {
		if (!dataSet.containsNamedModel(graph.toString())) {
			throw new IllegalArgumentException("DataSet does not contains named graph: " + graph);
		}
		return JenaDataSourceExecution.doContstructQuery(query, dataSet.getNamedModel(graph.toString()), null);
	}

	@Override
	public void constructQuery(String query, RDFGraph aGraph) {
		JenaDataSourceExecution.doContstructQuery(query, dataSet, null, aGraph);
	}
	
	@Override
	public void describeQuery(String query, RDFGraph aGraph) {
		JenaDataSourceExecution.doDescribeQuery(query, dataSet, null, aGraph);
	}
	
	@Override
	public ResultSet selectQuery(String query) {
		return new JenaResultSet( 
					QueryExecutionFactory.create( QueryFactory.create( query ), dataSet )
						.execSelect());
	}

	@Override
	public ResultSet selectQuery(String query, URI graph) {
		ResultSet rs = null;
		try {
			rs = new JenaResultSet (
						QueryExecutionFactory.create( 
								QueryFactory.create( query ), dataSet.getNamedModel(graph.toString()) )
					.execSelect() );
		} catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	@Override
	public RDFGraph describeQuery(String query) {
		return doDescribeQuery(query, dataSet, null);
	}
	
	@Override
	public boolean askQuery(String query, URI graph) {
		if (!dataSet.containsNamedModel(graph.toString())) {
			throw new IllegalArgumentException("DataSet does not contains named graph: " + graph);
		}
		
		final Model model = dataSet.getNamedModel(graph.toString());
		boolean result = false;
		try {
			Query aQuery = QueryFactory.create( query );
			QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
			result = qexec.execAsk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public RDFGraph describeQuery(String query, URI graph) {
		return JenaDataSourceExecution.doDescribeQuery(query, dataSet.getNamedModel(graph.toString()), null);
	}
	
	@Override
	public boolean askQuery(String query) {
		boolean result = false;
		try {
			Query aQuery = QueryFactory.create(query );
			QueryExecution qexec = QueryExecutionFactory.create(aQuery, dataSet);
			result = qexec.execAsk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public void update(String query) {
		GraphStore graphStore = GraphStoreFactory.create(dataSet);
        UpdateAction.parseExecute( query, graphStore);
	}
	
	@Override
	public void add(RDFGraph graph) {
		doAdd(graph, dataSet.getDefaultModel());
	}
	
	@Override
	public void add(NamedGraph graph) {
		doAdd(graph, dataSet.getNamedModel(graph.getURI()));
	}

	protected void doAdd(RDFGraph graph, Model model) {
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
		doRemove(graph, dataSet.getDefaultModel());
	}

	@Override
	public void remove(NamedGraph graph) {
		doRemove(graph, dataSet.getNamedModel(graph.getURI()));
	}

	protected void doRemove(RDFGraph graph, Model model) {
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.remove( new RDFGraphExtractor().extract(graph) );
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		dataSet.close();
	}
	
	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		return new NamedGraphInjector(dataSet.getNamedModel(graphURI.toString())).inject();
	}

	@Override
	public boolean supportsTransaction() {
		return Boolean.TRUE;
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
	public void createGraph(URI graphURI) {
		throw new UnsupportedOperationException();
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
