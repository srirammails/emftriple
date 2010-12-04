package com.emftriple.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleStore;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class EStoreEntityManager extends EObjectEntityManager implements EntityManager {

	private final ETripleStore eStore;

	public EStoreEntityManager(EntityManagerFactory emf, EntityDataSourceManager dataSourceManager, Mapping mapping, ETripleStore eStore) {
		super(emf, dataSourceManager, mapping);
		this.isOpen = true;
		this.eStore = eStore;
	}

	public EStore eStore() {
		return eStore;
	}

}
