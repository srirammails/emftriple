/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import com.emf4sw.rdf.RDFGraph;

/**
 * The {@link MutableDataSource} interface represents {@link DataSource} that support add and remove operations.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public interface MutableDataSource extends DataSource {

	/**
	 * Adds an {@link RDFGraph} to the {@link DataSource}
	 * 
	 * @param graph to add
	 * @throws DataSourceException
	 */
	void add(RDFGraph graph) throws DataSourceException;
	 
	/**
	 * Removes an {@link RDFGraph} from the {@link DataSource}
	 * 
	 * @param graph to remove
	 * @throws DataSourceException
	 */
	void remove(RDFGraph graph) throws DataSourceException;
	
}
