/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.SparqlQueries.selectAllTypes;
import static com.google.common.base.Preconditions.checkArgument;
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
import com.emftriple.IMapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IMutableDataSource;
import com.emftriple.datasources.IQueryFactory;
import com.emftriple.datasources.ITransactionEnableDataSource;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;
import com.emftriple.transform.IPutObject;
import com.emftriple.transform.impl.GetEObjectImpl;
import com.emftriple.transform.impl.GetProxyObjectImpl;
import com.emftriple.transform.impl.PutObjectImpl;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.SparqlQueries;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * DataSourceManagerImpl
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class EntityDataSourceManagerImpl extends EntityManagerDelegateImpl implements IEntityDataSourceManager {

	private final IQueryFactory queryFactory;

	protected IGetObject get;

	protected IPutObject put;

	private GetProxyObjectImpl proxyFactory;

	@Inject
	EntityDataSourceManagerImpl(ResourceManager manager, IMapping mapping, @Named("DataSources") Federation dataSources, IQueryFactory queryFactory) {
		super(manager, mapping, dataSources);

		this.queryFactory = queryFactory;
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, this);
		this.get = new GetEObjectImpl(manager, mapping, this);
		this.put = new PutObjectImpl(mapping, this); 
	}

	@Override
	protected IPutObject put() {
		return put;
	}

	@Override
	protected IGetObject get() {
		return get;
	}

	protected <T> void isMappedClass(Class<T> aClass) {
		if (!mapping.isMappedClass(aClass)) {
			throw new IllegalArgumentException(aClass.getName() + " is not an entity.");
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public <T> T find(Class<T> aClass, URI key) throws IllegalArgumentException {
		isMappedClass(aClass);

		T object = (T) getByKey(key);

		if (object != null && !((EObject)object).eIsProxy()) {
			return object;
		}

		return get().get(aClass, key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getReference(Class<T> aClass, URI key) {
		isMappedClass(aClass);

		T object = (T) getByKey(key);

		if (object != null) {
			return object;
		}

		return proxyFactory.get(aClass, key);
	}

	@Override
	public Object refresh(Class<? extends Object> aClass, URI id) {
		isMappedClass(aClass);

		Object obj = get().get(aClass, id);

		return obj;
	}

	@Override
	public Object findNode(URI node) {
		final URI uri = node;
		
		final List<String> types = selectAllTypes(this, node);
		if (types.isEmpty()) {
			return null;
		}

		final EClass eClass = mapping.findEClassByRdfType( types );
		if (eClass == null) {
			return null;
		}

		return find( eClass.getInstanceClass(), uri );
	}

	@Override
	public List<?> findNodes(List<Node> nodes) {
		final List<Object> list = Lists.newArrayList();
		for (Node node: nodes) 
		{
			list.add( findNode( URI.createURI(((URIElement) node).getURI())) );
		}
		return list;
	}

	@Override
	public void saveAll(Collection<EObject> list) {
		checkNotNull(list);

		for (final EObject object: list)
		{
			final List<EObject> currents = Lists.newArrayList(object.eAllContents());
			final RDFGraph graph = getGraph(null);
			put().put(object, graph);

			for (EObject obj: currents) 
				put().put(obj, graph);

			final IDataSource dataSource = getDefaultDataSource(); // DataSource By NamedGraph
			if (dataSource instanceof IMutableDataSource)
			{
				if (!graph.getTriples().isEmpty())
				{
					((IMutableDataSource) dataSource).add(graph);
				}
			}
		}
	}

	@Override
	public void save(final EObject obj) {
		checkNotNull(obj);

		final String dataSetName = EntityUtil.getDataSet(obj.eClass());

		if (dataSetName != null) {
			saveInDataSource(getDataSource(dataSetName), obj);
		} else {
			saveInDataSource(getDefaultDataSource(), obj);
		}

	}

	private void saveInDataSource(IDataSource dataSource, EObject obj) {
		checkArgument(dataSource instanceof IMutableDataSource);

		final URI graphURI = EntityUtil.getNamedGraph(obj.eClass());
		final RDFGraph graph = put().put(obj, getGraph(graphURI));

		if (!graph.getTriples().isEmpty())
		{
			((IMutableDataSource) dataSource).add(graph);
		}
	}

	@Override
	protected int lastIndexOf(EClass eClass) {
		return SparqlQueries.countObjectsByType(getDefaultDataSource(), eClass);
	}

//	private static URI getURI(Object key) {
//		if (key instanceof String) 
//		{
//			return URI.createURI((String) key);
//		} 
//		else if (key instanceof URI) 
//		{
//			return (URI)key;
//		}
//		else if (key instanceof URIElement) {
//			return URI.createURI( ((URIElement) key).getURI() );
//		}
//
//		return null;
//	}

	@Override
	public void delete(EObject object) {
		if (object instanceof RDFGraph) 
		{
			remove((RDFGraph)object);
		} 
		else if (getDefaultDataSource() instanceof IMutableDataSource) 
		{
			final RDFGraph graph = getGraph(null);

			final RDFGraph subjectGraph = put.put((EObject) object, graph);
			if (subjectGraph != null) 
			{
				((IMutableDataSource)getDefaultDataSource()).remove(subjectGraph);
			}

			final String id = id(object).toString();
			final RDFGraph objectGraph = ((IMutableDataSource)getDefaultDataSource()).constructQuery(
					"CONSTRUCT {?s ?p <" + id + ">} WHERE {?s ?p <" + id + ">}");

			final IMutableDataSource dataSource = (IMutableDataSource) getDefaultDataSource();
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
	public IQueryFactory getQueryFactory() {
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
			return new ETripleEntityTransaction((ITransactionEnableDataSource) getDefaultDataSource());
		}
	}

}
