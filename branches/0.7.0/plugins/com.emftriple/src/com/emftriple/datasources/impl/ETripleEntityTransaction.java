/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;

import com.emftriple.datasources.TransactionEnableDataSource;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ETripleEntityTransaction implements EntityTransaction {
	
	private final TransactionEnableDataSource dataSource;

	private boolean isActive = false;

	private boolean isRollBackOnly = false;
	
	ETripleEntityTransaction(TransactionEnableDataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void begin() {
		checkIsInActive();
		isActive = true;
		
		try {
			dataSource.begin();	
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public void commit() {
		if (getRollbackOnly()) {
			throw new RollbackException("Transaction is rollback only, commit cannot be executed.");
		}
		try {
			dataSource.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			isActive = false;
		}
	}

	@Override
	public boolean getRollbackOnly() {
		checkIsActive();
		
		return isRollBackOnly ;
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void rollback() {
		checkIsActive();

		try {
			dataSource.rollback();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			isActive = false;
		}
	}

	@Override
	public void setRollbackOnly() {
		checkIsActive();
		
		isRollBackOnly = true;
	}

	private void checkIsInActive() {
		if (isActive) {
			throw new IllegalStateException("Transaction is already active.");
		}
	}

	private void checkIsActive() {
		if (!isActive) {
			throw new IllegalStateException("Transaction is not active.");
		}
	}
}