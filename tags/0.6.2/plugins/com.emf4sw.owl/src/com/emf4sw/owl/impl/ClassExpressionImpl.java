/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DisjointClasses;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.SubClassOf;
import com.emf4sw.owl.atl.OWLCollections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ClassExpressionImpl extends MinimalEObjectImpl.Container implements ClassExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.CLASS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Ontology getOntology() {
		EObject root = EcoreUtil.getRootContainer(this);
		if (root instanceof Ontology) {
			return (Ontology) root;
		} else return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listSubClasses() {
		final BasicEList<ClassExpression> subClasses = new BasicEList<ClassExpression>();
		final EList<SubClassOf> subClassOf = OWLCollections.getAxiomsByType(getOntology(), SubClassOf.class);
		final Set<ClassExpression> set = new LinkedHashSet<ClassExpression>();
		
		for (SubClassOf aSub: subClassOf) {
			if (aSub.getSuperClass().equals(this) || 
					aSub.getSuperClass() instanceof EntityExpression && 
						((EntityExpression) aSub.getSuperClass()).getEntity().equals(this)) {
				if (aSub.getSubClass() instanceof EntityExpression) {
					set.add( (ClassExpression) ((EntityExpression) aSub.getSubClass()).getEntity() );	
				} else {
					set.add( aSub.getSubClass() );
				}				
			}
		}
		subClasses.addAll(set);
		return subClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listSuperClasses() {
		final BasicEList<ClassExpression> superClasses = new BasicEList<ClassExpression>();
		final EList<SubClassOf> subClassOf = OWLCollections.getAxiomsByType(getOntology(), SubClassOf.class);
		final Set<ClassExpression> set = new LinkedHashSet<ClassExpression>();
		
		for (SubClassOf aSub: subClassOf) {
			if (aSub.getSubClass() != null) {
				ClassExpression subClass = aSub.getSubClass();
				
				if((subClass.equals(this) || subClass instanceof EntityExpression && 
					((EntityExpression) subClass).getEntity().equals(this))) {
				
					if (subClass instanceof EntityExpression) {
						set.add( (ClassExpression) ((EntityExpression) subClass).getEntity() );	
					} else {
						set.add( subClass );
					}				
				}
			}
		}
		superClasses.addAll(set);
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listEquivalentClasses() {
		final BasicEList<ClassExpression> list = new BasicEList<ClassExpression>();
		final EList<EquivalentClasses> equivalentClasses = OWLCollections.getAxiomsByType(getOntology(), EquivalentClasses.class);
		final Set<ClassExpression> set = new LinkedHashSet<ClassExpression>();
		
		for (EquivalentClasses equivalentClass: equivalentClasses) {
			Collection<ClassExpression> col = 
				OWLCollections.selectAllClasses(equivalentClass.getEquivalentClasses());
			
			if (equivalentClass.getExpression() instanceof EntityExpression) {
				if (((EntityExpression) equivalentClass.getExpression()).getEntity().equals(this)) {
					set.addAll( col );
				}
			}
			if (col.contains(this)) {
				Collection<ClassExpression> equi = col;
				equi.remove(this);
				equi.add(OWLCollections.get(equivalentClass.getExpression()));
				set.addAll(equi);
			}
		}
		list.addAll( set );
		list.remove(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listDisjointClasses() {
		final BasicEList<ClassExpression> list = new BasicEList<ClassExpression>();
		final EList<DisjointClasses> disjointClasses = OWLCollections.getAxiomsByType(getOntology(), DisjointClasses.class);
		final Set<ClassExpression> set = new LinkedHashSet<ClassExpression>();
		
		for (DisjointClasses disjoints: disjointClasses) {
			Collection<ClassExpression> col = 
				OWLCollections.selectAllClasses(disjoints.getDisjointClasses());
			
			if (disjoints.getExpression() instanceof EntityExpression) {
				if (((EntityExpression) disjoints.getExpression()).getEntity().equals(this)) {
					set.addAll( col );
				}
			}
			if (col.contains(this)) {
				Collection<ClassExpression> disj = col;
				disj.remove(this);
				disj.add(OWLCollections.get(disjoints.getExpression()));
				set.addAll(disj);
			}
		}
		list.addAll( set );
		list.remove(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Individual> listInstances() {
		throw new UnsupportedOperationException();
	}


} //ClassExpressionImpl
