/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import com.emftriple.datasources.DataSourceFactory;
import com.google.inject.AbstractModule;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
@Deprecated
public class JenaModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DataSourceFactory.class)
			.to(JenaDataSourceFactory.class);		
	}

}
