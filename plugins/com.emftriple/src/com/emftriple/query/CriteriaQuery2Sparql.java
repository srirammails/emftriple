package com.emftriple.query;

import javax.persistence.criteria.CriteriaQuery;

import com.google.common.base.Function;

class CriteriaQuery2Sparql<T> implements Function<CriteriaQuery<T>, NativeTypedQueryImpl<T>> {

	@Override
	public NativeTypedQueryImpl<T> apply(CriteriaQuery<T> query) {
//		final Set<Root<?>> roots = query.getRoots();
//		for (Root<?> root: roots) {
//			
//		}
		return null;
	}

}
