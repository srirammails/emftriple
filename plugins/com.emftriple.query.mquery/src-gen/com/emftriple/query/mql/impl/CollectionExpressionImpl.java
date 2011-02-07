/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emftriple.query.mql.AliasAttributeExpression;
import com.emftriple.query.mql.CollectionExpression;
import com.emftriple.query.mql.MqlPackage;
import com.emftriple.query.mql.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.impl.CollectionExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.emftriple.query.mql.impl.CollectionExpressionImpl#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link com.emftriple.query.mql.impl.CollectionExpressionImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionExpressionImpl extends ExpressionImpl implements CollectionExpression
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Variable lhs;

  /**
   * The default value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected boolean isNot = IS_NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected AliasAttributeExpression rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionExpressionImpl()
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
    return MqlPackage.Literals.COLLECTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Variable newLhs, NotificationChain msgs)
  {
    Variable oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqlPackage.COLLECTION_EXPRESSION__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Variable newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqlPackage.COLLECTION_EXPRESSION__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqlPackage.COLLECTION_EXPRESSION__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqlPackage.COLLECTION_EXPRESSION__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNot()
  {
    return isNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNot(boolean newIsNot)
  {
    boolean oldIsNot = isNot;
    isNot = newIsNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqlPackage.COLLECTION_EXPRESSION__IS_NOT, oldIsNot, isNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasAttributeExpression getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(AliasAttributeExpression newRhs, NotificationChain msgs)
  {
    AliasAttributeExpression oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqlPackage.COLLECTION_EXPRESSION__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(AliasAttributeExpression newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqlPackage.COLLECTION_EXPRESSION__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqlPackage.COLLECTION_EXPRESSION__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqlPackage.COLLECTION_EXPRESSION__RHS, newRhs, newRhs));
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
      case MqlPackage.COLLECTION_EXPRESSION__LHS:
        return basicSetLhs(null, msgs);
      case MqlPackage.COLLECTION_EXPRESSION__RHS:
        return basicSetRhs(null, msgs);
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
      case MqlPackage.COLLECTION_EXPRESSION__LHS:
        return getLhs();
      case MqlPackage.COLLECTION_EXPRESSION__IS_NOT:
        return isIsNot();
      case MqlPackage.COLLECTION_EXPRESSION__RHS:
        return getRhs();
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
      case MqlPackage.COLLECTION_EXPRESSION__LHS:
        setLhs((Variable)newValue);
        return;
      case MqlPackage.COLLECTION_EXPRESSION__IS_NOT:
        setIsNot((Boolean)newValue);
        return;
      case MqlPackage.COLLECTION_EXPRESSION__RHS:
        setRhs((AliasAttributeExpression)newValue);
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
      case MqlPackage.COLLECTION_EXPRESSION__LHS:
        setLhs((Variable)null);
        return;
      case MqlPackage.COLLECTION_EXPRESSION__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
        return;
      case MqlPackage.COLLECTION_EXPRESSION__RHS:
        setRhs((AliasAttributeExpression)null);
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
      case MqlPackage.COLLECTION_EXPRESSION__LHS:
        return lhs != null;
      case MqlPackage.COLLECTION_EXPRESSION__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
      case MqlPackage.COLLECTION_EXPRESSION__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isNot: ");
    result.append(isNot);
    result.append(')');
    return result.toString();
  }

} //CollectionExpressionImpl
