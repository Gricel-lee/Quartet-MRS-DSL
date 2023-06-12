/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydsl.ui.internal.MydslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MydslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MydslActivator activator = MydslActivator.getInstance();
		return activator != null ? activator.getInjector(MydslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
