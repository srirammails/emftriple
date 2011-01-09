package com.emf4sw.owl.resource.extractor;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationPropertyExpression;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.Literal;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * {@link AnnotationExtractor}
 * 
 * <p>
 * Extractor class for {@link Annotation}.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class AnnotationExtractor {

	AnnotationExtractor() {
	}
	
	static void extractAnnotation(Annotation annotation, Resource annotatedResource, OntModel model) {
		AnnotationPropertyExpression expression = annotation.getProperty();
		Literal aLiteral = annotation.getValue();
		if (expression instanceof EntityExpression) {
			Entity entity = ((EntityExpression) expression).getEntity();
			if (entity != null) {
				String aURI = entity.getURI();
				annotatedResource.addLiteral(
						model.createProperty(aURI), 
						LiteralExtractor.create(aLiteral, model));
			}
		}
	}
}
