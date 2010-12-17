package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.transform.impl.GetEStoreObjectImpl;
import com.emftriple.transform.impl.PutObjectImpl;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class EStoreDataSourceManagerImpl extends EntityDataSourceManagerImpl implements EntityDataSourceManager {

	private final EStore eStore;

	@Inject
	EStoreDataSourceManagerImpl(ResourceManager manager, Mapping mapping, @Named("DataSources") Federation dataSources, QueryFactory queryFactory, @Named("EStore") EStore eStore) {
		super(manager, mapping, dataSources, queryFactory);
		this.eStore = eStore;
	}

	@Override
	protected PutObject put() {
		if (put == null) {
			put = new PutObjectImpl(mapping, this);
		}
		return put;
	}
	
	@Override
	protected GetObject get() {
		if (get == null) {
			get = new GetEStoreObjectImpl(manager, mapping, this, eStore);
		}
		return get;
	}
}
