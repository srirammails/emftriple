package com.emftriple.metamodel;

import javax.persistence.metamodel.Type;

import org.eclipse.emf.ecore.EClass;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class RDFType<X> implements Type<X> {

	protected final Class<X> aClass;
	
	protected final EClass eClass;
	
	protected RDFType(EClass eClass, Class<X> aClass) {
		this.eClass = eClass;
		this.aClass = aClass;
	}
	
	@Override
	public Class<X> getJavaType() {
		return aClass;
	}

	@Override
	public javax.persistence.metamodel.Type.PersistenceType getPersistenceType() {
		return PersistenceType.BASIC;
	}
	
	@Override
	public String toString() {
		return aClass.getName();
	}

}
