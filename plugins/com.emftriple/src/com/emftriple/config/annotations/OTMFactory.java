/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.config.annotations.OTMPackage
 * @generated
 */
public interface OTMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OTMFactory eINSTANCE = com.emftriple.config.annotations.impl.OTMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Mapping</em>'.
	 * @generated
	 */
	EntityMapping createEntityMapping();

	/**
	 * Returns a new object of class '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Type</em>'.
	 * @generated
	 */
	EntityType createEntityType();

	/**
	 * Returns a new object of class '<em>Named Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Query Type</em>'.
	 * @generated
	 */
	NamedQueryType createNamedQueryType();

	/**
	 * Returns a new object of class '<em>Named Native Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Native Query Type</em>'.
	 * @generated
	 */
	NamedNativeQueryType createNamedNativeQueryType();

	/**
	 * Returns a new object of class '<em>Persistence Unit Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Unit Metadata</em>'.
	 * @generated
	 */
	PersistenceUnitMetadata createPersistenceUnitMetadata();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OTMPackage getOTMPackage();

} //OTMFactory
