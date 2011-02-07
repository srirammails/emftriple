/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.SelectQuery#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectQuery#isIsReduced <em>Is Reduced</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectQuery#isAll <em>All</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectQuery#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getSelectQuery()
 * @model
 * @generated
 */
public interface SelectQuery extends SelectionQuery
{
  /**
   * Returns the value of the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Distinct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Distinct</em>' attribute.
   * @see #setIsDistinct(boolean)
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectQuery_IsDistinct()
   * @model
   * @generated
   */
  boolean isIsDistinct();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectQuery#isIsDistinct <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Distinct</em>' attribute.
   * @see #isIsDistinct()
   * @generated
   */
  void setIsDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Is Reduced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Reduced</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Reduced</em>' attribute.
   * @see #setIsReduced(boolean)
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectQuery_IsReduced()
   * @model
   * @generated
   */
  boolean isIsReduced();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectQuery#isIsReduced <em>Is Reduced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Reduced</em>' attribute.
   * @see #isIsReduced()
   * @generated
   */
  void setIsReduced(boolean value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectQuery_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectQuery#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectQuery_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

} // SelectQuery
