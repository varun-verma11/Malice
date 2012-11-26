// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g 2012-11-26 02:10:28

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class malice_grammarLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int LETTER=8;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int IDENT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int WS=6;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=9;

    // delegates
    // delegators

    public malice_grammarLexer() {;} 
    public malice_grammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public malice_grammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:11:7: ( '(' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:12:7: ( ')' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:13:7: ( '\\'s' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:13:9: '\\'s'
            {
            match("'s"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:14:7: ( 'piece' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:14:9: 'piece'
            {
            match("piece"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:15:7: ( 'number' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:15:9: 'number'
            {
            match("number"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:16:7: ( 'letter' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:16:9: 'letter'
            {
            match("letter"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:17:7: ( 'sentence' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:17:9: 'sentence'
            {
            match("sentence"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:18:7: ( '!' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:18:9: '!'
            {
            match('!'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:7: ( '~' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:9: '~'
            {
            match('~'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:20:7: ( '-' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:20:9: '-'
            {
            match('-'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:21:7: ( '+' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:21:9: '+'
            {
            match('+'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:22:7: ( '*' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:22:9: '*'
            {
            match('*'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:23:7: ( '/' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:23:9: '/'
            {
            match('/'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:7: ( '%' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:9: '%'
            {
            match('%'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:25:7: ( '<=' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:25:9: '<='
            {
            match("<="); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:26:7: ( '<' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:26:9: '<'
            {
            match('<'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:7: ( '>' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:9: '>'
            {
            match('>'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:28:7: ( '>=' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:28:9: '>='
            {
            match(">="); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:29:7: ( '==' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:29:9: '=='
            {
            match("=="); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:30:7: ( '!=' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:30:9: '!='
            {
            match("!="); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:31:7: ( '&' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:31:9: '&'
            {
            match('&'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:32:7: ( '^' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:32:9: '^'
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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:33:7: ( '|' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:33:9: '|'
            {
            match('|'); 

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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:34:7: ( '&&' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:34:9: '&&'
            {
            match("&&"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:35:7: ( '||' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:35:9: '||'
            {
            match("||"); 


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
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:36:7: ( 'perhaps' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:36:9: 'perhaps'
            {
            match("perhaps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:37:7: ( 'so' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:37:9: 'so'
            {
            match("so"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:38:7: ( 'or' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:39:7: ( 'maybe' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:39:9: 'maybe'
            {
            match("maybe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:40:7: ( 'because' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:40:9: 'because'
            {
            match("because"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:41:7: ( 'Alice' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:41:9: 'Alice'
            {
            match("Alice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:42:7: ( 'was' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:42:9: 'was'
            {
            match("was"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:43:7: ( 'unsure' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:43:9: 'unsure'
            {
            match("unsure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:44:7: ( 'which' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:44:9: 'which'
            {
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:45:7: ( 'either' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:45:9: 'either'
            {
            match("either"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:46:7: ( 'eventually' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:46:9: 'eventually'
            {
            match("eventually"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:47:7: ( 'enough' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:47:9: 'enough'
            {
            match("enough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:48:7: ( 'times' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:48:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:49:7: ( '.' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:49:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:50:7: ( 'a' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:50:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:51:7: ( 'too' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:51:9: 'too'
            {
            match("too"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:52:7: ( 'of' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:52:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:53:7: ( 'had' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:53:9: 'had'
            {
            match("had"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:54:7: ( ',' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:54:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:55:7: ( 'spoke' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:55:9: 'spoke'
            {
            match("spoke"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:56:7: ( 'said' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:56:9: 'said'
            {
            match("said"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:57:7: ( 'became' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:57:9: 'became'
            {
            match("became"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:58:7: ( 'ate' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:58:9: 'ate'
            {
            match("ate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:59:7: ( 'drank' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:59:9: 'drank'
            {
            match("drank"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:60:7: ( 'found' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:60:9: 'found'
            {
            match("found"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:61:7: ( 'what' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:61:9: 'what'
            {
            match("what"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:62:7: ( '?' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:62:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:63:7: ( 'and' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:63:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:64:7: ( 'then' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:64:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:65:7: ( 'but' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:65:9: 'but'
            {
            match("but"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:66:7: ( 'spider' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:66:9: 'spider'
            {
            match("spider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:67:7: ( 'opened' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:67:9: 'opened'
            {
            match("opened"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:68:7: ( 'closed' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:68:9: 'closed'
            {
            match("closed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:69:7: ( 'The' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:69:9: 'The'
            {
            match("The"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:70:7: ( 'looking' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:70:9: 'looking'
            {
            match("looking"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:71:7: ( 'glass' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:71:9: 'glass'
            {
            match("glass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:72:7: ( 'room' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:72:9: 'room'
            {
            match("room"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:73:7: ( 'contained' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:73:9: 'contained'
            {
            match("contained"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:19:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:20:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:20:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:20:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:21:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:21:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:21:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:
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
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:5: ( '###' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:7: '###' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("###"); 

            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:13: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:13: ~ ( '\\n' | '\\r' )
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
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:27: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:24:27: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:26:8: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\'' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:26:10: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\''
            {
            match('\''); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "LETTER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:9: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:13: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:27:14: ~ ( '\"' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | NUMBER | IDENT | WS | LINE_COMMENT | LETTER | STRING )
        int alt7=69;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:286: T__56
                {
                mT__56(); 

                }
                break;
            case 48 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:292: T__57
                {
                mT__57(); 

                }
                break;
            case 49 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:298: T__58
                {
                mT__58(); 

                }
                break;
            case 50 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:304: T__59
                {
                mT__59(); 

                }
                break;
            case 51 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:310: T__60
                {
                mT__60(); 

                }
                break;
            case 52 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:316: T__61
                {
                mT__61(); 

                }
                break;
            case 53 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:322: T__62
                {
                mT__62(); 

                }
                break;
            case 54 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:328: T__63
                {
                mT__63(); 

                }
                break;
            case 55 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:334: T__64
                {
                mT__64(); 

                }
                break;
            case 56 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:340: T__65
                {
                mT__65(); 

                }
                break;
            case 57 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:346: T__66
                {
                mT__66(); 

                }
                break;
            case 58 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:352: T__67
                {
                mT__67(); 

                }
                break;
            case 59 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:358: T__68
                {
                mT__68(); 

                }
                break;
            case 60 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:364: T__69
                {
                mT__69(); 

                }
                break;
            case 61 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:370: T__70
                {
                mT__70(); 

                }
                break;
            case 62 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:376: T__71
                {
                mT__71(); 

                }
                break;
            case 63 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:382: T__72
                {
                mT__72(); 

                }
                break;
            case 64 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:388: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 65 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:395: IDENT
                {
                mIDENT(); 

                }
                break;
            case 66 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:401: WS
                {
                mWS(); 

                }
                break;
            case 67 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:404: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 68 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:417: LETTER
                {
                mLETTER(); 

                }
                break;
            case 69 :
                // C:\\Users\\Varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\malice_grammar\\malice_grammar.g:1:424: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\4\51\1\71\6\uffff\1\73\1\75\1\uffff\1\77\1\uffff\1\101"+
        "\10\51\1\uffff\1\124\1\51\1\uffff\2\51\1\uffff\4\51\5\uffff\1\135"+
        "\1\uffff\6\51\1\144\2\51\12\uffff\1\150\1\151\20\51\1\uffff\10\51"+
        "\1\uffff\6\51\1\uffff\3\51\2\uffff\3\51\1\u008f\1\51\1\u0091\7\51"+
        "\1\u0099\1\51\1\u009b\1\u009c\1\u009d\4\51\1\u00a2\12\51\1\u00ad"+
        "\3\51\1\uffff\1\51\1\uffff\1\51\1\u00b4\5\51\1\uffff\1\u00ba\3\uffff"+
        "\4\51\1\uffff\1\51\1\u00c0\1\u00c1\5\51\1\u00c7\1\51\1\uffff\1\51"+
        "\1\u00ca\2\51\1\u00cd\1\u00ce\1\uffff\4\51\1\u00d3\1\uffff\1\u00d4"+
        "\1\u00d5\2\51\1\u00d8\2\uffff\1\51\1\u00da\1\u00db\2\51\1\uffff"+
        "\1\u00de\1\u00df\1\uffff\1\51\1\u00e1\2\uffff\1\u00e2\1\u00e3\1"+
        "\51\1\u00e5\3\uffff\1\u00e6\1\51\1\uffff\1\u00e8\2\uffff\1\u00e9"+
        "\1\51\2\uffff\1\u00eb\3\uffff\1\51\2\uffff\1\51\2\uffff\1\u00ee"+
        "\1\uffff\2\51\1\uffff\1\51\1\u00f2\1\u00f3\2\uffff";
    static final String DFA7_eofS =
        "\u00f4\uffff";
    static final String DFA7_minS =
        "\1\11\2\uffff\1\101\1\145\1\165\1\145\1\141\1\75\6\uffff\2\75\1"+
        "\uffff\1\46\1\uffff\1\174\1\146\1\141\1\145\1\154\1\141\1\156\1"+
        "\151\1\150\1\uffff\1\60\1\141\1\uffff\1\162\1\157\1\uffff\1\154"+
        "\1\150\1\154\1\157\5\uffff\1\47\1\uffff\1\145\1\162\1\155\1\164"+
        "\1\157\1\156\1\60\2\151\12\uffff\2\60\1\145\1\171\1\143\1\164\1"+
        "\151\1\163\1\141\1\163\1\164\1\145\1\157\1\155\1\157\2\145\1\144"+
        "\1\uffff\1\144\1\141\1\165\1\157\1\156\1\145\1\141\1\157\1\uffff"+
        "\1\143\1\150\1\142\1\164\1\153\1\164\1\uffff\1\153\2\144\2\uffff"+
        "\1\156\1\142\1\141\1\60\1\143\1\60\1\143\1\164\1\165\1\150\1\156"+
        "\1\165\1\145\1\60\1\156\3\60\2\156\1\163\1\164\1\60\1\163\1\155"+
        "\1\145\1\141\2\145\1\151\3\145\1\60\2\145\1\155\1\uffff\1\145\1"+
        "\uffff\1\150\1\60\1\162\1\145\1\164\1\147\1\163\1\uffff\1\60\3\uffff"+
        "\1\153\1\144\1\145\1\141\1\uffff\1\163\2\60\1\160\2\162\2\156\1"+
        "\60\1\162\1\uffff\1\144\1\60\1\163\1\145\2\60\1\uffff\1\145\1\162"+
        "\1\165\1\150\1\60\1\uffff\2\60\1\144\1\151\1\60\2\uffff\1\163\2"+
        "\60\1\147\1\143\1\uffff\2\60\1\uffff\1\145\1\60\2\uffff\2\60\1\141"+
        "\1\60\3\uffff\1\60\1\156\1\uffff\1\60\2\uffff\1\60\1\145\2\uffff"+
        "\1\60\3\uffff\1\154\2\uffff\1\145\2\uffff\1\60\1\uffff\1\154\1\144"+
        "\1\uffff\1\171\2\60\2\uffff";
    static final String DFA7_maxS =
        "\1\176\2\uffff\1\172\1\151\1\165\1\157\1\160\1\75\6\uffff\2\75"+
        "\1\uffff\1\46\1\uffff\1\174\1\162\1\141\1\165\1\154\1\150\1\156"+
        "\1\166\1\157\1\uffff\1\172\1\141\1\uffff\1\162\1\157\1\uffff\1\157"+
        "\1\150\1\154\1\157\5\uffff\1\47\1\uffff\1\145\1\162\1\155\1\164"+
        "\1\157\1\156\1\172\1\157\1\151\12\uffff\2\172\1\145\1\171\1\143"+
        "\1\164\1\151\1\163\1\151\1\163\1\164\1\145\1\157\1\155\1\157\2\145"+
        "\1\144\1\uffff\1\144\1\141\1\165\1\157\1\156\1\145\1\141\1\157\1"+
        "\uffff\1\143\1\150\1\142\1\164\1\153\1\164\1\uffff\1\153\2\144\2"+
        "\uffff\1\156\1\142\1\141\1\172\1\143\1\172\1\143\1\164\1\165\1\150"+
        "\1\156\1\165\1\145\1\172\1\156\3\172\2\156\1\163\1\164\1\172\1\163"+
        "\1\155\1\145\1\141\2\145\1\151\3\145\1\172\2\145\1\165\1\uffff\1"+
        "\145\1\uffff\1\150\1\172\1\162\1\145\1\164\1\147\1\163\1\uffff\1"+
        "\172\3\uffff\1\153\1\144\1\145\1\141\1\uffff\1\163\2\172\1\160\2"+
        "\162\2\156\1\172\1\162\1\uffff\1\144\1\172\1\163\1\145\2\172\1\uffff"+
        "\1\145\1\162\1\165\1\150\1\172\1\uffff\2\172\1\144\1\151\1\172\2"+
        "\uffff\1\163\2\172\1\147\1\143\1\uffff\2\172\1\uffff\1\145\1\172"+
        "\2\uffff\2\172\1\141\1\172\3\uffff\1\172\1\156\1\uffff\1\172\2\uffff"+
        "\1\172\1\145\2\uffff\1\172\3\uffff\1\154\2\uffff\1\145\2\uffff\1"+
        "\172\1\uffff\1\154\1\144\1\uffff\1\171\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\6\uffff\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff"+
        "\1\23\1\uffff\1\26\11\uffff\1\47\2\uffff\1\54\2\uffff\1\64\4\uffff"+
        "\1\100\1\101\1\102\1\103\1\105\1\uffff\1\104\11\uffff\1\24\1\10"+
        "\1\17\1\20\1\22\1\21\1\30\1\25\1\31\1\27\22\uffff\1\50\10\uffff"+
        "\1\3\6\uffff\1\33\3\uffff\1\34\1\52\45\uffff\1\67\1\uffff\1\40\7"+
        "\uffff\1\51\1\uffff\1\60\1\65\1\53\4\uffff\1\73\12\uffff\1\56\6"+
        "\uffff\1\63\5\uffff\1\66\5\uffff\1\76\1\4\5\uffff\1\55\2\uffff\1"+
        "\35\2\uffff\1\37\1\42\4\uffff\1\46\1\61\1\62\2\uffff\1\75\1\uffff"+
        "\1\5\1\6\2\uffff\1\70\1\71\1\uffff\1\57\1\41\1\43\1\uffff\1\45\1"+
        "\72\1\uffff\1\32\1\74\1\uffff\1\36\2\uffff\1\7\3\uffff\1\77\1\44";
    static final String DFA7_specialS =
        "\u00f4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\10\1\54\1\53\1\uffff\1\16"+
            "\1\22\1\3\1\1\1\2\1\14\1\13\1\40\1\12\1\35\1\15\12\50\2\uffff"+
            "\1\17\1\21\1\20\1\43\1\uffff\1\30\22\51\1\45\6\51\3\uffff\1"+
            "\23\2\uffff\1\36\1\27\1\44\1\41\1\33\1\42\1\46\1\37\3\51\1\6"+
            "\1\26\1\5\1\25\1\4\1\51\1\47\1\7\1\34\1\32\1\51\1\31\3\51\1"+
            "\uffff\1\24\1\uffff\1\11",
            "",
            "",
            "\32\56\6\uffff\22\56\1\55\7\56",
            "\1\60\3\uffff\1\57",
            "\1\61",
            "\1\62\11\uffff\1\63",
            "\1\67\3\uffff\1\64\11\uffff\1\65\1\66",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\74",
            "",
            "\1\76",
            "",
            "\1\100",
            "\1\103\11\uffff\1\104\1\uffff\1\102",
            "\1\105",
            "\1\106\17\uffff\1\107",
            "\1\110",
            "\1\111\6\uffff\1\112",
            "\1\113",
            "\1\114\4\uffff\1\116\7\uffff\1\115",
            "\1\121\1\117\5\uffff\1\120",
            "",
            "\12\51\7\uffff\32\51\6\uffff\15\51\1\123\5\51\1\122\6\51",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "",
            "\1\130\2\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\146\5\uffff\1\145",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\161\7\uffff\1\160",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0090",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u009a",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\7\uffff\1\u00b0",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00cb",
            "\1\u00cc",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00d6",
            "\1\u00d7",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\1\u00d9",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u00e0",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00e4",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00e7",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00ea",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | NUMBER | IDENT | WS | LINE_COMMENT | LETTER | STRING );";
        }
    }
 

}