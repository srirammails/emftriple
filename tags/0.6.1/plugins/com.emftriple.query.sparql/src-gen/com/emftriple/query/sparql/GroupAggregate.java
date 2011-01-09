/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.GroupAggregate#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.GroupAggregate#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.GroupAggregate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getGroupAggregate()
 * @model
 * @generated
 */
public interface GroupAggregate extends Aggregate
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
   * @see com.emftriple.query.sparql.SparqlPackage#getGroupAggregate_IsDistinct()
   * @model
   * @generated
   */
  boolean isIsDistinct();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.GroupAggregate#isIsDistinct <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Distinct</em>' attribute.
   * @see #isIsDistinct()
   * @generated
   */
  void setIsDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getGroupAggregate_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getGroupAggregate_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.GroupAggregate#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // GroupAggregate
