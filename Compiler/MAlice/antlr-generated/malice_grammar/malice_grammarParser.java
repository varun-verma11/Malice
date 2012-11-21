<<<<<<< HEAD
// $ANTLR 3.4 /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 14:04:51
=======
// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 13:40:42
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LETTER", "NUMBER", "STRING", "WS", "'!'", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'^'", "'|'", "'||'", "'~'"
    };

    public static final int EOF=-1;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "WS"
    };

    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public malice_grammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public malice_grammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return malice_grammarParser.tokenNames; }
    public String getGrammarFileName() { return "/homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g"; }



<<<<<<< HEAD
    // $ANTLR start "atom"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:23:1: atom : ( NUMBER | IDENT ) ;
    public final void atom() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:23:6: ( ( NUMBER | IDENT ) )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==NUMBER ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atom"



    // $ANTLR start "lpar"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:25:1: lpar : '(' ;
    public final void lpar() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:25:6: ( '(' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:25:8: '('
            {
            match(input,14,FOLLOW_14_in_lpar167); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lpar"



    // $ANTLR start "rpar"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:26:1: rpar : ')' ;
    public final void rpar() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:26:6: ( ')' )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:26:8: ')'
            {
            match(input,15,FOLLOW_15_in_rpar174); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rpar"



    // $ANTLR start "term"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:1: term : ( atom | '(' expr ')' );
    public final void term() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:6: ( atom | '(' expr ')' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENT||LA1_0==NUMBER) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:8: atom
                    {
                    pushFollow(FOLLOW_atom_in_term182);
                    atom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:28:15: '(' expr ')'
                    {
                    match(input,14,FOLLOW_14_in_term186); 

                    pushFollow(FOLLOW_expr_in_term188);
                    expr();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_term190); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "unary"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:1: unary : ( '~' | '-' )* term ;
    public final void unary() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:7: ( ( '~' | '-' )* term )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:9: ( '~' | '-' )* term
            {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:29:9: ( '~' | '-' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
            	    if ( input.LA(1)==18||input.LA(1)==28 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary207);
            term();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unary"



    // $ANTLR start "mult"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:1: mult : unary ( ( '*' | '/' | '%' ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:6: ( unary ( ( '*' | '/' | '%' ) unary )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:8: unary ( ( '*' | '/' | '%' ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult215);
            unary();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:14: ( ( '*' | '/' | '%' ) unary )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==16||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:30:15: ( '*' | '/' | '%' ) unary
            	    {
            	    if ( input.LA(1)==11||input.LA(1)==16||input.LA(1)==19 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult230);
            	    unary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:31:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:31:5: ( mult ( ( '+' | '-' ) mult )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:31:7: mult ( ( '+' | '-' ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add240);
            mult();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:31:12: ( ( '+' | '-' ) mult )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 17 && LA4_0 <= 18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:31:13: ( '+' | '-' ) mult
            	    {
            	    if ( (input.LA(1) >= 17 && input.LA(1) <= 18) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add251);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "add"



    // $ANTLR start "bitw_and"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:1: bitw_and : add ( '&' add )* ;
    public final void bitw_and() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:10: ( add ( '&' add )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:12: add ( '&' add )*
            {
            pushFollow(FOLLOW_add_in_bitw_and261);
            add();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:16: ( '&' add )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:17: '&' add
            	    {
            	    match(input,13,FOLLOW_13_in_bitw_and264); 

            	    pushFollow(FOLLOW_add_in_bitw_and266);
            	    add();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bitw_and"



    // $ANTLR start "bitw_xor"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final void bitw_xor() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:10: ( bitw_and ( '^' bitw_and )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:12: bitw_and ( '^' bitw_and )*
            {
            pushFollow(FOLLOW_bitw_and_in_bitw_xor276);
            bitw_and();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:21: ( '^' bitw_and )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:22: '^' bitw_and
            	    {
            	    match(input,25,FOLLOW_25_in_bitw_xor279); 

            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor281);
            	    bitw_and();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bitw_xor"



    // $ANTLR start "bitw_or"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final void bitw_or() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:9: ( bitw_xor ( '|' bitw_xor )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:11: bitw_xor ( '|' bitw_xor )*
            {
            pushFollow(FOLLOW_bitw_xor_in_bitw_or291);
            bitw_xor();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:20: ( '|' bitw_xor )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:21: '|' bitw_xor
            	    {
            	    match(input,26,FOLLOW_26_in_bitw_or294); 

            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or296);
            	    bitw_xor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bitw_or"



    // $ANTLR start "expr"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:36:1: expr : bitw_or ;
    public final void expr() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:36:6: ( bitw_or )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:36:8: bitw_or
            {
            pushFollow(FOLLOW_bitw_or_in_expr307);
            bitw_or();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "bool_term"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:1: bool_term : ( atom | lpar expr rpar );
    public final void bool_term() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:11: ( atom | lpar expr rpar )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT||LA8_0==NUMBER) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:13: atom
                    {
                    pushFollow(FOLLOW_atom_in_bool_term315);
                    atom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:20: lpar expr rpar
                    {
                    pushFollow(FOLLOW_lpar_in_bool_term319);
                    lpar();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_bool_term321);
                    expr();

                    state._fsp--;


                    pushFollow(FOLLOW_rpar_in_bool_term323);
                    rpar();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_term"



    // $ANTLR start "bool_not"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:39:1: bool_not : ( '!' )* bool_term ;
    public final void bool_not() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:39:10: ( ( '!' )* bool_term )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:39:12: ( '!' )* bool_term
            {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:39:12: ( '!' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==9) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:39:12: '!'
            	    {
            	    match(input,9,FOLLOW_9_in_bool_not331); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            pushFollow(FOLLOW_bool_term_in_bool_not334);
            bool_term();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_not"



    // $ANTLR start "bool_comp"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:40:1: bool_comp : bool_not ( ( '<' | '<=' | '>' | '>=' ) bool_not )* ;
    public final void bool_comp() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:40:11: ( bool_not ( ( '<' | '<=' | '>' | '>=' ) bool_not )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:40:13: bool_not ( ( '<' | '<=' | '>' | '>=' ) bool_not )*
            {
            pushFollow(FOLLOW_bool_not_in_bool_comp342);
            bool_not();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:40:22: ( ( '<' | '<=' | '>' | '>=' ) bool_not )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 20 && LA10_0 <= 21)||(LA10_0 >= 23 && LA10_0 <= 24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:40:23: ( '<' | '<=' | '>' | '>=' ) bool_not
            	    {
            	    if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 23 && input.LA(1) <= 24) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bool_not_in_bool_comp361);
            	    bool_not();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_comp"



    // $ANTLR start "bool_eq"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:41:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
    public final void bool_eq() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:41:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:41:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            pushFollow(FOLLOW_bool_comp_in_bool_eq371);
            bool_comp();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:41:21: ( ( '==' | '!=' ) bool_comp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==10||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:41:22: ( '==' | '!=' ) bool_comp
            	    {
            	    if ( input.LA(1)==10||input.LA(1)==22 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bool_comp_in_bool_eq382);
            	    bool_comp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_eq"



    // $ANTLR start "bool_and"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:42:1: bool_and : bool_eq ( '&&' bool_eq )* ;
    public final void bool_and() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:42:10: ( bool_eq ( '&&' bool_eq )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:42:12: bool_eq ( '&&' bool_eq )*
            {
            pushFollow(FOLLOW_bool_eq_in_bool_and392);
            bool_eq();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:42:20: ( '&&' bool_eq )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:42:21: '&&' bool_eq
            	    {
            	    match(input,12,FOLLOW_12_in_bool_and395); 

            	    pushFollow(FOLLOW_bool_eq_in_bool_and397);
            	    bool_eq();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_and"



    // $ANTLR start "bool_or"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:43:1: bool_or : bool_and ( '||' bool_and )* ;
    public final void bool_or() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:43:9: ( bool_and ( '||' bool_and )* )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:43:11: bool_and ( '||' bool_and )*
            {
            pushFollow(FOLLOW_bool_and_in_bool_or407);
            bool_and();

            state._fsp--;


            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:43:20: ( '||' bool_and )*
            loop13:
=======
    // $ANTLR start "rule"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:1: rule : ( IDENT )+ ;
    public final void rule() throws RecognitionException {
        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:5: ( ( IDENT )+ )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: ( IDENT )+
            {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: ( IDENT )+
            int cnt1=0;
            loop1:
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA13_0==27) ) {
                    alt13=1;
=======
                if ( (LA1_0==IDENT) ) {
                    alt1=1;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
                }


                switch (alt13) {
            	case 1 :
<<<<<<< HEAD
            	    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:43:21: '||' bool_and
            	    {
            	    match(input,27,FOLLOW_27_in_bool_or410); 

            	    pushFollow(FOLLOW_bool_and_in_bool_or412);
            	    bool_and();

            	    state._fsp--;

=======
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_rule38); 
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

            	    }
            	    break;

            	default :
<<<<<<< HEAD
            	    break loop13;
=======
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_or"



    // $ANTLR start "bool_expr"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:45:1: bool_expr : bool_or ;
    public final void bool_expr() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:45:11: ( bool_or )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:45:13: bool_or
            {
            pushFollow(FOLLOW_bool_or_in_bool_expr423);
            bool_or();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool_expr"



    // $ANTLR start "program"
    // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:1: program : STRING ;
    public final void program() throws RecognitionException {
        try {
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:8: ( STRING )
            // /homes/mg2111/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:10: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_program527); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "program"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:16:1: program : rule ;
    public final void program() throws RecognitionException {
        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:16:8: ( rule )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:16:10: rule
            {
            pushFollow(FOLLOW_rule_in_program46);
            rule();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"

    // Delegated rules


 

<<<<<<< HEAD
    public static final BitSet FOLLOW_14_in_lpar167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rpar174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_term186 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_expr_in_term188 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_term190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_unary207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult215 = new BitSet(new long[]{0x0000000000090802L});
    public static final BitSet FOLLOW_set_in_mult218 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_unary_in_mult230 = new BitSet(new long[]{0x0000000000090802L});
    public static final BitSet FOLLOW_mult_in_add240 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_add243 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_mult_in_add251 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_add_in_bitw_and261 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_bitw_and264 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_add_in_bitw_and266 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor276 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_bitw_xor279 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor281 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or291 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_bitw_or294 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or296 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_bitw_or_in_expr307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool_term315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_bool_term319 = new BitSet(new long[]{0x0000000010044050L});
    public static final BitSet FOLLOW_expr_in_bool_term321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_bool_term323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_bool_not331 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_term_in_bool_not334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_not_in_bool_comp342 = new BitSet(new long[]{0x0000000001B00002L});
    public static final BitSet FOLLOW_set_in_bool_comp345 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_not_in_bool_comp361 = new BitSet(new long[]{0x0000000001B00002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq371 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_set_in_bool_eq374 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq382 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_bool_eq_in_bool_and392 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_bool_and395 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_eq_in_bool_and397 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_bool_and_in_bool_or407 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_bool_or410 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_and_in_bool_or412 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_bool_or_in_bool_expr423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_program527 = new BitSet(new long[]{0x0000000000000002L});
=======
    public static final BitSet FOLLOW_IDENT_in_rule38 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule_in_program46 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747

}