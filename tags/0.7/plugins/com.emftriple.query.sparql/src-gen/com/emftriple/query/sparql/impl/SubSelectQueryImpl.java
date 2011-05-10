/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.GroupClause;
import com.emftriple.query.sparql.HavingClause;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.SubSelectQuery;
import com.emftriple.query.sparql.Variable;
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
 * An implementation of the model object '<em><b>Sub Select Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl#getHavingClause <em>Having Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubSelectQueryImpl extends GroupGraphPatternImpl implements SubSelectQuery
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubSelectQueryImpl()
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
    return SparqlPackage.Literals.SUB_SELECT_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, SparqlPackage.SUB_SELECT_QUERY__VARIABLES);
    }
    return variables;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
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
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE, oldGroupClause, newGroupClause);
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
        msgs = ((InternalEObject)groupClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE, null, msgs);
      if (newGroupClause != null)
        msgs = ((InternalEObject)newGroupClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE, null, msgs);
      msgs = basicSetGroupClause(newGroupClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE, newGroupClause, newGroupClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE, oldHavingClause, newHavingClause);
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
        msgs = ((InternalEObject)havingClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE, null, msgs);
      if (newHavingClause != null)
        msgs = ((InternalEObject)newHavingClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE, null, msgs);
      msgs = basicSetHavingClause(newHavingClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE, newHavingClause, newHavingClause));
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
      case SparqlPackage.SUB_SELECT_QUERY__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE:
        return basicSetWhereClause(null, msgs);
      case SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE:
        return basicSetGroupClause(null, msgs);
      case SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE:
        return basicSetHavingClause(null, msgs);
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
      case SparqlPackage.SUB_SELECT_QUERY__VARIABLES:
        return getVariables();
      case SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE:
        return getWhereClause();
      case SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE:
        return getGroupClause();
      case SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE:
        return getHavingClause();
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
      case SparqlPackage.SUB_SELECT_QUERY__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)newValue);
        return;
      case SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE:
        setGroupClause((GroupClause)newValue);
        return;
      case SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE:
        setHavingClause((HavingClause)newValue);
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
      case SparqlPackage.SUB_SELECT_QUERY__VARIABLES:
        getVariables().clear();
        return;
      case SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)null);
        return;
      case SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE:
        setGroupClause((GroupClause)null);
        return;
      case SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE:
        setHavingClause((HavingClause)null);
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
      case SparqlPackage.SUB_SELECT_QUERY__VARIABLES:
        return variables != null && !variables.isEmpty();
      case SparqlPackage.SUB_SELECT_QUERY__WHERE_CLAUSE:
        return whereClause != null;
      case SparqlPackage.SUB_SELECT_QUERY__GROUP_CLAUSE:
        return groupClause != null;
      case SparqlPackage.SUB_SELECT_QUERY__HAVING_CLAUSE:
        return havingClause != null;
    }
    return super.eIsSet(featureID);
  }

} //SubSelectQueryImpl
