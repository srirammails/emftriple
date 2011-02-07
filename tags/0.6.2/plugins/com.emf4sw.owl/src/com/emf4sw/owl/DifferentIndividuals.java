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
 * A representation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DifferentIndividuals#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDifferentIndividuals()
 * @model
 * @generated
 */
public interface DifferentIndividuals extends Assertion {
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
	 * @see com.emf4sw.owl.OWLPackage#getDifferentIndividuals_Individuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

} // DifferentIndividuals
