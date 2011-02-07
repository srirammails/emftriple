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
 * A representation of the model object '<em><b>Data Sources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.DataSources#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.config.persistence.PersistencePackage#getDataSources()
 * @model extendedMetaData="name='datasources_._type' kind='elementOnly'"
 * @generated
 */
public interface DataSources extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.persistence.DataSourceConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference list.
	 * @see com.emftriple.config.persistence.PersistencePackage#getDataSources_DataSources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSourceConfig> getDataSources();

} // DataSources
