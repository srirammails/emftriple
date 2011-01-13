/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.semweb.jobs.JOBFactory
 * @model kind="package"
 * @generated
 */
public interface JOBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.semweb.com/jobs#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jobs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JOBPackage eINSTANCE = com.semweb.jobs.impl.JOBPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.semweb.jobs.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.semweb.jobs.impl.JobImpl
	 * @see com.semweb.jobs.impl.JOBPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__POSTED = 3;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ORGANISATION = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.semweb.jobs.impl.ExternalElementImpl <em>External Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.semweb.jobs.impl.ExternalElementImpl
	 * @see com.semweb.jobs.impl.JOBPackageImpl#getExternalElement()
	 * @generated
	 */
	int EXTERNAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Wiki Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__WIKI_PAGE = 2;

	/**
	 * The number of structural features of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.semweb.jobs.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.semweb.jobs.impl.OrganisationImpl
	 * @see com.semweb.jobs.impl.JOBPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = EXTERNAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DESCRIPTION = EXTERNAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Wiki Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__WIKI_PAGE = EXTERNAL_ELEMENT__WIKI_PAGE;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LOGO = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__REVENUE = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PRODUCTS = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__FORMATION_YEAR = EXTERNAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LOCATION = EXTERNAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NUM_EMPLOYEES = EXTERNAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.semweb.jobs.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.semweb.jobs.impl.PlaceImpl
	 * @see com.semweb.jobs.impl.JOBPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = EXTERNAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DESCRIPTION = EXTERNAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Wiki Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__WIKI_PAGE = EXTERNAL_ELEMENT__WIKI_PAGE;

	/**
	 * The feature id for the '<em><b>Depiction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DEPICTION = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__HOME_PAGE = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__POPULATION = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__POINTS = EXTERNAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ABSTRACT = EXTERNAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link com.semweb.jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see com.semweb.jobs.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.semweb.jobs.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Job#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.semweb.jobs.Job#getTitle()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Job#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see com.semweb.jobs.Job#getSummary()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Summary();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Job#getPosted <em>Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted</em>'.
	 * @see com.semweb.jobs.Job#getPosted()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Posted();

	/**
	 * Returns the meta object for the reference '{@link com.semweb.jobs.Job#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see com.semweb.jobs.Job#getOrganisation()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Organisation();

	/**
	 * Returns the meta object for the reference '{@link com.semweb.jobs.Job#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.semweb.jobs.Job#getLocation()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Location();

	/**
	 * Returns the meta object for class '{@link com.semweb.jobs.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Element</em>'.
	 * @see com.semweb.jobs.ExternalElement
	 * @generated
	 */
	EClass getExternalElement();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.ExternalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.semweb.jobs.ExternalElement#getName()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.ExternalElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.semweb.jobs.ExternalElement#getDescription()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.ExternalElement#getWikiPage <em>Wiki Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiki Page</em>'.
	 * @see com.semweb.jobs.ExternalElement#getWikiPage()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_WikiPage();

	/**
	 * Returns the meta object for class '{@link com.semweb.jobs.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see com.semweb.jobs.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Organisation#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see com.semweb.jobs.Organisation#getLogo()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Logo();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Organisation#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see com.semweb.jobs.Organisation#getRevenue()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Revenue();

	/**
	 * Returns the meta object for the attribute list '{@link com.semweb.jobs.Organisation#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Products</em>'.
	 * @see com.semweb.jobs.Organisation#getProducts()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Products();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Organisation#getFormationYear <em>Formation Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formation Year</em>'.
	 * @see com.semweb.jobs.Organisation#getFormationYear()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_FormationYear();

	/**
	 * Returns the meta object for the reference '{@link com.semweb.jobs.Organisation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.semweb.jobs.Organisation#getLocation()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Organisation#getNumEmployees <em>Num Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Employees</em>'.
	 * @see com.semweb.jobs.Organisation#getNumEmployees()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_NumEmployees();

	/**
	 * Returns the meta object for class '{@link com.semweb.jobs.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see com.semweb.jobs.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Place#getDepiction <em>Depiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depiction</em>'.
	 * @see com.semweb.jobs.Place#getDepiction()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Depiction();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Place#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Page</em>'.
	 * @see com.semweb.jobs.Place#getHomePage()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_HomePage();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Place#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see com.semweb.jobs.Place#getPopulation()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Population();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Place#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see com.semweb.jobs.Place#getPoints()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Points();

	/**
	 * Returns the meta object for the attribute '{@link com.semweb.jobs.Place#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.semweb.jobs.Place#getAbstract()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Abstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JOBFactory getJOBFactory();

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
		 * The meta object literal for the '{@link com.semweb.jobs.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.semweb.jobs.impl.JobImpl
		 * @see com.semweb.jobs.impl.JOBPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TITLE = eINSTANCE.getJob_Title();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__SUMMARY = eINSTANCE.getJob_Summary();

		/**
		 * The meta object literal for the '<em><b>Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__POSTED = eINSTANCE.getJob_Posted();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ORGANISATION = eINSTANCE.getJob_Organisation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__LOCATION = eINSTANCE.getJob_Location();

		/**
		 * The meta object literal for the '{@link com.semweb.jobs.impl.ExternalElementImpl <em>External Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.semweb.jobs.impl.ExternalElementImpl
		 * @see com.semweb.jobs.impl.JOBPackageImpl#getExternalElement()
		 * @generated
		 */
		EClass EXTERNAL_ELEMENT = eINSTANCE.getExternalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__NAME = eINSTANCE.getExternalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__DESCRIPTION = eINSTANCE.getExternalElement_Description();

		/**
		 * The meta object literal for the '<em><b>Wiki Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__WIKI_PAGE = eINSTANCE.getExternalElement_WikiPage();

		/**
		 * The meta object literal for the '{@link com.semweb.jobs.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.semweb.jobs.impl.OrganisationImpl
		 * @see com.semweb.jobs.impl.JOBPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__LOGO = eINSTANCE.getOrganisation_Logo();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__REVENUE = eINSTANCE.getOrganisation_Revenue();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__PRODUCTS = eINSTANCE.getOrganisation_Products();

		/**
		 * The meta object literal for the '<em><b>Formation Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__FORMATION_YEAR = eINSTANCE.getOrganisation_FormationYear();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__LOCATION = eINSTANCE.getOrganisation_Location();

		/**
		 * The meta object literal for the '<em><b>Num Employees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NUM_EMPLOYEES = eINSTANCE.getOrganisation_NumEmployees();

		/**
		 * The meta object literal for the '{@link com.semweb.jobs.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.semweb.jobs.impl.PlaceImpl
		 * @see com.semweb.jobs.impl.JOBPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Depiction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__DEPICTION = eINSTANCE.getPlace_Depiction();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__HOME_PAGE = eINSTANCE.getPlace_HomePage();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__POPULATION = eINSTANCE.getPlace_Population();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__POINTS = eINSTANCE.getPlace_Points();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__ABSTRACT = eINSTANCE.getPlace_Abstract();

	}

} //JOBPackage
