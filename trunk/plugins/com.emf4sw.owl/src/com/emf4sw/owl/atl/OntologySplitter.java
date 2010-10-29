package com.emf4sw.owl.atl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.emf4sw.owl.Entity;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.PrefixEntityExpression;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.resource.OWLTurtleResourceFactory;
import com.emf4sw.owl.resource.OWLXMLResourceFactory;

/**
 * {@link OntologySplitter}
 * 
 * Split a {@link OWLResource} containing two or more {@link Ontology} into a {@link List} of 
 * {@link OWLResource}, each containing a single {@link Ontology}. Internal references between ontologies elements 
 * are recreated as cross references between {@link OWLResource}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OntologySplitter {

	public List<Resource> split(Resource aResource, OWLFormats format) {
		Factory factory = getFactory(format);
		
		final List<Resource> resources = new LinkedList<Resource>();
		final Map<Ontology, Set<Entry<EObject, EObject>>> keys = new HashMap<Ontology, Set<Entry<EObject,EObject>>>();

		for (EObject eObject: aResource.getContents()) {
			if (eObject instanceof Ontology) {
				final Copier copier = new EcoreUtil.Copier(true, true);
				copier.copyReferences();
				final EObject copy = copier.copy(eObject);
				keys.put((Ontology) eObject, copier.entrySet());

				final String ontologyURI = ((Ontology) eObject).getURI() + format.extension();
				final Resource copyResource = factory.createResource( URI.createURI( ontologyURI ) );
				copyResource.getContents().add(copy);
				resources.add( copyResource );
			}
		}
		for (Ontology o: keys.keySet()) {
			final Set<Entry<EObject, EObject>> entries = keys.get(o);
			for (Entry<EObject, EObject> entry: entries) {
				checkOntology(entry, keys);
				checkEntityExpression(entry, keys);
				checkEntity(entry, keys);
			}
		}

		return resources;
	}

	private Factory getFactory(OWLFormats format) {
		if (format.equals(OWLFormats.TURTLE)) {
			return new OWLTurtleResourceFactory(); 
		}
		if (format.equals(OWLFormats.OWL)) {
			return new OWLXMLResourceFactory();
		}
		return new XMIResourceFactoryImpl();
	}

	private void checkOntology(Entry<EObject, EObject> entry, Map<Ontology, Set<Entry<EObject, EObject>>> keys) {
		if (entry.getKey() instanceof Ontology) {
			Ontology key = (Ontology) entry.getKey();
			Ontology val = (Ontology) entry.getValue();
			for (Ontology imported: key.getImports()) {
				EObject eObject = getEObject(keys.values(), imported);
				if (eObject instanceof Ontology) {
					val.getImports().add((Ontology) eObject);
				}
			}
		}
	}
	
	private void checkEntityExpression(Entry<EObject, EObject> entry, Map<Ontology, Set<Entry<EObject, EObject>>> keys) {
		if (entry.getKey() instanceof PrefixEntityExpression) {
			PrefixEntityExpression ent = (PrefixEntityExpression) entry.getKey();
			PrefixEntityExpression val = (PrefixEntityExpression) entry.getValue();
			if (ent.getEntity() != null && val.getEntity() == null) {
				EObject eObject = getEObject(keys.values(), ent.getEntity());
				if (eObject != null) {
					val.setReference((Entity) eObject);
				}
			}
			if (ent.getNamespace() != null && val.getNamespace() == null) {
				EObject eObject = getEObject(keys.values(), ent.getNamespace());
				if (eObject != null) {
					val.setNamespace((Namespace) eObject);
				}
			}
		}
	}
	
	private void checkEntity(Entry<EObject, EObject> entry, Map<Ontology, Set<Entry<EObject, EObject>>> keys) {
		if (entry.getKey() instanceof Entity) {
			Entity key = (Entity) entry.getKey();
			Entity val = (Entity) entry.getValue();
			if (key.getNamespace() != null && val.getNamespace() == null) {
				EObject eObject = getEObject(keys.values(), key.getNamespace());
				if (eObject != null) {
					val.setNamespace((Namespace) eObject);
				}
			}
		}
	}
	
	private EObject getEObject(Collection<Set<Entry<EObject, EObject>>> collection, EObject find) {
		for (Set<Entry<EObject, EObject>> set: collection) {
			for (Entry<EObject, EObject> entry: set) {
				if (entry.getKey().equals(find)) {
					return entry.getValue();
				}
			}
		}
		return null;
	}
	
}
