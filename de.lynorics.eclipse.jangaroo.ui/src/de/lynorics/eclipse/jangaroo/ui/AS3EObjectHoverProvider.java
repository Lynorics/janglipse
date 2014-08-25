/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension;

import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.ui.labeling.AS3LabelProvider;

public class AS3EObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Inject
 	private ILabelProvider labelProvider;
	
	@Override
	protected String getFirstLine(EObject o) {

		if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Class) {
			de.lynorics.eclipse.jangaroo.aS3.Class myclass = (de.lynorics.eclipse.jangaroo.aS3.Class)o;
			EObject mycontainer = myclass.eContainer();
			String name = myclass.getName();
			if (mycontainer instanceof de.lynorics.eclipse.jangaroo.aS3.Package) {
				String packagename = ((de.lynorics.eclipse.jangaroo.aS3.Package)mycontainer).getName();
				if (packagename != null && !"".equals(packagename)) {
					name = packagename + "." + name;
				}
			}
			return buildDescription(o, name);
		}
		else if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Interface) {
			de.lynorics.eclipse.jangaroo.aS3.Interface myclass = (de.lynorics.eclipse.jangaroo.aS3.Interface)o;
			EObject mycontainer = myclass.eContainer();
			String name = myclass.getName();
			if (mycontainer instanceof de.lynorics.eclipse.jangaroo.aS3.Package) {
				String packagename = ((de.lynorics.eclipse.jangaroo.aS3.Package)mycontainer).getName();
				if (packagename != null && !"".equals(packagename)) {
					name = packagename + "." + name;
				}
			}
			return buildDescription(o, name);
		}
		else if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Method) {
			de.lynorics.eclipse.jangaroo.aS3.Method mymethod = (de.lynorics.eclipse.jangaroo.aS3.Method)o;
			EObject mycontainer = mymethod.eContainer();
			String name = mymethod.getName();
			if (mycontainer instanceof de.lynorics.eclipse.jangaroo.aS3.Package) {
				String packagename = ((de.lynorics.eclipse.jangaroo.aS3.Package)mycontainer).getName();
				if (packagename != null && !"".equals(packagename)) {
					name = packagename + "." + name;
				}
			}
			return buildDescription(o, name);
		}
		else if (o instanceof VariableDeclaration) {
			VariableDeclaration decl = (VariableDeclaration)o;
			return buildDescription(o, decl.getName()) + ": " + AS3LabelProvider.getNameOfType(decl.getType());
		}
		else if (o instanceof MemberVariableDeclaration) {
			MemberVariableDeclaration decl = (MemberVariableDeclaration)o;
			return buildDescription(o, decl.getName()) + ": " + AS3LabelProvider.getNameOfType(decl.getType());
		}
		else if (o instanceof Parameter) {
			Parameter param = (Parameter)o;
			return buildDescription(o, param.getName()) + ": " + AS3LabelProvider.getNameOfType(param.getType());
		}
		return super.getFirstLine(o);
	}

	private String buildDescription(EObject o, String name) {
		StringBuilder builder = new StringBuilder();
		String imageTag = getImageTag(o);
		if (imageTag != null) {
			builder.append(imageTag);
			builder.append("&nbsp;");
		}
		builder.append("<b>" + name + "</b>");
		return builder.toString();
	}


	private String getImageTag(final EObject object) {
		if (labelProvider instanceof ILabelProviderImageDescriptorExtension) {
			ILabelProviderImageDescriptorExtension extension = (ILabelProviderImageDescriptorExtension) labelProvider;
			ImageDescriptor descriptor = extension.getImageDescriptor(object);
			if (descriptor != null)
				return getImageTagLink(descriptor);
		}
		return null;
	}

	private String getImageTagLink(ImageDescriptor imageDescriptor) {
		URL url = getURL(imageDescriptor);
		if (url != null)
			return "<image src='" + url.toExternalForm() + "'/>";
		return "";
	}

	private URL getURL(ImageDescriptor descriptor) {
		return JavaPlugin.getDefault().getImagesOnFSRegistry().getImageURL(descriptor);
	}
}