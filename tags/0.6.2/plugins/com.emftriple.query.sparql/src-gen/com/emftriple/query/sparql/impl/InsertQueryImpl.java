/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.InsertQuery;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.WhereClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.InsertQueryImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.InsertQueryImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertQueryImpl extends ModifyQueryImpl implements InsertQuery
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
  protected InsertQueryImpl()
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
    return SparqlPackage.Literals.INSERT_QUERY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.INSERT_QUERY__GRAPH, oldGraph, graph));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.INSERT_QUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
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
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.INSERT_QUERY__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.INSERT_QUERY__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.INSERT_QUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
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
      case SparqlPackage.INSERT_QUERY__WHERE_CLAUSE:
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
      case SparqlPackage.INSERT_QUERY__GRAPH:
        return getGraph();
      case SparqlPackage.INSERT_QUERY__WHERE_CLAUSE:
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
      case SparqlPackage.INSERT_QUERY__GRAPH:
        setGraph((String)newValue);
        return;
      case SparqlPackage.INSERT_QUERY__WHERE_CLAUSE:
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
      case SparqlPackage.INSERT_QUERY__GRAPH:
        setGraph(GRAPH_EDEFAULT);
        return;
      case SparqlPackage.INSERT_QUERY__WHERE_CLAUSE:
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
      case SparqlPackage.INSERT_QUERY__GRAPH:
        return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
      case SparqlPackage.INSERT_QUERY__WHERE_CLAUSE:
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

} //InsertQueryImpl
