package com.emf4sw.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class OntologyWizard extends Wizard implements INewWizard {

	private OntologyWizardPage page;

	@Override
	public boolean performFinish() {

		return false;
	}

	@Override
	public void addPages() {
		page = new OntologyWizardPage("");
		addPage(page);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
}
