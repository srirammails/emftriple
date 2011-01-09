/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.emftriple.config.annotations.AccessType;
import com.emftriple.config.annotations.EntityMapping;
import com.emftriple.config.annotations.EntityType;
import com.emftriple.config.annotations.NamedNativeQueryType;
import com.emftriple.config.annotations.NamedQueryType;
import com.emftriple.config.annotations.OTMFactory;
import com.emftriple.config.annotations.OTMPackage;
import com.emftriple.config.annotations.PersistenceUnitMetadata;
import com.emftriple.config.annotations.QueryType;
import com.emftriple.config.annotations.util.OTMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OTMPackageImpl extends EPackageImpl implements OTMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNativeQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

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
	 * @see com.emftriple.config.annotations.OTMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OTMPackageImpl() {
		super(eNS_URI, OTMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OTMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OTMPackage init() {
		if (isInited) return (OTMPackage)EPackage.Registry.INSTANCE.getEPackage(OTMPackage.eNS_URI);

		// Obtain or create and register package
		OTMPackageImpl theOTMPackage = (OTMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OTMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OTMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOTMPackage.createPackageContents();

		// Initialize created meta-data
		theOTMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOTMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OTMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOTMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OTMPackage.eNS_URI, theOTMPackage);
		return theOTMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityMapping() {
		return entityMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Description() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMapping_PersistenceUnitMetadata() {
		return (EReference)entityMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Package() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Schema() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Catalog() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Access() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMapping_NamedQuery() {
		return (EReference)entityMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMapping_NamedNativeQuery() {
		return (EReference)entityMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMapping_Entity() {
		return (EReference)entityMappingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMapping_Version() {
		return (EAttribute)entityMappingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_Name() {
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_Class() {
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_Description() {
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryType() {
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Name() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedQueryType() {
		return namedQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQueryType_Description() {
		return (EAttribute)namedQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQueryType_Query() {
		return (EAttribute)namedQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedNativeQueryType() {
		return namedNativeQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQueryType_Description() {
		return (EAttribute)namedNativeQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQueryType_Query() {
		return (EAttribute)namedNativeQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQueryType_ResultClass() {
		return (EAttribute)namedNativeQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQueryType_ResultSetMapping() {
		return (EAttribute)namedNativeQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitMetadata() {
		return persistenceUnitMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitMetadata_Description() {
		return (EAttribute)persistenceUnitMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
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
	public OTMFactory getOTMFactory() {
		return (OTMFactory)getEFactoryInstance();
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
		entityMappingEClass = createEClass(ENTITY_MAPPING);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__DESCRIPTION);
		createEReference(entityMappingEClass, ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__PACKAGE);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__SCHEMA);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__CATALOG);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__ACCESS);
		createEReference(entityMappingEClass, ENTITY_MAPPING__NAMED_QUERY);
		createEReference(entityMappingEClass, ENTITY_MAPPING__NAMED_NATIVE_QUERY);
		createEReference(entityMappingEClass, ENTITY_MAPPING__ENTITY);
		createEAttribute(entityMappingEClass, ENTITY_MAPPING__VERSION);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__NAME);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__CLASS);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__DESCRIPTION);

		queryTypeEClass = createEClass(QUERY_TYPE);
		createEAttribute(queryTypeEClass, QUERY_TYPE__NAME);

		namedQueryTypeEClass = createEClass(NAMED_QUERY_TYPE);
		createEAttribute(namedQueryTypeEClass, NAMED_QUERY_TYPE__DESCRIPTION);
		createEAttribute(namedQueryTypeEClass, NAMED_QUERY_TYPE__QUERY);

		namedNativeQueryTypeEClass = createEClass(NAMED_NATIVE_QUERY_TYPE);
		createEAttribute(namedNativeQueryTypeEClass, NAMED_NATIVE_QUERY_TYPE__DESCRIPTION);
		createEAttribute(namedNativeQueryTypeEClass, NAMED_NATIVE_QUERY_TYPE__QUERY);
		createEAttribute(namedNativeQueryTypeEClass, NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS);
		createEAttribute(namedNativeQueryTypeEClass, NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING);

		persistenceUnitMetadataEClass = createEClass(PERSISTENCE_UNIT_METADATA);
		createEAttribute(persistenceUnitMetadataEClass, PERSISTENCE_UNIT_METADATA__DESCRIPTION);

		// Create enums
		accessTypeEEnum = createEEnum(ACCESS_TYPE);

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
		namedQueryTypeEClass.getESuperTypes().add(this.getQueryType());
		namedNativeQueryTypeEClass.getESuperTypes().add(this.getQueryType());

		// Initialize classes and features; add operations and parameters
		initEClass(entityMappingEClass, EntityMapping.class, "EntityMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityMapping_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMapping_PersistenceUnitMetadata(), this.getPersistenceUnitMetadata(), null, "persistenceUnitMetadata", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMapping_Package(), theXMLTypePackage.getString(), "package", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMapping_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMapping_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMapping_Access(), this.getAccessType(), "access", null, 0, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMapping_NamedQuery(), this.getNamedQueryType(), null, "namedQuery", null, 0, -1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMapping_NamedNativeQuery(), this.getNamedNativeQueryType(), null, "namedNativeQuery", null, 0, -1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMapping_Entity(), this.getEntityType(), null, "entity", null, 0, -1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMapping_Version(), this.getVersionType(), "version", "2.0", 1, 1, EntityMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryTypeEClass, QueryType.class, "QueryType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedQueryTypeEClass, NamedQueryType.class, "NamedQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedQueryType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, NamedQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedQueryType_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, NamedQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedNativeQueryTypeEClass, NamedNativeQueryType.class, "NamedNativeQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedNativeQueryType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, NamedNativeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQueryType_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, NamedNativeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQueryType_ResultClass(), theXMLTypePackage.getString(), "resultClass", null, 0, 1, NamedNativeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQueryType_ResultSetMapping(), theXMLTypePackage.getString(), "resultSetMapping", null, 0, 1, NamedNativeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitMetadataEClass, PersistenceUnitMetadata.class, "PersistenceUnitMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceUnitMetadata_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, PersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PROPERTY);
		addEEnumLiteral(accessTypeEEnum, AccessType.FIELD);

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
		  (entityMappingEClass, 
		   source, 
		   new String[] {
			 "name", "entity-mappings",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityMapping_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_PersistenceUnitMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persistence-unit-metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Access(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "access",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_NamedQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_NamedNativeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-native-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Entity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMapping_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (entityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getEntityType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getEntityType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (namedQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "named-query",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNamedQueryType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedQueryType_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (namedNativeQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "named-native-query",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNamedNativeQueryType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedNativeQueryType_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedNativeQueryType_ResultClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result-class"
		   });		
		addAnnotation
		  (getNamedNativeQueryType_ResultSetMapping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result-set-mapping"
		   });		
		addAnnotation
		  (persistenceUnitMetadataEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-unit-metadata",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistenceUnitMetadata_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "versionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[0-9]+(\\.[0-9]+)*"
		   });		
		addAnnotation
		  (accessTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "access-type"
		   });
	}

} //OTMPackageImpl
