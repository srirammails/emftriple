/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.PhoneNumber#getNumber <em>Number</em>}</li>
 *   <li>{@link com.emftriple.example.employee.PhoneNumber#getType <em>Type</em>}</li>
 *   <li>{@link com.emftriple.example.employee.PhoneNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link com.emftriple.example.employee.PhoneNumber#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.example.employee.EmployeePackage#getPhoneNumber()
 * @model
 * @generated
 */
public interface PhoneNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getPhoneNumber_Number()
	 * @model annotation="etriple.Id base='http://www.example.com/phones/'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.PhoneNumber#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getPhoneNumber_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.PhoneNumber#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #setAreaCode(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getPhoneNumber_AreaCode()
	 * @model
	 * @generated
	 */
	String getAreaCode();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.PhoneNumber#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #getAreaCode()
	 * @generated
	 */
	void setAreaCode(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.emftriple.example.employee.Employee#getPhoneNumbers <em>Phone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Employee)
	 * @see com.emftriple.example.employee.EmployeePackage#getPhoneNumber_Owner()
	 * @see com.emftriple.example.employee.Employee#getPhoneNumbers
	 * @model opposite="phoneNumbers" required="true" transient="false"
	 * @generated
	 */
	Employee getOwner();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.PhoneNumber#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Employee value);

} // PhoneNumber
