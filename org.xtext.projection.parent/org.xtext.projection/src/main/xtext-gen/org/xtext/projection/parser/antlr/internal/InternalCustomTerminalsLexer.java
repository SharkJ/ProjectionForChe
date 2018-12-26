package org.xtext.projection.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCustomTerminalsLexer extends Lexer {
    public static final int RULE_CHARACTER=16;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_QUESTION_LINE_COMMENT=13;
    public static final int RULE_GOOD_LINE_COMMENT=14;
    public static final int RULE_TIME=4;
    public static final int EOF=-1;
    public static final int RULE_REGION_COMMENT=15;
    public static final int RULE_CAMELCASE_IDENTIFIER=5;
    public static final int RULE_ID=17;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_LINE_COMMENT2=11;
    public static final int RULE_ALERT_LINE_COMMENT=12;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_LINE_COMMENT=10;

    // delegates
    // delegators

    public InternalCustomTerminalsLexer() {;} 
    public InternalCustomTerminalsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCustomTerminalsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCustomTerminals.g"; }

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:147:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCustomTerminals.g:147:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCustomTerminals.g:147:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCustomTerminals.g:147:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
            // InternalCustomTerminals.g:149:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCustomTerminals.g:149:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCustomTerminals.g:149:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCustomTerminals.g:149:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // InternalCustomTerminals.g:149:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCustomTerminals.g:149:41: ( '\\r' )? '\\n'
                    {
                    // InternalCustomTerminals.g:149:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCustomTerminals.g:149:41: '\\r'
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
            // InternalCustomTerminals.g:151:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCustomTerminals.g:151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCustomTerminals.g:151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCustomTerminals.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:153:19: ( '--' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalCustomTerminals.g:153:21: '--' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("--"); 

            // InternalCustomTerminals.g:153:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCustomTerminals.g:153:26: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_LINE_COMMENT2"
    public final void mRULE_LINE_COMMENT2() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:155:20: ( '//' (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )? (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalCustomTerminals.g:155:22: '//' (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )? (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//"); 

            // InternalCustomTerminals.g:155:27: (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<=' ')||(LA7_0>='\"' && LA7_0<='<')||LA7_0=='>'||(LA7_0>='@' && LA7_0<='\uFFFF')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCustomTerminals.g:155:27: ~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<=' ')||(input.LA(1)>='\"' && input.LA(1)<='<')||input.LA(1)=='>'||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalCustomTerminals.g:155:55: (~ ( ( '\\r' | '\\n' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCustomTerminals.g:155:55: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT2"

    // $ANTLR start "RULE_ALERT_LINE_COMMENT"
    public final void mRULE_ALERT_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ALERT_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:157:25: ( '//!' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalCustomTerminals.g:157:27: '//!' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//!"); 

            // InternalCustomTerminals.g:157:33: (~ ( ( '\\r' | '\\n' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCustomTerminals.g:157:33: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALERT_LINE_COMMENT"

    // $ANTLR start "RULE_QUESTION_LINE_COMMENT"
    public final void mRULE_QUESTION_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_QUESTION_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:159:28: ( '//?' ( '\\r' | '\\n' )* )
            // InternalCustomTerminals.g:159:30: '//?' ( '\\r' | '\\n' )*
            {
            match("//?"); 

            // InternalCustomTerminals.g:159:36: ( '\\r' | '\\n' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCustomTerminals.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION_LINE_COMMENT"

    // $ANTLR start "RULE_GOOD_LINE_COMMENT"
    public final void mRULE_GOOD_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_GOOD_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:161:24: ( '//=' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalCustomTerminals.g:161:26: '//=' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//="); 

            // InternalCustomTerminals.g:161:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCustomTerminals.g:161:32: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOOD_LINE_COMMENT"

    // $ANTLR start "RULE_REGION_COMMENT"
    public final void mRULE_REGION_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_REGION_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:163:21: ( '---' ( '-' )+ ' ' ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+ ( '-' )+ )
            // InternalCustomTerminals.g:163:23: '---' ( '-' )+ ' ' ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+ ( '-' )+
            {
            match("---"); 

            // InternalCustomTerminals.g:163:29: ( '-' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='-') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCustomTerminals.g:163:29: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(' '); 
            // InternalCustomTerminals.g:163:38: ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCustomTerminals.g:163:39: ( 'A' .. 'Z' | '0' .. '9' )+ ' '
            	    {
            	    // InternalCustomTerminals.g:163:39: ( 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalCustomTerminals.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z') ) {
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

            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalCustomTerminals.g:163:66: ( '-' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='-') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCustomTerminals.g:163:66: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGION_COMMENT"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:165:11: ( ( '0' .. '9' )+ ':' ( '0' .. '9' )+ )
            // InternalCustomTerminals.g:165:13: ( '0' .. '9' )+ ':' ( '0' .. '9' )+
            {
            // InternalCustomTerminals.g:165:13: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCustomTerminals.g:165:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            match(':'); 
            // InternalCustomTerminals.g:165:29: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCustomTerminals.g:165:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_CAMELCASE_IDENTIFIER"
    public final void mRULE_CAMELCASE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_CAMELCASE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:167:27: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* )
            // InternalCustomTerminals.g:167:29: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            matchRange('a','z'); 
            // InternalCustomTerminals.g:167:38: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='#' && LA18_0<='$')||(LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCustomTerminals.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAMELCASE_IDENTIFIER"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:169:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalCustomTerminals.g:169:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalCustomTerminals.g:169:16: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCustomTerminals.g:169:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            match('.'); 
            // InternalCustomTerminals.g:169:32: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCustomTerminals.g:169:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_CHARACTER"
    public final void mRULE_CHARACTER() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:171:16: ( '\\'' ~ ( '\\'' ) '\\'' )
            // InternalCustomTerminals.g:171:18: '\\'' ~ ( '\\'' ) '\\''
            {
            match('\''); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:173:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCustomTerminals.g:173:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCustomTerminals.g:173:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCustomTerminals.g:173:11: '^'
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

            // InternalCustomTerminals.g:173:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCustomTerminals.g:
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
            	    break loop22;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:175:10: ( ( '0' .. '9' )+ )
            // InternalCustomTerminals.g:175:12: ( '0' .. '9' )+
            {
            // InternalCustomTerminals.g:175:12: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCustomTerminals.g:175:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalCustomTerminals.g:177:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCustomTerminals.g:177:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCustomTerminals.g:177:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCustomTerminals.g:177:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCustomTerminals.g:177:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCustomTerminals.g:177:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCustomTerminals.g:177:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCustomTerminals.g:177:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCustomTerminals.g:177:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCustomTerminals.g:177:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCustomTerminals.g:177:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop25;
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCustomTerminals.g:179:16: ( . )
            // InternalCustomTerminals.g:179:18: .
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
        // InternalCustomTerminals.g:1:8: ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LINE_COMMENT | RULE_LINE_COMMENT2 | RULE_ALERT_LINE_COMMENT | RULE_QUESTION_LINE_COMMENT | RULE_GOOD_LINE_COMMENT | RULE_REGION_COMMENT | RULE_TIME | RULE_CAMELCASE_IDENTIFIER | RULE_DECIMAL | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt27=17;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalCustomTerminals.g:1:10: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 2 :
                // InternalCustomTerminals.g:1:26: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 3 :
                // InternalCustomTerminals.g:1:42: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 4 :
                // InternalCustomTerminals.g:1:50: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 5 :
                // InternalCustomTerminals.g:1:68: RULE_LINE_COMMENT2
                {
                mRULE_LINE_COMMENT2(); 

                }
                break;
            case 6 :
                // InternalCustomTerminals.g:1:87: RULE_ALERT_LINE_COMMENT
                {
                mRULE_ALERT_LINE_COMMENT(); 

                }
                break;
            case 7 :
                // InternalCustomTerminals.g:1:111: RULE_QUESTION_LINE_COMMENT
                {
                mRULE_QUESTION_LINE_COMMENT(); 

                }
                break;
            case 8 :
                // InternalCustomTerminals.g:1:138: RULE_GOOD_LINE_COMMENT
                {
                mRULE_GOOD_LINE_COMMENT(); 

                }
                break;
            case 9 :
                // InternalCustomTerminals.g:1:161: RULE_REGION_COMMENT
                {
                mRULE_REGION_COMMENT(); 

                }
                break;
            case 10 :
                // InternalCustomTerminals.g:1:181: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 11 :
                // InternalCustomTerminals.g:1:191: RULE_CAMELCASE_IDENTIFIER
                {
                mRULE_CAMELCASE_IDENTIFIER(); 

                }
                break;
            case 12 :
                // InternalCustomTerminals.g:1:217: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 13 :
                // InternalCustomTerminals.g:1:230: RULE_CHARACTER
                {
                mRULE_CHARACTER(); 

                }
                break;
            case 14 :
                // InternalCustomTerminals.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalCustomTerminals.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalCustomTerminals.g:1:262: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalCustomTerminals.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\1\12\1\uffff\1\12\1\17\1\24\2\12\1\uffff\1\12\2\uffff\1\35\1\uffff\1\37\1\uffff\1\17\2\uffff\1\24\5\uffff\4\35\1\uffff\1\37\1\uffff\1\50\1\uffff\1\35\1\51\3\35\1\37\2\uffff\4\37";
    static final String DFA27_eofS =
        "\56\uffff";
    static final String DFA27_minS =
        "\1\0\1\52\1\uffff\1\55\1\56\1\60\1\0\1\101\1\uffff\1\0\2\uffff\1\0\1\uffff\1\55\1\uffff\1\56\2\uffff\1\60\1\uffff\2\0\2\uffff\4\0\1\uffff\1\55\1\uffff\1\0\1\uffff\1\0\1\12\1\0\1\12\1\0\1\40\2\uffff\1\60\1\40\2\55";
    static final String DFA27_maxS =
        "\1\uffff\1\57\1\uffff\1\55\1\72\1\172\1\uffff\1\172\1\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1\55\1\uffff\1\72\2\uffff\1\172\1\uffff\2\uffff\2\uffff\4\uffff\1\uffff\1\55\1\uffff\1\uffff\1\uffff\1\uffff\1\12\1\uffff\1\15\1\uffff\1\55\2\uffff\3\132\1\55";
    static final String DFA27_acceptS =
        "\2\uffff\1\3\5\uffff\1\16\1\uffff\1\21\1\1\1\uffff\1\3\1\uffff\1\17\1\uffff\1\14\1\12\1\uffff\1\13\2\uffff\1\20\1\16\4\uffff\1\2\1\uffff\1\4\1\uffff\1\15\6\uffff\1\15\1\7\4\uffff";
    static final String DFA27_specialS =
        "\1\6\5\uffff\1\12\2\uffff\1\11\2\uffff\1\7\10\uffff\1\2\1\0\2\uffff\1\5\1\10\1\1\1\15\3\uffff\1\13\1\uffff\1\3\1\uffff\1\14\1\uffff\1\4\7\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\12\2\2\2\12\1\2\22\12\1\2\1\12\1\11\4\12\1\6\5\12\1\3\1\12\1\1\12\4\7\12\32\10\3\12\1\7\1\10\1\12\32\5\uff85\12",
            "\1\13\4\uffff\1\14",
            "",
            "\1\16",
            "\1\21\1\uffff\12\20\1\22",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\47\26\1\27\64\26\1\25\uffa3\26",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\0\27",
            "",
            "",
            "\12\34\1\uffff\2\34\1\uffff\23\34\1\31\33\34\1\33\1\34\1\32\uffc0\34",
            "",
            "\1\36",
            "",
            "\1\21\1\uffff\12\20\1\22",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\47\27\1\40\uffd8\27",
            "\47\27\1\41\uffd8\27",
            "",
            "",
            "\12\42\1\uffff\2\42\1\uffff\ufff2\42",
            "\12\44\1\45\2\44\1\43\ufff2\44",
            "\12\46\1\uffff\2\46\1\uffff\ufff2\46",
            "\12\44\1\uffff\2\44\1\uffff\ufff2\44",
            "",
            "\1\47",
            "",
            "\0\27",
            "",
            "\12\42\1\uffff\2\42\1\uffff\ufff2\42",
            "\1\45",
            "\12\44\1\uffff\2\44\1\uffff\ufff2\44",
            "\1\51\2\uffff\1\51",
            "\12\46\1\uffff\2\46\1\uffff\ufff2\46",
            "\1\52\14\uffff\1\47",
            "",
            "",
            "\12\53\7\uffff\32\53",
            "\1\54\17\uffff\12\53\7\uffff\32\53",
            "\1\55\2\uffff\12\53\7\uffff\32\53",
            "\1\55"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LINE_COMMENT | RULE_LINE_COMMENT2 | RULE_ALERT_LINE_COMMENT | RULE_QUESTION_LINE_COMMENT | RULE_GOOD_LINE_COMMENT | RULE_REGION_COMMENT | RULE_TIME | RULE_CAMELCASE_IDENTIFIER | RULE_DECIMAL | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_22 = input.LA(1);

                        s = -1;
                        if ( (LA27_22=='\'') ) {s = 33;}

                        else if ( ((LA27_22>='\u0000' && LA27_22<='&')||(LA27_22>='(' && LA27_22<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_27 = input.LA(1);

                        s = -1;
                        if ( ((LA27_27>='\u0000' && LA27_27<='\t')||(LA27_27>='\u000B' && LA27_27<='\f')||(LA27_27>='\u000E' && LA27_27<='\uFFFF')) ) {s = 38;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_21 = input.LA(1);

                        s = -1;
                        if ( (LA27_21=='\'') ) {s = 32;}

                        else if ( ((LA27_21>='\u0000' && LA27_21<='&')||(LA27_21>='(' && LA27_21<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_34 = input.LA(1);

                        s = -1;
                        if ( ((LA27_34>='\u0000' && LA27_34<='\t')||(LA27_34>='\u000B' && LA27_34<='\f')||(LA27_34>='\u000E' && LA27_34<='\uFFFF')) ) {s = 34;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_38 = input.LA(1);

                        s = -1;
                        if ( ((LA27_38>='\u0000' && LA27_38<='\t')||(LA27_38>='\u000B' && LA27_38<='\f')||(LA27_38>='\u000E' && LA27_38<='\uFFFF')) ) {s = 38;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_25 = input.LA(1);

                        s = -1;
                        if ( ((LA27_25>='\u0000' && LA27_25<='\t')||(LA27_25>='\u000B' && LA27_25<='\f')||(LA27_25>='\u000E' && LA27_25<='\uFFFF')) ) {s = 34;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='/') ) {s = 1;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 2;}

                        else if ( (LA27_0=='-') ) {s = 3;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 4;}

                        else if ( ((LA27_0>='a' && LA27_0<='z')) ) {s = 5;}

                        else if ( (LA27_0=='\'') ) {s = 6;}

                        else if ( (LA27_0=='^') ) {s = 7;}

                        else if ( ((LA27_0>='A' && LA27_0<='Z')||LA27_0=='_') ) {s = 8;}

                        else if ( (LA27_0=='\"') ) {s = 9;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='#' && LA27_0<='&')||(LA27_0>='(' && LA27_0<=',')||LA27_0=='.'||(LA27_0>=':' && LA27_0<='@')||(LA27_0>='[' && LA27_0<=']')||LA27_0=='`'||(LA27_0>='{' && LA27_0<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_12 = input.LA(1);

                        s = -1;
                        if ( (LA27_12=='!') ) {s = 25;}

                        else if ( (LA27_12=='?') ) {s = 26;}

                        else if ( (LA27_12=='=') ) {s = 27;}

                        else if ( ((LA27_12>='\u0000' && LA27_12<='\t')||(LA27_12>='\u000B' && LA27_12<='\f')||(LA27_12>='\u000E' && LA27_12<=' ')||(LA27_12>='\"' && LA27_12<='<')||LA27_12=='>'||(LA27_12>='@' && LA27_12<='\uFFFF')) ) {s = 28;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_26 = input.LA(1);

                        s = -1;
                        if ( (LA27_26=='\r') ) {s = 35;}

                        else if ( ((LA27_26>='\u0000' && LA27_26<='\t')||(LA27_26>='\u000B' && LA27_26<='\f')||(LA27_26>='\u000E' && LA27_26<='\uFFFF')) ) {s = 36;}

                        else if ( (LA27_26=='\n') ) {s = 37;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_9 = input.LA(1);

                        s = -1;
                        if ( ((LA27_9>='\u0000' && LA27_9<='\uFFFF')) ) {s = 23;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_6 = input.LA(1);

                        s = -1;
                        if ( (LA27_6=='\\') ) {s = 21;}

                        else if ( ((LA27_6>='\u0000' && LA27_6<='&')||(LA27_6>='(' && LA27_6<='[')||(LA27_6>=']' && LA27_6<='\uFFFF')) ) {s = 22;}

                        else if ( (LA27_6=='\'') ) {s = 23;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_32 = input.LA(1);

                        s = -1;
                        if ( ((LA27_32>='\u0000' && LA27_32<='\uFFFF')) ) {s = 23;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_36 = input.LA(1);

                        s = -1;
                        if ( ((LA27_36>='\u0000' && LA27_36<='\t')||(LA27_36>='\u000B' && LA27_36<='\f')||(LA27_36>='\u000E' && LA27_36<='\uFFFF')) ) {s = 36;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_28 = input.LA(1);

                        s = -1;
                        if ( ((LA27_28>='\u0000' && LA27_28<='\t')||(LA27_28>='\u000B' && LA27_28<='\f')||(LA27_28>='\u000E' && LA27_28<='\uFFFF')) ) {s = 36;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}