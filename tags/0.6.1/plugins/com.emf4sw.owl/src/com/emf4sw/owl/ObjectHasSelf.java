/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Self</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectHasSelf#getOnProperty <em>On Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectHasSelf()
 * @model
 * @generated
 */
public interface ObjectHasSelf extends ObjectPropertyRestriction {
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
	 * @see com.emf4sw.owl.OWLPackage#getObjectHasSelf_OnProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getOnProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectHasSelf#getOnProperty <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Property</em>' containment reference.
	 * @see #getOnProperty()
	 * @generated
	 */
	void setOnProperty(ObjectPropertyExpression value);

} // ObjectHasSelf
