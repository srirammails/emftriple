/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.emftriple.query.mql.AliasAttributeExpression;
import com.emftriple.query.mql.AllExpression;
import com.emftriple.query.mql.AndExpression;
import com.emftriple.query.mql.AnyExpression;
import com.emftriple.query.mql.AvgAggregate;
import com.emftriple.query.mql.BetweenExpression;
import com.emftriple.query.mql.BooleanExpression;
import com.emftriple.query.mql.CollectionExpression;
import com.emftriple.query.mql.CountAggregate;
import com.emftriple.query.mql.DateTimeExpression;
import com.emftriple.query.mql.DeleteClause;
import com.emftriple.query.mql.DeleteStatement;
import com.emftriple.query.mql.EmptyComparisonExpression;
import com.emftriple.query.mql.ExistsExpression;
import com.emftriple.query.mql.Expression;
import com.emftriple.query.mql.ExpressionTerm;
import com.emftriple.query.mql.FromClass;
import com.emftriple.query.mql.FromClause;
import com.emftriple.query.mql.FromCollection;
import com.emftriple.query.mql.FromEntry;
import com.emftriple.query.mql.FromJoin;
import com.emftriple.query.mql.Function;
import com.emftriple.query.mql.HavingClause;
import com.emftriple.query.mql.Import;
import com.emftriple.query.mql.InExpression;
import com.emftriple.query.mql.InQueryExpression;
import com.emftriple.query.mql.InSeqExpression;
import com.emftriple.query.mql.InnerJoin;
import com.emftriple.query.mql.IntegerExpression;
import com.emftriple.query.mql.Join;
import com.emftriple.query.mql.LeftJoin;
import com.emftriple.query.mql.LikeExpression;
import com.emftriple.query.mql.MQuery;
import com.emftriple.query.mql.MaxAggregate;
import com.emftriple.query.mql.MinAggregate;
import com.emftriple.query.mql.MqlPackage;
import com.emftriple.query.mql.NamedQuery;
import com.emftriple.query.mql.NullComparisonExpression;
import com.emftriple.query.mql.NullExpression;
import com.emftriple.query.mql.OperatorExpression;
import com.emftriple.query.mql.OrExpression;
import com.emftriple.query.mql.OrderClause;
import com.emftriple.query.mql.OrderItem;
import com.emftriple.query.mql.ParameterExpression;
import com.emftriple.query.mql.QueryModule;
import com.emftriple.query.mql.SelectAggregateExpression;
import com.emftriple.query.mql.SelectClause;
import com.emftriple.query.mql.SelectConstructorExpression;
import com.emftriple.query.mql.SelectExpression;
import com.emftriple.query.mql.SelectFromClause;
import com.emftriple.query.mql.SelectStatement;
import com.emftriple.query.mql.SetClause;
import com.emftriple.query.mql.SomeExpression;
import com.emftriple.query.mql.StringExpression;
import com.emftriple.query.mql.SumAggregate;
import com.emftriple.query.mql.UpdateClause;
import com.emftriple.query.mql.UpdateItem;
import com.emftriple.query.mql.UpdateStatement;
import com.emftriple.query.mql.Value;
import com.emftriple.query.mql.Variable;
import com.emftriple.query.mql.VariableDeclaration;
import com.emftriple.query.mql.WhereClause;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.query.mql.MqlPackage
 * @generated
 */
