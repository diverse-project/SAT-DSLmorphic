package m2ccs.dsl.satsv.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import m2ccs.dsl.satsv.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'!'", "'&&'", "'||'", "'->'", "'<->'", "'!&'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_formula_0_0= ruleFormula ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_formula_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_formula_0_0= ruleFormula ) )* )
            // InternalMyDsl.g:78:2: ( (lv_formula_0_0= ruleFormula ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_formula_0_0= ruleFormula ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_formula_0_0= ruleFormula )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_formula_0_0= ruleFormula )
            	    // InternalMyDsl.g:80:4: lv_formula_0_0= ruleFormula
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFormulaFormulaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_formula_0_0=ruleFormula();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"formula",
            	    					lv_formula_0_0,
            	    					"m2ccs.dsl.satsv.mydsl.MyDsl.Formula");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleFormula"
    // InternalMyDsl.g:100:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalMyDsl.g:101:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalMyDsl.g:107:1: ruleFormula returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_var_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_arg_3_0 = null;

        EObject lv_arg1_6_0 = null;

        EObject lv_op_7_0 = null;

        EObject lv_arg2_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_var_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' ) ) )
            // InternalMyDsl.g:114:2: ( ( (lv_var_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' ) )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_var_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID||LA2_2==11) ) {
                    alt2=3;
                }
                else if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: ( (lv_var_0_0= ruleVariable ) )
                    {
                    // InternalMyDsl.g:115:3: ( (lv_var_0_0= ruleVariable ) )
                    // InternalMyDsl.g:116:4: (lv_var_0_0= ruleVariable )
                    {
                    // InternalMyDsl.g:116:4: (lv_var_0_0= ruleVariable )
                    // InternalMyDsl.g:117:5: lv_var_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getFormulaAccess().getVarVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormulaRule());
                    					}
                    					add(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"m2ccs.dsl.satsv.mydsl.MyDsl.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:135:3: (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:135:3: (otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:136:4: otherlv_1= '(' ( (lv_op_2_0= ruleUnOp ) ) ( (lv_arg_3_0= ruleFormula ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:140:4: ( (lv_op_2_0= ruleUnOp ) )
                    // InternalMyDsl.g:141:5: (lv_op_2_0= ruleUnOp )
                    {
                    // InternalMyDsl.g:141:5: (lv_op_2_0= ruleUnOp )
                    // InternalMyDsl.g:142:6: lv_op_2_0= ruleUnOp
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getOpUnOpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_op_2_0=ruleUnOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"m2ccs.dsl.satsv.mydsl.MyDsl.UnOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:159:4: ( (lv_arg_3_0= ruleFormula ) )
                    // InternalMyDsl.g:160:5: (lv_arg_3_0= ruleFormula )
                    {
                    // InternalMyDsl.g:160:5: (lv_arg_3_0= ruleFormula )
                    // InternalMyDsl.g:161:6: lv_arg_3_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getArgFormulaParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_arg_3_0=ruleFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"arg",
                    							lv_arg_3_0,
                    							"m2ccs.dsl.satsv.mydsl.MyDsl.Formula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:184:3: (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' )
                    {
                    // InternalMyDsl.g:184:3: (otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')' )
                    // InternalMyDsl.g:185:4: otherlv_5= '(' ( (lv_arg1_6_0= ruleFormula ) ) ( (lv_op_7_0= ruleBiOp ) ) ( (lv_arg2_8_0= ruleFormula ) ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyDsl.g:189:4: ( (lv_arg1_6_0= ruleFormula ) )
                    // InternalMyDsl.g:190:5: (lv_arg1_6_0= ruleFormula )
                    {
                    // InternalMyDsl.g:190:5: (lv_arg1_6_0= ruleFormula )
                    // InternalMyDsl.g:191:6: lv_arg1_6_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getArg1FormulaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_arg1_6_0=ruleFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"arg1",
                    							lv_arg1_6_0,
                    							"m2ccs.dsl.satsv.mydsl.MyDsl.Formula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:208:4: ( (lv_op_7_0= ruleBiOp ) )
                    // InternalMyDsl.g:209:5: (lv_op_7_0= ruleBiOp )
                    {
                    // InternalMyDsl.g:209:5: (lv_op_7_0= ruleBiOp )
                    // InternalMyDsl.g:210:6: lv_op_7_0= ruleBiOp
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getOpBiOpParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_op_7_0=ruleBiOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_7_0,
                    							"m2ccs.dsl.satsv.mydsl.MyDsl.BiOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:227:4: ( (lv_arg2_8_0= ruleFormula ) )
                    // InternalMyDsl.g:228:5: (lv_arg2_8_0= ruleFormula )
                    {
                    // InternalMyDsl.g:228:5: (lv_arg2_8_0= ruleFormula )
                    // InternalMyDsl.g:229:6: lv_arg2_8_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getArg2FormulaParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_arg2_8_0=ruleFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"arg2",
                    							lv_arg2_8_0,
                    							"m2ccs.dsl.satsv.mydsl.MyDsl.Formula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_2_4());
                    			

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:255:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:255:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:256:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:262:1: ruleVariable returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:268:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:269:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:269:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:270:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:270:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:271:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUnOp"
    // InternalMyDsl.g:290:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // InternalMyDsl.g:290:45: (iv_ruleUnOp= ruleUnOp EOF )
            // InternalMyDsl.g:291:2: iv_ruleUnOp= ruleUnOp EOF
            {
             newCompositeNode(grammarAccess.getUnOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOp=ruleUnOp();

            state._fsp--;

             current =iv_ruleUnOp; 
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
    // InternalMyDsl.g:297:1: ruleUnOp returns [EObject current=null] : ( (lv_type_0_0= ruleUnOpType ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:303:2: ( ( (lv_type_0_0= ruleUnOpType ) ) )
            // InternalMyDsl.g:304:2: ( (lv_type_0_0= ruleUnOpType ) )
            {
            // InternalMyDsl.g:304:2: ( (lv_type_0_0= ruleUnOpType ) )
            // InternalMyDsl.g:305:3: (lv_type_0_0= ruleUnOpType )
            {
            // InternalMyDsl.g:305:3: (lv_type_0_0= ruleUnOpType )
            // InternalMyDsl.g:306:4: lv_type_0_0= ruleUnOpType
            {

            				newCompositeNode(grammarAccess.getUnOpAccess().getTypeUnOpTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleUnOpType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnOpRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"m2ccs.dsl.satsv.mydsl.MyDsl.UnOpType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleUnOp"


    // $ANTLR start "entryRuleUnOpType"
    // InternalMyDsl.g:326:1: entryRuleUnOpType returns [String current=null] : iv_ruleUnOpType= ruleUnOpType EOF ;
    public final String entryRuleUnOpType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOpType = null;


        try {
            // InternalMyDsl.g:326:48: (iv_ruleUnOpType= ruleUnOpType EOF )
            // InternalMyDsl.g:327:2: iv_ruleUnOpType= ruleUnOpType EOF
            {
             newCompositeNode(grammarAccess.getUnOpTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOpType=ruleUnOpType();

            state._fsp--;

             current =iv_ruleUnOpType.getText(); 
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
    // $ANTLR end "entryRuleUnOpType"


    // $ANTLR start "ruleUnOpType"
    // InternalMyDsl.g:333:1: ruleUnOpType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleUnOpType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:339:2: (kw= '!' )
            // InternalMyDsl.g:340:2: kw= '!'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnOpTypeAccess().getExclamationMarkKeyword());
            	

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
    // $ANTLR end "ruleUnOpType"


    // $ANTLR start "entryRuleBiOp"
    // InternalMyDsl.g:348:1: entryRuleBiOp returns [EObject current=null] : iv_ruleBiOp= ruleBiOp EOF ;
    public final EObject entryRuleBiOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiOp = null;


        try {
            // InternalMyDsl.g:348:45: (iv_ruleBiOp= ruleBiOp EOF )
            // InternalMyDsl.g:349:2: iv_ruleBiOp= ruleBiOp EOF
            {
             newCompositeNode(grammarAccess.getBiOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiOp=ruleBiOp();

            state._fsp--;

             current =iv_ruleBiOp; 
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
    // $ANTLR end "entryRuleBiOp"


    // $ANTLR start "ruleBiOp"
    // InternalMyDsl.g:355:1: ruleBiOp returns [EObject current=null] : ( (lv_type_0_0= ruleBiOpType ) ) ;
    public final EObject ruleBiOp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:361:2: ( ( (lv_type_0_0= ruleBiOpType ) ) )
            // InternalMyDsl.g:362:2: ( (lv_type_0_0= ruleBiOpType ) )
            {
            // InternalMyDsl.g:362:2: ( (lv_type_0_0= ruleBiOpType ) )
            // InternalMyDsl.g:363:3: (lv_type_0_0= ruleBiOpType )
            {
            // InternalMyDsl.g:363:3: (lv_type_0_0= ruleBiOpType )
            // InternalMyDsl.g:364:4: lv_type_0_0= ruleBiOpType
            {

            				newCompositeNode(grammarAccess.getBiOpAccess().getTypeBiOpTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleBiOpType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBiOpRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"m2ccs.dsl.satsv.mydsl.MyDsl.BiOpType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBiOp"


    // $ANTLR start "entryRuleBiOpType"
    // InternalMyDsl.g:384:1: entryRuleBiOpType returns [String current=null] : iv_ruleBiOpType= ruleBiOpType EOF ;
    public final String entryRuleBiOpType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBiOpType = null;


        try {
            // InternalMyDsl.g:384:48: (iv_ruleBiOpType= ruleBiOpType EOF )
            // InternalMyDsl.g:385:2: iv_ruleBiOpType= ruleBiOpType EOF
            {
             newCompositeNode(grammarAccess.getBiOpTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiOpType=ruleBiOpType();

            state._fsp--;

             current =iv_ruleBiOpType.getText(); 
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
    // $ANTLR end "entryRuleBiOpType"


    // $ANTLR start "ruleBiOpType"
    // InternalMyDsl.g:391:1: ruleBiOpType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' | kw= '!&' ) ;
    public final AntlrDatatypeRuleToken ruleBiOpType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:397:2: ( (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' | kw= '!&' ) )
            // InternalMyDsl.g:398:2: (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' | kw= '!&' )
            {
            // InternalMyDsl.g:398:2: (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' | kw= '!&' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:399:3: kw= '&&'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBiOpTypeAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:405:3: kw= '||'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBiOpTypeAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:411:3: kw= '->'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBiOpTypeAccess().getHyphenMinusGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:417:3: kw= '<->'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBiOpTypeAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:423:3: kw= '!&'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBiOpTypeAccess().getExclamationMarkAmpersandKeyword_4());
                    		

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
    // $ANTLR end "ruleBiOpType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007C810L});

}