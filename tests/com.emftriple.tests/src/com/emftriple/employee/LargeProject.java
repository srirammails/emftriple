/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.employee;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Large Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.employee.LargeProject#getBudget <em>Budget</em>}</li>
 *   <li>{@link com.emftriple.employee.LargeProject#getMilestone <em>Milestone</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.employee.EmployeePackage#getLargeProject()
 * @model
 * @generated
 */
public interface LargeProject extends Project {
	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #setBudget(double)
	 * @see com.emftriple.employee.EmployeePackage#getLargeProject_Budget()
	 * @model
	 * @generated
	 */
	double getBudget();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.LargeProject#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(double value);

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Milestone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' attribute.
	 * @see #setMilestone(Date)
	 * @see com.emftriple.employee.EmployeePackage#getLargeProject_Milestone()
	 * @model
	 * @generated
	 */
	Date getMilestone();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.LargeProject#getMilestone <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' attribute.
	 * @see #getMilestone()
	 * @generated
	 */
	void setMilestone(Date value);

} // LargeProject
