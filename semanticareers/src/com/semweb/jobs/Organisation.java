/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.semweb.jobs.Organisation#getName <em>Name</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getLogo <em>Logo</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getProducts <em>Products</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getFormationYear <em>Formation Year</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getLocation <em>Location</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getWikiPage <em>Wiki Page</em>}</li>
 *   <li>{@link com.semweb.jobs.Organisation#getNumEmployees <em>Num Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.semweb.jobs.JOBPackage#getOrganisation()
 * @model annotation="DataSet name='http://lod.openlinksw.com/sparql'"
 *        annotation="Entity uri='http://dbpedia.org/ontology/Organisation'"
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Name()
	 * @model required="true"
	 *        annotation="Id base='http://dbpedia.org/resource/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Description()
	 * @model annotation="rdf uri='http://www.w3.org/2000/01/rdf-schema#comment' lang='en'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Logo()
	 * @model annotation="rdf uri='http://dbpedia.org/property/companyLogo'"
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(String)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Revenue()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/revenue'"
	 * @generated
	 */
	String getRevenue();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' attribute list.
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Products()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/product'"
	 * @generated
	 */
	EList<String> getProducts();

	/**
	 * Returns the value of the '<em><b>Formation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formation Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation Year</em>' attribute.
	 * @see #setFormationYear(Date)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_FormationYear()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/formationYear'"
	 * @generated
	 */
	Date getFormationYear();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getFormationYear <em>Formation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formation Year</em>' attribute.
	 * @see #getFormationYear()
	 * @generated
	 */
	void setFormationYear(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Place)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_Location()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/location'"
	 * @generated
	 */
	Place getLocation();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Place value);

	/**
	 * Returns the value of the '<em><b>Wiki Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiki Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Page</em>' attribute.
	 * @see #setWikiPage(String)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_WikiPage()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/page'"
	 * @generated
	 */
	String getWikiPage();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getWikiPage <em>Wiki Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Page</em>' attribute.
	 * @see #getWikiPage()
	 * @generated
	 */
	void setWikiPage(String value);

	/**
	 * Returns the value of the '<em><b>Num Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Employees</em>' attribute.
	 * @see #setNumEmployees(String)
	 * @see com.semweb.jobs.JOBPackage#getOrganisation_NumEmployees()
	 * @model annotation="rdf uri='http://dbpedia.org/property/numEmployees'"
	 * @generated
	 */
	String getNumEmployees();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Organisation#getNumEmployees <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Employees</em>' attribute.
	 * @see #getNumEmployees()
	 * @generated
	 */
	void setNumEmployees(String value);

} // Organisation
