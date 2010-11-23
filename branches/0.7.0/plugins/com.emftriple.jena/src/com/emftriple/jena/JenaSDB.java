/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.jena.JenaDataSourceExecution.doAskQuery;
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
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.UpdateQuery;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.sdb.Store;
import com.hp.hpl.jena.sdb.store.DatasetStore;
import com.hp.hpl.jena.update.GraphStore;
import com.hp.hpl.jena.update.GraphStoreFactory;
import com.hp.hpl.jena.update.UpdateAction;

/**
 * {@link JenaSDB}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JenaSDB extends AbstractNamedGraphDataSource 
implements SparqlUpdateDataSource, MutableNamedGraphDataSource, TransactionEnableDataSource {

	public static final String JENA_SDB_OPTION_USER = "emftriple.db.user";
	
	public static final String JENA_SDB_OPTION_PASS = "emftriple.db.password";
	
	public static final String JENA_SDB_OPTION_TYPE = "emftriple.db.sdb.type";
	
	private final Store store;

	protected JenaSDB(URI defaultURI, List<URI> graphs, Store store) {
		super(defaultURI, graphs);
		this.store = store;
	}

	@Override
	public void add(RDFGraph graph) throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().add(new RDFGraphExtractor().extract(graph));
	}

	@Override
	public void add(NamedGraph graph) throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.getURI())) {
			ds.getNamedModel(graph.getURI()).add(new RDFGraphExtractor().extract(graph));
		}
	}
	
	@Override
	public void remove(RDFGraph graph) throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().remove(new RDFGraphExtractor().extract(graph));
	}

	@Override
	public void remove(NamedGraph graph) throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.getURI())) {
			ds.getNamedModel(graph.getURI()).remove(new RDFGraphExtractor().extract(graph));
		}
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query, URI graph) {
		RDFGraph aGraph = null;
		
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.toString())) {
			Model aModel = ds.getNamedModel(graph.toString());
			aGraph = JenaDataSourceExecution.doContstructQuery(query, aModel, null);
		}
		return aGraph;
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query) {
		Dataset ds = DatasetStore.create(store);
		return JenaDataSourceExecution.doContstructQuery(query, ds.getDefaultModel(), null);
	}
		
	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		NamedGraph aGraph = null;
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graphURI.toString())) {
			Model aModel = ds.getNamedModel(graphURI.toString());
			aGraph = new NamedGraphInjector(aModel).inject();
		}
		return aGraph;
	}

	@Override
	public ResultSet selectQuery(SelectQuery query, URI graph) {
		ResultSet resultSet = null;
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			resultSet = new JenaResultSet (QueryExecutionFactory.create( 
					QueryFactory.create(extract(query)), 
					ds.getNamedModel(graph.toString()) ).execSelect() );
		}
		
		return resultSet;
	}

	@Override
	public ResultSet selectQuery(SelectQuery query) {
		final Dataset ds = DatasetStore.create(store);
		return new JenaResultSet ( 
				QueryExecutionFactory.create( QueryFactory.create(extract(query)), ds.getDefaultModel() )
					.execSelect() );
	}

	@Override
	public void update(UpdateQuery query) throws DataSourceException {
		Dataset ds = DatasetStore.create(store) ;
		GraphStore graphStore = GraphStoreFactory.create(ds);
        UpdateAction.parseExecute(extract(query), graphStore);
	}
	
	@Override
	public boolean askQuery(AskQuery query) {
		final Dataset ds = DatasetStore.create(store);
		final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create(extract(query)), ds );
		
		return queryExec.execAsk();
	}

	@Override
	public boolean askQuery(AskQuery query, URI graph) {
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			return doAskQuery( query,
					ds.getNamedModel(graph.toString()) );
		}
		
		return false;
	}
	
	@Override
	public RDFGraph describeQuery(DescribeQuery query) {
		Dataset ds = DatasetStore.create(store);
		
		return doDescribeQuery(query, ds.getDefaultModel(), null);
	}
	
	@Override
	public RDFGraph describeQuery(DescribeQuery query, URI graph) {
		RDFGraph result = null;
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			result = doDescribeQuery(query, ds.getDefaultModel(), null);
		}
		
		return result;
	}
	
	@Override
	public boolean supportsTransaction() {
		return true;
	}

	@Override
	public void begin() throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().begin();
	}

	@Override
	public void commit() throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().commit();
	}

	@Override
	public void rollback() throws DataSourceException {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().abort();
	}

	@Override
	public void createGraph(URI graphURI) {
		if (containsGraph(graphURI))
			return;
		
		getNamedGraphs().add(graphURI);
	}
	
	@Override
	public void connect() {
		setConnected(true);
	}
	
	@Override
	public void disconnect() {
		setConnected(false);
		store.getConnection().close();
	}
}
