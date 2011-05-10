/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import com.emftriple.datasources.IDataSource;


/**
 * {@link AbstractDataSource}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract class AbstractDataSource implements IDataSource {
	
	protected final String name;

	private boolean isConnected = false;
	
	protected AbstractDataSource(String name) {
		this.name = name;
	}
	
	protected void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
		
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public abstract void connect();
	
	@Override
	public abstract void disconnect();
	
	@Override
	public boolean isConnected() {
		return isConnected;
	};
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends IDataSource> T as(Class<T> aClass) throws ClassCastException{
		if (aClass.isInstance(this)) {
			return (T) this;
		}
		else throw new ClassCastException("Cannot cast " + this + " as " + aClass);
	}
}
