package com.emftriple.query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.query.jpql.JPQLQuery;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class JpqlTypedQuery<T> extends JpqlQuery implements TypedQuery<T> {

	private Class<T> aClass;

	public JpqlTypedQuery(EntityDataSourceManager dataSourceManager, String queryString, Mapping mapping, Class<T> aClass) {
		super(dataSourceManager, queryString, mapping);
		this.aClass = aClass;
	}
	
	public JpqlTypedQuery(EntityDataSourceManager dataSourceManager, JPQLQuery query, Mapping mapping, Class<T> aClass) {
		super(dataSourceManager, query, mapping);
		this.aClass = aClass;
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public T getSingleResult() {
		Object obj = super.getSingleResult();

		if (obj == null)
			return null;
		
		if (aClass.isAssignableFrom(obj.getClass())) {
			return (T) obj;	
		} else {
			throw new ClassCastException();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getResultList() {
		return (List<T>) super.getResultList();
	}
	
	@Override
	public int executeUpdate() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getFirstResult() {
		throw new UnsupportedOperationException();
	}

	@Override
	public TypedQuery<T> setFirstResult(int arg0) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public TypedQuery<T> setMaxResults(int arg0) {
		super.setMaxResults(arg0);
		return this;
	}

	@Override
	public TypedQuery<T> setHint(String arg0, Object arg1) {
		super.setHint(arg0, arg1);
		return this;
	}

	@Override
	public TypedQuery<T> setFlushMode(FlushModeType arg0) {
		super.setFlushMode(arg0);
		return this;
	}

	@Override
	public TypedQuery<T> setLockMode(LockModeType arg0) {
		super.setLockMode(arg0);
		return this;
	}

	public <U> javax.persistence.TypedQuery<T> setParameter(javax.persistence.Parameter<U> param, U value) {
		return null;
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