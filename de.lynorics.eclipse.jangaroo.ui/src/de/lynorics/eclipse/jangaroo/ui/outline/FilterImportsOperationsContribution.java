package de.lynorics.eclipse.jangaroo.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;

public class FilterImportsOperationsContribution 
    extends AbstractFilterOutlineContribution {
 
  public static final String PREFERENCE_KEY = 
    "ui.outline.filterOperations.imports";
 
  @Inject
  private PluginImageHelper imageHelper;
  
  @Override
  protected boolean apply(IOutlineNode node) {
    return !(node instanceof EObjectNode)
        || !((EObjectNode) node).getEClass()
          .equals(AS3Package.Literals.IMPORT);
  }
 
  @Override
  public String getPreferenceKey() {
    return PREFERENCE_KEY;
  }
 
  @Override
  protected void configureAction(Action action) {
    action.setText("Hide imports");
    action.setDescription("Hide imports");
    action.setToolTipText("Hide imports");
    action.setImageDescriptor(getImageDescriptor());
  }
 
  protected ImageDescriptor getImageDescriptor() {
    return ImageDescriptor.createFromImage(
      imageHelper.getImage("outline-imports.gif"));
  }

}