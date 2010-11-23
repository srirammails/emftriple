/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.ecore.EClass;

import com.emftriple.query.mql.MinAggregate;
import com.emftriple.query.mql.MqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinAggregateImpl extends SelectAggregateExpressionImpl implements MinAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinAggregateImpl()
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
    return MqlPackage.Literals.MIN_AGGREGATE;
  }

} //MinAggregateImpl
