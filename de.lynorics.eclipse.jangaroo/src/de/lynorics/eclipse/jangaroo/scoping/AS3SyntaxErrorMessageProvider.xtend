package de.lynorics.eclipse.jangaroo.scoping import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider
import com.google.inject.Inject
import org.eclipse.xtext.IGrammarAccess
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage

class AS3SyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {

    public static val String USED_RESERVED_KEYWORD = "USED_RESERVED_KEYWORD" 

    @Inject
    IGrammarAccess grammarAccess

    /**
     * Customized error message for reserved keywords
     */
    override getSyntaxErrorMessage(IParserErrorContext context) {
        val unexpectedText = context?.recognitionException?.token?.text;
        if (GrammarUtil::getAllKeywords(grammarAccess.getGrammar()).contains(unexpectedText)) {
            return new SyntaxErrorMessage('''"«unexpectedText»" is a reserved keyword which is not allowed as Identifier. Please choose another word.''',
            USED_RESERVED_KEYWORD);
        }
        super.getSyntaxErrorMessage(context);
    }

}
