/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.Base;
import com.emftriple.query.sparql.DatasetClause;
import com.emftriple.query.sparql.GroupClause;
import com.emftriple.query.sparql.HavingClause;
import com.emftriple.query.sparql.LimitClause;
import com.emftriple.query.sparql.SelectionQuery;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.WhereClause;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getBase <em>Base</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getDatasetClause <em>Dataset Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getHavingClause <em>Having Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SelectionQueryImpl#getLimitClause <em>Limit Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionQueryImpl extends SPARQLQueryImpl implements SelectionQuery
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected Base base;

  /**
   * The cached value of the '{@link #getDatasetClause() <em>Dataset Clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasetClause()
   * @generated
   * @ordered
   */
  protected EList<DatasetClause> datasetClause;

  /**
   * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereClause()
   * @generated
   * @ordered
   */
  protected WhereClause whereClause;

  /**
   * The cached value of the '{@link #getGroupClause() <em>Group Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupClause()
   * @generated
   * @ordered
   */
  protected GroupClause groupClause;

  /**
   * The cached value of the '{@link #getHavingClause() <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHavingClause()
   * @generated
   * @ordered
   */
  protected HavingClause havingClause;

  /**
   * The cached value of the '{@link #getLimitClause() <em>Limit Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimitClause()
   * @generated
   * @ordered
   */
  protected LimitClause limitClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionQueryImpl()
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
    return SparqlPackage.Literals.SELECTION_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Base getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(Base newBase, NotificationChain msgs)
  {
    Base oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(Base newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatasetClause> getDatasetClause()
  {
    if (datasetClause == null)
    {
      datasetClause = new EObjectContainmentEList<DatasetClause>(DatasetClause.class, this, SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE);
    }
    return datasetClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereClause getWhereClause()
  {
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereClause(WhereClause newWhereClause, NotificationChain msgs)
  {
    WhereClause oldWhereClause = whereClause;
    whereClause = newWhereClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereClause(WhereClause newWhereClause)
  {
    if (newWhereClause != whereClause)
    {
      NotificationChain msgs = null;
      if (whereClause != null)
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupClause getGroupClause()
  {
    return groupClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupClause(GroupClause newGroupClause, NotificationChain msgs)
  {
    GroupClause oldGroupClause = groupClause;
    groupClause = newGroupClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE, oldGroupClause, newGroupClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupClause(GroupClause newGroupClause)
  {
    if (newGroupClause != groupClause)
    {
      NotificationChain msgs = null;
      if (groupClause != null)
        msgs = ((InternalEObject)groupClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE, null, msgs);
      if (newGroupClause != null)
        msgs = ((InternalEObject)newGroupClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE, null, msgs);
      msgs = basicSetGroupClause(newGroupClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE, newGroupClause, newGroupClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause getHavingClause()
  {
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHavingClause(HavingClause newHavingClause, NotificationChain msgs)
  {
    HavingClause oldHavingClause = havingClause;
    havingClause = newHavingClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE, oldHavingClause, newHavingClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHavingClause(HavingClause newHavingClause)
  {
    if (newHavingClause != havingClause)
    {
      NotificationChain msgs = null;
      if (havingClause != null)
        msgs = ((InternalEObject)havingClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE, null, msgs);
      if (newHavingClause != null)
        msgs = ((InternalEObject)newHavingClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE, null, msgs);
      msgs = basicSetHavingClause(newHavingClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE, newHavingClause, newHavingClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitClause getLimitClause()
  {
    return limitClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimitClause(LimitClause newLimitClause, NotificationChain msgs)
  {
    LimitClause oldLimitClause = limitClause;
    limitClause = newLimitClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE, oldLimitClause, newLimitClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimitClause(LimitClause newLimitClause)
  {
    if (newLimitClause != limitClause)
    {
      NotificationChain msgs = null;
      if (limitClause != null)
        msgs = ((InternalEObject)limitClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE, null, msgs);
      if (newLimitClause != null)
        msgs = ((InternalEObject)newLimitClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE, null, msgs);
      msgs = basicSetLimitClause(newLimitClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE, newLimitClause, newLimitClause));
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
      case SparqlPackage.SELECTION_QUERY__BASE:
        return basicSetBase(null, msgs);
      case SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE:
        return ((InternalEList<?>)getDatasetClause()).basicRemove(otherEnd, msgs);
      case SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE:
        return basicSetWhereClause(null, msgs);
      case SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE:
        return basicSetGroupClause(null, msgs);
      case SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE:
        return basicSetHavingClause(null, msgs);
      case SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE:
        return basicSetLimitClause(null, msgs);
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
      case SparqlPackage.SELECTION_QUERY__BASE:
        return getBase();
      case SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE:
        return getDatasetClause();
      case SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE:
        return getWhereClause();
      case SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE:
        return getGroupClause();
      case SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE:
        return getHavingClause();
      case SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE:
        return getLimitClause();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlPackage.SELECTION_QUERY__BASE:
        setBase((Base)newValue);
        return;
      case SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE:
        getDatasetClause().clear();
        getDatasetClause().addAll((Collection<? extends DatasetClause>)newValue);
        return;
      case SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)newValue);
        return;
      case SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE:
        setGroupClause((GroupClause)newValue);
        return;
      case SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE:
        setHavingClause((HavingClause)newValue);
        return;
      case SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE:
        setLimitClause((LimitClause)newValue);
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
      case SparqlPackage.SELECTION_QUERY__BASE:
        setBase((Base)null);
        return;
      case SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE:
        getDatasetClause().clear();
        return;
      case SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)null);
        return;
      case SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE:
        setGroupClause((GroupClause)null);
        return;
      case SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE:
        setHavingClause((HavingClause)null);
        return;
      case SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE:
        setLimitClause((LimitClause)null);
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
      case SparqlPackage.SELECTION_QUERY__BASE:
        return base != null;
      case SparqlPackage.SELECTION_QUERY__DATASET_CLAUSE:
        return datasetClause != null && !datasetClause.isEmpty();
      case SparqlPackage.SELECTION_QUERY__WHERE_CLAUSE:
        return whereClause != null;
      case SparqlPackage.SELECTION_QUERY__GROUP_CLAUSE:
        return groupClause != null;
      case SparqlPackage.SELECTION_QUERY__HAVING_CLAUSE:
        return havingClause != null;
      case SparqlPackage.SELECTION_QUERY__LIMIT_CLAUSE:
        return limitClause != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectionQueryImpl
