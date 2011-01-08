/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query.datasources.impl;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.query.Jpql;
import com.emftriple.query.JpqlTypedQuery;
import com.emftriple.query.NativeQueryFactoryImpl;
import com.emftriple.query.QueryMapping;
import com.emftriple.query.Sparql;
import com.google.inject.Inject;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class QueryFactoryImpl extends NativeQueryFactoryImpl implements QueryFactory {

	private final QueryMapping mapping;
	
	@Inject
	protected QueryFactoryImpl(EntityDataSourceManager dataSourceManager, QueryMapping mapping) {
		super(dataSourceManager);
		this.mapping = mapping;
	}

	@Override
	public Query createNamedQuery(String queryString) {
		return new Jpql(dataSourceManager, mapping.getNamedQuery(queryString), mapping);
	}

	@Override
	public Query createNativeQuery(String queryString) {		
		return new Sparql(dataSourceManager, queryString);
	}

	@Override
	public Query createNativeQuery(String queryString, String arg1) {
		return new Sparql(dataSourceManager, queryString);
	}

	@Override
	public Query createQuery(String queryString) {
		return new Jpql(dataSourceManager, queryString, mapping);
	}

	@Override
	public <T> TypedQuery<T> createTypedQuery(String query, Class<T> aClass) {
		return new JpqlTypedQuery<T>(dataSourceManager, query, mapping, aClass);
	}

	@Override
	public <T> TypedQuery<T> createNamedTypedQuery(String queryName, Class<T> aClass) {
		return new JpqlTypedQuery<T>(dataSourceManager, mapping.getNamedQuery(queryName), mapping, aClass);
	}

	@Override
	public <T> TypedQuery<T> createNativeQuery(String queryString, Class<T> aClass) {
		// TODO Auto-generated method stub
		return null;
	}
}
