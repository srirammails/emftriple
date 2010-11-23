/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Quad#getContextGraph <em>Context Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getQuad()
 * @model
 * @generated
 */
public interface Quad extends Triple {
	/**
	 * Returns the value of the '<em><b>Context Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Graph</em>' reference.
	 * @see #setContextGraph(RDFGraph)
	 * @see com.emf4sw.rdf.RDFPackage#getQuad_ContextGraph()
	 * @model required="true"
	 * @generated
	 */
	RDFGraph getContextGraph();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Quad#getContextGraph <em>Context Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Graph</em>' reference.
	 * @see #getContextGraph()
	 * @generated
	 */
	void setContextGraph(RDFGraph value);

} // Quad
