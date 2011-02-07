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
 * A representation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataSomeValuesFrom#getOnProperties <em>On Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom()
 * @model
 * @generated
 */
public interface DataSomeValuesFrom extends DataPropertyRestriction {
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
	 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom_OnProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPropertyExpression> getOnProperties();

	/**
	 * Returns the value of the '<em><b>Some Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Values From</em>' containment reference.
	 * @see #setSomeValuesFrom(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom_SomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataRange getSomeValuesFrom();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Values From</em>' containment reference.
	 * @see #getSomeValuesFrom()
	 * @generated
	 */
	void setSomeValuesFrom(DataRange value);

} // DataSomeValuesFrom
