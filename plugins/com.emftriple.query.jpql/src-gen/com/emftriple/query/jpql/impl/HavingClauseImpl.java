/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql.impl;

import com.emftriple.query.jpql.Expression;
import com.emftriple.query.jpql.HavingClause;
import com.emftriple.query.jpql.JpqlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Having Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.impl.HavingClauseImpl#getHaving <em>Having</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HavingClauseImpl extends MinimalEObjectImpl.Container implements HavingClause
{
  /**
   * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHaving()
   * @generated
   * @ordered
   */
  protected Expression having;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HavingClauseImpl()
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
    return JpqlPackage.Literals.HAVING_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getHaving()
  {
    return having;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHaving(Expression newHaving, NotificationChain msgs)
  {
    Expression oldHaving = having;
    having = newHaving;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpqlPackage.HAVING_CLAUSE__HAVING, oldHaving, newHaving);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHaving(Expression newHaving)
  {
    if (newHaving != having)
    {
      NotificationChain msgs = null;
      if (having != null)
        msgs = ((InternalEObject)having).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.HAVING_CLAUSE__HAVING, null, msgs);
      if (newHaving != null)
        msgs = ((InternalEObject)newHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.HAVING_CLAUSE__HAVING, null, msgs);
      msgs = basicSetHaving(newHaving, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpqlPackage.HAVING_CLAUSE__HAVING, newHaving, newHaving));
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
      case JpqlPackage.HAVING_CLAUSE__HAVING:
        return basicSetHaving(null, msgs);
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
      case JpqlPackage.HAVING_CLAUSE__HAVING:
        return getHaving();
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
      case JpqlPackage.HAVING_CLAUSE__HAVING:
        setHaving((Expression)newValue);
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
      case JpqlPackage.HAVING_CLAUSE__HAVING:
        setHaving((Expression)null);
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
      case JpqlPackage.HAVING_CLAUSE__HAVING:
        return having != null;
    }
    return super.eIsSet(featureID);
  }

} //HavingClauseImpl
