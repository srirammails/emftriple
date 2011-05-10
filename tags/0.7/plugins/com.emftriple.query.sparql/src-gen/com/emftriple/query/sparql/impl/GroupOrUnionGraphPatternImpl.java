/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.GroupOrUnionGraphPattern;
import com.emftriple.query.sparql.SparqlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Or Union Graph Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.GroupOrUnionGraphPatternImpl#getGraphPatterns <em>Graph Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupOrUnionGraphPatternImpl extends GraphPatternImpl implements GroupOrUnionGraphPattern
{
  /**
   * The cached value of the '{@link #getGraphPatterns() <em>Graph Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphPatterns()
   * @generated
   * @ordered
   */
  protected EList<GroupGraphPattern> graphPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupOrUnionGraphPatternImpl()
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
    return SparqlPackage.Literals.GROUP_OR_UNION_GRAPH_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupGraphPattern> getGraphPatterns()
  {
    if (graphPatterns == null)
    {
      graphPatterns = new EObjectContainmentEList<GroupGraphPattern>(GroupGraphPattern.class, this, SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS);
    }
    return graphPatterns;
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
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS:
        return ((InternalEList<?>)getGraphPatterns()).basicRemove(otherEnd, msgs);
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
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS:
        return getGraphPatterns();
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
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS:
        getGraphPatterns().clear();
        getGraphPatterns().addAll((Collection<? extends GroupGraphPattern>)newValue);
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
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS:
        getGraphPatterns().clear();
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
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS:
        return graphPatterns != null && !graphPatterns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GroupOrUnionGraphPatternImpl
