/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.OrderItem#getVar <em>Var</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.OrderItem#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getOrderItem()
 * @model
 * @generated
 */
public interface OrderItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(FromEntry)
   * @see com.emftriple.query.jpql.JpqlPackage#getOrderItem_Var()
   * @model
   * @generated
   */
  FromEntry getVar();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.OrderItem#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(FromEntry value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see com.emftriple.query.jpql.JpqlPackage#getOrderItem_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.OrderItem#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

} // OrderItem
