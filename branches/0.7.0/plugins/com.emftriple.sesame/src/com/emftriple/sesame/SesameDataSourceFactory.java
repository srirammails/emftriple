/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.sesame;

import java.io.File;

import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.http.HTTPRepository;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.sail.memory.MemoryStore;
import org.openrdf.sail.nativerdf.NativeStore;

import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class SesameDataSourceFactory implements DataSourceFactory {
	
	public static final String SESAME_NATIVE_CLASS_NAME = SesameNative.class.getName();
	
	public static final String SESAME_MEM_CLASS_NAME = SesameMem.class.getName();
	
	public static final String SESAME_HTTP_CLASS_NAME = SesameHTTP.class.getName();

	SesameDataSourceFactory() {
		super();
	}
	
	@Override
	public boolean canCreate(DataSourceBuilder config) {
		if (!config.getFactory().equals(SesameDataSourceFactory.class.getName())) {
			return Boolean.FALSE;
		}
		if (config.getClass_().equals(SESAME_MEM_CLASS_NAME)) {
			return canCreateSesameMem(config);
		}
		else if (config.getClass_().equals(SESAME_NATIVE_CLASS_NAME)) {
			return canCreateSesameNative(config);
		}
		else if (config.getClass_().equals(SESAME_HTTP_CLASS_NAME)) {
			return canCreateHttpRepository(config);
		}
		return Boolean.FALSE;
	}

	private boolean canCreateSesameNative(DataSourceBuilder config) {
		return config.getName() != null && config.getUrl() != null;
	}

	private boolean canCreateSesameMem(DataSourceBuilder config) {
		return config.getName() != null;
	}

	private boolean canCreateHttpRepository(DataSourceBuilder config) {
		return config.getName() != null && config.getUrl() != null;
	}

	@Override
	public DataSource create(DataSourceBuilder config) {
		DataSource dataSource = null;
		if (config.getClass_().equals(SESAME_MEM_CLASS_NAME)) {
			dataSource = createSesameMem(config);
		}
		else if (config.getClass_().equals(SESAME_NATIVE_CLASS_NAME)) {
			dataSource = createSesameNative(config);
		}
		else if (config.getClass_().equals(SESAME_HTTP_CLASS_NAME)) {
			return createHttpRepository(config);
		}
		return dataSource;
	}

	private DataSource createSesameMem(DataSourceBuilder config) {
		final Repository repository;
		if (config.getUrl() == null) {
			repository = new SailRepository( new MemoryStore() );
		} else {
			File dataDir = new File(config.getUrl());
			repository = new SailRepository( new MemoryStore(dataDir) );
		}
		try {
			repository.initialize();
		} catch (RepositoryException e1) {
			e1.printStackTrace();
		}
		
		return new SesameMem(config.getName(), repository);
	}
	
	private DataSource createSesameNative(DataSourceBuilder config) {
		File dataDir = new File(config.getUrl());
		Repository repository = new SailRepository(new NativeStore(dataDir));
		try {
			repository.initialize();
		} catch (RepositoryException e1) {
			e1.printStackTrace();
		}
	
		return new SesameNative(config.getName(), repository);
	}
	
	private DataSource createHttpRepository(DataSourceBuilder config) {
		final Repository repository = new HTTPRepository(config.getUrl());
		try {
			repository.initialize();
		} catch (RepositoryException e1) {
			e1.printStackTrace();
		} 
		
		return new SesameHTTP(config.getUrl(), repository);
	}
	
}
