/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.outline;

import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.ITextRegion;

import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Class;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;

public class FilterNonPublicMembersContribution 
    extends AbstractFilterOutlineContribution {
 
  public static final String PREFERENCE_KEY = 
    "ui.outline.filterOperations.nonPublicMembers";
 
  @Inject
  private PluginImageHelper imageHelper;
  
  /*
   * @return false if object should be visible even filter is active, false if object is hidden by filter
   */
  @Override
  protected boolean apply(IOutlineNode node) {
	  if (!(node instanceof EObjectNode)) {
		  return false;
	  }
	  EObjectNode eon = (EObjectNode) node;
		if (eon.getEClass().equals(AS3Package.Literals.METHOD)) {
			ITextRegion ftr = eon.getFullTextRegion();
			try {
				String text = eon.getDocument().get(ftr.getOffset(), ftr.getLength());
				return (text.split("\n")[0].indexOf("public") >= 0);
			} catch (BadLocationException e) {
				e.printStackTrace();
			} 
		}
		else if (eon.getEClass().equals(AS3Package.Literals.MEMBER_VARIABLE_DECLARATION)) {
			ITextRegion ftr = eon.getFullTextRegion();
			try {
				String text = eon.getDocument().get(ftr.getOffset(), ftr.getLength());
				return (text.split("\n")[0].indexOf("public") >= 0);
			} catch (BadLocationException e) {
				e.printStackTrace();
			} 
		}
    return true;
  }
 
  @Override
  public String getPreferenceKey() {
    return PREFERENCE_KEY;
  }
 
  @Override
  protected void configureAction(Action action) {
    action.setText("Hide non-public members");
    action.setDescription("Hide non-public members");
    action.setToolTipText("Hide non-public members");
    action.setImageDescriptor(getImageDescriptor());
  }
 
  protected ImageDescriptor getImageDescriptor() {
    return ImageDescriptor.createFromImage(
      imageHelper.getImage("outline-function-public.gif"));
  }

}