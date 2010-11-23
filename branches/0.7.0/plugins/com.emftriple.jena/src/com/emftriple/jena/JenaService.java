/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.query.Queries.graphQuery;
import static com.emftriple.query.SparqlBuilder.extract;

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.NamedGraphInjector;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.NamedGraphDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.jena.util.JenaResultSet;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link JenaService} is a SPARQL endpoint {@link DataSource} representation.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JenaService extends AbstractNamedGraphDataSource implements NamedGraphDataSource {

	private final String service;
	
	JenaService(URI defaultGraph, String service, List<URI> graphs) {
		super( defaultGraph, graphs );
		this.service = service;
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query) {
		return doConstructQuery(query);
	}

	@Override
	public RDFGraph constructQuery(ConstructQuery query, URI graph) {
		return doConstructQuery(query);
	}
	
	protected RDFGraph doConstructQuery( ConstructQuery query ) {
		RDFGraph graph = null;
		final QueryExecution queryExec = QueryExecutionFactory.sparqlService(service, QueryFactory.create(extract(query)) );
		final Model result = queryExec.execConstruct();
		graph = new NamedGraphInjector(result).inject();
		
		return graph;
	}
	
	@Override
	public ResultSet selectQuery(SelectQuery query) {
		return new JenaResultSet( 
					QueryExecutionFactory.sparqlService(service, QueryFactory.create(extract(query)) ).execSelect()
				);
	}

	@Override
	public ResultSet selectQuery(SelectQuery query, URI graph) {
		throw new UnsupportedOperationException("select query on graph is not supported yet.");
	}
	
	@Override
	public boolean askQuery(AskQuery query) {
		final QueryExecution queryExec = 
				QueryExecutionFactory.sparqlService(service, QueryFactory.create(extract(query)) );
		return queryExec.execAsk();
	}


	@Override
	public boolean supportsTransaction() {
		return Boolean.FALSE;
	}

	@Override
	public RDFGraph describeQuery(DescribeQuery query) {
		RDFGraph graph = null;
		final QueryExecution queryExec = QueryExecutionFactory.sparqlService(service, QueryFactory.create(extract(query)) );
		final Model result = queryExec.execDescribe();
		graph = new NamedGraphInjector(result).inject();
		
		return graph;
	}

	@Override
	public boolean askQuery(AskQuery query, URI graph) {
		boolean result = false;
		try {
			Query aQuery = QueryFactory.create(extract(query));
			QueryExecution qexec = QueryExecutionFactory.sparqlService(service, aQuery);
			result = qexec.execAsk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public RDFGraph describeQuery(DescribeQuery query, URI graph) {
		RDFGraph aGraph = null;
		try {
			Query aQuery = QueryFactory.create(extract(query));
			QueryExecution qexec = QueryExecutionFactory.sparqlService(service, aQuery);
			final Model result = qexec.execDescribe();
			aGraph = new NamedGraphInjector(result).inject();
		} finally {
			// nothing?			
		}
		return aGraph;
	}

	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		NamedGraph aGraph = null;
		try {
			Query aQuery = QueryFactory.create(extract(graphQuery(graphURI)));
			QueryExecution qexec = QueryExecutionFactory.sparqlService(service, aQuery);
			final Model result = qexec.execDescribe();
			aGraph = new NamedGraphInjector(result).inject();
		} finally {
			// nothing?
		}
		return aGraph;
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
