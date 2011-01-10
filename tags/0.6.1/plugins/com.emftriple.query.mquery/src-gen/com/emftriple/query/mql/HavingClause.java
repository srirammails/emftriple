/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Having Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.HavingClause#getHaving <em>Having</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getHavingClause()
 * @model
 * @generated
 */
public interface HavingClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having</em>' containment reference.
   * @see #setHaving(Expression)
   * @see com.emftriple.query.mql.MqlPackage#getHavingClause_Having()
   * @model containment="true"
   * @generated
   */
  Expression getHaving();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.HavingClause#getHaving <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having</em>' containment reference.
   * @see #getHaving()
   * @generated
   */
  void setHaving(Expression value);

} // HavingClause