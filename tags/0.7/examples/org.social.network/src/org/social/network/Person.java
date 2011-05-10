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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.social.network.Person#getId <em>Id</em>}</li>
 *   <li>{@link org.social.network.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.social.network.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.social.network.Person#getKnows <em>Knows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.social.network.NetworkPackage#getPerson()
 * @model annotation="Entity uri='http://xmlns.com/foaf/0.1/Person'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.social.network.NetworkPackage#getPerson_Id()
	 * @model annotation="Id base='http://eclipselabs.org/social/people/'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.social.network.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see org.social.network.NetworkPackage#getPerson_FirstName()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/firstName'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.social.network.Person#getFirstName <em>First Name</em>}' attribute.
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
	 * @see org.social.network.NetworkPackage#getPerson_LastName()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/lastName'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.social.network.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Knows</b></em>' reference list.
	 * The list contents are of type {@link org.social.network.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knows</em>' reference list.
	 * @see org.social.network.NetworkPackage#getPerson_Knows()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/knows'"
	 * @generated
	 */
	EList<Person> getKnows();

} // Person
