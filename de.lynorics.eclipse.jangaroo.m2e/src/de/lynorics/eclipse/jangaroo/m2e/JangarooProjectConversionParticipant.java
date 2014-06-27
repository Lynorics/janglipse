/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.m2e;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2e.core.project.conversion.AbstractProjectConversionParticipant;


public class JangarooProjectConversionParticipant extends AbstractProjectConversionParticipant {

  private static final String DEFAULT_JANGAROO_SOURCE = "src/main/joo"; //$NON-NLS-1$
  private static final String DEFAULT_GENERATED_SOURCE = "target/generated-sources/joo"; //$NON-NLS-1$

  private static final String DEFAULT_RESOURCES = "src/main/resources"; //$NON-NLS-1$
  private static final String DEFAULT_GENERATED_RESOURCES = "target/generated-resources"; //$NON-NLS-1$

  private static final String COMPILER_GROUP_ID = "net.jangaroo"; //$NON-NLS-1$
  private static final String COMPILER_ARTIFACT_ID = "maven-compiler-plugin"; //$NON-NLS-1$
  private static final String DEFAULT_COMPILER_VERSION = "2.0.8"; //$NON-NLS-1$

  private static final String TARGET_KEY = "target"; //$NON-NLS-1$
  private static final String SOURCE_KEY = "source"; //$NON-NLS-1$

  private static final String CONFIGURATION_KEY = "configuration"; //$NON-NLS-1$

  public boolean accept(IProject project) throws CoreException {
    boolean accepts = project != null && project.isAccessible();// TODO Nature erkennen && project.hasNature(JavaCore.NATURE_ID);
    return accepts;
  }

  public void convert(IProject project, Model model, IProgressMonitor monitor) throws CoreException {
    if(!accept(project)) {
      return;
    }
    IJavaProject javaProject = null;//TODO JavaCore.create(project);
    if(javaProject == null) {
      return;
    }

//    log.debug("Applying Jangaroo conversion to " + project.getName()); //$NON-NLS-1$

    configureBuildSourceDirectories(model, javaProject);

//    //Read existing Eclipse compiler settings
//    String source = javaProject.getOption(JavaCore.COMPILER_SOURCE, false);
//    String target = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, false);
//
//    //We want to keep pom.xml configuration to a minimum so we rely on convention. If the java version == 1.5,
//    //we shouldn't need to add anything as recent maven-compiler-plugin versions target Java 1.5 by default
//    if(DEFAULT_JAVA_VERSION.equals(source) && DEFAULT_JAVA_VERSION.equals(target)) {
//      return;
//    }
//
//    //Configure Java version
//    boolean useProperties = false;//TODO Use preferences
//    if(useProperties) {
//      configureProperties(model, source, target);
//    } else {
//      configureCompilerPlugin(model, source, target);
//    }

  }

//  private void configureProperties(Model model, String source, String target) {
//    Properties properties = model.getProperties();
//    if(properties == null) {
//      properties = new Properties();
//      model.setProperties(properties);
//    }
//    properties.setProperty("maven.compiler.source", source); //$NON-NLS-1$
//    properties.setProperty("maven.compiler.target", target); //$NON-NLS-1$
//  }

//  private void configureCompilerPlugin(Model model, String source, String target) {
//    Build build = getOrCreateBuild(model);
//    model.setBuild(build);
//
//    Plugin compiler = getOrCreateCompilerPlugin(build);
//
//    Xpp3Dom configuration = (Xpp3Dom) compiler.getConfiguration();
//    if(configuration == null) {
//      configuration = new Xpp3Dom(CONFIGURATION_KEY);
//      compiler.setConfiguration(configuration);
//    }
//
//    Xpp3Dom sourceDom = configuration.getChild(SOURCE_KEY);
//    if(sourceDom == null) {
//      sourceDom = new Xpp3Dom(SOURCE_KEY);
//      configuration.addChild(sourceDom);
//    }
//    sourceDom.setValue(source);
//
//    Xpp3Dom targetDom = configuration.getChild(TARGET_KEY);
//    if(targetDom == null) {
//      targetDom = new Xpp3Dom(TARGET_KEY);
//      configuration.addChild(targetDom);
//    }
//    targetDom.setValue(target);
//    compiler.setConfiguration(configuration);
//  }

//  private Plugin getOrCreateCompilerPlugin(Build build) {
//    build.flushPluginMap();//We need to force the re-generation of the plugin map as it may be stale
//    Plugin compiler = build.getPluginsAsMap().get(COMPILER_GROUP_ID + ":" + COMPILER_ARTIFACT_ID); //$NON-NLS-1$  
//    if(compiler == null) {
//      compiler = build.getPluginsAsMap().get(COMPILER_ARTIFACT_ID);
//    }
//    if(compiler == null) {
//      compiler = new Plugin();
//      compiler.setGroupId(COMPILER_GROUP_ID);
//      compiler.setArtifactId(COMPILER_ARTIFACT_ID);
//      compiler.setVersion(getCompilerVersion());
//      build.addPlugin(compiler);
//    }
//
//    return compiler;
//  }

