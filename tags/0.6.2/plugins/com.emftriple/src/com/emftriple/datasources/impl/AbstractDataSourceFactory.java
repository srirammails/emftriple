/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceFactory;


/**
 * {@link AbstractDataSourceFactory}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract class AbstractDataSourceFactory implements DataSourceFactory {
	
	protected boolean isCreated = false;
	
	protected AbstractDataSourceFactory() {
	}

	@SuppressWarnings("unchecked")
	public static <T extends DataSource> T create(Class<? extends DataSource> dataSourceClass, Object param) {
		Constructor<? extends DataSource> constructor = null;
		T dataSource = null;
		try {
			constructor = dataSourceClass.getConstructor( param.getClass() );
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		}
		if (constructor != null) {
			try {
				dataSource = (T) constructor.newInstance(param);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return dataSource;
	}
}
