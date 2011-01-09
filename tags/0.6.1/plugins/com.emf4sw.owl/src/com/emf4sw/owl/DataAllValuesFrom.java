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
 * A representation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataAllValuesFrom#getOnProperties <em>On Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom()
 * @model
 * @generated
 */
public interface DataAllValuesFrom extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>On Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom_OnProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPropertyExpression> getOnProperties();

	/**
	 * Returns the value of the '<em><b>All Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Values From</em>' containment reference.
	 * @see #setAllValuesFrom(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom_AllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataRange getAllValuesFrom();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Values From</em>' containment reference.
	 * @see #getAllValuesFrom()
	 * @generated
	 */
	void setAllValuesFrom(DataRange value);

} // DataAllValuesFrom
