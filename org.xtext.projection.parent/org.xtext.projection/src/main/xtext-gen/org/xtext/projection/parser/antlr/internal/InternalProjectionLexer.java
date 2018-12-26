package org.xtext.projection.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectionLexer extends Lexer {
    public static final int RULE_CHARACTER=19;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_QUESTION_LINE_COMMENT=16;
    public static final int RULE_GOOD_LINE_COMMENT=17;
    public static final int RULE_TIME=8;
    public static final int EOF=-1;
    public static final int RULE_REGION_COMMENT=18;
    public static final int RULE_CAMELCASE_IDENTIFIER=9;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_LINE_COMMENT2=14;
    public static final int RULE_ALERT_LINE_COMMENT=15;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_LINE_COMMENT=13;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalProjectionLexer() {;} 
    public InternalProjectionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProjectionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalProjection.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjection.g:11:7: ( 'Hi' )
            // InternalProjection.g:11:9: 'Hi'
            {
            match("Hi"); 


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
            // InternalProjection.g:12:7: ( 'Integer:' )
            // InternalProjection.g:12:9: 'Integer:'
            {
            match("Integer:"); 


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
            // InternalProjection.g:13:7: ( 'Decimal:' )
            // InternalProjection.g:13:9: 'Decimal:'
            {
            match("Decimal:"); 


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
            // InternalProjection.g:14:7: ( 'ID:' )
            // InternalProjection.g:14:9: 'ID:'
            {
            match("ID:"); 


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
            // InternalProjection.g:15:7: ( 'Time:' )
            // InternalProjection.g:15:9: 'Time:'
            {
            match("Time:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjection.g:409:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProjection.g:409:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProjection.g:409:24: ( options {greedy=false; } : . )*
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
            	    // InternalProjection.g:409:52: .
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
            // InternalProjection.g:411:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProjection.g:411:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalProjection.g:411:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjection.g:411:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalProjection.g:411:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjection.g:411:41: ( '\\r' )? '\\n'
                    {
                    // InternalProjection.g:411:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalProjection.g:411:41: '\\r'
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
            // InternalProjection.g:413:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProjection.g:413:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProjection.g:413:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalProjection.g:
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
            // InternalProjection.g:415:19: ( '--' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalProjection.g:415:21: '--' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("--"); 

            // InternalProjection.g:415:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjection.g:415:26: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalProjection.g:417:20: ( '//' (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )? (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalProjection.g:417:22: '//' (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )? (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//"); 

            // InternalProjection.g:417:27: (~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<=' ')||(LA7_0>='\"' && LA7_0<='<')||LA7_0=='>'||(LA7_0>='@' && LA7_0<='\uFFFF')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProjection.g:417:27: ~ ( ( '!' | '?' | '=' | '\\r' | '\\n' ) )
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

            // InternalProjection.g:417:55: (~ ( ( '\\r' | '\\n' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProjection.g:417:55: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalProjection.g:419:25: ( '//!' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalProjection.g:419:27: '//!' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//!"); 

            // InternalProjection.g:419:33: (~ ( ( '\\r' | '\\n' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjection.g:419:33: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalProjection.g:421:28: ( '//?' ( '\\r' | '\\n' )* )
            // InternalProjection.g:421:30: '//?' ( '\\r' | '\\n' )*
            {
            match("//?"); 

            // InternalProjection.g:421:36: ( '\\r' | '\\n' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjection.g:
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
            // InternalProjection.g:423:24: ( '//=' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalProjection.g:423:26: '//=' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//="); 

            // InternalProjection.g:423:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProjection.g:423:32: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalProjection.g:425:21: ( '---' ( '-' )+ ' ' ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+ ( '-' )+ )
            // InternalProjection.g:425:23: '---' ( '-' )+ ' ' ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+ ( '-' )+
            {
            match("---"); 

            // InternalProjection.g:425:29: ( '-' )+
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
            	    // InternalProjection.g:425:29: '-'
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
            // InternalProjection.g:425:38: ( ( 'A' .. 'Z' | '0' .. '9' )+ ' ' )+
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
            	    // InternalProjection.g:425:39: ( 'A' .. 'Z' | '0' .. '9' )+ ' '
            	    {
            	    // InternalProjection.g:425:39: ( 'A' .. 'Z' | '0' .. '9' )+
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
            	    	    // InternalProjection.g:
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

            // InternalProjection.g:425:66: ( '-' )+
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
            	    // InternalProjection.g:425:66: '-'
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
            // InternalProjection.g:427:11: ( ( '0' .. '9' )+ ':' ( '0' .. '9' )+ )
            // InternalProjection.g:427:13: ( '0' .. '9' )+ ':' ( '0' .. '9' )+
            {
            // InternalProjection.g:427:13: ( '0' .. '9' )+
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
            	    // InternalProjection.g:427:14: '0' .. '9'
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
            // InternalProjection.g:427:29: ( '0' .. '9' )+
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
            	    // InternalProjection.g:427:30: '0' .. '9'
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
            // InternalProjection.g:429:27: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* )
            // InternalProjection.g:429:29: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            matchRange('a','z'); 
            // InternalProjection.g:429:38: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='#' && LA18_0<='$')||(LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProjection.g:
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
            // InternalProjection.g:431:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalProjection.g:431:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalProjection.g:431:16: ( '0' .. '9' )+
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
            	    // InternalProjection.g:431:17: '0' .. '9'
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
            // InternalProjection.g:431:32: ( '0' .. '9' )+
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
            	    // InternalProjection.g:431:33: '0' .. '9'
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
            // InternalProjection.g:433:16: ( '\\'' ~ ( '\\'' ) '\\'' )
            // InternalProjection.g:433:18: '\\'' ~ ( '\\'' ) '\\''
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
            // InternalProjection.g:435:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalProjection.g:435:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalProjection.g:435:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProjection.g:435:11: '^'
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

            // InternalProjection.g:435:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalProjection.g:
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
            // InternalProjection.g:437:10: ( ( '0' .. '9' )+ )
            // InternalProjection.g:437:12: ( '0' .. '9' )+
            {
            // InternalProjection.g:437:12: ( '0' .. '9' )+
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
            	    // InternalProjection.g:437:13: '0' .. '9'
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
            // InternalProjection.g:439:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalProjection.g:439:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalProjection.g:439:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalProjection.g:439:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalProjection.g:439:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalProjection.g:439:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjection.g:439:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalProjection.g:439:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalProjection.g:439:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalProjection.g:439:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjection.g:439:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalProjection.g:441:16: ( . )
            // InternalProjection.g:441:18: .
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
        // InternalProjection.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LINE_COMMENT | RULE_LINE_COMMENT2 | RULE_ALERT_LINE_COMMENT | RULE_QUESTION_LINE_COMMENT | RULE_GOOD_LINE_COMMENT | RULE_REGION_COMMENT | RULE_TIME | RULE_CAMELCASE_IDENTIFIER | RULE_DECIMAL | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt27=22;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalProjection.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalProjection.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalProjection.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalProjection.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalProjection.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalProjection.g:1:40: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 7 :
                // InternalProjection.g:1:56: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // InternalProjection.g:1:72: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // InternalProjection.g:1:80: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 10 :
                // InternalProjection.g:1:98: RULE_LINE_COMMENT2
                {
                mRULE_LINE_COMMENT2(); 

                }
                break;
            case 11 :
                // InternalProjection.g:1:117: RULE_ALERT_LINE_COMMENT
                {
                mRULE_ALERT_LINE_COMMENT(); 

                }
                break;
            case 12 :
                // InternalProjection.g:1:141: RULE_QUESTION_LINE_COMMENT
                {
                mRULE_QUESTION_LINE_COMMENT(); 

                }
                break;
            case 13 :
                // InternalProjection.g:1:168: RULE_GOOD_LINE_COMMENT
                {
                mRULE_GOOD_LINE_COMMENT(); 

                }
                break;
            case 14 :
                // InternalProjection.g:1:191: RULE_REGION_COMMENT
                {
                mRULE_REGION_COMMENT(); 

                }
                break;
            case 15 :
                // InternalProjection.g:1:211: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 16 :
                // InternalProjection.g:1:221: RULE_CAMELCASE_IDENTIFIER
                {
                mRULE_CAMELCASE_IDENTIFIER(); 

                }
                break;
            case 17 :
                // InternalProjection.g:1:247: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 18 :
                // InternalProjection.g:1:260: RULE_CHARACTER
                {
                mRULE_CHARACTER(); 

                }
                break;
            case 19 :
                // InternalProjection.g:1:275: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalProjection.g:1:283: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalProjection.g:1:292: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalProjection.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\4\20\1\16\1\uffff\1\16\1\31\1\36\2\16\1\uffff\1\16\1\uffff\1\42\1\uffff\4\20\1\uffff\1\53\1\uffff\1\55\1\uffff\1\31\2\uffff\1\36\5\uffff\1\20\1\uffff\2\20\4\53\1\uffff\1\55\1\uffff\1\71\1\uffff\3\20\1\53\1\75\3\53\1\55\1\uffff\2\20\2\uffff\1\55\2\20\1\55\2\20\1\55\2\uffff\1\55";
    static final String DFA27_eofS =
        "\110\uffff";
    static final String DFA27_minS =
        "\1\0\1\151\1\104\1\145\1\151\1\52\1\uffff\1\55\1\56\1\60\1\0\1\101\1\uffff\1\0\1\uffff\1\60\1\uffff\1\164\1\72\1\143\1\155\1\uffff\1\0\1\uffff\1\55\1\uffff\1\56\2\uffff\1\60\1\uffff\2\0\2\uffff\1\145\1\uffff\1\151\1\145\4\0\1\uffff\1\55\1\uffff\1\0\1\uffff\1\147\1\155\1\72\1\0\1\12\1\0\1\12\1\0\1\40\1\uffff\1\145\1\141\2\uffff\1\60\1\162\1\154\1\40\2\72\1\55\2\uffff\1\55";
    static final String DFA27_maxS =
        "\1\uffff\1\151\1\156\1\145\1\151\1\57\1\uffff\1\55\1\72\1\172\1\uffff\1\172\1\uffff\1\uffff\1\uffff\1\172\1\uffff\1\164\1\72\1\143\1\155\1\uffff\1\uffff\1\uffff\1\55\1\uffff\1\72\2\uffff\1\172\1\uffff\2\uffff\2\uffff\1\145\1\uffff\1\151\1\145\4\uffff\1\uffff\1\55\1\uffff\1\uffff\1\uffff\1\147\1\155\1\72\1\uffff\1\12\1\uffff\1\15\1\uffff\1\55\1\uffff\1\145\1\141\2\uffff\1\132\1\162\1\154\1\132\2\72\1\132\2\uffff\1\55";
    static final String DFA27_acceptS =
        "\6\uffff\1\10\5\uffff\1\23\1\uffff\1\26\1\uffff\1\23\4\uffff\1\6\1\uffff\1\10\1\uffff\1\24\1\uffff\1\21\1\17\1\uffff\1\20\2\uffff\1\25\1\1\1\uffff\1\4\6\uffff\1\7\1\uffff\1\11\1\uffff\1\22\11\uffff\1\22\2\uffff\1\5\1\14\7\uffff\1\2\1\3\1\uffff";
    static final String DFA27_specialS =
        "\1\15\11\uffff\1\1\2\uffff\1\10\10\uffff\1\14\10\uffff\1\13\1\2\6\uffff\1\7\1\3\1\0\1\6\3\uffff\1\4\4\uffff\1\11\1\uffff\1\5\1\uffff\1\12\20\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\16\2\6\2\16\1\6\22\16\1\6\1\16\1\15\4\16\1\12\5\16\1\7\1\16\1\5\12\10\7\16\3\14\1\3\3\14\1\1\1\2\12\14\1\4\6\14\3\16\1\13\1\14\1\16\32\11\uff85\16",
            "\1\17",
            "\1\22\51\uffff\1\21",
            "\1\23",
            "\1\24",
            "\1\25\4\uffff\1\26",
            "",
            "\1\30",
            "\1\33\1\uffff\12\32\1\34",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\47\40\1\41\64\40\1\37\uffa3\40",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\0\41",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\12\52\1\uffff\2\52\1\uffff\23\52\1\47\33\52\1\51\1\52\1\50\uffc0\52",
            "",
            "\1\54",
            "",
            "\1\33\1\uffff\12\32\1\34",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\47\41\1\56\uffd8\41",
            "\47\41\1\57\uffd8\41",
            "",
            "",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\12\63\1\uffff\2\63\1\uffff\ufff2\63",
            "\12\65\1\66\2\65\1\64\ufff2\65",
            "\12\67\1\uffff\2\67\1\uffff\ufff2\67",
            "\12\65\1\uffff\2\65\1\uffff\ufff2\65",
            "",
            "\1\70",
            "",
            "\0\41",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\63\1\uffff\2\63\1\uffff\ufff2\63",
            "\1\66",
            "\12\65\1\uffff\2\65\1\uffff\ufff2\65",
            "\1\75\2\uffff\1\75",
            "\12\67\1\uffff\2\67\1\uffff\ufff2\67",
            "\1\76\14\uffff\1\70",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "\12\101\7\uffff\32\101",
            "\1\102",
            "\1\103",
            "\1\104\17\uffff\12\101\7\uffff\32\101",
            "\1\105",
            "\1\106",
            "\1\107\2\uffff\12\101\7\uffff\32\101",
            "",
            "",
            "\1\107"
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
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LINE_COMMENT | RULE_LINE_COMMENT2 | RULE_ALERT_LINE_COMMENT | RULE_QUESTION_LINE_COMMENT | RULE_GOOD_LINE_COMMENT | RULE_REGION_COMMENT | RULE_TIME | RULE_CAMELCASE_IDENTIFIER | RULE_DECIMAL | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_41 = input.LA(1);

                        s = -1;
                        if ( ((LA27_41>='\u0000' && LA27_41<='\t')||(LA27_41>='\u000B' && LA27_41<='\f')||(LA27_41>='\u000E' && LA27_41<='\uFFFF')) ) {s = 55;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_10 = input.LA(1);

                        s = -1;
                        if ( (LA27_10=='\\') ) {s = 31;}

                        else if ( ((LA27_10>='\u0000' && LA27_10<='&')||(LA27_10>='(' && LA27_10<='[')||(LA27_10>=']' && LA27_10<='\uFFFF')) ) {s = 32;}

                        else if ( (LA27_10=='\'') ) {s = 33;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_32 = input.LA(1);

                        s = -1;
                        if ( (LA27_32=='\'') ) {s = 47;}

                        else if ( ((LA27_32>='\u0000' && LA27_32<='&')||(LA27_32>='(' && LA27_32<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_40 = input.LA(1);

                        s = -1;
                        if ( (LA27_40=='\r') ) {s = 52;}

                        else if ( ((LA27_40>='\u0000' && LA27_40<='\t')||(LA27_40>='\u000B' && LA27_40<='\f')||(LA27_40>='\u000E' && LA27_40<='\uFFFF')) ) {s = 53;}

                        else if ( (LA27_40=='\n') ) {s = 54;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_46 = input.LA(1);

                        s = -1;
                        if ( ((LA27_46>='\u0000' && LA27_46<='\uFFFF')) ) {s = 33;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_53 = input.LA(1);

                        s = -1;
                        if ( ((LA27_53>='\u0000' && LA27_53<='\t')||(LA27_53>='\u000B' && LA27_53<='\f')||(LA27_53>='\u000E' && LA27_53<='\uFFFF')) ) {s = 53;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_42 = input.LA(1);

                        s = -1;
                        if ( ((LA27_42>='\u0000' && LA27_42<='\t')||(LA27_42>='\u000B' && LA27_42<='\f')||(LA27_42>='\u000E' && LA27_42<='\uFFFF')) ) {s = 53;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_39 = input.LA(1);

                        s = -1;
                        if ( ((LA27_39>='\u0000' && LA27_39<='\t')||(LA27_39>='\u000B' && LA27_39<='\f')||(LA27_39>='\u000E' && LA27_39<='\uFFFF')) ) {s = 51;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_13 = input.LA(1);

                        s = -1;
                        if ( ((LA27_13>='\u0000' && LA27_13<='\uFFFF')) ) {s = 33;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_51 = input.LA(1);

                        s = -1;
                        if ( ((LA27_51>='\u0000' && LA27_51<='\t')||(LA27_51>='\u000B' && LA27_51<='\f')||(LA27_51>='\u000E' && LA27_51<='\uFFFF')) ) {s = 51;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_55 = input.LA(1);

                        s = -1;
                        if ( ((LA27_55>='\u0000' && LA27_55<='\t')||(LA27_55>='\u000B' && LA27_55<='\f')||(LA27_55>='\u000E' && LA27_55<='\uFFFF')) ) {s = 55;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_31 = input.LA(1);

                        s = -1;
                        if ( (LA27_31=='\'') ) {s = 46;}

                        else if ( ((LA27_31>='\u0000' && LA27_31<='&')||(LA27_31>='(' && LA27_31<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_22 = input.LA(1);

                        s = -1;
                        if ( (LA27_22=='!') ) {s = 39;}

                        else if ( (LA27_22=='?') ) {s = 40;}

                        else if ( (LA27_22=='=') ) {s = 41;}

                        else if ( ((LA27_22>='\u0000' && LA27_22<='\t')||(LA27_22>='\u000B' && LA27_22<='\f')||(LA27_22>='\u000E' && LA27_22<=' ')||(LA27_22>='\"' && LA27_22<='<')||LA27_22=='>'||(LA27_22>='@' && LA27_22<='\uFFFF')) ) {s = 42;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='H') ) {s = 1;}

                        else if ( (LA27_0=='I') ) {s = 2;}

                        else if ( (LA27_0=='D') ) {s = 3;}

                        else if ( (LA27_0=='T') ) {s = 4;}

                        else if ( (LA27_0=='/') ) {s = 5;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 6;}

                        else if ( (LA27_0=='-') ) {s = 7;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 8;}

                        else if ( ((LA27_0>='a' && LA27_0<='z')) ) {s = 9;}

                        else if ( (LA27_0=='\'') ) {s = 10;}

                        else if ( (LA27_0=='^') ) {s = 11;}

                        else if ( ((LA27_0>='A' && LA27_0<='C')||(LA27_0>='E' && LA27_0<='G')||(LA27_0>='J' && LA27_0<='S')||(LA27_0>='U' && LA27_0<='Z')||LA27_0=='_') ) {s = 12;}

                        else if ( (LA27_0=='\"') ) {s = 13;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='#' && LA27_0<='&')||(LA27_0>='(' && LA27_0<=',')||LA27_0=='.'||(LA27_0>=':' && LA27_0<='@')||(LA27_0>='[' && LA27_0<=']')||LA27_0=='`'||(LA27_0>='{' && LA27_0<='\uFFFF')) ) {s = 14;}

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