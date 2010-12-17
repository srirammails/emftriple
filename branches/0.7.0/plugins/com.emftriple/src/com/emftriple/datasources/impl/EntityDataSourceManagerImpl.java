/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.checkIsEntity;
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
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl.DummyRDFResource;
import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.datasources.TransactionEnableDataSource;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
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
public class EntityDataSourceManagerImpl extends EntityManagerDelegateImpl implements EntityDataSourceManager {

	private final QueryFactory queryFactory;

	protected GetObject get;

	protected PutObject put;

	private GetProxyObjectImpl proxyFactory;

	@Inject
	EntityDataSourceManagerImpl(ResourceManager manager, Mapping mapping, @Named("DataSources") Federation dataSources, QueryFactory queryFactory) {
		super(manager, mapping, dataSources);

		this.queryFactory = queryFactory;
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, this);
		this.get = new GetEObjectImpl(manager, mapping, this);
		this.put = new PutObjectImpl(mapping, this); 
	}

	@Override
	protected PutObject put() {
		return put;
	}

	@Override
	protected GetObject get() {
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

		object = get().get(aClass, key);	

		if (object != null) {
			add((EObject) object);
		}

		return object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getReference(Class<T> aClass, URI key) {
		isMappedClass(aClass);

		T object = (T) getByKey(key);

		if (object != null) {
			return object;
		}

		object = proxyFactory.get(aClass, key);
		put(key, (EObject) object);

		return object;
	}

	@Override
	public Object refresh(Class<? extends Object> aClass, URI id) {
		isMappedClass(aClass);

		Object obj = get().get(aClass, id);

		return obj;
	}

	@Override
	public Object findNode(Node node) {
		if (node instanceof URIElement)
		{
			URI uri = getURI(node);

			if (containsKey(uri)) {
				EObject object = getByKey(uri);
				return object;
			}
			
			final List<String> types = selectAllTypes(this, (URIElement)node);
			if (types.isEmpty()) 
			{
				return null;
			}

			final EClass eClass = mapping.findEClassByRdfType( types );
			if (eClass == null)
			{
				return null;
			}

			return find( eClass.getInstanceClass(), uri);
		}

		return null;
	}

	@Override
	public List<?> findNodes(List<Node> nodes) {
		final List<Object> list = Lists.newArrayList();
		for (Node node: nodes) 
		{
			list.add( findNode(node) );
		}
		return list;
	}

	@Override
	public void saveAll(Collection<Object> list) {
		checkNotNull(list);
		checkArgument(!list.isEmpty());

		final RDFGraph graph = RDFFactory.eINSTANCE.createDocumentGraph();
		final RDFResource aResource = new DummyRDFResource();
		aResource.getContents().add(graph);

		for (Object object: list)
		{
			if (object instanceof EObject) {
				put().put((EObject)object, graph);
			}
		}

		final DataSource dataSource = getDefaultDataSource();
		if (dataSource instanceof MutableDataSource)
		{
			if (!graph.getTriples().isEmpty())
			{
				((MutableDataSource) dataSource).add(graph);
			}
		}
	}

	@Override
	public void save(Object obj) {
		checkNotNull(obj);
		checkArgument(obj instanceof EObject);

		final EClass eClass = ((EObject) obj).eClass();
		final String dataSetName = EntityUtil.getDataSet(eClass);
		final DataSource dataSource;
		
		if (dataSetName != null) {
			dataSource = getDataSource(dataSetName);
		} else {
			dataSource = getDefaultDataSource();
		}

		final URI graphURI = EntityUtil.getNamedGraph(eClass);
		
		final RDFGraph graph;
		if (graphURI != null) {
			graph = RDFFactory.eINSTANCE.createNamedGraph();
			graph.setURI(graphURI.toString());
		} else {
			graph = RDFFactory.eINSTANCE.createDocumentGraph();
		}
		
		final RDFResource aResource = new DummyRDFResource();
		aResource.getContents().add(graph);
		
		put().put((EObject)obj, graph);

		if (dataSource instanceof MutableDataSource)
		{
			if (!graph.getTriples().isEmpty())
			{
				((MutableDataSource) dataSource).add(graph);
			}
		}
	}

	@Override
	protected int lastIndexOf(EClass eClass) {
		return SparqlQueries.countObjectsByType(getDefaultDataSource(), eClass);
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
		else if (key instanceof URIElement) {
			return URI.createURI( ((URIElement) key).getURI() );
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
			final RDFGraph graph = RDFFactory.eINSTANCE.createDocumentGraph();
			final RDFResource aResource = new DummyRDFResource();
			aResource.getContents().add(graph);

			final RDFGraph subjectGraph = put.put((EObject) object, graph);
			if (subjectGraph != null) 
			{
				((MutableDataSource)getDefaultDataSource()).remove(subjectGraph);
			}

			final String id = id(object).toString();
			final RDFGraph objectGraph = ((MutableDataSource)getDefaultDataSource()).constructQuery(
					"CONSTRUCT {?s ?p <" + id + ">} WHERE {?s ?p <" + id + ">}");

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
