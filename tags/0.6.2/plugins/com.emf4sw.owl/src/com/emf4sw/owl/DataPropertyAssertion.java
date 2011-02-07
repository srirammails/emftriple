/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataPropertyAssertion#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataPropertyAssertion#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataPropertyAssertion()
 * @model
 * @generated
 */
public interface DataPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property</em>' containment reference.
	 * @see #setDataProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyAssertion_DataProperty()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getDataProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyAssertion#getDataProperty <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property</em>' containment reference.
	 * @see #getDataProperty()
	 * @generated
	 */
	void setDataProperty(DataPropertyExpression value);

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
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyAssertion_SourceIndividual()
	 * @model containment="true"
	 * @generated
	 */
	Individual getSourceIndividual();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Individual</em>' containment reference.
	 * @see #getSourceIndividual()
	 * @generated
	 */
	void setSourceIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' containment reference.
	 * @see #setTargetValue(Literal)
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyAssertion_TargetValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getTargetValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyAssertion#getTargetValue <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' containment reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Literal value);

} // DataPropertyAssertion
