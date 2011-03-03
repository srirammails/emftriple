package com.emf4sw.rdf.notify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl;

public class ModelAdapterImpl extends AdapterImpl {
	@Override
	public void notifyChanged(Notification msg) {
		if (msg.getFeatureID(RDFGraph.class) == RDFPackage.RDF_GRAPH__TRIPLES) {
			RDFGraph notifier = (RDFGraph) msg.getNotifier();
			Triple obj = (Triple) msg.getNewValue();
			
			if (notifier.eResource() != null)
				if (notifier.eResource() instanceof RDFResource)
					((RDFResourceImpl) notifier.eResource()).addDelegate(obj);
		}
		
		super.notifyChanged(msg);
	}
}
