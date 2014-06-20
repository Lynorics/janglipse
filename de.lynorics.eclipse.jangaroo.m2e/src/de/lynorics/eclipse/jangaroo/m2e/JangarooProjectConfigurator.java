package de.lynorics.eclipse.jangaroo.m2e;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;

import de.lynorics.eclipse.jangaroo.ui.JangarooProjectHelper;

public class JangarooProjectConfigurator extends AbstractProjectConfigurator {

	@Override
	public void configure(ProjectConfigurationRequest request,
			IProgressMonitor monitor) throws CoreException {
		addNature(request.getProject(), JangarooProjectHelper.NATURE_ID, monitor);
		
		IJavaProject javaProject = JavaCore.create(request.getProject());
		IClasspathEntry[] entries = javaProject.getRawClasspath();

		addSourcePath(javaProject, entries, "src/main/joo");
		addSourcePath(javaProject, entries, "target/generated-sources/joo");
		addSourcePath(javaProject, entries, "src/main/resources");
	}
	
   private void addSourcePath(IJavaProject javaProject, IClasspathEntry[] entries, String path) throws JavaModelException {
		boolean found = false;
		for(IClasspathEntry entry : entries) {
			if (entry.getPath().toPortableString().endsWith(path)) {
				found = true;
			}
		}
		if (!found) {
			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
			System.arraycopy(entries, 0, newEntries, 0, entries.length);
			IPath srcPath= javaProject.getPath().append(path);
			IClasspathEntry srcEntry= JavaCore.newSourceEntry(srcPath, null);
			newEntries[entries.length] = JavaCore.newSourceEntry(srcEntry.getPath());
			javaProject.setRawClasspath(newEntries, null);
		}

	}

//    @Override
//    protected String getOutputFolderParameterName() {
//        return "generateDirectory";
//    }

    @Override
    public AbstractBuildParticipant getBuildParticipant(
                    IMavenProjectFacade projectFacade,
                    MojoExecution execution,
                    IPluginExecutionMetadata executionMetadata) {
        return new JangarooBuildParticipant(execution);
    }

}