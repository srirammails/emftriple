/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getLeft <em>Left</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getRight <em>Right</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getVar <em>Var</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getIfExpr <em>If Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.BuiltInCall#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall()
 * @model
 * @generated
 */
public interface BuiltInCall extends GroupCondition, Constraint
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
   * @see #setExpr(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>If Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Expr</em>' containment reference.
   * @see #setIfExpr(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_IfExpr()
   * @model containment="true"
   * @generated
   */
  Expression getIfExpr();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getIfExpr <em>If Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Expr</em>' containment reference.
   * @see #getIfExpr()
   * @generated
   */
  void setIfExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expr</em>' containment reference.
   * @see #setThenExpr(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_ThenExpr()
   * @model containment="true"
   * @generated
   */
  Expression getThenExpr();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getThenExpr <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expr</em>' containment reference.
   * @see #getThenExpr()
   * @generated
   */
  void setThenExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expr</em>' containment reference.
   * @see #setElseExpr(Expression)
   * @see com.emftriple.query.sparql.SparqlPackage#getBuiltInCall_ElseExpr()
   * @model containment="true"
   * @generated
   */
  Expression getElseExpr();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.BuiltInCall#getElseExpr <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expr</em>' containment reference.
   * @see #getElseExpr()
   * @generated
   */
  void setElseExpr(Expression value);

} // BuiltInCall
