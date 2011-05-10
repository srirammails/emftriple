/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.SelectAggregateExpression#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.SelectAggregateExpression#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getSelectAggregateExpression()
 * @model
 * @generated
 */
public interface SelectAggregateExpression extends SelectExpression
{
  /**
   * Returns the value of the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Distinct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Distinct</em>' attribute.
   * @see #setIsDistinct(boolean)
   * @see com.emftriple.query.jpql.JpqlPackage#getSelectAggregateExpression_IsDistinct()
   * @model
   * @generated
   */
  boolean isIsDistinct();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.SelectAggregateExpression#isIsDistinct <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Distinct</em>' attribute.
   * @see #isIsDistinct()
   * @generated
   */
  void setIsDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(AliasAttributeExpression)
   * @see com.emftriple.query.jpql.JpqlPackage#getSelectAggregateExpression_Item()
   * @model containment="true"
   * @generated
   */
  AliasAttributeExpression getItem();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.SelectAggregateExpression#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(AliasAttributeExpression value);

} // SelectAggregateExpression
