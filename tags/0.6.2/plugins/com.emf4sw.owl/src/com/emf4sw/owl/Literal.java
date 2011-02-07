/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.Literal#getValue <em>Value</em>}</li>
 *   <li>{@link com.emf4sw.owl.Literal#getDatatypeExpression <em>Datatype Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.emf4sw.owl.OWLPackage#getLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Datatype Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Expression</em>' containment reference.
	 * @see #setDatatypeExpression(EntityExpression)
	 * @see com.emf4sw.owl.OWLPackage#getLiteral_DatatypeExpression()
	 * @model containment="true"
	 * @generated
	 */
	EntityExpression getDatatypeExpression();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.Literal#getDatatypeExpression <em>Datatype Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Expression</em>' containment reference.
	 * @see #getDatatypeExpression()
	 * @generated
	 */
	void setDatatypeExpression(EntityExpression value);
	

} // Literal
