/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getBase <em>Base</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getDatasetClause <em>Dataset Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getHavingClause <em>Having Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.SelectionQuery#getLimitClause <em>Limit Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery()
 * @model
 * @generated
 */
public interface SelectionQuery extends SPARQLQuery
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(Base)
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_Base()
   * @model containment="true"
   * @generated
   */
  Base getBase();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectionQuery#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Base value);

  /**
   * Returns the value of the '<em><b>Dataset Clause</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.DatasetClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset Clause</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_DatasetClause()
   * @model containment="true"
   * @generated
   */
  EList<DatasetClause> getDatasetClause();

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
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectionQuery#getWhereClause <em>Where Clause</em>}' containment reference.
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
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_GroupClause()
   * @model containment="true"
   * @generated
   */
  GroupClause getGroupClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectionQuery#getGroupClause <em>Group Clause</em>}' containment reference.
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
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_HavingClause()
   * @model containment="true"
   * @generated
   */
  HavingClause getHavingClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectionQuery#getHavingClause <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having Clause</em>' containment reference.
   * @see #getHavingClause()
   * @generated
   */
  void setHavingClause(HavingClause value);

  /**
   * Returns the value of the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit Clause</em>' containment reference.
   * @see #setLimitClause(LimitClause)
   * @see com.emftriple.query.sparql.SparqlPackage#getSelectionQuery_LimitClause()
   * @model containment="true"
   * @generated
   */
  LimitClause getLimitClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SelectionQuery#getLimitClause <em>Limit Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit Clause</em>' containment reference.
   * @see #getLimitClause()
   * @generated
   */
  void setLimitClause(LimitClause value);

} // SelectionQuery
