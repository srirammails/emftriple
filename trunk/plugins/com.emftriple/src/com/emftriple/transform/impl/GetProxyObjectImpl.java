/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import static com.emftriple.transform.impl.GetUtil.getURI;
import static com.emftriple.transform.impl.GetUtil.getValue;
import static com.emftriple.util.Functions.transform;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.proxy.ObjectProxyFactory;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.transform.Describe;
import com.emftriple.transform.GetObject;
import com.emftriple.util.Functions;
import com.emftriple.validation.TypeResolver;
import com.google.common.collect.Lists;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetProxyObjectImpl extends AbstractGetObject implements GetObject {

	public GetProxyObjectImpl(Mapping mapping, EntityDataSourceManager dataSourceManager) {
		super(mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, URI key) {
		final RDFGraph aGraph = getGraph(entityClass, key);
		final EClass aClass = Functions.transform(key, new TypeResolver(entityClass, mapping, aGraph));

		T object = (T) process( aClass, aGraph.getResource(key.toString()) );

		return object;
	}

	/**
	 * Returns a real instance from a RDF Resource.
	 * @param aClass 
	 * @param from the rdf resource
	 * @param dataSource 
	 * @return the corresponding {@link EObject}
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private EObject process(EClass aClass, Resource from) {
		if (aClass == null) 
		{
			return null;
		}

		final EObject returnedObject = EcoreUtil.create(aClass);
		for (EAttribute attribute: aClass.getEAllAttributes()) 
		{
			loadAttributeValue(from, returnedObject, attribute);
		}
		
		dataSourceManager.put(URI.createURI(from.getURI()), returnedObject);

		final Map<EReference, Object> values = new HashMap<EReference, Object>();
		for (EReference reference: aClass.getEAllReferences()) 
		{
			if (reference.isMany()) 
			{
				List<Object> proxies = getProxyValues(from, returnedObject, reference);
				if (!proxies.isEmpty()) 
				{
					values.put(reference, new BasicEList(proxies));
				}
			} 
			else 
			{
				Object proxy = getProxyValue(from, returnedObject, reference);
				if (proxy != null) 
				{
					values.put(reference, proxy);
				}
			}
		}

		for (EReference reference: values.keySet()) 
		{
			if (reference.isMany()) 
			{
				List<EObject> list = (List<EObject>)values.get(reference);
				if (list != null) 
				{
					returnedObject.eSet(reference, list);
				}
			} 
			else 
			{
				returnedObject.eSet(reference, values.get(reference));
			}
		}

		return returnedObject;
	}

	private List<Object> getProxyValues(Resource resource, EObject theLoadedObject, EReference reference) {
		final List<Object> ret = Lists.newLinkedList();
		final EList<Node> values = getValues(resource, reference);
		
		if (values != null) 
		{
			for (Node node: values) 
			{
				final Object proxy = createProxy(node, reference);
				if (proxy != null) 
				{
					ret.add(proxy);
				}
			}
		}
		
		return ret;
	}

	private Object getProxyValue(Resource resource, EObject theLoadedObject, EReference reference) {
		Object ret = null;
		final EList<Node> values = getValues(resource, reference);
		
		if (values != null && !values.isEmpty()) 
		{
			ret = createProxy(values.get(0), reference);
		}
		
		return ret;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void loadAttributeValue(Resource resource, EObject theLoadedObject, EAttribute attribute) {
		final EList<Node> values = getValues(resource, attribute); 

		if (attribute.isMany()) 
		{
			for (Node value: values) 
			{
				final String aStringValue = getValue(value);
				if (aStringValue != null) 
				{
					final Object aObjectValue = DatatypeConverter.convert((EDataType) attribute.getEType(), aStringValue);
					if (aObjectValue != null) 
					{
						final Object val = theLoadedObject.eGet(attribute);
						if (EList.class.isInstance(val)) 
						{
							((EList)val).add(aObjectValue);
						}
					}
				}
			}
		} 
		else 
		{
			if (!values.isEmpty()) 
			{
				final String aStringValue = getValue(values.get(0));
				if (aStringValue != null) 
				{
					final Object aObjectValue = DatatypeConverter.convert((EDataType) attribute.getEType(), aStringValue);
					if (aObjectValue != null) 
					{
						theLoadedObject.eSet(attribute, aObjectValue);
					}
				}
			}
		}
	}

	private Object createProxy(Node node, EReference reference) {
		Object proxy =  dataSourceManager.get(node);

		if (proxy == null) 
		{

			final EClass nodeClass = getClass(getURI(node), (EClass)reference.getEType());
			proxy = createProxy(nodeClass, getURI(node));
			
			if (proxy != null) 
			{
				dataSourceManager.put(getURI(node), (EObject) proxy);
			}
		}
		
		return proxy;
	}

	private Object createProxy(EClass nodeClass, URI key) {
		checkNotNull(nodeClass);

		Object proxy = null;
		try {
			proxy = ObjectProxyFactory.createProxy(
					nodeClass.getInstanceClass(), 
					nodeClass,
					null,
					key,
					dataSourceManager);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return proxy;
	}

	private EClass getClass(URI key, EClass eType) {
		checkNotNull(eType);

		final DescribeQuery aQuery = transform(key, new Describe());
		final RDFGraph aGraph = dataSourceManager.executeDescribeQuery(aQuery);

		return transform(key, new TypeResolver(eType.getInstanceClass(), mapping, aGraph));
	}

	private EList<Node> getValues(Resource resource, EStructuralFeature feature) {
		checkNotNull(resource);

		final URI propertyURI = mapping.getRdfType(feature);

		return propertyURI == null ? null : resource.getValues(propertyURI.toString());
	}

}
