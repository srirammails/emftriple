/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.FunctionalDataProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getFunctionalDataProperty()
 * @model
 * @generated
 */
public interface FunctionalDataProperty extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getFunctionalDataProperty_Property()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.FunctionalDataProperty#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataPropertyExpression value);

} // FunctionalDataProperty
