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
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.PersistenceConfig#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.PersistenceConfig#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.config.persistence.PersistencePackage#getPersistenceConfig()
 * @model extendedMetaData="name='persistence' kind='elementOnly'"
 * @generated
 */
public interface PersistenceConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.persistence.PersistenceUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' containment reference list.
	 * @see com.emftriple.config.persistence.PersistencePackage#getPersistenceConfig_PersistenceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persistence-unit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersistenceUnit> getPersistenceUnit();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see com.emftriple.config.persistence.PersistencePackage#getPersistenceConfig_Version()
	 * @model default="2.0" unsettable="true" dataType="com.emftriple.config.persistence.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.emftriple.config.persistence.PersistenceConfig#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link com.emftriple.config.persistence.PersistenceConfig#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.emftriple.config.persistence.PersistenceConfig#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // PersistenceConfig
