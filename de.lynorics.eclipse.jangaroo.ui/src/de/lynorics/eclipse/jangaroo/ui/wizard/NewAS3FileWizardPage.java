/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Joiner;

import de.lynorics.eclipse.jangaroo.ui.JangarooProjectHelper;

public class NewAS3FileWizardPage extends AbstractFileWizardPage {

	protected String template;
	protected Text packageText;

	public NewAS3FileWizardPage(ISelection selection) {
		super("wizardPage", selection);
	}

	@Override
	public void createContent(Composite parent) {
		createContainerContent(parent);
		createPackageContent(parent);
		createFileContent(parent);
		createTemplateContent(parent);
	}

	@Override
	protected void createContainerContentLable(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("Source &folder:");
	}

	@Override
	protected void createFileContentLable(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("File &name:");
	}

	protected void createPackageContent(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("&Package:");
		packageText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		packageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		packageText.addModifyListener(this);
		new Label(parent, SWT.NULL);
	}

	protected void createTemplateContent(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("Template:");
		SelectionAdapter adapter = new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Button b = (Button) e.widget;
				template = b.getText().replaceAll("&", "");
			}
		};
		Composite group = new Composite(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setLayout(new RowLayout());
		createTemplateRadioButton(group, "&Simple", adapter);
		createTemplateRadioButton(group, "&Class", adapter).setSelection(true);
		createTemplateRadioButton(group, "&Interface", adapter);
		template = "Class";
	}

	protected Button createTemplateRadioButton(Composite group, String name,
			SelectionAdapter adapter) {
		Button button = new Button(group, SWT.RADIO);
		button.setText(name);
		button.addSelectionListener(adapter);
		return button;
	}

	@Override
	protected void initializeFocus() {
		packageText.setSelection(packageText.getText().length());
		packageText.setFocus();
	}

	protected IPath computeRootPath(IResource res, Iterable<IPath> sourcePaths) {
		if (res.getType() == IResource.PROJECT) {
			Iterator<IPath> iterator = sourcePaths.iterator();
			return iterator.hasNext() ? iterator.next() : null;
		}
		IPath fullPath = res.getFullPath();
		for (IPath path : sourcePaths) {
			if (path.isPrefixOf(fullPath))
				return path;
		}
		return null;
	}

	protected String computePackageName(IResource res, IResource cont) {
		IPath result = res.getFullPath();
		if (res.getType() == IResource.FILE)
			result = result.removeLastSegments(0);
		int matchingSegments = result.matchingFirstSegments(cont.getFullPath());
		result = result.removeFirstSegments(matchingSegments);
		return Joiner.on('.').join(result.segments());
	}

	public static List<IPath> getProjectSourceDirectories (IProject project) {
	    List<IPath> paths = new ArrayList<IPath>();
	    try {
			if (project.isOpen() && project.getNature(JangarooProjectHelper.NATURE_ID) != null){
			    IJavaProject javaProject = JavaCore.create(project);
			    IClasspathEntry[] classpathEntries = null;
				classpathEntries = javaProject.getResolvedClasspath(true);
			    for(int i = 0; i<classpathEntries.length;i++){
			        IClasspathEntry entry = classpathEntries[i];
			        if(entry.getContentKind() == IPackageFragmentRoot.K_SOURCE){
			            paths.add(entry.getPath());
			        }
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return paths;
	}
	
	@Override
	protected void initializeWithSelection(IResource resource) {
		Iterable<IPath> sourcePaths = getProjectSourceDirectories(resource.getProject());
		IPath rootPath = computeRootPath(resource, sourcePaths);
		if (rootPath == null)
			return;
		IWorkspaceRoot wsroot = resource.getWorkspace().getRoot();
		IResource cont = wsroot.findMember(rootPath);
		if (cont != null) {
			String pack = computePackageName(resource, cont);
			if (pack != null && pack.length() > 0)
				packageText.setText(pack);
		} else {
			if (resource instanceof IContainer)
				cont = (IContainer) resource;
			else
				cont = resource.getParent();
		}
		containerText.setText(cont.getFullPath().toString());
	}

	@Override
	protected void dialogChanged() {
		String fileName = getFileName();
		int indexOf = fileName.indexOf('.');
		if (indexOf > 0 && !fileName.matches("^[^.]+\\" + getExtension() + "$")) {
			updateStatus("Type name must not contain dots");
		} else {
			super.dialogChanged();
		}
	}

	public String getPackageName() {
		return packageText.getText();
	}

	public IPath getPackagePath() {
		return getContainerPath().append(getPackageName().replace('.', '/'))
				.addTrailingSeparator();
	}

	@Override
	public IPath getFilePath() {
		return getPackagePath().append(getFileName());
	}

	public String getTemplate() {
		return template;
	}

	@Override
	public String getExtension() {
		return ".as";
	}
}