package projetDSL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import projetDSL.services.SATLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSATLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Systeme'", "'{'", "'}'", "'Variable'", "':'", "'Expression'", "'<->'", "'<-!>'", "'->'", "'ou'", "'et'", "'non'", "'('", "')'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSATLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSATLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSATLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSATL.g"; }



     	private SATLGrammarAccess grammarAccess;

        public InternalSATLParser(TokenStream input, SATLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BooleanExpressionsSystem";
       	}

       	@Override
       	protected SATLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBooleanExpressionsSystem"
    // InternalSATL.g:64:1: entryRuleBooleanExpressionsSystem returns [EObject current=null] : iv_ruleBooleanExpressionsSystem= ruleBooleanExpressionsSystem EOF ;
    public final EObject entryRuleBooleanExpressionsSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionsSystem = null;


        try {
            // InternalSATL.g:64:65: (iv_ruleBooleanExpressionsSystem= ruleBooleanExpressionsSystem EOF )
            // InternalSATL.g:65:2: iv_ruleBooleanExpressionsSystem= ruleBooleanExpressionsSystem EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionsSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionsSystem=ruleBooleanExpressionsSystem();

            state._fsp--;

             current =iv_ruleBooleanExpressionsSystem; 
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
    // $ANTLR end "entryRuleBooleanExpressionsSystem"


    // $ANTLR start "ruleBooleanExpressionsSystem"
    // InternalSATL.g:71:1: ruleBooleanExpressionsSystem returns [EObject current=null] : ( () otherlv_1= 'Systeme' otherlv_2= '{' ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )* otherlv_4= '}' ) ;
    public final EObject ruleBooleanExpressionsSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_booleanExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:77:2: ( ( () otherlv_1= 'Systeme' otherlv_2= '{' ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )* otherlv_4= '}' ) )
            // InternalSATL.g:78:2: ( () otherlv_1= 'Systeme' otherlv_2= '{' ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )* otherlv_4= '}' )
            {
            // InternalSATL.g:78:2: ( () otherlv_1= 'Systeme' otherlv_2= '{' ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )* otherlv_4= '}' )
            // InternalSATL.g:79:3: () otherlv_1= 'Systeme' otherlv_2= '{' ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )* otherlv_4= '}'
            {
            // InternalSATL.g:79:3: ()
            // InternalSATL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanExpressionsSystemAccess().getBooleanExpressionsSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanExpressionsSystemAccess().getSystemeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionsSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSATL.g:94:3: ( (lv_booleanExpressions_3_0= ruleBooleanExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSATL.g:95:4: (lv_booleanExpressions_3_0= ruleBooleanExpression )
            	    {
            	    // InternalSATL.g:95:4: (lv_booleanExpressions_3_0= ruleBooleanExpression )
            	    // InternalSATL.g:96:5: lv_booleanExpressions_3_0= ruleBooleanExpression
            	    {

            	    					newCompositeNode(grammarAccess.getBooleanExpressionsSystemAccess().getBooleanExpressionsBooleanExpressionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_booleanExpressions_3_0=ruleBooleanExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBooleanExpressionsSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"booleanExpressions",
            	    						lv_booleanExpressions_3_0,
            	    						"projetDSL.SATL.BooleanExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBooleanExpressionsSystemAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBooleanExpressionsSystem"


    // $ANTLR start "entryRuleVariable"
    // InternalSATL.g:121:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSATL.g:121:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSATL.g:122:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSATL.g:128:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSATL.g:134:2: ( (otherlv_0= 'Variable' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalSATL.g:135:2: (otherlv_0= 'Variable' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalSATL.g:135:2: (otherlv_0= 'Variable' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalSATL.g:136:3: otherlv_0= 'Variable' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalSATL.g:144:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSATL.g:145:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSATL.g:145:4: (lv_name_2_0= RULE_STRING )
            // InternalSATL.g:146:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalSATL.g:166:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalSATL.g:166:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalSATL.g:167:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalSATL.g:173:1: ruleBooleanExpression returns [EObject current=null] : (otherlv_0= 'Expression' (this_ID_1= RULE_ID )? otherlv_2= '{' ( (lv_expression_3_0= ruleBasicExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:179:2: ( (otherlv_0= 'Expression' (this_ID_1= RULE_ID )? otherlv_2= '{' ( (lv_expression_3_0= ruleBasicExpression ) ) otherlv_4= '}' ) )
            // InternalSATL.g:180:2: (otherlv_0= 'Expression' (this_ID_1= RULE_ID )? otherlv_2= '{' ( (lv_expression_3_0= ruleBasicExpression ) ) otherlv_4= '}' )
            {
            // InternalSATL.g:180:2: (otherlv_0= 'Expression' (this_ID_1= RULE_ID )? otherlv_2= '{' ( (lv_expression_3_0= ruleBasicExpression ) ) otherlv_4= '}' )
            // InternalSATL.g:181:3: otherlv_0= 'Expression' (this_ID_1= RULE_ID )? otherlv_2= '{' ( (lv_expression_3_0= ruleBasicExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionAccess().getExpressionKeyword_0());
            		
            // InternalSATL.g:185:3: (this_ID_1= RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSATL.g:186:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_3); 

                    				newLeafNode(this_ID_1, grammarAccess.getBooleanExpressionAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSATL.g:195:3: ( (lv_expression_3_0= ruleBasicExpression ) )
            // InternalSATL.g:196:4: (lv_expression_3_0= ruleBasicExpression )
            {
            // InternalSATL.g:196:4: (lv_expression_3_0= ruleBasicExpression )
            // InternalSATL.g:197:5: lv_expression_3_0= ruleBasicExpression
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getExpressionBasicExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_expression_3_0=ruleBasicExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"projetDSL.SATL.BasicExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBooleanExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleOperatorExpression"
    // InternalSATL.g:222:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // InternalSATL.g:222:59: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // InternalSATL.g:223:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorExpression=ruleOperatorExpression();

            state._fsp--;

             current =iv_ruleOperatorExpression; 
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
    // $ANTLR end "entryRuleOperatorExpression"


    // $ANTLR start "ruleOperatorExpression"
    // InternalSATL.g:229:1: ruleOperatorExpression returns [EObject current=null] : ( (lv_expression_0_0= ruleBiimpliesOperatorExpression ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:235:2: ( ( (lv_expression_0_0= ruleBiimpliesOperatorExpression ) ) )
            // InternalSATL.g:236:2: ( (lv_expression_0_0= ruleBiimpliesOperatorExpression ) )
            {
            // InternalSATL.g:236:2: ( (lv_expression_0_0= ruleBiimpliesOperatorExpression ) )
            // InternalSATL.g:237:3: (lv_expression_0_0= ruleBiimpliesOperatorExpression )
            {
            // InternalSATL.g:237:3: (lv_expression_0_0= ruleBiimpliesOperatorExpression )
            // InternalSATL.g:238:4: lv_expression_0_0= ruleBiimpliesOperatorExpression
            {

            				newCompositeNode(grammarAccess.getOperatorExpressionAccess().getExpressionBiimpliesOperatorExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleBiimpliesOperatorExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
            				}
            				add(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"projetDSL.SATL.BiimpliesOperatorExpression");
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
    // $ANTLR end "ruleOperatorExpression"


    // $ANTLR start "entryRuleBiimpliesOperatorExpression"
    // InternalSATL.g:258:1: entryRuleBiimpliesOperatorExpression returns [EObject current=null] : iv_ruleBiimpliesOperatorExpression= ruleBiimpliesOperatorExpression EOF ;
    public final EObject entryRuleBiimpliesOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiimpliesOperatorExpression = null;


        try {
            // InternalSATL.g:258:68: (iv_ruleBiimpliesOperatorExpression= ruleBiimpliesOperatorExpression EOF )
            // InternalSATL.g:259:2: iv_ruleBiimpliesOperatorExpression= ruleBiimpliesOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getBiimpliesOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiimpliesOperatorExpression=ruleBiimpliesOperatorExpression();

            state._fsp--;

             current =iv_ruleBiimpliesOperatorExpression; 
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
    // $ANTLR end "entryRuleBiimpliesOperatorExpression"


    // $ANTLR start "ruleBiimpliesOperatorExpression"
    // InternalSATL.g:265:1: ruleBiimpliesOperatorExpression returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) ) (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )* ) ;
    public final EObject ruleBiimpliesOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftMember_0_0 = null;

        EObject lv_rightMember_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:271:2: ( ( ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) ) (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )* ) )
            // InternalSATL.g:272:2: ( ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) ) (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )* )
            {
            // InternalSATL.g:272:2: ( ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) ) (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )* )
            // InternalSATL.g:273:3: ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) ) (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )*
            {
            // InternalSATL.g:273:3: ( (lv_leftMember_0_0= ruleExcludesOperatorExpression ) )
            // InternalSATL.g:274:4: (lv_leftMember_0_0= ruleExcludesOperatorExpression )
            {
            // InternalSATL.g:274:4: (lv_leftMember_0_0= ruleExcludesOperatorExpression )
            // InternalSATL.g:275:5: lv_leftMember_0_0= ruleExcludesOperatorExpression
            {

            					newCompositeNode(grammarAccess.getBiimpliesOperatorExpressionAccess().getLeftMemberExcludesOperatorExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_leftMember_0_0=ruleExcludesOperatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiimpliesOperatorExpressionRule());
            					}
            					add(
            						current,
            						"leftMember",
            						lv_leftMember_0_0,
            						"projetDSL.SATL.ExcludesOperatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSATL.g:292:3: (otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSATL.g:293:4: otherlv_1= '<->' ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBiimpliesOperatorExpressionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalSATL.g:297:4: ( (lv_rightMember_2_0= ruleExcludesOperatorExpression ) )
            	    // InternalSATL.g:298:5: (lv_rightMember_2_0= ruleExcludesOperatorExpression )
            	    {
            	    // InternalSATL.g:298:5: (lv_rightMember_2_0= ruleExcludesOperatorExpression )
            	    // InternalSATL.g:299:6: lv_rightMember_2_0= ruleExcludesOperatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBiimpliesOperatorExpressionAccess().getRightMemberExcludesOperatorExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_rightMember_2_0=ruleExcludesOperatorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBiimpliesOperatorExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rightMember",
            	    							lv_rightMember_2_0,
            	    							"projetDSL.SATL.ExcludesOperatorExpression");
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
    // $ANTLR end "ruleBiimpliesOperatorExpression"


    // $ANTLR start "entryRuleExcludesOperatorExpression"
    // InternalSATL.g:321:1: entryRuleExcludesOperatorExpression returns [EObject current=null] : iv_ruleExcludesOperatorExpression= ruleExcludesOperatorExpression EOF ;
    public final EObject entryRuleExcludesOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExcludesOperatorExpression = null;


        try {
            // InternalSATL.g:321:67: (iv_ruleExcludesOperatorExpression= ruleExcludesOperatorExpression EOF )
            // InternalSATL.g:322:2: iv_ruleExcludesOperatorExpression= ruleExcludesOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getExcludesOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExcludesOperatorExpression=ruleExcludesOperatorExpression();

            state._fsp--;

             current =iv_ruleExcludesOperatorExpression; 
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
    // $ANTLR end "entryRuleExcludesOperatorExpression"


    // $ANTLR start "ruleExcludesOperatorExpression"
    // InternalSATL.g:328:1: ruleExcludesOperatorExpression returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) ) (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )? ) ;
    public final EObject ruleExcludesOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftMember_0_0 = null;

        EObject lv_rightMember_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:334:2: ( ( ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) ) (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )? ) )
            // InternalSATL.g:335:2: ( ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) ) (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )? )
            {
            // InternalSATL.g:335:2: ( ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) ) (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )? )
            // InternalSATL.g:336:3: ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) ) (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )?
            {
            // InternalSATL.g:336:3: ( (lv_leftMember_0_0= ruleImpliesOperatorExpression ) )
            // InternalSATL.g:337:4: (lv_leftMember_0_0= ruleImpliesOperatorExpression )
            {
            // InternalSATL.g:337:4: (lv_leftMember_0_0= ruleImpliesOperatorExpression )
            // InternalSATL.g:338:5: lv_leftMember_0_0= ruleImpliesOperatorExpression
            {

            					newCompositeNode(grammarAccess.getExcludesOperatorExpressionAccess().getLeftMemberImpliesOperatorExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_leftMember_0_0=ruleImpliesOperatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExcludesOperatorExpressionRule());
            					}
            					add(
            						current,
            						"leftMember",
            						lv_leftMember_0_0,
            						"projetDSL.SATL.ImpliesOperatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSATL.g:355:3: (otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSATL.g:356:4: otherlv_1= '<-!>' ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getExcludesOperatorExpressionAccess().getLessThanSignHyphenMinusExclamationMarkGreaterThanSignKeyword_1_0());
                    			
                    // InternalSATL.g:360:4: ( (lv_rightMember_2_0= ruleImpliesOperatorExpression ) )
                    // InternalSATL.g:361:5: (lv_rightMember_2_0= ruleImpliesOperatorExpression )
                    {
                    // InternalSATL.g:361:5: (lv_rightMember_2_0= ruleImpliesOperatorExpression )
                    // InternalSATL.g:362:6: lv_rightMember_2_0= ruleImpliesOperatorExpression
                    {

                    						newCompositeNode(grammarAccess.getExcludesOperatorExpressionAccess().getRightMemberImpliesOperatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightMember_2_0=ruleImpliesOperatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExcludesOperatorExpressionRule());
                    						}
                    						add(
                    							current,
                    							"rightMember",
                    							lv_rightMember_2_0,
                    							"projetDSL.SATL.ImpliesOperatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleExcludesOperatorExpression"


    // $ANTLR start "entryRuleImpliesOperatorExpression"
    // InternalSATL.g:384:1: entryRuleImpliesOperatorExpression returns [EObject current=null] : iv_ruleImpliesOperatorExpression= ruleImpliesOperatorExpression EOF ;
    public final EObject entryRuleImpliesOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperatorExpression = null;


        try {
            // InternalSATL.g:384:66: (iv_ruleImpliesOperatorExpression= ruleImpliesOperatorExpression EOF )
            // InternalSATL.g:385:2: iv_ruleImpliesOperatorExpression= ruleImpliesOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesOperatorExpression=ruleImpliesOperatorExpression();

            state._fsp--;

             current =iv_ruleImpliesOperatorExpression; 
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
    // $ANTLR end "entryRuleImpliesOperatorExpression"


    // $ANTLR start "ruleImpliesOperatorExpression"
    // InternalSATL.g:391:1: ruleImpliesOperatorExpression returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleOrOperatorExpression ) ) (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )? ) ;
    public final EObject ruleImpliesOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftMember_0_0 = null;

        EObject lv_rightMember_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:397:2: ( ( ( (lv_leftMember_0_0= ruleOrOperatorExpression ) ) (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )? ) )
            // InternalSATL.g:398:2: ( ( (lv_leftMember_0_0= ruleOrOperatorExpression ) ) (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )? )
            {
            // InternalSATL.g:398:2: ( ( (lv_leftMember_0_0= ruleOrOperatorExpression ) ) (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )? )
            // InternalSATL.g:399:3: ( (lv_leftMember_0_0= ruleOrOperatorExpression ) ) (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )?
            {
            // InternalSATL.g:399:3: ( (lv_leftMember_0_0= ruleOrOperatorExpression ) )
            // InternalSATL.g:400:4: (lv_leftMember_0_0= ruleOrOperatorExpression )
            {
            // InternalSATL.g:400:4: (lv_leftMember_0_0= ruleOrOperatorExpression )
            // InternalSATL.g:401:5: lv_leftMember_0_0= ruleOrOperatorExpression
            {

            					newCompositeNode(grammarAccess.getImpliesOperatorExpressionAccess().getLeftMemberOrOperatorExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_leftMember_0_0=ruleOrOperatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImpliesOperatorExpressionRule());
            					}
            					add(
            						current,
            						"leftMember",
            						lv_leftMember_0_0,
            						"projetDSL.SATL.OrOperatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSATL.g:418:3: (otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSATL.g:419:4: otherlv_1= '->' ( (lv_rightMember_2_0= ruleOrOperatorExpression ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getImpliesOperatorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalSATL.g:423:4: ( (lv_rightMember_2_0= ruleOrOperatorExpression ) )
                    // InternalSATL.g:424:5: (lv_rightMember_2_0= ruleOrOperatorExpression )
                    {
                    // InternalSATL.g:424:5: (lv_rightMember_2_0= ruleOrOperatorExpression )
                    // InternalSATL.g:425:6: lv_rightMember_2_0= ruleOrOperatorExpression
                    {

                    						newCompositeNode(grammarAccess.getImpliesOperatorExpressionAccess().getRightMemberOrOperatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightMember_2_0=ruleOrOperatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpliesOperatorExpressionRule());
                    						}
                    						add(
                    							current,
                    							"rightMember",
                    							lv_rightMember_2_0,
                    							"projetDSL.SATL.OrOperatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleImpliesOperatorExpression"


    // $ANTLR start "entryRuleOrOperatorExpression"
    // InternalSATL.g:447:1: entryRuleOrOperatorExpression returns [EObject current=null] : iv_ruleOrOperatorExpression= ruleOrOperatorExpression EOF ;
    public final EObject entryRuleOrOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperatorExpression = null;


        try {
            // InternalSATL.g:447:61: (iv_ruleOrOperatorExpression= ruleOrOperatorExpression EOF )
            // InternalSATL.g:448:2: iv_ruleOrOperatorExpression= ruleOrOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getOrOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrOperatorExpression=ruleOrOperatorExpression();

            state._fsp--;

             current =iv_ruleOrOperatorExpression; 
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
    // $ANTLR end "entryRuleOrOperatorExpression"


    // $ANTLR start "ruleOrOperatorExpression"
    // InternalSATL.g:454:1: ruleOrOperatorExpression returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleAndOperatorExpression ) ) (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )* ) ;
    public final EObject ruleOrOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftMember_0_0 = null;

        EObject lv_rightMember_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:460:2: ( ( ( (lv_leftMember_0_0= ruleAndOperatorExpression ) ) (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )* ) )
            // InternalSATL.g:461:2: ( ( (lv_leftMember_0_0= ruleAndOperatorExpression ) ) (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )* )
            {
            // InternalSATL.g:461:2: ( ( (lv_leftMember_0_0= ruleAndOperatorExpression ) ) (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )* )
            // InternalSATL.g:462:3: ( (lv_leftMember_0_0= ruleAndOperatorExpression ) ) (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )*
            {
            // InternalSATL.g:462:3: ( (lv_leftMember_0_0= ruleAndOperatorExpression ) )
            // InternalSATL.g:463:4: (lv_leftMember_0_0= ruleAndOperatorExpression )
            {
            // InternalSATL.g:463:4: (lv_leftMember_0_0= ruleAndOperatorExpression )
            // InternalSATL.g:464:5: lv_leftMember_0_0= ruleAndOperatorExpression
            {

            					newCompositeNode(grammarAccess.getOrOperatorExpressionAccess().getLeftMemberAndOperatorExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_leftMember_0_0=ruleAndOperatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrOperatorExpressionRule());
            					}
            					add(
            						current,
            						"leftMember",
            						lv_leftMember_0_0,
            						"projetDSL.SATL.AndOperatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSATL.g:481:3: (otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSATL.g:482:4: otherlv_1= 'ou' ( (lv_rightMember_2_0= ruleAndOperatorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrOperatorExpressionAccess().getOuKeyword_1_0());
            	    			
            	    // InternalSATL.g:486:4: ( (lv_rightMember_2_0= ruleAndOperatorExpression ) )
            	    // InternalSATL.g:487:5: (lv_rightMember_2_0= ruleAndOperatorExpression )
            	    {
            	    // InternalSATL.g:487:5: (lv_rightMember_2_0= ruleAndOperatorExpression )
            	    // InternalSATL.g:488:6: lv_rightMember_2_0= ruleAndOperatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrOperatorExpressionAccess().getRightMemberAndOperatorExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rightMember_2_0=ruleAndOperatorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrOperatorExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rightMember",
            	    							lv_rightMember_2_0,
            	    							"projetDSL.SATL.AndOperatorExpression");
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
    // $ANTLR end "ruleOrOperatorExpression"


    // $ANTLR start "entryRuleAndOperatorExpression"
    // InternalSATL.g:510:1: entryRuleAndOperatorExpression returns [EObject current=null] : iv_ruleAndOperatorExpression= ruleAndOperatorExpression EOF ;
    public final EObject entryRuleAndOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperatorExpression = null;


        try {
            // InternalSATL.g:510:62: (iv_ruleAndOperatorExpression= ruleAndOperatorExpression EOF )
            // InternalSATL.g:511:2: iv_ruleAndOperatorExpression= ruleAndOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getAndOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOperatorExpression=ruleAndOperatorExpression();

            state._fsp--;

             current =iv_ruleAndOperatorExpression; 
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
    // $ANTLR end "entryRuleAndOperatorExpression"


    // $ANTLR start "ruleAndOperatorExpression"
    // InternalSATL.g:517:1: ruleAndOperatorExpression returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleNegOperatorExpression ) ) (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )* ) ;
    public final EObject ruleAndOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftMember_0_0 = null;

        EObject lv_rightMember_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:523:2: ( ( ( (lv_leftMember_0_0= ruleNegOperatorExpression ) ) (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )* ) )
            // InternalSATL.g:524:2: ( ( (lv_leftMember_0_0= ruleNegOperatorExpression ) ) (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )* )
            {
            // InternalSATL.g:524:2: ( ( (lv_leftMember_0_0= ruleNegOperatorExpression ) ) (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )* )
            // InternalSATL.g:525:3: ( (lv_leftMember_0_0= ruleNegOperatorExpression ) ) (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )*
            {
            // InternalSATL.g:525:3: ( (lv_leftMember_0_0= ruleNegOperatorExpression ) )
            // InternalSATL.g:526:4: (lv_leftMember_0_0= ruleNegOperatorExpression )
            {
            // InternalSATL.g:526:4: (lv_leftMember_0_0= ruleNegOperatorExpression )
            // InternalSATL.g:527:5: lv_leftMember_0_0= ruleNegOperatorExpression
            {

            					newCompositeNode(grammarAccess.getAndOperatorExpressionAccess().getLeftMemberNegOperatorExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_leftMember_0_0=ruleNegOperatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndOperatorExpressionRule());
            					}
            					add(
            						current,
            						"leftMember",
            						lv_leftMember_0_0,
            						"projetDSL.SATL.NegOperatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSATL.g:544:3: (otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSATL.g:545:4: otherlv_1= 'et' ( (lv_rightMember_2_0= ruleNegOperatorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndOperatorExpressionAccess().getEtKeyword_1_0());
            	    			
            	    // InternalSATL.g:549:4: ( (lv_rightMember_2_0= ruleNegOperatorExpression ) )
            	    // InternalSATL.g:550:5: (lv_rightMember_2_0= ruleNegOperatorExpression )
            	    {
            	    // InternalSATL.g:550:5: (lv_rightMember_2_0= ruleNegOperatorExpression )
            	    // InternalSATL.g:551:6: lv_rightMember_2_0= ruleNegOperatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndOperatorExpressionAccess().getRightMemberNegOperatorExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_rightMember_2_0=ruleNegOperatorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndOperatorExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rightMember",
            	    							lv_rightMember_2_0,
            	    							"projetDSL.SATL.NegOperatorExpression");
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
    // $ANTLR end "ruleAndOperatorExpression"


    // $ANTLR start "entryRuleNegOperatorExpression"
    // InternalSATL.g:573:1: entryRuleNegOperatorExpression returns [EObject current=null] : iv_ruleNegOperatorExpression= ruleNegOperatorExpression EOF ;
    public final EObject entryRuleNegOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegOperatorExpression = null;


        try {
            // InternalSATL.g:573:62: (iv_ruleNegOperatorExpression= ruleNegOperatorExpression EOF )
            // InternalSATL.g:574:2: iv_ruleNegOperatorExpression= ruleNegOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getNegOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegOperatorExpression=ruleNegOperatorExpression();

            state._fsp--;

             current =iv_ruleNegOperatorExpression; 
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
    // $ANTLR end "entryRuleNegOperatorExpression"


    // $ANTLR start "ruleNegOperatorExpression"
    // InternalSATL.g:580:1: ruleNegOperatorExpression returns [EObject current=null] : ( (otherlv_0= 'non' )? ( (lv_negatedMember_1_0= ruleBasicExpression ) ) ) ;
    public final EObject ruleNegOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_negatedMember_1_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:586:2: ( ( (otherlv_0= 'non' )? ( (lv_negatedMember_1_0= ruleBasicExpression ) ) ) )
            // InternalSATL.g:587:2: ( (otherlv_0= 'non' )? ( (lv_negatedMember_1_0= ruleBasicExpression ) ) )
            {
            // InternalSATL.g:587:2: ( (otherlv_0= 'non' )? ( (lv_negatedMember_1_0= ruleBasicExpression ) ) )
            // InternalSATL.g:588:3: (otherlv_0= 'non' )? ( (lv_negatedMember_1_0= ruleBasicExpression ) )
            {
            // InternalSATL.g:588:3: (otherlv_0= 'non' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSATL.g:589:4: otherlv_0= 'non'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getNegOperatorExpressionAccess().getNonKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSATL.g:594:3: ( (lv_negatedMember_1_0= ruleBasicExpression ) )
            // InternalSATL.g:595:4: (lv_negatedMember_1_0= ruleBasicExpression )
            {
            // InternalSATL.g:595:4: (lv_negatedMember_1_0= ruleBasicExpression )
            // InternalSATL.g:596:5: lv_negatedMember_1_0= ruleBasicExpression
            {

            					newCompositeNode(grammarAccess.getNegOperatorExpressionAccess().getNegatedMemberBasicExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_negatedMember_1_0=ruleBasicExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegOperatorExpressionRule());
            					}
            					add(
            						current,
            						"negatedMember",
            						lv_negatedMember_1_0,
            						"projetDSL.SATL.BasicExpression");
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
    // $ANTLR end "ruleNegOperatorExpression"


    // $ANTLR start "entryRuleBasicExpression"
    // InternalSATL.g:617:1: entryRuleBasicExpression returns [EObject current=null] : iv_ruleBasicExpression= ruleBasicExpression EOF ;
    public final EObject entryRuleBasicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicExpression = null;


        try {
            // InternalSATL.g:617:56: (iv_ruleBasicExpression= ruleBasicExpression EOF )
            // InternalSATL.g:618:2: iv_ruleBasicExpression= ruleBasicExpression EOF
            {
             newCompositeNode(grammarAccess.getBasicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicExpression=ruleBasicExpression();

            state._fsp--;

             current =iv_ruleBasicExpression; 
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
    // $ANTLR end "entryRuleBasicExpression"


    // $ANTLR start "ruleBasicExpression"
    // InternalSATL.g:624:1: ruleBasicExpression returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleBasicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;

        EObject lv_operatorExpression_2_0 = null;



        	enterRule();

        try {
            // InternalSATL.g:630:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' ) ) )
            // InternalSATL.g:631:2: ( ( (lv_variable_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' ) )
            {
            // InternalSATL.g:631:2: ( ( (lv_variable_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSATL.g:632:3: ( (lv_variable_0_0= ruleVariable ) )
                    {
                    // InternalSATL.g:632:3: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalSATL.g:633:4: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalSATL.g:633:4: (lv_variable_0_0= ruleVariable )
                    // InternalSATL.g:634:5: lv_variable_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getBasicExpressionAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBasicExpressionRule());
                    					}
                    					add(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"projetDSL.SATL.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSATL.g:652:3: (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' )
                    {
                    // InternalSATL.g:652:3: (otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')' )
                    // InternalSATL.g:653:4: otherlv_1= '(' ( (lv_operatorExpression_2_0= ruleOperatorExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getBasicExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSATL.g:657:4: ( (lv_operatorExpression_2_0= ruleOperatorExpression ) )
                    // InternalSATL.g:658:5: (lv_operatorExpression_2_0= ruleOperatorExpression )
                    {
                    // InternalSATL.g:658:5: (lv_operatorExpression_2_0= ruleOperatorExpression )
                    // InternalSATL.g:659:6: lv_operatorExpression_2_0= ruleOperatorExpression
                    {

                    						newCompositeNode(grammarAccess.getBasicExpressionAccess().getOperatorExpressionOperatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operatorExpression_2_0=ruleOperatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operatorExpression",
                    							lv_operatorExpression_2_0,
                    							"projetDSL.SATL.OperatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleBasicExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}