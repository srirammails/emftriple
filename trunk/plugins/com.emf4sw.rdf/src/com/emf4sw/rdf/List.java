/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.List#getFirst <em>First</em>}</li>
 *   <li>{@link com.emf4sw.rdf.List#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getList()
 * @model
 * @generated
 */
public interface List extends BlankNode {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Node)
	 * @see com.emf4sw.rdf.RDFPackage#getList_First()
	 * @model required="true"
	 * @generated
	 */
	Node getFirst();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.List#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Node value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' reference.
	 * @see #setRest(List)
	 * @see com.emf4sw.rdf.RDFPackage#getList_Rest()
	 * @model required="true"
	 * @generated
	 */
	List getRest();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.List#getRest <em>Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(List value);

} // List
