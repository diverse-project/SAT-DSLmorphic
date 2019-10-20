package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#dimacs'", "'#inline-formula'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'\\u2191'", "'('", "')'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSat.g"; }



     	private SatGrammarAccess grammarAccess;

        public InternalSatParser(TokenStream input, SatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Sat";
       	}

       	@Override
       	protected SatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSat"
    // InternalSat.g:65:1: entryRuleSat returns [EObject current=null] : iv_ruleSat= ruleSat EOF ;
    public final EObject entryRuleSat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSat = null;


        try {
            // InternalSat.g:65:44: (iv_ruleSat= ruleSat EOF )
            // InternalSat.g:66:2: iv_ruleSat= ruleSat EOF
            {
             newCompositeNode(grammarAccess.getSatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSat=ruleSat();

            state._fsp--;

             current =iv_ruleSat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSat"


    // $ANTLR start "ruleSat"
    // InternalSat.g:72:1: ruleSat returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) ) ( (lv_solver_method_1_0= ruleSATSolverMethod ) ) ) ;
    public final EObject ruleSat() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        Enumerator lv_solver_method_1_0 = null;



        	enterRule();

        try {
            // InternalSat.g:78:2: ( ( ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) ) ( (lv_solver_method_1_0= ruleSATSolverMethod ) ) ) )
            // InternalSat.g:79:2: ( ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) ) ( (lv_solver_method_1_0= ruleSATSolverMethod ) ) )
            {
            // InternalSat.g:79:2: ( ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) ) ( (lv_solver_method_1_0= ruleSATSolverMethod ) ) )
            // InternalSat.g:80:3: ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) ) ( (lv_solver_method_1_0= ruleSATSolverMethod ) )
            {
            // InternalSat.g:80:3: ( ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) ) )
            // InternalSat.g:81:4: ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) )
            {
            // InternalSat.g:81:4: ( (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula ) )
            // InternalSat.g:82:5: (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula )
            {
            // InternalSat.g:82:5: (lv_type_0_1= ruleDimacsFile | lv_type_0_2= ruleInlineFormula )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSat.g:83:6: lv_type_0_1= ruleDimacsFile
                    {

                    						newCompositeNode(grammarAccess.getSatAccess().getTypeDimacsFileParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_type_0_1=ruleDimacsFile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSatRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_1,
                    							"org.xtext.example.mydsl.Sat.DimacsFile");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSat.g:99:6: lv_type_0_2= ruleInlineFormula
                    {

                    						newCompositeNode(grammarAccess.getSatAccess().getTypeInlineFormulaParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_3);
                    lv_type_0_2=ruleInlineFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSatRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_2,
                    							"org.xtext.example.mydsl.Sat.InlineFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalSat.g:117:3: ( (lv_solver_method_1_0= ruleSATSolverMethod ) )
            // InternalSat.g:118:4: (lv_solver_method_1_0= ruleSATSolverMethod )
            {
            // InternalSat.g:118:4: (lv_solver_method_1_0= ruleSATSolverMethod )
            // InternalSat.g:119:5: lv_solver_method_1_0= ruleSATSolverMethod
            {

            					newCompositeNode(grammarAccess.getSatAccess().getSolver_methodSATSolverMethodEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_solver_method_1_0=ruleSATSolverMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSatRule());
            					}
            					set(
            						current,
            						"solver_method",
            						lv_solver_method_1_0,
            						"org.xtext.example.mydsl.Sat.SATSolverMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleSat"


    // $ANTLR start "entryRuleDimacsFile"
    // InternalSat.g:140:1: entryRuleDimacsFile returns [EObject current=null] : iv_ruleDimacsFile= ruleDimacsFile EOF ;
    public final EObject entryRuleDimacsFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimacsFile = null;


        try {
            // InternalSat.g:140:51: (iv_ruleDimacsFile= ruleDimacsFile EOF )
            // InternalSat.g:141:2: iv_ruleDimacsFile= ruleDimacsFile EOF
            {
             newCompositeNode(grammarAccess.getDimacsFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimacsFile=ruleDimacsFile();

            state._fsp--;

             current =iv_ruleDimacsFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimacsFile"


    // $ANTLR start "ruleDimacsFile"
    // InternalSat.g:147:1: ruleDimacsFile returns [EObject current=null] : (otherlv_0= '#dimacs' ( (lv_filepath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDimacsFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filepath_1_0=null;


        	enterRule();

        try {
            // InternalSat.g:153:2: ( (otherlv_0= '#dimacs' ( (lv_filepath_1_0= RULE_STRING ) ) ) )
            // InternalSat.g:154:2: (otherlv_0= '#dimacs' ( (lv_filepath_1_0= RULE_STRING ) ) )
            {
            // InternalSat.g:154:2: (otherlv_0= '#dimacs' ( (lv_filepath_1_0= RULE_STRING ) ) )
            // InternalSat.g:155:3: otherlv_0= '#dimacs' ( (lv_filepath_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimacsFileAccess().getDimacsKeyword_0());
            		
            // InternalSat.g:159:3: ( (lv_filepath_1_0= RULE_STRING ) )
            // InternalSat.g:160:4: (lv_filepath_1_0= RULE_STRING )
            {
            // InternalSat.g:160:4: (lv_filepath_1_0= RULE_STRING )
            // InternalSat.g:161:5: lv_filepath_1_0= RULE_STRING
            {
            lv_filepath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filepath_1_0, grammarAccess.getDimacsFileAccess().getFilepathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimacsFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filepath",
            						lv_filepath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleDimacsFile"


    // $ANTLR start "entryRuleInlineFormula"
    // InternalSat.g:181:1: entryRuleInlineFormula returns [EObject current=null] : iv_ruleInlineFormula= ruleInlineFormula EOF ;
    public final EObject entryRuleInlineFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineFormula = null;


        try {
            // InternalSat.g:181:54: (iv_ruleInlineFormula= ruleInlineFormula EOF )
            // InternalSat.g:182:2: iv_ruleInlineFormula= ruleInlineFormula EOF
            {
             newCompositeNode(grammarAccess.getInlineFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineFormula=ruleInlineFormula();

            state._fsp--;

             current =iv_ruleInlineFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineFormula"


    // $ANTLR start "ruleInlineFormula"
    // InternalSat.g:188:1: ruleInlineFormula returns [EObject current=null] : (otherlv_0= '#inline-formula' ( (lv_model_1_0= ruleModel ) ) ) ;
    public final EObject ruleInlineFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_model_1_0 = null;



        	enterRule();

        try {
            // InternalSat.g:194:2: ( (otherlv_0= '#inline-formula' ( (lv_model_1_0= ruleModel ) ) ) )
            // InternalSat.g:195:2: (otherlv_0= '#inline-formula' ( (lv_model_1_0= ruleModel ) ) )
            {
            // InternalSat.g:195:2: (otherlv_0= '#inline-formula' ( (lv_model_1_0= ruleModel ) ) )
            // InternalSat.g:196:3: otherlv_0= '#inline-formula' ( (lv_model_1_0= ruleModel ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineFormulaAccess().getInlineFormulaKeyword_0());
            		
            // InternalSat.g:200:3: ( (lv_model_1_0= ruleModel ) )
            // InternalSat.g:201:4: (lv_model_1_0= ruleModel )
            {
            // InternalSat.g:201:4: (lv_model_1_0= ruleModel )
            // InternalSat.g:202:5: lv_model_1_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getInlineFormulaAccess().getModelModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_model_1_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInlineFormulaRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_1_0,
            						"org.xtext.example.mydsl.Sat.Model");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleInlineFormula"


    // $ANTLR start "entryRuleModel"
    // InternalSat.g:223:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSat.g:223:46: (iv_ruleModel= ruleModel EOF )
            // InternalSat.g:224:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSat.g:230:1: ruleModel returns [EObject current=null] : this_BiImpl_0= ruleBiImpl ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_BiImpl_0 = null;



        	enterRule();

        try {
            // InternalSat.g:236:2: (this_BiImpl_0= ruleBiImpl )
            // InternalSat.g:237:2: this_BiImpl_0= ruleBiImpl
            {

            		newCompositeNode(grammarAccess.getModelAccess().getBiImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BiImpl_0=ruleBiImpl();

            state._fsp--;


            		current = this_BiImpl_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleBiImpl"
    // InternalSat.g:248:1: entryRuleBiImpl returns [EObject current=null] : iv_ruleBiImpl= ruleBiImpl EOF ;
    public final EObject entryRuleBiImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImpl = null;


        try {
            // InternalSat.g:248:47: (iv_ruleBiImpl= ruleBiImpl EOF )
            // InternalSat.g:249:2: iv_ruleBiImpl= ruleBiImpl EOF
            {
             newCompositeNode(grammarAccess.getBiImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiImpl=ruleBiImpl();

            state._fsp--;

             current =iv_ruleBiImpl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBiImpl"


    // $ANTLR start "ruleBiImpl"
    // InternalSat.g:255:1: ruleBiImpl returns [EObject current=null] : (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) ;
    public final EObject ruleBiImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Impl_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:261:2: ( (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) )
            // InternalSat.g:262:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            {
            // InternalSat.g:262:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            // InternalSat.g:263:3: this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplAccess().getImplParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Impl_0=ruleImpl();

            state._fsp--;


            			current = this_Impl_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:271:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSat.g:272:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) )
            	    {
            	    // InternalSat.g:272:4: ()
            	    // InternalSat.g:273:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSat.g:283:4: ( (lv_right_3_0= ruleImpl ) )
            	    // InternalSat.g:284:5: (lv_right_3_0= ruleImpl )
            	    {
            	    // InternalSat.g:284:5: (lv_right_3_0= ruleImpl )
            	    // InternalSat.g:285:6: lv_right_3_0= ruleImpl
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleImpl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBiImplRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sat.Impl");
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
    // $ANTLR end "ruleBiImpl"


    // $ANTLR start "entryRuleImpl"
    // InternalSat.g:307:1: entryRuleImpl returns [EObject current=null] : iv_ruleImpl= ruleImpl EOF ;
    public final EObject entryRuleImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpl = null;


        try {
            // InternalSat.g:307:45: (iv_ruleImpl= ruleImpl EOF )
            // InternalSat.g:308:2: iv_ruleImpl= ruleImpl EOF
            {
             newCompositeNode(grammarAccess.getImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpl=ruleImpl();

            state._fsp--;

             current =iv_ruleImpl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpl"


    // $ANTLR start "ruleImpl"
    // InternalSat.g:314:1: ruleImpl returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:320:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalSat.g:321:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalSat.g:321:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalSat.g:322:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:330:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSat.g:331:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalSat.g:331:4: ()
            	    // InternalSat.g:332:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplAccess().getImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSat.g:342:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalSat.g:343:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalSat.g:343:5: (lv_right_3_0= ruleOr )
            	    // InternalSat.g:344:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sat.Or");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalSat.g:366:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSat.g:366:43: (iv_ruleOr= ruleOr EOF )
            // InternalSat.g:367:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSat.g:373:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:379:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSat.g:380:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSat.g:380:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSat.g:381:3: this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:389:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSat.g:390:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSat.g:390:4: ()
            	    // InternalSat.g:391:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVKeyword_1_1());
            	    			
            	    // InternalSat.g:401:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSat.g:402:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSat.g:402:5: (lv_right_3_0= ruleAnd )
            	    // InternalSat.g:403:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sat.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSat.g:425:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSat.g:425:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSat.g:426:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSat.g:432:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nand_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:438:2: ( (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) )
            // InternalSat.g:439:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            {
            // InternalSat.g:439:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            // InternalSat.g:440:3: this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:448:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSat.g:449:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) )
            	    {
            	    // InternalSat.g:449:4: ()
            	    // InternalSat.g:450:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalSat.g:460:4: ( (lv_right_3_0= ruleNand ) )
            	    // InternalSat.g:461:5: (lv_right_3_0= ruleNand )
            	    {
            	    // InternalSat.g:461:5: (lv_right_3_0= ruleNand )
            	    // InternalSat.g:462:6: lv_right_3_0= ruleNand
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleNand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sat.Nand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNand"
    // InternalSat.g:484:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalSat.g:484:45: (iv_ruleNand= ruleNand EOF )
            // InternalSat.g:485:2: iv_ruleNand= ruleNand EOF
            {
             newCompositeNode(grammarAccess.getNandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNand=ruleNand();

            state._fsp--;

             current =iv_ruleNand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNand"


    // $ANTLR start "ruleNand"
    // InternalSat.g:491:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:497:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) )
            // InternalSat.g:498:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            {
            // InternalSat.g:498:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            // InternalSat.g:499:3: this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:507:3: ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSat.g:508:4: () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) )
            	    {
            	    // InternalSat.g:508:4: ()
            	    // InternalSat.g:509:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:515:4: (otherlv_2= '|' | otherlv_3= '\\u2191' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==17) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==18) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalSat.g:516:5: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:521:5: otherlv_3= '\\u2191'
            	            {
            	            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:526:4: ( (lv_right_4_0= rulePrimary ) )
            	    // InternalSat.g:527:5: (lv_right_4_0= rulePrimary )
            	    {
            	    // InternalSat.g:527:5: (lv_right_4_0= rulePrimary )
            	    // InternalSat.g:528:6: lv_right_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_4_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNandRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.mydsl.Sat.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleNand"


    // $ANTLR start "entryRulePrimary"
    // InternalSat.g:550:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSat.g:550:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSat.g:551:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSat.g:557:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Model_1 = null;

        EObject this_Not_3 = null;

        EObject this_Const_4 = null;

        EObject this_Var_5 = null;



        	enterRule();

        try {
            // InternalSat.g:563:2: ( ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) )
            // InternalSat.g:564:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            {
            // InternalSat.g:564:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 21:
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
            case 24:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSat.g:565:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    {
                    // InternalSat.g:565:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    // InternalSat.g:566:4: otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    				current = this_Model_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:584:3: this_Not_3= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_3=ruleNot();

                    state._fsp--;


                    			current = this_Not_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSat.g:593:3: this_Const_4= ruleConst
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Const_4=ruleConst();

                    state._fsp--;


                    			current = this_Const_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSat.g:602:3: this_Var_5= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_5=ruleVar();

                    state._fsp--;


                    			current = this_Var_5;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNot"
    // InternalSat.g:614:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSat.g:614:44: (iv_ruleNot= ruleNot EOF )
            // InternalSat.g:615:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSat.g:621:1: ruleNot returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Primary_2 = null;



        	enterRule();

        try {
            // InternalSat.g:627:2: ( ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) )
            // InternalSat.g:628:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            {
            // InternalSat.g:628:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            // InternalSat.g:629:3: (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary ()
            {
            // InternalSat.g:629:3: (otherlv_0= '!' | otherlv_1= '~' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSat.g:630:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSat.g:635:4: otherlv_1= '~'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getTildeKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Primary_2=rulePrimary();

            state._fsp--;


            			current = this_Primary_2;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:648:3: ()
            // InternalSat.g:649:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getNotAccess().getNotExpressionAction_2(),
            					current);
            			

            }


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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleVar"
    // InternalSat.g:659:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalSat.g:659:44: (iv_ruleVar= ruleVar EOF )
            // InternalSat.g:660:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalSat.g:666:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalSat.g:672:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalSat.g:673:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalSat.g:673:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalSat.g:674:3: (lv_id_0_0= RULE_ID )
            {
            // InternalSat.g:674:3: (lv_id_0_0= RULE_ID )
            // InternalSat.g:675:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalSat.g:694:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalSat.g:694:46: (iv_ruleConst= ruleConst EOF )
            // InternalSat.g:695:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalSat.g:701:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalSat.g:707:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalSat.g:708:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalSat.g:708:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalSat.g:709:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalSat.g:709:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalSat.g:710:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalSat.g:710:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSat.g:711:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSat.g:722:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_val_0_2, grammarAccess.getConstAccess().getValFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_2, null);
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleConst"


    // $ANTLR start "ruleSATSolverMethod"
    // InternalSat.g:738:1: ruleSATSolverMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) ;
    public final Enumerator ruleSATSolverMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSat.g:744:2: ( ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) )
            // InternalSat.g:745:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            {
            // InternalSat.g:745:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSat.g:746:3: (enumLiteral_0= 'sat4j-java' )
                    {
                    // InternalSat.g:746:3: (enumLiteral_0= 'sat4j-java' )
                    // InternalSat.g:747:4: enumLiteral_0= 'sat4j-java'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getSATSolverMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSATSolverMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:754:3: (enumLiteral_1= 'sat4j-jar' )
                    {
                    // InternalSat.g:754:3: (enumLiteral_1= 'sat4j-jar' )
                    // InternalSat.g:755:4: enumLiteral_1= 'sat4j-jar'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getSATSolverMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSATSolverMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:762:3: (enumLiteral_2= 'sat4j-maven' )
                    {
                    // InternalSat.g:762:3: (enumLiteral_2= 'sat4j-maven' )
                    // InternalSat.g:763:4: enumLiteral_2= 'sat4j-maven'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getSATSolverMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSATSolverMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSATSolverMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001E80020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}