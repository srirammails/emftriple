/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.SubDataPropertyOf#getSubDataProperty <em>Sub Data Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.SubDataPropertyOf#getSuperDataProperty <em>Super Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getSubDataPropertyOf()
 * @model
 * @generated
 */
public interface SubDataPropertyOf extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Data Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Data Property</em>' containment reference.
	 * @see #setSubDataProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubDataPropertyOf_SubDataProperty()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getSubDataProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubDataPropertyOf#getSubDataProperty <em>Sub Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Data Property</em>' containment reference.
	 * @see #getSubDataProperty()
	 * @generated
	 */
	void setSubDataProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Super Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Data Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Data Property</em>' containment reference.
	 * @see #setSuperDataProperty(DataPropertyExpression)
	 * @see com.emf4sw.owl.OWLPackage#getSubDataPropertyOf_SuperDataProperty()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getSuperDataProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.SubDataPropertyOf#getSuperDataProperty <em>Super Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Data Property</em>' containment reference.
	 * @see #getSuperDataProperty()
	 * @generated
	 */
	void setSuperDataProperty(DataPropertyExpression value);

} // SubDataPropertyOf
