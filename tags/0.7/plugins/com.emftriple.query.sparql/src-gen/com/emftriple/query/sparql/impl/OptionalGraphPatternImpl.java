/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.OptionalGraphPattern;
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
 * An implementation of the model object '<em><b>Optional Graph Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.OptionalGraphPatternImpl#getGraphPattern <em>Graph Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionalGraphPatternImpl extends GraphPatternImpl implements OptionalGraphPattern
{
  /**
   * The cached value of the '{@link #getGraphPattern() <em>Graph Pattern</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphPattern()
   * @generated
   * @ordered
   */
  protected EList<GroupGraphPattern> graphPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalGraphPatternImpl()
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
    return SparqlPackage.Literals.OPTIONAL_GRAPH_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupGraphPattern> getGraphPattern()
  {
    if (graphPattern == null)
    {
      graphPattern = new EObjectContainmentEList<GroupGraphPattern>(GroupGraphPattern.class, this, SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN);
    }
    return graphPattern;
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
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN:
        return ((InternalEList<?>)getGraphPattern()).basicRemove(otherEnd, msgs);
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
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN:
        return getGraphPattern();
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
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN:
        getGraphPattern().clear();
        getGraphPattern().addAll((Collection<? extends GroupGraphPattern>)newValue);
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
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN:
        getGraphPattern().clear();
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
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN:
        return graphPattern != null && !graphPattern.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptionalGraphPatternImpl
