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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_PROBA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'solver'", "'version'", "'minisat'", "'cryptominisat'", "'rnd-freq'", "'freq'", "'benchmarkDIMACS'", "','", "'benchmarkFormula'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'\\u2191'", "'('", "')'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int RULE_PROBA=5;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSATMorphicAccess().getSolverKeyword_0());
            		
            // InternalMSat.g:84:3: ( (lv_solvers_1_0= ruleSATSolver ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=33 && LA1_0<=35)) ) {
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
    // InternalMSat.g:133:1: ruleSATSolver returns [EObject current=null] : ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= ruleSolverVersion ) )? ) ;
    public final EObject ruleSATSolver() throws RecognitionException {
        EObject current = null;

        EObject lv_solver_0_1 = null;

        EObject lv_solver_0_2 = null;

        EObject lv_solver_0_3 = null;

        EObject lv_version_1_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:139:2: ( ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= ruleSolverVersion ) )? ) )
            // InternalMSat.g:140:2: ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= ruleSolverVersion ) )? )
            {
            // InternalMSat.g:140:2: ( ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= ruleSolverVersion ) )? )
            // InternalMSat.g:141:3: ( ( (lv_solver_0_1= ruleSat4J | lv_solver_0_2= ruleCryptoMiniSAT | lv_solver_0_3= ruleMiniSAT ) ) ) ( (lv_version_1_0= ruleSolverVersion ) )?
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
            case 33:
            case 34:
            case 35:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 14:
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

            // InternalMSat.g:194:3: ( (lv_version_1_0= ruleSolverVersion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSat.g:195:4: (lv_version_1_0= ruleSolverVersion )
                    {
                    // InternalMSat.g:195:4: (lv_version_1_0= ruleSolverVersion )
                    // InternalMSat.g:196:5: lv_version_1_0= ruleSolverVersion
                    {

                    					newCompositeNode(grammarAccess.getSATSolverAccess().getVersionSolverVersionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_version_1_0=ruleSolverVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSATSolverRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_1_0,
                    						"org.xtext.example.mydsl1.MSat.SolverVersion");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalMSat.g:217:1: entryRuleSat4J returns [EObject current=null] : iv_ruleSat4J= ruleSat4J EOF ;
    public final EObject entryRuleSat4J() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSat4J = null;


        try {
            // InternalMSat.g:217:46: (iv_ruleSat4J= ruleSat4J EOF )
            // InternalMSat.g:218:2: iv_ruleSat4J= ruleSat4J EOF
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
    // InternalMSat.g:224:1: ruleSat4J returns [EObject current=null] : ( (lv_variant_0_0= ruleSat4JVariant ) ) ;
    public final EObject ruleSat4J() throws RecognitionException {
        EObject current = null;

        Enumerator lv_variant_0_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:230:2: ( ( (lv_variant_0_0= ruleSat4JVariant ) ) )
            // InternalMSat.g:231:2: ( (lv_variant_0_0= ruleSat4JVariant ) )
            {
            // InternalMSat.g:231:2: ( (lv_variant_0_0= ruleSat4JVariant ) )
            // InternalMSat.g:232:3: (lv_variant_0_0= ruleSat4JVariant )
            {
            // InternalMSat.g:232:3: (lv_variant_0_0= ruleSat4JVariant )
            // InternalMSat.g:233:4: lv_variant_0_0= ruleSat4JVariant
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


    // $ANTLR start "entryRuleSolverVersion"
    // InternalMSat.g:253:1: entryRuleSolverVersion returns [EObject current=null] : iv_ruleSolverVersion= ruleSolverVersion EOF ;
    public final EObject entryRuleSolverVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolverVersion = null;


        try {
            // InternalMSat.g:253:54: (iv_ruleSolverVersion= ruleSolverVersion EOF )
            // InternalMSat.g:254:2: iv_ruleSolverVersion= ruleSolverVersion EOF
            {
             newCompositeNode(grammarAccess.getSolverVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolverVersion=ruleSolverVersion();

            state._fsp--;

             current =iv_ruleSolverVersion; 
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
    // $ANTLR end "entryRuleSolverVersion"


    // $ANTLR start "ruleSolverVersion"
    // InternalMSat.g:260:1: ruleSolverVersion returns [EObject current=null] : (otherlv_0= 'version' ( (lv_version_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSolverVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;


        	enterRule();

        try {
            // InternalMSat.g:266:2: ( (otherlv_0= 'version' ( (lv_version_1_0= RULE_STRING ) ) ) )
            // InternalMSat.g:267:2: (otherlv_0= 'version' ( (lv_version_1_0= RULE_STRING ) ) )
            {
            // InternalMSat.g:267:2: (otherlv_0= 'version' ( (lv_version_1_0= RULE_STRING ) ) )
            // InternalMSat.g:268:3: otherlv_0= 'version' ( (lv_version_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSolverVersionAccess().getVersionKeyword_0());
            		
            // InternalMSat.g:272:3: ( (lv_version_1_0= RULE_STRING ) )
            // InternalMSat.g:273:4: (lv_version_1_0= RULE_STRING )
            {
            // InternalMSat.g:273:4: (lv_version_1_0= RULE_STRING )
            // InternalMSat.g:274:5: lv_version_1_0= RULE_STRING
            {
            lv_version_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_version_1_0, grammarAccess.getSolverVersionAccess().getVersionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolverVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_1_0,
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
    // $ANTLR end "ruleSolverVersion"


    // $ANTLR start "entryRuleMiniSAT"
    // InternalMSat.g:294:1: entryRuleMiniSAT returns [EObject current=null] : iv_ruleMiniSAT= ruleMiniSAT EOF ;
    public final EObject entryRuleMiniSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiniSAT = null;


        try {
            // InternalMSat.g:294:48: (iv_ruleMiniSAT= ruleMiniSAT EOF )
            // InternalMSat.g:295:2: iv_ruleMiniSAT= ruleMiniSAT EOF
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
    // InternalMSat.g:301:1: ruleMiniSAT returns [EObject current=null] : ( ( (lv_variant_0_0= 'minisat' ) ) ( (lv_parameter_1_0= ruleMiniSATParameter ) )? ) ;
    public final EObject ruleMiniSAT() throws RecognitionException {
        EObject current = null;

        Token lv_variant_0_0=null;
        EObject lv_parameter_1_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:307:2: ( ( ( (lv_variant_0_0= 'minisat' ) ) ( (lv_parameter_1_0= ruleMiniSATParameter ) )? ) )
            // InternalMSat.g:308:2: ( ( (lv_variant_0_0= 'minisat' ) ) ( (lv_parameter_1_0= ruleMiniSATParameter ) )? )
            {
            // InternalMSat.g:308:2: ( ( (lv_variant_0_0= 'minisat' ) ) ( (lv_parameter_1_0= ruleMiniSATParameter ) )? )
            // InternalMSat.g:309:3: ( (lv_variant_0_0= 'minisat' ) ) ( (lv_parameter_1_0= ruleMiniSATParameter ) )?
            {
            // InternalMSat.g:309:3: ( (lv_variant_0_0= 'minisat' ) )
            // InternalMSat.g:310:4: (lv_variant_0_0= 'minisat' )
            {
            // InternalMSat.g:310:4: (lv_variant_0_0= 'minisat' )
            // InternalMSat.g:311:5: lv_variant_0_0= 'minisat'
            {
            lv_variant_0_0=(Token)match(input,14,FOLLOW_7); 

            					newLeafNode(lv_variant_0_0, grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMiniSATRule());
            					}
            					setWithLastConsumed(current, "variant", lv_variant_0_0, "minisat");
            				

            }


            }

            // InternalMSat.g:323:3: ( (lv_parameter_1_0= ruleMiniSATParameter ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSat.g:324:4: (lv_parameter_1_0= ruleMiniSATParameter )
                    {
                    // InternalMSat.g:324:4: (lv_parameter_1_0= ruleMiniSATParameter )
                    // InternalMSat.g:325:5: lv_parameter_1_0= ruleMiniSATParameter
                    {

                    					newCompositeNode(grammarAccess.getMiniSATAccess().getParameterMiniSATParameterParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameter_1_0=ruleMiniSATParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMiniSATRule());
                    					}
                    					set(
                    						current,
                    						"parameter",
                    						lv_parameter_1_0,
                    						"org.xtext.example.mydsl1.MSat.MiniSATParameter");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMiniSAT"


    // $ANTLR start "entryRuleCryptoMiniSAT"
    // InternalMSat.g:346:1: entryRuleCryptoMiniSAT returns [EObject current=null] : iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF ;
    public final EObject entryRuleCryptoMiniSAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCryptoMiniSAT = null;


        try {
            // InternalMSat.g:346:54: (iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF )
            // InternalMSat.g:347:2: iv_ruleCryptoMiniSAT= ruleCryptoMiniSAT EOF
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
    // InternalMSat.g:353:1: ruleCryptoMiniSAT returns [EObject current=null] : ( ( (lv_variant_0_0= 'cryptominisat' ) ) ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )? ) ;
    public final EObject ruleCryptoMiniSAT() throws RecognitionException {
        EObject current = null;

        Token lv_variant_0_0=null;
        EObject lv_parameter_1_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:359:2: ( ( ( (lv_variant_0_0= 'cryptominisat' ) ) ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )? ) )
            // InternalMSat.g:360:2: ( ( (lv_variant_0_0= 'cryptominisat' ) ) ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )? )
            {
            // InternalMSat.g:360:2: ( ( (lv_variant_0_0= 'cryptominisat' ) ) ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )? )
            // InternalMSat.g:361:3: ( (lv_variant_0_0= 'cryptominisat' ) ) ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )?
            {
            // InternalMSat.g:361:3: ( (lv_variant_0_0= 'cryptominisat' ) )
            // InternalMSat.g:362:4: (lv_variant_0_0= 'cryptominisat' )
            {
            // InternalMSat.g:362:4: (lv_variant_0_0= 'cryptominisat' )
            // InternalMSat.g:363:5: lv_variant_0_0= 'cryptominisat'
            {
            lv_variant_0_0=(Token)match(input,15,FOLLOW_8); 

            					newLeafNode(lv_variant_0_0, grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCryptoMiniSATRule());
            					}
            					setWithLastConsumed(current, "variant", lv_variant_0_0, "cryptominisat");
            				

            }


            }

            // InternalMSat.g:375:3: ( (lv_parameter_1_0= ruleCryptoMiniSATParameter ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSat.g:376:4: (lv_parameter_1_0= ruleCryptoMiniSATParameter )
                    {
                    // InternalMSat.g:376:4: (lv_parameter_1_0= ruleCryptoMiniSATParameter )
                    // InternalMSat.g:377:5: lv_parameter_1_0= ruleCryptoMiniSATParameter
                    {

                    					newCompositeNode(grammarAccess.getCryptoMiniSATAccess().getParameterCryptoMiniSATParameterParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameter_1_0=ruleCryptoMiniSATParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCryptoMiniSATRule());
                    					}
                    					set(
                    						current,
                    						"parameter",
                    						lv_parameter_1_0,
                    						"org.xtext.example.mydsl1.MSat.CryptoMiniSATParameter");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleCryptoMiniSAT"


    // $ANTLR start "entryRuleMiniSATParameter"
    // InternalMSat.g:398:1: entryRuleMiniSATParameter returns [EObject current=null] : iv_ruleMiniSATParameter= ruleMiniSATParameter EOF ;
    public final EObject entryRuleMiniSATParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiniSATParameter = null;


        try {
            // InternalMSat.g:398:57: (iv_ruleMiniSATParameter= ruleMiniSATParameter EOF )
            // InternalMSat.g:399:2: iv_ruleMiniSATParameter= ruleMiniSATParameter EOF
            {
             newCompositeNode(grammarAccess.getMiniSATParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiniSATParameter=ruleMiniSATParameter();

            state._fsp--;

             current =iv_ruleMiniSATParameter; 
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
    // $ANTLR end "entryRuleMiniSATParameter"


    // $ANTLR start "ruleMiniSATParameter"
    // InternalMSat.g:405:1: ruleMiniSATParameter returns [EObject current=null] : (otherlv_0= 'rnd-freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) ) ;
    public final EObject ruleMiniSATParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rndfreq_1_0=null;


        	enterRule();

        try {
            // InternalMSat.g:411:2: ( (otherlv_0= 'rnd-freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) ) )
            // InternalMSat.g:412:2: (otherlv_0= 'rnd-freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) )
            {
            // InternalMSat.g:412:2: (otherlv_0= 'rnd-freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) )
            // InternalMSat.g:413:3: otherlv_0= 'rnd-freq' ( (lv_rndfreq_1_0= RULE_PROBA ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMiniSATParameterAccess().getRndFreqKeyword_0());
            		
            // InternalMSat.g:417:3: ( (lv_rndfreq_1_0= RULE_PROBA ) )
            // InternalMSat.g:418:4: (lv_rndfreq_1_0= RULE_PROBA )
            {
            // InternalMSat.g:418:4: (lv_rndfreq_1_0= RULE_PROBA )
            // InternalMSat.g:419:5: lv_rndfreq_1_0= RULE_PROBA
            {
            lv_rndfreq_1_0=(Token)match(input,RULE_PROBA,FOLLOW_2); 

            					newLeafNode(lv_rndfreq_1_0, grammarAccess.getMiniSATParameterAccess().getRndfreqPROBATerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMiniSATParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rndfreq",
            						lv_rndfreq_1_0,
            						"org.xtext.example.mydsl1.MSat.PROBA");
            				

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
    // $ANTLR end "ruleMiniSATParameter"


    // $ANTLR start "entryRuleCryptoMiniSATParameter"
    // InternalMSat.g:439:1: entryRuleCryptoMiniSATParameter returns [EObject current=null] : iv_ruleCryptoMiniSATParameter= ruleCryptoMiniSATParameter EOF ;
    public final EObject entryRuleCryptoMiniSATParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCryptoMiniSATParameter = null;


        try {
            // InternalMSat.g:439:63: (iv_ruleCryptoMiniSATParameter= ruleCryptoMiniSATParameter EOF )
            // InternalMSat.g:440:2: iv_ruleCryptoMiniSATParameter= ruleCryptoMiniSATParameter EOF
            {
             newCompositeNode(grammarAccess.getCryptoMiniSATParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCryptoMiniSATParameter=ruleCryptoMiniSATParameter();

            state._fsp--;

             current =iv_ruleCryptoMiniSATParameter; 
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
    // $ANTLR end "entryRuleCryptoMiniSATParameter"


    // $ANTLR start "ruleCryptoMiniSATParameter"
    // InternalMSat.g:446:1: ruleCryptoMiniSATParameter returns [EObject current=null] : (otherlv_0= 'freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) ) ;
    public final EObject ruleCryptoMiniSATParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rndfreq_1_0=null;


        	enterRule();

        try {
            // InternalMSat.g:452:2: ( (otherlv_0= 'freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) ) )
            // InternalMSat.g:453:2: (otherlv_0= 'freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) )
            {
            // InternalMSat.g:453:2: (otherlv_0= 'freq' ( (lv_rndfreq_1_0= RULE_PROBA ) ) )
            // InternalMSat.g:454:3: otherlv_0= 'freq' ( (lv_rndfreq_1_0= RULE_PROBA ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCryptoMiniSATParameterAccess().getFreqKeyword_0());
            		
            // InternalMSat.g:458:3: ( (lv_rndfreq_1_0= RULE_PROBA ) )
            // InternalMSat.g:459:4: (lv_rndfreq_1_0= RULE_PROBA )
            {
            // InternalMSat.g:459:4: (lv_rndfreq_1_0= RULE_PROBA )
            // InternalMSat.g:460:5: lv_rndfreq_1_0= RULE_PROBA
            {
            lv_rndfreq_1_0=(Token)match(input,RULE_PROBA,FOLLOW_2); 

            					newLeafNode(lv_rndfreq_1_0, grammarAccess.getCryptoMiniSATParameterAccess().getRndfreqPROBATerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCryptoMiniSATParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rndfreq",
            						lv_rndfreq_1_0,
            						"org.xtext.example.mydsl1.MSat.PROBA");
            				

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
    // $ANTLR end "ruleCryptoMiniSATParameter"


    // $ANTLR start "entryRuleBenchmark"
    // InternalMSat.g:480:1: entryRuleBenchmark returns [EObject current=null] : iv_ruleBenchmark= ruleBenchmark EOF ;
    public final EObject entryRuleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmark = null;


        try {
            // InternalMSat.g:480:50: (iv_ruleBenchmark= ruleBenchmark EOF )
            // InternalMSat.g:481:2: iv_ruleBenchmark= ruleBenchmark EOF
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
    // InternalMSat.g:487:1: ruleBenchmark returns [EObject current=null] : (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula ) ;
    public final EObject ruleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject this_BenchmarkDimacs_0 = null;

        EObject this_BenchmarkFormula_1 = null;



        	enterRule();

        try {
            // InternalMSat.g:493:2: ( (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula ) )
            // InternalMSat.g:494:2: (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula )
            {
            // InternalMSat.g:494:2: (this_BenchmarkDimacs_0= ruleBenchmarkDimacs | this_BenchmarkFormula_1= ruleBenchmarkFormula )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSat.g:495:3: this_BenchmarkDimacs_0= ruleBenchmarkDimacs
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
                    // InternalMSat.g:504:3: this_BenchmarkFormula_1= ruleBenchmarkFormula
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
    // InternalMSat.g:516:1: entryRuleBenchmarkDimacs returns [EObject current=null] : iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF ;
    public final EObject entryRuleBenchmarkDimacs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmarkDimacs = null;


        try {
            // InternalMSat.g:516:56: (iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF )
            // InternalMSat.g:517:2: iv_ruleBenchmarkDimacs= ruleBenchmarkDimacs EOF
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
    // InternalMSat.g:523:1: ruleBenchmarkDimacs returns [EObject current=null] : (otherlv_0= 'benchmarkDIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) ) ;
    public final EObject ruleBenchmarkDimacs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dimacses_1_0=null;
        Token otherlv_2=null;
        Token lv_dimacses_3_0=null;


        	enterRule();

        try {
            // InternalMSat.g:529:2: ( (otherlv_0= 'benchmarkDIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) ) )
            // InternalMSat.g:530:2: (otherlv_0= 'benchmarkDIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) )
            {
            // InternalMSat.g:530:2: (otherlv_0= 'benchmarkDIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* ) )
            // InternalMSat.g:531:3: otherlv_0= 'benchmarkDIMACS' ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBenchmarkDimacsAccess().getBenchmarkDIMACSKeyword_0());
            		
            // InternalMSat.g:535:3: ( ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )* )
            // InternalMSat.g:536:4: ( (lv_dimacses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )*
            {
            // InternalMSat.g:536:4: ( (lv_dimacses_1_0= RULE_STRING ) )
            // InternalMSat.g:537:5: (lv_dimacses_1_0= RULE_STRING )
            {
            // InternalMSat.g:537:5: (lv_dimacses_1_0= RULE_STRING )
            // InternalMSat.g:538:6: lv_dimacses_1_0= RULE_STRING
            {
            lv_dimacses_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalMSat.g:554:4: (otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSat.g:555:5: otherlv_2= ',' ( (lv_dimacses_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBenchmarkDimacsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMSat.g:559:5: ( (lv_dimacses_3_0= RULE_STRING ) )
            	    // InternalMSat.g:560:6: (lv_dimacses_3_0= RULE_STRING )
            	    {
            	    // InternalMSat.g:560:6: (lv_dimacses_3_0= RULE_STRING )
            	    // InternalMSat.g:561:7: lv_dimacses_3_0= RULE_STRING
            	    {
            	    lv_dimacses_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
            	    break loop7;
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
    // InternalMSat.g:583:1: entryRuleBenchmarkFormula returns [EObject current=null] : iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF ;
    public final EObject entryRuleBenchmarkFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmarkFormula = null;


        try {
            // InternalMSat.g:583:57: (iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF )
            // InternalMSat.g:584:2: iv_ruleBenchmarkFormula= ruleBenchmarkFormula EOF
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
    // InternalMSat.g:590:1: ruleBenchmarkFormula returns [EObject current=null] : (otherlv_0= 'benchmarkFormula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) ) ;
    public final EObject ruleBenchmarkFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:596:2: ( (otherlv_0= 'benchmarkFormula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) ) )
            // InternalMSat.g:597:2: (otherlv_0= 'benchmarkFormula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) )
            {
            // InternalMSat.g:597:2: (otherlv_0= 'benchmarkFormula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* ) )
            // InternalMSat.g:598:3: otherlv_0= 'benchmarkFormula' ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBenchmarkFormulaAccess().getBenchmarkFormulaKeyword_0());
            		
            // InternalMSat.g:602:3: ( ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )* )
            // InternalMSat.g:603:4: ( (lv_expressions_1_0= ruleBiImpl ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )*
            {
            // InternalMSat.g:603:4: ( (lv_expressions_1_0= ruleBiImpl ) )
            // InternalMSat.g:604:5: (lv_expressions_1_0= ruleBiImpl )
            {
            // InternalMSat.g:604:5: (lv_expressions_1_0= ruleBiImpl )
            // InternalMSat.g:605:6: lv_expressions_1_0= ruleBiImpl
            {

            						newCompositeNode(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_10);
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

            // InternalMSat.g:622:4: (otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSat.g:623:5: otherlv_2= ',' ( (lv_expressions_3_0= ruleBiImpl ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_11); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBenchmarkFormulaAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMSat.g:627:5: ( (lv_expressions_3_0= ruleBiImpl ) )
            	    // InternalMSat.g:628:6: (lv_expressions_3_0= ruleBiImpl )
            	    {
            	    // InternalMSat.g:628:6: (lv_expressions_3_0= ruleBiImpl )
            	    // InternalMSat.g:629:7: lv_expressions_3_0= ruleBiImpl
            	    {

            	    							newCompositeNode(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	    break loop8;
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
    // InternalMSat.g:652:1: entryRuleBiImpl returns [EObject current=null] : iv_ruleBiImpl= ruleBiImpl EOF ;
    public final EObject entryRuleBiImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImpl = null;


        try {
            // InternalMSat.g:652:47: (iv_ruleBiImpl= ruleBiImpl EOF )
            // InternalMSat.g:653:2: iv_ruleBiImpl= ruleBiImpl EOF
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
    // InternalMSat.g:659:1: ruleBiImpl returns [EObject current=null] : (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) ;
    public final EObject ruleBiImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Impl_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:665:2: ( (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* ) )
            // InternalMSat.g:666:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            {
            // InternalMSat.g:666:2: (this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )* )
            // InternalMSat.g:667:3: this_Impl_0= ruleImpl ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplAccess().getImplParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Impl_0=ruleImpl();

            state._fsp--;


            			current = this_Impl_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:675:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSat.g:676:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImpl ) )
            	    {
            	    // InternalMSat.g:676:4: ()
            	    // InternalMSat.g:677:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalMSat.g:687:4: ( (lv_right_3_0= ruleImpl ) )
            	    // InternalMSat.g:688:5: (lv_right_3_0= ruleImpl )
            	    {
            	    // InternalMSat.g:688:5: (lv_right_3_0= ruleImpl )
            	    // InternalMSat.g:689:6: lv_right_3_0= ruleImpl
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
    // $ANTLR end "ruleBiImpl"


    // $ANTLR start "entryRuleImpl"
    // InternalMSat.g:711:1: entryRuleImpl returns [EObject current=null] : iv_ruleImpl= ruleImpl EOF ;
    public final EObject entryRuleImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpl = null;


        try {
            // InternalMSat.g:711:45: (iv_ruleImpl= ruleImpl EOF )
            // InternalMSat.g:712:2: iv_ruleImpl= ruleImpl EOF
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
    // InternalMSat.g:718:1: ruleImpl returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:724:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalMSat.g:725:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalMSat.g:725:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalMSat.g:726:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:734:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSat.g:735:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalMSat.g:735:4: ()
            	    // InternalMSat.g:736:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplAccess().getImplLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalMSat.g:746:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalMSat.g:747:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalMSat.g:747:5: (lv_right_3_0= ruleOr )
            	    // InternalMSat.g:748:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalMSat.g:770:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMSat.g:770:43: (iv_ruleOr= ruleOr EOF )
            // InternalMSat.g:771:2: iv_ruleOr= ruleOr EOF
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
    // InternalMSat.g:777:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:783:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMSat.g:784:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMSat.g:784:2: (this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMSat.g:785:3: this_And_0= ruleAnd ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:793:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSat.g:794:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMSat.g:794:4: ()
            	    // InternalMSat.g:795:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVKeyword_1_1());
            	    			
            	    // InternalMSat.g:805:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMSat.g:806:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMSat.g:806:5: (lv_right_3_0= ruleAnd )
            	    // InternalMSat.g:807:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
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
    // InternalMSat.g:829:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMSat.g:829:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMSat.g:830:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalMSat.g:836:1: ruleAnd returns [EObject current=null] : (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nand_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:842:2: ( (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* ) )
            // InternalMSat.g:843:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            {
            // InternalMSat.g:843:2: (this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )* )
            // InternalMSat.g:844:3: this_Nand_0= ruleNand ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNandParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Nand_0=ruleNand();

            state._fsp--;


            			current = this_Nand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:852:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSat.g:853:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNand ) )
            	    {
            	    // InternalMSat.g:853:4: ()
            	    // InternalMSat.g:854:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalMSat.g:864:4: ( (lv_right_3_0= ruleNand ) )
            	    // InternalMSat.g:865:5: (lv_right_3_0= ruleNand )
            	    {
            	    // InternalMSat.g:865:5: (lv_right_3_0= ruleNand )
            	    // InternalMSat.g:866:6: lv_right_3_0= ruleNand
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNand"
    // InternalMSat.g:888:1: entryRuleNand returns [EObject current=null] : iv_ruleNand= ruleNand EOF ;
    public final EObject entryRuleNand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNand = null;


        try {
            // InternalMSat.g:888:45: (iv_ruleNand= ruleNand EOF )
            // InternalMSat.g:889:2: iv_ruleNand= ruleNand EOF
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
    // InternalMSat.g:895:1: ruleNand returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) ;
    public final EObject ruleNand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMSat.g:901:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* ) )
            // InternalMSat.g:902:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            {
            // InternalMSat.g:902:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )* )
            // InternalMSat.g:903:3: this_Primary_0= rulePrimary ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSat.g:911:3: ( () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=25 && LA14_0<=26)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSat.g:912:4: () (otherlv_2= '|' | otherlv_3= '\\u2191' ) ( (lv_right_4_0= rulePrimary ) )
            	    {
            	    // InternalMSat.g:912:4: ()
            	    // InternalMSat.g:913:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandAccess().getNandLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSat.g:919:4: (otherlv_2= '|' | otherlv_3= '\\u2191' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==25) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==26) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalMSat.g:920:5: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            	            					newLeafNode(otherlv_2, grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMSat.g:925:5: otherlv_3= '\\u2191'
            	            {
            	            otherlv_3=(Token)match(input,26,FOLLOW_11); 

            	            					newLeafNode(otherlv_3, grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMSat.g:930:4: ( (lv_right_4_0= rulePrimary ) )
            	    // InternalMSat.g:931:5: (lv_right_4_0= rulePrimary )
            	    {
            	    // InternalMSat.g:931:5: (lv_right_4_0= rulePrimary )
            	    // InternalMSat.g:932:6: lv_right_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop14;
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
    // InternalMSat.g:954:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMSat.g:954:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMSat.g:955:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMSat.g:961:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) ;
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
            // InternalMSat.g:967:2: ( ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar ) )
            // InternalMSat.g:968:2: ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            {
            // InternalMSat.g:968:2: ( (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' ) | this_Not_3= ruleNot | this_Const_4= ruleConst | this_Var_5= ruleVar )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case 29:
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
            case 32:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMSat.g:969:3: (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' )
                    {
                    // InternalMSat.g:969:3: (otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')' )
                    // InternalMSat.g:970:4: otherlv_0= '(' this_BiImpl_1= ruleBiImpl otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getBiImplParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_BiImpl_1=ruleBiImpl();

                    state._fsp--;


                    				current = this_BiImpl_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:988:3: this_Not_3= ruleNot
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
                    // InternalMSat.g:997:3: this_Const_4= ruleConst
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
                    // InternalMSat.g:1006:3: this_Var_5= ruleVar
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
    // InternalMSat.g:1018:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMSat.g:1018:44: (iv_ruleNot= ruleNot EOF )
            // InternalMSat.g:1019:2: iv_ruleNot= ruleNot EOF
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
    // InternalMSat.g:1025:1: ruleNot returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Primary_2 = null;



        	enterRule();

        try {
            // InternalMSat.g:1031:2: ( ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () ) )
            // InternalMSat.g:1032:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            {
            // InternalMSat.g:1032:2: ( (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary () )
            // InternalMSat.g:1033:3: (otherlv_0= '!' | otherlv_1= '~' ) this_Primary_2= rulePrimary ()
            {
            // InternalMSat.g:1033:3: (otherlv_0= '!' | otherlv_1= '~' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMSat.g:1034:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMSat.g:1039:4: otherlv_1= '~'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_11); 

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
            		
            // InternalMSat.g:1052:3: ()
            // InternalMSat.g:1053:4: 
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
    // InternalMSat.g:1063:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMSat.g:1063:44: (iv_ruleVar= ruleVar EOF )
            // InternalMSat.g:1064:2: iv_ruleVar= ruleVar EOF
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
    // InternalMSat.g:1070:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMSat.g:1076:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMSat.g:1077:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMSat.g:1077:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMSat.g:1078:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMSat.g:1078:3: (lv_id_0_0= RULE_ID )
            // InternalMSat.g:1079:4: lv_id_0_0= RULE_ID
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
    // InternalMSat.g:1098:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalMSat.g:1098:46: (iv_ruleConst= ruleConst EOF )
            // InternalMSat.g:1099:2: iv_ruleConst= ruleConst EOF
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
    // InternalMSat.g:1105:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMSat.g:1111:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalMSat.g:1112:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalMSat.g:1112:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalMSat.g:1113:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalMSat.g:1113:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalMSat.g:1114:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalMSat.g:1114:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMSat.g:1115:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMSat.g:1126:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMSat.g:1142:1: ruleSat4JVariant returns [Enumerator current=null] : ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) ;
    public final Enumerator ruleSat4JVariant() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMSat.g:1148:2: ( ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) ) )
            // InternalMSat.g:1149:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            {
            // InternalMSat.g:1149:2: ( (enumLiteral_0= 'sat4j-java' ) | (enumLiteral_1= 'sat4j-jar' ) | (enumLiteral_2= 'sat4j-maven' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMSat.g:1150:3: (enumLiteral_0= 'sat4j-java' )
                    {
                    // InternalMSat.g:1150:3: (enumLiteral_0= 'sat4j-java' )
                    // InternalMSat.g:1151:4: enumLiteral_0= 'sat4j-java'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:1158:3: (enumLiteral_1= 'sat4j-jar' )
                    {
                    // InternalMSat.g:1158:3: (enumLiteral_1= 'sat4j-jar' )
                    // InternalMSat.g:1159:4: enumLiteral_1= 'sat4j-jar'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:1166:3: (enumLiteral_2= 'sat4j-maven' )
                    {
                    // InternalMSat.g:1166:3: (enumLiteral_2= 'sat4j-maven' )
                    // InternalMSat.g:1167:4: enumLiteral_2= 'sat4j-maven'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000E0000C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000E0014C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001E8000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});

}