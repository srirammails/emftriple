/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataPropertyRange#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataPropertyRange#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataPropertyRange()
 * @model
 * @generated
 */
public interface DataPropertyRange extends DataPropertyAxiom {
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
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyRange_Property()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyRange#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyRange_Range()
	 * @model containment="true"
	 * @generated
	 */
	DataRange getRange();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyRange#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DataRange value);

} // DataPropertyRange
