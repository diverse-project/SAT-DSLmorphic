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
import org.xtext.example.mydsl.services.DimacsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimacsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'p'", "'cnf'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDimacsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimacsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimacsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDimacs.g"; }



     	private DimacsGrammarAccess grammarAccess;

        public InternalDimacsParser(TokenStream input, DimacsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DimacsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDimacs.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDimacs.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDimacs.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalDimacs.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_ligne_0_0= ruleLigneProbleme ) ) otherlv_1= '\\n' ( (lv_clauses_2_0= ruleLigneClause ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ligne_0_0 = null;

        EObject lv_clauses_2_0 = null;



        	enterRule();

        try {
            // InternalDimacs.g:77:2: ( ( ( (lv_ligne_0_0= ruleLigneProbleme ) ) otherlv_1= '\\n' ( (lv_clauses_2_0= ruleLigneClause ) )* ) )
            // InternalDimacs.g:78:2: ( ( (lv_ligne_0_0= ruleLigneProbleme ) ) otherlv_1= '\\n' ( (lv_clauses_2_0= ruleLigneClause ) )* )
            {
            // InternalDimacs.g:78:2: ( ( (lv_ligne_0_0= ruleLigneProbleme ) ) otherlv_1= '\\n' ( (lv_clauses_2_0= ruleLigneClause ) )* )
            // InternalDimacs.g:79:3: ( (lv_ligne_0_0= ruleLigneProbleme ) ) otherlv_1= '\\n' ( (lv_clauses_2_0= ruleLigneClause ) )*
            {
            // InternalDimacs.g:79:3: ( (lv_ligne_0_0= ruleLigneProbleme ) )
            // InternalDimacs.g:80:4: (lv_ligne_0_0= ruleLigneProbleme )
            {
            // InternalDimacs.g:80:4: (lv_ligne_0_0= ruleLigneProbleme )
            // InternalDimacs.g:81:5: lv_ligne_0_0= ruleLigneProbleme
            {

            					newCompositeNode(grammarAccess.getModelAccess().getLigneLigneProblemeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_ligne_0_0=ruleLigneProbleme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"ligne",
            						lv_ligne_0_0,
            						"org.xtext.example.mydsl.Dimacs.LigneProbleme");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLineFeedKeyword_1());
            		
            // InternalDimacs.g:102:3: ( (lv_clauses_2_0= ruleLigneClause ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDimacs.g:103:4: (lv_clauses_2_0= ruleLigneClause )
            	    {
            	    // InternalDimacs.g:103:4: (lv_clauses_2_0= ruleLigneClause )
            	    // InternalDimacs.g:104:5: lv_clauses_2_0= ruleLigneClause
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getClausesLigneClauseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_clauses_2_0=ruleLigneClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_2_0,
            	    						"org.xtext.example.mydsl.Dimacs.LigneClause");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLigneProbleme"
    // InternalDimacs.g:125:1: entryRuleLigneProbleme returns [EObject current=null] : iv_ruleLigneProbleme= ruleLigneProbleme EOF ;
    public final EObject entryRuleLigneProbleme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneProbleme = null;


        try {
            // InternalDimacs.g:125:54: (iv_ruleLigneProbleme= ruleLigneProbleme EOF )
            // InternalDimacs.g:126:2: iv_ruleLigneProbleme= ruleLigneProbleme EOF
            {
             newCompositeNode(grammarAccess.getLigneProblemeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigneProbleme=ruleLigneProbleme();

            state._fsp--;

             current =iv_ruleLigneProbleme; 
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
    // $ANTLR end "entryRuleLigneProbleme"


    // $ANTLR start "ruleLigneProbleme"
    // InternalDimacs.g:132:1: ruleLigneProbleme returns [EObject current=null] : (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) ) ;
    public final EObject ruleLigneProbleme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nb_variables_2_0=null;
        Token lv_nb_clauses_3_0=null;


        	enterRule();

        try {
            // InternalDimacs.g:138:2: ( (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) ) )
            // InternalDimacs.g:139:2: (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) )
            {
            // InternalDimacs.g:139:2: (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) )
            // InternalDimacs.g:140:3: otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLigneProblemeAccess().getPKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLigneProblemeAccess().getCnfKeyword_1());
            		
            // InternalDimacs.g:148:3: ( (lv_nb_variables_2_0= RULE_INT ) )
            // InternalDimacs.g:149:4: (lv_nb_variables_2_0= RULE_INT )
            {
            // InternalDimacs.g:149:4: (lv_nb_variables_2_0= RULE_INT )
            // InternalDimacs.g:150:5: lv_nb_variables_2_0= RULE_INT
            {
            lv_nb_variables_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_nb_variables_2_0, grammarAccess.getLigneProblemeAccess().getNb_variablesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigneProblemeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"nb_variables",
            						lv_nb_variables_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDimacs.g:166:3: ( (lv_nb_clauses_3_0= RULE_INT ) )
            // InternalDimacs.g:167:4: (lv_nb_clauses_3_0= RULE_INT )
            {
            // InternalDimacs.g:167:4: (lv_nb_clauses_3_0= RULE_INT )
            // InternalDimacs.g:168:5: lv_nb_clauses_3_0= RULE_INT
            {
            lv_nb_clauses_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_nb_clauses_3_0, grammarAccess.getLigneProblemeAccess().getNb_clausesINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigneProblemeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"nb_clauses",
            						lv_nb_clauses_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleLigneProbleme"


    // $ANTLR start "entryRuleLigneClause"
    // InternalDimacs.g:188:1: entryRuleLigneClause returns [EObject current=null] : iv_ruleLigneClause= ruleLigneClause EOF ;
    public final EObject entryRuleLigneClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneClause = null;


        try {
            // InternalDimacs.g:188:52: (iv_ruleLigneClause= ruleLigneClause EOF )
            // InternalDimacs.g:189:2: iv_ruleLigneClause= ruleLigneClause EOF
            {
             newCompositeNode(grammarAccess.getLigneClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigneClause=ruleLigneClause();

            state._fsp--;

             current =iv_ruleLigneClause; 
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
    // $ANTLR end "entryRuleLigneClause"


    // $ANTLR start "ruleLigneClause"
    // InternalDimacs.g:195:1: ruleLigneClause returns [EObject current=null] : ( (lv_litteraux_0_0= rulelitteral ) )+ ;
    public final EObject ruleLigneClause() throws RecognitionException {
        EObject current = null;

        EObject lv_litteraux_0_0 = null;



        	enterRule();

        try {
            // InternalDimacs.g:201:2: ( ( (lv_litteraux_0_0= rulelitteral ) )+ )
            // InternalDimacs.g:202:2: ( (lv_litteraux_0_0= rulelitteral ) )+
            {
            // InternalDimacs.g:202:2: ( (lv_litteraux_0_0= rulelitteral ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDimacs.g:203:3: (lv_litteraux_0_0= rulelitteral )
            	    {
            	    // InternalDimacs.g:203:3: (lv_litteraux_0_0= rulelitteral )
            	    // InternalDimacs.g:204:4: lv_litteraux_0_0= rulelitteral
            	    {

            	    				newCompositeNode(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    lv_litteraux_0_0=rulelitteral();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLigneClauseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"litteraux",
            	    					lv_litteraux_0_0,
            	    					"org.xtext.example.mydsl.Dimacs.litteral");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleLigneClause"


    // $ANTLR start "entryRulelitteral"
    // InternalDimacs.g:224:1: entryRulelitteral returns [EObject current=null] : iv_rulelitteral= rulelitteral EOF ;
    public final EObject entryRulelitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelitteral = null;


        try {
            // InternalDimacs.g:224:49: (iv_rulelitteral= rulelitteral EOF )
            // InternalDimacs.g:225:2: iv_rulelitteral= rulelitteral EOF
            {
             newCompositeNode(grammarAccess.getLitteralRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelitteral=rulelitteral();

            state._fsp--;

             current =iv_rulelitteral; 
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
    // $ANTLR end "entryRulelitteral"


    // $ANTLR start "rulelitteral"
    // InternalDimacs.g:231:1: rulelitteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject rulelitteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDimacs.g:237:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalDimacs.g:238:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalDimacs.g:238:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalDimacs.g:239:3: (lv_val_0_0= RULE_INT )
            {
            // InternalDimacs.g:239:3: (lv_val_0_0= RULE_INT )
            // InternalDimacs.g:240:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getLitteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLitteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "rulelitteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});

}