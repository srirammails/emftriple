package com.emf4sw.owl.atl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.owl.Axiom;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.Declaration;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.Ontology;

/**
 * {@link OWLCollections}
 * 
 * Utility class for OWL generated classes.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class OWLCollections {

	public static Collection<ClassExpression> selectAllClasses(EList<ClassExpression> classes) {
		final Collection<ClassExpression> collection = new LinkedList<ClassExpression>();
		for (ClassExpression aExpression: classes) {
			collection.add( get(aExpression) );
		}
		return collection;
	}

	public static ClassExpression get(ClassExpression aExpression) {
		if (aExpression instanceof EntityExpression) {
			return (OWLClass)((EntityExpression) aExpression).getEntity();
		}
		return aExpression;
	}

	public static boolean isEqual(DataProperty property, DataPropertyExpression dataPropertyExpression) {
		return ((EntityExpression) dataPropertyExpression).getEntity().equals(property);
	}

	public static boolean isEqual(ObjectProperty property, ObjectPropertyExpression dataPropertyExpression) {
		return ((EntityExpression) dataPropertyExpression).getEntity().equals(property);
	}

	public static DataRange get(DataRange range) {
		if (range instanceof EntityExpression) {
			return (Datatype) ((EntityExpression) range).getEntity();
		}
		return range;
	}

	public static DataProperty get(DataPropertyExpression property) {
		return (DataProperty) ((EntityExpression) property).getEntity();
	}

	public static ObjectProperty get(ObjectPropertyExpression property) {
		return (ObjectProperty) ((EntityExpression) property).getEntity();
	}

	public static Collection<DataProperty> selectAllDataProperties(EList<DataPropertyExpression> properties) {
		final Collection<DataProperty> collection = new LinkedList<DataProperty>();
		for (DataPropertyExpression exp: properties) {
			collection.add(get(exp));
		}
		return collection;
	}

	public static Collection<ObjectProperty> selectAllObjectProperties(EList<ObjectPropertyExpression> properties) {
		final Collection<ObjectProperty> collection = new LinkedList<ObjectProperty>();
		for (ObjectPropertyExpression exp: properties) {
			collection.add(get(exp));
		}
		return collection;
	}

	@SuppressWarnings("unchecked")
	public static <T> EList<T> getExpressionsByType(Ontology aOntology, Class<T> aType) {
		final EList<T> res = new BasicEList<T>();
		Set<T> all = new LinkedHashSet<T>();
		for (TreeIterator<EObject> it = aOntology.eResource().getAllContents(); it.hasNext();) {
			EObject aObject = it.next();
			if (!(aObject instanceof EntityExpression)) {
				if (aType.isInstance(aObject)) {
					all.add((T) aObject);
				} else if (aObject instanceof Declaration) {
					if (aType.isInstance( ((Declaration) aObject).getEntity()) ) {
						all.add((T) ((Declaration) aObject).getEntity());	
					}
				}
			}
		}
		res.addAll(all);
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T> EList<T> getEntitiesByType(Ontology aOntology, Class<T> aType) {
		final EList<T> res = new BasicEList<T>();
		final Collection<Declaration> col = EcoreUtil.getObjectsByType(aOntology.getAxioms(), OWLPackage.eINSTANCE.getDeclaration());
		for (Declaration decl: col) {
			if (aType.isInstance(decl.getEntity())) {
				res.add((T) decl.getEntity());
			}
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T> EList<T> getAxiomsByType(Ontology aOntology, Class<T> aType) {
		final EList<T> res = new BasicEList<T>();
		for (Axiom aAxiom: aOntology.getAxioms()) {
			if (aType.isInstance(aAxiom)) {
				res.add((T) aAxiom);
			}
		}
		return res;
	}
}
