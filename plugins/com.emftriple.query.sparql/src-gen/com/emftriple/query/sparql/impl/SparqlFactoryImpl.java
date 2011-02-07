/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.*;

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
public class SparqlFactoryImpl extends EFactoryImpl implements SparqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SparqlFactory init()
  {
    try
    {
      SparqlFactory theSparqlFactory = (SparqlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftriple.com/2009/Sparql"); 
      if (theSparqlFactory != null)
      {
        return theSparqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SparqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlFactoryImpl()
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
      case SparqlPackage.SPARQL_QUERY: return createSPARQLQuery();
      case SparqlPackage.PREFIX: return createPrefix();
      case SparqlPackage.BASE: return createBase();
      case SparqlPackage.SELECTION_QUERY: return createSelectionQuery();
      case SparqlPackage.SELECT_QUERY: return createSelectQuery();
      case SparqlPackage.ASK_QUERY: return createAskQuery();
      case SparqlPackage.DESCRIBE_QUERY: return createDescribeQuery();
      case SparqlPackage.CONSTRUCT_QUERY: return createConstructQuery();
      case SparqlPackage.UPDATE_QUERY: return createUpdateQuery();
      case SparqlPackage.UPDATE_OPERATION: return createUpdateOperation();
      case SparqlPackage.MODIFY_QUERY: return createModifyQuery();
      case SparqlPackage.CREATE_GRAPH_QUERY: return createCreateGraphQuery();
      case SparqlPackage.DROP_GRAPH_QUERY: return createDropGraphQuery();
      case SparqlPackage.LOAD_GRAPH_QUERY: return createLoadGraphQuery();
      case SparqlPackage.CLEAR_GRAPH_QUERY: return createClearGraphQuery();
      case SparqlPackage.USING_GRAPH: return createUsingGraph();
      case SparqlPackage.INSERT_QUERY: return createInsertQuery();
      case SparqlPackage.INSERT_DATA_QUERY: return createInsertDataQuery();
      case SparqlPackage.DELETE_QUERY: return createDeleteQuery();
      case SparqlPackage.DELETE_DATA_QUERY: return createDeleteDataQuery();
      case SparqlPackage.DELETE_WHERE_QUERY: return createDeleteWhereQuery();
      case SparqlPackage.DATASET_CLAUSE: return createDatasetClause();
      case SparqlPackage.DEFAULT_DATA_SET: return createDefaultDataSet();
      case SparqlPackage.NAMED_DATA_SET: return createNamedDataSet();
      case SparqlPackage.SERVICE_DATA_SET: return createServiceDataSet();
      case SparqlPackage.WHERE_CLAUSE: return createWhereClause();
      case SparqlPackage.GROUP_CLAUSE: return createGroupClause();
      case SparqlPackage.GROUP_CONDITION: return createGroupCondition();
      case SparqlPackage.HAVING_CLAUSE: return createHavingClause();
      case SparqlPackage.CONSTRAINT: return createConstraint();
      case SparqlPackage.LIMIT_CLAUSE: return createLimitClause();
      case SparqlPackage.GROUP_GRAPH_PATTERN: return createGroupGraphPattern();
      case SparqlPackage.SUB_SELECT_QUERY: return createSubSelectQuery();
      case SparqlPackage.GROUP_GRAPH_PATTERN_SUB: return createGroupGraphPatternSub();
      case SparqlPackage.GRAPH_PATTERN: return createGraphPattern();
      case SparqlPackage.TRIPLES_SAME_SUBJECT: return createTriplesSameSubject();
      case SparqlPackage.GROUP_OR_UNION_GRAPH_PATTERN: return createGroupOrUnionGraphPattern();
      case SparqlPackage.OPTIONAL_GRAPH_PATTERN: return createOptionalGraphPattern();
      case SparqlPackage.PROPERTY_LIST: return createPropertyList();
      case SparqlPackage.GRAPH_GRAPH_PATTERN: return createGraphGraphPattern();
      case SparqlPackage.SERVICE_GRAPH_PATTERN: return createServiceGraphPattern();
      case SparqlPackage.FILTER_PATTERN: return createFilterPattern();
      case SparqlPackage.EXISTS_PATTERN: return createExistsPattern();
      case SparqlPackage.NOT_EXISTS_PATTERN: return createNotExistsPattern();
      case SparqlPackage.MINUS_PATTERN: return createMinusPattern();
      case SparqlPackage.EXPRESSION: return createExpression();
      case SparqlPackage.EXPRESSION_FILTER_EXPRESSION: return createExpressionFilterExpression();
      case SparqlPackage.FILTER_NODE: return createFilterNode();
      case SparqlPackage.FUNCTION: return createFunction();
      case SparqlPackage.NAMED_FUNCTION: return createNamedFunction();
      case SparqlPackage.SPARQL_FUNCTION: return createSparqlFunction();
      case SparqlPackage.BUILT_IN_CALL: return createBuiltInCall();
      case SparqlPackage.AGGREGATE: return createAggregate();
      case SparqlPackage.EXPR_AGG_ARG: return createExprAggArg();
      case SparqlPackage.GRAPH_NODE: return createGraphNode();
      case SparqlPackage.VARIABLE: return createVariable();
      case SparqlPackage.UN_NAMED_VARIABLE: return createUnNamedVariable();
      case SparqlPackage.NAMED_VARIABLE: return createNamedVariable();
      case SparqlPackage.BLANK_NODE: return createBlankNode();
      case SparqlPackage.PARAMETER: return createParameter();
      case SparqlPackage.VALUE: return createValue();
      case SparqlPackage.IRI: return createIRI();
      case SparqlPackage.STRING_VALUE: return createStringValue();
      case SparqlPackage.INTEGER_VALUE: return createIntegerValue();
      case SparqlPackage.RDF_TAG: return createRDFTag();
      case SparqlPackage.TYPE_TAG: return createTypeTag();
      case SparqlPackage.LANG_TAG: return createLangTag();
      case SparqlPackage.OR_FILTER_EXPRESSION: return createOrFilterExpression();
      case SparqlPackage.AND_FILTER_EXPRESSION: return createAndFilterExpression();
      case SparqlPackage.COUNT_AGGREGATE: return createCountAggregate();
      case SparqlPackage.SUM_AGGREGATE: return createSumAggregate();
      case SparqlPackage.MIN_AGREGATE: return createMinAgregate();
      case SparqlPackage.MAX_AGGREGATE: return createMaxAggregate();
      case SparqlPackage.AVG_AGGREGATE: return createAvgAggregate();
      case SparqlPackage.SAMPLE_AGGREGATE: return createSampleAggregate();
      case SparqlPackage.GROUP_AGGREGATE: return createGroupAggregate();
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
      case SparqlPackage.OPERATOR:
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
      case SparqlPackage.OPERATOR:
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
  public SPARQLQuery createSPARQLQuery()
  {
    SPARQLQueryImpl sparqlQuery = new SPARQLQueryImpl();
    return sparqlQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Base createBase()
  {
    BaseImpl base = new BaseImpl();
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionQuery createSelectionQuery()
  {
    SelectionQueryImpl selectionQuery = new SelectionQueryImpl();
    return selectionQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectQuery createSelectQuery()
  {
    SelectQueryImpl selectQuery = new SelectQueryImpl();
    return selectQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AskQuery createAskQuery()
  {
    AskQueryImpl askQuery = new AskQueryImpl();
    return askQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescribeQuery createDescribeQuery()
  {
    DescribeQueryImpl describeQuery = new DescribeQueryImpl();
    return describeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructQuery createConstructQuery()
  {
    ConstructQueryImpl constructQuery = new ConstructQueryImpl();
    return constructQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateQuery createUpdateQuery()
  {
    UpdateQueryImpl updateQuery = new UpdateQueryImpl();
    return updateQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateOperation createUpdateOperation()
  {
    UpdateOperationImpl updateOperation = new UpdateOperationImpl();
    return updateOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyQuery createModifyQuery()
  {
    ModifyQueryImpl modifyQuery = new ModifyQueryImpl();
    return modifyQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateGraphQuery createCreateGraphQuery()
  {
    CreateGraphQueryImpl createGraphQuery = new CreateGraphQueryImpl();
    return createGraphQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropGraphQuery createDropGraphQuery()
  {
    DropGraphQueryImpl dropGraphQuery = new DropGraphQueryImpl();
    return dropGraphQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadGraphQuery createLoadGraphQuery()
  {
    LoadGraphQueryImpl loadGraphQuery = new LoadGraphQueryImpl();
    return loadGraphQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClearGraphQuery createClearGraphQuery()
  {
    ClearGraphQueryImpl clearGraphQuery = new ClearGraphQueryImpl();
    return clearGraphQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsingGraph createUsingGraph()
  {
    UsingGraphImpl usingGraph = new UsingGraphImpl();
    return usingGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertQuery createInsertQuery()
  {
    InsertQueryImpl insertQuery = new InsertQueryImpl();
    return insertQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertDataQuery createInsertDataQuery()
  {
    InsertDataQueryImpl insertDataQuery = new InsertDataQueryImpl();
    return insertDataQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteQuery createDeleteQuery()
  {
    DeleteQueryImpl deleteQuery = new DeleteQueryImpl();
    return deleteQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteDataQuery createDeleteDataQuery()
  {
    DeleteDataQueryImpl deleteDataQuery = new DeleteDataQueryImpl();
    return deleteDataQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteWhereQuery createDeleteWhereQuery()
  {
    DeleteWhereQueryImpl deleteWhereQuery = new DeleteWhereQueryImpl();
    return deleteWhereQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasetClause createDatasetClause()
  {
    DatasetClauseImpl datasetClause = new DatasetClauseImpl();
    return datasetClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultDataSet createDefaultDataSet()
  {
    DefaultDataSetImpl defaultDataSet = new DefaultDataSetImpl();
    return defaultDataSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedDataSet createNamedDataSet()
  {
    NamedDataSetImpl namedDataSet = new NamedDataSetImpl();
    return namedDataSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDataSet createServiceDataSet()
  {
    ServiceDataSetImpl serviceDataSet = new ServiceDataSetImpl();
    return serviceDataSet;
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
  public GroupClause createGroupClause()
  {
    GroupClauseImpl groupClause = new GroupClauseImpl();
    return groupClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupCondition createGroupCondition()
  {
    GroupConditionImpl groupCondition = new GroupConditionImpl();
    return groupCondition;
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
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitClause createLimitClause()
  {
    LimitClauseImpl limitClause = new LimitClauseImpl();
    return limitClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPattern createGroupGraphPattern()
  {
    GroupGraphPatternImpl groupGraphPattern = new GroupGraphPatternImpl();
    return groupGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSelectQuery createSubSelectQuery()
  {
    SubSelectQueryImpl subSelectQuery = new SubSelectQueryImpl();
    return subSelectQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPatternSub createGroupGraphPatternSub()
  {
    GroupGraphPatternSubImpl groupGraphPatternSub = new GroupGraphPatternSubImpl();
    return groupGraphPatternSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphPattern createGraphPattern()
  {
    GraphPatternImpl graphPattern = new GraphPatternImpl();
    return graphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriplesSameSubject createTriplesSameSubject()
  {
    TriplesSameSubjectImpl triplesSameSubject = new TriplesSameSubjectImpl();
    return triplesSameSubject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupOrUnionGraphPattern createGroupOrUnionGraphPattern()
  {
    GroupOrUnionGraphPatternImpl groupOrUnionGraphPattern = new GroupOrUnionGraphPatternImpl();
    return groupOrUnionGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalGraphPattern createOptionalGraphPattern()
  {
    OptionalGraphPatternImpl optionalGraphPattern = new OptionalGraphPatternImpl();
    return optionalGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyList createPropertyList()
  {
    PropertyListImpl propertyList = new PropertyListImpl();
    return propertyList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphGraphPattern createGraphGraphPattern()
  {
    GraphGraphPatternImpl graphGraphPattern = new GraphGraphPatternImpl();
    return graphGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceGraphPattern createServiceGraphPattern()
  {
    ServiceGraphPatternImpl serviceGraphPattern = new ServiceGraphPatternImpl();
    return serviceGraphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterPattern createFilterPattern()
  {
    FilterPatternImpl filterPattern = new FilterPatternImpl();
    return filterPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsPattern createExistsPattern()
  {
    ExistsPatternImpl existsPattern = new ExistsPatternImpl();
    return existsPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExistsPattern createNotExistsPattern()
  {
    NotExistsPatternImpl notExistsPattern = new NotExistsPatternImpl();
    return notExistsPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinusPattern createMinusPattern()
  {
    MinusPatternImpl minusPattern = new MinusPatternImpl();
    return minusPattern;
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
  public ExpressionFilterExpression createExpressionFilterExpression()
  {
    ExpressionFilterExpressionImpl expressionFilterExpression = new ExpressionFilterExpressionImpl();
    return expressionFilterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterNode createFilterNode()
  {
    FilterNodeImpl filterNode = new FilterNodeImpl();
    return filterNode;
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
  public NamedFunction createNamedFunction()
  {
    NamedFunctionImpl namedFunction = new NamedFunctionImpl();
    return namedFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlFunction createSparqlFunction()
  {
    SparqlFunctionImpl sparqlFunction = new SparqlFunctionImpl();
    return sparqlFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInCall createBuiltInCall()
  {
    BuiltInCallImpl builtInCall = new BuiltInCallImpl();
    return builtInCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate createAggregate()
  {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAggArg createExprAggArg()
  {
    ExprAggArgImpl exprAggArg = new ExprAggArgImpl();
    return exprAggArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphNode createGraphNode()
  {
    GraphNodeImpl graphNode = new GraphNodeImpl();
    return graphNode;
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
  public UnNamedVariable createUnNamedVariable()
  {
    UnNamedVariableImpl unNamedVariable = new UnNamedVariableImpl();
    return unNamedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedVariable createNamedVariable()
  {
    NamedVariableImpl namedVariable = new NamedVariableImpl();
    return namedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlankNode createBlankNode()
  {
    BlankNodeImpl blankNode = new BlankNodeImpl();
    return blankNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
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
  public IRI createIRI()
  {
    IRIImpl iri = new IRIImpl();
    return iri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDFTag createRDFTag()
  {
    RDFTagImpl rdfTag = new RDFTagImpl();
    return rdfTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTag createTypeTag()
  {
    TypeTagImpl typeTag = new TypeTagImpl();
    return typeTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangTag createLangTag()
  {
    LangTagImpl langTag = new LangTagImpl();
    return langTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrFilterExpression createOrFilterExpression()
  {
    OrFilterExpressionImpl orFilterExpression = new OrFilterExpressionImpl();
    return orFilterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndFilterExpression createAndFilterExpression()
  {
    AndFilterExpressionImpl andFilterExpression = new AndFilterExpressionImpl();
    return andFilterExpression;
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
  public MinAgregate createMinAgregate()
  {
    MinAgregateImpl minAgregate = new MinAgregateImpl();
    return minAgregate;
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
  public SampleAggregate createSampleAggregate()
  {
    SampleAggregateImpl sampleAggregate = new SampleAggregateImpl();
    return sampleAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupAggregate createGroupAggregate()
  {
    GroupAggregateImpl groupAggregate = new GroupAggregateImpl();
    return groupAggregate;
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
  public SparqlPackage getSparqlPackage()
  {
    return (SparqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SparqlPackage getPackage()
  {
    return SparqlPackage.eINSTANCE;
  }

} //SparqlFactoryImpl
