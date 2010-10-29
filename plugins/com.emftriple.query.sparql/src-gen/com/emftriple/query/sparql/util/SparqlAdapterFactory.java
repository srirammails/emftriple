/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.util;

import com.emftriple.query.sparql.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.query.sparql.SparqlPackage
 * @generated
 */
public class SparqlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SparqlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SparqlPackage.eINSTANCE;
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
  protected SparqlSwitch<Adapter> modelSwitch =
    new SparqlSwitch<Adapter>()
    {
      @Override
      public Adapter caseSPARQLQuery(SPARQLQuery object)
      {
        return createSPARQLQueryAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseBase(Base object)
      {
        return createBaseAdapter();
      }
      @Override
      public Adapter caseSelectionQuery(SelectionQuery object)
      {
        return createSelectionQueryAdapter();
      }
      @Override
      public Adapter caseSelectQuery(SelectQuery object)
      {
        return createSelectQueryAdapter();
      }
      @Override
      public Adapter caseAskQuery(AskQuery object)
      {
        return createAskQueryAdapter();
      }
      @Override
      public Adapter caseDescribeQuery(DescribeQuery object)
      {
        return createDescribeQueryAdapter();
      }
      @Override
      public Adapter caseConstructQuery(ConstructQuery object)
      {
        return createConstructQueryAdapter();
      }
      @Override
      public Adapter caseUpdateQuery(UpdateQuery object)
      {
        return createUpdateQueryAdapter();
      }
      @Override
      public Adapter caseUpdateOperation(UpdateOperation object)
      {
        return createUpdateOperationAdapter();
      }
      @Override
      public Adapter caseModifyQuery(ModifyQuery object)
      {
        return createModifyQueryAdapter();
      }
      @Override
      public Adapter caseCreateGraphQuery(CreateGraphQuery object)
      {
        return createCreateGraphQueryAdapter();
      }
      @Override
      public Adapter caseDropGraphQuery(DropGraphQuery object)
      {
        return createDropGraphQueryAdapter();
      }
      @Override
      public Adapter caseLoadGraphQuery(LoadGraphQuery object)
      {
        return createLoadGraphQueryAdapter();
      }
      @Override
      public Adapter caseClearGraphQuery(ClearGraphQuery object)
      {
        return createClearGraphQueryAdapter();
      }
      @Override
      public Adapter caseUsingGraph(UsingGraph object)
      {
        return createUsingGraphAdapter();
      }
      @Override
      public Adapter caseInsertQuery(InsertQuery object)
      {
        return createInsertQueryAdapter();
      }
      @Override
      public Adapter caseInsertDataQuery(InsertDataQuery object)
      {
        return createInsertDataQueryAdapter();
      }
      @Override
      public Adapter caseDeleteQuery(DeleteQuery object)
      {
        return createDeleteQueryAdapter();
      }
      @Override
      public Adapter caseDeleteDataQuery(DeleteDataQuery object)
      {
        return createDeleteDataQueryAdapter();
      }
      @Override
      public Adapter caseDeleteWhereQuery(DeleteWhereQuery object)
      {
        return createDeleteWhereQueryAdapter();
      }
      @Override
      public Adapter caseDatasetClause(DatasetClause object)
      {
        return createDatasetClauseAdapter();
      }
      @Override
      public Adapter caseDefaultDataSet(DefaultDataSet object)
      {
        return createDefaultDataSetAdapter();
      }
      @Override
      public Adapter caseNamedDataSet(NamedDataSet object)
      {
        return createNamedDataSetAdapter();
      }
      @Override
      public Adapter caseServiceDataSet(ServiceDataSet object)
      {
        return createServiceDataSetAdapter();
      }
      @Override
      public Adapter caseWhereClause(WhereClause object)
      {
        return createWhereClauseAdapter();
      }
      @Override
      public Adapter caseGroupClause(GroupClause object)
      {
        return createGroupClauseAdapter();
      }
      @Override
      public Adapter caseGroupCondition(GroupCondition object)
      {
        return createGroupConditionAdapter();
      }
      @Override
      public Adapter caseHavingClause(HavingClause object)
      {
        return createHavingClauseAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseLimitClause(LimitClause object)
      {
        return createLimitClauseAdapter();
      }
      @Override
      public Adapter caseGroupGraphPattern(GroupGraphPattern object)
      {
        return createGroupGraphPatternAdapter();
      }
      @Override
      public Adapter caseSubSelectQuery(SubSelectQuery object)
      {
        return createSubSelectQueryAdapter();
      }
      @Override
      public Adapter caseGroupGraphPatternSub(GroupGraphPatternSub object)
      {
        return createGroupGraphPatternSubAdapter();
      }
      @Override
      public Adapter caseGraphPattern(GraphPattern object)
      {
        return createGraphPatternAdapter();
      }
      @Override
      public Adapter caseTriplesSameSubject(TriplesSameSubject object)
      {
        return createTriplesSameSubjectAdapter();
      }
      @Override
      public Adapter caseGroupOrUnionGraphPattern(GroupOrUnionGraphPattern object)
      {
        return createGroupOrUnionGraphPatternAdapter();
      }
      @Override
      public Adapter caseOptionalGraphPattern(OptionalGraphPattern object)
      {
        return createOptionalGraphPatternAdapter();
      }
      @Override
      public Adapter casePropertyList(PropertyList object)
      {
        return createPropertyListAdapter();
      }
      @Override
      public Adapter caseGraphGraphPattern(GraphGraphPattern object)
      {
        return createGraphGraphPatternAdapter();
      }
      @Override
      public Adapter caseServiceGraphPattern(ServiceGraphPattern object)
      {
        return createServiceGraphPatternAdapter();
      }
      @Override
      public Adapter caseFilterPattern(FilterPattern object)
      {
        return createFilterPatternAdapter();
      }
      @Override
      public Adapter caseExistsPattern(ExistsPattern object)
      {
        return createExistsPatternAdapter();
      }
      @Override
      public Adapter caseNotExistsPattern(NotExistsPattern object)
      {
        return createNotExistsPatternAdapter();
      }
      @Override
      public Adapter caseMinusPattern(MinusPattern object)
      {
        return createMinusPatternAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionFilterExpression(ExpressionFilterExpression object)
      {
        return createExpressionFilterExpressionAdapter();
      }
      @Override
      public Adapter caseFilterNode(FilterNode object)
      {
        return createFilterNodeAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseNamedFunction(NamedFunction object)
      {
        return createNamedFunctionAdapter();
      }
      @Override
      public Adapter caseSparqlFunction(SparqlFunction object)
      {
        return createSparqlFunctionAdapter();
      }
      @Override
      public Adapter caseBuiltInCall(BuiltInCall object)
      {
        return createBuiltInCallAdapter();
      }
      @Override
      public Adapter caseAggregate(Aggregate object)
      {
        return createAggregateAdapter();
      }
      @Override
      public Adapter caseExprAggArg(ExprAggArg object)
      {
        return createExprAggArgAdapter();
      }
      @Override
      public Adapter caseGraphNode(GraphNode object)
      {
        return createGraphNodeAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseUnNamedVariable(UnNamedVariable object)
      {
        return createUnNamedVariableAdapter();
      }
      @Override
      public Adapter caseNamedVariable(NamedVariable object)
      {
        return createNamedVariableAdapter();
      }
      @Override
      public Adapter caseBlankNode(BlankNode object)
      {
        return createBlankNodeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseIRI(IRI object)
      {
        return createIRIAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
      }
      @Override
      public Adapter caseRDFTag(RDFTag object)
      {
        return createRDFTagAdapter();
      }
      @Override
      public Adapter caseTypeTag(TypeTag object)
      {
        return createTypeTagAdapter();
      }
      @Override
      public Adapter caseLangTag(LangTag object)
      {
        return createLangTagAdapter();
      }
      @Override
      public Adapter caseOrFilterExpression(OrFilterExpression object)
      {
        return createOrFilterExpressionAdapter();
      }
      @Override
      public Adapter caseAndFilterExpression(AndFilterExpression object)
      {
        return createAndFilterExpressionAdapter();
      }
      @Override
      public Adapter caseCountAggregate(CountAggregate object)
      {
        return createCountAggregateAdapter();
      }
      @Override
      public Adapter caseSumAggregate(SumAggregate object)
      {
        return createSumAggregateAdapter();
      }
      @Override
      public Adapter caseMinAgregate(MinAgregate object)
      {
        return createMinAgregateAdapter();
      }
      @Override
      public Adapter caseMaxAggregate(MaxAggregate object)
      {
        return createMaxAggregateAdapter();
      }
      @Override
      public Adapter caseAvgAggregate(AvgAggregate object)
      {
        return createAvgAggregateAdapter();
      }
      @Override
      public Adapter caseSampleAggregate(SampleAggregate object)
      {
        return createSampleAggregateAdapter();
      }
      @Override
      public Adapter caseGroupAggregate(GroupAggregate object)
      {
        return createGroupAggregateAdapter();
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
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SPARQLQuery <em>SPARQL Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SPARQLQuery
   * @generated
   */
  public Adapter createSPARQLQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Base <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Base
   * @generated
   */
  public Adapter createBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SelectionQuery <em>Selection Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SelectionQuery
   * @generated
   */
  public Adapter createSelectionQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SelectQuery <em>Select Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SelectQuery
   * @generated
   */
  public Adapter createSelectQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.AskQuery <em>Ask Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.AskQuery
   * @generated
   */
  public Adapter createAskQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DescribeQuery <em>Describe Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DescribeQuery
   * @generated
   */
  public Adapter createDescribeQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ConstructQuery <em>Construct Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ConstructQuery
   * @generated
   */
  public Adapter createConstructQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.UpdateQuery <em>Update Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.UpdateQuery
   * @generated
   */
  public Adapter createUpdateQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.UpdateOperation <em>Update Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.UpdateOperation
   * @generated
   */
  public Adapter createUpdateOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ModifyQuery <em>Modify Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ModifyQuery
   * @generated
   */
  public Adapter createModifyQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.CreateGraphQuery <em>Create Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.CreateGraphQuery
   * @generated
   */
  public Adapter createCreateGraphQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DropGraphQuery <em>Drop Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DropGraphQuery
   * @generated
   */
  public Adapter createDropGraphQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.LoadGraphQuery <em>Load Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.LoadGraphQuery
   * @generated
   */
  public Adapter createLoadGraphQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ClearGraphQuery <em>Clear Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ClearGraphQuery
   * @generated
   */
  public Adapter createClearGraphQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.UsingGraph <em>Using Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.UsingGraph
   * @generated
   */
  public Adapter createUsingGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.InsertQuery <em>Insert Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.InsertQuery
   * @generated
   */
  public Adapter createInsertQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.InsertDataQuery <em>Insert Data Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.InsertDataQuery
   * @generated
   */
  public Adapter createInsertDataQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DeleteQuery <em>Delete Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DeleteQuery
   * @generated
   */
  public Adapter createDeleteQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DeleteDataQuery <em>Delete Data Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DeleteDataQuery
   * @generated
   */
  public Adapter createDeleteDataQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DeleteWhereQuery <em>Delete Where Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DeleteWhereQuery
   * @generated
   */
  public Adapter createDeleteWhereQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DatasetClause <em>Dataset Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DatasetClause
   * @generated
   */
  public Adapter createDatasetClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.DefaultDataSet <em>Default Data Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.DefaultDataSet
   * @generated
   */
  public Adapter createDefaultDataSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.NamedDataSet <em>Named Data Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.NamedDataSet
   * @generated
   */
  public Adapter createNamedDataSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ServiceDataSet <em>Service Data Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ServiceDataSet
   * @generated
   */
  public Adapter createServiceDataSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.WhereClause
   * @generated
   */
  public Adapter createWhereClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupClause
   * @generated
   */
  public Adapter createGroupClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupCondition <em>Group Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupCondition
   * @generated
   */
  public Adapter createGroupConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.HavingClause
   * @generated
   */
  public Adapter createHavingClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.LimitClause <em>Limit Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.LimitClause
   * @generated
   */
  public Adapter createLimitClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupGraphPattern <em>Group Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupGraphPattern
   * @generated
   */
  public Adapter createGroupGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SubSelectQuery <em>Sub Select Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SubSelectQuery
   * @generated
   */
  public Adapter createSubSelectQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupGraphPatternSub <em>Group Graph Pattern Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupGraphPatternSub
   * @generated
   */
  public Adapter createGroupGraphPatternSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GraphPattern <em>Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GraphPattern
   * @generated
   */
  public Adapter createGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.TriplesSameSubject <em>Triples Same Subject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.TriplesSameSubject
   * @generated
   */
  public Adapter createTriplesSameSubjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupOrUnionGraphPattern <em>Group Or Union Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupOrUnionGraphPattern
   * @generated
   */
  public Adapter createGroupOrUnionGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.OptionalGraphPattern <em>Optional Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.OptionalGraphPattern
   * @generated
   */
  public Adapter createOptionalGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.PropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.PropertyList
   * @generated
   */
  public Adapter createPropertyListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GraphGraphPattern <em>Graph Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GraphGraphPattern
   * @generated
   */
  public Adapter createGraphGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ServiceGraphPattern <em>Service Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ServiceGraphPattern
   * @generated
   */
  public Adapter createServiceGraphPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.FilterPattern <em>Filter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.FilterPattern
   * @generated
   */
  public Adapter createFilterPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ExistsPattern <em>Exists Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ExistsPattern
   * @generated
   */
  public Adapter createExistsPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.NotExistsPattern <em>Not Exists Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.NotExistsPattern
   * @generated
   */
  public Adapter createNotExistsPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.MinusPattern <em>Minus Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.MinusPattern
   * @generated
   */
  public Adapter createMinusPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ExpressionFilterExpression <em>Expression Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ExpressionFilterExpression
   * @generated
   */
  public Adapter createExpressionFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.FilterNode <em>Filter Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.FilterNode
   * @generated
   */
  public Adapter createFilterNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.NamedFunction <em>Named Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.NamedFunction
   * @generated
   */
  public Adapter createNamedFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SparqlFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SparqlFunction
   * @generated
   */
  public Adapter createSparqlFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.BuiltInCall <em>Built In Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.BuiltInCall
   * @generated
   */
  public Adapter createBuiltInCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Aggregate
   * @generated
   */
  public Adapter createAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.ExprAggArg <em>Expr Agg Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.ExprAggArg
   * @generated
   */
  public Adapter createExprAggArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GraphNode <em>Graph Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GraphNode
   * @generated
   */
  public Adapter createGraphNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.UnNamedVariable <em>Un Named Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.UnNamedVariable
   * @generated
   */
  public Adapter createUnNamedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.NamedVariable <em>Named Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.NamedVariable
   * @generated
   */
  public Adapter createNamedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.BlankNode <em>Blank Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.BlankNode
   * @generated
   */
  public Adapter createBlankNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.IRI
   * @generated
   */
  public Adapter createIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.RDFTag <em>RDF Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.RDFTag
   * @generated
   */
  public Adapter createRDFTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.TypeTag <em>Type Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.TypeTag
   * @generated
   */
  public Adapter createTypeTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.LangTag <em>Lang Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.LangTag
   * @generated
   */
  public Adapter createLangTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.OrFilterExpression <em>Or Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.OrFilterExpression
   * @generated
   */
  public Adapter createOrFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.AndFilterExpression <em>And Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.AndFilterExpression
   * @generated
   */
  public Adapter createAndFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.CountAggregate
   * @generated
   */
  public Adapter createCountAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SumAggregate
   * @generated
   */
  public Adapter createSumAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.MinAgregate <em>Min Agregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.MinAgregate
   * @generated
   */
  public Adapter createMinAgregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.MaxAggregate
   * @generated
   */
  public Adapter createMaxAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.AvgAggregate
   * @generated
   */
  public Adapter createAvgAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.SampleAggregate <em>Sample Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.SampleAggregate
   * @generated
   */
  public Adapter createSampleAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.emftriple.query.sparql.GroupAggregate <em>Group Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.emftriple.query.sparql.GroupAggregate
   * @generated
   */
  public Adapter createGroupAggregateAdapter()
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

} //SparqlAdapterFactory
