package fr.gjouneau.dsl.sat.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.gjouneau.dsl.sat.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'EQUIV'", "'<=>'", "'IMPLIES'", "'->'", "'OR'", "'||'", "'AND'", "'&&'", "'NAND'", "'!&'", "'('", "')'", "'!'", "'NOT'"
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
        	return "ModelSAT";
       	}

       	@Override
       	protected SatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelSAT"
    // InternalSat.g:64:1: entryRuleModelSAT returns [EObject current=null] : iv_ruleModelSAT= ruleModelSAT EOF ;
    public final EObject entryRuleModelSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSAT = null;


        try {
            // InternalSat.g:64:49: (iv_ruleModelSAT= ruleModelSAT EOF )
            // InternalSat.g:65:2: iv_ruleModelSAT= ruleModelSAT EOF
            {
             newCompositeNode(grammarAccess.getModelSATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelSAT=ruleModelSAT();

            state._fsp--;

             current =iv_ruleModelSAT; 
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
    // $ANTLR end "entryRuleModelSAT"


    // $ANTLR start "ruleModelSAT"
    // InternalSat.g:71:1: ruleModelSAT returns [EObject current=null] : ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleModelSAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:77:2: ( ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )? ) )
            // InternalSat.g:78:2: ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )? )
            {
            // InternalSat.g:78:2: ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )? )
            // InternalSat.g:79:3: () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            {
            // InternalSat.g:79:3: ()
            // InternalSat.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelSATAccess().getModelSATAction_0(),
            					current);
            			

            }

            // InternalSat.g:86:3: ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==22||(LA2_0>=24 && LA2_0<=25)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSat.g:87:4: ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )*
                    {
                    // InternalSat.g:87:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalSat.g:88:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalSat.g:88:5: (lv_expression_1_0= ruleExpression )
                    // InternalSat.g:89:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getModelSATAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelSATRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"fr.gjouneau.dsl.sat.Sat.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSat.g:106:4: (otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSat.g:107:5: otherlv_2= ';' ( (lv_expression_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getModelSATAccess().getSemicolonKeyword_1_1_0());
                    	    				
                    	    // InternalSat.g:111:5: ( (lv_expression_3_0= ruleExpression ) )
                    	    // InternalSat.g:112:6: (lv_expression_3_0= ruleExpression )
                    	    {
                    	    // InternalSat.g:112:6: (lv_expression_3_0= ruleExpression )
                    	    // InternalSat.g:113:7: lv_expression_3_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelSATAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_expression_3_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelSATRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_3_0,
                    	    								"fr.gjouneau.dsl.sat.Sat.Expression");
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
    // $ANTLR end "ruleModelSAT"


    // $ANTLR start "entryRuleExpression"
    // InternalSat.g:136:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSat.g:136:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSat.g:137:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSat.g:143:1: ruleExpression returns [EObject current=null] : this_Equiv_0= ruleEquiv ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equiv_0 = null;



        	enterRule();

        try {
            // InternalSat.g:149:2: (this_Equiv_0= ruleEquiv )
            // InternalSat.g:150:2: this_Equiv_0= ruleEquiv
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getEquivParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Equiv_0=ruleEquiv();

            state._fsp--;


            		current = this_Equiv_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEquiv"
    // InternalSat.g:161:1: entryRuleEquiv returns [EObject current=null] : iv_ruleEquiv= ruleEquiv EOF ;
    public final EObject entryRuleEquiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquiv = null;


        try {
            // InternalSat.g:161:46: (iv_ruleEquiv= ruleEquiv EOF )
            // InternalSat.g:162:2: iv_ruleEquiv= ruleEquiv EOF
            {
             newCompositeNode(grammarAccess.getEquivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquiv=ruleEquiv();

            state._fsp--;

             current =iv_ruleEquiv; 
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
    // $ANTLR end "entryRuleEquiv"


    // $ANTLR start "ruleEquiv"
    // InternalSat.g:168:1: ruleEquiv returns [EObject current=null] : (this_Implies_0= ruleImplies ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )* ) ;
    public final EObject ruleEquiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Implies_0 = null;

        EObject lv_rhs_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:174:2: ( (this_Implies_0= ruleImplies ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )* ) )
            // InternalSat.g:175:2: (this_Implies_0= ruleImplies ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )* )
            {
            // InternalSat.g:175:2: (this_Implies_0= ruleImplies ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )* )
            // InternalSat.g:176:3: this_Implies_0= ruleImplies ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquivAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:184:3: ( () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSat.g:185:4: () (otherlv_2= 'EQUIV' | otherlv_3= '<=>' ) ( (lv_rhs_4_0= ruleImplies ) )
            	    {
            	    // InternalSat.g:185:4: ()
            	    // InternalSat.g:186:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquivAccess().getEquivLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:192:4: (otherlv_2= 'EQUIV' | otherlv_3= '<=>' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==12) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==13) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalSat.g:193:5: otherlv_2= 'EQUIV'
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEquivAccess().getEQUIVKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:198:5: otherlv_3= '<=>'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:203:4: ( (lv_rhs_4_0= ruleImplies ) )
            	    // InternalSat.g:204:5: (lv_rhs_4_0= ruleImplies )
            	    {
            	    // InternalSat.g:204:5: (lv_rhs_4_0= ruleImplies )
            	    // InternalSat.g:205:6: lv_rhs_4_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getEquivAccess().getRhsImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_4_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_4_0,
            	    							"fr.gjouneau.dsl.sat.Sat.Implies");
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
    // $ANTLR end "ruleEquiv"


    // $ANTLR start "entryRuleImplies"
    // InternalSat.g:227:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalSat.g:227:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalSat.g:228:2: iv_ruleImplies= ruleImplies EOF
            {
             newCompositeNode(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplies=ruleImplies();

            state._fsp--;

             current =iv_ruleImplies; 
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
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalSat.g:234:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Or_0 = null;

        EObject lv_rhs_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:240:2: ( (this_Or_0= ruleOr ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )* ) )
            // InternalSat.g:241:2: (this_Or_0= ruleOr ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )* )
            {
            // InternalSat.g:241:2: (this_Or_0= ruleOr ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )* )
            // InternalSat.g:242:3: this_Or_0= ruleOr ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:250:3: ( () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSat.g:251:4: () (otherlv_2= 'IMPLIES' | otherlv_3= '->' ) ( (lv_rhs_4_0= ruleOr ) )
            	    {
            	    // InternalSat.g:251:4: ()
            	    // InternalSat.g:252:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:258:4: (otherlv_2= 'IMPLIES' | otherlv_3= '->' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==14) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==15) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalSat.g:259:5: otherlv_2= 'IMPLIES'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getIMPLIESKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:264:5: otherlv_3= '->'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getImpliesAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:269:4: ( (lv_rhs_4_0= ruleOr ) )
            	    // InternalSat.g:270:5: (lv_rhs_4_0= ruleOr )
            	    {
            	    // InternalSat.g:270:5: (lv_rhs_4_0= ruleOr )
            	    // InternalSat.g:271:6: lv_rhs_4_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRhsOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rhs_4_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_4_0,
            	    							"fr.gjouneau.dsl.sat.Sat.Or");
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
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalSat.g:293:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSat.g:293:43: (iv_ruleOr= ruleOr EOF )
            // InternalSat.g:294:2: iv_ruleOr= ruleOr EOF
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
    // InternalSat.g:300:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_rhs_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:306:2: ( (this_And_0= ruleAnd ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )* ) )
            // InternalSat.g:307:2: (this_And_0= ruleAnd ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )* )
            {
            // InternalSat.g:307:2: (this_And_0= ruleAnd ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )* )
            // InternalSat.g:308:3: this_And_0= ruleAnd ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:316:3: ( () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSat.g:317:4: () (otherlv_2= 'OR' | otherlv_3= '||' ) ( (lv_rhs_4_0= ruleAnd ) )
            	    {
            	    // InternalSat.g:317:4: ()
            	    // InternalSat.g:318:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:324:4: (otherlv_2= 'OR' | otherlv_3= '||' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==16) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==17) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalSat.g:325:5: otherlv_2= 'OR'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:330:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:335:4: ( (lv_rhs_4_0= ruleAnd ) )
            	    // InternalSat.g:336:5: (lv_rhs_4_0= ruleAnd )
            	    {
            	    // InternalSat.g:336:5: (lv_rhs_4_0= ruleAnd )
            	    // InternalSat.g:337:6: lv_rhs_4_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rhs_4_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_4_0,
            	    							"fr.gjouneau.dsl.sat.Sat.And");
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
    // InternalSat.g:359:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSat.g:359:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSat.g:360:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSat.g:366:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Nand_0 = null;

        EObject lv_rhs_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:372:2: ( (this_Nand_0= ruleNand ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )* ) )
            // InternalSat.g:373:2: (this_Nand_0= ruleNand ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )* )
            {
            // InternalSat.g:373:2: (this_Nand_0= ruleNand ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )* )
            // InternalSat.g:374:3: this_Nand_0= ruleNand ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:382:3: ( () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSat.g:383:4: () (otherlv_2= 'AND' | otherlv_3= '&&' ) ( (lv_rhs_4_0= ruleNand ) )
            	    {
            	    // InternalSat.g:383:4: ()
            	    // InternalSat.g:384:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:390:4: (otherlv_2= 'AND' | otherlv_3= '&&' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==18) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==19) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalSat.g:391:5: otherlv_2= 'AND'
            	            {
            	            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:396:5: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:401:4: ( (lv_rhs_4_0= ruleNand ) )
            	    // InternalSat.g:402:5: (lv_rhs_4_0= ruleNand )
            	    {
            	    // InternalSat.g:402:5: (lv_rhs_4_0= ruleNand )
            	    // InternalSat.g:403:6: lv_rhs_4_0= ruleNand
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRhsNandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rhs_4_0=ruleNand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_4_0,
            	    							"fr.gjouneau.dsl.sat.Sat.Nand");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // InternalSat.g:425:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalSat.g:425:45: (iv_ruleNand= ruleNand EOF )
            // InternalSat.g:426:2: iv_ruleNand= ruleNand EOF
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
    // InternalSat.g:432:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:438:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )* ) )
            // InternalSat.g:439:2: (this_Primary_0= rulePrimary ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )* )
            {
            // InternalSat.g:439:2: (this_Primary_0= rulePrimary ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )* )
            // InternalSat.g:440:3: this_Primary_0= rulePrimary ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:448:3: ( () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSat.g:449:4: () (otherlv_2= 'NAND' | otherlv_3= '!&' ) ( (lv_rhs_4_0= rulePrimary ) )
            	    {
            	    // InternalSat.g:449:4: ()
            	    // InternalSat.g:450:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:456:4: (otherlv_2= 'NAND' | otherlv_3= '!&' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==20) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==21) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalSat.g:457:5: otherlv_2= 'NAND'
            	            {
            	            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getNANDKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:462:5: otherlv_3= '!&'
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getExclamationMarkAmpersandKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:467:4: ( (lv_rhs_4_0= rulePrimary ) )
            	    // InternalSat.g:468:5: (lv_rhs_4_0= rulePrimary )
            	    {
            	    // InternalSat.g:468:5: (lv_rhs_4_0= rulePrimary )
            	    // InternalSat.g:469:6: lv_rhs_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getNandAccess().getRhsPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_rhs_4_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNandRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_4_0,
            	    							"fr.gjouneau.dsl.sat.Sat.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // InternalSat.g:491:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSat.g:491:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSat.g:492:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSat.g:498:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_6_0 = null;

        EObject this_Atomic_7 = null;



        	enterRule();

        try {
            // InternalSat.g:504:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic ) )
            // InternalSat.g:505:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic )
            {
            // InternalSat.g:505:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 24:
            case 25:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSat.g:506:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSat.g:506:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSat.g:507:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:525:3: ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalSat.g:525:3: ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalSat.g:526:4: () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalSat.g:526:4: ()
                    // InternalSat.g:527:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSat.g:533:4: (otherlv_4= '!' | otherlv_5= 'NOT' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==25) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSat.g:534:5: otherlv_4= '!'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSat.g:539:5: otherlv_5= 'NOT'
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_4); 

                            					newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getNOTKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSat.g:544:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalSat.g:545:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalSat.g:545:5: (lv_expression_6_0= rulePrimary )
                    // InternalSat.g:546:6: lv_expression_6_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"fr.gjouneau.dsl.sat.Sat.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:565:3: this_Atomic_7= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_7=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_7;
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


    // $ANTLR start "entryRuleAtomic"
    // InternalSat.g:577:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSat.g:577:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSat.g:578:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalSat.g:584:1: ruleAtomic returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSat.g:590:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSat.g:591:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSat.g:591:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSat.g:592:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSat.g:592:3: ()
            // InternalSat.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalSat.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSat.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSat.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalSat.g:601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtomicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003400010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});

}