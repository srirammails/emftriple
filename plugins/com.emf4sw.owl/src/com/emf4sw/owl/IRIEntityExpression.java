/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRI Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.IRIEntityExpression#getIRI <em>IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getIRIEntityExpression()
 * @model
 * @generated
 */
public interface IRIEntityExpression extends EntityExpression {
	/**
	 * Returns the value of the '<em><b>IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRI</em>' attribute.
	 * @see #setIRI(String)
	 * @see com.emf4sw.owl.OWLPackage#getIRIEntityExpression_IRI()
	 * @model required="true"
	 * @generated
	 */
	String getIRI();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.IRIEntityExpression#getIRI <em>IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRI</em>' attribute.
	 * @see #getIRI()
	 * @generated
	 */
	void setIRI(String value);

} // IRIEntityExpression
