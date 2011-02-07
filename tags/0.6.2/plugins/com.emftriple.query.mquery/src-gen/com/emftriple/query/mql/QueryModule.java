/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.QueryModule#getImports <em>Imports</em>}</li>
 *   <li>{@link com.emftriple.query.mql.QueryModule#getDefaultQuery <em>Default Query</em>}</li>
 *   <li>{@link com.emftriple.query.mql.QueryModule#getNamedQueries <em>Named Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getQueryModule()
 * @model
 * @generated
 */
public interface QueryModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.mql.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.emftriple.query.mql.MqlPackage#getQueryModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Default Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Query</em>' containment reference.
   * @see #setDefaultQuery(MQuery)
   * @see com.emftriple.query.mql.MqlPackage#getQueryModule_DefaultQuery()
   * @model containment="true"
   * @generated
   */
  MQuery getDefaultQuery();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.QueryModule#getDefaultQuery <em>Default Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Query</em>' containment reference.
   * @see #getDefaultQuery()
   * @generated
   */
  void setDefaultQuery(MQuery value);

  /**
   * Returns the value of the '<em><b>Named Queries</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.mql.NamedQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Queries</em>' containment reference list.
   * @see com.emftriple.query.mql.MqlPackage#getQueryModule_NamedQueries()
   * @model containment="true"
   * @generated
   */
  EList<NamedQuery> getNamedQueries();

} // QueryModule
