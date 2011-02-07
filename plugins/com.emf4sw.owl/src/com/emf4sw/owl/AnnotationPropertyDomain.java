/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.AnnotationPropertyDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getAnnotationPropertyDomain()
 * @model
 * @generated
 */
public interface AnnotationPropertyDomain extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(EntityExpression)
	 * @see com.emf4sw.owl.OWLPackage#getAnnotationPropertyDomain_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EntityExpression getDomain();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.AnnotationPropertyDomain#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EntityExpression value);

} // AnnotationPropertyDomain
