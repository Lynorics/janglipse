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

import com.google.inject.Inject;

public class FilterUsesOperationsContribution 
    extends AbstractFilterOutlineContribution {
 
  public static final String PREFERENCE_KEY = 
    "ui.outline.filterOperations.uses";
 
  @Inject
  private PluginImageHelper imageHelper;
  
  @Override
  protected boolean apply(IOutlineNode node) {
    return false;
//    		!(node instanceof EObjectNode)
//        || !((EObjectNode) node).getEClass()
//          .equals(AS3Package.Literals.USES);
  }
 
  @Override
  public String getPreferenceKey() {
    return PREFERENCE_KEY;
  }
 
  @Override
  protected void configureAction(Action action) {
    action.setText("Hide uses");
    action.setDescription("Hide uses");
    action.setToolTipText("Hide uses");
    action.setImageDescriptor(getImageDescriptor());
  }
 
  protected ImageDescriptor getImageDescriptor() {
    return ImageDescriptor.createFromImage(
      imageHelper.getImage("outline-uses-filter.gif"));
  }

}