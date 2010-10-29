/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.DeleteQuery;
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
 * An implementation of the model object '<em><b>Delete Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.DeleteQueryImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.DeleteQueryImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.DeleteQueryImpl#getInsertPattern <em>Insert Pattern</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.DeleteQueryImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeleteQueryImpl extends MinimalEObjectImpl.Container implements DeleteQuery
{
  /**
   * The default value of the '{@link #getGraph() <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraph()
   * @generated
   * @ordered
   */
  protected static final String GRAPH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGraph() <em>Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraph()
   * @generated
   * @ordered
   */
  protected String graph = GRAPH_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected GroupGraphPattern pattern;

  /**
   * The cached value of the '{@link #getInsertPattern() <em>Insert Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertPattern()
   * @generated
   * @ordered
   */
  protected GroupGraphPattern insertPattern;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteQueryImpl()
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
    return SparqlPackage.Literals.DELETE_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGraph()
  {
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraph(String newGraph)
  {
    String oldGraph = graph;
    graph = newGraph;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__GRAPH, oldGraph, graph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPattern getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(GroupGraphPattern newPattern, NotificationChain msgs)
  {
    GroupGraphPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(GroupGraphPattern newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPattern getInsertPattern()
  {
    return insertPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsertPattern(GroupGraphPattern newInsertPattern, NotificationChain msgs)
  {
    GroupGraphPattern oldInsertPattern = insertPattern;
    insertPattern = newInsertPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__INSERT_PATTERN, oldInsertPattern, newInsertPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertPattern(GroupGraphPattern newInsertPattern)
  {
    if (newInsertPattern != insertPattern)
    {
      NotificationChain msgs = null;
      if (insertPattern != null)
        msgs = ((InternalEObject)insertPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__INSERT_PATTERN, null, msgs);
      if (newInsertPattern != null)
        msgs = ((InternalEObject)newInsertPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__INSERT_PATTERN, null, msgs);
      msgs = basicSetInsertPattern(newInsertPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__INSERT_PATTERN, newInsertPattern, newInsertPattern));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
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
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DELETE_QUERY__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.DELETE_QUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
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
      case SparqlPackage.DELETE_QUERY__PATTERN:
        return basicSetPattern(null, msgs);
      case SparqlPackage.DELETE_QUERY__INSERT_PATTERN:
        return basicSetInsertPattern(null, msgs);
      case SparqlPackage.DELETE_QUERY__WHERE_CLAUSE:
        return basicSetWhereClause(null, msgs);
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
      case SparqlPackage.DELETE_QUERY__GRAPH:
        return getGraph();
      case SparqlPackage.DELETE_QUERY__PATTERN:
        return getPattern();
      case SparqlPackage.DELETE_QUERY__INSERT_PATTERN:
        return getInsertPattern();
      case SparqlPackage.DELETE_QUERY__WHERE_CLAUSE:
        return getWhereClause();
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
      case SparqlPackage.DELETE_QUERY__GRAPH:
        setGraph((String)newValue);
        return;
      case SparqlPackage.DELETE_QUERY__PATTERN:
        setPattern((GroupGraphPattern)newValue);
        return;
      case SparqlPackage.DELETE_QUERY__INSERT_PATTERN:
        setInsertPattern((GroupGraphPattern)newValue);
        return;
      case SparqlPackage.DELETE_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)newValue);
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
      case SparqlPackage.DELETE_QUERY__GRAPH:
        setGraph(GRAPH_EDEFAULT);
        return;
      case SparqlPackage.DELETE_QUERY__PATTERN:
        setPattern((GroupGraphPattern)null);
        return;
      case SparqlPackage.DELETE_QUERY__INSERT_PATTERN:
        setInsertPattern((GroupGraphPattern)null);
        return;
      case SparqlPackage.DELETE_QUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)null);
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
      case SparqlPackage.DELETE_QUERY__GRAPH:
        return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
      case SparqlPackage.DELETE_QUERY__PATTERN:
        return pattern != null;
      case SparqlPackage.DELETE_QUERY__INSERT_PATTERN:
        return insertPattern != null;
      case SparqlPackage.DELETE_QUERY__WHERE_CLAUSE:
        return whereClause != null;
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
    result.append(" (graph: ");
    result.append(graph);
    result.append(')');
    return result.toString();
  }

} //DeleteQueryImpl
