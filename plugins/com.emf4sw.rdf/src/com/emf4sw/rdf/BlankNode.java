/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.BlankNode#getNodeID <em>Node ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getBlankNode()
 * @model
 * @generated
 */
public interface BlankNode extends Node {
	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see com.emf4sw.rdf.RDFPackage#getBlankNode_NodeID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.BlankNode#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // BlankNode
