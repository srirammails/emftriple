/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.query.sparql.SparqlPackage
 * @generated
 */
public interface SparqlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparqlFactory eINSTANCE = com.emftriple.query.sparql.impl.SparqlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SPARQL Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SPARQL Query</em>'.
   * @generated
   */
  SPARQLQuery createSPARQLQuery();

  /**
   * Returns a new object of class '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix</em>'.
   * @generated
   */
  Prefix createPrefix();

  /**
   * Returns a new object of class '<em>Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base</em>'.
   * @generated
   */
  Base createBase();

  /**
   * Returns a new object of class '<em>Selection Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Query</em>'.
   * @generated
   */
  SelectionQuery createSelectionQuery();

  /**
   * Returns a new object of class '<em>Select Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Query</em>'.
   * @generated
   */
  SelectQuery createSelectQuery();

  /**
   * Returns a new object of class '<em>Ask Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ask Query</em>'.
   * @generated
   */
  AskQuery createAskQuery();

  /**
   * Returns a new object of class '<em>Describe Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Describe Query</em>'.
   * @generated
   */
  DescribeQuery createDescribeQuery();

  /**
   * Returns a new object of class '<em>Construct Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Construct Query</em>'.
   * @generated
   */
  ConstructQuery createConstructQuery();

  /**
   * Returns a new object of class '<em>Update Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Query</em>'.
   * @generated
   */
  UpdateQuery createUpdateQuery();

  /**
   * Returns a new object of class '<em>Update Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Operation</em>'.
   * @generated
   */
  UpdateOperation createUpdateOperation();

  /**
   * Returns a new object of class '<em>Modify Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modify Query</em>'.
   * @generated
   */
  ModifyQuery createModifyQuery();

  /**
   * Returns a new object of class '<em>Create Graph Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Graph Query</em>'.
   * @generated
   */
  CreateGraphQuery createCreateGraphQuery();

  /**
   * Returns a new object of class '<em>Drop Graph Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Graph Query</em>'.
   * @generated
   */
  DropGraphQuery createDropGraphQuery();

  /**
   * Returns a new object of class '<em>Load Graph Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Graph Query</em>'.
   * @generated
   */
  LoadGraphQuery createLoadGraphQuery();

  /**
   * Returns a new object of class '<em>Clear Graph Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clear Graph Query</em>'.
   * @generated
   */
  ClearGraphQuery createClearGraphQuery();

  /**
   * Returns a new object of class '<em>Using Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Graph</em>'.
   * @generated
   */
  UsingGraph createUsingGraph();

  /**
   * Returns a new object of class '<em>Insert Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Query</em>'.
   * @generated
   */
  InsertQuery createInsertQuery();

  /**
   * Returns a new object of class '<em>Insert Data Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Data Query</em>'.
   * @generated
   */
  InsertDataQuery createInsertDataQuery();

  /**
   * Returns a new object of class '<em>Delete Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Query</em>'.
   * @generated
   */
  DeleteQuery createDeleteQuery();

  /**
   * Returns a new object of class '<em>Delete Data Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Data Query</em>'.
   * @generated
   */
  DeleteDataQuery createDeleteDataQuery();

  /**
   * Returns a new object of class '<em>Delete Where Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Where Query</em>'.
   * @generated
   */
  DeleteWhereQuery createDeleteWhereQuery();

  /**
   * Returns a new object of class '<em>Dataset Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dataset Clause</em>'.
   * @generated
   */
  DatasetClause createDatasetClause();

  /**
   * Returns a new object of class '<em>Default Data Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Data Set</em>'.
   * @generated
   */
  DefaultDataSet createDefaultDataSet();

  /**
   * Returns a new object of class '<em>Named Data Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Data Set</em>'.
   * @generated
   */
  NamedDataSet createNamedDataSet();

  /**
   * Returns a new object of class '<em>Service Data Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Data Set</em>'.
   * @generated
   */
  ServiceDataSet createServiceDataSet();

  /**
   * Returns a new object of class '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Clause</em>'.
   * @generated
   */
  WhereClause createWhereClause();

  /**
   * Returns a new object of class '<em>Group Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Clause</em>'.
   * @generated
   */
  GroupClause createGroupClause();

  /**
   * Returns a new object of class '<em>Group Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Condition</em>'.
   * @generated
   */
  GroupCondition createGroupCondition();

  /**
   * Returns a new object of class '<em>Having Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Having Clause</em>'.
   * @generated
   */
  HavingClause createHavingClause();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Limit Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit Clause</em>'.
   * @generated
   */
  LimitClause createLimitClause();

  /**
   * Returns a new object of class '<em>Group Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Graph Pattern</em>'.
   * @generated
   */
  GroupGraphPattern createGroupGraphPattern();

  /**
   * Returns a new object of class '<em>Sub Select Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Select Query</em>'.
   * @generated
   */
  SubSelectQuery createSubSelectQuery();

  /**
   * Returns a new object of class '<em>Group Graph Pattern Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Graph Pattern Sub</em>'.
   * @generated
   */
  GroupGraphPatternSub createGroupGraphPatternSub();

  /**
   * Returns a new object of class '<em>Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph Pattern</em>'.
   * @generated
   */
  GraphPattern createGraphPattern();

  /**
   * Returns a new object of class '<em>Triples Same Subject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triples Same Subject</em>'.
   * @generated
   */
  TriplesSameSubject createTriplesSameSubject();

  /**
   * Returns a new object of class '<em>Group Or Union Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Or Union Graph Pattern</em>'.
   * @generated
   */
  GroupOrUnionGraphPattern createGroupOrUnionGraphPattern();

  /**
   * Returns a new object of class '<em>Optional Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Graph Pattern</em>'.
   * @generated
   */
  OptionalGraphPattern createOptionalGraphPattern();

  /**
   * Returns a new object of class '<em>Property List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property List</em>'.
   * @generated
   */
  PropertyList createPropertyList();

  /**
   * Returns a new object of class '<em>Graph Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph Graph Pattern</em>'.
   * @generated
   */
  GraphGraphPattern createGraphGraphPattern();

  /**
   * Returns a new object of class '<em>Service Graph Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Graph Pattern</em>'.
   * @generated
   */
  ServiceGraphPattern createServiceGraphPattern();

  /**
   * Returns a new object of class '<em>Filter Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Pattern</em>'.
   * @generated
   */
  FilterPattern createFilterPattern();

  /**
   * Returns a new object of class '<em>Exists Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists Pattern</em>'.
   * @generated
   */
  ExistsPattern createExistsPattern();

  /**
   * Returns a new object of class '<em>Not Exists Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Exists Pattern</em>'.
   * @generated
   */
  NotExistsPattern createNotExistsPattern();

  /**
   * Returns a new object of class '<em>Minus Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus Pattern</em>'.
   * @generated
   */
  MinusPattern createMinusPattern();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Filter Expression</em>'.
   * @generated
   */
  ExpressionFilterExpression createExpressionFilterExpression();

  /**
   * Returns a new object of class '<em>Filter Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Node</em>'.
   * @generated
   */
  FilterNode createFilterNode();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Named Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Function</em>'.
   * @generated
   */
  NamedFunction createNamedFunction();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  SparqlFunction createSparqlFunction();

  /**
   * Returns a new object of class '<em>Built In Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Call</em>'.
   * @generated
   */
  BuiltInCall createBuiltInCall();

  /**
   * Returns a new object of class '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate</em>'.
   * @generated
   */
  Aggregate createAggregate();

  /**
   * Returns a new object of class '<em>Expr Agg Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Agg Arg</em>'.
   * @generated
   */
  ExprAggArg createExprAggArg();

  /**
   * Returns a new object of class '<em>Graph Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph Node</em>'.
   * @generated
   */
  GraphNode createGraphNode();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Un Named Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Named Variable</em>'.
   * @generated
   */
  UnNamedVariable createUnNamedVariable();

  /**
   * Returns a new object of class '<em>Named Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Variable</em>'.
   * @generated
   */
  NamedVariable createNamedVariable();

  /**
   * Returns a new object of class '<em>Blank Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blank Node</em>'.
   * @generated
   */
  BlankNode createBlankNode();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>IRI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IRI</em>'.
   * @generated
   */
  IRI createIRI();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Value</em>'.
   * @generated
   */
  IntegerValue createIntegerValue();

  /**
   * Returns a new object of class '<em>RDF Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RDF Tag</em>'.
   * @generated
   */
  RDFTag createRDFTag();

  /**
   * Returns a new object of class '<em>Type Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Tag</em>'.
   * @generated
   */
  TypeTag createTypeTag();

  /**
   * Returns a new object of class '<em>Lang Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lang Tag</em>'.
   * @generated
   */
  LangTag createLangTag();

  /**
   * Returns a new object of class '<em>Or Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Filter Expression</em>'.
   * @generated
   */
  OrFilterExpression createOrFilterExpression();

  /**
   * Returns a new object of class '<em>And Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Filter Expression</em>'.
   * @generated
   */
  AndFilterExpression createAndFilterExpression();

  /**
   * Returns a new object of class '<em>Count Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Aggregate</em>'.
   * @generated
   */
  CountAggregate createCountAggregate();

  /**
   * Returns a new object of class '<em>Sum Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Aggregate</em>'.
   * @generated
   */
  SumAggregate createSumAggregate();

  /**
   * Returns a new object of class '<em>Min Agregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Agregate</em>'.
   * @generated
   */
  MinAgregate createMinAgregate();

  /**
   * Returns a new object of class '<em>Max Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Aggregate</em>'.
   * @generated
   */
  MaxAggregate createMaxAggregate();

  /**
   * Returns a new object of class '<em>Avg Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg Aggregate</em>'.
   * @generated
   */
  AvgAggregate createAvgAggregate();

  /**
   * Returns a new object of class '<em>Sample Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sample Aggregate</em>'.
   * @generated
   */
  SampleAggregate createSampleAggregate();

  /**
   * Returns a new object of class '<em>Group Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Aggregate</em>'.
   * @generated
   */
  GroupAggregate createGroupAggregate();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SparqlPackage getSparqlPackage();

} //SparqlFactory
