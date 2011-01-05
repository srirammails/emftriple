/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.semweb.jobs.Job#getId <em>Id</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getTitle <em>Title</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getSkills <em>Skills</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getPosted <em>Posted</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getType <em>Type</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link com.semweb.jobs.Job#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.semweb.jobs.JOBPackage#getJob()
 * @model annotation="DataSet name='http://default'"
 *        annotation="Entity uri='http://www.semweb.com/jobs#Job'"
 * @generated
 */
public interface Job extends EObject {
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
	 * @see com.semweb.jobs.JOBPackage#getJob_Id()
	 * @model required="true"
	 *        annotation="Id base='http://www.semweb.com/jobs/'"
	 *        annotation="GeneratedValue strategy='DEFAULT'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see com.semweb.jobs.JOBPackage#getJob_Title()
	 * @model annotation="rdf uri='http://purl.org/dc/elements/1.1/title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see com.semweb.jobs.JOBPackage#getJob_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute.
	 * @see #setRequirements(String)
	 * @see com.semweb.jobs.JOBPackage#getJob_Requirements()
	 * @model
	 * @generated
	 */
	String getRequirements();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getRequirements <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' attribute.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' attribute.
	 * @see #setSkills(String)
	 * @see com.semweb.jobs.JOBPackage#getJob_Skills()
	 * @model
	 * @generated
	 */
	String getSkills();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getSkills <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skills</em>' attribute.
	 * @see #getSkills()
	 * @generated
	 */
	void setSkills(String value);

	/**
	 * Returns the value of the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted</em>' attribute.
	 * @see #setPosted(Date)
	 * @see com.semweb.jobs.JOBPackage#getJob_Posted()
	 * @model required="true"
	 * @generated
	 */
	Date getPosted();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getPosted <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted</em>' attribute.
	 * @see #getPosted()
	 * @generated
	 */
	void setPosted(Date value);

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
	 * @see com.semweb.jobs.JOBPackage#getJob_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(Organisation)
	 * @see com.semweb.jobs.JOBPackage#getJob_Organisation()
	 * @model required="true"
	 *        annotation="rdf uri='http://www.semweb.com/jobs#organisation'"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Place)
	 * @see com.semweb.jobs.JOBPackage#getJob_Location()
	 * @model required="true"
	 *        annotation="rdf uri='http://www.semweb.com/jobboard#location'"
	 * @generated
	 */
	Place getLocation();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Job#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Place value);

} // Job
