/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * The {@link IEntityManagerDelegate} interface provides the set of methods to manage the life-cycle of 
 * objects part of the current persistence context.
 * 
 * @see IEntityDataSourceManager
 *  
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public interface IEntityManagerDelegate {
	
	/**
	 * Adds an Object to the persistence context
	 * 
	 * @param object added to persistence context
	 */
	void add(Object object);
	
	/**
	 * Adds an object and its key to the current persistence context
	 * 
	 * @param uri of the object 
	 * @param eObject to add to the persistence context
	 */
	void put(URI uri, EObject eObject);
	
	/**
	 * Test if the object is contained by the current persistence context
	 * 
	 * @param object
	 * @return true if the object is a persisted object in this context
	 */
	boolean contains(Object object);
	
	/**
	 * Adds an Object to the persistence context
	 * 
	 * @param object added to persistence context
	 */
	void persist(Object object);
	
	/**
	 * Removes the object from the current persistence context
	 * 
	 * @param object to remove
	 */
	void remove(Object object);
	
	/**
	 * Detach the object from the current persistence context
	 * 
	 * @param object to detach
	 */
	void detach(Object object);
	
	/**
	 * Returns the identifier of a persistent object
	 * 
	 * @param object is a persistent object
	 * @return uri of the object
	 */
	URI id(Object object);
	
	/**
	 * Clear the current persistence context
	 */
	void clear();
	
	/**
	 * Returns true if the persistence context contains an object having for 
	 * id the primary key
	 * 
	 * @param primaryKey corresponding to a persisted object
	 * @return true if primaryKey corresponds to a persisted object
	 */
	boolean containsKey(URI primaryKey);
	
	/**
	 * Returns the object corresponding to the primary key. The primary key 
	 * should be a {@link URI} or a {@link String}.
	 * 
	 * @param primarykey of a persisted object
	 * 
	 * @return the Object
	 */
	Object getByKey(URI primarykey);
	
	/**
	 * Flush the current persistence context to the corresponding {@link IDataSource}
	 * 
	 */
	void flush();
}
