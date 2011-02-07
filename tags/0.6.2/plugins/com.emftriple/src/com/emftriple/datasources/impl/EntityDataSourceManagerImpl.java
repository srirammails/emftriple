/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.URI;
import static com.emftriple.util.EntityUtil.checkIsEntity;
import static com.emftriple.util.Functions.transform;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityTransaction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.URIElement;
import com.emftriple.Mapping;
import com.emftriple.config.persistence.DataSources;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.transform.Ask;
import com.emftriple.query.transform.CountObjectsByType;
import com.emftriple.query.transform.SelectTypes;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.transform.impl.GetProxyObjectImpl;
import com.emftriple.transform.impl.PutObjectImpl;
import com.emftriple.util.ETripleEcoreUtil;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.EntityUtil.ID;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * DataSourceManagerImpl
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class EntityDataSourceManagerImpl extends EntityManagerDelegateImpl implements EntityDataSourceManager {

	private final QueryFactory queryFactory;

	protected GetObject get;

	protected PutObject put;

	@Inject
	EntityDataSourceManagerImpl(Mapping mapping, @Named("DataSources") DataSources dataSources) {
		super(mapping, dataSources);

		this.queryFactory = new ETripleQueryFactory(this, mapping);
	}

	@Override
	protected PutObject put() {
		return new PutObjectImpl(mapping);
	}

	@Override
	protected GetObject get() {
		return new GetProxyObjectImpl(mapping, this);
	}

	@Override
	public Object get(Node node) {
		if (node instanceof URIElement) 
		{
			if (containsKey(((URIElement) node).getURI())) 
			{
				return getKey(((URIElement) node).getURI());
			}

			List<String> types = transform((URIElement)node, new SelectTypes(this));
			if (types.isEmpty()) 
			{
				return null;
			}

			EClass eClass = mapping.getEClassWithRdfType(types.get(0));
			if (eClass == null) 
			{
				return null;
			}

			return get( eClass.getInstanceClass(), URI(((URIElement)node).getURI()) );
		}

		return null;
	}

	@Override
	public List<?> get(List<Node> nodes) {
		List<Object> list = Lists.newArrayList();
		for (Node node: nodes) 
		{
			list.add( get(node) );
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> aClass, URI key) {
		T object = (T) getKey(key);

		if (object != null) {
			return object;
		}

		if (mapping.isMappedClass(aClass)) 
		{
			object = get().get(aClass, key);
		}

		return object;
	}

	@Override
	public void save(Collection<Object> list) {
		for (Object object: list) 
		{
			save(object);
		}
	}

	@Override
	public void save(Object obj) {
		checkNotNull(obj);

		final EObject object = (EObject) obj;
		final EClass eClass = object.eClass();
		final String graphURI = EntityUtil.getNamedGraph(eClass);
		final DataSource dataSource;

		if (graphURI != null) 
		{
			dataSource = getDataSourceByGraph(graphURI);
		} 
		else 
		{
			dataSource = getDefaultDataSource();
		}

		if (dataSource instanceof MutableDataSource)
		{
			final RDFGraph result = put().put((EObject)object, dataSource.getDefaultGraph());

			if (!result.getTriples().isEmpty())
			{
				((MutableDataSource) dataSource).add(result);
			}
		}
	}

	//	private DataSource resolveDataSourceByKey(EClass eClass, URI key) {
	//		for (DataSource dataSource: dataSources) 
	//		{			
	//			if (getRealClass(dataSource, eClass.getInstanceClass(), key) != null) 
	//			{
	//				return dataSource;
	//			}
	//		}
	//		return null;
	//	}

	protected <T> EClass getRealClass(DataSource dataSource, Class<T> aClass, Object key) {
		EClass theRealClass = null;
		boolean exist = false;
		try {
			exist = dataSource.askQuery( transform(getURI(key), new Ask(mapping.getEClass(aClass))) );
		} finally {
			SparqlBuilder.clear();
		}

		List<EClass> allSuperAndSub = 
			ETripleEcoreUtil.newListOf(mapping.getEClass(aClass).getEAllSuperTypes(), 
					ETripleEcoreUtil.getESubClasses(mapping.getEClass(aClass), mapping.getEClasses()));

		if (exist == Boolean.FALSE) 
		{
			for (EClass ac: allSuperAndSub) 
			{
				try {
					exist = dataSource.askQuery( transform(getURI(key), new Ask(ac)) );
					if (exist == Boolean.TRUE) 
					{
						return ac;
					}
				} finally {
					SparqlBuilder.clear();
				}
			}
		} 
		else 
		{
			theRealClass = mapping.getEClass(aClass);
		}

		return theRealClass;
	}

	@Override
	protected int lastIndexOf(EClass eClass) {
		return transform(eClass, new CountObjectsByType(getDefaultDataSource()));
	}

	private static URI getURI(Object key) {
		if (key instanceof String) 
		{
			return URI.createURI((String) key);
		} 
		else if (key instanceof URI) 
		{
			return (URI)key;
		}

		return null;
	}

	@Override
	public void remove(Object object) {
		checkIsEntity(object);

		if (object instanceof RDFGraph) 
		{
			remove((RDFGraph)object);
		} 
		else if (getDefaultDataSource() instanceof MutableDataSource) 
		{
			final RDFGraph subjectGraph = put.put((EObject) object, ID.getId((EObject) object));
			if (subjectGraph != null) 
			{
				((MutableDataSource)getDefaultDataSource()).remove(subjectGraph);
			}

			final String id = ID.getId(object).toString();
			final RDFGraph objectGraph = ((MutableDataSource)getDefaultDataSource()).constructQuery(
					SparqlBuilder.getConstructQuery("CONSTRUCT {?s ?p <" + id + ">} WHERE {?s ?p <" + id + ">}"));

			final MutableDataSource dataSource = (MutableDataSource) getDefaultDataSource();
			if (objectGraph != null) {
				dataSource.remove(objectGraph);	
			}
		} 
		else 
		{
			throw new UnsupportedOperationException("Cannot remove resources from non mutable data sources.");
		}
	}

	@Override
	public QueryFactory getQueryFactory() {
		return queryFactory;
	}

	@Override
	public EntityTransaction getTransaction() {
		if (!getDefaultDataSource().supportsTransaction()) 
		{
			return new ETripleEntityTransaction(new TransactionDataSource(getDefaultDataSource()));
		} 
		else 
		{
			return new ETripleEntityTransaction((TransactionEnableDataSource) getDefaultDataSource());
		}
	}

}
