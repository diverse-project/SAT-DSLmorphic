package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MSatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_PROBA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'\\u2191'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'", "'solver'", "'version'", "'rnd-freq'", "'benchmarkDIMACS'", "','", "'benchmarkFormula'", "'<=>'", "'=>'", "'v'", "'^'", "'('", "')'", "'minisat'", "'cryptominisat'"
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

    	public void setGrammarAccess(MSatGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSATMorphic"
    // InternalMSat.g:53:1: entryRuleSATMorphic : ruleSATMorphic EOF ;
    public final void entryRuleSATMorphic() throws RecognitionException {
        try {
            // InternalMSat.g:54:1: ( ruleSATMorphic EOF )
            // InternalMSat.g:55:1: ruleSATMorphic EOF
            {
             before(grammarAccess.getSATMorphicRule()); 
            pushFollow(FOLLOW_1);
            ruleSATMorphic();

            state._fsp--;

             after(grammarAccess.getSATMorphicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSATMorphic"


    // $ANTLR start "ruleSATMorphic"
    // InternalMSat.g:62:1: ruleSATMorphic : ( ( rule__SATMorphic__Group__0 ) ) ;
    public final void ruleSATMorphic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:66:2: ( ( ( rule__SATMorphic__Group__0 ) ) )
            // InternalMSat.g:67:2: ( ( rule__SATMorphic__Group__0 ) )
            {
            // InternalMSat.g:67:2: ( ( rule__SATMorphic__Group__0 ) )
            // InternalMSat.g:68:3: ( rule__SATMorphic__Group__0 )
            {
             before(grammarAccess.getSATMorphicAccess().getGroup()); 
            // InternalMSat.g:69:3: ( rule__SATMorphic__Group__0 )
            // InternalMSat.g:69:4: rule__SATMorphic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SATMorphic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSATMorphicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSATMorphic"


    // $ANTLR start "entryRuleSATSolver"
    // InternalMSat.g:78:1: entryRuleSATSolver : ruleSATSolver EOF ;
    public final void entryRuleSATSolver() throws RecognitionException {
        try {
            // InternalMSat.g:79:1: ( ruleSATSolver EOF )
            // InternalMSat.g:80:1: ruleSATSolver EOF
            {
             before(grammarAccess.getSATSolverRule()); 
            pushFollow(FOLLOW_1);
            ruleSATSolver();

            state._fsp--;

             after(grammarAccess.getSATSolverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSATSolver"


    // $ANTLR start "ruleSATSolver"
    // InternalMSat.g:87:1: ruleSATSolver : ( ( rule__SATSolver__Group__0 ) ) ;
    public final void ruleSATSolver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:91:2: ( ( ( rule__SATSolver__Group__0 ) ) )
            // InternalMSat.g:92:2: ( ( rule__SATSolver__Group__0 ) )
            {
            // InternalMSat.g:92:2: ( ( rule__SATSolver__Group__0 ) )
            // InternalMSat.g:93:3: ( rule__SATSolver__Group__0 )
            {
             before(grammarAccess.getSATSolverAccess().getGroup()); 
            // InternalMSat.g:94:3: ( rule__SATSolver__Group__0 )
            // InternalMSat.g:94:4: rule__SATSolver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SATSolver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSATSolverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSATSolver"


    // $ANTLR start "entryRuleSat4J"
    // InternalMSat.g:103:1: entryRuleSat4J : ruleSat4J EOF ;
    public final void entryRuleSat4J() throws RecognitionException {
        try {
            // InternalMSat.g:104:1: ( ruleSat4J EOF )
            // InternalMSat.g:105:1: ruleSat4J EOF
            {
             before(grammarAccess.getSat4JRule()); 
            pushFollow(FOLLOW_1);
            ruleSat4J();

            state._fsp--;

             after(grammarAccess.getSat4JRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSat4J"


    // $ANTLR start "ruleSat4J"
    // InternalMSat.g:112:1: ruleSat4J : ( ( rule__Sat4J__VariantAssignment ) ) ;
    public final void ruleSat4J() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:116:2: ( ( ( rule__Sat4J__VariantAssignment ) ) )
            // InternalMSat.g:117:2: ( ( rule__Sat4J__VariantAssignment ) )
            {
            // InternalMSat.g:117:2: ( ( rule__Sat4J__VariantAssignment ) )
            // InternalMSat.g:118:3: ( rule__Sat4J__VariantAssignment )
            {
             before(grammarAccess.getSat4JAccess().getVariantAssignment()); 
            // InternalMSat.g:119:3: ( rule__Sat4J__VariantAssignment )
            // InternalMSat.g:119:4: rule__Sat4J__VariantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sat4J__VariantAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSat4JAccess().getVariantAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSat4J"


    // $ANTLR start "entryRuleSolverVersion"
    // InternalMSat.g:128:1: entryRuleSolverVersion : ruleSolverVersion EOF ;
    public final void entryRuleSolverVersion() throws RecognitionException {
        try {
            // InternalMSat.g:129:1: ( ruleSolverVersion EOF )
            // InternalMSat.g:130:1: ruleSolverVersion EOF
            {
             before(grammarAccess.getSolverVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleSolverVersion();

            state._fsp--;

             after(grammarAccess.getSolverVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolverVersion"


    // $ANTLR start "ruleSolverVersion"
    // InternalMSat.g:137:1: ruleSolverVersion : ( ( rule__SolverVersion__Group__0 ) ) ;
    public final void ruleSolverVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:141:2: ( ( ( rule__SolverVersion__Group__0 ) ) )
            // InternalMSat.g:142:2: ( ( rule__SolverVersion__Group__0 ) )
            {
            // InternalMSat.g:142:2: ( ( rule__SolverVersion__Group__0 ) )
            // InternalMSat.g:143:3: ( rule__SolverVersion__Group__0 )
            {
             before(grammarAccess.getSolverVersionAccess().getGroup()); 
            // InternalMSat.g:144:3: ( rule__SolverVersion__Group__0 )
            // InternalMSat.g:144:4: rule__SolverVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SolverVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolverVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolverVersion"


    // $ANTLR start "entryRuleMiniSAT"
    // InternalMSat.g:153:1: entryRuleMiniSAT : ruleMiniSAT EOF ;
    public final void entryRuleMiniSAT() throws RecognitionException {
        try {
            // InternalMSat.g:154:1: ( ruleMiniSAT EOF )
            // InternalMSat.g:155:1: ruleMiniSAT EOF
            {
             before(grammarAccess.getMiniSATRule()); 
            pushFollow(FOLLOW_1);
            ruleMiniSAT();

            state._fsp--;

             after(grammarAccess.getMiniSATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiniSAT"


    // $ANTLR start "ruleMiniSAT"
    // InternalMSat.g:162:1: ruleMiniSAT : ( ( rule__MiniSAT__Group__0 ) ) ;
    public final void ruleMiniSAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:166:2: ( ( ( rule__MiniSAT__Group__0 ) ) )
            // InternalMSat.g:167:2: ( ( rule__MiniSAT__Group__0 ) )
            {
            // InternalMSat.g:167:2: ( ( rule__MiniSAT__Group__0 ) )
            // InternalMSat.g:168:3: ( rule__MiniSAT__Group__0 )
            {
             before(grammarAccess.getMiniSATAccess().getGroup()); 
            // InternalMSat.g:169:3: ( rule__MiniSAT__Group__0 )
            // InternalMSat.g:169:4: rule__MiniSAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiniSAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiniSATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiniSAT"


    // $ANTLR start "entryRuleCryptoMiniSAT"
    // InternalMSat.g:178:1: entryRuleCryptoMiniSAT : ruleCryptoMiniSAT EOF ;
    public final void entryRuleCryptoMiniSAT() throws RecognitionException {
        try {
            // InternalMSat.g:179:1: ( ruleCryptoMiniSAT EOF )
            // InternalMSat.g:180:1: ruleCryptoMiniSAT EOF
            {
             before(grammarAccess.getCryptoMiniSATRule()); 
            pushFollow(FOLLOW_1);
            ruleCryptoMiniSAT();

            state._fsp--;

             after(grammarAccess.getCryptoMiniSATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCryptoMiniSAT"


    // $ANTLR start "ruleCryptoMiniSAT"
    // InternalMSat.g:187:1: ruleCryptoMiniSAT : ( ( rule__CryptoMiniSAT__VariantAssignment ) ) ;
    public final void ruleCryptoMiniSAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:191:2: ( ( ( rule__CryptoMiniSAT__VariantAssignment ) ) )
            // InternalMSat.g:192:2: ( ( rule__CryptoMiniSAT__VariantAssignment ) )
            {
            // InternalMSat.g:192:2: ( ( rule__CryptoMiniSAT__VariantAssignment ) )
            // InternalMSat.g:193:3: ( rule__CryptoMiniSAT__VariantAssignment )
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantAssignment()); 
            // InternalMSat.g:194:3: ( rule__CryptoMiniSAT__VariantAssignment )
            // InternalMSat.g:194:4: rule__CryptoMiniSAT__VariantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CryptoMiniSAT__VariantAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCryptoMiniSATAccess().getVariantAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCryptoMiniSAT"


    // $ANTLR start "entryRuleMiniSATParameter"
    // InternalMSat.g:203:1: entryRuleMiniSATParameter : ruleMiniSATParameter EOF ;
    public final void entryRuleMiniSATParameter() throws RecognitionException {
        try {
            // InternalMSat.g:204:1: ( ruleMiniSATParameter EOF )
            // InternalMSat.g:205:1: ruleMiniSATParameter EOF
            {
             before(grammarAccess.getMiniSATParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleMiniSATParameter();

            state._fsp--;

             after(grammarAccess.getMiniSATParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiniSATParameter"


    // $ANTLR start "ruleMiniSATParameter"
    // InternalMSat.g:212:1: ruleMiniSATParameter : ( ( rule__MiniSATParameter__Group__0 ) ) ;
    public final void ruleMiniSATParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:216:2: ( ( ( rule__MiniSATParameter__Group__0 ) ) )
            // InternalMSat.g:217:2: ( ( rule__MiniSATParameter__Group__0 ) )
            {
            // InternalMSat.g:217:2: ( ( rule__MiniSATParameter__Group__0 ) )
            // InternalMSat.g:218:3: ( rule__MiniSATParameter__Group__0 )
            {
             before(grammarAccess.getMiniSATParameterAccess().getGroup()); 
            // InternalMSat.g:219:3: ( rule__MiniSATParameter__Group__0 )
            // InternalMSat.g:219:4: rule__MiniSATParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiniSATParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiniSATParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiniSATParameter"


    // $ANTLR start "entryRuleBenchmark"
    // InternalMSat.g:228:1: entryRuleBenchmark : ruleBenchmark EOF ;
    public final void entryRuleBenchmark() throws RecognitionException {
        try {
            // InternalMSat.g:229:1: ( ruleBenchmark EOF )
            // InternalMSat.g:230:1: ruleBenchmark EOF
            {
             before(grammarAccess.getBenchmarkRule()); 
            pushFollow(FOLLOW_1);
            ruleBenchmark();

            state._fsp--;

             after(grammarAccess.getBenchmarkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBenchmark"


    // $ANTLR start "ruleBenchmark"
    // InternalMSat.g:237:1: ruleBenchmark : ( ( rule__Benchmark__Alternatives ) ) ;
    public final void ruleBenchmark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:241:2: ( ( ( rule__Benchmark__Alternatives ) ) )
            // InternalMSat.g:242:2: ( ( rule__Benchmark__Alternatives ) )
            {
            // InternalMSat.g:242:2: ( ( rule__Benchmark__Alternatives ) )
            // InternalMSat.g:243:3: ( rule__Benchmark__Alternatives )
            {
             before(grammarAccess.getBenchmarkAccess().getAlternatives()); 
            // InternalMSat.g:244:3: ( rule__Benchmark__Alternatives )
            // InternalMSat.g:244:4: rule__Benchmark__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Benchmark__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBenchmark"


    // $ANTLR start "entryRuleBenchmarkDimacs"
    // InternalMSat.g:253:1: entryRuleBenchmarkDimacs : ruleBenchmarkDimacs EOF ;
    public final void entryRuleBenchmarkDimacs() throws RecognitionException {
        try {
            // InternalMSat.g:254:1: ( ruleBenchmarkDimacs EOF )
            // InternalMSat.g:255:1: ruleBenchmarkDimacs EOF
            {
             before(grammarAccess.getBenchmarkDimacsRule()); 
            pushFollow(FOLLOW_1);
            ruleBenchmarkDimacs();

            state._fsp--;

             after(grammarAccess.getBenchmarkDimacsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBenchmarkDimacs"


    // $ANTLR start "ruleBenchmarkDimacs"
    // InternalMSat.g:262:1: ruleBenchmarkDimacs : ( ( rule__BenchmarkDimacs__Group__0 ) ) ;
    public final void ruleBenchmarkDimacs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:266:2: ( ( ( rule__BenchmarkDimacs__Group__0 ) ) )
            // InternalMSat.g:267:2: ( ( rule__BenchmarkDimacs__Group__0 ) )
            {
            // InternalMSat.g:267:2: ( ( rule__BenchmarkDimacs__Group__0 ) )
            // InternalMSat.g:268:3: ( rule__BenchmarkDimacs__Group__0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup()); 
            // InternalMSat.g:269:3: ( rule__BenchmarkDimacs__Group__0 )
            // InternalMSat.g:269:4: rule__BenchmarkDimacs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkDimacsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBenchmarkDimacs"


    // $ANTLR start "entryRuleBenchmarkFormula"
    // InternalMSat.g:278:1: entryRuleBenchmarkFormula : ruleBenchmarkFormula EOF ;
    public final void entryRuleBenchmarkFormula() throws RecognitionException {
        try {
            // InternalMSat.g:279:1: ( ruleBenchmarkFormula EOF )
            // InternalMSat.g:280:1: ruleBenchmarkFormula EOF
            {
             before(grammarAccess.getBenchmarkFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleBenchmarkFormula();

            state._fsp--;

             after(grammarAccess.getBenchmarkFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBenchmarkFormula"


    // $ANTLR start "ruleBenchmarkFormula"
    // InternalMSat.g:287:1: ruleBenchmarkFormula : ( ( rule__BenchmarkFormula__Group__0 ) ) ;
    public final void ruleBenchmarkFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:291:2: ( ( ( rule__BenchmarkFormula__Group__0 ) ) )
            // InternalMSat.g:292:2: ( ( rule__BenchmarkFormula__Group__0 ) )
            {
            // InternalMSat.g:292:2: ( ( rule__BenchmarkFormula__Group__0 ) )
            // InternalMSat.g:293:3: ( rule__BenchmarkFormula__Group__0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup()); 
            // InternalMSat.g:294:3: ( rule__BenchmarkFormula__Group__0 )
            // InternalMSat.g:294:4: rule__BenchmarkFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBenchmarkFormula"


    // $ANTLR start "entryRuleBiImpl"
    // InternalMSat.g:303:1: entryRuleBiImpl : ruleBiImpl EOF ;
    public final void entryRuleBiImpl() throws RecognitionException {
        try {
            // InternalMSat.g:304:1: ( ruleBiImpl EOF )
            // InternalMSat.g:305:1: ruleBiImpl EOF
            {
             before(grammarAccess.getBiImplRule()); 
            pushFollow(FOLLOW_1);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getBiImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBiImpl"


    // $ANTLR start "ruleBiImpl"
    // InternalMSat.g:312:1: ruleBiImpl : ( ( rule__BiImpl__Group__0 ) ) ;
    public final void ruleBiImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:316:2: ( ( ( rule__BiImpl__Group__0 ) ) )
            // InternalMSat.g:317:2: ( ( rule__BiImpl__Group__0 ) )
            {
            // InternalMSat.g:317:2: ( ( rule__BiImpl__Group__0 ) )
            // InternalMSat.g:318:3: ( rule__BiImpl__Group__0 )
            {
             before(grammarAccess.getBiImplAccess().getGroup()); 
            // InternalMSat.g:319:3: ( rule__BiImpl__Group__0 )
            // InternalMSat.g:319:4: rule__BiImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBiImpl"


    // $ANTLR start "entryRuleImpl"
    // InternalMSat.g:328:1: entryRuleImpl : ruleImpl EOF ;
    public final void entryRuleImpl() throws RecognitionException {
        try {
            // InternalMSat.g:329:1: ( ruleImpl EOF )
            // InternalMSat.g:330:1: ruleImpl EOF
            {
             before(grammarAccess.getImplRule()); 
            pushFollow(FOLLOW_1);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImpl"


    // $ANTLR start "ruleImpl"
    // InternalMSat.g:337:1: ruleImpl : ( ( rule__Impl__Group__0 ) ) ;
    public final void ruleImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:341:2: ( ( ( rule__Impl__Group__0 ) ) )
            // InternalMSat.g:342:2: ( ( rule__Impl__Group__0 ) )
            {
            // InternalMSat.g:342:2: ( ( rule__Impl__Group__0 ) )
            // InternalMSat.g:343:3: ( rule__Impl__Group__0 )
            {
             before(grammarAccess.getImplAccess().getGroup()); 
            // InternalMSat.g:344:3: ( rule__Impl__Group__0 )
            // InternalMSat.g:344:4: rule__Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalMSat.g:353:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMSat.g:354:1: ( ruleOr EOF )
            // InternalMSat.g:355:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMSat.g:362:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:366:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMSat.g:367:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMSat.g:367:2: ( ( rule__Or__Group__0 ) )
            // InternalMSat.g:368:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalMSat.g:369:3: ( rule__Or__Group__0 )
            // InternalMSat.g:369:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMSat.g:378:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMSat.g:379:1: ( ruleAnd EOF )
            // InternalMSat.g:380:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMSat.g:387:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:391:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMSat.g:392:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMSat.g:392:2: ( ( rule__And__Group__0 ) )
            // InternalMSat.g:393:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMSat.g:394:3: ( rule__And__Group__0 )
            // InternalMSat.g:394:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNand"
    // InternalMSat.g:403:1: entryRuleNand : ruleNand EOF ;
    public final void entryRuleNand() throws RecognitionException {
        try {
            // InternalMSat.g:404:1: ( ruleNand EOF )
            // InternalMSat.g:405:1: ruleNand EOF
            {
             before(grammarAccess.getNandRule()); 
            pushFollow(FOLLOW_1);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getNandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNand"


    // $ANTLR start "ruleNand"
    // InternalMSat.g:412:1: ruleNand : ( ( rule__Nand__Group__0 ) ) ;
    public final void ruleNand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:416:2: ( ( ( rule__Nand__Group__0 ) ) )
            // InternalMSat.g:417:2: ( ( rule__Nand__Group__0 ) )
            {
            // InternalMSat.g:417:2: ( ( rule__Nand__Group__0 ) )
            // InternalMSat.g:418:3: ( rule__Nand__Group__0 )
            {
             before(grammarAccess.getNandAccess().getGroup()); 
            // InternalMSat.g:419:3: ( rule__Nand__Group__0 )
            // InternalMSat.g:419:4: rule__Nand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNand"


    // $ANTLR start "entryRulePrimary"
    // InternalMSat.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMSat.g:429:1: ( rulePrimary EOF )
            // InternalMSat.g:430:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMSat.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMSat.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMSat.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalMSat.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMSat.g:444:3: ( rule__Primary__Alternatives )
            // InternalMSat.g:444:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNot"
    // InternalMSat.g:453:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMSat.g:454:1: ( ruleNot EOF )
            // InternalMSat.g:455:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMSat.g:462:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:466:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMSat.g:467:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMSat.g:467:2: ( ( rule__Not__Group__0 ) )
            // InternalMSat.g:468:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMSat.g:469:3: ( rule__Not__Group__0 )
            // InternalMSat.g:469:4: rule__Not__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleVar"
    // InternalMSat.g:478:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMSat.g:479:1: ( ruleVar EOF )
            // InternalMSat.g:480:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMSat.g:487:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:491:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalMSat.g:492:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalMSat.g:492:2: ( ( rule__Var__IdAssignment ) )
            // InternalMSat.g:493:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalMSat.g:494:3: ( rule__Var__IdAssignment )
            // InternalMSat.g:494:4: rule__Var__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalMSat.g:503:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalMSat.g:504:1: ( ruleConst EOF )
            // InternalMSat.g:505:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalMSat.g:512:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:516:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalMSat.g:517:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalMSat.g:517:2: ( ( rule__Const__ValAssignment ) )
            // InternalMSat.g:518:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalMSat.g:519:3: ( rule__Const__ValAssignment )
            // InternalMSat.g:519:4: rule__Const__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "ruleSat4JVariant"
    // InternalMSat.g:528:1: ruleSat4JVariant : ( ( rule__Sat4JVariant__Alternatives ) ) ;
    public final void ruleSat4JVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:532:1: ( ( ( rule__Sat4JVariant__Alternatives ) ) )
            // InternalMSat.g:533:2: ( ( rule__Sat4JVariant__Alternatives ) )
            {
            // InternalMSat.g:533:2: ( ( rule__Sat4JVariant__Alternatives ) )
            // InternalMSat.g:534:3: ( rule__Sat4JVariant__Alternatives )
            {
             before(grammarAccess.getSat4JVariantAccess().getAlternatives()); 
            // InternalMSat.g:535:3: ( rule__Sat4JVariant__Alternatives )
            // InternalMSat.g:535:4: rule__Sat4JVariant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sat4JVariant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSat4JVariantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSat4JVariant"


    // $ANTLR start "rule__SATSolver__SolverAlternatives_0_0"
    // InternalMSat.g:543:1: rule__SATSolver__SolverAlternatives_0_0 : ( ( ruleSat4J ) | ( ruleCryptoMiniSAT ) | ( ruleMiniSAT ) );
    public final void rule__SATSolver__SolverAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:547:1: ( ( ruleSat4J ) | ( ruleCryptoMiniSAT ) | ( ruleMiniSAT ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 20:
                {
                alt1=1;
                }
                break;
            case 34:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMSat.g:548:2: ( ruleSat4J )
                    {
                    // InternalMSat.g:548:2: ( ruleSat4J )
                    // InternalMSat.g:549:3: ruleSat4J
                    {
                     before(grammarAccess.getSATSolverAccess().getSolverSat4JParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSat4J();

                    state._fsp--;

                     after(grammarAccess.getSATSolverAccess().getSolverSat4JParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:554:2: ( ruleCryptoMiniSAT )
                    {
                    // InternalMSat.g:554:2: ( ruleCryptoMiniSAT )
                    // InternalMSat.g:555:3: ruleCryptoMiniSAT
                    {
                     before(grammarAccess.getSATSolverAccess().getSolverCryptoMiniSATParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCryptoMiniSAT();

                    state._fsp--;

                     after(grammarAccess.getSATSolverAccess().getSolverCryptoMiniSATParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:560:2: ( ruleMiniSAT )
                    {
                    // InternalMSat.g:560:2: ( ruleMiniSAT )
                    // InternalMSat.g:561:3: ruleMiniSAT
                    {
                     before(grammarAccess.getSATSolverAccess().getSolverMiniSATParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMiniSAT();

                    state._fsp--;

                     after(grammarAccess.getSATSolverAccess().getSolverMiniSATParserRuleCall_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__SolverAlternatives_0_0"


    // $ANTLR start "rule__Benchmark__Alternatives"
    // InternalMSat.g:570:1: rule__Benchmark__Alternatives : ( ( ruleBenchmarkDimacs ) | ( ruleBenchmarkFormula ) );
    public final void rule__Benchmark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:574:1: ( ( ruleBenchmarkDimacs ) | ( ruleBenchmarkFormula ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSat.g:575:2: ( ruleBenchmarkDimacs )
                    {
                    // InternalMSat.g:575:2: ( ruleBenchmarkDimacs )
                    // InternalMSat.g:576:3: ruleBenchmarkDimacs
                    {
                     before(grammarAccess.getBenchmarkAccess().getBenchmarkDimacsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBenchmarkDimacs();

                    state._fsp--;

                     after(grammarAccess.getBenchmarkAccess().getBenchmarkDimacsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:581:2: ( ruleBenchmarkFormula )
                    {
                    // InternalMSat.g:581:2: ( ruleBenchmarkFormula )
                    // InternalMSat.g:582:3: ruleBenchmarkFormula
                    {
                     before(grammarAccess.getBenchmarkAccess().getBenchmarkFormulaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBenchmarkFormula();

                    state._fsp--;

                     after(grammarAccess.getBenchmarkAccess().getBenchmarkFormulaParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benchmark__Alternatives"


    // $ANTLR start "rule__Nand__Alternatives_1_1"
    // InternalMSat.g:591:1: rule__Nand__Alternatives_1_1 : ( ( '|' ) | ( '\\u2191' ) );
    public final void rule__Nand__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:595:1: ( ( '|' ) | ( '\\u2191' ) )
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
                    // InternalMSat.g:596:2: ( '|' )
                    {
                    // InternalMSat.g:596:2: ( '|' )
                    // InternalMSat.g:597:3: '|'
                    {
                     before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:602:2: ( '\\u2191' )
                    {
                    // InternalMSat.g:602:2: ( '\\u2191' )
                    // InternalMSat.g:603:3: '\\u2191'
                    {
                     before(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Alternatives_1_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMSat.g:612:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:616:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 14:
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
            case 17:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMSat.g:617:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMSat.g:617:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMSat.g:618:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMSat.g:619:3: ( rule__Primary__Group_0__0 )
                    // InternalMSat.g:619:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:623:2: ( ruleNot )
                    {
                    // InternalMSat.g:623:2: ( ruleNot )
                    // InternalMSat.g:624:3: ruleNot
                    {
                     before(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:629:2: ( ruleConst )
                    {
                    // InternalMSat.g:629:2: ( ruleConst )
                    // InternalMSat.g:630:3: ruleConst
                    {
                     before(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSat.g:635:2: ( ruleVar )
                    {
                    // InternalMSat.g:635:2: ( ruleVar )
                    // InternalMSat.g:636:3: ruleVar
                    {
                     before(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Not__Alternatives_0"
    // InternalMSat.g:645:1: rule__Not__Alternatives_0 : ( ( '!' ) | ( '~' ) );
    public final void rule__Not__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:649:1: ( ( '!' ) | ( '~' ) )
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
                    // InternalMSat.g:650:2: ( '!' )
                    {
                    // InternalMSat.g:650:2: ( '!' )
                    // InternalMSat.g:651:3: '!'
                    {
                     before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:656:2: ( '~' )
                    {
                    // InternalMSat.g:656:2: ( '~' )
                    // InternalMSat.g:657:3: '~'
                    {
                     before(grammarAccess.getNotAccess().getTildeKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getTildeKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives_0"


    // $ANTLR start "rule__Const__ValAlternatives_0"
    // InternalMSat.g:666:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:670:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalMSat.g:671:2: ( 'true' )
                    {
                    // InternalMSat.g:671:2: ( 'true' )
                    // InternalMSat.g:672:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:677:2: ( 'false' )
                    {
                    // InternalMSat.g:677:2: ( 'false' )
                    // InternalMSat.g:678:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__ValAlternatives_0"


    // $ANTLR start "rule__Sat4JVariant__Alternatives"
    // InternalMSat.g:687:1: rule__Sat4JVariant__Alternatives : ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) );
    public final void rule__Sat4JVariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:691:1: ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMSat.g:692:2: ( ( 'sat4j-java' ) )
                    {
                    // InternalMSat.g:692:2: ( ( 'sat4j-java' ) )
                    // InternalMSat.g:693:3: ( 'sat4j-java' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 
                    // InternalMSat.g:694:3: ( 'sat4j-java' )
                    // InternalMSat.g:694:4: 'sat4j-java'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:698:2: ( ( 'sat4j-jar' ) )
                    {
                    // InternalMSat.g:698:2: ( ( 'sat4j-jar' ) )
                    // InternalMSat.g:699:3: ( 'sat4j-jar' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 
                    // InternalMSat.g:700:3: ( 'sat4j-jar' )
                    // InternalMSat.g:700:4: 'sat4j-jar'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:704:2: ( ( 'sat4j-maven' ) )
                    {
                    // InternalMSat.g:704:2: ( ( 'sat4j-maven' ) )
                    // InternalMSat.g:705:3: ( 'sat4j-maven' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_COMPEnumLiteralDeclaration_2()); 
                    // InternalMSat.g:706:3: ( 'sat4j-maven' )
                    // InternalMSat.g:706:4: 'sat4j-maven'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSat4JVariantAccess().getSAT4J_COMPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat4JVariant__Alternatives"


    // $ANTLR start "rule__SATMorphic__Group__0"
    // InternalMSat.g:714:1: rule__SATMorphic__Group__0 : rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1 ;
    public final void rule__SATMorphic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:718:1: ( rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1 )
            // InternalMSat.g:719:2: rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SATMorphic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SATMorphic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__0"


    // $ANTLR start "rule__SATMorphic__Group__0__Impl"
    // InternalMSat.g:726:1: rule__SATMorphic__Group__0__Impl : ( 'solver' ) ;
    public final void rule__SATMorphic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:730:1: ( ( 'solver' ) )
            // InternalMSat.g:731:1: ( 'solver' )
            {
            // InternalMSat.g:731:1: ( 'solver' )
            // InternalMSat.g:732:2: 'solver'
            {
             before(grammarAccess.getSATMorphicAccess().getSolverKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSATMorphicAccess().getSolverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__0__Impl"


    // $ANTLR start "rule__SATMorphic__Group__1"
    // InternalMSat.g:741:1: rule__SATMorphic__Group__1 : rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2 ;
    public final void rule__SATMorphic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:745:1: ( rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2 )
            // InternalMSat.g:746:2: rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SATMorphic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SATMorphic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__1"


    // $ANTLR start "rule__SATMorphic__Group__1__Impl"
    // InternalMSat.g:753:1: rule__SATMorphic__Group__1__Impl : ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) ) ;
    public final void rule__SATMorphic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:757:1: ( ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) ) )
            // InternalMSat.g:758:1: ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) )
            {
            // InternalMSat.g:758:1: ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) )
            // InternalMSat.g:759:2: ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* )
            {
            // InternalMSat.g:759:2: ( ( rule__SATMorphic__SolversAssignment_1 ) )
            // InternalMSat.g:760:3: ( rule__SATMorphic__SolversAssignment_1 )
            {
             before(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 
            // InternalMSat.g:761:3: ( rule__SATMorphic__SolversAssignment_1 )
            // InternalMSat.g:761:4: rule__SATMorphic__SolversAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__SATMorphic__SolversAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 

            }

            // InternalMSat.g:764:2: ( ( rule__SATMorphic__SolversAssignment_1 )* )
            // InternalMSat.g:765:3: ( rule__SATMorphic__SolversAssignment_1 )*
            {
             before(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 
            // InternalMSat.g:766:3: ( rule__SATMorphic__SolversAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=20)||(LA8_0>=33 && LA8_0<=34)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSat.g:766:4: rule__SATMorphic__SolversAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SATMorphic__SolversAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__1__Impl"


    // $ANTLR start "rule__SATMorphic__Group__2"
    // InternalMSat.g:775:1: rule__SATMorphic__Group__2 : rule__SATMorphic__Group__2__Impl ;
    public final void rule__SATMorphic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:779:1: ( rule__SATMorphic__Group__2__Impl )
            // InternalMSat.g:780:2: rule__SATMorphic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SATMorphic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__2"


    // $ANTLR start "rule__SATMorphic__Group__2__Impl"
    // InternalMSat.g:786:1: rule__SATMorphic__Group__2__Impl : ( ( rule__SATMorphic__BenchmarkAssignment_2 ) ) ;
    public final void rule__SATMorphic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:790:1: ( ( ( rule__SATMorphic__BenchmarkAssignment_2 ) ) )
            // InternalMSat.g:791:1: ( ( rule__SATMorphic__BenchmarkAssignment_2 ) )
            {
            // InternalMSat.g:791:1: ( ( rule__SATMorphic__BenchmarkAssignment_2 ) )
            // InternalMSat.g:792:2: ( rule__SATMorphic__BenchmarkAssignment_2 )
            {
             before(grammarAccess.getSATMorphicAccess().getBenchmarkAssignment_2()); 
            // InternalMSat.g:793:2: ( rule__SATMorphic__BenchmarkAssignment_2 )
            // InternalMSat.g:793:3: rule__SATMorphic__BenchmarkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SATMorphic__BenchmarkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSATMorphicAccess().getBenchmarkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__Group__2__Impl"


    // $ANTLR start "rule__SATSolver__Group__0"
    // InternalMSat.g:802:1: rule__SATSolver__Group__0 : rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1 ;
    public final void rule__SATSolver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:806:1: ( rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1 )
            // InternalMSat.g:807:2: rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SATSolver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SATSolver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__Group__0"


    // $ANTLR start "rule__SATSolver__Group__0__Impl"
    // InternalMSat.g:814:1: rule__SATSolver__Group__0__Impl : ( ( rule__SATSolver__SolverAssignment_0 ) ) ;
    public final void rule__SATSolver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:818:1: ( ( ( rule__SATSolver__SolverAssignment_0 ) ) )
            // InternalMSat.g:819:1: ( ( rule__SATSolver__SolverAssignment_0 ) )
            {
            // InternalMSat.g:819:1: ( ( rule__SATSolver__SolverAssignment_0 ) )
            // InternalMSat.g:820:2: ( rule__SATSolver__SolverAssignment_0 )
            {
             before(grammarAccess.getSATSolverAccess().getSolverAssignment_0()); 
            // InternalMSat.g:821:2: ( rule__SATSolver__SolverAssignment_0 )
            // InternalMSat.g:821:3: rule__SATSolver__SolverAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SATSolver__SolverAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSATSolverAccess().getSolverAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__Group__0__Impl"


    // $ANTLR start "rule__SATSolver__Group__1"
    // InternalMSat.g:829:1: rule__SATSolver__Group__1 : rule__SATSolver__Group__1__Impl ;
    public final void rule__SATSolver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:833:1: ( rule__SATSolver__Group__1__Impl )
            // InternalMSat.g:834:2: rule__SATSolver__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SATSolver__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__Group__1"


    // $ANTLR start "rule__SATSolver__Group__1__Impl"
    // InternalMSat.g:840:1: rule__SATSolver__Group__1__Impl : ( ( rule__SATSolver__VersionAssignment_1 )? ) ;
    public final void rule__SATSolver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:844:1: ( ( ( rule__SATSolver__VersionAssignment_1 )? ) )
            // InternalMSat.g:845:1: ( ( rule__SATSolver__VersionAssignment_1 )? )
            {
            // InternalMSat.g:845:1: ( ( rule__SATSolver__VersionAssignment_1 )? )
            // InternalMSat.g:846:2: ( rule__SATSolver__VersionAssignment_1 )?
            {
             before(grammarAccess.getSATSolverAccess().getVersionAssignment_1()); 
            // InternalMSat.g:847:2: ( rule__SATSolver__VersionAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSat.g:847:3: rule__SATSolver__VersionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SATSolver__VersionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSATSolverAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__Group__1__Impl"


    // $ANTLR start "rule__SolverVersion__Group__0"
    // InternalMSat.g:856:1: rule__SolverVersion__Group__0 : rule__SolverVersion__Group__0__Impl rule__SolverVersion__Group__1 ;
    public final void rule__SolverVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:860:1: ( rule__SolverVersion__Group__0__Impl rule__SolverVersion__Group__1 )
            // InternalMSat.g:861:2: rule__SolverVersion__Group__0__Impl rule__SolverVersion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SolverVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolverVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolverVersion__Group__0"


    // $ANTLR start "rule__SolverVersion__Group__0__Impl"
    // InternalMSat.g:868:1: rule__SolverVersion__Group__0__Impl : ( 'version' ) ;
    public final void rule__SolverVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:872:1: ( ( 'version' ) )
            // InternalMSat.g:873:1: ( 'version' )
            {
            // InternalMSat.g:873:1: ( 'version' )
            // InternalMSat.g:874:2: 'version'
            {
             before(grammarAccess.getSolverVersionAccess().getVersionKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSolverVersionAccess().getVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolverVersion__Group__0__Impl"


    // $ANTLR start "rule__SolverVersion__Group__1"
    // InternalMSat.g:883:1: rule__SolverVersion__Group__1 : rule__SolverVersion__Group__1__Impl ;
    public final void rule__SolverVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:887:1: ( rule__SolverVersion__Group__1__Impl )
            // InternalMSat.g:888:2: rule__SolverVersion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SolverVersion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolverVersion__Group__1"


    // $ANTLR start "rule__SolverVersion__Group__1__Impl"
    // InternalMSat.g:894:1: rule__SolverVersion__Group__1__Impl : ( ( rule__SolverVersion__VersionAssignment_1 ) ) ;
    public final void rule__SolverVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:898:1: ( ( ( rule__SolverVersion__VersionAssignment_1 ) ) )
            // InternalMSat.g:899:1: ( ( rule__SolverVersion__VersionAssignment_1 ) )
            {
            // InternalMSat.g:899:1: ( ( rule__SolverVersion__VersionAssignment_1 ) )
            // InternalMSat.g:900:2: ( rule__SolverVersion__VersionAssignment_1 )
            {
             before(grammarAccess.getSolverVersionAccess().getVersionAssignment_1()); 
            // InternalMSat.g:901:2: ( rule__SolverVersion__VersionAssignment_1 )
            // InternalMSat.g:901:3: rule__SolverVersion__VersionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SolverVersion__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSolverVersionAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolverVersion__Group__1__Impl"


    // $ANTLR start "rule__MiniSAT__Group__0"
    // InternalMSat.g:910:1: rule__MiniSAT__Group__0 : rule__MiniSAT__Group__0__Impl rule__MiniSAT__Group__1 ;
    public final void rule__MiniSAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:914:1: ( rule__MiniSAT__Group__0__Impl rule__MiniSAT__Group__1 )
            // InternalMSat.g:915:2: rule__MiniSAT__Group__0__Impl rule__MiniSAT__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MiniSAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiniSAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__Group__0"


    // $ANTLR start "rule__MiniSAT__Group__0__Impl"
    // InternalMSat.g:922:1: rule__MiniSAT__Group__0__Impl : ( ( rule__MiniSAT__VariantAssignment_0 ) ) ;
    public final void rule__MiniSAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:926:1: ( ( ( rule__MiniSAT__VariantAssignment_0 ) ) )
            // InternalMSat.g:927:1: ( ( rule__MiniSAT__VariantAssignment_0 ) )
            {
            // InternalMSat.g:927:1: ( ( rule__MiniSAT__VariantAssignment_0 ) )
            // InternalMSat.g:928:2: ( rule__MiniSAT__VariantAssignment_0 )
            {
             before(grammarAccess.getMiniSATAccess().getVariantAssignment_0()); 
            // InternalMSat.g:929:2: ( rule__MiniSAT__VariantAssignment_0 )
            // InternalMSat.g:929:3: rule__MiniSAT__VariantAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MiniSAT__VariantAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMiniSATAccess().getVariantAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__Group__0__Impl"


    // $ANTLR start "rule__MiniSAT__Group__1"
    // InternalMSat.g:937:1: rule__MiniSAT__Group__1 : rule__MiniSAT__Group__1__Impl ;
    public final void rule__MiniSAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:941:1: ( rule__MiniSAT__Group__1__Impl )
            // InternalMSat.g:942:2: rule__MiniSAT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiniSAT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__Group__1"


    // $ANTLR start "rule__MiniSAT__Group__1__Impl"
    // InternalMSat.g:948:1: rule__MiniSAT__Group__1__Impl : ( ( rule__MiniSAT__ParameterAssignment_1 )? ) ;
    public final void rule__MiniSAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:952:1: ( ( ( rule__MiniSAT__ParameterAssignment_1 )? ) )
            // InternalMSat.g:953:1: ( ( rule__MiniSAT__ParameterAssignment_1 )? )
            {
            // InternalMSat.g:953:1: ( ( rule__MiniSAT__ParameterAssignment_1 )? )
            // InternalMSat.g:954:2: ( rule__MiniSAT__ParameterAssignment_1 )?
            {
             before(grammarAccess.getMiniSATAccess().getParameterAssignment_1()); 
            // InternalMSat.g:955:2: ( rule__MiniSAT__ParameterAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSat.g:955:3: rule__MiniSAT__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiniSAT__ParameterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiniSATAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__Group__1__Impl"


    // $ANTLR start "rule__MiniSATParameter__Group__0"
    // InternalMSat.g:964:1: rule__MiniSATParameter__Group__0 : rule__MiniSATParameter__Group__0__Impl rule__MiniSATParameter__Group__1 ;
    public final void rule__MiniSATParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:968:1: ( rule__MiniSATParameter__Group__0__Impl rule__MiniSATParameter__Group__1 )
            // InternalMSat.g:969:2: rule__MiniSATParameter__Group__0__Impl rule__MiniSATParameter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MiniSATParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiniSATParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSATParameter__Group__0"


    // $ANTLR start "rule__MiniSATParameter__Group__0__Impl"
    // InternalMSat.g:976:1: rule__MiniSATParameter__Group__0__Impl : ( 'rnd-freq' ) ;
    public final void rule__MiniSATParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:980:1: ( ( 'rnd-freq' ) )
            // InternalMSat.g:981:1: ( 'rnd-freq' )
            {
            // InternalMSat.g:981:1: ( 'rnd-freq' )
            // InternalMSat.g:982:2: 'rnd-freq'
            {
             before(grammarAccess.getMiniSATParameterAccess().getRndFreqKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMiniSATParameterAccess().getRndFreqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSATParameter__Group__0__Impl"


    // $ANTLR start "rule__MiniSATParameter__Group__1"
    // InternalMSat.g:991:1: rule__MiniSATParameter__Group__1 : rule__MiniSATParameter__Group__1__Impl ;
    public final void rule__MiniSATParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:995:1: ( rule__MiniSATParameter__Group__1__Impl )
            // InternalMSat.g:996:2: rule__MiniSATParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiniSATParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSATParameter__Group__1"


    // $ANTLR start "rule__MiniSATParameter__Group__1__Impl"
    // InternalMSat.g:1002:1: rule__MiniSATParameter__Group__1__Impl : ( ( rule__MiniSATParameter__RndfreqAssignment_1 ) ) ;
    public final void rule__MiniSATParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1006:1: ( ( ( rule__MiniSATParameter__RndfreqAssignment_1 ) ) )
            // InternalMSat.g:1007:1: ( ( rule__MiniSATParameter__RndfreqAssignment_1 ) )
            {
            // InternalMSat.g:1007:1: ( ( rule__MiniSATParameter__RndfreqAssignment_1 ) )
            // InternalMSat.g:1008:2: ( rule__MiniSATParameter__RndfreqAssignment_1 )
            {
             before(grammarAccess.getMiniSATParameterAccess().getRndfreqAssignment_1()); 
            // InternalMSat.g:1009:2: ( rule__MiniSATParameter__RndfreqAssignment_1 )
            // InternalMSat.g:1009:3: rule__MiniSATParameter__RndfreqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MiniSATParameter__RndfreqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMiniSATParameterAccess().getRndfreqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSATParameter__Group__1__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group__0"
    // InternalMSat.g:1018:1: rule__BenchmarkDimacs__Group__0 : rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1 ;
    public final void rule__BenchmarkDimacs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1022:1: ( rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1 )
            // InternalMSat.g:1023:2: rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BenchmarkDimacs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group__0"


    // $ANTLR start "rule__BenchmarkDimacs__Group__0__Impl"
    // InternalMSat.g:1030:1: rule__BenchmarkDimacs__Group__0__Impl : ( 'benchmarkDIMACS' ) ;
    public final void rule__BenchmarkDimacs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1034:1: ( ( 'benchmarkDIMACS' ) )
            // InternalMSat.g:1035:1: ( 'benchmarkDIMACS' )
            {
            // InternalMSat.g:1035:1: ( 'benchmarkDIMACS' )
            // InternalMSat.g:1036:2: 'benchmarkDIMACS'
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getBenchmarkDIMACSKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBenchmarkDimacsAccess().getBenchmarkDIMACSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group__0__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group__1"
    // InternalMSat.g:1045:1: rule__BenchmarkDimacs__Group__1 : rule__BenchmarkDimacs__Group__1__Impl ;
    public final void rule__BenchmarkDimacs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1049:1: ( rule__BenchmarkDimacs__Group__1__Impl )
            // InternalMSat.g:1050:2: rule__BenchmarkDimacs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group__1"


    // $ANTLR start "rule__BenchmarkDimacs__Group__1__Impl"
    // InternalMSat.g:1056:1: rule__BenchmarkDimacs__Group__1__Impl : ( ( rule__BenchmarkDimacs__Group_1__0 ) ) ;
    public final void rule__BenchmarkDimacs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1060:1: ( ( ( rule__BenchmarkDimacs__Group_1__0 ) ) )
            // InternalMSat.g:1061:1: ( ( rule__BenchmarkDimacs__Group_1__0 ) )
            {
            // InternalMSat.g:1061:1: ( ( rule__BenchmarkDimacs__Group_1__0 ) )
            // InternalMSat.g:1062:2: ( rule__BenchmarkDimacs__Group_1__0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup_1()); 
            // InternalMSat.g:1063:2: ( rule__BenchmarkDimacs__Group_1__0 )
            // InternalMSat.g:1063:3: rule__BenchmarkDimacs__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkDimacsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group__1__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1__0"
    // InternalMSat.g:1072:1: rule__BenchmarkDimacs__Group_1__0 : rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1 ;
    public final void rule__BenchmarkDimacs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1076:1: ( rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1 )
            // InternalMSat.g:1077:2: rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__BenchmarkDimacs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1__0"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1__0__Impl"
    // InternalMSat.g:1084:1: rule__BenchmarkDimacs__Group_1__0__Impl : ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) ) ;
    public final void rule__BenchmarkDimacs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1088:1: ( ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) ) )
            // InternalMSat.g:1089:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) )
            {
            // InternalMSat.g:1089:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) )
            // InternalMSat.g:1090:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_0()); 
            // InternalMSat.g:1091:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 )
            // InternalMSat.g:1091:3: rule__BenchmarkDimacs__DimacsesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__DimacsesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1__0__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1__1"
    // InternalMSat.g:1099:1: rule__BenchmarkDimacs__Group_1__1 : rule__BenchmarkDimacs__Group_1__1__Impl ;
    public final void rule__BenchmarkDimacs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1103:1: ( rule__BenchmarkDimacs__Group_1__1__Impl )
            // InternalMSat.g:1104:2: rule__BenchmarkDimacs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1__1"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1__1__Impl"
    // InternalMSat.g:1110:1: rule__BenchmarkDimacs__Group_1__1__Impl : ( ( rule__BenchmarkDimacs__Group_1_1__0 )* ) ;
    public final void rule__BenchmarkDimacs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1114:1: ( ( ( rule__BenchmarkDimacs__Group_1_1__0 )* ) )
            // InternalMSat.g:1115:1: ( ( rule__BenchmarkDimacs__Group_1_1__0 )* )
            {
            // InternalMSat.g:1115:1: ( ( rule__BenchmarkDimacs__Group_1_1__0 )* )
            // InternalMSat.g:1116:2: ( rule__BenchmarkDimacs__Group_1_1__0 )*
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup_1_1()); 
            // InternalMSat.g:1117:2: ( rule__BenchmarkDimacs__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSat.g:1117:3: rule__BenchmarkDimacs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BenchmarkDimacs__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBenchmarkDimacsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1__1__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1_1__0"
    // InternalMSat.g:1126:1: rule__BenchmarkDimacs__Group_1_1__0 : rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1 ;
    public final void rule__BenchmarkDimacs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1130:1: ( rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1 )
            // InternalMSat.g:1131:2: rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__BenchmarkDimacs__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1_1__0"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1_1__0__Impl"
    // InternalMSat.g:1138:1: rule__BenchmarkDimacs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BenchmarkDimacs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1142:1: ( ( ',' ) )
            // InternalMSat.g:1143:1: ( ',' )
            {
            // InternalMSat.g:1143:1: ( ',' )
            // InternalMSat.g:1144:2: ','
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getCommaKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBenchmarkDimacsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1_1__0__Impl"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1_1__1"
    // InternalMSat.g:1153:1: rule__BenchmarkDimacs__Group_1_1__1 : rule__BenchmarkDimacs__Group_1_1__1__Impl ;
    public final void rule__BenchmarkDimacs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1157:1: ( rule__BenchmarkDimacs__Group_1_1__1__Impl )
            // InternalMSat.g:1158:2: rule__BenchmarkDimacs__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1_1__1"


    // $ANTLR start "rule__BenchmarkDimacs__Group_1_1__1__Impl"
    // InternalMSat.g:1164:1: rule__BenchmarkDimacs__Group_1_1__1__Impl : ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) ) ;
    public final void rule__BenchmarkDimacs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1168:1: ( ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) ) )
            // InternalMSat.g:1169:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) )
            {
            // InternalMSat.g:1169:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) )
            // InternalMSat.g:1170:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_1_1()); 
            // InternalMSat.g:1171:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 )
            // InternalMSat.g:1171:3: rule__BenchmarkDimacs__DimacsesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkDimacs__DimacsesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__Group_1_1__1__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group__0"
    // InternalMSat.g:1180:1: rule__BenchmarkFormula__Group__0 : rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1 ;
    public final void rule__BenchmarkFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1184:1: ( rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1 )
            // InternalMSat.g:1185:2: rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BenchmarkFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group__0"


    // $ANTLR start "rule__BenchmarkFormula__Group__0__Impl"
    // InternalMSat.g:1192:1: rule__BenchmarkFormula__Group__0__Impl : ( 'benchmarkFormula' ) ;
    public final void rule__BenchmarkFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1196:1: ( ( 'benchmarkFormula' ) )
            // InternalMSat.g:1197:1: ( 'benchmarkFormula' )
            {
            // InternalMSat.g:1197:1: ( 'benchmarkFormula' )
            // InternalMSat.g:1198:2: 'benchmarkFormula'
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getBenchmarkFormulaKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBenchmarkFormulaAccess().getBenchmarkFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group__0__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group__1"
    // InternalMSat.g:1207:1: rule__BenchmarkFormula__Group__1 : rule__BenchmarkFormula__Group__1__Impl ;
    public final void rule__BenchmarkFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1211:1: ( rule__BenchmarkFormula__Group__1__Impl )
            // InternalMSat.g:1212:2: rule__BenchmarkFormula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group__1"


    // $ANTLR start "rule__BenchmarkFormula__Group__1__Impl"
    // InternalMSat.g:1218:1: rule__BenchmarkFormula__Group__1__Impl : ( ( rule__BenchmarkFormula__Group_1__0 ) ) ;
    public final void rule__BenchmarkFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1222:1: ( ( ( rule__BenchmarkFormula__Group_1__0 ) ) )
            // InternalMSat.g:1223:1: ( ( rule__BenchmarkFormula__Group_1__0 ) )
            {
            // InternalMSat.g:1223:1: ( ( rule__BenchmarkFormula__Group_1__0 ) )
            // InternalMSat.g:1224:2: ( rule__BenchmarkFormula__Group_1__0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup_1()); 
            // InternalMSat.g:1225:2: ( rule__BenchmarkFormula__Group_1__0 )
            // InternalMSat.g:1225:3: rule__BenchmarkFormula__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkFormulaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group__1__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group_1__0"
    // InternalMSat.g:1234:1: rule__BenchmarkFormula__Group_1__0 : rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1 ;
    public final void rule__BenchmarkFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1238:1: ( rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1 )
            // InternalMSat.g:1239:2: rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__BenchmarkFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1__0"


    // $ANTLR start "rule__BenchmarkFormula__Group_1__0__Impl"
    // InternalMSat.g:1246:1: rule__BenchmarkFormula__Group_1__0__Impl : ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__BenchmarkFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1250:1: ( ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) ) )
            // InternalMSat.g:1251:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) )
            {
            // InternalMSat.g:1251:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) )
            // InternalMSat.g:1252:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_0()); 
            // InternalMSat.g:1253:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 )
            // InternalMSat.g:1253:3: rule__BenchmarkFormula__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__ExpressionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1__0__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group_1__1"
    // InternalMSat.g:1261:1: rule__BenchmarkFormula__Group_1__1 : rule__BenchmarkFormula__Group_1__1__Impl ;
    public final void rule__BenchmarkFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1265:1: ( rule__BenchmarkFormula__Group_1__1__Impl )
            // InternalMSat.g:1266:2: rule__BenchmarkFormula__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1__1"


    // $ANTLR start "rule__BenchmarkFormula__Group_1__1__Impl"
    // InternalMSat.g:1272:1: rule__BenchmarkFormula__Group_1__1__Impl : ( ( rule__BenchmarkFormula__Group_1_1__0 )* ) ;
    public final void rule__BenchmarkFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1276:1: ( ( ( rule__BenchmarkFormula__Group_1_1__0 )* ) )
            // InternalMSat.g:1277:1: ( ( rule__BenchmarkFormula__Group_1_1__0 )* )
            {
            // InternalMSat.g:1277:1: ( ( rule__BenchmarkFormula__Group_1_1__0 )* )
            // InternalMSat.g:1278:2: ( rule__BenchmarkFormula__Group_1_1__0 )*
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup_1_1()); 
            // InternalMSat.g:1279:2: ( rule__BenchmarkFormula__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSat.g:1279:3: rule__BenchmarkFormula__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BenchmarkFormula__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBenchmarkFormulaAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1__1__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group_1_1__0"
    // InternalMSat.g:1288:1: rule__BenchmarkFormula__Group_1_1__0 : rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1 ;
    public final void rule__BenchmarkFormula__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1292:1: ( rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1 )
            // InternalMSat.g:1293:2: rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__BenchmarkFormula__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1_1__0"


    // $ANTLR start "rule__BenchmarkFormula__Group_1_1__0__Impl"
    // InternalMSat.g:1300:1: rule__BenchmarkFormula__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BenchmarkFormula__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1304:1: ( ( ',' ) )
            // InternalMSat.g:1305:1: ( ',' )
            {
            // InternalMSat.g:1305:1: ( ',' )
            // InternalMSat.g:1306:2: ','
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getCommaKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBenchmarkFormulaAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1_1__0__Impl"


    // $ANTLR start "rule__BenchmarkFormula__Group_1_1__1"
    // InternalMSat.g:1315:1: rule__BenchmarkFormula__Group_1_1__1 : rule__BenchmarkFormula__Group_1_1__1__Impl ;
    public final void rule__BenchmarkFormula__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1319:1: ( rule__BenchmarkFormula__Group_1_1__1__Impl )
            // InternalMSat.g:1320:2: rule__BenchmarkFormula__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1_1__1"


    // $ANTLR start "rule__BenchmarkFormula__Group_1_1__1__Impl"
    // InternalMSat.g:1326:1: rule__BenchmarkFormula__Group_1_1__1__Impl : ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BenchmarkFormula__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1330:1: ( ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) ) )
            // InternalMSat.g:1331:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) )
            {
            // InternalMSat.g:1331:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) )
            // InternalMSat.g:1332:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_1_1()); 
            // InternalMSat.g:1333:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 )
            // InternalMSat.g:1333:3: rule__BenchmarkFormula__ExpressionsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BenchmarkFormula__ExpressionsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__Group_1_1__1__Impl"


    // $ANTLR start "rule__BiImpl__Group__0"
    // InternalMSat.g:1342:1: rule__BiImpl__Group__0 : rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 ;
    public final void rule__BiImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1346:1: ( rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 )
            // InternalMSat.g:1347:2: rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BiImpl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__0"


    // $ANTLR start "rule__BiImpl__Group__0__Impl"
    // InternalMSat.g:1354:1: rule__BiImpl__Group__0__Impl : ( ruleImpl ) ;
    public final void rule__BiImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1358:1: ( ( ruleImpl ) )
            // InternalMSat.g:1359:1: ( ruleImpl )
            {
            // InternalMSat.g:1359:1: ( ruleImpl )
            // InternalMSat.g:1360:2: ruleImpl
            {
             before(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__0__Impl"


    // $ANTLR start "rule__BiImpl__Group__1"
    // InternalMSat.g:1369:1: rule__BiImpl__Group__1 : rule__BiImpl__Group__1__Impl ;
    public final void rule__BiImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1373:1: ( rule__BiImpl__Group__1__Impl )
            // InternalMSat.g:1374:2: rule__BiImpl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__1"


    // $ANTLR start "rule__BiImpl__Group__1__Impl"
    // InternalMSat.g:1380:1: rule__BiImpl__Group__1__Impl : ( ( rule__BiImpl__Group_1__0 )* ) ;
    public final void rule__BiImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1384:1: ( ( ( rule__BiImpl__Group_1__0 )* ) )
            // InternalMSat.g:1385:1: ( ( rule__BiImpl__Group_1__0 )* )
            {
            // InternalMSat.g:1385:1: ( ( rule__BiImpl__Group_1__0 )* )
            // InternalMSat.g:1386:2: ( rule__BiImpl__Group_1__0 )*
            {
             before(grammarAccess.getBiImplAccess().getGroup_1()); 
            // InternalMSat.g:1387:2: ( rule__BiImpl__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSat.g:1387:3: rule__BiImpl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__BiImpl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBiImplAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__1__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__0"
    // InternalMSat.g:1396:1: rule__BiImpl__Group_1__0 : rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 ;
    public final void rule__BiImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1400:1: ( rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 )
            // InternalMSat.g:1401:2: rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BiImpl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__0"


    // $ANTLR start "rule__BiImpl__Group_1__0__Impl"
    // InternalMSat.g:1408:1: rule__BiImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1412:1: ( ( () ) )
            // InternalMSat.g:1413:1: ( () )
            {
            // InternalMSat.g:1413:1: ( () )
            // InternalMSat.g:1414:2: ()
            {
             before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 
            // InternalMSat.g:1415:2: ()
            // InternalMSat.g:1415:3: 
            {
            }

             after(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__0__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__1"
    // InternalMSat.g:1423:1: rule__BiImpl__Group_1__1 : rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 ;
    public final void rule__BiImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1427:1: ( rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 )
            // InternalMSat.g:1428:2: rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__BiImpl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__1"


    // $ANTLR start "rule__BiImpl__Group_1__1__Impl"
    // InternalMSat.g:1435:1: rule__BiImpl__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1439:1: ( ( '<=>' ) )
            // InternalMSat.g:1440:1: ( '<=>' )
            {
            // InternalMSat.g:1440:1: ( '<=>' )
            // InternalMSat.g:1441:2: '<=>'
            {
             before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__1__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__2"
    // InternalMSat.g:1450:1: rule__BiImpl__Group_1__2 : rule__BiImpl__Group_1__2__Impl ;
    public final void rule__BiImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1454:1: ( rule__BiImpl__Group_1__2__Impl )
            // InternalMSat.g:1455:2: rule__BiImpl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__2"


    // $ANTLR start "rule__BiImpl__Group_1__2__Impl"
    // InternalMSat.g:1461:1: rule__BiImpl__Group_1__2__Impl : ( ( rule__BiImpl__RightAssignment_1_2 ) ) ;
    public final void rule__BiImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1465:1: ( ( ( rule__BiImpl__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1466:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1466:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            // InternalMSat.g:1467:2: ( rule__BiImpl__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1468:2: ( rule__BiImpl__RightAssignment_1_2 )
            // InternalMSat.g:1468:3: rule__BiImpl__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__2__Impl"


    // $ANTLR start "rule__Impl__Group__0"
    // InternalMSat.g:1477:1: rule__Impl__Group__0 : rule__Impl__Group__0__Impl rule__Impl__Group__1 ;
    public final void rule__Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1481:1: ( rule__Impl__Group__0__Impl rule__Impl__Group__1 )
            // InternalMSat.g:1482:2: rule__Impl__Group__0__Impl rule__Impl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__0"


    // $ANTLR start "rule__Impl__Group__0__Impl"
    // InternalMSat.g:1489:1: rule__Impl__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1493:1: ( ( ruleOr ) )
            // InternalMSat.g:1494:1: ( ruleOr )
            {
            // InternalMSat.g:1494:1: ( ruleOr )
            // InternalMSat.g:1495:2: ruleOr
            {
             before(grammarAccess.getImplAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__0__Impl"


    // $ANTLR start "rule__Impl__Group__1"
    // InternalMSat.g:1504:1: rule__Impl__Group__1 : rule__Impl__Group__1__Impl ;
    public final void rule__Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1508:1: ( rule__Impl__Group__1__Impl )
            // InternalMSat.g:1509:2: rule__Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__1"


    // $ANTLR start "rule__Impl__Group__1__Impl"
    // InternalMSat.g:1515:1: rule__Impl__Group__1__Impl : ( ( rule__Impl__Group_1__0 )* ) ;
    public final void rule__Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1519:1: ( ( ( rule__Impl__Group_1__0 )* ) )
            // InternalMSat.g:1520:1: ( ( rule__Impl__Group_1__0 )* )
            {
            // InternalMSat.g:1520:1: ( ( rule__Impl__Group_1__0 )* )
            // InternalMSat.g:1521:2: ( rule__Impl__Group_1__0 )*
            {
             before(grammarAccess.getImplAccess().getGroup_1()); 
            // InternalMSat.g:1522:2: ( rule__Impl__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSat.g:1522:3: rule__Impl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Impl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getImplAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__1__Impl"


    // $ANTLR start "rule__Impl__Group_1__0"
    // InternalMSat.g:1531:1: rule__Impl__Group_1__0 : rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 ;
    public final void rule__Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1535:1: ( rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 )
            // InternalMSat.g:1536:2: rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__0"


    // $ANTLR start "rule__Impl__Group_1__0__Impl"
    // InternalMSat.g:1543:1: rule__Impl__Group_1__0__Impl : ( () ) ;
    public final void rule__Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1547:1: ( ( () ) )
            // InternalMSat.g:1548:1: ( () )
            {
            // InternalMSat.g:1548:1: ( () )
            // InternalMSat.g:1549:2: ()
            {
             before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 
            // InternalMSat.g:1550:2: ()
            // InternalMSat.g:1550:3: 
            {
            }

             after(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__0__Impl"


    // $ANTLR start "rule__Impl__Group_1__1"
    // InternalMSat.g:1558:1: rule__Impl__Group_1__1 : rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 ;
    public final void rule__Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1562:1: ( rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 )
            // InternalMSat.g:1563:2: rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__1"


    // $ANTLR start "rule__Impl__Group_1__1__Impl"
    // InternalMSat.g:1570:1: rule__Impl__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1574:1: ( ( '=>' ) )
            // InternalMSat.g:1575:1: ( '=>' )
            {
            // InternalMSat.g:1575:1: ( '=>' )
            // InternalMSat.g:1576:2: '=>'
            {
             before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__1__Impl"


    // $ANTLR start "rule__Impl__Group_1__2"
    // InternalMSat.g:1585:1: rule__Impl__Group_1__2 : rule__Impl__Group_1__2__Impl ;
    public final void rule__Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1589:1: ( rule__Impl__Group_1__2__Impl )
            // InternalMSat.g:1590:2: rule__Impl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__2"


    // $ANTLR start "rule__Impl__Group_1__2__Impl"
    // InternalMSat.g:1596:1: rule__Impl__Group_1__2__Impl : ( ( rule__Impl__RightAssignment_1_2 ) ) ;
    public final void rule__Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1600:1: ( ( ( rule__Impl__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1601:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1601:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            // InternalMSat.g:1602:2: ( rule__Impl__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1603:2: ( rule__Impl__RightAssignment_1_2 )
            // InternalMSat.g:1603:3: rule__Impl__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Impl__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMSat.g:1612:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1616:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMSat.g:1617:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMSat.g:1624:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1628:1: ( ( ruleAnd ) )
            // InternalMSat.g:1629:1: ( ruleAnd )
            {
            // InternalMSat.g:1629:1: ( ruleAnd )
            // InternalMSat.g:1630:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMSat.g:1639:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1643:1: ( rule__Or__Group__1__Impl )
            // InternalMSat.g:1644:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMSat.g:1650:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1654:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMSat.g:1655:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMSat.g:1655:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMSat.g:1656:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMSat.g:1657:2: ( rule__Or__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSat.g:1657:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMSat.g:1666:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1670:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMSat.g:1671:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMSat.g:1678:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1682:1: ( ( () ) )
            // InternalMSat.g:1683:1: ( () )
            {
            // InternalMSat.g:1683:1: ( () )
            // InternalMSat.g:1684:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalMSat.g:1685:2: ()
            // InternalMSat.g:1685:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMSat.g:1693:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1697:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMSat.g:1698:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMSat.g:1705:1: rule__Or__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1709:1: ( ( 'v' ) )
            // InternalMSat.g:1710:1: ( 'v' )
            {
            // InternalMSat.g:1710:1: ( 'v' )
            // InternalMSat.g:1711:2: 'v'
            {
             before(grammarAccess.getOrAccess().getVKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMSat.g:1720:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1724:1: ( rule__Or__Group_1__2__Impl )
            // InternalMSat.g:1725:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMSat.g:1731:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1735:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1736:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1736:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMSat.g:1737:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1738:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMSat.g:1738:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMSat.g:1747:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1751:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMSat.g:1752:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMSat.g:1759:1: rule__And__Group__0__Impl : ( ruleNand ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1763:1: ( ( ruleNand ) )
            // InternalMSat.g:1764:1: ( ruleNand )
            {
            // InternalMSat.g:1764:1: ( ruleNand )
            // InternalMSat.g:1765:2: ruleNand
            {
             before(grammarAccess.getAndAccess().getNandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMSat.g:1774:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1778:1: ( rule__And__Group__1__Impl )
            // InternalMSat.g:1779:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMSat.g:1785:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1789:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMSat.g:1790:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMSat.g:1790:1: ( ( rule__And__Group_1__0 )* )
            // InternalMSat.g:1791:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMSat.g:1792:2: ( rule__And__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSat.g:1792:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMSat.g:1801:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1805:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMSat.g:1806:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMSat.g:1813:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1817:1: ( ( () ) )
            // InternalMSat.g:1818:1: ( () )
            {
            // InternalMSat.g:1818:1: ( () )
            // InternalMSat.g:1819:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalMSat.g:1820:2: ()
            // InternalMSat.g:1820:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMSat.g:1828:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1832:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMSat.g:1833:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMSat.g:1840:1: rule__And__Group_1__1__Impl : ( '^' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1844:1: ( ( '^' ) )
            // InternalMSat.g:1845:1: ( '^' )
            {
            // InternalMSat.g:1845:1: ( '^' )
            // InternalMSat.g:1846:2: '^'
            {
             before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMSat.g:1855:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1859:1: ( rule__And__Group_1__2__Impl )
            // InternalMSat.g:1860:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMSat.g:1866:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1870:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1871:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1871:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMSat.g:1872:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1873:2: ( rule__And__RightAssignment_1_2 )
            // InternalMSat.g:1873:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Nand__Group__0"
    // InternalMSat.g:1882:1: rule__Nand__Group__0 : rule__Nand__Group__0__Impl rule__Nand__Group__1 ;
    public final void rule__Nand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1886:1: ( rule__Nand__Group__0__Impl rule__Nand__Group__1 )
            // InternalMSat.g:1887:2: rule__Nand__Group__0__Impl rule__Nand__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Nand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__0"


    // $ANTLR start "rule__Nand__Group__0__Impl"
    // InternalMSat.g:1894:1: rule__Nand__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Nand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1898:1: ( ( rulePrimary ) )
            // InternalMSat.g:1899:1: ( rulePrimary )
            {
            // InternalMSat.g:1899:1: ( rulePrimary )
            // InternalMSat.g:1900:2: rulePrimary
            {
             before(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__0__Impl"


    // $ANTLR start "rule__Nand__Group__1"
    // InternalMSat.g:1909:1: rule__Nand__Group__1 : rule__Nand__Group__1__Impl ;
    public final void rule__Nand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1913:1: ( rule__Nand__Group__1__Impl )
            // InternalMSat.g:1914:2: rule__Nand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__1"


    // $ANTLR start "rule__Nand__Group__1__Impl"
    // InternalMSat.g:1920:1: rule__Nand__Group__1__Impl : ( ( rule__Nand__Group_1__0 )* ) ;
    public final void rule__Nand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1924:1: ( ( ( rule__Nand__Group_1__0 )* ) )
            // InternalMSat.g:1925:1: ( ( rule__Nand__Group_1__0 )* )
            {
            // InternalMSat.g:1925:1: ( ( rule__Nand__Group_1__0 )* )
            // InternalMSat.g:1926:2: ( rule__Nand__Group_1__0 )*
            {
             before(grammarAccess.getNandAccess().getGroup_1()); 
            // InternalMSat.g:1927:2: ( rule__Nand__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSat.g:1927:3: rule__Nand__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Nand__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNandAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__1__Impl"


    // $ANTLR start "rule__Nand__Group_1__0"
    // InternalMSat.g:1936:1: rule__Nand__Group_1__0 : rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 ;
    public final void rule__Nand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1940:1: ( rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 )
            // InternalMSat.g:1941:2: rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Nand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__0"


    // $ANTLR start "rule__Nand__Group_1__0__Impl"
    // InternalMSat.g:1948:1: rule__Nand__Group_1__0__Impl : ( () ) ;
    public final void rule__Nand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1952:1: ( ( () ) )
            // InternalMSat.g:1953:1: ( () )
            {
            // InternalMSat.g:1953:1: ( () )
            // InternalMSat.g:1954:2: ()
            {
             before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 
            // InternalMSat.g:1955:2: ()
            // InternalMSat.g:1955:3: 
            {
            }

             after(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__0__Impl"


    // $ANTLR start "rule__Nand__Group_1__1"
    // InternalMSat.g:1963:1: rule__Nand__Group_1__1 : rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 ;
    public final void rule__Nand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1967:1: ( rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 )
            // InternalMSat.g:1968:2: rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Nand__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__1"


    // $ANTLR start "rule__Nand__Group_1__1__Impl"
    // InternalMSat.g:1975:1: rule__Nand__Group_1__1__Impl : ( ( rule__Nand__Alternatives_1_1 ) ) ;
    public final void rule__Nand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1979:1: ( ( ( rule__Nand__Alternatives_1_1 ) ) )
            // InternalMSat.g:1980:1: ( ( rule__Nand__Alternatives_1_1 ) )
            {
            // InternalMSat.g:1980:1: ( ( rule__Nand__Alternatives_1_1 ) )
            // InternalMSat.g:1981:2: ( rule__Nand__Alternatives_1_1 )
            {
             before(grammarAccess.getNandAccess().getAlternatives_1_1()); 
            // InternalMSat.g:1982:2: ( rule__Nand__Alternatives_1_1 )
            // InternalMSat.g:1982:3: rule__Nand__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__1__Impl"


    // $ANTLR start "rule__Nand__Group_1__2"
    // InternalMSat.g:1990:1: rule__Nand__Group_1__2 : rule__Nand__Group_1__2__Impl ;
    public final void rule__Nand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1994:1: ( rule__Nand__Group_1__2__Impl )
            // InternalMSat.g:1995:2: rule__Nand__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__2"


    // $ANTLR start "rule__Nand__Group_1__2__Impl"
    // InternalMSat.g:2001:1: rule__Nand__Group_1__2__Impl : ( ( rule__Nand__RightAssignment_1_2 ) ) ;
    public final void rule__Nand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2005:1: ( ( ( rule__Nand__RightAssignment_1_2 ) ) )
            // InternalMSat.g:2006:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:2006:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            // InternalMSat.g:2007:2: ( rule__Nand__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:2008:2: ( rule__Nand__RightAssignment_1_2 )
            // InternalMSat.g:2008:3: rule__Nand__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Nand__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMSat.g:2017:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2021:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMSat.g:2022:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMSat.g:2029:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2033:1: ( ( '(' ) )
            // InternalMSat.g:2034:1: ( '(' )
            {
            // InternalMSat.g:2034:1: ( '(' )
            // InternalMSat.g:2035:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMSat.g:2044:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2048:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMSat.g:2049:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMSat.g:2056:1: rule__Primary__Group_0__1__Impl : ( ruleBiImpl ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2060:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:2061:1: ( ruleBiImpl )
            {
            // InternalMSat.g:2061:1: ( ruleBiImpl )
            // InternalMSat.g:2062:2: ruleBiImpl
            {
             before(grammarAccess.getPrimaryAccess().getBiImplParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getBiImplParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMSat.g:2071:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2075:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMSat.g:2076:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMSat.g:2082:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2086:1: ( ( ')' ) )
            // InternalMSat.g:2087:1: ( ')' )
            {
            // InternalMSat.g:2087:1: ( ')' )
            // InternalMSat.g:2088:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalMSat.g:2098:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2102:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMSat.g:2103:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Not__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // InternalMSat.g:2110:1: rule__Not__Group__0__Impl : ( ( rule__Not__Alternatives_0 ) ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2114:1: ( ( ( rule__Not__Alternatives_0 ) ) )
            // InternalMSat.g:2115:1: ( ( rule__Not__Alternatives_0 ) )
            {
            // InternalMSat.g:2115:1: ( ( rule__Not__Alternatives_0 ) )
            // InternalMSat.g:2116:2: ( rule__Not__Alternatives_0 )
            {
             before(grammarAccess.getNotAccess().getAlternatives_0()); 
            // InternalMSat.g:2117:2: ( rule__Not__Alternatives_0 )
            // InternalMSat.g:2117:3: rule__Not__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // InternalMSat.g:2125:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2129:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalMSat.g:2130:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FOLLOW_1);
            rule__Not__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // InternalMSat.g:2137:1: rule__Not__Group__1__Impl : ( rulePrimary ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2141:1: ( ( rulePrimary ) )
            // InternalMSat.g:2142:1: ( rulePrimary )
            {
            // InternalMSat.g:2142:1: ( rulePrimary )
            // InternalMSat.g:2143:2: rulePrimary
            {
             before(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group__2"
    // InternalMSat.g:2152:1: rule__Not__Group__2 : rule__Not__Group__2__Impl ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2156:1: ( rule__Not__Group__2__Impl )
            // InternalMSat.g:2157:2: rule__Not__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2"


    // $ANTLR start "rule__Not__Group__2__Impl"
    // InternalMSat.g:2163:1: rule__Not__Group__2__Impl : ( () ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2167:1: ( ( () ) )
            // InternalMSat.g:2168:1: ( () )
            {
            // InternalMSat.g:2168:1: ( () )
            // InternalMSat.g:2169:2: ()
            {
             before(grammarAccess.getNotAccess().getNotExpressionAction_2()); 
            // InternalMSat.g:2170:2: ()
            // InternalMSat.g:2170:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotExpressionAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2__Impl"


    // $ANTLR start "rule__SATMorphic__SolversAssignment_1"
    // InternalMSat.g:2179:1: rule__SATMorphic__SolversAssignment_1 : ( ruleSATSolver ) ;
    public final void rule__SATMorphic__SolversAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2183:1: ( ( ruleSATSolver ) )
            // InternalMSat.g:2184:2: ( ruleSATSolver )
            {
            // InternalMSat.g:2184:2: ( ruleSATSolver )
            // InternalMSat.g:2185:3: ruleSATSolver
            {
             before(grammarAccess.getSATMorphicAccess().getSolversSATSolverParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSATSolver();

            state._fsp--;

             after(grammarAccess.getSATMorphicAccess().getSolversSATSolverParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__SolversAssignment_1"


    // $ANTLR start "rule__SATMorphic__BenchmarkAssignment_2"
    // InternalMSat.g:2194:1: rule__SATMorphic__BenchmarkAssignment_2 : ( ruleBenchmark ) ;
    public final void rule__SATMorphic__BenchmarkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2198:1: ( ( ruleBenchmark ) )
            // InternalMSat.g:2199:2: ( ruleBenchmark )
            {
            // InternalMSat.g:2199:2: ( ruleBenchmark )
            // InternalMSat.g:2200:3: ruleBenchmark
            {
             before(grammarAccess.getSATMorphicAccess().getBenchmarkBenchmarkParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBenchmark();

            state._fsp--;

             after(grammarAccess.getSATMorphicAccess().getBenchmarkBenchmarkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATMorphic__BenchmarkAssignment_2"


    // $ANTLR start "rule__SATSolver__SolverAssignment_0"
    // InternalMSat.g:2209:1: rule__SATSolver__SolverAssignment_0 : ( ( rule__SATSolver__SolverAlternatives_0_0 ) ) ;
    public final void rule__SATSolver__SolverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2213:1: ( ( ( rule__SATSolver__SolverAlternatives_0_0 ) ) )
            // InternalMSat.g:2214:2: ( ( rule__SATSolver__SolverAlternatives_0_0 ) )
            {
            // InternalMSat.g:2214:2: ( ( rule__SATSolver__SolverAlternatives_0_0 ) )
            // InternalMSat.g:2215:3: ( rule__SATSolver__SolverAlternatives_0_0 )
            {
             before(grammarAccess.getSATSolverAccess().getSolverAlternatives_0_0()); 
            // InternalMSat.g:2216:3: ( rule__SATSolver__SolverAlternatives_0_0 )
            // InternalMSat.g:2216:4: rule__SATSolver__SolverAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SATSolver__SolverAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSATSolverAccess().getSolverAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__SolverAssignment_0"


    // $ANTLR start "rule__SATSolver__VersionAssignment_1"
    // InternalMSat.g:2224:1: rule__SATSolver__VersionAssignment_1 : ( ruleSolverVersion ) ;
    public final void rule__SATSolver__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2228:1: ( ( ruleSolverVersion ) )
            // InternalMSat.g:2229:2: ( ruleSolverVersion )
            {
            // InternalMSat.g:2229:2: ( ruleSolverVersion )
            // InternalMSat.g:2230:3: ruleSolverVersion
            {
             before(grammarAccess.getSATSolverAccess().getVersionSolverVersionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSolverVersion();

            state._fsp--;

             after(grammarAccess.getSATSolverAccess().getVersionSolverVersionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolver__VersionAssignment_1"


    // $ANTLR start "rule__Sat4J__VariantAssignment"
    // InternalMSat.g:2239:1: rule__Sat4J__VariantAssignment : ( ruleSat4JVariant ) ;
    public final void rule__Sat4J__VariantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2243:1: ( ( ruleSat4JVariant ) )
            // InternalMSat.g:2244:2: ( ruleSat4JVariant )
            {
            // InternalMSat.g:2244:2: ( ruleSat4JVariant )
            // InternalMSat.g:2245:3: ruleSat4JVariant
            {
             before(grammarAccess.getSat4JAccess().getVariantSat4JVariantEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSat4JVariant();

            state._fsp--;

             after(grammarAccess.getSat4JAccess().getVariantSat4JVariantEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat4J__VariantAssignment"


    // $ANTLR start "rule__SolverVersion__VersionAssignment_1"
    // InternalMSat.g:2254:1: rule__SolverVersion__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SolverVersion__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2258:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2259:2: ( RULE_STRING )
            {
            // InternalMSat.g:2259:2: ( RULE_STRING )
            // InternalMSat.g:2260:3: RULE_STRING
            {
             before(grammarAccess.getSolverVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSolverVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolverVersion__VersionAssignment_1"


    // $ANTLR start "rule__MiniSAT__VariantAssignment_0"
    // InternalMSat.g:2269:1: rule__MiniSAT__VariantAssignment_0 : ( ( 'minisat' ) ) ;
    public final void rule__MiniSAT__VariantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2273:1: ( ( ( 'minisat' ) ) )
            // InternalMSat.g:2274:2: ( ( 'minisat' ) )
            {
            // InternalMSat.g:2274:2: ( ( 'minisat' ) )
            // InternalMSat.g:2275:3: ( 'minisat' )
            {
             before(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0_0()); 
            // InternalMSat.g:2276:3: ( 'minisat' )
            // InternalMSat.g:2277:4: 'minisat'
            {
             before(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0_0()); 

            }

             after(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__VariantAssignment_0"


    // $ANTLR start "rule__MiniSAT__ParameterAssignment_1"
    // InternalMSat.g:2288:1: rule__MiniSAT__ParameterAssignment_1 : ( ruleMiniSATParameter ) ;
    public final void rule__MiniSAT__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2292:1: ( ( ruleMiniSATParameter ) )
            // InternalMSat.g:2293:2: ( ruleMiniSATParameter )
            {
            // InternalMSat.g:2293:2: ( ruleMiniSATParameter )
            // InternalMSat.g:2294:3: ruleMiniSATParameter
            {
             before(grammarAccess.getMiniSATAccess().getParameterMiniSATParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMiniSATParameter();

            state._fsp--;

             after(grammarAccess.getMiniSATAccess().getParameterMiniSATParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSAT__ParameterAssignment_1"


    // $ANTLR start "rule__CryptoMiniSAT__VariantAssignment"
    // InternalMSat.g:2303:1: rule__CryptoMiniSAT__VariantAssignment : ( ( 'cryptominisat' ) ) ;
    public final void rule__CryptoMiniSAT__VariantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2307:1: ( ( ( 'cryptominisat' ) ) )
            // InternalMSat.g:2308:2: ( ( 'cryptominisat' ) )
            {
            // InternalMSat.g:2308:2: ( ( 'cryptominisat' ) )
            // InternalMSat.g:2309:3: ( 'cryptominisat' )
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 
            // InternalMSat.g:2310:3: ( 'cryptominisat' )
            // InternalMSat.g:2311:4: 'cryptominisat'
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 

            }

             after(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CryptoMiniSAT__VariantAssignment"


    // $ANTLR start "rule__MiniSATParameter__RndfreqAssignment_1"
    // InternalMSat.g:2322:1: rule__MiniSATParameter__RndfreqAssignment_1 : ( RULE_PROBA ) ;
    public final void rule__MiniSATParameter__RndfreqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2326:1: ( ( RULE_PROBA ) )
            // InternalMSat.g:2327:2: ( RULE_PROBA )
            {
            // InternalMSat.g:2327:2: ( RULE_PROBA )
            // InternalMSat.g:2328:3: RULE_PROBA
            {
             before(grammarAccess.getMiniSATParameterAccess().getRndfreqPROBATerminalRuleCall_1_0()); 
            match(input,RULE_PROBA,FOLLOW_2); 
             after(grammarAccess.getMiniSATParameterAccess().getRndfreqPROBATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniSATParameter__RndfreqAssignment_1"


    // $ANTLR start "rule__BenchmarkDimacs__DimacsesAssignment_1_0"
    // InternalMSat.g:2337:1: rule__BenchmarkDimacs__DimacsesAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__BenchmarkDimacs__DimacsesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2341:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2342:2: ( RULE_STRING )
            {
            // InternalMSat.g:2342:2: ( RULE_STRING )
            // InternalMSat.g:2343:3: RULE_STRING
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__DimacsesAssignment_1_0"


    // $ANTLR start "rule__BenchmarkDimacs__DimacsesAssignment_1_1_1"
    // InternalMSat.g:2352:1: rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__BenchmarkDimacs__DimacsesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2356:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2357:2: ( RULE_STRING )
            {
            // InternalMSat.g:2357:2: ( RULE_STRING )
            // InternalMSat.g:2358:3: RULE_STRING
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBenchmarkDimacsAccess().getDimacsesSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkDimacs__DimacsesAssignment_1_1_1"


    // $ANTLR start "rule__BenchmarkFormula__ExpressionsAssignment_1_0"
    // InternalMSat.g:2367:1: rule__BenchmarkFormula__ExpressionsAssignment_1_0 : ( ruleBiImpl ) ;
    public final void rule__BenchmarkFormula__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2371:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:2372:2: ( ruleBiImpl )
            {
            // InternalMSat.g:2372:2: ( ruleBiImpl )
            // InternalMSat.g:2373:3: ruleBiImpl
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__BenchmarkFormula__ExpressionsAssignment_1_1_1"
    // InternalMSat.g:2382:1: rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 : ( ruleBiImpl ) ;
    public final void rule__BenchmarkFormula__ExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2386:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:2387:2: ( ruleBiImpl )
            {
            // InternalMSat.g:2387:2: ( ruleBiImpl )
            // InternalMSat.g:2388:3: ruleBiImpl
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getBenchmarkFormulaAccess().getExpressionsBiImplParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BenchmarkFormula__ExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__BiImpl__RightAssignment_1_2"
    // InternalMSat.g:2397:1: rule__BiImpl__RightAssignment_1_2 : ( ruleImpl ) ;
    public final void rule__BiImpl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2401:1: ( ( ruleImpl ) )
            // InternalMSat.g:2402:2: ( ruleImpl )
            {
            // InternalMSat.g:2402:2: ( ruleImpl )
            // InternalMSat.g:2403:3: ruleImpl
            {
             before(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__RightAssignment_1_2"


    // $ANTLR start "rule__Impl__RightAssignment_1_2"
    // InternalMSat.g:2412:1: rule__Impl__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Impl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2416:1: ( ( ruleOr ) )
            // InternalMSat.g:2417:2: ( ruleOr )
            {
            // InternalMSat.g:2417:2: ( ruleOr )
            // InternalMSat.g:2418:3: ruleOr
            {
             before(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__RightAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMSat.g:2427:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2431:1: ( ( ruleAnd ) )
            // InternalMSat.g:2432:2: ( ruleAnd )
            {
            // InternalMSat.g:2432:2: ( ruleAnd )
            // InternalMSat.g:2433:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMSat.g:2442:1: rule__And__RightAssignment_1_2 : ( ruleNand ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2446:1: ( ( ruleNand ) )
            // InternalMSat.g:2447:2: ( ruleNand )
            {
            // InternalMSat.g:2447:2: ( ruleNand )
            // InternalMSat.g:2448:3: ruleNand
            {
             before(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Nand__RightAssignment_1_2"
    // InternalMSat.g:2457:1: rule__Nand__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Nand__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2461:1: ( ( rulePrimary ) )
            // InternalMSat.g:2462:2: ( rulePrimary )
            {
            // InternalMSat.g:2462:2: ( rulePrimary )
            // InternalMSat.g:2463:3: rulePrimary
            {
             before(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__RightAssignment_1_2"


    // $ANTLR start "rule__Var__IdAssignment"
    // InternalMSat.g:2472:1: rule__Var__IdAssignment : ( RULE_ID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2476:1: ( ( RULE_ID ) )
            // InternalMSat.g:2477:2: ( RULE_ID )
            {
            // InternalMSat.g:2477:2: ( RULE_ID )
            // InternalMSat.g:2478:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__IdAssignment"


    // $ANTLR start "rule__Const__ValAssignment"
    // InternalMSat.g:2487:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2491:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalMSat.g:2492:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalMSat.g:2492:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalMSat.g:2493:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalMSat.g:2494:3: ( rule__Const__ValAlternatives_0 )
            // InternalMSat.g:2494:4: rule__Const__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000006001C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000006001C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000008003C040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}