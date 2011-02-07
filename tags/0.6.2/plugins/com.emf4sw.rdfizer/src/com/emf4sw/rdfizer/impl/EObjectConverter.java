package com.emf4sw.rdfizer.impl;

import static com.emf4sw.rdfizer.impl.RDFIzerExec.checkHasAnnotations;
import static com.emf4sw.rdfizer.impl.RDFUtil.createTriple;
import static com.emf4sw.rdfizer.impl.RDFUtil.isValid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.vocabulary.RDF;

public class EObjectConverter {

	private static final RDFFactory factory = RDFFactory.eINSTANCE;
	
	private final EObject eObject;
	
	private final Map<String, Object> options;

	private String id;
	
	private static final IDGenerator idGen = new IDGenerator();
	
	EObjectConverter(EObject eObject, Map<String, Object> options) {
		this.eObject = eObject;
		this.options = options;
		this.id = (String) idGen.getId(eObject);
	}
	
	public Resource convert(RDFGraph aGraph) {
		final Resource subject = RDFFactory.eINSTANCE.createResource();
		subject.setURI(id);
		aGraph.getResources().add(subject);

		final EList<Triple> triples = new BasicEList<Triple>();
		final Boolean ecoreTypes = (Boolean) options.get( RDFIzerExec.Call.OPTION_INCLUDE_ECORE_TYPES ); 
		if (ecoreTypes != null && ecoreTypes)
		{
			triples.addAll(addEcoreTypes((Node) subject, eObject, aGraph));
		}
		
		triples.addAll( addRdfTypes((Node) subject, getRdfType(eObject.eClass(), aGraph), aGraph) );

//		for (EStructuralFeature feature: eObject.eClass().getEAllStructuralFeatures())
//		{
//			addOwlAxioms(subject, feature, aGraph);
//			addActionAxioms(subject, feature, aGraph);
//		}
		
		aGraph.getTriples().addAll(triples);
		
		return subject;
	}
	
	public void addActionAxioms(Resource subject, EStructuralFeature feature, RDFGraph aGraph) {
		checkHasAnnotations(feature);
		
		//		@emf4sw.foreach(
		// 			var="@it",
		//			action="@owl.AllValuesFrom(property=@it, from=@it.syntax)")
		for (EAnnotation ann: feature.getEAnnotations())
		{
			final String[] names = ann.getSource().split("\\.");
			final String name = names.length == 0 ? ann.getSource() : names[names.length-1];
			if (name.equals("foreach"))
			{
				final Object val = eObject.eGet(feature);
				final String action = ann.getDetails().get("action");
				
				String[] s = action.split("\\(");
				final String[] actionTypes = s[0].split("\\.");
				final String actionType = actionTypes.length == 0 ? s[0] : actionTypes[actionTypes.length-1];
				
				Map<String, String> parameters = getParameters(s[1].replaceAll("\\)", ""));
				
				if (Collection.class.isAssignableFrom(val.getClass()))
				{
					@SuppressWarnings("unchecked")
					Collection<Object> col = (Collection<Object>) val;
					
					for (Object obj: col)
					{
						if (actionType.equals("AllValuesFrom")) {
							
							Property property = getActionProperty(
									parameters.get("property"), 
									ann.getDetails().get("var"), 
									(EObject) obj, 
									aGraph);
							
							Resource from = getActionResource(
									parameters.get("from"), 
									ann.getDetails().get("var"), 
									(EObject) obj, 
									aGraph);
							
							OWLUtil.createAllValuesFrom(subject, property, from, aGraph);
						}	
					}
					
				}
			}
		}
	}

	private Resource getActionResource(String from, String var, EObject obj, RDFGraph aGraph) {
		if (from.startsWith(var)) {
			String[] properties = from.split("\\.");
			Object last = null;
			EClass ctx = obj.eClass();
			
			if (properties.length > 1)
				for (int i = 1; i < properties.length; i++)
				{
					EStructuralFeature feature = ctx.getEStructuralFeature(properties[i]);
					if (feature == null) {
						throw new IllegalAccessError("Cannot access feature " + properties[i]);
					}
					
					last = obj.eGet(feature);
					if (last instanceof EObject)
					{
						ctx = ((EObject) last).eClass();
					}
				}
			
			final String id = last != null ? (String) idGen.getId((EObject) last) : null;
			
			if (id != null)
			{
				return aGraph.getResource(id);
			}
		}
		
		return aGraph.getResource(from);
	}

	private Property getActionProperty(String prop, String var, EObject obj, RDFGraph aGraph) {
		if (prop.equals(var)) {
			return aGraph.getProperty( (String) idGen.getId(obj) );
		}
		return aGraph.getProperty(prop);
	}

	private Map<String, String> getParameters(String string) {
		final Map<String, String> params = new HashMap<String, String>();
		for (String s: string.trim().split(","))
		{
			String[] p = s.trim().split("=");
			if (p.length == 2)
			{
				params.put(p[0], p[1]);
			}
		}
		return params;
	}

