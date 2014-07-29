/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.formatting;

import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class AS3Formatter extends AbstractDeclarativeFormatter {
  @Inject
  private AS3GrammarAccess g;
  
  protected void configureFormatting(final FormattingConfig c) {
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this.g.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this.g.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this.g.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    c.setAutoLinewrap(120);
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this.g.findKeywordPairs("(", ")");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first = pair.getFirst();
        _setNoSpace.after(_first);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second = pair.getSecond();
        _setNoSpace_1.before(_second);
      }
    }
    List<Keyword> _findKeywords = this.g.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
      _setNoSpace.before(comma);
    }
    List<Keyword> _findKeywords_1 = this.g.findKeywords(":");
    for (final Keyword colon : _findKeywords_1) {
      FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
      _setNoSpace_1.before(colon);
    }
    List<Keyword> _findKeywords_2 = this.g.findKeywords("(");
    for (final Keyword bracket : _findKeywords_2) {
      FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
      _setNoSpace_2.before(bracket);
    }
    List<Keyword> _findKeywords_3 = this.g.findKeywords(";");
    for (final Keyword semicolon : _findKeywords_3) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        _setNoSpace_3.before(semicolon);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap();
        _setLinewrap_3.after(semicolon);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_1 = this.g.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair_1 : _findKeywordPairs_1) {
      {
        Keyword _first = pair_1.getFirst();
        Keyword _second = pair_1.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap();
        Keyword _first_1 = pair_1.getFirst();
        _setLinewrap_3.before(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap();
        Keyword _first_2 = pair_1.getFirst();
        _setLinewrap_4.after(_first_2);
        FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap();
        Keyword _second_1 = pair_1.getSecond();
        _setLinewrap_5.after(_second_1);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_2 = this.g.findKeywordPairs("[", "]");
    for (final Pair<Keyword, Keyword> pair_2 : _findKeywordPairs_2) {
      {
        Keyword _first = pair_2.getFirst();
        Keyword _second = pair_2.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap();
        Keyword _first_1 = pair_2.getFirst();
        _setLinewrap_3.before(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap();
        Keyword _second_1 = pair_2.getSecond();
        _setLinewrap_4.after(_second_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        Keyword _first_2 = pair_2.getFirst();
        _setNoSpace_3.after(_first_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_4 = c.setNoSpace();
        Keyword _second_2 = pair_2.getSecond();
        _setNoSpace_4.before(_second_2);
      }
    }
    final AS3GrammarAccess.PackageElements pac = this.g.getPackageAccess();
    FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap();
    Keyword _rightCurlyBracketKeyword_7 = pac.getRightCurlyBracketKeyword_7();
    _setLinewrap_3.after(_rightCurlyBracketKeyword_7);
    final AS3GrammarAccess.ClassElements cla = this.g.getClassAccess();
    FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap();
    RuleCall _annotationsAnnotationParserRuleCall_0_0 = cla.getAnnotationsAnnotationParserRuleCall_0_0();
    _setLinewrap_4.before(_annotationsAnnotationParserRuleCall_0_0);
    final AS3GrammarAccess.InterfaceElements intf = this.g.getInterfaceAccess();
    final AS3GrammarAccess.InterfaceMethodElements intfmethod = this.g.getInterfaceMethodAccess();
    FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(2);
    Keyword _colonKeyword_2_4_0 = intfmethod.getColonKeyword_2_4_0();
    _setLinewrap_5.after(_colonKeyword_2_4_0);
    final AS3GrammarAccess.MethodElements method = this.g.getMethodAccess();
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(2);
    RuleCall _annotationsAnnotationParserRuleCall_0_0_1 = method.getAnnotationsAnnotationParserRuleCall_0_0();
    _setLinewrap_6.before(_annotationsAnnotationParserRuleCall_0_0_1);
    final AS3GrammarAccess.MemberVariableDeclarationElements membervari = this.g.getMemberVariableDeclarationAccess();
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(1);
    Keyword _semicolonKeyword_2 = membervari.getSemicolonKeyword_2();
    _setLinewrap_7.after(_semicolonKeyword_2);
    FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
    Keyword _semicolonKeyword_2_1 = membervari.getSemicolonKeyword_2();
    _setNoSpace_3.before(_semicolonKeyword_2_1);
  }
}
