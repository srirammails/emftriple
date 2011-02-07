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
 * A representation of the model object '<em><b>Update Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.UpdateClause#getFromEntries <em>From Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getUpdateClause()
 * @model
 * @generated
 */
public interface UpdateClause extends EObject
{
  /**
   * Returns the value of the '<em><b>From Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.mql.FromEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Entries</em>' containment reference list.
   * @see com.emftriple.query.mql.MqlPackage#getUpdateClause_FromEntries()
   * @model containment="true"
   * @generated
   */
  EList<FromEntry> getFromEntries();

} // UpdateClause
