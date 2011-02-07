/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Data Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.EquivalentDataProperties#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.EquivalentDataProperties#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getEquivalentDataProperties()
 * @model
 * @generated
 */
public interface EquivalentDataProperties extends DataPropertyAxiom {
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
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentDataProperties_Property()
	 * @model containment="true"
	 * @generated
	 */
	DataPropertyExpression getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.EquivalentDataProperties#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getEquivalentDataProperties_EquivalentProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPropertyExpression> getEquivalentProperties();

} // EquivalentDataProperties
