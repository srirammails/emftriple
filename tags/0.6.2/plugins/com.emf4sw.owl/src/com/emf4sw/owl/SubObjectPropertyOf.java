/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.SubObjectPropertyOf#getSubObjectProperty <em>Sub Object Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.SubObjectPropertyOf#getSuperObjectProperty <em>Super Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getSubObjectPropertyOf()
 * @model
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Object Property</em>' containment reference.
	 * @see #setSubObjectProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubObjectPropertyOf_SubObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getSubObjectProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubObjectPropertyOf#getSubObjectProperty <em>Sub Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Object Property</em>' containment reference.
	 * @see #getSubObjectProperty()
	 * @generated
	 */
	void setSubObjectProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Super Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Object Property</em>' containment reference.
	 * @see #setSuperObjectProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubObjectPropertyOf_SuperObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getSuperObjectProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubObjectPropertyOf#getSuperObjectProperty <em>Super Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Object Property</em>' containment reference.
	 * @see #getSuperObjectProperty()
	 * @generated
	 */
	void setSuperObjectProperty(ObjectPropertyExpression value);

} // SubObjectPropertyOf
