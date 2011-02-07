/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.employee;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employment Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.employee.EmploymentPeriod#getId <em>Id</em>}</li>
 *   <li>{@link com.emftriple.employee.EmploymentPeriod#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.emftriple.employee.EmploymentPeriod#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.employee.EmployeePackage#getEmploymentPeriod()
 * @model
 * @generated
 */
public interface EmploymentPeriod extends EObject {
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
	 * @see com.emftriple.employee.EmployeePackage#getEmploymentPeriod_Id()
	 * @model annotation="etriple.Id base='http://www.example.com/periods/'"
	 *        annotation="etriple.GeneratedValue strategy='DEFAULT'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmploymentPeriod#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see com.emftriple.employee.EmployeePackage#getEmploymentPeriod_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmploymentPeriod#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see com.emftriple.employee.EmployeePackage#getEmploymentPeriod_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.EmploymentPeriod#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // EmploymentPeriod
