package de.lynorics.eclipse.jangaroo.m2e;

import java.io.File;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.AbstractMavenConfigurationChangeListener;
import org.eclipse.m2e.core.embedder.IMavenConfiguration;
import org.eclipse.m2e.core.embedder.MavenConfigurationChangeEvent;
import org.eclipse.m2e.core.internal.MavenPluginActivator;
import org.eclipse.m2e.core.internal.index.IndexManager;
import org.eclipse.m2e.core.internal.project.registry.MavenProjectManager;
import org.eclipse.m2e.jdt.IMavenClassifierManager;
import org.eclipse.m2e.jdt.internal.BuildPathManager;
import org.eclipse.m2e.jdt.internal.MavenClassifierManager;
import org.eclipse.m2e.jdt.internal.Messages;
import org.eclipse.m2e.jdt.internal.launch.MavenLaunchConfigurationListener;
import org.osgi.framework.BundleContext;

public class MavenJangarooPlugin extends Plugin {

  public static String PLUGIN_ID = "de.lynorics.eclipse.jangaroo.m2e"; //$NON-NLS-1$

  private static MavenJangarooPlugin instance;

  MavenLaunchConfigurationListener launchConfigurationListener;

  BuildPathManager buildpathManager;

  IMavenClassifierManager mavenClassifierManager;

  /**
   * @noreference see class javadoc
   */
  public MavenJangarooPlugin() {
    instance = this;

    if(Boolean.parseBoolean(Platform.getDebugOption(PLUGIN_ID + "/debug/initialization"))) { //$NON-NLS-1$
      System.err.println("### executing constructor " + PLUGIN_ID); //$NON-NLS-1$
      new Throwable().printStackTrace();
    }
  }

  /**
   * @noreference see class javadoc
   */
  public void start(BundleContext bundleContext) throws Exception {
    super.start(bundleContext);

    if(Boolean.parseBoolean(Platform.getDebugOption(PLUGIN_ID + "/debug/initialization"))) { //$NON-NLS-1$
      System.err.println("### executing start() " + PLUGIN_ID); //$NON-NLS-1$
      new Throwable().printStackTrace();
    }

    IWorkspace workspace = ResourcesPlugin.getWorkspace();

    MavenProjectManager projectManager = MavenPluginActivator.getDefault().getMavenProjectManager();
    IndexManager indexManager = MavenPlugin.getIndexManager();
    IMavenConfiguration mavenConfiguration = MavenPlugin.getMavenConfiguration();

    File stateLocationDir = getStateLocation().toFile();

    this.buildpathManager = new BuildPathManager(projectManager, indexManager, bundleContext, stateLocationDir);
    workspace.addResourceChangeListener(buildpathManager, IResourceChangeEvent.PRE_DELETE);

    projectManager.addMavenProjectChangedListener(this.buildpathManager);

    mavenConfiguration.addConfigurationChangeListener(new AbstractMavenConfigurationChangeListener() {
      public void mavenConfigurationChange(MavenConfigurationChangeEvent event) {
        if(!MavenConfigurationChangeEvent.P_USER_SETTINGS_FILE.equals(event.getKey())) {
          return;
        }

        if(buildpathManager.setupVariables() && buildpathManager.variablesAreInUse()) {
          WorkspaceJob job = new WorkspaceJob(Messages.MavenJdtPlugin_job_name) {

            public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
              ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, monitor);
              return Status.OK_STATUS;
            }

          };
          job.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().buildRule());
          job.schedule();
        }
      }
    });

    this.launchConfigurationListener = new MavenLaunchConfigurationListener();
    DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(launchConfigurationListener);
    projectManager.addMavenProjectChangedListener(launchConfigurationListener);

    this.mavenClassifierManager = new MavenClassifierManager();
  }

  /**
   * @noreference see class javadoc
   */
  public void stop(BundleContext context) throws Exception {
//    IWorkspace workspace = ResourcesPlugin.getWorkspace();
//    MavenProjectManager projectManager = MavenPluginActivator.getDefault().getMavenProjectManager();
//    projectManager.removeMavenProjectChangedListener(buildpathManager);
//
//    workspace.removeResourceChangeListener(this.buildpathManager);
//
//    DebugPlugin.getDefault().getLaunchManager().removeLaunchConfigurationListener(launchConfigurationListener);
//    projectManager.removeMavenProjectChangedListener(launchConfigurationListener);
//
//    this.buildpathManager = null;
//    this.launchConfigurationListener = null;
//    this.mavenClassifierManager = null;
  }

  public static MavenJangarooPlugin getDefault() {
    return instance;
  }

//  public IClasspathManager getBuildpathManager() {
//    return buildpathManager;
//  }

  /**
   * @return Returns the mavenClassifierManager.
   */
//  public IMavenClassifierManager getMavenClassifierManager() {
//    return this.mavenClassifierManager;
//  }

}
