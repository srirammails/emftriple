/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Graph Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.LoadGraphQuery#getGraph <em>Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.LoadGraphQuery#getIntoGraph <em>Into Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getLoadGraphQuery()
 * @model
 * @generated
 */
public interface LoadGraphQuery extends UpdateOperation
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
   * @see com.emftriple.query.sparql.SparqlPackage#getLoadGraphQuery_Graph()
   * @model
   * @generated
   */
  String getGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.LoadGraphQuery#getGraph <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' attribute.
   * @see #getGraph()
   * @generated
   */
  void setGraph(String value);

  /**
   * Returns the value of the '<em><b>Into Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Into Graph</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Into Graph</em>' attribute.
   * @see #setIntoGraph(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getLoadGraphQuery_IntoGraph()
   * @model
   * @generated
   */
  String getIntoGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.LoadGraphQuery#getIntoGraph <em>Into Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Into Graph</em>' attribute.
   * @see #getIntoGraph()
   * @generated
   */
  void setIntoGraph(String value);

} // LoadGraphQuery
