/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.emf4sw.owl.AssymmetricObjectProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DisjointObjectProperties;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentObjectProperties;
import com.emf4sw.owl.FunctionalObjectProperty;
import com.emf4sw.owl.InverseFunctionalObjectProperty;
import com.emf4sw.owl.InverseObjectProperties;
import com.emf4sw.owl.IrreflexiveObjectProperty;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyDomain;
import com.emf4sw.owl.ObjectPropertyRange;
import com.emf4sw.owl.ReflexiveObjectProperty;
import com.emf4sw.owl.SubObjectPropertyOf;
import com.emf4sw.owl.SymmetricObjectProperty;
import com.emf4sw.owl.TransitiveObjectProperty;
import com.emf4sw.owl.atl.OWLCollections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends OWLPropertyImpl implements ObjectProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isInverseFunctional() {
		final EList<InverseFunctionalObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), InverseFunctionalObjectProperty.class);
		for (InverseFunctionalObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isTransitive() {
		final EList<TransitiveObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), TransitiveObjectProperty.class);
		for (TransitiveObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isSymmteric() {
		final EList<SymmetricObjectProperty> result =
			OWLCollections.getAxiomsByType(getOntology(), SymmetricObjectProperty.class);
		for (SymmetricObjectProperty sop: result) {
			if (((EntityExpression) sop.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isAssymmteric() {
		final EList<AssymmetricObjectProperty> result =
			OWLCollections.getAxiomsByType(getOntology(), AssymmetricObjectProperty.class);
		for (AssymmetricObjectProperty sop: result) {
			if (((EntityExpression) sop.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isSymmetric() {
		final EList<SymmetricObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), SymmetricObjectProperty.class);
		for (SymmetricObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isAssymmetric() {
		final EList<AssymmetricObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), AssymmetricObjectProperty.class);
		for (AssymmetricObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isReflexive() {
		final EList<ReflexiveObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), ReflexiveObjectProperty.class);
		for (ReflexiveObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isIrreflexive() {
		final EList<IrreflexiveObjectProperty> result =  
				OWLCollections.getAxiomsByType(getOntology(), IrreflexiveObjectProperty.class);
		for (IrreflexiveObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isFunctional() {
		final EList<FunctionalObjectProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), FunctionalObjectProperty.class);
		for (FunctionalObjectProperty fdp: result) {
			if (((EntityExpression) fdp.getProperty()).getEntity().equals(this)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listDomains() {
		final EList<ClassExpression> domains = new BasicEList<ClassExpression>();
		final EList<ObjectPropertyDomain> result = 
			OWLCollections.getAxiomsByType(getOntology(), ObjectPropertyDomain.class);
		for (ObjectPropertyDomain dom: result) {
			if (OWLCollections.isEqual(this, dom.getProperty())) {
				domains.add(OWLCollections.get(dom.getDomain()));
			}
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listRanges() {
		final EList<ClassExpression> ranges = new BasicEList<ClassExpression>();
		final List<ObjectPropertyRange> result = 
			OWLCollections.getAxiomsByType(getOntology(), ObjectPropertyRange.class);
		for (ObjectPropertyRange ran: result) {
			if (OWLCollections.isEqual(this, ran.getProperty())) {
				ranges.add(OWLCollections.get(ran.getRange()));
			}
		}
		return ranges;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listSubProperties() {
		final EList<ObjectProperty> subProperties = new BasicEList<ObjectProperty>();
		final List<SubObjectPropertyOf> result = 
			OWLCollections.getAxiomsByType(getOntology(), SubObjectPropertyOf.class);
		for (SubObjectPropertyOf sub: result) {
			if (OWLCollections.isEqual(this, sub.getSuperObjectProperty())) {
				subProperties.add(OWLCollections.get(sub.getSubObjectProperty()));
			}
		}
		return subProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listSuperProperties() {
		final EList<ObjectProperty> superProperties = new BasicEList<ObjectProperty>();
		final List<SubObjectPropertyOf> result = 
			OWLCollections.getAxiomsByType(getOntology(), SubObjectPropertyOf.class);
		for (SubObjectPropertyOf sub: result) {
			if (OWLCollections.isEqual(this, sub.getSubObjectProperty())) {
				superProperties.add(OWLCollections.get(sub.getSuperObjectProperty()));
			}
		}
		return superProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listInverseProperties() {
		final EList<ObjectProperty> invProperties = new BasicEList<ObjectProperty>();
		final List<InverseObjectProperties> result = 
			OWLCollections.getAxiomsByType(getOntology(), InverseObjectProperties.class);
		for (InverseObjectProperties inv: result) {
			if (OWLCollections.isEqual(this, inv.getProperty())) {
				invProperties.add(OWLCollections.get(inv.getInverseProperty()));
			} else if (OWLCollections.isEqual(this, inv.getInverseProperty())) {
				invProperties.add(OWLCollections.get(inv.getProperty()));
			}
		}
		return invProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listEquivalentProperties() {
		final EList<ObjectProperty> equiProperties = new BasicEList<ObjectProperty>();
		final List<EquivalentObjectProperties> result = 
			OWLCollections.getAxiomsByType(getOntology(), EquivalentObjectProperties.class);
		for (EquivalentObjectProperties equiObject: result) {
			Collection<ObjectProperty> all =
				OWLCollections.selectAllObjectProperties(equiObject.getEquivalentProperties());
			if (OWLCollections.isEqual(this, equiObject.getProperty())) {
				equiProperties.addAll(all);
			}
			if (all.contains(this)) {
				Collection<ObjectProperty> equi = all;
				equi.remove(this);
				equi.add(OWLCollections.get(equiObject.getProperty()));
				equiProperties.addAll(equi);
			}
		}
		return equiProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listDisjointProperties() {
		final EList<ObjectProperty> disjointProperties = new BasicEList<ObjectProperty>();
		final List<DisjointObjectProperties> result = 
			OWLCollections.getAxiomsByType(getOntology(), DisjointObjectProperties.class);
		for (DisjointObjectProperties disjointObject: result) {
			Collection<ObjectProperty> all =
				OWLCollections.selectAllObjectProperties(disjointObject.getDisjointProperties());
			if (OWLCollections.isEqual(this, disjointObject.getProperty())) {
				disjointProperties.addAll(all);
			}
			if (all.contains(this)) {
				Collection<ObjectProperty> equi = all;
				equi.remove(this);
				equi.add(OWLCollections.get(disjointObject.getProperty()));
				disjointProperties.addAll(equi);
			}
		}
		return disjointProperties;
	}

} //ObjectPropertyImpl
