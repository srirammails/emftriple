package com.emf4sw.owl.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.mindswap.pellet.jena.PelletInfGraph;
import org.mindswap.pellet.jena.PelletReasonerFactory;

import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.extractor.OntologyExtractor;
import com.emf4sw.owl.resource.injector.OntologyInjector;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFReader;
import com.hp.hpl.jena.rdf.model.RDFWriter;

/**
 * {@link OWLTurtleResource}
 * 
 * <p>
 * A persistent ontology document for turtle format.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWLTurtleResource extends ResourceImpl implements OWLResource {

	private final OntModel aModel;

	public OWLTurtleResource() {
		super();
		aModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
	}

	public OWLTurtleResource(URI uri) {
		super(uri);
		aModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Notification notification = setLoaded(true);
		try {
			boolean isReasonerEnable = false;
			if (options != null && options.containsKey(OPTION_REASONER)) {
				isReasonerEnable = options.get(OPTION_REASONER).equals(Boolean.TRUE);
			}

			OntModel aModel;
			PelletInfGraph pelletGraph = null;
			if (isReasonerEnable) {
				final Model rawModel = ModelFactory.createDefaultModel();
				aModel = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC, rawModel);
				pelletGraph = (PelletInfGraph) aModel.getGraph();
				pelletGraph.prepare();
			} else {
				aModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
			}
			final RDFReader aReader = aModel.getReader("TTL");
			try {
				aReader.read(aModel, inputStream, "");
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (isReasonerEnable) {
				pelletGraph.realize();
				pelletGraph.classify();
			}
			if (!aModel.isEmpty()) {
				new OntologyInjector(aModel).inject(this);
			}
		} finally {
			if (notification != null) {
				eNotify(notification);
			}

			setModified(false);
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		final OntologyExtractor extractor = new OntologyExtractor( getOntology() );
		extractor.extract(aModel);

		final RDFWriter writer = aModel.getWriter("TTL");
		writer.setProperty("usePropertySymbols", "false");
		writer.setProperty("useTripleQuotedStrings", "false");
		writer.setProperty("useDoubles", "false");
		writer.setProperty("xmlbase", getOntology().getURI());
		writer.write(aModel, outputStream, "");
	}

	@Override
	public Ontology getOntology() {
		return (!getContents().isEmpty()) ? (Ontology)getContents().get(0) : null;
	}
}
