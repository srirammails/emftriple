/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.ResultSet.Solution;
import com.emftriple.impl.ParameterImpl;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.SPARQLQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.UpdateQuery;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class Sparql implements Query {

	private final SPARQLQuery theQuery;

	@SuppressWarnings("unused")
	private Map<Object, Object> properties;

	private Map<Object, Object> parameters;

	private int maxResults;

	private FlushModeType flushMode;

	private final EntityDataSourceManager dataSourceManager;

	private Map<String, Object> hints;

	public Sparql(EntityDataSourceManager dataSourceManager, String queryString) {
		this.dataSourceManager = dataSourceManager;
		this.theQuery = SparqlBuilder.getQuery(queryString);
		this.properties = Maps.newHashMap();
		this.parameters = Maps.newHashMap();
		this.hints = Maps.newHashMap();
	}

	public Sparql(EntityDataSourceManager dataSourceManager, SelectQuery query, Map<Object, Object> properties,
			Map<Object, Object> parameters, Map<String, Object> hints, int maxResults) {
		this.dataSourceManager = dataSourceManager;
		this.theQuery = query;
		this.properties = properties;
		this.parameters = parameters;
		this.maxResults = maxResults;
		this.hints = hints;
	}

	private EntityDataSourceManager getDataSourceManager() {
		return dataSourceManager;
	}

	/**
	 * Execute a SPARQL Update Query only if the {@link DataSource} is a {@link MutableDataSource} and 
	 * supports {@link UpdateQuery} operations. Otherwise, do nothing.
	 */
	@Override
	public int executeUpdate() {
		checkIsUpdateQuery(theQuery, null);

		return getDataSourceManager().executeUpdateQuery(SparqlBuilder.extract(theQuery));
	}

	/**
	 * Execute the Query on the {@link DataSource} and returns a List of Objects.
	 */
	@Override
	public List<?> getResultList() {
		if (theQuery instanceof SelectQuery)
		{
			return doExecuteSelectQuery((SelectQuery) theQuery);
		}
		else if (theQuery instanceof ConstructQuery) 
		{
			List<Node> subjects = doExecuteConstructQuery((ConstructQuery) theQuery);
			if (subjects == null)
			{
				return null;
			}

			return getDataSourceManager().findNodes(subjects);			
		}
		else
		{
			return Lists.newArrayList();
		}
	}

	private List<Node> doExecuteConstructQuery(ConstructQuery query) {
		final ConstructQuery queryFinal = (ConstructQuery) SparqlBuilder.finalize(query, parameters, maxResults);
		final RDFGraph resultGraph = getDataSourceManager().executeConctructQuery(SparqlBuilder.extract(queryFinal));

		if (resultGraph == null || resultGraph.getTriples().isEmpty()) 
		{
			return null;
		}

		return resultGraph.listSubjects();
	}

	private List<?> doExecuteSelectQuery(SelectQuery query) {
		final List<Object> list = Lists.newArrayList();
		final SelectQuery queryFinal = (SelectQuery) SparqlBuilder.finalize(query, parameters, maxResults);
		final ResultSet resultSet = getDataSourceManager().executeSelectQuery(SparqlBuilder.extract(queryFinal));

		List<Resource> resources = Lists.newArrayList();
		for (;resultSet.hasNext();) 
		{
			final Solution sol = resultSet.next();
			for (String var: resultSet.getVarNames()) 
			{

				final Node res = sol.get(var); 
				if (res != null)
				{
					if (res instanceof Resource)
					{	
						resources.add( (Resource) res );
					}
				}
			}
		}

		for (Resource resource: resources)
		{
			final Object obj = getDataSourceManager().findNode(resource);

			if (obj != null) 
			{
				list.add(obj);
			}
		}

		return list;
	}

	/**
	 * Execute the Query on the {@link DataSource} and returns a single Object.
	 */
	@Override
	public Object getSingleResult() {
		final List<?> results = getResultList();

		if (results == null || results.isEmpty()) {
			throw new NoResultException();
		}

		if (results.size() > 1) {
			throw new NonUniqueResultException();
		}

		return results.get(0);
	}

	@Override
	public Query setFirstResult(int arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setFlushMode(FlushModeType flushMode) {
		this.flushMode = flushMode;
		return this;
	}

	@Override
	public Query setHint(String arg0, Object arg1) {
		this.hints.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setMaxResults(int maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	@Override
	public Query setParameter(String arg0, Object arg1) {
		this.parameters.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setParameter(int arg0, Object arg1) {
		this.parameters.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setParameter(String arg0, Date arg1, TemporalType arg2) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(String arg0, Calendar arg1, TemporalType arg2) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(int arg0, Date arg1, TemporalType arg2) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(int arg0, Calendar arg1, TemporalType arg2) {
		throw new UnsupportedOperationException();
	}

	protected static void checkIsConstructQuery(com.emftriple.query.sparql.SPARQLQuery theQuery2, String message) {
		if (!(theQuery2 instanceof ConstructQuery)) {
			throw new IllegalArgumentException(message);
		}
	}

	protected static void checkIsSelectQuery(com.emftriple.query.sparql.SPARQLQuery sparqlQuery, String message) {
		if (!(sparqlQuery instanceof SelectQuery)) {
			throw new IllegalArgumentException(message);
		}
	}

	protected static void checkIsUpdateQuery(com.emftriple.query.sparql.SPARQLQuery sparqlQuery, String message) {
		if (!(sparqlQuery instanceof UpdateQuery)) {
			throw new IllegalArgumentException(message);
		}
	}

	@Override
	public int getFirstResult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FlushModeType getFlushMode() {
		return flushMode;
	}

	@Override
	public Map<String, Object> getHints() {
		return hints;
	}

	@Override
	public LockModeType getLockMode() {
		return LockModeType.NONE;
	}

	@Override
	public int getMaxResults() {
		return maxResults;
	}

	@Override
	public Parameter<?> getParameter(String arg0) {
		return new ParameterImpl<Object>(arg0, null);
	}

	@Override
	public Parameter<?> getParameter(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Parameter<T> getParameter(String arg0, Class<T> arg1) {
		return new ParameterImpl<T>(arg0, arg1);
	}

	@Override
	public <T> Parameter<T> getParameter(int arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getParameterValue(Parameter<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParameterValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParameterValue(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Parameter<?>> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBound(Parameter<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Query setLockMode(LockModeType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Query setParameter(Parameter<T> arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(Parameter<Calendar> arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(Parameter<Date> arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
