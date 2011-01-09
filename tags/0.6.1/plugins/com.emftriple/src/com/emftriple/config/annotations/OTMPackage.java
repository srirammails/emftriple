/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.emftriple.config.annotations.OTMFactory
 * @model kind="package"
 * @generated
 */
public interface OTMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftriple.com/xml/ns/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OTMPackage eINSTANCE = com.emftriple.config.annotations.impl.OTMPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.EntityMappingImpl <em>Entity Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.EntityMappingImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getEntityMapping()
	 * @generated
	 */
	int ENTITY_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__NAMED_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__NAMED_NATIVE_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Entity Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPING_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.EntityTypeImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.QueryTypeImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.NamedQueryTypeImpl <em>Named Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.NamedQueryTypeImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getNamedQueryType()
	 * @generated
	 */
	int NAMED_QUERY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_TYPE__NAME = QUERY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_TYPE__DESCRIPTION = QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_TYPE__QUERY = QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_TYPE_FEATURE_COUNT = QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl <em>Named Native Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getNamedNativeQueryType()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE__NAME = QUERY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE__DESCRIPTION = QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE__QUERY = QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS = QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING = QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Named Native Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_TYPE_FEATURE_COUNT = QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.impl.PersistenceUnitMetadataImpl
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getPersistenceUnitMetadata()
	 * @generated
	 */
	int PERSISTENCE_UNIT_METADATA = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emftriple.config.annotations.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.annotations.AccessType
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 6;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.EntityMapping <em>Entity Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Mapping</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping
	 * @generated
	 */
	EClass getEntityMapping();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getDescription()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.config.annotations.EntityMapping#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getPersistenceUnitMetadata()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EReference getEntityMapping_PersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getPackage()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Package();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getSchema()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Schema();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getCatalog()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getAccess()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Access();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.annotations.EntityMapping#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getNamedQuery()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EReference getEntityMapping_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.annotations.EntityMapping#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getNamedNativeQuery()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EReference getEntityMapping_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.annotations.EntityMapping#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getEntity()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EReference getEntityMapping_Entity();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityMapping#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.emftriple.config.annotations.EntityMapping#getVersion()
	 * @see #getEntityMapping()
	 * @generated
	 */
	EAttribute getEntityMapping_Version();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see com.emftriple.config.annotations.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.config.annotations.EntityType#getName()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.emftriple.config.annotations.EntityType#getClass_()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Class();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.EntityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.annotations.EntityType#getDescription()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Description();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see com.emftriple.config.annotations.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.QueryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.config.annotations.QueryType#getName()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Name();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.NamedQueryType <em>Named Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query Type</em>'.
	 * @see com.emftriple.config.annotations.NamedQueryType
	 * @generated
	 */
	EClass getNamedQueryType();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedQueryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.annotations.NamedQueryType#getDescription()
	 * @see #getNamedQueryType()
	 * @generated
	 */
	EAttribute getNamedQueryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedQueryType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.emftriple.config.annotations.NamedQueryType#getQuery()
	 * @see #getNamedQueryType()
	 * @generated
	 */
	EAttribute getNamedQueryType_Query();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.NamedNativeQueryType <em>Named Native Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query Type</em>'.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType
	 * @generated
	 */
	EClass getNamedNativeQueryType();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedNativeQueryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType#getDescription()
	 * @see #getNamedNativeQueryType()
	 * @generated
	 */
	EAttribute getNamedNativeQueryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedNativeQueryType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType#getQuery()
	 * @see #getNamedNativeQueryType()
	 * @generated
	 */
	EAttribute getNamedNativeQueryType_Query();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType#getResultClass()
	 * @see #getNamedNativeQueryType()
	 * @generated
	 */
	EAttribute getNamedNativeQueryType_ResultClass();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType#getResultSetMapping()
	 * @see #getNamedNativeQueryType()
	 * @generated
	 */
	EAttribute getNamedNativeQueryType_ResultSetMapping();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.annotations.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Metadata</em>'.
	 * @see com.emftriple.config.annotations.PersistenceUnitMetadata
	 * @generated
	 */
	EClass getPersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.annotations.PersistenceUnitMetadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.annotations.PersistenceUnitMetadata#getDescription()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EAttribute getPersistenceUnitMetadata_Description();

	/**
	 * Returns the meta object for enum '{@link com.emftriple.config.annotations.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see com.emftriple.config.annotations.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OTMFactory getOTMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.EntityMappingImpl <em>Entity Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.EntityMappingImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getEntityMapping()
		 * @generated
		 */
		EClass ENTITY_MAPPING = eINSTANCE.getEntityMapping();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__DESCRIPTION = eINSTANCE.getEntityMapping_Description();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA = eINSTANCE.getEntityMapping_PersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__PACKAGE = eINSTANCE.getEntityMapping_Package();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__SCHEMA = eINSTANCE.getEntityMapping_Schema();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__CATALOG = eINSTANCE.getEntityMapping_Catalog();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__ACCESS = eINSTANCE.getEntityMapping_Access();

		/**
		 * The meta object literal for the '<em><b>Named Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPING__NAMED_QUERY = eINSTANCE.getEntityMapping_NamedQuery();

		/**
		 * The meta object literal for the '<em><b>Named Native Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPING__NAMED_NATIVE_QUERY = eINSTANCE.getEntityMapping_NamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPING__ENTITY = eINSTANCE.getEntityMapping_Entity();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPING__VERSION = eINSTANCE.getEntityMapping_Version();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.EntityTypeImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__NAME = eINSTANCE.getEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__CLASS = eINSTANCE.getEntityType_Class();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__DESCRIPTION = eINSTANCE.getEntityType_Description();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.QueryTypeImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getQueryType()
		 * @generated
		 */
		EClass QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__NAME = eINSTANCE.getQueryType_Name();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.NamedQueryTypeImpl <em>Named Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.NamedQueryTypeImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getNamedQueryType()
		 * @generated
		 */
		EClass NAMED_QUERY_TYPE = eINSTANCE.getNamedQueryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY_TYPE__DESCRIPTION = eINSTANCE.getNamedQueryType_Description();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY_TYPE__QUERY = eINSTANCE.getNamedQueryType_Query();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl <em>Named Native Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getNamedNativeQueryType()
		 * @generated
		 */
		EClass NAMED_NATIVE_QUERY_TYPE = eINSTANCE.getNamedNativeQueryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY_TYPE__DESCRIPTION = eINSTANCE.getNamedNativeQueryType_Description();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY_TYPE__QUERY = eINSTANCE.getNamedNativeQueryType_Query();

		/**
		 * The meta object literal for the '<em><b>Result Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS = eINSTANCE.getNamedNativeQueryType_ResultClass();

		/**
		 * The meta object literal for the '<em><b>Result Set Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING = eINSTANCE.getNamedNativeQueryType_ResultSetMapping();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.impl.PersistenceUnitMetadataImpl
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getPersistenceUnitMetadata()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT_METADATA = eINSTANCE.getPersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_METADATA__DESCRIPTION = eINSTANCE.getPersistenceUnitMetadata_Description();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.annotations.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.annotations.AccessType
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.emftriple.config.annotations.impl.OTMPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //OTMPackage
