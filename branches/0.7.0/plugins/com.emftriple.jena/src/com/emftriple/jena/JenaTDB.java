/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.jena.JenaDataSourceExecution.doDescribeQuery;
import static com.emftriple.query.SparqlBuilder.extract;

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.NamedGraphInjector;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
import com.emftriple.datasources.DataSourceException;
import com.emftriple.datasources.MutableNamedGraphDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.SparqlUpdateDataSource;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.jena.util.JenaResultSet;
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.UpdateQuery;
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
	
	protected JenaTDB(URI defaultGraph, String fileLocation, List<URI> graphs) {
		super( defaultGraph, graphs );
		this.dataSet = TDBFactory.createDataset(fileLocation);
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query) {
		return JenaDataSourceExecution.doContstructQuery(query, dataSet, null); 
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query, URI graph) {
		if (!dataSet.containsNamedModel(graph.toString())) {
			throw new IllegalArgumentException("DataSet does not contains named graph: " + graph);
		}
		return JenaDataSourceExecution.doContstructQuery(query, dataSet.getNamedModel(graph.toString()), null);
	}

	@Override
	public ResultSet selectQuery(SelectQuery query) {
		try {
			return new JenaResultSet( 
						QueryExecutionFactory.create( QueryFactory.create(extract(query)), dataSet )
							.execSelect()
					);
		}
		finally {
			SparqlBuilder.clear();
		}
	}

	@Override
	public ResultSet selectQuery(SelectQuery query, URI graph) {
		try {
			return new JenaResultSet (
				QueryExecutionFactory.create( QueryFactory.create(extract(query)), dataSet.getNamedModel(graph.toString()) )
					.execSelect()
				);
		}
		finally {
			SparqlBuilder.clear();
		}
	}
	
	@Override
	public RDFGraph describeQuery(DescribeQuery query) {
		return doDescribeQuery(query, dataSet, null);
	}
	
	@Override
	public boolean askQuery(AskQuery query, URI graph) {
		if (!dataSet.containsNamedModel(graph.toString())) {
			throw new IllegalArgumentException("DataSet does not contains named graph: " + graph);
		}
		final Model model = dataSet.getNamedModel(graph.toString());
		boolean result = false;
		try {
			Query aQuery = QueryFactory.create(extract(query));
			QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
			result = qexec.execAsk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public RDFGraph describeQuery(DescribeQuery query, URI graph) {
		return JenaDataSourceExecution.doDescribeQuery(query, dataSet.getNamedModel(graph.toString()), null);
	}
	
	@Override
	public boolean askQuery(AskQuery query) {
		boolean result = false;
		try {
			Query aQuery = QueryFactory.create(extract(query));
			QueryExecution qexec = QueryExecutionFactory.create(aQuery, dataSet);
			result = qexec.execAsk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public void update(UpdateQuery query) throws DataSourceException {
		GraphStore graphStore = GraphStoreFactory.create(dataSet);
        UpdateAction.parseExecute(extract(query), graphStore);
	}
	
	@Override
	public void add(RDFGraph graph) throws DataSourceException {
		doAdd(graph, dataSet.getDefaultModel());
	}
	
	@Override
	public void add(NamedGraph graph) throws DataSourceException {
		doAdd(graph, dataSet.getNamedModel(graph.getURI()));
	}

	protected void doAdd(RDFGraph graph, Model model) throws DataSourceException {
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.add( new RDFGraphExtractor().extract(graph) );	
		} finally { 
			model.leaveCriticalSection();
			model.commit();
		}	
	}
	
	@Override
	public void remove(RDFGraph graph) throws DataSourceException {
		doRemove(graph, dataSet.getDefaultModel());
	}

	@Override
	public void remove(NamedGraph graph) throws DataSourceException {
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
	public void begin() throws DataSourceException {
		dataSet.getDefaultModel().begin();		
	}

	@Override
	public void commit() throws DataSourceException {
		dataSet.getDefaultModel().commit();
	}

	@Override
	public void rollback() throws DataSourceException {
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
