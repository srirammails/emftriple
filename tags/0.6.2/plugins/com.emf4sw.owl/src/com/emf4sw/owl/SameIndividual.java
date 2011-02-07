/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.SameIndividual#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getSameIndividual()
 * @model
 * @generated
 */
public interface SameIndividual extends Assertion {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getSameIndividual_Individuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

} // SameIndividual
