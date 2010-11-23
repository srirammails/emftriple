/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.WhereClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.WhereClauseImpl#getGroupGraphPattern <em>Group Graph Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhereClauseImpl extends MinimalEObjectImpl.Container implements WhereClause
{
  /**
   * The cached value of the '{@link #getGroupGraphPattern() <em>Group Graph Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupGraphPattern()
   * @generated
   * @ordered
   */
  protected GroupGraphPattern groupGraphPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereClauseImpl()
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
    return SparqlPackage.Literals.WHERE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPattern getGroupGraphPattern()
  {
    return groupGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupGraphPattern(GroupGraphPattern newGroupGraphPattern, NotificationChain msgs)
  {
    GroupGraphPattern oldGroupGraphPattern = groupGraphPattern;
    groupGraphPattern = newGroupGraphPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN, oldGroupGraphPattern, newGroupGraphPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupGraphPattern(GroupGraphPattern newGroupGraphPattern)
  {
    if (newGroupGraphPattern != groupGraphPattern)
    {
      NotificationChain msgs = null;
      if (groupGraphPattern != null)
        msgs = ((InternalEObject)groupGraphPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN, null, msgs);
      if (newGroupGraphPattern != null)
        msgs = ((InternalEObject)newGroupGraphPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN, null, msgs);
      msgs = basicSetGroupGraphPattern(newGroupGraphPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN, newGroupGraphPattern, newGroupGraphPattern));
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
      case SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN:
        return basicSetGroupGraphPattern(null, msgs);
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
      case SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN:
        return getGroupGraphPattern();
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
      case SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN:
        setGroupGraphPattern((GroupGraphPattern)newValue);
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
      case SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN:
        setGroupGraphPattern((GroupGraphPattern)null);
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
      case SparqlPackage.WHERE_CLAUSE__GROUP_GRAPH_PATTERN:
        return groupGraphPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //WhereClauseImpl
