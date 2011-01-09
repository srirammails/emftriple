/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.InverseObjectProperties#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.InverseObjectProperties#getInverseProperty <em>Inverse Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getInverseObjectProperties()
 * @model
 * @generated
 */
public interface InverseObjectProperties extends ObjectPropertyAxiom {
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
	 * @see com.emf4sw.owl.OWLPackage#getInverseObjectProperties_Property()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.InverseObjectProperties#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Inverse Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Property</em>' containment reference.
	 * @see #setInverseProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getInverseObjectProperties_InverseProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getInverseProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.InverseObjectProperties#getInverseProperty <em>Inverse Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Property</em>' containment reference.
	 * @see #getInverseProperty()
	 * @generated
	 */
	void setInverseProperty(ObjectPropertyExpression value);

} // InverseObjectProperties