	public void addOwlAxioms(Resource subject, EStructuralFeature feature, RDFGraph aGraph) {
		checkHasAnnotations(feature);
		
		for (EAnnotation ann: feature.getEAnnotations())
		{
			final String[] names = ann.getSource().split("\\.");
			final String name = names.length == 0 ? ann.getSource() : names[names.length-1];
			if (name.equals("AllValuesFrom"))
			{
				final Property property = RDFIzerExec.EFeatureConverter.getRdfType(feature, aGraph);
				final String from = ann.getDetails().get("from");
				final Resource res = aGraph.getResource(from);
				
				OWLUtil.createAllValuesFrom(subject, property, res, aGraph);
			}
			if (name.equals("SomeValuesFrom"))
			{
				final Property property = RDFIzerExec.EFeatureConverter.getRdfType(feature, aGraph);
				final String from = ann.getDetails().get("from");
				final Resource res = aGraph.getResource(from);
				
				OWLUtil.createSomeValuesFrom(subject, property, res, aGraph);
			}
		}
	}



	private List<Resource> getRdfType(EClass eClass, RDFGraph aGraph) {
		checkHasAnnotations(eClass);
		
		final List<Resource> classes = new ArrayList<Resource>();
		final Set<String> types = new HashSet<String>();
		
		for (EAnnotation ann: eClass.getEAnnotations())
		{
			String[] names = ann.getSource().split("\\.");
			String name = names.length == 0 ? ann.getSource() : names[names.length-1];
			if (name.equals("OWLClass")) 
			{
				if (ann.getDetails().get("uri") != null) {
					types.add(ann.getDetails().get("uri"));
				}
			}
			if (name.equals("Entity"))
			{
				if (ann.getDetails().get("uri") != null) {  
					types.add(ann.getDetails().get("uri"));
				}
			}
			
		}
		
		for (String type: types) {
			if (RDFIzerExec.NodeResolver.contains(type)) {
				classes.add((Resource)RDFIzerExec.NodeResolver.get(type));
			} else {
				Resource res = aGraph.getResource( type );
				RDFIzerExec.NodeResolver.put(type, res);
				classes.add(res);
			}
		}
		

		if (aGraph instanceof DocumentGraph) {
			final Namespace ns = factory.createNamespace();
			ns.setPrefix( eClass.getEPackage().getNsPrefix() );
			final String uri = 
				isValid(eClass.getEPackage().getNsURI()) ? eClass.getEPackage().getNsURI() : eClass.getEPackage().getNsURI() + "#";
			ns.setURI( uri );

			((DocumentGraph)aGraph).getNamespaces().add(ns);
		}
		
		return classes;
	}
	
	private EList<Triple> addRdfTypes(Node node, List<Resource> classes, RDFGraph aGraph) {
		final EList<Triple> triples = new BasicEList<Triple>();
		final Property rdf_type; 
		if (RDFIzerExec.NodeResolver.contains(RDF.type)) {
			rdf_type = (Property) RDFIzerExec.NodeResolver.get(RDF.type);
		} else {
			rdf_type = aGraph.getProperty(RDF.type);
			RDFIzerExec.NodeResolver.put(RDF.type, rdf_type);
		}
		
		for (Resource res: classes)
		{
			triples.add( createTriple(node, rdf_type, res) );	
		}
		
		return triples;
	}
	
	private EList<Triple> addEcoreTypes(Node node, EObject obj, RDFGraph aGraph) {
		final EList<Triple> triples = new BasicEList<Triple>();
		final Property rdf_type = aGraph.getProperty(RDF.type);

		final EClass directType = obj.eClass();
		String uri = isValid(directType.getEPackage().getNsURI()) ? 
				directType.getEPackage().getNsURI() + directType.getName() :
					directType.getEPackage().getNsURI() + "#" + directType.getName();
		
		final Resource res;
		if (RDFIzerExec.NodeResolver.contains(uri)) {
			res = (Resource)RDFIzerExec.NodeResolver.get(uri);
		} else {
			res = aGraph.getResource(uri);
			RDFIzerExec.NodeResolver.put(uri, res);
		}
		
		triples.add( createTriple(node, rdf_type, res) );

//		final EList<EClass> allClasses = directType.getEAllSuperTypes();
//		for (EClass eClass: allClasses)
//		{
//			uri = isValid(eClass.getEPackage().getNsURI()) ? 
//					eClass.getEPackage().getNsURI() + eClass.getName() :
//						eClass.getEPackage().getNsURI() + "#" + eClass.getName();
//					
//			final Resource resource;
//			if (RDFIzerExec.NodeResolver.contains(uri)) {
//				resource = (Resource)RDFIzerExec.NodeResolver.get(uri);
//			} else {
//				resource = aGraph.getResource(uri);
//				RDFIzerExec.NodeResolver.put(uri, resource);
//			}
//			
//			triples.add( createTriple(node, rdf_type, resource) );	
//		}

		return triples;
	}
}
