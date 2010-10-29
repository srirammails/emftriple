/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.FromClass#getType <em>Type</em>}</li>
 *   <li>{@link com.emftriple.query.mql.FromClass#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getFromClass()
 * @model
 * @generated
 */
public interface FromClass extends FromEntry
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.emftriple.query.mql.MqlPackage#getFromClass_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.FromClass#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.mql.FromJoin}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joins</em>' containment reference list.
   * @see com.emftriple.query.mql.MqlPackage#getFromClass_Joins()
   * @model containment="true"
   * @generated
   */
  EList<FromJoin> getJoins();

} // FromClass
