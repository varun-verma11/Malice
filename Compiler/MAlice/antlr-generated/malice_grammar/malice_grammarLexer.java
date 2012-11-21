// $ANTLR 3.4 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-21 18:14:04

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Digit=4;
    public static final int IDENT=5;
    public static final int LETTER=6;
    public static final int NUMBER=7;
    public static final int STRING=8;
    public static final int WS=9;

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
    public String getGrammarFileName() { return "C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g"; }

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            int _type = Digit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:7: ( '0' .. '9' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:8: ( Digit ( Digit )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:10: Digit ( Digit )*
            {
            mDigit(); 


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:16: ( Digit )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    break loop1;
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:20:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:20:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:20:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            	    {
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
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:21:4: ( ( ' ' | '\\t' | '\\n' )+ )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:21:6: ( ' ' | '\\t' | '\\n' )+
            {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:21:6: ( ' ' | '\\t' | '\\n' )+
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
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            	    {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:22:8: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\'' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:22:10: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\''
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

            state.type = _type;
            state.channel = _channel;
        }
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
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:23:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:23:9: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:23:13: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
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
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:8: ( Digit | NUMBER | IDENT | WS | LETTER | STRING )
        int alt5=6;
        switch ( input.LA(1) ) {
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
            int LA5_1 = input.LA(2);

            if ( ((LA5_1 >= '0' && LA5_1 <= '9')) ) {
                alt5=2;
            }
            else {
                alt5=1;
            }
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
            alt5=3;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt5=4;
            }
            break;
        case '\'':
            {
            alt5=5;
            }
            break;
        case '\"':
            {
            alt5=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:10: Digit
                {
                mDigit(); 


                }
                break;
            case 2 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:16: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 3 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:23: IDENT
                {
                mIDENT(); 


                }
                break;
            case 4 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:29: WS
                {
                mWS(); 


                }
                break;
            case 5 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:32: LETTER
                {
                mLETTER(); 


                }
                break;
            case 6 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:1:39: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


 

}