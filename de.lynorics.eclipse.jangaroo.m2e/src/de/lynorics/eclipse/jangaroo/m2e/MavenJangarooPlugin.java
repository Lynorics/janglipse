/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package de.lynorics.eclipse.jangaroo.m2e;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class MavenJangarooPlugin extends Plugin {

  public static String PLUGIN_ID = "de.lynorics.eclipse.jangaroo.m2e"; //$NON-NLS-1$

  private static MavenJangarooPlugin instance;

//  MavenLaunchConfigurationListener launchConfigurationListener;
//
//  BuildPathManager buildpathManager;
//
//  IMavenClassifierManager mavenClassifierManager;

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

//    if(Boolean.parseBoolean(Platform.getDebugOption(PLUGIN_ID + "/debug/initialization"))) { //$NON-NLS-1$
//      System.err.println("### executing start() " + PLUGIN_ID); //$NON-NLS-1$
//      new Throwable().printStackTrace();
//    }
//
//    IWorkspace workspace = ResourcesPlugin.getWorkspace();
//
//    MavenProjectManager projectManager = MavenPluginActivator.getDefault().getMavenProjectManager();
//    IndexManager indexManager = MavenPlugin.getIndexManager();
//    IMavenConfiguration mavenConfiguration = MavenPlugin.getMavenConfiguration();
//
//    File stateLocationDir = getStateLocation().toFile();
//
//    this.buildpathManager = new BuildPathManager(projectManager, indexManager, bundleContext, stateLocationDir);
//    workspace.addResourceChangeListener(buildpathManager, IResourceChangeEvent.PRE_DELETE);
//
//    projectManager.addMavenProjectChangedListener(this.buildpathManager);
//
//    mavenConfiguration.addConfigurationChangeListener(new AbstractMavenConfigurationChangeListener() {
//      public void mavenConfigurationChange(MavenConfigurationChangeEvent event) {
//        if(!MavenConfigurationChangeEvent.P_USER_SETTINGS_FILE.equals(event.getKey())) {
//          return;
//        }
//
//        if(buildpathManager.setupVariables() && buildpathManager.variablesAreInUse()) {
//          WorkspaceJob job = new WorkspaceJob(Messages.MavenJdtPlugin_job_name) {
//
//            public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
//              ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, monitor);
//              return Status.OK_STATUS;
//            }
//
//          };
//          job.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().buildRule());
//          job.schedule();
//        }
//      }
//    });
//
//    this.launchConfigurationListener = new MavenLaunchConfigurationListener();
//    DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(launchConfigurationListener);
//    projectManager.addMavenProjectChangedListener(launchConfigurationListener);
//
//    this.mavenClassifierManager = new MavenClassifierManager();
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
