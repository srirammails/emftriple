/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Graph Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.ClearGraphQuery#getUri <em>Uri</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.ClearGraphQuery#isIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getClearGraphQuery()
 * @model
 * @generated
 */
public interface ClearGraphQuery extends UpdateOperation
{
  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getClearGraphQuery_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ClearGraphQuery#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Is Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Default</em>' attribute.
   * @see #setIsDefault(boolean)
   * @see com.emftriple.query.sparql.SparqlPackage#getClearGraphQuery_IsDefault()
   * @model
   * @generated
   */
  boolean isIsDefault();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ClearGraphQuery#isIsDefault <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Default</em>' attribute.
   * @see #isIsDefault()
   * @generated
   */
  void setIsDefault(boolean value);

} // ClearGraphQuery
