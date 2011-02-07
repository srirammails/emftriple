/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyDomain;
import com.emf4sw.owl.DataPropertyRange;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DisjointDataProperties;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentDataProperties;
import com.emf4sw.owl.FunctionalDataProperty;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.SubDataPropertyOf;
import com.emf4sw.owl.atl.OWLCollections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends OWLPropertyImpl implements DataProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isFunctional() {
		final EList<FunctionalDataProperty> result = 
			OWLCollections.getAxiomsByType(getOntology(), FunctionalDataProperty.class);
		for (FunctionalDataProperty fdp: result) {
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
		final EList<DataPropertyDomain> result = 
			OWLCollections.getAxiomsByType(getOntology(), DataPropertyDomain.class);
		final Set<ClassExpression> set = new LinkedHashSet<ClassExpression>();
		for (DataPropertyDomain dom: result) {
			if (OWLCollections.isEqual(this, dom.getProperty())) {
				set.add(OWLCollections.get(dom.getDomain()));
			}
		}
		domains.addAll(set);
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataRange> listRanges() {
		final EList<DataRange> ranges = new BasicEList<DataRange>();
		final EList<DataPropertyRange> result = 
			OWLCollections.getAxiomsByType(getOntology(), DataPropertyRange.class);
		final Set<DataRange> set = new LinkedHashSet<DataRange>();
		for (DataPropertyRange ran: result) {
			if (OWLCollections.isEqual(this, ran.getProperty())) {
				set.add(OWLCollections.get(ran.getRange()));
			}
		}
		ranges.addAll(set);
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataProperty> listSubProperties() {
		final EList<DataProperty> subProperties = new BasicEList<DataProperty>();
		final EList<SubDataPropertyOf> result = 
			OWLCollections.getAxiomsByType(getOntology(), SubDataPropertyOf.class);
		final Set<DataProperty> set = new LinkedHashSet<DataProperty>();
		
		for (SubDataPropertyOf sub: result) {
			if (OWLCollections.isEqual(this, sub.getSuperDataProperty())) {
				set.add(OWLCollections.get(sub.getSubDataProperty()));
			}
		}
		subProperties.addAll(set);
		return subProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataProperty> listSuperProperties() {
		final EList<DataProperty> superProperties = new BasicEList<DataProperty>();
		final List<SubDataPropertyOf> result = 
			OWLCollections.getAxiomsByType(getOntology(), SubDataPropertyOf.class);
		final Set<DataProperty> set = new LinkedHashSet<DataProperty>();
		
		for (SubDataPropertyOf sub: result) {
			if (OWLCollections.isEqual(this, sub.getSubDataProperty())) {
				set.add(OWLCollections.get(sub.getSuperDataProperty()));
			}
		}
		superProperties.addAll(set);
		return superProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataProperty> listEquivalentProperties() {
		final EList<DataProperty> equiProperties = new BasicEList<DataProperty>();
		final List<EquivalentDataProperties> result = 
			OWLCollections.getAxiomsByType(getOntology(), EquivalentDataProperties.class);
		final Set<DataProperty> set = new LinkedHashSet<DataProperty>();
		
		for (EquivalentDataProperties equiData: result) {
			Collection<DataProperty> all =
				OWLCollections.selectAllDataProperties(equiData.getEquivalentProperties());
			if (OWLCollections.isEqual(this, equiData.getProperty())) {
				set.addAll(all);
			}
			if (all.contains(this)) {
				Collection<DataProperty> equi = all;
				equi.remove(this);
				equi.add(OWLCollections.get(equiData.getProperty()));
				set.addAll(equi);
			}
		}
		equiProperties.addAll(set);
		return equiProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataProperty> listDisjointProperties() {
		final EList<DataProperty> disjointProperties = new BasicEList<DataProperty>();
		final List<DisjointDataProperties> result = 
			OWLCollections.getAxiomsByType(getOntology(), DisjointDataProperties.class);
		final Set<DataProperty> set = new LinkedHashSet<DataProperty>();
		
		for (DisjointDataProperties disjointData: result) {
			Collection<DataProperty> all =
				OWLCollections.selectAllDataProperties(disjointData.getDisjointProperties());
			if (OWLCollections.isEqual(this, disjointData.getProperty())) {
				set.addAll(all);
			}
			if (all.contains(this)) {
				Collection<DataProperty> equi = all;
				equi.remove(this);
				equi.add(OWLCollections.get(disjointData.getProperty()));
				set.addAll(equi);
			}
		}
		disjointProperties.addAll(set);
		return disjointProperties;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return (arg0 instanceof DataProperty) ? 
				(((DataProperty) arg0).getURI()).equals(this.getURI()) : false;
	}

} //DataPropertyImpl
