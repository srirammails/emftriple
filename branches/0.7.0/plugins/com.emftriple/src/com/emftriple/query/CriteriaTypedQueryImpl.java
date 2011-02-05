package com.emftriple.query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import com.emftriple.datasources.IEntityDataSourceManager;

public class CriteriaTypedQueryImpl<X> implements TypedQuery<X> {

	private CriteriaQuery<X> query;
	
	@SuppressWarnings("unused")
	private IEntityDataSourceManager dataSourceManager;

	public CriteriaTypedQueryImpl(IEntityDataSourceManager dataSourceManager, CriteriaQuery<X> query) {
		this.query = query;
		this.dataSourceManager = dataSourceManager;
	}

	@Override
	public int executeUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFirstResult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FlushModeType getFlushMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getHints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LockModeType getLockMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxResults() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Parameter<?> getParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parameter<?> getParameter(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Parameter<T> getParameter(String arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null;
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
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<X> getResultList() {
		query.getRoots();
		
		return null;
	}

	@Override
	public X getSingleResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setFirstResult(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setFlushMode(FlushModeType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setHint(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setLockMode(LockModeType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setMaxResults(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> TypedQuery<X> setParameter(Parameter<T> arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(Parameter<Calendar> arg0, Calendar arg1,
			TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(Parameter<Date> arg0, Date arg1,
			TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(String arg0, Calendar arg1,
			TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(String arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(int arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypedQuery<X> setParameter(int arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
