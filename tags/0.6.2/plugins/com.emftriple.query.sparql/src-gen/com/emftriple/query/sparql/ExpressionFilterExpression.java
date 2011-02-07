/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.ExpressionFilterExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.ExpressionFilterExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.ExpressionFilterExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getExpressionFilterExpression()
 * @model
 * @generated
 */
public interface ExpressionFilterExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(FilterNode)
   * @see com.emftriple.query.sparql.SparqlPackage#getExpressionFilterExpression_Left()
   * @model containment="true"
   * @generated
   */
  FilterNode getLeft();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(FilterNode value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.emftriple.query.sparql.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.emftriple.query.sparql.Operator
   * @see #setOperator(Operator)
   * @see com.emftriple.query.sparql.SparqlPackage#getExpressionFilterExpression_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.emftriple.query.sparql.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(FilterNode)
   * @see com.emftriple.query.sparql.SparqlPackage#getExpressionFilterExpression_Right()
   * @model containment="true"
   * @generated
   */
  FilterNode getRight();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(FilterNode value);

} // ExpressionFilterExpression
