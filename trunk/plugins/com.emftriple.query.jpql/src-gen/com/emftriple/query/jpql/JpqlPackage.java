/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.emftriple.query.jpql.JpqlFactory
 * @model kind="package"
 * @generated
 */
public interface JpqlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jpql";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftriple.com/2009/jpql";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jpql";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JpqlPackage eINSTANCE = com.emftriple.query.jpql.impl.JpqlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.QueryModuleImpl <em>Query Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.QueryModuleImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getQueryModule()
   * @generated
   */
  int QUERY_MODULE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_MODULE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Default Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_MODULE__DEFAULT_QUERY = 1;

  /**
   * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_MODULE__NAMED_QUERIES = 2;

  /**
   * The number of structural features of the '<em>Query Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ImportImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.NamedQueryImpl <em>Named Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.NamedQueryImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNamedQuery()
   * @generated
   */
  int NAMED_QUERY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__NAME = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__QUERY = 1;

  /**
   * The number of structural features of the '<em>Named Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.JPQLQueryImpl <em>JPQL Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.JPQLQueryImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getJPQLQuery()
   * @generated
   */
  int JPQL_QUERY = 3;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPQL_QUERY__WHERE_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>JPQL Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPQL_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectStatementImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Select From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__SELECT_FROM_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__HAVING = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ORDER = JPQL_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.HavingClauseImpl <em>Having Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.HavingClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getHavingClause()
   * @generated
   */
  int HAVING_CLAUSE = 5;

  /**
   * The feature id for the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE__HAVING = 0;

  /**
   * The number of structural features of the '<em>Having Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.OrderClauseImpl <em>Order Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.OrderClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrderClause()
   * @generated
   */
  int ORDER_CLAUSE = 6;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_CLAUSE__ORDERING = 0;

  /**
   * The feature id for the '<em><b>Is Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_CLAUSE__IS_ASC = 1;

  /**
   * The feature id for the '<em><b>Is Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_CLAUSE__IS_DESC = 2;

  /**
   * The number of structural features of the '<em>Order Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.OrderItemImpl <em>Order Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.OrderItemImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrderItem()
   * @generated
   */
  int ORDER_ITEM = 7;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_ITEM__VAR = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_ITEM__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Order Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.UpdateStatementImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateStatement()
   * @generated
   */
  int UPDATE_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Update Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__UPDATE_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Set Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__SET_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.UpdateClauseImpl <em>Update Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.UpdateClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateClause()
   * @generated
   */
  int UPDATE_CLAUSE = 9;

  /**
   * The feature id for the '<em><b>From Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_CLAUSE__FROM_ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Update Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SetClauseImpl <em>Set Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SetClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSetClause()
   * @generated
   */
  int SET_CLAUSE = 10;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CLAUSE__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Set Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.UpdateItemImpl <em>Update Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.UpdateItemImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateItem()
   * @generated
   */
  int UPDATE_ITEM = 11;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Update Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.DeleteStatementImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDeleteStatement()
   * @generated
   */
  int DELETE_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Delete Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__DELETE_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.DeleteClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDeleteClause()
   * @generated
   */
  int DELETE_CLAUSE = 13;

  /**
   * The feature id for the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLAUSE__FROM_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Delete Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectFromClauseImpl <em>Select From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectFromClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectFromClause()
   * @generated
   */
  int SELECT_FROM_CLAUSE = 14;

  /**
   * The feature id for the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM_CLAUSE__SELECT_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM_CLAUSE__FROM_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Select From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectClauseImpl <em>Select Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectClause()
   * @generated
   */
  int SELECT_CLAUSE = 15;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__IS_DISTINCT = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Select Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectExpression()
   * @generated
   */
  int SELECT_EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Select Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectAggregateExpressionImpl <em>Select Aggregate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectAggregateExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectAggregateExpression()
   * @generated
   */
  int SELECT_AGGREGATE_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION__ITEM = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Aggregate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.AvgAggregateImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAvgAggregate()
   * @generated
   */
  int AVG_AGGREGATE = 18;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Avg Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.MaxAggregateImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getMaxAggregate()
   * @generated
   */
  int MAX_AGGREGATE = 19;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Max Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.MinAggregateImpl <em>Min Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.MinAggregateImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getMinAggregate()
   * @generated
   */
  int MIN_AGGREGATE = 20;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Min Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SumAggregateImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSumAggregate()
   * @generated
   */
  int SUM_AGGREGATE = 21;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Sum Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.CountAggregateImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getCountAggregate()
   * @generated
   */
  int COUNT_AGGREGATE = 22;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Count Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SelectConstructorExpressionImpl <em>Select Constructor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SelectConstructorExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectConstructorExpression()
   * @generated
   */
  int SELECT_CONSTRUCTOR_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION__NAME = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION__ITEMS = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Constructor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FromClauseImpl <em>From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FromClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromClause()
   * @generated
   */
  int FROM_CLAUSE = 24;

  /**
   * The feature id for the '<em><b>From Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__FROM_ENTRIES = 0;

  /**
   * The number of structural features of the '<em>From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FromEntryImpl <em>From Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FromEntryImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromEntry()
   * @generated
   */
  int FROM_ENTRY = 25;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_ENTRY__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>From Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.VariableDeclarationImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FromClassImpl <em>From Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FromClassImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromClass()
   * @generated
   */
  int FROM_CLASS = 27;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__VARIABLE = FROM_ENTRY__VARIABLE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__TYPE = FROM_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Joins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__JOINS = FROM_ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>From Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_FEATURE_COUNT = FROM_ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FromCollectionImpl <em>From Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FromCollectionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromCollection()
   * @generated
   */
  int FROM_COLLECTION = 28;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION__VARIABLE = FROM_ENTRY__VARIABLE;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION__PATH = FROM_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>From Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION_FEATURE_COUNT = FROM_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FromJoinImpl <em>From Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FromJoinImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromJoin()
   * @generated
   */
  int FROM_JOIN = 29;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__IS_FETCH = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__PATH = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__VARIABLE = 2;

  /**
   * The number of structural features of the '<em>From Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.JoinImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getJoin()
   * @generated
   */
  int JOIN = 30;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.LeftJoinImpl <em>Left Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.LeftJoinImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getLeftJoin()
   * @generated
   */
  int LEFT_JOIN = 31;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The feature id for the '<em><b>Is Outer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__IS_OUTER = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Left Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.InnerJoinImpl <em>Inner Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.InnerJoinImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInnerJoin()
   * @generated
   */
  int INNER_JOIN = 32;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The number of structural features of the '<em>Inner Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.WhereClauseImpl <em>Where Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.WhereClauseImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getWhereClause()
   * @generated
   */
  int WHERE_CLAUSE = 33;

  /**
   * The feature id for the '<em><b>Where Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE__WHERE_ENTRY = 0;

  /**
   * The number of structural features of the '<em>Where Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 34;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.OperatorExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOperatorExpression()
   * @generated
   */
  int OPERATOR_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ExistsExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExistsExpression()
   * @generated
   */
  int EXISTS_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_EXPRESSION__QUERY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exists Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.AllExpressionImpl <em>All Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.AllExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAllExpression()
   * @generated
   */
  int ALL_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPRESSION__QUERY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>All Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.AnyExpressionImpl <em>Any Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.AnyExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAnyExpression()
   * @generated
   */
  int ANY_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_EXPRESSION__QUERY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Any Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.SomeExpressionImpl <em>Some Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.SomeExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSomeExpression()
   * @generated
   */
  int SOME_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_EXPRESSION__QUERY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Some Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.CollectionExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getCollectionExpression()
   * @generated
   */
  int COLLECTION_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Collection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.NullComparisonExpressionImpl <em>Null Comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.NullComparisonExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNullComparisonExpression()
   * @generated
   */
  int NULL_COMPARISON_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_COMPARISON_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_COMPARISON_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Null Comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_COMPARISON_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.EmptyComparisonExpressionImpl <em>Empty Comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.EmptyComparisonExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getEmptyComparisonExpression()
   * @generated
   */
  int EMPTY_COMPARISON_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_COMPARISON_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_COMPARISON_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Empty Comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_COMPARISON_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.LikeExpressionImpl <em>Like Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.LikeExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getLikeExpression()
   * @generated
   */
  int LIKE_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_EXPRESSION__PATTERN = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Like Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.InExpressionImpl <em>In Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.InExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInExpression()
   * @generated
   */
  int IN_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>In Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.InSeqExpressionImpl <em>In Seq Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.InSeqExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInSeqExpression()
   * @generated
   */
  int IN_SEQ_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SEQ_EXPRESSION__LHS = IN_EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SEQ_EXPRESSION__IS_NOT = IN_EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SEQ_EXPRESSION__ITEMS = IN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Seq Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SEQ_EXPRESSION_FEATURE_COUNT = IN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.InQueryExpressionImpl <em>In Query Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.InQueryExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInQueryExpression()
   * @generated
   */
  int IN_QUERY_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_QUERY_EXPRESSION__LHS = IN_EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_QUERY_EXPRESSION__IS_NOT = IN_EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_QUERY_EXPRESSION__QUERY = IN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Query Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_QUERY_EXPRESSION_FEATURE_COUNT = IN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.BetweenExpressionImpl <em>Between Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.BetweenExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getBetweenExpression()
   * @generated
   */
  int BETWEEN_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_EXPRESSION__IS_NOT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_EXPRESSION__MIN = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_EXPRESSION__MAX = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Between Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ExpressionTermImpl <em>Expression Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ExpressionTermImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExpressionTerm()
   * @generated
   */
  int EXPRESSION_TERM = 49;

  /**
   * The number of structural features of the '<em>Expression Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.VariableImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 48;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EXPRESSION_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.AliasAttributeExpressionImpl <em>Alias Attribute Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.AliasAttributeExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAliasAttributeExpression()
   * @generated
   */
  int ALIAS_ATTRIBUTE_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__ALIAS = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alias Attribute Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ParameterExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getParameterExpression()
   * @generated
   */
  int PARAMETER_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__NAME = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.FunctionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.ValueImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getValue()
   * @generated
   */
  int VALUE = 53;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.IntegerExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getIntegerExpression()
   * @generated
   */
  int INTEGER_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_EXPRESSION__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.StringExpressionImpl <em>String Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.StringExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getStringExpression()
   * @generated
   */
  int STRING_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.NullExpressionImpl <em>Null Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.NullExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNullExpression()
   * @generated
   */
  int NULL_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_EXPRESSION__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.BooleanExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.DateTimeExpressionImpl <em>Date Time Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.DateTimeExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDateTimeExpression()
   * @generated
   */
  int DATE_TIME_EXPRESSION = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_EXPRESSION__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Time Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.OrExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 59;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.impl.AndExpressionImpl
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.jpql.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.jpql.Operator
   * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 61;


  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.QueryModule <em>Query Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Module</em>'.
   * @see com.emftriple.query.jpql.QueryModule
   * @generated
   */
  EClass getQueryModule();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.QueryModule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.emftriple.query.jpql.QueryModule#getImports()
   * @see #getQueryModule()
   * @generated
   */
  EReference getQueryModule_Imports();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.QueryModule#getDefaultQuery <em>Default Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Query</em>'.
   * @see com.emftriple.query.jpql.QueryModule#getDefaultQuery()
   * @see #getQueryModule()
   * @generated
   */
  EReference getQueryModule_DefaultQuery();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.QueryModule#getNamedQueries <em>Named Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Queries</em>'.
   * @see com.emftriple.query.jpql.QueryModule#getNamedQueries()
   * @see #getQueryModule()
   * @generated
   */
  EReference getQueryModule_NamedQueries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.emftriple.query.jpql.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.emftriple.query.jpql.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.NamedQuery <em>Named Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Query</em>'.
   * @see com.emftriple.query.jpql.NamedQuery
   * @generated
   */
  EClass getNamedQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.NamedQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.jpql.NamedQuery#getName()
   * @see #getNamedQuery()
   * @generated
   */
  EAttribute getNamedQuery_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.NamedQuery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.NamedQuery#getQuery()
   * @see #getNamedQuery()
   * @generated
   */
  EReference getNamedQuery_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.JPQLQuery <em>JPQL Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPQL Query</em>'.
   * @see com.emftriple.query.jpql.JPQLQuery
   * @generated
   */
  EClass getJPQLQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.JPQLQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see com.emftriple.query.jpql.JPQLQuery#getWhereClause()
   * @see #getJPQLQuery()
   * @generated
   */
  EReference getJPQLQuery_WhereClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see com.emftriple.query.jpql.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectStatement#getSelectFromClause <em>Select From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select From Clause</em>'.
   * @see com.emftriple.query.jpql.SelectStatement#getSelectFromClause()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_SelectFromClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectStatement#getHaving <em>Having</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having</em>'.
   * @see com.emftriple.query.jpql.SelectStatement#getHaving()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Having();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectStatement#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order</em>'.
   * @see com.emftriple.query.jpql.SelectStatement#getOrder()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Order();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Having Clause</em>'.
   * @see com.emftriple.query.jpql.HavingClause
   * @generated
   */
  EClass getHavingClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.HavingClause#getHaving <em>Having</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having</em>'.
   * @see com.emftriple.query.jpql.HavingClause#getHaving()
   * @see #getHavingClause()
   * @generated
   */
  EReference getHavingClause_Having();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.OrderClause <em>Order Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order Clause</em>'.
   * @see com.emftriple.query.jpql.OrderClause
   * @generated
   */
  EClass getOrderClause();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.OrderClause#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering</em>'.
   * @see com.emftriple.query.jpql.OrderClause#getOrdering()
   * @see #getOrderClause()
   * @generated
   */
  EReference getOrderClause_Ordering();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.OrderClause#isIsAsc <em>Is Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Asc</em>'.
   * @see com.emftriple.query.jpql.OrderClause#isIsAsc()
   * @see #getOrderClause()
   * @generated
   */
  EAttribute getOrderClause_IsAsc();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.OrderClause#isIsDesc <em>Is Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Desc</em>'.
   * @see com.emftriple.query.jpql.OrderClause#isIsDesc()
   * @see #getOrderClause()
   * @generated
   */
  EAttribute getOrderClause_IsDesc();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.OrderItem <em>Order Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order Item</em>'.
   * @see com.emftriple.query.jpql.OrderItem
   * @generated
   */
  EClass getOrderItem();

  /**
   * Returns the meta object for the reference '{@link com.emftriple.query.jpql.OrderItem#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see com.emftriple.query.jpql.OrderItem#getVar()
   * @see #getOrderItem()
   * @generated
   */
  EReference getOrderItem_Var();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.OrderItem#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.emftriple.query.jpql.OrderItem#getFeature()
   * @see #getOrderItem()
   * @generated
   */
  EAttribute getOrderItem_Feature();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Statement</em>'.
   * @see com.emftriple.query.jpql.UpdateStatement
   * @generated
   */
  EClass getUpdateStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.UpdateStatement#getUpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Clause</em>'.
   * @see com.emftriple.query.jpql.UpdateStatement#getUpdateClause()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_UpdateClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.UpdateStatement#getSetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set Clause</em>'.
   * @see com.emftriple.query.jpql.UpdateStatement#getSetClause()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_SetClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.UpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Clause</em>'.
   * @see com.emftriple.query.jpql.UpdateClause
   * @generated
   */
  EClass getUpdateClause();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.UpdateClause#getFromEntries <em>From Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Entries</em>'.
   * @see com.emftriple.query.jpql.UpdateClause#getFromEntries()
   * @see #getUpdateClause()
   * @generated
   */
  EReference getUpdateClause_FromEntries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Clause</em>'.
   * @see com.emftriple.query.jpql.SetClause
   * @generated
   */
  EClass getSetClause();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.SetClause#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.emftriple.query.jpql.SetClause#getItems()
   * @see #getSetClause()
   * @generated
   */
  EReference getSetClause_Items();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.UpdateItem <em>Update Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Item</em>'.
   * @see com.emftriple.query.jpql.UpdateItem
   * @generated
   */
  EClass getUpdateItem();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.UpdateItem#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see com.emftriple.query.jpql.UpdateItem#getAlias()
   * @see #getUpdateItem()
   * @generated
   */
  EReference getUpdateItem_Alias();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.UpdateItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.emftriple.query.jpql.UpdateItem#getValue()
   * @see #getUpdateItem()
   * @generated
   */
  EReference getUpdateItem_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Statement</em>'.
   * @see com.emftriple.query.jpql.DeleteStatement
   * @generated
   */
  EClass getDeleteStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.DeleteStatement#getDeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete Clause</em>'.
   * @see com.emftriple.query.jpql.DeleteStatement#getDeleteClause()
   * @see #getDeleteStatement()
   * @generated
   */
  EReference getDeleteStatement_DeleteClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.DeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Clause</em>'.
   * @see com.emftriple.query.jpql.DeleteClause
   * @generated
   */
  EClass getDeleteClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.DeleteClause#getFromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Clause</em>'.
   * @see com.emftriple.query.jpql.DeleteClause#getFromClause()
   * @see #getDeleteClause()
   * @generated
   */
  EReference getDeleteClause_FromClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectFromClause <em>Select From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select From Clause</em>'.
   * @see com.emftriple.query.jpql.SelectFromClause
   * @generated
   */
  EClass getSelectFromClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectFromClause#getSelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Clause</em>'.
   * @see com.emftriple.query.jpql.SelectFromClause#getSelectClause()
   * @see #getSelectFromClause()
   * @generated
   */
  EReference getSelectFromClause_SelectClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectFromClause#getFromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Clause</em>'.
   * @see com.emftriple.query.jpql.SelectFromClause#getFromClause()
   * @see #getSelectFromClause()
   * @generated
   */
  EReference getSelectFromClause_FromClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Clause</em>'.
   * @see com.emftriple.query.jpql.SelectClause
   * @generated
   */
  EClass getSelectClause();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.SelectClause#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.jpql.SelectClause#isIsDistinct()
   * @see #getSelectClause()
   * @generated
   */
  EAttribute getSelectClause_IsDistinct();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.SelectClause#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.emftriple.query.jpql.SelectClause#getExpressions()
   * @see #getSelectClause()
   * @generated
   */
  EReference getSelectClause_Expressions();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Expression</em>'.
   * @see com.emftriple.query.jpql.SelectExpression
   * @generated
   */
  EClass getSelectExpression();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectAggregateExpression <em>Select Aggregate Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Aggregate Expression</em>'.
   * @see com.emftriple.query.jpql.SelectAggregateExpression
   * @generated
   */
  EClass getSelectAggregateExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.SelectAggregateExpression#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.jpql.SelectAggregateExpression#isIsDistinct()
   * @see #getSelectAggregateExpression()
   * @generated
   */
  EAttribute getSelectAggregateExpression_IsDistinct();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SelectAggregateExpression#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see com.emftriple.query.jpql.SelectAggregateExpression#getItem()
   * @see #getSelectAggregateExpression()
   * @generated
   */
  EReference getSelectAggregateExpression_Item();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avg Aggregate</em>'.
   * @see com.emftriple.query.jpql.AvgAggregate
   * @generated
   */
  EClass getAvgAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Aggregate</em>'.
   * @see com.emftriple.query.jpql.MaxAggregate
   * @generated
   */
  EClass getMaxAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.MinAggregate <em>Min Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Aggregate</em>'.
   * @see com.emftriple.query.jpql.MinAggregate
   * @generated
   */
  EClass getMinAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Aggregate</em>'.
   * @see com.emftriple.query.jpql.SumAggregate
   * @generated
   */
  EClass getSumAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Aggregate</em>'.
   * @see com.emftriple.query.jpql.CountAggregate
   * @generated
   */
  EClass getCountAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SelectConstructorExpression <em>Select Constructor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Constructor Expression</em>'.
   * @see com.emftriple.query.jpql.SelectConstructorExpression
   * @generated
   */
  EClass getSelectConstructorExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.SelectConstructorExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.jpql.SelectConstructorExpression#getName()
   * @see #getSelectConstructorExpression()
   * @generated
   */
  EAttribute getSelectConstructorExpression_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.SelectConstructorExpression#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.emftriple.query.jpql.SelectConstructorExpression#getItems()
   * @see #getSelectConstructorExpression()
   * @generated
   */
  EReference getSelectConstructorExpression_Items();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Clause</em>'.
   * @see com.emftriple.query.jpql.FromClause
   * @generated
   */
  EClass getFromClause();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.FromClause#getFromEntries <em>From Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Entries</em>'.
   * @see com.emftriple.query.jpql.FromClause#getFromEntries()
   * @see #getFromClause()
   * @generated
   */
  EReference getFromClause_FromEntries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.FromEntry <em>From Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Entry</em>'.
   * @see com.emftriple.query.jpql.FromEntry
   * @generated
   */
  EClass getFromEntry();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.FromEntry#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see com.emftriple.query.jpql.FromEntry#getVariable()
   * @see #getFromEntry()
   * @generated
   */
  EReference getFromEntry_Variable();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see com.emftriple.query.jpql.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.jpql.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.FromClass <em>From Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Class</em>'.
   * @see com.emftriple.query.jpql.FromClass
   * @generated
   */
  EClass getFromClass();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.FromClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.emftriple.query.jpql.FromClass#getType()
   * @see #getFromClass()
   * @generated
   */
  EAttribute getFromClass_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.FromClass#getJoins <em>Joins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Joins</em>'.
   * @see com.emftriple.query.jpql.FromClass#getJoins()
   * @see #getFromClass()
   * @generated
   */
  EReference getFromClass_Joins();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.FromCollection <em>From Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Collection</em>'.
   * @see com.emftriple.query.jpql.FromCollection
   * @generated
   */
  EClass getFromCollection();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.FromCollection#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see com.emftriple.query.jpql.FromCollection#getPath()
   * @see #getFromCollection()
   * @generated
   */
  EReference getFromCollection_Path();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.FromJoin <em>From Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Join</em>'.
   * @see com.emftriple.query.jpql.FromJoin
   * @generated
   */
  EClass getFromJoin();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.FromJoin#isIsFetch <em>Is Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Fetch</em>'.
   * @see com.emftriple.query.jpql.FromJoin#isIsFetch()
   * @see #getFromJoin()
   * @generated
   */
  EAttribute getFromJoin_IsFetch();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.FromJoin#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see com.emftriple.query.jpql.FromJoin#getPath()
   * @see #getFromJoin()
   * @generated
   */
  EReference getFromJoin_Path();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.FromJoin#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see com.emftriple.query.jpql.FromJoin#getVariable()
   * @see #getFromJoin()
   * @generated
   */
  EReference getFromJoin_Variable();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see com.emftriple.query.jpql.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.LeftJoin <em>Left Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Join</em>'.
   * @see com.emftriple.query.jpql.LeftJoin
   * @generated
   */
  EClass getLeftJoin();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.LeftJoin#isIsOuter <em>Is Outer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Outer</em>'.
   * @see com.emftriple.query.jpql.LeftJoin#isIsOuter()
   * @see #getLeftJoin()
   * @generated
   */
  EAttribute getLeftJoin_IsOuter();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.InnerJoin <em>Inner Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Join</em>'.
   * @see com.emftriple.query.jpql.InnerJoin
   * @generated
   */
  EClass getInnerJoin();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Clause</em>'.
   * @see com.emftriple.query.jpql.WhereClause
   * @generated
   */
  EClass getWhereClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.WhereClause#getWhereEntry <em>Where Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Entry</em>'.
   * @see com.emftriple.query.jpql.WhereClause#getWhereEntry()
   * @see #getWhereClause()
   * @generated
   */
  EReference getWhereClause_WhereEntry();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.emftriple.query.jpql.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.OperatorExpression <em>Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Expression</em>'.
   * @see com.emftriple.query.jpql.OperatorExpression
   * @generated
   */
  EClass getOperatorExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.OperatorExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.OperatorExpression#getLhs()
   * @see #getOperatorExpression()
   * @generated
   */
  EReference getOperatorExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.OperatorExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.emftriple.query.jpql.OperatorExpression#getOperator()
   * @see #getOperatorExpression()
   * @generated
   */
  EAttribute getOperatorExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.OperatorExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see com.emftriple.query.jpql.OperatorExpression#getRhs()
   * @see #getOperatorExpression()
   * @generated
   */
  EReference getOperatorExpression_Rhs();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.ExistsExpression <em>Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists Expression</em>'.
   * @see com.emftriple.query.jpql.ExistsExpression
   * @generated
   */
  EClass getExistsExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.ExistsExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.ExistsExpression#isIsNot()
   * @see #getExistsExpression()
   * @generated
   */
  EAttribute getExistsExpression_IsNot();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.ExistsExpression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.ExistsExpression#getQuery()
   * @see #getExistsExpression()
   * @generated
   */
  EReference getExistsExpression_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.AllExpression <em>All Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All Expression</em>'.
   * @see com.emftriple.query.jpql.AllExpression
   * @generated
   */
  EClass getAllExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.AllExpression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.AllExpression#getQuery()
   * @see #getAllExpression()
   * @generated
   */
  EReference getAllExpression_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.AnyExpression <em>Any Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Expression</em>'.
   * @see com.emftriple.query.jpql.AnyExpression
   * @generated
   */
  EClass getAnyExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.AnyExpression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.AnyExpression#getQuery()
   * @see #getAnyExpression()
   * @generated
   */
  EReference getAnyExpression_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.SomeExpression <em>Some Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Expression</em>'.
   * @see com.emftriple.query.jpql.SomeExpression
   * @generated
   */
  EClass getSomeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.SomeExpression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.SomeExpression#getQuery()
   * @see #getSomeExpression()
   * @generated
   */
  EReference getSomeExpression_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Expression</em>'.
   * @see com.emftriple.query.jpql.CollectionExpression
   * @generated
   */
  EClass getCollectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.CollectionExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.CollectionExpression#getLhs()
   * @see #getCollectionExpression()
   * @generated
   */
  EReference getCollectionExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.CollectionExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.CollectionExpression#isIsNot()
   * @see #getCollectionExpression()
   * @generated
   */
  EAttribute getCollectionExpression_IsNot();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.CollectionExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see com.emftriple.query.jpql.CollectionExpression#getRhs()
   * @see #getCollectionExpression()
   * @generated
   */
  EReference getCollectionExpression_Rhs();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.NullComparisonExpression <em>Null Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Comparison Expression</em>'.
   * @see com.emftriple.query.jpql.NullComparisonExpression
   * @generated
   */
  EClass getNullComparisonExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.NullComparisonExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.NullComparisonExpression#getLhs()
   * @see #getNullComparisonExpression()
   * @generated
   */
  EReference getNullComparisonExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.NullComparisonExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.NullComparisonExpression#isIsNot()
   * @see #getNullComparisonExpression()
   * @generated
   */
  EAttribute getNullComparisonExpression_IsNot();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.EmptyComparisonExpression <em>Empty Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Comparison Expression</em>'.
   * @see com.emftriple.query.jpql.EmptyComparisonExpression
   * @generated
   */
  EClass getEmptyComparisonExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.EmptyComparisonExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.EmptyComparisonExpression#getLhs()
   * @see #getEmptyComparisonExpression()
   * @generated
   */
  EReference getEmptyComparisonExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.EmptyComparisonExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.EmptyComparisonExpression#isIsNot()
   * @see #getEmptyComparisonExpression()
   * @generated
   */
  EAttribute getEmptyComparisonExpression_IsNot();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.LikeExpression <em>Like Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Like Expression</em>'.
   * @see com.emftriple.query.jpql.LikeExpression
   * @generated
   */
  EClass getLikeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.LikeExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.LikeExpression#getLhs()
   * @see #getLikeExpression()
   * @generated
   */
  EReference getLikeExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.LikeExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.LikeExpression#isIsNot()
   * @see #getLikeExpression()
   * @generated
   */
  EAttribute getLikeExpression_IsNot();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.LikeExpression#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see com.emftriple.query.jpql.LikeExpression#getPattern()
   * @see #getLikeExpression()
   * @generated
   */
  EAttribute getLikeExpression_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.InExpression <em>In Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Expression</em>'.
   * @see com.emftriple.query.jpql.InExpression
   * @generated
   */
  EClass getInExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.InExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.InExpression#getLhs()
   * @see #getInExpression()
   * @generated
   */
  EReference getInExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.InExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.InExpression#isIsNot()
   * @see #getInExpression()
   * @generated
   */
  EAttribute getInExpression_IsNot();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.InSeqExpression <em>In Seq Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Seq Expression</em>'.
   * @see com.emftriple.query.jpql.InSeqExpression
   * @generated
   */
  EClass getInSeqExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.InSeqExpression#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.emftriple.query.jpql.InSeqExpression#getItems()
   * @see #getInSeqExpression()
   * @generated
   */
  EReference getInSeqExpression_Items();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.InQueryExpression <em>In Query Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Query Expression</em>'.
   * @see com.emftriple.query.jpql.InQueryExpression
   * @generated
   */
  EClass getInQueryExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.InQueryExpression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.emftriple.query.jpql.InQueryExpression#getQuery()
   * @see #getInQueryExpression()
   * @generated
   */
  EReference getInQueryExpression_Query();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.BetweenExpression <em>Between Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Between Expression</em>'.
   * @see com.emftriple.query.jpql.BetweenExpression
   * @generated
   */
  EClass getBetweenExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.BetweenExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see com.emftriple.query.jpql.BetweenExpression#getLhs()
   * @see #getBetweenExpression()
   * @generated
   */
  EReference getBetweenExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.BetweenExpression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see com.emftriple.query.jpql.BetweenExpression#isIsNot()
   * @see #getBetweenExpression()
   * @generated
   */
  EAttribute getBetweenExpression_IsNot();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.BetweenExpression#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see com.emftriple.query.jpql.BetweenExpression#getMin()
   * @see #getBetweenExpression()
   * @generated
   */
  EReference getBetweenExpression_Min();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.jpql.BetweenExpression#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see com.emftriple.query.jpql.BetweenExpression#getMax()
   * @see #getBetweenExpression()
   * @generated
   */
  EReference getBetweenExpression_Max();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.emftriple.query.jpql.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.ExpressionTerm <em>Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Term</em>'.
   * @see com.emftriple.query.jpql.ExpressionTerm
   * @generated
   */
  EClass getExpressionTerm();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.AliasAttributeExpression <em>Alias Attribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias Attribute Expression</em>'.
   * @see com.emftriple.query.jpql.AliasAttributeExpression
   * @generated
   */
  EClass getAliasAttributeExpression();

  /**
   * Returns the meta object for the reference '{@link com.emftriple.query.jpql.AliasAttributeExpression#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.emftriple.query.jpql.AliasAttributeExpression#getAlias()
   * @see #getAliasAttributeExpression()
   * @generated
   */
  EReference getAliasAttributeExpression_Alias();

  /**
   * Returns the meta object for the attribute list '{@link com.emftriple.query.jpql.AliasAttributeExpression#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attributes</em>'.
   * @see com.emftriple.query.jpql.AliasAttributeExpression#getAttributes()
   * @see #getAliasAttributeExpression()
   * @generated
   */
  EAttribute getAliasAttributeExpression_Attributes();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Expression</em>'.
   * @see com.emftriple.query.jpql.ParameterExpression
   * @generated
   */
  EClass getParameterExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.ParameterExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.jpql.ParameterExpression#getName()
   * @see #getParameterExpression()
   * @generated
   */
  EAttribute getParameterExpression_Name();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.emftriple.query.jpql.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.jpql.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.Function#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.emftriple.query.jpql.Function#getParams()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Params();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.emftriple.query.jpql.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.IntegerExpression <em>Integer Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Expression</em>'.
   * @see com.emftriple.query.jpql.IntegerExpression
   * @generated
   */
  EClass getIntegerExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.IntegerExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.jpql.IntegerExpression#getValue()
   * @see #getIntegerExpression()
   * @generated
   */
  EAttribute getIntegerExpression_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expression</em>'.
   * @see com.emftriple.query.jpql.StringExpression
   * @generated
   */
  EClass getStringExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.StringExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.jpql.StringExpression#getValue()
   * @see #getStringExpression()
   * @generated
   */
  EAttribute getStringExpression_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.NullExpression <em>Null Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Expression</em>'.
   * @see com.emftriple.query.jpql.NullExpression
   * @generated
   */
  EClass getNullExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.NullExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.jpql.NullExpression#getValue()
   * @see #getNullExpression()
   * @generated
   */
  EAttribute getNullExpression_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see com.emftriple.query.jpql.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.BooleanExpression#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.jpql.BooleanExpression#isValue()
   * @see #getBooleanExpression()
   * @generated
   */
  EAttribute getBooleanExpression_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.DateTimeExpression <em>Date Time Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Time Expression</em>'.
   * @see com.emftriple.query.jpql.DateTimeExpression
   * @generated
   */
  EClass getDateTimeExpression();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.jpql.DateTimeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.jpql.DateTimeExpression#getValue()
   * @see #getDateTimeExpression()
   * @generated
   */
  EAttribute getDateTimeExpression_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see com.emftriple.query.jpql.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.OrExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.emftriple.query.jpql.OrExpression#getEntries()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Entries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.jpql.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see com.emftriple.query.jpql.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.jpql.AndExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.emftriple.query.jpql.AndExpression#getEntries()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Entries();

  /**
   * Returns the meta object for enum '{@link com.emftriple.query.jpql.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see com.emftriple.query.jpql.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JpqlFactory getJpqlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.QueryModuleImpl <em>Query Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.QueryModuleImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getQueryModule()
     * @generated
     */
    EClass QUERY_MODULE = eINSTANCE.getQueryModule();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_MODULE__IMPORTS = eINSTANCE.getQueryModule_Imports();

    /**
     * The meta object literal for the '<em><b>Default Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_MODULE__DEFAULT_QUERY = eINSTANCE.getQueryModule_DefaultQuery();

    /**
     * The meta object literal for the '<em><b>Named Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_MODULE__NAMED_QUERIES = eINSTANCE.getQueryModule_NamedQueries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ImportImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.NamedQueryImpl <em>Named Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.NamedQueryImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNamedQuery()
     * @generated
     */
    EClass NAMED_QUERY = eINSTANCE.getNamedQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_QUERY__NAME = eINSTANCE.getNamedQuery_Name();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_QUERY__QUERY = eINSTANCE.getNamedQuery_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.JPQLQueryImpl <em>JPQL Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.JPQLQueryImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getJPQLQuery()
     * @generated
     */
    EClass JPQL_QUERY = eINSTANCE.getJPQLQuery();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPQL_QUERY__WHERE_CLAUSE = eINSTANCE.getJPQLQuery_WhereClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectStatementImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '<em><b>Select From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__SELECT_FROM_CLAUSE = eINSTANCE.getSelectStatement_SelectFromClause();

    /**
     * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__HAVING = eINSTANCE.getSelectStatement_Having();

    /**
     * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__ORDER = eINSTANCE.getSelectStatement_Order();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.HavingClauseImpl <em>Having Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.HavingClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getHavingClause()
     * @generated
     */
    EClass HAVING_CLAUSE = eINSTANCE.getHavingClause();

    /**
     * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_CLAUSE__HAVING = eINSTANCE.getHavingClause_Having();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.OrderClauseImpl <em>Order Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.OrderClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrderClause()
     * @generated
     */
    EClass ORDER_CLAUSE = eINSTANCE.getOrderClause();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_CLAUSE__ORDERING = eINSTANCE.getOrderClause_Ordering();

    /**
     * The meta object literal for the '<em><b>Is Asc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_CLAUSE__IS_ASC = eINSTANCE.getOrderClause_IsAsc();

    /**
     * The meta object literal for the '<em><b>Is Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_CLAUSE__IS_DESC = eINSTANCE.getOrderClause_IsDesc();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.OrderItemImpl <em>Order Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.OrderItemImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrderItem()
     * @generated
     */
    EClass ORDER_ITEM = eINSTANCE.getOrderItem();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_ITEM__VAR = eINSTANCE.getOrderItem_Var();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_ITEM__FEATURE = eINSTANCE.getOrderItem_Feature();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.UpdateStatementImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateStatement()
     * @generated
     */
    EClass UPDATE_STATEMENT = eINSTANCE.getUpdateStatement();

    /**
     * The meta object literal for the '<em><b>Update Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__UPDATE_CLAUSE = eINSTANCE.getUpdateStatement_UpdateClause();

    /**
     * The meta object literal for the '<em><b>Set Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__SET_CLAUSE = eINSTANCE.getUpdateStatement_SetClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.UpdateClauseImpl <em>Update Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.UpdateClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateClause()
     * @generated
     */
    EClass UPDATE_CLAUSE = eINSTANCE.getUpdateClause();

    /**
     * The meta object literal for the '<em><b>From Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_CLAUSE__FROM_ENTRIES = eINSTANCE.getUpdateClause_FromEntries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SetClauseImpl <em>Set Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SetClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSetClause()
     * @generated
     */
    EClass SET_CLAUSE = eINSTANCE.getSetClause();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_CLAUSE__ITEMS = eINSTANCE.getSetClause_Items();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.UpdateItemImpl <em>Update Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.UpdateItemImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getUpdateItem()
     * @generated
     */
    EClass UPDATE_ITEM = eINSTANCE.getUpdateItem();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_ITEM__ALIAS = eINSTANCE.getUpdateItem_Alias();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_ITEM__VALUE = eINSTANCE.getUpdateItem_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.DeleteStatementImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDeleteStatement()
     * @generated
     */
    EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

    /**
     * The meta object literal for the '<em><b>Delete Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_STATEMENT__DELETE_CLAUSE = eINSTANCE.getDeleteStatement_DeleteClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.DeleteClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDeleteClause()
     * @generated
     */
    EClass DELETE_CLAUSE = eINSTANCE.getDeleteClause();

    /**
     * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_CLAUSE__FROM_CLAUSE = eINSTANCE.getDeleteClause_FromClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectFromClauseImpl <em>Select From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectFromClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectFromClause()
     * @generated
     */
    EClass SELECT_FROM_CLAUSE = eINSTANCE.getSelectFromClause();

    /**
     * The meta object literal for the '<em><b>Select Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM_CLAUSE__SELECT_CLAUSE = eINSTANCE.getSelectFromClause_SelectClause();

    /**
     * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM_CLAUSE__FROM_CLAUSE = eINSTANCE.getSelectFromClause_FromClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectClauseImpl <em>Select Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectClause()
     * @generated
     */
    EClass SELECT_CLAUSE = eINSTANCE.getSelectClause();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CLAUSE__IS_DISTINCT = eINSTANCE.getSelectClause_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CLAUSE__EXPRESSIONS = eINSTANCE.getSelectClause_Expressions();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectExpression()
     * @generated
     */
    EClass SELECT_EXPRESSION = eINSTANCE.getSelectExpression();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectAggregateExpressionImpl <em>Select Aggregate Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectAggregateExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectAggregateExpression()
     * @generated
     */
    EClass SELECT_AGGREGATE_EXPRESSION = eINSTANCE.getSelectAggregateExpression();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT = eINSTANCE.getSelectAggregateExpression_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_AGGREGATE_EXPRESSION__ITEM = eINSTANCE.getSelectAggregateExpression_Item();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.AvgAggregateImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAvgAggregate()
     * @generated
     */
    EClass AVG_AGGREGATE = eINSTANCE.getAvgAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.MaxAggregateImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getMaxAggregate()
     * @generated
     */
    EClass MAX_AGGREGATE = eINSTANCE.getMaxAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.MinAggregateImpl <em>Min Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.MinAggregateImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getMinAggregate()
     * @generated
     */
    EClass MIN_AGGREGATE = eINSTANCE.getMinAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SumAggregateImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSumAggregate()
     * @generated
     */
    EClass SUM_AGGREGATE = eINSTANCE.getSumAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.CountAggregateImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getCountAggregate()
     * @generated
     */
    EClass COUNT_AGGREGATE = eINSTANCE.getCountAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SelectConstructorExpressionImpl <em>Select Constructor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SelectConstructorExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSelectConstructorExpression()
     * @generated
     */
    EClass SELECT_CONSTRUCTOR_EXPRESSION = eINSTANCE.getSelectConstructorExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CONSTRUCTOR_EXPRESSION__NAME = eINSTANCE.getSelectConstructorExpression_Name();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CONSTRUCTOR_EXPRESSION__ITEMS = eINSTANCE.getSelectConstructorExpression_Items();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FromClauseImpl <em>From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FromClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromClause()
     * @generated
     */
    EClass FROM_CLAUSE = eINSTANCE.getFromClause();

    /**
     * The meta object literal for the '<em><b>From Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLAUSE__FROM_ENTRIES = eINSTANCE.getFromClause_FromEntries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FromEntryImpl <em>From Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FromEntryImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromEntry()
     * @generated
     */
    EClass FROM_ENTRY = eINSTANCE.getFromEntry();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_ENTRY__VARIABLE = eINSTANCE.getFromEntry_Variable();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.VariableDeclarationImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FromClassImpl <em>From Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FromClassImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromClass()
     * @generated
     */
    EClass FROM_CLASS = eINSTANCE.getFromClass();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_CLASS__TYPE = eINSTANCE.getFromClass_Type();

    /**
     * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLASS__JOINS = eINSTANCE.getFromClass_Joins();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FromCollectionImpl <em>From Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FromCollectionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromCollection()
     * @generated
     */
    EClass FROM_COLLECTION = eINSTANCE.getFromCollection();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_COLLECTION__PATH = eINSTANCE.getFromCollection_Path();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FromJoinImpl <em>From Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FromJoinImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFromJoin()
     * @generated
     */
    EClass FROM_JOIN = eINSTANCE.getFromJoin();

    /**
     * The meta object literal for the '<em><b>Is Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_JOIN__IS_FETCH = eINSTANCE.getFromJoin_IsFetch();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_JOIN__PATH = eINSTANCE.getFromJoin_Path();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_JOIN__VARIABLE = eINSTANCE.getFromJoin_Variable();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.JoinImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.LeftJoinImpl <em>Left Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.LeftJoinImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getLeftJoin()
     * @generated
     */
    EClass LEFT_JOIN = eINSTANCE.getLeftJoin();

    /**
     * The meta object literal for the '<em><b>Is Outer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEFT_JOIN__IS_OUTER = eINSTANCE.getLeftJoin_IsOuter();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.InnerJoinImpl <em>Inner Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.InnerJoinImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInnerJoin()
     * @generated
     */
    EClass INNER_JOIN = eINSTANCE.getInnerJoin();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.WhereClauseImpl <em>Where Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.WhereClauseImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getWhereClause()
     * @generated
     */
    EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

    /**
     * The meta object literal for the '<em><b>Where Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_CLAUSE__WHERE_ENTRY = eINSTANCE.getWhereClause_WhereEntry();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.OperatorExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOperatorExpression()
     * @generated
     */
    EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_EXPRESSION__LHS = eINSTANCE.getOperatorExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getOperatorExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_EXPRESSION__RHS = eINSTANCE.getOperatorExpression_Rhs();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ExistsExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExistsExpression()
     * @generated
     */
    EClass EXISTS_EXPRESSION = eINSTANCE.getExistsExpression();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTS_EXPRESSION__IS_NOT = eINSTANCE.getExistsExpression_IsNot();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTS_EXPRESSION__QUERY = eINSTANCE.getExistsExpression_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.AllExpressionImpl <em>All Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.AllExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAllExpression()
     * @generated
     */
    EClass ALL_EXPRESSION = eINSTANCE.getAllExpression();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALL_EXPRESSION__QUERY = eINSTANCE.getAllExpression_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.AnyExpressionImpl <em>Any Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.AnyExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAnyExpression()
     * @generated
     */
    EClass ANY_EXPRESSION = eINSTANCE.getAnyExpression();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANY_EXPRESSION__QUERY = eINSTANCE.getAnyExpression_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.SomeExpressionImpl <em>Some Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.SomeExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getSomeExpression()
     * @generated
     */
    EClass SOME_EXPRESSION = eINSTANCE.getSomeExpression();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_EXPRESSION__QUERY = eINSTANCE.getSomeExpression_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.CollectionExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getCollectionExpression()
     * @generated
     */
    EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_EXPRESSION__LHS = eINSTANCE.getCollectionExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_EXPRESSION__IS_NOT = eINSTANCE.getCollectionExpression_IsNot();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_EXPRESSION__RHS = eINSTANCE.getCollectionExpression_Rhs();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.NullComparisonExpressionImpl <em>Null Comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.NullComparisonExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNullComparisonExpression()
     * @generated
     */
    EClass NULL_COMPARISON_EXPRESSION = eINSTANCE.getNullComparisonExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NULL_COMPARISON_EXPRESSION__LHS = eINSTANCE.getNullComparisonExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_COMPARISON_EXPRESSION__IS_NOT = eINSTANCE.getNullComparisonExpression_IsNot();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.EmptyComparisonExpressionImpl <em>Empty Comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.EmptyComparisonExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getEmptyComparisonExpression()
     * @generated
     */
    EClass EMPTY_COMPARISON_EXPRESSION = eINSTANCE.getEmptyComparisonExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPTY_COMPARISON_EXPRESSION__LHS = eINSTANCE.getEmptyComparisonExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPTY_COMPARISON_EXPRESSION__IS_NOT = eINSTANCE.getEmptyComparisonExpression_IsNot();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.LikeExpressionImpl <em>Like Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.LikeExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getLikeExpression()
     * @generated
     */
    EClass LIKE_EXPRESSION = eINSTANCE.getLikeExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE_EXPRESSION__LHS = eINSTANCE.getLikeExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKE_EXPRESSION__IS_NOT = eINSTANCE.getLikeExpression_IsNot();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKE_EXPRESSION__PATTERN = eINSTANCE.getLikeExpression_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.InExpressionImpl <em>In Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.InExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInExpression()
     * @generated
     */
    EClass IN_EXPRESSION = eINSTANCE.getInExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_EXPRESSION__LHS = eINSTANCE.getInExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_EXPRESSION__IS_NOT = eINSTANCE.getInExpression_IsNot();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.InSeqExpressionImpl <em>In Seq Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.InSeqExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInSeqExpression()
     * @generated
     */
    EClass IN_SEQ_EXPRESSION = eINSTANCE.getInSeqExpression();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_SEQ_EXPRESSION__ITEMS = eINSTANCE.getInSeqExpression_Items();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.InQueryExpressionImpl <em>In Query Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.InQueryExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getInQueryExpression()
     * @generated
     */
    EClass IN_QUERY_EXPRESSION = eINSTANCE.getInQueryExpression();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_QUERY_EXPRESSION__QUERY = eINSTANCE.getInQueryExpression_Query();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.BetweenExpressionImpl <em>Between Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.BetweenExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getBetweenExpression()
     * @generated
     */
    EClass BETWEEN_EXPRESSION = eINSTANCE.getBetweenExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN_EXPRESSION__LHS = eINSTANCE.getBetweenExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BETWEEN_EXPRESSION__IS_NOT = eINSTANCE.getBetweenExpression_IsNot();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN_EXPRESSION__MIN = eINSTANCE.getBetweenExpression_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN_EXPRESSION__MAX = eINSTANCE.getBetweenExpression_Max();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.VariableImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ExpressionTermImpl <em>Expression Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ExpressionTermImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getExpressionTerm()
     * @generated
     */
    EClass EXPRESSION_TERM = eINSTANCE.getExpressionTerm();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.AliasAttributeExpressionImpl <em>Alias Attribute Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.AliasAttributeExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAliasAttributeExpression()
     * @generated
     */
    EClass ALIAS_ATTRIBUTE_EXPRESSION = eINSTANCE.getAliasAttributeExpression();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS_ATTRIBUTE_EXPRESSION__ALIAS = eINSTANCE.getAliasAttributeExpression_Alias();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES = eINSTANCE.getAliasAttributeExpression_Attributes();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ParameterExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getParameterExpression()
     * @generated
     */
    EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_EXPRESSION__NAME = eINSTANCE.getParameterExpression_Name();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.FunctionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.ValueImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.IntegerExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getIntegerExpression()
     * @generated
     */
    EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_EXPRESSION__VALUE = eINSTANCE.getIntegerExpression_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.StringExpressionImpl <em>String Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.StringExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getStringExpression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_EXPRESSION__VALUE = eINSTANCE.getStringExpression_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.NullExpressionImpl <em>Null Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.NullExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getNullExpression()
     * @generated
     */
    EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_EXPRESSION__VALUE = eINSTANCE.getNullExpression_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.BooleanExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.DateTimeExpressionImpl <em>Date Time Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.DateTimeExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getDateTimeExpression()
     * @generated
     */
    EClass DATE_TIME_EXPRESSION = eINSTANCE.getDateTimeExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME_EXPRESSION__VALUE = eINSTANCE.getDateTimeExpression_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.OrExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__ENTRIES = eINSTANCE.getOrExpression_Entries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.impl.AndExpressionImpl
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__ENTRIES = eINSTANCE.getAndExpression_Entries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.jpql.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.jpql.Operator
     * @see com.emftriple.query.jpql.impl.JpqlPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //JpqlPackage