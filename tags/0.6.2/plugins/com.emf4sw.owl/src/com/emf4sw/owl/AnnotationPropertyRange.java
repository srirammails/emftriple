/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.AnnotationPropertyRange#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getAnnotationPropertyRange()
 * @model
 * @generated
 */
public interface AnnotationPropertyRange extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(EntityExpression)
	 * @see com.emf4sw.owl.OWLPackage#getAnnotationPropertyRange_Range()
	 * @model containment="true"
	 * @generated
	 */
	EntityExpression getRange();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.AnnotationPropertyRange#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(EntityExpression value);

} // AnnotationPropertyRange
