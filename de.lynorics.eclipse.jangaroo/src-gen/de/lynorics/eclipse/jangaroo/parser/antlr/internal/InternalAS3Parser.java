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

                    	        if ( ((LA1_1>=34 && LA1_1<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else if ( (LA1_1==28) ) {
                    	            alt1=2;
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

                    	        if ( ((LA1_4>=34 && LA1_4<=37)) ) {
                    	            alt1=1;
                    	        }
                    	        else if ( (LA1_4==28) ) {
                    	            alt1=2;
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

            	        if ( (LA6_2==28) ) {
            	            alt6=2;
            	        }
            	        else if ( ((LA6_2>=34 && LA6_2<=37)) ) {
            	            alt6=1;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:872:1: ruleInterfaceMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )? (otherlv_12= ';' )? ) ;
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
        Token otherlv_12=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_type_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:875:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )? (otherlv_12= ';' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )? (otherlv_12= ';' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )? (otherlv_12= ';' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:876:2: ( (lv_access_0_0= ruleAccessLevel ) )? otherlv_1= 'function' (otherlv_2= 'get' | otherlv_3= 'set' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )? (otherlv_12= ';' )?
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:1: (otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:973:3: otherlv_10= ':' ( (lv_type_11_0= ruleVarType ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleInterfaceMethod2025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInterfaceMethodAccess().getColonKeyword_7_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:977:1: ( (lv_type_11_0= ruleVarType ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:978:1: (lv_type_11_0= ruleVarType )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:978:1: (lv_type_11_0= ruleVarType )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:979:3: lv_type_11_0= ruleVarType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceMethodAccess().getTypeVarTypeParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarType_in_ruleInterfaceMethod2046);
                    lv_type_11_0=ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_11_0, 
                              		"VarType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:995:4: (otherlv_12= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:995:6: otherlv_12= ';'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceMethod2061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getInterfaceMethodAccess().getSemicolonKeyword_8());
                          
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1007:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1008:2: (iv_ruleClass= ruleClass EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1009:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass2099);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass2109); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1016:1: ruleClass returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1019:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1020:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1020:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1020:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'final' )? (otherlv_2= 'static' )? (otherlv_3= 'dynamic' )? otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( (lv_members_13_0= ruleMember ) )* otherlv_14= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1020:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=106 && LA24_0<=109)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1021:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1021:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1022:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleClass2155);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1038:3: (otherlv_1= 'final' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1038:5: otherlv_1= 'final'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleClass2169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getFinalKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1042:3: (otherlv_2= 'static' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1042:5: otherlv_2= 'static'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleClass2184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getStaticKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1046:3: (otherlv_3= 'dynamic' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1046:5: otherlv_3= 'dynamic'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleClass2199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getDynamicKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleClass2213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getClassKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1054:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1055:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1055:1: (lv_name_5_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1056:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass2230); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1072:2: (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1072:4: otherlv_6= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleClass2248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1076:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1077:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1077:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1078:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2275);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1094:4: (otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1094:6: otherlv_8= 'implements' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleClass2290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getImplementsKeyword_7_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1098:1: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1099:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1099:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1100:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2317);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1116:2: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==24) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1116:4: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleClass2330); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	          
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
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTypesInterfaceCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass2357);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleClass2373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1142:1: ( (lv_members_13_0= ruleMember ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==30||LA31_0==35||(LA31_0>=39 && LA31_0<=40)||LA31_0==43||(LA31_0>=106 && LA31_0<=109)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_members_13_0= ruleMember )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1143:1: (lv_members_13_0= ruleMember )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1144:3: lv_members_13_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass2394);
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
            	    break loop31;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleClass2407); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1172:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1173:2: (iv_ruleMember= ruleMember EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1174:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2443);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2453); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1181:1: ruleMember returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_meth_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1184:28: ( ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_meth_1_0= ruleMethod ) ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case 106:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==30) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==43) ) {
                        alt32=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt32=1;
                    }
                    break;
                case 30:
                case 40:
                    {
                    alt32=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

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
                    alt32=2;
                    }
                    break;
                case 35:
                    {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==30) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==43) ) {
                        alt32=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }

                }
                break;
            case 108:
                {
                switch ( input.LA(2) ) {
                case 30:
                case 40:
                    {
                    alt32=2;
                    }
                    break;
                case 35:
                    {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==30) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==43) ) {
                        alt32=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }

                }
                break;
            case 109:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==30) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==43) ) {
                        alt32=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt32=1;
                    }
                    break;
                case 30:
                case 40:
                    {
                    alt32=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                int LA32_5 = input.LA(2);

                if ( (LA32_5==30) ) {
                    alt32=2;
                }
                else if ( (LA32_5==43) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 5, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt32=1;
                }
                break;
            case 30:
            case 39:
            case 40:
                {
                alt32=2;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1185:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1186:1: (lv_var_0_0= ruleVariableDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1186:1: (lv_var_0_0= ruleVariableDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1187:3: lv_var_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleMember2499);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1204:6: ( (lv_meth_1_0= ruleMethod ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1204:6: ( (lv_meth_1_0= ruleMethod ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1205:1: (lv_meth_1_0= ruleMethod )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1205:1: (lv_meth_1_0= ruleMethod )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1206:3: lv_meth_1_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getMethMethodParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember2526);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1230:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1231:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1232:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2562);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2572); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1239:1: ruleMethod returns [EObject current=null] : ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )? ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' ) ) ;
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
        Token otherlv_16=null;
        Enumerator lv_access_1_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_type_14_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1242:28: ( ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )? ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1243:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )? ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1243:1: ( (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )? ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1243:2: (otherlv_0= 'override' )? ( (lv_access_1_0= ruleAccessLevel ) )? (otherlv_2= 'native' )? (otherlv_3= 'static' )? otherlv_4= 'function' (otherlv_5= 'get' | otherlv_6= 'set' )? ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )? otherlv_12= ')' (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )? ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1243:2: (otherlv_0= 'override' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1243:4: otherlv_0= 'override'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMethod2610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getOverrideKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1247:3: ( (lv_access_1_0= ruleAccessLevel ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=106 && LA34_0<=109)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1248:1: (lv_access_1_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1248:1: (lv_access_1_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1249:3: lv_access_1_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleMethod2633);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1265:3: (otherlv_2= 'native' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1265:5: otherlv_2= 'native'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleMethod2647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getNativeKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1269:3: (otherlv_3= 'static' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1269:5: otherlv_3= 'static'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleMethod2662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getStaticKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleMethod2676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getFunctionKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1277:1: (otherlv_5= 'get' | otherlv_6= 'set' )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            else if ( (LA37_0==32) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1277:3: otherlv_5= 'get'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleMethod2689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getGetKeyword_5_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1282:7: otherlv_6= 'set'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleMethod2707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getSetKeyword_5_1());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1286:3: ( (lv_name_7_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1287:1: (lv_name_7_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1287:1: (lv_name_7_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1288:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2726); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleMethod2743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1308:1: ( ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1308:2: ( (lv_params_9_0= ruleParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1308:2: ( (lv_params_9_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1309:1: (lv_params_9_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1309:1: (lv_params_9_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1310:3: lv_params_9_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2765);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1326:2: (otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==24) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1326:4: otherlv_10= ',' ( (lv_params_11_0= ruleParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleMethod2778); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1330:1: ( (lv_params_11_0= ruleParameter ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1331:1: (lv_params_11_0= ruleParameter )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1331:1: (lv_params_11_0= ruleParameter )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1332:3: lv_params_11_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2799);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMethod2815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightParenthesisKeyword_9());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1352:1: (otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1352:3: otherlv_13= ':' ( (lv_type_14_0= ruleVarType ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleMethod2828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getColonKeyword_10_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1356:1: ( (lv_type_14_0= ruleVarType ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1357:1: (lv_type_14_0= ruleVarType )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1357:1: (lv_type_14_0= ruleVarType )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1358:3: lv_type_14_0= ruleVarType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getTypeVarTypeParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarType_in_ruleMethod2849);
                    lv_type_14_0=ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_14_0, 
                              		"VarType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1374:4: ( ( (lv_body_15_0= ruleMethodBody ) ) | otherlv_16= ';' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            else if ( (LA41_0==15) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1374:5: ( (lv_body_15_0= ruleMethodBody ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1374:5: ( (lv_body_15_0= ruleMethodBody ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1375:1: (lv_body_15_0= ruleMethodBody )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1375:1: (lv_body_15_0= ruleMethodBody )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1376:3: lv_body_15_0= ruleMethodBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodBody_in_ruleMethod2873);
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
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1393:7: otherlv_16= ';'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleMethod2891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getSemicolonKeyword_11_1());
                          
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1405:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1406:2: (iv_ruleMethodBody= ruleMethodBody EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1407:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMethodBody_in_entryRuleMethodBody2928);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodBody2938); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1414:1: ruleMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1417:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1418:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1418:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1418:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1418:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1419:2: 
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMethodBody2987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1431:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==12||LA42_0==17||LA42_0==22||LA42_0==25||LA42_0==27||LA42_0==33||LA42_0==35||(LA42_0>=41 && LA42_0<=43)||(LA42_0>=45 && LA42_0<=48)||(LA42_0>=51 && LA42_0<=52)||LA42_0==54||(LA42_0>=58 && LA42_0<=109)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1432:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1432:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1433:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodBodyAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethodBody3008);
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
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMethodBody3021); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1461:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1462:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1463:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3057);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3067); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1470:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1473:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1474:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1474:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_SwitchStatement_5= ruleSwitchStatement | this_TryStatement_6= ruleTryStatement | this_WhileStatement_7= ruleWhileStatement | this_DoWhileStatement_8= ruleDoWhileStatement | this_ForStatement_9= ruleForStatement | (this_NewStatement_10= ruleNewStatement otherlv_11= ';' ) | this_objectLiteral_12= ruleobjectLiteral )
            int alt43=11;
            switch ( input.LA(1) ) {
            case 35:
            case 43:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt43=1;
                }
                break;
            case 51:
                {
                alt43=2;
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
                alt43=3;
                }
                break;
            case 52:
                {
                alt43=4;
                }
                break;
            case 48:
                {
                alt43=5;
                }
                break;
            case 54:
                {
                alt43=6;
                }
                break;
            case 47:
                {
                alt43=7;
                }
                break;
            case 46:
                {
                alt43=8;
                }
                break;
            case 42:
                {
                alt43=9;
                }
                break;
            case 41:
                {
                alt43=10;
                }
                break;
            case 12:
                {
                alt43=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1475:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement3117);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1488:2: this_Return_1= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleStatement3147);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1500:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1500:6: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1501:2: this_Expression_2= ruleExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement3178);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStatement3189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1518:2: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement3221);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1531:2: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement3251);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1544:2: this_TryStatement_6= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTryStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryStatement_in_ruleStatement3281);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1557:2: this_WhileStatement_7= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement3311);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1570:2: this_DoWhileStatement_8= ruleDoWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoWhileStatement_in_ruleStatement3341);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1583:2: this_ForStatement_9= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement3371);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1595:6: (this_NewStatement_10= ruleNewStatement otherlv_11= ';' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1595:6: (this_NewStatement_10= ruleNewStatement otherlv_11= ';' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1596:2: this_NewStatement_10= ruleNewStatement otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getNewStatementParserRuleCall_9_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewStatement_in_ruleStatement3402);
                    this_NewStatement_10=ruleNewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewStatement_10; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleStatement3413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1613:2: this_objectLiteral_12= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getObjectLiteralParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleStatement3445);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1632:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1633:2: (iv_ruleNewStatement= ruleNewStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1634:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleNewStatement_in_entryRuleNewStatement3480);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewStatement3490); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1641:1: ruleNewStatement returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1644:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1645:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1645:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1645:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1645:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1646:2: 
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleNewStatement3539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewStatementAccess().getNewKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1658:1: ( ( ruleQualifiedName ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1659:1: ( ruleQualifiedName )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1659:1: ( ruleQualifiedName )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1660:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewStatement3566);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1676:2: (otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==17) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1676:4: otherlv_3= '(' ( (lv_param_4_0= ruleParameters ) )? otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNewStatement3579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1680:1: ( (lv_param_4_0= ruleParameters ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID||LA44_0==57) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==18) ) {
                        int LA44_2 = input.LA(2);

                        if ( (synpred57_InternalAS3()) ) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:1: (lv_param_4_0= ruleParameters )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:1: (lv_param_4_0= ruleParameters )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1682:3: lv_param_4_0= ruleParameters
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameters_in_ruleNewStatement3600);
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

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNewStatement3613); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1710:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1711:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1712:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement3651);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement3661); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1719:1: ruleForStatement returns [EObject current=null] : ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) ) ) ;
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
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
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

        EObject lv_type_35_0 = null;

        EObject lv_foreachexpr_37_0 = null;

        EObject lv_foreachcommand_39_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1722:28: ( ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1723:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1723:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) ) )
            int alt55=4;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1723:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1723:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1723:4: otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) )
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1731:1: ( (lv_forinit_2_0= rulecommaExpr ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_INT)||LA46_0==17||LA46_0==22||LA46_0==25||LA46_0==27||LA46_0==33||LA46_0==45||(LA46_0>=58 && LA46_0<=105)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1732:1: (lv_forinit_2_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1732:1: (lv_forinit_2_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1733:3: lv_forinit_2_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getForinitCommaExprParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3732);
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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1753:1: ( (lv_condition_4_0= rulecommaExpr ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==17||LA47_0==22||LA47_0==25||LA47_0==27||LA47_0==33||LA47_0==45||(LA47_0>=58 && LA47_0<=105)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1754:1: (lv_condition_4_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1754:1: (lv_condition_4_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1755:3: lv_condition_4_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_0_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3766);
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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_0_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1775:1: ( (lv_iterator_6_0= rulecommaExpr ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==17||LA48_0==22||LA48_0==25||LA48_0==27||LA48_0==33||LA48_0==45||(LA48_0>=58 && LA48_0<=105)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1776:1: (lv_iterator_6_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1776:1: (lv_iterator_6_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1777:3: lv_iterator_6_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_0_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3800);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleForStatement3813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_0_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1797:1: ( (lv_command_8_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1798:1: (lv_command_8_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1798:1: (lv_command_8_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1799:3: lv_command_8_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_0_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement3834);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1816:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1816:6: (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1816:8: otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleForStatement3854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getForKeyword_1_0());
                          
                    }
                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleForStatement3866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleForStatement3878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getForStatementAccess().getVarKeyword_1_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1828:1: ( (lv_elements_12_0= ruleidentifierDeclaration ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1829:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1829:1: (lv_elements_12_0= ruleidentifierDeclaration )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1830:3: lv_elements_12_0= ruleidentifierDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3899);
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1846:2: (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1846:4: otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleForStatement3912); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getForStatementAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1850:1: ( (lv_elements_14_0= ruleidentifierDeclaration ) )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1851:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    {
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1851:1: (lv_elements_14_0= ruleidentifierDeclaration )
                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1852:3: lv_elements_14_0= ruleidentifierDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForStatementAccess().getElementsIdentifierDeclarationParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3933);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_5());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1872:1: ( (lv_condition_16_0= rulecommaExpr ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==17||LA50_0==22||LA50_0==25||LA50_0==27||LA50_0==33||LA50_0==45||(LA50_0>=58 && LA50_0<=105)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1873:1: (lv_condition_16_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1873:1: (lv_condition_16_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1874:3: lv_condition_16_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getConditionCommaExprParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement3968);
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

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleForStatement3981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getForStatementAccess().getSemicolonKeyword_1_7());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1894:1: ( (lv_iterator_18_0= rulecommaExpr ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_INT)||LA51_0==17||LA51_0==22||LA51_0==25||LA51_0==27||LA51_0==33||LA51_0==45||(LA51_0>=58 && LA51_0<=105)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1895:1: (lv_iterator_18_0= rulecommaExpr )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1895:1: (lv_iterator_18_0= rulecommaExpr )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1896:3: lv_iterator_18_0= rulecommaExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getIteratorCommaExprParserRuleCall_1_8_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecommaExpr_in_ruleForStatement4002);
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

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_1_9());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1916:1: ( (lv_command_20_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1917:1: (lv_command_20_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1917:1: (lv_command_20_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1918:3: lv_command_20_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getCommandStatementsBlockParserRuleCall_1_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4036);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1935:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1935:6: (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1935:8: otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    {
                    otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleForStatement4056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getForStatementAccess().getForKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1939:1: (otherlv_22= 'each' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==44) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1939:3: otherlv_22= 'each'
                            {
                            otherlv_22=(Token)match(input,44,FOLLOW_44_in_ruleForStatement4069); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getForStatementAccess().getEachKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleForStatement4083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1947:1: ( (lv_nameForin_24_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1948:1: (lv_nameForin_24_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1948:1: (lv_nameForin_24_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1949:3: lv_nameForin_24_0= RULE_ID
                    {
                    lv_nameForin_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement4100); if (state.failed) return current;
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

                    otherlv_25=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getForStatementAccess().getInKeyword_2_4());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1969:1: ( (lv_forinexpr_26_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1970:1: (lv_forinexpr_26_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1970:1: (lv_forinexpr_26_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1971:3: lv_forinexpr_26_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForinexprExpressionParserRuleCall_2_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4138);
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

                    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_2_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1991:1: ( (lv_forcommand_28_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1992:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1992:1: (lv_forcommand_28_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1993:3: lv_forcommand_28_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForcommandStatementsBlockParserRuleCall_2_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4171);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2010:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2010:6: (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2010:8: otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) )
                    {
                    otherlv_29=(Token)match(input,42,FOLLOW_42_in_ruleForStatement4191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getForStatementAccess().getForKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2014:1: (otherlv_30= 'each' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==44) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2014:3: otherlv_30= 'each'
                            {
                            otherlv_30=(Token)match(input,44,FOLLOW_44_in_ruleForStatement4204); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getForStatementAccess().getEachKeyword_3_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleForStatement4218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_32=(Token)match(input,43,FOLLOW_43_in_ruleForStatement4230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getForStatementAccess().getVarKeyword_3_3());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2026:1: ( (lv_nameForeachh_33_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2027:1: (lv_nameForeachh_33_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2027:1: (lv_nameForeachh_33_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2028:3: lv_nameForeachh_33_0= RULE_ID
                    {
                    lv_nameForeachh_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForStatement4247); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2044:2: (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==33) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2044:4: otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) )
                            {
                            otherlv_34=(Token)match(input,33,FOLLOW_33_in_ruleForStatement4265); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getForStatementAccess().getColonKeyword_3_5_0());
                                  
                            }
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2048:1: ( (lv_type_35_0= ruleVarType ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2049:1: (lv_type_35_0= ruleVarType )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2049:1: (lv_type_35_0= ruleVarType )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2050:3: lv_type_35_0= ruleVarType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForStatementAccess().getTypeVarTypeParserRuleCall_3_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarType_in_ruleForStatement4286);
                            lv_type_35_0=ruleVarType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"type",
                                      		lv_type_35_0, 
                                      		"VarType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_36=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getForStatementAccess().getInKeyword_3_6());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2070:1: ( (lv_foreachexpr_37_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2071:1: (lv_foreachexpr_37_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2071:1: (lv_foreachexpr_37_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2072:3: lv_foreachexpr_37_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachexprExpressionParserRuleCall_3_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4321);
                    lv_foreachexpr_37_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"foreachexpr",
                              		lv_foreachexpr_37_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3_8());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2092:1: ( (lv_foreachcommand_39_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2093:1: (lv_foreachcommand_39_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2093:1: (lv_foreachcommand_39_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2094:3: lv_foreachcommand_39_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getForeachcommandStatementsBlockParserRuleCall_3_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleForStatement4354);
                    lv_foreachcommand_39_0=ruleStatementsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"foreachcommand",
                              		lv_foreachcommand_39_0, 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2118:1: entryRuleidentifierDeclaration returns [EObject current=null] : iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF ;
    public final EObject entryRuleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2119:2: (iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2120:2: iv_ruleidentifierDeclaration= ruleidentifierDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration4391);
            iv_ruleidentifierDeclaration=ruleidentifierDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifierDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifierDeclaration4401); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2127:1: ruleidentifierDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )? (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleidentifierDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2130:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )? (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2131:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )? (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2131:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )? (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2131:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )? (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2131:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2132:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2132:1: (lv_name_0_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2133:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifierDeclaration4443); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2149:2: (otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==33) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2149:4: otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleidentifierDeclaration4461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIdentifierDeclarationAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2153:1: ( (lv_type_2_0= ruleVarType ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2154:1: (lv_type_2_0= ruleVarType )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2154:1: (lv_type_2_0= ruleVarType )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2155:3: lv_type_2_0= ruleVarType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getTypeVarTypeParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarType_in_ruleidentifierDeclaration4482);
                    lv_type_2_0=ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"VarType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2171:4: (otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==25) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2171:6: otherlv_3= '=' ( (lv_expr_4_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleidentifierDeclaration4497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentifierDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2175:1: ( (lv_expr_4_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_expr_4_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2176:1: (lv_expr_4_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2177:3: lv_expr_4_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierDeclarationAccess().getExprExprOrObjectLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4518);
                    lv_expr_4_0=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_4_0, 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2201:1: entryRulecommaExpr returns [EObject current=null] : iv_rulecommaExpr= rulecommaExpr EOF ;
    public final EObject entryRulecommaExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecommaExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2202:2: (iv_rulecommaExpr= rulecommaExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2203:2: iv_rulecommaExpr= rulecommaExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaExprRule()); 
            }
            pushFollow(FOLLOW_rulecommaExpr_in_entryRulecommaExpr4556);
            iv_rulecommaExpr=rulecommaExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommaExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecommaExpr4566); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2210:1: rulecommaExpr returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulecommaExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2213:28: ( ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2214:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2214:1: ( ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2214:2: ( (lv_elements_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2214:2: ( (lv_elements_0_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2215:1: (lv_elements_0_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2215:1: (lv_elements_0_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2216:3: lv_elements_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4612);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==24) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2232:4: otherlv_1= ',' ( (lv_elements_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulecommaExpr4625); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommaExprAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2236:1: ( (lv_elements_2_0= ruleExpression ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2237:1: (lv_elements_2_0= ruleExpression )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2237:1: (lv_elements_2_0= ruleExpression )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2238:3: lv_elements_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommaExprAccess().getElementsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulecommaExpr4646);
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
            	    break loop58;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2262:1: entryRuleDoWhileStatement returns [EObject current=null] : iv_ruleDoWhileStatement= ruleDoWhileStatement EOF ;
    public final EObject entryRuleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2263:2: (iv_ruleDoWhileStatement= ruleDoWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2264:2: iv_ruleDoWhileStatement= ruleDoWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4684);
            iv_ruleDoWhileStatement=ruleDoWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhileStatement4694); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2271:1: ruleDoWhileStatement returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whileBlock_2_0 = null;

        EObject lv_cond_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2274:28: ( ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2275:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2275:1: ( () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2275:2: () otherlv_1= 'do' ( (lv_whileBlock_2_0= ruleStatementsBlock ) ) otherlv_3= 'while' ( (lv_cond_4_0= ruleparenthesizedExpr ) ) otherlv_5= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2275:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2276:2: 
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleDoWhileStatement4743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoWhileStatementAccess().getDoKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2288:1: ( (lv_whileBlock_2_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2289:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2289:1: (lv_whileBlock_2_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2290:3: lv_whileBlock_2_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4764);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleDoWhileStatement4776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileStatementAccess().getWhileKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2310:1: ( (lv_cond_4_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2311:1: (lv_cond_4_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2311:1: (lv_cond_4_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2312:3: lv_cond_4_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileStatementAccess().getCondParenthesizedExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4797);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDoWhileStatement4809); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2340:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2341:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2342:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4845);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement4855); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2349:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cond_2_0 = null;

        EObject lv_whileBlock_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2352:28: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2353:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2353:1: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2353:2: () otherlv_1= 'while' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2353:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2354:2: 
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

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleWhileStatement4904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2366:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2367:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2367:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2368:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement4925);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2384:2: ( (lv_whileBlock_3_0= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2385:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2385:1: (lv_whileBlock_3_0= ruleStatementsBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2386:3: lv_whileBlock_3_0= ruleStatementsBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_ruleWhileStatement4946);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2410:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2411:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2412:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement4982);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement4992); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2419:1: ruleSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cases_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2422:28: ( ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2423:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2423:1: ( () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2423:2: () otherlv_1= 'switch' ( (lv_cond_2_0= ruleparenthesizedExpr ) ) otherlv_3= '{' ( (lv_cases_4_0= rulestatementInSwitch ) )* otherlv_5= '}'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2423:2: ()
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2424:2: 
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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleSwitchStatement5041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2436:1: ( (lv_cond_2_0= ruleparenthesizedExpr ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2437:1: (lv_cond_2_0= ruleparenthesizedExpr )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2437:1: (lv_cond_2_0= ruleparenthesizedExpr )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2438:3: lv_cond_2_0= ruleparenthesizedExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCondParenthesizedExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement5062);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSwitchStatement5074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2458:1: ( (lv_cases_4_0= rulestatementInSwitch ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_INT)||LA59_0==12||LA59_0==17||LA59_0==22||LA59_0==25||LA59_0==27||LA59_0==33||LA59_0==35||(LA59_0>=41 && LA59_0<=43)||(LA59_0>=45 && LA59_0<=52)||LA59_0==54||(LA59_0>=58 && LA59_0<=109)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2459:1: (lv_cases_4_0= rulestatementInSwitch )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2459:1: (lv_cases_4_0= rulestatementInSwitch )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2460:3: lv_cases_4_0= rulestatementInSwitch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesStatementInSwitchParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement5095);
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
            	    break loop59;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSwitchStatement5108); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2488:1: entryRuleparenthesizedExpr returns [EObject current=null] : iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF ;
    public final EObject entryRuleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparenthesizedExpr = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2489:2: (iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2490:2: iv_ruleparenthesizedExpr= ruleparenthesizedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            }
            pushFollow(FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr5144);
            iv_ruleparenthesizedExpr=ruleparenthesizedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparenthesizedExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparenthesizedExpr5154); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2497:1: ruleparenthesizedExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) ;
    public final EObject ruleparenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2500:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2501:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2501:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2501:3: otherlv_0= '(' ( (lv_expression_1_0= ruleexprOrObjectLiteral ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleparenthesizedExpr5191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2505:1: ( (lv_expression_1_0= ruleexprOrObjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2506:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2506:1: (lv_expression_1_0= ruleexprOrObjectLiteral )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2507:3: lv_expression_1_0= ruleexprOrObjectLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExpressionExprOrObjectLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr5212);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleparenthesizedExpr5224); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2535:1: entryRulestatementInSwitch returns [EObject current=null] : iv_rulestatementInSwitch= rulestatementInSwitch EOF ;
    public final EObject entryRulestatementInSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatementInSwitch = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2536:2: (iv_rulestatementInSwitch= rulestatementInSwitch EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2537:2: iv_rulestatementInSwitch= rulestatementInSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementInSwitchRule()); 
            }
            pushFollow(FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch5260);
            iv_rulestatementInSwitch=rulestatementInSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementInSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatementInSwitch5270); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2544:1: rulestatementInSwitch returns [EObject current=null] : (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2547:28: ( (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2548:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2548:1: (this_Statement_0= ruleStatement | (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' ) | (otherlv_4= 'default' otherlv_5= ':' ) )
            int alt60=3;
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
                alt60=1;
                }
                break;
            case 49:
                {
                alt60=2;
                }
                break;
            case 50:
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2549:2: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_rulestatementInSwitch5320);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2561:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2561:6: (otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2561:8: otherlv_1= 'case' this_Expression_2= ruleExpression otherlv_3= ':'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_rulestatementInSwitch5338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementInSwitchAccess().getCaseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementInSwitchAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulestatementInSwitch5363);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulestatementInSwitch5374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementInSwitchAccess().getColonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:6: (otherlv_4= 'default' otherlv_5= ':' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:6: (otherlv_4= 'default' otherlv_5= ':' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2582:8: otherlv_4= 'default' otherlv_5= ':'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_rulestatementInSwitch5394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatementInSwitchAccess().getDefaultKeyword_2_0());
                          
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulestatementInSwitch5406); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2598:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2599:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2600:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn5443);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn5453); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2607:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2610:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2611:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2611:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2611:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleReturn5490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2615:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2616:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2616:1: (lv_expression_1_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2617:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturn5511);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleReturn5523); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2645:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2646:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2647:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5559);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration5569); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2654:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2657:28: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2658:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2658:1: ( ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2658:2: ( (lv_access_0_0= ruleAccessLevel ) )? (otherlv_1= 'static' )? otherlv_2= 'var' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleVarType ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? otherlv_8= ';'
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2658:2: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=106 && LA61_0<=109)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2659:1: (lv_access_0_0= ruleAccessLevel )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2659:1: (lv_access_0_0= ruleAccessLevel )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2660:3: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5615);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2676:3: (otherlv_1= 'static' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2676:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleVariableDeclaration5629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getStaticKeyword_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleVariableDeclaration5643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getVarKeyword_2());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2684:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2685:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2685:1: (lv_name_3_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2686:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration5660); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDeclaration5677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getColonKeyword_4());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2706:1: ( (lv_type_5_0= ruleVarType ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2707:1: (lv_type_5_0= ruleVarType )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2707:1: (lv_type_5_0= ruleVarType )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2708:3: lv_type_5_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVarTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleVariableDeclaration5698);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:2: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==25) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2724:4: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleVariableDeclaration5711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2728:1: ( (lv_expression_7_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2729:1: (lv_expression_7_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2729:1: (lv_expression_7_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2730:3: lv_expression_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration5732);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration5746); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2758:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2759:2: (iv_ruleVarType= ruleVarType EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2760:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVarType_in_entryRuleVarType5782);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarType5792); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2767:1: ruleVarType returns [EObject current=null] : ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2770:28: ( ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2771:1: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2771:1: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= '*' ) ) | ( ( ruleQualifiedName ) ) | ( ( ruleQualifiedName ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt64=1;
                }
                break;
            case 22:
                {
                alt64=2;
                }
                break;
            case RULE_ID:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred82_InternalAS3()) ) {
                    alt64=3;
                }
                else if ( (true) ) {
                    alt64=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2771:2: ( (lv_name_0_0= 'void' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2771:2: ( (lv_name_0_0= 'void' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2772:1: (lv_name_0_0= 'void' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2772:1: (lv_name_0_0= 'void' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2773:3: lv_name_0_0= 'void'
                    {
                    lv_name_0_0=(Token)match(input,23,FOLLOW_23_in_ruleVarType5835); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2787:6: ( (lv_name_1_0= '*' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2787:6: ( (lv_name_1_0= '*' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2788:1: (lv_name_1_0= '*' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2788:1: (lv_name_1_0= '*' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2789:3: lv_name_1_0= '*'
                    {
                    lv_name_1_0=(Token)match(input,22,FOLLOW_22_in_ruleVarType5872); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2803:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2803:6: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2804:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2804:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2805:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarType5918);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2822:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2822:6: ( ( ruleQualifiedName ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2823:1: ( ruleQualifiedName )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2823:1: ( ruleQualifiedName )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2824:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarType5951);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2848:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2849:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2850:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement5987);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement5997); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2857:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2860:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2861:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2861:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2861:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleIfStatement6034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIfStatement6046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2869:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2870:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2870:1: (lv_expression_2_0= ruleExpression )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2871:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement6067);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIfStatement6079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2891:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2892:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2892:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2893:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement6100);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred84_InternalAS3()) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleIfStatement6121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2914:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2915:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2915:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2916:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement6143);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2940:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryStatement = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2941:2: (iv_ruleTryStatement= ruleTryStatement EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2942:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTryStatement_in_entryRuleTryStatement6181);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryStatement6191); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2949:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2952:28: ( (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2953:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2953:1: (otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2953:3: otherlv_0= 'try' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )? (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleTryStatement6228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTryStatement6240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTryStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2961:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_INT)||LA66_0==12||LA66_0==17||LA66_0==22||LA66_0==25||LA66_0==27||LA66_0==33||LA66_0==35||(LA66_0>=41 && LA66_0<=43)||(LA66_0>=45 && LA66_0<=48)||(LA66_0>=51 && LA66_0<=52)||LA66_0==54||(LA66_0>=58 && LA66_0<=109)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2962:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2962:1: (lv_statements_2_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2963:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement6261);
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
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTryStatement6274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTryStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2983:1: (otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==55) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2983:3: otherlv_4= 'catch' otherlv_5= '(' ( (lv_params_6_0= ruleParameter ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleTryStatement6287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTryStatementAccess().getCatchKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTryStatement6299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTryStatementAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2991:1: ( (lv_params_6_0= ruleParameter ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2992:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2992:1: (lv_params_6_0= ruleParameter )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2993:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamsParameterParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleTryStatement6320);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTryStatement6332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTryStatementAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3013:3: (otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3013:5: otherlv_8= 'finally' ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_56_in_ruleTryStatement6347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTryStatementAccess().getFinallyKeyword_5_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3017:1: ( (lv_finallyBlock_9_0= ruleStatementsBlock ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3018:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3018:1: (lv_finallyBlock_9_0= ruleStatementsBlock )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3019:3: lv_finallyBlock_9_0= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinallyBlockStatementsBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleTryStatement6368);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3043:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3044:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3045:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock6406);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock6416); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3052:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_StatementsBlock_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3055:28: ( ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3056:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3056:1: ( ( (lv_statements_0_0= ruleStatement ) ) | this_StatementsBlock_1= ruleStatementsBlock )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_INT)||LA69_0==17||LA69_0==22||LA69_0==25||LA69_0==27||LA69_0==33||LA69_0==35||(LA69_0>=41 && LA69_0<=43)||(LA69_0>=45 && LA69_0<=48)||(LA69_0>=51 && LA69_0<=52)||LA69_0==54||(LA69_0>=58 && LA69_0<=109)) ) {
                alt69=1;
            }
            else if ( (LA69_0==12) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA69_3 = input.LA(3);

                    if ( (LA69_3==33) ) {
                        alt69=1;
                    }
                    else if ( (LA69_3==15||LA69_3==25||LA69_3==27) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA69_4 = input.LA(3);

                    if ( (LA69_4==33) ) {
                        alt69=1;
                    }
                    else if ( (LA69_4==15||LA69_4==25||LA69_4==27) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA69_5 = input.LA(3);

                    if ( (LA69_5==33) ) {
                        alt69=1;
                    }
                    else if ( (LA69_5==15||LA69_5==25||LA69_5==27) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 5, input);

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
                    alt69=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3056:2: ( (lv_statements_0_0= ruleStatement ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3056:2: ( (lv_statements_0_0= ruleStatement ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3057:1: (lv_statements_0_0= ruleStatement )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3057:1: (lv_statements_0_0= ruleStatement )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3058:3: lv_statements_0_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfBlock6462);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3076:2: this_StatementsBlock_1= ruleStatementsBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementsBlock_in_ruleIfBlock6493);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3095:1: entryRuleStatementsBlock returns [EObject current=null] : iv_ruleStatementsBlock= ruleStatementsBlock EOF ;
    public final EObject entryRuleStatementsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementsBlock = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3096:2: (iv_ruleStatementsBlock= ruleStatementsBlock EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3097:2: iv_ruleStatementsBlock= ruleStatementsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementsBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock6528);
            iv_ruleStatementsBlock=ruleStatementsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementsBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementsBlock6538); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3104:1: ruleStatementsBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleStatementsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3107:28: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3108:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3108:1: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3108:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatementsBlock6575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementsBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3112:1: ( (lv_statements_1_0= ruleStatement ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_INT)||LA70_0==12||LA70_0==17||LA70_0==22||LA70_0==25||LA70_0==27||LA70_0==33||LA70_0==35||(LA70_0>=41 && LA70_0<=43)||(LA70_0>=45 && LA70_0<=48)||(LA70_0>=51 && LA70_0<=52)||LA70_0==54||(LA70_0>=58 && LA70_0<=109)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3113:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3113:1: (lv_statements_1_0= ruleStatement )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3114:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementsBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementsBlock6596);
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
            	    break loop70;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatementsBlock6609); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3144:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3145:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3146:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter6647);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter6657); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3153:1: ruleParameter returns [EObject current=null] : ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )? (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_lit_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3156:28: ( ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )? (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3157:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )? (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3157:1: ( (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )? (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3157:2: (otherlv_0= 'const' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )? (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )?
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3157:2: (otherlv_0= 'const' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==57) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3157:4: otherlv_0= 'const'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleParameter6695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getConstKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3161:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3162:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3162:1: (lv_name_1_0= RULE_ID )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3163:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter6714); if (state.failed) return current;
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3179:2: (otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==33) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3179:4: otherlv_2= ':' ( (lv_type_3_0= ruleVarType ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParameter6732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3183:1: ( (lv_type_3_0= ruleVarType ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3184:1: (lv_type_3_0= ruleVarType )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3184:1: (lv_type_3_0= ruleVarType )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3185:3: lv_type_3_0= ruleVarType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeVarTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarType_in_ruleParameter6753);
                    lv_type_3_0=ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"VarType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3201:4: (otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3201:6: otherlv_4= '=' ( (lv_lit_5_0= ruleexprOrObjectLiteral ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleParameter6768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3205:1: ( (lv_lit_5_0= ruleexprOrObjectLiteral ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3206:1: (lv_lit_5_0= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3206:1: (lv_lit_5_0= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3207:3: lv_lit_5_0= ruleexprOrObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getLitExprOrObjectLiteralParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6789);
                    lv_lit_5_0=ruleexprOrObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"lit",
                              		lv_lit_5_0, 
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3231:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3232:2: (iv_ruleParameters= ruleParameters EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3233:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters6827);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters6837); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3240:1: ruleParameters returns [EObject current=null] : ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_type_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3243:28: ( ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:1: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? | ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? ) )
            int alt79=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA79_1 = input.LA(2);

                if ( (synpred95_InternalAS3()) ) {
                    alt79=1;
                }
                else if ( (true) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA79_2 = input.LA(2);

                if ( (synpred95_InternalAS3()) ) {
                    alt79=1;
                }
                else if ( (true) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 18:
                {
                alt79=1;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_ID||LA75_0==57) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:3: ( (lv_elements_0_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3245:1: (lv_elements_0_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3245:1: (lv_elements_0_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:3: lv_elements_0_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters6884);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3262:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==24) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3262:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                            	    {
                            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleParameters6897); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3266:1: ( (lv_elements_2_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3267:1: (lv_elements_2_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3267:1: (lv_elements_2_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3268:3: lv_elements_2_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters6918);
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
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:6: ( ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )? )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )? ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:8: ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ','
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3285:8: ( (lv_elements_3_0= ruleParameter ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3286:1: (lv_elements_3_0= ruleParameter )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3286:1: (lv_elements_3_0= ruleParameter )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3287:3: lv_elements_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameters6951);
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

                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                alt76 = dfa76.predict(input);
                                switch (alt76) {
                            	case 1 :
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3303:4: otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleParameters6964); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getCommaKeyword_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3307:1: ( (lv_elements_5_0= ruleParameter ) )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3308:1: (lv_elements_5_0= ruleParameter )
                            	    {
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3308:1: (lv_elements_5_0= ruleParameter )
                            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3309:3: lv_elements_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters6985);
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
                            	    break loop76;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleParameters6999); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getParametersAccess().getCommaKeyword_1_0_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3329:3: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3330:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3330:1: (lv_name_7_0= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3331:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters7018); if (state.failed) return current;
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3347:2: (otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==33) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3347:4: otherlv_8= ':' ( (lv_type_9_0= ruleVarType ) )
                            {
                            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleParameters7036); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getParametersAccess().getColonKeyword_1_2_0());
                                  
                            }
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3351:1: ( (lv_type_9_0= ruleVarType ) )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3352:1: (lv_type_9_0= ruleVarType )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3352:1: (lv_type_9_0= ruleVarType )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3353:3: lv_type_9_0= ruleVarType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParametersAccess().getTypeVarTypeParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarType_in_ruleParameters7057);
                            lv_type_9_0=ruleVarType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParametersRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"type",
                                      		lv_type_9_0, 
                                      		"VarType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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


    // $ANTLR start "entryRuleobjectLiteral"
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3377:1: entryRuleobjectLiteral returns [EObject current=null] : iv_ruleobjectLiteral= ruleobjectLiteral EOF ;
    public final EObject entryRuleobjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3378:2: (iv_ruleobjectLiteral= ruleobjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3379:2: iv_ruleobjectLiteral= ruleobjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral7096);
            iv_ruleobjectLiteral=ruleobjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectLiteral7106); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3386:1: ruleobjectLiteral returns [EObject current=null] : (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) ;
    public final EObject ruleobjectLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_objectFields_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3389:28: ( (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3390:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3390:1: (otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}' )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3390:3: otherlv_0= '{' this_objectFields_1= ruleobjectFields otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleobjectLiteral7143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getObjectLiteralAccess().getObjectFieldsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleobjectFields_in_ruleobjectLiteral7168);
            this_objectFields_1=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_objectFields_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleobjectLiteral7179); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3418:1: entryRuleobjectFields returns [EObject current=null] : iv_ruleobjectFields= ruleobjectFields EOF ;
    public final EObject entryRuleobjectFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectFields = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3419:2: (iv_ruleobjectFields= ruleobjectFields EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3420:2: iv_ruleobjectFields= ruleobjectFields EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldsRule()); 
            }
            pushFollow(FOLLOW_ruleobjectFields_in_entryRuleobjectFields7215);
            iv_ruleobjectFields=ruleobjectFields();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectFields; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectFields7225); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3427:1: ruleobjectFields returns [EObject current=null] : ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) ;
    public final EObject ruleobjectFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3430:28: ( ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:1: ( ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:2: ( (lv_fields_0_0= ruleobjectField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3431:2: ( (lv_fields_0_0= ruleobjectField ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3432:1: (lv_fields_0_0= ruleobjectField )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3432:1: (lv_fields_0_0= ruleobjectField )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3433:3: lv_fields_0_0= ruleobjectField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields7271);
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

            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3449:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==24) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3449:4: otherlv_1= ',' ( (lv_fields_2_0= ruleobjectField ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleobjectFields7284); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3453:1: ( (lv_fields_2_0= ruleobjectField ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3454:1: (lv_fields_2_0= ruleobjectField )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3454:1: (lv_fields_2_0= ruleobjectField )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3455:3: lv_fields_2_0= ruleobjectField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectFieldsAccess().getFieldsObjectFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleobjectField_in_ruleobjectFields7305);
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
            	    break loop80;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3479:1: entryRuleobjectField returns [EObject current=null] : iv_ruleobjectField= ruleobjectField EOF ;
    public final EObject entryRuleobjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectField = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3480:2: (iv_ruleobjectField= ruleobjectField EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3481:2: iv_ruleobjectField= ruleobjectField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFieldRule()); 
            }
            pushFollow(FOLLOW_ruleobjectField_in_entryRuleobjectField7343);
            iv_ruleobjectField=ruleobjectField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleobjectField7353); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3488:1: ruleobjectField returns [EObject current=null] : ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3491:28: ( ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3492:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3492:1: ( (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral ) | (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral ) | (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral ) )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt81=1;
                }
                break;
            case RULE_STRING:
                {
                alt81=2;
                }
                break;
            case RULE_INT:
                {
                alt81=3;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3492:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3492:2: (this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3492:3: this_ID_0= RULE_ID otherlv_1= ':' this_exprOrObjectLiteral_2= ruleexprOrObjectLiteral
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleobjectField7390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7426);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3513:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3513:6: (this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3513:7: this_STRING_3= RULE_STRING otherlv_4= ':' this_exprOrObjectLiteral_5= ruleexprOrObjectLiteral
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleobjectField7444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getObjectFieldAccess().getColonKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7480);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3534:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3534:6: (this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3534:7: this_INT_6= RULE_INT otherlv_7= ':' this_exprOrObjectLiteral_8= ruleexprOrObjectLiteral
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleobjectField7498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()); 
                          
                    }
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleobjectField7509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getObjectFieldAccess().getColonKeyword_2_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getObjectFieldAccess().getExprOrObjectLiteralParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7534);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3562:1: entryRuleexprOrObjectLiteral returns [EObject current=null] : iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF ;
    public final EObject entryRuleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexprOrObjectLiteral = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3563:2: (iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3564:2: iv_ruleexprOrObjectLiteral= ruleexprOrObjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7570);
            iv_ruleexprOrObjectLiteral=ruleexprOrObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprOrObjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7580); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3571:1: ruleexprOrObjectLiteral returns [EObject current=null] : (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) ;
    public final EObject ruleexprOrObjectLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_objectLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3574:28: ( (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3575:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3575:1: (this_Expression_0= ruleExpression | this_objectLiteral_1= ruleobjectLiteral )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_INT)||LA82_0==17||LA82_0==22||LA82_0==25||LA82_0==27||LA82_0==33||LA82_0==45||(LA82_0>=58 && LA82_0<=105)) ) {
                alt82=1;
            }
            else if ( (LA82_0==12) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3576:2: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7630);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3589:2: this_objectLiteral_1= ruleobjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprOrObjectLiteralAccess().getObjectLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7660);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3610:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3611:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3612:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7697);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7707); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3619:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3622:28: (this_Assignment_0= ruleAssignment )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3624:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression7756);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3643:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3644:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3645:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment7790);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment7800); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3652:1: ruleAssignment returns [EObject current=null] : (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SelectionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3655:28: ( (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3656:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3656:1: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3657:2: this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_ruleAssignment7850);
            this_SelectionExpression_0=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3668:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==25) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3668:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3668:2: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3669:2: 
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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAssignment7874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3681:1: ( (lv_right_3_0= ruleExpression ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3682:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3682:1: (lv_right_3_0= ruleExpression )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3683:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment7895);
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3707:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3708:2: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3709:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression7933);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression7943); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3716:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3719:28: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3720:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3720:1: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3721:2: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression7993);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3732:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==27) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3732:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3732:2: ()
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3733:2: 
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

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSelectionExpression8017); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3745:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3746:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3746:1: (otherlv_3= RULE_ID )
            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3747:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionExpression8041); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3761:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==17) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3761:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3761:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3762:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3762:1: (lv_methodinvocation_4_0= '(' )
            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3763:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,17,FOLLOW_17_in_ruleSelectionExpression8060); if (state.failed) return current;
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

            	            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3776:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt85=2;
            	            int LA85_0 = input.LA(1);

            	            if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_INT)||LA85_0==17||LA85_0==22||LA85_0==25||LA85_0==27||LA85_0==33||LA85_0==45||(LA85_0>=58 && LA85_0<=105)) ) {
            	                alt85=1;
            	            }
            	            switch (alt85) {
            	                case 1 :
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3776:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3776:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3777:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3777:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3778:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression8095);
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

            	                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3794:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop84:
            	                    do {
            	                        int alt84=2;
            	                        int LA84_0 = input.LA(1);

            	                        if ( (LA84_0==24) ) {
            	                            alt84=1;
            	                        }


            	                        switch (alt84) {
            	                    	case 1 :
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3794:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleSelectionExpression8108); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3798:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3799:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3799:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3800:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSelectionExpression8129);
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
            	                    	    break loop84;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSelectionExpression8145); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3828:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3829:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3830:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression8185);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression8195); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3837:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? ) | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'undefined' ) | ( () ( (otherlv_18= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_expr_11_0 = null;

        EObject lv_expr_23_0 = null;


         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3840:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? ) | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'undefined' ) | ( () ( (otherlv_18= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? ) | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'undefined' ) | ( () ( (otherlv_18= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? ) | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'undefined' ) | ( () ( (otherlv_18= RULE_ID ) ) ) | ( () ruleTerminalOperator ) | ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' ) )
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3841:3: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3842:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3850:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3851:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3851:1: (lv_value_1_0= RULE_STRING )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3852:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression8250); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3869:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3869:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3869:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3869:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3870:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3878:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3879:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3879:1: (lv_value_3_0= RULE_INT )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3880:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression8292); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3897:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3897:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3897:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3897:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3898:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3906:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3907:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3907:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3908:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3908:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==58) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==59) ) {
                        alt88=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3909:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,58,FOLLOW_58_in_ruleTerminalExpression8337); if (state.failed) return current;
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
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3921:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,59,FOLLOW_59_in_ruleTerminalExpression8366); if (state.failed) return current;
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3937:6: ( () otherlv_7= 'this' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3937:6: ( () otherlv_7= 'this' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3937:7: () otherlv_7= 'this'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3937:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3938:2: 
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

                    otherlv_7=(Token)match(input,60,FOLLOW_60_in_ruleTerminalExpression8414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3951:6: ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3951:6: ( () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )? )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3951:7: () otherlv_9= 'super' (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )?
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3951:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3952:2: 
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

                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleTerminalExpression8446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3964:1: (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')' )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==17) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3964:3: otherlv_10= '(' ( (lv_expr_11_0= ruleExpression ) )? otherlv_12= ')'
                            {
                            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleTerminalExpression8459); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2_0());
                                  
                            }
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3968:1: ( (lv_expr_11_0= ruleExpression ) )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( ((LA89_0>=RULE_ID && LA89_0<=RULE_INT)||LA89_0==17||LA89_0==22||LA89_0==25||LA89_0==27||LA89_0==33||LA89_0==45||(LA89_0>=58 && LA89_0<=105)) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3969:1: (lv_expr_11_0= ruleExpression )
                                    {
                                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3969:1: (lv_expr_11_0= ruleExpression )
                                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3970:3: lv_expr_11_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_4_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression8480);
                                    lv_expr_11_0=ruleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"expr",
                                              		lv_expr_11_0, 
                                              		"Expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleTerminalExpression8493); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3991:6: ( () otherlv_14= 'null' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3991:6: ( () otherlv_14= 'null' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3991:7: () otherlv_14= 'null'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3991:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3992:2: 
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

                    otherlv_14=(Token)match(input,62,FOLLOW_62_in_ruleTerminalExpression8527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4005:6: ( () otherlv_16= 'undefined' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4005:6: ( () otherlv_16= 'undefined' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4005:7: () otherlv_16= 'undefined'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4005:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4006:2: 
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

                    otherlv_16=(Token)match(input,63,FOLLOW_63_in_ruleTerminalExpression8559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getTerminalExpressionAccess().getUndefinedKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4019:6: ( () ( (otherlv_18= RULE_ID ) ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4019:6: ( () ( (otherlv_18= RULE_ID ) ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4019:7: () ( (otherlv_18= RULE_ID ) )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4019:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4020:2: 
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

                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4028:2: ( (otherlv_18= RULE_ID ) )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4029:1: (otherlv_18= RULE_ID )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4029:1: (otherlv_18= RULE_ID )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4030:3: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression8603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4045:6: ( () ruleTerminalOperator )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4045:6: ( () ruleTerminalOperator )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4045:7: () ruleTerminalOperator
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4045:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4046:2: 
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
                    pushFollow(FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8642);
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4066:6: ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4066:6: ( () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4066:7: () otherlv_22= '(' ( (lv_expr_23_0= ruleExpression ) )? otherlv_24= ')'
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4066:7: ()
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4067:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalExpressionAccess().getBracketExprAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleTerminalExpression8673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4079:1: ( (lv_expr_23_0= ruleExpression ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( ((LA91_0>=RULE_ID && LA91_0<=RULE_INT)||LA91_0==17||LA91_0==22||LA91_0==25||LA91_0==27||LA91_0==33||LA91_0==45||(LA91_0>=58 && LA91_0<=105)) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4080:1: (lv_expr_23_0= ruleExpression )
                            {
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4080:1: (lv_expr_23_0= ruleExpression )
                            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4081:3: lv_expr_23_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_9_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression8694);
                            lv_expr_23_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expr",
                                      		lv_expr_23_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,18,FOLLOW_18_in_ruleTerminalExpression8707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_9_3());
                          
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4109:1: entryRuleTerminalOperator returns [String current=null] : iv_ruleTerminalOperator= ruleTerminalOperator EOF ;
    public final String entryRuleTerminalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalOperator = null;


        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4110:2: (iv_ruleTerminalOperator= ruleTerminalOperator EOF )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4111:2: iv_ruleTerminalOperator= ruleTerminalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8745);
            iv_ruleTerminalOperator=ruleTerminalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalOperator8756); if (state.failed) return current;

            }

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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4118:1: ruleTerminalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTerminalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4121:28: ( (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4122:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4122:1: (kw= '=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '?:' | kw= '||' | kw= '&&' | kw= '|' | kw= '^' | kw= '&' | kw= '==' | kw= '!=' | kw= '===' | kw= '!==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'as' | kw= 'in' | kw= 'instanceof' | kw= 'is' | kw= '<<' | kw= '>>' | kw= '>>>' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '!' | kw= '~' | kw= 'typeof' | kw= '.' | kw= '::' | kw= '?' | kw= ':' )
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4123:2: kw= '='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleTerminalOperator8794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4130:2: kw= '*='
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleTerminalOperator8813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4137:2: kw= '/='
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleTerminalOperator8832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4144:2: kw= '%='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleTerminalOperator8851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4151:2: kw= '+='
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleTerminalOperator8870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4158:2: kw= '-='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleTerminalOperator8889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4165:2: kw= '<<='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleTerminalOperator8908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4172:2: kw= '>>='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleTerminalOperator8927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4179:2: kw= '>>>='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleTerminalOperator8946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4186:2: kw= '&='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleTerminalOperator8965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandEqualsSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4193:2: kw= '^='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleTerminalOperator8984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentEqualsSignKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4200:2: kw= '|='
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleTerminalOperator9003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineEqualsSignKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4207:2: kw= '?:'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleTerminalOperator9022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getQuestionMarkColonKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4214:2: kw= '||'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleTerminalOperator9041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineVerticalLineKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4221:2: kw= '&&'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleTerminalOperator9060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandAmpersandKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4228:2: kw= '|'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTerminalOperator9079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getVerticalLineKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4235:2: kw= '^'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleTerminalOperator9098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getCircumflexAccentKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4242:2: kw= '&'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleTerminalOperator9117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAmpersandKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4249:2: kw= '=='
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleTerminalOperator9136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4256:2: kw= '!='
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleTerminalOperator9155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4263:2: kw= '==='
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleTerminalOperator9174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4270:2: kw= '!=='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleTerminalOperator9193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4277:2: kw= '<'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTerminalOperator9212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4284:2: kw= '>'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTerminalOperator9231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4291:2: kw= '<='
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleTerminalOperator9250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignEqualsSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4298:2: kw= '>='
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTerminalOperator9269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignEqualsSignKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4305:2: kw= 'as'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleTerminalOperator9288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4312:2: kw= 'in'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleTerminalOperator9307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4319:2: kw= 'instanceof'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTerminalOperator9326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getInstanceofKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4326:2: kw= 'is'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleTerminalOperator9345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getIsKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4333:2: kw= '<<'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTerminalOperator9364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getLessThanSignLessThanSignKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4340:2: kw= '>>'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleTerminalOperator9383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4347:2: kw= '>>>'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleTerminalOperator9402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4354:2: kw= '+'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleTerminalOperator9421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4361:2: kw= '-'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleTerminalOperator9440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4368:2: kw= '*'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTerminalOperator9459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getAsteriskKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4375:2: kw= '/'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleTerminalOperator9478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getSolidusKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4382:2: kw= '%'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTerminalOperator9497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPercentSignKeyword_37()); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4389:2: kw= '++'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTerminalOperator9516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getPlusSignPlusSignKeyword_38()); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4396:2: kw= '--'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleTerminalOperator9535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getHyphenMinusHyphenMinusKeyword_39()); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4403:2: kw= '!'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleTerminalOperator9554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getExclamationMarkKeyword_40()); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4410:2: kw= '~'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleTerminalOperator9573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTildeKeyword_41()); 
                          
                    }

                    }
                    break;
                case 43 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4417:2: kw= 'typeof'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleTerminalOperator9592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getTypeofKeyword_42()); 
                          
                    }

                    }
                    break;
                case 44 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4424:2: kw= '.'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTerminalOperator9611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getFullStopKeyword_43()); 
                          
                    }

                    }
                    break;
                case 45 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4431:2: kw= '::'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleTerminalOperator9630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getColonColonKeyword_44()); 
                          
                    }

                    }
                    break;
                case 46 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4438:2: kw= '?'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleTerminalOperator9649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalOperatorAccess().getQuestionMarkKeyword_45()); 
                          
                    }

                    }
                    break;
                case 47 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4445:2: kw= ':'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTerminalOperator9668); if (state.failed) return current;
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
    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4458:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4460:28: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) ) )
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:1: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) )
            {
            // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:1: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'public' ) | (enumLiteral_3= 'protected' ) )
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
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:2: (enumLiteral_0= 'internal' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:2: (enumLiteral_0= 'internal' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4461:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_106_in_ruleAccessLevel9722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getINTERNALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4467:6: (enumLiteral_1= 'private' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4467:6: (enumLiteral_1= 'private' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4467:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_107_in_ruleAccessLevel9739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4473:6: (enumLiteral_2= 'public' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4473:6: (enumLiteral_2= 'public' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4473:8: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_108_in_ruleAccessLevel9756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4479:6: (enumLiteral_3= 'protected' )
                    {
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4479:6: (enumLiteral_3= 'protected' )
                    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:4479:8: enumLiteral_3= 'protected'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_109_in_ruleAccessLevel9773); if (state.failed) return current;
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

    // $ANTLR start synpred57_InternalAS3
    public final void synpred57_InternalAS3_fragment() throws RecognitionException {   
        EObject lv_param_4_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:1: ( (lv_param_4_0= ruleParameters ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:1: (lv_param_4_0= ruleParameters )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1681:1: (lv_param_4_0= ruleParameters )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:1682:3: lv_param_4_0= ruleParameters
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewStatementAccess().getParamParametersParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameters_in_synpred57_InternalAS33600);
        lv_param_4_0=ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalAS3

    // $ANTLR start synpred82_InternalAS3
    public final void synpred82_InternalAS3_fragment() throws RecognitionException {   
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2803:6: ( ( ( ruleQualifiedName ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2803:6: ( ( ruleQualifiedName ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2803:6: ( ( ruleQualifiedName ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2804:1: ( ruleQualifiedName )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2804:1: ( ruleQualifiedName )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2805:3: ruleQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred82_InternalAS35918);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred82_InternalAS3

    // $ANTLR start synpred84_InternalAS3
    public final void synpred84_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseBlock_6_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2909:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,53,FOLLOW_53_in_synpred84_InternalAS36121); if (state.failed) return ;

        }

        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2914:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2915:1: (lv_elseBlock_6_0= ruleIfBlock )
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2915:1: (lv_elseBlock_6_0= ruleIfBlock )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:2916:3: lv_elseBlock_6_0= ruleIfBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIfBlock_in_synpred84_InternalAS36143);
        lv_elseBlock_6_0=ruleIfBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred84_InternalAS3

    // $ANTLR start synpred95_InternalAS3
    public final void synpred95_InternalAS3_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:2: ( ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )? )
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        {
        // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:2: ( ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )* )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==RULE_ID||LA111_0==57) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:3: ( (lv_elements_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3244:3: ( (lv_elements_0_0= ruleParameter ) )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3245:1: (lv_elements_0_0= ruleParameter )
                {
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3245:1: (lv_elements_0_0= ruleParameter )
                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3246:3: lv_elements_0_0= ruleParameter
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleParameter_in_synpred95_InternalAS36884);
                lv_elements_0_0=ruleParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3262:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) ) )*
                loop110:
                do {
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==24) ) {
                        alt110=1;
                    }


                    switch (alt110) {
                	case 1 :
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3262:4: otherlv_1= ',' ( (lv_elements_2_0= ruleParameter ) )
                	    {
                	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_synpred95_InternalAS36897); if (state.failed) return ;
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3266:1: ( (lv_elements_2_0= ruleParameter ) )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3267:1: (lv_elements_2_0= ruleParameter )
                	    {
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3267:1: (lv_elements_2_0= ruleParameter )
                	    // ../de.lynorics.eclipse.jangaroo/src-gen/de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.g:3268:3: lv_elements_2_0= ruleParameter
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getParametersAccess().getElementsParameterParserRuleCall_0_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleParameter_in_synpred95_InternalAS36918);
                	    lv_elements_2_0=ruleParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop110;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred95_InternalAS3

    // Delegated rules

    public final boolean synpred95_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalAS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalAS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA55 dfa55 = new DFA55(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA55_eotS =
        "\22\uffff";
    static final String DFA55_eofS =
        "\22\uffff";
    static final String DFA55_minS =
        "\1\52\2\21\3\4\1\uffff\1\17\2\uffff\1\17\1\4\1\uffff\3\17\1\4\1"+
        "\17";
    static final String DFA55_maxS =
        "\1\52\1\54\1\21\1\151\1\53\1\4\1\uffff\1\55\2\uffff\1\55\1\27\1"+
        "\uffff\3\55\1\4\1\55";
    static final String DFA55_acceptS =
        "\6\uffff\1\1\1\uffff\1\4\1\3\2\uffff\1\2\5\uffff";
    static final String DFA55_specialS =
        "\22\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1",
            "\1\3\32\uffff\1\2",
            "\1\4",
            "\1\7\2\6\10\uffff\1\6\1\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1"+
            "\uffff\1\6\5\uffff\1\6\11\uffff\1\5\1\uffff\1\6\14\uffff\60"+
            "\6",
            "\1\11\46\uffff\1\10",
            "\1\12",
            "",
            "\1\6\10\uffff\2\6\1\uffff\1\6\21\uffff\1\11",
            "",
            "",
            "\1\14\10\uffff\2\14\7\uffff\1\13\13\uffff\1\10",
            "\1\17\21\uffff\1\16\1\15",
            "",
            "\1\14\10\uffff\2\14\23\uffff\1\10",
            "\1\14\10\uffff\2\14\23\uffff\1\10",
            "\1\14\10\uffff\2\14\1\uffff\1\20\21\uffff\1\10",
            "\1\21",
            "\1\14\10\uffff\2\14\1\uffff\1\20\21\uffff\1\10"
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
            return "1723:1: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_forinit_2_0= rulecommaExpr ) )? otherlv_3= ';' ( (lv_condition_4_0= rulecommaExpr ) )? otherlv_5= ';' ( (lv_iterator_6_0= rulecommaExpr ) )? otherlv_7= ')' ( (lv_command_8_0= ruleStatementsBlock ) ) ) | (otherlv_9= 'for' otherlv_10= '(' otherlv_11= 'var' ( (lv_elements_12_0= ruleidentifierDeclaration ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleidentifierDeclaration ) ) )* otherlv_15= ';' ( (lv_condition_16_0= rulecommaExpr ) )? otherlv_17= ';' ( (lv_iterator_18_0= rulecommaExpr ) )? otherlv_19= ')' ( (lv_command_20_0= ruleStatementsBlock ) ) ) | (otherlv_21= 'for' (otherlv_22= 'each' )? otherlv_23= '(' ( (lv_nameForin_24_0= RULE_ID ) ) otherlv_25= 'in' ( (lv_forinexpr_26_0= ruleExpression ) ) otherlv_27= ')' ( (lv_forcommand_28_0= ruleStatementsBlock ) ) ) | (otherlv_29= 'for' (otherlv_30= 'each' )? otherlv_31= '(' otherlv_32= 'var' ( (lv_nameForeachh_33_0= RULE_ID ) ) (otherlv_34= ':' ( (lv_type_35_0= ruleVarType ) ) )? otherlv_36= 'in' ( (lv_foreachexpr_37_0= ruleExpression ) ) otherlv_38= ')' ( (lv_foreachcommand_39_0= ruleStatementsBlock ) ) ) )";
        }
    }
    static final String DFA77_eotS =
        "\12\uffff";
    static final String DFA77_eofS =
        "\2\uffff\1\4\2\uffff\3\4\1\uffff\1\4";
    static final String DFA77_minS =
        "\1\4\1\uffff\1\22\1\4\1\uffff\3\22\1\4\1\22";
    static final String DFA77_maxS =
        "\1\71\1\uffff\1\41\1\27\1\uffff\2\31\1\33\1\4\1\33";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA77_specialS =
        "\12\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\2\64\uffff\1\1",
            "",
            "\1\4\5\uffff\2\1\7\uffff\1\3",
            "\1\7\21\uffff\1\6\1\5",
            "",
            "\1\4\5\uffff\2\1",
            "\1\4\5\uffff\2\1",
            "\1\4\5\uffff\2\1\1\uffff\1\10",
            "\1\11",
            "\1\4\5\uffff\2\1\1\uffff\1\10"
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "3285:7: ( ( (lv_elements_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )* otherlv_6= ',' )?";
        }
    }
    static final String DFA76_eotS =
        "\13\uffff";
    static final String DFA76_eofS =
        "\2\uffff\1\5\3\uffff\3\5\1\uffff\1\5";
    static final String DFA76_minS =
        "\1\30\1\4\1\22\1\uffff\1\4\1\uffff\3\22\1\4\1\22";
    static final String DFA76_maxS =
        "\1\30\1\71\1\41\1\uffff\1\27\1\uffff\2\31\1\33\1\4\1\33";
    static final String DFA76_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\5\uffff";
    static final String DFA76_specialS =
        "\13\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1",
            "\1\2\64\uffff\1\3",
            "\1\5\5\uffff\2\3\7\uffff\1\4",
            "",
            "\1\10\21\uffff\1\7\1\6",
            "",
            "\1\5\5\uffff\2\3",
            "\1\5\5\uffff\2\3",
            "\1\5\5\uffff\2\3\1\uffff\1\11",
            "\1\12",
            "\1\5\5\uffff\2\3\1\uffff\1\11"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()* loopback of 3303:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleParameter ) ) )*";
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
    public static final BitSet FOLLOW_33_in_ruleInterfaceMethod2025 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleInterfaceMethod2046 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceMethod2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleClass2155 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_34_in_ruleClass2169 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35_in_ruleClass2184 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_ruleClass2199 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleClass2213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass2230 = new BitSet(new long[]{0x0000004020001000L});
    public static final BitSet FOLLOW_29_in_ruleClass2248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2275 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_38_in_ruleClass2290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2317 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_ruleClass2330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass2357 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_12_in_ruleClass2373 = new BitSet(new long[]{0x0000098840002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass2394 = new BitSet(new long[]{0x0000098840002000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_13_in_ruleClass2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleMember2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMethod2610 = new BitSet(new long[]{0x0000010840000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleMethod2633 = new BitSet(new long[]{0x0000010840000000L});
    public static final BitSet FOLLOW_40_in_ruleMethod2647 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_35_in_ruleMethod2662 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMethod2676 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_31_in_ruleMethod2689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleMethod2707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2726 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod2743 = new BitSet(new long[]{0x0200000000040010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2765 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleMethod2778 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2799 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod2815 = new BitSet(new long[]{0x0000000200009000L});
    public static final BitSet FOLLOW_33_in_ruleMethod2828 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleMethod2849 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleMethodBody_in_ruleMethod2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMethod2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodBody_in_entryRuleMethodBody2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodBody2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMethodBody2987 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethodBody3008 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleMethodBody3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleStatement3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_ruleStatement3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_ruleStatement3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_ruleStatement3402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleStatement3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewStatement_in_entryRuleNewStatement3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewStatement3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNewStatement3539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewStatement3566 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNewStatement3579 = new BitSet(new long[]{0x0200000000040010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleNewStatement3600 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNewStatement3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement3651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3711 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3732 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3745 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3779 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement3813 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement3854 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement3866 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleForStatement3878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3899 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleForStatement3912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_ruleForStatement3933 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3947 = new BitSet(new long[]{0xFC0020020A428070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement3968 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForStatement3981 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_rulecommaExpr_in_ruleForStatement4002 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4015 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement4056 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleForStatement4069 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement4083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement4100 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4117 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4150 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleForStatement4191 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleForStatement4204 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement4218 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleForStatement4230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForStatement4247 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_33_in_ruleForStatement4265 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleForStatement4286 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4300 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4321 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4333 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleForStatement4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifierDeclaration_in_entryRuleidentifierDeclaration4391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifierDeclaration4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifierDeclaration4443 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_33_in_ruleidentifierDeclaration4461 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleidentifierDeclaration4482 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleidentifierDeclaration4497 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleidentifierDeclaration4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecommaExpr_in_entryRulecommaExpr4556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecommaExpr4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4612 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulecommaExpr4625 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulecommaExpr4646 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleDoWhileStatement_in_entryRuleDoWhileStatement4684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileStatement4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDoWhileStatement4743 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleDoWhileStatement4764 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDoWhileStatement4776 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleDoWhileStatement4797 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDoWhileStatement4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleWhileStatement4904 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleWhileStatement4925 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleWhileStatement4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement4982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSwitchStatement5041 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_ruleSwitchStatement5062 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSwitchStatement5074 = new BitSet(new long[]{0xFC5FEE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_ruleSwitchStatement5095 = new BitSet(new long[]{0xFC5FEE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleSwitchStatement5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparenthesizedExpr_in_entryRuleparenthesizedExpr5144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparenthesizedExpr5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleparenthesizedExpr5191 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleparenthesizedExpr5212 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleparenthesizedExpr5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatementInSwitch_in_entryRulestatementInSwitch5260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatementInSwitch5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulestatementInSwitch5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulestatementInSwitch5338 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulestatementInSwitch5363 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatementInSwitch5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulestatementInSwitch5394 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatementInSwitch5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn5443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReturn5490 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturn5511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReturn5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration5559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessLevel_in_ruleVariableDeclaration5615 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_35_in_ruleVariableDeclaration5629 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleVariableDeclaration5643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration5660 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDeclaration5677 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleVariableDeclaration5698 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDeclaration5711 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration5732 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarType_in_entryRuleVarType5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarType5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVarType5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVarType5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarType5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarType5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement5987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIfStatement6034 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIfStatement6046 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement6067 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfStatement6079 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement6100 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIfStatement6121 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_entryRuleTryStatement6181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryStatement6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTryStatement6228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTryStatement6240 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement6261 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleTryStatement6274 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTryStatement6287 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTryStatement6299 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTryStatement6320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTryStatement6332 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTryStatement6347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleTryStatement6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock6406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfBlock6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_ruleIfBlock6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementsBlock_in_entryRuleStatementsBlock6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementsBlock6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatementsBlock6575 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementsBlock6596 = new BitSet(new long[]{0xFC59EE0A0A423070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleStatementsBlock6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter6647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleParameter6695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter6714 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_33_in_ruleParameter6732 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleParameter6753 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameter6768 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleParameter6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters6827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6884 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameters6897 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6918 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6951 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameters6964 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters6985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameters6999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters7018 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleParameters7036 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleParameters7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_entryRuleobjectLiteral7096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectLiteral7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleobjectLiteral7143 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectFields_in_ruleobjectLiteral7168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleobjectLiteral7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectFields_in_entryRuleobjectFields7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectFields7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields7271 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleobjectFields7284 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleobjectField_in_ruleobjectFields7305 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleobjectField_in_entryRuleobjectField7343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleobjectField7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleobjectField7390 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7401 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleobjectField7444 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7455 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleobjectField7498 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleobjectField7509 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_ruleobjectField7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexprOrObjectLiteral_in_entryRuleexprOrObjectLiteral7570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexprOrObjectLiteral7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleexprOrObjectLiteral7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleobjectLiteral_in_ruleexprOrObjectLiteral7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment7790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_ruleAssignment7850 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAssignment7874 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression7933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleSelectionExpression7993 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleSelectionExpression8017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionExpression8041 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_17_in_ruleSelectionExpression8060 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression8095 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleSelectionExpression8108 = new BitSet(new long[]{0xFC0020020A420070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectionExpression8129 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleSelectionExpression8145 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression8185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTerminalExpression8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTerminalExpression8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTerminalExpression8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTerminalExpression8446 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression8459 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression8480 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerminalExpression8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTerminalExpression8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTerminalExpression8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_ruleTerminalExpression8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression8673 = new BitSet(new long[]{0xFC0020020A460070L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression8694 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerminalExpression8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalOperator_in_entryRuleTerminalOperator8745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalOperator8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTerminalOperator8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTerminalOperator8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTerminalOperator8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTerminalOperator8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTerminalOperator8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTerminalOperator8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTerminalOperator8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTerminalOperator8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTerminalOperator8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTerminalOperator8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTerminalOperator8984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTerminalOperator9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTerminalOperator9022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTerminalOperator9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTerminalOperator9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTerminalOperator9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTerminalOperator9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTerminalOperator9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTerminalOperator9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTerminalOperator9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTerminalOperator9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTerminalOperator9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTerminalOperator9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTerminalOperator9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTerminalOperator9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTerminalOperator9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTerminalOperator9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalOperator9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTerminalOperator9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleTerminalOperator9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTerminalOperator9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTerminalOperator9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTerminalOperator9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTerminalOperator9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTerminalOperator9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminalOperator9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTerminalOperator9478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTerminalOperator9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTerminalOperator9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTerminalOperator9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTerminalOperator9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTerminalOperator9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTerminalOperator9592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTerminalOperator9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleTerminalOperator9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleTerminalOperator9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTerminalOperator9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAccessLevel9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAccessLevel9739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAccessLevel9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleAccessLevel9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_synpred57_InternalAS33600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred82_InternalAS35918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred84_InternalAS36121 = new BitSet(new long[]{0xFC59EE0A0A421070L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ruleIfBlock_in_synpred84_InternalAS36143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred95_InternalAS36884 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_synpred95_InternalAS36897 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred95_InternalAS36918 = new BitSet(new long[]{0x0000000001000002L});

}