  private void configureBuildSourceDirectories(Model model, IJavaProject javaProject) throws CoreException {
    IClasspathEntry[] entries = javaProject.getRawClasspath();
    Set<String> sources = new LinkedHashSet<String>();
    Set<String> potentialTestSources = new LinkedHashSet<String>();
    Set<String> potentialResourceDirectories = new LinkedHashSet<String>();
    Set<String> potentialTestResourceDirectories = new LinkedHashSet<String>();
    IPath projectPath = javaProject.getPath();

    for(int i = 0; i < entries.length; i++ ) {
      if(entries[i].getEntryKind() == IClasspathEntry.CPE_SOURCE) {
        IPath path = entries[i].getPath().makeRelativeTo(projectPath);
        if(path.isAbsolute()) {
          //We only support paths relative to the project root, so we skip this one
          continue;
        }
        String portablePath = path.toPortableString();
        boolean isPotentialTestSource = isPotentialTestSource(path);
        boolean isResource = false;
        if(isPotentialTestSource) {
//          if(DEFAULT_TEST_RESOURCES.equals(portablePath)) {
//            isResource = potentialTestResourceDirectories.add(portablePath);
//          } else {
//            potentialTestSources.add(portablePath);
//          }
        } else {
          if(DEFAULT_RESOURCES.equals(portablePath)) {
            isResource = potentialResourceDirectories.add(portablePath);
          } else {
            sources.add(portablePath);
          }
        }

        if(!isResource) {
          //For source folders not already flagged as resource folder, check if 
          // they contain non-java sources, so we can add them as resources too
          boolean hasNonJangarooResources = false;
          IFolder folder = javaProject.getProject().getFolder(path);
          if(folder.isAccessible()) {
            NonJangarooResourceVisitor nonJangarooResourceVisitor = new NonJangarooResourceVisitor();
            try {
              folder.accept(nonJangarooResourceVisitor);
            } catch(NonJangarooResourceFoundException ex) {
              //Expected
              hasNonJangarooResources = true;
            } catch(CoreException ex) {
              //385666 ResourceException is thrown in Helios
              if(ex.getCause() instanceof NonJangarooResourceFoundException) {
                hasNonJangarooResources = true;
              } else {
//                log.error("An error occured while analysing {} : {}", folder, ex.getMessage());
              }
            }
          }

          if(hasNonJangarooResources) {
            if(isPotentialTestSource) {
              potentialTestResourceDirectories.add(portablePath);
            } else {
              potentialResourceDirectories.add(portablePath);
            }
          }
        }
      }
    }

    Build build = getOrCreateBuild(model);

    if(!sources.isEmpty()) {
      if(sources.size() > 1) {
        //We don't know how to handle multiple sources, i.e. how to map to a resource or test source directory
        //That should be dealt by setting the build-helper-plugin config (http://mojo.codehaus.org/build-helper-maven-plugin/usage.html)
//        log.warn("{} has multiple source entries, this is not supported yet", model.getArtifactId()); //$NON-NLS-1$
      }
      String sourceDirectory = sources.iterator().next();
      if(!DEFAULT_JANGAROO_SOURCE.equals(sourceDirectory)) {
        build.setSourceDirectory(sourceDirectory);
      }

      for(String resourceDirectory : potentialResourceDirectories) {
        if(!DEFAULT_RESOURCES.equals(resourceDirectory) || potentialResourceDirectories.size() > 1) {
          build.addResource(createResource(resourceDirectory));
        }
      }
    }

    if(!potentialTestSources.isEmpty()) {
      if(potentialTestSources.size() > 1) {
//        log.warn("{} has multiple test source entries, this is not supported yet", model.getArtifactId()); //$NON-NLS-1$
      }
//      String testSourceDirectory = potentialTestSources.iterator().next();
//      if(!DEFAULT_JAVA_TEST_SOURCE.equals(testSourceDirectory)) {
//        build.setTestSourceDirectory(testSourceDirectory);
//      }
//      for(String resourceDirectory : potentialTestResourceDirectories) {
//        if(!DEFAULT_TEST_RESOURCES.equals(resourceDirectory) || potentialTestResourceDirectories.size() > 1) {
//          build.addTestResource(createResource(resourceDirectory));
//        }
//      }
    }

    //Ensure we don't attach a new empty build definition to the model
    if(build.getSourceDirectory() != null || build.getTestSourceDirectory() != null || !build.getResources().isEmpty()
        || !build.getTestResources().isEmpty()) {
      model.setBuild(build);
    }
  }

  private Resource createResource(String resourceDirectory) {
    Resource r = new Resource();
    r.setDirectory(resourceDirectory);
    r.addExclude("**/*.java"); //$NON-NLS-1$
    return r;
  }

