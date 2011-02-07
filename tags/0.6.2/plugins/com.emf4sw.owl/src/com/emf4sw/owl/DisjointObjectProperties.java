/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DisjointObjectProperties#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DisjointObjectProperties#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDisjointObjectProperties()
 * @model
 * @generated
 */
public interface DisjointObjectProperties extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getDisjointObjectProperties_Property()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DisjointObjectProperties#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDisjointObjectProperties_DisjointProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getDisjointProperties();

} // DisjointObjectProperties
