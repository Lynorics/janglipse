package de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAS3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'package'", "'{'", "'}'", "'import'", "';'", "'class'", "'extends'", "'function'", "'('", "')'", "'var'", "':'", "'unit'", "'='", "'String'", "'int'", "'Number'", "'.'", "'0x000000'", "''", "'0'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAS3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAS3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAS3Parser.tokenNames; }
    public String getGrammarFileName() { return "../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g"; }


     
     	private AS3GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AS3GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:61:1: ( ruleModel EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:69:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:73:2: ( ( ( rule__Model__Alternatives ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:74:1: ( ( rule__Model__Alternatives ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:74:1: ( ( rule__Model__Alternatives ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:75:1: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:76:1: ( rule__Model__Alternatives )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:76:2: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:88:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:89:1: ( rulePackageDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:90:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:97:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:101:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:103:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:104:1: ( rule__PackageDeclaration__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:104:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleActionScript"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:116:1: entryRuleActionScript : ruleActionScript EOF ;
    public final void entryRuleActionScript() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:117:1: ( ruleActionScript EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:118:1: ruleActionScript EOF
            {
             before(grammarAccess.getActionScriptRule()); 
            pushFollow(FOLLOW_ruleActionScript_in_entryRuleActionScript181);
            ruleActionScript();

            state._fsp--;

             after(grammarAccess.getActionScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionScript188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionScript"


    // $ANTLR start "ruleActionScript"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:125:1: ruleActionScript : ( ( rule__ActionScript__Group__0 ) ) ;
    public final void ruleActionScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:129:2: ( ( ( rule__ActionScript__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:130:1: ( ( rule__ActionScript__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:130:1: ( ( rule__ActionScript__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:131:1: ( rule__ActionScript__Group__0 )
            {
             before(grammarAccess.getActionScriptAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:132:1: ( rule__ActionScript__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:132:2: rule__ActionScript__Group__0
            {
            pushFollow(FOLLOW_rule__ActionScript__Group__0_in_ruleActionScript214);
            rule__ActionScript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionScript"


    // $ANTLR start "entryRuleImport"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:145:1: ( ruleImport EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:160:1: ( rule__Import__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:173:1: ( ruleType EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType301);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:188:1: ( rule__Type__Alternatives )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType334);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleProperty"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:201:1: ( ruleProperty EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty361);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:209:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:213:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:214:1: ( ( rule__Property__Alternatives ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:214:1: ( ( rule__Property__Alternatives ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:215:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:216:1: ( rule__Property__Alternatives )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:216:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty394);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleVisibility"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:228:1: entryRuleVisibility : ruleVisibility EOF ;
    public final void entryRuleVisibility() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:229:1: ( ruleVisibility EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:230:1: ruleVisibility EOF
            {
             before(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_ruleVisibility_in_entryRuleVisibility421);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getVisibilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibility428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:237:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:241:2: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:242:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:242:1: ( ( rule__Visibility__Alternatives ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:243:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:244:1: ( rule__Visibility__Alternatives )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:244:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility454);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleClass"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:256:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:257:1: ( ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:258:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass481);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:265:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:269:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:270:1: ( ( rule__Class__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:270:1: ( ( rule__Class__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:271:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:272:1: ( rule__Class__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:272:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass514);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleFunction"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:284:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:285:1: ( ruleFunction EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:286:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction541);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:293:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:297:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:298:1: ( ( rule__Function__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:298:1: ( ( rule__Function__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:299:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:300:1: ( rule__Function__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:300:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction574);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariables"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:312:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:313:1: ( ruleVariables EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:314:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables601);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:321:1: ruleVariables : ( ( rule__Variables__Alternatives ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:325:2: ( ( ( rule__Variables__Alternatives ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:326:1: ( ( rule__Variables__Alternatives ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:326:1: ( ( rule__Variables__Alternatives ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:327:1: ( rule__Variables__Alternatives )
            {
             before(grammarAccess.getVariablesAccess().getAlternatives()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:328:1: ( rule__Variables__Alternatives )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:328:2: rule__Variables__Alternatives
            {
            pushFollow(FOLLOW_rule__Variables__Alternatives_in_ruleVariables634);
            rule__Variables__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleUNIT"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:340:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:341:1: ( ruleUNIT EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:342:1: ruleUNIT EOF
            {
             before(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT661);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getUNITRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:349:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:353:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:354:1: ( ( rule__UNIT__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:354:1: ( ( rule__UNIT__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:355:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:356:1: ( rule__UNIT__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:356:2: rule__UNIT__Group__0
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0_in_ruleUNIT694);
            rule__UNIT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNITAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "entryRule_String"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:368:1: entryRule_String : rule_String EOF ;
    public final void entryRule_String() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:369:1: ( rule_String EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:370:1: rule_String EOF
            {
             before(grammarAccess.get_StringRule()); 
            pushFollow(FOLLOW_rule_String_in_entryRule_String721);
            rule_String();

            state._fsp--;

             after(grammarAccess.get_StringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRule_String728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRule_String"


    // $ANTLR start "rule_String"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:377:1: rule_String : ( ( rule___String__Group__0 ) ) ;
    public final void rule_String() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:381:2: ( ( ( rule___String__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:382:1: ( ( rule___String__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:382:1: ( ( rule___String__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:383:1: ( rule___String__Group__0 )
            {
             before(grammarAccess.get_StringAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:384:1: ( rule___String__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:384:2: rule___String__Group__0
            {
            pushFollow(FOLLOW_rule___String__Group__0_in_rule_String754);
            rule___String__Group__0();

            state._fsp--;


            }

             after(grammarAccess.get_StringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_String"


    // $ANTLR start "entryRule_int"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:396:1: entryRule_int : rule_int EOF ;
    public final void entryRule_int() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:397:1: ( rule_int EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:398:1: rule_int EOF
            {
             before(grammarAccess.get_intRule()); 
            pushFollow(FOLLOW_rule_int_in_entryRule_int781);
            rule_int();

            state._fsp--;

             after(grammarAccess.get_intRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRule_int788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRule_int"


    // $ANTLR start "rule_int"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:405:1: rule_int : ( ( rule___int__Group__0 ) ) ;
    public final void rule_int() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:409:2: ( ( ( rule___int__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:410:1: ( ( rule___int__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:410:1: ( ( rule___int__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:411:1: ( rule___int__Group__0 )
            {
             before(grammarAccess.get_intAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:412:1: ( rule___int__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:412:2: rule___int__Group__0
            {
            pushFollow(FOLLOW_rule___int__Group__0_in_rule_int814);
            rule___int__Group__0();

            state._fsp--;


            }

             after(grammarAccess.get_intAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_int"


    // $ANTLR start "entryRulenumber"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:424:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:425:1: ( rulenumber EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:426:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber841);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:433:1: rulenumber : ( ( rule__Number__Group__0 ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:437:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:438:1: ( ( rule__Number__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:438:1: ( ( rule__Number__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:439:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:440:1: ( rule__Number__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:440:2: rule__Number__Group__0
            {
            pushFollow(FOLLOW_rule__Number__Group__0_in_rulenumber874);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:452:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:453:1: ( ruleQualifiedName EOF )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:454:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:461:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:465:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:467:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:468:1: ( rule__QualifiedName__Group__0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:468:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Model__Alternatives"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:480:1: rule__Model__Alternatives : ( ( rulePackageDeclaration ) | ( ruleActionScript ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:484:1: ( ( rulePackageDeclaration ) | ( ruleActionScript ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16||LA1_0==18||LA1_0==20||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:485:1: ( rulePackageDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:485:1: ( rulePackageDeclaration )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:486:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getModelAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Model__Alternatives970);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:491:6: ( ruleActionScript )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:491:6: ( ruleActionScript )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:492:1: ruleActionScript
                    {
                     before(grammarAccess.getModelAccess().getActionScriptParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionScript_in_rule__Model__Alternatives987);
                    ruleActionScript();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getActionScriptParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:502:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ruleFunction ) | ( ruleVariables ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:506:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ruleFunction ) | ( ruleVariables ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 18:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:507:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:507:1: ( ( rule__Type__Group_0__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:508:1: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:509:1: ( rule__Type__Group_0__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:509:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1019);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:513:6: ( ruleFunction )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:513:6: ( ruleFunction )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:514:1: ruleFunction
                    {
                     before(grammarAccess.getTypeAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__Type__Alternatives1037);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:519:6: ( ruleVariables )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:519:6: ( ruleVariables )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:520:1: ruleVariables
                    {
                     before(grammarAccess.getTypeAccess().getVariablesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVariables_in_rule__Type__Alternatives1054);
                    ruleVariables();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVariablesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:530:1: rule__Property__Alternatives : ( ( ( rule__Property__Group_0__0 ) ) | ( ruleFunction ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:534:1: ( ( ( rule__Property__Group_0__0 ) ) | ( ruleFunction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)||LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:535:1: ( ( rule__Property__Group_0__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:535:1: ( ( rule__Property__Group_0__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:536:1: ( rule__Property__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_0()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:537:1: ( rule__Property__Group_0__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:537:2: rule__Property__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_0__0_in_rule__Property__Alternatives1086);
                    rule__Property__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:541:6: ( ruleFunction )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:541:6: ( ruleFunction )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:542:1: ruleFunction
                    {
                     before(grammarAccess.getPropertyAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__Property__Alternatives1104);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:552:1: rule__Visibility__Alternatives : ( ( 'public' ) | ( 'private' ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:556:1: ( ( 'public' ) | ( 'private' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:557:1: ( 'public' )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:557:1: ( 'public' )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:558:1: 'public'
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Visibility__Alternatives1137); 
                     after(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:565:6: ( 'private' )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:565:6: ( 'private' )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:566:1: 'private'
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives1157); 
                     after(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Variables__Alternatives"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:578:1: rule__Variables__Alternatives : ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) | ( ( rule__Variables__Group_2__0 ) ) | ( ( rule__Variables__Group_3__0 ) ) );
    public final void rule__Variables__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:582:1: ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) | ( ( rule__Variables__Group_2__0 ) ) | ( ( rule__Variables__Group_3__0 ) ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==24) ) {
                        switch ( input.LA(4) ) {
                        case 27:
                            {
                            alt5=2;
                            }
                            break;
                        case 29:
                            {
                            alt5=4;
                            }
                            break;
                        case 25:
                            {
                            alt5=1;
                            }
                            break;
                        case 28:
                            {
                            alt5=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:583:1: ( ( rule__Variables__Group_0__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:583:1: ( ( rule__Variables__Group_0__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:584:1: ( rule__Variables__Group_0__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_0()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:585:1: ( rule__Variables__Group_0__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:585:2: rule__Variables__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Variables__Group_0__0_in_rule__Variables__Alternatives1191);
                    rule__Variables__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:589:6: ( ( rule__Variables__Group_1__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:589:6: ( ( rule__Variables__Group_1__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:590:1: ( rule__Variables__Group_1__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_1()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:591:1: ( rule__Variables__Group_1__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:591:2: rule__Variables__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Variables__Group_1__0_in_rule__Variables__Alternatives1209);
                    rule__Variables__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:595:6: ( ( rule__Variables__Group_2__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:595:6: ( ( rule__Variables__Group_2__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:596:1: ( rule__Variables__Group_2__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_2()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:597:1: ( rule__Variables__Group_2__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:597:2: rule__Variables__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variables__Group_2__0_in_rule__Variables__Alternatives1227);
                    rule__Variables__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:601:6: ( ( rule__Variables__Group_3__0 ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:601:6: ( ( rule__Variables__Group_3__0 ) )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:602:1: ( rule__Variables__Group_3__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_3()); 
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:603:1: ( rule__Variables__Group_3__0 )
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:603:2: rule__Variables__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Variables__Group_3__0_in_rule__Variables__Alternatives1245);
                    rule__Variables__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:614:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:618:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:619:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01276);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01279);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:626:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:630:1: ( ( 'package' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:631:1: ( 'package' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:631:1: ( 'package' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:632:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group__0__Impl1307); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:645:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:649:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:650:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11338);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11341);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:657:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:661:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:662:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:662:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:663:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:664:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:664:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1368);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:674:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:678:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:679:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21398);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21401);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:686:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:690:1: ( ( '{' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:691:1: ( '{' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:691:1: ( '{' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:692:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__PackageDeclaration__Group__2__Impl1429); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:705:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:709:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:710:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31460);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31463);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:717:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElemntsAssignment_3 ) ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:721:1: ( ( ( rule__PackageDeclaration__ElemntsAssignment_3 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:722:1: ( ( rule__PackageDeclaration__ElemntsAssignment_3 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:722:1: ( ( rule__PackageDeclaration__ElemntsAssignment_3 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:723:1: ( rule__PackageDeclaration__ElemntsAssignment_3 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getElemntsAssignment_3()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:724:1: ( rule__PackageDeclaration__ElemntsAssignment_3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:724:2: rule__PackageDeclaration__ElemntsAssignment_3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__ElemntsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1490);
            rule__PackageDeclaration__ElemntsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getElemntsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:734:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:738:1: ( rule__PackageDeclaration__Group__4__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:739:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41520);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:745:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:749:1: ( ( '}' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:750:1: ( '}' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:750:1: ( '}' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:751:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Group__4__Impl1548); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ActionScript__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:774:1: rule__ActionScript__Group__0 : rule__ActionScript__Group__0__Impl rule__ActionScript__Group__1 ;
    public final void rule__ActionScript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:778:1: ( rule__ActionScript__Group__0__Impl rule__ActionScript__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:779:2: rule__ActionScript__Group__0__Impl rule__ActionScript__Group__1
            {
            pushFollow(FOLLOW_rule__ActionScript__Group__0__Impl_in_rule__ActionScript__Group__01589);
            rule__ActionScript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionScript__Group__1_in_rule__ActionScript__Group__01592);
            rule__ActionScript__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__Group__0"


    // $ANTLR start "rule__ActionScript__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:786:1: rule__ActionScript__Group__0__Impl : ( ( rule__ActionScript__ImportsAssignment_0 )* ) ;
    public final void rule__ActionScript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:790:1: ( ( ( rule__ActionScript__ImportsAssignment_0 )* ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:791:1: ( ( rule__ActionScript__ImportsAssignment_0 )* )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:791:1: ( ( rule__ActionScript__ImportsAssignment_0 )* )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:792:1: ( rule__ActionScript__ImportsAssignment_0 )*
            {
             before(grammarAccess.getActionScriptAccess().getImportsAssignment_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:793:1: ( rule__ActionScript__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:793:2: rule__ActionScript__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ActionScript__ImportsAssignment_0_in_rule__ActionScript__Group__0__Impl1619);
            	    rule__ActionScript__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActionScriptAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__Group__0__Impl"


    // $ANTLR start "rule__ActionScript__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:803:1: rule__ActionScript__Group__1 : rule__ActionScript__Group__1__Impl ;
    public final void rule__ActionScript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:807:1: ( rule__ActionScript__Group__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:808:2: rule__ActionScript__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionScript__Group__1__Impl_in_rule__ActionScript__Group__11650);
            rule__ActionScript__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__Group__1"


    // $ANTLR start "rule__ActionScript__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:814:1: rule__ActionScript__Group__1__Impl : ( ( ( rule__ActionScript__ElementsAssignment_1 ) ) ( ( rule__ActionScript__ElementsAssignment_1 )* ) ) ;
    public final void rule__ActionScript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:818:1: ( ( ( ( rule__ActionScript__ElementsAssignment_1 ) ) ( ( rule__ActionScript__ElementsAssignment_1 )* ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:819:1: ( ( ( rule__ActionScript__ElementsAssignment_1 ) ) ( ( rule__ActionScript__ElementsAssignment_1 )* ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:819:1: ( ( ( rule__ActionScript__ElementsAssignment_1 ) ) ( ( rule__ActionScript__ElementsAssignment_1 )* ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:820:1: ( ( rule__ActionScript__ElementsAssignment_1 ) ) ( ( rule__ActionScript__ElementsAssignment_1 )* )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:820:1: ( ( rule__ActionScript__ElementsAssignment_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:821:1: ( rule__ActionScript__ElementsAssignment_1 )
            {
             before(grammarAccess.getActionScriptAccess().getElementsAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:822:1: ( rule__ActionScript__ElementsAssignment_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:822:2: rule__ActionScript__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionScript__ElementsAssignment_1_in_rule__ActionScript__Group__1__Impl1679);
            rule__ActionScript__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionScriptAccess().getElementsAssignment_1()); 

            }

            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:825:1: ( ( rule__ActionScript__ElementsAssignment_1 )* )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:826:1: ( rule__ActionScript__ElementsAssignment_1 )*
            {
             before(grammarAccess.getActionScriptAccess().getElementsAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:827:1: ( rule__ActionScript__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=12)||LA7_0==18||LA7_0==20||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:827:2: rule__ActionScript__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ActionScript__ElementsAssignment_1_in_rule__ActionScript__Group__1__Impl1691);
            	    rule__ActionScript__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getActionScriptAccess().getElementsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:842:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:846:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:847:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01728);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01731);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:854:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:858:1: ( ( 'import' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:859:1: ( 'import' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:859:1: ( 'import' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:860:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group__0__Impl1759); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:873:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:877:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:878:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11790);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11793);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:885:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:889:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:890:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:890:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:891:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:892:1: ( rule__Import__ImportURIAssignment_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:892:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1820);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:902:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:906:1: ( rule__Import__Group__2__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:907:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21850);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:913:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:917:1: ( ( ';' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:918:1: ( ';' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:918:1: ( ';' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:919:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__2__Impl1878); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:938:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:942:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:943:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__01915);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__01918);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:950:1: rule__Type__Group_0__0__Impl : ( ( ruleVisibility )? ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:954:1: ( ( ( ruleVisibility )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:955:1: ( ( ruleVisibility )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:955:1: ( ( ruleVisibility )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:956:1: ( ruleVisibility )?
            {
             before(grammarAccess.getTypeAccess().getVisibilityParserRuleCall_0_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:957:1: ( ruleVisibility )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:957:3: ruleVisibility
                    {
                    pushFollow(FOLLOW_ruleVisibility_in_rule__Type__Group_0__0__Impl1946);
                    ruleVisibility();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getVisibilityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:967:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:971:1: ( rule__Type__Group_0__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:972:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__11977);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:978:1: rule__Type__Group_0__1__Impl : ( ruleClass ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:982:1: ( ( ruleClass ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:983:1: ( ruleClass )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:983:1: ( ruleClass )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:984:1: ruleClass
            {
             before(grammarAccess.getTypeAccess().getClassParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Type__Group_0__1__Impl2004);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getClassParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Property__Group_0__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:999:1: rule__Property__Group_0__0 : rule__Property__Group_0__0__Impl rule__Property__Group_0__1 ;
    public final void rule__Property__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1003:1: ( rule__Property__Group_0__0__Impl rule__Property__Group_0__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1004:2: rule__Property__Group_0__0__Impl rule__Property__Group_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_0__0__Impl_in_rule__Property__Group_0__02037);
            rule__Property__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_0__1_in_rule__Property__Group_0__02040);
            rule__Property__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0__0"


    // $ANTLR start "rule__Property__Group_0__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1011:1: rule__Property__Group_0__0__Impl : ( ( ruleVisibility )? ) ;
    public final void rule__Property__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1015:1: ( ( ( ruleVisibility )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1016:1: ( ( ruleVisibility )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1016:1: ( ( ruleVisibility )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1017:1: ( ruleVisibility )?
            {
             before(grammarAccess.getPropertyAccess().getVisibilityParserRuleCall_0_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1018:1: ( ruleVisibility )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1018:3: ruleVisibility
                    {
                    pushFollow(FOLLOW_ruleVisibility_in_rule__Property__Group_0__0__Impl2068);
                    ruleVisibility();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getVisibilityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0__0__Impl"


    // $ANTLR start "rule__Property__Group_0__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1028:1: rule__Property__Group_0__1 : rule__Property__Group_0__1__Impl ;
    public final void rule__Property__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1032:1: ( rule__Property__Group_0__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1033:2: rule__Property__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_0__1__Impl_in_rule__Property__Group_0__12099);
            rule__Property__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0__1"


    // $ANTLR start "rule__Property__Group_0__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1039:1: rule__Property__Group_0__1__Impl : ( ruleVariables ) ;
    public final void rule__Property__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1043:1: ( ( ruleVariables ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1044:1: ( ruleVariables )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1044:1: ( ruleVariables )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1045:1: ruleVariables
            {
             before(grammarAccess.getPropertyAccess().getVariablesParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleVariables_in_rule__Property__Group_0__1__Impl2126);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getVariablesParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1060:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1064:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1065:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02159);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02162);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1072:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1076:1: ( ( 'class' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1077:1: ( 'class' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1077:1: ( 'class' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1078:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__0__Impl2190); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1091:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1095:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1096:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12221);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12224);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1103:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1107:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1108:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1108:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1109:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1110:1: ( rule__Class__NameAssignment_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1110:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2251);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1120:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1124:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1125:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22281);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22284);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1132:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1136:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1137:1: ( ( rule__Class__Group_2__0 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1137:1: ( ( rule__Class__Group_2__0 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1138:1: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1139:1: ( rule__Class__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1139:2: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl2311);
                    rule__Class__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1149:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1153:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1154:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32342);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32345);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1161:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1165:1: ( ( '{' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1166:1: ( '{' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1166:1: ( '{' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1167:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Class__Group__3__Impl2373); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1180:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1184:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1185:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42404);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42407);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1192:1: rule__Class__Group__4__Impl : ( ( rule__Class__PropertiesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1196:1: ( ( ( rule__Class__PropertiesAssignment_4 )* ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1197:1: ( ( rule__Class__PropertiesAssignment_4 )* )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1197:1: ( ( rule__Class__PropertiesAssignment_4 )* )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1198:1: ( rule__Class__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1199:1: ( rule__Class__PropertiesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)||LA11_0==20||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1199:2: rule__Class__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2434);
            	    rule__Class__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1209:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1213:1: ( rule__Class__Group__5__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1214:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52465);
            rule__Class__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1220:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1224:1: ( ( '}' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1225:1: ( '}' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1225:1: ( '}' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1226:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Class__Group__5__Impl2493); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1251:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1255:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1256:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02536);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02539);
            rule__Class__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1263:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1267:1: ( ( 'extends' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1268:1: ( 'extends' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1268:1: ( 'extends' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1269:1: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group_2__0__Impl2567); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1282:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1286:1: ( rule__Class__Group_2__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1287:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12598);
            rule__Class__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1293:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperClassAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1297:1: ( ( ( rule__Class__SuperClassAssignment_2_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1298:1: ( ( rule__Class__SuperClassAssignment_2_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1298:1: ( ( rule__Class__SuperClassAssignment_2_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1299:1: ( rule__Class__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1300:1: ( rule__Class__SuperClassAssignment_2_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1300:2: rule__Class__SuperClassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class__SuperClassAssignment_2_1_in_rule__Class__Group_2__1__Impl2625);
            rule__Class__SuperClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1314:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1318:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1319:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02659);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02662);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1326:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1330:1: ( ( 'function' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1331:1: ( 'function' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1331:1: ( 'function' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1332:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Function__Group__0__Impl2690); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1345:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1349:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1350:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12721);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12724);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1357:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1361:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1362:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1362:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1363:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1364:1: ( rule__Function__NameAssignment_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1364:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2751);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1374:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1378:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1379:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22781);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22784);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1386:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1390:1: ( ( '(' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1391:1: ( '(' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1391:1: ( '(' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1392:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Function__Group__2__Impl2812); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1405:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1409:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1410:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32843);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32846);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1417:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1421:1: ( ( ')' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1422:1: ( ')' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1422:1: ( ')' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1423:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Function__Group__3__Impl2874); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1436:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1440:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1441:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42905);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42908);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1448:1: rule__Function__Group__4__Impl : ( '{' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1452:1: ( ( '{' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1453:1: ( '{' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1453:1: ( '{' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1454:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Function__Group__4__Impl2936); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1467:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1471:1: ( rule__Function__Group__5__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1472:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52967);
            rule__Function__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1478:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1482:1: ( ( '}' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1483:1: ( '}' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1483:1: ( '}' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1484:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Function__Group__5__Impl2995); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Variables__Group_0__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1509:1: rule__Variables__Group_0__0 : rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 ;
    public final void rule__Variables__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1513:1: ( rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1514:2: rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_0__0__Impl_in_rule__Variables__Group_0__03038);
            rule__Variables__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_0__1_in_rule__Variables__Group_0__03041);
            rule__Variables__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_0__0"


    // $ANTLR start "rule__Variables__Group_0__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1521:1: rule__Variables__Group_0__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1525:1: ( ( 'var' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1526:1: ( 'var' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1526:1: ( 'var' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1527:1: 'var'
            {
             before(grammarAccess.getVariablesAccess().getVarKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Variables__Group_0__0__Impl3069); 
             after(grammarAccess.getVariablesAccess().getVarKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_0__0__Impl"


    // $ANTLR start "rule__Variables__Group_0__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1540:1: rule__Variables__Group_0__1 : rule__Variables__Group_0__1__Impl ;
    public final void rule__Variables__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1544:1: ( rule__Variables__Group_0__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1545:2: rule__Variables__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_0__1__Impl_in_rule__Variables__Group_0__13100);
            rule__Variables__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_0__1"


    // $ANTLR start "rule__Variables__Group_0__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1551:1: rule__Variables__Group_0__1__Impl : ( ruleUNIT ) ;
    public final void rule__Variables__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1555:1: ( ( ruleUNIT ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1556:1: ( ruleUNIT )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1556:1: ( ruleUNIT )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1557:1: ruleUNIT
            {
             before(grammarAccess.getVariablesAccess().getUNITParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleUNIT_in_rule__Variables__Group_0__1__Impl3127);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getUNITParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_0__1__Impl"


    // $ANTLR start "rule__Variables__Group_1__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1572:1: rule__Variables__Group_1__0 : rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 ;
    public final void rule__Variables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1576:1: ( rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1577:2: rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_1__0__Impl_in_rule__Variables__Group_1__03160);
            rule__Variables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_1__1_in_rule__Variables__Group_1__03163);
            rule__Variables__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__0"


    // $ANTLR start "rule__Variables__Group_1__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1584:1: rule__Variables__Group_1__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1588:1: ( ( 'var' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1589:1: ( 'var' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1589:1: ( 'var' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1590:1: 'var'
            {
             before(grammarAccess.getVariablesAccess().getVarKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Variables__Group_1__0__Impl3191); 
             after(grammarAccess.getVariablesAccess().getVarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__0__Impl"


    // $ANTLR start "rule__Variables__Group_1__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1603:1: rule__Variables__Group_1__1 : rule__Variables__Group_1__1__Impl ;
    public final void rule__Variables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1607:1: ( rule__Variables__Group_1__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1608:2: rule__Variables__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_1__1__Impl_in_rule__Variables__Group_1__13222);
            rule__Variables__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__1"


    // $ANTLR start "rule__Variables__Group_1__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1614:1: rule__Variables__Group_1__1__Impl : ( rule_String ) ;
    public final void rule__Variables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1618:1: ( ( rule_String ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1619:1: ( rule_String )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1619:1: ( rule_String )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1620:1: rule_String
            {
             before(grammarAccess.getVariablesAccess().get_StringParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rule_String_in_rule__Variables__Group_1__1__Impl3249);
            rule_String();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().get_StringParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__1__Impl"


    // $ANTLR start "rule__Variables__Group_2__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1635:1: rule__Variables__Group_2__0 : rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1 ;
    public final void rule__Variables__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1639:1: ( rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1640:2: rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_2__0__Impl_in_rule__Variables__Group_2__03282);
            rule__Variables__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_2__1_in_rule__Variables__Group_2__03285);
            rule__Variables__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__0"


    // $ANTLR start "rule__Variables__Group_2__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1647:1: rule__Variables__Group_2__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1651:1: ( ( 'var' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1652:1: ( 'var' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1652:1: ( 'var' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1653:1: 'var'
            {
             before(grammarAccess.getVariablesAccess().getVarKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Variables__Group_2__0__Impl3313); 
             after(grammarAccess.getVariablesAccess().getVarKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__0__Impl"


    // $ANTLR start "rule__Variables__Group_2__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1666:1: rule__Variables__Group_2__1 : rule__Variables__Group_2__1__Impl ;
    public final void rule__Variables__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1670:1: ( rule__Variables__Group_2__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1671:2: rule__Variables__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_2__1__Impl_in_rule__Variables__Group_2__13344);
            rule__Variables__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__1"


    // $ANTLR start "rule__Variables__Group_2__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1677:1: rule__Variables__Group_2__1__Impl : ( rule_int ) ;
    public final void rule__Variables__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1681:1: ( ( rule_int ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1682:1: ( rule_int )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1682:1: ( rule_int )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1683:1: rule_int
            {
             before(grammarAccess.getVariablesAccess().get_intParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rule_int_in_rule__Variables__Group_2__1__Impl3371);
            rule_int();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().get_intParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__1__Impl"


    // $ANTLR start "rule__Variables__Group_3__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1698:1: rule__Variables__Group_3__0 : rule__Variables__Group_3__0__Impl rule__Variables__Group_3__1 ;
    public final void rule__Variables__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1702:1: ( rule__Variables__Group_3__0__Impl rule__Variables__Group_3__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1703:2: rule__Variables__Group_3__0__Impl rule__Variables__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_3__0__Impl_in_rule__Variables__Group_3__03404);
            rule__Variables__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_3__1_in_rule__Variables__Group_3__03407);
            rule__Variables__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_3__0"


    // $ANTLR start "rule__Variables__Group_3__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1710:1: rule__Variables__Group_3__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1714:1: ( ( 'var' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1715:1: ( 'var' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1715:1: ( 'var' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1716:1: 'var'
            {
             before(grammarAccess.getVariablesAccess().getVarKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Variables__Group_3__0__Impl3435); 
             after(grammarAccess.getVariablesAccess().getVarKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_3__0__Impl"


    // $ANTLR start "rule__Variables__Group_3__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1729:1: rule__Variables__Group_3__1 : rule__Variables__Group_3__1__Impl ;
    public final void rule__Variables__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1733:1: ( rule__Variables__Group_3__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1734:2: rule__Variables__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_3__1__Impl_in_rule__Variables__Group_3__13466);
            rule__Variables__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_3__1"


    // $ANTLR start "rule__Variables__Group_3__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1740:1: rule__Variables__Group_3__1__Impl : ( rulenumber ) ;
    public final void rule__Variables__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1744:1: ( ( rulenumber ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1745:1: ( rulenumber )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1745:1: ( rulenumber )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1746:1: rulenumber
            {
             before(grammarAccess.getVariablesAccess().getNumberParserRuleCall_3_1()); 
            pushFollow(FOLLOW_rulenumber_in_rule__Variables__Group_3__1__Impl3493);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getNumberParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_3__1__Impl"


    // $ANTLR start "rule__UNIT__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1761:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1765:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1766:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__03526);
            rule__UNIT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__03529);
            rule__UNIT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0"


    // $ANTLR start "rule__UNIT__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1773:1: rule__UNIT__Group__0__Impl : ( ( rule__UNIT__NameAssignment_0 ) ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1777:1: ( ( ( rule__UNIT__NameAssignment_0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1778:1: ( ( rule__UNIT__NameAssignment_0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1778:1: ( ( rule__UNIT__NameAssignment_0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1779:1: ( rule__UNIT__NameAssignment_0 )
            {
             before(grammarAccess.getUNITAccess().getNameAssignment_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1780:1: ( rule__UNIT__NameAssignment_0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1780:2: rule__UNIT__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__UNIT__NameAssignment_0_in_rule__UNIT__Group__0__Impl3556);
            rule__UNIT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUNITAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0__Impl"


    // $ANTLR start "rule__UNIT__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1790:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl rule__UNIT__Group__2 ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1794:1: ( rule__UNIT__Group__1__Impl rule__UNIT__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1795:2: rule__UNIT__Group__1__Impl rule__UNIT__Group__2
            {
            pushFollow(FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__13586);
            rule__UNIT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__2_in_rule__UNIT__Group__13589);
            rule__UNIT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1"


    // $ANTLR start "rule__UNIT__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1802:1: rule__UNIT__Group__1__Impl : ( ':' ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1806:1: ( ( ':' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1807:1: ( ':' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1807:1: ( ':' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1808:1: ':'
            {
             before(grammarAccess.getUNITAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__UNIT__Group__1__Impl3617); 
             after(grammarAccess.getUNITAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1__Impl"


    // $ANTLR start "rule__UNIT__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1821:1: rule__UNIT__Group__2 : rule__UNIT__Group__2__Impl rule__UNIT__Group__3 ;
    public final void rule__UNIT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1825:1: ( rule__UNIT__Group__2__Impl rule__UNIT__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1826:2: rule__UNIT__Group__2__Impl rule__UNIT__Group__3
            {
            pushFollow(FOLLOW_rule__UNIT__Group__2__Impl_in_rule__UNIT__Group__23648);
            rule__UNIT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__3_in_rule__UNIT__Group__23651);
            rule__UNIT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__2"


    // $ANTLR start "rule__UNIT__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1833:1: rule__UNIT__Group__2__Impl : ( 'unit' ) ;
    public final void rule__UNIT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1837:1: ( ( 'unit' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1838:1: ( 'unit' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1838:1: ( 'unit' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1839:1: 'unit'
            {
             before(grammarAccess.getUNITAccess().getUnitKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__UNIT__Group__2__Impl3679); 
             after(grammarAccess.getUNITAccess().getUnitKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__2__Impl"


    // $ANTLR start "rule__UNIT__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1852:1: rule__UNIT__Group__3 : rule__UNIT__Group__3__Impl rule__UNIT__Group__4 ;
    public final void rule__UNIT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1856:1: ( rule__UNIT__Group__3__Impl rule__UNIT__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1857:2: rule__UNIT__Group__3__Impl rule__UNIT__Group__4
            {
            pushFollow(FOLLOW_rule__UNIT__Group__3__Impl_in_rule__UNIT__Group__33710);
            rule__UNIT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__4_in_rule__UNIT__Group__33713);
            rule__UNIT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__3"


    // $ANTLR start "rule__UNIT__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1864:1: rule__UNIT__Group__3__Impl : ( ( rule__UNIT__Group_3__0 )? ) ;
    public final void rule__UNIT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1868:1: ( ( ( rule__UNIT__Group_3__0 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1869:1: ( ( rule__UNIT__Group_3__0 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1869:1: ( ( rule__UNIT__Group_3__0 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1870:1: ( rule__UNIT__Group_3__0 )?
            {
             before(grammarAccess.getUNITAccess().getGroup_3()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1871:1: ( rule__UNIT__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1871:2: rule__UNIT__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UNIT__Group_3__0_in_rule__UNIT__Group__3__Impl3740);
                    rule__UNIT__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUNITAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__3__Impl"


    // $ANTLR start "rule__UNIT__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1881:1: rule__UNIT__Group__4 : rule__UNIT__Group__4__Impl ;
    public final void rule__UNIT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1885:1: ( rule__UNIT__Group__4__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1886:2: rule__UNIT__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group__4__Impl_in_rule__UNIT__Group__43771);
            rule__UNIT__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__4"


    // $ANTLR start "rule__UNIT__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1892:1: rule__UNIT__Group__4__Impl : ( ';' ) ;
    public final void rule__UNIT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1896:1: ( ( ';' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1897:1: ( ';' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1897:1: ( ';' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1898:1: ';'
            {
             before(grammarAccess.getUNITAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__UNIT__Group__4__Impl3799); 
             after(grammarAccess.getUNITAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__4__Impl"


    // $ANTLR start "rule__UNIT__Group_3__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1921:1: rule__UNIT__Group_3__0 : rule__UNIT__Group_3__0__Impl rule__UNIT__Group_3__1 ;
    public final void rule__UNIT__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1925:1: ( rule__UNIT__Group_3__0__Impl rule__UNIT__Group_3__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1926:2: rule__UNIT__Group_3__0__Impl rule__UNIT__Group_3__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group_3__0__Impl_in_rule__UNIT__Group_3__03840);
            rule__UNIT__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group_3__1_in_rule__UNIT__Group_3__03843);
            rule__UNIT__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_3__0"


    // $ANTLR start "rule__UNIT__Group_3__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1933:1: rule__UNIT__Group_3__0__Impl : ( '=' ) ;
    public final void rule__UNIT__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1937:1: ( ( '=' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1938:1: ( '=' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1938:1: ( '=' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1939:1: '='
            {
             before(grammarAccess.getUNITAccess().getEqualsSignKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__UNIT__Group_3__0__Impl3871); 
             after(grammarAccess.getUNITAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_3__0__Impl"


    // $ANTLR start "rule__UNIT__Group_3__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1952:1: rule__UNIT__Group_3__1 : rule__UNIT__Group_3__1__Impl ;
    public final void rule__UNIT__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1956:1: ( rule__UNIT__Group_3__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1957:2: rule__UNIT__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group_3__1__Impl_in_rule__UNIT__Group_3__13902);
            rule__UNIT__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_3__1"


    // $ANTLR start "rule__UNIT__Group_3__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1963:1: rule__UNIT__Group_3__1__Impl : ( ( rule__UNIT__StringAssignment_3_1 ) ) ;
    public final void rule__UNIT__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1967:1: ( ( ( rule__UNIT__StringAssignment_3_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1968:1: ( ( rule__UNIT__StringAssignment_3_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1968:1: ( ( rule__UNIT__StringAssignment_3_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1969:1: ( rule__UNIT__StringAssignment_3_1 )
            {
             before(grammarAccess.getUNITAccess().getStringAssignment_3_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1970:1: ( rule__UNIT__StringAssignment_3_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1970:2: rule__UNIT__StringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UNIT__StringAssignment_3_1_in_rule__UNIT__Group_3__1__Impl3929);
            rule__UNIT__StringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUNITAccess().getStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_3__1__Impl"


    // $ANTLR start "rule___String__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1984:1: rule___String__Group__0 : rule___String__Group__0__Impl rule___String__Group__1 ;
    public final void rule___String__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1988:1: ( rule___String__Group__0__Impl rule___String__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1989:2: rule___String__Group__0__Impl rule___String__Group__1
            {
            pushFollow(FOLLOW_rule___String__Group__0__Impl_in_rule___String__Group__03963);
            rule___String__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___String__Group__1_in_rule___String__Group__03966);
            rule___String__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__0"


    // $ANTLR start "rule___String__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:1996:1: rule___String__Group__0__Impl : ( ( rule___String__NameAssignment_0 ) ) ;
    public final void rule___String__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2000:1: ( ( ( rule___String__NameAssignment_0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2001:1: ( ( rule___String__NameAssignment_0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2001:1: ( ( rule___String__NameAssignment_0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2002:1: ( rule___String__NameAssignment_0 )
            {
             before(grammarAccess.get_StringAccess().getNameAssignment_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2003:1: ( rule___String__NameAssignment_0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2003:2: rule___String__NameAssignment_0
            {
            pushFollow(FOLLOW_rule___String__NameAssignment_0_in_rule___String__Group__0__Impl3993);
            rule___String__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.get_StringAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__0__Impl"


    // $ANTLR start "rule___String__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2013:1: rule___String__Group__1 : rule___String__Group__1__Impl rule___String__Group__2 ;
    public final void rule___String__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2017:1: ( rule___String__Group__1__Impl rule___String__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2018:2: rule___String__Group__1__Impl rule___String__Group__2
            {
            pushFollow(FOLLOW_rule___String__Group__1__Impl_in_rule___String__Group__14023);
            rule___String__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___String__Group__2_in_rule___String__Group__14026);
            rule___String__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__1"


    // $ANTLR start "rule___String__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2025:1: rule___String__Group__1__Impl : ( ':' ) ;
    public final void rule___String__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2029:1: ( ( ':' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2030:1: ( ':' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2030:1: ( ':' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2031:1: ':'
            {
             before(grammarAccess.get_StringAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule___String__Group__1__Impl4054); 
             after(grammarAccess.get_StringAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__1__Impl"


    // $ANTLR start "rule___String__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2044:1: rule___String__Group__2 : rule___String__Group__2__Impl rule___String__Group__3 ;
    public final void rule___String__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2048:1: ( rule___String__Group__2__Impl rule___String__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2049:2: rule___String__Group__2__Impl rule___String__Group__3
            {
            pushFollow(FOLLOW_rule___String__Group__2__Impl_in_rule___String__Group__24085);
            rule___String__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___String__Group__3_in_rule___String__Group__24088);
            rule___String__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__2"


    // $ANTLR start "rule___String__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2056:1: rule___String__Group__2__Impl : ( 'String' ) ;
    public final void rule___String__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2060:1: ( ( 'String' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2061:1: ( 'String' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2061:1: ( 'String' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2062:1: 'String'
            {
             before(grammarAccess.get_StringAccess().getStringKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule___String__Group__2__Impl4116); 
             after(grammarAccess.get_StringAccess().getStringKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__2__Impl"


    // $ANTLR start "rule___String__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2075:1: rule___String__Group__3 : rule___String__Group__3__Impl rule___String__Group__4 ;
    public final void rule___String__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2079:1: ( rule___String__Group__3__Impl rule___String__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2080:2: rule___String__Group__3__Impl rule___String__Group__4
            {
            pushFollow(FOLLOW_rule___String__Group__3__Impl_in_rule___String__Group__34147);
            rule___String__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___String__Group__4_in_rule___String__Group__34150);
            rule___String__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__3"


    // $ANTLR start "rule___String__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2087:1: rule___String__Group__3__Impl : ( ( rule___String__Group_3__0 )? ) ;
    public final void rule___String__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2091:1: ( ( ( rule___String__Group_3__0 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2092:1: ( ( rule___String__Group_3__0 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2092:1: ( ( rule___String__Group_3__0 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2093:1: ( rule___String__Group_3__0 )?
            {
             before(grammarAccess.get_StringAccess().getGroup_3()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2094:1: ( rule___String__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2094:2: rule___String__Group_3__0
                    {
                    pushFollow(FOLLOW_rule___String__Group_3__0_in_rule___String__Group__3__Impl4177);
                    rule___String__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.get_StringAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__3__Impl"


    // $ANTLR start "rule___String__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2104:1: rule___String__Group__4 : rule___String__Group__4__Impl ;
    public final void rule___String__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2108:1: ( rule___String__Group__4__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2109:2: rule___String__Group__4__Impl
            {
            pushFollow(FOLLOW_rule___String__Group__4__Impl_in_rule___String__Group__44208);
            rule___String__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__4"


    // $ANTLR start "rule___String__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2115:1: rule___String__Group__4__Impl : ( ';' ) ;
    public final void rule___String__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2119:1: ( ( ';' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2120:1: ( ';' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2120:1: ( ';' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2121:1: ';'
            {
             before(grammarAccess.get_StringAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule___String__Group__4__Impl4236); 
             after(grammarAccess.get_StringAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group__4__Impl"


    // $ANTLR start "rule___String__Group_3__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2144:1: rule___String__Group_3__0 : rule___String__Group_3__0__Impl rule___String__Group_3__1 ;
    public final void rule___String__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2148:1: ( rule___String__Group_3__0__Impl rule___String__Group_3__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2149:2: rule___String__Group_3__0__Impl rule___String__Group_3__1
            {
            pushFollow(FOLLOW_rule___String__Group_3__0__Impl_in_rule___String__Group_3__04277);
            rule___String__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___String__Group_3__1_in_rule___String__Group_3__04280);
            rule___String__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group_3__0"


    // $ANTLR start "rule___String__Group_3__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2156:1: rule___String__Group_3__0__Impl : ( '=' ) ;
    public final void rule___String__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2160:1: ( ( '=' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2161:1: ( '=' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2161:1: ( '=' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2162:1: '='
            {
             before(grammarAccess.get_StringAccess().getEqualsSignKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule___String__Group_3__0__Impl4308); 
             after(grammarAccess.get_StringAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group_3__0__Impl"


    // $ANTLR start "rule___String__Group_3__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2175:1: rule___String__Group_3__1 : rule___String__Group_3__1__Impl ;
    public final void rule___String__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2179:1: ( rule___String__Group_3__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2180:2: rule___String__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule___String__Group_3__1__Impl_in_rule___String__Group_3__14339);
            rule___String__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group_3__1"


    // $ANTLR start "rule___String__Group_3__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2186:1: rule___String__Group_3__1__Impl : ( ( rule___String__StringAssignment_3_1 )? ) ;
    public final void rule___String__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2190:1: ( ( ( rule___String__StringAssignment_3_1 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2191:1: ( ( rule___String__StringAssignment_3_1 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2191:1: ( ( rule___String__StringAssignment_3_1 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2192:1: ( rule___String__StringAssignment_3_1 )?
            {
             before(grammarAccess.get_StringAccess().getStringAssignment_3_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2193:1: ( rule___String__StringAssignment_3_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2193:2: rule___String__StringAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule___String__StringAssignment_3_1_in_rule___String__Group_3__1__Impl4366);
                    rule___String__StringAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.get_StringAccess().getStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__Group_3__1__Impl"


    // $ANTLR start "rule___int__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2207:1: rule___int__Group__0 : rule___int__Group__0__Impl rule___int__Group__1 ;
    public final void rule___int__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2211:1: ( rule___int__Group__0__Impl rule___int__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2212:2: rule___int__Group__0__Impl rule___int__Group__1
            {
            pushFollow(FOLLOW_rule___int__Group__0__Impl_in_rule___int__Group__04401);
            rule___int__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___int__Group__1_in_rule___int__Group__04404);
            rule___int__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__0"


    // $ANTLR start "rule___int__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2219:1: rule___int__Group__0__Impl : ( ( rule___int__NameAssignment_0 ) ) ;
    public final void rule___int__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2223:1: ( ( ( rule___int__NameAssignment_0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2224:1: ( ( rule___int__NameAssignment_0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2224:1: ( ( rule___int__NameAssignment_0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2225:1: ( rule___int__NameAssignment_0 )
            {
             before(grammarAccess.get_intAccess().getNameAssignment_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2226:1: ( rule___int__NameAssignment_0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2226:2: rule___int__NameAssignment_0
            {
            pushFollow(FOLLOW_rule___int__NameAssignment_0_in_rule___int__Group__0__Impl4431);
            rule___int__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.get_intAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__0__Impl"


    // $ANTLR start "rule___int__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2236:1: rule___int__Group__1 : rule___int__Group__1__Impl rule___int__Group__2 ;
    public final void rule___int__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2240:1: ( rule___int__Group__1__Impl rule___int__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2241:2: rule___int__Group__1__Impl rule___int__Group__2
            {
            pushFollow(FOLLOW_rule___int__Group__1__Impl_in_rule___int__Group__14461);
            rule___int__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___int__Group__2_in_rule___int__Group__14464);
            rule___int__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__1"


    // $ANTLR start "rule___int__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2248:1: rule___int__Group__1__Impl : ( ':' ) ;
    public final void rule___int__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2252:1: ( ( ':' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2253:1: ( ':' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2253:1: ( ':' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2254:1: ':'
            {
             before(grammarAccess.get_intAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule___int__Group__1__Impl4492); 
             after(grammarAccess.get_intAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__1__Impl"


    // $ANTLR start "rule___int__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2267:1: rule___int__Group__2 : rule___int__Group__2__Impl rule___int__Group__3 ;
    public final void rule___int__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2271:1: ( rule___int__Group__2__Impl rule___int__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2272:2: rule___int__Group__2__Impl rule___int__Group__3
            {
            pushFollow(FOLLOW_rule___int__Group__2__Impl_in_rule___int__Group__24523);
            rule___int__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___int__Group__3_in_rule___int__Group__24526);
            rule___int__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__2"


    // $ANTLR start "rule___int__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2279:1: rule___int__Group__2__Impl : ( 'int' ) ;
    public final void rule___int__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2283:1: ( ( 'int' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2284:1: ( 'int' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2284:1: ( 'int' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2285:1: 'int'
            {
             before(grammarAccess.get_intAccess().getIntKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule___int__Group__2__Impl4554); 
             after(grammarAccess.get_intAccess().getIntKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__2__Impl"


    // $ANTLR start "rule___int__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2298:1: rule___int__Group__3 : rule___int__Group__3__Impl rule___int__Group__4 ;
    public final void rule___int__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2302:1: ( rule___int__Group__3__Impl rule___int__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2303:2: rule___int__Group__3__Impl rule___int__Group__4
            {
            pushFollow(FOLLOW_rule___int__Group__3__Impl_in_rule___int__Group__34585);
            rule___int__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___int__Group__4_in_rule___int__Group__34588);
            rule___int__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__3"


    // $ANTLR start "rule___int__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2310:1: rule___int__Group__3__Impl : ( ( rule___int__Group_3__0 )? ) ;
    public final void rule___int__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2314:1: ( ( ( rule___int__Group_3__0 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2315:1: ( ( rule___int__Group_3__0 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2315:1: ( ( rule___int__Group_3__0 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2316:1: ( rule___int__Group_3__0 )?
            {
             before(grammarAccess.get_intAccess().getGroup_3()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2317:1: ( rule___int__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2317:2: rule___int__Group_3__0
                    {
                    pushFollow(FOLLOW_rule___int__Group_3__0_in_rule___int__Group__3__Impl4615);
                    rule___int__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.get_intAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__3__Impl"


    // $ANTLR start "rule___int__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2327:1: rule___int__Group__4 : rule___int__Group__4__Impl ;
    public final void rule___int__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2331:1: ( rule___int__Group__4__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2332:2: rule___int__Group__4__Impl
            {
            pushFollow(FOLLOW_rule___int__Group__4__Impl_in_rule___int__Group__44646);
            rule___int__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__4"


    // $ANTLR start "rule___int__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2338:1: rule___int__Group__4__Impl : ( ';' ) ;
    public final void rule___int__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2342:1: ( ( ';' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2343:1: ( ';' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2343:1: ( ';' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2344:1: ';'
            {
             before(grammarAccess.get_intAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule___int__Group__4__Impl4674); 
             after(grammarAccess.get_intAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group__4__Impl"


    // $ANTLR start "rule___int__Group_3__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2367:1: rule___int__Group_3__0 : rule___int__Group_3__0__Impl rule___int__Group_3__1 ;
    public final void rule___int__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2371:1: ( rule___int__Group_3__0__Impl rule___int__Group_3__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2372:2: rule___int__Group_3__0__Impl rule___int__Group_3__1
            {
            pushFollow(FOLLOW_rule___int__Group_3__0__Impl_in_rule___int__Group_3__04715);
            rule___int__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___int__Group_3__1_in_rule___int__Group_3__04718);
            rule___int__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group_3__0"


    // $ANTLR start "rule___int__Group_3__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2379:1: rule___int__Group_3__0__Impl : ( '=' ) ;
    public final void rule___int__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2383:1: ( ( '=' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2384:1: ( '=' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2384:1: ( '=' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2385:1: '='
            {
             before(grammarAccess.get_intAccess().getEqualsSignKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule___int__Group_3__0__Impl4746); 
             after(grammarAccess.get_intAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group_3__0__Impl"


    // $ANTLR start "rule___int__Group_3__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2398:1: rule___int__Group_3__1 : rule___int__Group_3__1__Impl ;
    public final void rule___int__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2402:1: ( rule___int__Group_3__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2403:2: rule___int__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule___int__Group_3__1__Impl_in_rule___int__Group_3__14777);
            rule___int__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group_3__1"


    // $ANTLR start "rule___int__Group_3__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2409:1: rule___int__Group_3__1__Impl : ( ( rule___int__IntAssignment_3_1 ) ) ;
    public final void rule___int__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2413:1: ( ( ( rule___int__IntAssignment_3_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2414:1: ( ( rule___int__IntAssignment_3_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2414:1: ( ( rule___int__IntAssignment_3_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2415:1: ( rule___int__IntAssignment_3_1 )
            {
             before(grammarAccess.get_intAccess().getIntAssignment_3_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2416:1: ( rule___int__IntAssignment_3_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2416:2: rule___int__IntAssignment_3_1
            {
            pushFollow(FOLLOW_rule___int__IntAssignment_3_1_in_rule___int__Group_3__1__Impl4804);
            rule___int__IntAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.get_intAccess().getIntAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__Group_3__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2430:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2434:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2435:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04838);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04841);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2442:1: rule__Number__Group__0__Impl : ( ( rule__Number__NameAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2446:1: ( ( ( rule__Number__NameAssignment_0 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2447:1: ( ( rule__Number__NameAssignment_0 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2447:1: ( ( rule__Number__NameAssignment_0 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2448:1: ( rule__Number__NameAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNameAssignment_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2449:1: ( rule__Number__NameAssignment_0 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2449:2: rule__Number__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Number__NameAssignment_0_in_rule__Number__Group__0__Impl4868);
            rule__Number__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2459:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2463:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2464:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14898);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__2_in_rule__Number__Group__14901);
            rule__Number__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2471:1: rule__Number__Group__1__Impl : ( ':' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2475:1: ( ( ':' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2476:1: ( ':' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2476:1: ( ':' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2477:1: ':'
            {
             before(grammarAccess.getNumberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Number__Group__1__Impl4929); 
             after(grammarAccess.getNumberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2490:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2494:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2495:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__24960);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__3_in_rule__Number__Group__24963);
            rule__Number__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2502:1: rule__Number__Group__2__Impl : ( 'Number' ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2506:1: ( ( 'Number' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2507:1: ( 'Number' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2507:1: ( 'Number' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2508:1: 'Number'
            {
             before(grammarAccess.getNumberAccess().getNumberKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Number__Group__2__Impl4991); 
             after(grammarAccess.getNumberAccess().getNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2521:1: rule__Number__Group__3 : rule__Number__Group__3__Impl rule__Number__Group__4 ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2525:1: ( rule__Number__Group__3__Impl rule__Number__Group__4 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2526:2: rule__Number__Group__3__Impl rule__Number__Group__4
            {
            pushFollow(FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__35022);
            rule__Number__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__4_in_rule__Number__Group__35025);
            rule__Number__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2533:1: rule__Number__Group__3__Impl : ( ( rule__Number__Group_3__0 )? ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2537:1: ( ( ( rule__Number__Group_3__0 )? ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2538:1: ( ( rule__Number__Group_3__0 )? )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2538:1: ( ( rule__Number__Group_3__0 )? )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2539:1: ( rule__Number__Group_3__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_3()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2540:1: ( rule__Number__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2540:2: rule__Number__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl5052);
                    rule__Number__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Number__Group__4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2550:1: rule__Number__Group__4 : rule__Number__Group__4__Impl ;
    public final void rule__Number__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2554:1: ( rule__Number__Group__4__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2555:2: rule__Number__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__4__Impl_in_rule__Number__Group__45083);
            rule__Number__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__4"


    // $ANTLR start "rule__Number__Group__4__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2561:1: rule__Number__Group__4__Impl : ( ';' ) ;
    public final void rule__Number__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2565:1: ( ( ';' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2566:1: ( ';' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2566:1: ( ';' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2567:1: ';'
            {
             before(grammarAccess.getNumberAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Number__Group__4__Impl5111); 
             after(grammarAccess.getNumberAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__4__Impl"


    // $ANTLR start "rule__Number__Group_3__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2590:1: rule__Number__Group_3__0 : rule__Number__Group_3__0__Impl rule__Number__Group_3__1 ;
    public final void rule__Number__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2594:1: ( rule__Number__Group_3__0__Impl rule__Number__Group_3__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2595:2: rule__Number__Group_3__0__Impl rule__Number__Group_3__1
            {
            pushFollow(FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__05152);
            rule__Number__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__05155);
            rule__Number__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__0"


    // $ANTLR start "rule__Number__Group_3__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2602:1: rule__Number__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Number__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2606:1: ( ( '=' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2607:1: ( '=' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2607:1: ( '=' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2608:1: '='
            {
             before(grammarAccess.getNumberAccess().getEqualsSignKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Number__Group_3__0__Impl5183); 
             after(grammarAccess.getNumberAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__0__Impl"


    // $ANTLR start "rule__Number__Group_3__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2621:1: rule__Number__Group_3__1 : rule__Number__Group_3__1__Impl ;
    public final void rule__Number__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2625:1: ( rule__Number__Group_3__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2626:2: rule__Number__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__15214);
            rule__Number__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__1"


    // $ANTLR start "rule__Number__Group_3__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2632:1: rule__Number__Group_3__1__Impl : ( ( rule__Number__DoubleAssignment_3_1 ) ) ;
    public final void rule__Number__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2636:1: ( ( ( rule__Number__DoubleAssignment_3_1 ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2637:1: ( ( rule__Number__DoubleAssignment_3_1 ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2637:1: ( ( rule__Number__DoubleAssignment_3_1 ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2638:1: ( rule__Number__DoubleAssignment_3_1 )
            {
             before(grammarAccess.getNumberAccess().getDoubleAssignment_3_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2639:1: ( rule__Number__DoubleAssignment_3_1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2639:2: rule__Number__DoubleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Number__DoubleAssignment_3_1_in_rule__Number__Group_3__1__Impl5241);
            rule__Number__DoubleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getDoubleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2653:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2657:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2658:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05275);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05278);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2665:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2669:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2670:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2670:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2671:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5305); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2682:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2686:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2687:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15334);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2693:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2697:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2698:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2698:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2699:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2700:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2700:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5361);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2714:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2718:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2719:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05396);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05399);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2726:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2730:1: ( ( '.' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2731:1: ( '.' )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2731:1: ( '.' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2732:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl5427); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2745:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2749:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2750:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15458);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2756:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2760:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2761:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2761:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2762:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5485); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2778:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2782:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2783:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2783:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2784:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_15523);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElemntsAssignment_3"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2793:1: rule__PackageDeclaration__ElemntsAssignment_3 : ( ruleActionScript ) ;
    public final void rule__PackageDeclaration__ElemntsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2797:1: ( ( ruleActionScript ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2798:1: ( ruleActionScript )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2798:1: ( ruleActionScript )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2799:1: ruleActionScript
            {
             before(grammarAccess.getPackageDeclarationAccess().getElemntsActionScriptParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActionScript_in_rule__PackageDeclaration__ElemntsAssignment_35554);
            ruleActionScript();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElemntsActionScriptParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElemntsAssignment_3"


    // $ANTLR start "rule__ActionScript__ImportsAssignment_0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2808:1: rule__ActionScript__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__ActionScript__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2812:1: ( ( ruleImport ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2813:1: ( ruleImport )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2813:1: ( ruleImport )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2814:1: ruleImport
            {
             before(grammarAccess.getActionScriptAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ActionScript__ImportsAssignment_05585);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getActionScriptAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__ImportsAssignment_0"


    // $ANTLR start "rule__ActionScript__ElementsAssignment_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2823:1: rule__ActionScript__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__ActionScript__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2827:1: ( ( ruleType ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2828:1: ( ruleType )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2828:1: ( ruleType )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2829:1: ruleType
            {
             before(grammarAccess.getActionScriptAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ActionScript__ElementsAssignment_15616);
            ruleType();

            state._fsp--;

             after(grammarAccess.getActionScriptAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionScript__ElementsAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2838:1: rule__Import__ImportURIAssignment_1 : ( rulePackageDeclaration ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2842:1: ( ( rulePackageDeclaration ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2843:1: ( rulePackageDeclaration )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2843:1: ( rulePackageDeclaration )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2844:1: rulePackageDeclaration
            {
             before(grammarAccess.getImportAccess().getImportURIPackageDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Import__ImportURIAssignment_15647);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportURIPackageDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2853:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2857:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2858:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2858:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2859:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_15678); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__SuperClassAssignment_2_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2868:1: rule__Class__SuperClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2872:1: ( ( ( RULE_ID ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2873:1: ( ( RULE_ID ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2873:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2874:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2875:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2876:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__SuperClassAssignment_2_15713); 
             after(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperClassAssignment_2_1"


    // $ANTLR start "rule__Class__PropertiesAssignment_4"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2887:1: rule__Class__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Class__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2891:1: ( ( ruleProperty ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2892:1: ( ruleProperty )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2892:1: ( ruleProperty )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2893:1: ruleProperty
            {
             before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_45748);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropertiesAssignment_4"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2902:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2906:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2907:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2907:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2908:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15779); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__UNIT__NameAssignment_0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2917:1: rule__UNIT__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__UNIT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2921:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2922:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2922:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2923:1: RULE_ID
            {
             before(grammarAccess.getUNITAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UNIT__NameAssignment_05810); 
             after(grammarAccess.getUNITAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__NameAssignment_0"


    // $ANTLR start "rule__UNIT__StringAssignment_3_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2932:1: rule__UNIT__StringAssignment_3_1 : ( ( '0x000000' ) ) ;
    public final void rule__UNIT__StringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2936:1: ( ( ( '0x000000' ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2937:1: ( ( '0x000000' ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2937:1: ( ( '0x000000' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2938:1: ( '0x000000' )
            {
             before(grammarAccess.getUNITAccess().getString0x000000Keyword_3_1_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2939:1: ( '0x000000' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2940:1: '0x000000'
            {
             before(grammarAccess.getUNITAccess().getString0x000000Keyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__UNIT__StringAssignment_3_15846); 
             after(grammarAccess.getUNITAccess().getString0x000000Keyword_3_1_0()); 

            }

             after(grammarAccess.getUNITAccess().getString0x000000Keyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__StringAssignment_3_1"


    // $ANTLR start "rule___String__NameAssignment_0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2955:1: rule___String__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule___String__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2959:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2960:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2960:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2961:1: RULE_ID
            {
             before(grammarAccess.get_StringAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule___String__NameAssignment_05885); 
             after(grammarAccess.get_StringAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__NameAssignment_0"


    // $ANTLR start "rule___String__StringAssignment_3_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2970:1: rule___String__StringAssignment_3_1 : ( ( '' ) ) ;
    public final void rule___String__StringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2974:1: ( ( ( '' ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2975:1: ( ( '' ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2975:1: ( ( '' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2976:1: ( '' )
            {
             before(grammarAccess.get_StringAccess().getStringKeyword_3_1_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2977:1: ( '' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2978:1: ''
            {
             before(grammarAccess.get_StringAccess().getStringKeyword_3_1_0()); 
            match(input,32,FOLLOW_32_in_rule___String__StringAssignment_3_15921); 
             after(grammarAccess.get_StringAccess().getStringKeyword_3_1_0()); 

            }

             after(grammarAccess.get_StringAccess().getStringKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___String__StringAssignment_3_1"


    // $ANTLR start "rule___int__NameAssignment_0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2993:1: rule___int__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule___int__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2997:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2998:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2998:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:2999:1: RULE_ID
            {
             before(grammarAccess.get_intAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule___int__NameAssignment_05960); 
             after(grammarAccess.get_intAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__NameAssignment_0"


    // $ANTLR start "rule___int__IntAssignment_3_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3008:1: rule___int__IntAssignment_3_1 : ( ( '0' ) ) ;
    public final void rule___int__IntAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3012:1: ( ( ( '0' ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3013:1: ( ( '0' ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3013:1: ( ( '0' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3014:1: ( '0' )
            {
             before(grammarAccess.get_intAccess().getInt0Keyword_3_1_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3015:1: ( '0' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3016:1: '0'
            {
             before(grammarAccess.get_intAccess().getInt0Keyword_3_1_0()); 
            match(input,33,FOLLOW_33_in_rule___int__IntAssignment_3_15996); 
             after(grammarAccess.get_intAccess().getInt0Keyword_3_1_0()); 

            }

             after(grammarAccess.get_intAccess().getInt0Keyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___int__IntAssignment_3_1"


    // $ANTLR start "rule__Number__NameAssignment_0"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3031:1: rule__Number__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Number__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3035:1: ( ( RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3036:1: ( RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3036:1: ( RULE_ID )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3037:1: RULE_ID
            {
             before(grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Number__NameAssignment_06035); 
             after(grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__NameAssignment_0"


    // $ANTLR start "rule__Number__DoubleAssignment_3_1"
    // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3046:1: rule__Number__DoubleAssignment_3_1 : ( ( '0' ) ) ;
    public final void rule__Number__DoubleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3050:1: ( ( ( '0' ) ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3051:1: ( ( '0' ) )
            {
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3051:1: ( ( '0' ) )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3052:1: ( '0' )
            {
             before(grammarAccess.getNumberAccess().getDouble0Keyword_3_1_0()); 
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3053:1: ( '0' )
            // ../de.lynorics.eclipse.jangaroo.ui/src-gen/de/lynorics/eclipse/jangaroo/ui/contentassist/antlr/internal/InternalAS3.g:3054:1: '0'
            {
             before(grammarAccess.getNumberAccess().getDouble0Keyword_3_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Number__DoubleAssignment_3_16071); 
             after(grammarAccess.getNumberAccess().getDouble0Keyword_3_1_0()); 

            }

             after(grammarAccess.getNumberAccess().getDouble0Keyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__DoubleAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionScript_in_entryRuleActionScript181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionScript188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionScript__Group__0_in_ruleActionScript214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_entryRuleVisibility421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibility428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Alternatives_in_ruleVariables634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0_in_ruleUNIT694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_String_in_entryRule_String721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_String728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__0_in_rule_String754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_int_in_entryRule_int781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_int788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__0_in_rule_int814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0_in_rulenumber874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionScript_in_rule__Model__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Type__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_rule__Type__Alternatives1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__0_in_rule__Property__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Property__Alternatives1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Visibility__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__0_in_rule__Variables__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_1__0_in_rule__Variables__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_2__0_in_rule__Variables__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_3__0_in_rule__Variables__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group__0__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11338 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21398 = new BitSet(new long[]{0x0000000000951800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PackageDeclaration__Group__2__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElemntsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Group__4__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionScript__Group__0__Impl_in_rule__ActionScript__Group__01589 = new BitSet(new long[]{0x0000000000951800L});
    public static final BitSet FOLLOW_rule__ActionScript__Group__1_in_rule__ActionScript__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionScript__ImportsAssignment_0_in_rule__ActionScript__Group__0__Impl1619 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ActionScript__Group__1__Impl_in_rule__ActionScript__Group__11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionScript__ElementsAssignment_1_in_rule__ActionScript__Group__1__Impl1679 = new BitSet(new long[]{0x0000000000951802L});
    public static final BitSet FOLLOW_rule__ActionScript__ElementsAssignment_1_in_rule__ActionScript__Group__1__Impl1691 = new BitSet(new long[]{0x0000000000951802L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01728 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__0__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11790 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__2__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__01915 = new BitSet(new long[]{0x0000000000041800L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Type__Group_0__0__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Type__Group_0__1__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__0__Impl_in_rule__Property__Group_0__02037 = new BitSet(new long[]{0x0000000000951800L});
    public static final BitSet FOLLOW_rule__Property__Group_0__1_in_rule__Property__Group_0__02040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Property__Group_0__0__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__1__Impl_in_rule__Property__Group_0__12099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_rule__Property__Group_0__1__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__0__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12221 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22281 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32342 = new BitSet(new long[]{0x0000000000959800L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Class__Group__3__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42404 = new BitSet(new long[]{0x0000000000959800L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2434 = new BitSet(new long[]{0x0000000000951802L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Class__Group__5__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group_2__0__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperClassAssignment_2_1_in_rule__Class__Group_2__1__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12721 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22781 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Function__Group__2__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Function__Group__3__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42905 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Function__Group__4__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__5__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__0__Impl_in_rule__Variables__Group_0__03038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__1_in_rule__Variables__Group_0__03041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variables__Group_0__0__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__1__Impl_in_rule__Variables__Group_0__13100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_rule__Variables__Group_0__1__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_1__0__Impl_in_rule__Variables__Group_1__03160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variables__Group_1__1_in_rule__Variables__Group_1__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variables__Group_1__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_1__1__Impl_in_rule__Variables__Group_1__13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_String_in_rule__Variables__Group_1__1__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_2__0__Impl_in_rule__Variables__Group_2__03282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variables__Group_2__1_in_rule__Variables__Group_2__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variables__Group_2__0__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_2__1__Impl_in_rule__Variables__Group_2__13344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_int_in_rule__Variables__Group_2__1__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_3__0__Impl_in_rule__Variables__Group_3__03404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variables__Group_3__1_in_rule__Variables__Group_3__03407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variables__Group_3__0__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_3__1__Impl_in_rule__Variables__Group_3__13466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Variables__Group_3__1__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__03526 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__03529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__NameAssignment_0_in_rule__UNIT__Group__0__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__13586 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UNIT__Group__2_in_rule__UNIT__Group__13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UNIT__Group__1__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__2__Impl_in_rule__UNIT__Group__23648 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__UNIT__Group__3_in_rule__UNIT__Group__23651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UNIT__Group__2__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__3__Impl_in_rule__UNIT__Group__33710 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__UNIT__Group__4_in_rule__UNIT__Group__33713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_3__0_in_rule__UNIT__Group__3__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__4__Impl_in_rule__UNIT__Group__43771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UNIT__Group__4__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_3__0__Impl_in_rule__UNIT__Group_3__03840 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UNIT__Group_3__1_in_rule__UNIT__Group_3__03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UNIT__Group_3__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_3__1__Impl_in_rule__UNIT__Group_3__13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__StringAssignment_3_1_in_rule__UNIT__Group_3__1__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__0__Impl_in_rule___String__Group__03963 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule___String__Group__1_in_rule___String__Group__03966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__NameAssignment_0_in_rule___String__Group__0__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__1__Impl_in_rule___String__Group__14023 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule___String__Group__2_in_rule___String__Group__14026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule___String__Group__1__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__2__Impl_in_rule___String__Group__24085 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule___String__Group__3_in_rule___String__Group__24088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule___String__Group__2__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__3__Impl_in_rule___String__Group__34147 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule___String__Group__4_in_rule___String__Group__34150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group_3__0_in_rule___String__Group__3__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group__4__Impl_in_rule___String__Group__44208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule___String__Group__4__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group_3__0__Impl_in_rule___String__Group_3__04277 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule___String__Group_3__1_in_rule___String__Group_3__04280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule___String__Group_3__0__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__Group_3__1__Impl_in_rule___String__Group_3__14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___String__StringAssignment_3_1_in_rule___String__Group_3__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__0__Impl_in_rule___int__Group__04401 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule___int__Group__1_in_rule___int__Group__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__NameAssignment_0_in_rule___int__Group__0__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__1__Impl_in_rule___int__Group__14461 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule___int__Group__2_in_rule___int__Group__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule___int__Group__1__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__2__Impl_in_rule___int__Group__24523 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule___int__Group__3_in_rule___int__Group__24526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule___int__Group__2__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__3__Impl_in_rule___int__Group__34585 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule___int__Group__4_in_rule___int__Group__34588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group_3__0_in_rule___int__Group__3__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group__4__Impl_in_rule___int__Group__44646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule___int__Group__4__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group_3__0__Impl_in_rule___int__Group_3__04715 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule___int__Group_3__1_in_rule___int__Group_3__04718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule___int__Group_3__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__Group_3__1__Impl_in_rule___int__Group_3__14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___int__IntAssignment_3_1_in_rule___int__Group_3__1__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04838 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__NameAssignment_0_in_rule__Number__Group__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Number__Group__2_in_rule__Number__Group__14901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Number__Group__1__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__24960 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Number__Group__3_in_rule__Number__Group__24963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Number__Group__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__35022 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Number__Group__4_in_rule__Number__Group__35025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__4__Impl_in_rule__Number__Group__45083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Number__Group__4__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__05152 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__05155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Number__Group_3__0__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__15214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__DoubleAssignment_3_1_in_rule__Number__Group_3__1__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05275 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5361 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionScript_in_rule__PackageDeclaration__ElemntsAssignment_35554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ActionScript__ImportsAssignment_05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ActionScript__ElementsAssignment_15616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Import__ImportURIAssignment_15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_15678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__SuperClassAssignment_2_15713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_45748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UNIT__NameAssignment_05810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UNIT__StringAssignment_3_15846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule___String__NameAssignment_05885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule___String__StringAssignment_3_15921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule___int__NameAssignment_05960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule___int__IntAssignment_3_15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Number__NameAssignment_06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Number__DoubleAssignment_3_16071 = new BitSet(new long[]{0x0000000000000002L});

}