  /**
   * Checks if a given path has one of its segment ending with test or tests
   */
  private boolean isPotentialTestSource(IPath path) {
    for(String segment : path.segments()) {
      String folderName = segment.toLowerCase();
      if(folderName.matches(".*tests?")) { //$NON-NLS-1$
        return true;
      }
    }
    return false;
    //TODO Maybe check if the folder has java files with a Test or TestSuite suffix? 
  }

  private Build getOrCreateBuild(Model model) {
    Build build = model.getBuild();
    if(build == null) {
      build = new Build();
    }
    return build;
  }

  /**
   * Visitor implementation looking for non-Java resources. as soon as such resource is found, a
   * {@link NonJangarooResourceFoundException} is thrown.
   */
  private static class NonJangarooResourceVisitor implements IResourceVisitor {

    //TODO either declare a complete list of extensions or switch to
    // a different "ignore resource" strategy
    private static final List<String> IGNORED_EXTENSIONS = Arrays.asList(".svn"); //$NON-NLS-1$

    public NonJangarooResourceVisitor() {
    }

    @SuppressWarnings("unused")
    public boolean visit(IResource resource) throws CoreException {
      String resourceName = resource.getProjectRelativePath().lastSegment();
      if(resource.isHidden() || isIgnored(resourceName)) {
        return false;
      }
      if(resource instanceof IFile) {
        IFile file = (IFile) resource;
        if(!"java".equals(file.getFileExtension())) {
          throw new NonJangarooResourceFoundException();
        }
      }
      return true;
    }

    private boolean isIgnored(String resourceName) {
      for(String extension : IGNORED_EXTENSIONS) {
        if(resourceName.endsWith(extension)) {
          return true;
        }
      }
      return false;
    }
  }

  private static class NonJangarooResourceFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NonJangarooResourceFoundException() {
    }

    @Override
    public Throwable fillInStackTrace() {
      //Overriding fillInStackTrace() reduces the stacktrace creation overhead,
      //unneeded since this exception is used for flow control.
      return this;
    }
  }

//  private String getCompilerVersion() {
//    //For test purposes only, must not be considered API behavior.
//    String version = System.getProperty("org.eclipse.m2e.jdt.conversion.compiler.version");//$NON-NLS-1$
//    if(version != null) {
//      return version;
//    }
//    return getMostRecentPluginVersion(COMPILER_GROUP_ID, COMPILER_ARTIFACT_ID, DEFAULT_COMPILER_VERSION);
//  }

  /**
   * Returns the highest, non-snapshot plugin version between the given reference version and the versions found in the
   * Nexus indexes.
   */
//  @SuppressWarnings("restriction")
//  //TODO extract as API when stabilized?
//  private String getMostRecentPluginVersion(String groupId, String artifactId, String referenceVersion) {
//    Assert.isNotNull(groupId, "groupId can not be null");
//    Assert.isNotNull(artifactId, "artifactId can not be null");
//    String version = referenceVersion;
//    String partialKey = artifactId + " : " + groupId; //$NON-NLS-1$
//    try {
//      IIndex index = MavenPlugin.getIndexManager().getAllIndexes();
//      SearchExpression a = new SourcedSearchExpression(artifactId);
//
//      //For some reason, an exact search using : 
//      //ISearchEngine searchEngine  = M2EUIPluginActivator.getDefault().getSearchEngine(null)
//      //searchEngine.findVersions(groupId, artifactId, searchExpression, packaging)
//      //
//      //doesn't yield the expected results (the latest versions are not returned), so we rely on a fuzzier search
//      //and refine the results.
//      Map<String, IndexedArtifact> values = index.search(a, IIndex.SEARCH_PLUGIN);
//      if(!values.isEmpty()) {
//        SortedSet<ComparableVersion> versions = new TreeSet<ComparableVersion>();
//        ComparableVersion referenceComparableVersion = referenceVersion == null ? null : new ComparableVersion(
//            referenceVersion);
//
//        for(Map.Entry<String, IndexedArtifact> e : values.entrySet()) {
//          if(!(e.getKey().endsWith(partialKey))) {
//            continue;
//          }
//          for(IndexedArtifactFile f : e.getValue().getFiles()) {
//            if(groupId.equals(f.group) && artifactId.equals(f.artifact) && !f.version.contains("SNAPSHOT")) {
//              ComparableVersion v = new ComparableVersion(f.version);
//              if(referenceComparableVersion == null || v.compareTo(referenceComparableVersion) > 0) {
//                versions.add(v);
//              }
//            }
//          }
//          if(!versions.isEmpty()) {
//            List<String> sorted = new ArrayList<String>(versions.size());
//            for(ComparableVersion v : versions) {
//              sorted.add(v.toString());
//            }
//            Collections.reverse(sorted);
//            version = sorted.iterator().next();
//          }
//        }
//      }
//    } catch(CoreException e) {
//      log.error("Can not retrieve latest version of " + partialKey, e);
//    }
//    return version;
//  }
}
