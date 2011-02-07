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
 * A representation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.EquivalentClasses#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.emf4sw.owl.EquivalentClasses#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getEquivalentClasses()
 * @model
 * @generated
 */
public interface EquivalentClasses extends ClassExpressionAxiom {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentClasses_Expression()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getExpression();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.EquivalentClasses#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ClassExpression value);

	/**
	 * Returns the value of the '<em><b>Equivalent Classes</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Classes</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentClasses_EquivalentClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassExpression> getEquivalentClasses();

} // EquivalentClasses
