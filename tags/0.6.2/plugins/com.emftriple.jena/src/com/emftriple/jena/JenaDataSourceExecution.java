/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.query.SparqlBuilder.extract;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.injector.NamedGraphInjector;
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
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

	static RDFGraph doContstructQuery(ConstructQuery query, Dataset dataSet, String format) {
		try {
			RDFGraph graph = null;
			dataSet.getLock().enterCriticalSection(Lock.READ);
			try {
				final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create(extract(query)), dataSet );
				final Model result = queryExec.execConstruct();			
				graph = new NamedGraphInjector(result, format).inject();		
			} finally { 
				dataSet.getLock().leaveCriticalSection();
			}
			return graph;
		} finally {
			SparqlBuilder.clear();
		}
	}

	static RDFGraph doContstructQuery(ConstructQuery query, Model model, String format) {
		try {
			RDFGraph graph = null;
			model.enterCriticalSection(Lock.READ);
			try {
				final QueryExecution queryExec = QueryExecutionFactory.create( QueryFactory.create(extract(query)), model );
				final Model result = queryExec.execConstruct();			
				graph = new NamedGraphInjector(result, format).inject();		
			} finally { 
				model.leaveCriticalSection();
			}
			return graph;
		} finally {
			SparqlBuilder.clear();
		}
	}

	static RDFGraph doDescribeQuery(DescribeQuery query, Dataset dataSet, String format) {
		try {
			RDFGraph graph = null;
			dataSet.getLock().enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create(extract(query));
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, dataSet);
				final Model result = qexec.execDescribe();
				graph = new NamedGraphInjector(result, format).inject();
			} finally {
				dataSet.getLock().leaveCriticalSection();
			}
			return graph;
		} finally {
			SparqlBuilder.clear();
		}
	}

	static RDFGraph doDescribeQuery(DescribeQuery query, Model model, String format) {
		try {
			RDFGraph graph = null;
			model.enterCriticalSection(Lock.READ);
			try {
				Query aQuery = QueryFactory.create(extract(query));
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
				final Model result = qexec.execDescribe();
				graph = new NamedGraphInjector(result, format).inject();
			} finally {
				model.leaveCriticalSection();
			}
			return graph;
		} finally {
			SparqlBuilder.clear();
		}
	}

	static boolean doAskQuery(AskQuery query, Model model) {
		try {
			boolean result = false;
			try {
				Query aQuery = QueryFactory.create(extract(query));
				QueryExecution qexec = QueryExecutionFactory.create(aQuery, model);
				result = qexec.execAsk();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return result;
		} finally {
			SparqlBuilder.clear();
		}
	}
}
