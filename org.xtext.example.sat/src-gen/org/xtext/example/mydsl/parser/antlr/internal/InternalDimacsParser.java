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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'c'", "'p'", "'cnf'", "'0'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
        	return "CNF";
       	}

       	@Override
       	protected DimacsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCNF"
    // InternalDimacs.g:64:1: entryRuleCNF returns [EObject current=null] : iv_ruleCNF= ruleCNF EOF ;
    public final EObject entryRuleCNF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCNF = null;


        try {
            // InternalDimacs.g:64:44: (iv_ruleCNF= ruleCNF EOF )
            // InternalDimacs.g:65:2: iv_ruleCNF= ruleCNF EOF
            {
             newCompositeNode(grammarAccess.getCNFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCNF=ruleCNF();

            state._fsp--;

             current =iv_ruleCNF; 
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
    // $ANTLR end "entryRuleCNF"


    // $ANTLR start "ruleCNF"
    // InternalDimacs.g:71:1: ruleCNF returns [EObject current=null] : ( ( (lv_comments_0_0= ruleCommentaire ) )* otherlv_1= '\\n' ( (lv_problem_2_0= ruleLigneProbleme ) ) otherlv_3= '\\n' ( (lv_clauses_4_0= ruleLigneClause ) )* ) ;
    public final EObject ruleCNF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_comments_0_0 = null;

        EObject lv_problem_2_0 = null;

        EObject lv_clauses_4_0 = null;



        	enterRule();

        try {
            // InternalDimacs.g:77:2: ( ( ( (lv_comments_0_0= ruleCommentaire ) )* otherlv_1= '\\n' ( (lv_problem_2_0= ruleLigneProbleme ) ) otherlv_3= '\\n' ( (lv_clauses_4_0= ruleLigneClause ) )* ) )
            // InternalDimacs.g:78:2: ( ( (lv_comments_0_0= ruleCommentaire ) )* otherlv_1= '\\n' ( (lv_problem_2_0= ruleLigneProbleme ) ) otherlv_3= '\\n' ( (lv_clauses_4_0= ruleLigneClause ) )* )
            {
            // InternalDimacs.g:78:2: ( ( (lv_comments_0_0= ruleCommentaire ) )* otherlv_1= '\\n' ( (lv_problem_2_0= ruleLigneProbleme ) ) otherlv_3= '\\n' ( (lv_clauses_4_0= ruleLigneClause ) )* )
            // InternalDimacs.g:79:3: ( (lv_comments_0_0= ruleCommentaire ) )* otherlv_1= '\\n' ( (lv_problem_2_0= ruleLigneProbleme ) ) otherlv_3= '\\n' ( (lv_clauses_4_0= ruleLigneClause ) )*
            {
            // InternalDimacs.g:79:3: ( (lv_comments_0_0= ruleCommentaire ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDimacs.g:80:4: (lv_comments_0_0= ruleCommentaire )
            	    {
            	    // InternalDimacs.g:80:4: (lv_comments_0_0= ruleCommentaire )
            	    // InternalDimacs.g:81:5: lv_comments_0_0= ruleCommentaire
            	    {

            	    					newCompositeNode(grammarAccess.getCNFAccess().getCommentsCommentaireParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_comments_0_0=ruleCommentaire();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCNFRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"org.xtext.example.mydsl.Dimacs.Commentaire");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCNFAccess().getLineFeedKeyword_1());
            		
            // InternalDimacs.g:102:3: ( (lv_problem_2_0= ruleLigneProbleme ) )
            // InternalDimacs.g:103:4: (lv_problem_2_0= ruleLigneProbleme )
            {
            // InternalDimacs.g:103:4: (lv_problem_2_0= ruleLigneProbleme )
            // InternalDimacs.g:104:5: lv_problem_2_0= ruleLigneProbleme
            {

            					newCompositeNode(grammarAccess.getCNFAccess().getProblemLigneProblemeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_problem_2_0=ruleLigneProbleme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCNFRule());
            					}
            					add(
            						current,
            						"problem",
            						lv_problem_2_0,
            						"org.xtext.example.mydsl.Dimacs.LigneProbleme");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCNFAccess().getLineFeedKeyword_3());
            		
            // InternalDimacs.g:125:3: ( (lv_clauses_4_0= ruleLigneClause ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDimacs.g:126:4: (lv_clauses_4_0= ruleLigneClause )
            	    {
            	    // InternalDimacs.g:126:4: (lv_clauses_4_0= ruleLigneClause )
            	    // InternalDimacs.g:127:5: lv_clauses_4_0= ruleLigneClause
            	    {

            	    					newCompositeNode(grammarAccess.getCNFAccess().getClausesLigneClauseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_clauses_4_0=ruleLigneClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCNFRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_4_0,
            	    						"org.xtext.example.mydsl.Dimacs.LigneClause");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleCNF"


    // $ANTLR start "entryRuleCommentaire"
    // InternalDimacs.g:148:1: entryRuleCommentaire returns [EObject current=null] : iv_ruleCommentaire= ruleCommentaire EOF ;
    public final EObject entryRuleCommentaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentaire = null;


        try {
            // InternalDimacs.g:148:52: (iv_ruleCommentaire= ruleCommentaire EOF )
            // InternalDimacs.g:149:2: iv_ruleCommentaire= ruleCommentaire EOF
            {
             newCompositeNode(grammarAccess.getCommentaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentaire=ruleCommentaire();

            state._fsp--;

             current =iv_ruleCommentaire; 
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
    // $ANTLR end "entryRuleCommentaire"


    // $ANTLR start "ruleCommentaire"
    // InternalDimacs.g:155:1: ruleCommentaire returns [EObject current=null] : (otherlv_0= 'c' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleCommentaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDimacs.g:161:2: ( (otherlv_0= 'c' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= '\\n' ) )
            // InternalDimacs.g:162:2: (otherlv_0= 'c' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= '\\n' )
            {
            // InternalDimacs.g:162:2: (otherlv_0= 'c' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= '\\n' )
            // InternalDimacs.g:163:3: otherlv_0= 'c' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentaireAccess().getCKeyword_0());
            		
            // InternalDimacs.g:167:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalDimacs.g:168:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalDimacs.g:168:4: (lv_content_1_0= RULE_STRING )
            // InternalDimacs.g:169:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_content_1_0, grammarAccess.getCommentaireAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentaireAccess().getLineFeedKeyword_2());
            		

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
    // $ANTLR end "ruleCommentaire"


    // $ANTLR start "entryRuleLigneProbleme"
    // InternalDimacs.g:193:1: entryRuleLigneProbleme returns [EObject current=null] : iv_ruleLigneProbleme= ruleLigneProbleme EOF ;
    public final EObject entryRuleLigneProbleme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneProbleme = null;


        try {
            // InternalDimacs.g:193:54: (iv_ruleLigneProbleme= ruleLigneProbleme EOF )
            // InternalDimacs.g:194:2: iv_ruleLigneProbleme= ruleLigneProbleme EOF
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
    // InternalDimacs.g:200:1: ruleLigneProbleme returns [EObject current=null] : (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) otherlv_4= '\\n' ) ;
    public final EObject ruleLigneProbleme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nb_variables_2_0=null;
        Token lv_nb_clauses_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDimacs.g:206:2: ( (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) otherlv_4= '\\n' ) )
            // InternalDimacs.g:207:2: (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) otherlv_4= '\\n' )
            {
            // InternalDimacs.g:207:2: (otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) otherlv_4= '\\n' )
            // InternalDimacs.g:208:3: otherlv_0= 'p' otherlv_1= 'cnf' ( (lv_nb_variables_2_0= RULE_INT ) ) ( (lv_nb_clauses_3_0= RULE_INT ) ) otherlv_4= '\\n'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLigneProblemeAccess().getPKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLigneProblemeAccess().getCnfKeyword_1());
            		
            // InternalDimacs.g:216:3: ( (lv_nb_variables_2_0= RULE_INT ) )
            // InternalDimacs.g:217:4: (lv_nb_variables_2_0= RULE_INT )
            {
            // InternalDimacs.g:217:4: (lv_nb_variables_2_0= RULE_INT )
            // InternalDimacs.g:218:5: lv_nb_variables_2_0= RULE_INT
            {
            lv_nb_variables_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            // InternalDimacs.g:234:3: ( (lv_nb_clauses_3_0= RULE_INT ) )
            // InternalDimacs.g:235:4: (lv_nb_clauses_3_0= RULE_INT )
            {
            // InternalDimacs.g:235:4: (lv_nb_clauses_3_0= RULE_INT )
            // InternalDimacs.g:236:5: lv_nb_clauses_3_0= RULE_INT
            {
            lv_nb_clauses_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLigneProblemeAccess().getLineFeedKeyword_4());
            		

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
    // InternalDimacs.g:260:1: entryRuleLigneClause returns [EObject current=null] : iv_ruleLigneClause= ruleLigneClause EOF ;
    public final EObject entryRuleLigneClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneClause = null;


        try {
            // InternalDimacs.g:260:52: (iv_ruleLigneClause= ruleLigneClause EOF )
            // InternalDimacs.g:261:2: iv_ruleLigneClause= ruleLigneClause EOF
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
    // InternalDimacs.g:267:1: ruleLigneClause returns [EObject current=null] : ( ( (lv_litteraux_0_0= rulelitteral ) )+ otherlv_1= '0' ) ;
    public final EObject ruleLigneClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_litteraux_0_0 = null;



        	enterRule();

        try {
            // InternalDimacs.g:273:2: ( ( ( (lv_litteraux_0_0= rulelitteral ) )+ otherlv_1= '0' ) )
            // InternalDimacs.g:274:2: ( ( (lv_litteraux_0_0= rulelitteral ) )+ otherlv_1= '0' )
            {
            // InternalDimacs.g:274:2: ( ( (lv_litteraux_0_0= rulelitteral ) )+ otherlv_1= '0' )
            // InternalDimacs.g:275:3: ( (lv_litteraux_0_0= rulelitteral ) )+ otherlv_1= '0'
            {
            // InternalDimacs.g:275:3: ( (lv_litteraux_0_0= rulelitteral ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDimacs.g:276:4: (lv_litteraux_0_0= rulelitteral )
            	    {
            	    // InternalDimacs.g:276:4: (lv_litteraux_0_0= rulelitteral )
            	    // InternalDimacs.g:277:5: lv_litteraux_0_0= rulelitteral
            	    {

            	    					newCompositeNode(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLigneClauseAccess().getDigitZeroKeyword_1());
            		

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
    // $ANTLR end "ruleLigneClause"


    // $ANTLR start "entryRulelitteral"
    // InternalDimacs.g:302:1: entryRulelitteral returns [EObject current=null] : iv_rulelitteral= rulelitteral EOF ;
    public final EObject entryRulelitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelitteral = null;


        try {
            // InternalDimacs.g:302:49: (iv_rulelitteral= rulelitteral EOF )
            // InternalDimacs.g:303:2: iv_rulelitteral= rulelitteral EOF
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
    // InternalDimacs.g:309:1: rulelitteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject rulelitteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDimacs.g:315:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalDimacs.g:316:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalDimacs.g:316:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalDimacs.g:317:3: (lv_val_0_0= RULE_INT )
            {
            // InternalDimacs.g:317:3: (lv_val_0_0= RULE_INT )
            // InternalDimacs.g:318:4: lv_val_0_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});

}