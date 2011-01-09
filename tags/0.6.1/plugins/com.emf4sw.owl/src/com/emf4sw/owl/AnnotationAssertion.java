/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.AnnotationAssertion#getSubject <em>Subject</em>}</li>
 *   <li>{@link com.emf4sw.owl.AnnotationAssertion#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getAnnotationAssertion()
 * @model
 * @generated
 */
public interface AnnotationAssertion extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(EntityExpression)
	 * @see com.emf4sw.owl.OWLPackage#getAnnotationAssertion_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EntityExpression getSubject();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.AnnotationAssertion#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(EntityExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Literal)
	 * @see com.emf4sw.owl.OWLPackage#getAnnotationAssertion_Value()
	 * @model containment="true"
	 * @generated
	 */
	Literal getValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.AnnotationAssertion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Literal value);
	

} // AnnotationAssertion
