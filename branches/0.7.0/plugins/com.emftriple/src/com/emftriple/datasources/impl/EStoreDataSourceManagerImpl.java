package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.transform.impl.GetEStoreObjectImpl;
import com.emftriple.transform.impl.PutObjectImpl;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class EStoreDataSourceManagerImpl extends EntityDataSourceManagerImpl implements EntityDataSourceManager {

	private final EStore eStore;

	@Inject
	EStoreDataSourceManagerImpl(ResourceManager manager, Mapping mapping, @Named("DataSources") Federation dataSources, @Named("EStore") EStore eStore) {
		super(manager, mapping, dataSources);
		this.eStore = eStore;
	}

	@Override
	protected PutObject put() {
		if (put == null) {
			put = new PutObjectImpl(mapping);
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
