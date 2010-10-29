/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.AnnotationAxiom#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getAnnotationAxiom()
 * @model
 * @generated
 */
public interface AnnotationAxiom extends Axiom {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(AnnotationPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getAnnotationAxiom_Property()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.AnnotationAxiom#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(AnnotationPropertyExpression value);

} // AnnotationAxiom
