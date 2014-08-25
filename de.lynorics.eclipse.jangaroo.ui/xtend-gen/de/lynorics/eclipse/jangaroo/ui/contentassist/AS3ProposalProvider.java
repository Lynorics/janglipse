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
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.ui.contentassist.AbstractAS3ProposalProvider;
import de.lynorics.eclipse.jangaroo.ui.labeling.AS3LabelProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class AS3ProposalProvider extends AbstractAS3ProposalProvider {
  private Pattern alphanumerPattern = Pattern.compile("[^a-zA-Z0-9]");
  
  @Inject
  private ILabelProvider labelProvider;
  
  private final List<String> FILTERED_KEYWORDS = new ArrayList<String>();
  
  /**
   * Konstruktor.
   */
  public AS3ProposalProvider() {
    super();
    CollectionExtensions.<String>addAll(this.FILTERED_KEYWORDS, "get", "null", "set", "void");
  }
  
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
          String _plus = (_name_1 + ": ");
          EObject _type = ((VariableDeclaration)variable).getType();
          String _nameOfType = AS3LabelProvider.getNameOfType(_type);
          String _plus_1 = (_plus + _nameOfType);
          Image _imageTag = AS3ProposalProvider.this.getImageTag(variable);
          ICompletionProposal _createCompletionProposal = AS3ProposalProvider.this.createCompletionProposal(_name, _plus_1, _imageTag, context);
          acceptor.accept(_createCompletionProposal);
        } else {
          if ((variable instanceof MemberVariableDeclaration)) {
            String _name_2 = ((MemberVariableDeclaration)variable).getName();
            String _name_3 = ((MemberVariableDeclaration)variable).getName();
            String _plus_2 = (_name_3 + ": ");
            EObject _type_1 = ((MemberVariableDeclaration)variable).getType();
            String _nameOfType_1 = AS3LabelProvider.getNameOfType(_type_1);
            String _plus_3 = (_plus_2 + _nameOfType_1);
            Image _imageTag_1 = AS3ProposalProvider.this.getImageTag(variable);
            ICompletionProposal _createCompletionProposal_1 = AS3ProposalProvider.this.createCompletionProposal(_name_2, _plus_3, _imageTag_1, context);
            acceptor.accept(_createCompletionProposal_1);
          } else {
            if ((variable instanceof Parameter)) {
              String _name_4 = ((Parameter)variable).getName();
              String _name_5 = ((Parameter)variable).getName();
              String _plus_4 = (_name_5 + ": ");
              EObject _type_2 = ((Parameter)variable).getType();
              String _nameOfType_2 = AS3LabelProvider.getNameOfType(_type_2);
              String _plus_5 = (_plus_4 + _nameOfType_2);
              Image _imageTag_2 = AS3ProposalProvider.this.getImageTag(variable);
              ICompletionProposal _createCompletionProposal_2 = AS3ProposalProvider.this.createCompletionProposal(_name_4, _plus_5, _imageTag_2, context);
              acceptor.accept(_createCompletionProposal_2);
            } else {
              if ((variable instanceof Interface)) {
                String _name_6 = ((Interface)variable).getName();
                String _name_7 = ((Interface)variable).getName();
                Image _imageTag_3 = AS3ProposalProvider.this.getImageTag(variable);
                ICompletionProposal _createCompletionProposal_3 = AS3ProposalProvider.this.createCompletionProposal(_name_6, _name_7, _imageTag_3, context);
                acceptor.accept(_createCompletionProposal_3);
              } else {
                if ((variable instanceof de.lynorics.eclipse.jangaroo.aS3.Class)) {
                  String _name_8 = ((de.lynorics.eclipse.jangaroo.aS3.Class)variable).getName();
                  String _name_9 = ((de.lynorics.eclipse.jangaroo.aS3.Class)variable).getName();
                  Image _imageTag_4 = AS3ProposalProvider.this.getImageTag(variable);
                  ICompletionProposal _createCompletionProposal_4 = AS3ProposalProvider.this.createCompletionProposal(_name_8, _name_9, _imageTag_4, context);
                  acceptor.accept(_createCompletionProposal_4);
                }
              }
            }
          }
        }
      }
    };
    IterableExtensions.<EObject>forEach(_variablesDefinedBefore, _function);
    de.lynorics.eclipse.jangaroo.aS3.Class myclass = AS3ModelUtil.containingClass(elem);
    boolean collectPrivate = true;
    boolean _notEquals = (!Objects.equal(myclass, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        this.collectVariablesOfClass(myclass, context, acceptor, collectPrivate);
        de.lynorics.eclipse.jangaroo.aS3.Class _superclass = myclass.getSuperclass();
        myclass = _superclass;
        collectPrivate = false;
      }
      boolean _notEquals_1 = (!Objects.equal(myclass, null));
      _while = _notEquals_1;
    }
  }
  
  private void collectVariablesOfClass(final de.lynorics.eclipse.jangaroo.aS3.Class clazz, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor, final boolean collectPrivate) {
    List<EObject> _attributes = AS3ModelUtil.attributes(clazz);
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      public void apply(final EObject variable) {
        if ((variable instanceof VariableDeclaration)) {
          String _name = ((VariableDeclaration)variable).getName();
          String _name_1 = ((VariableDeclaration)variable).getName();
          String _plus = (_name_1 + ": ");
          EObject _type = ((VariableDeclaration)variable).getType();
          String _nameOfType = AS3LabelProvider.getNameOfType(_type);
          String _plus_1 = (_plus + _nameOfType);
          Image _imageTag = AS3ProposalProvider.this.getImageTag(variable);
          ICompletionProposal _createCompletionProposal = AS3ProposalProvider.this.createCompletionProposal(_name, _plus_1, _imageTag, context);
          acceptor.accept(_createCompletionProposal);
        } else {
          if ((variable instanceof MemberVariableDeclaration)) {
            String _name_2 = ((MemberVariableDeclaration)variable).getName();
            String _name_3 = ((MemberVariableDeclaration)variable).getName();
            String _plus_2 = (_name_3 + ": ");
            EObject _type_1 = ((MemberVariableDeclaration)variable).getType();
            String _nameOfType_1 = AS3LabelProvider.getNameOfType(_type_1);
            String _plus_3 = (_plus_2 + _nameOfType_1);
            Image _imageTag_1 = AS3ProposalProvider.this.getImageTag(variable);
            ICompletionProposal _createCompletionProposal_1 = AS3ProposalProvider.this.createCompletionProposal(_name_2, _plus_3, _imageTag_1, context);
            acceptor.accept(_createCompletionProposal_1);
          }
        }
      }
    };
    IterableExtensions.<EObject>forEach(_attributes, _function);
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
  
  /**
   * Code completion for keywords.
   */
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    boolean _isFiltered = this.isFiltered(keyword);
    if (_isFiltered) {
      return;
    }
    super.completeKeyword(keyword, contentAssistContext, acceptor);
  }
  
  private boolean isFiltered(final Keyword keyword) {
    boolean _or = false;
    String _value = keyword.getValue();
    Matcher _matcher = this.alphanumerPattern.matcher(_value);
    boolean _find = _matcher.find();
    if (_find) {
      _or = true;
    } else {
      String _value_1 = keyword.getValue();
      boolean _contains = this.FILTERED_KEYWORDS.contains(_value_1);
      _or = _contains;
    }
    return _or;
  }
  
  /**
   * Code completion for primaryExpressions (beginning of expressions).
   */
  public void complete_primaryExpression(final EObject elem, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    de.lynorics.eclipse.jangaroo.aS3.Class myclass = AS3ModelUtil.containingClass(elem);
    boolean collectPrivate = true;
    boolean _notEquals = (!Objects.equal(myclass, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        this.collectMethodsOfClass(myclass, context, acceptor, collectPrivate);
        de.lynorics.eclipse.jangaroo.aS3.Class _superclass = myclass.getSuperclass();
        myclass = _superclass;
        collectPrivate = false;
      }
      boolean _notEquals_1 = (!Objects.equal(myclass, null));
      _while = _notEquals_1;
    }
    boolean _and = false;
    Model _containingModel = AS3ModelUtil.containingModel(elem);
    de.lynorics.eclipse.jangaroo.aS3.Package _package = _containingModel.getPackage();
    boolean _notEquals_1 = (!Objects.equal(_package, null));
    if (!_notEquals_1) {
      _and = false;
    } else {
      Model _containingModel_1 = AS3ModelUtil.containingModel(elem);
      de.lynorics.eclipse.jangaroo.aS3.Package _package_1 = _containingModel_1.getPackage();
      Imports _imp = _package_1.getImp();
      boolean _notEquals_2 = (!Objects.equal(_imp, null));
      _and = _notEquals_2;
    }
    if (_and) {
      Model _containingModel_2 = AS3ModelUtil.containingModel(elem);
      de.lynorics.eclipse.jangaroo.aS3.Package _package_2 = _containingModel_2.getPackage();
      Imports _imp_1 = _package_2.getImp();
      EList<Import> _imports = _imp_1.getImports();
      final Procedure1<Import> _function = new Procedure1<Import>() {
        public void apply(final Import variable) {
          String _importedNamespace = variable.getImportedNamespace();
          String _importedNamespace_1 = variable.getImportedNamespace();
          int _lastIndexOf = _importedNamespace_1.lastIndexOf(".");
          int _plus = (_lastIndexOf + 1);
          String name = _importedNamespace.substring(_plus);
          String _importedNamespace_2 = variable.getImportedNamespace();
          String _importedNamespace_3 = variable.getImportedNamespace();
          int _lastIndexOf_1 = _importedNamespace_3.lastIndexOf(".");
          String path = _importedNamespace_2.substring(0, _lastIndexOf_1);
          Image _imageTag = AS3ProposalProvider.this.getImageTag(variable);
          ICompletionProposal _createCompletionProposal = AS3ProposalProvider.this.createCompletionProposal(name, (((name + " (") + path) + ")"), _imageTag, context);
          acceptor.accept(_createCompletionProposal);
        }
      };
      IterableExtensions.<Import>forEach(_imports, _function);
    }
  }
  
  private void collectMethodsOfClass(final de.lynorics.eclipse.jangaroo.aS3.Class clazz, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor, final boolean collectPrivate) {
    List<EObject> _accessibleFunctions = AS3ModelUtil.accessibleFunctions(clazz);
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      public void apply(final EObject variable) {
        if ((variable instanceof Method)) {
          boolean _or = false;
          if (collectPrivate) {
            _or = true;
          } else {
            Modifier _modifier = ((Method)variable).getModifier();
            AccessLevel _access = _modifier.getAccess();
            String _name = ((AccessLevel) _access).getName();
            boolean _equalsIgnoreCase = "private".equalsIgnoreCase(_name);
            boolean _not = (!_equalsIgnoreCase);
            _or = _not;
          }
          if (_or) {
            String _name_1 = ((Method)variable).getName();
            String _name_2 = ((Method)variable).getName();
            String _plus = (_name_2 + "(...): ");
            EObject _type = ((Method)variable).getType();
            String _nameOfType = AS3LabelProvider.getNameOfType(_type);
            String _plus_1 = (_plus + _nameOfType);
            Image _imageTag = AS3ProposalProvider.this.getImageTag(variable);
            ICompletionProposal _createCompletionProposal = AS3ProposalProvider.this.createCompletionProposal(_name_1, _plus_1, _imageTag, context);
            acceptor.accept(_createCompletionProposal);
          }
        }
      }
    };
    IterableExtensions.<EObject>forEach(_accessibleFunctions, _function);
  }
}
