/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Max Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getOnDataRange <em>On Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality()
 * @model
 * @generated
 */
public interface DataMaxCardinality extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Property</em>' containment reference.
	 * @see #setOnProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_OnProperty()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getOnProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getOnProperty <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Property</em>' containment reference.
	 * @see #getOnProperty()
	 * @generated
	 */
	void setOnProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_Cardinality()
	 * @model
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>On Data Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Data Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Data Range</em>' containment reference.
	 * @see #setOnDataRange(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_OnDataRange()
	 * @model containment="true"
	 * @generated
	 */
	DataRange getOnDataRange();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getOnDataRange <em>On Data Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Data Range</em>' containment reference.
	 * @see #getOnDataRange()
	 * @generated
	 */
	void setOnDataRange(DataRange value);

} // DataMaxCardinality
