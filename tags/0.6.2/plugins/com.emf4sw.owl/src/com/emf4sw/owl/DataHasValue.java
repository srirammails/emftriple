/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataHasValue#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Property</em>' containment reference.
	 * @see #setOnProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getDataHasValue_OnProperty()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getOnProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataHasValue#getOnProperty <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Property</em>' containment reference.
	 * @see #getOnProperty()
	 * @generated
	 */
	void setOnProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Has Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value</em>' containment reference.
	 * @see #setHasValue(Literal)
	 * @see com.emf4sw.owl.OWLPackage#getDataHasValue_HasValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getHasValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value</em>' containment reference.
	 * @see #getHasValue()
	 * @generated
	 */
	void setHasValue(Literal value);

} // DataHasValue
