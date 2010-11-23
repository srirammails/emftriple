/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query;

import static com.emftriple.util.Functions.transform;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.query.mql.MQuery;
import com.emftriple.query.mql.SelectStatement;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.transform.MqlSelect2SparqlSelect;
import com.google.common.collect.Maps;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class Mql implements Query {

	protected final MQuery theQuery;

	protected final EntityDataSourceManager dataSourceManager;

	protected int maxResults;

	protected FlushModeType flushMode;

	protected Mapping mapping;
	
	protected Map<Object, Object> properties;
	
	protected Map<String, Object> parameters;

	protected Map<String, Object> hints;

	public Mql(EntityDataSourceManager dataSourceManager, String queryString, Mapping mapping) {
		this.dataSourceManager = dataSourceManager;
		this.properties = Maps.newHashMap();
		this.parameters = Maps.newHashMap();
		this.hints = Maps.newHashMap();
		this.theQuery = MQueryBuilder.getSelect(queryString);
		this.mapping = mapping;
	}

	public Mql(EntityDataSourceManager dataSourceManager, MQuery aQuery, Mapping mapping) {
		this.dataSourceManager = dataSourceManager;
		this.properties = Maps.newHashMap();		
		this.parameters = Maps.newHashMap();
		this.hints = Maps.newHashMap();
		this.theQuery = aQuery;
		this.mapping = mapping;
	}

	@Override
	public int executeUpdate() {
		throw new UnsupportedOperationException("Update operations are not yet supported.");
	}

	@Override
	public List<?> getResultList() {
		final List<Object> result = new LinkedList<Object>();

		if (theQuery instanceof SelectStatement) {
			final SelectQuery query = transform((SelectStatement)theQuery, new MqlSelect2SparqlSelect(mapping));
			Sparql sparql = new Sparql(getDataSourceManager(), query, properties, parameters, hints, maxResults);
			
			return sparql.getResultList();
		}

		return result;
	}

	private EntityDataSourceManager getDataSourceManager() {
		return dataSourceManager;
	}

	@Override
	public Object getSingleResult() {
		List<?> list = getResultList();

		return list.isEmpty() ? null : list.get(0); 
	}

	@Override
	public Query setFirstResult(int arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setFlushMode(FlushModeType arg0) {
		this.flushMode = arg0;
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
		parameters.put(arg0, arg1);
		
		return this;
	}

	@Override
	public Query setParameter(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(String arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(String arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(int arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Query setParameter(int arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
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
		if (arg0 != LockModeType.NONE)
		{
			throw new IllegalArgumentException("LockModeType can only be set to NONE");
		}
		return this;
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
