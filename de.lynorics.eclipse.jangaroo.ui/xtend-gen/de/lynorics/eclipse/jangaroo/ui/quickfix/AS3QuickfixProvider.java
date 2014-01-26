/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.quickfix;

import de.lynorics.eclipse.jangaroo.validation.AS3Validator;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Custom quickfixes.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
@SuppressWarnings("all")
public class AS3QuickfixProvider extends DefaultQuickfixProvider {
  @Fix(AS3Validator.CLASS_SHOULD_START_WITH_CAPITAL_LETTER)
  public void capitalizeClass(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
        Integer _offset_1 = issue.getOffset();
        String _upperCase = firstLetter.toUpperCase();
        xtextDocument.replace((_offset_1).intValue(), 1, _upperCase);
      }
    };
    acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", _function);
  }
  
  @Fix(AS3Validator.INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER)
  public void capitalizeInterface(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
        Integer _offset_1 = issue.getOffset();
        String _upperCase = firstLetter.toUpperCase();
        xtextDocument.replace((_offset_1).intValue(), 1, _upperCase);
      }
    };
    acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", _function);
  }
  
  @Fix(AS3Validator.METHOD_SHOULD_START_WITH_LOWERCASE)
  public void lowercaseMethod(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
        Integer _offset_1 = issue.getOffset();
        String _lowerCase = firstLetter.toLowerCase();
        xtextDocument.replace((_offset_1).intValue(), 1, _lowerCase);
      }
    };
    acceptor.accept(issue, "Lowercase name", "Lowercase the name.", "upcase.png", _function);
  }
  
  @Fix(AS3Validator.PACKAGE_SHOULD_START_WITH_LOWERCASE)
  public void lowercasePackage(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
        Integer _offset_1 = issue.getOffset();
        String _lowerCase = firstLetter.toLowerCase();
        xtextDocument.replace((_offset_1).intValue(), 1, _lowerCase);
      }
    };
    acceptor.accept(issue, "Lowercase name", "Lowercase the name.", "upcase.png", _function);
  }
}
