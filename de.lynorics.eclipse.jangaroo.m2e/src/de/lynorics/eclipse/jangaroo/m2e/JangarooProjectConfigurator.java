package de.lynorics.eclipse.jangaroo.m2e;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;

import de.lynorics.eclipse.jangaroo.ui.JangarooProjectHelper;

public class JangarooProjectConfigurator extends AbstractProjectConfigurator {

	/**
	 * This is enough configuration for now, as Xtend will add the required
	 * source folders itself the moment it starts compiling.
	 */
	@Override
	public void configure(ProjectConfigurationRequest request,
			IProgressMonitor monitor) throws CoreException {
		addNature(request.getProject(), JangarooProjectHelper.NATURE_ID, monitor);
	}
}