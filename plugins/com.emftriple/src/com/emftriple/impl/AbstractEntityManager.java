/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import static com.emftriple.util.EntityUtil.checkState;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.Metamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emftriple.IMapping;
import com.emftriple.criteria.CriteriaBuilderImpl;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IEntityDataSourceManager;

/**
 * The {@link AbstractEntityManager} class implements {@link EntityManager}.
 * 
 * @see EObjectEntityManager
 * @see EStoreEntityManager
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract class AbstractEntityManager implements EntityManager {

	private static final Map<String, Object> properties = null;

	protected final IEntityDataSourceManager dataSourceManager;
	
	protected final IMapping mapping;

	protected EntityTransaction transaction;
	
	protected boolean isOpen = true;
	
	private final EntityManagerFactory emf;
	
	AbstractEntityManager(EntityManagerFactory emf, IEntityDataSourceManager dataSourceManager, IMapping mapping) {
		this.emf = emf;
		this.dataSourceManager = dataSourceManager;
		this.mapping = mapping;
	}
	
	@Override
	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	
	/**
	 * Remove the entity instance.
	 * 
	 * @param entity
	 * 
	 * @throws IllegalArgumentException if the instance is not an
	 * entity or is a detached entity
	 * @throws TransactionRequiredException if invoked on a
	 * container-managed entity manager of type
	 * PersistenceContextType.TRANSACTION and there is
	 * no transaction
	 */
	@Override public void remove(Object object) throws TransactionRequiredException, IllegalArgumentException {
		checkIsOpen();
		checkState(object);
		
		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not active");
		}

		getDelegate().remove((EObject) object);
	}

	/**
	 * Synchronize the persistence context to the underlying database.
	 * 
	 * @throws TransactionRequiredException if there is
	 * no transaction
	 * @throws PersistenceException if the flush fails
	 */
	@Override public void flush() throws TransactionRequiredException, PersistenceException {
		checkIsOpen();

		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not active");
		}
		
		try {
			getDelegate().flush();
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}
	
	/**
	* Clear the persistence context, causing all managed
	* entities to become detached. Changes made to entities that
	* have not been flushed to the database will not be
	* persisted.
	*/
	@Override public void clear() {
		checkIsOpen();

		getDelegate().clear();
	}
	
	/**
	* Remove the given entity from the persistence context, causing
	* a managed entity to become detached. Unflushed changes made
	* to the entity if any (including removal of the entity),
	* will not be synchronized to the database. Entities which
	* previously referenced the detached entity will continue to
	* reference it.
	* 
	* @param entity
	* 
	* @throws IllegalArgumentException if the instance is not an
	* entity
	*/
	@Override public void detach(Object entity) {
		checkState(entity);
		
		getDelegate().detach((EObject) entity);
	}
	
	/**
	* Check if the instance is a managed entity instance belonging
	* to the current persistence context.
	* 
	* @param entity
	* 
	* @return boolean indicating if entity is in persistence context
	* 
	* @throws IllegalArgumentException if not an entity
	*/
	@Override public boolean contains(Object entity) throws IllegalArgumentException {
		checkState(entity);

		return getDelegate().contains((EObject) entity); 
	}
	
	@Override public FlushModeType getFlushMode() {
		return FlushModeType.AUTO;
	}

	/**
	 * @inheritDoc
	 */
	@Override public void setFlushMode(FlushModeType flushModeType) {
		checkIsOpen();

		if (flushModeType != FlushModeType.AUTO) {
			throw new UnsupportedOperationException("Only AUTO Flush mode is supported");	
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override public void close() {
		checkIsOpen();

		clear();
		dataSourceManager.disconnect();
		isOpen = false;
	}

	/**
	 * @inheritDoc
	 */
	@Override public Query createQuery(String queryString) {
		return dataSourceManager.getQueryFactory().createQuery(queryString);
	}

	/**
	 * @inheritDoc
	 */
	@Override public CriteriaBuilder getCriteriaBuilder() {
		return new CriteriaBuilderImpl();
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public <T> TypedQuery<T> createQuery(CriteriaQuery<T> arg0) {
		return getDelegate().getQueryFactory().createCriteriaQuery(arg0);
	}

	/**
	 * @inheritDoc
	 */
	@Override public <T> TypedQuery<T> createQuery(String arg0, Class<T> arg1) {
		return getDelegate().getQueryFactory().createTypedQuery(arg0, arg1);
	}

	/**
	 * @inheritDoc
	 */
	@Override public Query createNamedQuery(String query) {
		return getDelegate().getQueryFactory().createNamedQuery(query);
	}

	/**
	 * @inheritDoc
	 */
	@Override public Query createNativeQuery(String queryString) {
		return getDelegate().getQueryFactory().createNativeQuery(queryString);
	}

	/**
	 * @inheritDoc
	 */
	@SuppressWarnings("unchecked")
	@Override public Query createNativeQuery(String queryString, @SuppressWarnings("rawtypes") Class aClass) {
		return getDelegate().getQueryFactory().createNativeQuery(queryString, aClass);
	}

	/**
	 * @inheritDoc
	 */
	@Override public Query createNativeQuery(String queryString, String arg1) {
		return getDelegate().getQueryFactory().createNativeQuery(queryString);
	}

	/**
	 * @inheritDoc
	 */
	@Override public <T> TypedQuery<T> createNamedQuery(String arg0, Class<T> arg1) {
		return getDelegate().getQueryFactory().createNamedTypedQuery(arg0, arg1);
	}

	/**
	 * @inheritDoc
	 */
	@Override public void joinTransaction() {
		//	TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public Metamodel getMetamodel() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public IMapping getMapping() {
		return mapping;
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public void setProperty(String arg0, Object arg1) {
		properties.put(arg0, arg1);
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public Map<String, Object> getProperties() {
		return properties;
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public IEntityDataSourceManager getDelegate() {
		return dataSourceManager;
	}
	
	/**
	 * @inheritDoc
	 */
	@Override public EntityTransaction getTransaction() {
		if (transaction == null) {
			transaction = getDelegate().getTransaction();
		}
		
		return transaction;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public boolean isOpen() {
		return isOpen ;
	}
	
	protected boolean needTransaction(IDataSource dataSource) {
		return dataSource.supportsTransaction();
	}
	
	protected void checkIsOpen() {
		if (!isOpen) {
			throw new IllegalStateException("EntityManager is not open.");
		}		
	}
		
	protected void checkContains(EObject object) {
		if (!object.eIsProxy() && !contains(object)) {
			throw new IllegalArgumentException("Object is not part of Persistence Context.");
		}
	}
	
	protected void checkHasOWLClassAnnotation(Class<?> aClass) {
		EClass eClass = mapping.getEClass( aClass );
		if (eClass == null) {
			throw new IllegalArgumentException("Class " + aClass + " is not an Entity class.");
		}
		if (eClass.getEAnnotation("No") != null) {
			throw new IllegalArgumentException("Class " + aClass + " is not an Entity.");
		}
	}
		
}
