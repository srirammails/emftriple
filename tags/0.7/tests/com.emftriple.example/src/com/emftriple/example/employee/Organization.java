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
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.Organization#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Organization#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Organization#getProjects <em>Projects</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Organization#getJobs <em>Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.example.employee.EmployeePackage#getOrganization()
 * @model annotation="etriple.NamedQuery name='findOrganizationByName' queryString='SELECT o FROM Organization o WHERE o.name = :name'"
 * @generated
 */
public interface Organization extends EObject {
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
	 * @see com.emftriple.example.employee.EmployeePackage#getOrganization_Name()
	 * @model required="true"
	 *        annotation="etriple.Id base='http://www.example.com/organization/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getOrganization_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getOrganization_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.example.employee.JobTitle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.emftriple.example.employee.EmployeePackage#getOrganization_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobTitle> getJobs();

} // Organization
