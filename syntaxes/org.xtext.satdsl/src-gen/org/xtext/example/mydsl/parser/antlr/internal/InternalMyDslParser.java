package org.xtext.example.mydsl.parser.antlr.internal;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'^'", "'v'", "'->'", "'<->'", "'|'", "'!'", "'#t'", "'#f'"
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
        	return "Expression";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:64:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:65:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:71:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleBinExpr ) ) | this_UnExpr_1= ruleUnExpr | this_Literal_2= ruleLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject this_UnExpr_1 = null;

        EObject this_Literal_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_expr_0_0= ruleBinExpr ) ) | this_UnExpr_1= ruleUnExpr | this_Literal_2= ruleLiteral ) )
            // InternalMyDsl.g:78:2: ( ( (lv_expr_0_0= ruleBinExpr ) ) | this_UnExpr_1= ruleUnExpr | this_Literal_2= ruleLiteral )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_expr_0_0= ruleBinExpr ) ) | this_UnExpr_1= ruleUnExpr | this_Literal_2= ruleLiteral )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==18) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_ID||LA1_1==11||(LA1_1>=19 && LA1_1<=20)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=19 && LA1_0<=20)) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: ( (lv_expr_0_0= ruleBinExpr ) )
                    {
                    // InternalMyDsl.g:79:3: ( (lv_expr_0_0= ruleBinExpr ) )
                    // InternalMyDsl.g:80:4: (lv_expr_0_0= ruleBinExpr )
                    {
                    // InternalMyDsl.g:80:4: (lv_expr_0_0= ruleBinExpr )
                    // InternalMyDsl.g:81:5: lv_expr_0_0= ruleBinExpr
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getExprBinExprParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleBinExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					add(
                    						current,
                    						"expr",
                    						lv_expr_0_0,
                    						"org.xtext.example.mydsl.MyDsl.BinExpr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:99:3: this_UnExpr_1= ruleUnExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUnExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnExpr_1=ruleUnExpr();

                    state._fsp--;


                    			current = this_UnExpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:108:3: this_Literal_2= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_2;
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


    // $ANTLR start "entryRuleBinExpr"
    // InternalMyDsl.g:120:1: entryRuleBinExpr returns [EObject current=null] : iv_ruleBinExpr= ruleBinExpr EOF ;
    public final EObject entryRuleBinExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinExpr = null;


        try {
            // InternalMyDsl.g:120:48: (iv_ruleBinExpr= ruleBinExpr EOF )
            // InternalMyDsl.g:121:2: iv_ruleBinExpr= ruleBinExpr EOF
            {
             newCompositeNode(grammarAccess.getBinExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinExpr=ruleBinExpr();

            state._fsp--;

             current =iv_ruleBinExpr; 
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
    // $ANTLR end "entryRuleBinExpr"


    // $ANTLR start "ruleBinExpr"
    // InternalMyDsl.g:127:1: ruleBinExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftexpr_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_rightexpr_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftexpr_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rightexpr_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:133:2: ( (otherlv_0= '(' ( (lv_leftexpr_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_rightexpr_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:134:2: (otherlv_0= '(' ( (lv_leftexpr_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_rightexpr_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:134:2: (otherlv_0= '(' ( (lv_leftexpr_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_rightexpr_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:135:3: otherlv_0= '(' ( (lv_leftexpr_1_0= ruleExpression ) ) ( (lv_op_2_0= ruleBinOp ) ) ( (lv_rightexpr_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinExprAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:139:3: ( (lv_leftexpr_1_0= ruleExpression ) )
            // InternalMyDsl.g:140:4: (lv_leftexpr_1_0= ruleExpression )
            {
            // InternalMyDsl.g:140:4: (lv_leftexpr_1_0= ruleExpression )
            // InternalMyDsl.g:141:5: lv_leftexpr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinExprAccess().getLeftexprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_leftexpr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinExprRule());
            					}
            					add(
            						current,
            						"leftexpr",
            						lv_leftexpr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:158:3: ( (lv_op_2_0= ruleBinOp ) )
            // InternalMyDsl.g:159:4: (lv_op_2_0= ruleBinOp )
            {
            // InternalMyDsl.g:159:4: (lv_op_2_0= ruleBinOp )
            // InternalMyDsl.g:160:5: lv_op_2_0= ruleBinOp
            {

            					newCompositeNode(grammarAccess.getBinExprAccess().getOpBinOpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_2_0=ruleBinOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinExprRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.example.mydsl.MyDsl.BinOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:177:3: ( (lv_rightexpr_3_0= ruleExpression ) )
            // InternalMyDsl.g:178:4: (lv_rightexpr_3_0= ruleExpression )
            {
            // InternalMyDsl.g:178:4: (lv_rightexpr_3_0= ruleExpression )
            // InternalMyDsl.g:179:5: lv_rightexpr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinExprAccess().getRightexprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rightexpr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinExprRule());
            					}
            					add(
            						current,
            						"rightexpr",
            						lv_rightexpr_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinExprAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBinExpr"


    // $ANTLR start "entryRuleBinOp"
    // InternalMyDsl.g:204:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalMyDsl.g:204:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalMyDsl.g:205:2: iv_ruleBinOp= ruleBinOp EOF
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
    // InternalMyDsl.g:211:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^' | kw= 'v' | kw= '->' | kw= '<->' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:217:2: ( (kw= '^' | kw= 'v' | kw= '->' | kw= '<->' | kw= '|' ) )
            // InternalMyDsl.g:218:2: (kw= '^' | kw= 'v' | kw= '->' | kw= '<->' | kw= '|' )
            {
            // InternalMyDsl.g:218:2: (kw= '^' | kw= 'v' | kw= '->' | kw= '<->' | kw= '|' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:219:3: kw= '^'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getCircumflexAccentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:225:3: kw= 'v'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getVKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:231:3: kw= '->'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getHyphenMinusGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:237:3: kw= '<->'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:243:3: kw= '|'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getVerticalLineKeyword_4());
                    		

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


    // $ANTLR start "entryRuleUnExpr"
    // InternalMyDsl.g:252:1: entryRuleUnExpr returns [EObject current=null] : iv_ruleUnExpr= ruleUnExpr EOF ;
    public final EObject entryRuleUnExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpr = null;


        try {
            // InternalMyDsl.g:252:47: (iv_ruleUnExpr= ruleUnExpr EOF )
            // InternalMyDsl.g:253:2: iv_ruleUnExpr= ruleUnExpr EOF
            {
             newCompositeNode(grammarAccess.getUnExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnExpr=ruleUnExpr();

            state._fsp--;

             current =iv_ruleUnExpr; 
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
    // $ANTLR end "entryRuleUnExpr"


    // $ANTLR start "ruleUnExpr"
    // InternalMyDsl.g:259:1: ruleUnExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleUnExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:265:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:266:2: (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:266:2: (otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalMyDsl.g:267:3: otherlv_0= '(' ( (lv_op_1_0= ruleUnOp ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUnExprAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:271:3: ( (lv_op_1_0= ruleUnOp ) )
            // InternalMyDsl.g:272:4: (lv_op_1_0= ruleUnOp )
            {
            // InternalMyDsl.g:272:4: (lv_op_1_0= ruleUnOp )
            // InternalMyDsl.g:273:5: lv_op_1_0= ruleUnOp
            {

            					newCompositeNode(grammarAccess.getUnExprAccess().getOpUnOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_1_0=ruleUnOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnExprRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.mydsl.MyDsl.UnOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:290:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalMyDsl.g:291:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalMyDsl.g:291:4: (lv_expr_2_0= ruleExpression )
            // InternalMyDsl.g:292:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnExprAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnExprRule());
            					}
            					add(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUnExprAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleUnExpr"


    // $ANTLR start "entryRuleUnOp"
    // InternalMyDsl.g:317:1: entryRuleUnOp returns [String current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final String entryRuleUnOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOp = null;


        try {
            // InternalMyDsl.g:317:44: (iv_ruleUnOp= ruleUnOp EOF )
            // InternalMyDsl.g:318:2: iv_ruleUnOp= ruleUnOp EOF
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
    // InternalMyDsl.g:324:1: ruleUnOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleUnOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:330:2: (kw= '!' )
            // InternalMyDsl.g:331:2: kw= '!'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnOpAccess().getExclamationMarkKeyword());
            	

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


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:339:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMyDsl.g:339:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyDsl.g:340:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:346:1: ruleLiteral returns [EObject current=null] : ( ( (lv_lit_atom_0_0= ruleAtom ) ) | ( (lv_lit_const_1_0= ruleConst ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_lit_atom_0_0 = null;

        AntlrDatatypeRuleToken lv_lit_const_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:352:2: ( ( ( (lv_lit_atom_0_0= ruleAtom ) ) | ( (lv_lit_const_1_0= ruleConst ) ) ) )
            // InternalMyDsl.g:353:2: ( ( (lv_lit_atom_0_0= ruleAtom ) ) | ( (lv_lit_const_1_0= ruleConst ) ) )
            {
            // InternalMyDsl.g:353:2: ( ( (lv_lit_atom_0_0= ruleAtom ) ) | ( (lv_lit_const_1_0= ruleConst ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:354:3: ( (lv_lit_atom_0_0= ruleAtom ) )
                    {
                    // InternalMyDsl.g:354:3: ( (lv_lit_atom_0_0= ruleAtom ) )
                    // InternalMyDsl.g:355:4: (lv_lit_atom_0_0= ruleAtom )
                    {
                    // InternalMyDsl.g:355:4: (lv_lit_atom_0_0= ruleAtom )
                    // InternalMyDsl.g:356:5: lv_lit_atom_0_0= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getLit_atomAtomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_atom_0_0=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					add(
                    						current,
                    						"lit_atom",
                    						lv_lit_atom_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:374:3: ( (lv_lit_const_1_0= ruleConst ) )
                    {
                    // InternalMyDsl.g:374:3: ( (lv_lit_const_1_0= ruleConst ) )
                    // InternalMyDsl.g:375:4: (lv_lit_const_1_0= ruleConst )
                    {
                    // InternalMyDsl.g:375:4: (lv_lit_const_1_0= ruleConst )
                    // InternalMyDsl.g:376:5: lv_lit_const_1_0= ruleConst
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getLit_constConstParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_const_1_0=ruleConst();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					set(
                    						current,
                    						"lit_const",
                    						lv_lit_const_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Const");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:397:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalMyDsl.g:397:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalMyDsl.g:398:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalMyDsl.g:404:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:410:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:411:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:411:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:412:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:412:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:413:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleConst"
    // InternalMyDsl.g:432:1: entryRuleConst returns [String current=null] : iv_ruleConst= ruleConst EOF ;
    public final String entryRuleConst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConst = null;


        try {
            // InternalMyDsl.g:432:45: (iv_ruleConst= ruleConst EOF )
            // InternalMyDsl.g:433:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst.getText(); 
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
    // InternalMyDsl.g:439:1: ruleConst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#t' | kw= '#f' ) ;
    public final AntlrDatatypeRuleToken ruleConst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:445:2: ( (kw= '#t' | kw= '#f' ) )
            // InternalMyDsl.g:446:2: (kw= '#t' | kw= '#f' )
            {
            // InternalMyDsl.g:446:2: (kw= '#t' | kw= '#f' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:447:3: kw= '#t'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConstAccess().getTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:453:3: kw= '#f'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConstAccess().getFKeyword_1());
                    		

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
    // $ANTLR end "ruleConst"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});

}