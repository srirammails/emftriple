/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.OperatorExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.emftriple.query.mql.OperatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.emftriple.query.mql.OperatorExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getOperatorExpression()
 * @model
 * @generated
 */
public interface OperatorExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Variable)
   * @see com.emftriple.query.mql.MqlPackage#getOperatorExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  Variable getLhs();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.OperatorExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Variable value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.emftriple.query.mql.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.emftriple.query.mql.Operator
   * @see #setOperator(Operator)
   * @see com.emftriple.query.mql.MqlPackage#getOperatorExpression_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.OperatorExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.emftriple.query.mql.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(ExpressionTerm)
   * @see com.emftriple.query.mql.MqlPackage#getOperatorExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  ExpressionTerm getRhs();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.OperatorExpression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(ExpressionTerm value);

} // OperatorExpression
