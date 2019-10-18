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
import org.xtext.example.mydsl.services.SattGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSattParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'file'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'\\u2191'", "'('", "')'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'"
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


        public InternalSattParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSattParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSattParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSatt.g"; }



     	private SattGrammarAccess grammarAccess;

        public InternalSattParser(TokenStream input, SattGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SAT";
       	}

       	@Override
       	protected SattGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSAT"
    // InternalSatt.g:65:1: entryRuleSAT returns [EObject current=null] : iv_ruleSAT= ruleSAT EOF ;
    public final EObject entryRuleSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAT = null;


        try {
            // InternalSatt.g:65:44: (iv_ruleSAT= ruleSAT EOF )
            // InternalSatt.g:66:2: iv_ruleSAT= ruleSAT EOF
            {
             newCompositeNode(grammarAccess.getSATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAT=ruleSAT();

            state._fsp--;

             current =iv_ruleSAT; 
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
    // $ANTLR end "entryRuleSAT"


    // $ANTLR start "ruleSAT"
    // InternalSatt.g:72:1: ruleSAT returns [EObject current=null] : ( ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) ) ( (lv_callMethod_1_0= ruleSATCallMethod ) ) ) ;
    public final EObject ruleSAT() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_1 = null;

        EObject lv_source_0_2 = null;

        Enumerator lv_callMethod_1_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:78:2: ( ( ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) ) ( (lv_callMethod_1_0= ruleSATCallMethod ) ) ) )
            // InternalSatt.g:79:2: ( ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) ) ( (lv_callMethod_1_0= ruleSATCallMethod ) ) )
            {
            // InternalSatt.g:79:2: ( ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) ) ( (lv_callMethod_1_0= ruleSATCallMethod ) ) )
            // InternalSatt.g:80:3: ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) ) ( (lv_callMethod_1_0= ruleSATCallMethod ) )
            {
            // InternalSatt.g:80:3: ( ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) ) )
            // InternalSatt.g:81:4: ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) )
            {
            // InternalSatt.g:81:4: ( (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel ) )
            // InternalSatt.g:82:5: (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel )
            {
            // InternalSatt.g:82:5: (lv_source_0_1= ruleFILE | lv_source_0_2= ruleModel )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=20 && LA1_0<=23)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSatt.g:83:6: lv_source_0_1= ruleFILE
                    {

                    						newCompositeNode(grammarAccess.getSATAccess().getSourceFILEParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_source_0_1=ruleFILE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSATRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_0_1,
                    							"org.xtext.example.mydsl.Satt.FILE");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSatt.g:99:6: lv_source_0_2= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getSATAccess().getSourceModelParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_3);
                    lv_source_0_2=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSATRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_0_2,
                    							"org.xtext.example.mydsl.Satt.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalSatt.g:117:3: ( (lv_callMethod_1_0= ruleSATCallMethod ) )
            // InternalSatt.g:118:4: (lv_callMethod_1_0= ruleSATCallMethod )
            {
            // InternalSatt.g:118:4: (lv_callMethod_1_0= ruleSATCallMethod )
            // InternalSatt.g:119:5: lv_callMethod_1_0= ruleSATCallMethod
            {

            					newCompositeNode(grammarAccess.getSATAccess().getCallMethodSATCallMethodEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_callMethod_1_0=ruleSATCallMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSATRule());
            					}
            					set(
            						current,
            						"callMethod",
            						lv_callMethod_1_0,
            						"org.xtext.example.mydsl.Satt.SATCallMethod");
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
    // $ANTLR end "ruleSAT"


    // $ANTLR start "entryRuleFILE"
    // InternalSatt.g:140:1: entryRuleFILE returns [EObject current=null] : iv_ruleFILE= ruleFILE EOF ;
    public final EObject entryRuleFILE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFILE = null;


        try {
            // InternalSatt.g:140:45: (iv_ruleFILE= ruleFILE EOF )
            // InternalSatt.g:141:2: iv_ruleFILE= ruleFILE EOF
            {
             newCompositeNode(grammarAccess.getFILERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFILE=ruleFILE();

            state._fsp--;

             current =iv_ruleFILE; 
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
    // $ANTLR end "entryRuleFILE"


    // $ANTLR start "ruleFILE"
    // InternalSatt.g:147:1: ruleFILE returns [EObject current=null] : (otherlv_0= 'file' ( (lv_file_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFILE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalSatt.g:153:2: ( (otherlv_0= 'file' ( (lv_file_1_0= RULE_STRING ) ) ) )
            // InternalSatt.g:154:2: (otherlv_0= 'file' ( (lv_file_1_0= RULE_STRING ) ) )
            {
            // InternalSatt.g:154:2: (otherlv_0= 'file' ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalSatt.g:155:3: otherlv_0= 'file' ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFILEAccess().getFileKeyword_0());
            		
            // InternalSatt.g:159:3: ( (lv_file_1_0= RULE_STRING ) )
            // InternalSatt.g:160:4: (lv_file_1_0= RULE_STRING )
            {
            // InternalSatt.g:160:4: (lv_file_1_0= RULE_STRING )
            // InternalSatt.g:161:5: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_file_1_0, grammarAccess.getFILEAccess().getFileSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFILERule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_1_0,
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
    // $ANTLR end "ruleFILE"


    // $ANTLR start "entryRuleModel"
    // InternalSatt.g:181:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSatt.g:181:46: (iv_ruleModel= ruleModel EOF )
            // InternalSatt.g:182:2: iv_ruleModel= ruleModel EOF
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
    // InternalSatt.g:188:1: ruleModel returns [EObject current=null] : this_BiImpl_0= ruleBiImpl ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_BiImpl_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:194:2: (this_BiImpl_0= ruleBiImpl )
            // InternalSatt.g:195:2: this_BiImpl_0= ruleBiImpl
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
    // InternalSatt.g:206:1: entryRuleBiImpl returns [EObject current=null] : iv_ruleBiImpl= ruleBiImpl EOF ;
    public final EObject entryRuleBiImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImpl = null;


        try {
            // InternalSatt.g:206:47: (iv_ruleBiImpl= ruleBiImpl EOF )
            // InternalSatt.g:207:2: iv_ruleBiImpl= ruleBiImpl EOF
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
    // InternalSatt.g:213:1: ruleBiImpl returns [EObject current=null] : (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) ;
    public final EObject ruleBiImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Impl_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:219:2: ( (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) )
            // InternalSatt.g:220:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            {
            // InternalSatt.g:220:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            // InternalSatt.g:221:3: this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplAccess().getImplParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Impl_0=ruleImpl();

            state._fsp--;


            			current = this_Impl_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSatt.g:229:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSatt.g:230:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) )
            	    {
            	    // InternalSatt.g:230:4: ()
            	    // InternalSatt.g:231:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSatt.g:241:4: ( (lv_right_3_0= ruleImpl ) )
            	    // InternalSatt.g:242:5: (lv_right_3_0= ruleImpl )
            	    {
            	    // InternalSatt.g:242:5: (lv_right_3_0= ruleImpl )
            	    // InternalSatt.g:243:6: lv_right_3_0= ruleImpl
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleImpl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBiImplRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Satt.Impl");
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
    // InternalSatt.g:265:1: entryRuleImpl returns [EObject current=null] : iv_ruleImpl= ruleImpl EOF ;
    public final EObject entryRuleImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpl = null;


        try {
            // InternalSatt.g:265:45: (iv_ruleImpl= ruleImpl EOF )
            // InternalSatt.g:266:2: iv_ruleImpl= ruleImpl EOF
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
    // InternalSatt.g:272:1: ruleImpl returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:278:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalSatt.g:279:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalSatt.g:279:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalSatt.g:280:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSatt.g:288:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSatt.g:289:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalSatt.g:289:4: ()
            	    // InternalSatt.g:290:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplAccess().getImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalSatt.g:300:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalSatt.g:301:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalSatt.g:301:5: (lv_right_3_0= ruleOr )
            	    // InternalSatt.g:302:6: lv_right_3_0= ruleOr
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
            	    							"org.xtext.example.mydsl.Satt.Or");
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
    // InternalSatt.g:324:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSatt.g:324:43: (iv_ruleOr= ruleOr EOF )
            // InternalSatt.g:325:2: iv_ruleOr= ruleOr EOF
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
    // InternalSatt.g:331:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:337:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSatt.g:338:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSatt.g:338:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSatt.g:339:3: this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSatt.g:347:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSatt.g:348:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSatt.g:348:4: ()
            	    // InternalSatt.g:349:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVKeyword_1_1());
            	    			
            	    // InternalSatt.g:359:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSatt.g:360:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSatt.g:360:5: (lv_right_3_0= ruleAnd )
            	    // InternalSatt.g:361:6: lv_right_3_0= ruleAnd
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
            	    							"org.xtext.example.mydsl.Satt.And");
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
    // InternalSatt.g:383:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSatt.g:383:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSatt.g:384:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSatt.g:390:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nand_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:396:2: ( (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) )
            // InternalSatt.g:397:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            {
            // InternalSatt.g:397:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            // InternalSatt.g:398:3: this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSatt.g:406:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSatt.g:407:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) )
            	    {
            	    // InternalSatt.g:407:4: ()
            	    // InternalSatt.g:408:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalSatt.g:418:4: ( (lv_right_3_0= ruleNand ) )
            	    // InternalSatt.g:419:5: (lv_right_3_0= ruleNand )
            	    {
            	    // InternalSatt.g:419:5: (lv_right_3_0= ruleNand )
            	    // InternalSatt.g:420:6: lv_right_3_0= ruleNand
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
            	    							"org.xtext.example.mydsl.Satt.Nand");
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
    // InternalSatt.g:442:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalSatt.g:442:45: (iv_ruleNand= ruleNand EOF )
            // InternalSatt.g:443:2: iv_ruleNand= ruleNand EOF
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
    // InternalSatt.g:449:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSatt.g:455:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) )
            // InternalSatt.g:456:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            {
            // InternalSatt.g:456:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            // InternalSatt.g:457:3: this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSatt.g:465:3: ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSatt.g:466:4: () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) )
            	    {
            	    // InternalSatt.g:466:4: ()
            	    // InternalSatt.g:467:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSatt.g:473:4: (otherlv_2= '|' | otherlv_3= '\\u2191' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==16) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==17) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalSatt.g:474:5: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSatt.g:479:5: otherlv_3= '\\u2191'
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSatt.g:484:4: ( (lv_right_4_0= rulePrimary ) )
            	    // InternalSatt.g:485:5: (lv_right_4_0= rulePrimary )
            	    {
            	    // InternalSatt.g:485:5: (lv_right_4_0= rulePrimary )
            	    // InternalSatt.g:486:6: lv_right_4_0= rulePrimary
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
            	    							"org.xtext.example.mydsl.Satt.Primary");
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
    // InternalSatt.g:508:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSatt.g:508:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSatt.g:509:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSatt.g:515:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) ;
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
            // InternalSatt.g:521:2: ( ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) )
            // InternalSatt.g:522:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            {
            // InternalSatt.g:522:2: ( (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 20:
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
            case 23:
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
                    // InternalSatt.g:523:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    {
                    // InternalSatt.g:523:3: (otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')' )
                    // InternalSatt.g:524:4: otherlv_0= '(' this_Model_1= ruleModel otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    				current = this_Model_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:542:3: this_Not_3= ruleNot
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
                    // InternalSatt.g:551:3: this_Const_4= ruleConst
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
                    // InternalSatt.g:560:3: this_Var_5= ruleVar
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
    // InternalSatt.g:572:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSatt.g:572:44: (iv_ruleNot= ruleNot EOF )
            // InternalSatt.g:573:2: iv_ruleNot= ruleNot EOF
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
    // InternalSatt.g:579:1: ruleNot returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Primary_2 = null;



        	enterRule();

        try {
            // InternalSatt.g:585:2: ( ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) )
            // InternalSatt.g:586:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            {
            // InternalSatt.g:586:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            // InternalSatt.g:587:3: (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary ()
            {
            // InternalSatt.g:587:3: (otherlv_0= '!' | otherlv_1= '~' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSatt.g:588:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSatt.g:593:4: otherlv_1= '~'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_6); 

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
            		
            // InternalSatt.g:606:3: ()
            // InternalSatt.g:607:4: 
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
    // InternalSatt.g:617:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalSatt.g:617:44: (iv_ruleVar= ruleVar EOF )
            // InternalSatt.g:618:2: iv_ruleVar= ruleVar EOF
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
    // InternalSatt.g:624:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalSatt.g:630:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalSatt.g:631:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalSatt.g:631:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalSatt.g:632:3: (lv_id_0_0= RULE_ID )
            {
            // InternalSatt.g:632:3: (lv_id_0_0= RULE_ID )
            // InternalSatt.g:633:4: lv_id_0_0= RULE_ID
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
    // InternalSatt.g:652:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalSatt.g:652:46: (iv_ruleConst= ruleConst EOF )
            // InternalSatt.g:653:2: iv_ruleConst= ruleConst EOF
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
    // InternalSatt.g:659:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalSatt.g:665:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalSatt.g:666:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalSatt.g:666:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalSatt.g:667:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalSatt.g:667:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalSatt.g:668:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalSatt.g:668:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSatt.g:669:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSatt.g:680:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "ruleSATCallMethod"
    // InternalSatt.g:696:1: ruleSATCallMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) ;
    public final Enumerator ruleSATCallMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSatt.g:702:2: ( ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) )
            // InternalSatt.g:703:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            {
            // InternalSatt.g:703:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
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
                    // InternalSatt.g:704:3: (enumLiteral_0= 'sat4j-java' )
                    {
                    // InternalSatt.g:704:3: (enumLiteral_0= 'sat4j-java' )
                    // InternalSatt.g:705:4: enumLiteral_0= 'sat4j-java'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSATCallMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSATCallMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:712:3: (enumLiteral_1= 'sat4j-jar' )
                    {
                    // InternalSatt.g:712:3: (enumLiteral_1= 'sat4j-jar' )
                    // InternalSatt.g:713:4: enumLiteral_1= 'sat4j-jar'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getSATCallMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSATCallMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSatt.g:720:3: (enumLiteral_2= 'sat4j-maven' )
                    {
                    // InternalSatt.g:720:3: (enumLiteral_2= 'sat4j-maven' )
                    // InternalSatt.g:721:4: enumLiteral_2= 'sat4j-maven'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getSATCallMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSATCallMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSATCallMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F40020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}