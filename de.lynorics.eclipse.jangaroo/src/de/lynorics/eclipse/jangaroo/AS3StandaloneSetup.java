/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
* generated by Xtext
*/
package de.lynorics.eclipse.jangaroo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AS3StandaloneSetup extends AS3StandaloneSetupGenerated{

	public static void doSetup() {
		new AS3StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
