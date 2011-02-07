/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.emftriple.config.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftriple.com/xml/ns/persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = com.emftriple.config.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.PersistenceConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.PersistenceConfigImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getPersistenceConfig()
	 * @generated
	 */
	int PERSISTENCE_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG__PERSISTENCE_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.PersistenceUnitImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getPersistenceUnit()
	 * @generated
	 */
	int PERSISTENCE_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__DATA_SOURCES = 5;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.DataSourcesImpl <em>Data Sources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.DataSourcesImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getDataSources()
	 * @generated
	 */
	int DATA_SOURCES = 2;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCES__DATA_SOURCES = 0;

	/**
	 * The number of structural features of the '<em>Data Sources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl <em>Data Source Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.DataSourceConfigImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getDataSourceConfig()
	 * @generated
	 */
	int DATA_SOURCE_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__URL = 3;

	/**
	 * The feature id for the '<em><b>Graphs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__GRAPHS = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG__PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Data Source Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.PropertiesImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emftriple.config.persistence.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.config.persistence.impl.PropertyImpl
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.PersistenceConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see com.emftriple.config.persistence.PersistenceConfig
	 * @generated
	 */
	EClass getPersistenceConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.persistence.PersistenceConfig#getPersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit</em>'.
	 * @see com.emftriple.config.persistence.PersistenceConfig#getPersistenceUnit()
	 * @see #getPersistenceConfig()
	 * @generated
	 */
	EReference getPersistenceConfig_PersistenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.PersistenceConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.emftriple.config.persistence.PersistenceConfig#getVersion()
	 * @see #getPersistenceConfig()
	 * @generated
	 */
	EAttribute getPersistenceConfig_Version();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.PersistenceUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit
	 * @generated
	 */
	EClass getPersistenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.PersistenceUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getName()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.PersistenceUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getDescription()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.PersistenceUnit#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getProvider()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_Provider();

	/**
	 * Returns the meta object for the attribute list '{@link com.emftriple.config.persistence.PersistenceUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Package</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getPackage()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_Package();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.config.persistence.PersistenceUnit#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getProperties()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EReference getPersistenceUnit_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.config.persistence.PersistenceUnit#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Sources</em>'.
	 * @see com.emftriple.config.persistence.PersistenceUnit#getDataSources()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EReference getPersistenceUnit_DataSources();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.DataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sources</em>'.
	 * @see com.emftriple.config.persistence.DataSources
	 * @generated
	 */
	EClass getDataSources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.persistence.DataSources#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sources</em>'.
	 * @see com.emftriple.config.persistence.DataSources#getDataSources()
	 * @see #getDataSources()
	 * @generated
	 */
	EReference getDataSources_DataSources();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.DataSourceConfig <em>Data Source Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Config</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig
	 * @generated
	 */
	EClass getDataSourceConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.DataSourceConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getName()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EAttribute getDataSourceConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.DataSourceConfig#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getFactory()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EAttribute getDataSourceConfig_Factory();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.DataSourceConfig#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getClass_()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EAttribute getDataSourceConfig_Class();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.DataSourceConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getUrl()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EAttribute getDataSourceConfig_Url();

	/**
	 * Returns the meta object for the attribute list '{@link com.emftriple.config.persistence.DataSourceConfig#getGraphs <em>Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Graphs</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getGraphs()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EAttribute getDataSourceConfig_Graphs();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.config.persistence.DataSourceConfig#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emftriple.config.persistence.DataSourceConfig#getProperty()
	 * @see #getDataSourceConfig()
	 * @generated
	 */
	EReference getDataSourceConfig_Property();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see com.emftriple.config.persistence.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.config.persistence.Properties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.emftriple.config.persistence.Properties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Properties();

	/**
	 * Returns the meta object for class '{@link com.emftriple.config.persistence.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.emftriple.config.persistence.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.config.persistence.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.config.persistence.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.emftriple.config.persistence.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

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
	PersistenceFactory getPersistenceFactory();

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
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.PersistenceConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.PersistenceConfigImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getPersistenceConfig()
		 * @generated
		 */
		EClass PERSISTENCE_CONFIG = eINSTANCE.getPersistenceConfig();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_CONFIG__PERSISTENCE_UNIT = eINSTANCE.getPersistenceConfig_PersistenceUnit();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONFIG__VERSION = eINSTANCE.getPersistenceConfig_Version();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.PersistenceUnitImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getPersistenceUnit()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT = eINSTANCE.getPersistenceUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT__NAME = eINSTANCE.getPersistenceUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT__DESCRIPTION = eINSTANCE.getPersistenceUnit_Description();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT__PROVIDER = eINSTANCE.getPersistenceUnit_Provider();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT__PACKAGE = eINSTANCE.getPersistenceUnit_Package();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT__PROPERTIES = eINSTANCE.getPersistenceUnit_Properties();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT__DATA_SOURCES = eINSTANCE.getPersistenceUnit_DataSources();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.DataSourcesImpl <em>Data Sources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.DataSourcesImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getDataSources()
		 * @generated
		 */
		EClass DATA_SOURCES = eINSTANCE.getDataSources();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCES__DATA_SOURCES = eINSTANCE.getDataSources_DataSources();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl <em>Data Source Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.DataSourceConfigImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getDataSourceConfig()
		 * @generated
		 */
		EClass DATA_SOURCE_CONFIG = eINSTANCE.getDataSourceConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIG__NAME = eINSTANCE.getDataSourceConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIG__FACTORY = eINSTANCE.getDataSourceConfig_Factory();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIG__CLASS = eINSTANCE.getDataSourceConfig_Class();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIG__URL = eINSTANCE.getDataSourceConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Graphs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIG__GRAPHS = eINSTANCE.getDataSourceConfig_Graphs();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE_CONFIG__PROPERTY = eINSTANCE.getDataSourceConfig_Property();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.PropertiesImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

		/**
		 * The meta object literal for the '{@link com.emftriple.config.persistence.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.config.persistence.impl.PropertyImpl
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.emftriple.config.persistence.impl.PersistencePackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //PersistencePackage
