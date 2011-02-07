/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.util;

import com.emftriple.query.sparql.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.emftriple.query.sparql.SparqlPackage
 * @generated
 */
public class SparqlSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SparqlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SparqlPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SparqlPackage.SPARQL_QUERY:
      {
        SPARQLQuery sparqlQuery = (SPARQLQuery)theEObject;
        T result = caseSPARQLQuery(sparqlQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.BASE:
      {
        Base base = (Base)theEObject;
        T result = caseBase(base);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SELECTION_QUERY:
      {
        SelectionQuery selectionQuery = (SelectionQuery)theEObject;
        T result = caseSelectionQuery(selectionQuery);
        if (result == null) result = caseSPARQLQuery(selectionQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SELECT_QUERY:
      {
        SelectQuery selectQuery = (SelectQuery)theEObject;
        T result = caseSelectQuery(selectQuery);
        if (result == null) result = caseSelectionQuery(selectQuery);
        if (result == null) result = caseSPARQLQuery(selectQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.ASK_QUERY:
      {
        AskQuery askQuery = (AskQuery)theEObject;
        T result = caseAskQuery(askQuery);
        if (result == null) result = caseSelectionQuery(askQuery);
        if (result == null) result = caseSPARQLQuery(askQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DESCRIBE_QUERY:
      {
        DescribeQuery describeQuery = (DescribeQuery)theEObject;
        T result = caseDescribeQuery(describeQuery);
        if (result == null) result = caseSelectionQuery(describeQuery);
        if (result == null) result = caseSPARQLQuery(describeQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.CONSTRUCT_QUERY:
      {
        ConstructQuery constructQuery = (ConstructQuery)theEObject;
        T result = caseConstructQuery(constructQuery);
        if (result == null) result = caseSelectionQuery(constructQuery);
        if (result == null) result = caseSPARQLQuery(constructQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.UPDATE_QUERY:
      {
        UpdateQuery updateQuery = (UpdateQuery)theEObject;
        T result = caseUpdateQuery(updateQuery);
        if (result == null) result = caseSPARQLQuery(updateQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.UPDATE_OPERATION:
      {
        UpdateOperation updateOperation = (UpdateOperation)theEObject;
        T result = caseUpdateOperation(updateOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.MODIFY_QUERY:
      {
        ModifyQuery modifyQuery = (ModifyQuery)theEObject;
        T result = caseModifyQuery(modifyQuery);
        if (result == null) result = caseUpdateOperation(modifyQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.CREATE_GRAPH_QUERY:
      {
        CreateGraphQuery createGraphQuery = (CreateGraphQuery)theEObject;
        T result = caseCreateGraphQuery(createGraphQuery);
        if (result == null) result = caseUpdateOperation(createGraphQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DROP_GRAPH_QUERY:
      {
        DropGraphQuery dropGraphQuery = (DropGraphQuery)theEObject;
        T result = caseDropGraphQuery(dropGraphQuery);
        if (result == null) result = caseUpdateOperation(dropGraphQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.LOAD_GRAPH_QUERY:
      {
        LoadGraphQuery loadGraphQuery = (LoadGraphQuery)theEObject;
        T result = caseLoadGraphQuery(loadGraphQuery);
        if (result == null) result = caseUpdateOperation(loadGraphQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.CLEAR_GRAPH_QUERY:
      {
        ClearGraphQuery clearGraphQuery = (ClearGraphQuery)theEObject;
        T result = caseClearGraphQuery(clearGraphQuery);
        if (result == null) result = caseUpdateOperation(clearGraphQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.USING_GRAPH:
      {
        UsingGraph usingGraph = (UsingGraph)theEObject;
        T result = caseUsingGraph(usingGraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.INSERT_QUERY:
      {
        InsertQuery insertQuery = (InsertQuery)theEObject;
        T result = caseInsertQuery(insertQuery);
        if (result == null) result = caseModifyQuery(insertQuery);
        if (result == null) result = caseUpdateOperation(insertQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.INSERT_DATA_QUERY:
      {
        InsertDataQuery insertDataQuery = (InsertDataQuery)theEObject;
        T result = caseInsertDataQuery(insertDataQuery);
        if (result == null) result = caseModifyQuery(insertDataQuery);
        if (result == null) result = caseUpdateOperation(insertDataQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DELETE_QUERY:
      {
        DeleteQuery deleteQuery = (DeleteQuery)theEObject;
        T result = caseDeleteQuery(deleteQuery);
        if (result == null) result = caseModifyQuery(deleteQuery);
        if (result == null) result = caseUpdateOperation(deleteQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DELETE_DATA_QUERY:
      {
        DeleteDataQuery deleteDataQuery = (DeleteDataQuery)theEObject;
        T result = caseDeleteDataQuery(deleteDataQuery);
        if (result == null) result = caseModifyQuery(deleteDataQuery);
        if (result == null) result = caseUpdateOperation(deleteDataQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DELETE_WHERE_QUERY:
      {
        DeleteWhereQuery deleteWhereQuery = (DeleteWhereQuery)theEObject;
        T result = caseDeleteWhereQuery(deleteWhereQuery);
        if (result == null) result = caseModifyQuery(deleteWhereQuery);
        if (result == null) result = caseUpdateOperation(deleteWhereQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DATASET_CLAUSE:
      {
        DatasetClause datasetClause = (DatasetClause)theEObject;
        T result = caseDatasetClause(datasetClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.DEFAULT_DATA_SET:
      {
        DefaultDataSet defaultDataSet = (DefaultDataSet)theEObject;
        T result = caseDefaultDataSet(defaultDataSet);
        if (result == null) result = caseDatasetClause(defaultDataSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.NAMED_DATA_SET:
      {
        NamedDataSet namedDataSet = (NamedDataSet)theEObject;
        T result = caseNamedDataSet(namedDataSet);
        if (result == null) result = caseDatasetClause(namedDataSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SERVICE_DATA_SET:
      {
        ServiceDataSet serviceDataSet = (ServiceDataSet)theEObject;
        T result = caseServiceDataSet(serviceDataSet);
        if (result == null) result = caseDatasetClause(serviceDataSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.WHERE_CLAUSE:
      {
        WhereClause whereClause = (WhereClause)theEObject;
        T result = caseWhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_CLAUSE:
      {
        GroupClause groupClause = (GroupClause)theEObject;
        T result = caseGroupClause(groupClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_CONDITION:
      {
        GroupCondition groupCondition = (GroupCondition)theEObject;
        T result = caseGroupCondition(groupCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.HAVING_CLAUSE:
      {
        HavingClause havingClause = (HavingClause)theEObject;
        T result = caseHavingClause(havingClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.LIMIT_CLAUSE:
      {
        LimitClause limitClause = (LimitClause)theEObject;
        T result = caseLimitClause(limitClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_GRAPH_PATTERN:
      {
        GroupGraphPattern groupGraphPattern = (GroupGraphPattern)theEObject;
        T result = caseGroupGraphPattern(groupGraphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SUB_SELECT_QUERY:
      {
        SubSelectQuery subSelectQuery = (SubSelectQuery)theEObject;
        T result = caseSubSelectQuery(subSelectQuery);
        if (result == null) result = caseGroupGraphPattern(subSelectQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_GRAPH_PATTERN_SUB:
      {
        GroupGraphPatternSub groupGraphPatternSub = (GroupGraphPatternSub)theEObject;
        T result = caseGroupGraphPatternSub(groupGraphPatternSub);
        if (result == null) result = caseGroupGraphPattern(groupGraphPatternSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GRAPH_PATTERN:
      {
        GraphPattern graphPattern = (GraphPattern)theEObject;
        T result = caseGraphPattern(graphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.TRIPLES_SAME_SUBJECT:
      {
        TriplesSameSubject triplesSameSubject = (TriplesSameSubject)theEObject;
        T result = caseTriplesSameSubject(triplesSameSubject);
        if (result == null) result = caseGraphPattern(triplesSameSubject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN:
      {
        GroupOrUnionGraphPattern groupOrUnionGraphPattern = (GroupOrUnionGraphPattern)theEObject;
        T result = caseGroupOrUnionGraphPattern(groupOrUnionGraphPattern);
        if (result == null) result = caseGraphPattern(groupOrUnionGraphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN:
      {
        OptionalGraphPattern optionalGraphPattern = (OptionalGraphPattern)theEObject;
        T result = caseOptionalGraphPattern(optionalGraphPattern);
        if (result == null) result = caseGraphPattern(optionalGraphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.PROPERTY_LIST:
      {
        PropertyList propertyList = (PropertyList)theEObject;
        T result = casePropertyList(propertyList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GRAPH_GRAPH_PATTERN:
      {
        GraphGraphPattern graphGraphPattern = (GraphGraphPattern)theEObject;
        T result = caseGraphGraphPattern(graphGraphPattern);
        if (result == null) result = caseGraphPattern(graphGraphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SERVICE_GRAPH_PATTERN:
      {
        ServiceGraphPattern serviceGraphPattern = (ServiceGraphPattern)theEObject;
        T result = caseServiceGraphPattern(serviceGraphPattern);
        if (result == null) result = caseGraphPattern(serviceGraphPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.FILTER_PATTERN:
      {
        FilterPattern filterPattern = (FilterPattern)theEObject;
        T result = caseFilterPattern(filterPattern);
        if (result == null) result = caseGraphPattern(filterPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.EXISTS_PATTERN:
      {
        ExistsPattern existsPattern = (ExistsPattern)theEObject;
        T result = caseExistsPattern(existsPattern);
        if (result == null) result = caseGraphPattern(existsPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.NOT_EXISTS_PATTERN:
      {
        NotExistsPattern notExistsPattern = (NotExistsPattern)theEObject;
        T result = caseNotExistsPattern(notExistsPattern);
        if (result == null) result = caseGraphPattern(notExistsPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.MINUS_PATTERN:
      {
        MinusPattern minusPattern = (MinusPattern)theEObject;
        T result = caseMinusPattern(minusPattern);
        if (result == null) result = caseGraphPattern(minusPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseConstraint(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.EXPRESSION_FILTER_EXPRESSION:
      {
        ExpressionFilterExpression expressionFilterExpression = (ExpressionFilterExpression)theEObject;
        T result = caseExpressionFilterExpression(expressionFilterExpression);
        if (result == null) result = caseExpression(expressionFilterExpression);
        if (result == null) result = caseConstraint(expressionFilterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.FILTER_NODE:
      {
        FilterNode filterNode = (FilterNode)theEObject;
        T result = caseFilterNode(filterNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseGroupCondition(function);
        if (result == null) result = caseConstraint(function);
        if (result == null) result = caseFilterNode(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.NAMED_FUNCTION:
      {
        NamedFunction namedFunction = (NamedFunction)theEObject;
        T result = caseNamedFunction(namedFunction);
        if (result == null) result = caseFunction(namedFunction);
        if (result == null) result = caseGroupCondition(namedFunction);
        if (result == null) result = caseConstraint(namedFunction);
        if (result == null) result = caseFilterNode(namedFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SPARQL_FUNCTION:
      {
        SparqlFunction sparqlFunction = (SparqlFunction)theEObject;
        T result = caseSparqlFunction(sparqlFunction);
        if (result == null) result = caseFunction(sparqlFunction);
        if (result == null) result = caseGroupCondition(sparqlFunction);
        if (result == null) result = caseConstraint(sparqlFunction);
        if (result == null) result = caseFilterNode(sparqlFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.BUILT_IN_CALL:
      {
        BuiltInCall builtInCall = (BuiltInCall)theEObject;
        T result = caseBuiltInCall(builtInCall);
        if (result == null) result = caseGroupCondition(builtInCall);
        if (result == null) result = caseConstraint(builtInCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.AGGREGATE:
      {
        Aggregate aggregate = (Aggregate)theEObject;
        T result = caseAggregate(aggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.EXPR_AGG_ARG:
      {
        ExprAggArg exprAggArg = (ExprAggArg)theEObject;
        T result = caseExprAggArg(exprAggArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GRAPH_NODE:
      {
        GraphNode graphNode = (GraphNode)theEObject;
        T result = caseGraphNode(graphNode);
        if (result == null) result = caseFilterNode(graphNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseGroupCondition(variable);
        if (result == null) result = caseGraphNode(variable);
        if (result == null) result = caseFilterNode(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.UN_NAMED_VARIABLE:
      {
        UnNamedVariable unNamedVariable = (UnNamedVariable)theEObject;
        T result = caseUnNamedVariable(unNamedVariable);
        if (result == null) result = caseVariable(unNamedVariable);
        if (result == null) result = caseGroupCondition(unNamedVariable);
        if (result == null) result = caseGraphNode(unNamedVariable);
        if (result == null) result = caseFilterNode(unNamedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.NAMED_VARIABLE:
      {
        NamedVariable namedVariable = (NamedVariable)theEObject;
        T result = caseNamedVariable(namedVariable);
        if (result == null) result = caseVariable(namedVariable);
        if (result == null) result = caseGroupCondition(namedVariable);
        if (result == null) result = caseGraphNode(namedVariable);
        if (result == null) result = caseFilterNode(namedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.BLANK_NODE:
      {
        BlankNode blankNode = (BlankNode)theEObject;
        T result = caseBlankNode(blankNode);
        if (result == null) result = caseGraphNode(blankNode);
        if (result == null) result = caseFilterNode(blankNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseGraphNode(parameter);
        if (result == null) result = caseFilterNode(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseGraphNode(value);
        if (result == null) result = caseFilterNode(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.IRI:
      {
        IRI iri = (IRI)theEObject;
        T result = caseIRI(iri);
        if (result == null) result = caseGraphNode(iri);
        if (result == null) result = caseFilterNode(iri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = caseGraphNode(stringValue);
        if (result == null) result = caseFilterNode(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseValue(integerValue);
        if (result == null) result = caseGraphNode(integerValue);
        if (result == null) result = caseFilterNode(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.RDF_TAG:
      {
        RDFTag rdfTag = (RDFTag)theEObject;
        T result = caseRDFTag(rdfTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.TYPE_TAG:
      {
        TypeTag typeTag = (TypeTag)theEObject;
        T result = caseTypeTag(typeTag);
        if (result == null) result = caseRDFTag(typeTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.LANG_TAG:
      {
        LangTag langTag = (LangTag)theEObject;
        T result = caseLangTag(langTag);
        if (result == null) result = caseRDFTag(langTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.OR_FILTER_EXPRESSION:
      {
        OrFilterExpression orFilterExpression = (OrFilterExpression)theEObject;
        T result = caseOrFilterExpression(orFilterExpression);
        if (result == null) result = caseExpression(orFilterExpression);
        if (result == null) result = caseConstraint(orFilterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.AND_FILTER_EXPRESSION:
      {
        AndFilterExpression andFilterExpression = (AndFilterExpression)theEObject;
        T result = caseAndFilterExpression(andFilterExpression);
        if (result == null) result = caseExpression(andFilterExpression);
        if (result == null) result = caseConstraint(andFilterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.COUNT_AGGREGATE:
      {
        CountAggregate countAggregate = (CountAggregate)theEObject;
        T result = caseCountAggregate(countAggregate);
        if (result == null) result = caseAggregate(countAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SUM_AGGREGATE:
      {
        SumAggregate sumAggregate = (SumAggregate)theEObject;
        T result = caseSumAggregate(sumAggregate);
        if (result == null) result = caseAggregate(sumAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.MIN_AGREGATE:
      {
        MinAgregate minAgregate = (MinAgregate)theEObject;
        T result = caseMinAgregate(minAgregate);
        if (result == null) result = caseAggregate(minAgregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.MAX_AGGREGATE:
      {
        MaxAggregate maxAggregate = (MaxAggregate)theEObject;
        T result = caseMaxAggregate(maxAggregate);
        if (result == null) result = caseAggregate(maxAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.AVG_AGGREGATE:
      {
        AvgAggregate avgAggregate = (AvgAggregate)theEObject;
        T result = caseAvgAggregate(avgAggregate);
        if (result == null) result = caseAggregate(avgAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.SAMPLE_AGGREGATE:
      {
        SampleAggregate sampleAggregate = (SampleAggregate)theEObject;
        T result = caseSampleAggregate(sampleAggregate);
        if (result == null) result = caseAggregate(sampleAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlPackage.GROUP_AGGREGATE:
      {
        GroupAggregate groupAggregate = (GroupAggregate)theEObject;
        T result = caseGroupAggregate(groupAggregate);
        if (result == null) result = caseAggregate(groupAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPARQL Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPARQL Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPARQLQuery(SPARQLQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBase(Base object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionQuery(SelectionQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectQuery(SelectQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ask Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ask Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAskQuery(AskQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describe Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describe Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribeQuery(DescribeQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Construct Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Construct Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructQuery(ConstructQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateQuery(UpdateQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateOperation(UpdateOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifyQuery(ModifyQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Graph Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Graph Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateGraphQuery(CreateGraphQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Graph Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Graph Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropGraphQuery(DropGraphQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Graph Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Graph Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadGraphQuery(LoadGraphQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear Graph Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Graph Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClearGraphQuery(ClearGraphQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsingGraph(UsingGraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertQuery(InsertQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Data Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Data Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertDataQuery(InsertDataQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteQuery(DeleteQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Data Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Data Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteDataQuery(DeleteDataQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Where Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Where Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteWhereQuery(DeleteWhereQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataset Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataset Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasetClause(DatasetClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Data Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Data Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultDataSet(DefaultDataSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Data Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Data Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedDataSet(NamedDataSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Data Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Data Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceDataSet(ServiceDataSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereClause(WhereClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupClause(GroupClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupCondition(GroupCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Having Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Having Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHavingClause(HavingClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimitClause(LimitClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupGraphPattern(GroupGraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Select Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Select Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubSelectQuery(SubSelectQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Graph Pattern Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Graph Pattern Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupGraphPatternSub(GroupGraphPatternSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphPattern(GraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triples Same Subject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triples Same Subject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriplesSameSubject(TriplesSameSubject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Or Union Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Or Union Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupOrUnionGraphPattern(GroupOrUnionGraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalGraphPattern(OptionalGraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyList(PropertyList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graph Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graph Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphGraphPattern(GraphGraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Graph Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceGraphPattern(ServiceGraphPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterPattern(FilterPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistsPattern(ExistsPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Exists Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Exists Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotExistsPattern(NotExistsPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusPattern(MinusPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Filter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionFilterExpression(ExpressionFilterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterNode(FilterNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedFunction(NamedFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSparqlFunction(SparqlFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInCall(BuiltInCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregate(Aggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Agg Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Agg Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAggArg(ExprAggArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graph Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graph Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphNode(GraphNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Un Named Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Un Named Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnNamedVariable(UnNamedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedVariable(NamedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blank Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blank Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlankNode(BlankNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IRI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IRI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIRI(IRI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RDF Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RDF Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRDFTag(RDFTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTag(TypeTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lang Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lang Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLangTag(LangTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Filter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrFilterExpression(OrFilterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Filter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndFilterExpression(AndFilterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountAggregate(CountAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumAggregate(SumAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Agregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Agregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinAgregate(MinAgregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxAggregate(MaxAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Avg Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Avg Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvgAggregate(AvgAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sample Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSampleAggregate(SampleAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupAggregate(GroupAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SparqlSwitch
