/*
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.ui;

import com.google.inject.Injector;
import it.polimi.ase.projectB2.team20.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FashionDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.IT_POLIMI_ASE_PROJECTB2_TEAM20_XTEXT_FASHIONDSL);
	}
	
}
