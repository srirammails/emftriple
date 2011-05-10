package com.semweb.careers;

import java.io.File;

import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.LocalReference;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.resource.Directory;
import org.restlet.routing.Redirector;
import org.restlet.routing.Router;

import com.semweb.careers.resources.EmployerResource;
import com.semweb.careers.resources.HomeResource;
import com.semweb.careers.resources.JobResource;
import com.semweb.careers.resources.JobsResource;
import com.semweb.careers.resources.OrganisationResource;
import com.semweb.careers.resources.PlaceResource;

import freemarker.template.Configuration;

public class Application extends org.restlet.Application {

	public static void main(String... args) throws Exception {
		// Create a component with an HTTP server connector
		final Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8585);
		component.getClients().add(Protocol.FILE);
		component.getClients().add(Protocol.CLAP);
		component.getClients().add(Protocol.HTTP);
		// Attach the application to the default host and start it
		component.getDefaultHost().attach("/careers", new Application());
		component.start();
	}

	private Configuration fmc;
	
	private String webRootPath = "WebContent";

	public Application() {
		getConnectorService().getClientProtocols().add(Protocol.FILE);
		getConnectorService().getClientProtocols().add(Protocol.CLAP);
		getConnectorService().getClientProtocols().add(Protocol.HTTP);
		try {
			final File templateDir = new File("WebContent/tmpl");
			this.fmc = new freemarker.template.Configuration();
			this.fmc.setDirectoryForTemplateLoading(templateDir);
		} catch (Exception e) {
			getLogger().severe("Unable to configure FreeMarker.");
			e.printStackTrace();
		}

		getMetadataService().addExtension("rdf", MediaType.APPLICATION_RDF_XML, true);
		getMetadataService().addExtension("ttl", MediaType.APPLICATION_RDF_TURTLE, true);
		getTunnelService().setExtensionsTunnel(true);
	}

	@Override
	public Restlet createInboundRoot() {
		final Router router = new Router(getContext());

		// Redirect by defaul to the lst of users.
		router.attachDefault(new Redirector(getContext(), "/home", Redirector.MODE_CLIENT_FOUND));

		final Directory imgDirectory = new Directory(getContext(),
				LocalReference.createFileReference(webRootPath + "/images"));
		// Add a route for the image resources
		router.attach("/images", imgDirectory);

		final Directory cssDirectory = new Directory(getContext(),
				LocalReference
				.createFileReference(webRootPath + "/stylesheets"));
		// Add a route for the CSS resources
		router.attach("/stylesheets", cssDirectory);

		router.attach("/home", HomeResource.class);
		router.attach("/jobs", JobsResource.class);
		router.attach("/add", EmployerResource.class);
		router.attach("/jobs/{jobId}", JobResource.class);
		router.attach("/organisations/{orgId}", OrganisationResource.class);
		router.attach("/locations/{locId}", PlaceResource.class);

		return router;
	}

	public Configuration getConfiguration() {
		return fmc;
	}
}
