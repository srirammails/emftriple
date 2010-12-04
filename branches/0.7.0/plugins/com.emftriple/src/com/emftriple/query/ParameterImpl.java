package com.emftriple.query;

import javax.persistence.Parameter;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class ParameterImpl<T> implements Parameter<T> {

	private final String name;
	private final Class<T> type;
	
	public ParameterImpl(String name, Class<T> aClass) {
		this.name = name;
		this.type = aClass;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Class<T> getParameterType() {
		return type;
	}

	@Override
	public Integer getPosition() {
		return 0;
	}

}
