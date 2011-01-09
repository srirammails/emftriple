/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Graph Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.DropGraphQuery#getIsSilent <em>Is Silent</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.DropGraphQuery#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getDropGraphQuery()
 * @model
 * @generated
 */
public interface DropGraphQuery extends UpdateOperation
{
  /**
   * Returns the value of the '<em><b>Is Silent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Silent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Silent</em>' attribute.
   * @see #setIsSilent(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getDropGraphQuery_IsSilent()
   * @model
   * @generated
   */
  String getIsSilent();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.DropGraphQuery#getIsSilent <em>Is Silent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Silent</em>' attribute.
   * @see #getIsSilent()
   * @generated
   */
  void setIsSilent(String value);

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
   * @see com.emftriple.query.sparql.SparqlPackage#getDropGraphQuery_Graph()
   * @model
   * @generated
   */
  String getGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.DropGraphQuery#getGraph <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' attribute.
   * @see #getGraph()
   * @generated
   */
  void setGraph(String value);

} // DropGraphQuery
