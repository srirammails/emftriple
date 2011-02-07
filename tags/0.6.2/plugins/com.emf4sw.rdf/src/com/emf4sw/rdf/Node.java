/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Node#getComment <em>Comment</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Node#getSubjectOf <em>Subject Of</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Node#getObjectOf <em>Object Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.emf4sw.rdf.RDFPackage#getNode_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Node#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.emf4sw.rdf.RDFPackage#getNode_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Node#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Subject Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Triple}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Triple#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Of</em>' reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getNode_SubjectOf()
	 * @see com.emf4sw.rdf.Triple#getSubject
	 * @model opposite="subject"
	 * @generated
	 */
	EList<Triple> getSubjectOf();

	/**
	 * Returns the value of the '<em><b>Object Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Triple}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Triple#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Of</em>' reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getNode_ObjectOf()
	 * @see com.emf4sw.rdf.Triple#getObject
	 * @model opposite="object"
	 * @generated
	 */
	EList<Triple> getObjectOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isTypeOf(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Node> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String getStringValue(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> getValues(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getURIValues(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> getObject(String uri);

} // Node
