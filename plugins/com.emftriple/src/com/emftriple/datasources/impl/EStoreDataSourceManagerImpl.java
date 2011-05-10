package com.emftriple.datasources.impl;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.IMapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IQueryFactory;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;
import com.emftriple.transform.IPutObject;
import com.emftriple.transform.impl.GetEStoreObjectImpl;
import com.emftriple.transform.impl.PutObjectImpl;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class EStoreDataSourceManagerImpl extends EntityDataSourceManagerImpl implements IEntityDataSourceManager {

	private final EStore eStore;

	@Inject
	EStoreDataSourceManagerImpl(ResourceManager manager, IMapping mapping, @Named("DataSources") Federation dataSources, IQueryFactory queryFactory, @Named("EStore") EStore eStore) {
		super(manager, mapping, dataSources, queryFactory);
		this.eStore = eStore;
	}

	@Override
	protected IPutObject put() {
		if (put == null) {
			put = new PutObjectImpl(mapping, this);
		}
		return put;
	}
	
	@Override
	protected IGetObject get() {
		if (get == null) {
			get = new GetEStoreObjectImpl(manager, mapping, this, eStore);
		}
		return get;
	}
}
