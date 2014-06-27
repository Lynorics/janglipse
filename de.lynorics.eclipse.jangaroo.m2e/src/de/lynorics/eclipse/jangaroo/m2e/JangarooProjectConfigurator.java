/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.m2e;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

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
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.internal.AbstractJavaProjectConfigurator;

import de.lynorics.eclipse.jangaroo.ui.JangarooProjectHelper;

public class JangarooProjectConfigurator extends AbstractJavaProjectConfigurator {

	@Override
	public void configure(ProjectConfigurationRequest request,
			IProgressMonitor monitor) throws CoreException {
		super.configure(request, monitor);
		addNature(request.getProject(), JangarooProjectHelper.NATURE_ID, monitor);
		addNature(request.getProject(), "org.eclipse.jdt.core.javanature", monitor);
		declareSourcePath(request, monitor);
	}

	private void declareSourcePath(ProjectConfigurationRequest request, IProgressMonitor monitor)
			throws JavaModelException {
		IJavaProject javaProject = JavaCore.create(request.getProject());
		IClasspathEntry[] classpath = javaProject.getRawClasspath();
		List<IClasspathEntry> list = new Vector<IClasspathEntry>();
		list.addAll(Arrays.asList(classpath));
//		List<IClasspathEntry> list = new Vector<IClasspathEntry>();
		addSourcePath(javaProject, list, "src/main/joo");
		addSourcePath(javaProject, list, "src/test/joo");
		addSourcePath(javaProject, list, "src/main/resources");
		addSourcePath(javaProject, list, "target/generated-sources/joo");
		javaProject.setRawClasspath((IClasspathEntry[]) list.toArray(new IClasspathEntry[list.size()]), monitor);
	}
	
	private void addSourcePath(IJavaProject javaProject, List<IClasspathEntry> entries, String path) throws JavaModelException {
		IPath srcPath= javaProject.getPath().append(path);
		IClasspathEntry srcEntry= JavaCore.newSourceEntry(srcPath, null);
		boolean found = false;
		for (IClasspathEntry entry : entries) {
			if (entry.getPath().makeRelative().toString().equals(srcEntry.getPath().makeRelative().toString())) {
				found = true;
				break;
			}
		}
		if (!found) {
			entries.add(JavaCore.newSourceEntry(srcEntry.getPath()));
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