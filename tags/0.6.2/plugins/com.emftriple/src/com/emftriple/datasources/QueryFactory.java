/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * The {@link QueryFactory} interface provides the set of methods used to create 
 * various kinds of queries.
 * 
 * @see Query
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface QueryFactory {
	/**
	 * Creates a {@link Query} from a string
	 * 
	 * @param queryString contains the query
	 * 
	 * @return query
	 */
	Query createQuery(String queryString);

	/**
	 * Creates a registered named query
	 * 
	 * @param queryString contains the query
	 * 
	 * @return query
	 */
	Query createNamedQuery(String queryString);

	/**
	 * Creates a native query (SPARQL) from a string
	 * 
	 * @param queryString contains the query
	 * 
	 * @return query
	 */
	Query createNativeQuery(String queryString);

	/**
	 * Creates a native typed query from a string. The returned type of the 
	 * query corresponds to the class argument
	 * 
	 * @param queryString contains the query
	 * @param aClass corresponds to the query return type
	 * 
	 * @return query
	 */
	Query createNativeQuery(String queryString, Class<?> aClass);

	/**
	 * Creates a native query from a string
	 * 
	 * @param queryString contains the query
	 * @param agr1
	 * 
	 * @return query
	 */
	Query createNativeQuery(String queryString, String arg1);
	
	/**
	 * Creates a {@link TypedQuery} from a string and a given class argument
	 * 
	 * @param query contains the query
	 * @param aClass corresponds to the query return type
	 * 
	 * @return query
	 */
	<T> TypedQuery<T> createTypedQuery(String query, Class<T> aClass);
	
	/**
	 * Creates a {@link TypedQuery} from a registered named queries.
	 * 
	 * @param queryName of the registered named query
	 * @param aClass is the type result of the query
	 * 
	 * @return query
	 */
	<T> TypedQuery<T> createNamedTypedQuery(String queryName, Class<T> aClass);
}
