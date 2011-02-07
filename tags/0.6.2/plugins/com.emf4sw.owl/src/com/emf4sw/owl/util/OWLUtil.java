package com.emf4sw.owl.util;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.Ontology;

public class OWLUtil {

	public static Entity getEntity(Ontology ontology, String iri) {
		for (OWLClass entity: ontology.listClasses()) {
			if (entity.getURI().equals(iri)) {
				return entity;
			}
		}
		for (ObjectProperty entity: ontology.listObjectProperties()) {
			if (entity.getURI().equals(iri)) {
				return entity;
			}
		}
		for (DataProperty entity: ontology.listDataProperties()) {
			if (entity.getURI().equals(iri)) {
				return entity;
			}
		}
		for (NamedIndividual entity: ontology.listNamedIndividuals()) {
			if (entity.getURI().equals(iri)) {
				return entity;
			}
		}
		for (Datatype entity: ontology.listDatatypes()) {
			if (entity.getURI().equals(iri)) {
				return entity;
			}
		}
		return null;
	}

}
