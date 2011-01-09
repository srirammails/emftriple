/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.SubClassOf#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link com.emf4sw.owl.SubClassOf#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getSubClassOf()
 * @model
 * @generated
 */
public interface SubClassOf extends ClassExpressionAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class</em>' containment reference.
	 * @see #setSubClass(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubClassOf_SubClass()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getSubClass();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubClassOf#getSubClass <em>Sub Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class</em>' containment reference.
	 * @see #getSubClass()
	 * @generated
	 */
	void setSubClass(ClassExpression value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' containment reference.
	 * @see #setSuperClass(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubClassOf_SuperClass()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getSuperClass();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubClassOf#getSuperClass <em>Super Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' containment reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(ClassExpression value);

} // SubClassOf
