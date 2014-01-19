package de.lynorics.eclipse.jangaroo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAS3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "';'", "'.*'", "'.'", "'interface'", "'extends'", "'static'", "'class'", "'implements'", "','", "'function'", "'get'", "'set'", "'('", "')'", "':'", "'new'", "'for'", "'var'", "'each'", "'in'", "'='", "'do'", "'while'", "'switch'", "'case'", "'default'", "'return'", "'if'", "'else'", "'try'", "'catch'", "'finally'", "'const'", "'true'", "'false'", "'this'", "'super'", "'null'", "'private'", "'public'", "'protected'"
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
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:74:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:79:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel87);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel97); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:89:1: ruleModel returns [EObject current=null] : (this_Package_0= rulePackage | ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_classes_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:93:28: ( (this_Package_0= rulePackage | ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: (this_Package_0= rulePackage | ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: (this_Package_0= rulePackage | ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==14||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=53 && LA3_0<=55)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:95:2: this_Package_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModelAccess().getPackageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleModel151);
                    this_Package_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:6: ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:6: ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:7: ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:7: ( (lv_imports_1_0= ruleImport ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:108:1: (lv_imports_1_0= ruleImport )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:108:1: (lv_imports_1_0= ruleImport )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:109:3: lv_imports_1_0= ruleImport
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImport_in_ruleModel178);
                    	    lv_imports_1_0=ruleImport();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"imports",
                    	              		lv_imports_1_0, 
                    	              		"Import");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:125:3: ( (lv_classes_2_0= ruleClass ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=20 && LA2_0<=21)||(LA2_0>=53 && LA2_0<=55)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:126:1: (lv_classes_2_0= ruleClass )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:126:1: (lv_classes_2_0= ruleClass )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:127:3: lv_classes_2_0= ruleClass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleClass_in_ruleModel200);
                    	    lv_classes_2_0=ruleClass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"classes",
                    	              		lv_classes_2_0, 
                    	              		"Class");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:154:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:155:2: (iv_rulePackage= rulePackage EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:156:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage242);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage252); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:163:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_1 = null;

        EObject lv_classes_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:166:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )* otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )* otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )* otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:171:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:172:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:172:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:173:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage310);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:193:1: ( (lv_imports_3_0= ruleImport ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:194:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:194:1: (lv_imports_3_0= ruleImport )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:195:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_rulePackage343);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:211:3: ( ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=53 && LA6_0<=55)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:212:1: ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:212:1: ( (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:213:1: (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:213:1: (lv_classes_4_1= ruleClass | lv_classes_4_2= ruleInterface )
            	    int alt5=2;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA5_1 = input.LA(2);

            	        if ( ((LA5_1>=20 && LA5_1<=21)) ) {
            	            alt5=1;
            	        }
            	        else if ( (LA5_1==18) ) {
            	            alt5=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 5, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 54:
            	        {
            	        int LA5_2 = input.LA(2);

            	        if ( (LA5_2==18) ) {
            	            alt5=2;
            	        }
            	        else if ( ((LA5_2>=20 && LA5_2<=21)) ) {
            	            alt5=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 5, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 55:
            	        {
            	        int LA5_3 = input.LA(2);

            	        if ( (LA5_3==18) ) {
            	            alt5=2;
            	        }
            	        else if ( ((LA5_3>=20 && LA5_3<=21)) ) {
            	            alt5=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 5, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 20:
            	    case 21:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:214:3: lv_classes_4_1= ruleClass
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleClass_in_rulePackage367);
            	            lv_classes_4_1=ruleClass();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"classes",
            	                      		lv_classes_4_1, 
            	                      		"Class");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:229:8: lv_classes_4_2= ruleInterface
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesInterfaceParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInterface_in_rulePackage386);
            	            lv_classes_4_2=ruleInterface();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"classes",
            	                      		lv_classes_4_2, 
            	                      		"Interface");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePackage402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:259:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:260:2: (iv_ruleImport= ruleImport EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:261:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport438);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport448); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:268:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:271:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:272:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:272:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:272:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:276:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:277:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:277:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:278:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport506);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:306:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:307:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:308:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard555);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:315:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:318:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:319:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:319:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:320:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard613);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:330:1: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:331:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:344:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:345:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:346:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName675);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName686); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:353:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:356:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:357:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:364:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:365:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName760); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleInterface"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:386:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:387:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface807);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface817); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:394:1: ruleInterface returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_members_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:397:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:2: ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=53 && LA9_0<=55)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:400:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleInterface863);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_0_0, 
                              		"AccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInterface876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:420:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:421:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:421:1: (lv_name_2_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:422:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:438:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:438:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInterface911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:442:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:443:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:443:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:444:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getSuperclassClassCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface938);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInterface952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:464:1: ( (lv_members_6_0= ruleMember ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||LA11_0==24||LA11_0==32||(LA11_0>=53 && LA11_0<=55)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:465:1: (lv_members_6_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:465:1: (lv_members_6_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:466:3: lv_members_6_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleInterface973);
            	    lv_members_6_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_6_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInterface986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleClass"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:494:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:495:2: (iv_ruleClass= ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:496:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1022);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1032); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:503:1: ruleClass returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_members_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:506:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=53 && LA12_0<=55)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:509:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleClass1078);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_0_0, 
                              		"AccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:525:3: (otherlv_1= 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:525:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClass1092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClass1106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:533:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:534:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:534:1: (lv_name_3_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:535:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:551:2: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:551:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleClass1141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:555:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:557:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getSuperclassClassCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1168);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:573:4: (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:573:6: otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleClass1183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getImplementsKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:577:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:579:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getTypesClassCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1210);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:595:2: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==23) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:595:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleClass1223); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:599:1: ( ( ruleQualifiedName ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:600:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:600:1: ( ruleQualifiedName )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:601:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTypesClassCrossReference_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1250);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleClass1266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:621:1: ( (lv_members_11_0= ruleMember ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20||LA17_0==24||LA17_0==32||(LA17_0>=53 && LA17_0<=55)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:622:1: (lv_members_11_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:622:1: (lv_members_11_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:623:3: lv_members_11_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass1287);
            	    lv_members_11_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_11_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleClass1300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMember"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:651:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:652:2: (iv_ruleMember= ruleMember EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:653:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1336);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:660:1: ruleMember returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_meth_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:663:28: ( ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:664:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:664:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==20||LA18_0==24||(LA18_0>=53 && LA18_0<=55)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:664:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:664:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:665:1: (lv_var_0_0= ruleVariableDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:665:1: (lv_var_0_0= ruleVariableDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:666:3: lv_var_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleMember1392);
                    lv_var_0_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_0_0, 
                              		"VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:683:6: ( (lv_meth_1_0= ruleMethod ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:683:6: ( (lv_meth_1_0= ruleMethod ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:684:1: (lv_meth_1_0= ruleMethod )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:684:1: (lv_meth_1_0= ruleMethod )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:685:3: lv_meth_1_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getMethMethodParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember1419);
                    lv_meth_1_0=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"meth",
                              		lv_meth_1_0, 
                              		"Method");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMethod"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:709:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:710:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:711:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1455);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:718:1: ruleMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'function' (otherlv_3= 'get' | otherlv_4= 'set' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ')' (otherlv_11= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_13_0= ruleMethodBody ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:721:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'function' (otherlv_3= 'get' | otherlv_4= 'set' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ')' (otherlv_11= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_13_0= ruleMethodBody ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:722:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'function' (otherlv_3= 'get' | otherlv_4= 'set' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ')' (otherlv_11= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_13_0= ruleMethodBody ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:722:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'function' (otherlv_3= 'get' | otherlv_4= 'set' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ')' (otherlv_11= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_13_0= ruleMethodBody ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:722:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'function' (otherlv_3= 'get' | otherlv_4= 'set' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ')' (otherlv_11= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_13_0= ruleMethodBody ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:722:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=53 && LA19_0<=55)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:723:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:723:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleMethod1511);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_0_0, 
                              		"AccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:740:3: (otherlv_1= 'static' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:740:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMethod1525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMethod1539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getFunctionKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:748:1: (otherlv_3= 'get' | otherlv_4= 'set' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:748:3: otherlv_3= 'get'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleMethod1552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getGetKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:753:7: otherlv_4= 'set'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleMethod1570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getSetKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:757:3: ( (lv_name_5_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:758:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:758:1: (lv_name_5_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:759:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleMethod1606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:779:1: ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:779:2: ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:779:2: ( (lv_params_7_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:780:1: (lv_params_7_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:780:1: (lv_params_7_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:781:3: lv_params_7_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1628);
                    lv_params_7_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_7_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:797:2: (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==23) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:797:4: otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleMethod1641); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:801:1: ( (lv_params_9_0= ruleParameter ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:802:1: (lv_params_9_0= ruleParameter )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:802:1: (lv_params_9_0= ruleParameter )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:803:3: lv_params_9_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1662);
                    	    lv_params_9_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_9_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleMethod1678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:823:1: (otherlv_11= ':' ( ( ruleQualifiedName ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:823:3: otherlv_11= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleMethod1691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:827:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:828:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:828:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:829:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getTypeClassCrossReference_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod1718);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:845:4: ( (lv_body_13_0= ruleMethodBody ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:846:1: (lv_body_13_0= ruleMethodBody )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:846:1: (lv_body_13_0= ruleMethodBody )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:847:3: lv_body_13_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodBody_in_ruleMethod1741);
            lv_body_13_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_13_0, 
                      		"MethodBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodBody"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:871:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:872:2: (iv_ruleMethodBody= ruleMethodBody EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:873:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMethodBody_in_entryRuleMethodBody1777);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodBody1787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:880:1: ruleMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:883:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:884:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:884:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:884:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:884:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:885:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMethodBodyAccess().getMethodBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMethodBody1836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:897:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==12||LA25_0==27||(LA25_0>=30 && LA25_0<=32)||(LA25_0>=36 && LA25_0<=38)||(LA25_0>=41 && LA25_0<=42)||LA25_0==44||(LA25_0>=48 && LA25_0<=52)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:898:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:898:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:899:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodBodyAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethodBody1857);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMethodBody1870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethodBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "entryRuleStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:927:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:928:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:929:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1906);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:936:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_VariableDeclaration_0 = null;

        EObject this_Return_1 = null;

        EObject this_Expression_2 = null;

        EObject this_IfStatement_4 = null;

        EObject this_SwitchStatement_5 = null;

        EObject this_TryStatement_6 = null;

        EObject this_WhileStatement_7 = null;

        EObject this_DoWhileStatement_8 = null;

        EObject this_ForStatement_9 = null;

        EObject this_NewStatement_10 = null;

        EObject this_objectLiteral_11 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:939:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:940:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:940:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral )
            int alt26=11;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 27:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt26=3;
                }
                break;
            case 42:
                {
                alt26=4;
                }
                break;
            case 38:
                {
                alt26=5;
                }
                break;
            case 44:
                {
                alt26=6;
                }
                break;
            case 37:
                {
                alt26=7;
                }
                break;
            case 36:
                {
                alt26=8;
                }
                break;
            case 31:
                {
                alt26=9;
                }
                break;
            case 30:
                {
                alt26=10;
                }
                break;
            case 12:
                {
                alt26=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:941:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement1966);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:954:2: this_Return_1= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleStatement1996);
                    this_Return_1=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Return_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:966:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:966:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:967:2: this_Expression_2= ruleExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement2027);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStatement2038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:984:2: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement2070);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:997:2: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement2100);
                    this_SwitchStatement_5=ruleSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1010:2: this_TryStatement_6= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTryStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryStatement_in_ruleStatement2130);
                    this_TryStatement_6=ruleTryStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TryStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1023:2: this_WhileStatement_7= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement2160);
                    this_WhileStatement_7=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1036:2: this_DoWhileStatement_8= ruleDoWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoWhileStatement_in_ruleStatement2190);
                    this_DoWhileStatement_8=ruleDoWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoWhileStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1049:2: this_ForStatement_9= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement2220);
                    this_ForStatement_9=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForStatement_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1062:2: this_NewStatement_10= ruleNewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getNewStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewStatement_in_ruleStatement2250);
                    this_NewStatement_10=ruleNewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewStatement_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1075:2: this_objectLiteral_11= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getObjectLiteralParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleStatement2280);
                    this_objectLiteral_11=ruleobjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_objectLiteral_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNewStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1094:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1095:2: (iv_ruleNewStatement= ruleNewStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1096:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleNewStatement_in_entryRuleNewStatement2315);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewStatement2325); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNewStatement"


    // $ANTLR start "ruleNewStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1103:1: ruleNewStatement returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1106:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1108:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNewStatementAccess().getNewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNewStatement2374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewStatementAccess().getNewKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1120:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1121:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1121:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1122:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewStatementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewStatementAccess().getTypeClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewStatement2401);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleNewStatement2414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1142:1: ( (lv_param_4_0= ruleParameters ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_param_4_0= ruleParameters )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_param_4_0= ruleParameters )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1144:3: lv_param_4_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameters_in_ruleNewStatement2435);
                    lv_param_4_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNewStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_4_0, 
                              		"Parameters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleNewStatement2447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNewStatementAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNewStatement"


    // $ANTLR start "entryRuleForStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1172:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1173:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1174:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement2485);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement2495); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1181:1: ruleForStatement returns [EObject current=null] : ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_nameForin_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_nameForeachh_33_0=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        EObject lv_forinit_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_iterator_6_0 = null;

        EObject lv_command_8_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_condition_16_0 = null;

        EObject lv_iterator_18_0 = null;

        EObject lv_command_20_0 = null;

        EObject lv_forinexpr_26_0 = null;

        EObject lv_forcommand_28_0 = null;

        EObject lv_relation_34_0 = null;

        EObject lv_foreachexpr_36_0 = null;

        EObject lv_foreachcommand_38_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1184:28: ( ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:4: otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleForStatement2533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleForStatement2545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1193:1: ( (lv_forinit_2_0= rulecommaExpr ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==27||(LA28_0>=48 && LA28_0<=52)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1194:1: (lv_forinit_2_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1194:1: (lv_forinit_2_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1195:3: lv_forinit_2_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getForinitCommaExprParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement2566);
                            lv_forinit_2_0=rulecommaExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"forinit",
                                      		lv_forinit_2_0, 
                                      		"commaExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleForStatement2579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1215:1: ( (lv_condition_4_0= rulecommaExpr ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==27||(LA29_0>=48 && LA29_0<=52)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1216:1: (lv_condition_4_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1216:1: (lv_condition_4_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1217:3: lv_condition_4_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_0_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement2600);
                            lv_condition_4_0=rulecommaExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"condition",
                                      		lv_condition_4_0, 
                                      		"commaExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleForStatement2613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1237:1: ( (lv_iterator_6_0= rulecommaExpr ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==27||(LA30_0>=48 && LA30_0<=52)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1238:1: (lv_iterator_6_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1238:1: (lv_iterator_6_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1239:3: lv_iterator_6_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_0_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement2634);
                            lv_iterator_6_0=rulecommaExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"iterator",
                                      		lv_iterator_6_0, 
                                      		"commaExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleForStatement2647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_0_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1259:1: ( (lv_command_8_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1260:1: (lv_command_8_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1260:1: (lv_command_8_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1261:3: lv_command_8_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_0_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement2668);
                    lv_command_8_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"command",
                              		lv_command_8_0, 
                              		"StatementsBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1278:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1278:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1278:8: otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleForStatement2688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getForKeyword_1_0());
                          
                    }
                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleForStatement2700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleForStatement2712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getForStatementAccess().getVarKeyword_1_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1290:1: ( (lv_elements_12_0= ruleidentifierDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1291:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1291:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1292:3: lv_elements_12_0= ruleidentifierDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement2733);
                    lv_elements_12_0=ruleidentifierDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_12_0, 
                              		"identifierDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1308:2: (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1308:4: otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleForStatement2746); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getForStatementAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1312:1: ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1313:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1313:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1314:3: lv_elements_14_0= ruleidentifierDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement2767);
                    	    lv_elements_14_0=ruleidentifierDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_14_0, 
                    	              		"identifierDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleForStatement2781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1334:1: ( (lv_condition_16_0= rulecommaExpr ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==27||(LA32_0>=48 && LA32_0<=52)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1335:1: (lv_condition_16_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1335:1: (lv_condition_16_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1336:3: lv_condition_16_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement2802);
                            lv_condition_16_0=rulecommaExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"condition",
                                      		lv_condition_16_0, 
                                      		"commaExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleForStatement2815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1356:1: ( (lv_iterator_18_0= rulecommaExpr ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||LA33_0==27||(LA33_0>=48 && LA33_0<=52)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1357:1: (lv_iterator_18_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1357:1: (lv_iterator_18_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1358:3: lv_iterator_18_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_1_8_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement2836);
                            lv_iterator_18_0=rulecommaExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"iterator",
                                      		lv_iterator_18_0, 
                                      		"commaExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,28,FOLLOW_28_in_ruleForStatement2849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_1_9());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1378:1: ( (lv_command_20_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1379:1: (lv_command_20_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1379:1: (lv_command_20_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1380:3: lv_command_20_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_1_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement2870);
                    lv_command_20_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"command",
                              		lv_command_20_0, 
                              		"StatementsBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1397:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1397:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1397:8: otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleForStatement2890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getForStatementAccess().getForKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1401:1: (otherlv_22= 'each' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==33) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1401:3: otherlv_22= 'each'
                            {
                            otherlv_22=(Token)match(input,33,FOLLOW_33_in_ruleForStatement2903); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getForStatementAccess().getEachKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleForStatement2917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1409:1: ( (lv_nameForin_24_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1410:1: (lv_nameForin_24_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1410:1: (lv_nameForin_24_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1411:3: lv_nameForin_24_0= RULE_ID
                    {
                    lv_nameForin_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement2934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameForin_24_0, grammarAccess.getForStatementAccess().getNameForinIDTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getForStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameForin",
                              		lv_nameForin_24_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,34,FOLLOW_34_in_ruleForStatement2951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getForStatementAccess().getInKeyword_2_4());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1431:1: ( (lv_forinexpr_26_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1432:1: (lv_forinexpr_26_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1432:1: (lv_forinexpr_26_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1433:3: lv_forinexpr_26_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForinexprExpressionParserRuleCall_2_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement2972);
                    lv_forinexpr_26_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forinexpr",
                              		lv_forinexpr_26_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,28,FOLLOW_28_in_ruleForStatement2984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_2_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1453:1: ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1454:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1454:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1455:3: lv_forcommand_28_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForcommandStatementsBlockParserRuleCall_2_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3005);
                    lv_forcommand_28_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forcommand",
                              		lv_forcommand_28_0, 
                              		"StatementsBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1472:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1472:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1472:8: otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    {
                    otherlv_29=(Token)match(input,31,FOLLOW_31_in_ruleForStatement3025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getForStatementAccess().getForKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1476:1: (otherlv_30= 'each' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==33) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1476:3: otherlv_30= 'each'
                            {
                            otherlv_30=(Token)match(input,33,FOLLOW_33_in_ruleForStatement3038); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getForStatementAccess().getEachKeyword_3_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,27,FOLLOW_27_in_ruleForStatement3052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_32=(Token)match(input,32,FOLLOW_32_in_ruleForStatement3064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getForStatementAccess().getVarKeyword_3_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1488:1: ( (lv_nameForeachh_33_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1489:1: (lv_nameForeachh_33_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1489:1: (lv_nameForeachh_33_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1490:3: lv_nameForeachh_33_0= RULE_ID
                    {
                    lv_nameForeachh_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement3081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameForeachh_33_0, grammarAccess.getForStatementAccess().getNameForeachhIDTerminalRuleCall_3_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getForStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameForeachh",
                              		lv_nameForeachh_33_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1506:2: ( (lv_relation_34_0= ruletypeRelation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==29) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1507:1: (lv_relation_34_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1507:1: (lv_relation_34_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1508:3: lv_relation_34_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getRelationTypeRelationParserRuleCall_3_5_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleForStatement3107);
                            lv_relation_34_0=ruletypeRelation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"relation",
                                      		lv_relation_34_0, 
                                      		"typeRelation");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,34,FOLLOW_34_in_ruleForStatement3120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getForStatementAccess().getInKeyword_3_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1528:1: ( (lv_foreachexpr_36_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1529:1: (lv_foreachexpr_36_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1529:1: (lv_foreachexpr_36_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1530:3: lv_foreachexpr_36_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachexprExpressionParserRuleCall_3_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement3141);
                    lv_foreachexpr_36_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"foreachexpr",
                              		lv_foreachexpr_36_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,28,FOLLOW_28_in_ruleForStatement3153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3_8());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1550:1: ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1551:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1551:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1552:3: lv_foreachcommand_38_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachcommandStatementsBlockParserRuleCall_3_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3174);
                    lv_foreachcommand_38_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"foreachcommand",
                              		lv_foreachcommand_38_0, 
                              		"StatementsBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleidentifierDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1576:1: entryRuleidentifierDeclaration returns [EObject current=null] : iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF ;
    public final EObject entryRuleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1577:2: (iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1578:2: iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration3211);
            iv_ruleidentifierDeclaration=ruleidentifierDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifierDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifierDeclaration3221); if (state.failed) return current;

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
    // $ANTLR end "entryRuleidentifierDeclaration"


    // $ANTLR start "ruleidentifierDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1585:1: ruleidentifierDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_relation_1_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1588:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1589:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1589:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1589:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1589:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1590:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1590:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1591:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifierDeclaration3263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getIdentifierDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1607:2: ( (lv_relation_1_0= ruletypeRelation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1608:1: (lv_relation_1_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1608:1: (lv_relation_1_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1609:3: lv_relation_1_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getRelationTypeRelationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration3289);
                    lv_relation_1_0=ruletypeRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"relation",
                              		lv_relation_1_0, 
                              		"typeRelation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1625:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1625:5: otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleidentifierDeclaration3303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIdentifierDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1629:1: ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1630:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1630:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1631:3: lv_expr_3_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getExprExprOrObjectLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration3324);
                    lv_expr_3_0=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_3_0, 
                              		"exprOrObjectLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleidentifierDeclaration"


    // $ANTLR start "entryRulecommaExpr"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1655:1: entryRulecommaExpr returns [EObject current=null] : iv_rulecommaExpr= rulecommaExpr EOF ;
    public final EObject entryRulecommaExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecommaExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1656:2: (iv_rulecommaExpr= rulecommaExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1657:2: iv_rulecommaExpr= rulecommaExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaExprRule()); 
            }
            pushFollow(FOLLOW_rulecommaExpr_in_entryRulecommaExpr3362);
            iv_rulecommaExpr=rulecommaExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommaExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecommaExpr3372); if (state.failed) return current;

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
    // $ANTLR end "entryRulecommaExpr"


    // $ANTLR start "rulecommaExpr"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1664:1: rulecommaExpr returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulecommaExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1667:28: ( ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:2: ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:2: ( (lv_elements_0_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1669:1: (lv_elements_0_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1669:1: (lv_elements_0_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1670:3: lv_elements_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr3418);
            lv_elements_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommaExprRule());
              	        }
                     		add(
                     			current, 
                     			"elements",
                      		lv_elements_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1686:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==23) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1686:4: otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulecommaExpr3431); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommaExprAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1690:1: ( (lv_elements_2_0= ruleExpression ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1691:1: (lv_elements_2_0= ruleExpression )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1691:1: (lv_elements_2_0= ruleExpression )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1692:3: lv_elements_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr3452);
            	    lv_elements_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommaExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulecommaExpr"


    // $ANTLR start "entryRuleDoWhileStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1716:1: entryRuleDoWhileStatement returns [EObject current=null] : iv_ruleDoWhileStatement= ruleDoWhileStatement EOF ;
    public final EObject entryRuleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1717:2: (iv_ruleDoWhileStatement= ruleDoWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1718:2: iv_ruleDoWhileStatement= ruleDoWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement3490);
            iv_ruleDoWhileStatement=ruleDoWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhileStatement3500); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoWhileStatement"


    // $ANTLR start "ruleDoWhileStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1725:1: ruleDoWhileStatement returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whileBlock_2_0 = null;

        EObject lv_cond_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1728:28: ( ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:2: () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1730:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDoWhileStatementAccess().getWhileAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleDoWhileStatement3549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoWhileStatementAccess().getDoKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1742:1: ( (lv_whileBlock_2_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1743:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1743:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1744:3: lv_whileBlock_2_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement3570);
            lv_whileBlock_2_0=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"whileBlock",
                      		lv_whileBlock_2_0, 
                      		"StatementsBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleDoWhileStatement3582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileStatementAccess().getWhileKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1764:1: ( (lv_cond_4_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1765:1: (lv_cond_4_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1765:1: (lv_cond_4_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1766:3: lv_cond_4_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getCondParenthesizedExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement3603);
            lv_cond_4_0=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_4_0, 
                      		"parenthesizedExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDoWhileStatement3615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDoWhileStatementAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDoWhileStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1794:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1795:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1796:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement3651);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement3661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1803:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cond_2_0 = null;

        EObject lv_whileBlock_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1806:28: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1807:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1807:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1807:2: () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1807:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1808:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWhileStatementAccess().getWhileAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleWhileStatement3710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1820:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1821:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1821:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1822:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement3731);
            lv_cond_2_0=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_2_0, 
                      		"parenthesizedExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1838:2: ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1839:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1839:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1840:3: lv_whileBlock_3_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleWhileStatement3752);
            lv_whileBlock_3_0=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"whileBlock",
                      		lv_whileBlock_3_0, 
                      		"StatementsBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1864:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1865:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1866:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement3788);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement3798); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1873:1: ruleSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cases_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1876:28: ( ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:2: () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1878:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchStatementAccess().getSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSwitchStatement3847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1890:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1891:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1891:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1892:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement3868);
            lv_cond_2_0=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_2_0, 
                      		"parenthesizedExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSwitchStatement3880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1912:1: ( (lv_cases_4_0= rulestatementInSwitch ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||LA41_0==12||LA41_0==27||(LA41_0>=30 && LA41_0<=32)||(LA41_0>=36 && LA41_0<=42)||LA41_0==44||(LA41_0>=48 && LA41_0<=52)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1913:1: (lv_cases_4_0= rulestatementInSwitch )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1913:1: (lv_cases_4_0= rulestatementInSwitch )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1914:3: lv_cases_4_0= rulestatementInSwitch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesStatementInSwitchParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement3901);
            	    lv_cases_4_0=rulestatementInSwitch();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_4_0, 
            	              		"statementInSwitch");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSwitchStatement3914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleparenthesizedExpr"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1942:1: entryRuleparenthesizedExpr returns [EObject current=null] : iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF ;
    public final EObject entryRuleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparenthesizedExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1943:2: (iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:2: iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr3950);
            iv_ruleparenthesizedExpr=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparenthesizedExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparenthesizedExpr3960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleparenthesizedExpr"


    // $ANTLR start "ruleparenthesizedExpr"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1951:1: ruleparenthesizedExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) ;
    public final EObject ruleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1954:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1955:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1955:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1955:3: otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleparenthesizedExpr3997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1959:1: ( (lv_expression_1_0= ruleexprOrObjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1960:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1960:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1961:3: lv_expression_1_0= ruleexprOrObjectLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExpressionExprOrObjectLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr4018);
            lv_expression_1_0=ruleexprOrObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExprRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"exprOrObjectLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleparenthesizedExpr4030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExprAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleparenthesizedExpr"


    // $ANTLR start "entryRulestatementInSwitch"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1989:1: entryRulestatementInSwitch returns [EObject current=null] : iv_rulestatementInSwitch= rulestatementInSwitch EOF ;
    public final EObject entryRulestatementInSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatementInSwitch = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1990:2: (iv_rulestatementInSwitch= rulestatementInSwitch EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1991:2: iv_rulestatementInSwitch= rulestatementInSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementInSwitchRule()); 
            }
            pushFollow(FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch4066);
            iv_rulestatementInSwitch=rulestatementInSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementInSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatementInSwitch4076); if (state.failed) return current;

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
    // $ANTLR end "entryRulestatementInSwitch"


    // $ANTLR start "rulestatementInSwitch"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1998:1: rulestatementInSwitch returns [EObject current=null] : (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) ;
    public final EObject rulestatementInSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_Statement_0 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2001:28: ( (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2002:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2002:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 27:
            case 30:
            case 31:
            case 32:
            case 36:
            case 37:
            case 38:
            case 41:
            case 42:
            case 44:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt42=1;
                }
                break;
            case 39:
                {
                alt42=2;
                }
                break;
            case 40:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2003:2: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_rulestatementInSwitch4126);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2015:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2015:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2015:8: otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulestatementInSwitch4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementInSwitchAccess().getCaseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulestatementInSwitch4169);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_rulestatementInSwitch4180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementInSwitchAccess().getColonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2036:6: (otherlv_4= 'default' otherlv_5= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2036:6: (otherlv_4= 'default' otherlv_5= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2036:8: otherlv_4= 'default' otherlv_5= ':'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulestatementInSwitch4200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatementInSwitchAccess().getDefaultKeyword_2_0());
                          
                    }
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_rulestatementInSwitch4212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStatementInSwitchAccess().getColonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulestatementInSwitch"


    // $ANTLR start "entryRuleReturn"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2052:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2053:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2054:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn4249);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn4259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2061:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2064:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2065:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2065:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2065:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleReturn4296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2069:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2070:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2070:1: (lv_expression_1_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2071:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturn4317);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleReturn4329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2099:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2100:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2101:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4365);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4375); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2108:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2111:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2112:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2112:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2112:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleVariableDeclaration4412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2116:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2117:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2117:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2118:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration4429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleVariableDeclaration4446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2138:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2139:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2139:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2140:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeClassCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariableDeclaration4473);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2156:2: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==35) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2156:4: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleVariableDeclaration4486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2160:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2161:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2161:1: (lv_expression_5_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration4507);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration4521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIfStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2190:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2191:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2192:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement4557);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement4567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2199:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2202:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2203:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2203:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2203:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleIfStatement4604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement4616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2211:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2212:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2212:1: (lv_expression_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2213:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement4637);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIfStatement4649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2233:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2234:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2234:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2235:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement4670);
            lv_thenBlock_4_0=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenBlock",
                      		lv_thenBlock_4_0, 
                      		"IfBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred58_InternalAS3()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleIfStatement4691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2256:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2257:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2257:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2258:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement4713);
                    lv_elseBlock_6_0=ruleIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"IfBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleTryStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2282:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2283:2: (iv_ruleTryStatement= ruleTryStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2284:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTryStatement_in_entryRuleTryStatement4751);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryStatement4761); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTryStatement"


    // $ANTLR start "ruleTryStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2291:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) ;
    public final EObject ruleTryStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_statements_2_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_finallyBlock_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2294:28: ( (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2295:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2295:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2295:3: otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleTryStatement4798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTryStatement4810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTryStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2303:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==12||LA45_0==27||(LA45_0>=30 && LA45_0<=32)||(LA45_0>=36 && LA45_0<=38)||(LA45_0>=41 && LA45_0<=42)||LA45_0==44||(LA45_0>=48 && LA45_0<=52)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2304:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2304:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2305:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement4831);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTryStatement4844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTryStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2325:1: (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2325:3: otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleTryStatement4857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTryStatementAccess().getCatchKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleTryStatement4869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTryStatementAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2333:1: ( (lv_params_6_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2334:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2334:1: (lv_params_6_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2335:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamsParameterParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleTryStatement4890);
                    lv_params_6_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_6_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleTryStatement4902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTryStatementAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2355:3: (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2355:5: otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleTryStatement4917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTryStatementAccess().getFinallyKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2359:1: ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2360:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2360:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2361:3: lv_finallyBlock_9_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinallyBlockStatementsBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleTryStatement4938);
                    lv_finallyBlock_9_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyBlock",
                              		lv_finallyBlock_9_0, 
                              		"StatementsBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTryStatement"


    // $ANTLR start "entryRuleIfBlock"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2385:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2386:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2387:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock4976);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock4986); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2394:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_StatementsBlock_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2397:28: ( ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2398:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2398:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==27||(LA48_0>=30 && LA48_0<=32)||(LA48_0>=36 && LA48_0<=38)||(LA48_0>=41 && LA48_0<=42)||LA48_0==44||(LA48_0>=48 && LA48_0<=52)) ) {
                alt48=1;
            }
            else if ( (LA48_0==12) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==15||LA48_3==17||LA48_3==35) ) {
                        alt48=2;
                    }
                    else if ( (LA48_3==29) ) {
                        alt48=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA48_4 = input.LA(3);

                    if ( (LA48_4==15||LA48_4==17||LA48_4==35) ) {
                        alt48=2;
                    }
                    else if ( (LA48_4==29) ) {
                        alt48=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA48_5 = input.LA(3);

                    if ( (LA48_5==15||LA48_5==17||LA48_5==35) ) {
                        alt48=2;
                    }
                    else if ( (LA48_5==29) ) {
                        alt48=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                case 13:
                case 27:
                case 30:
                case 31:
                case 32:
                case 36:
                case 37:
                case 38:
                case 41:
                case 42:
                case 44:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                    {
                    alt48=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2398:2: ( (lv_statements_0_0= ruleStatement ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2398:2: ( (lv_statements_0_0= ruleStatement ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2399:1: (lv_statements_0_0= ruleStatement )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2399:1: (lv_statements_0_0= ruleStatement )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2400:3: lv_statements_0_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfBlock5032);
                    lv_statements_0_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_0_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2418:2: this_StatementsBlock_1= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleIfBlock5063);
                    this_StatementsBlock_1=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementsBlock_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleStatementsBlock"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2437:1: entryRuleStatementsBlock returns [EObject current=null] : iv_ruleStatementsBlock= ruleStatementsBlock EOF ;
    public final EObject entryRuleStatementsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementsBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2438:2: (iv_ruleStatementsBlock= ruleStatementsBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2439:2: iv_ruleStatementsBlock= ruleStatementsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementsBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock5098);
            iv_ruleStatementsBlock=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementsBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementsBlock5108); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatementsBlock"


    // $ANTLR start "ruleStatementsBlock"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2446:1: ruleStatementsBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleStatementsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2449:28: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2450:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2450:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2450:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatementsBlock5145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementsBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2454:1: ( (lv_statements_1_0= ruleStatement ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==12||LA49_0==27||(LA49_0>=30 && LA49_0<=32)||(LA49_0>=36 && LA49_0<=38)||(LA49_0>=41 && LA49_0<=42)||LA49_0==44||(LA49_0>=48 && LA49_0<=52)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2455:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2455:1: (lv_statements_1_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2456:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementsBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementsBlock5166);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementsBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatementsBlock5179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatementsBlockAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatementsBlock"


    // $ANTLR start "entryRuleParameter"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2486:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2487:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2488:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5217);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5227); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2495:1: ruleParameter returns [EObject current=null] : ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rel_2_0 = null;

        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2498:28: ( ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:2: (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:2: (otherlv_0= 'const' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:4: otherlv_0= 'const'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleParameter5265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getConstKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2503:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2504:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2504:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2505:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter5284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2521:2: ( (lv_rel_2_0= ruletypeRelation ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2522:1: (lv_rel_2_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2522:1: (lv_rel_2_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2523:3: lv_rel_2_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getRelTypeRelationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleParameter5310);
                    lv_rel_2_0=ruletypeRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"rel",
                              		lv_rel_2_0, 
                              		"typeRelation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2539:3: (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2539:5: otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleParameter5324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2543:1: ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2544:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2544:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2545:3: lv_lit_4_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getLitExprOrObjectLiteralParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter5345);
                    lv_lit_4_0=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"lit",
                              		lv_lit_4_0, 
                              		"exprOrObjectLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameters"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2569:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2570:2: (iv_ruleParameters= ruleParameters EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2571:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters5383);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters5393); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2578:1: ruleParameters returns [EObject current=null] : ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_rel_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2581:28: ( ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            int alt58=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA58_1 = input.LA(2);

                if ( (synpred69_InternalAS3()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA58_2 = input.LA(2);

                if ( (synpred69_InternalAS3()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 28:
                {
                alt58=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID||LA54_0==47) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:3: ( (lv_elements_0_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2583:1: (lv_elements_0_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2583:1: (lv_elements_0_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2584:3: lv_elements_0_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters5440);
                            lv_elements_0_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParametersRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elements",
                                      		lv_elements_0_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2600:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==23) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2600:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                            	    {
                            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParameters5453); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2604:1: ( (lv_elements_2_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2605:1: (lv_elements_2_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2605:1: (lv_elements_2_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2606:3: lv_elements_2_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters5474);
                            	    lv_elements_2_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getParametersRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elements",
                            	              		lv_elements_2_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?
                    int alt56=2;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:8: ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ','
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2623:8: ( (lv_elements_3_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2624:1: (lv_elements_3_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2624:1: (lv_elements_3_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2625:3: lv_elements_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters5507);
                            lv_elements_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParametersRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elements",
                                      		lv_elements_3_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2641:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                alt55 = dfa55.predict(input);
                                switch (alt55) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2641:4: otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleParameters5520); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getCommaKeyword_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2645:1: ( (lv_elements_5_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2646:1: (lv_elements_5_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2646:1: (lv_elements_5_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2647:3: lv_elements_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters5541);
                            	    lv_elements_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getParametersRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elements",
                            	              		lv_elements_5_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleParameters5555); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getParametersAccess().getCommaKeyword_1_0_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2667:3: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2668:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2668:1: (lv_name_7_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2669:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters5574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getParametersAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParametersRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2685:2: ( (lv_rel_8_0= ruletypeRelation ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==29) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2686:1: (lv_rel_8_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2686:1: (lv_rel_8_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2687:3: lv_rel_8_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getRelTypeRelationParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleParameters5600);
                            lv_rel_8_0=ruletypeRelation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParametersRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rel",
                                      		lv_rel_8_0, 
                                      		"typeRelation");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuletypeRelation"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2711:1: entryRuletypeRelation returns [EObject current=null] : iv_ruletypeRelation= ruletypeRelation EOF ;
    public final EObject entryRuletypeRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeRelation = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2712:2: (iv_ruletypeRelation= ruletypeRelation EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2713:2: iv_ruletypeRelation= ruletypeRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRelationRule()); 
            }
            pushFollow(FOLLOW_ruletypeRelation_in_entryRuletypeRelation5638);
            iv_ruletypeRelation=ruletypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeRelation5648); if (state.failed) return current;

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
    // $ANTLR end "entryRuletypeRelation"


    // $ANTLR start "ruletypeRelation"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2720:1: ruletypeRelation returns [EObject current=null] : (otherlv_0= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruletypeRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2723:28: ( (otherlv_0= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:1: (otherlv_0= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:1: (otherlv_0= ':' ( ( ruleQualifiedName ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:3: otherlv_0= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruletypeRelation5685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeRelationAccess().getColonKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2728:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2729:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2729:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2730:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeRelationAccess().getTypeClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruletypeRelation5712);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruletypeRelation"


    // $ANTLR start "entryRuleobjectLiteral"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2754:1: entryRuleobjectLiteral returns [EObject current=null] : iv_ruleobjectLiteral= ruleobjectLiteral EOF ;
    public final EObject entryRuleobjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2755:2: (iv_ruleobjectLiteral= ruleobjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2756:2: iv_ruleobjectLiteral= ruleobjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral5748);
            iv_ruleobjectLiteral=ruleobjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectLiteral5758); if (state.failed) return current;

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
    // $ANTLR end "entryRuleobjectLiteral"


    // $ANTLR start "ruleobjectLiteral"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2763:1: ruleobjectLiteral returns [EObject current=null] : (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) ;
    public final EObject ruleobjectLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_objectFields_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2766:28: ( (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2767:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2767:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2767:3: otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleobjectLiteral5795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getObjectLiteralAccess().getObjectFieldsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleobjectFields_in_ruleobjectLiteral5820);
            this_objectFields_1=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_objectFields_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleobjectLiteral5831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getObjectLiteralAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleobjectLiteral"


    // $ANTLR start "entryRuleobjectFields"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2795:1: entryRuleobjectFields returns [EObject current=null] : iv_ruleobjectFields= ruleobjectFields EOF ;
    public final EObject entryRuleobjectFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2796:2: (iv_ruleobjectFields= ruleobjectFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2797:2: iv_ruleobjectFields= ruleobjectFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleobjectFields_in_entryRuleobjectFields5867);
            iv_ruleobjectFields=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectFields5877); if (state.failed) return current;

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
    // $ANTLR end "entryRuleobjectFields"


    // $ANTLR start "ruleobjectFields"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2804:1: ruleobjectFields returns [EObject current=null] : ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) ;
    public final EObject ruleobjectFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2807:28: ( ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2808:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2808:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2808:2: ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2808:2: ( (lv_fields_0_0= ruleobjectField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2809:1: (lv_fields_0_0= ruleobjectField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2809:1: (lv_fields_0_0= ruleobjectField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2810:3: lv_fields_0_0= ruleobjectField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields5923);
            lv_fields_0_0=ruleobjectField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectFieldsRule());
              	        }
                     		add(
                     			current, 
                     			"fields",
                      		lv_fields_0_0, 
                      		"objectField");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2826:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==23) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2826:4: otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleobjectFields5936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2830:1: ( (lv_fields_2_0= ruleobjectField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2831:1: (lv_fields_2_0= ruleobjectField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2831:1: (lv_fields_2_0= ruleobjectField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2832:3: lv_fields_2_0= ruleobjectField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields5957);
            	    lv_fields_2_0=ruleobjectField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getObjectFieldsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_2_0, 
            	              		"objectField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleobjectFields"


    // $ANTLR start "entryRuleobjectField"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2856:1: entryRuleobjectField returns [EObject current=null] : iv_ruleobjectField= ruleobjectField EOF ;
    public final EObject entryRuleobjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2857:2: (iv_ruleobjectField= ruleobjectField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2858:2: iv_ruleobjectField= ruleobjectField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldRule()); 
            }
            pushFollow(FOLLOW_ruleobjectField_in_entryRuleobjectField5995);
            iv_ruleobjectField=ruleobjectField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectField6005); if (state.failed) return current;

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
    // $ANTLR end "entryRuleobjectField"


    // $ANTLR start "ruleobjectField"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2865:1: ruleobjectField returns [EObject current=null] : ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) ;
    public final EObject ruleobjectField() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        Token this_INT_6=null;
        Token otherlv_7=null;
        EObject this_exprOrObjectLiteral_2 = null;

        EObject this_exprOrObjectLiteral_5 = null;

        EObject this_exprOrObjectLiteral_8 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2868:28: ( ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt60=1;
                }
                break;
            case RULE_STRING:
                {
                alt60=2;
                }
                break;
            case RULE_INT:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:3: this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleobjectField6042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleobjectField6053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6078);
                    this_exprOrObjectLiteral_2=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_exprOrObjectLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2890:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2890:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2890:7: this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleobjectField6096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleobjectField6107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getObjectFieldAccess().getColonKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6132);
                    this_exprOrObjectLiteral_5=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_exprOrObjectLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2911:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2911:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2911:7: this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleobjectField6150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()); 
                          
                    }
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleobjectField6161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getObjectFieldAccess().getColonKeyword_2_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6186);
                    this_exprOrObjectLiteral_8=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_exprOrObjectLiteral_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleobjectField"


    // $ANTLR start "entryRuleexprOrObjectLiteral"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2939:1: entryRuleexprOrObjectLiteral returns [EObject current=null] : iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF ;
    public final EObject entryRuleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexprOrObjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2940:2: (iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2941:2: iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral6222);
            iv_ruleexprOrObjectLiteral=ruleexprOrObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprOrObjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexprOrObjectLiteral6232); if (state.failed) return current;

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
    // $ANTLR end "entryRuleexprOrObjectLiteral"


    // $ANTLR start "ruleexprOrObjectLiteral"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2948:1: ruleexprOrObjectLiteral returns [EObject current=null] : (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) ;
    public final EObject ruleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_objectLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2951:28: ( (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2952:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2952:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_INT)||LA61_0==27||(LA61_0>=48 && LA61_0<=52)) ) {
                alt61=1;
            }
            else if ( (LA61_0==12) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2953:2: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral6282);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2966:2: this_objectLiteral_1= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getObjectLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral6312);
                    this_objectLiteral_1=ruleobjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_objectLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleexprOrObjectLiteral"


    // $ANTLR start "entryRuleExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2987:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2988:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2989:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6349);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6359); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2996:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2999:28: (this_Assignment_0= ruleAssignment )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3001:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression6408);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Assignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3020:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3021:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3022:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment6442);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment6452); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3029:1: ruleAssignment returns [EObject current=null] : (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SelectionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3032:28: ( (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3033:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3033:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3034:2: this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_ruleAssignment6502);
            this_SelectionExpression_0=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3045:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3045:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3045:2: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3046:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAssignment6526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3058:1: ( (lv_right_3_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3059:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3059:1: (lv_right_3_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3060:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment6547);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleSelectionExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3084:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3085:2: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3086:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression6585);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression6595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3093:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:28: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3097:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3097:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3098:2: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression6645);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3109:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==17) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3109:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3109:2: ()
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3110:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSelectionExpression6669); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3122:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3123:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3123:1: (otherlv_3= RULE_ID )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3124:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionExpression6693); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3138:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==27) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3138:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3138:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3139:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3139:1: (lv_methodinvocation_4_0= '(' )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3140:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,27,FOLLOW_27_in_ruleSelectionExpression6712); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "methodinvocation", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt64=2;
            	            int LA64_0 = input.LA(1);

            	            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_INT)||LA64_0==27||(LA64_0>=48 && LA64_0<=52)) ) {
            	                alt64=1;
            	            }
            	            switch (alt64) {
            	                case 1 :
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3154:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3154:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3155:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression6747);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3171:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop63:
            	                    do {
            	                        int alt63=2;
            	                        int LA63_0 = input.LA(1);

            	                        if ( (LA63_0==23) ) {
            	                            alt63=1;
            	                        }


            	                        switch (alt63) {
            	                    	case 1 :
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3171:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleSelectionExpression6760); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3175:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3176:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3176:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3177:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression6781);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop63;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleSelectionExpression6797); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3205:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3206:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3207:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression6837);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression6847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3214:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_Expression_15 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3217:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' ) )
            int alt68=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt68=1;
                }
                break;
            case RULE_INT:
                {
                alt68=2;
                }
                break;
            case 48:
            case 49:
                {
                alt68=3;
                }
                break;
            case 50:
                {
                alt68=4;
                }
                break;
            case 51:
                {
                alt68=5;
                }
                break;
            case 52:
                {
                alt68=6;
                }
                break;
            case RULE_ID:
                {
                alt68=7;
                }
                break;
            case 27:
                {
                alt68=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3218:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3219:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3227:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3228:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3228:1: (lv_value_1_0= RULE_STRING )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3229:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression6902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3247:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3255:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3256:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3256:1: (lv_value_3_0= RULE_INT )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3257:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression6944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3274:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3274:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3274:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3274:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3275:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3283:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3284:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3284:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==48) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==49) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3286:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,48,FOLLOW_48_in_ruleTerminalExpression6989); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3298:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,49,FOLLOW_49_in_ruleTerminalExpression7018); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3314:6: ( () otherlv_7= 'this' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3314:6: ( () otherlv_7= 'this' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3314:7: () otherlv_7= 'this'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3314:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3315:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getThisAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleTerminalExpression7066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3328:6: ( () otherlv_9= 'super' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3328:6: ( () otherlv_9= 'super' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3328:7: () otherlv_9= 'super'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3328:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3329:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,51,FOLLOW_51_in_ruleTerminalExpression7098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3342:6: ( () otherlv_11= 'null' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3342:6: ( () otherlv_11= 'null' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3342:7: () otherlv_11= 'null'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3342:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3343:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getNullAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleTerminalExpression7130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3356:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3356:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3356:7: () ( (otherlv_13= RULE_ID ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3356:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3357:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3365:2: ( (otherlv_13= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3366:1: (otherlv_13= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3366:1: (otherlv_13= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3367:3: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression7174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_6_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3382:6: (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3382:6: (otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3382:8: otherlv_14= '(' this_Expression_15= ruleExpression otherlv_16= ')'
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleTerminalExpression7194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression7219);
                    this_Expression_15=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_15; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_16=(Token)match(input,28,FOLLOW_28_in_ruleTerminalExpression7230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3410:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3412:28: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3413:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3413:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt69=1;
                }
                break;
            case 54:
                {
                alt69=2;
                }
                break;
            case 55:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3413:2: (enumLiteral_0= 'private' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3413:2: (enumLiteral_0= 'private' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3413:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleAccessLevel7281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3419:6: (enumLiteral_1= 'public' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3419:6: (enumLiteral_1= 'public' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3419:8: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleAccessLevel7298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3425:6: (enumLiteral_2= 'protected' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3425:6: (enumLiteral_2= 'protected' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3425:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleAccessLevel7315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAccessLevel"

    // $ANTLR start synpred37_InternalAS3
    public final void synpred37_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:4: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,27,FOLLOW_27_in_synpred37_InternalAS32414); if (state.failed) return ;
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1142:1: ( (lv_param_4_0= ruleParameters ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_param_4_0= ruleParameters )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_param_4_0= ruleParameters )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1144:3: lv_param_4_0= ruleParameters
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameters_in_synpred37_InternalAS32435);
        lv_param_4_0=ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,28,FOLLOW_28_in_synpred37_InternalAS32447); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalAS3

    // $ANTLR start synpred58_InternalAS3
    public final void synpred58_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseBlock_6_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2251:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,43,FOLLOW_43_in_synpred58_InternalAS34691); if (state.failed) return ;

        }

        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2256:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2257:1: (lv_elseBlock_6_0= ruleIfBlock )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2257:1: (lv_elseBlock_6_0= ruleIfBlock )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2258:3: lv_elseBlock_6_0= ruleIfBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIfBlock_in_synpred58_InternalAS34713);
        lv_elseBlock_6_0=ruleIfBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred58_InternalAS3

    // $ANTLR start synpred69_InternalAS3
    public final void synpred69_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:2: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==47) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:3: ( (lv_elements_0_0= ruleParameter ) )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2583:1: (lv_elements_0_0= ruleParameter )
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2583:1: (lv_elements_0_0= ruleParameter )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2584:3: lv_elements_0_0= ruleParameter
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleParameter_in_synpred69_InternalAS35440);
                lv_elements_0_0=ruleParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2600:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==23) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2600:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                	    {
                	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_synpred69_InternalAS35453); if (state.failed) return ;
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2604:1: ( (lv_elements_2_0= ruleParameter ) )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2605:1: (lv_elements_2_0= ruleParameter )
                	    {
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2605:1: (lv_elements_2_0= ruleParameter )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2606:3: lv_elements_2_0= ruleParameter
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleParameter_in_synpred69_InternalAS35474);
                	    lv_elements_2_0=ruleParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred69_InternalAS3

    // Delegated rules

    public final boolean synpred37_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String DFA27_eotS =
        "\32\uffff";
    static final String DFA27_eofS =
        "\1\2\31\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\30\uffff";
    static final String DFA27_maxS =
        "\1\64\1\0\30\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\26\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\30\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\5\uffff\2\2\15\uffff\1\1\2\uffff\3\2\3\uffff\11\2\3\uffff"+
            "\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1138:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAS3()) ) {s = 25;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\20\uffff";
    static final String DFA37_eofS =
        "\20\uffff";
    static final String DFA37_minS =
        "\1\37\1\33\1\4\1\33\1\uffff\1\17\2\4\1\uffff\1\17\1\uffff\1\4\1"+
        "\uffff\1\17\1\4\1\17";
    static final String DFA37_maxS =
        "\1\37\1\41\1\64\1\33\1\uffff\1\43\1\4\1\40\1\uffff\1\43\1\uffff"+
        "\1\4\1\uffff\1\43\1\4\1\43";
    static final String DFA37_acceptS =
        "\4\uffff\1\1\3\uffff\1\3\1\uffff\1\4\1\uffff\1\2\3\uffff";
    static final String DFA37_specialS =
        "\20\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1",
            "\1\2\5\uffff\1\3",
            "\1\5\2\4\10\uffff\1\4\13\uffff\1\4\4\uffff\1\6\17\uffff\5\4",
            "\1\7",
            "",
            "\1\4\1\uffff\1\4\5\uffff\1\4\12\uffff\1\10\1\4",
            "\1\11",
            "\1\10\33\uffff\1\12",
            "",
            "\1\14\7\uffff\1\14\5\uffff\1\13\4\uffff\1\12\1\14",
            "",
            "\1\15",
            "",
            "\1\14\1\uffff\1\16\5\uffff\1\14\12\uffff\1\12\1\14",
            "\1\17",
            "\1\14\1\uffff\1\16\5\uffff\1\14\12\uffff\1\12\1\14"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1185:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )";
        }
    }
    static final String DFA56_eotS =
        "\10\uffff";
    static final String DFA56_eofS =
        "\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4";
    static final String DFA56_minS =
        "\1\4\1\uffff\1\27\1\4\1\uffff\1\21\1\4\1\21";
    static final String DFA56_maxS =
        "\1\57\1\uffff\1\43\1\4\1\uffff\1\43\1\4\1\43";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\3\uffff";
    static final String DFA56_specialS =
        "\10\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\52\uffff\1\1",
            "",
            "\1\1\4\uffff\1\4\1\3\5\uffff\1\1",
            "\1\5",
            "",
            "\1\6\5\uffff\1\1\4\uffff\1\4\6\uffff\1\1",
            "\1\7",
            "\1\6\5\uffff\1\1\4\uffff\1\4\6\uffff\1\1"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "2623:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?";
        }
    }
    static final String DFA55_eotS =
        "\11\uffff";
    static final String DFA55_eofS =
        "\2\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String DFA55_minS =
        "\1\27\1\4\1\27\1\uffff\1\4\1\uffff\1\21\1\4\1\21";
    static final String DFA55_maxS =
        "\1\27\1\57\1\43\1\uffff\1\4\1\uffff\1\43\1\4\1\43";
    static final String DFA55_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA55_specialS =
        "\11\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1",
            "\1\2\52\uffff\1\3",
            "\1\3\4\uffff\1\5\1\4\5\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\7\5\uffff\1\3\4\uffff\1\5\6\uffff\1\3",
            "\1\10",
            "\1\7\5\uffff\1\3\4\uffff\1\5\6\uffff\1\3"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "()* loopback of 2641:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel178 = new BitSet(new long[]{0x00E0000000304002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModel200 = new BitSet(new long[]{0x00E0000000300002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage322 = new BitSet(new long[]{0x00E0000000346000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackage343 = new BitSet(new long[]{0x00E0000000346000L});
    public static final BitSet FOLLOW_ruleClass_in_rulePackage367 = new BitSet(new long[]{0x00E0000000342000L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePackage386 = new BitSet(new long[]{0x00E0000000342000L});
    public static final BitSet FOLLOW_13_in_rulePackage402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport506 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard613 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName726 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName760 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleInterface863 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInterface876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface893 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_19_in_ruleInterface911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface938 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface952 = new BitSet(new long[]{0x00E0000101102000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleInterface973 = new BitSet(new long[]{0x00E0000101102000L});
    public static final BitSet FOLLOW_13_in_ruleInterface986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleClass1078 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClass1092 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleClass1106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1123 = new BitSet(new long[]{0x0000000000481000L});
    public static final BitSet FOLLOW_19_in_ruleClass1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1168 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleClass1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1210 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleClass1223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1250 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleClass1266 = new BitSet(new long[]{0x00E0000101102000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass1287 = new BitSet(new long[]{0x00E0000101102000L});
    public static final BitSet FOLLOW_13_in_ruleClass1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleMember1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleMethod1511 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod1525 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethod1539 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_25_in_ruleMethod1552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleMethod1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1589 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMethod1606 = new BitSet(new long[]{0x0000800010000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1628 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleMethod1641 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1662 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleMethod1678 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleMethod1691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod1718 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_ruleMethodBody_in_ruleMethod1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodBody_in_entryRuleMethodBody1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodBody1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMethodBody1836 = new BitSet(new long[]{0x001F1671C8003070L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethodBody1857 = new BitSet(new long[]{0x001F1671C8003070L});
    public static final BitSet FOLLOW_13_in_ruleMethodBody1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleStatement1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement2027 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_ruleStatement2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_ruleStatement2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_ruleStatement2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleStatement2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_entryRuleNewStatement2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewStatement2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNewStatement2374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewStatement2401 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleNewStatement2414 = new BitSet(new long[]{0x0000800010000010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleNewStatement2435 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNewStatement2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStatement2533 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForStatement2545 = new BitSet(new long[]{0x001F000008008070L});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement2566 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement2579 = new BitSet(new long[]{0x001F000008008070L});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement2600 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement2613 = new BitSet(new long[]{0x001F000018000070L});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement2634 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForStatement2647 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStatement2688 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForStatement2700 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForStatement2712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement2733 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleForStatement2746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement2767 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement2781 = new BitSet(new long[]{0x001F000008008070L});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement2802 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement2815 = new BitSet(new long[]{0x001F000018000070L});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement2836 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForStatement2849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStatement2890 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleForStatement2903 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForStatement2917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement2934 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleForStatement2951 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement2972 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForStatement2984 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStatement3025 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleForStatement3038 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForStatement3052 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForStatement3064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement3081 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleForStatement3107 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleForStatement3120 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement3141 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForStatement3153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration3211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifierDeclaration3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifierDeclaration3263 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration3289 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleidentifierDeclaration3303 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecommaExpr_in_entryRulecommaExpr3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecommaExpr3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr3418 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulecommaExpr3431 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr3452 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement3490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileStatement3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDoWhileStatement3549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement3570 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDoWhileStatement3582 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement3603 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDoWhileStatement3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement3651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleWhileStatement3710 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement3731 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleWhileStatement3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSwitchStatement3847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement3868 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSwitchStatement3880 = new BitSet(new long[]{0x001F17F1C8003070L});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement3901 = new BitSet(new long[]{0x001F17F1C8003070L});
    public static final BitSet FOLLOW_13_in_ruleSwitchStatement3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparenthesizedExpr3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleparenthesizedExpr3997 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr4018 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleparenthesizedExpr4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch4066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatementInSwitch4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulestatementInSwitch4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulestatementInSwitch4144 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulestatementInSwitch4169 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulestatementInSwitch4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulestatementInSwitch4200 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulestatementInSwitch4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn4249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReturn4296 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturn4317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReturn4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDeclaration4412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration4429 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleVariableDeclaration4446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariableDeclaration4473 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_35_in_ruleVariableDeclaration4486 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration4507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement4557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIfStatement4604 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement4616 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement4637 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement4649 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement4670 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleIfStatement4691 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_entryRuleTryStatement4751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryStatement4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTryStatement4798 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTryStatement4810 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement4831 = new BitSet(new long[]{0x001F1671C8003070L});
    public static final BitSet FOLLOW_13_in_ruleTryStatement4844 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleTryStatement4857 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTryStatement4869 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTryStatement4890 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTryStatement4902 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTryStatement4917 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleTryStatement4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock4976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfBlock5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleIfBlock5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock5098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementsBlock5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatementsBlock5145 = new BitSet(new long[]{0x001F1671C8003070L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementsBlock5166 = new BitSet(new long[]{0x001F1671C8003070L});
    public static final BitSet FOLLOW_13_in_ruleStatementsBlock5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleParameter5265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter5284 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameter5310 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleParameter5324 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters5383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters5440 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleParameters5453 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters5474 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters5507 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameters5520 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters5541 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameters5555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters5574 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameters5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_entryRuletypeRelation5638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeRelation5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruletypeRelation5685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruletypeRelation5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral5748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectLiteral5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleobjectLiteral5795 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectFields_in_ruleobjectLiteral5820 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleobjectLiteral5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectFields_in_entryRuleobjectFields5867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectFields5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields5923 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleobjectFields5936 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields5957 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleobjectField_in_entryRuleobjectField5995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectField6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleobjectField6042 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleobjectField6053 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleobjectField6096 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleobjectField6107 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleobjectField6150 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleobjectField6161 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral6222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexprOrObjectLiteral6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment6442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_ruleAssignment6502 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleAssignment6526 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression6585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression6645 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSelectionExpression6669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionExpression6693 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_27_in_ruleSelectionExpression6712 = new BitSet(new long[]{0x001F000018000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression6747 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleSelectionExpression6760 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression6781 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleSelectionExpression6797 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression6837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTerminalExpression6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTerminalExpression7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTerminalExpression7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTerminalExpression7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTerminalExpression7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTerminalExpression7194 = new BitSet(new long[]{0x001F000008000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression7219 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTerminalExpression7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAccessLevel7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAccessLevel7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAccessLevel7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred37_InternalAS32414 = new BitSet(new long[]{0x0000800010000010L});
    public static final BitSet FOLLOW_ruleParameters_in_synpred37_InternalAS32435 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred37_InternalAS32447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred58_InternalAS34691 = new BitSet(new long[]{0x001F1671C8001070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_synpred58_InternalAS34713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred69_InternalAS35440 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_synpred69_InternalAS35453 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred69_InternalAS35474 = new BitSet(new long[]{0x0000000000800002L});

}