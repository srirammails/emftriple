/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.SumAggregate#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getSumAggregate()
 * @model
 * @generated
 */
public interface SumAggregate extends Aggregate
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ExprAggArg)
   * @see com.emftriple.query.sparql.SparqlPackage#getSumAggregate_Expr()
   * @model containment="true"
   * @generated
   */
  ExprAggArg getExpr();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.SumAggregate#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ExprAggArg value);

} // SumAggregate
