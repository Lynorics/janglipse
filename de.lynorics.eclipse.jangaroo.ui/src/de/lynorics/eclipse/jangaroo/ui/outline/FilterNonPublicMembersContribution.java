/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;

public class FilterNonPublicMembersContribution 
    extends AbstractFilterOutlineContribution {
 
  public static final String PREFERENCE_KEY = 
    "ui.outline.filterOperations.nonPublicMembers";
 
  @Inject
  private PluginImageHelper imageHelper;
  
  @Override
  protected boolean apply(IOutlineNode node) {
    return !(node instanceof EObjectNode)
        || (node instanceof MemberVariableDeclaration) &&
          !(((EObjectNode) node).getEClass()
          .equals(AS3Package.Literals.MEMBER_VARIABLE_DECLARATION) &&
          ((MemberVariableDeclaration) node).getModifier() != null &&
        		  ((MemberVariableDeclaration) node).getModifier().getAccess() != null &&
          (AccessLevel.PRIVATE.getName().equals(((MemberVariableDeclaration) node).getModifier().getAccess().getName())));
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