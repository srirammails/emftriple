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

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.NamedGraphInjector;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
import com.emftriple.datasources.IMutableNamedGraphDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.ISparqlUpdateDataSource;
import com.emftriple.datasources.ITransactionEnableDataSource;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.jena.util.JenaResultSet;
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
implements ISparqlUpdateDataSource, IMutableNamedGraphDataSource, ITransactionEnableDataSource {

	public static final String JENA_SDB_OPTION_USER = "emftriple.db.user";
	
	public static final String JENA_SDB_OPTION_PASS = "emftriple.db.password";
	
	public static final String JENA_SDB_OPTION_TYPE = "emftriple.db.sdb.type";
	
	private final Store store;

	protected JenaSDB(String name, List<URI> graphs, Store store) {
		super(name, graphs);
		this.store = store;
	}

	@Override
	public void add(RDFGraph graph) {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().add(new RDFGraphExtractor().extract(graph));
	}

	@Override
	public void add(NamedGraph graph) {
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.getURI())) {
			ds.getNamedModel(graph.getURI()).add(new RDFGraphExtractor().extract(graph));
		}
	}
	
	@Override
	public void remove(RDFGraph graph) {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().remove(new RDFGraphExtractor().extract(graph));
	}

	@Override
	public void remove(NamedGraph graph) {
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.getURI())) {
			ds.getNamedModel(graph.getURI()).remove(new RDFGraphExtractor().extract(graph));
		}
	}

	@Override
	public RDFGraph constructQuery(String query, URI graph) {
		RDFGraph aGraph = null;
		
		Dataset ds = DatasetStore.create(store);
		if (ds.containsNamedModel(graph.toString())) {
			Model aModel = ds.getNamedModel(graph.toString());
			aGraph = JenaDataSourceExecution.doContstructQuery(query, aModel, null);
		}
		return aGraph;
	}

	@Override
	public RDFGraph constructQuery(String query) {
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
	public IResultSet selectQuery(String query, URI graph) {
		IResultSet resultSet = null;
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			resultSet = new JenaResultSet (QueryExecutionFactory.create( 
					QueryFactory.create( query ), 
					ds.getNamedModel(graph.toString()) ).execSelect() );
		}
		
		return resultSet;
	}

	@Override
	public IResultSet selectQuery(String query) {
		final Dataset ds = DatasetStore.create(store);
		return new JenaResultSet ( 
				QueryExecutionFactory.create( QueryFactory.create( query ), ds.getDefaultModel() )
					.execSelect() );
	}

	@Override
	public void update(String query) {
		Dataset ds = DatasetStore.create(store) ;
		GraphStore graphStore = GraphStoreFactory.create(ds);
        UpdateAction.parseExecute( query, graphStore);
	}
	
	@Override
	public boolean askQuery(String query) {
		final Dataset ds = DatasetStore.create(store);
		final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create( query ), ds );
		
		return queryExec.execAsk();
	}

	@Override
	public boolean askQuery(String query, URI graph) {
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			return doAskQuery( query,
					ds.getNamedModel(graph.toString()) );
		}
		
		return false;
	}
	
	@Override
	public RDFGraph describeQuery(String query) {
		Dataset ds = DatasetStore.create(store);
		
		return doDescribeQuery(query, ds.getDefaultModel(), null);
	}
	
	@Override
	public RDFGraph describeQuery(String query, URI graph) {
		RDFGraph result = null;
		final Dataset ds = DatasetStore.create(store);
		
		if (ds.containsNamedModel(graph.toString())) {
			result = doDescribeQuery(query, ds.getDefaultModel(), null);
		}
		
		return result;
	}
	
	@Override
	public void constructQuery(String query, RDFGraph aGraph) {
		Dataset ds = DatasetStore.create(store);
		
		JenaDataSourceExecution.doContstructQuery(query, ds, null, aGraph);
	}
	
	@Override
	public void describeQuery(String query, RDFGraph aGraph) {
		Dataset ds = DatasetStore.create(store);
		
		JenaDataSourceExecution.doDescribeQuery(query, ds, null, aGraph);
	}
	
	@Override
	public boolean supportsTransaction() {
		return true;
	}

	@Override
	public void begin() {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().begin();
	}

	@Override
	public void commit() {
		Dataset ds = DatasetStore.create(store);
		ds.getDefaultModel().commit();
	}

	@Override
	public void rollback() {
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
