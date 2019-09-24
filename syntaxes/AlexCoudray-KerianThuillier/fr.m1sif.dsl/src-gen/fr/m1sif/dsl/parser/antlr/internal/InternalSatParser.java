package fr.m1sif.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.m1sif.dsl.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'('", "')'", "'!'", "'&&'", "'||'", "'!&'", "'==>'", "'<=>'"
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
        	return "Expressions";
       	}

       	@Override
       	protected SatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpressions"
    // InternalSat.g:64:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


        try {
            // InternalSat.g:64:52: (iv_ruleExpressions= ruleExpressions EOF )
            // InternalSat.g:65:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
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
    // $ANTLR end "entryRuleExpressions"


    // $ANTLR start "ruleExpressions"
    // InternalSat.g:71:1: ruleExpressions returns [EObject current=null] : ( ( (lv_Exprs_0_0= ruleExpression ) ) otherlv_1= ';' )* ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_Exprs_0_0 = null;



        	enterRule();

        try {
            // InternalSat.g:77:2: ( ( ( (lv_Exprs_0_0= ruleExpression ) ) otherlv_1= ';' )* )
            // InternalSat.g:78:2: ( ( (lv_Exprs_0_0= ruleExpression ) ) otherlv_1= ';' )*
            {
            // InternalSat.g:78:2: ( ( (lv_Exprs_0_0= ruleExpression ) ) otherlv_1= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSat.g:79:3: ( (lv_Exprs_0_0= ruleExpression ) ) otherlv_1= ';'
            	    {
            	    // InternalSat.g:79:3: ( (lv_Exprs_0_0= ruleExpression ) )
            	    // InternalSat.g:80:4: (lv_Exprs_0_0= ruleExpression )
            	    {
            	    // InternalSat.g:80:4: (lv_Exprs_0_0= ruleExpression )
            	    // InternalSat.g:81:5: lv_Exprs_0_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionsAccess().getExprsExpressionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Exprs_0_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Exprs",
            	    						lv_Exprs_0_0,
            	    						"fr.m1sif.dsl.Sat.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    			newLeafNode(otherlv_1, grammarAccess.getExpressionsAccess().getSemicolonKeyword_1());
            	    		

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
    // $ANTLR end "ruleExpressions"


    // $ANTLR start "entryRuleExpression"
    // InternalSat.g:106:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSat.g:106:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSat.g:107:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSat.g:113:1: ruleExpression returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Unop_1= ruleUnop | this_Binop_2= ruleBinop ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Unop_1 = null;

        EObject this_Binop_2 = null;



        	enterRule();

        try {
            // InternalSat.g:119:2: ( (this_Atom_0= ruleAtom | this_Unop_1= ruleUnop | this_Binop_2= ruleBinop ) )
            // InternalSat.g:120:2: (this_Atom_0= ruleAtom | this_Unop_1= ruleUnop | this_Binop_2= ruleBinop )
            {
            // InternalSat.g:120:2: (this_Atom_0= ruleAtom | this_Unop_1= ruleUnop | this_Binop_2= ruleBinop )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 12:
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
                    // InternalSat.g:121:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSat.g:130:3: this_Unop_1= ruleUnop
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUnopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unop_1=ruleUnop();

                    state._fsp--;


                    			current = this_Unop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSat.g:139:3: this_Binop_2= ruleBinop
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binop_2=ruleBinop();

                    state._fsp--;


                    			current = this_Binop_2;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleUnop"
    // InternalSat.g:151:1: entryRuleUnop returns [EObject current=null] : iv_ruleUnop= ruleUnop EOF ;
    public final EObject entryRuleUnop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnop = null;


        try {
            // InternalSat.g:151:45: (iv_ruleUnop= ruleUnop EOF )
            // InternalSat.g:152:2: iv_ruleUnop= ruleUnop EOF
            {
             newCompositeNode(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnop=ruleUnop();

            state._fsp--;

             current =iv_ruleUnop; 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalSat.g:158:1: ruleUnop returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnopType ) ) ( (lv_Param_1_0= ruleExpression ) ) ) ;
    public final EObject ruleUnop() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_Param_1_0 = null;



        	enterRule();

        try {
            // InternalSat.g:164:2: ( ( ( (lv_op_0_0= ruleUnopType ) ) ( (lv_Param_1_0= ruleExpression ) ) ) )
            // InternalSat.g:165:2: ( ( (lv_op_0_0= ruleUnopType ) ) ( (lv_Param_1_0= ruleExpression ) ) )
            {
            // InternalSat.g:165:2: ( ( (lv_op_0_0= ruleUnopType ) ) ( (lv_Param_1_0= ruleExpression ) ) )
            // InternalSat.g:166:3: ( (lv_op_0_0= ruleUnopType ) ) ( (lv_Param_1_0= ruleExpression ) )
            {
            // InternalSat.g:166:3: ( (lv_op_0_0= ruleUnopType ) )
            // InternalSat.g:167:4: (lv_op_0_0= ruleUnopType )
            {
            // InternalSat.g:167:4: (lv_op_0_0= ruleUnopType )
            // InternalSat.g:168:5: lv_op_0_0= ruleUnopType
            {

            					newCompositeNode(grammarAccess.getUnopAccess().getOpUnopTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_op_0_0=ruleUnopType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnopRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"fr.m1sif.dsl.Sat.UnopType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:185:3: ( (lv_Param_1_0= ruleExpression ) )
            // InternalSat.g:186:4: (lv_Param_1_0= ruleExpression )
            {
            // InternalSat.g:186:4: (lv_Param_1_0= ruleExpression )
            // InternalSat.g:187:5: lv_Param_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnopAccess().getParamExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Param_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnopRule());
            					}
            					set(
            						current,
            						"Param",
            						lv_Param_1_0,
            						"fr.m1sif.dsl.Sat.Expression");
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
    // $ANTLR end "ruleUnop"


    // $ANTLR start "entryRuleBinop"
    // InternalSat.g:208:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // InternalSat.g:208:46: (iv_ruleBinop= ruleBinop EOF )
            // InternalSat.g:209:2: iv_ruleBinop= ruleBinop EOF
            {
             newCompositeNode(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinop=ruleBinop();

            state._fsp--;

             current =iv_ruleBinop; 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalSat.g:215:1: ruleBinop returns [EObject current=null] : (otherlv_0= '(' ( (lv_LeftParam_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinopType ) ) ( (lv_RightParam_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_LeftParam_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_RightParam_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:221:2: ( (otherlv_0= '(' ( (lv_LeftParam_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinopType ) ) ( (lv_RightParam_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSat.g:222:2: (otherlv_0= '(' ( (lv_LeftParam_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinopType ) ) ( (lv_RightParam_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSat.g:222:2: (otherlv_0= '(' ( (lv_LeftParam_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinopType ) ) ( (lv_RightParam_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSat.g:223:3: otherlv_0= '(' ( (lv_LeftParam_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinopType ) ) ( (lv_RightParam_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBinopAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSat.g:227:3: ( (lv_LeftParam_1_0= ruleExpression ) )
            // InternalSat.g:228:4: (lv_LeftParam_1_0= ruleExpression )
            {
            // InternalSat.g:228:4: (lv_LeftParam_1_0= ruleExpression )
            // InternalSat.g:229:5: lv_LeftParam_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinopAccess().getLeftParamExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_LeftParam_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinopRule());
            					}
            					set(
            						current,
            						"LeftParam",
            						lv_LeftParam_1_0,
            						"fr.m1sif.dsl.Sat.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:246:3: ( (lv_op_2_0= ruleBinopType ) )
            // InternalSat.g:247:4: (lv_op_2_0= ruleBinopType )
            {
            // InternalSat.g:247:4: (lv_op_2_0= ruleBinopType )
            // InternalSat.g:248:5: lv_op_2_0= ruleBinopType
            {

            					newCompositeNode(grammarAccess.getBinopAccess().getOpBinopTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_op_2_0=ruleBinopType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinopRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"fr.m1sif.dsl.Sat.BinopType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSat.g:265:3: ( (lv_RightParam_3_0= ruleExpression ) )
            // InternalSat.g:266:4: (lv_RightParam_3_0= ruleExpression )
            {
            // InternalSat.g:266:4: (lv_RightParam_3_0= ruleExpression )
            // InternalSat.g:267:5: lv_RightParam_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinopAccess().getRightParamExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_RightParam_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinopRule());
            					}
            					set(
            						current,
            						"RightParam",
            						lv_RightParam_3_0,
            						"fr.m1sif.dsl.Sat.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinopAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleAtom"
    // InternalSat.g:292:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSat.g:292:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSat.g:293:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalSat.g:299:1: ruleAtom returns [EObject current=null] : ( (lv_Id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_Id_0_0=null;


        	enterRule();

        try {
            // InternalSat.g:305:2: ( ( (lv_Id_0_0= RULE_ID ) ) )
            // InternalSat.g:306:2: ( (lv_Id_0_0= RULE_ID ) )
            {
            // InternalSat.g:306:2: ( (lv_Id_0_0= RULE_ID ) )
            // InternalSat.g:307:3: (lv_Id_0_0= RULE_ID )
            {
            // InternalSat.g:307:3: (lv_Id_0_0= RULE_ID )
            // InternalSat.g:308:4: lv_Id_0_0= RULE_ID
            {
            lv_Id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_Id_0_0, grammarAccess.getAtomAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            				setWithLastConsumed(
            					current,
            					"Id",
            					lv_Id_0_0,
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


    // $ANTLR start "entryRuleUnopType"
    // InternalSat.g:327:1: entryRuleUnopType returns [String current=null] : iv_ruleUnopType= ruleUnopType EOF ;
    public final String entryRuleUnopType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnopType = null;


        try {
            // InternalSat.g:327:48: (iv_ruleUnopType= ruleUnopType EOF )
            // InternalSat.g:328:2: iv_ruleUnopType= ruleUnopType EOF
            {
             newCompositeNode(grammarAccess.getUnopTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnopType=ruleUnopType();

            state._fsp--;

             current =iv_ruleUnopType.getText(); 
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
    // $ANTLR end "entryRuleUnopType"


    // $ANTLR start "ruleUnopType"
    // InternalSat.g:334:1: ruleUnopType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleUnopType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:340:2: (kw= '!' )
            // InternalSat.g:341:2: kw= '!'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnopTypeAccess().getExclamationMarkKeyword());
            	

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
    // $ANTLR end "ruleUnopType"


    // $ANTLR start "entryRuleBinopType"
    // InternalSat.g:349:1: entryRuleBinopType returns [String current=null] : iv_ruleBinopType= ruleBinopType EOF ;
    public final String entryRuleBinopType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinopType = null;


        try {
            // InternalSat.g:349:49: (iv_ruleBinopType= ruleBinopType EOF )
            // InternalSat.g:350:2: iv_ruleBinopType= ruleBinopType EOF
            {
             newCompositeNode(grammarAccess.getBinopTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinopType=ruleBinopType();

            state._fsp--;

             current =iv_ruleBinopType.getText(); 
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
    // $ANTLR end "entryRuleBinopType"


    // $ANTLR start "ruleBinopType"
    // InternalSat.g:356:1: ruleBinopType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '!&' | kw= '==>' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleBinopType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSat.g:362:2: ( (kw= '&&' | kw= '||' | kw= '!&' | kw= '==>' | kw= '<=>' ) )
            // InternalSat.g:363:2: (kw= '&&' | kw= '||' | kw= '!&' | kw= '==>' | kw= '<=>' )
            {
            // InternalSat.g:363:2: (kw= '&&' | kw= '||' | kw= '!&' | kw= '==>' | kw= '<=>' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
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
                    // InternalSat.g:364:3: kw= '&&'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopTypeAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSat.g:370:3: kw= '||'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopTypeAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSat.g:376:3: kw= '!&'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopTypeAccess().getExclamationMarkAmpersandKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSat.g:382:3: kw= '==>'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopTypeAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSat.g:388:3: kw= '<=>'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopTypeAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4());
                    		

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
    // $ANTLR end "ruleBinopType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FD010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});

}