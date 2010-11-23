/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.impl;

import static com.emftriple.util.EntityUtil.URI;
import static com.emftriple.util.EntityUtil.checkIsSupported;
import static com.emftriple.util.EntityUtil.checkState;
import static com.emftriple.util.Functions.transform;

import java.util.Map;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.LockModeType;
import javax.persistence.LockTimeoutException;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import javax.persistence.PessimisticLockException;
import javax.persistence.TransactionRequiredException;
import javax.persistence.criteria.CriteriaBuilder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.Mapping;
import com.emftriple.criteria.CriteriaBuilderImpl;
import com.emftriple.datasources.DataSourceException;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.impl.ETripleEntityTransaction;
import com.emftriple.query.transform.Describe;
import com.emftriple.resource.ETripleResource;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.EntityUtil.ID;

/**
 * 
 * Implementation of {@link EntityManager}
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 * @version 0.6.1
 * @see EntityManager
 */
public class EObjectEntityManager extends AbstractEntityManager implements EntityManager {

	EObjectEntityManager(EntityManagerFactory emf, EntityDataSourceManager dataSourceManager, Mapping mapping) {
		super(emf, dataSourceManager, mapping);
		this.isOpen = true;
	}

	/**
	 * Make an instance managed and persistent.
	 * 
	 * @param entity
	 * 
	 * @throws EntityExistsException if the entity already exists.
	 * @throws IllegalArgumentException if the instance is not an entity
	 * @throws TransactionRequiredException if invoked on a container-managed entity 
	 * manager of type PersistenceContextType.TRANSACTION and there is no transaction
	 */
	@Override public void persist(Object entity)
	throws EntityExistsException, TransactionRequiredException, IllegalArgumentException { 
		checkIsOpen();
		checkIsSupported(entity);

		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not open");
		}
		
		if (contains(entity)) {
			throw new EntityExistsException("Entity " + ID.getId(entity) + " already in persistence context");
		}

