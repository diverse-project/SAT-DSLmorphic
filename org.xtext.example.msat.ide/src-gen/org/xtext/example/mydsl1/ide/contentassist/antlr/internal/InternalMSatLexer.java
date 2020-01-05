package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSatLexer extends Lexer {
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

    public InternalMSatLexer() {;} 
    public InternalMSatLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMSatLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMSat.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:11:7: ( '|' )
            // InternalMSat.g:11:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:12:7: ( '\\u2191' )
            // InternalMSat.g:12:9: '\\u2191'
            {
            match('\u2191'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:13:7: ( '!' )
            // InternalMSat.g:13:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:14:7: ( '~' )
            // InternalMSat.g:14:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:15:7: ( 'true' )
            // InternalMSat.g:15:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:16:7: ( 'false' )
            // InternalMSat.g:16:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:17:7: ( 'sat4j-java' )
            // InternalMSat.g:17:9: 'sat4j-java'
            {
            match("sat4j-java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:18:7: ( 'sat4j-jar' )
            // InternalMSat.g:18:9: 'sat4j-jar'
            {
            match("sat4j-jar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:19:7: ( 'sat4j-maven' )
            // InternalMSat.g:19:9: 'sat4j-maven'
            {
            match("sat4j-maven"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:20:7: ( 'solver' )
            // InternalMSat.g:20:9: 'solver'
            {
            match("solver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:21:7: ( 'version' )
            // InternalMSat.g:21:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:22:7: ( 'rnd-freq' )
            // InternalMSat.g:22:9: 'rnd-freq'
            {
            match("rnd-freq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:23:7: ( 'freq' )
            // InternalMSat.g:23:9: 'freq'
            {
            match("freq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:24:7: ( 'benchmarkDIMACS' )
            // InternalMSat.g:24:9: 'benchmarkDIMACS'
            {
            match("benchmarkDIMACS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:25:7: ( ',' )
            // InternalMSat.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:26:7: ( 'benchmarkFormula' )
            // InternalMSat.g:26:9: 'benchmarkFormula'
            {
            match("benchmarkFormula"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:27:7: ( '<=>' )
            // InternalMSat.g:27:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:28:7: ( '=>' )
            // InternalMSat.g:28:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:29:7: ( 'v' )
            // InternalMSat.g:29:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:30:7: ( '^' )
            // InternalMSat.g:30:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:31:7: ( '(' )
            // InternalMSat.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:32:7: ( ')' )
            // InternalMSat.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:33:7: ( 'minisat' )
            // InternalMSat.g:33:9: 'minisat'
            {
            match("minisat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:34:7: ( 'cryptominisat' )
            // InternalMSat.g:34:9: 'cryptominisat'
            {
            match("cryptominisat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_PROBA"
    public final void mRULE_PROBA() throws RecognitionException {
        try {
            int _type = RULE_PROBA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2665:12: ( ( '1' | '0' ( . RULE_INT )? ) )
            // InternalMSat.g:2665:14: ( '1' | '0' ( . RULE_INT )? )
            {
            // InternalMSat.g:2665:14: ( '1' | '0' ( . RULE_INT )? )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='1') ) {
                alt2=1;
            }
            else if ( (LA2_0=='0') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSat.g:2665:15: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 2 :
                    // InternalMSat.g:2665:19: '0' ( . RULE_INT )?
                    {
                    match('0'); 
                    // InternalMSat.g:2665:23: ( . RULE_INT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='\u0000' && LA1_0<='\uFFFF')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalMSat.g:2665:24: . RULE_INT
                            {
                            matchAny(); 
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROBA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2667:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMSat.g:2667:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMSat.g:2667:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSat.g:2667:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMSat.g:2667:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSat.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMSat.g:2669:19: ( ( '0' .. '9' )+ )
            // InternalMSat.g:2669:21: ( '0' .. '9' )+
            {
            // InternalMSat.g:2669:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSat.g:2669:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2671:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMSat.g:2671:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMSat.g:2671:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSat.g:2671:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMSat.g:2671:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMSat.g:2671:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSat.g:2671:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMSat.g:2671:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMSat.g:2671:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMSat.g:2671:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSat.g:2671:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2673:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMSat.g:2673:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMSat.g:2673:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSat.g:2673:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2675:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMSat.g:2675:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMSat.g:2675:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSat.g:2675:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMSat.g:2675:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMSat.g:2675:41: ( '\\r' )? '\\n'
                    {
                    // InternalMSat.g:2675:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMSat.g:2675:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2677:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMSat.g:2677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMSat.g:2677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSat.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSat.g:2679:16: ( . )
            // InternalMSat.g:2679:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMSat.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PROBA | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=31;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMSat.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMSat.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMSat.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMSat.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMSat.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMSat.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMSat.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMSat.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMSat.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMSat.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMSat.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMSat.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMSat.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMSat.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMSat.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMSat.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMSat.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMSat.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMSat.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMSat.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMSat.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMSat.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMSat.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMSat.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMSat.g:1:154: RULE_PROBA
                {
                mRULE_PROBA(); 

                }
                break;
            case 26 :
                // InternalMSat.g:1:165: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalMSat.g:1:173: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalMSat.g:1:185: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMSat.g:1:201: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalMSat.g:1:217: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalMSat.g:1:225: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\5\uffff\3\40\1\46\2\40\1\uffff\2\32\1\54\2\uffff\2\40\3\uffff\3\32\6\uffff\1\40\1\uffff\5\40\1\uffff\2\40\6\uffff\2\40\5\uffff\12\40\1\112\1\40\1\114\3\40\1\uffff\3\40\1\uffff\1\123\1\uffff\6\40\2\uffff\1\134\4\40\3\uffff\1\142\1\40\1\144\1\40\2\uffff\1\40\1\uffff\1\40\2\uffff\15\40\1\170\2\40\1\uffff\1\173\1\40\1\uffff\1\175\1\uffff";
    static final String DFA14_eofS =
        "\176\uffff";
    static final String DFA14_minS =
        "\1\0\4\uffff\1\162\2\141\1\60\1\156\1\145\1\uffff\1\75\1\76\1\101\2\uffff\1\151\1\162\3\uffff\2\0\1\52\6\uffff\1\165\1\uffff\1\154\1\145\1\164\1\154\1\162\1\uffff\1\144\1\156\6\uffff\1\156\1\171\5\uffff\1\145\1\163\1\161\1\64\1\166\1\163\1\55\1\143\1\151\1\160\1\60\1\145\1\60\1\152\1\145\1\151\1\uffff\1\150\1\163\1\164\1\uffff\1\60\1\uffff\1\55\1\162\1\157\1\155\1\141\1\157\1\uffff\1\152\1\60\1\156\1\141\1\164\1\155\1\141\2\uffff\1\60\1\162\1\60\1\151\1\162\1\uffff\1\153\1\uffff\1\156\2\uffff\1\104\1\151\1\111\1\157\1\163\1\115\1\162\1\141\1\101\1\155\1\164\1\103\1\165\1\60\1\123\1\154\1\uffff\1\60\1\141\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\uffff\2\162\1\157\1\172\1\156\1\145\1\uffff\1\75\1\76\1\172\2\uffff\1\151\1\162\3\uffff\2\uffff\1\57\6\uffff\1\165\1\uffff\1\154\1\145\1\164\1\154\1\162\1\uffff\1\144\1\156\6\uffff\1\156\1\171\5\uffff\1\145\1\163\1\161\1\64\1\166\1\163\1\55\1\143\1\151\1\160\1\172\1\145\1\172\1\152\1\145\1\151\1\uffff\1\150\1\163\1\164\1\uffff\1\172\1\uffff\1\55\1\162\1\157\1\155\1\141\1\157\1\uffff\1\155\1\172\1\156\1\141\1\164\1\155\1\141\2\uffff\1\172\1\162\1\172\1\151\1\166\1\uffff\1\153\1\uffff\1\156\2\uffff\1\106\1\151\1\111\1\157\1\163\1\115\1\162\1\141\1\101\1\155\1\164\1\103\1\165\1\172\1\123\1\154\1\uffff\1\172\1\141\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\17\3\uffff\1\25\1\26\2\uffff\2\31\1\32\3\uffff\1\36\1\37\1\1\1\2\1\3\1\4\1\uffff\1\32\5\uffff\1\23\2\uffff\1\17\1\21\1\22\1\24\1\25\1\26\2\uffff\1\31\1\33\1\34\1\35\1\36\20\uffff\1\14\3\uffff\1\5\1\uffff\1\15\6\uffff\1\6\7\uffff\1\11\1\12\5\uffff\1\13\1\uffff\1\27\1\uffff\1\7\1\10\20\uffff\1\30\2\uffff\1\16\1\uffff\1\20";
    static final String DFA14_specialS =
        "\1\1\25\uffff\1\2\1\0\146\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\3\1\26\4\32\1\27\1\17\1\20\2\32\1\13\2\32\1\30\1\24\1\23\12\32\1\14\1\15\3\32\32\25\3\32\1\16\1\25\1\32\1\25\1\12\1\22\2\25\1\6\6\25\1\21\4\25\1\11\1\7\1\5\1\25\1\10\4\25\1\32\1\1\1\32\1\4\u2112\32\1\2\ude6e\32",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\41\20\uffff\1\42",
            "\1\43\15\uffff\1\44",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\45\25\40",
            "\1\47",
            "\1\50",
            "",
            "\1\52",
            "\1\53",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "\0\62",
            "\0\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\113",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132\2\uffff\1\133",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\143",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\145",
            "\1\147\3\uffff\1\146",
            "",
            "\1\150",
            "",
            "\1\151",
            "",
            "",
            "\1\152\1\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\171",
            "\1\172",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\174",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PROBA | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 50;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='|') ) {s = 1;}

                        else if ( (LA14_0=='\u2191') ) {s = 2;}

                        else if ( (LA14_0=='!') ) {s = 3;}

                        else if ( (LA14_0=='~') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='f') ) {s = 6;}

                        else if ( (LA14_0=='s') ) {s = 7;}

                        else if ( (LA14_0=='v') ) {s = 8;}

                        else if ( (LA14_0=='r') ) {s = 9;}

                        else if ( (LA14_0=='b') ) {s = 10;}

                        else if ( (LA14_0==',') ) {s = 11;}

                        else if ( (LA14_0=='<') ) {s = 12;}

                        else if ( (LA14_0=='=') ) {s = 13;}

                        else if ( (LA14_0=='^') ) {s = 14;}

                        else if ( (LA14_0=='(') ) {s = 15;}

                        else if ( (LA14_0==')') ) {s = 16;}

                        else if ( (LA14_0=='m') ) {s = 17;}

                        else if ( (LA14_0=='c') ) {s = 18;}

                        else if ( (LA14_0=='1') ) {s = 19;}

                        else if ( (LA14_0=='0') ) {s = 20;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='d' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='q')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>='2' && LA14_0<=';')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='{'||LA14_0=='}'||(LA14_0>='\u007F' && LA14_0<='\u2190')||(LA14_0>='\u2192' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 50;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}