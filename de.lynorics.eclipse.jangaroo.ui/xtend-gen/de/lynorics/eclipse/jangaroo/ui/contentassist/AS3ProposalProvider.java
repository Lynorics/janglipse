/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.AS3ModelUtil;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.ui.contentassist.AbstractAS3ProposalProvider;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class AS3ProposalProvider extends AbstractAS3ProposalProvider {
  @Inject
  private ILabelProvider labelProvider;
  
  /**
   * Code completion for a SymbolRef.
   */
  public void completeTerminalExpression_Symbol(final EObject elem, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    List<EObject> _variablesDefinedBefore = AS3ModelUtil.variablesDefinedBefore(elem);
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      public void apply(final EObject variable) {
        if ((variable instanceof VariableDeclaration)) {
          String _name = ((VariableDeclaration)variable).getName();
          String _name_1 = ((VariableDeclaration)variable).getName();
          String _plus = (_name_1 + " - Variable");
          Image _imageTag = AS3ProposalProvider.this.getImageTag(variable);
          ICompletionProposal _createCompletionProposal = AS3ProposalProvider.this.createCompletionProposal(_name, _plus, _imageTag, context);
          acceptor.accept(_createCompletionProposal);
        } else {
          if ((variable instanceof MemberVariableDeclaration)) {
            VariableDeclaration _decl = ((MemberVariableDeclaration)variable).getDecl();
            String _name_2 = _decl.getName();
            VariableDeclaration _decl_1 = ((MemberVariableDeclaration)variable).getDecl();
            String _name_3 = _decl_1.getName();
            String _plus_1 = (_name_3 + " - Package variable");
            Image _imageTag_1 = AS3ProposalProvider.this.getImageTag(variable);
            ICompletionProposal _createCompletionProposal_1 = AS3ProposalProvider.this.createCompletionProposal(_name_2, _plus_1, _imageTag_1, context);
            acceptor.accept(_createCompletionProposal_1);
          } else {
            if ((variable instanceof Parameter)) {
              String _name_4 = ((Parameter)variable).getName();
              String _name_5 = ((Parameter)variable).getName();
              String _plus_2 = (_name_5 + " - Parameter");
              Image _imageTag_2 = AS3ProposalProvider.this.getImageTag(variable);
              ICompletionProposal _createCompletionProposal_2 = AS3ProposalProvider.this.createCompletionProposal(_name_4, _plus_2, _imageTag_2, context);
              acceptor.accept(_createCompletionProposal_2);
            }
          }
        }
      }
    };
    IterableExtensions.<EObject>forEach(_variablesDefinedBefore, _function);
  }
  
  private Image getImageTag(final EObject object) {
    if ((this.labelProvider instanceof ILabelProviderImageDescriptorExtension)) {
      ILabelProviderImageDescriptorExtension ext = ((ILabelProviderImageDescriptorExtension) this.labelProvider);
      ImageDescriptor descriptor = ext.getImageDescriptor(object);
      boolean _notEquals = (!Objects.equal(descriptor, null));
      if (_notEquals) {
        return descriptor.createImage();
      }
    }
    return null;
  }
}
