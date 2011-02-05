/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IQueryFactory;
import com.google.inject.Inject;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class QueryFactoryImpl extends NativeQueryFactoryImpl implements IQueryFactory {

	private final QueryMapping mapping;
	
	@Inject
	protected QueryFactoryImpl(IEntityDataSourceManager dataSourceManager, QueryMapping mapping) {
		super(dataSourceManager);
		this.mapping = mapping;
	}

	@Override
	public Query createNamedQuery(String queryString) {
		return new JpqlQuery(dataSourceManager, mapping.getNamedQuery(queryString), mapping);
	}

	@Override
	public Query createNativeQuery(String queryString) {		
		return new SparqlQuery(dataSourceManager, queryString);
	}

	@Override
	public Query createNativeQuery(String queryString, String arg1) {
		return new SparqlQuery(dataSourceManager, queryString);
	}

	@Override
	public Query createQuery(String queryString) {
		return new JpqlQuery(dataSourceManager, queryString, mapping);
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
