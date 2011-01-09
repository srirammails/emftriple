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
 * A representation of the model object '<em><b>Equivalent Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.EquivalentObjectProperties#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.EquivalentObjectProperties#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getEquivalentObjectProperties()
 * @model
 * @generated
 */
public interface EquivalentObjectProperties extends ObjectPropertyAxiom {
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
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentObjectProperties_Property()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.EquivalentObjectProperties#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentObjectProperties_EquivalentProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getEquivalentProperties();

} // EquivalentObjectProperties
