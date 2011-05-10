/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.social.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.social.network.SocialNetwork#getName <em>Name</em>}</li>
 *   <li>{@link org.social.network.SocialNetwork#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.social.network.NetworkPackage#getSocialNetwork()
 * @model annotation="Entity uri='http://xmlns.com/foaf/0.1/Organization'"
 * @generated
 */
public interface SocialNetwork extends EObject {
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
	 * @see org.social.network.NetworkPackage#getSocialNetwork_Name()
	 * @model annotation="Id base='http://eclipselabs.org/social/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.social.network.SocialNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.social.network.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.social.network.NetworkPackage#getSocialNetwork_Members()
	 * @model containment="true"
	 *        annotation="rdf uri='http://xmlns.com/foaf/0.1/member'"
	 * @generated
	 */
	EList<Person> getMembers();

} // SocialNetwork
