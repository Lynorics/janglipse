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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "';'", "'['", "'('", "')'", "']'", "'use'", "'*'", "'void'", "','", "'='", "'.*'", "'.'", "'interface'", "'extends'", "'static'", "'class'", "'implements'", "'override'", "'native'", "'function'", "'get'", "'set'", "':'", "'new'", "'for'", "'var'", "'each'", "'in'", "'do'", "'while'", "'switch'", "'case'", "'default'", "'return'", "'if'", "'else'", "'try'", "'catch'", "'finally'", "'const'", "'true'", "'false'", "'this'", "'super'", "'null'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'?:'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'==='", "'!=='", "'<'", "'>'", "'<='", "'>='", "'as'", "'instanceof'", "'is'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'!'", "'~'", "'typeof'", "'::'", "'private'", "'public'", "'protected'", "'internal'"
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
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:89:1: ruleModel returns [EObject current=null] : (this_Package_0= rulePackage | ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject lv_imp_1_0 = null;

        EObject lv_classes_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:93:28: ( (this_Package_0= rulePackage | ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: (this_Package_0= rulePackage | ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: (this_Package_0= rulePackage | ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||(LA2_0>=13 && LA2_0<=16)||LA2_0==20||LA2_0==27||(LA2_0>=29 && LA2_0<=30)||(LA2_0>=101 && LA2_0<=104)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:6: ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:6: ( ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )* )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:7: ( (lv_imp_1_0= ruleImports ) ) ( (lv_classes_2_0= ruleClass ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:107:7: ( (lv_imp_1_0= ruleImports ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:108:1: (lv_imp_1_0= ruleImports )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:108:1: (lv_imp_1_0= ruleImports )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:109:3: lv_imp_1_0= ruleImports
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getImpImportsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImports_in_ruleModel178);
                    lv_imp_1_0=ruleImports();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"imp",
                              		lv_imp_1_0, 
                              		"Imports");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:125:2: ( (lv_classes_2_0= ruleClass ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=29 && LA1_0<=30)||(LA1_0>=101 && LA1_0<=104)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:126:1: (lv_classes_2_0= ruleClass )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:126:1: (lv_classes_2_0= ruleClass )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:127:3: lv_classes_2_0= ruleClass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleClass_in_ruleModel199);
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
                    	    break loop1;
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
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage241);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage251); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:163:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_package_1_0 = null;

        EObject lv_imp_3_0 = null;

        EObject lv_directives_4_0 = null;

        EObject lv_classes_5_1 = null;

        EObject lv_classes_5_2 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:166:28: ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:1: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:1: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:167:3: otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:171:1: ( (lv_package_1_0= ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:172:1: (lv_package_1_0= ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:172:1: (lv_package_1_0= ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:173:3: lv_package_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getPackageQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage309);
            lv_package_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		set(
                     			current, 
                     			"package",
                      		lv_package_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:193:1: ( (lv_imp_3_0= ruleImports ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:194:1: (lv_imp_3_0= ruleImports )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:194:1: (lv_imp_3_0= ruleImports )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:195:3: lv_imp_3_0= ruleImports
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getImpImportsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImports_in_rulePackage342);
            lv_imp_3_0=ruleImports();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		set(
                     			current, 
                     			"imp",
                      		lv_imp_3_0, 
                      		"Imports");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:211:2: ( (lv_directives_4_0= ruledirective ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:212:1: (lv_directives_4_0= ruledirective )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:212:1: (lv_directives_4_0= ruledirective )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:213:3: lv_directives_4_0= ruledirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getDirectivesDirectiveParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruledirective_in_rulePackage363);
            	    lv_directives_4_0=ruledirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"directives",
            	              		lv_directives_4_0, 
            	              		"directive");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:229:3: ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27||(LA5_0>=29 && LA5_0<=30)||(LA5_0>=101 && LA5_0<=104)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:230:1: ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:230:1: ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:231:1: (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:231:1: (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface )
            	    int alt4=2;
            	    switch ( input.LA(1) ) {
            	    case 101:
            	        {
            	        int LA4_1 = input.LA(2);

            	        if ( (LA4_1==27) ) {
            	            alt4=2;
            	        }
            	        else if ( ((LA4_1>=29 && LA4_1<=30)) ) {
            	            alt4=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 102:
            	        {
            	        int LA4_2 = input.LA(2);

            	        if ( ((LA4_2>=29 && LA4_2<=30)) ) {
            	            alt4=1;
            	        }
            	        else if ( (LA4_2==27) ) {
            	            alt4=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 103:
            	        {
            	        int LA4_3 = input.LA(2);

            	        if ( (LA4_3==27) ) {
            	            alt4=2;
            	        }
            	        else if ( ((LA4_3>=29 && LA4_3<=30)) ) {
            	            alt4=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 104:
            	        {
            	        int LA4_4 = input.LA(2);

            	        if ( (LA4_4==27) ) {
            	            alt4=2;
            	        }
            	        else if ( ((LA4_4>=29 && LA4_4<=30)) ) {
            	            alt4=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 29:
            	    case 30:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:232:3: lv_classes_5_1= ruleClass
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_5_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleClass_in_rulePackage387);
            	            lv_classes_5_1=ruleClass();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"classes",
            	                      		lv_classes_5_1, 
            	                      		"Class");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:247:8: lv_classes_5_2= ruleInterface
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesInterfaceParserRuleCall_5_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInterface_in_rulePackage406);
            	            lv_classes_5_2=ruleInterface();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"classes",
            	                      		lv_classes_5_2, 
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
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePackage422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
                  
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


    // $ANTLR start "entryRuleImports"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:277:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:278:2: (iv_ruleImports= ruleImports EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:279:2: iv_ruleImports= ruleImports EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportsRule()); 
            }
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports458);
            iv_ruleImports=ruleImports();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImports; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports468); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:286:1: ruleImports returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:289:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:290:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:290:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:290:2: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:290:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:291:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImportsAccess().getImportsAction_0(),
                          current);
                  
            }

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:299:2: ( (lv_imports_1_0= ruleImport ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:300:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:300:1: (lv_imports_1_0= ruleImport )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:301:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleImports526);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImportsRule());
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
            	    break loop6;
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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:325:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:326:2: (iv_ruleImport= ruleImport EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:327:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport563);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport573); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:334:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:337:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:338:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:338:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:338:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:342:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:343:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:343:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:344:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport631);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport643); if (state.failed) return current;
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


    // $ANTLR start "entryRuledirective"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:372:1: entryRuledirective returns [EObject current=null] : iv_ruledirective= ruledirective EOF ;
    public final EObject entryRuledirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledirective = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:373:2: (iv_ruledirective= ruledirective EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:374:2: iv_ruledirective= ruledirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_ruledirective_in_entryRuledirective679);
            iv_ruledirective=ruledirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirective; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledirective689); if (state.failed) return current;

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
    // $ANTLR end "entryRuledirective"


    // $ANTLR start "ruledirective"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:381:1: ruledirective returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' ) ;
    public final EObject ruledirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annonFields_4_0 = null;

        EObject this_Uses_7 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:384:28: ( ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:1: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:1: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:2: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:2: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:3: () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:385:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:386:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDirectiveAccess().getDirectiveAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruledirective739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:399:1: (lv_name_2_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:400:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledirective756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getDirectiveAccess().getNameIDTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDirectiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:416:2: (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:416:4: otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruledirective774); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_0_3_0());
                                  
                            }
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:420:1: ( (lv_annonFields_4_0= ruleannotationFields ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:421:1: (lv_annonFields_4_0= ruleannotationFields )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:421:1: (lv_annonFields_4_0= ruleannotationFields )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:422:3: lv_annonFields_4_0= ruleannotationFields
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDirectiveAccess().getAnnonFieldsAnnotationFieldsParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleannotationFields_in_ruledirective795);
                            lv_annonFields_4_0=ruleannotationFields();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDirectiveRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"annonFields",
                                      		lv_annonFields_4_0, 
                                      		"annotationFields");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruledirective807); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_0_3_2());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruledirective821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDirectiveAccess().getRightSquareBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:448:2: this_Uses_7= ruleUses
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDirectiveAccess().getUsesParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUses_in_ruledirective853);
                    this_Uses_7=ruleUses();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Uses_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:460:7: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruledirective870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDirectiveAccess().getSemicolonKeyword_2());
                          
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
    // $ANTLR end "ruledirective"


    // $ANTLR start "entryRuleUses"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:472:1: entryRuleUses returns [EObject current=null] : iv_ruleUses= ruleUses EOF ;
    public final EObject entryRuleUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUses = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:473:2: (iv_ruleUses= ruleUses EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:474:2: iv_ruleUses= ruleUses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsesRule()); 
            }
            pushFollow(FOLLOW_ruleUses_in_entryRuleUses906);
            iv_ruleUses=ruleUses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUses; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUses916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUses"


    // $ANTLR start "ruleUses"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:481:1: ruleUses returns [EObject current=null] : (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) ) ;
    public final EObject ruleUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:484:28: ( (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:485:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:485:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:485:3: otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUses953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUsesAccess().getUseKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:490:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:490:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUses970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getUsesAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUsesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:2: ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:3: ( (lv_type_2_0= ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:507:3: ( (lv_type_2_0= ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:1: (lv_type_2_0= ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:1: (lv_type_2_0= ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:509:3: lv_type_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUsesAccess().getTypeQualifiedNameParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleUses997);
                    lv_type_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUsesRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:526:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleUses1015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUsesAccess().getAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:531:7: otherlv_4= 'void'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleUses1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUsesAccess().getVoidKeyword_2_2());
                          
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
    // $ANTLR end "ruleUses"


    // $ANTLR start "entryRuleannotationFields"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:543:1: entryRuleannotationFields returns [EObject current=null] : iv_ruleannotationFields= ruleannotationFields EOF ;
    public final EObject entryRuleannotationFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleannotationFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:544:2: (iv_ruleannotationFields= ruleannotationFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:545:2: iv_ruleannotationFields= ruleannotationFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleannotationFields_in_entryRuleannotationFields1070);
            iv_ruleannotationFields=ruleannotationFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleannotationFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationFields1080); if (state.failed) return current;

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
    // $ANTLR end "entryRuleannotationFields"


    // $ANTLR start "ruleannotationFields"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:552:1: ruleannotationFields returns [EObject current=null] : ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* ) ;
    public final EObject ruleannotationFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_anoonFields_0_0 = null;

        EObject lv_annonFields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:555:28: ( ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:1: ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:1: ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:2: ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:556:2: ( (lv_anoonFields_0_0= ruleannotationField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:557:1: (lv_anoonFields_0_0= ruleannotationField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:557:1: (lv_anoonFields_0_0= ruleannotationField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:558:3: lv_anoonFields_0_0= ruleannotationField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationFieldsAccess().getAnoonFieldsAnnotationFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleannotationField_in_ruleannotationFields1126);
            lv_anoonFields_0_0=ruleannotationField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationFieldsRule());
              	        }
                     		add(
                     			current, 
                     			"anoonFields",
                      		lv_anoonFields_0_0, 
                      		"annotationField");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:574:2: (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:574:4: otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleannotationFields1139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAnnotationFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:578:1: ( (lv_annonFields_2_0= ruleannotationField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:579:1: (lv_annonFields_2_0= ruleannotationField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:579:1: (lv_annonFields_2_0= ruleannotationField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:580:3: lv_annonFields_2_0= ruleannotationField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationFieldsAccess().getAnnonFieldsAnnotationFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleannotationField_in_ruleannotationFields1160);
            	    lv_annonFields_2_0=ruleannotationField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationFieldsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annonFields",
            	              		lv_annonFields_2_0, 
            	              		"annotationField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleannotationFields"


    // $ANTLR start "entryRuleannotationField"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:604:1: entryRuleannotationField returns [EObject current=null] : iv_ruleannotationField= ruleannotationField EOF ;
    public final EObject entryRuleannotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleannotationField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:605:2: (iv_ruleannotationField= ruleannotationField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:606:2: iv_ruleannotationField= ruleannotationField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationFieldRule()); 
            }
            pushFollow(FOLLOW_ruleannotationField_in_entryRuleannotationField1198);
            iv_ruleannotationField=ruleannotationField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleannotationField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationField1208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleannotationField"


    // $ANTLR start "ruleannotationField"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:613:1: ruleannotationField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleannotationField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:616:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:617:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:617:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:618:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:618:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:619:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleannotationField1250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleannotationField1267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:639:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:640:1: (lv_expr_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:640:1: (lv_expr_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:641:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationFieldAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleannotationField1288);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationFieldRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expression");
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
    // $ANTLR end "ruleannotationField"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:665:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:666:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:667:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1325);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1336); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:674:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:677:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:678:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:678:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:679:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1383);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:689:1: (kw= '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:690:2: kw= '.*'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedNameWithWildcard1402); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:703:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:704:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:705:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1445);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1456); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:712:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:715:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:716:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:716:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:716:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:723:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:724:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName1515); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1530); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:744:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:745:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:746:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1577);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1587); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:753:1: ruleInterface returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_members_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:756:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:757:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:757:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:757:2: ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:757:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=101 && LA13_0<=104)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:758:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:758:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:759:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleInterface1633);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInterface1646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:779:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:780:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:780:1: (lv_name_2_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:781:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1663); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:797:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:797:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleInterface1681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:801:1: ( (otherlv_4= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:802:1: (otherlv_4= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:802:1: (otherlv_4= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:803:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSuperclassTypeCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInterface1719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:821:1: ( (lv_members_6_0= ruleMember ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29||(LA15_0>=32 && LA15_0<=34)||LA15_0==40||(LA15_0>=101 && LA15_0<=104)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:822:1: (lv_members_6_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:822:1: (lv_members_6_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:823:3: lv_members_6_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleInterface1740);
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
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInterface1753); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:851:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:852:2: (iv_ruleClass= ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:853:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1789);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1799); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:860:1: ruleClass returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_members_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:863:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=101 && LA16_0<=104)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:865:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:865:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:866:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleClass1845);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:882:3: (otherlv_1= 'static' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:882:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleClass1859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleClass1873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:890:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:891:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:891:1: (lv_name_3_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:892:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1890); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:908:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:908:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleClass1908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:912:1: ( (otherlv_5= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:913:1: (otherlv_5= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:913:1: (otherlv_5= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:914:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSuperTypeClassCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:928:4: (otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:928:6: otherlv_6= 'implements' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleClass1947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getImplementsKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:932:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:933:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:933:1: (otherlv_7= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:934:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getClassAccess().getTypesInterfaceCrossReference_5_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:948:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==23) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:948:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleClass1984); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:952:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:953:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:953:1: (otherlv_9= RULE_ID )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:954:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass2008); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getClassAccess().getTypesInterfaceCrossReference_5_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleClass2024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:972:1: ( (lv_members_11_0= ruleMember ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29||(LA21_0>=32 && LA21_0<=34)||LA21_0==40||(LA21_0>=101 && LA21_0<=104)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:1: (lv_members_11_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:1: (lv_members_11_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:974:3: lv_members_11_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass2045);
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
            	    break loop21;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleClass2058); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1002:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1003:2: (iv_ruleMember= ruleMember EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1004:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2094);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2104); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1011:1: ruleMember returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_meth_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1014:28: ( ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1015:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1015:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case 101:
                {
                switch ( input.LA(2) ) {
                case 33:
                case 34:
                    {
                    alt22=2;
                    }
                    break;
                case 29:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==34) ) {
                        alt22=2;
                    }
                    else if ( (LA22_5==40) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case 102:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==34) ) {
                        alt22=2;
                    }
                    else if ( (LA22_5==40) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    alt22=1;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }

                }
                break;
            case 103:
                {
                switch ( input.LA(2) ) {
                case 33:
                case 34:
                    {
                    alt22=2;
                    }
                    break;
                case 29:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==34) ) {
                        alt22=2;
                    }
                    else if ( (LA22_5==40) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }

                }
                break;
            case 104:
                {
                switch ( input.LA(2) ) {
                case 33:
                case 34:
                    {
                    alt22=2;
                    }
                    break;
                case 29:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==34) ) {
                        alt22=2;
                    }
                    else if ( (LA22_5==40) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                int LA22_5 = input.LA(2);

                if ( (LA22_5==34) ) {
                    alt22=2;
                }
                else if ( (LA22_5==40) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt22=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1015:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1015:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1016:1: (lv_var_0_0= ruleVariableDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1016:1: (lv_var_0_0= ruleVariableDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1017:3: lv_var_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleMember2150);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1034:6: ( (lv_meth_1_0= ruleMethod ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1034:6: ( (lv_meth_1_0= ruleMethod ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1035:1: (lv_meth_1_0= ruleMethod )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1035:1: (lv_meth_1_0= ruleMethod )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1036:3: lv_meth_1_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getMethMethodParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember2177);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1060:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1061:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1062:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2213);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2223); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1069:1: ruleMethod returns [EObject current=null] : ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? ( (lv_body_15_0= ruleMethodBody ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_access_1_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1072:28: ( ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? ( (lv_body_15_0= ruleMethodBody ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1073:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? ( (lv_body_15_0= ruleMethodBody ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1073:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? ( (lv_body_15_0= ruleMethodBody ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1073:2: (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? ( (lv_body_15_0= ruleMethodBody ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1073:2: (otherlv_0= 'override' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1073:4: otherlv_0= 'override'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleMethod2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getOverrideKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1077:3: ( (lv_access_1_0= ruleAccessLevel ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=101 && LA24_0<=104)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1078:1: (lv_access_1_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1078:1: (lv_access_1_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1079:3: lv_access_1_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleMethod2284);
                    lv_access_1_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_1_0, 
                              		"AccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1095:3: (otherlv_2= 'native' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1095:5: otherlv_2= 'native'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleMethod2298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getNativeKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1099:3: (otherlv_3= 'static' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1099:5: otherlv_3= 'static'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMethod2313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getStaticKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleMethod2327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getFunctionKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:1: (otherlv_5= 'get' | otherlv_6= 'set' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            else if ( (LA27_0==36) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1107:3: otherlv_5= 'get'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleMethod2340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getGetKeyword_5_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1112:7: otherlv_6= 'set'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleMethod2358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getSetKeyword_5_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1116:3: ( (lv_name_7_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1117:1: (lv_name_7_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1117:1: (lv_name_7_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1118:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_7_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_7_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleMethod2394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:1: ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:2: ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1138:2: ( (lv_params_9_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1139:1: (lv_params_9_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1139:1: (lv_params_9_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1140:3: lv_params_9_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2416);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1156:2: (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==23) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1156:4: otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleMethod2429); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1160:1: ( (lv_params_11_0= ruleParameter ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1161:1: (lv_params_11_0= ruleParameter )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1161:1: (lv_params_11_0= ruleParameter )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1162:3: lv_params_11_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2450);
                    	    lv_params_11_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_11_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMethod2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightParenthesisKeyword_9());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1182:1: (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1182:3: otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleMethod2479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getColonKeyword_10_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1186:1: ( (otherlv_14= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1187:1: (otherlv_14= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1187:1: (otherlv_14= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1188:3: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                              
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getTypeTypeCrossReference_10_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1202:4: ( (lv_body_15_0= ruleMethodBody ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1203:1: (lv_body_15_0= ruleMethodBody )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1203:1: (lv_body_15_0= ruleMethodBody )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1204:3: lv_body_15_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodBody_in_ruleMethod2526);
            lv_body_15_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_15_0, 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1228:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1229:2: (iv_ruleMethodBody= ruleMethodBody EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1230:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMethodBody_in_entryRuleMethodBody2562);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodBody2572); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1237:1: ruleMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1240:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1241:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1241:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1241:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1241:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1242:2: 
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMethodBody2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1254:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==12||LA31_0==17||(LA31_0>=21 && LA31_0<=22)||LA31_0==24||LA31_0==26||LA31_0==29||(LA31_0>=38 && LA31_0<=40)||(LA31_0>=42 && LA31_0<=45)||(LA31_0>=48 && LA31_0<=49)||LA31_0==51||(LA31_0>=55 && LA31_0<=104)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1255:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1255:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1256:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodBodyAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethodBody2642);
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
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMethodBody2655); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1284:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1285:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1286:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2691);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2701); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1293:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1296:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1297:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1297:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | this_NewStatement_10= ruleNewStatement | this_objectLiteral_11= ruleobjectLiteral )
            int alt32=11;
            switch ( input.LA(1) ) {
            case 29:
            case 40:
            case 101:
            case 102:
            case 103:
            case 104:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 17:
            case 21:
            case 22:
            case 24:
            case 26:
            case 42:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt32=3;
                }
                break;
            case 49:
                {
                alt32=4;
                }
                break;
            case 45:
                {
                alt32=5;
                }
                break;
            case 51:
                {
                alt32=6;
                }
                break;
            case 44:
                {
                alt32=7;
                }
                break;
            case 43:
                {
                alt32=8;
                }
                break;
            case 39:
                {
                alt32=9;
                }
                break;
            case 38:
                {
                alt32=10;
                }
                break;
            case 12:
                {
                alt32=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1298:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement2751);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1311:2: this_Return_1= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleStatement2781);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1323:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1323:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1324:2: this_Expression_2= ruleExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement2812);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStatement2823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1341:2: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement2855);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1354:2: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement2885);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1367:2: this_TryStatement_6= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTryStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryStatement_in_ruleStatement2915);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1380:2: this_WhileStatement_7= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement2945);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1393:2: this_DoWhileStatement_8= ruleDoWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoWhileStatement_in_ruleStatement2975);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1406:2: this_ForStatement_9= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement3005);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1419:2: this_NewStatement_10= ruleNewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getNewStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewStatement_in_ruleStatement3035);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1432:2: this_objectLiteral_11= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getObjectLiteralParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleStatement3065);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1451:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1452:2: (iv_ruleNewStatement= ruleNewStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1453:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleNewStatement_in_entryRuleNewStatement3100);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewStatement3110); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1460:1: ruleNewStatement returns [EObject current=null] : ( () otherlv_1= 'new' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1463:28: ( ( () otherlv_1= 'new' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1464:1: ( () otherlv_1= 'new' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1464:1: ( () otherlv_1= 'new' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1464:2: () otherlv_1= 'new' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1464:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1465:2: 
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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleNewStatement3159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewStatementAccess().getNewKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1477:1: ( (otherlv_2= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1478:1: (otherlv_2= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1478:1: (otherlv_2= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1479:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewStatement3183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getNewStatementAccess().getTypeTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1493:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1493:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNewStatement3196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1497:1: ( (lv_param_4_0= ruleParameters ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==54) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==18) ) {
                        int LA33_2 = input.LA(2);

                        if ( (synpred45_InternalAS3()) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1499:3: lv_param_4_0= ruleParameters
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameters_in_ruleNewStatement3217);
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
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNewStatement3230); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1527:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1528:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1529:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement3268);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement3278); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1536:1: ruleForStatement returns [EObject current=null] : ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1539:28: ( ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1540:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1540:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            int alt44=4;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1540:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1540:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1540:4: otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) )
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleForStatement3316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1548:1: ( (lv_forinit_2_0= rulecommaExpr ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==17||(LA35_0>=21 && LA35_0<=22)||LA35_0==24||LA35_0==26||LA35_0==42||(LA35_0>=55 && LA35_0<=100)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1549:1: (lv_forinit_2_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1549:1: (lv_forinit_2_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1550:3: lv_forinit_2_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getForinitCommaExprParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3349);
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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1570:1: ( (lv_condition_4_0= rulecommaExpr ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==17||(LA36_0>=21 && LA36_0<=22)||LA36_0==24||LA36_0==26||LA36_0==42||(LA36_0>=55 && LA36_0<=100)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1571:1: (lv_condition_4_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1571:1: (lv_condition_4_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1572:3: lv_condition_4_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_0_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3383);
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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1592:1: ( (lv_iterator_6_0= rulecommaExpr ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==17||(LA37_0>=21 && LA37_0<=22)||LA37_0==24||LA37_0==26||LA37_0==42||(LA37_0>=55 && LA37_0<=100)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1593:1: (lv_iterator_6_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1593:1: (lv_iterator_6_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1594:3: lv_iterator_6_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_0_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3417);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_0_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1614:1: ( (lv_command_8_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1615:1: (lv_command_8_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1615:1: (lv_command_8_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1616:3: lv_command_8_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_0_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3451);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1633:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1633:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1633:8: otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleForStatement3471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getForKeyword_1_0());
                          
                    }
                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleForStatement3495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getForStatementAccess().getVarKeyword_1_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1645:1: ( (lv_elements_12_0= ruleidentifierDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1646:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1646:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1647:3: lv_elements_12_0= ruleidentifierDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3516);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1663:2: (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==23) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1663:4: otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleForStatement3529); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getForStatementAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1667:1: ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1668:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1669:3: lv_elements_14_0= ruleidentifierDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3550);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1689:1: ( (lv_condition_16_0= rulecommaExpr ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||LA39_0==17||(LA39_0>=21 && LA39_0<=22)||LA39_0==24||LA39_0==26||LA39_0==42||(LA39_0>=55 && LA39_0<=100)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1690:1: (lv_condition_16_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1690:1: (lv_condition_16_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1691:3: lv_condition_16_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3585);
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

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1711:1: ( (lv_iterator_18_0= rulecommaExpr ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INT)||LA40_0==17||(LA40_0>=21 && LA40_0<=22)||LA40_0==24||LA40_0==26||LA40_0==42||(LA40_0>=55 && LA40_0<=100)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1712:1: (lv_iterator_18_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1712:1: (lv_iterator_18_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1713:3: lv_iterator_18_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_1_8_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3619);
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

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_1_9());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1733:1: ( (lv_command_20_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1734:1: (lv_command_20_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1734:1: (lv_command_20_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1735:3: lv_command_20_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_1_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3653);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1752:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1752:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1752:8: otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    {
                    otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleForStatement3673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getForStatementAccess().getForKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1756:1: (otherlv_22= 'each' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==41) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1756:3: otherlv_22= 'each'
                            {
                            otherlv_22=(Token)match(input,41,FOLLOW_41_in_ruleForStatement3686); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getForStatementAccess().getEachKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1764:1: ( (lv_nameForin_24_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1765:1: (lv_nameForin_24_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1765:1: (lv_nameForin_24_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1766:3: lv_nameForin_24_0= RULE_ID
                    {
                    lv_nameForin_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement3717); if (state.failed) return current;
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

                    otherlv_25=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getForStatementAccess().getInKeyword_2_4());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1786:1: ( (lv_forinexpr_26_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1787:1: (lv_forinexpr_26_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1787:1: (lv_forinexpr_26_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1788:3: lv_forinexpr_26_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForinexprExpressionParserRuleCall_2_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement3755);
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

                    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_2_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1808:1: ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1809:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1809:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1810:3: lv_forcommand_28_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForcommandStatementsBlockParserRuleCall_2_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3788);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1827:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1827:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1827:8: otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    {
                    otherlv_29=(Token)match(input,39,FOLLOW_39_in_ruleForStatement3808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getForStatementAccess().getForKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1831:1: (otherlv_30= 'each' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==41) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1831:3: otherlv_30= 'each'
                            {
                            otherlv_30=(Token)match(input,41,FOLLOW_41_in_ruleForStatement3821); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getForStatementAccess().getEachKeyword_3_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_32=(Token)match(input,40,FOLLOW_40_in_ruleForStatement3847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getForStatementAccess().getVarKeyword_3_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1843:1: ( (lv_nameForeachh_33_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1844:1: (lv_nameForeachh_33_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1844:1: (lv_nameForeachh_33_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1845:3: lv_nameForeachh_33_0= RULE_ID
                    {
                    lv_nameForeachh_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement3864); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1861:2: ( (lv_relation_34_0= ruletypeRelation ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==37) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1862:1: (lv_relation_34_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1862:1: (lv_relation_34_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1863:3: lv_relation_34_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getRelationTypeRelationParserRuleCall_3_5_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleForStatement3890);
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

                    otherlv_35=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getForStatementAccess().getInKeyword_3_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1883:1: ( (lv_foreachexpr_36_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1884:1: (lv_foreachexpr_36_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1884:1: (lv_foreachexpr_36_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1885:3: lv_foreachexpr_36_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachexprExpressionParserRuleCall_3_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement3924);
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

                    otherlv_37=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3_8());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1905:1: ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1906:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1906:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1907:3: lv_foreachcommand_38_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachcommandStatementsBlockParserRuleCall_3_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3957);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1931:1: entryRuleidentifierDeclaration returns [EObject current=null] : iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF ;
    public final EObject entryRuleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1932:2: (iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1933:2: iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration3994);
            iv_ruleidentifierDeclaration=ruleidentifierDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifierDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifierDeclaration4004); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1940:1: ruleidentifierDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_relation_1_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1943:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1945:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1945:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1946:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifierDeclaration4046); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1962:2: ( (lv_relation_1_0= ruletypeRelation ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1963:1: (lv_relation_1_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1963:1: (lv_relation_1_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1964:3: lv_relation_1_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getRelationTypeRelationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration4072);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1980:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1980:5: otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleidentifierDeclaration4086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIdentifierDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1984:1: ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1985:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1985:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1986:3: lv_expr_3_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getExprExprOrObjectLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4107);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2010:1: entryRulecommaExpr returns [EObject current=null] : iv_rulecommaExpr= rulecommaExpr EOF ;
    public final EObject entryRulecommaExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecommaExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2011:2: (iv_rulecommaExpr= rulecommaExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2012:2: iv_rulecommaExpr= rulecommaExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaExprRule()); 
            }
            pushFollow(FOLLOW_rulecommaExpr_in_entryRulecommaExpr4145);
            iv_rulecommaExpr=rulecommaExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommaExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecommaExpr4155); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2019:1: rulecommaExpr returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulecommaExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2022:28: ( ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2023:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2023:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2023:2: ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2023:2: ( (lv_elements_0_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2024:1: (lv_elements_0_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2024:1: (lv_elements_0_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2025:3: lv_elements_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4201);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2041:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==23) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2041:4: otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulecommaExpr4214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommaExprAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2045:1: ( (lv_elements_2_0= ruleExpression ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2046:1: (lv_elements_2_0= ruleExpression )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2046:1: (lv_elements_2_0= ruleExpression )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2047:3: lv_elements_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4235);
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
            	    break loop47;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2071:1: entryRuleDoWhileStatement returns [EObject current=null] : iv_ruleDoWhileStatement= ruleDoWhileStatement EOF ;
    public final EObject entryRuleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2072:2: (iv_ruleDoWhileStatement= ruleDoWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2073:2: iv_ruleDoWhileStatement= ruleDoWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4273);
            iv_ruleDoWhileStatement=ruleDoWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhileStatement4283); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2080:1: ruleDoWhileStatement returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whileBlock_2_0 = null;

        EObject lv_cond_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2083:28: ( ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2084:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2084:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2084:2: () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2084:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2085:2: 
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDoWhileStatement4332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoWhileStatementAccess().getDoKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2097:1: ( (lv_whileBlock_2_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2098:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2098:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2099:3: lv_whileBlock_2_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4353);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleDoWhileStatement4365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileStatementAccess().getWhileKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2119:1: ( (lv_cond_4_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2120:1: (lv_cond_4_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2120:1: (lv_cond_4_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2121:3: lv_cond_4_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getCondParenthesizedExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4386);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDoWhileStatement4398); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2149:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2150:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2151:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4434);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement4444); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2158:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cond_2_0 = null;

        EObject lv_whileBlock_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2161:28: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:2: () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2163:2: 
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleWhileStatement4493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2177:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement4514);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2193:2: ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2194:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2194:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2195:3: lv_whileBlock_3_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleWhileStatement4535);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2219:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2220:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2221:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement4571);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement4581); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2228:1: ruleSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cases_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2231:28: ( ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:2: () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2233:2: 
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

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleSwitchStatement4630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2245:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2246:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2246:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2247:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement4651);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSwitchStatement4663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2267:1: ( (lv_cases_4_0= rulestatementInSwitch ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==12||LA48_0==17||(LA48_0>=21 && LA48_0<=22)||LA48_0==24||LA48_0==26||LA48_0==29||(LA48_0>=38 && LA48_0<=40)||(LA48_0>=42 && LA48_0<=49)||LA48_0==51||(LA48_0>=55 && LA48_0<=104)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2268:1: (lv_cases_4_0= rulestatementInSwitch )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2268:1: (lv_cases_4_0= rulestatementInSwitch )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2269:3: lv_cases_4_0= rulestatementInSwitch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesStatementInSwitchParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement4684);
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
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSwitchStatement4697); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2297:1: entryRuleparenthesizedExpr returns [EObject current=null] : iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF ;
    public final EObject entryRuleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparenthesizedExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2298:2: (iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2299:2: iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr4733);
            iv_ruleparenthesizedExpr=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparenthesizedExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparenthesizedExpr4743); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2306:1: ruleparenthesizedExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) ;
    public final EObject ruleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2309:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2310:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2310:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2310:3: otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleparenthesizedExpr4780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2314:1: ( (lv_expression_1_0= ruleexprOrObjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2316:3: lv_expression_1_0= ruleexprOrObjectLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExpressionExprOrObjectLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr4801);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleparenthesizedExpr4813); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2344:1: entryRulestatementInSwitch returns [EObject current=null] : iv_rulestatementInSwitch= rulestatementInSwitch EOF ;
    public final EObject entryRulestatementInSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatementInSwitch = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2345:2: (iv_rulestatementInSwitch= rulestatementInSwitch EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2346:2: iv_rulestatementInSwitch= rulestatementInSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementInSwitchRule()); 
            }
            pushFollow(FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch4849);
            iv_rulestatementInSwitch=rulestatementInSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementInSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatementInSwitch4859); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2353:1: rulestatementInSwitch returns [EObject current=null] : (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2356:28: ( (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2357:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2357:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 17:
            case 21:
            case 22:
            case 24:
            case 26:
            case 29:
            case 38:
            case 39:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 51:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                {
                alt49=1;
                }
                break;
            case 46:
                {
                alt49=2;
                }
                break;
            case 47:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2358:2: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_rulestatementInSwitch4909);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2370:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2370:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2370:8: otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_rulestatementInSwitch4927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementInSwitchAccess().getCaseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulestatementInSwitch4952);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_rulestatementInSwitch4963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementInSwitchAccess().getColonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2391:6: (otherlv_4= 'default' otherlv_5= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2391:6: (otherlv_4= 'default' otherlv_5= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2391:8: otherlv_4= 'default' otherlv_5= ':'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulestatementInSwitch4983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatementInSwitchAccess().getDefaultKeyword_2_0());
                          
                    }
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_rulestatementInSwitch4995); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2407:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2408:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2409:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn5032);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn5042); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2416:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2419:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2420:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2420:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2420:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleReturn5079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2424:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2425:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2425:1: (lv_expression_1_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2426:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturn5100);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleReturn5112); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2454:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2455:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2456:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5148);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration5158); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2463:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2466:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2467:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2467:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2467:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2467:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=101 && LA50_0<=104)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2468:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2468:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2469:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5204);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2485:3: (otherlv_1= 'static' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2485:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleVariableDeclaration5218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleVariableDeclaration5232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getVarKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2493:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2494:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2494:1: (lv_name_3_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2495:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration5249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleVariableDeclaration5266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getColonKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2515:1: ( (otherlv_5= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2516:1: (otherlv_5= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2516:1: (otherlv_5= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2517:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration5290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getTypeTypeCrossReference_5_0()); 
              	
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2531:2: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2531:4: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleVariableDeclaration5303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2535:1: ( (lv_expression_7_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2536:1: (lv_expression_7_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2536:1: (lv_expression_7_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2537:3: lv_expression_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration5324);
                    lv_expression_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration5338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_7());
                  
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2565:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2566:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2567:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement5374);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement5384); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2574:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2577:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2578:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2578:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2578:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleIfStatement5421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIfStatement5433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2586:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2587:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2587:1: (lv_expression_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2588:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement5454);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIfStatement5466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2608:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2609:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2609:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2610:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement5487);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred69_InternalAS3()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleIfStatement5508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2631:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2632:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2632:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2633:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement5530);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2657:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2658:2: (iv_ruleTryStatement= ruleTryStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2659:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTryStatement_in_entryRuleTryStatement5568);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryStatement5578); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2666:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2669:28: ( (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2670:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2670:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2670:3: otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleTryStatement5615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTryStatement5627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTryStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2678:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||LA54_0==12||LA54_0==17||(LA54_0>=21 && LA54_0<=22)||LA54_0==24||LA54_0==26||LA54_0==29||(LA54_0>=38 && LA54_0<=40)||(LA54_0>=42 && LA54_0<=45)||(LA54_0>=48 && LA54_0<=49)||LA54_0==51||(LA54_0>=55 && LA54_0<=104)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2679:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2679:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2680:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement5648);
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
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTryStatement5661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTryStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2700:1: (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2700:3: otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleTryStatement5674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTryStatementAccess().getCatchKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTryStatement5686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTryStatementAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2708:1: ( (lv_params_6_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2709:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2709:1: (lv_params_6_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2710:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamsParameterParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleTryStatement5707);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTryStatement5719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTryStatementAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2730:3: (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2730:5: otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleTryStatement5734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTryStatementAccess().getFinallyKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2734:1: ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2735:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2735:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2736:3: lv_finallyBlock_9_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinallyBlockStatementsBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleTryStatement5755);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2760:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2761:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2762:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock5793);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock5803); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2769:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_StatementsBlock_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2772:28: ( ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2773:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2773:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_INT)||LA57_0==17||(LA57_0>=21 && LA57_0<=22)||LA57_0==24||LA57_0==26||LA57_0==29||(LA57_0>=38 && LA57_0<=40)||(LA57_0>=42 && LA57_0<=45)||(LA57_0>=48 && LA57_0<=49)||LA57_0==51||(LA57_0>=55 && LA57_0<=104)) ) {
                alt57=1;
            }
            else if ( (LA57_0==12) ) {
                switch ( input.LA(2) ) {
                case 12:
                case 13:
                case 17:
                case 21:
                case 22:
                case 24:
                case 26:
                case 29:
                case 38:
                case 39:
                case 40:
                case 42:
                case 43:
                case 44:
                case 45:
                case 48:
                case 49:
                case 51:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    {
                    alt57=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA57_4 = input.LA(3);

                    if ( (LA57_4==15||LA57_4==24||LA57_4==26) ) {
                        alt57=2;
                    }
                    else if ( (LA57_4==37) ) {
                        alt57=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA57_5 = input.LA(3);

                    if ( (LA57_5==15||LA57_5==24||LA57_5==26) ) {
                        alt57=2;
                    }
                    else if ( (LA57_5==37) ) {
                        alt57=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA57_6 = input.LA(3);

                    if ( (LA57_6==37) ) {
                        alt57=1;
                    }
                    else if ( (LA57_6==15||LA57_6==24||LA57_6==26) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2773:2: ( (lv_statements_0_0= ruleStatement ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2773:2: ( (lv_statements_0_0= ruleStatement ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2774:1: (lv_statements_0_0= ruleStatement )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2774:1: (lv_statements_0_0= ruleStatement )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2775:3: lv_statements_0_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfBlock5849);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2793:2: this_StatementsBlock_1= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleIfBlock5880);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2812:1: entryRuleStatementsBlock returns [EObject current=null] : iv_ruleStatementsBlock= ruleStatementsBlock EOF ;
    public final EObject entryRuleStatementsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementsBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2813:2: (iv_ruleStatementsBlock= ruleStatementsBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2814:2: iv_ruleStatementsBlock= ruleStatementsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementsBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock5915);
            iv_ruleStatementsBlock=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementsBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementsBlock5925); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2821:1: ruleStatementsBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleStatementsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2824:28: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2825:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2825:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2825:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatementsBlock5962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementsBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2829:1: ( (lv_statements_1_0= ruleStatement ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||LA58_0==12||LA58_0==17||(LA58_0>=21 && LA58_0<=22)||LA58_0==24||LA58_0==26||LA58_0==29||(LA58_0>=38 && LA58_0<=40)||(LA58_0>=42 && LA58_0<=45)||(LA58_0>=48 && LA58_0<=49)||LA58_0==51||(LA58_0>=55 && LA58_0<=104)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2830:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2830:1: (lv_statements_1_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2831:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementsBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementsBlock5983);
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
            	    break loop58;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatementsBlock5996); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2861:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2862:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2863:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter6034);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter6044); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2870:1: ruleParameter returns [EObject current=null] : ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rel_2_0 = null;

        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2873:28: ( ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2874:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2874:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2874:2: (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2874:2: (otherlv_0= 'const' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2874:4: otherlv_0= 'const'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleParameter6082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getConstKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2878:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2879:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2879:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2880:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter6101); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2896:2: ( (lv_rel_2_0= ruletypeRelation ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==37) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2897:1: (lv_rel_2_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2897:1: (lv_rel_2_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2898:3: lv_rel_2_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getRelTypeRelationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleParameter6127);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2914:3: (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2914:5: otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParameter6141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2918:1: ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2919:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2919:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2920:3: lv_lit_4_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getLitExprOrObjectLiteralParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6162);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2944:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2945:2: (iv_ruleParameters= ruleParameters EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2946:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters6200);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters6210); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2953:1: ruleParameters returns [EObject current=null] : ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2956:28: ( ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            int alt67=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred80_InternalAS3()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred80_InternalAS3()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 18:
                {
                alt67=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID||LA63_0==54) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:3: ( (lv_elements_0_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2958:1: (lv_elements_0_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2958:1: (lv_elements_0_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2959:3: lv_elements_0_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters6257);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2975:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==23) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2975:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                            	    {
                            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParameters6270); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2979:1: ( (lv_elements_2_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2980:1: (lv_elements_2_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2980:1: (lv_elements_2_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2981:3: lv_elements_2_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters6291);
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
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==54) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_ID) ) {
                        int LA65_2 = input.LA(2);

                        if ( (LA65_2==37) ) {
                            int LA65_3 = input.LA(3);

                            if ( (LA65_3==RULE_ID) ) {
                                int LA65_5 = input.LA(4);

                                if ( ((LA65_5>=23 && LA65_5<=24)) ) {
                                    alt65=1;
                                }
                            }
                        }
                        else if ( ((LA65_2>=23 && LA65_2<=24)) ) {
                            alt65=1;
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:8: ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ','
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2998:8: ( (lv_elements_3_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2999:1: (lv_elements_3_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2999:1: (lv_elements_3_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3000:3: lv_elements_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters6324);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3016:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==23) ) {
                                    int LA64_1 = input.LA(2);

                                    if ( (LA64_1==54) ) {
                                        alt64=1;
                                    }
                                    else if ( (LA64_1==RULE_ID) ) {
                                        int LA64_3 = input.LA(3);

                                        if ( (LA64_3==37) ) {
                                            int LA64_4 = input.LA(4);

                                            if ( (LA64_4==RULE_ID) ) {
                                                int LA64_6 = input.LA(5);

                                                if ( ((LA64_6>=23 && LA64_6<=24)) ) {
                                                    alt64=1;
                                                }


                                            }


                                        }
                                        else if ( ((LA64_3>=23 && LA64_3<=24)) ) {
                                            alt64=1;
                                        }


                                    }


                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3016:4: otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleParameters6337); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getCommaKeyword_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3020:1: ( (lv_elements_5_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3021:1: (lv_elements_5_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3021:1: (lv_elements_5_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3022:3: lv_elements_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters6358);
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
                            	    break loop64;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleParameters6372); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getParametersAccess().getCommaKeyword_1_0_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3042:3: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3043:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3043:1: (lv_name_7_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3044:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters6391); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3060:2: ( (lv_rel_8_0= ruletypeRelation ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==37) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3061:1: (lv_rel_8_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3061:1: (lv_rel_8_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3062:3: lv_rel_8_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getRelTypeRelationParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleParameters6417);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3086:1: entryRuletypeRelation returns [EObject current=null] : iv_ruletypeRelation= ruletypeRelation EOF ;
    public final EObject entryRuletypeRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeRelation = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3087:2: (iv_ruletypeRelation= ruletypeRelation EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3088:2: iv_ruletypeRelation= ruletypeRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRelationRule()); 
            }
            pushFollow(FOLLOW_ruletypeRelation_in_entryRuletypeRelation6455);
            iv_ruletypeRelation=ruletypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeRelation6465); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3095:1: ruletypeRelation returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruletypeRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3098:28: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3099:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3099:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3099:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruletypeRelation6502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeRelationAccess().getColonKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3103:1: ( (otherlv_1= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3104:1: (otherlv_1= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3104:1: (otherlv_1= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3105:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRelationRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletypeRelation6526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTypeRelationAccess().getTypeTypeCrossReference_1_0()); 
              	
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3127:1: entryRuleobjectLiteral returns [EObject current=null] : iv_ruleobjectLiteral= ruleobjectLiteral EOF ;
    public final EObject entryRuleobjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3128:2: (iv_ruleobjectLiteral= ruleobjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3129:2: iv_ruleobjectLiteral= ruleobjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral6562);
            iv_ruleobjectLiteral=ruleobjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectLiteral6572); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3136:1: ruleobjectLiteral returns [EObject current=null] : (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) ;
    public final EObject ruleobjectLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_objectFields_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3139:28: ( (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3140:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3140:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3140:3: otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleobjectLiteral6609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getObjectLiteralAccess().getObjectFieldsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleobjectFields_in_ruleobjectLiteral6634);
            this_objectFields_1=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_objectFields_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleobjectLiteral6645); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3168:1: entryRuleobjectFields returns [EObject current=null] : iv_ruleobjectFields= ruleobjectFields EOF ;
    public final EObject entryRuleobjectFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3169:2: (iv_ruleobjectFields= ruleobjectFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3170:2: iv_ruleobjectFields= ruleobjectFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleobjectFields_in_entryRuleobjectFields6681);
            iv_ruleobjectFields=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectFields6691); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3177:1: ruleobjectFields returns [EObject current=null] : ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) ;
    public final EObject ruleobjectFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3180:28: ( ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3181:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3181:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3181:2: ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3181:2: ( (lv_fields_0_0= ruleobjectField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3182:1: (lv_fields_0_0= ruleobjectField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3182:1: (lv_fields_0_0= ruleobjectField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3183:3: lv_fields_0_0= ruleobjectField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields6737);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3199:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==23) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3199:4: otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleobjectFields6750); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3203:1: ( (lv_fields_2_0= ruleobjectField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3204:1: (lv_fields_2_0= ruleobjectField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3204:1: (lv_fields_2_0= ruleobjectField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3205:3: lv_fields_2_0= ruleobjectField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields6771);
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
            	    break loop68;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3229:1: entryRuleobjectField returns [EObject current=null] : iv_ruleobjectField= ruleobjectField EOF ;
    public final EObject entryRuleobjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3230:2: (iv_ruleobjectField= ruleobjectField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3231:2: iv_ruleobjectField= ruleobjectField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldRule()); 
            }
            pushFollow(FOLLOW_ruleobjectField_in_entryRuleobjectField6809);
            iv_ruleobjectField=ruleobjectField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectField6819); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3238:1: ruleobjectField returns [EObject current=null] : ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3241:28: ( ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt69=1;
                }
                break;
            case RULE_STRING:
                {
                alt69=2;
                }
                break;
            case RULE_INT:
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:3: this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleobjectField6856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleobjectField6867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6892);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3263:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3263:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3263:7: this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleobjectField6910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleobjectField6921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getObjectFieldAccess().getColonKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6946);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3284:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3284:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3284:7: this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleobjectField6964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()); 
                          
                    }
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleobjectField6975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getObjectFieldAccess().getColonKeyword_2_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7000);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3312:1: entryRuleexprOrObjectLiteral returns [EObject current=null] : iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF ;
    public final EObject entryRuleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexprOrObjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3313:2: (iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3314:2: iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7036);
            iv_ruleexprOrObjectLiteral=ruleexprOrObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprOrObjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7046); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:1: ruleexprOrObjectLiteral returns [EObject current=null] : (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) ;
    public final EObject ruleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_objectLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3324:28: ( (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3325:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3325:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_INT)||LA70_0==17||(LA70_0>=21 && LA70_0<=22)||LA70_0==24||LA70_0==26||LA70_0==42||(LA70_0>=55 && LA70_0<=100)) ) {
                alt70=1;
            }
            else if ( (LA70_0==12) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3326:2: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7096);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3339:2: this_objectLiteral_1= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getObjectLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7126);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3360:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3361:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3362:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7163);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7173); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3369:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3372:28: (this_Assignment_0= ruleAssignment )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3374:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression7222);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3393:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3394:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3395:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment7256);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment7266); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3402:1: ruleAssignment returns [EObject current=null] : (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SelectionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3405:28: ( (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3406:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3406:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3407:2: this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_ruleAssignment7316);
            this_SelectionExpression_0=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3418:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==24) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3418:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3418:2: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3419:2: 
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

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAssignment7340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:1: ( (lv_right_3_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3432:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3432:1: (lv_right_3_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3433:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment7361);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3457:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3458:2: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3459:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression7399);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression7409); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3466:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3469:28: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3470:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3470:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3471:2: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression7459);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3482:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==26) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3482:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3482:2: ()
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3483:2: 
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

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleSelectionExpression7483); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3495:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3496:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3496:1: (otherlv_3= RULE_ID )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3497:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionExpression7507); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3511:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==17) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3511:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3511:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3512:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3512:1: (lv_methodinvocation_4_0= '(' )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3513:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,17,FOLLOW_17_in_ruleSelectionExpression7526); if (state.failed) return current;
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

            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3526:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt73=2;
            	            int LA73_0 = input.LA(1);

            	            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_INT)||LA73_0==17||(LA73_0>=21 && LA73_0<=22)||LA73_0==24||LA73_0==26||LA73_0==42||(LA73_0>=55 && LA73_0<=100)) ) {
            	                alt73=1;
            	            }
            	            switch (alt73) {
            	                case 1 :
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3526:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3526:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3527:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3527:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3528:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression7561);
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

            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3544:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop72:
            	                    do {
            	                        int alt72=2;
            	                        int LA72_0 = input.LA(1);

            	                        if ( (LA72_0==23) ) {
            	                            alt72=1;
            	                        }


            	                        switch (alt72) {
            	                    	case 1 :
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3544:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleSelectionExpression7574); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3548:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3549:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3549:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3550:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression7595);
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
            	                    	    break loop72;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSelectionExpression7611); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3580:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3581:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3582:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression7653);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression7663); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3589:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'void' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) ;
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
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject this_Expression_19 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3592:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'void' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'void' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'void' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            int alt77=10;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt77=1;
                }
                break;
            case RULE_INT:
                {
                alt77=2;
                }
                break;
            case 55:
            case 56:
                {
                alt77=3;
                }
                break;
            case 57:
                {
                alt77=4;
                }
                break;
            case 58:
                {
                alt77=5;
                }
                break;
            case 59:
                {
                alt77=6;
                }
                break;
            case 22:
                {
                alt77=7;
                }
                break;
            case RULE_ID:
                {
                alt77=8;
                }
                break;
            case 21:
            case 24:
            case 26:
            case 42:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt77=9;
                }
                break;
            case 17:
                {
                alt77=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3593:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3594:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3602:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3603:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3603:1: (lv_value_1_0= RULE_STRING )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3604:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression7718); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3621:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3621:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3621:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3621:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3622:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3630:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3631:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3631:1: (lv_value_3_0= RULE_INT )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3632:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression7760); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3649:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3649:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3649:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3649:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3650:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3658:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3659:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3659:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3660:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3660:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==55) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==56) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3661:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,55,FOLLOW_55_in_ruleTerminalExpression7805); if (state.failed) return current;
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
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3673:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,56,FOLLOW_56_in_ruleTerminalExpression7834); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3689:6: ( () otherlv_7= 'this' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3689:6: ( () otherlv_7= 'this' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3689:7: () otherlv_7= 'this'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3689:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3690:2: 
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

                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleTerminalExpression7882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3703:6: ( () otherlv_9= 'super' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3703:6: ( () otherlv_9= 'super' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3703:7: () otherlv_9= 'super'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3703:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3704:2: 
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

                    otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleTerminalExpression7914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3717:6: ( () otherlv_11= 'null' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3717:6: ( () otherlv_11= 'null' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3717:7: () otherlv_11= 'null'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3717:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3718:2: 
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

                    otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleTerminalExpression7946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3731:6: ( () otherlv_13= 'void' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3731:6: ( () otherlv_13= 'void' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3731:7: () otherlv_13= 'void'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3731:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3732:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getVoidAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleTerminalExpression7978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getVoidKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3745:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3745:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3745:7: () ( (otherlv_15= RULE_ID ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3745:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3746:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3754:2: ( (otherlv_15= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3755:1: (otherlv_15= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3755:1: (otherlv_15= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3756:3: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression8022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3771:6: ( () ruleTerminalOperator )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3771:6: ( () ruleTerminalOperator )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3771:7: () ruleTerminalOperator
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3771:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3772:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getTerminalOpAction_8_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getTerminalOperatorParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8061);
                    ruleTerminalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3792:6: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3792:6: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3792:8: otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')'
                    {
                    otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleTerminalExpression8080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression8105);
                    this_Expression_19=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_19; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleTerminalExpression8116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_9_2());
                          
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


    // $ANTLR start "entryRuleTerminalOperator"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3820:1: entryRuleTerminalOperator returns [String current=null] : iv_ruleTerminalOperator= ruleTerminalOperator EOF ;
    public final String entryRuleTerminalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalOperator = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3821:2: (iv_ruleTerminalOperator= ruleTerminalOperator EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3822:2: iv_ruleTerminalOperator= ruleTerminalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8154);
            iv_ruleTerminalOperator=ruleTerminalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalOperator8165); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalOperator"


    // $ANTLR start "ruleTerminalOperator"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3829:1: ruleTerminalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' ) ;
    public final AntlrDatatypeRuleToken ruleTerminalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3832:28: ( (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3833:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3833:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' )
            int alt78=45;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt78=1;
                }
                break;
            case 60:
                {
                alt78=2;
                }
                break;
            case 61:
                {
                alt78=3;
                }
                break;
            case 62:
                {
                alt78=4;
                }
                break;
            case 63:
                {
                alt78=5;
                }
                break;
            case 64:
                {
                alt78=6;
                }
                break;
            case 65:
                {
                alt78=7;
                }
                break;
            case 66:
                {
                alt78=8;
                }
                break;
            case 67:
                {
                alt78=9;
                }
                break;
            case 68:
                {
                alt78=10;
                }
                break;
            case 69:
                {
                alt78=11;
                }
                break;
            case 70:
                {
                alt78=12;
                }
                break;
            case 71:
                {
                alt78=13;
                }
                break;
            case 72:
                {
                alt78=14;
                }
                break;
            case 73:
                {
                alt78=15;
                }
                break;
            case 74:
                {
                alt78=16;
                }
                break;
            case 75:
                {
                alt78=17;
                }
                break;
            case 76:
                {
                alt78=18;
                }
                break;
            case 77:
                {
                alt78=19;
                }
                break;
            case 78:
                {
                alt78=20;
                }
                break;
            case 79:
                {
                alt78=21;
                }
                break;
            case 80:
                {
                alt78=22;
                }
                break;
            case 81:
                {
                alt78=23;
                }
                break;
            case 82:
                {
                alt78=24;
                }
                break;
            case 83:
                {
                alt78=25;
                }
                break;
            case 84:
                {
                alt78=26;
                }
                break;
            case 85:
                {
                alt78=27;
                }
                break;
            case 42:
                {
                alt78=28;
                }
                break;
            case 86:
                {
                alt78=29;
                }
                break;
            case 87:
                {
                alt78=30;
                }
                break;
            case 88:
                {
                alt78=31;
                }
                break;
            case 89:
                {
                alt78=32;
                }
                break;
            case 90:
                {
                alt78=33;
                }
                break;
            case 91:
                {
                alt78=34;
                }
                break;
            case 92:
                {
                alt78=35;
                }
                break;
            case 21:
                {
                alt78=36;
                }
                break;
            case 93:
                {
                alt78=37;
                }
                break;
            case 94:
                {
                alt78=38;
                }
                break;
            case 95:
                {
                alt78=39;
                }
                break;
            case 96:
                {
                alt78=40;
                }
                break;
            case 97:
                {
                alt78=41;
                }
                break;
            case 98:
                {
                alt78=42;
                }
                break;
            case 99:
                {
                alt78=43;
                }
                break;
            case 26:
                {
                alt78=44;
                }
                break;
            case 100:
                {
                alt78=45;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3834:2: kw= '='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleTerminalOperator8203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:2: kw= '*='
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleTerminalOperator8222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3848:2: kw= '/='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleTerminalOperator8241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3855:2: kw= '%='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleTerminalOperator8260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3862:2: kw= '+='
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleTerminalOperator8279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3869:2: kw= '-='
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleTerminalOperator8298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3876:2: kw= '<<='
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleTerminalOperator8317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3883:2: kw= '>>='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleTerminalOperator8336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3890:2: kw= '>>>='
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleTerminalOperator8355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3897:2: kw= '&='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleTerminalOperator8374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandEqualsSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3904:2: kw= '^='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleTerminalOperator8393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentEqualsSignKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3911:2: kw= '|='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleTerminalOperator8412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineEqualsSignKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3918:2: kw= '?:'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleTerminalOperator8431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getQuestionMarkColonKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3925:2: kw= '||'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleTerminalOperator8450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineVerticalLineKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3932:2: kw= '&&'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleTerminalOperator8469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandAmpersandKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3939:2: kw= '|'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleTerminalOperator8488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3946:2: kw= '^'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleTerminalOperator8507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3953:2: kw= '&'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleTerminalOperator8526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3960:2: kw= '=='
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleTerminalOperator8545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3967:2: kw= '!='
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTerminalOperator8564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3974:2: kw= '==='
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleTerminalOperator8583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3981:2: kw= '!=='
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleTerminalOperator8602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3988:2: kw= '<'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleTerminalOperator8621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3995:2: kw= '>'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleTerminalOperator8640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4002:2: kw= '<='
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleTerminalOperator8659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignEqualsSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4009:2: kw= '>='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleTerminalOperator8678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignEqualsSignKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4016:2: kw= 'as'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTerminalOperator8697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4023:2: kw= 'in'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleTerminalOperator8716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4030:2: kw= 'instanceof'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTerminalOperator8735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInstanceofKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4037:2: kw= 'is'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleTerminalOperator8754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getIsKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4044:2: kw= '<<'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTerminalOperator8773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4051:2: kw= '>>'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleTerminalOperator8792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4058:2: kw= '>>>'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTerminalOperator8811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4065:2: kw= '+'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleTerminalOperator8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4072:2: kw= '-'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTerminalOperator8849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4079:2: kw= '*'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleTerminalOperator8868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4086:2: kw= '/'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleTerminalOperator8887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4093:2: kw= '%'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleTerminalOperator8906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignKeyword_37()); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4100:2: kw= '++'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleTerminalOperator8925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignPlusSignKeyword_38()); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4107:2: kw= '--'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleTerminalOperator8944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusHyphenMinusKeyword_39()); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4114:2: kw= '!'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleTerminalOperator8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkKeyword_40()); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4121:2: kw= '~'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTerminalOperator8982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTildeKeyword_41()); 
                          
                    }

                    }
                    break;
                case 43 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4128:2: kw= 'typeof'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTerminalOperator9001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTypeofKeyword_42()); 
                          
                    }

                    }
                    break;
                case 44 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4135:2: kw= '.'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTerminalOperator9020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getFullStopKeyword_43()); 
                          
                    }

                    }
                    break;
                case 45 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4142:2: kw= '::'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleTerminalOperator9039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getColonColonKeyword_44()); 
                          
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
    // $ANTLR end "ruleTerminalOperator"


    // $ANTLR start "ruleAccessLevel"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4155:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'internal' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4157:28: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'internal' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'internal' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'internal' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt79=1;
                }
                break;
            case 102:
                {
                alt79=2;
                }
                break;
            case 103:
                {
                alt79=3;
                }
                break;
            case 104:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:2: (enumLiteral_0= 'private' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:2: (enumLiteral_0= 'private' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleAccessLevel9093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4164:6: (enumLiteral_1= 'public' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4164:6: (enumLiteral_1= 'public' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4164:8: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleAccessLevel9110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4170:6: (enumLiteral_2= 'protected' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4170:6: (enumLiteral_2= 'protected' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4170:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_103_in_ruleAccessLevel9127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4176:6: (enumLiteral_3= 'internal' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4176:6: (enumLiteral_3= 'internal' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4176:8: enumLiteral_3= 'internal'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_104_in_ruleAccessLevel9144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_3()); 
                          
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

    // $ANTLR start synpred45_InternalAS3
    public final void synpred45_InternalAS3_fragment() throws RecognitionException {   
        EObject lv_param_4_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: ( (lv_param_4_0= ruleParameters ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1499:3: lv_param_4_0= ruleParameters
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameters_in_synpred45_InternalAS33217);
        lv_param_4_0=ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_InternalAS3

    // $ANTLR start synpred46_InternalAS3
    public final void synpred46_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1493:4: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1493:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,17,FOLLOW_17_in_synpred46_InternalAS33196); if (state.failed) return ;
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1497:1: ( (lv_param_4_0= ruleParameters ) )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==54) ) {
            alt84=1;
        }
        else if ( (LA84_0==18) ) {
            int LA84_2 = input.LA(2);

            if ( (synpred45_InternalAS3()) ) {
                alt84=1;
            }
        }
        switch (alt84) {
            case 1 :
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1498:1: (lv_param_4_0= ruleParameters )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1499:3: lv_param_4_0= ruleParameters
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleParameters_in_synpred46_InternalAS33217);
                lv_param_4_0=ruleParameters();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,18,FOLLOW_18_in_synpred46_InternalAS33230); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalAS3

    // $ANTLR start synpred69_InternalAS3
    public final void synpred69_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseBlock_6_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2626:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,50,FOLLOW_50_in_synpred69_InternalAS35508); if (state.failed) return ;

        }

        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2631:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2632:1: (lv_elseBlock_6_0= ruleIfBlock )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2632:1: (lv_elseBlock_6_0= ruleIfBlock )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2633:3: lv_elseBlock_6_0= ruleIfBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIfBlock_in_synpred69_InternalAS35530);
        lv_elseBlock_6_0=ruleIfBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred69_InternalAS3

    // $ANTLR start synpred80_InternalAS3
    public final void synpred80_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:2: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==54) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2957:3: ( (lv_elements_0_0= ruleParameter ) )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2958:1: (lv_elements_0_0= ruleParameter )
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2958:1: (lv_elements_0_0= ruleParameter )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2959:3: lv_elements_0_0= ruleParameter
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleParameter_in_synpred80_InternalAS36257);
                lv_elements_0_0=ruleParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2975:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==23) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2975:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                	    {
                	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_synpred80_InternalAS36270); if (state.failed) return ;
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2979:1: ( (lv_elements_2_0= ruleParameter ) )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2980:1: (lv_elements_2_0= ruleParameter )
                	    {
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2980:1: (lv_elements_2_0= ruleParameter )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2981:3: lv_elements_2_0= ruleParameter
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleParameter_in_synpred80_InternalAS36291);
                	    lv_elements_2_0=ruleParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred80_InternalAS3

    // Delegated rules

    public final boolean synpred80_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalAS3_fragment(); // can never throw exception
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
    public final boolean synpred45_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA34_eotS =
        "\115\uffff";
    static final String DFA34_eofS =
        "\1\2\114\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA34_maxS =
        "\1\150\1\0\113\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\5\uffff\2\2\3\uffff\1\1\3\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\10\uffff\3\2\1\uffff\12\2\3\uffff\62\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1493:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAS3()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\16\uffff";
    static final String DFA44_eofS =
        "\16\uffff";
    static final String DFA44_minS =
        "\1\47\1\21\1\4\1\21\1\4\1\17\1\uffff\1\4\1\17\2\uffff\1\4\1\uffff"+
        "\1\17";
    static final String DFA44_maxS =
        "\1\47\1\51\1\144\1\21\1\4\1\52\1\uffff\1\50\1\52\2\uffff\1\4\1\uffff"+
        "\1\52";
    static final String DFA44_acceptS =
        "\6\uffff\1\1\2\uffff\1\3\1\4\1\uffff\1\2\1\uffff";
    static final String DFA44_specialS =
        "\16\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1",
            "\1\2\27\uffff\1\3",
            "\1\5\2\6\10\uffff\1\6\1\uffff\1\6\3\uffff\2\6\1\uffff\1\6\1"+
            "\uffff\1\6\15\uffff\1\4\1\uffff\1\6\14\uffff\56\6",
            "\1\7",
            "\1\10",
            "\1\6\7\uffff\2\6\1\uffff\1\6\17\uffff\1\11",
            "",
            "\1\11\43\uffff\1\12",
            "\1\14\7\uffff\2\14\14\uffff\1\13\4\uffff\1\12",
            "",
            "",
            "\1\15",
            "",
            "\1\14\7\uffff\2\14\21\uffff\1\12"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1540:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_ruleModel178 = new BitSet(new long[]{0x0000000060000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModel199 = new BitSet(new long[]{0x0000000060000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage321 = new BitSet(new long[]{0x000000006811E000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleImports_in_rulePackage342 = new BitSet(new long[]{0x000000006811A000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruledirective_in_rulePackage363 = new BitSet(new long[]{0x000000006811A000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleClass_in_rulePackage387 = new BitSet(new long[]{0x0000000068002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePackage406 = new BitSet(new long[]{0x0000000068002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_13_in_rulePackage422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImports526 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport631 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledirective_in_entryRuledirective679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledirective689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruledirective739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledirective756 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruledirective774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleannotationFields_in_ruledirective795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledirective807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruledirective821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_ruledirective853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruledirective870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_entryRuleUses906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUses916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUses953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUses970 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUses997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUses1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUses1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationFields_in_entryRuleannotationFields1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationFields1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationField_in_ruleannotationFields1126 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleannotationFields1139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleannotationField_in_ruleannotationFields1160 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleannotationField_in_entryRuleannotationField1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationField1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleannotationField1250 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleannotationField1267 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleannotationField1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1383 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedNameWithWildcard1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1496 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName1515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1530 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleInterface1633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInterface1646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1663 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_28_in_ruleInterface1681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface1719 = new BitSet(new long[]{0x0000010720002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleInterface1740 = new BitSet(new long[]{0x0000010720002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_13_in_ruleInterface1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleClass1845 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleClass1859 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleClass1873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1890 = new BitSet(new long[]{0x0000000090001000L});
    public static final BitSet FOLLOW_28_in_ruleClass1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1932 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleClass1947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1971 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleClass1984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass2008 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleClass2024 = new BitSet(new long[]{0x0000010720002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass2045 = new BitSet(new long[]{0x0000010720002000L,0x000001E000000000L});
    public static final BitSet FOLLOW_13_in_ruleClass2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleMember2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMethod2261 = new BitSet(new long[]{0x0000000620000000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleMethod2284 = new BitSet(new long[]{0x0000000620000000L});
    public static final BitSet FOLLOW_33_in_ruleMethod2298 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_29_in_ruleMethod2313 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMethod2327 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_35_in_ruleMethod2340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleMethod2358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod2394 = new BitSet(new long[]{0x0040000000040010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2416 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleMethod2429 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2450 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleMethod2466 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_37_in_ruleMethod2479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2503 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_ruleMethodBody_in_ruleMethod2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodBody_in_entryRuleMethodBody2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodBody2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMethodBody2621 = new BitSet(new long[]{0xFF8B3DC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethodBody2642 = new BitSet(new long[]{0xFF8B3DC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleMethodBody2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleStatement2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement2812 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_ruleStatement2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_ruleStatement2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_ruleStatement3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleStatement3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_entryRuleNewStatement3100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewStatement3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNewStatement3159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewStatement3183 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNewStatement3196 = new BitSet(new long[]{0x0040000000040010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleNewStatement3217 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNewStatement3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleForStatement3316 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3328 = new BitSet(new long[]{0xFF80040005628070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3349 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3362 = new BitSet(new long[]{0xFF80040005628070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3383 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3396 = new BitSet(new long[]{0xFF80040005660070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3417 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleForStatement3471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3483 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleForStatement3495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3516 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleForStatement3529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3550 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3564 = new BitSet(new long[]{0xFF80040005628070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3598 = new BitSet(new long[]{0xFF80040005660070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3619 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3632 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleForStatement3673 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleForStatement3686 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement3717 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3734 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement3755 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3767 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleForStatement3808 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleForStatement3821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3835 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleForStatement3847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement3864 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleForStatement3890 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3903 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement3924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3936 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration3994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifierDeclaration4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifierDeclaration4046 = new BitSet(new long[]{0x0000002001000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration4072 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleidentifierDeclaration4086 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecommaExpr_in_entryRulecommaExpr4145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecommaExpr4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4201 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulecommaExpr4214 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4235 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileStatement4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDoWhileStatement4332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4353 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDoWhileStatement4365 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDoWhileStatement4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWhileStatement4493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement4514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleWhileStatement4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement4571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSwitchStatement4630 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement4651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSwitchStatement4663 = new BitSet(new long[]{0xFF8BFDC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement4684 = new BitSet(new long[]{0xFF8BFDC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleSwitchStatement4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr4733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparenthesizedExpr4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleparenthesizedExpr4780 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr4801 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleparenthesizedExpr4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch4849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatementInSwitch4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulestatementInSwitch4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulestatementInSwitch4927 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulestatementInSwitch4952 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulestatementInSwitch4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulestatementInSwitch4983 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulestatementInSwitch4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn5032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReturn5079 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturn5100 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReturn5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5204 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_ruleVariableDeclaration5218 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleVariableDeclaration5232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration5249 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVariableDeclaration5266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration5290 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleVariableDeclaration5303 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration5324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIfStatement5421 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIfStatement5433 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement5454 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfStatement5466 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement5487 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIfStatement5508 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_entryRuleTryStatement5568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryStatement5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTryStatement5615 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTryStatement5627 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement5648 = new BitSet(new long[]{0xFF8B3DC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleTryStatement5661 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTryStatement5674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTryStatement5686 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTryStatement5707 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTryStatement5719 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTryStatement5734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleTryStatement5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock5793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfBlock5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleIfBlock5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock5915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementsBlock5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatementsBlock5962 = new BitSet(new long[]{0xFF8B3DC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementsBlock5983 = new BitSet(new long[]{0xFF8B3DC025623070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleStatementsBlock5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter6034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleParameter6082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter6101 = new BitSet(new long[]{0x0000002001000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameter6127 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameter6141 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters6200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6257 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleParameters6270 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6291 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameters6337 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameters6372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters6391 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameters6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_entryRuletypeRelation6455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeRelation6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruletypeRelation6502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletypeRelation6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral6562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectLiteral6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleobjectLiteral6609 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectFields_in_ruleobjectLiteral6634 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleobjectLiteral6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectFields_in_entryRuleobjectFields6681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectFields6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields6737 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleobjectFields6750 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields6771 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleobjectField_in_entryRuleobjectField6809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectField6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleobjectField6856 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleobjectField6867 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleobjectField6910 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleobjectField6921 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleobjectField6964 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleobjectField6975 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment7256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_ruleAssignment7316 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAssignment7340 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression7399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression7459 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSelectionExpression7483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionExpression7507 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_17_in_ruleSelectionExpression7526 = new BitSet(new long[]{0xFF80040005660070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression7561 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleSelectionExpression7574 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression7595 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleSelectionExpression7611 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression7653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTerminalExpression7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTerminalExpression7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTerminalExpression7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTerminalExpression7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTerminalExpression7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminalExpression7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression8080 = new BitSet(new long[]{0xFF80040005620070L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression8105 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerminalExpression8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalOperator8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTerminalOperator8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTerminalOperator8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTerminalOperator8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTerminalOperator8260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTerminalOperator8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTerminalOperator8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTerminalOperator8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTerminalOperator8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTerminalOperator8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTerminalOperator8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTerminalOperator8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTerminalOperator8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTerminalOperator8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTerminalOperator8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTerminalOperator8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTerminalOperator8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTerminalOperator8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTerminalOperator8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTerminalOperator8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTerminalOperator8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTerminalOperator8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTerminalOperator8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTerminalOperator8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTerminalOperator8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTerminalOperator8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTerminalOperator8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTerminalOperator8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTerminalOperator8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTerminalOperator8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTerminalOperator8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTerminalOperator8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTerminalOperator8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTerminalOperator8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleTerminalOperator8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTerminalOperator8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTerminalOperator8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTerminalOperator8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTerminalOperator8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTerminalOperator8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTerminalOperator8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTerminalOperator8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTerminalOperator8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTerminalOperator9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTerminalOperator9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTerminalOperator9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleAccessLevel9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAccessLevel9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleAccessLevel9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAccessLevel9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_synpred45_InternalAS33217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred46_InternalAS33196 = new BitSet(new long[]{0x0040000000040010L});
    public static final BitSet FOLLOW_ruleParameters_in_synpred46_InternalAS33217 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred46_InternalAS33230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred69_InternalAS35508 = new BitSet(new long[]{0xFF8B3DC025621070L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_synpred69_InternalAS35530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred80_InternalAS36257 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_synpred80_InternalAS36270 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred80_InternalAS36291 = new BitSet(new long[]{0x0000000000800002L});

}