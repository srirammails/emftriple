/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.SparqlUpdateDataSource;
import com.emftriple.datasources.impl.AbstractDataSource;
import com.emftriple.jena.util.JenaResultSet;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.update.GraphStore;
import com.hp.hpl.jena.update.GraphStoreFactory;
import com.hp.hpl.jena.update.UpdateAction;

/**
 * {@link JenaDataSourceFactory}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JenaFile extends AbstractDataSource implements SparqlUpdateDataSource {

	private final String fileLocation;

	private final Model model;

	private final String fileFormat;

	protected JenaFile(String name, Model model, String fileLocation, String format) {
		super(name);
		this.fileLocation = fileLocation;
		this.fileFormat = format;
		this.model = model;
	}

	@Override
	public RDFGraph constructQuery(String query) {
		return JenaDataSourceExecution.doContstructQuery(query, model, fileFormat); 
	}

	@Override
	public RDFGraph describeQuery(String query) {
		return JenaDataSourceExecution.doDescribeQuery(query, model, fileFormat);
	}
	
	@Override
	public void constructQuery(String query, RDFGraph aGraph) {
		JenaDataSourceExecution.doContstructQuery(query, model, fileFormat, aGraph);
	}
	
	@Override
	public void describeQuery(String query, RDFGraph aGraph) {
		JenaDataSourceExecution.doDescribeQuery(query, model, fileFormat, aGraph);
	}
	
	@Override
	public ResultSet selectQuery(String query) {
		ResultSet rs = null;
		try {
			rs = new JenaResultSet( 
						QueryExecutionFactory.create( QueryFactory.create( query ), model )
					.execSelect());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public boolean askQuery(String query) {
		return QueryExecutionFactory.create( QueryFactory.create( query ), model )
			.execAsk();
	}

	@Override
	public void update(String query) {
		GraphStore graphStore = GraphStoreFactory.create(model);
		UpdateAction.parseExecute( query, graphStore);
	}

	@Override
	public void add(RDFGraph graph){
		doAdd(graph, model);
	}

	protected void doAdd(RDFGraph graph, Model model) {
		model.enterCriticalSection(Lock.WRITE);
		try {
			model.add( new RDFGraphExtractor().extract(graph) );
			try {
				model.write(new FileOutputStream(new File(fileLocation)), fileFormat);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} finally { 
			model.leaveCriticalSection();
		}	
	}

	@Override
	public void remove(RDFGraph graph) {
		doRemove(graph, model);
	}

	protected void doRemove(RDFGraph graph, Model model) {
		model.enterCriticalSection(Lock.WRITE);
		try {
			Model removeModel = new RDFGraphExtractor().extract(graph);
			if (removeModel != null && !removeModel.isEmpty()) {
				model.remove( removeModel );
			}
			try {
				model.write(new FileOutputStream(new File(fileLocation)), fileFormat);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} finally { 
			model.leaveCriticalSection();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		model.close();
	}

	@Override
	public boolean supportsTransaction() {
		return false;
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