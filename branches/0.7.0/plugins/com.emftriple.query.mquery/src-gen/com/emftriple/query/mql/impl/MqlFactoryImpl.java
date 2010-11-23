/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import com.emftriple.query.mql.MqlFactory;
import com.emftriple.query.mql.MqlPackage;
import com.emftriple.query.mql.NamedQuery;
import com.emftriple.query.mql.NullComparisonExpression;
import com.emftriple.query.mql.NullExpression;
import com.emftriple.query.mql.Operator;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MqlFactoryImpl extends EFactoryImpl implements MqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MqlFactory init()
  {
    try
    {
      MqlFactory theMqlFactory = (MqlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftriple.com/2009/MQL"); 
      if (theMqlFactory != null)
      {
        return theMqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MqlPackage.QUERY_MODULE: return createQueryModule();
      case MqlPackage.IMPORT: return createImport();
      case MqlPackage.NAMED_QUERY: return createNamedQuery();
      case MqlPackage.MQUERY: return createMQuery();
      case MqlPackage.SELECT_STATEMENT: return createSelectStatement();
      case MqlPackage.HAVING_CLAUSE: return createHavingClause();
      case MqlPackage.ORDER_CLAUSE: return createOrderClause();
      case MqlPackage.ORDER_ITEM: return createOrderItem();
      case MqlPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case MqlPackage.UPDATE_CLAUSE: return createUpdateClause();
      case MqlPackage.SET_CLAUSE: return createSetClause();
      case MqlPackage.UPDATE_ITEM: return createUpdateItem();
      case MqlPackage.DELETE_STATEMENT: return createDeleteStatement();
      case MqlPackage.DELETE_CLAUSE: return createDeleteClause();
      case MqlPackage.SELECT_FROM_CLAUSE: return createSelectFromClause();
      case MqlPackage.SELECT_CLAUSE: return createSelectClause();
      case MqlPackage.SELECT_EXPRESSION: return createSelectExpression();
      case MqlPackage.SELECT_AGGREGATE_EXPRESSION: return createSelectAggregateExpression();
      case MqlPackage.AVG_AGGREGATE: return createAvgAggregate();
      case MqlPackage.MAX_AGGREGATE: return createMaxAggregate();
      case MqlPackage.MIN_AGGREGATE: return createMinAggregate();
      case MqlPackage.SUM_AGGREGATE: return createSumAggregate();
      case MqlPackage.COUNT_AGGREGATE: return createCountAggregate();
      case MqlPackage.SELECT_CONSTRUCTOR_EXPRESSION: return createSelectConstructorExpression();
      case MqlPackage.FROM_CLAUSE: return createFromClause();
      case MqlPackage.FROM_ENTRY: return createFromEntry();
      case MqlPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case MqlPackage.FROM_CLASS: return createFromClass();
      case MqlPackage.FROM_COLLECTION: return createFromCollection();
      case MqlPackage.FROM_JOIN: return createFromJoin();
      case MqlPackage.JOIN: return createJoin();
      case MqlPackage.LEFT_JOIN: return createLeftJoin();
      case MqlPackage.INNER_JOIN: return createInnerJoin();
      case MqlPackage.WHERE_CLAUSE: return createWhereClause();
      case MqlPackage.EXPRESSION: return createExpression();
      case MqlPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
      case MqlPackage.EXISTS_EXPRESSION: return createExistsExpression();
      case MqlPackage.ALL_EXPRESSION: return createAllExpression();
      case MqlPackage.ANY_EXPRESSION: return createAnyExpression();
      case MqlPackage.SOME_EXPRESSION: return createSomeExpression();
      case MqlPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
      case MqlPackage.NULL_COMPARISON_EXPRESSION: return createNullComparisonExpression();
      case MqlPackage.EMPTY_COMPARISON_EXPRESSION: return createEmptyComparisonExpression();
      case MqlPackage.LIKE_EXPRESSION: return createLikeExpression();
      case MqlPackage.IN_EXPRESSION: return createInExpression();
      case MqlPackage.IN_SEQ_EXPRESSION: return createInSeqExpression();
      case MqlPackage.IN_QUERY_EXPRESSION: return createInQueryExpression();
      case MqlPackage.BETWEEN_EXPRESSION: return createBetweenExpression();
      case MqlPackage.VARIABLE: return createVariable();
      case MqlPackage.EXPRESSION_TERM: return createExpressionTerm();
      case MqlPackage.ALIAS_ATTRIBUTE_EXPRESSION: return createAliasAttributeExpression();
      case MqlPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case MqlPackage.FUNCTION: return createFunction();
      case MqlPackage.VALUE: return createValue();
      case MqlPackage.INTEGER_EXPRESSION: return createIntegerExpression();
      case MqlPackage.STRING_EXPRESSION: return createStringExpression();
      case MqlPackage.NULL_EXPRESSION: return createNullExpression();
      case MqlPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case MqlPackage.DATE_TIME_EXPRESSION: return createDateTimeExpression();
      case MqlPackage.OR_EXPRESSION: return createOrExpression();
      case MqlPackage.AND_EXPRESSION: return createAndExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MqlPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MqlPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryModule createQueryModule()
  {
    QueryModuleImpl queryModule = new QueryModuleImpl();
    return queryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedQuery createNamedQuery()
  {
    NamedQueryImpl namedQuery = new NamedQueryImpl();
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MQuery createMQuery()
  {
    MQueryImpl mQuery = new MQueryImpl();
    return mQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause createHavingClause()
  {
    HavingClauseImpl havingClause = new HavingClauseImpl();
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderClause createOrderClause()
  {
    OrderClauseImpl orderClause = new OrderClauseImpl();
    return orderClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderItem createOrderItem()
  {
    OrderItemImpl orderItem = new OrderItemImpl();
    return orderItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateStatement createUpdateStatement()
  {
    UpdateStatementImpl updateStatement = new UpdateStatementImpl();
    return updateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateClause createUpdateClause()
  {
    UpdateClauseImpl updateClause = new UpdateClauseImpl();
    return updateClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetClause createSetClause()
  {
    SetClauseImpl setClause = new SetClauseImpl();
    return setClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateItem createUpdateItem()
  {
    UpdateItemImpl updateItem = new UpdateItemImpl();
    return updateItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteStatement createDeleteStatement()
  {
    DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
    return deleteStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteClause createDeleteClause()
  {
    DeleteClauseImpl deleteClause = new DeleteClauseImpl();
    return deleteClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectFromClause createSelectFromClause()
  {
    SelectFromClauseImpl selectFromClause = new SelectFromClauseImpl();
    return selectFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectClause createSelectClause()
  {
    SelectClauseImpl selectClause = new SelectClauseImpl();
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectExpression createSelectExpression()
  {
    SelectExpressionImpl selectExpression = new SelectExpressionImpl();
    return selectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAggregateExpression createSelectAggregateExpression()
  {
    SelectAggregateExpressionImpl selectAggregateExpression = new SelectAggregateExpressionImpl();
    return selectAggregateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvgAggregate createAvgAggregate()
  {
    AvgAggregateImpl avgAggregate = new AvgAggregateImpl();
    return avgAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxAggregate createMaxAggregate()
  {
    MaxAggregateImpl maxAggregate = new MaxAggregateImpl();
    return maxAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinAggregate createMinAggregate()
  {
    MinAggregateImpl minAggregate = new MinAggregateImpl();
    return minAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumAggregate createSumAggregate()
  {
    SumAggregateImpl sumAggregate = new SumAggregateImpl();
    return sumAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountAggregate createCountAggregate()
  {
    CountAggregateImpl countAggregate = new CountAggregateImpl();
    return countAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectConstructorExpression createSelectConstructorExpression()
  {
    SelectConstructorExpressionImpl selectConstructorExpression = new SelectConstructorExpressionImpl();
    return selectConstructorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClause createFromClause()
  {
    FromClauseImpl fromClause = new FromClauseImpl();
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromEntry createFromEntry()
  {
    FromEntryImpl fromEntry = new FromEntryImpl();
    return fromEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClass createFromClass()
  {
    FromClassImpl fromClass = new FromClassImpl();
    return fromClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromCollection createFromCollection()
  {
    FromCollectionImpl fromCollection = new FromCollectionImpl();
    return fromCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromJoin createFromJoin()
  {
    FromJoinImpl fromJoin = new FromJoinImpl();
    return fromJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftJoin createLeftJoin()
  {
    LeftJoinImpl leftJoin = new LeftJoinImpl();
    return leftJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerJoin createInnerJoin()
  {
    InnerJoinImpl innerJoin = new InnerJoinImpl();
    return innerJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereClause createWhereClause()
  {
    WhereClauseImpl whereClause = new WhereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorExpression createOperatorExpression()
  {
    OperatorExpressionImpl operatorExpression = new OperatorExpressionImpl();
    return operatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsExpression createExistsExpression()
  {
    ExistsExpressionImpl existsExpression = new ExistsExpressionImpl();
    return existsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllExpression createAllExpression()
  {
    AllExpressionImpl allExpression = new AllExpressionImpl();
    return allExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyExpression createAnyExpression()
  {
    AnyExpressionImpl anyExpression = new AnyExpressionImpl();
    return anyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeExpression createSomeExpression()
  {
    SomeExpressionImpl someExpression = new SomeExpressionImpl();
    return someExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionExpression createCollectionExpression()
  {
    CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
    return collectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullComparisonExpression createNullComparisonExpression()
  {
    NullComparisonExpressionImpl nullComparisonExpression = new NullComparisonExpressionImpl();
    return nullComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyComparisonExpression createEmptyComparisonExpression()
  {
    EmptyComparisonExpressionImpl emptyComparisonExpression = new EmptyComparisonExpressionImpl();
    return emptyComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikeExpression createLikeExpression()
  {
    LikeExpressionImpl likeExpression = new LikeExpressionImpl();
    return likeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InExpression createInExpression()
  {
    InExpressionImpl inExpression = new InExpressionImpl();
    return inExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InSeqExpression createInSeqExpression()
  {
    InSeqExpressionImpl inSeqExpression = new InSeqExpressionImpl();
    return inSeqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InQueryExpression createInQueryExpression()
  {
    InQueryExpressionImpl inQueryExpression = new InQueryExpressionImpl();
    return inQueryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BetweenExpression createBetweenExpression()
  {
    BetweenExpressionImpl betweenExpression = new BetweenExpressionImpl();
    return betweenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionTerm createExpressionTerm()
  {
    ExpressionTermImpl expressionTerm = new ExpressionTermImpl();
    return expressionTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasAttributeExpression createAliasAttributeExpression()
  {
    AliasAttributeExpressionImpl aliasAttributeExpression = new AliasAttributeExpressionImpl();
    return aliasAttributeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression createParameterExpression()
  {
    ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
    return parameterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerExpression createIntegerExpression()
  {
    IntegerExpressionImpl integerExpression = new IntegerExpressionImpl();
    return integerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullExpression createNullExpression()
  {
    NullExpressionImpl nullExpression = new NullExpressionImpl();
    return nullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateTimeExpression createDateTimeExpression()
  {
    DateTimeExpressionImpl dateTimeExpression = new DateTimeExpressionImpl();
    return dateTimeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqlPackage getMqlPackage()
  {
    return (MqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MqlPackage getPackage()
  {
    return MqlPackage.eINSTANCE;
  }

} //MqlFactoryImpl
