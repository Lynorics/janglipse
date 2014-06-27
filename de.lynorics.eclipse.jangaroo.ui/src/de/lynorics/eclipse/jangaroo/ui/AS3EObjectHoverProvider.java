/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;
 
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenUtil;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import com.google.inject.Inject;
 
public class AS3EObjectHoverProvider extends DefaultEObjectHoverProvider {
 
	@Inject
	protected TokenUtil tokenUtil;
	
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
			String annotation = myclass.getAnnon() != null ? myclass.getAnnon().getName() : null;
			String comment = findComment(o);
			if (comment == null) {
				comment = findComment(((de.lynorics.eclipse.jangaroo.aS3.Class) o).getAnnon());
			}
            return buildDescription(o, name, comment, annotation);
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
			String comment = findComment(o);
            return buildDescription(o, name, comment, null);
        }
        return super.getFirstLine(o);
    }

	private String buildDescription(EObject o, String name, String comment, String annotation) {
		StringBuilder builder = new StringBuilder();
//		URL iconURL = Activator.getDefault().getBundle().getEntry("icons/outline-class.gif"); 
//		builder.append("<img src=\""+iconURL+"\">&nbsp;");
		builder.append("<b>" + name + "</b>");
		builder.append("<br><br>");
		if (annotation != null && !"".equals(annotation)) {
			builder.append("@"+annotation);
		}
		if (comment != null) {
			builder.append(comment);
		}
		return builder.toString();
	}
 
	protected String findComment(EObject o) {
		String returnValue = null;
		ICompositeNode node = NodeModelUtils.getNode(o);
//		if (node.getPreviousSibling() instanceof ICompositeNode && ((ICompositeNode)node.getPreviousSibling()).get instanceof Annotation) {
//			node = ((ICompositeNode)node.getPreviousSibling());
//		}
		if (node != null) {
			// get the last multi line comment before a non hidden leaf node
			for (INode abstractNode : node.getAsTreeIterable()) {
				if (abstractNode instanceof ILeafNode && !((ILeafNode) abstractNode).isHidden())
					break;
				if (abstractNode instanceof ILeafNode && abstractNode.getGrammarElement() instanceof TerminalRule
						&& "ML_COMMENT".equalsIgnoreCase(((TerminalRule) abstractNode.getGrammarElement()).getName())) {
					String comment = ((ILeafNode) abstractNode).getText();
					if (comment.matches("(?s)" + "/\\*\\*?" + ".*")) {
						returnValue = comment;
						break;
					}
				}
			}
		}
		return returnValue;
	}

//	public String getImageTag(final EObject object) {
//		if (labelProvider instanceof ILabelProviderImageDescriptorExtension) {
//			ILabelProviderImageDescriptorExtension extension = (ILabelProviderImageDescriptorExtension) labelProvider;
//			ImageDescriptor descriptor = extension.getImageDescriptor(object);
//			if (descriptor != null)
//				return getImageTagLink(descriptor);
//		}
//		return null;
//	}
//
//	protected String getImageTagLink(ImageDescriptor imageDescriptor) {
//		URL url = getURL(imageDescriptor);
//		if (url != null)
//			return "<image src='" + url.toExternalForm() + "'/>";
//		return "";
//	}
//
//	protected URL getURL(ImageDescriptor descriptor) {
//		return JavaPlugin.getDefault().getImagesOnFSRegistry().getImageURL(descriptor);
//	}
}