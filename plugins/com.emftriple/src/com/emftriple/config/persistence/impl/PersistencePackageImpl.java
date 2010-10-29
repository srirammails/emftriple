/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.emftriple.config.persistence.DataSourceConfig;
import com.emftriple.config.persistence.DataSources;
import com.emftriple.config.persistence.PersistenceConfig;
import com.emftriple.config.persistence.PersistenceFactory;
import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.config.persistence.Properties;
import com.emftriple.config.persistence.Property;
import com.emftriple.config.persistence.util.PersistenceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.emftriple.config.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersistencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePersistencePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PersistenceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceConfig() {
		return persistenceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceConfig_PersistenceUnit() {
		return (EReference)persistenceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceConfig_Version() {
		return (EAttribute)persistenceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnit() {
		return persistenceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_Name() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_Description() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_Provider() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_Package() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnit_Properties() {
		return (EReference)persistenceUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnit_DataSources() {
		return (EReference)persistenceUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSources() {
		return dataSourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSources_DataSources() {
		return (EReference)dataSourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceConfig() {
		return dataSourceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfig_Name() {
		return (EAttribute)dataSourceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfig_Factory() {
		return (EAttribute)dataSourceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfig_Class() {
		return (EAttribute)dataSourceConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfig_Url() {
		return (EAttribute)dataSourceConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfig_Graphs() {
		return (EAttribute)dataSourceConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceConfig_Property() {
		return (EReference)dataSourceConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Properties() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		persistenceConfigEClass = createEClass(PERSISTENCE_CONFIG);
		createEReference(persistenceConfigEClass, PERSISTENCE_CONFIG__PERSISTENCE_UNIT);
		createEAttribute(persistenceConfigEClass, PERSISTENCE_CONFIG__VERSION);

		persistenceUnitEClass = createEClass(PERSISTENCE_UNIT);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__NAME);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__DESCRIPTION);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__PROVIDER);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__PACKAGE);
		createEReference(persistenceUnitEClass, PERSISTENCE_UNIT__PROPERTIES);
		createEReference(persistenceUnitEClass, PERSISTENCE_UNIT__DATA_SOURCES);

		dataSourcesEClass = createEClass(DATA_SOURCES);
		createEReference(dataSourcesEClass, DATA_SOURCES__DATA_SOURCES);

		dataSourceConfigEClass = createEClass(DATA_SOURCE_CONFIG);
		createEAttribute(dataSourceConfigEClass, DATA_SOURCE_CONFIG__NAME);
		createEAttribute(dataSourceConfigEClass, DATA_SOURCE_CONFIG__FACTORY);
		createEAttribute(dataSourceConfigEClass, DATA_SOURCE_CONFIG__CLASS);
		createEAttribute(dataSourceConfigEClass, DATA_SOURCE_CONFIG__URL);
		createEAttribute(dataSourceConfigEClass, DATA_SOURCE_CONFIG__GRAPHS);
		createEReference(dataSourceConfigEClass, DATA_SOURCE_CONFIG__PROPERTY);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		// Create data types
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(persistenceConfigEClass, PersistenceConfig.class, "PersistenceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceConfig_PersistenceUnit(), this.getPersistenceUnit(), null, "persistenceUnit", null, 1, -1, PersistenceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceConfig_Version(), this.getVersionType(), "version", "2.0", 1, 1, PersistenceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitEClass, PersistenceUnit.class, "PersistenceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceUnit_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnit_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnit_Provider(), theXMLTypePackage.getString(), "provider", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnit_Package(), theXMLTypePackage.getString(), "package", null, 0, -1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnit_Properties(), this.getProperties(), null, "properties", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnit_DataSources(), this.getDataSources(), null, "dataSources", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourcesEClass, DataSources.class, "DataSources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSources_DataSources(), this.getDataSourceConfig(), null, "dataSources", null, 0, -1, DataSources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceConfigEClass, DataSourceConfig.class, "DataSourceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceConfig_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceConfig_Factory(), theXMLTypePackage.getString(), "factory", null, 1, 1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceConfig_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceConfig_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceConfig_Graphs(), theXMLTypePackage.getString(), "graphs", null, 0, -1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSourceConfig_Property(), this.getProperties(), null, "property", null, 0, 1, DataSourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (persistenceConfigEClass, 
		   source, 
		   new String[] {
			 "name", "persistence",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistenceConfig_PersistenceUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persistence-unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceConfig_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (persistenceUnitEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-unit_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistenceUnit_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPersistenceUnit_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnit_Provider(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "provider",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnit_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnit_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnit_DataSources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "datasources",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataSourcesEClass, 
		   source, 
		   new String[] {
			 "name", "datasources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataSources_DataSources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "datasource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataSourceConfigEClass, 
		   source, 
		   new String[] {
			 "name", "datasource_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataSourceConfig_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getDataSourceConfig_Factory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "factory",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataSourceConfig_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataSourceConfig_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataSourceConfig_Graphs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "graph",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataSourceConfig_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "name", "properties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProperties_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "property_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getProperty_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "versionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[0-9]+(\\.[0-9]+)*"
		   });
	}

} //PersistencePackageImpl
