/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.PrefixEntityExpression#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.emf4sw.owl.PrefixEntityExpression#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getPrefixEntityExpression()
 * @model
 * @generated
 */
public interface PrefixEntityExpression extends EntityExpression {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see com.emf4sw.owl.OWLPackage#getPrefixEntityExpression_Namespace()
	 * @model required="true"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.PrefixEntityExpression#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

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
	 * @see com.emf4sw.owl.OWLPackage#getPrefixEntityExpression_Reference()
	 * @model required="true"
	 * @generated
	 */
	Entity getReference();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.PrefixEntityExpression#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Entity value);

} // PrefixEntityExpression
