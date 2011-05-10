/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.SelectStatement#getSelectFromClause <em>Select From Clause</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.SelectStatement#getHaving <em>Having</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.SelectStatement#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends JPQLQuery, ExpressionTerm
{
  /**
   * Returns the value of the '<em><b>Select From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select From Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select From Clause</em>' containment reference.
   * @see #setSelectFromClause(SelectFromClause)
   * @see com.emftriple.query.jpql.JpqlPackage#getSelectStatement_SelectFromClause()
   * @model containment="true"
   * @generated
   */
  SelectFromClause getSelectFromClause();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.SelectStatement#getSelectFromClause <em>Select From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select From Clause</em>' containment reference.
   * @see #getSelectFromClause()
   * @generated
   */
  void setSelectFromClause(SelectFromClause value);

  /**
   * Returns the value of the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having</em>' containment reference.
   * @see #setHaving(HavingClause)
   * @see com.emftriple.query.jpql.JpqlPackage#getSelectStatement_Having()
   * @model containment="true"
   * @generated
   */
  HavingClause getHaving();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.SelectStatement#getHaving <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having</em>' containment reference.
   * @see #getHaving()
   * @generated
   */
  void setHaving(HavingClause value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(OrderClause)
   * @see com.emftriple.query.jpql.JpqlPackage#getSelectStatement_Order()
   * @model containment="true"
   * @generated
   */
  OrderClause getOrder();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.SelectStatement#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(OrderClause value);

} // SelectStatement
