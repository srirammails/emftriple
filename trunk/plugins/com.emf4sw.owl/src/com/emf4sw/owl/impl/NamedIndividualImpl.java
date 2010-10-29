/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NamedIndividualImpl extends EntityImpl implements NamedIndividual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedIndividualImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.NAMED_INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listTypes() {
		return new BasicEList<ClassExpression>();
	}

} //NamedIndividualImpl
