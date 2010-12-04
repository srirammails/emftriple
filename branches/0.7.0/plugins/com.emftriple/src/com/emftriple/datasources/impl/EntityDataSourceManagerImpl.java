/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.checkIsEntity;
import static com.emftriple.util.Functions.transform;
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
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.transform.Ask;
import com.emftriple.query.transform.CountObjectsByType;
import com.emftriple.query.transform.SelectTypes;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.transform.PutObject;
import com.emftriple.transform.impl.GetEObjectImpl;
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

	private GetProxyObjectImpl proxyFactory;

	@Inject
	EntityDataSourceManagerImpl(ResourceManager manager, Mapping mapping, @Named("DataSources") Federation dataSources) {
		super(manager, mapping, dataSources);

		this.queryFactory = new ETripleQueryFactory(this, mapping);
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, this);
	}

	@Override
	protected PutObject put() {
		return new PutObjectImpl(mapping);
	}

	@Override
	protected GetObject get() {
		return new GetEObjectImpl(manager, mapping, this);
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

			final List<String> types = transform((URIElement)node, new SelectTypes(this));
			if (types.isEmpty()) 
			{
				return null;
			}

			final EClass eClass = mapping.getEClassWithRdfType(types.get(0));
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
		List<Object> list = Lists.newArrayList();
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
			if (object instanceof EObject)
				put().put((EObject)object, graph);
		}
		
//		Resource res = new XMIResourceImpl(URI.createURI("src/out.xmi"));
//		res.getContents().add(graph);
//		try {
//			res.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
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
		
		final RDFGraph graph = RDFFactory.eINSTANCE.createDocumentGraph();
		final RDFResource aResource = new DummyRDFResource();
		aResource.getContents().add(graph);
		
		final EClass eClass = ((EObject) obj).eClass();
		final URI graphURI = EntityUtil.getNamedGraph(eClass);

		final DataSource dataSource;
		if (graphURI != null) 
		{
			dataSource = getDataSourceByGraph(graphURI);
		} 
		else 
		{
			dataSource = getDefaultDataSource();
		}

		put().put((EObject)obj, graph);
		
		if (dataSource instanceof MutableDataSource)
		{
			if (!graph.getTriples().isEmpty())
			{
				((MutableDataSource) dataSource).add(graph);
			}
		}
	}

//	private void doSave(EObject object, RDFGraph graph) {
//		final EClass eClass = object.eClass();
//		final URI graphURI = EntityUtil.getNamedGraph(eClass);
//
//		if (graphURI != null) 
//		{
//			dataSource = getDataSourceByGraph(graphURI);
//		} 
//		else 
//		{
//			dataSource = getDefaultDataSource();
//		}
//
//		put().put((EObject)object, graph);
//	}
	
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
