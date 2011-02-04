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
 * A representation of the model object '<em><b>Job Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.employee.JobTitle#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.employee.EmployeePackage#getJobTitle()
 * @model
 * @generated
 */
public interface JobTitle extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.emftriple.employee.EmployeePackage#getJobTitle_Title()
	 * @model annotation="etriple.Id base='http://www.example.com/jobs/'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.emftriple.employee.JobTitle#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // JobTitle
