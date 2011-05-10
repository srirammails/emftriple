package com.emftriple.metamodel;

import java.lang.reflect.Member;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.ManagedType;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class AttributeImpl<X, Y> implements Attribute<X, Y> {

	private EStructuralFeature feature;
	private Class<Y> javaType;
	private ManagedType<X> declaringType;
	private Member member;

	public AttributeImpl(String name, Class<Y> javaType, ManagedType<X> declaringType, Member member) {
		this.javaType = javaType;
		this.declaringType = declaringType;
		this.member = member;
	}
	
	public AttributeImpl(EStructuralFeature feature, ManagedType<X> managedType) {

	}

	@Override
	public ManagedType<X> getDeclaringType() {
		return declaringType;
	}

	@Override
	public Member getJavaMember() {
		return member;
	}

	@Override
	public Class<Y> getJavaType() {
		return javaType;
	}

	@Override
	public String getName() {
		return feature.getName();
	}

	@Override
	public javax.persistence.metamodel.Attribute.PersistentAttributeType getPersistentAttributeType() {
		return PersistentAttributeType.BASIC;
	}

	@Override
	public boolean isAssociation() {
		return false;
	}

	@Override
	public boolean isCollection() {
		return false;
	}

}
