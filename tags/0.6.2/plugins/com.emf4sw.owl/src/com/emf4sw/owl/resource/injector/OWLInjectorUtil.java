/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.resource.injector;

import java.net.URISyntaxException;

import com.atl.common.utils.Preconditions;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.Declaration;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.PrefixEntityExpression;
import com.emf4sw.owl.vocabulary.BuiltIn;
import com.emf4sw.owl.vocabulary.OWL;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWLInjectorUtil {

	private static final OWLFactory factory = OWLFactory.eINSTANCE;
 
    protected static String createDefaultName(final String uri) {
        String last = "";
        java.net.URI _uri = null;
        try {
            _uri = new java.net.URI(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        if (_uri != null) {
            final String _path = _uri.getPath();
            final String[] split = _path.split("/");
            if (split.length != 0) {
                last = split[split.length-1];
                last.replaceAll("#", "");
                String[] split2 = last.split("[.]");
                if (split2.length > 0) {
                    last = split2[0];
                }
            }
        }

        return last;
    }
    
    protected static String getIdentifier(final com.hp.hpl.jena.rdf.model.Resource resource) 
    {
        if (resource.getURI() != null) {
            return resource.getURI();
        } else if (resource.getLocalName() != null) {
            return (resource.getNameSpace() == null) ? 
                    resource.getLocalName() : 
                        (resource.getNameSpace() + resource.getLocalName()); 
        } else {
            return resource.getId().getLabelString();
        }
    }
    
    protected static boolean isBuiltIn(final com.hp.hpl.jena.ontology.OntResource or) {
        return (or.getNameSpace() == null) ? false : BuiltIn.is( or.getNameSpace() );          
    }
        
	static Property get(String uri) {
		return com.hp.hpl.jena.rdf.model.ResourceFactory.createProperty(uri);
	}

	static Datatype literal(com.emf4sw.owl.Ontology ontology) {
		Datatype literal = null; 
		if (literal == null) {
			literal = factory.createDatatype();
			literal.setName("Literal");
			literal.setNamespace(ontology.getNamespace("rdfs"));
		}	
		
		return literal;
	}

	static boolean isThing(Resource aResource) {
		return aResource.getURI().equals(OWL.Thing);
	}
	
	static EntityExpression thing(com.emf4sw.owl.Ontology ontology) {
		OWLClass thing = ontology.getOWLClass(OWL.Thing);
		if (thing == null) {
			thing = factory.createOWLClass();
			thing.setName("Thing");
			thing.setNamespace(ontology.getNamespace("owl"));
			final Declaration aDeclaration = factory.createDeclaration();
			aDeclaration.setEntity(thing);
			ontology.getAxioms().add(aDeclaration);
		}
		PrefixEntityExpression aEntityExpression = factory.createPrefixEntityExpression();
		aEntityExpression.setReference(thing);
		aEntityExpression.setNamespace(ontology.getNamespace("owl"));
		
		return aEntityExpression;
	}
	
	static ClassExpression getExpression(ClassExpression aExpression) {
		ClassExpression theExpression = null;
		if (aExpression instanceof Entity) {
			theExpression = factory.createPrefixEntityExpression();
			((PrefixEntityExpression) theExpression).setReference( (Entity) aExpression );
			((PrefixEntityExpression) theExpression).setNamespace( ((Entity) aExpression).getNamespace() );
		} else {
			theExpression = aExpression;
		}
		return theExpression;
	}
	
	static DataPropertyExpression getExpression(DataProperty aProperty) {
		PrefixEntityExpression theExpression = factory.createPrefixEntityExpression();
		theExpression.setReference(aProperty);
		theExpression.setNamespace(aProperty.getNamespace());
		
		return theExpression;
	}
	
	static ObjectPropertyExpression getExpression(ObjectProperty aProperty) {
		PrefixEntityExpression theExpression = factory.createPrefixEntityExpression();
		theExpression.setReference(aProperty);
		theExpression.setNamespace(aProperty.getNamespace());
		
		return theExpression;
	}
	
	static Namespace getNamespace(OntResource c, com.emf4sw.owl.Ontology aOntology) {
		Preconditions.checkNotNull(aOntology);
		
		for (Namespace aNamespace: aOntology.getNamespaces()) {
			if (aNamespace.getURI().equals(c.getNameSpace())) {
				return aNamespace;
			}
		}
		return aOntology.getNamespaces().get(0);
	}
}
