// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-21 12:08:00

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "IDENT", "LETTER", "NUMBER", "STRING", "WS"
    };

    public static final int EOF=-1;
    public static final int Digit=4;
    public static final int IDENT=5;
    public static final int LETTER=6;
    public static final int NUMBER=7;
    public static final int STRING=8;
    public static final int WS=9;

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:1: rule : ( STRING )* ;
    public final void rule() throws RecognitionException {
        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:5: ( ( STRING )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: ( STRING )*
            {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: ( STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:15:7: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_rule38); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_rule38 = new BitSet(new long[]{0x0000000000000102L});

}