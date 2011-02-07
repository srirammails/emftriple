/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import javax.persistence.EntityTransaction;

/**
 * The {@link TransactionProvider} interface represents objects that can provide a transaction.
 * 
 * @see EntityDataSourceManager
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public interface TransactionProvider {

	/**
	 * Returns a transaction.
	 * 
	 * @return transaction
	 */
	EntityTransaction getTransaction();
	
}