public class MqlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MqlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MqlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MqlSwitch<Adapter> modelSwitch =
    new MqlSwitch<Adapter>()
    {
      @Override
      public Adapter caseQueryModule(QueryModule object)
      {
        return createQueryModuleAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseNamedQuery(NamedQuery object)
      {
        return createNamedQueryAdapter();
      }
      @Override
      public Adapter caseMQuery(MQuery object)
      {
        return createMQueryAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseHavingClause(HavingClause object)
      {
        return createHavingClauseAdapter();
      }
      @Override
      public Adapter caseOrderClause(OrderClause object)
      {
        return createOrderClauseAdapter();
      }
      @Override
      public Adapter caseOrderItem(OrderItem object)
      {
        return createOrderItemAdapter();
      }
      @Override
      public Adapter caseUpdateStatement(UpdateStatement object)
      {
        return createUpdateStatementAdapter();
      }
      @Override
      public Adapter caseUpdateClause(UpdateClause object)
      {
        return createUpdateClauseAdapter();
      }
      @Override
      public Adapter caseSetClause(SetClause object)
      {
        return createSetClauseAdapter();
      }
      @Override
      public Adapter caseUpdateItem(UpdateItem object)
      {
        return createUpdateItemAdapter();
      }
      @Override
      public Adapter caseDeleteStatement(DeleteStatement object)
      {
        return createDeleteStatementAdapter();
      }
      @Override
      public Adapter caseDeleteClause(DeleteClause object)
      {
        return createDeleteClauseAdapter();
      }
      @Override
      public Adapter caseSelectFromClause(SelectFromClause object)
      {
        return createSelectFromClauseAdapter();
      }
      @Override
      public Adapter caseSelectClause(SelectClause object)
      {
        return createSelectClauseAdapter();
      }
      @Override
      public Adapter caseSelectExpression(SelectExpression object)
      {
        return createSelectExpressionAdapter();
      }
      @Override
      public Adapter caseSelectAggregateExpression(SelectAggregateExpression object)
      {
        return createSelectAggregateExpressionAdapter();
      }
      @Override
      public Adapter caseAvgAggregate(AvgAggregate object)
      {
        return createAvgAggregateAdapter();
      }
      @Override
      public Adapter caseMaxAggregate(MaxAggregate object)
      {
        return createMaxAggregateAdapter();
      }
      @Override
      public Adapter caseMinAggregate(MinAggregate object)
      {
        return createMinAggregateAdapter();
      }
      @Override
      public Adapter caseSumAggregate(SumAggregate object)
      {
        return createSumAggregateAdapter();
      }
      @Override
      public Adapter caseCountAggregate(CountAggregate object)
      {
        return createCountAggregateAdapter();
      }
      @Override
      public Adapter caseSelectConstructorExpression(SelectConstructorExpression object)
      {
        return createSelectConstructorExpressionAdapter();
      }
      @Override
      public Adapter caseFromClause(FromClause object)
      {
        return createFromClauseAdapter();
      }
      @Override
      public Adapter caseFromEntry(FromEntry object)
      {
        return createFromEntryAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseFromClass(FromClass object)
      {
        return createFromClassAdapter();
      }
      @Override
      public Adapter caseFromCollection(FromCollection object)
      {
        return createFromCollectionAdapter();
      }
      @Override
      public Adapter caseFromJoin(FromJoin object)
      {
        return createFromJoinAdapter();
      }
      @Override
      public Adapter caseJoin(Join object)
      {
        return createJoinAdapter();
      }
      @Override
      public Adapter caseLeftJoin(LeftJoin object)
      {
        return createLeftJoinAdapter();
      }
      @Override
      public Adapter caseInnerJoin(InnerJoin object)
      {
        return createInnerJoinAdapter();
      }
      @Override
      public Adapter caseWhereClause(WhereClause object)
      {
        return createWhereClauseAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseOperatorExpression(OperatorExpression object)
      {
        return createOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseExistsExpression(ExistsExpression object)
      {
        return createExistsExpressionAdapter();
      }
      @Override
      public Adapter caseAllExpression(AllExpression object)
      {
        return createAllExpressionAdapter();
      }
      @Override
      public Adapter caseAnyExpression(AnyExpression object)
      {
        return createAnyExpressionAdapter();
      }
      @Override
      public Adapter caseSomeExpression(SomeExpression object)
      {
        return createSomeExpressionAdapter();
      }
      @Override
      public Adapter caseCollectionExpression(CollectionExpression object)
      {
        return createCollectionExpressionAdapter();
      }
      @Override
      public Adapter caseNullComparisonExpression(NullComparisonExpression object)
      {
        return createNullComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseEmptyComparisonExpression(EmptyComparisonExpression object)
      {
        return createEmptyComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseLikeExpression(LikeExpression object)
      {
        return createLikeExpressionAdapter();
      }
      @Override
      public Adapter caseInExpression(InExpression object)
      {
        return createInExpressionAdapter();
      }
      @Override
      public Adapter caseInSeqExpression(InSeqExpression object)
      {
        return createInSeqExpressionAdapter();
      }
      @Override
      public Adapter caseInQueryExpression(InQueryExpression object)
      {
        return createInQueryExpressionAdapter();
      }
      @Override
      public Adapter caseBetweenExpression(BetweenExpression object)
      {
        return createBetweenExpressionAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseExpressionTerm(ExpressionTerm object)
      {
        return createExpressionTermAdapter();
      }
      @Override
      public Adapter caseAliasAttributeExpression(AliasAttributeExpression object)
      {
        return createAliasAttributeExpressionAdapter();
      }
      @Override
      public Adapter caseParameterExpression(ParameterExpression object)
      {
        return createParameterExpressionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseIntegerExpression(IntegerExpression object)
      {
        return createIntegerExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseNullExpression(NullExpression object)
      {
        return createNullExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseDateTimeExpression(DateTimeExpression object)
      {
        return createDateTimeExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.QueryModule <em>Query Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.QueryModule
   * @generated
   */
  public Adapter createQueryModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.NamedQuery <em>Named Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.NamedQuery
   * @generated
   */
  public Adapter createNamedQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.MQuery <em>MQuery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.MQuery
   * @generated
   */
  public Adapter createMQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.HavingClause
   * @generated
   */
  public Adapter createHavingClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.OrderClause <em>Order Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.OrderClause
   * @generated
   */
  public Adapter createOrderClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.OrderItem <em>Order Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.OrderItem
   * @generated
   */
  public Adapter createOrderItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.UpdateStatement
   * @generated
   */
  public Adapter createUpdateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.UpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.UpdateClause
   * @generated
   */
  public Adapter createUpdateClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SetClause
   * @generated
   */
  public Adapter createSetClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.UpdateItem <em>Update Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.UpdateItem
   * @generated
   */
  public Adapter createUpdateItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.DeleteStatement
   * @generated
   */
  public Adapter createDeleteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.DeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.DeleteClause
   * @generated
   */
  public Adapter createDeleteClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectFromClause <em>Select From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectFromClause
   * @generated
   */
  public Adapter createSelectFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectClause
   * @generated
   */
  public Adapter createSelectClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectExpression
   * @generated
   */
  public Adapter createSelectExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectAggregateExpression <em>Select Aggregate Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectAggregateExpression
   * @generated
   */
  public Adapter createSelectAggregateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.AvgAggregate
   * @generated
   */
  public Adapter createAvgAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.MaxAggregate
   * @generated
   */
  public Adapter createMaxAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.MinAggregate <em>Min Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.MinAggregate
   * @generated
   */
  public Adapter createMinAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SumAggregate
   * @generated
   */
  public Adapter createSumAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.CountAggregate
   * @generated
   */
  public Adapter createCountAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SelectConstructorExpression <em>Select Constructor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SelectConstructorExpression
   * @generated
   */
  public Adapter createSelectConstructorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.FromClause
   * @generated
   */
  public Adapter createFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.FromEntry <em>From Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.FromEntry
   * @generated
   */
  public Adapter createFromEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.FromClass <em>From Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.FromClass
   * @generated
   */
  public Adapter createFromClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.FromCollection <em>From Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.FromCollection
   * @generated
   */
  public Adapter createFromCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.FromJoin <em>From Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.FromJoin
   * @generated
   */
  public Adapter createFromJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Join
   * @generated
   */
  public Adapter createJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.LeftJoin <em>Left Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.LeftJoin
   * @generated
   */
  public Adapter createLeftJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.InnerJoin <em>Inner Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.InnerJoin
   * @generated
   */
  public Adapter createInnerJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.WhereClause
   * @generated
   */
  public Adapter createWhereClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.OperatorExpression <em>Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.OperatorExpression
   * @generated
   */
  public Adapter createOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.ExistsExpression <em>Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.ExistsExpression
   * @generated
   */
  public Adapter createExistsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.AllExpression <em>All Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.AllExpression
   * @generated
   */
  public Adapter createAllExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.AnyExpression <em>Any Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.AnyExpression
   * @generated
   */
  public Adapter createAnyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.SomeExpression <em>Some Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.SomeExpression
   * @generated
   */
  public Adapter createSomeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.CollectionExpression
   * @generated
   */
  public Adapter createCollectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.NullComparisonExpression <em>Null Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.NullComparisonExpression
   * @generated
   */
  public Adapter createNullComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.EmptyComparisonExpression <em>Empty Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.EmptyComparisonExpression
   * @generated
   */
  public Adapter createEmptyComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.LikeExpression <em>Like Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.LikeExpression
   * @generated
   */
  public Adapter createLikeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.InExpression <em>In Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.InExpression
   * @generated
   */
  public Adapter createInExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.InSeqExpression <em>In Seq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.InSeqExpression
   * @generated
   */
  public Adapter createInSeqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.InQueryExpression <em>In Query Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.InQueryExpression
   * @generated
   */
  public Adapter createInQueryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.BetweenExpression <em>Between Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.BetweenExpression
   * @generated
   */
  public Adapter createBetweenExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.ExpressionTerm <em>Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.ExpressionTerm
   * @generated
   */
  public Adapter createExpressionTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.AliasAttributeExpression <em>Alias Attribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.AliasAttributeExpression
   * @generated
   */
  public Adapter createAliasAttributeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.ParameterExpression
   * @generated
   */
  public Adapter createParameterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.IntegerExpression <em>Integer Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.IntegerExpression
   * @generated
   */
  public Adapter createIntegerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.NullExpression <em>Null Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.NullExpression
   * @generated
   */
  public Adapter createNullExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.DateTimeExpression <em>Date Time Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.DateTimeExpression
   * @generated
   */
  public Adapter createDateTimeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.mql.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.mql.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MqlAdapterFactory
