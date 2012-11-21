<<<<<<< HEAD
// $ANTLR 3.4 /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 14:04:52
=======
// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 13:40:43
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarLexer extends Lexer {
    public static final int EOF=-1;
<<<<<<< HEAD
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int IDENT=4;
    public static final int LETTER=5;
    public static final int NUMBER=6;
    public static final int STRING=7;
    public static final int WS=8;
=======
    public static final int IDENT=4;
    public static final int WS=5;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public malice_grammarLexer() {} 
    public malice_grammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public malice_grammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g"; }

<<<<<<< HEAD
    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:11:6: ( '!' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:11:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:12:7: ( '!=' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:12:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:13:7: ( '%' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:14:7: ( '&&' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:14:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: ( '&' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:16:7: ( '(' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:7: ( ')' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:7: ( '*' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:7: ( '+' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:20:7: ( '-' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:21:7: ( '/' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:21:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:22:7: ( '<' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:23:7: ( '<=' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:23:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:24:7: ( '==' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:24:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:25:7: ( '>' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:26:7: ( '>=' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:26:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:27:7: ( '^' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:27:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:7: ( '|' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:7: ( '||' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:7: ( '~' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
=======
    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:8: ( ( '0' .. '9' )+ )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:10: ( '0' .. '9' )+
            {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:10: ( '0' .. '9' )+
=======
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:6: ( ( 'a' .. 'z' )+ )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:8: ( 'a' .. 'z' )+
            {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:17:8: ( 'a' .. 'z' )+
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
            	    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
=======
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:3: ( ( ' ' | '\\t' | '\\n' )+ )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:5: ( ' ' | '\\t' | '\\n' )+
            {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:18:5: ( ' ' | '\\t' | '\\n' )+
            int cnt2=0;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
<<<<<<< HEAD
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:4: ( ( ' ' | '\\t' | '\\n' )+ )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:6: ( ' ' | '\\t' | '\\n' )+
            {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:6: ( ' ' | '\\t' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
=======
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

<<<<<<< HEAD
    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:20:8: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\'' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:20:10: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }
=======
    public void mTokens() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:8: ( IDENT | WS )
        int alt3=2;
        int LA3_0 = input.LA(1);
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

        if ( ((LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
            alt3=1;
        }
<<<<<<< HEAD
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:21:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:21:9: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:21:13: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | NUMBER | IDENT | WS | LETTER | STRING )
        int alt5=25;
        switch ( input.LA(1) ) {
        case '!':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='=') ) {
                alt5=2;
            }
            else {
                alt5=1;
            }
            }
            break;
        case '%':
            {
            alt5=3;
            }
            break;
        case '&':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='&') ) {
                alt5=4;
            }
            else {
                alt5=5;
            }
            }
            break;
        case '(':
            {
            alt5=6;
            }
            break;
        case ')':
            {
            alt5=7;
            }
            break;
        case '*':
            {
            alt5=8;
            }
            break;
        case '+':
            {
            alt5=9;
            }
            break;
        case '-':
            {
            alt5=10;
            }
            break;
        case '/':
            {
            alt5=11;
            }
            break;
        case '<':
            {
            int LA5_10 = input.LA(2);

            if ( (LA5_10=='=') ) {
                alt5=13;
            }
            else {
                alt5=12;
            }
            }
            break;
        case '=':
            {
            alt5=14;
            }
            break;
        case '>':
            {
            int LA5_12 = input.LA(2);

            if ( (LA5_12=='=') ) {
                alt5=16;
            }
            else {
                alt5=15;
            }
            }
            break;
        case '^':
            {
            alt5=17;
            }
            break;
        case '|':
            {
            int LA5_14 = input.LA(2);

            if ( (LA5_14=='|') ) {
                alt5=19;
            }
            else {
                alt5=18;
            }
            }
            break;
        case '~':
            {
            alt5=20;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=21;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=22;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt5=23;
            }
            break;
        case '\'':
            {
            alt5=24;
            }
            break;
        case '\"':
            {
            alt5=25;
            }
            break;
        default:
=======
        else if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0==' ') ) {
            alt3=2;
        }
        else {
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }
        switch (alt3) {
            case 1 :
<<<<<<< HEAD
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:21: T__11
=======
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:10: IDENT
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
                {
                mT__11(); 


                }
                break;
<<<<<<< HEAD
            case 4 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:27: T__12
=======
            case 2 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:16: WS
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
                {
                mT__12(); 


                }
                break;
<<<<<<< HEAD
            case 5 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:129: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 22 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:136: IDENT
                {
                mIDENT(); 


                }
                break;
            case 23 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:142: WS
                {
                mWS(); 


                }
                break;
            case 24 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:145: LETTER
                {
                mLETTER(); 


                }
                break;
            case 25 :
                // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:1:152: STRING
                {
                mSTRING(); 


                }
                break;
=======
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

        }

    }


 

}