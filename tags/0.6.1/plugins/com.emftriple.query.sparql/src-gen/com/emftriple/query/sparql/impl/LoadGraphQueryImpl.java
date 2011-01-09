/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.LoadGraphQuery;
import com.emftriple.query.sparql.SparqlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Graph Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.LoadGraphQueryImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.LoadGraphQueryImpl#getIntoGraph <em>Into Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadGraphQueryImpl extends UpdateOperationImpl implements LoadGraphQuery
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
   * The default value of the '{@link #getIntoGraph() <em>Into Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntoGraph()
   * @generated
   * @ordered
   */
  protected static final String INTO_GRAPH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntoGraph() <em>Into Graph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntoGraph()
   * @generated
   * @ordered
   */
  protected String intoGraph = INTO_GRAPH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadGraphQueryImpl()
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
    return SparqlPackage.Literals.LOAD_GRAPH_QUERY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.LOAD_GRAPH_QUERY__GRAPH, oldGraph, graph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntoGraph()
  {
    return intoGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntoGraph(String newIntoGraph)
  {
    String oldIntoGraph = intoGraph;
    intoGraph = newIntoGraph;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.LOAD_GRAPH_QUERY__INTO_GRAPH, oldIntoGraph, intoGraph));
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
      case SparqlPackage.LOAD_GRAPH_QUERY__GRAPH:
        return getGraph();
      case SparqlPackage.LOAD_GRAPH_QUERY__INTO_GRAPH:
        return getIntoGraph();
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
      case SparqlPackage.LOAD_GRAPH_QUERY__GRAPH:
        setGraph((String)newValue);
        return;
      case SparqlPackage.LOAD_GRAPH_QUERY__INTO_GRAPH:
        setIntoGraph((String)newValue);
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
      case SparqlPackage.LOAD_GRAPH_QUERY__GRAPH:
        setGraph(GRAPH_EDEFAULT);
        return;
      case SparqlPackage.LOAD_GRAPH_QUERY__INTO_GRAPH:
        setIntoGraph(INTO_GRAPH_EDEFAULT);
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
      case SparqlPackage.LOAD_GRAPH_QUERY__GRAPH:
        return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
      case SparqlPackage.LOAD_GRAPH_QUERY__INTO_GRAPH:
        return INTO_GRAPH_EDEFAULT == null ? intoGraph != null : !INTO_GRAPH_EDEFAULT.equals(intoGraph);
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
    result.append(", intoGraph: ");
    result.append(intoGraph);
    result.append(')');
    return result.toString();
  }

} //LoadGraphQueryImpl
