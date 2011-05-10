/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.DeleteStatement#getDeleteClause <em>Delete Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getDeleteStatement()
 * @model
 * @generated
 */
public interface DeleteStatement extends JPQLQuery
{
  /**
   * Returns the value of the '<em><b>Delete Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete Clause</em>' containment reference.
   * @see #setDeleteClause(DeleteClause)
   * @see com.emftriple.query.jpql.JpqlPackage#getDeleteStatement_DeleteClause()
   * @model containment="true"
   * @generated
   */
  DeleteClause getDeleteClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.DeleteStatement#getDeleteClause <em>Delete Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete Clause</em>' containment reference.
   * @see #getDeleteClause()
   * @generated
   */
  void setDeleteClause(DeleteClause value);

} // DeleteStatement
