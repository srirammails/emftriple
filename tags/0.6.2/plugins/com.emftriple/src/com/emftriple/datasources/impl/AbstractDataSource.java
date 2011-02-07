/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import org.eclipse.emf.common.util.URI;

import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.QueryFactory;


/**
 * {@link AbstractDataSource}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract class AbstractDataSource implements DataSource {
	
	protected final URI defaultGraphURI;

	private boolean isConnected = false;
	
	private QueryFactory queryFactory;
	
	protected AbstractDataSource(URI defaultGraph) {
		this.defaultGraphURI = defaultGraph;
	}
	
	protected void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
		
	@Override
	public abstract void connect();
	
	@Override
	public void setQueryFactory(QueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	@Override
	public QueryFactory getQueryFactory() {
		return queryFactory;
	}
	
	@Override
	public abstract void disconnect();
	
	@Override
	public boolean isConnected() {
		return isConnected;
	};
	
	@Override
	public URI getDefaultGraph() {
		return defaultGraphURI;
	}
	
}
