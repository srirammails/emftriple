package com.emftriple.query;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IQueryFactory;
import com.google.inject.Inject;

public class NativeQueryFactoryImpl implements IQueryFactory {

	protected final IEntityDataSourceManager dataSourceManager;
	
	@Inject
	protected NativeQueryFactoryImpl(IEntityDataSourceManager dataSourceManager) {
		this.dataSourceManager = dataSourceManager;
	}
	
	@Override
	public Query createNativeQuery(String queryString) {
		return new NativeQueryImpl(dataSourceManager, queryString);
	}

	@Override
	public <T> TypedQuery<T> createNativeQuery(String queryString, Class<T> aClass) {
		return new NativeTypedQueryImpl<T>(dataSourceManager, queryString);
	}

	@Override
	public Query createNativeQuery(String queryString, String arg1) {
		return new NativeQueryImpl(dataSourceManager, queryString);
	}

	@Override
	public Query createQuery(String queryString) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Query createNamedQuery(String queryString) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> TypedQuery<T> createTypedQuery(String query, Class<T> aClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> TypedQuery<T> createNamedTypedQuery(String queryName, Class<T> aClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> TypedQuery<T> createCriteriaQuery(CriteriaQuery<T> query) {
		return new CriteriaTypedQueryImpl<T>(dataSourceManager, query);
	}

}
