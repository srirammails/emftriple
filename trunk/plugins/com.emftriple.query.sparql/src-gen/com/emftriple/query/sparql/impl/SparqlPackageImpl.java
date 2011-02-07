/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.Aggregate;
import com.emftriple.query.sparql.AndFilterExpression;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.AvgAggregate;
import com.emftriple.query.sparql.Base;
import com.emftriple.query.sparql.BlankNode;
import com.emftriple.query.sparql.BuiltInCall;
import com.emftriple.query.sparql.ClearGraphQuery;
import com.emftriple.query.sparql.Constraint;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.CountAggregate;
import com.emftriple.query.sparql.CreateGraphQuery;
import com.emftriple.query.sparql.DatasetClause;
import com.emftriple.query.sparql.DefaultDataSet;
import com.emftriple.query.sparql.DeleteDataQuery;
import com.emftriple.query.sparql.DeleteQuery;
import com.emftriple.query.sparql.DeleteWhereQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.DropGraphQuery;
import com.emftriple.query.sparql.ExistsPattern;
import com.emftriple.query.sparql.ExprAggArg;
import com.emftriple.query.sparql.Expression;
import com.emftriple.query.sparql.ExpressionFilterExpression;
import com.emftriple.query.sparql.FilterNode;
import com.emftriple.query.sparql.FilterPattern;
import com.emftriple.query.sparql.Function;
import com.emftriple.query.sparql.GraphGraphPattern;
import com.emftriple.query.sparql.GraphNode;
import com.emftriple.query.sparql.GraphPattern;
import com.emftriple.query.sparql.GroupAggregate;
import com.emftriple.query.sparql.GroupClause;
import com.emftriple.query.sparql.GroupCondition;
import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.GroupGraphPatternSub;
import com.emftriple.query.sparql.GroupOrUnionGraphPattern;
import com.emftriple.query.sparql.HavingClause;
import com.emftriple.query.sparql.InsertDataQuery;
import com.emftriple.query.sparql.InsertQuery;
import com.emftriple.query.sparql.IntegerValue;
import com.emftriple.query.sparql.LangTag;
import com.emftriple.query.sparql.LimitClause;
import com.emftriple.query.sparql.LoadGraphQuery;
import com.emftriple.query.sparql.MaxAggregate;
import com.emftriple.query.sparql.MinAgregate;
import com.emftriple.query.sparql.MinusPattern;
import com.emftriple.query.sparql.ModifyQuery;
import com.emftriple.query.sparql.NamedDataSet;
import com.emftriple.query.sparql.NamedFunction;
import com.emftriple.query.sparql.NamedVariable;
import com.emftriple.query.sparql.NotExistsPattern;
import com.emftriple.query.sparql.Operator;
import com.emftriple.query.sparql.OptionalGraphPattern;
import com.emftriple.query.sparql.OrFilterExpression;
import com.emftriple.query.sparql.Parameter;
import com.emftriple.query.sparql.Prefix;
import com.emftriple.query.sparql.PropertyList;
import com.emftriple.query.sparql.RDFTag;
import com.emftriple.query.sparql.SPARQLQuery;
import com.emftriple.query.sparql.SampleAggregate;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.SelectionQuery;
import com.emftriple.query.sparql.ServiceDataSet;
import com.emftriple.query.sparql.ServiceGraphPattern;
import com.emftriple.query.sparql.SparqlFactory;
import com.emftriple.query.sparql.SparqlFunction;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.StringValue;
import com.emftriple.query.sparql.SubSelectQuery;
import com.emftriple.query.sparql.SumAggregate;
import com.emftriple.query.sparql.TriplesSameSubject;
import com.emftriple.query.sparql.TypeTag;
import com.emftriple.query.sparql.UnNamedVariable;
import com.emftriple.query.sparql.UpdateOperation;
import com.emftriple.query.sparql.UpdateQuery;
import com.emftriple.query.sparql.UsingGraph;
import com.emftriple.query.sparql.Value;
import com.emftriple.query.sparql.Variable;
import com.emftriple.query.sparql.WhereClause;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparqlPackageImpl extends EPackageImpl implements SparqlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sparqlQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass askQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass describeQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createGraphQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropGraphQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadGraphQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clearGraphQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usingGraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertDataQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteDataQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteWhereQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasetClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultDataSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedDataSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceDataSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass havingClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupGraphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSelectQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupGraphPatternSubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triplesSameSubjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupOrUnionGraphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalGraphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphGraphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceGraphPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notExistsPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionFilterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sparqlFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAggArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unNamedVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blankNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdfTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass langTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orFilterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andFilterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minAgregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avgAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sampleAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.emftriple.query.sparql.SparqlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SparqlPackageImpl()
  {
    super(eNS_URI, SparqlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SparqlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SparqlPackage init()
  {
    if (isInited) return (SparqlPackage)EPackage.Registry.INSTANCE.getEPackage(SparqlPackage.eNS_URI);

    // Obtain or create and register package
    SparqlPackageImpl theSparqlPackage = (SparqlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SparqlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SparqlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSparqlPackage.createPackageContents();

    // Initialize created meta-data
    theSparqlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSparqlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SparqlPackage.eNS_URI, theSparqlPackage);
    return theSparqlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPARQLQuery()
  {
    return sparqlQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPARQLQuery_Prefixes()
  {
    return (EReference)sparqlQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefix()
  {
    return prefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Name()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Iref()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBase()
  {
    return baseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBase_Iref()
  {
    return (EReference)baseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionQuery()
  {
    return selectionQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_Base()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_DatasetClause()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_WhereClause()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_GroupClause()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_HavingClause()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionQuery_LimitClause()
  {
    return (EReference)selectionQueryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectQuery()
  {
    return selectQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectQuery_IsDistinct()
  {
    return (EAttribute)selectQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectQuery_IsReduced()
  {
    return (EAttribute)selectQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectQuery_All()
  {
    return (EAttribute)selectQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectQuery_Variables()
  {
    return (EReference)selectQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAskQuery()
  {
    return askQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescribeQuery()
  {
    return describeQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescribeQuery_Variables()
  {
    return (EReference)describeQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructQuery()
  {
    return constructQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructQuery_ConstructTemplate()
  {
    return (EReference)constructQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateQuery()
  {
    return updateQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateQuery_Operations()
  {
    return (EReference)updateQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateOperation()
  {
    return updateOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifyQuery()
  {
    return modifyQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModifyQuery_WithGraph()
  {
    return (EAttribute)modifyQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyQuery_Pattern()
  {
    return (EReference)modifyQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateGraphQuery()
  {
    return createGraphQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateGraphQuery_IsSilent()
  {
    return (EAttribute)createGraphQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateGraphQuery_Graph()
  {
    return (EAttribute)createGraphQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropGraphQuery()
  {
    return dropGraphQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropGraphQuery_IsSilent()
  {
    return (EAttribute)dropGraphQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropGraphQuery_Graph()
  {
    return (EAttribute)dropGraphQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadGraphQuery()
  {
    return loadGraphQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGraphQuery_Graph()
  {
    return (EAttribute)loadGraphQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGraphQuery_IntoGraph()
  {
    return (EAttribute)loadGraphQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClearGraphQuery()
  {
    return clearGraphQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClearGraphQuery_Uri()
  {
    return (EAttribute)clearGraphQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClearGraphQuery_IsDefault()
  {
    return (EAttribute)clearGraphQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsingGraph()
  {
    return usingGraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsingGraph_Named()
  {
    return (EAttribute)usingGraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsingGraph_Uri()
  {
    return (EAttribute)usingGraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertQuery()
  {
    return insertQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertQuery_Graph()
  {
    return (EAttribute)insertQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertQuery_WhereClause()
  {
    return (EReference)insertQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertDataQuery()
  {
    return insertDataQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertDataQuery_Graph()
  {
    return (EAttribute)insertDataQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteQuery()
  {
    return deleteQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeleteQuery_Graph()
  {
    return (EAttribute)deleteQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteQuery_InsertPattern()
  {
    return (EReference)deleteQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteQuery_WhereClause()
  {
    return (EReference)deleteQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteDataQuery()
  {
    return deleteDataQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeleteDataQuery_Graph()
  {
    return (EAttribute)deleteDataQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteWhereQuery()
  {
    return deleteWhereQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasetClause()
  {
    return datasetClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasetClause_DataSet()
  {
    return (EReference)datasetClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultDataSet()
  {
    return defaultDataSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedDataSet()
  {
    return namedDataSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceDataSet()
  {
    return serviceDataSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereClause()
  {
    return whereClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereClause_GroupGraphPattern()
  {
    return (EReference)whereClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupClause()
  {
    return groupClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupClause_Condition()
  {
    return (EReference)groupClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupCondition()
  {
    return groupConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHavingClause()
  {
    return havingClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHavingClause_Constraint()
  {
    return (EReference)havingClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimitClause()
  {
    return limitClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimitClause_Limit()
  {
    return (EAttribute)limitClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupGraphPattern()
  {
    return groupGraphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSelectQuery()
  {
    return subSelectQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSelectQuery_Variables()
  {
    return (EReference)subSelectQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSelectQuery_WhereClause()
  {
    return (EReference)subSelectQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSelectQuery_GroupClause()
  {
    return (EReference)subSelectQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSelectQuery_HavingClause()
  {
    return (EReference)subSelectQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupGraphPatternSub()
  {
    return groupGraphPatternSubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupGraphPatternSub_GraphPatterns()
  {
    return (EReference)groupGraphPatternSubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphPattern()
  {
    return graphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriplesSameSubject()
  {
    return triplesSameSubjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriplesSameSubject_Subject()
  {
    return (EReference)triplesSameSubjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriplesSameSubject_PropertyList()
  {
    return (EReference)triplesSameSubjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupOrUnionGraphPattern()
  {
    return groupOrUnionGraphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupOrUnionGraphPattern_GraphPatterns()
  {
    return (EReference)groupOrUnionGraphPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalGraphPattern()
  {
    return optionalGraphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalGraphPattern_GraphPattern()
  {
    return (EReference)optionalGraphPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyList()
  {
    return propertyListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyList_Property()
  {
    return (EReference)propertyListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyList_Object()
  {
    return (EReference)propertyListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphGraphPattern()
  {
    return graphGraphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphGraphPattern_Var()
  {
    return (EReference)graphGraphPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphGraphPattern_Pattern()
  {
    return (EReference)graphGraphPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceGraphPattern()
  {
    return serviceGraphPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceGraphPattern_Var()
  {
    return (EReference)serviceGraphPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceGraphPattern_Pattern()
  {
    return (EReference)serviceGraphPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterPattern()
  {
    return filterPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterPattern_Expression()
  {
    return (EReference)filterPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistsPattern()
  {
    return existsPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExistsPattern_Pattern()
  {
    return (EReference)existsPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotExistsPattern()
  {
    return notExistsPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotExistsPattern_Pattern()
  {
    return (EReference)notExistsPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinusPattern()
  {
    return minusPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinusPattern_Pattern()
  {
    return (EReference)minusPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionFilterExpression()
  {
    return expressionFilterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionFilterExpression_Left()
  {
    return (EReference)expressionFilterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionFilterExpression_Operator()
  {
    return (EAttribute)expressionFilterExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionFilterExpression_Right()
  {
    return (EReference)expressionFilterExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterNode()
  {
    return filterNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Parameters()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedFunction()
  {
    return namedFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedFunction_Prefix()
  {
    return (EReference)namedFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSparqlFunction()
  {
    return sparqlFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInCall()
  {
    return builtInCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_Expr()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_Left()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_Right()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_Var()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_IfExpr()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_ThenExpr()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInCall_ElseExpr()
  {
    return (EReference)builtInCallEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregate()
  {
    return aggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAggArg()
  {
    return exprAggArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprAggArg_IsDistinct()
  {
    return (EAttribute)exprAggArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAggArg_Expr()
  {
    return (EReference)exprAggArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphNode()
  {
    return graphNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnNamedVariable()
  {
    return unNamedVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedVariable()
  {
    return namedVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedVariable_Prefix()
  {
    return (EReference)namedVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlankNode()
  {
    return blankNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlankNode_Name()
  {
    return (EAttribute)blankNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Tag()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIRI()
  {
    return iriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIRI_Value()
  {
    return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValue()
  {
    return integerValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerValue_Value()
  {
    return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRDFTag()
  {
    return rdfTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTag()
  {
    return typeTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeTag_Type()
  {
    return (EReference)typeTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLangTag()
  {
    return langTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLangTag_Lang()
  {
    return (EAttribute)langTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrFilterExpression()
  {
    return orFilterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrFilterExpression_Entries()
  {
    return (EReference)orFilterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndFilterExpression()
  {
    return andFilterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndFilterExpression_Entries()
  {
    return (EReference)andFilterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountAggregate()
  {
    return countAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCountAggregate_IsDistinct()
  {
    return (EAttribute)countAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCountAggregate_IsAll()
  {
    return (EAttribute)countAggregateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountAggregate_Expr()
  {
    return (EReference)countAggregateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumAggregate()
  {
    return sumAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumAggregate_Expr()
  {
    return (EReference)sumAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinAgregate()
  {
    return minAgregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinAgregate_Expr()
  {
    return (EReference)minAgregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxAggregate()
  {
    return maxAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaxAggregate_Expr()
  {
    return (EReference)maxAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAvgAggregate()
  {
    return avgAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAvgAggregate_Expr()
  {
    return (EReference)avgAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSampleAggregate()
  {
    return sampleAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSampleAggregate_Expr()
  {
    return (EReference)sampleAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupAggregate()
  {
    return groupAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupAggregate_IsDistinct()
  {
    return (EAttribute)groupAggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupAggregate_Expr()
  {
    return (EReference)groupAggregateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupAggregate_Value()
  {
    return (EAttribute)groupAggregateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperator()
  {
    return operatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlFactory getSparqlFactory()
  {
    return (SparqlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sparqlQueryEClass = createEClass(SPARQL_QUERY);
    createEReference(sparqlQueryEClass, SPARQL_QUERY__PREFIXES);

    prefixEClass = createEClass(PREFIX);
    createEAttribute(prefixEClass, PREFIX__NAME);
    createEAttribute(prefixEClass, PREFIX__IREF);

    baseEClass = createEClass(BASE);
    createEReference(baseEClass, BASE__IREF);

    selectionQueryEClass = createEClass(SELECTION_QUERY);
    createEReference(selectionQueryEClass, SELECTION_QUERY__BASE);
    createEReference(selectionQueryEClass, SELECTION_QUERY__DATASET_CLAUSE);
    createEReference(selectionQueryEClass, SELECTION_QUERY__WHERE_CLAUSE);
    createEReference(selectionQueryEClass, SELECTION_QUERY__GROUP_CLAUSE);
    createEReference(selectionQueryEClass, SELECTION_QUERY__HAVING_CLAUSE);
    createEReference(selectionQueryEClass, SELECTION_QUERY__LIMIT_CLAUSE);

    selectQueryEClass = createEClass(SELECT_QUERY);
    createEAttribute(selectQueryEClass, SELECT_QUERY__IS_DISTINCT);
    createEAttribute(selectQueryEClass, SELECT_QUERY__IS_REDUCED);
    createEAttribute(selectQueryEClass, SELECT_QUERY__ALL);
    createEReference(selectQueryEClass, SELECT_QUERY__VARIABLES);

    askQueryEClass = createEClass(ASK_QUERY);

    describeQueryEClass = createEClass(DESCRIBE_QUERY);
    createEReference(describeQueryEClass, DESCRIBE_QUERY__VARIABLES);

    constructQueryEClass = createEClass(CONSTRUCT_QUERY);
    createEReference(constructQueryEClass, CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE);

    updateQueryEClass = createEClass(UPDATE_QUERY);
    createEReference(updateQueryEClass, UPDATE_QUERY__OPERATIONS);

    updateOperationEClass = createEClass(UPDATE_OPERATION);

    modifyQueryEClass = createEClass(MODIFY_QUERY);
    createEAttribute(modifyQueryEClass, MODIFY_QUERY__WITH_GRAPH);
    createEReference(modifyQueryEClass, MODIFY_QUERY__PATTERN);

    createGraphQueryEClass = createEClass(CREATE_GRAPH_QUERY);
    createEAttribute(createGraphQueryEClass, CREATE_GRAPH_QUERY__IS_SILENT);
    createEAttribute(createGraphQueryEClass, CREATE_GRAPH_QUERY__GRAPH);

    dropGraphQueryEClass = createEClass(DROP_GRAPH_QUERY);
    createEAttribute(dropGraphQueryEClass, DROP_GRAPH_QUERY__IS_SILENT);
    createEAttribute(dropGraphQueryEClass, DROP_GRAPH_QUERY__GRAPH);

    loadGraphQueryEClass = createEClass(LOAD_GRAPH_QUERY);
    createEAttribute(loadGraphQueryEClass, LOAD_GRAPH_QUERY__GRAPH);
    createEAttribute(loadGraphQueryEClass, LOAD_GRAPH_QUERY__INTO_GRAPH);

    clearGraphQueryEClass = createEClass(CLEAR_GRAPH_QUERY);
    createEAttribute(clearGraphQueryEClass, CLEAR_GRAPH_QUERY__URI);
    createEAttribute(clearGraphQueryEClass, CLEAR_GRAPH_QUERY__IS_DEFAULT);

    usingGraphEClass = createEClass(USING_GRAPH);
    createEAttribute(usingGraphEClass, USING_GRAPH__NAMED);
    createEAttribute(usingGraphEClass, USING_GRAPH__URI);

    insertQueryEClass = createEClass(INSERT_QUERY);
    createEAttribute(insertQueryEClass, INSERT_QUERY__GRAPH);
    createEReference(insertQueryEClass, INSERT_QUERY__WHERE_CLAUSE);

    insertDataQueryEClass = createEClass(INSERT_DATA_QUERY);
    createEAttribute(insertDataQueryEClass, INSERT_DATA_QUERY__GRAPH);

    deleteQueryEClass = createEClass(DELETE_QUERY);
    createEAttribute(deleteQueryEClass, DELETE_QUERY__GRAPH);
    createEReference(deleteQueryEClass, DELETE_QUERY__INSERT_PATTERN);
    createEReference(deleteQueryEClass, DELETE_QUERY__WHERE_CLAUSE);

    deleteDataQueryEClass = createEClass(DELETE_DATA_QUERY);
    createEAttribute(deleteDataQueryEClass, DELETE_DATA_QUERY__GRAPH);

    deleteWhereQueryEClass = createEClass(DELETE_WHERE_QUERY);

    datasetClauseEClass = createEClass(DATASET_CLAUSE);
    createEReference(datasetClauseEClass, DATASET_CLAUSE__DATA_SET);

    defaultDataSetEClass = createEClass(DEFAULT_DATA_SET);

    namedDataSetEClass = createEClass(NAMED_DATA_SET);

    serviceDataSetEClass = createEClass(SERVICE_DATA_SET);

    whereClauseEClass = createEClass(WHERE_CLAUSE);
    createEReference(whereClauseEClass, WHERE_CLAUSE__GROUP_GRAPH_PATTERN);

    groupClauseEClass = createEClass(GROUP_CLAUSE);
    createEReference(groupClauseEClass, GROUP_CLAUSE__CONDITION);

    groupConditionEClass = createEClass(GROUP_CONDITION);

    havingClauseEClass = createEClass(HAVING_CLAUSE);
    createEReference(havingClauseEClass, HAVING_CLAUSE__CONSTRAINT);

    constraintEClass = createEClass(CONSTRAINT);

    limitClauseEClass = createEClass(LIMIT_CLAUSE);
    createEAttribute(limitClauseEClass, LIMIT_CLAUSE__LIMIT);

    groupGraphPatternEClass = createEClass(GROUP_GRAPH_PATTERN);

    subSelectQueryEClass = createEClass(SUB_SELECT_QUERY);
    createEReference(subSelectQueryEClass, SUB_SELECT_QUERY__VARIABLES);
    createEReference(subSelectQueryEClass, SUB_SELECT_QUERY__WHERE_CLAUSE);
    createEReference(subSelectQueryEClass, SUB_SELECT_QUERY__GROUP_CLAUSE);
    createEReference(subSelectQueryEClass, SUB_SELECT_QUERY__HAVING_CLAUSE);

    groupGraphPatternSubEClass = createEClass(GROUP_GRAPH_PATTERN_SUB);
    createEReference(groupGraphPatternSubEClass, GROUP_GRAPH_PATTERN_SUB__GRAPH_PATTERNS);

    graphPatternEClass = createEClass(GRAPH_PATTERN);

    triplesSameSubjectEClass = createEClass(TRIPLES_SAME_SUBJECT);
    createEReference(triplesSameSubjectEClass, TRIPLES_SAME_SUBJECT__SUBJECT);
    createEReference(triplesSameSubjectEClass, TRIPLES_SAME_SUBJECT__PROPERTY_LIST);

    groupOrUnionGraphPatternEClass = createEClass(GROUP_OR_UNION_GRAPH_PATTERN);
    createEReference(groupOrUnionGraphPatternEClass, GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS);

    optionalGraphPatternEClass = createEClass(OPTIONAL_GRAPH_PATTERN);
    createEReference(optionalGraphPatternEClass, OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN);

    propertyListEClass = createEClass(PROPERTY_LIST);
    createEReference(propertyListEClass, PROPERTY_LIST__PROPERTY);
    createEReference(propertyListEClass, PROPERTY_LIST__OBJECT);

    graphGraphPatternEClass = createEClass(GRAPH_GRAPH_PATTERN);
    createEReference(graphGraphPatternEClass, GRAPH_GRAPH_PATTERN__VAR);
    createEReference(graphGraphPatternEClass, GRAPH_GRAPH_PATTERN__PATTERN);

    serviceGraphPatternEClass = createEClass(SERVICE_GRAPH_PATTERN);
    createEReference(serviceGraphPatternEClass, SERVICE_GRAPH_PATTERN__VAR);
    createEReference(serviceGraphPatternEClass, SERVICE_GRAPH_PATTERN__PATTERN);

    filterPatternEClass = createEClass(FILTER_PATTERN);
    createEReference(filterPatternEClass, FILTER_PATTERN__EXPRESSION);

    existsPatternEClass = createEClass(EXISTS_PATTERN);
    createEReference(existsPatternEClass, EXISTS_PATTERN__PATTERN);

    notExistsPatternEClass = createEClass(NOT_EXISTS_PATTERN);
    createEReference(notExistsPatternEClass, NOT_EXISTS_PATTERN__PATTERN);

    minusPatternEClass = createEClass(MINUS_PATTERN);
    createEReference(minusPatternEClass, MINUS_PATTERN__PATTERN);

    expressionEClass = createEClass(EXPRESSION);

    expressionFilterExpressionEClass = createEClass(EXPRESSION_FILTER_EXPRESSION);
    createEReference(expressionFilterExpressionEClass, EXPRESSION_FILTER_EXPRESSION__LEFT);
    createEAttribute(expressionFilterExpressionEClass, EXPRESSION_FILTER_EXPRESSION__OPERATOR);
    createEReference(expressionFilterExpressionEClass, EXPRESSION_FILTER_EXPRESSION__RIGHT);

    filterNodeEClass = createEClass(FILTER_NODE);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__PARAMETERS);

    namedFunctionEClass = createEClass(NAMED_FUNCTION);
    createEReference(namedFunctionEClass, NAMED_FUNCTION__PREFIX);

    sparqlFunctionEClass = createEClass(SPARQL_FUNCTION);

    builtInCallEClass = createEClass(BUILT_IN_CALL);
    createEReference(builtInCallEClass, BUILT_IN_CALL__EXPR);
    createEReference(builtInCallEClass, BUILT_IN_CALL__LEFT);
    createEReference(builtInCallEClass, BUILT_IN_CALL__RIGHT);
    createEReference(builtInCallEClass, BUILT_IN_CALL__VAR);
    createEReference(builtInCallEClass, BUILT_IN_CALL__IF_EXPR);
    createEReference(builtInCallEClass, BUILT_IN_CALL__THEN_EXPR);
    createEReference(builtInCallEClass, BUILT_IN_CALL__ELSE_EXPR);

    aggregateEClass = createEClass(AGGREGATE);

    exprAggArgEClass = createEClass(EXPR_AGG_ARG);
    createEAttribute(exprAggArgEClass, EXPR_AGG_ARG__IS_DISTINCT);
    createEReference(exprAggArgEClass, EXPR_AGG_ARG__EXPR);

    graphNodeEClass = createEClass(GRAPH_NODE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    unNamedVariableEClass = createEClass(UN_NAMED_VARIABLE);

    namedVariableEClass = createEClass(NAMED_VARIABLE);
    createEReference(namedVariableEClass, NAMED_VARIABLE__PREFIX);

    blankNodeEClass = createEClass(BLANK_NODE);
    createEAttribute(blankNodeEClass, BLANK_NODE__NAME);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    valueEClass = createEClass(VALUE);
    createEReference(valueEClass, VALUE__TAG);

    iriEClass = createEClass(IRI);
    createEAttribute(iriEClass, IRI__VALUE);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    integerValueEClass = createEClass(INTEGER_VALUE);
    createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

    rdfTagEClass = createEClass(RDF_TAG);

    typeTagEClass = createEClass(TYPE_TAG);
    createEReference(typeTagEClass, TYPE_TAG__TYPE);

    langTagEClass = createEClass(LANG_TAG);
    createEAttribute(langTagEClass, LANG_TAG__LANG);

    orFilterExpressionEClass = createEClass(OR_FILTER_EXPRESSION);
    createEReference(orFilterExpressionEClass, OR_FILTER_EXPRESSION__ENTRIES);

    andFilterExpressionEClass = createEClass(AND_FILTER_EXPRESSION);
    createEReference(andFilterExpressionEClass, AND_FILTER_EXPRESSION__ENTRIES);

    countAggregateEClass = createEClass(COUNT_AGGREGATE);
    createEAttribute(countAggregateEClass, COUNT_AGGREGATE__IS_DISTINCT);
    createEAttribute(countAggregateEClass, COUNT_AGGREGATE__IS_ALL);
    createEReference(countAggregateEClass, COUNT_AGGREGATE__EXPR);

    sumAggregateEClass = createEClass(SUM_AGGREGATE);
    createEReference(sumAggregateEClass, SUM_AGGREGATE__EXPR);

    minAgregateEClass = createEClass(MIN_AGREGATE);
    createEReference(minAgregateEClass, MIN_AGREGATE__EXPR);

    maxAggregateEClass = createEClass(MAX_AGGREGATE);
    createEReference(maxAggregateEClass, MAX_AGGREGATE__EXPR);

    avgAggregateEClass = createEClass(AVG_AGGREGATE);
    createEReference(avgAggregateEClass, AVG_AGGREGATE__EXPR);

    sampleAggregateEClass = createEClass(SAMPLE_AGGREGATE);
    createEReference(sampleAggregateEClass, SAMPLE_AGGREGATE__EXPR);

    groupAggregateEClass = createEClass(GROUP_AGGREGATE);
    createEAttribute(groupAggregateEClass, GROUP_AGGREGATE__IS_DISTINCT);
    createEReference(groupAggregateEClass, GROUP_AGGREGATE__EXPR);
    createEAttribute(groupAggregateEClass, GROUP_AGGREGATE__VALUE);

    // Create enums
    operatorEEnum = createEEnum(OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    selectionQueryEClass.getESuperTypes().add(this.getSPARQLQuery());
    selectQueryEClass.getESuperTypes().add(this.getSelectionQuery());
    askQueryEClass.getESuperTypes().add(this.getSelectionQuery());
    describeQueryEClass.getESuperTypes().add(this.getSelectionQuery());
    constructQueryEClass.getESuperTypes().add(this.getSelectionQuery());
    updateQueryEClass.getESuperTypes().add(this.getSPARQLQuery());
    modifyQueryEClass.getESuperTypes().add(this.getUpdateOperation());
    createGraphQueryEClass.getESuperTypes().add(this.getUpdateOperation());
    dropGraphQueryEClass.getESuperTypes().add(this.getUpdateOperation());
    loadGraphQueryEClass.getESuperTypes().add(this.getUpdateOperation());
    clearGraphQueryEClass.getESuperTypes().add(this.getUpdateOperation());
    insertQueryEClass.getESuperTypes().add(this.getModifyQuery());
    insertDataQueryEClass.getESuperTypes().add(this.getModifyQuery());
    deleteQueryEClass.getESuperTypes().add(this.getModifyQuery());
    deleteDataQueryEClass.getESuperTypes().add(this.getModifyQuery());
    deleteWhereQueryEClass.getESuperTypes().add(this.getModifyQuery());
    defaultDataSetEClass.getESuperTypes().add(this.getDatasetClause());
    namedDataSetEClass.getESuperTypes().add(this.getDatasetClause());
    serviceDataSetEClass.getESuperTypes().add(this.getDatasetClause());
    subSelectQueryEClass.getESuperTypes().add(this.getGroupGraphPattern());
    groupGraphPatternSubEClass.getESuperTypes().add(this.getGroupGraphPattern());
    triplesSameSubjectEClass.getESuperTypes().add(this.getGraphPattern());
    groupOrUnionGraphPatternEClass.getESuperTypes().add(this.getGraphPattern());
    optionalGraphPatternEClass.getESuperTypes().add(this.getGraphPattern());
    graphGraphPatternEClass.getESuperTypes().add(this.getGraphPattern());
    serviceGraphPatternEClass.getESuperTypes().add(this.getGraphPattern());
    filterPatternEClass.getESuperTypes().add(this.getGraphPattern());
    existsPatternEClass.getESuperTypes().add(this.getGraphPattern());
    notExistsPatternEClass.getESuperTypes().add(this.getGraphPattern());
    minusPatternEClass.getESuperTypes().add(this.getGraphPattern());
    expressionEClass.getESuperTypes().add(this.getConstraint());
    expressionFilterExpressionEClass.getESuperTypes().add(this.getExpression());
    functionEClass.getESuperTypes().add(this.getGroupCondition());
    functionEClass.getESuperTypes().add(this.getConstraint());
    functionEClass.getESuperTypes().add(this.getFilterNode());
    namedFunctionEClass.getESuperTypes().add(this.getFunction());
    sparqlFunctionEClass.getESuperTypes().add(this.getFunction());
    builtInCallEClass.getESuperTypes().add(this.getGroupCondition());
    builtInCallEClass.getESuperTypes().add(this.getConstraint());
    graphNodeEClass.getESuperTypes().add(this.getFilterNode());
    variableEClass.getESuperTypes().add(this.getGroupCondition());
    variableEClass.getESuperTypes().add(this.getGraphNode());
    unNamedVariableEClass.getESuperTypes().add(this.getVariable());
    namedVariableEClass.getESuperTypes().add(this.getVariable());
    blankNodeEClass.getESuperTypes().add(this.getGraphNode());
    parameterEClass.getESuperTypes().add(this.getGraphNode());
    valueEClass.getESuperTypes().add(this.getGraphNode());
    iriEClass.getESuperTypes().add(this.getGraphNode());
    stringValueEClass.getESuperTypes().add(this.getValue());
    integerValueEClass.getESuperTypes().add(this.getValue());
    typeTagEClass.getESuperTypes().add(this.getRDFTag());
    langTagEClass.getESuperTypes().add(this.getRDFTag());
    orFilterExpressionEClass.getESuperTypes().add(this.getExpression());
    andFilterExpressionEClass.getESuperTypes().add(this.getExpression());
    countAggregateEClass.getESuperTypes().add(this.getAggregate());
    sumAggregateEClass.getESuperTypes().add(this.getAggregate());
    minAgregateEClass.getESuperTypes().add(this.getAggregate());
    maxAggregateEClass.getESuperTypes().add(this.getAggregate());
    avgAggregateEClass.getESuperTypes().add(this.getAggregate());
    sampleAggregateEClass.getESuperTypes().add(this.getAggregate());
    groupAggregateEClass.getESuperTypes().add(this.getAggregate());

    // Initialize classes and features; add operations and parameters
    initEClass(sparqlQueryEClass, SPARQLQuery.class, "SPARQLQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSPARQLQuery_Prefixes(), this.getPrefix(), null, "prefixes", null, 0, -1, SPARQLQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixEClass, Prefix.class, "Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefix_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrefix_Iref(), ecorePackage.getEString(), "iref", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBase_Iref(), this.getIRI(), null, "iref", null, 0, 1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionQueryEClass, SelectionQuery.class, "SelectionQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionQuery_Base(), this.getBase(), null, "base", null, 0, 1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionQuery_DatasetClause(), this.getDatasetClause(), null, "datasetClause", null, 0, -1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionQuery_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionQuery_GroupClause(), this.getGroupClause(), null, "groupClause", null, 0, 1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionQuery_HavingClause(), this.getHavingClause(), null, "havingClause", null, 0, 1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionQuery_LimitClause(), this.getLimitClause(), null, "limitClause", null, 0, 1, SelectionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectQueryEClass, SelectQuery.class, "SelectQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectQuery_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, SelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectQuery_IsReduced(), ecorePackage.getEBoolean(), "isReduced", null, 0, 1, SelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectQuery_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, SelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectQuery_Variables(), this.getVariable(), null, "variables", null, 0, -1, SelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(askQueryEClass, AskQuery.class, "AskQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(describeQueryEClass, DescribeQuery.class, "DescribeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescribeQuery_Variables(), this.getGraphNode(), null, "variables", null, 0, -1, DescribeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructQueryEClass, ConstructQuery.class, "ConstructQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructQuery_ConstructTemplate(), this.getGroupGraphPattern(), null, "constructTemplate", null, 0, 1, ConstructQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateQueryEClass, UpdateQuery.class, "UpdateQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateQuery_Operations(), this.getUpdateOperation(), null, "operations", null, 0, -1, UpdateQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateOperationEClass, UpdateOperation.class, "UpdateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modifyQueryEClass, ModifyQuery.class, "ModifyQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModifyQuery_WithGraph(), ecorePackage.getEString(), "withGraph", null, 0, 1, ModifyQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModifyQuery_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, ModifyQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createGraphQueryEClass, CreateGraphQuery.class, "CreateGraphQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateGraphQuery_IsSilent(), ecorePackage.getEString(), "isSilent", null, 0, 1, CreateGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateGraphQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, CreateGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropGraphQueryEClass, DropGraphQuery.class, "DropGraphQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropGraphQuery_IsSilent(), ecorePackage.getEString(), "isSilent", null, 0, 1, DropGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDropGraphQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, DropGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadGraphQueryEClass, LoadGraphQuery.class, "LoadGraphQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadGraphQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, LoadGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGraphQuery_IntoGraph(), ecorePackage.getEString(), "intoGraph", null, 0, 1, LoadGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clearGraphQueryEClass, ClearGraphQuery.class, "ClearGraphQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClearGraphQuery_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ClearGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClearGraphQuery_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 0, 1, ClearGraphQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usingGraphEClass, UsingGraph.class, "UsingGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUsingGraph_Named(), ecorePackage.getEBoolean(), "named", null, 0, 1, UsingGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUsingGraph_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, UsingGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertQueryEClass, InsertQuery.class, "InsertQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInsertQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, InsertQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertQuery_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, InsertQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertDataQueryEClass, InsertDataQuery.class, "InsertDataQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInsertDataQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, InsertDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteQueryEClass, DeleteQuery.class, "DeleteQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, DeleteQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteQuery_InsertPattern(), this.getGroupGraphPattern(), null, "insertPattern", null, 0, 1, DeleteQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteQuery_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, DeleteQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteDataQueryEClass, DeleteDataQuery.class, "DeleteDataQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteDataQuery_Graph(), ecorePackage.getEString(), "graph", null, 0, 1, DeleteDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteWhereQueryEClass, DeleteWhereQuery.class, "DeleteWhereQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datasetClauseEClass, DatasetClause.class, "DatasetClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatasetClause_DataSet(), this.getIRI(), null, "dataSet", null, 0, 1, DatasetClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultDataSetEClass, DefaultDataSet.class, "DefaultDataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedDataSetEClass, NamedDataSet.class, "NamedDataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceDataSetEClass, ServiceDataSet.class, "ServiceDataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whereClauseEClass, WhereClause.class, "WhereClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhereClause_GroupGraphPattern(), this.getGroupGraphPattern(), null, "groupGraphPattern", null, 0, 1, WhereClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupClauseEClass, GroupClause.class, "GroupClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupClause_Condition(), this.getGroupCondition(), null, "condition", null, 0, 1, GroupClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupConditionEClass, GroupCondition.class, "GroupCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(havingClauseEClass, HavingClause.class, "HavingClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHavingClause_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, HavingClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(limitClauseEClass, LimitClause.class, "LimitClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLimitClause_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, LimitClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupGraphPatternEClass, GroupGraphPattern.class, "GroupGraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subSelectQueryEClass, SubSelectQuery.class, "SubSelectQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubSelectQuery_Variables(), this.getVariable(), null, "variables", null, 0, -1, SubSelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubSelectQuery_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, SubSelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubSelectQuery_GroupClause(), this.getGroupClause(), null, "groupClause", null, 0, 1, SubSelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubSelectQuery_HavingClause(), this.getHavingClause(), null, "havingClause", null, 0, 1, SubSelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupGraphPatternSubEClass, GroupGraphPatternSub.class, "GroupGraphPatternSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupGraphPatternSub_GraphPatterns(), this.getGraphPattern(), null, "graphPatterns", null, 0, -1, GroupGraphPatternSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphPatternEClass, GraphPattern.class, "GraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(triplesSameSubjectEClass, TriplesSameSubject.class, "TriplesSameSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriplesSameSubject_Subject(), this.getGraphNode(), null, "subject", null, 0, 1, TriplesSameSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriplesSameSubject_PropertyList(), this.getPropertyList(), null, "propertyList", null, 0, -1, TriplesSameSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupOrUnionGraphPatternEClass, GroupOrUnionGraphPattern.class, "GroupOrUnionGraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupOrUnionGraphPattern_GraphPatterns(), this.getGroupGraphPattern(), null, "graphPatterns", null, 0, -1, GroupOrUnionGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalGraphPatternEClass, OptionalGraphPattern.class, "OptionalGraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionalGraphPattern_GraphPattern(), this.getGroupGraphPattern(), null, "graphPattern", null, 0, -1, OptionalGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyListEClass, PropertyList.class, "PropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyList_Property(), this.getGraphNode(), null, "property", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyList_Object(), this.getGraphNode(), null, "object", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphGraphPatternEClass, GraphGraphPattern.class, "GraphGraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraphGraphPattern_Var(), this.getGraphNode(), null, "var", null, 0, 1, GraphGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphGraphPattern_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, GraphGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceGraphPatternEClass, ServiceGraphPattern.class, "ServiceGraphPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceGraphPattern_Var(), this.getGraphNode(), null, "var", null, 0, 1, ServiceGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceGraphPattern_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, ServiceGraphPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterPatternEClass, FilterPattern.class, "FilterPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterPattern_Expression(), this.getExpression(), null, "expression", null, 0, 1, FilterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existsPatternEClass, ExistsPattern.class, "ExistsPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExistsPattern_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, ExistsPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notExistsPatternEClass, NotExistsPattern.class, "NotExistsPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotExistsPattern_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, NotExistsPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusPatternEClass, MinusPattern.class, "MinusPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinusPattern_Pattern(), this.getGroupGraphPattern(), null, "pattern", null, 0, 1, MinusPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionFilterExpressionEClass, ExpressionFilterExpression.class, "ExpressionFilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionFilterExpression_Left(), this.getFilterNode(), null, "left", null, 0, 1, ExpressionFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionFilterExpression_Operator(), this.getOperator(), "operator", null, 0, 1, ExpressionFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionFilterExpression_Right(), this.getFilterNode(), null, "right", null, 0, 1, ExpressionFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterNodeEClass, FilterNode.class, "FilterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Parameters(), this.getVariable(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedFunctionEClass, NamedFunction.class, "NamedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedFunction_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, NamedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sparqlFunctionEClass, SparqlFunction.class, "SparqlFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtInCallEClass, BuiltInCall.class, "BuiltInCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuiltInCall_Expr(), this.getExpression(), null, "expr", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_Left(), this.getExpression(), null, "left", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_Right(), this.getExpression(), null, "right", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_Var(), this.getVariable(), null, "var", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_IfExpr(), this.getExpression(), null, "ifExpr", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_ThenExpr(), this.getExpression(), null, "thenExpr", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInCall_ElseExpr(), this.getExpression(), null, "elseExpr", null, 0, 1, BuiltInCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprAggArgEClass, ExprAggArg.class, "ExprAggArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprAggArg_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, ExprAggArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAggArg_Expr(), this.getExpression(), null, "expr", null, 0, 1, ExprAggArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphNodeEClass, GraphNode.class, "GraphNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unNamedVariableEClass, UnNamedVariable.class, "UnNamedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedVariableEClass, NamedVariable.class, "NamedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedVariable_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, NamedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blankNodeEClass, BlankNode.class, "BlankNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlankNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlankNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValue_Tag(), this.getRDFTag(), null, "tag", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iriEClass, com.emftriple.query.sparql.IRI.class, "IRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIRI_Value(), ecorePackage.getEString(), "value", null, 0, 1, com.emftriple.query.sparql.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdfTagEClass, RDFTag.class, "RDFTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeTagEClass, TypeTag.class, "TypeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeTag_Type(), this.getGraphNode(), null, "type", null, 0, 1, TypeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(langTagEClass, LangTag.class, "LangTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLangTag_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LangTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orFilterExpressionEClass, OrFilterExpression.class, "OrFilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrFilterExpression_Entries(), this.getExpression(), null, "entries", null, 0, -1, OrFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andFilterExpressionEClass, AndFilterExpression.class, "AndFilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndFilterExpression_Entries(), this.getExpression(), null, "entries", null, 0, -1, AndFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countAggregateEClass, CountAggregate.class, "CountAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCountAggregate_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, CountAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCountAggregate_IsAll(), ecorePackage.getEBoolean(), "isAll", null, 0, 1, CountAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountAggregate_Expr(), this.getExpression(), null, "expr", null, 0, 1, CountAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumAggregateEClass, SumAggregate.class, "SumAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumAggregate_Expr(), this.getExprAggArg(), null, "expr", null, 0, 1, SumAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minAgregateEClass, MinAgregate.class, "MinAgregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinAgregate_Expr(), this.getExprAggArg(), null, "expr", null, 0, 1, MinAgregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maxAggregateEClass, MaxAggregate.class, "MaxAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaxAggregate_Expr(), this.getExprAggArg(), null, "expr", null, 0, 1, MaxAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avgAggregateEClass, AvgAggregate.class, "AvgAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAvgAggregate_Expr(), this.getExprAggArg(), null, "expr", null, 0, 1, AvgAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sampleAggregateEClass, SampleAggregate.class, "SampleAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSampleAggregate_Expr(), this.getExprAggArg(), null, "expr", null, 0, 1, SampleAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupAggregateEClass, GroupAggregate.class, "GroupAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupAggregate_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, GroupAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupAggregate_Expr(), this.getExpression(), null, "expr", null, 0, -1, GroupAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupAggregate_Value(), ecorePackage.getEString(), "value", null, 0, 1, GroupAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(operatorEEnum, Operator.class, "Operator");
    addEEnumLiteral(operatorEEnum, Operator.LESS_THEN);
    addEEnumLiteral(operatorEEnum, Operator.GREATER_THEN);
    addEEnumLiteral(operatorEEnum, Operator.LESS_EQUAL);
    addEEnumLiteral(operatorEEnum, Operator.GREATER_EQUAL);
    addEEnumLiteral(operatorEEnum, Operator.EQUAL);
    addEEnumLiteral(operatorEEnum, Operator.NOT_EQUAL);
    addEEnumLiteral(operatorEEnum, Operator.SUM);
    addEEnumLiteral(operatorEEnum, Operator.DIV);
    addEEnumLiteral(operatorEEnum, Operator.SUB);
    addEEnumLiteral(operatorEEnum, Operator.MULTIPLICITY);

    // Create resource
    createResource(eNS_URI);
  }

} //SparqlPackageImpl
