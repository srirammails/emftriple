/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import java.util.HashMap;
import java.util.Map;

import com.emftriple.datasources.DataSourceFactory;

public class DataSourceFactoryRegistryImpl implements DataSourceFactory.Registry {

	private final Map<String, Object> uriToDataSourceMap;
	
	public DataSourceFactoryRegistryImpl() {
		uriToDataSourceMap = new HashMap<String, Object>();
	}
	
	@Override
	public Map<String, Object> getURIToDataSourceMap() {
		return uriToDataSourceMap;
	}

}
