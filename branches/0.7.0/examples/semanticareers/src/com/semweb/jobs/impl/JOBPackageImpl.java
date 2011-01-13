/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.semweb.jobs.ExternalElement;
import com.semweb.jobs.JOBFactory;
import com.semweb.jobs.JOBPackage;
import com.semweb.jobs.Job;
import com.semweb.jobs.Organisation;
import com.semweb.jobs.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JOBPackageImpl extends EPackageImpl implements JOBPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

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
	 * @see com.semweb.jobs.JOBPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JOBPackageImpl() {
		super(eNS_URI, JOBFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JOBPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JOBPackage init() {
		if (isInited) return (JOBPackage)EPackage.Registry.INSTANCE.getEPackage(JOBPackage.eNS_URI);

		// Obtain or create and register package
		JOBPackageImpl theJOBPackage = (JOBPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JOBPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JOBPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJOBPackage.createPackageContents();

		// Initialize created meta-data
		theJOBPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJOBPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JOBPackage.eNS_URI, theJOBPackage);
		return theJOBPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Id() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Title() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Summary() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Posted() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Organisation() {
		return (EReference)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Location() {
		return (EReference)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalElement() {
		return externalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalElement_Name() {
		return (EAttribute)externalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalElement_Description() {
		return (EAttribute)externalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalElement_WikiPage() {
		return (EAttribute)externalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Logo() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Revenue() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Products() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_FormationYear() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Location() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_NumEmployees() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Depiction() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_HomePage() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Population() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Points() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Abstract() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOBFactory getJOBFactory() {
		return (JOBFactory)getEFactoryInstance();
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
		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__ID);
		createEAttribute(jobEClass, JOB__TITLE);
		createEAttribute(jobEClass, JOB__SUMMARY);
		createEAttribute(jobEClass, JOB__POSTED);
		createEReference(jobEClass, JOB__ORGANISATION);
		createEReference(jobEClass, JOB__LOCATION);

		externalElementEClass = createEClass(EXTERNAL_ELEMENT);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__NAME);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__DESCRIPTION);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__WIKI_PAGE);

		organisationEClass = createEClass(ORGANISATION);
		createEAttribute(organisationEClass, ORGANISATION__LOGO);
		createEAttribute(organisationEClass, ORGANISATION__REVENUE);
		createEAttribute(organisationEClass, ORGANISATION__PRODUCTS);
		createEAttribute(organisationEClass, ORGANISATION__FORMATION_YEAR);
		createEReference(organisationEClass, ORGANISATION__LOCATION);
		createEAttribute(organisationEClass, ORGANISATION__NUM_EMPLOYEES);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__DEPICTION);
		createEAttribute(placeEClass, PLACE__HOME_PAGE);
		createEAttribute(placeEClass, PLACE__POPULATION);
		createEAttribute(placeEClass, PLACE__POINTS);
		createEAttribute(placeEClass, PLACE__ABSTRACT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organisationEClass.getESuperTypes().add(this.getExternalElement());
		placeEClass.getESuperTypes().add(this.getExternalElement());

		// Initialize classes and features; add operations and parameters
		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Id(), ecorePackage.getEString(), "id", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Title(), ecorePackage.getEString(), "title", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Posted(), ecorePackage.getEDate(), "posted", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Organisation(), this.getOrganisation(), null, "organisation", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Location(), this.getPlace(), null, "location", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalElementEClass, ExternalElement.class, "ExternalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalElement_WikiPage(), ecorePackage.getEString(), "wikiPage", null, 0, 1, ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisation_Logo(), ecorePackage.getEString(), "logo", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_Revenue(), ecorePackage.getEString(), "revenue", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_Products(), ecorePackage.getEString(), "products", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_FormationYear(), ecorePackage.getEDate(), "formationYear", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Location(), this.getPlace(), null, "location", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_NumEmployees(), ecorePackage.getEString(), "numEmployees", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Depiction(), ecorePackage.getEString(), "depiction", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_HomePage(), ecorePackage.getEString(), "homePage", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Population(), ecorePackage.getEString(), "population", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Points(), ecorePackage.getEString(), "points", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// DataSet
		createDataSetAnnotations();
		// Entity
		createEntityAnnotations();
		// Id
		createIdAnnotations();
		// GeneratedValue
		createGeneratedValueAnnotations();
		// rdf
		createRdfAnnotations();
		// rdf.seeAlsoSeeAlso
		createRdf_1Annotations();
		// SameAs
		createSameAsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>DataSet</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDataSetAnnotations() {
		String source = "DataSet";		
		addAnnotation
		  (jobEClass, 
		   source, 
		   new String[] {
			 "name", "http://default"
		   });													
		addAnnotation
		  (organisationEClass, 
		   source, 
		   new String[] {
			 "name", "http://lod.openlinksw.com/sparql"
		   });									
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "name", "http://lod.openlinksw.com/sparql"
		   });							
	}

	/**
	 * Initializes the annotations for <b>Entity</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEntityAnnotations() {
		String source = "Entity";			
		addAnnotation
		  (jobEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.semweb.com/jobs#Job"
		   });													
		addAnnotation
		  (organisationEClass, 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/Organisation"
		   });									
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/Place"
		   });		
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/City"
		   });					
	}

	/**
	 * Initializes the annotations for <b>Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdAnnotations() {
		String source = "Id";				
		addAnnotation
		  (getJob_Id(), 
		   source, 
		   new String[] {
			 "base", "http://www.semweb.com/jobs/"
		   });								
		addAnnotation
		  (getExternalElement_Name(), 
		   source, 
		   new String[] {
			 "base", "http://dbpedia.org/resource/"
		   });																		
	}

	/**
	 * Initializes the annotations for <b>GeneratedValue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGeneratedValueAnnotations() {
		String source = "GeneratedValue";					
		addAnnotation
		  (getJob_Id(), 
		   source, 
		   new String[] {
			 "strategy", "DEFAULT"
		   });																								
	}

	/**
	 * Initializes the annotations for <b>rdf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRdfAnnotations() {
		String source = "rdf";						
		addAnnotation
		  (getJob_Title(), 
		   source, 
		   new String[] {
			 "uri", "http://purl.org/dc/elements/1.1/title"
		   });		
		addAnnotation
		  (getJob_Organisation(), 
		   source, 
		   new String[] {
			 "uri", "http://www.semweb.com/jobs#organisation"
		   });		
		addAnnotation
		  (getJob_Location(), 
		   source, 
		   new String[] {
			 "uri", "http://www.semweb.com/jobs#location"
		   });					
		addAnnotation
		  (getExternalElement_Description(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2000/01/rdf-schema#comment",
			 "lang", "en"
		   });		
		addAnnotation
		  (getExternalElement_WikiPage(), 
		   source, 
		   new String[] {
			 "uri", "http://xmlns.com/foaf/0.1/page"
		   });				
		addAnnotation
		  (getOrganisation_Logo(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/property/companyLogo"
		   });		
		addAnnotation
		  (getOrganisation_Revenue(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/revenue"
		   });		
		addAnnotation
		  (getOrganisation_Products(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/product"
		   });		
		addAnnotation
		  (getOrganisation_FormationYear(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/formationYear"
		   });		
		addAnnotation
		  (getOrganisation_Location(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/location"
		   });		
		addAnnotation
		  (getOrganisation_NumEmployees(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/property/numEmployees"
		   });					
		addAnnotation
		  (getPlace_Depiction(), 
		   source, 
		   new String[] {
			 "uri", "http://xmlns.com/foaf/0.1/depiction"
		   });		
		addAnnotation
		  (getPlace_HomePage(), 
		   source, 
		   new String[] {
			 "uri", "http://xmlns.com/foaf/0.1/homepage"
		   });		
		addAnnotation
		  (getPlace_Population(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/populationTotal"
		   });		
		addAnnotation
		  (getPlace_Points(), 
		   source, 
		   new String[] {
			 "uri", "http://www.georss.org/georss/point"
		   });		
		addAnnotation
		  (getPlace_Abstract(), 
		   source, 
		   new String[] {
			 "uri", "http://dbpedia.org/ontology/abstract",
			 "lang", "en"
		   });
	}

	/**
	 * Initializes the annotations for <b>rdf.seeAlsoSeeAlso</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRdf_1Annotations() {
		String source = "rdf.seeAlsoSeeAlso";									
		addAnnotation
		  (externalElementEClass, 
		   source, 
		   new String[] {
			 "base", "http://dbpedia.org/resource/[name]"
		   });																				
	}

	/**
	 * Initializes the annotations for <b>SameAs</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSameAsAnnotations() {
		String source = "SameAs";										
		addAnnotation
		  (externalElementEClass, 
		   source, 
		   new String[] {
			 "base", "http://dbpedia.org/resource/[name]"
		   });																			
	}

} //JOBPackageImpl
