/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ClassAssertion#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassAssertion#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getClassAssertion()
 * @model
 * @generated
 */
public interface ClassAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Expression</em>' containment reference.
	 * @see #setClassExpression(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getClassAssertion_ClassExpression()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getClassExpression();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ClassAssertion#getClassExpression <em>Class Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Expression</em>' containment reference.
	 * @see #getClassExpression()
	 * @generated
	 */
	void setClassExpression(ClassExpression value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(Individual)
	 * @see com.emf4sw.owl.OWLPackage#getClassAssertion_Individual()
	 * @model containment="true"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ClassAssertion#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

} // ClassAssertion
