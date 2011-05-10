/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.BuiltInCall;
import com.emftriple.query.sparql.Expression;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getIfExpr <em>If Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.BuiltInCallImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInCallImpl extends GroupConditionImpl implements BuiltInCall
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Variable var;

  /**
   * The cached value of the '{@link #getIfExpr() <em>If Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfExpr()
   * @generated
   * @ordered
   */
  protected Expression ifExpr;

  /**
   * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpr()
   * @generated
   * @ordered
   */
  protected Expression thenExpr;

  /**
   * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseExpr()
   * @generated
   * @ordered
   */
  protected Expression elseExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltInCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SparqlPackage.Literals.BUILT_IN_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Variable newVar, NotificationChain msgs)
  {
    Variable oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Variable newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIfExpr()
  {
    return ifExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfExpr(Expression newIfExpr, NotificationChain msgs)
  {
    Expression oldIfExpr = ifExpr;
    ifExpr = newIfExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__IF_EXPR, oldIfExpr, newIfExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfExpr(Expression newIfExpr)
  {
    if (newIfExpr != ifExpr)
    {
      NotificationChain msgs = null;
      if (ifExpr != null)
        msgs = ((InternalEObject)ifExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__IF_EXPR, null, msgs);
      if (newIfExpr != null)
        msgs = ((InternalEObject)newIfExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__IF_EXPR, null, msgs);
      msgs = basicSetIfExpr(newIfExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__IF_EXPR, newIfExpr, newIfExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThenExpr()
  {
    return thenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpr(Expression newThenExpr, NotificationChain msgs)
  {
    Expression oldThenExpr = thenExpr;
    thenExpr = newThenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__THEN_EXPR, oldThenExpr, newThenExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenExpr(Expression newThenExpr)
  {
    if (newThenExpr != thenExpr)
    {
      NotificationChain msgs = null;
      if (thenExpr != null)
        msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__THEN_EXPR, null, msgs);
      if (newThenExpr != null)
        msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__THEN_EXPR, null, msgs);
      msgs = basicSetThenExpr(newThenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__THEN_EXPR, newThenExpr, newThenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElseExpr()
  {
    return elseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseExpr(Expression newElseExpr, NotificationChain msgs)
  {
    Expression oldElseExpr = elseExpr;
    elseExpr = newElseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__ELSE_EXPR, oldElseExpr, newElseExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseExpr(Expression newElseExpr)
  {
    if (newElseExpr != elseExpr)
    {
      NotificationChain msgs = null;
      if (elseExpr != null)
        msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__ELSE_EXPR, null, msgs);
      if (newElseExpr != null)
        msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.BUILT_IN_CALL__ELSE_EXPR, null, msgs);
      msgs = basicSetElseExpr(newElseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.BUILT_IN_CALL__ELSE_EXPR, newElseExpr, newElseExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SparqlPackage.BUILT_IN_CALL__EXPR:
        return basicSetExpr(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__LEFT:
        return basicSetLeft(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__RIGHT:
        return basicSetRight(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__VAR:
        return basicSetVar(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__IF_EXPR:
        return basicSetIfExpr(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__THEN_EXPR:
        return basicSetThenExpr(null, msgs);
      case SparqlPackage.BUILT_IN_CALL__ELSE_EXPR:
        return basicSetElseExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SparqlPackage.BUILT_IN_CALL__EXPR:
        return getExpr();
      case SparqlPackage.BUILT_IN_CALL__LEFT:
        return getLeft();
      case SparqlPackage.BUILT_IN_CALL__RIGHT:
        return getRight();
      case SparqlPackage.BUILT_IN_CALL__VAR:
        return getVar();
      case SparqlPackage.BUILT_IN_CALL__IF_EXPR:
        return getIfExpr();
      case SparqlPackage.BUILT_IN_CALL__THEN_EXPR:
        return getThenExpr();
      case SparqlPackage.BUILT_IN_CALL__ELSE_EXPR:
        return getElseExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlPackage.BUILT_IN_CALL__EXPR:
        setExpr((Expression)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__LEFT:
        setLeft((Expression)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__RIGHT:
        setRight((Expression)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__VAR:
        setVar((Variable)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__IF_EXPR:
        setIfExpr((Expression)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__THEN_EXPR:
        setThenExpr((Expression)newValue);
        return;
      case SparqlPackage.BUILT_IN_CALL__ELSE_EXPR:
        setElseExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SparqlPackage.BUILT_IN_CALL__EXPR:
        setExpr((Expression)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__LEFT:
        setLeft((Expression)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__RIGHT:
        setRight((Expression)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__VAR:
        setVar((Variable)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__IF_EXPR:
        setIfExpr((Expression)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__THEN_EXPR:
        setThenExpr((Expression)null);
        return;
      case SparqlPackage.BUILT_IN_CALL__ELSE_EXPR:
        setElseExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SparqlPackage.BUILT_IN_CALL__EXPR:
        return expr != null;
      case SparqlPackage.BUILT_IN_CALL__LEFT:
        return left != null;
      case SparqlPackage.BUILT_IN_CALL__RIGHT:
        return right != null;
      case SparqlPackage.BUILT_IN_CALL__VAR:
        return var != null;
      case SparqlPackage.BUILT_IN_CALL__IF_EXPR:
        return ifExpr != null;
      case SparqlPackage.BUILT_IN_CALL__THEN_EXPR:
        return thenExpr != null;
      case SparqlPackage.BUILT_IN_CALL__ELSE_EXPR:
        return elseExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //BuiltInCallImpl
