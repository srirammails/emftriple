package com.emftriple.metamodel;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.ManagedType;

import org.eclipse.emf.ecore.EStructuralFeature;

public class CollectionAttributeImpl<X, Y> extends AttributeImpl<X, Y> implements Attribute<X, Y> {

	public CollectionAttributeImpl(EStructuralFeature feature, ManagedType<X> managedType) {
		super(feature, managedType);
	}

}
