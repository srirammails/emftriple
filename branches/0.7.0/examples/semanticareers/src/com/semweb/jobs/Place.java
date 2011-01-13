/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.semweb.jobs.Place#getDepiction <em>Depiction</em>}</li>
 *   <li>{@link com.semweb.jobs.Place#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link com.semweb.jobs.Place#getPopulation <em>Population</em>}</li>
 *   <li>{@link com.semweb.jobs.Place#getPoints <em>Points</em>}</li>
 *   <li>{@link com.semweb.jobs.Place#getAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.semweb.jobs.JOBPackage#getPlace()
 * @model annotation="DataSet name='http://lod.openlinksw.com/sparql'"
 *        annotation="Entity uri='http://dbpedia.org/ontology/Place'"
 *        annotation="Entity uri='http://dbpedia.org/ontology/City'"
 * @generated
 */
public interface Place extends ExternalElement {
	/**
	 * Returns the value of the '<em><b>Depiction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depiction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depiction</em>' attribute.
	 * @see #setDepiction(String)
	 * @see com.semweb.jobs.JOBPackage#getPlace_Depiction()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/depiction'"
	 * @generated
	 */
	String getDepiction();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Place#getDepiction <em>Depiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depiction</em>' attribute.
	 * @see #getDepiction()
	 * @generated
	 */
	void setDepiction(String value);

	/**
	 * Returns the value of the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Page</em>' attribute.
	 * @see #setHomePage(String)
	 * @see com.semweb.jobs.JOBPackage#getPlace_HomePage()
	 * @model annotation="rdf uri='http://xmlns.com/foaf/0.1/homepage'"
	 * @generated
	 */
	String getHomePage();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Place#getHomePage <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' attribute.
	 * @see #getHomePage()
	 * @generated
	 */
	void setHomePage(String value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(String)
	 * @see com.semweb.jobs.JOBPackage#getPlace_Population()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/populationTotal'"
	 * @generated
	 */
	String getPopulation();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Place#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(String value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see com.semweb.jobs.JOBPackage#getPlace_Points()
	 * @model annotation="rdf uri='http://www.georss.org/georss/point'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Place#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see com.semweb.jobs.JOBPackage#getPlace_Abstract()
	 * @model annotation="rdf uri='http://dbpedia.org/ontology/abstract' lang='en'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link com.semweb.jobs.Place#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

} // Place
