/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.owl.DatatypeDefinition#getRestriction <em>Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition()
 * @model
 * @generated
 */
public interface DatatypeDefinition extends Axiom {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	DataRange getDatatype();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataRange value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(DatatypeRestriction)
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	DatatypeRestriction getRestriction();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DatatypeDefinition#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(DatatypeRestriction value);

} // DatatypeDefinition
