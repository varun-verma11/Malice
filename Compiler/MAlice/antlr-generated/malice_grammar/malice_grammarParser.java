// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 13:40:42

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "WS"
    };

    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;

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
    public String getGrammarFileName() { return "/homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g"; }



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
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_rule38); 

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
    // $ANTLR end "rule"



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


 

    public static final BitSet FOLLOW_IDENT_in_rule38 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule_in_program46 = new BitSet(new long[]{0x0000000000000002L});

}