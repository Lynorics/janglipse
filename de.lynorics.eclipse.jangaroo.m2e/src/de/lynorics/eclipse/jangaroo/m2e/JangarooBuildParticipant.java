/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.m2e;

import java.io.File;
import java.util.Set;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;
import org.sonatype.plexus.build.incremental.BuildContext;

public class JangarooBuildParticipant extends MojoExecutionBuildParticipant
{
    public JangarooBuildParticipant(MojoExecution execution) {
        super(execution, true);
    }

    @Override
    public Set<IProject> build(int kind, IProgressMonitor monitor) throws Exception {
        final IMaven maven = MavenPlugin.getMaven();
        final BuildContext buildContext = getBuildContext();
        final MojoExecution mojoExecution = getMojoExecution();

        final Set<IProject> result = super.build(kind, monitor);

        final File generated =
                        maven.getMojoParameterValue(getMavenProjectFacade().getMavenProject(), mojoExecution, "generateDirectory", File.class, monitor);
        if (generated != null)
        {
            buildContext.refresh(generated);
        }

        return result;
    }
}
