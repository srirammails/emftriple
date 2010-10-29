/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.Axiom#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.emf4sw.owl.Axiom#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getAxiom()
 * @model abstract="true"
 * @generated
 */
public interface Axiom extends EObject {

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getAxiom_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.owl.Ontology#getAxioms <em>Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see #setOntology(Ontology)
	 * @see com.emf4sw.owl.OWLPackage#getAxiom_Ontology()
	 * @see com.emf4sw.owl.Ontology#getAxioms
	 * @model opposite="axioms" required="true"
	 * @generated
	 */
	Ontology getOntology();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.Axiom#getOntology <em>Ontology</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' container reference.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(Ontology value);

} // Axiom
