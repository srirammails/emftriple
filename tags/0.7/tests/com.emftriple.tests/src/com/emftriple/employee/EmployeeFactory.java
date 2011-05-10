/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.employee;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.employee.EmployeePackage
 * @generated
 */
public interface EmployeeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeeFactory eINSTANCE = com.emftriple.employee.impl.EmployeeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Small Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Project</em>'.
	 * @generated
	 */
	SmallProject createSmallProject();

	/**
	 * Returns a new object of class '<em>Large Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Project</em>'.
	 * @generated
	 */
	LargeProject createLargeProject();

	/**
	 * Returns a new object of class '<em>Phone Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone Number</em>'.
	 * @generated
	 */
	PhoneNumber createPhoneNumber();

	/**
	 * Returns a new object of class '<em>Job Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Title</em>'.
	 * @generated
	 */
	JobTitle createJobTitle();

	/**
	 * Returns a new object of class '<em>Employment Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employment Period</em>'.
	 * @generated
	 */
	EmploymentPeriod createEmploymentPeriod();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Email Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Address</em>'.
	 * @generated
	 */
	EmailAddress createEmailAddress();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmployeePackage getEmployeePackage();

} //EmployeeFactory
