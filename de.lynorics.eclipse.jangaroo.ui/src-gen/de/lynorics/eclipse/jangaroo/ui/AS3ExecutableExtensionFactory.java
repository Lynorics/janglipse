/*
 * generated by Xtext
 */
package de.lynorics.eclipse.jangaroo.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.lynorics.eclipse.jangaroo.ui.internal.AS3Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AS3ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AS3Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AS3Activator.getInstance().getInjector(AS3Activator.DE_LYNORICS_ECLIPSE_JANGAROO_AS3);
	}
	
}
