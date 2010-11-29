package com.emftriple.transform.impl;

import static com.emftriple.transform.impl.GetUtil.getURI;
import static com.emftriple.transform.impl.GetUtil.getValue;
import static com.emftriple.util.Functions.transform;
import static com.google.common.base.Preconditions.checkNotNull;

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
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.transform.Describe;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.util.Functions;
import com.emftriple.validation.TypeResolver;

public class GetEObjectImpl extends AbstractGetObject implements GetObject {

	private final GetProxyObjectImpl proxyFactory;
	
	public GetEObjectImpl(ResourceManager manager, Mapping mapping, EntityDataSourceManager dataSourceManager) {
		super(manager, mapping, dataSourceManager);
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, URI key) {
		final RDFGraph aGraph = getGraph(entityClass, key);
		final EClass aClass = Functions.transform(key, new TypeResolver(entityClass, mapping, aGraph));

		T object = (T) process( aClass, aGraph.getResource(key.toString()) );

		return object;
	}

	@Override
	public EObject get(EClass eClass, URI key) {
		final RDFGraph aGraph = getGraph(eClass, key);
		
		return process( eClass, aGraph.getResource(key.toString()) );
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

		for (EReference reference: aClass.getEAllReferences())
		{
			if (reference.isMany()) 
			{
				EList<EObject> list =
					new BasicEList<EObject>();
//					new EObjectResolvingEList(
//							returnedObject.eClass().getInstanceClass(), 
//							(InternalEObject) returnedObject, 
//							reference.getFeatureID());
				
				getProxyValues(from, reference, list);
				
				returnedObject.eSet(reference, list);
			} 
			else 
			{
				Object proxy = getProxyValue(from, returnedObject, reference);
				if (proxy != null) 
				{
					returnedObject.eSet(reference, proxy);
				}
			}
		}

		return returnedObject;
	}

	private void getProxyValues(Resource resource, EReference reference, EList<EObject> list) {
		final EList<Node> values = getValues(resource, reference);
		
		if (values != null) 
		{
			for (Node node: values)
			{
				list.add( doProxy((Resource) node, (EClass) reference.getEType()) );
			}
		}
	}

	private EObject doProxy(Resource node, EClass eType) {
		final URI nodeURI = getURI(node);
		final EClass realClass = getClass(nodeURI, eType);
		
		return proxyFactory.get(realClass, nodeURI);
	}

	private EObject getProxyValue(Resource resource, EObject theLoadedObject, EReference reference) {
		EObject ret = null;
		final EList<Node> values = getValues(resource, reference);
		
		if (values != null && !values.isEmpty()) 
		{
			ret = doProxy((Resource) values.get(0), (EClass) reference.getEType());
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
