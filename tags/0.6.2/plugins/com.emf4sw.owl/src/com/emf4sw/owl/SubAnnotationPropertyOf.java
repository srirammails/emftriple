/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getSubAnnotationPropertyOf()
 * @model
 * @generated
 */
public interface SubAnnotationPropertyOf extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Annotation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Annotation Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Annotation Property</em>' containment reference.
	 * @see #setSubAnnotationProperty(AnnotationPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubAnnotationPropertyOf_SubAnnotationProperty()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationPropertyExpression getSubAnnotationProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Annotation Property</em>' containment reference.
	 * @see #getSubAnnotationProperty()
	 * @generated
	 */
	void setSubAnnotationProperty(AnnotationPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Super Annotation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Annotation Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Annotation Property</em>' containment reference.
	 * @see #setSuperAnnotationProperty(AnnotationPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubAnnotationPropertyOf_SuperAnnotationProperty()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationPropertyExpression getSuperAnnotationProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Annotation Property</em>' containment reference.
	 * @see #getSuperAnnotationProperty()
	 * @generated
	 */
	void setSuperAnnotationProperty(AnnotationPropertyExpression value);

} // SubAnnotationPropertyOf
