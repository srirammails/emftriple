/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import java.util.Map;

import javax.persistence.EntityManagerFactory;

import com.emftriple.config.persistence.DataSourceConfig;
import com.emftriple.datasources.impl.DataSourceFactoryRegistryImpl;


/**
 * The {@link DataSourceFactory} interface contains necessary methods to create {@link DataSource} according 
 * to a given configuration. This interface is supposed to be implemented by data source adapters. This interface 
 * is called during {@link EntityManagerFactory} initialisation to create the set of data sources associated to the 
 * persistence unit. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface DataSourceFactory {

	/**
	 * Returns True if the {@link DataSourceFactory} can create a {@link DataSource} with the given options.
	 * 
	 * @param descriptor
	 * @return true if can create
	 */
	boolean canCreate(DataSourceConfig descriptor);
	
	/**
	 * Returns a newly created {@link DataSource} instance corresponding to the given options.
	 * 
	 * @param options
	 * 
	 * @return the data source
	 * 
	 * @throws DataSourceException
	 */
	DataSource create(DataSourceConfig descriptor);

	/**
	 * 	The {@link Registry} interface manages the {@link DataSource} being created.   
	 * 
	 *  @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 *	@since 0.6.0
	 */
	interface Registry {
		
		Map<String, Object> getURIToDataSourceMap();
		 
		Registry INSTANCE = new DataSourceFactoryRegistryImpl();
	}
}
