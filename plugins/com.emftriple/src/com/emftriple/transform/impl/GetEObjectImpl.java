package com.emftriple.transform.impl;

import static com.emftriple.transform.impl.GetUtil.getURI;
import static com.emftriple.util.EntityUtil.URI;
import static com.emftriple.util.SparqlQueries.selectAllTypes;
import static com.emftriple.util.SparqlQueries.selectObjectByClass;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emftriple.IMapping;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.IResultSet.Solution;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;
import com.emftriple.util.EntityUtil;
import com.emftriple.util.SparqlQueries;
import com.google.inject.internal.Maps;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetEObjectImpl extends AbstractGetObject implements IGetObject {

	private final GetProxyObjectImpl proxyFactory;

	public GetEObjectImpl(ResourceManager manager, IMapping mapping, IEntityDataSourceManager dataSourceManager) {
		super(manager, mapping, dataSourceManager);
		this.proxyFactory = new GetProxyObjectImpl(manager, mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, URI key) {
		if (dataSourceManager.containsKey(key)) {
			EObject obj = dataSourceManager.getByKey(key);
			if (!obj.eIsProxy() && (entityClass.isInstance(obj))) {
				return (T) obj;
			}
		}
		
		final EClass aClass = getEClass(key);
		final EClass requestedEClass = mapping.getEClass(entityClass);

		T object = null;
		if (aClass.equals(requestedEClass) || aClass.getESuperTypes().contains(requestedEClass)) {
			object = (T) doGet( aClass, key );
		}
		
		return object;
	}

	private EClass getEClass(URI key) {
		return mapping.findEClassByRdfType(selectAllTypes(dataSourceManager, key.toString()));
	}
	
	@Override
	public EObject get(EClass eClass, URI key) {
		return doGet( eClass, key );
	}

	private EObject doGet(EClass eClass, URI key) {
		final IResultSet resultSet = dataSourceManager.executeSelectQuery(selectObjectByClass(eClass, key.toString()));
		final EObject returnedObject = EcoreUtil.create(eClass);
		final EAttribute attrId = EntityUtil.getId(eClass);
		setIdValue(returnedObject, key.toString(), attrId);

		manager.getResource(returnedObject.eClass()).getContents().add(returnedObject);

		final Map<EStructuralFeature, String> previous = Maps.newHashMap();
		
		for (;resultSet.hasNext();) {
			Solution sol = resultSet.next();
			for (EStructuralFeature feature: eClass.getEAllStructuralFeatures()) {
				Node node = sol.get(feature.getName());
				if (node != null) {
					if (feature instanceof EAttribute && node instanceof Literal) {
						if (feature.isMany()) {
							if (!previous.containsKey(feature)) {
								doEAttribute(returnedObject, (EAttribute)feature, (Literal)node);
							}
							else if (!previous.get(feature).equals(((Literal) node).getLexicalForm())) {
								doEAttribute(returnedObject, (EAttribute)feature, (Literal)node);
							}
							previous.put(feature, ((Literal) node).getLexicalForm());
						} else {
							doEAttribute(returnedObject, (EAttribute)feature, (Literal)node);
						}
					} else if (node instanceof Resource && node instanceof Resource){
						if (feature.isMany()) {
							if (!previous.containsKey(feature)) {
								doEReference(returnedObject, (EReference)feature, (Resource)node);
							}
							else if (!previous.get(feature).equals(((URIElement) node).getURI())) {
								doEReference(returnedObject, (EReference)feature, (Resource)node);								
							}
							previous.put(feature, ((URIElement) node).getURI());
						} else {
							doEReference(returnedObject, (EReference)feature, (Resource)node);
						}
					}
				}
			}
		}
		
		dataSourceManager.addToContext(returnedObject);

		return returnedObject;
	}

	private void doEReference(final EObject returnedObject, EReference feature, Resource node) {
		if (feature.isMany()) {
			@SuppressWarnings("unchecked")
			final EList<Object> list = (EList<Object>) returnedObject.eGet(feature);
			
			if (feature.isContainment()) {
				list.add( get(getClass(node, (EClass) feature.getEType()), URI(node.getURI())) );
			} else {
				System.out.println("call for " + feature);
				EObject prox = doProxy(node, getClass(node, (EClass) feature.getEType()));
				list.add( prox );
			}
		} else {
			if (feature.isContainment()) {
				returnedObject.eSet(feature, get(getClass(node, (EClass) feature.getEType()), URI(node.getURI())));
			} else {
				System.out.println("call for " + feature);
				returnedObject.eSet(feature, doProxy(node, getClass(node, (EClass) feature.getEType())));
			}
		}
	}
	
	
	private void doEAttribute(EObject returnedObject, EAttribute feature, Literal node) {	
		if (feature.isMany()) {
			@SuppressWarnings("unchecked")
			final EList<Object> list = (EList<Object>) returnedObject.eGet(feature);
//			final String aStringValue;
//			if (isLangSpecific(feature)) {
//				aStringValue = getValue(triples, getLang(attribute));
//			} else {
//				aStringValue = getValue(triples.get(0).getObject());
//			}
			final Object value = DatatypeConverter.convert((EDataType) feature.getEType(), node.getLexicalForm());
			if (value != null) list.add(value);
		} else {
			final Object value = DatatypeConverter.convert((EDataType) feature.getEType(), node.getLexicalForm());
			if (value != null) returnedObject.eSet(feature, value);
		}
	}

	private EObject doProxy(Node node, EClass eType) {
		final URI nodeURI = getURI(node);

		if (dataSourceManager.containsKey(nodeURI)) {
			System.out.println("contains key " + nodeURI+ " "+dataSourceManager.getByKey(nodeURI));
			return dataSourceManager.getByKey(nodeURI);
		} else {
			System.out.println("does not contains key " + nodeURI);
			return proxyFactory.get(eType, nodeURI);
		}
	}

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
		
		return 	(node instanceof URIElement) ?
				mapping.findEClassByRdfType( SparqlQueries.selectAllTypes(dataSourceManager, URI.createURI(((URIElement) node).getURI())))
				: null;
	}

}
