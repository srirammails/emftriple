/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectComplementOf#getComplementOf <em>Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectComplementOf()
 * @model
 * @generated
 */
public interface ObjectComplementOf extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Complement Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Of</em>' containment reference.
	 * @see #setComplementOf(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectComplementOf_ComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getComplementOf();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectComplementOf#getComplementOf <em>Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Of</em>' containment reference.
	 * @see #getComplementOf()
	 * @generated
	 */
	void setComplementOf(ClassExpression value);

} // ObjectComplementOf
