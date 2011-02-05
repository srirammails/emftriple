package com.emftriple.query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import com.emftriple.datasources.IEntityDataSourceManager;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class NativeTypedQueryImpl<T> extends NativeQueryImpl implements TypedQuery<T> {

	NativeTypedQueryImpl(IEntityDataSourceManager dataSourceManager, String queryString) {
		super(dataSourceManager, queryString);
	}
	
	NativeTypedQueryImpl(IEntityDataSourceManager dataSourceManager, String queryString, Map<Object, Object> properties,
			Map<Object, Object> parameters, Map<String, Object> hints, int maxResults) {
		super(dataSourceManager, queryString, properties, parameters, hints, maxResults);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getResultList() {
		return (List<T>) super.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getSingleResult() {
		return (T) super.getSingleResult();
	}
	
	@Override
	public TypedQuery<T> setFirstResult(int arg0) {
		super.setFirstResult(arg0);
		return this;
	}
	
	@Override
	public TypedQuery<T> setMaxResults(int arg0) {
		super.setMaxResults(arg0);
		return this;
	}
	
	@Override
	public TypedQuery<T> setFlushMode(FlushModeType flushMode) {
		super.setFlushMode(flushMode);
		return this;
	}
	
	@Override
	public TypedQuery<T> setLockMode(LockModeType arg0) {
		super.setLockMode(arg0);
		return this;
	}
	
	@Override
	public TypedQuery<T> setHint(String arg0, Object arg1) {
		super.setHint(arg0, arg1);
		return this;
	}
	
	public <U> javax.persistence.TypedQuery<T> setParameter(javax.persistence.Parameter<U> param, U value) {
		super.setParameter(param, value);
		return this;
	};
	
	@Override
	public TypedQuery<T> setParameter(String arg0, Object arg1) {
		super.setParameter(arg0, arg1);
		return this;
	}
	
	@Override
	public TypedQuery<T> setParameter(Parameter<Calendar> param, Calendar value, TemporalType temporalType) {
		super.setParameter(param, value, temporalType);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(Parameter<Date> param, Date value, TemporalType temporalType) {
		super.setParameter(param, value, temporalType);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(String name, Calendar value, TemporalType temporalType) {
		super.setParameter(name, value, temporalType);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(String name, Date value, TemporalType temporalType) {
		super.setParameter(name, value, temporalType);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(int position, Object value) {
		super.setParameter(position, value);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(int position, Calendar value, TemporalType temporalType) {
		super.setParameter(position, value, temporalType);
		return this;
	}

	@Override
	public TypedQuery<T> setParameter(int position, Date value, TemporalType temporalType) {
		super.setParameter(position, value, temporalType);
		return this;
	}
}
