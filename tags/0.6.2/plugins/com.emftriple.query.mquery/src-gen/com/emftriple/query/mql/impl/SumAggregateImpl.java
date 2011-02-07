/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.ecore.EClass;

import com.emftriple.query.mql.MqlPackage;
import com.emftriple.query.mql.SumAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SumAggregateImpl extends SelectAggregateExpressionImpl implements SumAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumAggregateImpl()
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
    return MqlPackage.Literals.SUM_AGGREGATE;
  }

} //SumAggregateImpl