		getDelegate().persist(entity);
	}

	/**
	 * Merge the state of the given entity into the current persistence context.
	 * 
	 * @param entity
	 * @return the managed instance that the state was merged to
	 * 
	 * @throws IllegalArgumentException if instance is not an entity or is a removed entity
	 * @throws TransactionRequiredException if invoked on a container-managed entity manager of 
	 * type PersistenceContextType.TRANSACTION and there is no transaction
	 */
	@Override public <T> T merge(T entity) 
	throws TransactionRequiredException, IllegalArgumentException {
		checkIsOpen();
		checkState(entity);
		checkContains(entity);

		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not open");
		}
		
		final URI entityId = getDelegate().id( (EObject) entity );

		final RDFGraph existingData = getDelegate().executeDescribeQuery(transform(entityId, new Describe()));
		getDelegate().remove(existingData);

		getDelegate().persist(entity);

		return entity;
	}

	/**
	 * Find by primary key.
	 * Search for an entity of the specified class and primary key.
	 * If the entity instance is contained in the persistence context
	 * it is returned from there.
	 * 
	 * @param entityClass
	 * @param primaryKey
	 * 
	 * @return the found entity instance or null if the entity does not exist
	 * 
	 * @throws IllegalArgumentException if the first argument does
	 * not denote an entity type or the second argument is
	 * is not a valid type for that entity’s primary key or
	 * is null
	 */
	@SuppressWarnings("unchecked")
	@Override public <T> T find(Class<T> aClass, Object primarykey) throws IllegalArgumentException {
		checkIsOpen();
		checkHasOWLClassAnnotation(aClass);	

		T returnedObject = (T) getDelegate().get(primarykey);
		if (returnedObject == null) {
			try {
				returnedObject = (T) getDelegate().get(aClass, URI(primarykey));
			}
			catch (IllegalArgumentException e) {
				throw new IllegalArgumentException(e);
			}
			catch (DataSourceException e) {
				e.printStackTrace();
			}
		}

		return returnedObject;
	}

	/**
	 * Find by primary key, using the specified properties.
	 * Search for an entity of the specified class and primary key.
	 * If the entity instance is contained in the persistence context
	 * it is returned from there.
	 * If a vendor-specific property or hint is not recognized,
	 * it is silently ignored.
	 * 
	 * @param entityClass
	 * @param primaryKey
	 * 
	 * @param properties standard and vendor-specific properties
	 * and hints
	 * @return the found entity instance or null if the entity does
	 * not exist
	 * 
	 * @throws IllegalArgumentException if the first argument does
	 * not denote an entity type or the second argument is
	 * is not a valid type for that entity’s primary key or is null
	 */
	@Override public <T> T find(Class<T> aClass, Object primarykey, Map<String, Object> properties)
	throws IllegalArgumentException {
		return find(aClass, primarykey);
	}

	/**
	 * Find by primary key and lock.
	 * 
	 * Search for an entity of the specified class and primary key
	 * and lock it with respect to the specified lock type.
	 * If the entity instance is contained in the persistence context
	 * it is returned from there, and the effect of this method is
	 * the same as if the lock method had been called on the entity.
	 * If the entity is found within the persistence context and the
	 * lock mode type is pessimistic and the entity has a version
	 * attribute, the persistence provider must perform optimistic
	 * version checks when obtaining the database lock. If these
	 * checks fail, the OptimisticLockException will be thrown.
	 * If the lock mode type is pessimistic and the entity instance
	 * is found but cannot be locked:
	 * - the PessimisticLockException will be thrown if the database
	 * locking failure causes transaction-level rollback
	 * - the LockTimeoutException will be thrown if the database
	 * locking failure causes only statement-level rollback
	 * 
	 * @param entityClass
	 * @param primaryKey
	 * @param lockMode
	 * 
	 * @return the found entity instance or null if the entity does not exist
	 * 
	 * @throws IllegalArgumentException if the first argument does
	 * not denote an entity type or the second argument is
	 * not a valid type for that entity's primary key or
	 * is null
	 * @throws TransactionRequiredException if there is no
	 * transaction and a lock mode other than NONE is
	 * specified
	 * @throws OptimisticLockException if the optimistic version
	 * check fails
	 * @throws PessimisticLockException if pessimistic locking
	 * fails and the transaction is rolled back
	 * @throws LockTimeoutException if pessimistic locking fails and
	 * only the statement is rolled back
	 * @throws PersistenceException if an unsupported lock call
	 * is made
	 */
	@SuppressWarnings("unchecked")
	@Override public <T> T find(Class<T> aClass, Object primarykey, LockModeType lockType) {
		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not active");
		}
		
		Object obj = find(aClass, primarykey);
		
		if (obj == null)
			return null;
		
		lock(obj, lockType);
		
		return (T) obj;
	}

	/**
	 * Find by primary key and lock, using the specified properties.
	 * Search for an entity of the specified class and primary key
	 * and lock it with respect to the specified lock type.
	 * If the entity instance is contained in the persistence context
	 * it is returned from there. If the entity is found
	 * within the persistence context and the lock mode type
	 * is pessimistic and the entity has a version attribute, the
	 * persistence provider must perform optimistic version checks
	 * when obtaining the database lock. If these checks fail,
	 * the OptimisticLockException will be thrown.
	 * If the lock mode type is pessimistic and the entity instance
	 * is found but cannot be locked:
	 * - the PessimisticLockException will be thrown if the database
	 * locking failure causes transaction-level rollback
	 * - the LockTimeoutException will be thrown if the database
	 * locking failure causes only statement-level rollback
	 * If a vendor-specific property or hint is not recognized,
	 * it is silently ignored.
	 * Portable applications should not rely on the standard timeout
	 * hint. Depending on the database in use and the locking
	 * mechanisms used by the provider, the hint may or may not
	 * be observed.
	 * 
	 * @param entityClass
	 * @param primaryKey
	 * @param lockMode
	 * @param properties standard and vendor-specific properties
	 * and hints
	 * 
	 * @return the found entity instance or null if the entity does
	 * not exist
	 * 
	 * @throws IllegalArgumentException if the first argument does
	 * not denote an entity type or the second argument is
	 * not a valid type for that entity's primary key or
	 * is null
	 * @throws TransactionRequiredException if there is no
	 * transaction and a lock mode other than NONE is
	 * specified
	 * @throws OptimisticLockException if the optimistic version
	 * check fails
	 * @throws PessimisticLockException if pessimistic locking
	 * fails and the transaction is rolled back
	 * @throws LockTimeoutException if pessimistic locking fails and
	 * only the statement is rolled back
	 * @throws PersistenceException if an unsupported lock call
	 * is made
	 */
	@SuppressWarnings("unchecked")
	@Override public <T> T find(Class<T> aClass, Object primarykey, LockModeType lockType, Map<String, Object> properties) {
		if (!getTransaction().isActive()) {
			throw new TransactionRequiredException("Transaction is not active");
		}
		
		Object obj = find(aClass, primarykey);
		
		if (obj == null)
			return null;
		
		lock(obj, lockType);
		
		return (T) obj;
	}

	/**
	 * Get an instance, whose state may be lazily fetched.
	 * If the requested instance does not exist in the database,
	 * the EntityNotFoundException is thrown when the instance
	 * state is first accessed. (The persistence provider runtime is
	 * permitted to throw the EntityNotFoundException when
	 * getReference is called.)
	 * The application should not expect that the instance state will
	 * be available upon detachment, unless it was accessed by the
	 * application while the entity manager was open.
	 * 
	 * @param entityClass
	 * @param primaryKey
	 * 
	 * @return the found entity instance
	 * 
	 * @throws IllegalArgumentException if the first argument does
	 * not denote an entity type or the second argument is
	 * not a valid type for that entity’s primary key or
	 * is null
	 * @throws EntityNotFoundException if the entity state
	 * cannot be accessed
	 */
	@SuppressWarnings("unchecked")
	@Override public <T> T getReference(Class<T> aClass, Object primarykey) throws IllegalArgumentException, EntityNotFoundException {
		EClass eClass = mapping.getEClass(aClass);
		if (eClass == null) {
			throw new IllegalArgumentException();
		}
		
		final EFactory aFactory = eClass.getEPackage().getEFactoryInstance();
		final EObject proxyObject = aFactory.create(eClass);
		final URI uriFragment = getTransactionResource()
			.getURI().appendQuery("query=" + EntityUtil.URI(primarykey).toString());
		((InternalEObject)proxyObject).eSetProxyURI(uriFragment);
		
		// Add to current resource
		getTransactionResource().getContents().add(proxyObject);
		
		return (T) proxyObject;
	}

	/**
	 * Load the data for the object with the specified id into a newly created object.
	 * This is only called when lazily initializing a proxy.
	 * Do NOT return a proxy.
	 * 
	 * @param <T>
	 * @param aClass
	 * @param id
	 * @return
	 * 
	 * @throws IllegalArgumentException
	 * @throws RuntimeException
	 */
	public <T> T immediateLoad(Class<T> aClass, URI id) {
		try {
			return getDelegate().get(aClass, id);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Refresh the state of the instance from the database, overwriting changes made to the entity, if any.
	 * 
	 * @param entity
	 * 
	 * @throws IllegalArgumentException if the instance is not
	 * an entity or the entity is not managed
	 * @throws TransactionRequiredException if invoked on a
	 * container-managed entity manager of type
	 * PersistenceContextType.TRANSACTION and there is
	 * no transaction
	 * @throws EntityNotFoundException if the entity no longer exists in the database
	 */
	@Override public void refresh(Object entity) {
		checkIsOpen();
		checkState(entity);
		checkContains(entity);

		final Object persistedObject = 
			find(entity.getClass(), ID.getId((EObject) entity));

		if (persistedObject == null) {
			throw new EntityNotFoundException();
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override public void refresh(Object entity, Map<String, Object> properties) {
		refresh(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override public void refresh(Object entity, LockModeType lockType) {
		refresh(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override public void refresh(Object entity, LockModeType lockType, Map<String, Object> properties) {
		refresh(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override public void lock(Object arg0, LockModeType arg1) {
		// TODO
		throw new UnsupportedOperationException("lock is not supported");
	}

	/**
	 * @inheritDoc
	 */
	@Override public void lock(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();	
	}

	/**
	 * @inheritDoc
	 */
	@Override public LockModeType getLockMode(Object arg0) {
		if (!arg0.equals(LockModeType.NONE)) {
			throw new UnsupportedOperationException("Lock mode is not supported");	
		}
		return LockModeType.NONE;
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
	@Override public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	protected ETripleResource getTransactionResource() {
		return ((ETripleEntityTransaction) getTransaction()).getTransactionResource();
	}
}
