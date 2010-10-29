/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.ModifyQuery#getWithGraph <em>With Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.ModifyQuery#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getModifyQuery()
 * @model
 * @generated
 */
public interface ModifyQuery extends UpdateOperation
{
  /**
   * Returns the value of the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Graph</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Graph</em>' attribute.
   * @see #setWithGraph(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getModifyQuery_WithGraph()
   * @model
   * @generated
   */
  String getWithGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ModifyQuery#getWithGraph <em>With Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Graph</em>' attribute.
   * @see #getWithGraph()
   * @generated
   */
  void setWithGraph(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(EObject)
   * @see com.emftriple.query.sparql.SparqlPackage#getModifyQuery_Query()
   * @model containment="true"
   * @generated
   */
  EObject getQuery();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ModifyQuery#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(EObject value);

} // ModifyQuery
