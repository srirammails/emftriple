/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class DataSourceConnectionException extends RuntimeException {

	public DataSourceConnectionException() {
		super();
	}
	
	public DataSourceConnectionException(Exception e) {
		super(e);
	}
	
	public DataSourceConnectionException(String message) {
		super(message);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7989921037243337077L;

}
