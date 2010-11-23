/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.ecore.EClass;

import com.emftriple.query.mql.CountAggregate;
import com.emftriple.query.mql.MqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CountAggregateImpl extends SelectAggregateExpressionImpl implements CountAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountAggregateImpl()
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
    return MqlPackage.Literals.COUNT_AGGREGATE;
  }

} //CountAggregateImpl
