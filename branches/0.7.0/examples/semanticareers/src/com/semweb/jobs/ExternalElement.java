/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.semweb.jobs.ExternalElement#getName <em>Name</em>}</li>
 *   <li>{@link com.semweb.jobs.ExternalElement#getDescription <em>Description</em>}</li>
 *   <li>{@link com.semweb.jobs.ExternalElement#getWikiPage <em>Wiki Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.semweb.jobs.JOBPackage#getExternalElement()
 * @model abstract="true"
 * @generated
 */
public interface ExternalElement extends EObject {
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
	 * @see com.semweb.jobs.JOBPackage#getExternalElement_Name()
	 * @model required="true"
	 *        annotation="Id base='http://dbpedia.org/resource/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.ExternalElement#getName <em>Name</em>}' attribute.
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
	 * @see com.semweb.jobs.JOBPackage#getExternalElement_Description()
	 * @model annotation="rdf uri='http://www.w3.org/2000/01/rdf-schema#comment' lang='en'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.ExternalElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Wiki Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiki Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Page</em>' attribute.
	 * @see #setWikiPage(String)
	 * @see com.semweb.jobs.JOBPackage#getExternalElement_WikiPage()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/page'"
	 * @generated
	 */
	String getWikiPage();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.ExternalElement#getWikiPage <em>Wiki Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Page</em>' attribute.
	 * @see #getWikiPage()
	 * @generated
	 */
	void setWikiPage(String value);

} // ExternalElement
