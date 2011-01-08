/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query;

import javax.persistence.TypedQuery;

import com.emftriple.Mapping;
import com.emftriple.query.mql.MQuery;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface QueryMapping extends Mapping {

	/**
	 * 
	 * @param queryString
	 * @return
	 */
	MQuery getNamedQuery(String queryString);
	
	/**
	 * 
	 * @param <T>
	 * @return
	 */
	<T> TypedQuery<T>getNamedTypedQuery(String queryString, Class<T> arg1);
	
}
