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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "';'", "'['", "'('", "')'", "']'", "'use'", "'namespace'", "'*'", "'void'", "','", "'='", "'.*'", "'.'", "'interface'", "'extends'", "'function'", "'get'", "'set'", "':'", "'final'", "'static'", "'dynamic'", "'class'", "'implements'", "'override'", "'native'", "'new'", "'for'", "'var'", "'each'", "'in'", "'do'", "'while'", "'switch'", "'case'", "'default'", "'return'", "'if'", "'else'", "'try'", "'catch'", "'finally'", "'const'", "'true'", "'false'", "'this'", "'super'", "'null'", "'undefined'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'?:'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'==='", "'!=='", "'<'", "'>'", "'<='", "'>='", "'as'", "'instanceof'", "'is'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'!'", "'~'", "'typeof'", "'::'", "'?'", "'internal'", "'private'", "'public'", "'protected'"
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
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:89:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) | ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imp_1_0 = null;

        EObject lv_classes_2_1 = null;

        EObject lv_classes_2_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:93:28: ( ( ( (lv_package_0_0= rulePackage ) ) | ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: ( ( (lv_package_0_0= rulePackage ) ) | ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:1: ( ( (lv_package_0_0= rulePackage ) ) | ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||(LA3_0>=13 && LA3_0<=16)||LA3_0==20||LA3_0==28||(LA3_0>=34 && LA3_0<=37)||(LA3_0>=106 && LA3_0<=109)) ) {
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:2: ( (lv_package_0_0= rulePackage ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:94:2: ( (lv_package_0_0= rulePackage ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:95:1: (lv_package_0_0= rulePackage )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:95:1: (lv_package_0_0= rulePackage )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:96:3: lv_package_0_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleModel147);
                    lv_package_0_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_0_0, 
                              		"Package");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:113:6: ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:113:6: ( ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )* )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:113:7: ( (lv_imp_1_0= ruleImports ) ) ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:113:7: ( (lv_imp_1_0= ruleImports ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:114:1: (lv_imp_1_0= ruleImports )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:114:1: (lv_imp_1_0= ruleImports )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:115:3: lv_imp_1_0= ruleImports
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getImpImportsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImports_in_ruleModel175);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:131:2: ( ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==28||(LA2_0>=34 && LA2_0<=37)||(LA2_0>=106 && LA2_0<=109)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:132:1: ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:132:1: ( (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:133:1: (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:133:1: (lv_classes_2_1= ruleClass | lv_classes_2_2= ruleInterface )
                    	    int alt1=2;
                    	    switch ( input.LA(1) ) {
                    	    case 106:
                    	        {
                    	        int LA1_1 = input.LA(2);

                    	        if ( (LA1_1==28) ) {
                    	            alt1=2;
                    	        }
                    	        else if ( ((LA1_1>=34 && LA1_1<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 1, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 107:
                    	        {
                    	        int LA1_2 = input.LA(2);

                    	        if ( (LA1_2==28) ) {
                    	            alt1=2;
                    	        }
                    	        else if ( ((LA1_2>=34 && LA1_2<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 1, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 108:
                    	        {
                    	        int LA1_3 = input.LA(2);

                    	        if ( (LA1_3==28) ) {
                    	            alt1=2;
                    	        }
                    	        else if ( ((LA1_3>=34 && LA1_3<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 1, 3, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 109:
                    	        {
                    	        int LA1_4 = input.LA(2);

                    	        if ( (LA1_4==28) ) {
                    	            alt1=2;
                    	        }
                    	        else if ( ((LA1_4>=34 && LA1_4<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 1, 4, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 34:
                    	    case 35:
                    	    case 36:
                    	    case 37:
                    	        {
                    	        alt1=1;
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        alt1=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 1, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:134:3: lv_classes_2_1= ruleClass
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleClass_in_ruleModel198);
                    	            lv_classes_2_1=ruleClass();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"classes",
                    	                      		lv_classes_2_1, 
                    	                      		"Class");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:149:8: lv_classes_2_2= ruleInterface
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getModelAccess().getClassesInterfaceParserRuleCall_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleInterface_in_ruleModel217);
                    	            lv_classes_2_2=ruleInterface();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"classes",
                    	                      		lv_classes_2_2, 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:178:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:179:2: (iv_rulePackage= rulePackage EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:180:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage262);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage272); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:187:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )? otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imp_3_0 = null;

        EObject lv_directives_4_0 = null;

        EObject lv_classes_5_1 = null;

        EObject lv_classes_5_2 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:190:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )? otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:191:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )? otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:191:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )? otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:191:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )? otherlv_2= '{' ( (lv_imp_3_0= ruleImports ) ) ( (lv_directives_4_0= ruledirective ) )* ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:195:1: ( (lv_name_1_0= ruleQualifiedName ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:196:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:196:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:197:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage330);
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
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:217:1: ( (lv_imp_3_0= ruleImports ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:218:1: (lv_imp_3_0= ruleImports )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:218:1: (lv_imp_3_0= ruleImports )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:219:3: lv_imp_3_0= ruleImports
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getImpImportsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImports_in_rulePackage364);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:235:2: ( (lv_directives_4_0= ruledirective ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:236:1: (lv_directives_4_0= ruledirective )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:236:1: (lv_directives_4_0= ruledirective )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:237:3: lv_directives_4_0= ruledirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getDirectivesDirectiveParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruledirective_in_rulePackage385);
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
            	    break loop5;
                }
            } while (true);

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:253:3: ( ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28||(LA7_0>=34 && LA7_0<=37)||(LA7_0>=106 && LA7_0<=109)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:254:1: ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:254:1: ( (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:255:1: (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:255:1: (lv_classes_5_1= ruleClass | lv_classes_5_2= ruleInterface )
            	    int alt6=2;
            	    switch ( input.LA(1) ) {
            	    case 106:
            	        {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==28) ) {
            	            alt6=2;
            	        }
            	        else if ( ((LA6_1>=34 && LA6_1<=37)) ) {
            	            alt6=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 107:
            	        {
            	        int LA6_2 = input.LA(2);

            	        if ( ((LA6_2>=34 && LA6_2<=37)) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_2==28) ) {
            	            alt6=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 108:
            	        {
            	        int LA6_3 = input.LA(2);

            	        if ( (LA6_3==28) ) {
            	            alt6=2;
            	        }
            	        else if ( ((LA6_3>=34 && LA6_3<=37)) ) {
            	            alt6=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 109:
            	        {
            	        int LA6_4 = input.LA(2);

            	        if ( (LA6_4==28) ) {
            	            alt6=2;
            	        }
            	        else if ( ((LA6_4>=34 && LA6_4<=37)) ) {
            	            alt6=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:256:3: lv_classes_5_1= ruleClass
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_5_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleClass_in_rulePackage409);
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
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:271:8: lv_classes_5_2= ruleInterface
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPackageAccess().getClassesInterfaceParserRuleCall_5_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInterface_in_rulePackage428);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePackage444); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:301:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:302:2: (iv_ruleImports= ruleImports EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:303:2: iv_ruleImports= ruleImports EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportsRule()); 
            }
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports480);
            iv_ruleImports=ruleImports();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImports; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports490); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:310:1: ruleImports returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:313:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:314:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:314:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:314:2: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:314:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:315:2: 
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:323:2: ( (lv_imports_1_0= ruleImport ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:324:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:324:1: (lv_imports_1_0= ruleImport )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:325:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleImports548);
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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:349:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:350:2: (iv_ruleImport= ruleImport EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:351:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport585);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport595); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:358:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:361:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:362:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:362:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:362:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:366:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:367:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:367:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:368:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport653);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport665); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:396:1: entryRuledirective returns [EObject current=null] : iv_ruledirective= ruledirective EOF ;
    public final EObject entryRuledirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledirective = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:397:2: (iv_ruledirective= ruledirective EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:398:2: iv_ruledirective= ruledirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_ruledirective_in_entryRuledirective701);
            iv_ruledirective=ruledirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirective; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledirective711); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:405:1: ruledirective returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:408:28: ( ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:1: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:1: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' ) | this_Uses_7= ruleUses | otherlv_8= ';' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:2: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:2: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:3: () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )? otherlv_6= ']'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:409:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:410:2: 
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

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruledirective761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:422:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:423:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:423:1: (lv_name_2_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:424:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledirective778); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:440:2: (otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:440:4: otherlv_3= '(' ( (lv_annonFields_4_0= ruleannotationFields ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruledirective796); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_0_3_0());
                                  
                            }
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:444:1: ( (lv_annonFields_4_0= ruleannotationFields ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:445:1: (lv_annonFields_4_0= ruleannotationFields )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:445:1: (lv_annonFields_4_0= ruleannotationFields )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:446:3: lv_annonFields_4_0= ruleannotationFields
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDirectiveAccess().getAnnonFieldsAnnotationFieldsParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleannotationFields_in_ruledirective817);
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

                            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruledirective829); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_0_3_2());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruledirective843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDirectiveAccess().getRightSquareBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:472:2: this_Uses_7= ruleUses
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDirectiveAccess().getUsesParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUses_in_ruledirective875);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:484:7: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruledirective892); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:496:1: entryRuleUses returns [EObject current=null] : iv_ruleUses= ruleUses EOF ;
    public final EObject entryRuleUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUses = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:497:2: (iv_ruleUses= ruleUses EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:498:2: iv_ruleUses= ruleUses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsesRule()); 
            }
            pushFollow(FOLLOW_ruleUses_in_entryRuleUses928);
            iv_ruleUses=ruleUses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUses; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUses938); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:505:1: ruleUses returns [EObject current=null] : (otherlv_0= 'use' otherlv_1= 'namespace' ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) ) ;
    public final EObject ruleUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:508:28: ( (otherlv_0= 'use' otherlv_1= 'namespace' ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:509:1: (otherlv_0= 'use' otherlv_1= 'namespace' ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:509:1: (otherlv_0= 'use' otherlv_1= 'namespace' ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:509:3: otherlv_0= 'use' otherlv_1= 'namespace' ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUses975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUsesAccess().getUseKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUses987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUsesAccess().getNamespaceKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:517:1: ( ( (lv_type_2_0= ruleQualifiedName ) ) | otherlv_3= '*' | otherlv_4= 'void' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:517:2: ( (lv_type_2_0= ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:517:2: ( (lv_type_2_0= ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:518:1: (lv_type_2_0= ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:518:1: (lv_type_2_0= ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:519:3: lv_type_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUsesAccess().getTypeQualifiedNameParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleUses1009);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:536:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleUses1027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUsesAccess().getAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:541:7: otherlv_4= 'void'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleUses1045); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:553:1: entryRuleannotationFields returns [EObject current=null] : iv_ruleannotationFields= ruleannotationFields EOF ;
    public final EObject entryRuleannotationFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleannotationFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:554:2: (iv_ruleannotationFields= ruleannotationFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:555:2: iv_ruleannotationFields= ruleannotationFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleannotationFields_in_entryRuleannotationFields1082);
            iv_ruleannotationFields=ruleannotationFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleannotationFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationFields1092); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:562:1: ruleannotationFields returns [EObject current=null] : ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* ) ;
    public final EObject ruleannotationFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_anoonFields_0_0 = null;

        EObject lv_annonFields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:565:28: ( ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:566:1: ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:566:1: ( ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:566:2: ( (lv_anoonFields_0_0= ruleannotationField ) ) (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:566:2: ( (lv_anoonFields_0_0= ruleannotationField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:567:1: (lv_anoonFields_0_0= ruleannotationField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:567:1: (lv_anoonFields_0_0= ruleannotationField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:568:3: lv_anoonFields_0_0= ruleannotationField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationFieldsAccess().getAnoonFieldsAnnotationFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleannotationField_in_ruleannotationFields1138);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:584:2: (otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:584:4: otherlv_1= ',' ( (lv_annonFields_2_0= ruleannotationField ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleannotationFields1151); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAnnotationFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:588:1: ( (lv_annonFields_2_0= ruleannotationField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:589:1: (lv_annonFields_2_0= ruleannotationField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:589:1: (lv_annonFields_2_0= ruleannotationField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:590:3: lv_annonFields_2_0= ruleannotationField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationFieldsAccess().getAnnonFieldsAnnotationFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleannotationField_in_ruleannotationFields1172);
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
    // $ANTLR end "ruleannotationFields"


    // $ANTLR start "entryRuleannotationField"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:614:1: entryRuleannotationField returns [EObject current=null] : iv_ruleannotationField= ruleannotationField EOF ;
    public final EObject entryRuleannotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleannotationField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:615:2: (iv_ruleannotationField= ruleannotationField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:616:2: iv_ruleannotationField= ruleannotationField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationFieldRule()); 
            }
            pushFollow(FOLLOW_ruleannotationField_in_entryRuleannotationField1210);
            iv_ruleannotationField=ruleannotationField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleannotationField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationField1220); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:623:1: ruleannotationField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleannotationField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:626:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:627:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:627:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:627:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:627:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:628:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:628:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:629:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleannotationField1262); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleannotationField1279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:649:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:650:1: (lv_expr_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:650:1: (lv_expr_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:651:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationFieldAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleannotationField1300);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:675:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:676:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:677:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1337);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1348); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:684:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:687:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:688:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:688:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:689:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1395);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:699:1: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:700:2: kw= '.*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedNameWithWildcard1414); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:713:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:714:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:715:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1457);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1468); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:722:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:725:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:726:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:726:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:726:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:733:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:734:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedName1527); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1542); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:754:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:755:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:756:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1589);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1599); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:763:1: ruleInterface returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleInterfaceMethod ) )* otherlv_7= '}' ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:766:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleInterfaceMethod ) )* otherlv_7= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:767:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleInterfaceMethod ) )* otherlv_7= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:767:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleInterfaceMethod ) )* otherlv_7= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:767:2: ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleInterfaceMethod ) )* otherlv_7= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:767:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=106 && LA15_0<=109)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:768:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:768:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:769:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleInterface1645);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInterface1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:789:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:790:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:790:1: (lv_name_2_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:791:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1675); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:807:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:807:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleInterface1693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:811:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:812:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:812:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:813:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getSuperclassInterfaceCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface1720);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInterface1734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:833:1: ( (lv_members_6_0= ruleInterfaceMethod ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30||(LA17_0>=106 && LA17_0<=109)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:834:1: (lv_members_6_0= ruleInterfaceMethod )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:834:1: (lv_members_6_0= ruleInterfaceMethod )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:835:3: lv_members_6_0= ruleInterfaceMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersInterfaceMethodParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceMethod_in_ruleInterface1755);
            	    lv_members_6_0=ruleInterfaceMethod();

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
            	              		"InterfaceMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInterface1768); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInterfaceMethod"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:863:1: entryRuleInterfaceMethod returns [EObject current=null] : iv_ruleInterfaceMethod= ruleInterfaceMethod EOF ;
    public final EObject entryRuleInterfaceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMethod = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:864:2: (iv_ruleInterfaceMethod= ruleInterfaceMethod EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:865:2: iv_ruleInterfaceMethod= ruleInterfaceMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceMethodRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceMethod_in_entryRuleInterfaceMethod1804);
            iv_ruleInterfaceMethod=ruleInterfaceMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMethod1814); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceMethod"


    // $ANTLR start "ruleInterfaceMethod"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:872:1: ruleInterfaceMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? (otherlv_14= ';' )? ) ;
    public final EObject ruleInterfaceMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:875:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? (otherlv_14= ';' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? (otherlv_14= ';' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? (otherlv_14= ';' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:2: ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? (otherlv_14= ';' )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=106 && LA18_0<=109)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:877:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:877:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:878:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleInterfaceMethod1860);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceMethodRule());
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleInterfaceMethod1873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceMethodAccess().getFunctionKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:898:1: (otherlv_2= 'get' | otherlv_3= 'set' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:898:3: otherlv_2= 'get'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleInterfaceMethod1886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInterfaceMethodAccess().getGetKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:903:7: otherlv_3= 'set'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleInterfaceMethod1904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterfaceMethodAccess().getSetKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:907:3: ( (lv_name_4_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:908:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:908:1: (lv_name_4_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:909:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceMethod1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getInterfaceMethodAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceMethod1940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceMethodAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:929:1: ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:929:2: ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:929:2: ( (lv_params_6_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:930:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:930:1: (lv_params_6_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:931:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getParamsParameterParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleInterfaceMethod1962);
                    lv_params_6_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceMethodRule());
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:947:2: (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:947:4: otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleInterfaceMethod1975); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getInterfaceMethodAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:951:1: ( (lv_params_8_0= ruleParameter ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:952:1: (lv_params_8_0= ruleParameter )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:952:1: (lv_params_8_0= ruleParameter )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:953:3: lv_params_8_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleInterfaceMethod1996);
                    	    lv_params_8_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterfaceMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_8_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleInterfaceMethod2012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getInterfaceMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:1: (otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:3: otherlv_10= ':' (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleInterfaceMethod2025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInterfaceMethodAccess().getColonKeyword_7_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:977:1: (otherlv_11= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
                    int alt22=3;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==23) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        int LA22_2 = input.LA(2);

                        if ( (synpred26_InternalAS3()) ) {
                            alt22=2;
                        }
                        else if ( (true) ) {
                            alt22=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:977:3: otherlv_11= 'void'
                            {
                            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleInterfaceMethod2038); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInterfaceMethodAccess().getVoidKeyword_7_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:982:6: ( ( ruleQualifiedName ) )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:982:6: ( ( ruleQualifiedName ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:983:1: ( ruleQualifiedName )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:983:1: ( ruleQualifiedName )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:984:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getInterfaceMethodRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getTypeInterfaceCrossReference_7_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceMethod2071);
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
                        case 3 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1001:6: ( ( ruleQualifiedName ) )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1001:6: ( ( ruleQualifiedName ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1002:1: ( ruleQualifiedName )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1002:1: ( ruleQualifiedName )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1003:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getInterfaceMethodRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getTypeClassCrossReference_7_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceMethod2104);
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


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1019:5: (otherlv_14= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1019:7: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceMethod2120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getInterfaceMethodAccess().getSemicolonKeyword_8());
                          
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
    // $ANTLR end "ruleInterfaceMethod"


    // $ANTLR start "entryRuleClass"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1031:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1032:2: (iv_ruleClass= ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1033:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass2158);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass2168); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1040:1: ruleClass returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_members_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1043:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1044:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1044:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1044:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1044:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=106 && LA25_0<=109)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1045:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1045:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1046:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleClass2214);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1062:3: (otherlv_1= 'final' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1062:5: otherlv_1= 'final'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleClass2228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getFinalKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1066:3: (otherlv_2= 'static' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1066:5: otherlv_2= 'static'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleClass2243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getStaticKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1070:3: (otherlv_3= 'dynamic' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1070:5: otherlv_3= 'dynamic'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleClass2258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getDynamicKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleClass2272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getClassKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1078:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1079:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1079:1: (lv_name_5_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1080:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass2289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1096:2: (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1096:4: otherlv_6= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleClass2307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1100:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1101:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1101:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1102:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeClassCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2334);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1118:4: (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1118:6: otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleClass2349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getImplementsKeyword_7_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1122:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1123:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1123:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1124:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getTypesInterfaceCrossReference_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2376);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1140:2: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==24) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1140:4: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleClass2389); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1144:1: ( ( ruleQualifiedName ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1145:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1145:1: ( ruleQualifiedName )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1146:3: ruleQualifiedName
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
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTypesInterfaceCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2416);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleClass2432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1166:1: ( (lv_members_13_0= ruleMember ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30||LA32_0==35||(LA32_0>=39 && LA32_0<=40)||LA32_0==43||(LA32_0>=106 && LA32_0<=109)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1167:1: (lv_members_13_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1167:1: (lv_members_13_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1168:3: lv_members_13_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass2453);
            	    lv_members_13_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_13_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleClass2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_10());
                  
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1196:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1197:2: (iv_ruleMember= ruleMember EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1198:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2502);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2512); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1205:1: ruleMember returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_meth_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1208:28: ( ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1209:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1209:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case 106:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5==30) ) {
                        alt33=2;
                    }
                    else if ( (LA33_5==43) ) {
                        alt33=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt33=1;
                    }
                    break;
                case 30:
                case 40:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

                }
                break;
            case 107:
                {
                switch ( input.LA(2) ) {
                case 30:
                case 40:
                    {
                    alt33=2;
                    }
                    break;
                case 35:
                    {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5==30) ) {
                        alt33=2;
                    }
                    else if ( (LA33_5==43) ) {
                        alt33=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt33=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }

                }
                break;
            case 108:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5==30) ) {
                        alt33=2;
                    }
                    else if ( (LA33_5==43) ) {
                        alt33=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt33=1;
                    }
                    break;
                case 30:
                case 40:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }

                }
                break;
            case 109:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5==30) ) {
                        alt33=2;
                    }
                    else if ( (LA33_5==43) ) {
                        alt33=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt33=1;
                    }
                    break;
                case 30:
                case 40:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                int LA33_5 = input.LA(2);

                if ( (LA33_5==30) ) {
                    alt33=2;
                }
                else if ( (LA33_5==43) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt33=1;
                }
                break;
            case 30:
            case 39:
            case 40:
                {
                alt33=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1209:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1209:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1210:1: (lv_var_0_0= ruleVariableDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1210:1: (lv_var_0_0= ruleVariableDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1211:3: lv_var_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleMember2558);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1228:6: ( (lv_meth_1_0= ruleMethod ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1228:6: ( (lv_meth_1_0= ruleMethod ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1229:1: (lv_meth_1_0= ruleMethod )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1229:1: (lv_meth_1_0= ruleMethod )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1230:3: lv_meth_1_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getMethMethodParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember2585);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1254:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1255:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1256:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2621);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2631); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1263:1: ruleMethod returns [EObject current=null] : ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' ) ) ;
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
        Token otherlv_18=null;
        Enumerator lv_access_1_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_body_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1266:28: ( ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1267:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1267:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1267:2: (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )? ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1267:2: (otherlv_0= 'override' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1267:4: otherlv_0= 'override'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMethod2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getOverrideKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1271:3: ( (lv_access_1_0= ruleAccessLevel ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=106 && LA35_0<=109)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1272:1: (lv_access_1_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1272:1: (lv_access_1_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1273:3: lv_access_1_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleMethod2692);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1289:3: (otherlv_2= 'native' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1289:5: otherlv_2= 'native'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleMethod2706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getNativeKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1293:3: (otherlv_3= 'static' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1293:5: otherlv_3= 'static'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleMethod2721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getStaticKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleMethod2735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getFunctionKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1301:1: (otherlv_5= 'get' | otherlv_6= 'set' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1301:3: otherlv_5= 'get'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleMethod2748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getGetKeyword_5_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1306:7: otherlv_6= 'set'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleMethod2766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getSetKeyword_5_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1310:3: ( (lv_name_7_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1311:1: (lv_name_7_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1311:1: (lv_name_7_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1312:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2785); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleMethod2802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1332:1: ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1332:2: ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1332:2: ( (lv_params_9_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1333:1: (lv_params_9_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1333:1: (lv_params_9_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1334:3: lv_params_9_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2824);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1350:2: (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==24) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1350:4: otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleMethod2837); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1354:1: ( (lv_params_11_0= ruleParameter ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1355:1: (lv_params_11_0= ruleParameter )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1355:1: (lv_params_11_0= ruleParameter )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1356:3: lv_params_11_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2858);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMethod2874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightParenthesisKeyword_9());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1376:1: (otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1376:3: otherlv_13= ':' (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleMethod2887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getColonKeyword_10_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1380:1: (otherlv_14= 'void' | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
                    int alt41=3;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==23) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_ID) ) {
                        int LA41_2 = input.LA(2);

                        if ( (synpred47_InternalAS3()) ) {
                            alt41=2;
                        }
                        else if ( (true) ) {
                            alt41=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1380:3: otherlv_14= 'void'
                            {
                            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleMethod2900); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getVoidKeyword_10_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1385:6: ( ( ruleQualifiedName ) )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1385:6: ( ( ruleQualifiedName ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1386:1: ( ruleQualifiedName )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1386:1: ( ruleQualifiedName )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1387:3: ruleQualifiedName
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
                               
                              	        newCompositeNode(grammarAccess.getMethodAccess().getTypeInterfaceCrossReference_10_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod2933);
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
                        case 3 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1404:6: ( ( ruleQualifiedName ) )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1404:6: ( ( ruleQualifiedName ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1405:1: ( ruleQualifiedName )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1405:1: ( ruleQualifiedName )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1406:3: ruleQualifiedName
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
                               
                              	        newCompositeNode(grammarAccess.getMethodAccess().getTypeClassCrossReference_10_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod2966);
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


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1422:5: ( ( (lv_body_17_0= ruleMethodBody ) ) | otherlv_18= ';' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            else if ( (LA43_0==15) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1422:6: ( (lv_body_17_0= ruleMethodBody ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1422:6: ( (lv_body_17_0= ruleMethodBody ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1423:1: (lv_body_17_0= ruleMethodBody )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1423:1: (lv_body_17_0= ruleMethodBody )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1424:3: lv_body_17_0= ruleMethodBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodBody_in_ruleMethod2991);
                    lv_body_17_0=ruleMethodBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_17_0, 
                              		"MethodBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1441:7: otherlv_18= ';'
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleMethod3009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getMethodAccess().getSemicolonKeyword_11_1());
                          
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodBody"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1453:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1454:2: (iv_ruleMethodBody= ruleMethodBody EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1455:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMethodBody_in_entryRuleMethodBody3046);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodBody3056); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1462:1: ruleMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1465:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1466:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1466:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1466:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1466:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1467:2: 
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMethodBody3105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1479:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==12||LA44_0==17||LA44_0==22||LA44_0==25||LA44_0==27||LA44_0==33||LA44_0==35||(LA44_0>=41 && LA44_0<=43)||(LA44_0>=45 && LA44_0<=48)||(LA44_0>=51 && LA44_0<=52)||LA44_0==54||(LA44_0>=58 && LA44_0<=109)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1480:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1480:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1481:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodBodyAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethodBody3126);
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
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMethodBody3139); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1509:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1510:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1511:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3175);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3185); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1518:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_11=null;
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

        EObject this_objectLiteral_12 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1521:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1522:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1522:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral )
            int alt45=11;
            switch ( input.LA(1) ) {
            case 35:
            case 43:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt45=1;
                }
                break;
            case 51:
                {
                alt45=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 17:
            case 22:
            case 25:
            case 27:
            case 33:
            case 45:
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
            case 105:
                {
                alt45=3;
                }
                break;
            case 52:
                {
                alt45=4;
                }
                break;
            case 48:
                {
                alt45=5;
                }
                break;
            case 54:
                {
                alt45=6;
                }
                break;
            case 47:
                {
                alt45=7;
                }
                break;
            case 46:
                {
                alt45=8;
                }
                break;
            case 42:
                {
                alt45=9;
                }
                break;
            case 41:
                {
                alt45=10;
                }
                break;
            case 12:
                {
                alt45=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1523:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement3235);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1536:2: this_Return_1= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleStatement3265);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1548:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1548:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1549:2: this_Expression_2= ruleExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement3296);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStatement3307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1566:2: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement3339);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1579:2: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement3369);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1592:2: this_TryStatement_6= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTryStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryStatement_in_ruleStatement3399);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1605:2: this_WhileStatement_7= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement3429);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1618:2: this_DoWhileStatement_8= ruleDoWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoWhileStatement_in_ruleStatement3459);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1631:2: this_ForStatement_9= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement3489);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1643:6: (this_NewStatement_10= ruleNewStatement otherlv_11= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1643:6: (this_NewStatement_10= ruleNewStatement otherlv_11= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1644:2: this_NewStatement_10= ruleNewStatement otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getNewStatementParserRuleCall_9_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewStatement_in_ruleStatement3520);
                    this_NewStatement_10=ruleNewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewStatement_10; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleStatement3531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1661:2: this_objectLiteral_12= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getObjectLiteralParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleStatement3563);
                    this_objectLiteral_12=ruleobjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_objectLiteral_12; 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1680:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:2: (iv_ruleNewStatement= ruleNewStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1682:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleNewStatement_in_entryRuleNewStatement3598);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewStatement3608); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1689:1: ruleNewStatement returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1692:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1693:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1693:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1693:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1693:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1694:2: 
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleNewStatement3657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewStatementAccess().getNewKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1706:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1707:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1707:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1708:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewStatement3684);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1724:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1724:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNewStatement3697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1728:1: ( (lv_param_4_0= ruleParameters ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID||LA46_0==57) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==18) ) {
                        int LA46_2 = input.LA(2);

                        if ( (synpred61_InternalAS3()) ) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: (lv_param_4_0= ruleParameters )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: (lv_param_4_0= ruleParameters )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1730:3: lv_param_4_0= ruleParameters
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameters_in_ruleNewStatement3718);
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

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNewStatement3731); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1758:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1759:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1760:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement3769);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement3779); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1767:1: ruleForStatement returns [EObject current=null] : ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1770:28: ( ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1771:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1771:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1771:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1771:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1771:4: otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) )
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1779:1: ( (lv_forinit_2_0= rulecommaExpr ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==17||LA48_0==22||LA48_0==25||LA48_0==27||LA48_0==33||LA48_0==45||(LA48_0>=58 && LA48_0<=105)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1780:1: (lv_forinit_2_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1780:1: (lv_forinit_2_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1781:3: lv_forinit_2_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getForinitCommaExprParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3850);
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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1801:1: ( (lv_condition_4_0= rulecommaExpr ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==17||LA49_0==22||LA49_0==25||LA49_0==27||LA49_0==33||LA49_0==45||(LA49_0>=58 && LA49_0<=105)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1802:1: (lv_condition_4_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1802:1: (lv_condition_4_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1803:3: lv_condition_4_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_0_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3884);
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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1823:1: ( (lv_iterator_6_0= rulecommaExpr ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==17||LA50_0==22||LA50_0==25||LA50_0==27||LA50_0==33||LA50_0==45||(LA50_0>=58 && LA50_0<=105)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1824:1: (lv_iterator_6_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1824:1: (lv_iterator_6_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1825:3: lv_iterator_6_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_0_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3918);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_0_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1845:1: ( (lv_command_8_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1846:1: (lv_command_8_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1846:1: (lv_command_8_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1847:3: lv_command_8_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_0_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3952);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1864:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1864:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1864:8: otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getForKeyword_1_0());
                          
                    }
                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleForStatement3996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getForStatementAccess().getVarKeyword_1_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1876:1: ( (lv_elements_12_0= ruleidentifierDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1877:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1878:3: lv_elements_12_0= ruleidentifierDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement4017);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1894:2: (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==24) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1894:4: otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleForStatement4030); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getForStatementAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1898:1: ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1899:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1899:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1900:3: lv_elements_14_0= ruleidentifierDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement4051);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleForStatement4065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1920:1: ( (lv_condition_16_0= rulecommaExpr ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==17||LA52_0==22||LA52_0==25||LA52_0==27||LA52_0==33||LA52_0==45||(LA52_0>=58 && LA52_0<=105)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1921:1: (lv_condition_16_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1921:1: (lv_condition_16_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1922:3: lv_condition_16_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement4086);
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

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleForStatement4099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1942:1: ( (lv_iterator_18_0= rulecommaExpr ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_INT)||LA53_0==17||LA53_0==22||LA53_0==25||LA53_0==27||LA53_0==33||LA53_0==45||(LA53_0>=58 && LA53_0<=105)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1943:1: (lv_iterator_18_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1943:1: (lv_iterator_18_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1944:3: lv_iterator_18_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_1_8_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement4120);
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

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_1_9());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1964:1: ( (lv_command_20_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1965:1: (lv_command_20_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1965:1: (lv_command_20_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1966:3: lv_command_20_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_1_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4154);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1983:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1983:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1983:8: otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    {
                    otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleForStatement4174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getForStatementAccess().getForKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1987:1: (otherlv_22= 'each' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==44) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1987:3: otherlv_22= 'each'
                            {
                            otherlv_22=(Token)match(input,44,FOLLOW_44_in_ruleForStatement4187); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getForStatementAccess().getEachKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleForStatement4201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1995:1: ( (lv_nameForin_24_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1996:1: (lv_nameForin_24_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1996:1: (lv_nameForin_24_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1997:3: lv_nameForin_24_0= RULE_ID
                    {
                    lv_nameForin_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement4218); if (state.failed) return current;
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

                    otherlv_25=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getForStatementAccess().getInKeyword_2_4());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2017:1: ( (lv_forinexpr_26_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2018:1: (lv_forinexpr_26_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2018:1: (lv_forinexpr_26_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2019:3: lv_forinexpr_26_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForinexprExpressionParserRuleCall_2_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4256);
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

                    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_2_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2039:1: ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2040:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2040:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2041:3: lv_forcommand_28_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForcommandStatementsBlockParserRuleCall_2_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4289);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2058:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2058:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2058:8: otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    {
                    otherlv_29=(Token)match(input,42,FOLLOW_42_in_ruleForStatement4309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getForStatementAccess().getForKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2062:1: (otherlv_30= 'each' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==44) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2062:3: otherlv_30= 'each'
                            {
                            otherlv_30=(Token)match(input,44,FOLLOW_44_in_ruleForStatement4322); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getForStatementAccess().getEachKeyword_3_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleForStatement4336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_32=(Token)match(input,43,FOLLOW_43_in_ruleForStatement4348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getForStatementAccess().getVarKeyword_3_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2074:1: ( (lv_nameForeachh_33_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2075:1: (lv_nameForeachh_33_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2075:1: (lv_nameForeachh_33_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2076:3: lv_nameForeachh_33_0= RULE_ID
                    {
                    lv_nameForeachh_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement4365); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2092:2: ( (lv_relation_34_0= ruletypeRelation ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==33) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2093:1: (lv_relation_34_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2093:1: (lv_relation_34_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2094:3: lv_relation_34_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getRelationTypeRelationParserRuleCall_3_5_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleForStatement4391);
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

                    otherlv_35=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getForStatementAccess().getInKeyword_3_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2114:1: ( (lv_foreachexpr_36_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2115:1: (lv_foreachexpr_36_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2115:1: (lv_foreachexpr_36_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2116:3: lv_foreachexpr_36_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachexprExpressionParserRuleCall_3_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4425);
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

                    otherlv_37=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3_8());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2136:1: ( (lv_foreachcommand_38_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2137:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2137:1: (lv_foreachcommand_38_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2138:3: lv_foreachcommand_38_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachcommandStatementsBlockParserRuleCall_3_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4458);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2162:1: entryRuleidentifierDeclaration returns [EObject current=null] : iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF ;
    public final EObject entryRuleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2163:2: (iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2164:2: iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration4495);
            iv_ruleidentifierDeclaration=ruleidentifierDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifierDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifierDeclaration4505); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2171:1: ruleidentifierDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_relation_1_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2174:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_relation_1_0= ruletypeRelation ) )? (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2177:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifierDeclaration4547); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2193:2: ( (lv_relation_1_0= ruletypeRelation ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==33) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2194:1: (lv_relation_1_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2194:1: (lv_relation_1_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2195:3: lv_relation_1_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getRelationTypeRelationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration4573);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2211:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2211:5: otherlv_2= '=' ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleidentifierDeclaration4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIdentifierDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2215:1: ( (lv_expr_3_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2216:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2216:1: (lv_expr_3_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2217:3: lv_expr_3_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getExprExprOrObjectLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4608);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2241:1: entryRulecommaExpr returns [EObject current=null] : iv_rulecommaExpr= rulecommaExpr EOF ;
    public final EObject entryRulecommaExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecommaExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2242:2: (iv_rulecommaExpr= rulecommaExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2243:2: iv_rulecommaExpr= rulecommaExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaExprRule()); 
            }
            pushFollow(FOLLOW_rulecommaExpr_in_entryRulecommaExpr4646);
            iv_rulecommaExpr=rulecommaExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommaExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecommaExpr4656); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2250:1: rulecommaExpr returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulecommaExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2253:28: ( ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2254:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2254:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2254:2: ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2254:2: ( (lv_elements_0_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2255:1: (lv_elements_0_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2255:1: (lv_elements_0_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2256:3: lv_elements_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4702);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2272:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==24) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2272:4: otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulecommaExpr4715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommaExprAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2276:1: ( (lv_elements_2_0= ruleExpression ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2277:1: (lv_elements_2_0= ruleExpression )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2277:1: (lv_elements_2_0= ruleExpression )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2278:3: lv_elements_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4736);
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
            	    break loop60;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2302:1: entryRuleDoWhileStatement returns [EObject current=null] : iv_ruleDoWhileStatement= ruleDoWhileStatement EOF ;
    public final EObject entryRuleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2303:2: (iv_ruleDoWhileStatement= ruleDoWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2304:2: iv_ruleDoWhileStatement= ruleDoWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4774);
            iv_ruleDoWhileStatement=ruleDoWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhileStatement4784); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2311:1: ruleDoWhileStatement returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whileBlock_2_0 = null;

        EObject lv_cond_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2314:28: ( ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:2: () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2315:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2316:2: 
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleDoWhileStatement4833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoWhileStatementAccess().getDoKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2328:1: ( (lv_whileBlock_2_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2329:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2329:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2330:3: lv_whileBlock_2_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4854);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleDoWhileStatement4866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileStatementAccess().getWhileKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2350:1: ( (lv_cond_4_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2351:1: (lv_cond_4_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2351:1: (lv_cond_4_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2352:3: lv_cond_4_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getCondParenthesizedExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4887);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDoWhileStatement4899); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2380:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2381:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2382:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4935);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement4945); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2389:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cond_2_0 = null;

        EObject lv_whileBlock_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2392:28: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2393:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2393:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2393:2: () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2393:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2394:2: 
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

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleWhileStatement4994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2406:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2407:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2407:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2408:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement5015);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2424:2: ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2425:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2425:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2426:3: lv_whileBlock_3_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleWhileStatement5036);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2450:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2451:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2452:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5072);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement5082); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2459:1: ruleSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cases_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2462:28: ( ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2463:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2463:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2463:2: () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2463:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2464:2: 
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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleSwitchStatement5131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2476:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2477:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2477:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2478:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement5152);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSwitchStatement5164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2498:1: ( (lv_cases_4_0= rulestatementInSwitch ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_INT)||LA61_0==12||LA61_0==17||LA61_0==22||LA61_0==25||LA61_0==27||LA61_0==33||LA61_0==35||(LA61_0>=41 && LA61_0<=43)||(LA61_0>=45 && LA61_0<=52)||LA61_0==54||(LA61_0>=58 && LA61_0<=109)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:1: (lv_cases_4_0= rulestatementInSwitch )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2499:1: (lv_cases_4_0= rulestatementInSwitch )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2500:3: lv_cases_4_0= rulestatementInSwitch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesStatementInSwitchParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement5185);
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
            	    break loop61;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSwitchStatement5198); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2528:1: entryRuleparenthesizedExpr returns [EObject current=null] : iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF ;
    public final EObject entryRuleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparenthesizedExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2529:2: (iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2530:2: iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr5234);
            iv_ruleparenthesizedExpr=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparenthesizedExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparenthesizedExpr5244); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2537:1: ruleparenthesizedExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) ;
    public final EObject ruleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2540:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2541:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2541:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2541:3: otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleparenthesizedExpr5281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2545:1: ( (lv_expression_1_0= ruleexprOrObjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2546:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2546:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2547:3: lv_expression_1_0= ruleexprOrObjectLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExpressionExprOrObjectLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr5302);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleparenthesizedExpr5314); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2575:1: entryRulestatementInSwitch returns [EObject current=null] : iv_rulestatementInSwitch= rulestatementInSwitch EOF ;
    public final EObject entryRulestatementInSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatementInSwitch = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2576:2: (iv_rulestatementInSwitch= rulestatementInSwitch EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2577:2: iv_rulestatementInSwitch= rulestatementInSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementInSwitchRule()); 
            }
            pushFollow(FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch5350);
            iv_rulestatementInSwitch=rulestatementInSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementInSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatementInSwitch5360); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2584:1: rulestatementInSwitch returns [EObject current=null] : (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2587:28: ( (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2588:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2588:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 17:
            case 22:
            case 25:
            case 27:
            case 33:
            case 35:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 51:
            case 52:
            case 54:
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
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt62=1;
                }
                break;
            case 49:
                {
                alt62=2;
                }
                break;
            case 50:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2589:2: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_rulestatementInSwitch5410);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2601:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2601:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2601:8: otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_rulestatementInSwitch5428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementInSwitchAccess().getCaseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulestatementInSwitch5453);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulestatementInSwitch5464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementInSwitchAccess().getColonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2622:6: (otherlv_4= 'default' otherlv_5= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2622:6: (otherlv_4= 'default' otherlv_5= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2622:8: otherlv_4= 'default' otherlv_5= ':'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_rulestatementInSwitch5484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatementInSwitchAccess().getDefaultKeyword_2_0());
                          
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulestatementInSwitch5496); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2638:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2639:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2640:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn5533);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn5543); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2647:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2650:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2651:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2651:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2651:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleReturn5580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2655:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2656:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2656:1: (lv_expression_1_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2657:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturn5601);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleReturn5613); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2685:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2686:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2687:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5649);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration5659); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2694:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2697:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2698:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2698:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2698:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2698:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=106 && LA63_0<=109)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2699:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2699:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2700:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5705);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2716:3: (otherlv_1= 'static' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==35) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2716:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleVariableDeclaration5719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleVariableDeclaration5733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getVarKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2725:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2725:1: (lv_name_3_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2726:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration5750); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDeclaration5767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getColonKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2746:1: ( (lv_type_5_0= ruleVarType ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2747:1: (lv_type_5_0= ruleVarType )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2747:1: (lv_type_5_0= ruleVarType )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2748:3: lv_type_5_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVarTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleVariableDeclaration5788);
            lv_type_5_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_5_0, 
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2764:2: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2764:4: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleVariableDeclaration5801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2768:1: ( (lv_expression_7_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2769:1: (lv_expression_7_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2769:1: (lv_expression_7_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2770:3: lv_expression_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration5822);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration5836); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVarType"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2798:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2799:2: (iv_ruleVarType= ruleVarType EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2800:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVarType_in_entryRuleVarType5872);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarType5882); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2807:1: ruleVarType returns [EObject current=null] : ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2810:28: ( ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2811:1: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2811:1: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt66=1;
                }
                break;
            case 22:
                {
                alt66=2;
                }
                break;
            case RULE_ID:
                {
                int LA66_3 = input.LA(2);

                if ( (synpred86_InternalAS3()) ) {
                    alt66=3;
                }
                else if ( (true) ) {
                    alt66=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2811:2: ( (lv_name_0_0= 'void' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2811:2: ( (lv_name_0_0= 'void' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2812:1: (lv_name_0_0= 'void' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2812:1: (lv_name_0_0= 'void' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2813:3: lv_name_0_0= 'void'
                    {
                    lv_name_0_0=(Token)match(input,23,FOLLOW_23_in_ruleVarType5925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getVarTypeAccess().getNameVoidKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarTypeRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "void");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2827:6: ( (lv_name_1_0= '*' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2827:6: ( (lv_name_1_0= '*' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2828:1: (lv_name_1_0= '*' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2828:1: (lv_name_1_0= '*' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2829:3: lv_name_1_0= '*'
                    {
                    lv_name_1_0=(Token)match(input,22,FOLLOW_22_in_ruleVarType5962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getVarTypeAccess().getNameAsteriskKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarTypeRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2843:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2843:6: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2844:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2844:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2845:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarTypeAccess().getTypeInterfaceCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarType6008);
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
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2862:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2862:6: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2863:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2863:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2864:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarTypeAccess().getTypeClassCrossReference_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarType6041);
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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleIfStatement"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2888:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2889:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2890:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement6077);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement6087); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2897:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2900:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2901:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2901:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2901:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleIfStatement6124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIfStatement6136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2910:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2910:1: (lv_expression_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2911:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement6157);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIfStatement6169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2931:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2932:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2932:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2933:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement6190);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred88_InternalAS3()) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleIfStatement6211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2954:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2955:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2955:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2956:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement6233);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2980:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2981:2: (iv_ruleTryStatement= ruleTryStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2982:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTryStatement_in_entryRuleTryStatement6271);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryStatement6281); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2989:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2992:28: ( (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2993:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2993:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2993:3: otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleTryStatement6318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTryStatement6330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTryStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3001:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||LA68_0==12||LA68_0==17||LA68_0==22||LA68_0==25||LA68_0==27||LA68_0==33||LA68_0==35||(LA68_0>=41 && LA68_0<=43)||(LA68_0>=45 && LA68_0<=48)||(LA68_0>=51 && LA68_0<=52)||LA68_0==54||(LA68_0>=58 && LA68_0<=109)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3002:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3002:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3003:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement6351);
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
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTryStatement6364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTryStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3023:1: (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==55) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3023:3: otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleTryStatement6377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTryStatementAccess().getCatchKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTryStatement6389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTryStatementAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3031:1: ( (lv_params_6_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3032:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3032:1: (lv_params_6_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3033:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamsParameterParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleTryStatement6410);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTryStatement6422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTryStatementAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3053:3: (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==56) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3053:5: otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_56_in_ruleTryStatement6437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTryStatementAccess().getFinallyKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3057:1: ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3058:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3058:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3059:3: lv_finallyBlock_9_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinallyBlockStatementsBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleTryStatement6458);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3083:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3084:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3085:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock6496);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock6506); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3092:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_StatementsBlock_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3095:28: ( ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_INT)||LA71_0==17||LA71_0==22||LA71_0==25||LA71_0==27||LA71_0==33||LA71_0==35||(LA71_0>=41 && LA71_0<=43)||(LA71_0>=45 && LA71_0<=48)||(LA71_0>=51 && LA71_0<=52)||LA71_0==54||(LA71_0>=58 && LA71_0<=109)) ) {
                alt71=1;
            }
            else if ( (LA71_0==12) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA71_3 = input.LA(3);

                    if ( (LA71_3==33) ) {
                        alt71=1;
                    }
                    else if ( (LA71_3==15||LA71_3==25||LA71_3==27) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA71_4 = input.LA(3);

                    if ( (LA71_4==15||LA71_4==25||LA71_4==27) ) {
                        alt71=2;
                    }
                    else if ( (LA71_4==33) ) {
                        alt71=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA71_5 = input.LA(3);

                    if ( (LA71_5==15||LA71_5==25||LA71_5==27) ) {
                        alt71=2;
                    }
                    else if ( (LA71_5==33) ) {
                        alt71=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                case 13:
                case 17:
                case 22:
                case 25:
                case 27:
                case 33:
                case 35:
                case 41:
                case 42:
                case 43:
                case 45:
                case 46:
                case 47:
                case 48:
                case 51:
                case 52:
                case 54:
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
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                    {
                    alt71=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:2: ( (lv_statements_0_0= ruleStatement ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:2: ( (lv_statements_0_0= ruleStatement ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3097:1: (lv_statements_0_0= ruleStatement )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3097:1: (lv_statements_0_0= ruleStatement )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3098:3: lv_statements_0_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfBlock6552);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3116:2: this_StatementsBlock_1= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleIfBlock6583);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3135:1: entryRuleStatementsBlock returns [EObject current=null] : iv_ruleStatementsBlock= ruleStatementsBlock EOF ;
    public final EObject entryRuleStatementsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementsBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3136:2: (iv_ruleStatementsBlock= ruleStatementsBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3137:2: iv_ruleStatementsBlock= ruleStatementsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementsBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock6618);
            iv_ruleStatementsBlock=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementsBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementsBlock6628); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3144:1: ruleStatementsBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleStatementsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3147:28: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3148:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3148:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3148:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatementsBlock6665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementsBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3152:1: ( (lv_statements_1_0= ruleStatement ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_INT)||LA72_0==12||LA72_0==17||LA72_0==22||LA72_0==25||LA72_0==27||LA72_0==33||LA72_0==35||(LA72_0>=41 && LA72_0<=43)||(LA72_0>=45 && LA72_0<=48)||(LA72_0>=51 && LA72_0<=52)||LA72_0==54||(LA72_0>=58 && LA72_0<=109)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:1: (lv_statements_1_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3154:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementsBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementsBlock6686);
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
            	    break loop72;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatementsBlock6699); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3184:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3185:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3186:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter6737);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter6747); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3193:1: ruleParameter returns [EObject current=null] : ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rel_2_0 = null;

        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3196:28: ( ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3197:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3197:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3197:2: (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rel_2_0= ruletypeRelation ) )? (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3197:2: (otherlv_0= 'const' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==57) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3197:4: otherlv_0= 'const'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleParameter6785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getConstKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3201:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3202:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3202:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3203:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter6804); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3219:2: ( (lv_rel_2_0= ruletypeRelation ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==33) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3220:1: (lv_rel_2_0= ruletypeRelation )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3220:1: (lv_rel_2_0= ruletypeRelation )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3221:3: lv_rel_2_0= ruletypeRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getRelTypeRelationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletypeRelation_in_ruleParameter6830);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3237:3: (otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3237:5: otherlv_3= '=' ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleParameter6844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3241:1: ( (lv_lit_4_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3242:1: (lv_lit_4_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3243:3: lv_lit_4_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getLitExprOrObjectLiteralParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6865);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3267:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3268:2: (iv_ruleParameters= ruleParameters EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3269:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters6903);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters6913); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3276:1: ruleParameters returns [EObject current=null] : ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3279:28: ( ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? ) )
            int alt81=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA81_1 = input.LA(2);

                if ( (synpred99_InternalAS3()) ) {
                    alt81=1;
                }
                else if ( (true) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA81_2 = input.LA(2);

                if ( (synpred99_InternalAS3()) ) {
                    alt81=1;
                }
                else if ( (true) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 18:
                {
                alt81=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_ID||LA77_0==57) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:3: ( (lv_elements_0_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3281:1: (lv_elements_0_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3281:1: (lv_elements_0_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3282:3: lv_elements_0_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters6960);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3298:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==24) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3298:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                            	    {
                            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleParameters6973); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3302:1: ( (lv_elements_2_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:1: (lv_elements_2_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:1: (lv_elements_2_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3304:3: lv_elements_2_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters6994);
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
                            	    break loop76;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )? )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) ( (lv_rel_8_0= ruletypeRelation ) )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:8: ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ','
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3321:8: ( (lv_elements_3_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3322:1: (lv_elements_3_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3322:1: (lv_elements_3_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3323:3: lv_elements_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters7027);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3339:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                alt78 = dfa78.predict(input);
                                switch (alt78) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3339:4: otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleParameters7040); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getCommaKeyword_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3343:1: ( (lv_elements_5_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3344:1: (lv_elements_5_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3344:1: (lv_elements_5_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3345:3: lv_elements_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters7061);
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
                            	    break loop78;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleParameters7075); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getParametersAccess().getCommaKeyword_1_0_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3365:3: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3366:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3366:1: (lv_name_7_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3367:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters7094); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3383:2: ( (lv_rel_8_0= ruletypeRelation ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==33) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3384:1: (lv_rel_8_0= ruletypeRelation )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3384:1: (lv_rel_8_0= ruletypeRelation )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3385:3: lv_rel_8_0= ruletypeRelation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getRelTypeRelationParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletypeRelation_in_ruleParameters7120);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3409:1: entryRuletypeRelation returns [EObject current=null] : iv_ruletypeRelation= ruletypeRelation EOF ;
    public final EObject entryRuletypeRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeRelation = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3410:2: (iv_ruletypeRelation= ruletypeRelation EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3411:2: iv_ruletypeRelation= ruletypeRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRelationRule()); 
            }
            pushFollow(FOLLOW_ruletypeRelation_in_entryRuletypeRelation7158);
            iv_ruletypeRelation=ruletypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeRelation7168); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3418:1: ruletypeRelation returns [EObject current=null] : (otherlv_0= ':' (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruletypeRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3421:28: ( (otherlv_0= ':' (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3422:1: (otherlv_0= ':' (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3422:1: (otherlv_0= ':' (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3422:3: otherlv_0= ':' (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruletypeRelation7205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeRelationAccess().getColonKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3426:1: (otherlv_1= '*' | otherlv_2= 'void' | ( ( ruleQualifiedName ) ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt82=1;
                }
                break;
            case 23:
                {
                alt82=2;
                }
                break;
            case RULE_ID:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3426:3: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruletypeRelation7218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeRelationAccess().getAsteriskKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruletypeRelation7236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeRelationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3436:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3436:6: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3437:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3437:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3438:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getTypeRelationAccess().getTypeClassCrossReference_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruletypeRelation7269);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3462:1: entryRuleobjectLiteral returns [EObject current=null] : iv_ruleobjectLiteral= ruleobjectLiteral EOF ;
    public final EObject entryRuleobjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3463:2: (iv_ruleobjectLiteral= ruleobjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3464:2: iv_ruleobjectLiteral= ruleobjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral7306);
            iv_ruleobjectLiteral=ruleobjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectLiteral7316); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3471:1: ruleobjectLiteral returns [EObject current=null] : (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) ;
    public final EObject ruleobjectLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_objectFields_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3474:28: ( (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3475:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3475:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3475:3: otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleobjectLiteral7353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getObjectLiteralAccess().getObjectFieldsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleobjectFields_in_ruleobjectLiteral7378);
            this_objectFields_1=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_objectFields_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleobjectLiteral7389); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3503:1: entryRuleobjectFields returns [EObject current=null] : iv_ruleobjectFields= ruleobjectFields EOF ;
    public final EObject entryRuleobjectFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3504:2: (iv_ruleobjectFields= ruleobjectFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3505:2: iv_ruleobjectFields= ruleobjectFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleobjectFields_in_entryRuleobjectFields7425);
            iv_ruleobjectFields=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectFields7435); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3512:1: ruleobjectFields returns [EObject current=null] : ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) ;
    public final EObject ruleobjectFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3515:28: ( ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3516:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3516:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3516:2: ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3516:2: ( (lv_fields_0_0= ruleobjectField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3517:1: (lv_fields_0_0= ruleobjectField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3517:1: (lv_fields_0_0= ruleobjectField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3518:3: lv_fields_0_0= ruleobjectField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields7481);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3534:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==24) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3534:4: otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleobjectFields7494); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3538:1: ( (lv_fields_2_0= ruleobjectField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3539:1: (lv_fields_2_0= ruleobjectField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3539:1: (lv_fields_2_0= ruleobjectField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3540:3: lv_fields_2_0= ruleobjectField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields7515);
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
            	    break loop83;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3564:1: entryRuleobjectField returns [EObject current=null] : iv_ruleobjectField= ruleobjectField EOF ;
    public final EObject entryRuleobjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3565:2: (iv_ruleobjectField= ruleobjectField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3566:2: iv_ruleobjectField= ruleobjectField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldRule()); 
            }
            pushFollow(FOLLOW_ruleobjectField_in_entryRuleobjectField7553);
            iv_ruleobjectField=ruleobjectField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectField7563); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3573:1: ruleobjectField returns [EObject current=null] : ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3576:28: ( ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3577:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3577:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            int alt84=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt84=1;
                }
                break;
            case RULE_STRING:
                {
                alt84=2;
                }
                break;
            case RULE_INT:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3577:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3577:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3577:3: this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleobjectField7600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7636);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3598:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3598:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3598:7: this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleobjectField7654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getObjectFieldAccess().getColonKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7690);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3619:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3619:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3619:7: this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleobjectField7708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()); 
                          
                    }
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getObjectFieldAccess().getColonKeyword_2_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7744);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3647:1: entryRuleexprOrObjectLiteral returns [EObject current=null] : iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF ;
    public final EObject entryRuleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexprOrObjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3648:2: (iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3649:2: iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7780);
            iv_ruleexprOrObjectLiteral=ruleexprOrObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprOrObjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7790); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3656:1: ruleexprOrObjectLiteral returns [EObject current=null] : (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) ;
    public final EObject ruleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_objectLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3659:28: ( (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3660:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3660:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_INT)||LA85_0==17||LA85_0==22||LA85_0==25||LA85_0==27||LA85_0==33||LA85_0==45||(LA85_0>=58 && LA85_0<=105)) ) {
                alt85=1;
            }
            else if ( (LA85_0==12) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3661:2: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7840);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3674:2: this_objectLiteral_1= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getObjectLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7870);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3695:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3696:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3697:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7907);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7917); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3704:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3707:28: (this_Assignment_0= ruleAssignment )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3709:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression7966);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3728:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3729:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3730:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment8000);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment8010); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3737:1: ruleAssignment returns [EObject current=null] : (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SelectionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3740:28: ( (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3741:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3741:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3742:2: this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_ruleAssignment8060);
            this_SelectionExpression_0=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3753:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==25) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3753:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3753:2: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3754:2: 
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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAssignment8084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3766:1: ( (lv_right_3_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3767:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3767:1: (lv_right_3_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3768:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment8105);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3792:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3793:2: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3794:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression8143);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression8153); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3801:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3804:28: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3805:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3805:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3806:2: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression8203);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3817:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==27) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3817:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3817:2: ()
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3818:2: 
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

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSelectionExpression8227); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3830:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3831:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3831:1: (otherlv_3= RULE_ID )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3832:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionExpression8251); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3846:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==17) ) {
            	        alt89=1;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3846:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3846:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3847:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3847:1: (lv_methodinvocation_4_0= '(' )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3848:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,17,FOLLOW_17_in_ruleSelectionExpression8270); if (state.failed) return current;
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

            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3861:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt88=2;
            	            int LA88_0 = input.LA(1);

            	            if ( ((LA88_0>=RULE_ID && LA88_0<=RULE_INT)||LA88_0==17||LA88_0==22||LA88_0==25||LA88_0==27||LA88_0==33||LA88_0==45||(LA88_0>=58 && LA88_0<=105)) ) {
            	                alt88=1;
            	            }
            	            switch (alt88) {
            	                case 1 :
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3861:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3861:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3862:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3862:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3863:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression8305);
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

            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3879:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop87:
            	                    do {
            	                        int alt87=2;
            	                        int LA87_0 = input.LA(1);

            	                        if ( (LA87_0==24) ) {
            	                            alt87=1;
            	                        }


            	                        switch (alt87) {
            	                    	case 1 :
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3879:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleSelectionExpression8318); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3883:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3884:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3884:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3885:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression8339);
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
            	                    	    break loop87;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSelectionExpression8355); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3913:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3914:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3915:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression8395);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression8405); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3922:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'undefined' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3925:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'undefined' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'undefined' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () otherlv_13= 'undefined' ) | ( () ( (otherlv_15= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            int alt92=10;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt92=1;
                }
                break;
            case RULE_INT:
                {
                alt92=2;
                }
                break;
            case 58:
            case 59:
                {
                alt92=3;
                }
                break;
            case 60:
                {
                alt92=4;
                }
                break;
            case 61:
                {
                alt92=5;
                }
                break;
            case 62:
                {
                alt92=6;
                }
                break;
            case 63:
                {
                alt92=7;
                }
                break;
            case RULE_ID:
                {
                alt92=8;
                }
                break;
            case 22:
            case 25:
            case 27:
            case 33:
            case 45:
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
            case 105:
                {
                alt92=9;
                }
                break;
            case 17:
                {
                alt92=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3926:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3927:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3935:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3936:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3936:1: (lv_value_1_0= RULE_STRING )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3937:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression8460); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3954:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3954:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3954:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3954:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3955:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3963:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3964:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3964:1: (lv_value_3_0= RULE_INT )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3965:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression8502); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3982:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3982:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3982:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3982:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3983:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3991:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3992:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3992:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3993:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3993:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==58) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==59) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3994:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,58,FOLLOW_58_in_ruleTerminalExpression8547); if (state.failed) return current;
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
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4006:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,59,FOLLOW_59_in_ruleTerminalExpression8576); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4022:6: ( () otherlv_7= 'this' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4022:6: ( () otherlv_7= 'this' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4022:7: () otherlv_7= 'this'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4022:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4023:2: 
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

                    otherlv_7=(Token)match(input,60,FOLLOW_60_in_ruleTerminalExpression8624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4036:6: ( () otherlv_9= 'super' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4036:6: ( () otherlv_9= 'super' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4036:7: () otherlv_9= 'super'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4036:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4037:2: 
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

                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleTerminalExpression8656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4050:6: ( () otherlv_11= 'null' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4050:6: ( () otherlv_11= 'null' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4050:7: () otherlv_11= 'null'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4050:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4051:2: 
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

                    otherlv_11=(Token)match(input,62,FOLLOW_62_in_ruleTerminalExpression8688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4064:6: ( () otherlv_13= 'undefined' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4064:6: ( () otherlv_13= 'undefined' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4064:7: () otherlv_13= 'undefined'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4064:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4065:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getUndefinedAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,63,FOLLOW_63_in_ruleTerminalExpression8720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getUndefinedKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4078:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4078:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4078:7: () ( (otherlv_15= RULE_ID ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4078:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4079:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4087:2: ( (otherlv_15= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4088:1: (otherlv_15= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4088:1: (otherlv_15= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4089:3: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression8764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4104:6: ( () ruleTerminalOperator )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4104:6: ( () ruleTerminalOperator )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4104:7: () ruleTerminalOperator
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4104:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4105:2: 
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
                    pushFollow(FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8803);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4125:6: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4125:6: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4125:8: otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')'
                    {
                    otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleTerminalExpression8822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression8847);
                    this_Expression_19=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_19; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleTerminalExpression8858); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4153:1: entryRuleTerminalOperator returns [String current=null] : iv_ruleTerminalOperator= ruleTerminalOperator EOF ;
    public final String entryRuleTerminalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalOperator = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4154:2: (iv_ruleTerminalOperator= ruleTerminalOperator EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4155:2: iv_ruleTerminalOperator= ruleTerminalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8896);
            iv_ruleTerminalOperator=ruleTerminalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalOperator8907); if (state.failed) return current;

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4162:1: ruleTerminalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTerminalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4165:28: ( (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4166:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4166:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' )
            int alt93=47;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt93=1;
                }
                break;
            case 64:
                {
                alt93=2;
                }
                break;
            case 65:
                {
                alt93=3;
                }
                break;
            case 66:
                {
                alt93=4;
                }
                break;
            case 67:
                {
                alt93=5;
                }
                break;
            case 68:
                {
                alt93=6;
                }
                break;
            case 69:
                {
                alt93=7;
                }
                break;
            case 70:
                {
                alt93=8;
                }
                break;
            case 71:
                {
                alt93=9;
                }
                break;
            case 72:
                {
                alt93=10;
                }
                break;
            case 73:
                {
                alt93=11;
                }
                break;
            case 74:
                {
                alt93=12;
                }
                break;
            case 75:
                {
                alt93=13;
                }
                break;
            case 76:
                {
                alt93=14;
                }
                break;
            case 77:
                {
                alt93=15;
                }
                break;
            case 78:
                {
                alt93=16;
                }
                break;
            case 79:
                {
                alt93=17;
                }
                break;
            case 80:
                {
                alt93=18;
                }
                break;
            case 81:
                {
                alt93=19;
                }
                break;
            case 82:
                {
                alt93=20;
                }
                break;
            case 83:
                {
                alt93=21;
                }
                break;
            case 84:
                {
                alt93=22;
                }
                break;
            case 85:
                {
                alt93=23;
                }
                break;
            case 86:
                {
                alt93=24;
                }
                break;
            case 87:
                {
                alt93=25;
                }
                break;
            case 88:
                {
                alt93=26;
                }
                break;
            case 89:
                {
                alt93=27;
                }
                break;
            case 45:
                {
                alt93=28;
                }
                break;
            case 90:
                {
                alt93=29;
                }
                break;
            case 91:
                {
                alt93=30;
                }
                break;
            case 92:
                {
                alt93=31;
                }
                break;
            case 93:
                {
                alt93=32;
                }
                break;
            case 94:
                {
                alt93=33;
                }
                break;
            case 95:
                {
                alt93=34;
                }
                break;
            case 96:
                {
                alt93=35;
                }
                break;
            case 22:
                {
                alt93=36;
                }
                break;
            case 97:
                {
                alt93=37;
                }
                break;
            case 98:
                {
                alt93=38;
                }
                break;
            case 99:
                {
                alt93=39;
                }
                break;
            case 100:
                {
                alt93=40;
                }
                break;
            case 101:
                {
                alt93=41;
                }
                break;
            case 102:
                {
                alt93=42;
                }
                break;
            case 103:
                {
                alt93=43;
                }
                break;
            case 27:
                {
                alt93=44;
                }
                break;
            case 104:
                {
                alt93=45;
                }
                break;
            case 105:
                {
                alt93=46;
                }
                break;
            case 33:
                {
                alt93=47;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4167:2: kw= '='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleTerminalOperator8945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4174:2: kw= '*='
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleTerminalOperator8964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4181:2: kw= '/='
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleTerminalOperator8983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4188:2: kw= '%='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleTerminalOperator9002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4195:2: kw= '+='
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleTerminalOperator9021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4202:2: kw= '-='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleTerminalOperator9040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4209:2: kw= '<<='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleTerminalOperator9059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4216:2: kw= '>>='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleTerminalOperator9078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4223:2: kw= '>>>='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleTerminalOperator9097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4230:2: kw= '&='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleTerminalOperator9116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandEqualsSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4237:2: kw= '^='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleTerminalOperator9135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentEqualsSignKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4244:2: kw= '|='
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleTerminalOperator9154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineEqualsSignKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4251:2: kw= '?:'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleTerminalOperator9173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getQuestionMarkColonKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4258:2: kw= '||'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleTerminalOperator9192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineVerticalLineKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4265:2: kw= '&&'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleTerminalOperator9211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandAmpersandKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4272:2: kw= '|'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTerminalOperator9230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4279:2: kw= '^'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleTerminalOperator9249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4286:2: kw= '&'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleTerminalOperator9268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4293:2: kw= '=='
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleTerminalOperator9287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4300:2: kw= '!='
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleTerminalOperator9306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4307:2: kw= '==='
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleTerminalOperator9325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4314:2: kw= '!=='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleTerminalOperator9344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4321:2: kw= '<'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTerminalOperator9363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4328:2: kw= '>'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTerminalOperator9382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4335:2: kw= '<='
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleTerminalOperator9401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignEqualsSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4342:2: kw= '>='
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTerminalOperator9420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignEqualsSignKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4349:2: kw= 'as'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleTerminalOperator9439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4356:2: kw= 'in'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleTerminalOperator9458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4363:2: kw= 'instanceof'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTerminalOperator9477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInstanceofKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4370:2: kw= 'is'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleTerminalOperator9496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getIsKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4377:2: kw= '<<'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTerminalOperator9515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4384:2: kw= '>>'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleTerminalOperator9534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4391:2: kw= '>>>'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleTerminalOperator9553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4398:2: kw= '+'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleTerminalOperator9572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4405:2: kw= '-'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleTerminalOperator9591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4412:2: kw= '*'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTerminalOperator9610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4419:2: kw= '/'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleTerminalOperator9629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4426:2: kw= '%'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTerminalOperator9648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignKeyword_37()); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4433:2: kw= '++'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTerminalOperator9667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignPlusSignKeyword_38()); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4440:2: kw= '--'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleTerminalOperator9686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusHyphenMinusKeyword_39()); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4447:2: kw= '!'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleTerminalOperator9705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkKeyword_40()); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4454:2: kw= '~'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleTerminalOperator9724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTildeKeyword_41()); 
                          
                    }

                    }
                    break;
                case 43 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:2: kw= 'typeof'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleTerminalOperator9743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTypeofKeyword_42()); 
                          
                    }

                    }
                    break;
                case 44 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4468:2: kw= '.'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTerminalOperator9762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getFullStopKeyword_43()); 
                          
                    }

                    }
                    break;
                case 45 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4475:2: kw= '::'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleTerminalOperator9781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getColonColonKeyword_44()); 
                          
                    }

                    }
                    break;
                case 46 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4482:2: kw= '?'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleTerminalOperator9800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getQuestionMarkKeyword_45()); 
                          
                    }

                    }
                    break;
                case 47 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4489:2: kw= ':'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTerminalOperator9819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getColonKeyword_46()); 
                          
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4502:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4504:28: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4505:1: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4505:1: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt94=1;
                }
                break;
            case 107:
                {
                alt94=2;
                }
                break;
            case 108:
                {
                alt94=3;
                }
                break;
            case 109:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4505:2: (enumLiteral_0= 'internal' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4505:2: (enumLiteral_0= 'internal' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4505:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_106_in_ruleAccessLevel9873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4511:6: (enumLiteral_1= 'private' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4511:6: (enumLiteral_1= 'private' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4511:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_107_in_ruleAccessLevel9890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4517:6: (enumLiteral_2= 'public' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4517:6: (enumLiteral_2= 'public' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4517:8: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_108_in_ruleAccessLevel9907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4523:6: (enumLiteral_3= 'protected' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4523:6: (enumLiteral_3= 'protected' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4523:8: enumLiteral_3= 'protected'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_109_in_ruleAccessLevel9924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_3()); 
                          
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

    // $ANTLR start synpred26_InternalAS3
    public final void synpred26_InternalAS3_fragment() throws RecognitionException {   
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:982:6: ( ( ( ruleQualifiedName ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:982:6: ( ( ruleQualifiedName ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:982:6: ( ( ruleQualifiedName ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:983:1: ( ruleQualifiedName )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:983:1: ( ruleQualifiedName )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:984:3: ruleQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred26_InternalAS32071);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalAS3

    // $ANTLR start synpred47_InternalAS3
    public final void synpred47_InternalAS3_fragment() throws RecognitionException {   
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1385:6: ( ( ( ruleQualifiedName ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1385:6: ( ( ruleQualifiedName ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1385:6: ( ( ruleQualifiedName ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1386:1: ( ruleQualifiedName )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1386:1: ( ruleQualifiedName )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1387:3: ruleQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred47_InternalAS32933);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred47_InternalAS3

    // $ANTLR start synpred61_InternalAS3
    public final void synpred61_InternalAS3_fragment() throws RecognitionException {   
        EObject lv_param_4_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: ( (lv_param_4_0= ruleParameters ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: (lv_param_4_0= ruleParameters )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1729:1: (lv_param_4_0= ruleParameters )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1730:3: lv_param_4_0= ruleParameters
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameters_in_synpred61_InternalAS33718);
        lv_param_4_0=ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred61_InternalAS3

    // $ANTLR start synpred86_InternalAS3
    public final void synpred86_InternalAS3_fragment() throws RecognitionException {   
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2843:6: ( ( ( ruleQualifiedName ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2843:6: ( ( ruleQualifiedName ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2843:6: ( ( ruleQualifiedName ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2844:1: ( ruleQualifiedName )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2844:1: ( ruleQualifiedName )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2845:3: ruleQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred86_InternalAS36008);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred86_InternalAS3

    // $ANTLR start synpred88_InternalAS3
    public final void synpred88_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseBlock_6_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,53,FOLLOW_53_in_synpred88_InternalAS36211); if (state.failed) return ;

        }

        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2954:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2955:1: (lv_elseBlock_6_0= ruleIfBlock )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2955:1: (lv_elseBlock_6_0= ruleIfBlock )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2956:3: lv_elseBlock_6_0= ruleIfBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIfBlock_in_synpred88_InternalAS36233);
        lv_elseBlock_6_0=ruleIfBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred88_InternalAS3

    // $ANTLR start synpred99_InternalAS3
    public final void synpred99_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:2: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( (LA113_0==RULE_ID||LA113_0==57) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3280:3: ( (lv_elements_0_0= ruleParameter ) )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3281:1: (lv_elements_0_0= ruleParameter )
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3281:1: (lv_elements_0_0= ruleParameter )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3282:3: lv_elements_0_0= ruleParameter
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleParameter_in_synpred99_InternalAS36960);
                lv_elements_0_0=ruleParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3298:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==24) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3298:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                	    {
                	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_synpred99_InternalAS36973); if (state.failed) return ;
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3302:1: ( (lv_elements_2_0= ruleParameter ) )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:1: (lv_elements_2_0= ruleParameter )
                	    {
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:1: (lv_elements_2_0= ruleParameter )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3304:3: lv_elements_2_0= ruleParameter
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleParameter_in_synpred99_InternalAS36994);
                	    lv_elements_2_0=ruleParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop112;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred99_InternalAS3

    // Delegated rules

    public final boolean synpred47_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA57_eotS =
        "\22\uffff";
    static final String DFA57_eofS =
        "\22\uffff";
    static final String DFA57_minS =
        "\1\52\1\21\1\4\1\21\1\17\1\uffff\2\4\1\uffff\1\17\1\uffff\1\4\1"+
        "\uffff\3\17\1\4\1\17";
    static final String DFA57_maxS =
        "\1\52\1\54\1\151\1\21\1\55\1\uffff\1\4\1\53\1\uffff\1\55\1\uffff"+
        "\1\27\1\uffff\3\55\1\4\1\55";
    static final String DFA57_acceptS =
        "\5\uffff\1\1\2\uffff\1\3\1\uffff\1\4\1\uffff\1\2\5\uffff";
    static final String DFA57_specialS =
        "\22\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1",
            "\1\2\32\uffff\1\3",
            "\1\4\2\5\10\uffff\1\5\1\uffff\1\5\4\uffff\1\5\2\uffff\1\5\1"+
            "\uffff\1\5\5\uffff\1\5\11\uffff\1\6\1\uffff\1\5\14\uffff\60"+
            "\5",
            "\1\7",
            "\1\5\10\uffff\2\5\1\uffff\1\5\21\uffff\1\10",
            "",
            "\1\11",
            "\1\10\46\uffff\1\12",
            "",
            "\1\14\10\uffff\2\14\7\uffff\1\13\13\uffff\1\12",
            "",
            "\1\17\21\uffff\1\15\1\16",
            "",
            "\1\14\10\uffff\2\14\23\uffff\1\12",
            "\1\14\10\uffff\2\14\23\uffff\1\12",
            "\1\14\10\uffff\2\14\1\uffff\1\20\21\uffff\1\12",
            "\1\21",
            "\1\14\10\uffff\2\14\1\uffff\1\20\21\uffff\1\12"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "1771:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) ( (lv_relation_34_0= ruletypeRelation ) )? otherlv_35= 'in' ( (lv_foreachexpr_36_0= ruleExpression ) ) otherlv_37= ')' ( (lv_foreachcommand_38_0= ruleStatementsBlock ) ) ) )";
        }
    }
    static final String DFA79_eotS =
        "\12\uffff";
    static final String DFA79_eofS =
        "\2\uffff\1\4\2\uffff\3\4\1\uffff\1\4";
    static final String DFA79_minS =
        "\1\4\1\uffff\1\22\1\4\1\uffff\3\22\1\4\1\22";
    static final String DFA79_maxS =
        "\1\71\1\uffff\1\41\1\27\1\uffff\2\31\1\33\1\4\1\33";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA79_specialS =
        "\12\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\2\64\uffff\1\1",
            "",
            "\1\4\5\uffff\2\1\7\uffff\1\3",
            "\1\7\21\uffff\1\5\1\6",
            "",
            "\1\4\5\uffff\2\1",
            "\1\4\5\uffff\2\1",
            "\1\4\5\uffff\2\1\1\uffff\1\10",
            "\1\11",
            "\1\4\5\uffff\2\1\1\uffff\1\10"
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "3321:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?";
        }
    }
    static final String DFA78_eotS =
        "\13\uffff";
    static final String DFA78_eofS =
        "\3\uffff\1\5\2\uffff\3\5\1\uffff\1\5";
    static final String DFA78_minS =
        "\1\30\1\4\1\uffff\1\22\1\4\1\uffff\3\22\1\4\1\22";
    static final String DFA78_maxS =
        "\1\30\1\71\1\uffff\1\41\1\27\1\uffff\2\31\1\33\1\4\1\33";
    static final String DFA78_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA78_specialS =
        "\13\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1",
            "\1\3\64\uffff\1\2",
            "",
            "\1\5\5\uffff\2\2\7\uffff\1\4",
            "\1\10\21\uffff\1\6\1\7",
            "",
            "\1\5\5\uffff\2\2",
            "\1\5\5\uffff\2\2",
            "\1\5\5\uffff\2\2\1\uffff\1\11",
            "\1\12",
            "\1\5\5\uffff\2\2\1\uffff\1\11"
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "()* loopback of 3339:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_ruleModel175 = new BitSet(new long[]{0x0000003C10000002L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModel198 = new BitSet(new long[]{0x0000003C10000002L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleModel217 = new BitSet(new long[]{0x0000003C10000002L,0x00003C0000000000L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage309 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage343 = new BitSet(new long[]{0x0000003C1011E000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleImports_in_rulePackage364 = new BitSet(new long[]{0x0000003C1011A000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruledirective_in_rulePackage385 = new BitSet(new long[]{0x0000003C1011A000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleClass_in_rulePackage409 = new BitSet(new long[]{0x0000003C10002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePackage428 = new BitSet(new long[]{0x0000003C10002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_13_in_rulePackage444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImports548 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport653 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledirective_in_entryRuledirective701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledirective711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruledirective761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledirective778 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruledirective796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleannotationFields_in_ruledirective817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledirective829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruledirective843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_ruledirective875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruledirective892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_entryRuleUses928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUses938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUses975 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUses987 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUses1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUses1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUses1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationFields_in_entryRuleannotationFields1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationFields1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationField_in_ruleannotationFields1138 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleannotationFields1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleannotationField_in_ruleannotationFields1172 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleannotationField_in_entryRuleannotationField1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationField1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleannotationField1262 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleannotationField1279 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleannotationField1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1395 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedNameWithWildcard1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1508 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedName1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1542 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleInterface1645 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInterface1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1675 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleInterface1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface1720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface1734 = new BitSet(new long[]{0x0000000040002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleInterfaceMethod_in_ruleInterface1755 = new BitSet(new long[]{0x0000000040002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_13_in_ruleInterface1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethod_in_entryRuleInterfaceMethod1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMethod1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleInterfaceMethod1860 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInterfaceMethod1873 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceMethod1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceMethod1904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceMethod1923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceMethod1940 = new BitSet(new long[]{0x0200000000040010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInterfaceMethod1962 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceMethod1975 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInterfaceMethod1996 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceMethod2012 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_33_in_ruleInterfaceMethod2025 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceMethod2038 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceMethod2071 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceMethod2104 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceMethod2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleClass2214 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_34_in_ruleClass2228 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35_in_ruleClass2243 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_ruleClass2258 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleClass2272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass2289 = new BitSet(new long[]{0x0000004020001000L});
    public static final BitSet FOLLOW_29_in_ruleClass2307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2334 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_38_in_ruleClass2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2376 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_ruleClass2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2416 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_12_in_ruleClass2432 = new BitSet(new long[]{0x0000098840002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass2453 = new BitSet(new long[]{0x0000098840002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_13_in_ruleClass2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleMember2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMethod2669 = new BitSet(new long[]{0x0000010840000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleMethod2692 = new BitSet(new long[]{0x0000010840000000L});
    public static final BitSet FOLLOW_40_in_ruleMethod2706 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_35_in_ruleMethod2721 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMethod2735 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_31_in_ruleMethod2748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleMethod2766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2785 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod2802 = new BitSet(new long[]{0x0200000000040010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2824 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleMethod2837 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2858 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod2874 = new BitSet(new long[]{0x0000000200009000L});
    public static final BitSet FOLLOW_33_in_ruleMethod2887 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleMethod2900 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod2933 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod2966 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleMethodBody_in_ruleMethod2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMethod3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodBody_in_entryRuleMethodBody3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodBody3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMethodBody3105 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethodBody3126 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleMethodBody3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleStatement3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_ruleStatement3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_ruleStatement3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_ruleStatement3520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleStatement3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_entryRuleNewStatement3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewStatement3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNewStatement3657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewStatement3684 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNewStatement3697 = new BitSet(new long[]{0x0200000000040010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleNewStatement3718 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNewStatement3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3817 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3829 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3863 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3897 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3918 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3931 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3972 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3984 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleForStatement3996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement4017 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleForStatement4030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement4051 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement4065 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement4086 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement4099 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement4120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement4174 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleForStatement4187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement4201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement4218 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4235 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4256 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement4309 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleForStatement4322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement4336 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleForStatement4348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement4365 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleForStatement4391 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4404 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4425 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4437 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration4495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifierDeclaration4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifierDeclaration4547 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleidentifierDeclaration4573 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleidentifierDeclaration4587 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecommaExpr_in_entryRulecommaExpr4646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecommaExpr4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4702 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulecommaExpr4715 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4736 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileStatement4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDoWhileStatement4833 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4854 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDoWhileStatement4866 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4887 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDoWhileStatement4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleWhileStatement4994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement5015 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleWhileStatement5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSwitchStatement5131 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement5152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSwitchStatement5164 = new BitSet(new long[]{0xFC5FEE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement5185 = new BitSet(new long[]{0xFC5FEE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleSwitchStatement5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr5234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparenthesizedExpr5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleparenthesizedExpr5281 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr5302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleparenthesizedExpr5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch5350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatementInSwitch5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulestatementInSwitch5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulestatementInSwitch5428 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulestatementInSwitch5453 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatementInSwitch5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulestatementInSwitch5484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatementInSwitch5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn5533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReturn5580 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturn5601 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReturn5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5705 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_35_in_ruleVariableDeclaration5719 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleVariableDeclaration5733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration5750 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDeclaration5767 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleVariableDeclaration5788 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDeclaration5801 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration5822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarType_in_entryRuleVarType5872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarType5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVarType5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVarType5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarType6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarType6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement6077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIfStatement6124 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIfStatement6136 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement6157 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfStatement6169 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement6190 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIfStatement6211 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_entryRuleTryStatement6271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryStatement6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTryStatement6318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTryStatement6330 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement6351 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleTryStatement6364 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTryStatement6377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTryStatement6389 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTryStatement6410 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTryStatement6422 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTryStatement6437 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleTryStatement6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock6496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfBlock6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleIfBlock6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock6618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementsBlock6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatementsBlock6665 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementsBlock6686 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleStatementsBlock6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter6737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleParameter6785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter6804 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameter6830 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameter6844 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters6903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6960 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameters6973 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6994 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters7027 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameters7040 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters7061 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameters7075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters7094 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_ruleParameters7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeRelation_in_entryRuletypeRelation7158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeRelation7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruletypeRelation7205 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_22_in_ruletypeRelation7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruletypeRelation7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruletypeRelation7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral7306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectLiteral7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleobjectLiteral7353 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectFields_in_ruleobjectLiteral7378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleobjectLiteral7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectFields_in_entryRuleobjectFields7425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectFields7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields7481 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleobjectFields7494 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields7515 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_entryRuleobjectField7553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectField7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleobjectField7600 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7611 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleobjectField7654 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7665 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleobjectField7708 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7719 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment8000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_ruleAssignment8060 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAssignment8084 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression8143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression8203 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleSelectionExpression8227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionExpression8251 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_17_in_ruleSelectionExpression8270 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression8305 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleSelectionExpression8318 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression8339 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleSelectionExpression8355 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression8395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTerminalExpression8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTerminalExpression8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTerminalExpression8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTerminalExpression8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTerminalExpression8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTerminalExpression8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression8822 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression8847 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerminalExpression8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalOperator8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTerminalOperator8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTerminalOperator8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTerminalOperator8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTerminalOperator9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTerminalOperator9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTerminalOperator9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTerminalOperator9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTerminalOperator9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTerminalOperator9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTerminalOperator9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTerminalOperator9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTerminalOperator9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTerminalOperator9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTerminalOperator9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTerminalOperator9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTerminalOperator9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTerminalOperator9249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTerminalOperator9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTerminalOperator9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTerminalOperator9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTerminalOperator9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTerminalOperator9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTerminalOperator9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTerminalOperator9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTerminalOperator9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTerminalOperator9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTerminalOperator9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalOperator9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTerminalOperator9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleTerminalOperator9496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTerminalOperator9515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTerminalOperator9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTerminalOperator9553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTerminalOperator9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTerminalOperator9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminalOperator9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTerminalOperator9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTerminalOperator9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTerminalOperator9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTerminalOperator9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTerminalOperator9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTerminalOperator9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTerminalOperator9743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTerminalOperator9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleTerminalOperator9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleTerminalOperator9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTerminalOperator9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAccessLevel9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAccessLevel9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAccessLevel9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleAccessLevel9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred26_InternalAS32071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred47_InternalAS32933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_synpred61_InternalAS33718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred86_InternalAS36008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred88_InternalAS36211 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_synpred88_InternalAS36233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred99_InternalAS36960 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_synpred99_InternalAS36973 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred99_InternalAS36994 = new BitSet(new long[]{0x0000000001000002L});

}