/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.Declaration#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Axiom {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see com.emf4sw.owl.OWLPackage#getDeclaration_Entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.Declaration#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Declaration
