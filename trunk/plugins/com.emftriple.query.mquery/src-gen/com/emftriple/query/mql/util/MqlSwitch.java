/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.emftriple.query.mql.MqlPackage
 * @generated
 */
public class MqlSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MqlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MqlPackage.eINSTANCE;
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
      case MqlPackage.QUERY_MODULE:
      {
        QueryModule queryModule = (QueryModule)theEObject;
        T result = caseQueryModule(queryModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.NAMED_QUERY:
      {
        NamedQuery namedQuery = (NamedQuery)theEObject;
        T result = caseNamedQuery(namedQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.MQUERY:
      {
        MQuery mQuery = (MQuery)theEObject;
        T result = caseMQuery(mQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_STATEMENT:
      {
        SelectStatement selectStatement = (SelectStatement)theEObject;
        T result = caseSelectStatement(selectStatement);
        if (result == null) result = caseMQuery(selectStatement);
        if (result == null) result = caseExpressionTerm(selectStatement);
        if (result == null) result = caseExpression(selectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.HAVING_CLAUSE:
      {
        HavingClause havingClause = (HavingClause)theEObject;
        T result = caseHavingClause(havingClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.ORDER_CLAUSE:
      {
        OrderClause orderClause = (OrderClause)theEObject;
        T result = caseOrderClause(orderClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.ORDER_ITEM:
      {
        OrderItem orderItem = (OrderItem)theEObject;
        T result = caseOrderItem(orderItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.UPDATE_STATEMENT:
      {
        UpdateStatement updateStatement = (UpdateStatement)theEObject;
        T result = caseUpdateStatement(updateStatement);
        if (result == null) result = caseMQuery(updateStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.UPDATE_CLAUSE:
      {
        UpdateClause updateClause = (UpdateClause)theEObject;
        T result = caseUpdateClause(updateClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SET_CLAUSE:
      {
        SetClause setClause = (SetClause)theEObject;
        T result = caseSetClause(setClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.UPDATE_ITEM:
      {
        UpdateItem updateItem = (UpdateItem)theEObject;
        T result = caseUpdateItem(updateItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.DELETE_STATEMENT:
      {
        DeleteStatement deleteStatement = (DeleteStatement)theEObject;
        T result = caseDeleteStatement(deleteStatement);
        if (result == null) result = caseMQuery(deleteStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.DELETE_CLAUSE:
      {
        DeleteClause deleteClause = (DeleteClause)theEObject;
        T result = caseDeleteClause(deleteClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_FROM_CLAUSE:
      {
        SelectFromClause selectFromClause = (SelectFromClause)theEObject;
        T result = caseSelectFromClause(selectFromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_CLAUSE:
      {
        SelectClause selectClause = (SelectClause)theEObject;
        T result = caseSelectClause(selectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_EXPRESSION:
      {
        SelectExpression selectExpression = (SelectExpression)theEObject;
        T result = caseSelectExpression(selectExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_AGGREGATE_EXPRESSION:
      {
        SelectAggregateExpression selectAggregateExpression = (SelectAggregateExpression)theEObject;
        T result = caseSelectAggregateExpression(selectAggregateExpression);
        if (result == null) result = caseSelectExpression(selectAggregateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.AVG_AGGREGATE:
      {
        AvgAggregate avgAggregate = (AvgAggregate)theEObject;
        T result = caseAvgAggregate(avgAggregate);
        if (result == null) result = caseSelectAggregateExpression(avgAggregate);
        if (result == null) result = caseSelectExpression(avgAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.MAX_AGGREGATE:
      {
        MaxAggregate maxAggregate = (MaxAggregate)theEObject;
        T result = caseMaxAggregate(maxAggregate);
        if (result == null) result = caseSelectAggregateExpression(maxAggregate);
        if (result == null) result = caseSelectExpression(maxAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.MIN_AGGREGATE:
      {
        MinAggregate minAggregate = (MinAggregate)theEObject;
        T result = caseMinAggregate(minAggregate);
        if (result == null) result = caseSelectAggregateExpression(minAggregate);
        if (result == null) result = caseSelectExpression(minAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SUM_AGGREGATE:
      {
        SumAggregate sumAggregate = (SumAggregate)theEObject;
        T result = caseSumAggregate(sumAggregate);
        if (result == null) result = caseSelectAggregateExpression(sumAggregate);
        if (result == null) result = caseSelectExpression(sumAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.COUNT_AGGREGATE:
      {
        CountAggregate countAggregate = (CountAggregate)theEObject;
        T result = caseCountAggregate(countAggregate);
        if (result == null) result = caseSelectAggregateExpression(countAggregate);
        if (result == null) result = caseSelectExpression(countAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SELECT_CONSTRUCTOR_EXPRESSION:
      {
        SelectConstructorExpression selectConstructorExpression = (SelectConstructorExpression)theEObject;
        T result = caseSelectConstructorExpression(selectConstructorExpression);
        if (result == null) result = caseSelectExpression(selectConstructorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FROM_CLAUSE:
      {
        FromClause fromClause = (FromClause)theEObject;
        T result = caseFromClause(fromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FROM_ENTRY:
      {
        FromEntry fromEntry = (FromEntry)theEObject;
        T result = caseFromEntry(fromEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FROM_CLASS:
      {
        FromClass fromClass = (FromClass)theEObject;
        T result = caseFromClass(fromClass);
        if (result == null) result = caseFromEntry(fromClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FROM_COLLECTION:
      {
        FromCollection fromCollection = (FromCollection)theEObject;
        T result = caseFromCollection(fromCollection);
        if (result == null) result = caseFromEntry(fromCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FROM_JOIN:
      {
        FromJoin fromJoin = (FromJoin)theEObject;
        T result = caseFromJoin(fromJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.JOIN:
      {
        Join join = (Join)theEObject;
        T result = caseJoin(join);
        if (result == null) result = caseFromJoin(join);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.LEFT_JOIN:
      {
        LeftJoin leftJoin = (LeftJoin)theEObject;
        T result = caseLeftJoin(leftJoin);
        if (result == null) result = caseFromJoin(leftJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.INNER_JOIN:
      {
        InnerJoin innerJoin = (InnerJoin)theEObject;
        T result = caseInnerJoin(innerJoin);
        if (result == null) result = caseFromJoin(innerJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.WHERE_CLAUSE:
      {
        WhereClause whereClause = (WhereClause)theEObject;
        T result = caseWhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.OPERATOR_EXPRESSION:
      {
        OperatorExpression operatorExpression = (OperatorExpression)theEObject;
        T result = caseOperatorExpression(operatorExpression);
        if (result == null) result = caseExpression(operatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.EXISTS_EXPRESSION:
      {
        ExistsExpression existsExpression = (ExistsExpression)theEObject;
        T result = caseExistsExpression(existsExpression);
        if (result == null) result = caseExpression(existsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.ALL_EXPRESSION:
      {
        AllExpression allExpression = (AllExpression)theEObject;
        T result = caseAllExpression(allExpression);
        if (result == null) result = caseExpression(allExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.ANY_EXPRESSION:
      {
        AnyExpression anyExpression = (AnyExpression)theEObject;
        T result = caseAnyExpression(anyExpression);
        if (result == null) result = caseExpression(anyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.SOME_EXPRESSION:
      {
        SomeExpression someExpression = (SomeExpression)theEObject;
        T result = caseSomeExpression(someExpression);
        if (result == null) result = caseExpression(someExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.COLLECTION_EXPRESSION:
      {
        CollectionExpression collectionExpression = (CollectionExpression)theEObject;
        T result = caseCollectionExpression(collectionExpression);
        if (result == null) result = caseExpression(collectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.NULL_COMPARISON_EXPRESSION:
      {
        NullComparisonExpression nullComparisonExpression = (NullComparisonExpression)theEObject;
        T result = caseNullComparisonExpression(nullComparisonExpression);
        if (result == null) result = caseExpression(nullComparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.EMPTY_COMPARISON_EXPRESSION:
      {
        EmptyComparisonExpression emptyComparisonExpression = (EmptyComparisonExpression)theEObject;
        T result = caseEmptyComparisonExpression(emptyComparisonExpression);
        if (result == null) result = caseExpression(emptyComparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.LIKE_EXPRESSION:
      {
        LikeExpression likeExpression = (LikeExpression)theEObject;
        T result = caseLikeExpression(likeExpression);
        if (result == null) result = caseExpression(likeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.IN_EXPRESSION:
      {
        InExpression inExpression = (InExpression)theEObject;
        T result = caseInExpression(inExpression);
        if (result == null) result = caseExpression(inExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.IN_SEQ_EXPRESSION:
      {
        InSeqExpression inSeqExpression = (InSeqExpression)theEObject;
        T result = caseInSeqExpression(inSeqExpression);
        if (result == null) result = caseInExpression(inSeqExpression);
        if (result == null) result = caseExpression(inSeqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.IN_QUERY_EXPRESSION:
      {
        InQueryExpression inQueryExpression = (InQueryExpression)theEObject;
        T result = caseInQueryExpression(inQueryExpression);
        if (result == null) result = caseInExpression(inQueryExpression);
        if (result == null) result = caseExpression(inQueryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.BETWEEN_EXPRESSION:
      {
        BetweenExpression betweenExpression = (BetweenExpression)theEObject;
        T result = caseBetweenExpression(betweenExpression);
        if (result == null) result = caseExpression(betweenExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseExpressionTerm(variable);
        if (result == null) result = caseExpression(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.EXPRESSION_TERM:
      {
        ExpressionTerm expressionTerm = (ExpressionTerm)theEObject;
        T result = caseExpressionTerm(expressionTerm);
        if (result == null) result = caseExpression(expressionTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.ALIAS_ATTRIBUTE_EXPRESSION:
      {
        AliasAttributeExpression aliasAttributeExpression = (AliasAttributeExpression)theEObject;
        T result = caseAliasAttributeExpression(aliasAttributeExpression);
        if (result == null) result = caseSelectExpression(aliasAttributeExpression);
        if (result == null) result = caseVariable(aliasAttributeExpression);
        if (result == null) result = caseExpressionTerm(aliasAttributeExpression);
        if (result == null) result = caseExpression(aliasAttributeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.PARAMETER_EXPRESSION:
      {
        ParameterExpression parameterExpression = (ParameterExpression)theEObject;
        T result = caseParameterExpression(parameterExpression);
        if (result == null) result = caseVariable(parameterExpression);
        if (result == null) result = caseExpressionTerm(parameterExpression);
        if (result == null) result = caseExpression(parameterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseVariable(value);
        if (result == null) result = caseExpressionTerm(value);
        if (result == null) result = caseExpression(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.INTEGER_EXPRESSION:
      {
        IntegerExpression integerExpression = (IntegerExpression)theEObject;
        T result = caseIntegerExpression(integerExpression);
        if (result == null) result = caseValue(integerExpression);
        if (result == null) result = caseVariable(integerExpression);
        if (result == null) result = caseExpressionTerm(integerExpression);
        if (result == null) result = caseExpression(integerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.STRING_EXPRESSION:
      {
        StringExpression stringExpression = (StringExpression)theEObject;
        T result = caseStringExpression(stringExpression);
        if (result == null) result = caseValue(stringExpression);
        if (result == null) result = caseVariable(stringExpression);
        if (result == null) result = caseExpressionTerm(stringExpression);
        if (result == null) result = caseExpression(stringExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.NULL_EXPRESSION:
      {
        NullExpression nullExpression = (NullExpression)theEObject;
        T result = caseNullExpression(nullExpression);
        if (result == null) result = caseValue(nullExpression);
        if (result == null) result = caseVariable(nullExpression);
        if (result == null) result = caseExpressionTerm(nullExpression);
        if (result == null) result = caseExpression(nullExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseValue(booleanExpression);
        if (result == null) result = caseVariable(booleanExpression);
        if (result == null) result = caseExpressionTerm(booleanExpression);
        if (result == null) result = caseExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.DATE_TIME_EXPRESSION:
      {
        DateTimeExpression dateTimeExpression = (DateTimeExpression)theEObject;
        T result = caseDateTimeExpression(dateTimeExpression);
        if (result == null) result = caseValue(dateTimeExpression);
        if (result == null) result = caseVariable(dateTimeExpression);
        if (result == null) result = caseExpressionTerm(dateTimeExpression);
        if (result == null) result = caseExpression(dateTimeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqlPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryModule(QueryModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedQuery(NamedQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQuery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQuery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQuery(MQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectStatement(SelectStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Order Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderClause(OrderClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderItem(OrderItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateStatement(UpdateStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateClause(UpdateClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetClause(SetClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateItem(UpdateItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteStatement(DeleteStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteClause(DeleteClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select From Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select From Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectFromClause(SelectFromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectClause(SelectClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectExpression(SelectExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Aggregate Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Aggregate Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectAggregateExpression(SelectAggregateExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Min Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinAggregate(MinAggregate object)
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
   * Returns the result of interpreting the object as an instance of '<em>Select Constructor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Constructor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectConstructorExpression(SelectConstructorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromClause(FromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromEntry(FromEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromClass(FromClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromCollection(FromCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromJoin(FromJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoin(Join object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftJoin(LeftJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inner Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inner Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInnerJoin(InnerJoin object)
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
   * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorExpression(OperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistsExpression(ExistsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllExpression(AllExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyExpression(AnyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeExpression(SomeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionExpression(CollectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullComparisonExpression(NullComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyComparisonExpression(EmptyComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Like Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Like Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLikeExpression(LikeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInExpression(InExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Seq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Seq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInSeqExpression(InSeqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Query Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Query Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInQueryExpression(InQueryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Between Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Between Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBetweenExpression(BetweenExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expression Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionTerm(ExpressionTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Attribute Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Attribute Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasAttributeExpression(AliasAttributeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterExpression(ParameterExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerExpression(IntegerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringExpression(StringExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullExpression(NullExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Time Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Time Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateTimeExpression(DateTimeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
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

} //MqlSwitch
