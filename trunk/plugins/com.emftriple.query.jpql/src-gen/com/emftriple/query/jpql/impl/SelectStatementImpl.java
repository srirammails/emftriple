/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql.impl;

import com.emftriple.query.jpql.HavingClause;
import com.emftriple.query.jpql.JpqlPackage;
import com.emftriple.query.jpql.OrderClause;
import com.emftriple.query.jpql.SelectFromClause;
import com.emftriple.query.jpql.SelectStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.impl.SelectStatementImpl#getSelectFromClause <em>Select From Clause</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.impl.SelectStatementImpl#getHaving <em>Having</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.impl.SelectStatementImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectStatementImpl extends JPQLQueryImpl implements SelectStatement
{
  /**
   * The cached value of the '{@link #getSelectFromClause() <em>Select From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectFromClause()
   * @generated
   * @ordered
   */
  protected SelectFromClause selectFromClause;

  /**
   * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHaving()
   * @generated
   * @ordered
   */
  protected HavingClause having;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected OrderClause order;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectStatementImpl()
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
    return JpqlPackage.Literals.SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectFromClause getSelectFromClause()
  {
    return selectFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectFromClause(SelectFromClause newSelectFromClause, NotificationChain msgs)
  {
    SelectFromClause oldSelectFromClause = selectFromClause;
    selectFromClause = newSelectFromClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, oldSelectFromClause, newSelectFromClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectFromClause(SelectFromClause newSelectFromClause)
  {
    if (newSelectFromClause != selectFromClause)
    {
      NotificationChain msgs = null;
      if (selectFromClause != null)
        msgs = ((InternalEObject)selectFromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, null, msgs);
      if (newSelectFromClause != null)
        msgs = ((InternalEObject)newSelectFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, null, msgs);
      msgs = basicSetSelectFromClause(newSelectFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, newSelectFromClause, newSelectFromClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause getHaving()
  {
    return having;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHaving(HavingClause newHaving, NotificationChain msgs)
  {
    HavingClause oldHaving = having;
    having = newHaving;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__HAVING, oldHaving, newHaving);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHaving(HavingClause newHaving)
  {
    if (newHaving != having)
    {
      NotificationChain msgs = null;
      if (having != null)
        msgs = ((InternalEObject)having).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__HAVING, null, msgs);
      if (newHaving != null)
        msgs = ((InternalEObject)newHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__HAVING, null, msgs);
      msgs = basicSetHaving(newHaving, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__HAVING, newHaving, newHaving));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderClause getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(OrderClause newOrder, NotificationChain msgs)
  {
    OrderClause oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(OrderClause newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpqlPackage.SELECT_STATEMENT__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpqlPackage.SELECT_STATEMENT__ORDER, newOrder, newOrder));
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
      case JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return basicSetSelectFromClause(null, msgs);
      case JpqlPackage.SELECT_STATEMENT__HAVING:
        return basicSetHaving(null, msgs);
      case JpqlPackage.SELECT_STATEMENT__ORDER:
        return basicSetOrder(null, msgs);
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
      case JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return getSelectFromClause();
      case JpqlPackage.SELECT_STATEMENT__HAVING:
        return getHaving();
      case JpqlPackage.SELECT_STATEMENT__ORDER:
        return getOrder();
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
      case JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        setSelectFromClause((SelectFromClause)newValue);
        return;
      case JpqlPackage.SELECT_STATEMENT__HAVING:
        setHaving((HavingClause)newValue);
        return;
      case JpqlPackage.SELECT_STATEMENT__ORDER:
        setOrder((OrderClause)newValue);
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
      case JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        setSelectFromClause((SelectFromClause)null);
        return;
      case JpqlPackage.SELECT_STATEMENT__HAVING:
        setHaving((HavingClause)null);
        return;
      case JpqlPackage.SELECT_STATEMENT__ORDER:
        setOrder((OrderClause)null);
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
      case JpqlPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return selectFromClause != null;
      case JpqlPackage.SELECT_STATEMENT__HAVING:
        return having != null;
      case JpqlPackage.SELECT_STATEMENT__ORDER:
        return order != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
