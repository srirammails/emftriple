package com.emftriple.transform.impl;

import static com.emftriple.transform.impl.GetUtil.getURI;
import static com.emftriple.transform.impl.GetUtil.getValue;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.SparqlQueries;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetEObjectImpl extends AbstractGetObject implements GetObject {

	private final GetProxyObjectImpl proxyFactory;

	public GetEObjectImpl(ResourceManager manager, Mapping mapping, EntityDataSourceManager dataSourceManager) {
		super(manager, mapping, dataSourceManager);
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, URI key) {
		final RDFGraph aGraph = getGraph(entityClass, key);
		final Resource subject = aGraph.getResource(key.toString());

		final EClass aClass = mapping.findEClassByRdfType(subject.getTypes());
		final EClass requestedEClass = mapping.getEClass(entityClass);

		T object = null;
		if (aClass.equals(requestedEClass) || aClass.getESuperTypes().contains(requestedEClass)) {
			object = (T) process( aClass, subject );
		}

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
	private EObject process(EClass aClass, Resource from) {
		if (aClass == null)
		{
			return null;
		}

		final EObject returnedObject = EcoreUtil.create(aClass);
		final EAttribute attrId = EntityUtil.getId(aClass);
		setIdValue(returnedObject, from, attrId);
		dataSourceManager.put(URI.createURI(from.getURI()), returnedObject);

		final Map<URI, List<Triple>> triples = cacheTriples(from);
		
		for (EAttribute attribute: aClass.getEAllAttributes()) 
		{
			if (attribute != attrId) {
				if (!(attribute.isTransient() || attribute.isVolatile() || attribute.isUnsettable())) {
					URI uri = mapping.getRdfType(attribute);
					
					if (triples.containsKey(uri)) {
						doAdd(returnedObject, attribute, triples.get(uri));	
					}
				}
					
			}
		}

		for (EReference reference: aClass.getEAllReferences())
		{
			if (!(reference.isTransient() || reference.isDerived() || reference.isUnsettable())) {
				URI uri = mapping.getRdfType(reference);

				if (triples.containsKey(uri)) {
					doAdd(returnedObject, reference, triples.get(uri));
				}
			}
		}

		return returnedObject;
	}

	private void doAdd(EObject returnedObject, EAttribute attribute, List<Triple> triples) {
		if (attribute.isMany()) 
		{
			@SuppressWarnings("unchecked")
			final EList<Object> list = (EList<Object>) returnedObject.eGet(attribute);
			for (Triple triple: triples)
			{
				final String aStringValue = getValue(triple.getObject());
				if (aStringValue != null)
				{
					final Object aObjectValue = DatatypeConverter.convert((EDataType) attribute.getEType(), aStringValue);
					if (aObjectValue != null) 
					{
						list.add(aObjectValue);
					}
				}
			}
		} 
		else 
		{
			if (triples.isEmpty())
				return;
			
			final String aStringValue;
			if (isLangSpecific(attribute)) {
				aStringValue = getValue(triples, getLang(attribute));
			} else {
				aStringValue = getValue(triples.get(0).getObject());
			}

			if (aStringValue != null) 
			{
				final Object aObjectValue = DatatypeConverter.convert((EDataType) attribute.getEType(), aStringValue);
				if (aObjectValue != null) 
				{
					returnedObject.eSet(attribute, aObjectValue);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void doAdd(EObject returnedObject, EReference reference, List<Triple> triples) {
		if (reference.isMany())
		{
			EList<EObject> list = (EList<EObject>) returnedObject.eGet(reference);
			for (Triple triple: triples) {
				final EClass targetClass = getClass(triple.getObject(), (EClass) reference.getEType());

				EObject object = null;
				if (reference.isContainment()) {
					object = get(targetClass, getURI(triple.getObject()));
				} else {
					object = doProxy((Resource) triple.getObject(), (EClass) reference.getEType());
				}
				if (object != null) {
					list.add(object);
				}
			}
		}
		else
		{
			Node node = !triples.isEmpty() ? triples.get(0).getObject() : null;
			if (node == null)
				return;

			final EClass targetClass = getClass(node, (EClass) reference.getEType());
			EObject object = null;
			if (reference.isContainment()) {
				object = get(targetClass, getURI(node));
			} else {
				object = doProxy((Resource) node, (EClass) reference.getEType());
			}
			if (object != null) {
				returnedObject.eSet(reference, object);
			}
		}
	}

	private Map<URI, List<Triple>> cacheTriples(Resource from) {
		final Map<URI, List<Triple>> res = new HashMap<URI, List<Triple>>();
		for (Triple triple: from.getSubjectOf()) {
			res.put(URI.createURI(triple.getPredicate().getURI()), triple.getPredicate().getPredicateOf());
		}
		return res;
	}

	private EObject doProxy(Resource node, EClass eType) {
		final URI nodeURI = getURI(node);
		final EClass realClass = getClass(node, eType);

		if (dataSourceManager.containsKey(nodeURI)) {
			Object obj = dataSourceManager.getByKey(nodeURI);
			if (obj instanceof EObject && ((EObject) obj).eClass().equals(realClass))
				return (EObject)obj;
		}

		return proxyFactory.get(realClass, nodeURI);
	}

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	private void doAdd(Resource resource, EObject theLoadedObject, EAttribute attribute) {
//		final EList<Node> values = getValues(resource, attribute); 
//
//	
//	}

	private boolean isLangSpecific(EAttribute attribute) {
		EAnnotation ann = EntityUtil.getETripleAnnotation(attribute, "DataProperty");
		if (ann != null) {
			return ann.getDetails().containsKey("lang");
		}
		ann = EntityUtil.getETripleAnnotation(attribute, "rdf");
		if (ann != null) {
			return ann.getDetails().containsKey("lang");
		}
		return false;
	}

	private String getLang(EAttribute attribute) {
		EAnnotation ann = EntityUtil.getETripleAnnotation(attribute, "DataProperty");
		if (ann != null) {
			return ann.getDetails().get("lang");
		}
		ann = EntityUtil.getETripleAnnotation(attribute, "rdf");
		if (ann != null) {
			return ann.getDetails().get("lang");
		}
		return null;
	}

	private EClass getClass(Node node, EClass eType) {
		checkNotNull(eType);
		if (node instanceof URIElement) {
			return mapping.findEClassByRdfType( SparqlQueries.selectAllTypes(dataSourceManager, (URIElement) node) );
		}
		return null;
	}

//	private EList<Node> getValues(Resource resource, EStructuralFeature feature) {
//		checkNotNull(resource);
//
//		final URI propertyURI = mapping.getRdfType(feature);
//
//		return propertyURI == null ? null : resource.getValues(propertyURI.toString());
//	}

}
