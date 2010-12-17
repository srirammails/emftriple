/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.sesame;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.openrdf.model.Graph;
import org.openrdf.query.GraphQueryResult;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.sesame.RDFGraph2SesameGraph;
import com.emftriple.datasources.MutableNamedGraphDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.sesame.util.SesameGraphResult2RDFGraph;
import com.emftriple.sesame.util.SesameResultSet;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public abstract class SailDataSource extends AbstractNamedGraphDataSource implements MutableNamedGraphDataSource, TransactionEnableDataSource {

	protected RepositoryConnection connection;

	protected final Repository repository;

	protected SailDataSource(String name, Repository repository, List<URI> graphs) {
		super(name, graphs);
		this.repository = repository;
	}

	@Override
	public void add(RDFGraph graph) {
		checkIsConnected();

		final Graph aGraph = new RDFGraph2SesameGraph(graph).extract();
		try {
			connection.add(aGraph);
		} catch (RepositoryException e) {
			try {
				connection.rollback();
			} catch (RepositoryException re) {
				re.printStackTrace();
			}
		}
	}

	@Override
	public void add(NamedGraph graph) {
		add((RDFGraph)graph);
	}

	@Override
	public void remove(RDFGraph graph) {
		checkIsConnected();

		Graph aGraph = new RDFGraph2SesameGraph(graph).extract();
		try {
			connection.remove(aGraph);
		} catch (RepositoryException e) {
			try {
				connection.rollback();
			} catch (RepositoryException re) {
				re.printStackTrace();
			}
		}		
	}

	@Override
	public void remove(NamedGraph graph) {
		remove((RDFGraph)graph);
	}

	@Override
	public RDFGraph constructQuery(String query, URI graph) {
		return constructQuery(query);
	}

	@Override
	public RDFGraph constructQuery(String query) {
		checkIsConnected();

		GraphQueryResult aResult = null;
		try {
			aResult = connection.prepareGraphQuery(QueryLanguage.SPARQL, query)
			.evaluate();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		}

		return aResult != null ? new SesameGraphResult2RDFGraph(aResult).extract() : null;
	}

	@Override
	public void constructQuery(String aQuery, RDFGraph aGraph) {
		checkIsConnected();

		GraphQueryResult aResult = null;
		try {
			aResult = connection.prepareGraphQuery(QueryLanguage.SPARQL, aQuery)
			.evaluate();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		}

		if (aResult != null) 
			new SesameGraphResult2RDFGraph(aResult).extract(aGraph);
	}
	
	@Override
	public ResultSet selectQuery(String query, URI graph) {
		checkIsConnected();

		ResultSet aResult = null;
		try {
			TupleQuery aQuery = connection.prepareTupleQuery(QueryLanguage.SPARQL, query);
			aResult = new SesameResultSet(aQuery.evaluate());
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		}
		return aResult;
	}

	@Override
	public ResultSet selectQuery(String query) {
		checkIsConnected();

		ResultSet aResult = null;
		try {
			TupleQuery aQuery = connection.prepareTupleQuery(QueryLanguage.SPARQL, query);
			aResult = new SesameResultSet( aQuery.evaluate() );
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		}
		finally {

		}
		return aResult;
	}

	@Override
	public RDFGraph describeQuery(String query) {
		checkIsConnected();

		GraphQueryResult aResult = null;	
		try {
			aResult = connection.prepareGraphQuery(QueryLanguage.SPARQL, query)
			.evaluate();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		}

		return aResult != null ? new SesameGraphResult2RDFGraph(aResult).extract() : null;
	}

	@Override
	public void describeQuery(String aQuery, RDFGraph aGraph) {
		checkIsConnected();

		GraphQueryResult aResult = null;	
		try {
			aResult = connection.prepareGraphQuery(QueryLanguage.SPARQL, aQuery)
			.evaluate();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		}

		if (aResult != null) 
			new SesameGraphResult2RDFGraph(aResult).extract(aGraph);
	}
	
	@Override
	public RDFGraph describeQuery(String query, URI graph) {
		return describeQuery(query);
	}

	@Override
	public boolean askQuery(String query, URI graph) {
		return askQuery(query);
	}

	@Override
	public boolean askQuery(String query) {
		checkIsConnected();

		try {
			return connection.prepareBooleanQuery(QueryLanguage.SPARQL, query).evaluate();
		} catch (RepositoryException e) {
			e.printStackTrace();
		} catch (MalformedQueryException e) {
			e.printStackTrace();
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean supportsTransaction() {
		return true;
	}

	@Override
	public void createGraph(URI graphURI) {
		if (!containsGraph(graphURI))
			namedGraphURIs.add(graphURI);
	}

	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		return null;
	}

	@Override
	public void begin() {
		checkIsConnected();
	}

	@Override
	public void commit() {
		checkIsConnected();

		try {
			connection.commit();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void rollback() {
		checkIsConnected();

		try {
			connection.rollback();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void connect() {
		if (!isConnected()) {
			setConnected(true);
			try {
				connection = repository.getConnection();
				connection.setAutoCommit(true);
			} catch (RepositoryException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void disconnect() {
		setConnected(false);
		try {
			connection.close();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}

	private final void checkIsConnected() {
		try {
			if (!(connection != null && connection.isOpen() && isConnected()))
				throw new IllegalStateException();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}
}
