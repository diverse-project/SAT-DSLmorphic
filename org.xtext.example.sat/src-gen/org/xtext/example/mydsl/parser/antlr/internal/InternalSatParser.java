package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'\\u2191'", "'('", "')'", "'!'", "'~'", "'true'", "'false'"
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
        	return "Model";
       	}

       	@Override
       	protected SatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSat.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSat.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSat.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalSat.g:71:1: ruleModel returns [EObject current=null] : this_BiImpl_0= ruleBiImpl ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_BiImpl_0 = null;



        	enterRule();

        try {
            // InternalSat.g:77:2: (this_BiImpl_0= ruleBiImpl )
            // InternalSat.g:78:2: this_BiImpl_0= ruleBiImpl
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
    // InternalSat.g:89:1: entryRuleBiImpl returns [EObject current=null] : iv_ruleBiImpl= ruleBiImpl EOF ;
    public final EObject entryRuleBiImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImpl = null;


        try {
            // InternalSat.g:89:47: (iv_ruleBiImpl= ruleBiImpl EOF )
            // InternalSat.g:90:2: iv_ruleBiImpl= ruleBiImpl EOF
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
    // InternalSat.g:96:1: ruleBiImpl returns [EObject current=null] : (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) ;
    public final EObject ruleBiImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Impl_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:102:2: ( (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) )
            // InternalSat.g:103:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            {
            // InternalSat.g:103:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            // InternalSat.g:104:3: this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplAccess().getImplParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Impl_0=ruleImpl();

            state._fsp--;


            			current = this_Impl_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:112:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSat.g:113:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) )
            	    {
            	    // InternalSat.g:113:4: ()
            	    // InternalSat.g:114:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSat.g:124:4: ( (lv_right_3_0= ruleImpl ) )
            	    // InternalSat.g:125:5: (lv_right_3_0= ruleImpl )
            	    {
            	    // InternalSat.g:125:5: (lv_right_3_0= ruleImpl )
            	    // InternalSat.g:126:6: lv_right_3_0= ruleImpl
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
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
            	    break loop1;
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
    // InternalSat.g:148:1: entryRuleImpl returns [EObject current=null] : iv_ruleImpl= ruleImpl EOF ;
    public final EObject entryRuleImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpl = null;


        try {
            // InternalSat.g:148:45: (iv_ruleImpl= ruleImpl EOF )
            // InternalSat.g:149:2: iv_ruleImpl= ruleImpl EOF
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
    // InternalSat.g:155:1: ruleImpl returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:161:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalSat.g:162:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalSat.g:162:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalSat.g:163:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:171:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSat.g:172:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalSat.g:172:4: ()
            	    // InternalSat.g:173:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplAccess().getImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSat.g:183:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalSat.g:184:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalSat.g:184:5: (lv_right_3_0= ruleOr )
            	    // InternalSat.g:185:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
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
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalSat.g:207:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSat.g:207:43: (iv_ruleOr= ruleOr EOF )
            // InternalSat.g:208:2: iv_ruleOr= ruleOr EOF
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
    // InternalSat.g:214:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:220:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSat.g:221:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSat.g:221:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSat.g:222:3: this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:230:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSat.g:231:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSat.g:231:4: ()
            	    // InternalSat.g:232:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVKeyword_1_1());
            	    			
            	    // InternalSat.g:242:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSat.g:243:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSat.g:243:5: (lv_right_3_0= ruleAnd )
            	    // InternalSat.g:244:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSat.g:266:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSat.g:266:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSat.g:267:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSat.g:273:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nand_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSat.g:279:2: ( (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) )
            // InternalSat.g:280:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            {
            // InternalSat.g:280:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            // InternalSat.g:281:3: this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:289:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSat.g:290:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) )
            	    {
            	    // InternalSat.g:290:4: ()
            	    // InternalSat.g:291:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalSat.g:301:4: ( (lv_right_3_0= ruleNand ) )
            	    // InternalSat.g:302:5: (lv_right_3_0= ruleNand )
            	    {
            	    // InternalSat.g:302:5: (lv_right_3_0= ruleNand )
            	    // InternalSat.g:303:6: lv_right_3_0= ruleNand
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNand"
    // InternalSat.g:325:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalSat.g:325:45: (iv_ruleNand= ruleNand EOF )
            // InternalSat.g:326:2: iv_ruleNand= ruleNand EOF
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
    // InternalSat.g:332:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSat.g:338:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) )
            // InternalSat.g:339:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            {
            // InternalSat.g:339:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            // InternalSat.g:340:3: this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSat.g:348:3: ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSat.g:349:4: () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) )
            	    {
            	    // InternalSat.g:349:4: ()
            	    // InternalSat.g:350:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSat.g:356:4: (otherlv_2= '|' | otherlv_3= '\\u2191' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==16) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalSat.g:357:5: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSat.g:362:5: otherlv_3= '\\u2191'
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSat.g:367:4: ( (lv_right_4_0= rulePrimary ) )
            	    // InternalSat.g:368:5: (lv_right_4_0= rulePrimary )
            	    {
            	    // InternalSat.g:368:5: (lv_right_4_0= rulePrimary )
            	    // InternalSat.g:369:6: lv_right_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleNand"


    // $ANTLR start "entryRulePrimary"
    // InternalSat.g:391:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSat.g:391:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSat.g:392:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSat.g:398:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) ;
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
            // InternalSat.g:404:2: ( ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) )
            // InternalSat.g:405:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            {
            // InternalSat.g:405:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 19:
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
            case 22:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSat.g:406:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    {
                    // InternalSat.g:406:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    // InternalSat.g:407:4: otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    				current = this_Model_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:425:3: this_Not_3= ruleNot
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
                    // InternalSat.g:434:3: this_Const_4= ruleConst
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
                    // InternalSat.g:443:3: this_Var_5= ruleVar
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
    // InternalSat.g:455:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSat.g:455:44: (iv_ruleNot= ruleNot EOF )
            // InternalSat.g:456:2: iv_ruleNot= ruleNot EOF
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
    // InternalSat.g:462:1: ruleNot returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Primary_2 = null;



        	enterRule();

        try {
            // InternalSat.g:468:2: ( ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) )
            // InternalSat.g:469:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            {
            // InternalSat.g:469:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            // InternalSat.g:470:3: (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary ()
            {
            // InternalSat.g:470:3: (otherlv_0= '!' | otherlv_1= '~' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSat.g:471:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSat.g:476:4: otherlv_1= '~'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

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
            		
            // InternalSat.g:489:3: ()
            // InternalSat.g:490:4: 
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
    // InternalSat.g:500:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalSat.g:500:44: (iv_ruleVar= ruleVar EOF )
            // InternalSat.g:501:2: iv_ruleVar= ruleVar EOF
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
    // InternalSat.g:507:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalSat.g:513:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalSat.g:514:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalSat.g:514:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalSat.g:515:3: (lv_id_0_0= RULE_ID )
            {
            // InternalSat.g:515:3: (lv_id_0_0= RULE_ID )
            // InternalSat.g:516:4: lv_id_0_0= RULE_ID
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
    // InternalSat.g:535:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalSat.g:535:46: (iv_ruleConst= ruleConst EOF )
            // InternalSat.g:536:2: iv_ruleConst= ruleConst EOF
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
    // InternalSat.g:542:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalSat.g:548:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalSat.g:549:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalSat.g:549:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalSat.g:550:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalSat.g:550:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalSat.g:551:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalSat.g:551:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
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
                    // InternalSat.g:552:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSat.g:563:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,22,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007A0010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}