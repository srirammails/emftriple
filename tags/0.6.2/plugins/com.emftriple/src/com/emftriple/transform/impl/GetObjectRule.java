/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import static com.google.common.base.Preconditions.checkArgument;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.URIElement;
import com.emftriple.Mapping;
import com.emftriple.transform.GetObject;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetObjectRule {

	GetObjectRule() {
	}

	public EObject build(Resource source, GetObject t) {
		checkArgument(t instanceof GetObjectImpl);

		final EClass eClass = ((GetObjectImpl)t).getType(source);
		final EFactory eFactory = eClass.getEPackage().getEFactoryInstance();

		final EObject object = eFactory.create(eClass);	
		((InternalEObject)object).eSetProxyURI(URI.createURI(source.getURI()));
	

//		for (EAttribute eAttribute: eClass.getEAllAttributes()) {
//			List<Node> values = source.getValues( getEntityURI(eAttribute) );
//
//			if (eAttribute.isMany()) {
//				List<Object> result = transform(values, new Node2ListOfValues(eAttribute));
//				if (result != null && !result.isEmpty()) {
//					object.eSet(eAttribute, result);
//				}
//			} else {
//				Object result = transform(values, new Node2SingleValue(eAttribute));
//				if (result != null) {
//					object.eSet(eAttribute, result);	
//				}
//			}
//		}
//		
//		for (EReference eReference: eClass.getEAllReferences()) {
//			List<Node> values = source.getValues( getEntityURI(eReference) );
//			if (eReference.isMany()) {
//				loadListObjects(values, (GetObjectImpl) t);
//			} else {
//				 loadSingleObject(values, (GetObjectImpl) t);
//			}
//		}

		return object;
	}

	public boolean check(Resource source, Mapping mapping) {
		if (!source.getTypes().isEmpty()) {
			Node aType = source.getTypes().get(0);

			if (aType instanceof URIElement) {
				return mapping.getEClassWithRdfType(((URIElement) aType).getURI()) != null;
			}

		}
		return false;
	}
//
//	public void setProperties(EObject target, Resource source, GetObject t) {
//		checkArgument(t instanceof GetObjectImpl);
//
//		final EClass eClass = ((GetObjectImpl)t).getType(source);
//
//		for (EReference eReference: eClass.getEAllReferences()) {
//			setEReference(target, eReference, source.getValues( getEntityURI(eReference)), (GetObjectImpl)t );
//		}
//	}
//
//	private void setEReference(EObject target, EReference eReference, EList<Node> values, GetObjectImpl trans) {
//		if (eReference.isMany()) {
//
//			List<Object> result = loadListObjects(values, trans);
//			//			List<Object> result = Functions.transform(values, new Node2ListOfObjects(trans));
//
//			if (result != null && !result.isEmpty()) {
//				target.eSet(eReference, result);
//			}
//
//		} else {
//
//			Object result = loadSingleObject(values, trans);
//			//			Object result = Functions.transform(values, new Node2SingleObject(trans));
//
//			if (result != null) {
//				target.eSet(eReference, result);
//			}
//
//		}
//	}
//
//	private Object loadSingleObject(List<Node> nodes, GetObjectImpl get) {
//		final Resource res = nodes.isEmpty() ? null : 
//			(Resource) EcoreUtil.getObjectByType(nodes, RDFPackage.eINSTANCE.getResource());
//
//		if (res == null) {
//			return null;
//		}
//
//		RDFGraph aGraph = null;
//		try {
//			final DataSource dataSource = null; // TODO get.getDataSource(res);
//			final DescribeQuery q = transform(URI.createURI(res.getURI()), new Describe());
//			aGraph = dataSource.describeQuery(q);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		final Resource loaded = aGraph == null ? null : aGraph.getResource(res.getURI());
//
//		return loaded == null ? null : get.transform(loaded);
//	}
//
//	public class Node2SingleObject implements Function<List<Node>, Object> {
//
//		private final GetObjectImpl trans;
//
//		public Node2SingleObject(GetObjectImpl trans) {
//			this.trans = trans;
//		}
//
//		@Override
//		public Object apply(List<Node> from) {
//			final Resource res = from.isEmpty() ? null : 
//				(Resource) EcoreUtil.getObjectByType(from, RDFPackage.eINSTANCE.getResource());
//
//			if (res == null) {
//				return null;
//			}
//
//			RDFGraph aGraph = null;
//			try {
//				final DataSource dataSource = null; // TODO trans.getDataSource(res);
//				final DescribeQuery q = transform(URI.createURI(res.getURI()), new Describe());
//				aGraph = dataSource.describeQuery(q);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			final Resource loaded = aGraph == null ? null : aGraph.getResource(res.getURI());
//
//			return loaded == null ? null : trans.transform(loaded);
//		}
//
//	}
//
//	private List<Object> loadListObjects(List<Node> nodes, GetObjectImpl get) { 
//		final List<Object> list = Lists.newArrayList();
//
//		for (Object obj: nodes) {
//			if (obj instanceof Resource) {
//				Resource res = (Resource) obj;
//				RDFGraph aGraph = null;
//				try {
//					final DescribeQuery q = transform(URI.createURI(res.getURI()), new Describe());
//					aGraph = null; // TODO get.getDataSource(res).describeQuery(q);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				final Resource loaded = aGraph == null ? null : aGraph.getResource(res.getURI());
//
//				if (loaded != null) {
//					list.add(get.transform(loaded));
//				}
//			}
//		}
//
//		return list;
//	}
//
//	protected class Node2ListOfObjects implements Function<List<Node>, List<Object>> {
//
//		private final GetObjectImpl trans;
//
//		public Node2ListOfObjects(GetObjectImpl trans) {
//			this.trans = trans;
//		}
//
//		@Override
//		public List<Object> apply(List<Node> from) {
//			final List<Object> list = Lists.newArrayList();
//
//			for (Object obj: list) {
//				if (obj instanceof Resource) {
//					Resource res = (Resource) obj;
//					RDFGraph aGraph = null;
//					try {
//						final DescribeQuery q = transform(URI.createURI(res.getURI()), new Describe());
//						aGraph = null; // TODO trans.getDataSource(res).describeQuery(q);
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//					final Resource loaded = aGraph == null ? null : aGraph.getResource(res.getURI());
//
//					if (loaded != null) {
//						list.add(trans.transform(loaded));
//					}
//				}
//			}
//
//			return list;
//		}
//
//	}
//
//	private void setEAttribute(EObject target, EAttribute eAttribute, List<Node> values) {
//		if (eAttribute.isMany()) {
//			List<Object> result = transform(values, new Node2ListOfValues(eAttribute));
//			if (result != null && !result.isEmpty()) {
//				target.eSet(eAttribute, result);
//			}
//		} else {
//			Object result = transform(values, new Node2SingleValue(eAttribute));
//			if (result != null) {
//				target.eSet(eAttribute, result);	
//			}
//		}
//	}
//
//	protected class Node2SingleValue implements Function<List<Node>, Object> {
//
//		private EAttribute eAttribute;
//
//		public Node2SingleValue(EAttribute eAttribute) {
//			this.eAttribute = eAttribute;
//		}
//
//		@Override
//		public Object apply(List<Node> from) {
//			final Node node = from.isEmpty() ? null : from.get(0);
//
//			return node instanceof Literal ? 
//					convert((EDataType)eAttribute.getEType(), ((Literal) node).getLexicalForm()) : null;
//		}
//
//	}
//
//	protected class Node2ListOfValues implements Function<List<Node>, List<Object>> {
//
//		private EAttribute eAttribute;
//
//		public Node2ListOfValues(EAttribute eAttribute) {
//			this.eAttribute = eAttribute;
//		}
//
//		@Override
//		public List<Object> apply(List<Node> from) {
//			final List<Object> list = Lists.newArrayList();
//			for (Node node: from) {
//				if (node instanceof Literal) {
//					Object obj = 
//						convert((EDataType) eAttribute.getEType(), ((Literal) node).getLexicalForm());
//					if (obj != null) {
//						list.add(obj);
//					}
//				}
//			}
//			return list;
//		}
//
//	}
}
