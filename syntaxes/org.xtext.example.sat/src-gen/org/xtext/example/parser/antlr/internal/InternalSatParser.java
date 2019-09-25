package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'AND'", "'OR'", "'IMPLIES'", "'BIIMPLIES'", "'EXCLUDES'", "'NOT'", "'TRUE'", "'FALSE'", "'\\u00F8'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
        	return "Formula";
       	}

       	@Override
       	protected SatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFormula"
    // InternalSat.g:64:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalSat.g:64:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalSat.g:65:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalSat.g:71:1: ruleFormula returns [EObject current=null] : ( () ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        EObject lv_form_1_0 = null;



        	enterRule();

        try {
            // InternalSat.g:77:2: ( ( () ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid ) ) )
            // InternalSat.g:78:2: ( () ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid ) )
            {
            // InternalSat.g:78:2: ( () ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid ) )
            // InternalSat.g:79:3: () ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid )
            {
            // InternalSat.g:79:3: ()
            // InternalSat.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormulaAccess().getFormulaAction_0(),
            					current);
            			

            }

            // InternalSat.g:86:3: ( ( (lv_form_1_0= ruleExpr ) ) | ruleVoid )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=19 && LA1_0<=20)) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSat.g:87:4: ( (lv_form_1_0= ruleExpr ) )
                    {
                    // InternalSat.g:87:4: ( (lv_form_1_0= ruleExpr ) )
                    // InternalSat.g:88:5: (lv_form_1_0= ruleExpr )
                    {
                    // InternalSat.g:88:5: (lv_form_1_0= ruleExpr )
                    // InternalSat.g:89:6: lv_form_1_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getFormExprParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_form_1_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						set(
                    							current,
                    							"form",
                    							lv_form_1_0,
                    							"org.xtext.example.Sat.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:107:4: ruleVoid
                    {

                    				newCompositeNode(grammarAccess.getFormulaAccess().getVoidParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleVoid();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleExpr"
    // InternalSat.g:119:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalSat.g:119:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalSat.g:120:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalSat.g:126:1: ruleExpr returns [EObject current=null] : (this_ExprBin_0= ruleExprBin | this_ExprUn_1= ruleExprUn | this_Var_2= ruleVar ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ExprBin_0 = null;

        EObject this_ExprUn_1 = null;

        EObject this_Var_2 = null;



        	enterRule();

        try {
            // InternalSat.g:132:2: ( (this_ExprBin_0= ruleExprBin | this_ExprUn_1= ruleExprUn | this_Var_2= ruleVar ) )
            // InternalSat.g:133:2: (this_ExprBin_0= ruleExprBin | this_ExprUn_1= ruleExprUn | this_Var_2= ruleVar )
            {
            // InternalSat.g:133:2: (this_ExprBin_0= ruleExprBin | this_ExprUn_1= ruleExprUn | this_Var_2= ruleVar )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID||LA2_1==11||(LA2_1>=19 && LA2_1<=20)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==18) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=19 && LA2_0<=20)) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSat.g:134:3: this_ExprBin_0= ruleExprBin
                    {

                    			newCompositeNode(grammarAccess.getExprAccess().getExprBinParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExprBin_0=ruleExprBin();

                    state._fsp--;


                    			current = this_ExprBin_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSat.g:143:3: this_ExprUn_1= ruleExprUn
                    {

                    			newCompositeNode(grammarAccess.getExprAccess().getExprUnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExprUn_1=ruleExprUn();

                    state._fsp--;


                    			current = this_ExprUn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSat.g:152:3: this_Var_2= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getExprAccess().getVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_2=ruleVar();

                    state._fsp--;


                    			current = this_Var_2;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprBin"
    // InternalSat.g:164:1: entryRuleExprBin returns [EObject current=null] : iv_ruleExprBin= ruleExprBin EOF ;
    public final EObject entryRuleExprBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBin = null;


        try {
            // InternalSat.g:164:48: (iv_ruleExprBin= ruleExprBin EOF )
            // InternalSat.g:165:2: iv_ruleExprBin= ruleExprBin EOF
            {
             newCompositeNode(grammarAccess.getExprBinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBin=ruleExprBin();

            state._fsp--;

             current =iv_ruleExprBin; 
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
    // $ANTLR end "entryRuleExprBin"


    // $ANTLR start "ruleExprBin"
    // InternalSat.g:171:1: ruleExprBin returns [EObject current=null] : (otherlv_0= '(' ( (lv_exprL_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_exprR_3_0= ruleExpr ) ) otherlv_4= ')' ) ;
    public final EObject ruleExprBin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_exprL_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_exprR_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:177:2: ( (otherlv_0= '(' ( (lv_exprL_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_exprR_3_0= ruleExpr ) ) otherlv_4= ')' ) )
            // InternalSat.g:178:2: (otherlv_0= '(' ( (lv_exprL_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_exprR_3_0= ruleExpr ) ) otherlv_4= ')' )
            {
            // InternalSat.g:178:2: (otherlv_0= '(' ( (lv_exprL_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_exprR_3_0= ruleExpr ) ) otherlv_4= ')' )
            // InternalSat.g:179:3: otherlv_0= '(' ( (lv_exprL_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_exprR_3_0= ruleExpr ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExprBinAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSat.g:183:3: ( (lv_exprL_1_0= ruleExpr ) )
            // InternalSat.g:184:4: (lv_exprL_1_0= ruleExpr )
            {
            // InternalSat.g:184:4: (lv_exprL_1_0= ruleExpr )
            // InternalSat.g:185:5: lv_exprL_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprBinAccess().getExprLExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_exprL_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprBinRule());
            					}
            					set(
            						current,
            						"exprL",
            						lv_exprL_1_0,
            						"org.xtext.example.Sat.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:202:3: ( (lv_op_2_0= ruleBinOp ) )
            // InternalSat.g:203:4: (lv_op_2_0= ruleBinOp )
            {
            // InternalSat.g:203:4: (lv_op_2_0= ruleBinOp )
            // InternalSat.g:204:5: lv_op_2_0= ruleBinOp
            {

            					newCompositeNode(grammarAccess.getExprBinAccess().getOpBinOpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_2_0=ruleBinOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprBinRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.example.Sat.BinOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:221:3: ( (lv_exprR_3_0= ruleExpr ) )
            // InternalSat.g:222:4: (lv_exprR_3_0= ruleExpr )
            {
            // InternalSat.g:222:4: (lv_exprR_3_0= ruleExpr )
            // InternalSat.g:223:5: lv_exprR_3_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprBinAccess().getExprRExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_exprR_3_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprBinRule());
            					}
            					set(
            						current,
            						"exprR",
            						lv_exprR_3_0,
            						"org.xtext.example.Sat.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExprBinAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExprBin"


    // $ANTLR start "entryRuleExprUn"
    // InternalSat.g:248:1: entryRuleExprUn returns [EObject current=null] : iv_ruleExprUn= ruleExprUn EOF ;
    public final EObject entryRuleExprUn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprUn = null;


        try {
            // InternalSat.g:248:47: (iv_ruleExprUn= ruleExprUn EOF )
            // InternalSat.g:249:2: iv_ruleExprUn= ruleExprUn EOF
            {
             newCompositeNode(grammarAccess.getExprUnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprUn=ruleExprUn();

            state._fsp--;

             current =iv_ruleExprUn; 
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
    // $ANTLR end "entryRuleExprUn"


    // $ANTLR start "ruleExprUn"
    // InternalSat.g:255:1: ruleExprUn returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleExprUn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSat.g:261:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // InternalSat.g:262:2: (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // InternalSat.g:262:2: (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' )
            // InternalSat.g:263:3: otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExprUnAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSat.g:267:3: ( (lv_op_1_0= ruleUnOp ) )
            // InternalSat.g:268:4: (lv_op_1_0= ruleUnOp )
            {
            // InternalSat.g:268:4: (lv_op_1_0= ruleUnOp )
            // InternalSat.g:269:5: lv_op_1_0= ruleUnOp
            {

            					newCompositeNode(grammarAccess.getExprUnAccess().getOpUnOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_1_0=ruleUnOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprUnRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.Sat.UnOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:286:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalSat.g:287:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalSat.g:287:4: (lv_expr_2_0= ruleExpr )
            // InternalSat.g:288:5: lv_expr_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprUnAccess().getExprExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprUnRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.Sat.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExprUnAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleExprUn"


    // $ANTLR start "entryRuleBinOp"
    // InternalSat.g:313:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalSat.g:313:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalSat.g:314:2: iv_ruleBinOp= ruleBinOp EOF
            {
             newCompositeNode(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinOp=ruleBinOp();

            state._fsp--;

             current =iv_ruleBinOp.getText(); 
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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalSat.g:320:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' | kw= 'IMPLIES' | kw= 'BIIMPLIES' | kw= 'EXCLUDES' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:326:2: ( (kw= 'AND' | kw= 'OR' | kw= 'IMPLIES' | kw= 'BIIMPLIES' | kw= 'EXCLUDES' ) )
            // InternalSat.g:327:2: (kw= 'AND' | kw= 'OR' | kw= 'IMPLIES' | kw= 'BIIMPLIES' | kw= 'EXCLUDES' )
            {
            // InternalSat.g:327:2: (kw= 'AND' | kw= 'OR' | kw= 'IMPLIES' | kw= 'BIIMPLIES' | kw= 'EXCLUDES' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSat.g:328:3: kw= 'AND'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSat.g:334:3: kw= 'OR'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getORKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSat.g:340:3: kw= 'IMPLIES'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getIMPLIESKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSat.g:346:3: kw= 'BIIMPLIES'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getBIIMPLIESKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSat.g:352:3: kw= 'EXCLUDES'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getEXCLUDESKeyword_4());
                    		

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
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnOp"
    // InternalSat.g:361:1: entryRuleUnOp returns [String current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final String entryRuleUnOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOp = null;


        try {
            // InternalSat.g:361:44: (iv_ruleUnOp= ruleUnOp EOF )
            // InternalSat.g:362:2: iv_ruleUnOp= ruleUnOp EOF
            {
             newCompositeNode(grammarAccess.getUnOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOp=ruleUnOp();

            state._fsp--;

             current =iv_ruleUnOp.getText(); 
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
    // $ANTLR end "entryRuleUnOp"


    // $ANTLR start "ruleUnOp"
    // InternalSat.g:368:1: ruleUnOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleUnOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:374:2: (kw= 'NOT' )
            // InternalSat.g:375:2: kw= 'NOT'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnOpAccess().getNOTKeyword());
            	

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
    // $ANTLR end "ruleUnOp"


    // $ANTLR start "entryRuleVar"
    // InternalSat.g:383:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalSat.g:383:44: (iv_ruleVar= ruleVar EOF )
            // InternalSat.g:384:2: iv_ruleVar= ruleVar EOF
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
    // InternalSat.g:390:1: ruleVar returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_val_1_0= ruleVal ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        EObject lv_atom_0_0 = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalSat.g:396:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_val_1_0= ruleVal ) ) ) )
            // InternalSat.g:397:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_val_1_0= ruleVal ) ) )
            {
            // InternalSat.g:397:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_val_1_0= ruleVal ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSat.g:398:3: ( (lv_atom_0_0= ruleAtom ) )
                    {
                    // InternalSat.g:398:3: ( (lv_atom_0_0= ruleAtom ) )
                    // InternalSat.g:399:4: (lv_atom_0_0= ruleAtom )
                    {
                    // InternalSat.g:399:4: (lv_atom_0_0= ruleAtom )
                    // InternalSat.g:400:5: lv_atom_0_0= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getAtomAtomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atom_0_0=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"atom",
                    						lv_atom_0_0,
                    						"org.xtext.example.Sat.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:418:3: ( (lv_val_1_0= ruleVal ) )
                    {
                    // InternalSat.g:418:3: ( (lv_val_1_0= ruleVal ) )
                    // InternalSat.g:419:4: (lv_val_1_0= ruleVal )
                    {
                    // InternalSat.g:419:4: (lv_val_1_0= ruleVal )
                    // InternalSat.g:420:5: lv_val_1_0= ruleVal
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getValValParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleVal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"val",
                    						lv_val_1_0,
                    						"org.xtext.example.Sat.Val");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleAtom"
    // InternalSat.g:441:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSat.g:441:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSat.g:442:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSat.g:448:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSat.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSat.g:455:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSat.g:455:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSat.g:456:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSat.g:456:3: (lv_name_0_0= RULE_ID )
            // InternalSat.g:457:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleVal"
    // InternalSat.g:476:1: entryRuleVal returns [String current=null] : iv_ruleVal= ruleVal EOF ;
    public final String entryRuleVal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVal = null;


        try {
            // InternalSat.g:476:43: (iv_ruleVal= ruleVal EOF )
            // InternalSat.g:477:2: iv_ruleVal= ruleVal EOF
            {
             newCompositeNode(grammarAccess.getValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVal=ruleVal();

            state._fsp--;

             current =iv_ruleVal.getText(); 
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
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // InternalSat.g:483:1: ruleVal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'FALSE' ) ;
    public final AntlrDatatypeRuleToken ruleVal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:489:2: ( (kw= 'TRUE' | kw= 'FALSE' ) )
            // InternalSat.g:490:2: (kw= 'TRUE' | kw= 'FALSE' )
            {
            // InternalSat.g:490:2: (kw= 'TRUE' | kw= 'FALSE' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSat.g:491:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValAccess().getTRUEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSat.g:497:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValAccess().getFALSEKeyword_1());
                    		

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
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleVoid"
    // InternalSat.g:506:1: entryRuleVoid returns [String current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final String entryRuleVoid() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVoid = null;


        try {
            // InternalSat.g:506:44: (iv_ruleVoid= ruleVoid EOF )
            // InternalSat.g:507:2: iv_ruleVoid= ruleVoid EOF
            {
             newCompositeNode(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoid=ruleVoid();

            state._fsp--;

             current =iv_ruleVoid.getText(); 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalSat.g:513:1: ruleVoid returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00F8' ;
    public final AntlrDatatypeRuleToken ruleVoid() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:519:2: (kw= '\\u00F8' )
            // InternalSat.g:520:2: kw= '\\u00F8'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVoidAccess().getLatinSmallLetterOWithStrokeKeyword());
            	

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
    // $ANTLR end "ruleVoid"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});

}