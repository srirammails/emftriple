/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf4sw.network;

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
 *   <li>{@link emf4sw.network.SocialNetwork#getName <em>Name</em>}</li>
 *   <li>{@link emf4sw.network.SocialNetwork#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf4sw.network.NetworkPackage#getSocialNetwork()
 * @model
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
	 * @see emf4sw.network.NetworkPackage#getSocialNetwork_Name()
	 * @model annotation="Id base='http://eclipselabs.org/social/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf4sw.network.SocialNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link emf4sw.network.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see emf4sw.network.NetworkPackage#getSocialNetwork_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

} // SocialNetwork
