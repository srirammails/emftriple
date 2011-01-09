/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.LimitClause#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getLimitClause()
 * @model
 * @generated
 */
public interface LimitClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' attribute.
   * @see #setLimit(int)
   * @see com.emftriple.query.sparql.SparqlPackage#getLimitClause_Limit()
   * @model
   * @generated
   */
  int getLimit();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.LimitClause#getLimit <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' attribute.
   * @see #getLimit()
   * @generated
   */
  void setLimit(int value);

} // LimitClause
