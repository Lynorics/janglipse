/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class JangarooProjectHelper {

	public static final String NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature"; //$NON-NLS-1$
	public static final String BUILDER_ID = " de.lynorics.eclipse.jangaroo.ui.shared.jangarooBuilder"; //$NON-NLS-1$

	private static final Logger log = Logger.getLogger(JangarooProjectHelper.class);

	public static boolean hasNature(IProject project) {
		try {
			if (project.isAccessible()) {
				return project.hasNature(NATURE_ID);
			}
		} catch (CoreException e) {
			log.error(e.getMessage(), e);
		}
		return false;
	}

	public static boolean hasBuilder(IProject project) {
		if (project.isAccessible()) {
			try {
				for (ICommand command : project.getDescription().getBuildSpec()) {
					if (BUILDER_ID.equals(command.getBuilderName())) {
						return true;
					}
				}
			} catch (CoreException e) {
				log.error("Can't build due to an exception.", e);
			}
		}
		return false;
	}

}