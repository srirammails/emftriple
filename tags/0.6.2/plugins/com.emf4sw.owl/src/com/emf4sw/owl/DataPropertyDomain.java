/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataPropertyDomain#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataPropertyDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataPropertyDomain()
 * @model
 * @generated
 */
public interface DataPropertyDomain extends DataPropertyAxiom {
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
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyDomain_Property()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyDomain#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getDataPropertyDomain_Domain()
	 * @model containment="true"
	 * @generated
	 */
	ClassExpression getDomain();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataPropertyDomain#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ClassExpression value);

} // DataPropertyDomain
