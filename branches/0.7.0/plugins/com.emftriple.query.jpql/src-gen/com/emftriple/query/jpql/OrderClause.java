/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.OrderClause#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.OrderClause#isIsAsc <em>Is Asc</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.OrderClause#isIsDesc <em>Is Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getOrderClause()
 * @model
 * @generated
 */
public interface OrderClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.jpql.OrderItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' containment reference list.
   * @see com.emftriple.query.jpql.JpqlPackage#getOrderClause_Ordering()
   * @model containment="true"
   * @generated
   */
  EList<OrderItem> getOrdering();

  /**
   * Returns the value of the '<em><b>Is Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Asc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Asc</em>' attribute.
   * @see #setIsAsc(boolean)
   * @see com.emftriple.query.jpql.JpqlPackage#getOrderClause_IsAsc()
   * @model
   * @generated
   */
  boolean isIsAsc();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.OrderClause#isIsAsc <em>Is Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Asc</em>' attribute.
   * @see #isIsAsc()
   * @generated
   */
  void setIsAsc(boolean value);

  /**
   * Returns the value of the '<em><b>Is Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Desc</em>' attribute.
   * @see #setIsDesc(boolean)
   * @see com.emftriple.query.jpql.JpqlPackage#getOrderClause_IsDesc()
   * @model
   * @generated
   */
  boolean isIsDesc();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.OrderClause#isIsDesc <em>Is Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Desc</em>' attribute.
   * @see #isIsDesc()
   * @generated
   */
  void setIsDesc(boolean value);

} // OrderClause
