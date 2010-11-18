/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.InsertQuery#getGraph <em>Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.InsertQuery#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getInsertQuery()
 * @model
 * @generated
 */
public interface InsertQuery extends ModifyQuery
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
   * @see com.emftriple.query.sparql.SparqlPackage#getInsertQuery_Graph()
   * @model
   * @generated
   */
  String getGraph();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.InsertQuery#getGraph <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' attribute.
   * @see #getGraph()
   * @generated
   */
  void setGraph(String value);

  /**
   * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Clause</em>' containment reference.
   * @see #setWhereClause(WhereClause)
   * @see com.emftriple.query.sparql.SparqlPackage#getInsertQuery_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.InsertQuery#getWhereClause <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Clause</em>' containment reference.
   * @see #getWhereClause()
   * @generated
   */
  void setWhereClause(WhereClause value);

} // InsertQuery
