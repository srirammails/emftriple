package com.emftriple.datasources;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Node;
import com.emftriple.transform.GetObject;

/**
 * The {@link EntityDataSourceManager} interface represents the data source manager that will be used by the 
 * {@link EntityManager} interface. The {@link EntityDataSourceManager} provides the set of methods that allow 
 * to store and load objects to the managed data sources.
 *  
 * 
 * @see DataSourceManager
 * @see EntityManagerDelegate
 * @see TransactionProvider
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public interface EntityDataSourceManager extends TransactionProvider, EntityManagerDelegate, DataSourceManager {

	/**
	 * Return the object according to a URI.
	 * 
	 * The object class is given as an argument. The method first look up in the persistence context 
	 * to check if an object has already been added, according to the URI. If there is no object 
	 * in the persistence context, then the method call a {@link GetObject} to load the object 
	 * from the set of data sources.
	 * 
	 * @param aClass - the object class
	 * @param key - the object key
	 * 
	 * @return the object or null
	 */
	<T> T get(Class<T> aClass, URI key);
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	Object get(Node node, boolean getProxy);

	/**
	 * 
	 * @param subjects
	 * @return
	 */
	List<?> get(List<Node> nodes, boolean getProxies);
	
	/**
	 * 
	 * @param object
	 */
	void save(Object object);

	/**
	 * 
	 * @param object
	 */
	void save(Collection<Object> object);
	
	/**
	 * 
	 * @param aGraph
	 */
	void remove(Object object);
	
	/**
	 * 
	 * @return
	 */
	QueryFactory getQueryFactory();
	
}
