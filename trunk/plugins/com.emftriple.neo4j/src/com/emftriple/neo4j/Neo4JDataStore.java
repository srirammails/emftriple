package com.emftriple.neo4j;

import org.eclipse.emf.common.util.URI;
import org.neo4j.rdf.store.RdfStore;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.IMutableNamedGraphDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.neo4j.util.RDFGraph2Statements;

public class Neo4JDataStore extends AbstractNamedGraphDataSource implements IMutableNamedGraphDataSource {

	private final RdfStore store;
	
	protected Neo4JDataStore(String name, RdfStore store) {
		super(name);
		this.store = store;
	}

	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> getNamedGraphs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsGraph(URI graph) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IResultSet selectQuery(String query, URI graph) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFGraph constructQuery(String query, URI graph) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFGraph describeQuery(String query, URI graph) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean askQuery(String query, URI graph) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IResultSet selectQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFGraph constructQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void constructQuery(String aQuery, RDFGraph aGraph) {
		// TODO Auto-generated method stub

	}

	@Override
	public RDFGraph describeQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void describeQuery(String aQuery, RDFGraph aGraph) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean askQuery(String query) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(RDFGraph graph) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(RDFGraph graph) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGraph(URI graph) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(NamedGraph graph) {
		store.addStatements(RDFGraph2Statements.createStatements(graph));
	}

	@Override
	public void remove(NamedGraph graph) {
//		store.removeStatements(arg0);
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disconnect() {
		store.shutDown();
	}

}
