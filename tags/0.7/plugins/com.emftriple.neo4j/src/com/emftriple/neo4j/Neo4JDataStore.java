package com.emftriple.neo4j;

import org.eclipse.emf.common.util.URI;
import org.neo4j.rdf.model.Uri;
import org.neo4j.rdf.model.WildcardStatement;
import org.neo4j.rdf.store.VerboseQuadStore;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.IMutableNamedGraphDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.neo4j.util.RDFGraph2Statements;
import com.emftriple.neo4j.util.Statements2RDFGraph;

public class Neo4JDataStore extends AbstractNamedGraphDataSource implements IMutableNamedGraphDataSource {

	private final VerboseQuadStore store;
	@SuppressWarnings("unused")
	private boolean connected;
	
	protected Neo4JDataStore(String name, VerboseQuadStore store) {
		super(name);
		this.store = store;
	}

	@Override
	public NamedGraph getNamedGraph(URI graphURI) {
		return Statements2RDFGraph.getNamedGraph(graphURI, 
				store.getStatements(
						new WildcardStatement(null, null, null, new Uri(graphURI.toString())), 
				true));
	}

	@Override
	public Iterable<String> getNamedGraphs() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsGraph(URI graph) {
		throw new UnsupportedOperationException();
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
		return true;
	}

	@Override
	public void add(RDFGraph graph) {
		synchronized (store) {
			store.addStatements(RDFGraph2Statements.createStatements(graph));	
		}
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
		synchronized (store) {
			store.addStatements(RDFGraph2Statements.createStatements(graph));	
		}
	}

	@Override
	public void remove(NamedGraph graph) {
//		store.removeStatements(arg0);
	}

	@Override
	public void connect() {
		this.connected = true;
	}

	@Override
	public void disconnect() {
		this.connected = false;
		store.shutDown();
	}

}
