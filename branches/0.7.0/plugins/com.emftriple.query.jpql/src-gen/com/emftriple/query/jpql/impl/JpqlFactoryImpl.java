/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql.impl;

import com.emftriple.query.jpql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpqlFactoryImpl extends EFactoryImpl implements JpqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JpqlFactory init()
  {
    try
    {
      JpqlFactory theJpqlFactory = (JpqlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftriple.com/2009/jpql"); 
      if (theJpqlFactory != null)
      {
        return theJpqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JpqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpqlFactoryImpl()
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
      case JpqlPackage.QUERY_MODULE: return createQueryModule();
      case JpqlPackage.IMPORT: return createImport();
      case JpqlPackage.NAMED_QUERY: return createNamedQuery();
      case JpqlPackage.JPQL_QUERY: return createJPQLQuery();
      case JpqlPackage.SELECT_STATEMENT: return createSelectStatement();
      case JpqlPackage.HAVING_CLAUSE: return createHavingClause();
      case JpqlPackage.ORDER_CLAUSE: return createOrderClause();
      case JpqlPackage.ORDER_ITEM: return createOrderItem();
      case JpqlPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case JpqlPackage.UPDATE_CLAUSE: return createUpdateClause();
      case JpqlPackage.SET_CLAUSE: return createSetClause();
      case JpqlPackage.UPDATE_ITEM: return createUpdateItem();
      case JpqlPackage.DELETE_STATEMENT: return createDeleteStatement();
      case JpqlPackage.DELETE_CLAUSE: return createDeleteClause();
      case JpqlPackage.SELECT_FROM_CLAUSE: return createSelectFromClause();
      case JpqlPackage.SELECT_CLAUSE: return createSelectClause();
      case JpqlPackage.SELECT_EXPRESSION: return createSelectExpression();
      case JpqlPackage.SELECT_AGGREGATE_EXPRESSION: return createSelectAggregateExpression();
      case JpqlPackage.AVG_AGGREGATE: return createAvgAggregate();
      case JpqlPackage.MAX_AGGREGATE: return createMaxAggregate();
      case JpqlPackage.MIN_AGGREGATE: return createMinAggregate();
      case JpqlPackage.SUM_AGGREGATE: return createSumAggregate();
      case JpqlPackage.COUNT_AGGREGATE: return createCountAggregate();
      case JpqlPackage.SELECT_CONSTRUCTOR_EXPRESSION: return createSelectConstructorExpression();
      case JpqlPackage.FROM_CLAUSE: return createFromClause();
      case JpqlPackage.FROM_ENTRY: return createFromEntry();
      case JpqlPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case JpqlPackage.FROM_CLASS: return createFromClass();
      case JpqlPackage.FROM_COLLECTION: return createFromCollection();
      case JpqlPackage.FROM_JOIN: return createFromJoin();
      case JpqlPackage.JOIN: return createJoin();
      case JpqlPackage.LEFT_JOIN: return createLeftJoin();
      case JpqlPackage.INNER_JOIN: return createInnerJoin();
      case JpqlPackage.WHERE_CLAUSE: return createWhereClause();
      case JpqlPackage.EXPRESSION: return createExpression();
      case JpqlPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
      case JpqlPackage.EXISTS_EXPRESSION: return createExistsExpression();
      case JpqlPackage.ALL_EXPRESSION: return createAllExpression();
      case JpqlPackage.ANY_EXPRESSION: return createAnyExpression();
      case JpqlPackage.SOME_EXPRESSION: return createSomeExpression();
      case JpqlPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
      case JpqlPackage.NULL_COMPARISON_EXPRESSION: return createNullComparisonExpression();
      case JpqlPackage.EMPTY_COMPARISON_EXPRESSION: return createEmptyComparisonExpression();
      case JpqlPackage.LIKE_EXPRESSION: return createLikeExpression();
      case JpqlPackage.IN_EXPRESSION: return createInExpression();
      case JpqlPackage.IN_SEQ_EXPRESSION: return createInSeqExpression();
      case JpqlPackage.IN_QUERY_EXPRESSION: return createInQueryExpression();
      case JpqlPackage.BETWEEN_EXPRESSION: return createBetweenExpression();
      case JpqlPackage.VARIABLE: return createVariable();
      case JpqlPackage.EXPRESSION_TERM: return createExpressionTerm();
      case JpqlPackage.ALIAS_ATTRIBUTE_EXPRESSION: return createAliasAttributeExpression();
      case JpqlPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case JpqlPackage.FUNCTION: return createFunction();
      case JpqlPackage.VALUE: return createValue();
      case JpqlPackage.INTEGER_EXPRESSION: return createIntegerExpression();
      case JpqlPackage.STRING_EXPRESSION: return createStringExpression();
      case JpqlPackage.NULL_EXPRESSION: return createNullExpression();
      case JpqlPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case JpqlPackage.DATE_TIME_EXPRESSION: return createDateTimeExpression();
      case JpqlPackage.OR_EXPRESSION: return createOrExpression();
      case JpqlPackage.AND_EXPRESSION: return createAndExpression();
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
      case JpqlPackage.OPERATOR:
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
      case JpqlPackage.OPERATOR:
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
  public JPQLQuery createJPQLQuery()
  {
    JPQLQueryImpl jpqlQuery = new JPQLQueryImpl();
    return jpqlQuery;
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
  public JpqlPackage getJpqlPackage()
  {
    return (JpqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JpqlPackage getPackage()
  {
    return JpqlPackage.eINSTANCE;
  }

} //JpqlFactoryImpl
