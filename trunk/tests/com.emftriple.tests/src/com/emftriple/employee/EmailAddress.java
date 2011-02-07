/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.employee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.employee.EmailAddress#getId <em>Id</em>}</li>
 *   <li>{@link com.emftriple.employee.EmailAddress#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.employee.EmailAddress#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.employee.EmployeePackage#getEmailAddress()
 * @model annotation="etriple.NamedQuery name='findEmailByAddress' queryString='SELECT e FROM EmailAddress e WHERE e.address = :address'"
 * @generated
 */
public interface EmailAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.emftriple.employee.EmployeePackage#getEmailAddress_Id()
	 * @model annotation="etriple.Id base='http://www.example.com/mails/'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmailAddress#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.emftriple.employee.EmployeePackage#getEmailAddress_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmailAddress#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.emftriple.employee.EmployeePackage#getEmailAddress_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmailAddress#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // EmailAddress
