/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Native Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.config.annotations.NamedNativeQueryType#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.NamedNativeQueryType#getQuery <em>Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.config.annotations.OTMPackage#getNamedNativeQueryType()
 * @model extendedMetaData="name='named-native-query' kind='elementOnly'"
 * @generated
 */
public interface NamedNativeQueryType extends QueryType {
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
	 * @see com.emftriple.config.annotations.OTMPackage#getNamedNativeQueryType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.NamedNativeQueryType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getNamedNativeQueryType_Query()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.NamedNativeQueryType#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Class</em>' attribute.
	 * @see #setResultClass(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getNamedNativeQueryType_ResultClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result-class'"
	 * @generated
	 */
	String getResultClass();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultClass <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Class</em>' attribute.
	 * @see #getResultClass()
	 * @generated
	 */
	void setResultClass(String value);

	/**
	 * Returns the value of the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Set Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #setResultSetMapping(String)
	 * @see com.emftriple.config.annotations.OTMPackage#getNamedNativeQueryType_ResultSetMapping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result-set-mapping'"
	 * @generated
	 */
	String getResultSetMapping();

	/**
	 * Sets the value of the '{@link com.emftriple.config.annotations.NamedNativeQueryType#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #getResultSetMapping()
	 * @generated
	 */
	void setResultSetMapping(String value);

} // NamedNativeQueryType
