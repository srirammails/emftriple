package com.emftriple.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.URIElement;
import com.google.common.collect.Lists;
import com.google.inject.internal.Maps;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class ETripleStore implements EStore {

	protected EntityManager entityManager;

	protected Map<EObject, Map<EStructuralFeature, List<URI>>> cache;

	public ETripleStore() {
		cache = Maps.newIdentityHashMap();
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager getEntityManager() {
		return entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		Object oldValue = object.eGet(feature);

		if (Collection.class.isAssignableFrom(oldValue.getClass()))
		{
			Collection<Object> collection = (Collection<Object>)oldValue;
			collection.add(value);
			object.eSet(feature, collection);
		}
		else 
		{
			object.eSet(feature, value);
		}
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		object.eSet(feature, null);
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
		if (object.eGet(feature) == null) {

		}
		return false;
	}

	@Override
	public EObject create(EClass eClass) {
		EObject obj = eClass.getEPackage().getEFactoryInstance().create(eClass);
		((InternalEObject)obj).eSetStore(this);

		return obj;
	}

	@Override
	public Object get(InternalEObject object, EStructuralFeature feature, int index) {
		Object val = null;
		
		if (entityManager == null)
		{
			return val;
		}

		if (feature instanceof EAttribute) 
		{
			val = getDataValue(object, (EAttribute) feature);
			if (val != null) 
			{
				set(object, feature, index, val);
			}
		}
		else 
		{
			val = getObjectValue(object, feature);
			if (val != null)
			{
				set(object, feature, index, val);
			}
		}

		return val;
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		return null;//(InternalEObject) object.eContainer();
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		System.out.println("call getCon " + object);
		return null;
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		System.out.println("call on " + feature.getName());
		return 0;
	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		System.out.println("call isE on " + feature.getName());
		return false;
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		System.out.println("call isSet on " + feature.getName());
		return false;
	}

	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		System.out.println("call last on " + feature.getName());
		return 0;
	}

	@Override
	public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		System.out.println("call move on " + feature.getName());
		return null;
	}

	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
		System.out.println("call remove on " + feature.getName());
		return null;
	}

	@Override
	public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		Object val = null;
		
		if (!cache.containsKey(object))
		{
			cache.put(object, new HashMap<EStructuralFeature, List<URI>>());
		}
			
		if (entityManager == null)
		{
			if (feature instanceof EAttribute)
			{
				val = object.eGet(feature);
//				object.eSet(feature, value);
			}
			else
			{
				if (!cache.get(object).containsKey(feature))
				{
					cache.get(object).put(feature, new ArrayList<URI>());
				}
//				URI id = IDGenerator.getId(value);
//				if (id != null)
//				{
//					cache.get(object).get(feature).add(id);	
//				}
//				object.eSet(feature, value);
			}
		}
		
		return val;
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		if (entityManager == null)
		{
			return 0;
		}

		if (!cache.containsKey(object)) 
		{
			cache.put(object, new HashMap<EStructuralFeature, List<URI>>());
		}

		if (!cache.get(object).containsKey(feature))
		{
			List<URI> uris = filter(getNodes(object, feature));
			if (!uris.isEmpty())
			{
				cache.get(object).put(feature, uris);
			}
		}
		
		return cache.get(object).get(feature) == null ? 0 : cache.get(object).get(feature).size();
	}

	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		System.out.println("call on " + feature.getName());
		return Lists.newArrayList(cache.get(object).get(feature)).toArray();
	}

	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature, T[] array) {
		System.out.println("call on array " + feature.getName());
		return Lists.newArrayList(cache.get(object).get(feature)).toArray(array);
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	protected List<Node> getNodes(EObject source, EStructuralFeature feature) {
		final List<Node> nodes = Lists.newArrayList();
//		final SelectQuery q = createQuery(source, feature);
//		final ResultSet rs = ((DataSourceManager)getEntityManager().getDelegate()).executeSelectQuery(q);
//
//		for (;rs.hasNext();) {
//			nodes.add( rs.next().get("v") );
//		}

		return nodes;
	}

	protected Object getDataValue(EObject source, EAttribute feature) {
		Object ret = null;

		List<Node> nodes = getNodes(source, feature);
		Node node = nodes.isEmpty() ? null : nodes.get(0);
		if (node != null && node instanceof com.emf4sw.rdf.Literal)
		{
			ret = EcoreUtil.createFromString((EDataType) feature.getEType(), ((com.emf4sw.rdf.Literal) node).getLexicalForm());
		}

		return ret;
	}

	protected Object getObjectValue(EObject source, EStructuralFeature feature) {
		Object ret = null;

		List<Node> nodes = getNodes(source, feature);
		Node node = nodes.isEmpty() ? null : nodes.get(0);
		if (node != null && node instanceof Resource)
		{
			Resource res = (Resource) node;
			if (getEntityManager().getTransaction().isActive()) 
			{
				ret = getEntityManager().find(feature.getEType().getInstanceClass(), res.getURI());
			} 
			else 
			{
				getEntityManager().getTransaction().begin();
				ret = getEntityManager().find(feature.getEType().getInstanceClass(), res.getURI());
				getEntityManager().getTransaction().commit();
			}
		}


		return ret;
	}

	protected static List<URI> filter(List<Node> nodes) {
		List<URI> uris = Lists.newArrayList();
		for (Node node: nodes)
		{
			if (node instanceof Resource )
			{
				uris.add( URI.createURI(((URIElement) node).getURI()) );
			}
		}
		return uris;
	}

//	protected SelectQuery createQuery(EObject source, EStructuralFeature feature) {
//		// SELECT ?v WHERE { <source> <feature> ?v }
//		SelectQuery query = SparqlFactory.eINSTANCE.createSelectQuery();
//		Variable var = SparqlFactory.eINSTANCE.createUnNamedVariable();
//		var.setName("v");
//		query.getVariables().add(var);
//
//		WhereClause where = SparqlFactory.eINSTANCE.createWhereClause();
//		GroupGraphPatternSub group = SparqlFactory.eINSTANCE.createGroupGraphPatternSub();
//		TriplesSameSubject pattern = SparqlFactory.eINSTANCE.createTriplesSameSubject();
//		IRI sbj = SparqlFactory.eINSTANCE.createIRI();
//		sbj.setValue(EntityUtil.ID.getId(source).toString());
//		IRI verb = SparqlFactory.eINSTANCE.createIRI();
//		verb.setValue(EntityUtil.getEntityURI(feature).toString());
//		UnNamedVariable var2 = SparqlFactory.eINSTANCE.createUnNamedVariable();
//		var2.setName("v");
//
//		pattern.setSubject(sbj);
//		PropertyList list = SparqlFactory.eINSTANCE.createPropertyList();
//		list.setObject(var2);
//		list.setProperty(verb);
//		pattern.getPropertyList().add(list);
//
//		group.getGraphPatterns().add(pattern);
//		where.setGroupGraphPattern(group);
//		query.setWhereClause(where);
//
//		return query;
//	}

}
