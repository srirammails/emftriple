/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.DeleteClause#getFromClause <em>From Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getDeleteClause()
 * @model
 * @generated
 */
public interface DeleteClause extends EObject
{
  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(FromClause)
   * @see com.emftriple.query.mql.MqlPackage#getDeleteClause_FromClause()
   * @model containment="true"
   * @generated
   */
  FromClause getFromClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.DeleteClause#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(FromClause value);

} // DeleteClause
