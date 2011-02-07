/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Max Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectMaxCardinality#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectMaxCardinality#getOnClass <em>On Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectMaxCardinality()
 * @model
 * @generated
 */
public interface ObjectMaxCardinality extends ObjectPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Property</em>' containment reference.
	 * @see #setOnProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectMaxCardinality_OnProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getOnProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectMaxCardinality#getOnProperty <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Property</em>' containment reference.
	 * @see #getOnProperty()
	 * @generated
	 */
	void setOnProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see com.emf4sw.owl.OWLPackage#getObjectMaxCardinality_Cardinality()
	 * @model
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>On Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Class</em>' containment reference.
	 * @see #setOnClass(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectMaxCardinality_OnClass()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getOnClass();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectMaxCardinality#getOnClass <em>On Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Class</em>' containment reference.
	 * @see #getOnClass()
	 * @generated
	 */
	void setOnClass(ClassExpression value);

} // ObjectMaxCardinality
