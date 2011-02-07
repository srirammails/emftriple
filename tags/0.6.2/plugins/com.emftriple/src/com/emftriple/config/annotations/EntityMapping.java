/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getPackage <em>Package</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getSchema <em>Schema</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getAccess <em>Access</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.EntityMapping#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping()
 * @model extendedMetaData="name='entity-mappings' kind='elementOnly'"
 * @generated
 */
public interface EntityMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Metadata</em>' containment reference.
	 * @see #setPersistenceUnitMetadata(PersistenceUnitMetadata)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_PersistenceUnitMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-unit-metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceUnitMetadata getPersistenceUnitMetadata();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit Metadata</em>' containment reference.
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	void setPersistenceUnitMetadata(PersistenceUnitMetadata value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Package()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link com.emftriple.config.annotations.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see com.emftriple.config.annotations.AccessType
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #setAccess(AccessType)
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Access()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='access' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccess();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see com.emftriple.config.annotations.AccessType
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessType value);

	/**
	 * Unsets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccess()
	 * @see #getAccess()
	 * @see #setAccess(AccessType)
	 * @generated
	 */
	void unsetAccess();

	/**
	 * Returns whether the value of the '{@link com.emftriple.config.annotations.EntityMapping#getAccess <em>Access</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access</em>' attribute is set.
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @see #setAccess(AccessType)
	 * @generated
	 */
	boolean isSetAccess();

	/**
	 * Returns the value of the '<em><b>Named Query</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.annotations.NamedQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Query</em>' containment reference list.
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_NamedQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-query' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedQueryType> getNamedQuery();

	/**
	 * Returns the value of the '<em><b>Named Native Query</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.annotations.NamedNativeQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Native Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Native Query</em>' containment reference list.
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_NamedNativeQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-native-query' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedNativeQueryType> getNamedNativeQuery();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link com.emftriple.config.annotations.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getEntity();

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
	 * @see com.emftriple.config.annotations.OTMPackage#getEntityMapping_Version()
	 * @model default="2.0" unsettable="true" dataType="com.emftriple.config.annotations.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link com.emftriple.config.annotations.EntityMapping#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.emftriple.config.annotations.EntityMapping#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // EntityMapping
