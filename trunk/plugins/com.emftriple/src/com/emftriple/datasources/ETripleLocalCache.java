package com.emftriple.datasources;

import javax.persistence.Cache;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.1
 */
public interface ETripleLocalCache extends Cache {
	
	EObject get(Object primaryKey);
	
	String getKey(EObject object);
	
	boolean contains(URI key);
	
	boolean contains(EClass eClass, URI key);
	
	void evict(URI key);
	
	void addToCache(Object primaryKey, EObject object);
	
	void setAsDelete(Object primaryKey);
	
	void setAsSave(Object primaryKey);
	
	void clearAfterPersist();
	
}
