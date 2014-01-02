package de.lynorics.eclipse.jangaroo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAS3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "';'", "'public'", "'private'", "'class'", "'extends'", "'function'", "'('", "')'", "'var'", "':'", "'unit'", "'='", "'0x000000'", "'String'", "''", "'int'", "'0'", "'Number'", "'.'"
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
    public String getGrammarFileName() { return "../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g"; }



     	private AS3GrammarAccess grammarAccess;
     	
        public InternalAS3Parser(TokenStream input, AS3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AS3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:76:1: ruleModel returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_ActionScript_1= ruleActionScript ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_ActionScript_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:79:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_ActionScript_1= ruleActionScript ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:80:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_ActionScript_1= ruleActionScript )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:80:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_ActionScript_1= ruleActionScript )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=18)||LA1_0==20||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:81:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModel132);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:91:5: this_ActionScript_1= ruleActionScript
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getActionScriptParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionScript_in_ruleModel159);
                    this_ActionScript_1=ruleActionScript();

                    state._fsp--;

                     
                            current = this_ActionScript_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:108:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:109:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration194);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:116:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elemnts_3_0= ruleActionScript ) ) otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elemnts_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:119:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elemnts_3_0= ruleActionScript ) ) otherlv_4= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:120:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elemnts_3_0= ruleActionScript ) ) otherlv_4= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:120:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elemnts_3_0= ruleActionScript ) ) otherlv_4= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:120:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elemnts_3_0= ruleActionScript ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration241); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:124:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:125:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:125:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:126:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration262);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration274); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:146:1: ( (lv_elemnts_3_0= ruleActionScript ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:147:1: (lv_elemnts_3_0= ruleActionScript )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:147:1: (lv_elemnts_3_0= ruleActionScript )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:148:3: lv_elemnts_3_0= ruleActionScript
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElemntsActionScriptParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActionScript_in_rulePackageDeclaration295);
            lv_elemnts_3_0=ruleActionScript();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"elemnts",
                    		lv_elemnts_3_0, 
                    		"ActionScript");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration307); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleActionScript"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:176:1: entryRuleActionScript returns [EObject current=null] : iv_ruleActionScript= ruleActionScript EOF ;
    public final EObject entryRuleActionScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionScript = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:177:2: (iv_ruleActionScript= ruleActionScript EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:178:2: iv_ruleActionScript= ruleActionScript EOF
            {
             newCompositeNode(grammarAccess.getActionScriptRule()); 
            pushFollow(FOLLOW_ruleActionScript_in_entryRuleActionScript343);
            iv_ruleActionScript=ruleActionScript();

            state._fsp--;

             current =iv_ruleActionScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionScript353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionScript"


    // $ANTLR start "ruleActionScript"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:185:1: ruleActionScript returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleType ) )+ ) ;
    public final EObject ruleActionScript() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:188:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleType ) )+ ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:189:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleType ) )+ )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:189:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleType ) )+ )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:189:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleType ) )+
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:189:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:190:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:190:1: (lv_imports_0_0= ruleImport )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:191:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionScriptAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleActionScript399);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:207:3: ( (lv_elements_1_0= ruleType ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=18)||LA3_0==20||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:208:1: (lv_elements_1_0= ruleType )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:208:1: (lv_elements_1_0= ruleType )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:209:3: lv_elements_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionScriptAccess().getElementsTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleActionScript421);
            	    lv_elements_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionScript"


    // $ANTLR start "entryRuleImport"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:233:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:234:2: (iv_ruleImport= ruleImport EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:235:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport458);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:242:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= rulePackageDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_importURI_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:245:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= rulePackageDeclaration ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:246:1: (otherlv_0= 'import' ( (lv_importURI_1_0= rulePackageDeclaration ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:246:1: (otherlv_0= 'import' ( (lv_importURI_1_0= rulePackageDeclaration ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:246:3: otherlv_0= 'import' ( (lv_importURI_1_0= rulePackageDeclaration ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport505); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:250:1: ( (lv_importURI_1_0= rulePackageDeclaration ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:251:1: (lv_importURI_1_0= rulePackageDeclaration )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:251:1: (lv_importURI_1_0= rulePackageDeclaration )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:252:3: lv_importURI_1_0= rulePackageDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportURIPackageDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleImport526);
            lv_importURI_1_0=rulePackageDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"PackageDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport538); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:280:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:281:2: (iv_ruleType= ruleType EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:282:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType574);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType584); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:289:1: ruleType returns [EObject current=null] : ( ( ( ruleVisibility )? this_Class_1= ruleClass ) | this_Function_2= ruleFunction | this_Variables_3= ruleVariables ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_1 = null;

        EObject this_Function_2 = null;

        EObject this_Variables_3 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:292:28: ( ( ( ( ruleVisibility )? this_Class_1= ruleClass ) | this_Function_2= ruleFunction | this_Variables_3= ruleVariables ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:1: ( ( ( ruleVisibility )? this_Class_1= ruleClass ) | this_Function_2= ruleFunction | this_Variables_3= ruleVariables )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:1: ( ( ( ruleVisibility )? this_Class_1= ruleClass ) | this_Function_2= ruleFunction | this_Variables_3= ruleVariables )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:2: ( ( ruleVisibility )? this_Class_1= ruleClass )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:2: ( ( ruleVisibility )? this_Class_1= ruleClass )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:3: ( ruleVisibility )? this_Class_1= ruleClass
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:293:3: ( ruleVisibility )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:294:5: ruleVisibility
                            {
                             
                                    newCompositeNode(grammarAccess.getTypeAccess().getVisibilityParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleVisibility_in_ruleType627);
                            ruleVisibility();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleType650);
                    this_Class_1=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:312:5: this_Function_2= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleType678);
                    this_Function_2=ruleFunction();

                    state._fsp--;

                     
                            current = this_Function_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:322:5: this_Variables_3= ruleVariables
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVariablesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariables_in_ruleType705);
                    this_Variables_3=ruleVariables();

                    state._fsp--;

                     
                            current = this_Variables_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleProperty"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:338:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:339:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:340:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty740);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:347:1: ruleProperty returns [EObject current=null] : ( ( ( ruleVisibility )? this_Variables_1= ruleVariables ) | this_Function_2= ruleFunction ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Variables_1 = null;

        EObject this_Function_2 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:350:28: ( ( ( ( ruleVisibility )? this_Variables_1= ruleVariables ) | this_Function_2= ruleFunction ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:1: ( ( ( ruleVisibility )? this_Variables_1= ruleVariables ) | this_Function_2= ruleFunction )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:1: ( ( ( ruleVisibility )? this_Variables_1= ruleVariables ) | this_Function_2= ruleFunction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:2: ( ( ruleVisibility )? this_Variables_1= ruleVariables )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:2: ( ( ruleVisibility )? this_Variables_1= ruleVariables )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:3: ( ruleVisibility )? this_Variables_1= ruleVariables
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:3: ( ruleVisibility )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:352:5: ruleVisibility
                            {
                             
                                    newCompositeNode(grammarAccess.getPropertyAccess().getVisibilityParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleVisibility_in_ruleProperty793);
                            ruleVisibility();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getVariablesParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariables_in_ruleProperty816);
                    this_Variables_1=ruleVariables();

                    state._fsp--;

                     
                            current = this_Variables_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:370:5: this_Function_2= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleProperty844);
                    this_Function_2=ruleFunction();

                    state._fsp--;

                     
                            current = this_Function_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleVisibility"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:386:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:387:2: (iv_ruleVisibility= ruleVisibility EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:388:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_ruleVisibility_in_entryRuleVisibility880);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibility891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:395:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:28: ( (kw= 'public' | kw= 'private' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (kw= 'public' | kw= 'private' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (kw= 'public' | kw= 'private' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:400:2: kw= 'public'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVisibility929); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:407:2: kw= 'private'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVisibility948); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleClass"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:420:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:421:2: (iv_ruleClass= ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:422:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass988);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:429:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:432:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:433:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:433:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:433:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleClass1035); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:437:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:438:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:438:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:439:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1052); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:455:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:455:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleClass1070); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                        
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:459:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:460:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:460:1: (otherlv_3= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:461:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1090); 

                    		newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleClass1104); 

                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:476:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=16 && LA10_0<=17)||LA10_0==20||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:477:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:477:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:478:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleClass1125);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleClass1138); 

                	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleFunction"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:506:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:2: (iv_ruleFunction= ruleFunction EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1174);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:515:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:518:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:519:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:519:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:519:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFunction1221); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:523:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:524:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:524:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:525:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1238); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunction1255); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFunction1267); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFunction1279); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFunction1291); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariables"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:565:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:566:2: (iv_ruleVariables= ruleVariables EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:567:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables1327);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables1337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:574:1: ruleVariables returns [EObject current=null] : ( (otherlv_0= 'var' this_UNIT_1= ruleUNIT ) | (otherlv_2= 'var' this__String_3= rule_String ) | (otherlv_4= 'var' this__int_5= rule_int ) | (otherlv_6= 'var' this_number_7= rulenumber ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UNIT_1 = null;

        EObject this__String_3 = null;

        EObject this__int_5 = null;

        EObject this_number_7 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:577:28: ( ( (otherlv_0= 'var' this_UNIT_1= ruleUNIT ) | (otherlv_2= 'var' this__String_3= rule_String ) | (otherlv_4= 'var' this__int_5= rule_int ) | (otherlv_6= 'var' this_number_7= rulenumber ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:1: ( (otherlv_0= 'var' this_UNIT_1= ruleUNIT ) | (otherlv_2= 'var' this__String_3= rule_String ) | (otherlv_4= 'var' this__int_5= rule_int ) | (otherlv_6= 'var' this_number_7= rulenumber ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:1: ( (otherlv_0= 'var' this_UNIT_1= ruleUNIT ) | (otherlv_2= 'var' this__String_3= rule_String ) | (otherlv_4= 'var' this__int_5= rule_int ) | (otherlv_6= 'var' this_number_7= rulenumber ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==24) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            alt11=4;
                            }
                            break;
                        case 30:
                            {
                            alt11=3;
                            }
                            break;
                        case 25:
                            {
                            alt11=1;
                            }
                            break;
                        case 28:
                            {
                            alt11=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:2: (otherlv_0= 'var' this_UNIT_1= ruleUNIT )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:2: (otherlv_0= 'var' this_UNIT_1= ruleUNIT )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:4: otherlv_0= 'var' this_UNIT_1= ruleUNIT
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleVariables1375); 

                        	newLeafNode(otherlv_0, grammarAccess.getVariablesAccess().getVarKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getUNITParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUNIT_in_ruleVariables1397);
                    this_UNIT_1=ruleUNIT();

                    state._fsp--;

                     
                            current = this_UNIT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:592:6: (otherlv_2= 'var' this__String_3= rule_String )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:592:6: (otherlv_2= 'var' this__String_3= rule_String )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:592:8: otherlv_2= 'var' this__String_3= rule_String
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleVariables1416); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesAccess().getVarKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().get_StringParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rule_String_in_ruleVariables1438);
                    this__String_3=rule_String();

                    state._fsp--;

                     
                            current = this__String_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:606:6: (otherlv_4= 'var' this__int_5= rule_int )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:606:6: (otherlv_4= 'var' this__int_5= rule_int )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:606:8: otherlv_4= 'var' this__int_5= rule_int
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleVariables1457); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesAccess().getVarKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().get_intParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_rule_int_in_ruleVariables1479);
                    this__int_5=rule_int();

                    state._fsp--;

                     
                            current = this__int_5; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:620:6: (otherlv_6= 'var' this_number_7= rulenumber )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:620:6: (otherlv_6= 'var' this_number_7= rulenumber )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:620:8: otherlv_6= 'var' this_number_7= rulenumber
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleVariables1498); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariablesAccess().getVarKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getNumberParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_ruleVariables1520);
                    this_number_7=rulenumber();

                    state._fsp--;

                     
                            current = this_number_7; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleUNIT"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:641:1: entryRuleUNIT returns [EObject current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final EObject entryRuleUNIT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNIT = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:642:2: (iv_ruleUNIT= ruleUNIT EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:643:2: iv_ruleUNIT= ruleUNIT EOF
            {
             newCompositeNode(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT1556);
            iv_ruleUNIT=ruleUNIT();

            state._fsp--;

             current =iv_ruleUNIT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT1566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:650:1: ruleUNIT returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'unit' (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleUNIT() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_String_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:653:28: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'unit' (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )? otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:654:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'unit' (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )? otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:654:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'unit' (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )? otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:654:2: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'unit' (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )? otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:654:2: ( (lv_Name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:655:1: (lv_Name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:655:1: (lv_Name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:656:3: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUNIT1608); 

            			newLeafNode(lv_Name_0_0, grammarAccess.getUNITAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUNITRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Name",
                    		lv_Name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleUNIT1625); 

                	newLeafNode(otherlv_1, grammarAccess.getUNITAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleUNIT1637); 

                	newLeafNode(otherlv_2, grammarAccess.getUNITAccess().getUnitKeyword_2());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:680:1: (otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:680:3: otherlv_3= '=' ( (lv_String_4_0= '0x000000' ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleUNIT1650); 

                        	newLeafNode(otherlv_3, grammarAccess.getUNITAccess().getEqualsSignKeyword_3_0());
                        
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:684:1: ( (lv_String_4_0= '0x000000' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:685:1: (lv_String_4_0= '0x000000' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:685:1: (lv_String_4_0= '0x000000' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:686:3: lv_String_4_0= '0x000000'
                    {
                    lv_String_4_0=(Token)match(input,27,FOLLOW_27_in_ruleUNIT1668); 

                            newLeafNode(lv_String_4_0, grammarAccess.getUNITAccess().getString0x000000Keyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUNITRule());
                    	        }
                           		setWithLastConsumed(current, "String", lv_String_4_0, "0x000000");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUNIT1695); 

                	newLeafNode(otherlv_5, grammarAccess.getUNITAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "entryRule_String"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:711:1: entryRule_String returns [EObject current=null] : iv_rule_String= rule_String EOF ;
    public final EObject entryRule_String() throws RecognitionException {
        EObject current = null;

        EObject iv_rule_String = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:712:2: (iv_rule_String= rule_String EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:713:2: iv_rule_String= rule_String EOF
            {
             newCompositeNode(grammarAccess.get_StringRule()); 
            pushFollow(FOLLOW_rule_String_in_entryRule_String1731);
            iv_rule_String=rule_String();

            state._fsp--;

             current =iv_rule_String; 
            match(input,EOF,FOLLOW_EOF_in_entryRule_String1741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_String"


    // $ANTLR start "rule_String"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:720:1: rule_String returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )? otherlv_5= ';' ) ;
    public final EObject rule_String() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_String_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:723:28: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )? otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )? otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )? otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:2: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )? otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:2: ( (lv_Name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:725:1: (lv_Name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:725:1: (lv_Name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:726:3: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rule_String1783); 

            			newLeafNode(lv_Name_0_0, grammarAccess.get_StringAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.get_StringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Name",
                    		lv_Name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rule_String1800); 

                	newLeafNode(otherlv_1, grammarAccess.get_StringAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rule_String1812); 

                	newLeafNode(otherlv_2, grammarAccess.get_StringAccess().getStringKeyword_2());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:750:1: (otherlv_3= '=' ( (lv_String_4_0= '' ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:750:3: otherlv_3= '=' ( (lv_String_4_0= '' ) )?
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rule_String1825); 

                        	newLeafNode(otherlv_3, grammarAccess.get_StringAccess().getEqualsSignKeyword_3_0());
                        
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:754:1: ( (lv_String_4_0= '' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:755:1: (lv_String_4_0= '' )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:755:1: (lv_String_4_0= '' )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:756:3: lv_String_4_0= ''
                            {
                            lv_String_4_0=(Token)match(input,29,FOLLOW_29_in_rule_String1843); 

                                    newLeafNode(lv_String_4_0, grammarAccess.get_StringAccess().getStringKeyword_3_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.get_StringRule());
                            	        }
                                   		setWithLastConsumed(current, "String", lv_String_4_0, "");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rule_String1871); 

                	newLeafNode(otherlv_5, grammarAccess.get_StringAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rule_String"


    // $ANTLR start "entryRule_int"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:781:1: entryRule_int returns [EObject current=null] : iv_rule_int= rule_int EOF ;
    public final EObject entryRule_int() throws RecognitionException {
        EObject current = null;

        EObject iv_rule_int = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:782:2: (iv_rule_int= rule_int EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:783:2: iv_rule_int= rule_int EOF
            {
             newCompositeNode(grammarAccess.get_intRule()); 
            pushFollow(FOLLOW_rule_int_in_entryRule_int1907);
            iv_rule_int=rule_int();

            state._fsp--;

             current =iv_rule_int; 
            match(input,EOF,FOLLOW_EOF_in_entryRule_int1917); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_int"


    // $ANTLR start "rule_int"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:790:1: rule_int returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'int' (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )? otherlv_5= ';' ) ;
    public final EObject rule_int() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_int_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:793:28: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'int' (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )? otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:794:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'int' (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )? otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:794:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'int' (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )? otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:794:2: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'int' (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )? otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:794:2: ( (lv_Name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:795:1: (lv_Name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:795:1: (lv_Name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:796:3: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rule_int1959); 

            			newLeafNode(lv_Name_0_0, grammarAccess.get_intAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.get_intRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Name",
                    		lv_Name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rule_int1976); 

                	newLeafNode(otherlv_1, grammarAccess.get_intAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rule_int1988); 

                	newLeafNode(otherlv_2, grammarAccess.get_intAccess().getIntKeyword_2());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:820:1: (otherlv_3= '=' ( (lv_int_4_0= '0' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:820:3: otherlv_3= '=' ( (lv_int_4_0= '0' ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rule_int2001); 

                        	newLeafNode(otherlv_3, grammarAccess.get_intAccess().getEqualsSignKeyword_3_0());
                        
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:824:1: ( (lv_int_4_0= '0' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:825:1: (lv_int_4_0= '0' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:825:1: (lv_int_4_0= '0' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:826:3: lv_int_4_0= '0'
                    {
                    lv_int_4_0=(Token)match(input,31,FOLLOW_31_in_rule_int2019); 

                            newLeafNode(lv_int_4_0, grammarAccess.get_intAccess().getInt0Keyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.get_intRule());
                    	        }
                           		setWithLastConsumed(current, "int", lv_int_4_0, "0");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rule_int2046); 

                	newLeafNode(otherlv_5, grammarAccess.get_intAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rule_int"


    // $ANTLR start "entryRulenumber"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:851:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:852:2: (iv_rulenumber= rulenumber EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:853:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber2082);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber2092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:860:1: rulenumber returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Number' (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )? otherlv_5= ';' ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_double_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:863:28: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Number' (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )? otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Number' (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )? otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:1: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Number' (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )? otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:2: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Number' (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )? otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:2: ( (lv_Name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:865:1: (lv_Name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:865:1: (lv_Name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:866:3: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulenumber2134); 

            			newLeafNode(lv_Name_0_0, grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Name",
                    		lv_Name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulenumber2151); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulenumber2163); 

                	newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getNumberKeyword_2());
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:890:1: (otherlv_3= '=' ( (lv_double_4_0= '0' ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:890:3: otherlv_3= '=' ( (lv_double_4_0= '0' ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulenumber2176); 

                        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getEqualsSignKeyword_3_0());
                        
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:894:1: ( (lv_double_4_0= '0' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:895:1: (lv_double_4_0= '0' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:895:1: (lv_double_4_0= '0' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:896:3: lv_double_4_0= '0'
                    {
                    lv_double_4_0=(Token)match(input,31,FOLLOW_31_in_rulenumber2194); 

                            newLeafNode(lv_double_4_0, grammarAccess.getNumberAccess().getDouble0Keyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                           		setWithLastConsumed(current, "double", lv_double_4_0, "0");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulenumber2221); 

                	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:921:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:922:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:923:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2258);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2269); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:930:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:933:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:934:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:934:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:934:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2309); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:941:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:942:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedName2328); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2343); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionScript_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration262 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration274 = new BitSet(new long[]{0x0000000000974000L});
    public static final BitSet FOLLOW_ruleActionScript_in_rulePackageDeclaration295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionScript_in_entryRuleActionScript343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionScript353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleActionScript399 = new BitSet(new long[]{0x0000000000974000L});
    public static final BitSet FOLLOW_ruleType_in_ruleActionScript421 = new BitSet(new long[]{0x0000000000974002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport505 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleImport526 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType627 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleType650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleType678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleType705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleProperty793 = new BitSet(new long[]{0x0000000000974000L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleProperty816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProperty844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_entryRuleVisibility880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibility891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVisibility929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVisibility948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleClass1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1052 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_19_in_ruleClass1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClass1104 = new BitSet(new long[]{0x0000000000976000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClass1125 = new BitSet(new long[]{0x0000000000976000L});
    public static final BitSet FOLLOW_13_in_ruleClass1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFunction1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1238 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunction1255 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunction1267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction1279 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunction1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariables1375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUNIT_in_ruleVariables1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariables1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule_String_in_ruleVariables1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariables1457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule_int_in_ruleVariables1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariables1498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulenumber_in_ruleVariables1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT1556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUNIT1608 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUNIT1625 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUNIT1637 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleUNIT1650 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUNIT1668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUNIT1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_String_in_entryRule_String1731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_String1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule_String1783 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rule_String1800 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rule_String1812 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_rule_String1825 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_29_in_rule_String1843 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rule_String1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_int_in_entryRule_int1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_int1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule_int1959 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rule_int1976 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rule_int1988 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_rule_int2001 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rule_int2019 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rule_int2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulenumber2134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulenumber2151 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulenumber2163 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_rulenumber2176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulenumber2194 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulenumber2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2309 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedName2328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2343 = new BitSet(new long[]{0x0000000200000002L});

}