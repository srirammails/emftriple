/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

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
 * @see com.emftriple.query.sparql.SparqlFactory
 * @model kind="package"
 * @generated
 */
public interface SparqlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sparql";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftriple.com/2009/Sparql";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sparql";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparqlPackage eINSTANCE = com.emftriple.query.sparql.impl.SparqlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SPARQLQueryImpl <em>SPARQL Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SPARQLQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSPARQLQuery()
   * @generated
   */
  int SPARQL_QUERY = 0;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY__PREFIXES = 0;

  /**
   * The number of structural features of the '<em>SPARQL Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.PrefixImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__NAME = 0;

  /**
   * The feature id for the '<em><b>Iref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__IREF = 1;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.BaseImpl <em>Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.BaseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBase()
   * @generated
   */
  int BASE = 2;

  /**
   * The feature id for the '<em><b>Iref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE__IREF = 0;

  /**
   * The number of structural features of the '<em>Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SelectionQueryImpl <em>Selection Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SelectionQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSelectionQuery()
   * @generated
   */
  int SELECTION_QUERY = 3;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__PREFIXES = SPARQL_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__BASE = SPARQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dataset Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__DATASET_CLAUSE = SPARQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__WHERE_CLAUSE = SPARQL_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__GROUP_CLAUSE = SPARQL_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__HAVING_CLAUSE = SPARQL_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY__LIMIT_CLAUSE = SPARQL_QUERY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Selection Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_QUERY_FEATURE_COUNT = SPARQL_QUERY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SelectQueryImpl <em>Select Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SelectQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSelectQuery()
   * @generated
   */
  int SELECT_QUERY = 4;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__PREFIXES = SELECTION_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__BASE = SELECTION_QUERY__BASE;

  /**
   * The feature id for the '<em><b>Dataset Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__DATASET_CLAUSE = SELECTION_QUERY__DATASET_CLAUSE;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__WHERE_CLAUSE = SELECTION_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__GROUP_CLAUSE = SELECTION_QUERY__GROUP_CLAUSE;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__HAVING_CLAUSE = SELECTION_QUERY__HAVING_CLAUSE;

  /**
   * The feature id for the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__LIMIT_CLAUSE = SELECTION_QUERY__LIMIT_CLAUSE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__IS_DISTINCT = SELECTION_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Reduced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__IS_REDUCED = SELECTION_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__ALL = SELECTION_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__VARIABLES = SELECTION_QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Select Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY_FEATURE_COUNT = SELECTION_QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.AskQueryImpl <em>Ask Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.AskQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAskQuery()
   * @generated
   */
  int ASK_QUERY = 5;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__PREFIXES = SELECTION_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__BASE = SELECTION_QUERY__BASE;

  /**
   * The feature id for the '<em><b>Dataset Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__DATASET_CLAUSE = SELECTION_QUERY__DATASET_CLAUSE;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__WHERE_CLAUSE = SELECTION_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__GROUP_CLAUSE = SELECTION_QUERY__GROUP_CLAUSE;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__HAVING_CLAUSE = SELECTION_QUERY__HAVING_CLAUSE;

  /**
   * The feature id for the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__LIMIT_CLAUSE = SELECTION_QUERY__LIMIT_CLAUSE;

  /**
   * The number of structural features of the '<em>Ask Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY_FEATURE_COUNT = SELECTION_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DescribeQueryImpl <em>Describe Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DescribeQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDescribeQuery()
   * @generated
   */
  int DESCRIBE_QUERY = 6;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__PREFIXES = SELECTION_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__BASE = SELECTION_QUERY__BASE;

  /**
   * The feature id for the '<em><b>Dataset Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__DATASET_CLAUSE = SELECTION_QUERY__DATASET_CLAUSE;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__WHERE_CLAUSE = SELECTION_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__GROUP_CLAUSE = SELECTION_QUERY__GROUP_CLAUSE;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__HAVING_CLAUSE = SELECTION_QUERY__HAVING_CLAUSE;

  /**
   * The feature id for the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__LIMIT_CLAUSE = SELECTION_QUERY__LIMIT_CLAUSE;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__VARIABLES = SELECTION_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Describe Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY_FEATURE_COUNT = SELECTION_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ConstructQueryImpl <em>Construct Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ConstructQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getConstructQuery()
   * @generated
   */
  int CONSTRUCT_QUERY = 7;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__PREFIXES = SELECTION_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__BASE = SELECTION_QUERY__BASE;

  /**
   * The feature id for the '<em><b>Dataset Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__DATASET_CLAUSE = SELECTION_QUERY__DATASET_CLAUSE;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__WHERE_CLAUSE = SELECTION_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__GROUP_CLAUSE = SELECTION_QUERY__GROUP_CLAUSE;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__HAVING_CLAUSE = SELECTION_QUERY__HAVING_CLAUSE;

  /**
   * The feature id for the '<em><b>Limit Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__LIMIT_CLAUSE = SELECTION_QUERY__LIMIT_CLAUSE;

  /**
   * The feature id for the '<em><b>Construct Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE = SELECTION_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Construct Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY_FEATURE_COUNT = SELECTION_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.UpdateQueryImpl <em>Update Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.UpdateQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUpdateQuery()
   * @generated
   */
  int UPDATE_QUERY = 8;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_QUERY__PREFIXES = SPARQL_QUERY__PREFIXES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_QUERY__OPERATIONS = SPARQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_QUERY_FEATURE_COUNT = SPARQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.UpdateOperationImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUpdateOperation()
   * @generated
   */
  int UPDATE_OPERATION = 9;

  /**
   * The number of structural features of the '<em>Update Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ModifyQueryImpl <em>Modify Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ModifyQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getModifyQuery()
   * @generated
   */
  int MODIFY_QUERY = 10;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_QUERY__WITH_GRAPH = UPDATE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_QUERY__PATTERN = UPDATE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Modify Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_QUERY_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.CreateGraphQueryImpl <em>Create Graph Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.CreateGraphQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getCreateGraphQuery()
   * @generated
   */
  int CREATE_GRAPH_QUERY = 11;

  /**
   * The feature id for the '<em><b>Is Silent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_GRAPH_QUERY__IS_SILENT = UPDATE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_GRAPH_QUERY__GRAPH = UPDATE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Graph Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_GRAPH_QUERY_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DropGraphQueryImpl <em>Drop Graph Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DropGraphQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDropGraphQuery()
   * @generated
   */
  int DROP_GRAPH_QUERY = 12;

  /**
   * The feature id for the '<em><b>Is Silent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_GRAPH_QUERY__IS_SILENT = UPDATE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_GRAPH_QUERY__GRAPH = UPDATE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop Graph Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_GRAPH_QUERY_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.LoadGraphQueryImpl <em>Load Graph Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.LoadGraphQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLoadGraphQuery()
   * @generated
   */
  int LOAD_GRAPH_QUERY = 13;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GRAPH_QUERY__GRAPH = UPDATE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Into Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GRAPH_QUERY__INTO_GRAPH = UPDATE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Load Graph Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GRAPH_QUERY_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ClearGraphQueryImpl <em>Clear Graph Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ClearGraphQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getClearGraphQuery()
   * @generated
   */
  int CLEAR_GRAPH_QUERY = 14;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_GRAPH_QUERY__URI = UPDATE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_GRAPH_QUERY__IS_DEFAULT = UPDATE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Clear Graph Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_GRAPH_QUERY_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.UsingGraphImpl <em>Using Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.UsingGraphImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUsingGraph()
   * @generated
   */
  int USING_GRAPH = 15;

  /**
   * The feature id for the '<em><b>Named</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_GRAPH__NAMED = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_GRAPH__URI = 1;

  /**
   * The number of structural features of the '<em>Using Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_GRAPH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.InsertQueryImpl <em>Insert Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.InsertQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getInsertQuery()
   * @generated
   */
  int INSERT_QUERY = 16;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_QUERY__WITH_GRAPH = MODIFY_QUERY__WITH_GRAPH;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_QUERY__PATTERN = MODIFY_QUERY__PATTERN;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_QUERY__GRAPH = MODIFY_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_QUERY__WHERE_CLAUSE = MODIFY_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Insert Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_QUERY_FEATURE_COUNT = MODIFY_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.InsertDataQueryImpl <em>Insert Data Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.InsertDataQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getInsertDataQuery()
   * @generated
   */
  int INSERT_DATA_QUERY = 17;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_DATA_QUERY__WITH_GRAPH = MODIFY_QUERY__WITH_GRAPH;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_DATA_QUERY__PATTERN = MODIFY_QUERY__PATTERN;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_DATA_QUERY__GRAPH = MODIFY_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Insert Data Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_DATA_QUERY_FEATURE_COUNT = MODIFY_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DeleteQueryImpl <em>Delete Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DeleteQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteQuery()
   * @generated
   */
  int DELETE_QUERY = 18;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY__WITH_GRAPH = MODIFY_QUERY__WITH_GRAPH;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY__PATTERN = MODIFY_QUERY__PATTERN;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY__GRAPH = MODIFY_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Insert Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY__INSERT_PATTERN = MODIFY_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY__WHERE_CLAUSE = MODIFY_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Delete Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_QUERY_FEATURE_COUNT = MODIFY_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DeleteDataQueryImpl <em>Delete Data Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DeleteDataQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteDataQuery()
   * @generated
   */
  int DELETE_DATA_QUERY = 19;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_DATA_QUERY__WITH_GRAPH = MODIFY_QUERY__WITH_GRAPH;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_DATA_QUERY__PATTERN = MODIFY_QUERY__PATTERN;

  /**
   * The feature id for the '<em><b>Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_DATA_QUERY__GRAPH = MODIFY_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete Data Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_DATA_QUERY_FEATURE_COUNT = MODIFY_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DeleteWhereQueryImpl <em>Delete Where Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DeleteWhereQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteWhereQuery()
   * @generated
   */
  int DELETE_WHERE_QUERY = 20;

  /**
   * The feature id for the '<em><b>With Graph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_WHERE_QUERY__WITH_GRAPH = MODIFY_QUERY__WITH_GRAPH;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_WHERE_QUERY__PATTERN = MODIFY_QUERY__PATTERN;

  /**
   * The number of structural features of the '<em>Delete Where Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_WHERE_QUERY_FEATURE_COUNT = MODIFY_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DatasetClauseImpl <em>Dataset Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DatasetClauseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDatasetClause()
   * @generated
   */
  int DATASET_CLAUSE = 21;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_CLAUSE__DATA_SET = 0;

  /**
   * The number of structural features of the '<em>Dataset Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.DefaultDataSetImpl <em>Default Data Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.DefaultDataSetImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDefaultDataSet()
   * @generated
   */
  int DEFAULT_DATA_SET = 22;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DATA_SET__DATA_SET = DATASET_CLAUSE__DATA_SET;

  /**
   * The number of structural features of the '<em>Default Data Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DATA_SET_FEATURE_COUNT = DATASET_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.NamedDataSetImpl <em>Named Data Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.NamedDataSetImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedDataSet()
   * @generated
   */
  int NAMED_DATA_SET = 23;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_DATA_SET__DATA_SET = DATASET_CLAUSE__DATA_SET;

  /**
   * The number of structural features of the '<em>Named Data Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_DATA_SET_FEATURE_COUNT = DATASET_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ServiceDataSetImpl <em>Service Data Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ServiceDataSetImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getServiceDataSet()
   * @generated
   */
  int SERVICE_DATA_SET = 24;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DATA_SET__DATA_SET = DATASET_CLAUSE__DATA_SET;

  /**
   * The number of structural features of the '<em>Service Data Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DATA_SET_FEATURE_COUNT = DATASET_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.WhereClauseImpl <em>Where Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.WhereClauseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getWhereClause()
   * @generated
   */
  int WHERE_CLAUSE = 25;

  /**
   * The feature id for the '<em><b>Group Graph Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE__GROUP_GRAPH_PATTERN = 0;

  /**
   * The number of structural features of the '<em>Where Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupClauseImpl <em>Group Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupClauseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupClause()
   * @generated
   */
  int GROUP_CLAUSE = 26;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_CLAUSE__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Group Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupConditionImpl <em>Group Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupConditionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupCondition()
   * @generated
   */
  int GROUP_CONDITION = 27;

  /**
   * The number of structural features of the '<em>Group Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.HavingClauseImpl <em>Having Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.HavingClauseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getHavingClause()
   * @generated
   */
  int HAVING_CLAUSE = 28;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE__CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Having Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ConstraintImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 29;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.LimitClauseImpl <em>Limit Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.LimitClauseImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLimitClause()
   * @generated
   */
  int LIMIT_CLAUSE = 30;

  /**
   * The feature id for the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_CLAUSE__LIMIT = 0;

  /**
   * The number of structural features of the '<em>Limit Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupGraphPatternImpl <em>Group Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupGraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupGraphPattern()
   * @generated
   */
  int GROUP_GRAPH_PATTERN = 31;

  /**
   * The number of structural features of the '<em>Group Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_GRAPH_PATTERN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl <em>Sub Select Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SubSelectQueryImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSubSelectQuery()
   * @generated
   */
  int SUB_SELECT_QUERY = 32;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECT_QUERY__VARIABLES = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECT_QUERY__WHERE_CLAUSE = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECT_QUERY__GROUP_CLAUSE = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECT_QUERY__HAVING_CLAUSE = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Sub Select Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECT_QUERY_FEATURE_COUNT = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupGraphPatternSubImpl <em>Group Graph Pattern Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupGraphPatternSubImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupGraphPatternSub()
   * @generated
   */
  int GROUP_GRAPH_PATTERN_SUB = 33;

  /**
   * The feature id for the '<em><b>Graph Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_GRAPH_PATTERN_SUB__GRAPH_PATTERNS = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group Graph Pattern Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_GRAPH_PATTERN_SUB_FEATURE_COUNT = GROUP_GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GraphPatternImpl <em>Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphPattern()
   * @generated
   */
  int GRAPH_PATTERN = 34;

  /**
   * The number of structural features of the '<em>Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_PATTERN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.TriplesSameSubjectImpl <em>Triples Same Subject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.TriplesSameSubjectImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getTriplesSameSubject()
   * @generated
   */
  int TRIPLES_SAME_SUBJECT = 35;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLES_SAME_SUBJECT__SUBJECT = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLES_SAME_SUBJECT__PROPERTY_LIST = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Triples Same Subject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLES_SAME_SUBJECT_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupOrUnionGraphPatternImpl <em>Group Or Union Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupOrUnionGraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupOrUnionGraphPattern()
   * @generated
   */
  int GROUP_OR_UNION_GRAPH_PATTERN = 36;

  /**
   * The feature id for the '<em><b>Graph Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group Or Union Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_OR_UNION_GRAPH_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.OptionalGraphPatternImpl <em>Optional Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.OptionalGraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOptionalGraphPattern()
   * @generated
   */
  int OPTIONAL_GRAPH_PATTERN = 37;

  /**
   * The feature id for the '<em><b>Graph Pattern</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_GRAPH_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.PropertyListImpl <em>Property List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.PropertyListImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getPropertyList()
   * @generated
   */
  int PROPERTY_LIST = 38;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_LIST__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_LIST__OBJECT = 1;

  /**
   * The number of structural features of the '<em>Property List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GraphGraphPatternImpl <em>Graph Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GraphGraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphGraphPattern()
   * @generated
   */
  int GRAPH_GRAPH_PATTERN = 39;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_GRAPH_PATTERN__VAR = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_GRAPH_PATTERN__PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Graph Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_GRAPH_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ServiceGraphPatternImpl <em>Service Graph Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ServiceGraphPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getServiceGraphPattern()
   * @generated
   */
  int SERVICE_GRAPH_PATTERN = 40;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_GRAPH_PATTERN__VAR = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_GRAPH_PATTERN__PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Service Graph Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_GRAPH_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.FilterPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFilterPattern()
   * @generated
   */
  int FILTER_PATTERN = 41;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PATTERN__EXPRESSION = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ExistsPatternImpl <em>Exists Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ExistsPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExistsPattern()
   * @generated
   */
  int EXISTS_PATTERN = 42;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_PATTERN__PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exists Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.NotExistsPatternImpl <em>Not Exists Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.NotExistsPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNotExistsPattern()
   * @generated
   */
  int NOT_EXISTS_PATTERN = 43;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXISTS_PATTERN__PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Exists Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXISTS_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.MinusPatternImpl <em>Minus Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.MinusPatternImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMinusPattern()
   * @generated
   */
  int MINUS_PATTERN = 44;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_PATTERN__PATTERN = GRAPH_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Minus Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_PATTERN_FEATURE_COUNT = GRAPH_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ExpressionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 45;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ExpressionFilterExpressionImpl <em>Expression Filter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ExpressionFilterExpressionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExpressionFilterExpression()
   * @generated
   */
  int EXPRESSION_FILTER_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FILTER_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FILTER_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FILTER_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Filter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FILTER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.FilterNodeImpl <em>Filter Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.FilterNodeImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFilterNode()
   * @generated
   */
  int FILTER_NODE = 47;

  /**
   * The number of structural features of the '<em>Filter Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_NODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.FunctionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = GROUP_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = GROUP_CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = GROUP_CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.NamedFunctionImpl <em>Named Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.NamedFunctionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedFunction()
   * @generated
   */
  int NAMED_FUNCTION = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION__NAME = FUNCTION__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION__PREFIX = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SparqlFunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SparqlFunctionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSparqlFunction()
   * @generated
   */
  int SPARQL_FUNCTION = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_FUNCTION__NAME = FUNCTION__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.BuiltInCallImpl <em>Built In Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.BuiltInCallImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBuiltInCall()
   * @generated
   */
  int BUILT_IN_CALL = 51;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__EXPR = GROUP_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__LEFT = GROUP_CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__RIGHT = GROUP_CONDITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__VAR = GROUP_CONDITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>If Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__IF_EXPR = GROUP_CONDITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__THEN_EXPR = GROUP_CONDITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL__ELSE_EXPR = GROUP_CONDITION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Built In Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL_FEATURE_COUNT = GROUP_CONDITION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.AggregateImpl <em>Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.AggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAggregate()
   * @generated
   */
  int AGGREGATE = 52;

  /**
   * The number of structural features of the '<em>Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ExprAggArgImpl <em>Expr Agg Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ExprAggArgImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExprAggArg()
   * @generated
   */
  int EXPR_AGG_ARG = 53;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AGG_ARG__IS_DISTINCT = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AGG_ARG__EXPR = 1;

  /**
   * The number of structural features of the '<em>Expr Agg Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AGG_ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GraphNodeImpl <em>Graph Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GraphNodeImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphNode()
   * @generated
   */
  int GRAPH_NODE = 54;

  /**
   * The number of structural features of the '<em>Graph Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_NODE_FEATURE_COUNT = FILTER_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.VariableImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = GROUP_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = GROUP_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.UnNamedVariableImpl <em>Un Named Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.UnNamedVariableImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUnNamedVariable()
   * @generated
   */
  int UN_NAMED_VARIABLE = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMED_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Un Named Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMED_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.NamedVariableImpl <em>Named Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.NamedVariableImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedVariable()
   * @generated
   */
  int NAMED_VARIABLE = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VARIABLE__PREFIX = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.BlankNodeImpl <em>Blank Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.BlankNodeImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBlankNode()
   * @generated
   */
  int BLANK_NODE = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_NODE__NAME = GRAPH_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Blank Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_NODE_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ParameterImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = GRAPH_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.ValueImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getValue()
   * @generated
   */
  int VALUE = 60;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__TAG = GRAPH_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.IRIImpl <em>IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.IRIImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getIRI()
   * @generated
   */
  int IRI = 61;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRI__VALUE = GRAPH_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IRI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRI_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.StringValueImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 62;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__TAG = VALUE__TAG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.IntegerValueImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 63;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__TAG = VALUE__TAG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.RDFTagImpl <em>RDF Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.RDFTagImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getRDFTag()
   * @generated
   */
  int RDF_TAG = 64;

  /**
   * The number of structural features of the '<em>RDF Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDF_TAG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.TypeTagImpl <em>Type Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.TypeTagImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getTypeTag()
   * @generated
   */
  int TYPE_TAG = 65;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TAG__TYPE = RDF_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TAG_FEATURE_COUNT = RDF_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.LangTagImpl <em>Lang Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.LangTagImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLangTag()
   * @generated
   */
  int LANG_TAG = 66;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_TAG__LANG = RDF_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lang Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_TAG_FEATURE_COUNT = RDF_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.OrFilterExpressionImpl <em>Or Filter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.OrFilterExpressionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOrFilterExpression()
   * @generated
   */
  int OR_FILTER_EXPRESSION = 67;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FILTER_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Filter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FILTER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.AndFilterExpressionImpl <em>And Filter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.AndFilterExpressionImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAndFilterExpression()
   * @generated
   */
  int AND_FILTER_EXPRESSION = 68;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FILTER_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Filter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FILTER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.CountAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getCountAggregate()
   * @generated
   */
  int COUNT_AGGREGATE = 69;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__IS_DISTINCT = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__IS_ALL = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Count Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SumAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSumAggregate()
   * @generated
   */
  int SUM_AGGREGATE = 70;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sum Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.MinAgregateImpl <em>Min Agregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.MinAgregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMinAgregate()
   * @generated
   */
  int MIN_AGREGATE = 71;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Min Agregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.MaxAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMaxAggregate()
   * @generated
   */
  int MAX_AGGREGATE = 72;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Max Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.AvgAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAvgAggregate()
   * @generated
   */
  int AVG_AGGREGATE = 73;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Avg Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.SampleAggregateImpl <em>Sample Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.SampleAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSampleAggregate()
   * @generated
   */
  int SAMPLE_AGGREGATE = 74;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLE_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sample Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLE_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.impl.GroupAggregateImpl <em>Group Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.impl.GroupAggregateImpl
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupAggregate()
   * @generated
   */
  int GROUP_AGGREGATE = 75;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_AGGREGATE__IS_DISTINCT = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_AGGREGATE__EXPR = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_AGGREGATE__VALUE = AGGREGATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Group Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.emftriple.query.sparql.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.emftriple.query.sparql.Operator
   * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 76;


  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SPARQLQuery <em>SPARQL Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SPARQL Query</em>'.
   * @see com.emftriple.query.sparql.SPARQLQuery
   * @generated
   */
  EClass getSPARQLQuery();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.SPARQLQuery#getPrefixes <em>Prefixes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefixes</em>'.
   * @see com.emftriple.query.sparql.SPARQLQuery#getPrefixes()
   * @see #getSPARQLQuery()
   * @generated
   */
  EReference getSPARQLQuery_Prefixes();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see com.emftriple.query.sparql.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.Prefix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.sparql.Prefix#getName()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Name();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.Prefix#getIref <em>Iref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iref</em>'.
   * @see com.emftriple.query.sparql.Prefix#getIref()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Iref();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Base <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base</em>'.
   * @see com.emftriple.query.sparql.Base
   * @generated
   */
  EClass getBase();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.Base#getIref <em>Iref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iref</em>'.
   * @see com.emftriple.query.sparql.Base#getIref()
   * @see #getBase()
   * @generated
   */
  EReference getBase_Iref();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SelectionQuery <em>Selection Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Query</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery
   * @generated
   */
  EClass getSelectionQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SelectionQuery#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getBase()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_Base();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.SelectionQuery#getDatasetClause <em>Dataset Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dataset Clause</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getDatasetClause()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_DatasetClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SelectionQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getWhereClause()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_WhereClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SelectionQuery#getGroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group Clause</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getGroupClause()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_GroupClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SelectionQuery#getHavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having Clause</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getHavingClause()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_HavingClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SelectionQuery#getLimitClause <em>Limit Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit Clause</em>'.
   * @see com.emftriple.query.sparql.SelectionQuery#getLimitClause()
   * @see #getSelectionQuery()
   * @generated
   */
  EReference getSelectionQuery_LimitClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SelectQuery <em>Select Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Query</em>'.
   * @see com.emftriple.query.sparql.SelectQuery
   * @generated
   */
  EClass getSelectQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.SelectQuery#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.sparql.SelectQuery#isIsDistinct()
   * @see #getSelectQuery()
   * @generated
   */
  EAttribute getSelectQuery_IsDistinct();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.SelectQuery#isIsReduced <em>Is Reduced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reduced</em>'.
   * @see com.emftriple.query.sparql.SelectQuery#isIsReduced()
   * @see #getSelectQuery()
   * @generated
   */
  EAttribute getSelectQuery_IsReduced();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.SelectQuery#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.emftriple.query.sparql.SelectQuery#isAll()
   * @see #getSelectQuery()
   * @generated
   */
  EAttribute getSelectQuery_All();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.SelectQuery#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.emftriple.query.sparql.SelectQuery#getVariables()
   * @see #getSelectQuery()
   * @generated
   */
  EReference getSelectQuery_Variables();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.AskQuery <em>Ask Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ask Query</em>'.
   * @see com.emftriple.query.sparql.AskQuery
   * @generated
   */
  EClass getAskQuery();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DescribeQuery <em>Describe Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Describe Query</em>'.
   * @see com.emftriple.query.sparql.DescribeQuery
   * @generated
   */
  EClass getDescribeQuery();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.DescribeQuery#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.emftriple.query.sparql.DescribeQuery#getVariables()
   * @see #getDescribeQuery()
   * @generated
   */
  EReference getDescribeQuery_Variables();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ConstructQuery <em>Construct Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Construct Query</em>'.
   * @see com.emftriple.query.sparql.ConstructQuery
   * @generated
   */
  EClass getConstructQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ConstructQuery#getConstructTemplate <em>Construct Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Construct Template</em>'.
   * @see com.emftriple.query.sparql.ConstructQuery#getConstructTemplate()
   * @see #getConstructQuery()
   * @generated
   */
  EReference getConstructQuery_ConstructTemplate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.UpdateQuery <em>Update Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Query</em>'.
   * @see com.emftriple.query.sparql.UpdateQuery
   * @generated
   */
  EClass getUpdateQuery();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.UpdateQuery#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.emftriple.query.sparql.UpdateQuery#getOperations()
   * @see #getUpdateQuery()
   * @generated
   */
  EReference getUpdateQuery_Operations();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.UpdateOperation <em>Update Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Operation</em>'.
   * @see com.emftriple.query.sparql.UpdateOperation
   * @generated
   */
  EClass getUpdateOperation();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ModifyQuery <em>Modify Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modify Query</em>'.
   * @see com.emftriple.query.sparql.ModifyQuery
   * @generated
   */
  EClass getModifyQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.ModifyQuery#getWithGraph <em>With Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>With Graph</em>'.
   * @see com.emftriple.query.sparql.ModifyQuery#getWithGraph()
   * @see #getModifyQuery()
   * @generated
   */
  EAttribute getModifyQuery_WithGraph();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ModifyQuery#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.ModifyQuery#getPattern()
   * @see #getModifyQuery()
   * @generated
   */
  EReference getModifyQuery_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.CreateGraphQuery <em>Create Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Graph Query</em>'.
   * @see com.emftriple.query.sparql.CreateGraphQuery
   * @generated
   */
  EClass getCreateGraphQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.CreateGraphQuery#getIsSilent <em>Is Silent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Silent</em>'.
   * @see com.emftriple.query.sparql.CreateGraphQuery#getIsSilent()
   * @see #getCreateGraphQuery()
   * @generated
   */
  EAttribute getCreateGraphQuery_IsSilent();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.CreateGraphQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.CreateGraphQuery#getGraph()
   * @see #getCreateGraphQuery()
   * @generated
   */
  EAttribute getCreateGraphQuery_Graph();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DropGraphQuery <em>Drop Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Graph Query</em>'.
   * @see com.emftriple.query.sparql.DropGraphQuery
   * @generated
   */
  EClass getDropGraphQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.DropGraphQuery#getIsSilent <em>Is Silent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Silent</em>'.
   * @see com.emftriple.query.sparql.DropGraphQuery#getIsSilent()
   * @see #getDropGraphQuery()
   * @generated
   */
  EAttribute getDropGraphQuery_IsSilent();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.DropGraphQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.DropGraphQuery#getGraph()
   * @see #getDropGraphQuery()
   * @generated
   */
  EAttribute getDropGraphQuery_Graph();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.LoadGraphQuery <em>Load Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Graph Query</em>'.
   * @see com.emftriple.query.sparql.LoadGraphQuery
   * @generated
   */
  EClass getLoadGraphQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.LoadGraphQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.LoadGraphQuery#getGraph()
   * @see #getLoadGraphQuery()
   * @generated
   */
  EAttribute getLoadGraphQuery_Graph();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.LoadGraphQuery#getIntoGraph <em>Into Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Into Graph</em>'.
   * @see com.emftriple.query.sparql.LoadGraphQuery#getIntoGraph()
   * @see #getLoadGraphQuery()
   * @generated
   */
  EAttribute getLoadGraphQuery_IntoGraph();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ClearGraphQuery <em>Clear Graph Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear Graph Query</em>'.
   * @see com.emftriple.query.sparql.ClearGraphQuery
   * @generated
   */
  EClass getClearGraphQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.ClearGraphQuery#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see com.emftriple.query.sparql.ClearGraphQuery#getUri()
   * @see #getClearGraphQuery()
   * @generated
   */
  EAttribute getClearGraphQuery_Uri();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.ClearGraphQuery#isIsDefault <em>Is Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Default</em>'.
   * @see com.emftriple.query.sparql.ClearGraphQuery#isIsDefault()
   * @see #getClearGraphQuery()
   * @generated
   */
  EAttribute getClearGraphQuery_IsDefault();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.UsingGraph <em>Using Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Graph</em>'.
   * @see com.emftriple.query.sparql.UsingGraph
   * @generated
   */
  EClass getUsingGraph();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.UsingGraph#isNamed <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Named</em>'.
   * @see com.emftriple.query.sparql.UsingGraph#isNamed()
   * @see #getUsingGraph()
   * @generated
   */
  EAttribute getUsingGraph_Named();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.UsingGraph#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see com.emftriple.query.sparql.UsingGraph#getUri()
   * @see #getUsingGraph()
   * @generated
   */
  EAttribute getUsingGraph_Uri();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.InsertQuery <em>Insert Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Query</em>'.
   * @see com.emftriple.query.sparql.InsertQuery
   * @generated
   */
  EClass getInsertQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.InsertQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.InsertQuery#getGraph()
   * @see #getInsertQuery()
   * @generated
   */
  EAttribute getInsertQuery_Graph();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.InsertQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see com.emftriple.query.sparql.InsertQuery#getWhereClause()
   * @see #getInsertQuery()
   * @generated
   */
  EReference getInsertQuery_WhereClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.InsertDataQuery <em>Insert Data Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Data Query</em>'.
   * @see com.emftriple.query.sparql.InsertDataQuery
   * @generated
   */
  EClass getInsertDataQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.InsertDataQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.InsertDataQuery#getGraph()
   * @see #getInsertDataQuery()
   * @generated
   */
  EAttribute getInsertDataQuery_Graph();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DeleteQuery <em>Delete Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Query</em>'.
   * @see com.emftriple.query.sparql.DeleteQuery
   * @generated
   */
  EClass getDeleteQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.DeleteQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.DeleteQuery#getGraph()
   * @see #getDeleteQuery()
   * @generated
   */
  EAttribute getDeleteQuery_Graph();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.DeleteQuery#getInsertPattern <em>Insert Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insert Pattern</em>'.
   * @see com.emftriple.query.sparql.DeleteQuery#getInsertPattern()
   * @see #getDeleteQuery()
   * @generated
   */
  EReference getDeleteQuery_InsertPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.DeleteQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see com.emftriple.query.sparql.DeleteQuery#getWhereClause()
   * @see #getDeleteQuery()
   * @generated
   */
  EReference getDeleteQuery_WhereClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DeleteDataQuery <em>Delete Data Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Data Query</em>'.
   * @see com.emftriple.query.sparql.DeleteDataQuery
   * @generated
   */
  EClass getDeleteDataQuery();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.DeleteDataQuery#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graph</em>'.
   * @see com.emftriple.query.sparql.DeleteDataQuery#getGraph()
   * @see #getDeleteDataQuery()
   * @generated
   */
  EAttribute getDeleteDataQuery_Graph();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DeleteWhereQuery <em>Delete Where Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Where Query</em>'.
   * @see com.emftriple.query.sparql.DeleteWhereQuery
   * @generated
   */
  EClass getDeleteWhereQuery();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DatasetClause <em>Dataset Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dataset Clause</em>'.
   * @see com.emftriple.query.sparql.DatasetClause
   * @generated
   */
  EClass getDatasetClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.DatasetClause#getDataSet <em>Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Set</em>'.
   * @see com.emftriple.query.sparql.DatasetClause#getDataSet()
   * @see #getDatasetClause()
   * @generated
   */
  EReference getDatasetClause_DataSet();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.DefaultDataSet <em>Default Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Data Set</em>'.
   * @see com.emftriple.query.sparql.DefaultDataSet
   * @generated
   */
  EClass getDefaultDataSet();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.NamedDataSet <em>Named Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Data Set</em>'.
   * @see com.emftriple.query.sparql.NamedDataSet
   * @generated
   */
  EClass getNamedDataSet();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ServiceDataSet <em>Service Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Data Set</em>'.
   * @see com.emftriple.query.sparql.ServiceDataSet
   * @generated
   */
  EClass getServiceDataSet();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Clause</em>'.
   * @see com.emftriple.query.sparql.WhereClause
   * @generated
   */
  EClass getWhereClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.WhereClause#getGroupGraphPattern <em>Group Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.WhereClause#getGroupGraphPattern()
   * @see #getWhereClause()
   * @generated
   */
  EReference getWhereClause_GroupGraphPattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Clause</em>'.
   * @see com.emftriple.query.sparql.GroupClause
   * @generated
   */
  EClass getGroupClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.GroupClause#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.emftriple.query.sparql.GroupClause#getCondition()
   * @see #getGroupClause()
   * @generated
   */
  EReference getGroupClause_Condition();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupCondition <em>Group Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Condition</em>'.
   * @see com.emftriple.query.sparql.GroupCondition
   * @generated
   */
  EClass getGroupCondition();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Having Clause</em>'.
   * @see com.emftriple.query.sparql.HavingClause
   * @generated
   */
  EClass getHavingClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.HavingClause#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.emftriple.query.sparql.HavingClause#getConstraint()
   * @see #getHavingClause()
   * @generated
   */
  EReference getHavingClause_Constraint();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see com.emftriple.query.sparql.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.LimitClause <em>Limit Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit Clause</em>'.
   * @see com.emftriple.query.sparql.LimitClause
   * @generated
   */
  EClass getLimitClause();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.LimitClause#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see com.emftriple.query.sparql.LimitClause#getLimit()
   * @see #getLimitClause()
   * @generated
   */
  EAttribute getLimitClause_Limit();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupGraphPattern <em>Group Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.GroupGraphPattern
   * @generated
   */
  EClass getGroupGraphPattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SubSelectQuery <em>Sub Select Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Select Query</em>'.
   * @see com.emftriple.query.sparql.SubSelectQuery
   * @generated
   */
  EClass getSubSelectQuery();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.SubSelectQuery#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.emftriple.query.sparql.SubSelectQuery#getVariables()
   * @see #getSubSelectQuery()
   * @generated
   */
  EReference getSubSelectQuery_Variables();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SubSelectQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see com.emftriple.query.sparql.SubSelectQuery#getWhereClause()
   * @see #getSubSelectQuery()
   * @generated
   */
  EReference getSubSelectQuery_WhereClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SubSelectQuery#getGroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group Clause</em>'.
   * @see com.emftriple.query.sparql.SubSelectQuery#getGroupClause()
   * @see #getSubSelectQuery()
   * @generated
   */
  EReference getSubSelectQuery_GroupClause();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SubSelectQuery#getHavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having Clause</em>'.
   * @see com.emftriple.query.sparql.SubSelectQuery#getHavingClause()
   * @see #getSubSelectQuery()
   * @generated
   */
  EReference getSubSelectQuery_HavingClause();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupGraphPatternSub <em>Group Graph Pattern Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Graph Pattern Sub</em>'.
   * @see com.emftriple.query.sparql.GroupGraphPatternSub
   * @generated
   */
  EClass getGroupGraphPatternSub();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.GroupGraphPatternSub#getGraphPatterns <em>Graph Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graph Patterns</em>'.
   * @see com.emftriple.query.sparql.GroupGraphPatternSub#getGraphPatterns()
   * @see #getGroupGraphPatternSub()
   * @generated
   */
  EReference getGroupGraphPatternSub_GraphPatterns();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GraphPattern <em>Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.GraphPattern
   * @generated
   */
  EClass getGraphPattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.TriplesSameSubject <em>Triples Same Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triples Same Subject</em>'.
   * @see com.emftriple.query.sparql.TriplesSameSubject
   * @generated
   */
  EClass getTriplesSameSubject();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.TriplesSameSubject#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see com.emftriple.query.sparql.TriplesSameSubject#getSubject()
   * @see #getTriplesSameSubject()
   * @generated
   */
  EReference getTriplesSameSubject_Subject();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.TriplesSameSubject#getPropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property List</em>'.
   * @see com.emftriple.query.sparql.TriplesSameSubject#getPropertyList()
   * @see #getTriplesSameSubject()
   * @generated
   */
  EReference getTriplesSameSubject_PropertyList();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupOrUnionGraphPattern <em>Group Or Union Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Or Union Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.GroupOrUnionGraphPattern
   * @generated
   */
  EClass getGroupOrUnionGraphPattern();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.GroupOrUnionGraphPattern#getGraphPatterns <em>Graph Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graph Patterns</em>'.
   * @see com.emftriple.query.sparql.GroupOrUnionGraphPattern#getGraphPatterns()
   * @see #getGroupOrUnionGraphPattern()
   * @generated
   */
  EReference getGroupOrUnionGraphPattern_GraphPatterns();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.OptionalGraphPattern <em>Optional Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.OptionalGraphPattern
   * @generated
   */
  EClass getOptionalGraphPattern();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.OptionalGraphPattern#getGraphPattern <em>Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.OptionalGraphPattern#getGraphPattern()
   * @see #getOptionalGraphPattern()
   * @generated
   */
  EReference getOptionalGraphPattern_GraphPattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.PropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property List</em>'.
   * @see com.emftriple.query.sparql.PropertyList
   * @generated
   */
  EClass getPropertyList();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.PropertyList#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see com.emftriple.query.sparql.PropertyList#getProperty()
   * @see #getPropertyList()
   * @generated
   */
  EReference getPropertyList_Property();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.PropertyList#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see com.emftriple.query.sparql.PropertyList#getObject()
   * @see #getPropertyList()
   * @generated
   */
  EReference getPropertyList_Object();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GraphGraphPattern <em>Graph Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.GraphGraphPattern
   * @generated
   */
  EClass getGraphGraphPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.GraphGraphPattern#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.emftriple.query.sparql.GraphGraphPattern#getVar()
   * @see #getGraphGraphPattern()
   * @generated
   */
  EReference getGraphGraphPattern_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.GraphGraphPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.GraphGraphPattern#getPattern()
   * @see #getGraphGraphPattern()
   * @generated
   */
  EReference getGraphGraphPattern_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ServiceGraphPattern <em>Service Graph Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Graph Pattern</em>'.
   * @see com.emftriple.query.sparql.ServiceGraphPattern
   * @generated
   */
  EClass getServiceGraphPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ServiceGraphPattern#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.emftriple.query.sparql.ServiceGraphPattern#getVar()
   * @see #getServiceGraphPattern()
   * @generated
   */
  EReference getServiceGraphPattern_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ServiceGraphPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.ServiceGraphPattern#getPattern()
   * @see #getServiceGraphPattern()
   * @generated
   */
  EReference getServiceGraphPattern_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.FilterPattern <em>Filter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Pattern</em>'.
   * @see com.emftriple.query.sparql.FilterPattern
   * @generated
   */
  EClass getFilterPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.FilterPattern#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.emftriple.query.sparql.FilterPattern#getExpression()
   * @see #getFilterPattern()
   * @generated
   */
  EReference getFilterPattern_Expression();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ExistsPattern <em>Exists Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists Pattern</em>'.
   * @see com.emftriple.query.sparql.ExistsPattern
   * @generated
   */
  EClass getExistsPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ExistsPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.ExistsPattern#getPattern()
   * @see #getExistsPattern()
   * @generated
   */
  EReference getExistsPattern_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.NotExistsPattern <em>Not Exists Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Exists Pattern</em>'.
   * @see com.emftriple.query.sparql.NotExistsPattern
   * @generated
   */
  EClass getNotExistsPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.NotExistsPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.NotExistsPattern#getPattern()
   * @see #getNotExistsPattern()
   * @generated
   */
  EReference getNotExistsPattern_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.MinusPattern <em>Minus Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Pattern</em>'.
   * @see com.emftriple.query.sparql.MinusPattern
   * @generated
   */
  EClass getMinusPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.MinusPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.emftriple.query.sparql.MinusPattern#getPattern()
   * @see #getMinusPattern()
   * @generated
   */
  EReference getMinusPattern_Pattern();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.emftriple.query.sparql.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ExpressionFilterExpression <em>Expression Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Filter Expression</em>'.
   * @see com.emftriple.query.sparql.ExpressionFilterExpression
   * @generated
   */
  EClass getExpressionFilterExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.emftriple.query.sparql.ExpressionFilterExpression#getLeft()
   * @see #getExpressionFilterExpression()
   * @generated
   */
  EReference getExpressionFilterExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.emftriple.query.sparql.ExpressionFilterExpression#getOperator()
   * @see #getExpressionFilterExpression()
   * @generated
   */
  EAttribute getExpressionFilterExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ExpressionFilterExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.emftriple.query.sparql.ExpressionFilterExpression#getRight()
   * @see #getExpressionFilterExpression()
   * @generated
   */
  EReference getExpressionFilterExpression_Right();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.FilterNode <em>Filter Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Node</em>'.
   * @see com.emftriple.query.sparql.FilterNode
   * @generated
   */
  EClass getFilterNode();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.emftriple.query.sparql.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.sparql.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.emftriple.query.sparql.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.NamedFunction <em>Named Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Function</em>'.
   * @see com.emftriple.query.sparql.NamedFunction
   * @generated
   */
  EClass getNamedFunction();

  /**
   * Returns the meta object for the reference '{@link com.emftriple.query.sparql.NamedFunction#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see com.emftriple.query.sparql.NamedFunction#getPrefix()
   * @see #getNamedFunction()
   * @generated
   */
  EReference getNamedFunction_Prefix();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SparqlFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.emftriple.query.sparql.SparqlFunction
   * @generated
   */
  EClass getSparqlFunction();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.BuiltInCall <em>Built In Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Call</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall
   * @generated
   */
  EClass getBuiltInCall();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getExpr()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_Expr();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getLeft()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getRight()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_Right();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getVar()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getIfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Expr</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getIfExpr()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_IfExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expr</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getThenExpr()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_ThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.BuiltInCall#getElseExpr <em>Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expr</em>'.
   * @see com.emftriple.query.sparql.BuiltInCall#getElseExpr()
   * @see #getBuiltInCall()
   * @generated
   */
  EReference getBuiltInCall_ElseExpr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate</em>'.
   * @see com.emftriple.query.sparql.Aggregate
   * @generated
   */
  EClass getAggregate();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.ExprAggArg <em>Expr Agg Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Agg Arg</em>'.
   * @see com.emftriple.query.sparql.ExprAggArg
   * @generated
   */
  EClass getExprAggArg();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.ExprAggArg#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.sparql.ExprAggArg#isIsDistinct()
   * @see #getExprAggArg()
   * @generated
   */
  EAttribute getExprAggArg_IsDistinct();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.ExprAggArg#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.ExprAggArg#getExpr()
   * @see #getExprAggArg()
   * @generated
   */
  EReference getExprAggArg_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GraphNode <em>Graph Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph Node</em>'.
   * @see com.emftriple.query.sparql.GraphNode
   * @generated
   */
  EClass getGraphNode();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.emftriple.query.sparql.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.sparql.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.UnNamedVariable <em>Un Named Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Named Variable</em>'.
   * @see com.emftriple.query.sparql.UnNamedVariable
   * @generated
   */
  EClass getUnNamedVariable();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.NamedVariable <em>Named Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Variable</em>'.
   * @see com.emftriple.query.sparql.NamedVariable
   * @generated
   */
  EClass getNamedVariable();

  /**
   * Returns the meta object for the reference '{@link com.emftriple.query.sparql.NamedVariable#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see com.emftriple.query.sparql.NamedVariable#getPrefix()
   * @see #getNamedVariable()
   * @generated
   */
  EReference getNamedVariable_Prefix();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.BlankNode <em>Blank Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blank Node</em>'.
   * @see com.emftriple.query.sparql.BlankNode
   * @generated
   */
  EClass getBlankNode();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.BlankNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.sparql.BlankNode#getName()
   * @see #getBlankNode()
   * @generated
   */
  EAttribute getBlankNode_Name();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.emftriple.query.sparql.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.emftriple.query.sparql.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.emftriple.query.sparql.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.Value#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see com.emftriple.query.sparql.Value#getTag()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Tag();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IRI</em>'.
   * @see com.emftriple.query.sparql.IRI
   * @generated
   */
  EClass getIRI();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.IRI#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.sparql.IRI#getValue()
   * @see #getIRI()
   * @generated
   */
  EAttribute getIRI_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see com.emftriple.query.sparql.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.sparql.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see com.emftriple.query.sparql.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.sparql.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.RDFTag <em>RDF Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RDF Tag</em>'.
   * @see com.emftriple.query.sparql.RDFTag
   * @generated
   */
  EClass getRDFTag();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.TypeTag <em>Type Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Tag</em>'.
   * @see com.emftriple.query.sparql.TypeTag
   * @generated
   */
  EClass getTypeTag();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.TypeTag#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.emftriple.query.sparql.TypeTag#getType()
   * @see #getTypeTag()
   * @generated
   */
  EReference getTypeTag_Type();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.LangTag <em>Lang Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lang Tag</em>'.
   * @see com.emftriple.query.sparql.LangTag
   * @generated
   */
  EClass getLangTag();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.LangTag#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see com.emftriple.query.sparql.LangTag#getLang()
   * @see #getLangTag()
   * @generated
   */
  EAttribute getLangTag_Lang();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.OrFilterExpression <em>Or Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Filter Expression</em>'.
   * @see com.emftriple.query.sparql.OrFilterExpression
   * @generated
   */
  EClass getOrFilterExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.OrFilterExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.emftriple.query.sparql.OrFilterExpression#getEntries()
   * @see #getOrFilterExpression()
   * @generated
   */
  EReference getOrFilterExpression_Entries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.AndFilterExpression <em>And Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Filter Expression</em>'.
   * @see com.emftriple.query.sparql.AndFilterExpression
   * @generated
   */
  EClass getAndFilterExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.AndFilterExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.emftriple.query.sparql.AndFilterExpression#getEntries()
   * @see #getAndFilterExpression()
   * @generated
   */
  EReference getAndFilterExpression_Entries();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Aggregate</em>'.
   * @see com.emftriple.query.sparql.CountAggregate
   * @generated
   */
  EClass getCountAggregate();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.CountAggregate#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.sparql.CountAggregate#isIsDistinct()
   * @see #getCountAggregate()
   * @generated
   */
  EAttribute getCountAggregate_IsDistinct();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.CountAggregate#isIsAll <em>Is All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is All</em>'.
   * @see com.emftriple.query.sparql.CountAggregate#isIsAll()
   * @see #getCountAggregate()
   * @generated
   */
  EAttribute getCountAggregate_IsAll();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.CountAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.CountAggregate#getExpr()
   * @see #getCountAggregate()
   * @generated
   */
  EReference getCountAggregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Aggregate</em>'.
   * @see com.emftriple.query.sparql.SumAggregate
   * @generated
   */
  EClass getSumAggregate();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SumAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.SumAggregate#getExpr()
   * @see #getSumAggregate()
   * @generated
   */
  EReference getSumAggregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.MinAgregate <em>Min Agregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Agregate</em>'.
   * @see com.emftriple.query.sparql.MinAgregate
   * @generated
   */
  EClass getMinAgregate();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.MinAgregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.MinAgregate#getExpr()
   * @see #getMinAgregate()
   * @generated
   */
  EReference getMinAgregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Aggregate</em>'.
   * @see com.emftriple.query.sparql.MaxAggregate
   * @generated
   */
  EClass getMaxAggregate();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.MaxAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.MaxAggregate#getExpr()
   * @see #getMaxAggregate()
   * @generated
   */
  EReference getMaxAggregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avg Aggregate</em>'.
   * @see com.emftriple.query.sparql.AvgAggregate
   * @generated
   */
  EClass getAvgAggregate();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.AvgAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.AvgAggregate#getExpr()
   * @see #getAvgAggregate()
   * @generated
   */
  EReference getAvgAggregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.SampleAggregate <em>Sample Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sample Aggregate</em>'.
   * @see com.emftriple.query.sparql.SampleAggregate
   * @generated
   */
  EClass getSampleAggregate();

  /**
   * Returns the meta object for the containment reference '{@link com.emftriple.query.sparql.SampleAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.SampleAggregate#getExpr()
   * @see #getSampleAggregate()
   * @generated
   */
  EReference getSampleAggregate_Expr();

  /**
   * Returns the meta object for class '{@link com.emftriple.query.sparql.GroupAggregate <em>Group Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Aggregate</em>'.
   * @see com.emftriple.query.sparql.GroupAggregate
   * @generated
   */
  EClass getGroupAggregate();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.GroupAggregate#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see com.emftriple.query.sparql.GroupAggregate#isIsDistinct()
   * @see #getGroupAggregate()
   * @generated
   */
  EAttribute getGroupAggregate_IsDistinct();

  /**
   * Returns the meta object for the containment reference list '{@link com.emftriple.query.sparql.GroupAggregate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see com.emftriple.query.sparql.GroupAggregate#getExpr()
   * @see #getGroupAggregate()
   * @generated
   */
  EReference getGroupAggregate_Expr();

  /**
   * Returns the meta object for the attribute '{@link com.emftriple.query.sparql.GroupAggregate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.emftriple.query.sparql.GroupAggregate#getValue()
   * @see #getGroupAggregate()
   * @generated
   */
  EAttribute getGroupAggregate_Value();

  /**
   * Returns the meta object for enum '{@link com.emftriple.query.sparql.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see com.emftriple.query.sparql.Operator
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
  SparqlFactory getSparqlFactory();

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
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SPARQLQueryImpl <em>SPARQL Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SPARQLQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSPARQLQuery()
     * @generated
     */
    EClass SPARQL_QUERY = eINSTANCE.getSPARQLQuery();

    /**
     * The meta object literal for the '<em><b>Prefixes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPARQL_QUERY__PREFIXES = eINSTANCE.getSPARQLQuery_Prefixes();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.PrefixImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__NAME = eINSTANCE.getPrefix_Name();

    /**
     * The meta object literal for the '<em><b>Iref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__IREF = eINSTANCE.getPrefix_Iref();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.BaseImpl <em>Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.BaseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBase()
     * @generated
     */
    EClass BASE = eINSTANCE.getBase();

    /**
     * The meta object literal for the '<em><b>Iref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE__IREF = eINSTANCE.getBase_Iref();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SelectionQueryImpl <em>Selection Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SelectionQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSelectionQuery()
     * @generated
     */
    EClass SELECTION_QUERY = eINSTANCE.getSelectionQuery();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__BASE = eINSTANCE.getSelectionQuery_Base();

    /**
     * The meta object literal for the '<em><b>Dataset Clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__DATASET_CLAUSE = eINSTANCE.getSelectionQuery_DatasetClause();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__WHERE_CLAUSE = eINSTANCE.getSelectionQuery_WhereClause();

    /**
     * The meta object literal for the '<em><b>Group Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__GROUP_CLAUSE = eINSTANCE.getSelectionQuery_GroupClause();

    /**
     * The meta object literal for the '<em><b>Having Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__HAVING_CLAUSE = eINSTANCE.getSelectionQuery_HavingClause();

    /**
     * The meta object literal for the '<em><b>Limit Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_QUERY__LIMIT_CLAUSE = eINSTANCE.getSelectionQuery_LimitClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SelectQueryImpl <em>Select Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SelectQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSelectQuery()
     * @generated
     */
    EClass SELECT_QUERY = eINSTANCE.getSelectQuery();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_QUERY__IS_DISTINCT = eINSTANCE.getSelectQuery_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Is Reduced</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_QUERY__IS_REDUCED = eINSTANCE.getSelectQuery_IsReduced();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_QUERY__ALL = eINSTANCE.getSelectQuery_All();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_QUERY__VARIABLES = eINSTANCE.getSelectQuery_Variables();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.AskQueryImpl <em>Ask Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.AskQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAskQuery()
     * @generated
     */
    EClass ASK_QUERY = eINSTANCE.getAskQuery();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DescribeQueryImpl <em>Describe Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DescribeQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDescribeQuery()
     * @generated
     */
    EClass DESCRIBE_QUERY = eINSTANCE.getDescribeQuery();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIBE_QUERY__VARIABLES = eINSTANCE.getDescribeQuery_Variables();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ConstructQueryImpl <em>Construct Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ConstructQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getConstructQuery()
     * @generated
     */
    EClass CONSTRUCT_QUERY = eINSTANCE.getConstructQuery();

    /**
     * The meta object literal for the '<em><b>Construct Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE = eINSTANCE.getConstructQuery_ConstructTemplate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.UpdateQueryImpl <em>Update Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.UpdateQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUpdateQuery()
     * @generated
     */
    EClass UPDATE_QUERY = eINSTANCE.getUpdateQuery();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_QUERY__OPERATIONS = eINSTANCE.getUpdateQuery_Operations();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.UpdateOperationImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUpdateOperation()
     * @generated
     */
    EClass UPDATE_OPERATION = eINSTANCE.getUpdateOperation();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ModifyQueryImpl <em>Modify Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ModifyQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getModifyQuery()
     * @generated
     */
    EClass MODIFY_QUERY = eINSTANCE.getModifyQuery();

    /**
     * The meta object literal for the '<em><b>With Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFY_QUERY__WITH_GRAPH = eINSTANCE.getModifyQuery_WithGraph();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_QUERY__PATTERN = eINSTANCE.getModifyQuery_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.CreateGraphQueryImpl <em>Create Graph Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.CreateGraphQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getCreateGraphQuery()
     * @generated
     */
    EClass CREATE_GRAPH_QUERY = eINSTANCE.getCreateGraphQuery();

    /**
     * The meta object literal for the '<em><b>Is Silent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_GRAPH_QUERY__IS_SILENT = eINSTANCE.getCreateGraphQuery_IsSilent();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_GRAPH_QUERY__GRAPH = eINSTANCE.getCreateGraphQuery_Graph();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DropGraphQueryImpl <em>Drop Graph Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DropGraphQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDropGraphQuery()
     * @generated
     */
    EClass DROP_GRAPH_QUERY = eINSTANCE.getDropGraphQuery();

    /**
     * The meta object literal for the '<em><b>Is Silent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_GRAPH_QUERY__IS_SILENT = eINSTANCE.getDropGraphQuery_IsSilent();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_GRAPH_QUERY__GRAPH = eINSTANCE.getDropGraphQuery_Graph();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.LoadGraphQueryImpl <em>Load Graph Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.LoadGraphQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLoadGraphQuery()
     * @generated
     */
    EClass LOAD_GRAPH_QUERY = eINSTANCE.getLoadGraphQuery();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GRAPH_QUERY__GRAPH = eINSTANCE.getLoadGraphQuery_Graph();

    /**
     * The meta object literal for the '<em><b>Into Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GRAPH_QUERY__INTO_GRAPH = eINSTANCE.getLoadGraphQuery_IntoGraph();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ClearGraphQueryImpl <em>Clear Graph Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ClearGraphQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getClearGraphQuery()
     * @generated
     */
    EClass CLEAR_GRAPH_QUERY = eINSTANCE.getClearGraphQuery();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLEAR_GRAPH_QUERY__URI = eINSTANCE.getClearGraphQuery_Uri();

    /**
     * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLEAR_GRAPH_QUERY__IS_DEFAULT = eINSTANCE.getClearGraphQuery_IsDefault();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.UsingGraphImpl <em>Using Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.UsingGraphImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUsingGraph()
     * @generated
     */
    EClass USING_GRAPH = eINSTANCE.getUsingGraph();

    /**
     * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING_GRAPH__NAMED = eINSTANCE.getUsingGraph_Named();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING_GRAPH__URI = eINSTANCE.getUsingGraph_Uri();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.InsertQueryImpl <em>Insert Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.InsertQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getInsertQuery()
     * @generated
     */
    EClass INSERT_QUERY = eINSTANCE.getInsertQuery();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSERT_QUERY__GRAPH = eINSTANCE.getInsertQuery_Graph();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_QUERY__WHERE_CLAUSE = eINSTANCE.getInsertQuery_WhereClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.InsertDataQueryImpl <em>Insert Data Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.InsertDataQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getInsertDataQuery()
     * @generated
     */
    EClass INSERT_DATA_QUERY = eINSTANCE.getInsertDataQuery();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSERT_DATA_QUERY__GRAPH = eINSTANCE.getInsertDataQuery_Graph();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DeleteQueryImpl <em>Delete Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DeleteQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteQuery()
     * @generated
     */
    EClass DELETE_QUERY = eINSTANCE.getDeleteQuery();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_QUERY__GRAPH = eINSTANCE.getDeleteQuery_Graph();

    /**
     * The meta object literal for the '<em><b>Insert Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_QUERY__INSERT_PATTERN = eINSTANCE.getDeleteQuery_InsertPattern();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_QUERY__WHERE_CLAUSE = eINSTANCE.getDeleteQuery_WhereClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DeleteDataQueryImpl <em>Delete Data Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DeleteDataQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteDataQuery()
     * @generated
     */
    EClass DELETE_DATA_QUERY = eINSTANCE.getDeleteDataQuery();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_DATA_QUERY__GRAPH = eINSTANCE.getDeleteDataQuery_Graph();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DeleteWhereQueryImpl <em>Delete Where Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DeleteWhereQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDeleteWhereQuery()
     * @generated
     */
    EClass DELETE_WHERE_QUERY = eINSTANCE.getDeleteWhereQuery();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DatasetClauseImpl <em>Dataset Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DatasetClauseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDatasetClause()
     * @generated
     */
    EClass DATASET_CLAUSE = eINSTANCE.getDatasetClause();

    /**
     * The meta object literal for the '<em><b>Data Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET_CLAUSE__DATA_SET = eINSTANCE.getDatasetClause_DataSet();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.DefaultDataSetImpl <em>Default Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.DefaultDataSetImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getDefaultDataSet()
     * @generated
     */
    EClass DEFAULT_DATA_SET = eINSTANCE.getDefaultDataSet();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.NamedDataSetImpl <em>Named Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.NamedDataSetImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedDataSet()
     * @generated
     */
    EClass NAMED_DATA_SET = eINSTANCE.getNamedDataSet();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ServiceDataSetImpl <em>Service Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ServiceDataSetImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getServiceDataSet()
     * @generated
     */
    EClass SERVICE_DATA_SET = eINSTANCE.getServiceDataSet();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.WhereClauseImpl <em>Where Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.WhereClauseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getWhereClause()
     * @generated
     */
    EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

    /**
     * The meta object literal for the '<em><b>Group Graph Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_CLAUSE__GROUP_GRAPH_PATTERN = eINSTANCE.getWhereClause_GroupGraphPattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupClauseImpl <em>Group Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupClauseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupClause()
     * @generated
     */
    EClass GROUP_CLAUSE = eINSTANCE.getGroupClause();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_CLAUSE__CONDITION = eINSTANCE.getGroupClause_Condition();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupConditionImpl <em>Group Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupConditionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupCondition()
     * @generated
     */
    EClass GROUP_CONDITION = eINSTANCE.getGroupCondition();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.HavingClauseImpl <em>Having Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.HavingClauseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getHavingClause()
     * @generated
     */
    EClass HAVING_CLAUSE = eINSTANCE.getHavingClause();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_CLAUSE__CONSTRAINT = eINSTANCE.getHavingClause_Constraint();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ConstraintImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.LimitClauseImpl <em>Limit Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.LimitClauseImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLimitClause()
     * @generated
     */
    EClass LIMIT_CLAUSE = eINSTANCE.getLimitClause();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT_CLAUSE__LIMIT = eINSTANCE.getLimitClause_Limit();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupGraphPatternImpl <em>Group Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupGraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupGraphPattern()
     * @generated
     */
    EClass GROUP_GRAPH_PATTERN = eINSTANCE.getGroupGraphPattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SubSelectQueryImpl <em>Sub Select Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SubSelectQueryImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSubSelectQuery()
     * @generated
     */
    EClass SUB_SELECT_QUERY = eINSTANCE.getSubSelectQuery();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SELECT_QUERY__VARIABLES = eINSTANCE.getSubSelectQuery_Variables();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SELECT_QUERY__WHERE_CLAUSE = eINSTANCE.getSubSelectQuery_WhereClause();

    /**
     * The meta object literal for the '<em><b>Group Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SELECT_QUERY__GROUP_CLAUSE = eINSTANCE.getSubSelectQuery_GroupClause();

    /**
     * The meta object literal for the '<em><b>Having Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SELECT_QUERY__HAVING_CLAUSE = eINSTANCE.getSubSelectQuery_HavingClause();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupGraphPatternSubImpl <em>Group Graph Pattern Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupGraphPatternSubImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupGraphPatternSub()
     * @generated
     */
    EClass GROUP_GRAPH_PATTERN_SUB = eINSTANCE.getGroupGraphPatternSub();

    /**
     * The meta object literal for the '<em><b>Graph Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_GRAPH_PATTERN_SUB__GRAPH_PATTERNS = eINSTANCE.getGroupGraphPatternSub_GraphPatterns();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GraphPatternImpl <em>Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphPattern()
     * @generated
     */
    EClass GRAPH_PATTERN = eINSTANCE.getGraphPattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.TriplesSameSubjectImpl <em>Triples Same Subject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.TriplesSameSubjectImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getTriplesSameSubject()
     * @generated
     */
    EClass TRIPLES_SAME_SUBJECT = eINSTANCE.getTriplesSameSubject();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIPLES_SAME_SUBJECT__SUBJECT = eINSTANCE.getTriplesSameSubject_Subject();

    /**
     * The meta object literal for the '<em><b>Property List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIPLES_SAME_SUBJECT__PROPERTY_LIST = eINSTANCE.getTriplesSameSubject_PropertyList();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupOrUnionGraphPatternImpl <em>Group Or Union Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupOrUnionGraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupOrUnionGraphPattern()
     * @generated
     */
    EClass GROUP_OR_UNION_GRAPH_PATTERN = eINSTANCE.getGroupOrUnionGraphPattern();

    /**
     * The meta object literal for the '<em><b>Graph Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_OR_UNION_GRAPH_PATTERN__GRAPH_PATTERNS = eINSTANCE.getGroupOrUnionGraphPattern_GraphPatterns();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.OptionalGraphPatternImpl <em>Optional Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.OptionalGraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOptionalGraphPattern()
     * @generated
     */
    EClass OPTIONAL_GRAPH_PATTERN = eINSTANCE.getOptionalGraphPattern();

    /**
     * The meta object literal for the '<em><b>Graph Pattern</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_GRAPH_PATTERN__GRAPH_PATTERN = eINSTANCE.getOptionalGraphPattern_GraphPattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.PropertyListImpl <em>Property List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.PropertyListImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getPropertyList()
     * @generated
     */
    EClass PROPERTY_LIST = eINSTANCE.getPropertyList();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_LIST__PROPERTY = eINSTANCE.getPropertyList_Property();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_LIST__OBJECT = eINSTANCE.getPropertyList_Object();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GraphGraphPatternImpl <em>Graph Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GraphGraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphGraphPattern()
     * @generated
     */
    EClass GRAPH_GRAPH_PATTERN = eINSTANCE.getGraphGraphPattern();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_GRAPH_PATTERN__VAR = eINSTANCE.getGraphGraphPattern_Var();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_GRAPH_PATTERN__PATTERN = eINSTANCE.getGraphGraphPattern_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ServiceGraphPatternImpl <em>Service Graph Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ServiceGraphPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getServiceGraphPattern()
     * @generated
     */
    EClass SERVICE_GRAPH_PATTERN = eINSTANCE.getServiceGraphPattern();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_GRAPH_PATTERN__VAR = eINSTANCE.getServiceGraphPattern_Var();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_GRAPH_PATTERN__PATTERN = eINSTANCE.getServiceGraphPattern_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.FilterPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFilterPattern()
     * @generated
     */
    EClass FILTER_PATTERN = eINSTANCE.getFilterPattern();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_PATTERN__EXPRESSION = eINSTANCE.getFilterPattern_Expression();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ExistsPatternImpl <em>Exists Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ExistsPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExistsPattern()
     * @generated
     */
    EClass EXISTS_PATTERN = eINSTANCE.getExistsPattern();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTS_PATTERN__PATTERN = eINSTANCE.getExistsPattern_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.NotExistsPatternImpl <em>Not Exists Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.NotExistsPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNotExistsPattern()
     * @generated
     */
    EClass NOT_EXISTS_PATTERN = eINSTANCE.getNotExistsPattern();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EXISTS_PATTERN__PATTERN = eINSTANCE.getNotExistsPattern_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.MinusPatternImpl <em>Minus Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.MinusPatternImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMinusPattern()
     * @generated
     */
    EClass MINUS_PATTERN = eINSTANCE.getMinusPattern();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS_PATTERN__PATTERN = eINSTANCE.getMinusPattern_Pattern();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ExpressionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ExpressionFilterExpressionImpl <em>Expression Filter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ExpressionFilterExpressionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExpressionFilterExpression()
     * @generated
     */
    EClass EXPRESSION_FILTER_EXPRESSION = eINSTANCE.getExpressionFilterExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FILTER_EXPRESSION__LEFT = eINSTANCE.getExpressionFilterExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_FILTER_EXPRESSION__OPERATOR = eINSTANCE.getExpressionFilterExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FILTER_EXPRESSION__RIGHT = eINSTANCE.getExpressionFilterExpression_Right();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.FilterNodeImpl <em>Filter Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.FilterNodeImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFilterNode()
     * @generated
     */
    EClass FILTER_NODE = eINSTANCE.getFilterNode();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.FunctionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getFunction()
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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.NamedFunctionImpl <em>Named Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.NamedFunctionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedFunction()
     * @generated
     */
    EClass NAMED_FUNCTION = eINSTANCE.getNamedFunction();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_FUNCTION__PREFIX = eINSTANCE.getNamedFunction_Prefix();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SparqlFunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SparqlFunctionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSparqlFunction()
     * @generated
     */
    EClass SPARQL_FUNCTION = eINSTANCE.getSparqlFunction();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.BuiltInCallImpl <em>Built In Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.BuiltInCallImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBuiltInCall()
     * @generated
     */
    EClass BUILT_IN_CALL = eINSTANCE.getBuiltInCall();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__EXPR = eINSTANCE.getBuiltInCall_Expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__LEFT = eINSTANCE.getBuiltInCall_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__RIGHT = eINSTANCE.getBuiltInCall_Right();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__VAR = eINSTANCE.getBuiltInCall_Var();

    /**
     * The meta object literal for the '<em><b>If Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__IF_EXPR = eINSTANCE.getBuiltInCall_IfExpr();

    /**
     * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__THEN_EXPR = eINSTANCE.getBuiltInCall_ThenExpr();

    /**
     * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_CALL__ELSE_EXPR = eINSTANCE.getBuiltInCall_ElseExpr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.AggregateImpl <em>Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.AggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAggregate()
     * @generated
     */
    EClass AGGREGATE = eINSTANCE.getAggregate();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ExprAggArgImpl <em>Expr Agg Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ExprAggArgImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getExprAggArg()
     * @generated
     */
    EClass EXPR_AGG_ARG = eINSTANCE.getExprAggArg();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_AGG_ARG__IS_DISTINCT = eINSTANCE.getExprAggArg_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AGG_ARG__EXPR = eINSTANCE.getExprAggArg_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GraphNodeImpl <em>Graph Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GraphNodeImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGraphNode()
     * @generated
     */
    EClass GRAPH_NODE = eINSTANCE.getGraphNode();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.VariableImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.UnNamedVariableImpl <em>Un Named Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.UnNamedVariableImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getUnNamedVariable()
     * @generated
     */
    EClass UN_NAMED_VARIABLE = eINSTANCE.getUnNamedVariable();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.NamedVariableImpl <em>Named Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.NamedVariableImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getNamedVariable()
     * @generated
     */
    EClass NAMED_VARIABLE = eINSTANCE.getNamedVariable();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_VARIABLE__PREFIX = eINSTANCE.getNamedVariable_Prefix();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.BlankNodeImpl <em>Blank Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.BlankNodeImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getBlankNode()
     * @generated
     */
    EClass BLANK_NODE = eINSTANCE.getBlankNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLANK_NODE__NAME = eINSTANCE.getBlankNode_Name();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ParameterImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.ValueImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__TAG = eINSTANCE.getValue_Tag();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.IRIImpl <em>IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.IRIImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getIRI()
     * @generated
     */
    EClass IRI = eINSTANCE.getIRI();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IRI__VALUE = eINSTANCE.getIRI_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.StringValueImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.IntegerValueImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.RDFTagImpl <em>RDF Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.RDFTagImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getRDFTag()
     * @generated
     */
    EClass RDF_TAG = eINSTANCE.getRDFTag();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.TypeTagImpl <em>Type Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.TypeTagImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getTypeTag()
     * @generated
     */
    EClass TYPE_TAG = eINSTANCE.getTypeTag();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TAG__TYPE = eINSTANCE.getTypeTag_Type();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.LangTagImpl <em>Lang Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.LangTagImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getLangTag()
     * @generated
     */
    EClass LANG_TAG = eINSTANCE.getLangTag();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANG_TAG__LANG = eINSTANCE.getLangTag_Lang();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.OrFilterExpressionImpl <em>Or Filter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.OrFilterExpressionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOrFilterExpression()
     * @generated
     */
    EClass OR_FILTER_EXPRESSION = eINSTANCE.getOrFilterExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_FILTER_EXPRESSION__ENTRIES = eINSTANCE.getOrFilterExpression_Entries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.AndFilterExpressionImpl <em>And Filter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.AndFilterExpressionImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAndFilterExpression()
     * @generated
     */
    EClass AND_FILTER_EXPRESSION = eINSTANCE.getAndFilterExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_FILTER_EXPRESSION__ENTRIES = eINSTANCE.getAndFilterExpression_Entries();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.CountAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getCountAggregate()
     * @generated
     */
    EClass COUNT_AGGREGATE = eINSTANCE.getCountAggregate();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNT_AGGREGATE__IS_DISTINCT = eINSTANCE.getCountAggregate_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Is All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNT_AGGREGATE__IS_ALL = eINSTANCE.getCountAggregate_IsAll();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNT_AGGREGATE__EXPR = eINSTANCE.getCountAggregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SumAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSumAggregate()
     * @generated
     */
    EClass SUM_AGGREGATE = eINSTANCE.getSumAggregate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_AGGREGATE__EXPR = eINSTANCE.getSumAggregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.MinAgregateImpl <em>Min Agregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.MinAgregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMinAgregate()
     * @generated
     */
    EClass MIN_AGREGATE = eINSTANCE.getMinAgregate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_AGREGATE__EXPR = eINSTANCE.getMinAgregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.MaxAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getMaxAggregate()
     * @generated
     */
    EClass MAX_AGGREGATE = eINSTANCE.getMaxAggregate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAX_AGGREGATE__EXPR = eINSTANCE.getMaxAggregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.AvgAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getAvgAggregate()
     * @generated
     */
    EClass AVG_AGGREGATE = eINSTANCE.getAvgAggregate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVG_AGGREGATE__EXPR = eINSTANCE.getAvgAggregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.SampleAggregateImpl <em>Sample Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.SampleAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getSampleAggregate()
     * @generated
     */
    EClass SAMPLE_AGGREGATE = eINSTANCE.getSampleAggregate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAMPLE_AGGREGATE__EXPR = eINSTANCE.getSampleAggregate_Expr();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.impl.GroupAggregateImpl <em>Group Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.impl.GroupAggregateImpl
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getGroupAggregate()
     * @generated
     */
    EClass GROUP_AGGREGATE = eINSTANCE.getGroupAggregate();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_AGGREGATE__IS_DISTINCT = eINSTANCE.getGroupAggregate_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_AGGREGATE__EXPR = eINSTANCE.getGroupAggregate_Expr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_AGGREGATE__VALUE = eINSTANCE.getGroupAggregate_Value();

    /**
     * The meta object literal for the '{@link com.emftriple.query.sparql.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.emftriple.query.sparql.Operator
     * @see com.emftriple.query.sparql.impl.SparqlPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //SparqlPackage
