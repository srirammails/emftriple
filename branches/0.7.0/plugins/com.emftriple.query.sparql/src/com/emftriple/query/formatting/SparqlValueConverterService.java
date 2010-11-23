package com.emftriple.query.formatting;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

public class SparqlValueConverterService extends AbstractDeclarativeValueConverterService {

	@ValueConverter(rule="IRI_TERMINAL")
	public IValueConverter<String> IRI_TERMINAL() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, AbstractNode node) throws ValueConverterException {
				return string.startsWith("<") && string.endsWith(">") ? string.substring(1, string.length()-1) : string;
			}
			@Override
			protected String internalToString(String value) {
				return "<" + value + ">";
			}
		};
	}
	
	@ValueConverter(rule="STRING")
	public IValueConverter<String> STRING() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, AbstractNode node) throws ValueConverterException {
				if (string == null)
					return null;
				try {
					return Strings.convertFromJavaString(string.substring(1, string.length() - 1), false);
				} catch (IllegalArgumentException e) {
					throw new ValueConverterException(e.getMessage(), node, e);
				}
			}
			@Override
			protected String internalToString(String value) {
				return '"' + Strings.convertToJavaString(value, false) + '"';
			}
		};
	}
}
