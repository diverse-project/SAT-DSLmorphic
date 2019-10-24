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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'\\u2191'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'", "'solver'", "'benchmark-DIMACS'", "','", "'benchmark-formula'", "'<=>'", "'=>'", "'v'", "'^'", "'('", "')'", "'minisat'", "'cryptominisat'"
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


    // $ANTLR start "entryRuleMiniSAT"
    // InternalMSat.g:128:1: entryRuleMiniSAT : ruleMiniSAT EOF ;
    public final void entryRuleMiniSAT() throws RecognitionException {
        try {
            // InternalMSat.g:129:1: ( ruleMiniSAT EOF )
            // InternalMSat.g:130:1: ruleMiniSAT EOF
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
    // InternalMSat.g:137:1: ruleMiniSAT : ( ( rule__MiniSAT__VariantAssignment ) ) ;
    public final void ruleMiniSAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:141:2: ( ( ( rule__MiniSAT__VariantAssignment ) ) )
            // InternalMSat.g:142:2: ( ( rule__MiniSAT__VariantAssignment ) )
            {
            // InternalMSat.g:142:2: ( ( rule__MiniSAT__VariantAssignment ) )
            // InternalMSat.g:143:3: ( rule__MiniSAT__VariantAssignment )
            {
             before(grammarAccess.getMiniSATAccess().getVariantAssignment()); 
            // InternalMSat.g:144:3: ( rule__MiniSAT__VariantAssignment )
            // InternalMSat.g:144:4: rule__MiniSAT__VariantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MiniSAT__VariantAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMiniSATAccess().getVariantAssignment()); 

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
    // InternalMSat.g:153:1: entryRuleCryptoMiniSAT : ruleCryptoMiniSAT EOF ;
    public final void entryRuleCryptoMiniSAT() throws RecognitionException {
        try {
            // InternalMSat.g:154:1: ( ruleCryptoMiniSAT EOF )
            // InternalMSat.g:155:1: ruleCryptoMiniSAT EOF
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
    // InternalMSat.g:162:1: ruleCryptoMiniSAT : ( ( rule__CryptoMiniSAT__VariantAssignment ) ) ;
    public final void ruleCryptoMiniSAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:166:2: ( ( ( rule__CryptoMiniSAT__VariantAssignment ) ) )
            // InternalMSat.g:167:2: ( ( rule__CryptoMiniSAT__VariantAssignment ) )
            {
            // InternalMSat.g:167:2: ( ( rule__CryptoMiniSAT__VariantAssignment ) )
            // InternalMSat.g:168:3: ( rule__CryptoMiniSAT__VariantAssignment )
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantAssignment()); 
            // InternalMSat.g:169:3: ( rule__CryptoMiniSAT__VariantAssignment )
            // InternalMSat.g:169:4: rule__CryptoMiniSAT__VariantAssignment
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


    // $ANTLR start "entryRuleBenchmark"
    // InternalMSat.g:178:1: entryRuleBenchmark : ruleBenchmark EOF ;
    public final void entryRuleBenchmark() throws RecognitionException {
        try {
            // InternalMSat.g:179:1: ( ruleBenchmark EOF )
            // InternalMSat.g:180:1: ruleBenchmark EOF
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
    // InternalMSat.g:187:1: ruleBenchmark : ( ( rule__Benchmark__Alternatives ) ) ;
    public final void ruleBenchmark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:191:2: ( ( ( rule__Benchmark__Alternatives ) ) )
            // InternalMSat.g:192:2: ( ( rule__Benchmark__Alternatives ) )
            {
            // InternalMSat.g:192:2: ( ( rule__Benchmark__Alternatives ) )
            // InternalMSat.g:193:3: ( rule__Benchmark__Alternatives )
            {
             before(grammarAccess.getBenchmarkAccess().getAlternatives()); 
            // InternalMSat.g:194:3: ( rule__Benchmark__Alternatives )
            // InternalMSat.g:194:4: rule__Benchmark__Alternatives
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
    // InternalMSat.g:203:1: entryRuleBenchmarkDimacs : ruleBenchmarkDimacs EOF ;
    public final void entryRuleBenchmarkDimacs() throws RecognitionException {
        try {
            // InternalMSat.g:204:1: ( ruleBenchmarkDimacs EOF )
            // InternalMSat.g:205:1: ruleBenchmarkDimacs EOF
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
    // InternalMSat.g:212:1: ruleBenchmarkDimacs : ( ( rule__BenchmarkDimacs__Group__0 ) ) ;
    public final void ruleBenchmarkDimacs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:216:2: ( ( ( rule__BenchmarkDimacs__Group__0 ) ) )
            // InternalMSat.g:217:2: ( ( rule__BenchmarkDimacs__Group__0 ) )
            {
            // InternalMSat.g:217:2: ( ( rule__BenchmarkDimacs__Group__0 ) )
            // InternalMSat.g:218:3: ( rule__BenchmarkDimacs__Group__0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup()); 
            // InternalMSat.g:219:3: ( rule__BenchmarkDimacs__Group__0 )
            // InternalMSat.g:219:4: rule__BenchmarkDimacs__Group__0
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
    // InternalMSat.g:228:1: entryRuleBenchmarkFormula : ruleBenchmarkFormula EOF ;
    public final void entryRuleBenchmarkFormula() throws RecognitionException {
        try {
            // InternalMSat.g:229:1: ( ruleBenchmarkFormula EOF )
            // InternalMSat.g:230:1: ruleBenchmarkFormula EOF
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
    // InternalMSat.g:237:1: ruleBenchmarkFormula : ( ( rule__BenchmarkFormula__Group__0 ) ) ;
    public final void ruleBenchmarkFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:241:2: ( ( ( rule__BenchmarkFormula__Group__0 ) ) )
            // InternalMSat.g:242:2: ( ( rule__BenchmarkFormula__Group__0 ) )
            {
            // InternalMSat.g:242:2: ( ( rule__BenchmarkFormula__Group__0 ) )
            // InternalMSat.g:243:3: ( rule__BenchmarkFormula__Group__0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup()); 
            // InternalMSat.g:244:3: ( rule__BenchmarkFormula__Group__0 )
            // InternalMSat.g:244:4: rule__BenchmarkFormula__Group__0
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
    // InternalMSat.g:253:1: entryRuleBiImpl : ruleBiImpl EOF ;
    public final void entryRuleBiImpl() throws RecognitionException {
        try {
            // InternalMSat.g:254:1: ( ruleBiImpl EOF )
            // InternalMSat.g:255:1: ruleBiImpl EOF
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
    // InternalMSat.g:262:1: ruleBiImpl : ( ( rule__BiImpl__Group__0 ) ) ;
    public final void ruleBiImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:266:2: ( ( ( rule__BiImpl__Group__0 ) ) )
            // InternalMSat.g:267:2: ( ( rule__BiImpl__Group__0 ) )
            {
            // InternalMSat.g:267:2: ( ( rule__BiImpl__Group__0 ) )
            // InternalMSat.g:268:3: ( rule__BiImpl__Group__0 )
            {
             before(grammarAccess.getBiImplAccess().getGroup()); 
            // InternalMSat.g:269:3: ( rule__BiImpl__Group__0 )
            // InternalMSat.g:269:4: rule__BiImpl__Group__0
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
    // InternalMSat.g:278:1: entryRuleImpl : ruleImpl EOF ;
    public final void entryRuleImpl() throws RecognitionException {
        try {
            // InternalMSat.g:279:1: ( ruleImpl EOF )
            // InternalMSat.g:280:1: ruleImpl EOF
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
    // InternalMSat.g:287:1: ruleImpl : ( ( rule__Impl__Group__0 ) ) ;
    public final void ruleImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:291:2: ( ( ( rule__Impl__Group__0 ) ) )
            // InternalMSat.g:292:2: ( ( rule__Impl__Group__0 ) )
            {
            // InternalMSat.g:292:2: ( ( rule__Impl__Group__0 ) )
            // InternalMSat.g:293:3: ( rule__Impl__Group__0 )
            {
             before(grammarAccess.getImplAccess().getGroup()); 
            // InternalMSat.g:294:3: ( rule__Impl__Group__0 )
            // InternalMSat.g:294:4: rule__Impl__Group__0
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
    // InternalMSat.g:303:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMSat.g:304:1: ( ruleOr EOF )
            // InternalMSat.g:305:1: ruleOr EOF
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
    // InternalMSat.g:312:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:316:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMSat.g:317:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMSat.g:317:2: ( ( rule__Or__Group__0 ) )
            // InternalMSat.g:318:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalMSat.g:319:3: ( rule__Or__Group__0 )
            // InternalMSat.g:319:4: rule__Or__Group__0
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
    // InternalMSat.g:328:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMSat.g:329:1: ( ruleAnd EOF )
            // InternalMSat.g:330:1: ruleAnd EOF
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
    // InternalMSat.g:337:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:341:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMSat.g:342:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMSat.g:342:2: ( ( rule__And__Group__0 ) )
            // InternalMSat.g:343:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMSat.g:344:3: ( rule__And__Group__0 )
            // InternalMSat.g:344:4: rule__And__Group__0
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
    // InternalMSat.g:353:1: entryRuleNand : ruleNand EOF ;
    public final void entryRuleNand() throws RecognitionException {
        try {
            // InternalMSat.g:354:1: ( ruleNand EOF )
            // InternalMSat.g:355:1: ruleNand EOF
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
    // InternalMSat.g:362:1: ruleNand : ( ( rule__Nand__Group__0 ) ) ;
    public final void ruleNand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:366:2: ( ( ( rule__Nand__Group__0 ) ) )
            // InternalMSat.g:367:2: ( ( rule__Nand__Group__0 ) )
            {
            // InternalMSat.g:367:2: ( ( rule__Nand__Group__0 ) )
            // InternalMSat.g:368:3: ( rule__Nand__Group__0 )
            {
             before(grammarAccess.getNandAccess().getGroup()); 
            // InternalMSat.g:369:3: ( rule__Nand__Group__0 )
            // InternalMSat.g:369:4: rule__Nand__Group__0
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
    // InternalMSat.g:378:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMSat.g:379:1: ( rulePrimary EOF )
            // InternalMSat.g:380:1: rulePrimary EOF
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
    // InternalMSat.g:387:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:391:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMSat.g:392:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMSat.g:392:2: ( ( rule__Primary__Alternatives ) )
            // InternalMSat.g:393:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMSat.g:394:3: ( rule__Primary__Alternatives )
            // InternalMSat.g:394:4: rule__Primary__Alternatives
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
    // InternalMSat.g:403:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMSat.g:404:1: ( ruleNot EOF )
            // InternalMSat.g:405:1: ruleNot EOF
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
    // InternalMSat.g:412:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:416:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMSat.g:417:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMSat.g:417:2: ( ( rule__Not__Group__0 ) )
            // InternalMSat.g:418:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMSat.g:419:3: ( rule__Not__Group__0 )
            // InternalMSat.g:419:4: rule__Not__Group__0
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
    // InternalMSat.g:428:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMSat.g:429:1: ( ruleVar EOF )
            // InternalMSat.g:430:1: ruleVar EOF
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
    // InternalMSat.g:437:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:441:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalMSat.g:442:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalMSat.g:442:2: ( ( rule__Var__IdAssignment ) )
            // InternalMSat.g:443:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalMSat.g:444:3: ( rule__Var__IdAssignment )
            // InternalMSat.g:444:4: rule__Var__IdAssignment
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
    // InternalMSat.g:453:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalMSat.g:454:1: ( ruleConst EOF )
            // InternalMSat.g:455:1: ruleConst EOF
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
    // InternalMSat.g:462:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:466:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalMSat.g:467:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalMSat.g:467:2: ( ( rule__Const__ValAssignment ) )
            // InternalMSat.g:468:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalMSat.g:469:3: ( rule__Const__ValAssignment )
            // InternalMSat.g:469:4: rule__Const__ValAssignment
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
    // InternalMSat.g:478:1: ruleSat4JVariant : ( ( rule__Sat4JVariant__Alternatives ) ) ;
    public final void ruleSat4JVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:482:1: ( ( ( rule__Sat4JVariant__Alternatives ) ) )
            // InternalMSat.g:483:2: ( ( rule__Sat4JVariant__Alternatives ) )
            {
            // InternalMSat.g:483:2: ( ( rule__Sat4JVariant__Alternatives ) )
            // InternalMSat.g:484:3: ( rule__Sat4JVariant__Alternatives )
            {
             before(grammarAccess.getSat4JVariantAccess().getAlternatives()); 
            // InternalMSat.g:485:3: ( rule__Sat4JVariant__Alternatives )
            // InternalMSat.g:485:4: rule__Sat4JVariant__Alternatives
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
    // InternalMSat.g:493:1: rule__SATSolver__SolverAlternatives_0_0 : ( ( ruleSat4J ) | ( ruleCryptoMiniSAT ) | ( ruleMiniSAT ) );
    public final void rule__SATSolver__SolverAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:497:1: ( ( ruleSat4J ) | ( ruleCryptoMiniSAT ) | ( ruleMiniSAT ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 30:
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
                    // InternalMSat.g:498:2: ( ruleSat4J )
                    {
                    // InternalMSat.g:498:2: ( ruleSat4J )
                    // InternalMSat.g:499:3: ruleSat4J
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
                    // InternalMSat.g:504:2: ( ruleCryptoMiniSAT )
                    {
                    // InternalMSat.g:504:2: ( ruleCryptoMiniSAT )
                    // InternalMSat.g:505:3: ruleCryptoMiniSAT
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
                    // InternalMSat.g:510:2: ( ruleMiniSAT )
                    {
                    // InternalMSat.g:510:2: ( ruleMiniSAT )
                    // InternalMSat.g:511:3: ruleMiniSAT
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
    // InternalMSat.g:520:1: rule__Benchmark__Alternatives : ( ( ruleBenchmarkDimacs ) | ( ruleBenchmarkFormula ) );
    public final void rule__Benchmark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:524:1: ( ( ruleBenchmarkDimacs ) | ( ruleBenchmarkFormula ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSat.g:525:2: ( ruleBenchmarkDimacs )
                    {
                    // InternalMSat.g:525:2: ( ruleBenchmarkDimacs )
                    // InternalMSat.g:526:3: ruleBenchmarkDimacs
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
                    // InternalMSat.g:531:2: ( ruleBenchmarkFormula )
                    {
                    // InternalMSat.g:531:2: ( ruleBenchmarkFormula )
                    // InternalMSat.g:532:3: ruleBenchmarkFormula
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
    // InternalMSat.g:541:1: rule__Nand__Alternatives_1_1 : ( ( '|' ) | ( '\\u2191' ) );
    public final void rule__Nand__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:545:1: ( ( '|' ) | ( '\\u2191' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSat.g:546:2: ( '|' )
                    {
                    // InternalMSat.g:546:2: ( '|' )
                    // InternalMSat.g:547:3: '|'
                    {
                     before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:552:2: ( '\\u2191' )
                    {
                    // InternalMSat.g:552:2: ( '\\u2191' )
                    // InternalMSat.g:553:3: '\\u2191'
                    {
                     before(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalMSat.g:562:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:566:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
            case 16:
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
                    // InternalMSat.g:567:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMSat.g:567:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMSat.g:568:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMSat.g:569:3: ( rule__Primary__Group_0__0 )
                    // InternalMSat.g:569:4: rule__Primary__Group_0__0
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
                    // InternalMSat.g:573:2: ( ruleNot )
                    {
                    // InternalMSat.g:573:2: ( ruleNot )
                    // InternalMSat.g:574:3: ruleNot
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
                    // InternalMSat.g:579:2: ( ruleConst )
                    {
                    // InternalMSat.g:579:2: ( ruleConst )
                    // InternalMSat.g:580:3: ruleConst
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
                    // InternalMSat.g:585:2: ( ruleVar )
                    {
                    // InternalMSat.g:585:2: ( ruleVar )
                    // InternalMSat.g:586:3: ruleVar
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
    // InternalMSat.g:595:1: rule__Not__Alternatives_0 : ( ( '!' ) | ( '~' ) );
    public final void rule__Not__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:599:1: ( ( '!' ) | ( '~' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSat.g:600:2: ( '!' )
                    {
                    // InternalMSat.g:600:2: ( '!' )
                    // InternalMSat.g:601:3: '!'
                    {
                     before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:606:2: ( '~' )
                    {
                    // InternalMSat.g:606:2: ( '~' )
                    // InternalMSat.g:607:3: '~'
                    {
                     before(grammarAccess.getNotAccess().getTildeKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalMSat.g:616:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:620:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSat.g:621:2: ( 'true' )
                    {
                    // InternalMSat.g:621:2: ( 'true' )
                    // InternalMSat.g:622:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:627:2: ( 'false' )
                    {
                    // InternalMSat.g:627:2: ( 'false' )
                    // InternalMSat.g:628:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalMSat.g:637:1: rule__Sat4JVariant__Alternatives : ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) );
    public final void rule__Sat4JVariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:641:1: ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
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
                    // InternalMSat.g:642:2: ( ( 'sat4j-java' ) )
                    {
                    // InternalMSat.g:642:2: ( ( 'sat4j-java' ) )
                    // InternalMSat.g:643:3: ( 'sat4j-java' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 
                    // InternalMSat.g:644:3: ( 'sat4j-java' )
                    // InternalMSat.g:644:4: 'sat4j-java'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSat4JVariantAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSat.g:648:2: ( ( 'sat4j-jar' ) )
                    {
                    // InternalMSat.g:648:2: ( ( 'sat4j-jar' ) )
                    // InternalMSat.g:649:3: ( 'sat4j-jar' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 
                    // InternalMSat.g:650:3: ( 'sat4j-jar' )
                    // InternalMSat.g:650:4: 'sat4j-jar'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSat4JVariantAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSat.g:654:2: ( ( 'sat4j-maven' ) )
                    {
                    // InternalMSat.g:654:2: ( ( 'sat4j-maven' ) )
                    // InternalMSat.g:655:3: ( 'sat4j-maven' )
                    {
                     before(grammarAccess.getSat4JVariantAccess().getSAT4J_COMPEnumLiteralDeclaration_2()); 
                    // InternalMSat.g:656:3: ( 'sat4j-maven' )
                    // InternalMSat.g:656:4: 'sat4j-maven'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMSat.g:664:1: rule__SATMorphic__Group__0 : rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1 ;
    public final void rule__SATMorphic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:668:1: ( rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1 )
            // InternalMSat.g:669:2: rule__SATMorphic__Group__0__Impl rule__SATMorphic__Group__1
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
    // InternalMSat.g:676:1: rule__SATMorphic__Group__0__Impl : ( 'solver' ) ;
    public final void rule__SATMorphic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:680:1: ( ( 'solver' ) )
            // InternalMSat.g:681:1: ( 'solver' )
            {
            // InternalMSat.g:681:1: ( 'solver' )
            // InternalMSat.g:682:2: 'solver'
            {
             before(grammarAccess.getSATMorphicAccess().getSolverKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMSat.g:691:1: rule__SATMorphic__Group__1 : rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2 ;
    public final void rule__SATMorphic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:695:1: ( rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2 )
            // InternalMSat.g:696:2: rule__SATMorphic__Group__1__Impl rule__SATMorphic__Group__2
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
    // InternalMSat.g:703:1: rule__SATMorphic__Group__1__Impl : ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) ) ;
    public final void rule__SATMorphic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:707:1: ( ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) ) )
            // InternalMSat.g:708:1: ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) )
            {
            // InternalMSat.g:708:1: ( ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* ) )
            // InternalMSat.g:709:2: ( ( rule__SATMorphic__SolversAssignment_1 ) ) ( ( rule__SATMorphic__SolversAssignment_1 )* )
            {
            // InternalMSat.g:709:2: ( ( rule__SATMorphic__SolversAssignment_1 ) )
            // InternalMSat.g:710:3: ( rule__SATMorphic__SolversAssignment_1 )
            {
             before(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 
            // InternalMSat.g:711:3: ( rule__SATMorphic__SolversAssignment_1 )
            // InternalMSat.g:711:4: rule__SATMorphic__SolversAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__SATMorphic__SolversAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 

            }

            // InternalMSat.g:714:2: ( ( rule__SATMorphic__SolversAssignment_1 )* )
            // InternalMSat.g:715:3: ( rule__SATMorphic__SolversAssignment_1 )*
            {
             before(grammarAccess.getSATMorphicAccess().getSolversAssignment_1()); 
            // InternalMSat.g:716:3: ( rule__SATMorphic__SolversAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=17 && LA8_0<=19)||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSat.g:716:4: rule__SATMorphic__SolversAssignment_1
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
    // InternalMSat.g:725:1: rule__SATMorphic__Group__2 : rule__SATMorphic__Group__2__Impl ;
    public final void rule__SATMorphic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:729:1: ( rule__SATMorphic__Group__2__Impl )
            // InternalMSat.g:730:2: rule__SATMorphic__Group__2__Impl
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
    // InternalMSat.g:736:1: rule__SATMorphic__Group__2__Impl : ( ( rule__SATMorphic__BenchmarkAssignment_2 ) ) ;
    public final void rule__SATMorphic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:740:1: ( ( ( rule__SATMorphic__BenchmarkAssignment_2 ) ) )
            // InternalMSat.g:741:1: ( ( rule__SATMorphic__BenchmarkAssignment_2 ) )
            {
            // InternalMSat.g:741:1: ( ( rule__SATMorphic__BenchmarkAssignment_2 ) )
            // InternalMSat.g:742:2: ( rule__SATMorphic__BenchmarkAssignment_2 )
            {
             before(grammarAccess.getSATMorphicAccess().getBenchmarkAssignment_2()); 
            // InternalMSat.g:743:2: ( rule__SATMorphic__BenchmarkAssignment_2 )
            // InternalMSat.g:743:3: rule__SATMorphic__BenchmarkAssignment_2
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
    // InternalMSat.g:752:1: rule__SATSolver__Group__0 : rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1 ;
    public final void rule__SATSolver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:756:1: ( rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1 )
            // InternalMSat.g:757:2: rule__SATSolver__Group__0__Impl rule__SATSolver__Group__1
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
    // InternalMSat.g:764:1: rule__SATSolver__Group__0__Impl : ( ( rule__SATSolver__SolverAssignment_0 ) ) ;
    public final void rule__SATSolver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:768:1: ( ( ( rule__SATSolver__SolverAssignment_0 ) ) )
            // InternalMSat.g:769:1: ( ( rule__SATSolver__SolverAssignment_0 ) )
            {
            // InternalMSat.g:769:1: ( ( rule__SATSolver__SolverAssignment_0 ) )
            // InternalMSat.g:770:2: ( rule__SATSolver__SolverAssignment_0 )
            {
             before(grammarAccess.getSATSolverAccess().getSolverAssignment_0()); 
            // InternalMSat.g:771:2: ( rule__SATSolver__SolverAssignment_0 )
            // InternalMSat.g:771:3: rule__SATSolver__SolverAssignment_0
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
    // InternalMSat.g:779:1: rule__SATSolver__Group__1 : rule__SATSolver__Group__1__Impl ;
    public final void rule__SATSolver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:783:1: ( rule__SATSolver__Group__1__Impl )
            // InternalMSat.g:784:2: rule__SATSolver__Group__1__Impl
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
    // InternalMSat.g:790:1: rule__SATSolver__Group__1__Impl : ( ( rule__SATSolver__VersionAssignment_1 )? ) ;
    public final void rule__SATSolver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:794:1: ( ( ( rule__SATSolver__VersionAssignment_1 )? ) )
            // InternalMSat.g:795:1: ( ( rule__SATSolver__VersionAssignment_1 )? )
            {
            // InternalMSat.g:795:1: ( ( rule__SATSolver__VersionAssignment_1 )? )
            // InternalMSat.g:796:2: ( rule__SATSolver__VersionAssignment_1 )?
            {
             before(grammarAccess.getSATSolverAccess().getVersionAssignment_1()); 
            // InternalMSat.g:797:2: ( rule__SATSolver__VersionAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSat.g:797:3: rule__SATSolver__VersionAssignment_1
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


    // $ANTLR start "rule__BenchmarkDimacs__Group__0"
    // InternalMSat.g:806:1: rule__BenchmarkDimacs__Group__0 : rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1 ;
    public final void rule__BenchmarkDimacs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:810:1: ( rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1 )
            // InternalMSat.g:811:2: rule__BenchmarkDimacs__Group__0__Impl rule__BenchmarkDimacs__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMSat.g:818:1: rule__BenchmarkDimacs__Group__0__Impl : ( 'benchmark-DIMACS' ) ;
    public final void rule__BenchmarkDimacs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:822:1: ( ( 'benchmark-DIMACS' ) )
            // InternalMSat.g:823:1: ( 'benchmark-DIMACS' )
            {
            // InternalMSat.g:823:1: ( 'benchmark-DIMACS' )
            // InternalMSat.g:824:2: 'benchmark-DIMACS'
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getBenchmarkDIMACSKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSat.g:833:1: rule__BenchmarkDimacs__Group__1 : rule__BenchmarkDimacs__Group__1__Impl ;
    public final void rule__BenchmarkDimacs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:837:1: ( rule__BenchmarkDimacs__Group__1__Impl )
            // InternalMSat.g:838:2: rule__BenchmarkDimacs__Group__1__Impl
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
    // InternalMSat.g:844:1: rule__BenchmarkDimacs__Group__1__Impl : ( ( rule__BenchmarkDimacs__Group_1__0 ) ) ;
    public final void rule__BenchmarkDimacs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:848:1: ( ( ( rule__BenchmarkDimacs__Group_1__0 ) ) )
            // InternalMSat.g:849:1: ( ( rule__BenchmarkDimacs__Group_1__0 ) )
            {
            // InternalMSat.g:849:1: ( ( rule__BenchmarkDimacs__Group_1__0 ) )
            // InternalMSat.g:850:2: ( rule__BenchmarkDimacs__Group_1__0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup_1()); 
            // InternalMSat.g:851:2: ( rule__BenchmarkDimacs__Group_1__0 )
            // InternalMSat.g:851:3: rule__BenchmarkDimacs__Group_1__0
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
    // InternalMSat.g:860:1: rule__BenchmarkDimacs__Group_1__0 : rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1 ;
    public final void rule__BenchmarkDimacs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:864:1: ( rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1 )
            // InternalMSat.g:865:2: rule__BenchmarkDimacs__Group_1__0__Impl rule__BenchmarkDimacs__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMSat.g:872:1: rule__BenchmarkDimacs__Group_1__0__Impl : ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) ) ;
    public final void rule__BenchmarkDimacs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:876:1: ( ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) ) )
            // InternalMSat.g:877:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) )
            {
            // InternalMSat.g:877:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 ) )
            // InternalMSat.g:878:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_0()); 
            // InternalMSat.g:879:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_0 )
            // InternalMSat.g:879:3: rule__BenchmarkDimacs__DimacsesAssignment_1_0
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
    // InternalMSat.g:887:1: rule__BenchmarkDimacs__Group_1__1 : rule__BenchmarkDimacs__Group_1__1__Impl ;
    public final void rule__BenchmarkDimacs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:891:1: ( rule__BenchmarkDimacs__Group_1__1__Impl )
            // InternalMSat.g:892:2: rule__BenchmarkDimacs__Group_1__1__Impl
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
    // InternalMSat.g:898:1: rule__BenchmarkDimacs__Group_1__1__Impl : ( ( rule__BenchmarkDimacs__Group_1_1__0 )* ) ;
    public final void rule__BenchmarkDimacs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:902:1: ( ( ( rule__BenchmarkDimacs__Group_1_1__0 )* ) )
            // InternalMSat.g:903:1: ( ( rule__BenchmarkDimacs__Group_1_1__0 )* )
            {
            // InternalMSat.g:903:1: ( ( rule__BenchmarkDimacs__Group_1_1__0 )* )
            // InternalMSat.g:904:2: ( rule__BenchmarkDimacs__Group_1_1__0 )*
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getGroup_1_1()); 
            // InternalMSat.g:905:2: ( rule__BenchmarkDimacs__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSat.g:905:3: rule__BenchmarkDimacs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BenchmarkDimacs__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMSat.g:914:1: rule__BenchmarkDimacs__Group_1_1__0 : rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1 ;
    public final void rule__BenchmarkDimacs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:918:1: ( rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1 )
            // InternalMSat.g:919:2: rule__BenchmarkDimacs__Group_1_1__0__Impl rule__BenchmarkDimacs__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMSat.g:926:1: rule__BenchmarkDimacs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BenchmarkDimacs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:930:1: ( ( ',' ) )
            // InternalMSat.g:931:1: ( ',' )
            {
            // InternalMSat.g:931:1: ( ',' )
            // InternalMSat.g:932:2: ','
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getCommaKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSat.g:941:1: rule__BenchmarkDimacs__Group_1_1__1 : rule__BenchmarkDimacs__Group_1_1__1__Impl ;
    public final void rule__BenchmarkDimacs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:945:1: ( rule__BenchmarkDimacs__Group_1_1__1__Impl )
            // InternalMSat.g:946:2: rule__BenchmarkDimacs__Group_1_1__1__Impl
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
    // InternalMSat.g:952:1: rule__BenchmarkDimacs__Group_1_1__1__Impl : ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) ) ;
    public final void rule__BenchmarkDimacs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:956:1: ( ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) ) )
            // InternalMSat.g:957:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) )
            {
            // InternalMSat.g:957:1: ( ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 ) )
            // InternalMSat.g:958:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 )
            {
             before(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_1_1()); 
            // InternalMSat.g:959:2: ( rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 )
            // InternalMSat.g:959:3: rule__BenchmarkDimacs__DimacsesAssignment_1_1_1
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
    // InternalMSat.g:968:1: rule__BenchmarkFormula__Group__0 : rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1 ;
    public final void rule__BenchmarkFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:972:1: ( rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1 )
            // InternalMSat.g:973:2: rule__BenchmarkFormula__Group__0__Impl rule__BenchmarkFormula__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:980:1: rule__BenchmarkFormula__Group__0__Impl : ( 'benchmark-formula' ) ;
    public final void rule__BenchmarkFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:984:1: ( ( 'benchmark-formula' ) )
            // InternalMSat.g:985:1: ( 'benchmark-formula' )
            {
            // InternalMSat.g:985:1: ( 'benchmark-formula' )
            // InternalMSat.g:986:2: 'benchmark-formula'
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getBenchmarkFormulaKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMSat.g:995:1: rule__BenchmarkFormula__Group__1 : rule__BenchmarkFormula__Group__1__Impl ;
    public final void rule__BenchmarkFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:999:1: ( rule__BenchmarkFormula__Group__1__Impl )
            // InternalMSat.g:1000:2: rule__BenchmarkFormula__Group__1__Impl
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
    // InternalMSat.g:1006:1: rule__BenchmarkFormula__Group__1__Impl : ( ( rule__BenchmarkFormula__Group_1__0 ) ) ;
    public final void rule__BenchmarkFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1010:1: ( ( ( rule__BenchmarkFormula__Group_1__0 ) ) )
            // InternalMSat.g:1011:1: ( ( rule__BenchmarkFormula__Group_1__0 ) )
            {
            // InternalMSat.g:1011:1: ( ( rule__BenchmarkFormula__Group_1__0 ) )
            // InternalMSat.g:1012:2: ( rule__BenchmarkFormula__Group_1__0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup_1()); 
            // InternalMSat.g:1013:2: ( rule__BenchmarkFormula__Group_1__0 )
            // InternalMSat.g:1013:3: rule__BenchmarkFormula__Group_1__0
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
    // InternalMSat.g:1022:1: rule__BenchmarkFormula__Group_1__0 : rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1 ;
    public final void rule__BenchmarkFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1026:1: ( rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1 )
            // InternalMSat.g:1027:2: rule__BenchmarkFormula__Group_1__0__Impl rule__BenchmarkFormula__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMSat.g:1034:1: rule__BenchmarkFormula__Group_1__0__Impl : ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__BenchmarkFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1038:1: ( ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) ) )
            // InternalMSat.g:1039:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) )
            {
            // InternalMSat.g:1039:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 ) )
            // InternalMSat.g:1040:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_0()); 
            // InternalMSat.g:1041:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_0 )
            // InternalMSat.g:1041:3: rule__BenchmarkFormula__ExpressionsAssignment_1_0
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
    // InternalMSat.g:1049:1: rule__BenchmarkFormula__Group_1__1 : rule__BenchmarkFormula__Group_1__1__Impl ;
    public final void rule__BenchmarkFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1053:1: ( rule__BenchmarkFormula__Group_1__1__Impl )
            // InternalMSat.g:1054:2: rule__BenchmarkFormula__Group_1__1__Impl
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
    // InternalMSat.g:1060:1: rule__BenchmarkFormula__Group_1__1__Impl : ( ( rule__BenchmarkFormula__Group_1_1__0 )* ) ;
    public final void rule__BenchmarkFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1064:1: ( ( ( rule__BenchmarkFormula__Group_1_1__0 )* ) )
            // InternalMSat.g:1065:1: ( ( rule__BenchmarkFormula__Group_1_1__0 )* )
            {
            // InternalMSat.g:1065:1: ( ( rule__BenchmarkFormula__Group_1_1__0 )* )
            // InternalMSat.g:1066:2: ( rule__BenchmarkFormula__Group_1_1__0 )*
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getGroup_1_1()); 
            // InternalMSat.g:1067:2: ( rule__BenchmarkFormula__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSat.g:1067:3: rule__BenchmarkFormula__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BenchmarkFormula__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMSat.g:1076:1: rule__BenchmarkFormula__Group_1_1__0 : rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1 ;
    public final void rule__BenchmarkFormula__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1080:1: ( rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1 )
            // InternalMSat.g:1081:2: rule__BenchmarkFormula__Group_1_1__0__Impl rule__BenchmarkFormula__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1088:1: rule__BenchmarkFormula__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BenchmarkFormula__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1092:1: ( ( ',' ) )
            // InternalMSat.g:1093:1: ( ',' )
            {
            // InternalMSat.g:1093:1: ( ',' )
            // InternalMSat.g:1094:2: ','
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getCommaKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSat.g:1103:1: rule__BenchmarkFormula__Group_1_1__1 : rule__BenchmarkFormula__Group_1_1__1__Impl ;
    public final void rule__BenchmarkFormula__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1107:1: ( rule__BenchmarkFormula__Group_1_1__1__Impl )
            // InternalMSat.g:1108:2: rule__BenchmarkFormula__Group_1_1__1__Impl
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
    // InternalMSat.g:1114:1: rule__BenchmarkFormula__Group_1_1__1__Impl : ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BenchmarkFormula__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1118:1: ( ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) ) )
            // InternalMSat.g:1119:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) )
            {
            // InternalMSat.g:1119:1: ( ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 ) )
            // InternalMSat.g:1120:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 )
            {
             before(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_1_1()); 
            // InternalMSat.g:1121:2: ( rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 )
            // InternalMSat.g:1121:3: rule__BenchmarkFormula__ExpressionsAssignment_1_1_1
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
    // InternalMSat.g:1130:1: rule__BiImpl__Group__0 : rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 ;
    public final void rule__BiImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1134:1: ( rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 )
            // InternalMSat.g:1135:2: rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMSat.g:1142:1: rule__BiImpl__Group__0__Impl : ( ruleImpl ) ;
    public final void rule__BiImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1146:1: ( ( ruleImpl ) )
            // InternalMSat.g:1147:1: ( ruleImpl )
            {
            // InternalMSat.g:1147:1: ( ruleImpl )
            // InternalMSat.g:1148:2: ruleImpl
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
    // InternalMSat.g:1157:1: rule__BiImpl__Group__1 : rule__BiImpl__Group__1__Impl ;
    public final void rule__BiImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1161:1: ( rule__BiImpl__Group__1__Impl )
            // InternalMSat.g:1162:2: rule__BiImpl__Group__1__Impl
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
    // InternalMSat.g:1168:1: rule__BiImpl__Group__1__Impl : ( ( rule__BiImpl__Group_1__0 )* ) ;
    public final void rule__BiImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1172:1: ( ( ( rule__BiImpl__Group_1__0 )* ) )
            // InternalMSat.g:1173:1: ( ( rule__BiImpl__Group_1__0 )* )
            {
            // InternalMSat.g:1173:1: ( ( rule__BiImpl__Group_1__0 )* )
            // InternalMSat.g:1174:2: ( rule__BiImpl__Group_1__0 )*
            {
             before(grammarAccess.getBiImplAccess().getGroup_1()); 
            // InternalMSat.g:1175:2: ( rule__BiImpl__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSat.g:1175:3: rule__BiImpl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BiImpl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMSat.g:1184:1: rule__BiImpl__Group_1__0 : rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 ;
    public final void rule__BiImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1188:1: ( rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 )
            // InternalMSat.g:1189:2: rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMSat.g:1196:1: rule__BiImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1200:1: ( ( () ) )
            // InternalMSat.g:1201:1: ( () )
            {
            // InternalMSat.g:1201:1: ( () )
            // InternalMSat.g:1202:2: ()
            {
             before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 
            // InternalMSat.g:1203:2: ()
            // InternalMSat.g:1203:3: 
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
    // InternalMSat.g:1211:1: rule__BiImpl__Group_1__1 : rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 ;
    public final void rule__BiImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1215:1: ( rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 )
            // InternalMSat.g:1216:2: rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1223:1: rule__BiImpl__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1227:1: ( ( '<=>' ) )
            // InternalMSat.g:1228:1: ( '<=>' )
            {
            // InternalMSat.g:1228:1: ( '<=>' )
            // InternalMSat.g:1229:2: '<=>'
            {
             before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMSat.g:1238:1: rule__BiImpl__Group_1__2 : rule__BiImpl__Group_1__2__Impl ;
    public final void rule__BiImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1242:1: ( rule__BiImpl__Group_1__2__Impl )
            // InternalMSat.g:1243:2: rule__BiImpl__Group_1__2__Impl
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
    // InternalMSat.g:1249:1: rule__BiImpl__Group_1__2__Impl : ( ( rule__BiImpl__RightAssignment_1_2 ) ) ;
    public final void rule__BiImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1253:1: ( ( ( rule__BiImpl__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1254:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1254:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            // InternalMSat.g:1255:2: ( rule__BiImpl__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1256:2: ( rule__BiImpl__RightAssignment_1_2 )
            // InternalMSat.g:1256:3: rule__BiImpl__RightAssignment_1_2
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
    // InternalMSat.g:1265:1: rule__Impl__Group__0 : rule__Impl__Group__0__Impl rule__Impl__Group__1 ;
    public final void rule__Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1269:1: ( rule__Impl__Group__0__Impl rule__Impl__Group__1 )
            // InternalMSat.g:1270:2: rule__Impl__Group__0__Impl rule__Impl__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMSat.g:1277:1: rule__Impl__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1281:1: ( ( ruleOr ) )
            // InternalMSat.g:1282:1: ( ruleOr )
            {
            // InternalMSat.g:1282:1: ( ruleOr )
            // InternalMSat.g:1283:2: ruleOr
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
    // InternalMSat.g:1292:1: rule__Impl__Group__1 : rule__Impl__Group__1__Impl ;
    public final void rule__Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1296:1: ( rule__Impl__Group__1__Impl )
            // InternalMSat.g:1297:2: rule__Impl__Group__1__Impl
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
    // InternalMSat.g:1303:1: rule__Impl__Group__1__Impl : ( ( rule__Impl__Group_1__0 )* ) ;
    public final void rule__Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1307:1: ( ( ( rule__Impl__Group_1__0 )* ) )
            // InternalMSat.g:1308:1: ( ( rule__Impl__Group_1__0 )* )
            {
            // InternalMSat.g:1308:1: ( ( rule__Impl__Group_1__0 )* )
            // InternalMSat.g:1309:2: ( rule__Impl__Group_1__0 )*
            {
             before(grammarAccess.getImplAccess().getGroup_1()); 
            // InternalMSat.g:1310:2: ( rule__Impl__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSat.g:1310:3: rule__Impl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Impl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMSat.g:1319:1: rule__Impl__Group_1__0 : rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 ;
    public final void rule__Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1323:1: ( rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 )
            // InternalMSat.g:1324:2: rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMSat.g:1331:1: rule__Impl__Group_1__0__Impl : ( () ) ;
    public final void rule__Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1335:1: ( ( () ) )
            // InternalMSat.g:1336:1: ( () )
            {
            // InternalMSat.g:1336:1: ( () )
            // InternalMSat.g:1337:2: ()
            {
             before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 
            // InternalMSat.g:1338:2: ()
            // InternalMSat.g:1338:3: 
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
    // InternalMSat.g:1346:1: rule__Impl__Group_1__1 : rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 ;
    public final void rule__Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1350:1: ( rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 )
            // InternalMSat.g:1351:2: rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1358:1: rule__Impl__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1362:1: ( ( '=>' ) )
            // InternalMSat.g:1363:1: ( '=>' )
            {
            // InternalMSat.g:1363:1: ( '=>' )
            // InternalMSat.g:1364:2: '=>'
            {
             before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMSat.g:1373:1: rule__Impl__Group_1__2 : rule__Impl__Group_1__2__Impl ;
    public final void rule__Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1377:1: ( rule__Impl__Group_1__2__Impl )
            // InternalMSat.g:1378:2: rule__Impl__Group_1__2__Impl
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
    // InternalMSat.g:1384:1: rule__Impl__Group_1__2__Impl : ( ( rule__Impl__RightAssignment_1_2 ) ) ;
    public final void rule__Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1388:1: ( ( ( rule__Impl__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1389:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1389:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            // InternalMSat.g:1390:2: ( rule__Impl__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1391:2: ( rule__Impl__RightAssignment_1_2 )
            // InternalMSat.g:1391:3: rule__Impl__RightAssignment_1_2
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
    // InternalMSat.g:1400:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1404:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMSat.g:1405:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMSat.g:1412:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1416:1: ( ( ruleAnd ) )
            // InternalMSat.g:1417:1: ( ruleAnd )
            {
            // InternalMSat.g:1417:1: ( ruleAnd )
            // InternalMSat.g:1418:2: ruleAnd
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
    // InternalMSat.g:1427:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1431:1: ( rule__Or__Group__1__Impl )
            // InternalMSat.g:1432:2: rule__Or__Group__1__Impl
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
    // InternalMSat.g:1438:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1442:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMSat.g:1443:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMSat.g:1443:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMSat.g:1444:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMSat.g:1445:2: ( rule__Or__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSat.g:1445:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMSat.g:1454:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1458:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMSat.g:1459:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMSat.g:1466:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1470:1: ( ( () ) )
            // InternalMSat.g:1471:1: ( () )
            {
            // InternalMSat.g:1471:1: ( () )
            // InternalMSat.g:1472:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalMSat.g:1473:2: ()
            // InternalMSat.g:1473:3: 
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
    // InternalMSat.g:1481:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1485:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMSat.g:1486:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1493:1: rule__Or__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1497:1: ( ( 'v' ) )
            // InternalMSat.g:1498:1: ( 'v' )
            {
            // InternalMSat.g:1498:1: ( 'v' )
            // InternalMSat.g:1499:2: 'v'
            {
             before(grammarAccess.getOrAccess().getVKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMSat.g:1508:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1512:1: ( rule__Or__Group_1__2__Impl )
            // InternalMSat.g:1513:2: rule__Or__Group_1__2__Impl
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
    // InternalMSat.g:1519:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1523:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1524:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1524:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMSat.g:1525:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1526:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMSat.g:1526:3: rule__Or__RightAssignment_1_2
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
    // InternalMSat.g:1535:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1539:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMSat.g:1540:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMSat.g:1547:1: rule__And__Group__0__Impl : ( ruleNand ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1551:1: ( ( ruleNand ) )
            // InternalMSat.g:1552:1: ( ruleNand )
            {
            // InternalMSat.g:1552:1: ( ruleNand )
            // InternalMSat.g:1553:2: ruleNand
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
    // InternalMSat.g:1562:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1566:1: ( rule__And__Group__1__Impl )
            // InternalMSat.g:1567:2: rule__And__Group__1__Impl
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
    // InternalMSat.g:1573:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1577:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMSat.g:1578:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMSat.g:1578:1: ( ( rule__And__Group_1__0 )* )
            // InternalMSat.g:1579:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMSat.g:1580:2: ( rule__And__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSat.g:1580:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMSat.g:1589:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1593:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMSat.g:1594:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMSat.g:1601:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1605:1: ( ( () ) )
            // InternalMSat.g:1606:1: ( () )
            {
            // InternalMSat.g:1606:1: ( () )
            // InternalMSat.g:1607:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalMSat.g:1608:2: ()
            // InternalMSat.g:1608:3: 
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
    // InternalMSat.g:1616:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1620:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMSat.g:1621:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1628:1: rule__And__Group_1__1__Impl : ( '^' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1632:1: ( ( '^' ) )
            // InternalMSat.g:1633:1: ( '^' )
            {
            // InternalMSat.g:1633:1: ( '^' )
            // InternalMSat.g:1634:2: '^'
            {
             before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMSat.g:1643:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1647:1: ( rule__And__Group_1__2__Impl )
            // InternalMSat.g:1648:2: rule__And__Group_1__2__Impl
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
    // InternalMSat.g:1654:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1658:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1659:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1659:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMSat.g:1660:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1661:2: ( rule__And__RightAssignment_1_2 )
            // InternalMSat.g:1661:3: rule__And__RightAssignment_1_2
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
    // InternalMSat.g:1670:1: rule__Nand__Group__0 : rule__Nand__Group__0__Impl rule__Nand__Group__1 ;
    public final void rule__Nand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1674:1: ( rule__Nand__Group__0__Impl rule__Nand__Group__1 )
            // InternalMSat.g:1675:2: rule__Nand__Group__0__Impl rule__Nand__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSat.g:1682:1: rule__Nand__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Nand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1686:1: ( ( rulePrimary ) )
            // InternalMSat.g:1687:1: ( rulePrimary )
            {
            // InternalMSat.g:1687:1: ( rulePrimary )
            // InternalMSat.g:1688:2: rulePrimary
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
    // InternalMSat.g:1697:1: rule__Nand__Group__1 : rule__Nand__Group__1__Impl ;
    public final void rule__Nand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1701:1: ( rule__Nand__Group__1__Impl )
            // InternalMSat.g:1702:2: rule__Nand__Group__1__Impl
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
    // InternalMSat.g:1708:1: rule__Nand__Group__1__Impl : ( ( rule__Nand__Group_1__0 )* ) ;
    public final void rule__Nand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1712:1: ( ( ( rule__Nand__Group_1__0 )* ) )
            // InternalMSat.g:1713:1: ( ( rule__Nand__Group_1__0 )* )
            {
            // InternalMSat.g:1713:1: ( ( rule__Nand__Group_1__0 )* )
            // InternalMSat.g:1714:2: ( rule__Nand__Group_1__0 )*
            {
             before(grammarAccess.getNandAccess().getGroup_1()); 
            // InternalMSat.g:1715:2: ( rule__Nand__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSat.g:1715:3: rule__Nand__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Nand__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMSat.g:1724:1: rule__Nand__Group_1__0 : rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 ;
    public final void rule__Nand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1728:1: ( rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 )
            // InternalMSat.g:1729:2: rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSat.g:1736:1: rule__Nand__Group_1__0__Impl : ( () ) ;
    public final void rule__Nand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1740:1: ( ( () ) )
            // InternalMSat.g:1741:1: ( () )
            {
            // InternalMSat.g:1741:1: ( () )
            // InternalMSat.g:1742:2: ()
            {
             before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 
            // InternalMSat.g:1743:2: ()
            // InternalMSat.g:1743:3: 
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
    // InternalMSat.g:1751:1: rule__Nand__Group_1__1 : rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 ;
    public final void rule__Nand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1755:1: ( rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 )
            // InternalMSat.g:1756:2: rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1763:1: rule__Nand__Group_1__1__Impl : ( ( rule__Nand__Alternatives_1_1 ) ) ;
    public final void rule__Nand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1767:1: ( ( ( rule__Nand__Alternatives_1_1 ) ) )
            // InternalMSat.g:1768:1: ( ( rule__Nand__Alternatives_1_1 ) )
            {
            // InternalMSat.g:1768:1: ( ( rule__Nand__Alternatives_1_1 ) )
            // InternalMSat.g:1769:2: ( rule__Nand__Alternatives_1_1 )
            {
             before(grammarAccess.getNandAccess().getAlternatives_1_1()); 
            // InternalMSat.g:1770:2: ( rule__Nand__Alternatives_1_1 )
            // InternalMSat.g:1770:3: rule__Nand__Alternatives_1_1
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
    // InternalMSat.g:1778:1: rule__Nand__Group_1__2 : rule__Nand__Group_1__2__Impl ;
    public final void rule__Nand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1782:1: ( rule__Nand__Group_1__2__Impl )
            // InternalMSat.g:1783:2: rule__Nand__Group_1__2__Impl
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
    // InternalMSat.g:1789:1: rule__Nand__Group_1__2__Impl : ( ( rule__Nand__RightAssignment_1_2 ) ) ;
    public final void rule__Nand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1793:1: ( ( ( rule__Nand__RightAssignment_1_2 ) ) )
            // InternalMSat.g:1794:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            {
            // InternalMSat.g:1794:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            // InternalMSat.g:1795:2: ( rule__Nand__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandAccess().getRightAssignment_1_2()); 
            // InternalMSat.g:1796:2: ( rule__Nand__RightAssignment_1_2 )
            // InternalMSat.g:1796:3: rule__Nand__RightAssignment_1_2
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
    // InternalMSat.g:1805:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1809:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMSat.g:1810:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1817:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1821:1: ( ( '(' ) )
            // InternalMSat.g:1822:1: ( '(' )
            {
            // InternalMSat.g:1822:1: ( '(' )
            // InternalMSat.g:1823:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMSat.g:1832:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1836:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMSat.g:1837:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSat.g:1844:1: rule__Primary__Group_0__1__Impl : ( ruleBiImpl ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1848:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:1849:1: ( ruleBiImpl )
            {
            // InternalMSat.g:1849:1: ( ruleBiImpl )
            // InternalMSat.g:1850:2: ruleBiImpl
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
    // InternalMSat.g:1859:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1863:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMSat.g:1864:2: rule__Primary__Group_0__2__Impl
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
    // InternalMSat.g:1870:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1874:1: ( ( ')' ) )
            // InternalMSat.g:1875:1: ( ')' )
            {
            // InternalMSat.g:1875:1: ( ')' )
            // InternalMSat.g:1876:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMSat.g:1886:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1890:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMSat.g:1891:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSat.g:1898:1: rule__Not__Group__0__Impl : ( ( rule__Not__Alternatives_0 ) ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1902:1: ( ( ( rule__Not__Alternatives_0 ) ) )
            // InternalMSat.g:1903:1: ( ( rule__Not__Alternatives_0 ) )
            {
            // InternalMSat.g:1903:1: ( ( rule__Not__Alternatives_0 ) )
            // InternalMSat.g:1904:2: ( rule__Not__Alternatives_0 )
            {
             before(grammarAccess.getNotAccess().getAlternatives_0()); 
            // InternalMSat.g:1905:2: ( rule__Not__Alternatives_0 )
            // InternalMSat.g:1905:3: rule__Not__Alternatives_0
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
    // InternalMSat.g:1913:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1917:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalMSat.g:1918:2: rule__Not__Group__1__Impl rule__Not__Group__2
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
    // InternalMSat.g:1925:1: rule__Not__Group__1__Impl : ( rulePrimary ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1929:1: ( ( rulePrimary ) )
            // InternalMSat.g:1930:1: ( rulePrimary )
            {
            // InternalMSat.g:1930:1: ( rulePrimary )
            // InternalMSat.g:1931:2: rulePrimary
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
    // InternalMSat.g:1940:1: rule__Not__Group__2 : rule__Not__Group__2__Impl ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1944:1: ( rule__Not__Group__2__Impl )
            // InternalMSat.g:1945:2: rule__Not__Group__2__Impl
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
    // InternalMSat.g:1951:1: rule__Not__Group__2__Impl : ( () ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1955:1: ( ( () ) )
            // InternalMSat.g:1956:1: ( () )
            {
            // InternalMSat.g:1956:1: ( () )
            // InternalMSat.g:1957:2: ()
            {
             before(grammarAccess.getNotAccess().getNotExpressionAction_2()); 
            // InternalMSat.g:1958:2: ()
            // InternalMSat.g:1958:3: 
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
    // InternalMSat.g:1967:1: rule__SATMorphic__SolversAssignment_1 : ( ruleSATSolver ) ;
    public final void rule__SATMorphic__SolversAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1971:1: ( ( ruleSATSolver ) )
            // InternalMSat.g:1972:2: ( ruleSATSolver )
            {
            // InternalMSat.g:1972:2: ( ruleSATSolver )
            // InternalMSat.g:1973:3: ruleSATSolver
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
    // InternalMSat.g:1982:1: rule__SATMorphic__BenchmarkAssignment_2 : ( ruleBenchmark ) ;
    public final void rule__SATMorphic__BenchmarkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:1986:1: ( ( ruleBenchmark ) )
            // InternalMSat.g:1987:2: ( ruleBenchmark )
            {
            // InternalMSat.g:1987:2: ( ruleBenchmark )
            // InternalMSat.g:1988:3: ruleBenchmark
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
    // InternalMSat.g:1997:1: rule__SATSolver__SolverAssignment_0 : ( ( rule__SATSolver__SolverAlternatives_0_0 ) ) ;
    public final void rule__SATSolver__SolverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2001:1: ( ( ( rule__SATSolver__SolverAlternatives_0_0 ) ) )
            // InternalMSat.g:2002:2: ( ( rule__SATSolver__SolverAlternatives_0_0 ) )
            {
            // InternalMSat.g:2002:2: ( ( rule__SATSolver__SolverAlternatives_0_0 ) )
            // InternalMSat.g:2003:3: ( rule__SATSolver__SolverAlternatives_0_0 )
            {
             before(grammarAccess.getSATSolverAccess().getSolverAlternatives_0_0()); 
            // InternalMSat.g:2004:3: ( rule__SATSolver__SolverAlternatives_0_0 )
            // InternalMSat.g:2004:4: rule__SATSolver__SolverAlternatives_0_0
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
    // InternalMSat.g:2012:1: rule__SATSolver__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SATSolver__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2016:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2017:2: ( RULE_STRING )
            {
            // InternalMSat.g:2017:2: ( RULE_STRING )
            // InternalMSat.g:2018:3: RULE_STRING
            {
             before(grammarAccess.getSATSolverAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSATSolverAccess().getVersionSTRINGTerminalRuleCall_1_0()); 

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
    // InternalMSat.g:2027:1: rule__Sat4J__VariantAssignment : ( ruleSat4JVariant ) ;
    public final void rule__Sat4J__VariantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2031:1: ( ( ruleSat4JVariant ) )
            // InternalMSat.g:2032:2: ( ruleSat4JVariant )
            {
            // InternalMSat.g:2032:2: ( ruleSat4JVariant )
            // InternalMSat.g:2033:3: ruleSat4JVariant
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


    // $ANTLR start "rule__MiniSAT__VariantAssignment"
    // InternalMSat.g:2042:1: rule__MiniSAT__VariantAssignment : ( ( 'minisat' ) ) ;
    public final void rule__MiniSAT__VariantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2046:1: ( ( ( 'minisat' ) ) )
            // InternalMSat.g:2047:2: ( ( 'minisat' ) )
            {
            // InternalMSat.g:2047:2: ( ( 'minisat' ) )
            // InternalMSat.g:2048:3: ( 'minisat' )
            {
             before(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0()); 
            // InternalMSat.g:2049:3: ( 'minisat' )
            // InternalMSat.g:2050:4: 'minisat'
            {
             before(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0()); 

            }

             after(grammarAccess.getMiniSATAccess().getVariantMinisatKeyword_0()); 

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
    // $ANTLR end "rule__MiniSAT__VariantAssignment"


    // $ANTLR start "rule__CryptoMiniSAT__VariantAssignment"
    // InternalMSat.g:2061:1: rule__CryptoMiniSAT__VariantAssignment : ( ( 'cryptominisat' ) ) ;
    public final void rule__CryptoMiniSAT__VariantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2065:1: ( ( ( 'cryptominisat' ) ) )
            // InternalMSat.g:2066:2: ( ( 'cryptominisat' ) )
            {
            // InternalMSat.g:2066:2: ( ( 'cryptominisat' ) )
            // InternalMSat.g:2067:3: ( 'cryptominisat' )
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 
            // InternalMSat.g:2068:3: ( 'cryptominisat' )
            // InternalMSat.g:2069:4: 'cryptominisat'
            {
             before(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__BenchmarkDimacs__DimacsesAssignment_1_0"
    // InternalMSat.g:2080:1: rule__BenchmarkDimacs__DimacsesAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__BenchmarkDimacs__DimacsesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2084:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2085:2: ( RULE_STRING )
            {
            // InternalMSat.g:2085:2: ( RULE_STRING )
            // InternalMSat.g:2086:3: RULE_STRING
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
    // InternalMSat.g:2095:1: rule__BenchmarkDimacs__DimacsesAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__BenchmarkDimacs__DimacsesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2099:1: ( ( RULE_STRING ) )
            // InternalMSat.g:2100:2: ( RULE_STRING )
            {
            // InternalMSat.g:2100:2: ( RULE_STRING )
            // InternalMSat.g:2101:3: RULE_STRING
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
    // InternalMSat.g:2110:1: rule__BenchmarkFormula__ExpressionsAssignment_1_0 : ( ruleBiImpl ) ;
    public final void rule__BenchmarkFormula__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2114:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:2115:2: ( ruleBiImpl )
            {
            // InternalMSat.g:2115:2: ( ruleBiImpl )
            // InternalMSat.g:2116:3: ruleBiImpl
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
    // InternalMSat.g:2125:1: rule__BenchmarkFormula__ExpressionsAssignment_1_1_1 : ( ruleBiImpl ) ;
    public final void rule__BenchmarkFormula__ExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2129:1: ( ( ruleBiImpl ) )
            // InternalMSat.g:2130:2: ( ruleBiImpl )
            {
            // InternalMSat.g:2130:2: ( ruleBiImpl )
            // InternalMSat.g:2131:3: ruleBiImpl
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
    // InternalMSat.g:2140:1: rule__BiImpl__RightAssignment_1_2 : ( ruleImpl ) ;
    public final void rule__BiImpl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2144:1: ( ( ruleImpl ) )
            // InternalMSat.g:2145:2: ( ruleImpl )
            {
            // InternalMSat.g:2145:2: ( ruleImpl )
            // InternalMSat.g:2146:3: ruleImpl
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
    // InternalMSat.g:2155:1: rule__Impl__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Impl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2159:1: ( ( ruleOr ) )
            // InternalMSat.g:2160:2: ( ruleOr )
            {
            // InternalMSat.g:2160:2: ( ruleOr )
            // InternalMSat.g:2161:3: ruleOr
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
    // InternalMSat.g:2170:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2174:1: ( ( ruleAnd ) )
            // InternalMSat.g:2175:2: ( ruleAnd )
            {
            // InternalMSat.g:2175:2: ( ruleAnd )
            // InternalMSat.g:2176:3: ruleAnd
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
    // InternalMSat.g:2185:1: rule__And__RightAssignment_1_2 : ( ruleNand ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2189:1: ( ( ruleNand ) )
            // InternalMSat.g:2190:2: ( ruleNand )
            {
            // InternalMSat.g:2190:2: ( ruleNand )
            // InternalMSat.g:2191:3: ruleNand
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
    // InternalMSat.g:2200:1: rule__Nand__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Nand__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2204:1: ( ( rulePrimary ) )
            // InternalMSat.g:2205:2: ( rulePrimary )
            {
            // InternalMSat.g:2205:2: ( rulePrimary )
            // InternalMSat.g:2206:3: rulePrimary
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
    // InternalMSat.g:2215:1: rule__Var__IdAssignment : ( RULE_ID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2219:1: ( ( RULE_ID ) )
            // InternalMSat.g:2220:2: ( RULE_ID )
            {
            // InternalMSat.g:2220:2: ( RULE_ID )
            // InternalMSat.g:2221:3: RULE_ID
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
    // InternalMSat.g:2230:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSat.g:2234:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalMSat.g:2235:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalMSat.g:2235:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalMSat.g:2236:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalMSat.g:2237:3: ( rule__Const__ValAlternatives_0 )
            // InternalMSat.g:2237:4: rule__Const__ValAlternatives_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C00E0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C00E0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001001E020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}