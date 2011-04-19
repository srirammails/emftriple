package com.emftriple.datasources;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.Node;
import com.emftriple.transform.IGetObject;

/**
 * The {@link IEntityDataSourceManager} interface represents the data source manager that will be used by the 
 * {@link EntityManager} interface. The {@link IEntityDataSourceManager} provides the set of methods that allow 
 * to store and load objects to the managed data sources.
 *  
 * 
 * @see IDataSourceManager
 * @see IEntityManagerDelegate
 * @see ITransactionProvider
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public interface IEntityDataSourceManager extends ITransactionProvider, IEntityManagerDelegate, IDataSourceManager {

	/**
	 * Return the object according to a URI.
	 * 
	 * The object class is given as an argument. The method first look up in the persistence context 
	 * to check if an object has already been added, according to the URI. If there is no object 
	 * in the persistence context, then the method call a {@link IGetObject} to load the object 
	 * from the set of data sources.
	 * 
	 * @param aClass - the object class
	 * @param key - the object key
	 * 
	 * @return the object or null
	 */
	<T> T find(Class<T> aClass, URI key);
	
	/**
	 * Return the proxy object
	 * 
	 */
	<T> T getReference(Class<T> aClass, URI key);
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	Object findNode(URI node);

	/**
	 * 
	 * @param subjects
	 * @return
	 */
	List<?> findNodes(List<Node> subjects);
	
	/**
	 * 
	 * @param object
	 */
	void save(EObject object);

	/**
	 * 
	 * @param object
	 */
	void saveAll(Collection<EObject> object);
	
	/**
	 * 
	 * @param aGraph
	 */
	void delete(EObject object);
	
	/**
	 * 
	 * @return
	 */
	IQueryFactory getQueryFactory();

	/**
	 * 
	 * Refresh the state of an object. 
	 * 
	 * @param class1
	 * @param id
	 * @return
	 */
	Object refresh(Class<? extends Object> aClass, URI id);

	/**
	 * 
	 * @param key
	 * @param eClass
	 * @return
	 */
	boolean entityExists(URI key, EClass eClass);
	
}
