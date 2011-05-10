/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.SubSelectQuery#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SubSelectQuery#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SubSelectQuery#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SubSelectQuery#getHavingClause <em>Having Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getSubSelectQuery()
 * @model
 * @generated
 */
public interface SubSelectQuery extends GroupGraphPattern
{
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
   * @see com.emftriple.query.sparql.SparqlPackage#getSubSelectQuery_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

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
   * @see com.emftriple.query.sparql.SparqlPackage#getSubSelectQuery_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SubSelectQuery#getWhereClause <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Clause</em>' containment reference.
   * @see #getWhereClause()
   * @generated
   */
  void setWhereClause(WhereClause value);

  /**
   * Returns the value of the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Clause</em>' containment reference.
   * @see #setGroupClause(GroupClause)
   * @see com.emftriple.query.sparql.SparqlPackage#getSubSelectQuery_GroupClause()
   * @model containment="true"
   * @generated
   */
  GroupClause getGroupClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SubSelectQuery#getGroupClause <em>Group Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Clause</em>' containment reference.
   * @see #getGroupClause()
   * @generated
   */
  void setGroupClause(GroupClause value);

  /**
   * Returns the value of the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having Clause</em>' containment reference.
   * @see #setHavingClause(HavingClause)
   * @see com.emftriple.query.sparql.SparqlPackage#getSubSelectQuery_HavingClause()
   * @model containment="true"
   * @generated
   */
  HavingClause getHavingClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SubSelectQuery#getHavingClause <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having Clause</em>' containment reference.
   * @see #getHavingClause()
   * @generated
   */
  void setHavingClause(HavingClause value);

} // SubSelectQuery
