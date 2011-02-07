/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.Properties#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.config.persistence.PersistencePackage#getProperties()
 * @model extendedMetaData="name='properties_._type' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.persistence.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.emftriple.config.persistence.PersistencePackage#getProperties_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperties();

} // Properties
