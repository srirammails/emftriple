/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface ObjectPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property</em>' containment reference.
	 * @see #setObjectProperty(ObjectPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyAssertion_ObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectPropertyExpression getObjectProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property</em>' containment reference.
	 * @see #getObjectProperty()
	 * @generated
	 */
	void setObjectProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Source Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Individual</em>' containment reference.
	 * @see #setSourceIndividual(Individual)
	 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyAssertion_SourceIndividual()
	 * @model containment="true"
	 * @generated
	 */
	Individual getSourceIndividual();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Individual</em>' containment reference.
	 * @see #getSourceIndividual()
	 * @generated
	 */
	void setSourceIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Target Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Individual</em>' containment reference.
	 * @see #setTargetIndividual(Individual)
	 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyAssertion_TargetIndividual()
	 * @model containment="true"
	 * @generated
	 */
	Individual getTargetIndividual();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Individual</em>' containment reference.
	 * @see #getTargetIndividual()
	 * @generated
	 */
	void setTargetIndividual(Individual value);

} // ObjectPropertyAssertion
