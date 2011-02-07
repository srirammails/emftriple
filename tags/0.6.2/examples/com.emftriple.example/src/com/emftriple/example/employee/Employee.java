/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.Employee#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getGender <em>Gender</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getVersion <em>Version</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getPeriod <em>Period</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getAddress <em>Address</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getJobTitle <em>Job Title</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getManager <em>Manager</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getManagedEmployees <em>Managed Employees</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getProjects <em>Projects</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Employee#getEmailAddresses <em>Email Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.example.employee.EmployeePackage#getEmployee()
 * @model annotation="etriple.CompositeId base='http://www.example.com/employees/[firstname]_[lastname]'"
 *        annotation="etriple.NamedQuery name='findEmployeeByName' queryString='SELECT e FROM Employee e WHERE e.firstName = :first AND e.lastName = :last'"
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link com.emftriple.example.employee.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see com.emftriple.example.employee.Gender
	 * @see #setGender(Gender)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see com.emftriple.example.employee.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Salary()
	 * @model
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(long)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Version()
	 * @model
	 * @generated
	 */
	long getVersion();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(long value);

	/**
	 * Returns the value of the '<em><b>Responsibilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibilities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibilities</em>' attribute list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Responsibilities()
	 * @model
	 * @generated
	 */
	EList<String> getResponsibilities();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(EmploymentPeriod)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Period()
	 * @model containment="true"
	 * @generated
	 */
	EmploymentPeriod getPeriod();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(EmploymentPeriod value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Job Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Title</em>' reference.
	 * @see #setJobTitle(JobTitle)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_JobTitle()
	 * @model
	 * @generated
	 */
	JobTitle getJobTitle();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getJobTitle <em>Job Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Title</em>' reference.
	 * @see #getJobTitle()
	 * @generated
	 */
	void setJobTitle(JobTitle value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.emftriple.example.employee.Employee#getManagedEmployees <em>Managed Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Manager()
	 * @see com.emftriple.example.employee.Employee#getManagedEmployees
	 * @model opposite="managedEmployees"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Employee#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Managed Employees</b></em>' reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.Employee}.
	 * It is bidirectional and its opposite is '{@link com.emftriple.example.employee.Employee#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Employees</em>' reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_ManagedEmployees()
	 * @see com.emftriple.example.employee.Employee#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Employee> getManagedEmployees();

	/**
	 * Returns the value of the '<em><b>Phone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.PhoneNumber}.
	 * It is bidirectional and its opposite is '{@link com.emftriple.example.employee.PhoneNumber#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Numbers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Numbers</em>' containment reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_PhoneNumbers()
	 * @see com.emftriple.example.employee.PhoneNumber#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<PhoneNumber> getPhoneNumbers();

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.Degree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Degrees()
	 * @model
	 * @generated
	 */
	EList<Degree> getDegrees();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_Projects()
	 * @model
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Email Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.EmailAddress}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Addresses</em>' containment reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getEmployee_EmailAddresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmailAddress> getEmailAddresses();

} // Employee
