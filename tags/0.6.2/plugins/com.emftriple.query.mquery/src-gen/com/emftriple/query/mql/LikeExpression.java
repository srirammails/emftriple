/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Like Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.LikeExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.emftriple.query.mql.LikeExpression#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link com.emftriple.query.mql.LikeExpression#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getLikeExpression()
 * @model
 * @generated
 */
public interface LikeExpression extends Expression
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
   * @see com.emftriple.query.mql.MqlPackage#getLikeExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  Variable getLhs();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.LikeExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Variable value);

  /**
   * Returns the value of the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Not</em>' attribute.
   * @see #setIsNot(boolean)
   * @see com.emftriple.query.mql.MqlPackage#getLikeExpression_IsNot()
   * @model
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.LikeExpression#isIsNot <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not</em>' attribute.
   * @see #isIsNot()
   * @generated
   */
  void setIsNot(boolean value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see com.emftriple.query.mql.MqlPackage#getLikeExpression_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.LikeExpression#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

} // LikeExpression
