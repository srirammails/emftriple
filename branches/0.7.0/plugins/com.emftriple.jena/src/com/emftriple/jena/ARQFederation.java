package com.emftriple.jena;

import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IMutableDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.impl.AbstractNamedGraphDataSource;
import com.emftriple.jena.util.JenaResultSet;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.Syntax;

/**
 * 
 * @author ehilgui
 *
 */
public class ARQFederation extends AbstractNamedGraphDataSource implements IMutableDataSource {

	protected final List<IDataSource> dataSources;
	
	protected ARQFederation(String name, List<URI> namedGraphURIs, List<IDataSource> dataSources) {
		super(name, namedGraphURIs);
		this.dataSources = dataSources;
	}

	@Override
	public IResultSet selectQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, Syntax.syntaxARQ, DatasetFactory.create());
		com.hp.hpl.jena.query.ResultSet rs = qe.execSelect();
		
		return new JenaResultSet(rs);
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
	public NamedGraph getNamedGraph(URI graphURI) {
		// TODO Auto-generated method stub
		return null;
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
	public void add(RDFGraph graph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(RDFGraph graph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}
