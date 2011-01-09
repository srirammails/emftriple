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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.example.employee.Project#getTeamLeader <em>Team Leader</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.example.employee.EmployeePackage#getProject()
 * @model abstract="true"
 *        annotation="etriple.NamedQuery name='findProjectByName' queryString='SELECT p FROM Project p WHERE p.name = :name'"
 * @generated
 */
public interface Project extends EObject {
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
	 * @see com.emftriple.example.employee.EmployeePackage#getProject_Name()
	 * @model annotation="etriple.Id base='http://www.example.com/projects/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.emftriple.example.employee.EmployeePackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Team Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Leader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Leader</em>' reference.
	 * @see #setTeamLeader(Employee)
	 * @see com.emftriple.example.employee.EmployeePackage#getProject_TeamLeader()
	 * @model
	 * @generated
	 */
	Employee getTeamLeader();

	/**
	 * Sets the value of the '{@link com.emftriple.example.employee.Project#getTeamLeader <em>Team Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Leader</em>' reference.
	 * @see #getTeamLeader()
	 * @generated
	 */
	void setTeamLeader(Employee value);

} // Project
