/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Prefix Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.NoPrefixEntityExpression#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getNoPrefixEntityExpression()
 * @model
 * @generated
 */
public interface NoPrefixEntityExpression extends EntityExpression {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Entity)
	 * @see com.emf4sw.owl.OWLPackage#getNoPrefixEntityExpression_Reference()
	 * @model required="true"
	 * @generated
	 */
	Entity getReference();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.NoPrefixEntityExpression#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Entity value);

} // NoPrefixEntityExpression
