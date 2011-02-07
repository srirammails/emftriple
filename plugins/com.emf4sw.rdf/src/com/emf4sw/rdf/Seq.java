/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Seq#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getSeq()
 * @model
 * @generated
 */
public interface Seq extends BlankNode {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getSeq_Elements()
	 * @model
	 * @generated
	 */
	EList<Node> getElements();

} // Seq
