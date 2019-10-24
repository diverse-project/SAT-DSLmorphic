package org.xtext.example.mydsl1.parser.antlr.internal;

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
import org.xtext.example.mydsl1.services.MSatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'solver'", "'minisat'", "'cryptominisat'", "'benchmark-DIMACS'", "','", "'benchmark-formula'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'\\u2191'", "'('", "')'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMSatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSat.g"; }



     	private MSatGrammarAccess grammarAccess;

        public InternalMSatParser(TokenStream input, MSatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SATMorphic";
       	}

       	@Override
       	protected MSatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSATMorphic"
    // InternalMSat.g:65:1: entryRuleSATMorphic returns [EObject current=null] : iv_ruleSATMorphic= ruleSATMorphic EOF ;
    public final EObject entryRuleSATMorphic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSATMorphic = null;


        try {
            // InternalMSat.g:65:51: (iv_ruleSATMorphic= ruleSATMorphic EOF )
            // InternalMSat.g:66:2: iv_ruleSATMorphic= ruleSATMorphic EOF
            {
             newCompositeNode(grammarAccess.getSATMorphicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSATMorphic=ruleSATMorphic();

            state._fsp--;

             current =iv_ruleSATMorphic; 
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
    // $ANTLR end "entryRuleSATMorphic"


    // $ANTLR start "ruleSATMorphic"
    // InternalMSat.g:72:1: ruleSATMorphic returns [EObject current=null] : (otherlv_0= 'solver' ( (lv_solvers_1_0= ruleSATSolver ) )+ ( (lv_benchmark_2_0= ruleBenchmark ) ) ) ;
    public final EObject ruleSATMorphic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_solvers_1_0 = null;

        EObject lv_benchmark_2_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:78:2: ( (otherlv_0= 'solver' ( (lv_solvers_1_0= ruleSATSolver ) )+ ( (lv_benchmark_2_0= ruleBenchmark ) ) ) )
            // InternalMSat.g:79:2: (otherlv_0= 'solver' ( (lv_solvers_1_0= ruleSATSolver ) )+ ( (lv_benchmark_2_0= ruleBenchmark ) ) )
            {
            // InternalMSat.g:79:2: (otherlv_0= 'solver' ( (lv_solvers_1_0= ruleSATSolver ) )+ ( (lv_benchmark_2_0= ruleBenchmark ) ) )
            // InternalMSat.g:80:3: otherlv_0= 'solver' ( (lv_solvers_1_0= ruleSATSolver ) )+ ( (lv_benchmark_2_0= ruleBenchmark ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSATMorphicAccess().getSolverKeyword_0());
            		
            // InternalMSat.g:84:3: ( (lv_solvers_1_0= ruleSATSolver ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=29 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSat.g:85:4: (lv_solvers_1_0= ruleSATSolver )
            	    {
            	    // InternalMSat.g:85:4: (lv_solvers_1_0= ruleSATSolver )
            	    // InternalMSat.g:86:5: lv_solvers_1_0= ruleSATSolver
            	    {

            	    					newCompositeNode(grammarAccess.getSATMorphicAccess().getSolversSATSolverParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_solvers_1_0=ruleSATSolver();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSATMorphicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"solvers",
            	    						lv_solvers_1_0,
            	    						"org.xtext.example.mydsl1.MSat.SATSolver");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMSat.g:103:3: ( (lv_benchmark_2_0= ruleBenchmark ) )
            // InternalMSat.g:104:4: (lv_benchmark_2_0= ruleBenchmark )
            {
            // InternalMSat.g:104:4: (lv_benchmark_2_0= ruleBenchmark )
            // InternalMSat.g:105:5: lv_benchmark_2_0= ruleBenchmark
            {

            					newCompositeNode(grammarAccess.getSATMorphicAccess().getBenchmarkBenchmarkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_benchmark_2_0=ruleBenchmark();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSATMorphicRule());
            					}
            					set(
            						current,
            						"benchmark",
            						lv_benchmark_2_0,
            						"org.xtext.example.mydsl1.MSat.Benchmark");
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
    // $ANTLR end "ruleSATMorphic"


    // $ANTLR start "entryRuleSATSolver"
    // InternalMSat.g:126:1: entryRuleSATSolver returns [EObject current=null] : iv_ruleSATSolver= ruleSATSolver EOF ;
    public final EObject entryRuleSATSolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSATSolver = null;


        try {
            // InternalMSat.g:126:50: (iv_ruleSATSolver= ruleSATSolver EOF )
            // InternalMSat.g:127:2: iv_ruleSATSolver= ruleSATSolver EOF
            {
             newCompositeNode(grammarAccess.getSATSolverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSATSolver=ruleSATSolver();

            state._fsp--;

             current =iv_ruleSATSolver; 
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
    // $ANTLR end "entryRuleSATSolver"


    // $ANTLR start "ruleSATSolver"
    // InternalMSat.g:133:1: ruleSATSolver returns [EObject current=null] : ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleSATSolver() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        EObject lv_solver_0_1 = null;

        EObject lv_solver_0_2 = null;

        EObject lv_solver_0_3 = null;



        	enterRule();

        try {
            // InternalMSat.g:139:2: ( ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= RULE_STRING ) )? ) )
            // InternalMSat.g:140:2: ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= RULE_STRING ) )? )
            {
            // InternalMSat.g:140:2: ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= RULE_STRING ) )? )
            // InternalMSat.g:141:3: ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= RULE_STRING ) )?
            {
            // InternalMSat.g:141:3: ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) )
            // InternalMSat.g:142:4: ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) )
            {
            // InternalMSat.g:142:4: ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) )
            // InternalMSat.g:143:5: (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT )
            {
            // InternalMSat.g:143:5: (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
            case 31:
                {
                alt2=1;
                }
                break;
            case 13:
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
                    // InternalMSat.g:144:6: lv_solver_0_1= ruleSat4J
                    {

                    						newCompositeNode(grammarAccess.getSATSolverAccess().getSolverSat4JParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_solver_0_1=ruleSat4J();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSATSolverRule());
                    						}
                    						set(
                    							current,
                    							"solver",
                    							lv_solver_0_1,
                    							"org.xtext.example.mydsl1.MSat.Sat4J");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMSat.g:160:6: lv_solver_0_2= ruleCryptoMiniSAT
                    {

                    						newCompositeNode(grammarAccess.getSATSolverAccess().getSolverCryptoMiniSATParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_solver_0_2=ruleCryptoMiniSAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSATSolverRule());
                    						}
                    						set(
                    							current,
                    							"solver",
                    							lv_solver_0_2,
                    							"org.xtext.example.mydsl1.MSat.CryptoMiniSAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMSat.g:176:6: lv_solver_0_3= ruleMiniSAT
                    {

                    						newCompositeNode(grammarAccess.getSATSolverAccess().getSolverMiniSATParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_5);
                    lv_solver_0_3=ruleMiniSAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSATSolverRule());
                    						}
                    						set(
                    							current,
                    							"solver",
                    							lv_solver_0_3,
                    							"org.xtext.example.mydsl1.MSat.MiniSAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMSat.g:194:3: ( (lv_version_1_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSat.g:195:4: (lv_version_1_0= RULE_STRING )
                    {
                    // InternalMSat.g:195:4: (lv_version_1_0= RULE_STRING )
                    // InternalMSat.g:196:5: lv_version_1_0= RULE_STRING
                    {
                    lv_version_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_version_1_0, grammarAccess.getSATSolverAccess().getVersionSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSATSolverRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"version",
                    						lv_version_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleSATSolver"


    // $ANTLR start "entryRuleSat4J"
    // InternalMSat.g:216:1: entryRuleSat4J returns [EObject current=null] : iv_ruleSat4J= ruleSat4J EOF ;
    public final EObject entryRuleSat4J() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSat4J = null;


        try {
            // InternalMSat.g:216:46: (iv_ruleSat4J= ruleSat4J EOF )
            // InternalMSat.g:217:2: iv_ruleSat4J= ruleSat4J EOF
            {
             newCompositeNode(grammarAccess.getSat4JRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSat4J=ruleSat4J();

            state._fsp--;

             current =iv_ruleSat4J; 
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
    // $ANTLR end "entryRuleSat4J"


    // $ANTLR start "ruleSat4J"
    // InternalMSat.g:223:1: ruleSat4J returns [EObject current=null] : ( (lv_variant_0_0= ruleSat4JVariant ) ) ;
    public final EObject ruleSat4J() throws RecognitionException {
        EObject current = null;

        Enumerator lv_variant_0_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:229:2: ( ( (lv_variant_0_0= ruleSat4JVariant ) ) )
            // InternalMSat.g:230:2: ( (lv_variant_0_0= ruleSat4JVariant ) )
            {
            // InternalMSat.g:230:2: ( (lv_variant_0_0= ruleSat4JVariant ) )
            // InternalMSat.g:231:3: (lv_variant_0_0= ruleSat4JVariant )
            {
            // InternalMSat.g:231:3: (lv_variant_0_0= ruleSat4JVariant )
            // InternalMSat.g:232:4: lv_variant_0_0= ruleSat4JVariant
            {

            				newCompositeNode(grammarAccess.getSat4JAccess().getVariantSat4JVariantEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_variant_0_0=ruleSat4JVariant();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSat4JRule());
            				}
            				set(
            					current,
            					"variant",
            					lv_variant_0_0,
            					"org.xtext.example.mydsl1.MSat.Sat4JVariant");
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
    // $ANTLR end "ruleSat4J"


    // $ANTLR start "entryRuleMiniSAT"
    // InternalMSat.g:252:1: entryRuleMiniSAT returns [EObject current=null] : iv_ruleMiniSAT= ruleMiniSAT EOF ;
    public final EObject entryRuleMiniSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiniSAT = null;


        try {
            // InternalMSat.g:252:48: (iv_ruleMiniSAT= ruleMiniSAT EOF )
            // InternalMSat.g:253:2: iv_ruleMiniSAT= ruleMiniSAT EOF
            {
             newCompositeNode(grammarAccess.getMiniSATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiniSAT=ruleMiniSAT();

            state._fsp--;

             current =iv_ruleMiniSAT; 
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
    // $ANTLR end "entryRuleMiniSAT"


    // $ANTLR start "ruleMiniSAT"
    // InternalMSat.g:259:1: ruleMiniSAT returns [EObject current=null] : ( (lv_variant_0_0= 'minisat' ) ) ;
    public final EObject ruleMiniSAT() throws RecognitionException {
        EObject current = null;

        Token lv_variant_0_0=null;


        	enterRule();

        try {
            // InternalMSat.g:265:2: ( ( (lv_variant_0_0= 'minisat' ) ) )
            // InternalMSat.g:266:2: ( (lv_variant_0_0= 'minisat' ) )
            {
            // InternalMSat.g:266:2: ( (lv_variant_0_0= 'minisat' ) )
            // InternalMSat.g:267:3: (lv_variant_0_0= 'minisat' )
            {
            // InternalMSat.g:267:3: (lv_variant_0_0= 'minisat' )
            // InternalMSat.g:268:4: lv_variant_0_0= 'minisat'
            {
            lv_variant_0_0=(Token)match(input,12,FOLLOW_2); 

            				newLeafNode(lv_variant_0_0, grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMiniSATRule());
            				}
            				setWithLastConsumed(current, "variant", lv_variant_0_0, "minisat");
            			

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
    // $ANTLR end "ruleMiniSAT"


    // $ANTLR start "entryRuleCryptoMiniSAT"
    // InternalMSat.g:283:1: entryRuleCryptoMiniSAT returns [EObject current=null] : iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF ;
    public final EObject entryRuleCryptoMiniSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCryptoMiniSAT = null;


        try {
            // InternalMSat.g:283:54: (iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF )
            // InternalMSat.g:284:2: iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF
            {
             newCompositeNode(grammarAccess.getCryptoMiniSATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCryptoMiniSAT=ruleCryptoMiniSAT();

            state._fsp--;

             current =iv_ruleCryptoMiniSAT; 
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
    // $ANTLR end "entryRuleCryptoMiniSAT"


    // $ANTLR start "ruleCryptoMiniSAT"
    // InternalMSat.g:290:1: ruleCryptoMiniSAT returns [EObject current=null] : ( (lv_variant_0_0= 'cryptominisat' ) ) ;
    public final EObject ruleCryptoMiniSAT() throws RecognitionException {
        EObject current = null;

        Token lv_variant_0_0=null;


        	enterRule();

        try {
            // InternalMSat.g:296:2: ( ( (lv_variant_0_0= 'cryptominisat' ) ) )
            // InternalMSat.g:297:2: ( (lv_variant_0_0= 'cryptominisat' ) )
            {
            // InternalMSat.g:297:2: ( (lv_variant_0_0= 'cryptominisat' ) )
            // InternalMSat.g:298:3: (lv_variant_0_0= 'cryptominisat' )
            {
            // InternalMSat.g:298:3: (lv_variant_0_0= 'cryptominisat' )
            // InternalMSat.g:299:4: lv_variant_0_0= 'cryptominisat'
            {
            lv_variant_0_0=(Token)match(input,13,FOLLOW_2); 

            				newLeafNode(lv_variant_0_0, grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCryptoMiniSATRule());
            				}
            				setWithLastConsumed(current, "variant", lv_variant_0_0, "cryptominisat");
            			

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
    // $ANTLR end "ruleCryptoMiniSAT"


    // $ANTLR start "entryRuleBenchmark"
    // InternalMSat.g:314:1: entryRuleBenchmark returns [EObject current=null] : iv_ruleBenchmark= ruleBenchmark EOF ;
    public final EObject entryRuleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmark = null;


        try {
            // InternalMSat.g:314:50: (iv_ruleBenchmark= ruleBenchmark EOF )
            // InternalMSat.g:315:2: iv_ruleBenchmark= ruleBenchmark EOF
            {
             newCompositeNode(grammarAccess.getBenchmarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBenchmark=ruleBenchmark();

            state._fsp--;

             current =iv_ruleBenchmark; 
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
    // $ANTLR end "entryRuleBenchmark"


    // $ANTLR start "ruleBenchmark"
    // InternalMSat.g:321:1: ruleBenchmark returns [EObject current=null] : (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula ) ;
    public final EObject ruleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject this_BenchmarkDimacs_0 = null;

        EObject this_BenchmarkFormula_1 = null;



        	enterRule();

        try {
            // InternalMSat.g:327:2: ( (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula ) )
            // InternalMSat.g:328:2: (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula )
            {
            // InternalMSat.g:328:2: (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSat.g:329:3: this_BenchmarkDimacs_0= ruleBenchmarkDimacs
                    {

                    			newCompositeNode(grammarAccess.getBenchmarkAccess().getBenchmarkDimacsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BenchmarkDimacs_0=ruleBenchmarkDimacs();

                    state._fsp--;


                    			current = this_BenchmarkDimacs_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSat.g:338:3: this_BenchmarkFormula_1= ruleBenchmarkFormula
                    {

                    			newCompositeNode(grammarAccess.getBenchmarkAccess().getBenchmarkFormulaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BenchmarkFormula_1=ruleBenchmarkFormula();

                    state._fsp--;


                    			current = this_BenchmarkFormula_1;
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
    // $ANTLR end "ruleBenchmark"


    // $ANTLR start "entryRuleBenchmarkDimacs"
    // InternalMSat.g:350:1: entryRuleBenchmarkDimacs returns [EObject current=null] : iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF ;
    public final EObject entryRuleBenchmarkDimacs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmarkDimacs = null;


        try {
            // InternalMSat.g:350:56: (iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF )
            // InternalMSat.g:351:2: iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF
            {
             newCompositeNode(grammarAccess.getBenchmarkDimacsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBenchmarkDimacs=ruleBenchmarkDimacs();

            state._fsp--;

             current =iv_ruleBenchmarkDimacs; 
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
    // $ANTLR end "entryRuleBenchmarkDimacs"


    // $ANTLR start "ruleBenchmarkDimacs"
    // InternalMSat.g:357:1: ruleBenchmarkDimacs returns [EObject current=null] : (otherlv_0= 'benchmark-DIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) ) ;
    public final EObject ruleBenchmarkDimacs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dimacses_1_0=null;
        Token otherlv_2=null;
        Token lv_dimacses_3_0=null;


        	enterRule();

        try {
            // InternalMSat.g:363:2: ( (otherlv_0= 'benchmark-DIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) ) )
            // InternalMSat.g:364:2: (otherlv_0= 'benchmark-DIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) )
            {
            // InternalMSat.g:364:2: (otherlv_0= 'benchmark-DIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) )
            // InternalMSat.g:365:3: otherlv_0= 'benchmark-DIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBenchmarkDimacsAccess().getBenchmarkDIMACSKeyword_0());
            		
            // InternalMSat.g:369:3: ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* )
            // InternalMSat.g:370:4: ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )*
            {
            // InternalMSat.g:370:4: ( (lv_dimacses_1_0= RULE_STRING ) )
            // InternalMSat.g:371:5: (lv_dimacses_1_0= RULE_STRING )
            {
            // InternalMSat.g:371:5: (lv_dimacses_1_0= RULE_STRING )
            // InternalMSat.g:372:6: lv_dimacses_1_0= RULE_STRING
            {
            lv_dimacses_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            						newLeafNode(lv_dimacses_1_0, grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBenchmarkDimacsRule());
            						}
            						addWithLastConsumed(
            							current,
            							"dimacses",
            							lv_dimacses_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            // InternalMSat.g:388:4: (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSat.g:389:5: otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBenchmarkDimacsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMSat.g:393:5: ( (lv_dimacses_3_0= RULE_STRING ) )
            	    // InternalMSat.g:394:6: (lv_dimacses_3_0= RULE_STRING )
            	    {
            	    // InternalMSat.g:394:6: (lv_dimacses_3_0= RULE_STRING )
            	    // InternalMSat.g:395:7: lv_dimacses_3_0= RULE_STRING
            	    {
            	    lv_dimacses_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    							newLeafNode(lv_dimacses_3_0, grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getBenchmarkDimacsRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"dimacses",
            	    								lv_dimacses_3_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

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
    // $ANTLR end "ruleBenchmarkDimacs"


    // $ANTLR start "entryRuleBenchmarkFormula"
    // InternalMSat.g:417:1: entryRuleBenchmarkFormula returns [EObject current=null] : iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF ;
    public final EObject entryRuleBenchmarkFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmarkFormula = null;


        try {
            // InternalMSat.g:417:57: (iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF )
            // InternalMSat.g:418:2: iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF
            {
             newCompositeNode(grammarAccess.getBenchmarkFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBenchmarkFormula=ruleBenchmarkFormula();

            state._fsp--;

             current =iv_ruleBenchmarkFormula; 
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
    // $ANTLR end "entryRuleBenchmarkFormula"


    // $ANTLR start "ruleBenchmarkFormula"
    // InternalMSat.g:424:1: ruleBenchmarkFormula returns [EObject current=null] : (otherlv_0= 'benchmark-formula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) ) ;
    public final EObject ruleBenchmarkFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:430:2: ( (otherlv_0= 'benchmark-formula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) ) )
            // InternalMSat.g:431:2: (otherlv_0= 'benchmark-formula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) )
            {
            // InternalMSat.g:431:2: (otherlv_0= 'benchmark-formula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) )
            // InternalMSat.g:432:3: otherlv_0= 'benchmark-formula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBenchmarkFormulaAccess().getBenchmarkFormulaKeyword_0());
            		
            // InternalMSat.g:436:3: ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* )
            // InternalMSat.g:437:4: ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )*
            {
            // InternalMSat.g:437:4: ( (lv_expressions_1_0= ruleBiImpl ) )
            // InternalMSat.g:438:5: (lv_expressions_1_0= ruleBiImpl )
            {
            // InternalMSat.g:438:5: (lv_expressions_1_0= ruleBiImpl )
            // InternalMSat.g:439:6: lv_expressions_1_0= ruleBiImpl
            {

            						newCompositeNode(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_expressions_1_0=ruleBiImpl();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBenchmarkFormulaRule());
            						}
            						add(
            							current,
            							"expressions",
            							lv_expressions_1_0,
            							"org.xtext.example.mydsl1.MSat.BiImpl");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMSat.g:456:4: (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSat.g:457:5: otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBenchmarkFormulaAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMSat.g:461:5: ( (lv_expressions_3_0= ruleBiImpl ) )
            	    // InternalMSat.g:462:6: (lv_expressions_3_0= ruleBiImpl )
            	    {
            	    // InternalMSat.g:462:6: (lv_expressions_3_0= ruleBiImpl )
            	    // InternalMSat.g:463:7: lv_expressions_3_0= ruleBiImpl
            	    {

            	    							newCompositeNode(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_expressions_3_0=ruleBiImpl();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBenchmarkFormulaRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expressions",
            	    								lv_expressions_3_0,
            	    								"org.xtext.example.mydsl1.MSat.BiImpl");
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
    // $ANTLR end "ruleBenchmarkFormula"


    // $ANTLR start "entryRuleBiImpl"
    // InternalMSat.g:486:1: entryRuleBiImpl returns [EObject current=null] : iv_ruleBiImpl= ruleBiImpl EOF ;
    public final EObject entryRuleBiImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImpl = null;


        try {
            // InternalMSat.g:486:47: (iv_ruleBiImpl= ruleBiImpl EOF )
            // InternalMSat.g:487:2: iv_ruleBiImpl= ruleBiImpl EOF
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
    // InternalMSat.g:493:1: ruleBiImpl returns [EObject current=null] : (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) ;
    public final EObject ruleBiImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Impl_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:499:2: ( (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) )
            // InternalMSat.g:500:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            {
            // InternalMSat.g:500:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            // InternalMSat.g:501:3: this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplAccess().getImplParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Impl_0=ruleImpl();

            state._fsp--;


            			current = this_Impl_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:509:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSat.g:510:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) )
            	    {
            	    // InternalMSat.g:510:4: ()
            	    // InternalMSat.g:511:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalMSat.g:521:4: ( (lv_right_3_0= ruleImpl ) )
            	    // InternalMSat.g:522:5: (lv_right_3_0= ruleImpl )
            	    {
            	    // InternalMSat.g:522:5: (lv_right_3_0= ruleImpl )
            	    // InternalMSat.g:523:6: lv_right_3_0= ruleImpl
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleImpl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBiImplRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MSat.Impl");
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
    // $ANTLR end "ruleBiImpl"


    // $ANTLR start "entryRuleImpl"
    // InternalMSat.g:545:1: entryRuleImpl returns [EObject current=null] : iv_ruleImpl= ruleImpl EOF ;
    public final EObject entryRuleImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpl = null;


        try {
            // InternalMSat.g:545:45: (iv_ruleImpl= ruleImpl EOF )
            // InternalMSat.g:546:2: iv_ruleImpl= ruleImpl EOF
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
    // InternalMSat.g:552:1: ruleImpl returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:558:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalMSat.g:559:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalMSat.g:559:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalMSat.g:560:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:568:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSat.g:569:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalMSat.g:569:4: ()
            	    // InternalMSat.g:570:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplAccess().getImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalMSat.g:580:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalMSat.g:581:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalMSat.g:581:5: (lv_right_3_0= ruleOr )
            	    // InternalMSat.g:582:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MSat.Or");
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
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalMSat.g:604:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMSat.g:604:43: (iv_ruleOr= ruleOr EOF )
            // InternalMSat.g:605:2: iv_ruleOr= ruleOr EOF
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
    // InternalMSat.g:611:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:617:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMSat.g:618:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMSat.g:618:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMSat.g:619:3: this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:627:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSat.g:628:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMSat.g:628:4: ()
            	    // InternalMSat.g:629:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVKeyword_1_1());
            	    			
            	    // InternalMSat.g:639:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMSat.g:640:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMSat.g:640:5: (lv_right_3_0= ruleAnd )
            	    // InternalMSat.g:641:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MSat.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMSat.g:663:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMSat.g:663:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMSat.g:664:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalMSat.g:670:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nand_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:676:2: ( (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) )
            // InternalMSat.g:677:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            {
            // InternalMSat.g:677:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            // InternalMSat.g:678:3: this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:686:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSat.g:687:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) )
            	    {
            	    // InternalMSat.g:687:4: ()
            	    // InternalMSat.g:688:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalMSat.g:698:4: ( (lv_right_3_0= ruleNand ) )
            	    // InternalMSat.g:699:5: (lv_right_3_0= ruleNand )
            	    {
            	    // InternalMSat.g:699:5: (lv_right_3_0= ruleNand )
            	    // InternalMSat.g:700:6: lv_right_3_0= ruleNand
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleNand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MSat.Nand");
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
    // InternalMSat.g:722:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalMSat.g:722:45: (iv_ruleNand= ruleNand EOF )
            // InternalMSat.g:723:2: iv_ruleNand= ruleNand EOF
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
    // InternalMSat.g:729:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:735:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) )
            // InternalMSat.g:736:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            {
            // InternalMSat.g:736:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            // InternalMSat.g:737:3: this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:745:3: ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSat.g:746:4: () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) )
            	    {
            	    // InternalMSat.g:746:4: ()
            	    // InternalMSat.g:747:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSat.g:753:4: (otherlv_2= '|' | otherlv_3= '\\u2191' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==21) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==22) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMSat.g:754:5: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_8); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMSat.g:759:5: otherlv_3= '\\u2191'
            	            {
            	            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMSat.g:764:4: ( (lv_right_4_0= rulePrimary ) )
            	    // InternalMSat.g:765:5: (lv_right_4_0= rulePrimary )
            	    {
            	    // InternalMSat.g:765:5: (lv_right_4_0= rulePrimary )
            	    // InternalMSat.g:766:6: lv_right_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_4_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNandRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.mydsl1.MSat.Primary");
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
    // InternalMSat.g:788:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMSat.g:788:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMSat.g:789:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMSat.g:795:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BiImpl_1 = null;

        EObject this_Not_3 = null;

        EObject this_Const_4 = null;

        EObject this_Var_5 = null;



        	enterRule();

        try {
            // InternalMSat.g:801:2: ( ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) )
            // InternalMSat.g:802:2: ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            {
            // InternalMSat.g:802:2: ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 25:
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
            case 28:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMSat.g:803:3: (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' )
                    {
                    // InternalMSat.g:803:3: (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' )
                    // InternalMSat.g:804:4: otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getBiImplParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_BiImpl_1=ruleBiImpl();

                    state._fsp--;


                    				current = this_BiImpl_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:822:3: this_Not_3= ruleNot
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
                    // InternalMSat.g:831:3: this_Const_4= ruleConst
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
                    // InternalMSat.g:840:3: this_Var_5= ruleVar
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
    // InternalMSat.g:852:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMSat.g:852:44: (iv_ruleNot= ruleNot EOF )
            // InternalMSat.g:853:2: iv_ruleNot= ruleNot EOF
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
    // InternalMSat.g:859:1: ruleNot returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Primary_2 = null;



        	enterRule();

        try {
            // InternalMSat.g:865:2: ( ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) )
            // InternalMSat.g:866:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            {
            // InternalMSat.g:866:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            // InternalMSat.g:867:3: (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary ()
            {
            // InternalMSat.g:867:3: (otherlv_0= '!' | otherlv_1= '~' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSat.g:868:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMSat.g:873:4: otherlv_1= '~'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_8); 

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
            		
            // InternalMSat.g:886:3: ()
            // InternalMSat.g:887:4: 
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
    // InternalMSat.g:897:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMSat.g:897:44: (iv_ruleVar= ruleVar EOF )
            // InternalMSat.g:898:2: iv_ruleVar= ruleVar EOF
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
    // InternalMSat.g:904:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMSat.g:910:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMSat.g:911:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMSat.g:911:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMSat.g:912:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMSat.g:912:3: (lv_id_0_0= RULE_ID )
            // InternalMSat.g:913:4: lv_id_0_0= RULE_ID
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
    // InternalMSat.g:932:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalMSat.g:932:46: (iv_ruleConst= ruleConst EOF )
            // InternalMSat.g:933:2: iv_ruleConst= ruleConst EOF
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
    // InternalMSat.g:939:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMSat.g:945:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalMSat.g:946:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalMSat.g:946:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalMSat.g:947:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalMSat.g:947:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalMSat.g:948:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalMSat.g:948:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSat.g:949:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMSat.g:960:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "ruleSat4JVariant"
    // InternalMSat.g:976:1: ruleSat4JVariant returns [Enumerator current=null] : ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) ;
    public final Enumerator ruleSat4JVariant() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMSat.g:982:2: ( ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) )
            // InternalMSat.g:983:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            {
            // InternalMSat.g:983:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMSat.g:984:3: (enumLiteral_0= 'sat4j-java' )
                    {
                    // InternalMSat.g:984:3: (enumLiteral_0= 'sat4j-java' )
                    // InternalMSat.g:985:4: enumLiteral_0= 'sat4j-java'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:992:3: (enumLiteral_1= 'sat4j-jar' )
                    {
                    // InternalMSat.g:992:3: (enumLiteral_1= 'sat4j-jar' )
                    // InternalMSat.g:993:4: enumLiteral_1= 'sat4j-jar'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:1000:3: (enumLiteral_2= 'sat4j-maven' )
                    {
                    // InternalMSat.g:1000:3: (enumLiteral_2= 'sat4j-maven' )
                    // InternalMSat.g:1001:4: enumLiteral_2= 'sat4j-maven'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSat4JVariantAccess().getSAT4J_COMPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSat4JVariantAccess().getSAT4J_COMPEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSat4JVariant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000E0003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000E0017000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001E800020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});

}