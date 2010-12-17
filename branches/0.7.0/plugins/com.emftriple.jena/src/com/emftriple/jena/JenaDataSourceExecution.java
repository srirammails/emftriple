/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.jena.NamedGraphInjector;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.shared.Lock;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JenaDataSourceExecution {

	static void doContstructQuery(String query, Dataset dataSet, String format, RDFGraph aGraph) {
		dataSet.getLock().enterCriticalSection(Lock.READ);
		try {
			final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create( query ), dataSet );
			final Model result = queryExec.execConstruct();			
			new NamedGraphInjector(result).inject(aGraph);		
		} finally { 
			dataSet.getLock().leaveCriticalSection();
		}
	}
	
	static RDFGraph doContstructQuery(String query, Dataset dataSet, String format) {
		RDFGraph graph = null;
		dataSet.getLock().enterCriticalSection(Lock.READ);
		try {
			final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create( query ), dataSet );
			final Model result = queryExec.execConstruct();			
			graph = new NamedGraphInjector(result).inject();		
		} finally { 
			dataSet.getLock().leaveCriticalSection();
		}
		return graph;
	}

	static void doContstructQuery(String query, Model model, String format, RDFGraph aGraph) {
		model.enterCriticalSection(Lock.READ);
		try {
			final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create( query ), model );
			final Model result = queryExec.execConstruct();			
			
			new NamedGraphInjector(result).inject(aGraph);		
		} finally { 
			model.leaveCriticalSection();
		}
	}
	
	static RDFGraph doContstructQuery(String query, Model model, String format) {
		RDFGraph graph = null;
		model.enterCriticalSection(Lock.READ);
		try {
			final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create( query ), model );
			final Model result = queryExec.execConstruct();			
			graph = new NamedGraphInjector(result).inject();		
		} finally { 
			model.leaveCriticalSection();
		}
		return graph;
	}


	static void doDescribeQuery(String query, Dataset dataSet, String format, RDFGraph aGraph) {
		try {
			dataSet.getLock().enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create( query );
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, dataSet);
				final Model result = qexec.execDescribe();
				
				new NamedGraphInjector(result).inject(aGraph);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				dataSet.getLock().leaveCriticalSection();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static RDFGraph doDescribeQuery(String query, Dataset dataSet, String format) {
		RDFGraph graph = null;
		try {
			dataSet.getLock().enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create( query );
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, dataSet);
				final Model result = qexec.execDescribe();
				graph = new NamedGraphInjector(result).inject();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				dataSet.getLock().leaveCriticalSection();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return graph;
	}

	static void doDescribeQuery(String query, Model model, String format, RDFGraph aGraph) {
		try {
			model.enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create( query );
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
				final Model result = qexec.execDescribe();
				
				new NamedGraphInjector(result).inject(aGraph);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				model.leaveCriticalSection();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static RDFGraph doDescribeQuery(String query, Model model, String format) {
		RDFGraph graph = null;
		try {
			model.enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create( query );
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
				final Model result = qexec.execDescribe();
				graph = new NamedGraphInjector(result).inject();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				model.leaveCriticalSection();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return graph;
	}

	static boolean doAskQuery(String query, Model model) {
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
}
