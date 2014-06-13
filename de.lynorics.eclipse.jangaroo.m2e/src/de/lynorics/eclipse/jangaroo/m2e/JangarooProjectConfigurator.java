package de.lynorics.eclipse.jangaroo.m2e;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.AbstractJavaProjectConfigurator;

import de.lynorics.eclipse.jangaroo.ui.JangarooProjectHelper;

public class JangarooProjectConfigurator extends AbstractJavaProjectConfigurator {

	@Override
	public void configure(ProjectConfigurationRequest request,
			IProgressMonitor monitor) throws CoreException {
		addNature(request.getProject(), JangarooProjectHelper.NATURE_ID, monitor);
//		if (!request.getMavenProject().getCompileSourceRoots().contains("src/main/joo")) {
//			request.getMavenProject().addCompileSourceRoot("src/main/joo");
//		}
	}
	
    @Override
    protected String getOutputFolderParameterName() {
        return "generateDirectory";
    }

    @Override
    public AbstractBuildParticipant getBuildParticipant(
                    IMavenProjectFacade projectFacade,
                    MojoExecution execution,
                    IPluginExecutionMetadata executionMetadata) {
        return new JangarooBuildParticipant(execution);
    }

}