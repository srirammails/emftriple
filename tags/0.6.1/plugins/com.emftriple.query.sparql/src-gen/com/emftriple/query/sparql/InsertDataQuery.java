/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Data Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.InsertDataQuery#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getInsertDataQuery()
 * @model
 * @generated
 */
public interface InsertDataQuery extends ModifyQuery
{
  /**
   * Returns the value of the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph</em>' attribute.
   * @see #setGraph(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getInsertDataQuery_Graph()
   * @model
   * @generated
   */
  String getGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.InsertDataQuery#getGraph <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' attribute.
   * @see #getGraph()
   * @generated
   */
  void setGraph(String value);

} // InsertDataQuery
