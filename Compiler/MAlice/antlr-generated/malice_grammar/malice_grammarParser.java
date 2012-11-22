// $ANTLR 3.4 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-22 09:30:10

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LETTER", "NUMBER", "STRING", "WS", "'!'", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'?'", "'Alice'", "'The'", "'\\'s'", "'^'", "'and'", "'ate'", "'became'", "'because Alice was unsure which'", "'because'", "'but'", "'closed'", "'contained a'", "'drank'", "'either'", "'enough times'", "'eventually'", "'found'", "'had'", "'letter'", "'looking-glass'", "'maybe'", "'number'", "'of'", "'opened'", "'or'", "'perhaps'", "'piece'", "'room'", "'said Alice'", "'sentence'", "'so'", "'spider'", "'spoke'", "'then'", "'too'", "'was a'", "'what was'", "'|'", "'||'", "'~'"
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
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int IDENT=4;
    public static final int LETTER=5;
    public static final int NUMBER=6;
    public static final int STRING=7;
    public static final int WS=8;

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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return malice_grammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g"; }


    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:1: rule : ( STRING )* ;
    public final malice_grammarParser.rule_return rule() throws RecognitionException {
        malice_grammarParser.rule_return retval = new malice_grammarParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING1=null;

        CommonTree STRING1_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:5: ( ( STRING )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:7: ( STRING )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:7: ( STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:17:7: STRING
            	    {
            	    STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_rule57); 
            	    STRING1_tree = 
            	    (CommonTree)adaptor.create(STRING1)
            	    ;
            	    adaptor.addChild(root_0, STRING1_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule"


    public static class lpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:27:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:27:5: ( '(' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:27:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal2=(Token)match(input,14,FOLLOW_14_in_lpar178); 
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lpar"


    public static class rpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal3=null;

        CommonTree char_literal3_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:5: ( ')' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal3=(Token)match(input,15,FOLLOW_15_in_rpar185); 
            char_literal3_tree = 
            (CommonTree)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rpar"


    public static class mono_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mono_op"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:1: mono_op : '~' ;
    public final malice_grammarParser.mono_op_return mono_op() throws RecognitionException {
        malice_grammarParser.mono_op_return retval = new malice_grammarParser.mono_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;

        CommonTree char_literal4_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:9: ( '~' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:11: '~'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal4=(Token)match(input,67,FOLLOW_67_in_mono_op193); 
            char_literal4_tree = 
            (CommonTree)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mono_op"


    public static class bin_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bin_op"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:1: bin_op : ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' );
    public final malice_grammarParser.bin_op_return bin_op() throws RecognitionException {
        malice_grammarParser.bin_op_return retval = new malice_grammarParser.bin_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:8: ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set5=(Token)input.LT(1);

            if ( input.LA(1)==11||input.LA(1)==13||(input.LA(1) >= 16 && input.LA(1) <= 17)||input.LA(1)==19||input.LA(1)==21||input.LA(1)==31||input.LA(1)==65 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set5)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bin_op"


    public static class relational_ops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_ops"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:1: relational_ops : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final malice_grammarParser.relational_ops_return relational_ops() throws RecognitionException {
        malice_grammarParser.relational_ops_return retval = new malice_grammarParser.relational_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:16: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set6=(Token)input.LT(1);

            if ( input.LA(1)==10||(input.LA(1) >= 22 && input.LA(1) <= 26) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set6)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_ops"


    public static class array_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_elem"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:1: array_elem : IDENT '\\'s' atom 'piece' ;
    public final malice_grammarParser.array_elem_return array_elem() throws RecognitionException {
        malice_grammarParser.array_elem_return retval = new malice_grammarParser.array_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT7=null;
        Token string_literal8=null;
        Token string_literal10=null;
        malice_grammarParser.atom_return atom9 =null;


        CommonTree IDENT7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal10_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:12: ( IDENT '\\'s' atom 'piece' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:14: IDENT '\\'s' atom 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem263); 
            IDENT7_tree = 
            (CommonTree)adaptor.create(IDENT7)
            ;
            adaptor.addChild(root_0, IDENT7_tree);


            string_literal8=(Token)match(input,30,FOLLOW_30_in_array_elem265); 
            string_literal8_tree = 
            (CommonTree)adaptor.create(string_literal8)
            ;
            adaptor.addChild(root_0, string_literal8_tree);


            pushFollow(FOLLOW_atom_in_array_elem267);
            atom9=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom9.getTree());

            string_literal10=(Token)match(input,54,FOLLOW_54_in_array_elem269); 
            string_literal10_tree = 
            (CommonTree)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_elem"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:1: atom : ( NUMBER | variable );
    public final malice_grammarParser.atom_return atom() throws RecognitionException {
        malice_grammarParser.atom_return retval = new malice_grammarParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NUMBER11=null;
        malice_grammarParser.variable_return variable12 =null;


        CommonTree NUMBER11_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:5: ( NUMBER | variable )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER) ) {
                alt2=1;
            }
            else if ( (LA2_0==IDENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:7: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom275); 
                    NUMBER11_tree = 
                    (CommonTree)adaptor.create(NUMBER11)
                    ;
                    adaptor.addChild(root_0, NUMBER11_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:16: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_atom279);
                    variable12=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:1: variable : IDENT ;
    public final malice_grammarParser.variable_return variable() throws RecognitionException {
        malice_grammarParser.variable_return retval = new malice_grammarParser.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT13=null;

        CommonTree IDENT13_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:10: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:12: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable286); 
            IDENT13_tree = 
            (CommonTree)adaptor.create(IDENT13)
            ;
            adaptor.addChild(root_0, IDENT13_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class logical_ops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_ops"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:60:1: logical_ops : ( '&&' | '||' | '!' );
    public final malice_grammarParser.logical_ops_return logical_ops() throws RecognitionException {
        malice_grammarParser.logical_ops_return retval = new malice_grammarParser.logical_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:60:13: ( '&&' | '||' | '!' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set14=(Token)input.LT(1);

            if ( input.LA(1)==9||input.LA(1)==12||input.LA(1)==66 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set14)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_ops"


    public static class data_types_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_types"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:1: data_types : ( 'number' | 'letter' | 'sentence' );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set15=null;

        CommonTree set15_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:12: ( 'number' | 'letter' | 'sentence' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set15=(Token)input.LT(1);

            if ( input.LA(1)==46||input.LA(1)==49||input.LA(1)==57 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set15)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_types"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:1: expr : ex ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.ex_return ex16 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:6: ( ex )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:8: ex
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_ex_in_expr377);
            ex16=ex();

            state._fsp--;

            adaptor.addChild(root_0, ex16.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class bracketexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bracketexpr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:1: bracketexpr : lpar expr rpar ;
    public final malice_grammarParser.bracketexpr_return bracketexpr() throws RecognitionException {
        malice_grammarParser.bracketexpr_return retval = new malice_grammarParser.bracketexpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.lpar_return lpar17 =null;

        malice_grammarParser.expr_return expr18 =null;

        malice_grammarParser.rpar_return rpar19 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:13: ( lpar expr rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:15: lpar expr rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_lpar_in_bracketexpr384);
            lpar17=lpar();

            state._fsp--;

            adaptor.addChild(root_0, lpar17.getTree());

            pushFollow(FOLLOW_expr_in_bracketexpr386);
            expr18=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr18.getTree());

            pushFollow(FOLLOW_rpar_in_bracketexpr388);
            rpar19=rpar();

            state._fsp--;

            adaptor.addChild(root_0, rpar19.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bracketexpr"


    public static class ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:1: ex : ( mono_op ex | ( atom | array_elem | bracketexpr ) );
    public final malice_grammarParser.ex_return ex() throws RecognitionException {
        malice_grammarParser.ex_return retval = new malice_grammarParser.ex_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.mono_op_return mono_op20 =null;

        malice_grammarParser.ex_return ex21 =null;

        malice_grammarParser.atom_return atom22 =null;

        malice_grammarParser.array_elem_return array_elem23 =null;

        malice_grammarParser.bracketexpr_return bracketexpr24 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:4: ( mono_op ex | ( atom | array_elem | bracketexpr ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==67) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENT||LA4_0==NUMBER||LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:6: mono_op ex
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mono_op_in_ex396);
                    mono_op20=mono_op();

                    state._fsp--;

                    adaptor.addChild(root_0, mono_op20.getTree());

                    pushFollow(FOLLOW_ex_in_ex398);
                    ex21=ex();

                    state._fsp--;

                    adaptor.addChild(root_0, ex21.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:19: ( atom | array_elem | bracketexpr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:19: ( atom | array_elem | bracketexpr )
                    int alt3=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                        {
                        alt3=1;
                        }
                        break;
                    case IDENT:
                        {
                        int LA3_2 = input.LA(2);

                        if ( (LA3_2==30) ) {
                            alt3=2;
                        }
                        else if ( (LA3_2==10||LA3_2==15||LA3_2==18||LA3_2==20||(LA3_2 >= 22 && LA3_2 <= 26)||LA3_2==32||LA3_2==37||LA3_2==56||(LA3_2 >= 60 && LA3_2 <= 61)) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 14:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }

                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:20: atom
                            {
                            pushFollow(FOLLOW_atom_in_ex403);
                            atom22=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom22.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:27: array_elem
                            {
                            pushFollow(FOLLOW_array_elem_in_ex407);
                            array_elem23=array_elem();

                            state._fsp--;

                            adaptor.addChild(root_0, array_elem23.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:40: bracketexpr
                            {
                            pushFollow(FOLLOW_bracketexpr_in_ex411);
                            bracketexpr24=bracketexpr();

                            state._fsp--;

                            adaptor.addChild(root_0, bracketexpr24.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex"


    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:1: bool_expr : expr relational_ops expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr25 =null;

        malice_grammarParser.relational_ops_return relational_ops26 =null;

        malice_grammarParser.expr_return expr27 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:11: ( expr relational_ops expr )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:13: expr relational_ops expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_bool_expr425);
            expr25=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr25.getTree());

            pushFollow(FOLLOW_relational_ops_in_bool_expr427);
            relational_ops26=relational_ops();

            state._fsp--;

            adaptor.addChild(root_0, relational_ops26.getTree());

            pushFollow(FOLLOW_expr_in_bool_expr429);
            expr27=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr27.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_expr"


    public static class control_structure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_structure"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal28=null;
        Token string_literal32=null;
        Token string_literal34=null;
        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token char_literal59=null;
        malice_grammarParser.lpar_return lpar29 =null;

        malice_grammarParser.bool_expr_return bool_expr30 =null;

        malice_grammarParser.rpar_return rpar31 =null;

        malice_grammarParser.statementList_return statementList33 =null;

        malice_grammarParser.lpar_return lpar35 =null;

        malice_grammarParser.bool_expr_return bool_expr36 =null;

        malice_grammarParser.rpar_return rpar37 =null;

        malice_grammarParser.statementList_return statementList39 =null;

        malice_grammarParser.statementList_return statementList41 =null;

        malice_grammarParser.lpar_return lpar44 =null;

        malice_grammarParser.bool_expr_return bool_expr45 =null;

        malice_grammarParser.rpar_return rpar46 =null;

        malice_grammarParser.statementList_return statementList48 =null;

        malice_grammarParser.statementList_return statementList50 =null;

        malice_grammarParser.lpar_return lpar53 =null;

        malice_grammarParser.bool_expr_return bool_expr54 =null;

        malice_grammarParser.rpar_return rpar55 =null;

        malice_grammarParser.statementList_return statementList57 =null;


        CommonTree string_literal28_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree string_literal34_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree char_literal59_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:3: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.'
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:7: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal28=(Token)match(input,53,FOLLOW_53_in_control_structure442); 
                    string_literal28_tree = 
                    (CommonTree)adaptor.create(string_literal28)
                    ;
                    adaptor.addChild(root_0, string_literal28_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure444);
                    lpar29=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar29.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure446);
                    bool_expr30=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr30.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure448);
                    rpar31=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar31.getTree());

                    string_literal32=(Token)match(input,58,FOLLOW_58_in_control_structure450); 
                    string_literal32_tree = 
                    (CommonTree)adaptor.create(string_literal32)
                    ;
                    adaptor.addChild(root_0, string_literal32_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure457);
                    statementList33=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList33.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:5: ( 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==48) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:6: 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal34=(Token)match(input,48,FOLLOW_48_in_control_structure465); 
                    	    string_literal34_tree = 
                    	    (CommonTree)adaptor.create(string_literal34)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal34_tree);


                    	    pushFollow(FOLLOW_lpar_in_control_structure467);
                    	    lpar35=lpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, lpar35.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure469);
                    	    bool_expr36=bool_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bool_expr36.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure471);
                    	    rpar37=rpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, rpar37.getTree());

                    	    string_literal38=(Token)match(input,58,FOLLOW_58_in_control_structure473); 
                    	    string_literal38_tree = 
                    	    (CommonTree)adaptor.create(string_literal38)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal38_tree);


                    	    pushFollow(FOLLOW_statementList_in_control_structure475);
                    	    statementList39=statementList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statementList39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    string_literal40=(Token)match(input,52,FOLLOW_52_in_control_structure483); 
                    string_literal40_tree = 
                    (CommonTree)adaptor.create(string_literal40)
                    ;
                    adaptor.addChild(root_0, string_literal40_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure485);
                    statementList41=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList41.getTree());

                    string_literal42=(Token)match(input,35,FOLLOW_35_in_control_structure491); 
                    string_literal42_tree = 
                    (CommonTree)adaptor.create(string_literal42)
                    ;
                    adaptor.addChild(root_0, string_literal42_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:8: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal43=(Token)match(input,41,FOLLOW_41_in_control_structure500); 
                    string_literal43_tree = 
                    (CommonTree)adaptor.create(string_literal43)
                    ;
                    adaptor.addChild(root_0, string_literal43_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure502);
                    lpar44=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar44.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure504);
                    bool_expr45=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr45.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure506);
                    rpar46=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar46.getTree());

                    string_literal47=(Token)match(input,58,FOLLOW_58_in_control_structure508); 
                    string_literal47_tree = 
                    (CommonTree)adaptor.create(string_literal47)
                    ;
                    adaptor.addChild(root_0, string_literal47_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure516);
                    statementList48=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList48.getTree());

                    string_literal49=(Token)match(input,52,FOLLOW_52_in_control_structure525); 
                    string_literal49_tree = 
                    (CommonTree)adaptor.create(string_literal49)
                    ;
                    adaptor.addChild(root_0, string_literal49_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure527);
                    statementList50=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList50.getTree());

                    string_literal51=(Token)match(input,35,FOLLOW_35_in_control_structure535); 
                    string_literal51_tree = 
                    (CommonTree)adaptor.create(string_literal51)
                    ;
                    adaptor.addChild(root_0, string_literal51_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough times'
                    {
                    string_literal52=(Token)match(input,43,FOLLOW_43_in_control_structure550); 
                    string_literal52_tree = 
                    (CommonTree)adaptor.create(string_literal52)
                    ;
                    adaptor.addChild(root_0, string_literal52_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure552);
                    lpar53=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar53.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure554);
                    bool_expr54=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr54.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure556);
                    rpar55=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar55.getTree());

                    string_literal56=(Token)match(input,36,FOLLOW_36_in_control_structure558); 
                    string_literal56_tree = 
                    (CommonTree)adaptor.create(string_literal56)
                    ;
                    adaptor.addChild(root_0, string_literal56_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure566);
                    statementList57=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList57.getTree());

                    string_literal58=(Token)match(input,42,FOLLOW_42_in_control_structure574); 
                    string_literal58_tree = 
                    (CommonTree)adaptor.create(string_literal58)
                    ;
                    adaptor.addChild(root_0, string_literal58_tree);


                    }
                    break;

            }


            char_literal59=(Token)match(input,20,FOLLOW_20_in_control_structure582); 
            char_literal59_tree = 
            (CommonTree)adaptor.create(char_literal59)
            ;
            adaptor.addChild(root_0, char_literal59_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control_structure"


    public static class declaration_statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration_statements"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:1: declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT60=null;
        Token string_literal61=null;
        Token string_literal63=null;
        Token string_literal64=null;
        Token LETTER65=null;
        Token STRING66=null;
        Token string_literal68=null;
        malice_grammarParser.data_types_return data_types62 =null;

        malice_grammarParser.expr_return expr67 =null;

        malice_grammarParser.atom_return atom69 =null;

        malice_grammarParser.data_types_return data_types70 =null;


        CommonTree IDENT60_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree LETTER65_tree=null;
        CommonTree STRING66_tree=null;
        CommonTree string_literal68_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:24: ( IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:26: IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT60=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements596); 
            IDENT60_tree = 
            (CommonTree)adaptor.create(IDENT60)
            ;
            adaptor.addChild(root_0, IDENT60_tree);


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:32: ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==63) ) {
                alt9=1;
            }
            else if ( (LA9_0==45) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:34: 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal61=(Token)match(input,63,FOLLOW_63_in_declaration_statements600); 
                    string_literal61_tree = 
                    (CommonTree)adaptor.create(string_literal61)
                    ;
                    adaptor.addChild(root_0, string_literal61_tree);


                    pushFollow(FOLLOW_data_types_in_declaration_statements602);
                    data_types62=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types62.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:53: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==62) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==50) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:55: 'too'
                            {
                            string_literal63=(Token)match(input,62,FOLLOW_62_in_declaration_statements606); 
                            string_literal63_tree = 
                            (CommonTree)adaptor.create(string_literal63)
                            ;
                            adaptor.addChild(root_0, string_literal63_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:63: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal64=(Token)match(input,50,FOLLOW_50_in_declaration_statements610); 
                            string_literal64_tree = 
                            (CommonTree)adaptor.create(string_literal64)
                            ;
                            adaptor.addChild(root_0, string_literal64_tree);


                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:68: ( LETTER | STRING | expr )
                            int alt7=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt7=1;
                                }
                                break;
                            case STRING:
                                {
                                alt7=2;
                                }
                                break;
                            case IDENT:
                            case NUMBER:
                            case 14:
                            case 67:
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
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:69: LETTER
                                    {
                                    LETTER65=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements613); 
                                    LETTER65_tree = 
                                    (CommonTree)adaptor.create(LETTER65)
                                    ;
                                    adaptor.addChild(root_0, LETTER65_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:78: STRING
                                    {
                                    STRING66=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements617); 
                                    STRING66_tree = 
                                    (CommonTree)adaptor.create(STRING66)
                                    ;
                                    adaptor.addChild(root_0, STRING66_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:87: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements621);
                                    expr67=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr67.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:117:35: 'had' atom data_types
                    {
                    string_literal68=(Token)match(input,45,FOLLOW_45_in_declaration_statements661); 
                    string_literal68_tree = 
                    (CommonTree)adaptor.create(string_literal68)
                    ;
                    adaptor.addChild(root_0, string_literal68_tree);


                    pushFollow(FOLLOW_atom_in_declaration_statements663);
                    atom69=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom69.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements665);
                    data_types70=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types70.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration_statements"


    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:1: argument : ( IDENT | NUMBER | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT71=null;
        Token NUMBER72=null;
        Token LETTER73=null;
        Token STRING74=null;
        malice_grammarParser.array_elem_return array_elem75 =null;


        CommonTree IDENT71_tree=null;
        CommonTree NUMBER72_tree=null;
        CommonTree LETTER73_tree=null;
        CommonTree STRING74_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:9: ( IDENT | NUMBER | LETTER | STRING | array_elem )
            int alt10=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==30) ) {
                    alt10=5;
                }
                else if ( (LA10_1==15||LA10_1==18) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt10=2;
                }
                break;
            case LETTER:
                {
                alt10=3;
                }
                break;
            case STRING:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:11: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT71=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument706); 
                    IDENT71_tree = 
                    (CommonTree)adaptor.create(IDENT71)
                    ;
                    adaptor.addChild(root_0, IDENT71_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:19: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER72=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_argument710); 
                    NUMBER72_tree = 
                    (CommonTree)adaptor.create(NUMBER72)
                    ;
                    adaptor.addChild(root_0, NUMBER72_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:28: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER73=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument714); 
                    LETTER73_tree = 
                    (CommonTree)adaptor.create(LETTER73)
                    ;
                    adaptor.addChild(root_0, LETTER73_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_argument718); 
                    STRING74_tree = 
                    (CommonTree)adaptor.create(STRING74)
                    ;
                    adaptor.addChild(root_0, STRING74_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:46: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument722);
                    array_elem75=array_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, array_elem75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class arguments_to_functions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments_to_functions"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal77=null;
        malice_grammarParser.argument_return argument76 =null;

        malice_grammarParser.argument_return argument78 =null;

        malice_grammarParser.function_call_return function_call79 =null;


        CommonTree char_literal77_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==15||LA13_1==18||LA13_1==30) ) {
                    alt13=1;
                }
                else if ( (LA13_1==14) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA13_0 >= LETTER && LA13_0 <= STRING)||LA13_0==15) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0 >= IDENT && LA12_0 <= STRING)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions730);
                            argument76=argument();

                            state._fsp--;

                            adaptor.addChild(root_0, argument76.getTree());

                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:36: ( ',' argument )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==18) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:37: ',' argument
                            	    {
                            	    char_literal77=(Token)match(input,18,FOLLOW_18_in_arguments_to_functions733); 
                            	    char_literal77_tree = 
                            	    (CommonTree)adaptor.create(char_literal77)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal77_tree);


                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions735);
                            	    argument78=argument();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, argument78.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:56: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions743);
                    function_call79=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call79.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments_to_functions"


    public static class rest_statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rest_statements"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:1: rest_statements : ( IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) ) | ( expr | LETTER | STRING ) ( 'spoke' | 'said Alice' ) | 'Alice' 'found' ( expr | LETTER | STRING | function_call ) | function_call ( 'spoke' | 'said Alice' )? | 'what was' IDENT '?' );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT80=null;
        Token string_literal81=null;
        Token string_literal83=null;
        Token string_literal84=null;
        Token LETTER86=null;
        Token STRING87=null;
        Token string_literal89=null;
        Token string_literal90=null;
        Token LETTER92=null;
        Token STRING93=null;
        Token set94=null;
        Token string_literal95=null;
        Token string_literal96=null;
        Token LETTER98=null;
        Token STRING99=null;
        Token set102=null;
        Token string_literal103=null;
        Token IDENT104=null;
        Token char_literal105=null;
        malice_grammarParser.atom_return atom82 =null;

        malice_grammarParser.expr_return expr85 =null;

        malice_grammarParser.function_call_return function_call88 =null;

        malice_grammarParser.expr_return expr91 =null;

        malice_grammarParser.expr_return expr97 =null;

        malice_grammarParser.function_call_return function_call100 =null;

        malice_grammarParser.function_call_return function_call101 =null;


        CommonTree IDENT80_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree LETTER86_tree=null;
        CommonTree STRING87_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree LETTER92_tree=null;
        CommonTree STRING93_tree=null;
        CommonTree set94_tree=null;
        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree LETTER98_tree=null;
        CommonTree STRING99_tree=null;
        CommonTree set102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree IDENT104_tree=null;
        CommonTree char_literal105_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:17: ( IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) ) | ( expr | LETTER | STRING ) ( 'spoke' | 'said Alice' ) | 'Alice' 'found' ( expr | LETTER | STRING | function_call ) | function_call ( 'spoke' | 'said Alice' )? | 'what was' IDENT '?' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA20_5 = input.LA(3);

                    if ( (LA20_5==NUMBER) ) {
                        int LA20_8 = input.LA(4);

                        if ( (LA20_8==54) ) {
                            int LA20_10 = input.LA(5);

                            if ( (LA20_10==56||LA20_10==60) ) {
                                alt20=2;
                            }
                            else if ( ((LA20_10 >= 33 && LA20_10 <= 34)||LA20_10==40) ) {
                                alt20=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 8, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA20_5==IDENT) ) {
                        int LA20_9 = input.LA(4);

                        if ( (LA20_9==54) ) {
                            int LA20_10 = input.LA(5);

                            if ( (LA20_10==56||LA20_10==60) ) {
                                alt20=2;
                            }
                            else if ( ((LA20_10 >= 33 && LA20_10 <= 34)||LA20_10==40) ) {
                                alt20=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 33:
                case 34:
                case 40:
                    {
                    alt20=1;
                    }
                    break;
                case 56:
                case 60:
                    {
                    alt20=2;
                    }
                    break;
                case 14:
                    {
                    alt20=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }

                }
                break;
            case LETTER:
            case NUMBER:
            case STRING:
            case 14:
            case 67:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            case 64:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:7: IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT80=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements758); 
                    IDENT80_tree = 
                    (CommonTree)adaptor.create(IDENT80)
                    ;
                    adaptor.addChild(root_0, IDENT80_tree);


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:9: ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:11: ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:11: ( '\\'s' atom 'piece' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:12: '\\'s' atom 'piece'
                            {
                            string_literal81=(Token)match(input,30,FOLLOW_30_in_rest_statements771); 
                            string_literal81_tree = 
                            (CommonTree)adaptor.create(string_literal81)
                            ;
                            adaptor.addChild(root_0, string_literal81_tree);


                            pushFollow(FOLLOW_atom_in_rest_statements773);
                            atom82=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom82.getTree());

                            string_literal83=(Token)match(input,54,FOLLOW_54_in_rest_statements775); 
                            string_literal83_tree = 
                            (CommonTree)adaptor.create(string_literal83)
                            ;
                            adaptor.addChild(root_0, string_literal83_tree);


                            }
                            break;

                    }


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:13: ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' )
                    int alt16=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt16=1;
                        }
                        break;
                    case 33:
                        {
                        alt16=2;
                        }
                        break;
                    case 40:
                        {
                        alt16=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }

                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:18: 'became' ( expr | LETTER | STRING | function_call )
                            {
                            string_literal84=(Token)match(input,34,FOLLOW_34_in_rest_statements796); 
                            string_literal84_tree = 
                            (CommonTree)adaptor.create(string_literal84)
                            ;
                            adaptor.addChild(root_0, string_literal84_tree);


                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:28: ( expr | LETTER | STRING | function_call )
                            int alt15=4;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case 14:
                            case 67:
                                {
                                alt15=1;
                                }
                                break;
                            case IDENT:
                                {
                                int LA15_2 = input.LA(2);

                                if ( (LA15_2==18||LA15_2==20||LA15_2==30||LA15_2==32||LA15_2==37||LA15_2==61) ) {
                                    alt15=1;
                                }
                                else if ( (LA15_2==14) ) {
                                    alt15=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 2, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case LETTER:
                                {
                                alt15=2;
                                }
                                break;
                            case STRING:
                                {
                                alt15=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;

                            }

                            switch (alt15) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements800);
                                    expr85=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr85.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:36: LETTER
                                    {
                                    LETTER86=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements804); 
                                    LETTER86_tree = 
                                    (CommonTree)adaptor.create(LETTER86)
                                    ;
                                    adaptor.addChild(root_0, LETTER86_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:45: STRING
                                    {
                                    STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements808); 
                                    STRING87_tree = 
                                    (CommonTree)adaptor.create(STRING87)
                                    ;
                                    adaptor.addChild(root_0, STRING87_tree);


                                    }
                                    break;
                                case 4 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:54: function_call
                                    {
                                    pushFollow(FOLLOW_function_call_in_rest_statements812);
                                    function_call88=function_call();

                                    state._fsp--;

                                    adaptor.addChild(root_0, function_call88.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:18: 'ate'
                            {
                            string_literal89=(Token)match(input,33,FOLLOW_33_in_rest_statements833); 
                            string_literal89_tree = 
                            (CommonTree)adaptor.create(string_literal89)
                            ;
                            adaptor.addChild(root_0, string_literal89_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: 'drank'
                            {
                            string_literal90=(Token)match(input,40,FOLLOW_40_in_rest_statements853); 
                            string_literal90_tree = 
                            (CommonTree)adaptor.create(string_literal90)
                            ;
                            adaptor.addChild(root_0, string_literal90_tree);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:7: ( expr | LETTER | STRING ) ( 'spoke' | 'said Alice' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:7: ( expr | LETTER | STRING )
                    int alt17=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUMBER:
                    case 14:
                    case 67:
                        {
                        alt17=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt17=2;
                        }
                        break;
                    case STRING:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:8: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements908);
                            expr91=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr91.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:15: LETTER
                            {
                            LETTER92=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements912); 
                            LETTER92_tree = 
                            (CommonTree)adaptor.create(LETTER92)
                            ;
                            adaptor.addChild(root_0, LETTER92_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:24: STRING
                            {
                            STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements916); 
                            STRING93_tree = 
                            (CommonTree)adaptor.create(STRING93)
                            ;
                            adaptor.addChild(root_0, STRING93_tree);


                            }
                            break;

                    }


                    set94=(Token)input.LT(1);

                    if ( input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set94)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:7: 'Alice' 'found' ( expr | LETTER | STRING | function_call )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal95=(Token)match(input,28,FOLLOW_28_in_rest_statements938); 
                    string_literal95_tree = 
                    (CommonTree)adaptor.create(string_literal95)
                    ;
                    adaptor.addChild(root_0, string_literal95_tree);


                    string_literal96=(Token)match(input,44,FOLLOW_44_in_rest_statements940); 
                    string_literal96_tree = 
                    (CommonTree)adaptor.create(string_literal96)
                    ;
                    adaptor.addChild(root_0, string_literal96_tree);


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:23: ( expr | LETTER | STRING | function_call )
                    int alt18=4;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case 14:
                    case 67:
                        {
                        alt18=1;
                        }
                        break;
                    case IDENT:
                        {
                        int LA18_2 = input.LA(2);

                        if ( (LA18_2==18||LA18_2==20||LA18_2==30||LA18_2==32||LA18_2==37||LA18_2==61) ) {
                            alt18=1;
                        }
                        else if ( (LA18_2==14) ) {
                            alt18=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LETTER:
                        {
                        alt18=2;
                        }
                        break;
                    case STRING:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements943);
                            expr97=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr97.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:31: LETTER
                            {
                            LETTER98=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements947); 
                            LETTER98_tree = 
                            (CommonTree)adaptor.create(LETTER98)
                            ;
                            adaptor.addChild(root_0, LETTER98_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:40: STRING
                            {
                            STRING99=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements951); 
                            STRING99_tree = 
                            (CommonTree)adaptor.create(STRING99)
                            ;
                            adaptor.addChild(root_0, STRING99_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:48: function_call
                            {
                            pushFollow(FOLLOW_function_call_in_rest_statements954);
                            function_call100=function_call();

                            state._fsp--;

                            adaptor.addChild(root_0, function_call100.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:7: function_call ( 'spoke' | 'said Alice' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_rest_statements963);
                    function_call101=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call101.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:21: ( 'spoke' | 'said Alice' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==56||LA19_0==60) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
                            {
                            set102=(Token)input.LT(1);

                            if ( input.LA(1)==56||input.LA(1)==60 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (CommonTree)adaptor.create(set102)
                                );
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:135:7: 'what was' IDENT '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal103=(Token)match(input,64,FOLLOW_64_in_rest_statements980); 
                    string_literal103_tree = 
                    (CommonTree)adaptor.create(string_literal103)
                    ;
                    adaptor.addChild(root_0, string_literal103_tree);


                    IDENT104=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements982); 
                    IDENT104_tree = 
                    (CommonTree)adaptor.create(IDENT104)
                    ;
                    adaptor.addChild(root_0, IDENT104_tree);


                    char_literal105=(Token)match(input,27,FOLLOW_27_in_rest_statements984); 
                    char_literal105_tree = 
                    (CommonTree)adaptor.create(char_literal105)
                    ;
                    adaptor.addChild(root_0, char_literal105_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rest_statements"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name106 =null;

        malice_grammarParser.lpar_return lpar107 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions108 =null;

        malice_grammarParser.rpar_return rpar109 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call996);
            function_name106=function_name();

            state._fsp--;

            adaptor.addChild(root_0, function_name106.getTree());

            pushFollow(FOLLOW_lpar_in_function_call998);
            lpar107=lpar();

            state._fsp--;

            adaptor.addChild(root_0, lpar107.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1000);
            arguments_to_functions108=arguments_to_functions();

            state._fsp--;

            adaptor.addChild(root_0, arguments_to_functions108.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1002);
            rpar109=rpar();

            state._fsp--;

            adaptor.addChild(root_0, rpar109.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:1: statement : ( rest_statements | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements110 =null;

        malice_grammarParser.declaration_statements_return declaration_statements111 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:11: ( rest_statements | declaration_statements )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==14||LA21_1==30||(LA21_1 >= 33 && LA21_1 <= 34)||LA21_1==40||LA21_1==56||LA21_1==60) ) {
                    alt21=1;
                }
                else if ( (LA21_1==45||LA21_1==63) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA21_0 >= LETTER && LA21_0 <= STRING)||LA21_0==14||LA21_0==28||LA21_0==64||LA21_0==67) ) {
                alt21=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rest_statements_in_statement1010);
                    rest_statements110=rest_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, rest_statements110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1014);
                    declaration_statements111=declaration_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_statements111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class statement_conjunctions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement_conjunctions"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:1: statement_conjunctions : ( ',' | 'and' | 'then' | 'but' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set112=null;

        CommonTree set112_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:24: ( ',' | 'and' | 'then' | 'but' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set112=(Token)input.LT(1);

            if ( input.LA(1)==18||input.LA(1)==32||input.LA(1)==37||input.LA(1)==61 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set112)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement_conjunctions"


    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementList"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:1: statementList : ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal119=null;
        malice_grammarParser.control_structure_return control_structure113 =null;

        malice_grammarParser.nested_function_return nested_function114 =null;

        malice_grammarParser.function_return function115 =null;

        malice_grammarParser.statement_return statement116 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions117 =null;

        malice_grammarParser.statement_return statement118 =null;


        CommonTree char_literal119_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:15: ( ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            loop23:
            do {
                int alt23=5;
                switch ( input.LA(1) ) {
                case 41:
                case 43:
                case 53:
                    {
                    alt23=1;
                    }
                    break;
                case 51:
                    {
                    alt23=2;
                    }
                    break;
                case 29:
                    {
                    alt23=3;
                    }
                    break;
                case IDENT:
                case LETTER:
                case NUMBER:
                case STRING:
                case 14:
                case 28:
                case 64:
                case 67:
                    {
                    alt23=4;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:18: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1054);
            	    control_structure113=control_structure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, control_structure113.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:38: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1058);
            	    nested_function114=nested_function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nested_function114.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:56: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1062);
            	    function115=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function115.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:66: statement ( statement_conjunctions statement )* '.'
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList1065);
            	    statement116=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement116.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:76: ( statement_conjunctions statement )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==18||LA22_0==32||LA22_0==37||LA22_0==61) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:77: statement_conjunctions statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1068);
            	    	    statement_conjunctions117=statement_conjunctions();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement_conjunctions117.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1070);
            	    	    statement118=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement118.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);


            	    char_literal119=(Token)match(input,20,FOLLOW_20_in_statementList1074); 
            	    char_literal119_tree = 
            	    (CommonTree)adaptor.create(char_literal119)
            	    ;
            	    adaptor.addChild(root_0, char_literal119_tree);


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statementList"


    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal120=null;
        Token IDENT122=null;
        malice_grammarParser.data_types_return data_types121 =null;


        CommonTree string_literal120_tree=null;
        CommonTree IDENT122_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:11: ( ( 'spider' )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:13: ( 'spider' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:14: 'spider'
                    {
                    string_literal120=(Token)match(input,59,FOLLOW_59_in_parameter1085); 
                    string_literal120_tree = 
                    (CommonTree)adaptor.create(string_literal120)
                    ;
                    adaptor.addChild(root_0, string_literal120_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1089);
            data_types121=data_types();

            state._fsp--;

            adaptor.addChild(root_0, data_types121.getTree());

            IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1091); 
            IDENT122_tree = 
            (CommonTree)adaptor.create(IDENT122)
            ;
            adaptor.addChild(root_0, IDENT122_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal124=null;
        malice_grammarParser.parameter_return parameter123 =null;

        malice_grammarParser.parameter_return parameter125 =null;


        CommonTree char_literal124_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:14: ( parameter ( ',' parameter )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46||LA26_0==49||LA26_0==57||LA26_0==59) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1102);
                    parameter123=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter123.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:25: ( ',' parameter )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:27: ',' parameter
                    	    {
                    	    char_literal124=(Token)match(input,18,FOLLOW_18_in_parameters1106); 
                    	    char_literal124_tree = 
                    	    (CommonTree)adaptor.create(char_literal124)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal124_tree);


                    	    pushFollow(FOLLOW_parameter_in_parameters1108);
                    	    parameter125=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class function_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT126=null;

        CommonTree IDENT126_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1120); 
            IDENT126_tree = 
            (CommonTree)adaptor.create(IDENT126)
            ;
            adaptor.addChild(root_0, IDENT126_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_name"


    public static class nested_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nested_function"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal127=null;
        Token string_literal129=null;
        malice_grammarParser.statementList_return statementList128 =null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal129_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal127=(Token)match(input,51,FOLLOW_51_in_nested_function1128); 
            string_literal127_tree = 
            (CommonTree)adaptor.create(string_literal127)
            ;
            adaptor.addChild(root_0, string_literal127_tree);


            pushFollow(FOLLOW_statementList_in_nested_function1130);
            statementList128=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList128.getTree());

            string_literal129=(Token)match(input,38,FOLLOW_38_in_nested_function1132); 
            string_literal129_tree = 
            (CommonTree)adaptor.create(string_literal129)
            ;
            adaptor.addChild(root_0, string_literal129_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nested_function"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:1: function : 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal136=null;
        Token string_literal141=null;
        Token string_literal143=null;
        Token string_literal145=null;
        malice_grammarParser.function_name_return function_name132 =null;

        malice_grammarParser.lpar_return lpar133 =null;

        malice_grammarParser.parameters_return parameters134 =null;

        malice_grammarParser.rpar_return rpar135 =null;

        malice_grammarParser.function_name_return function_name137 =null;

        malice_grammarParser.lpar_return lpar138 =null;

        malice_grammarParser.parameters_return parameters139 =null;

        malice_grammarParser.rpar_return rpar140 =null;

        malice_grammarParser.data_types_return data_types142 =null;

        malice_grammarParser.statementList_return statementList144 =null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal145_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal130=(Token)match(input,29,FOLLOW_29_in_function1139); 
            string_literal130_tree = 
            (CommonTree)adaptor.create(string_literal130)
            ;
            adaptor.addChild(root_0, string_literal130_tree);


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            else if ( (LA27_0==55) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal131=(Token)match(input,47,FOLLOW_47_in_function1145); 
                    string_literal131_tree = 
                    (CommonTree)adaptor.create(string_literal131)
                    ;
                    adaptor.addChild(root_0, string_literal131_tree);


                    pushFollow(FOLLOW_function_name_in_function1147);
                    function_name132=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name132.getTree());

                    pushFollow(FOLLOW_lpar_in_function1149);
                    lpar133=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar133.getTree());

                    pushFollow(FOLLOW_parameters_in_function1151);
                    parameters134=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters134.getTree());

                    pushFollow(FOLLOW_rpar_in_function1153);
                    rpar135=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar135.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:17: 'room' function_name lpar parameters rpar 'contained a' data_types
                    {
                    string_literal136=(Token)match(input,55,FOLLOW_55_in_function1171); 
                    string_literal136_tree = 
                    (CommonTree)adaptor.create(string_literal136)
                    ;
                    adaptor.addChild(root_0, string_literal136_tree);


                    pushFollow(FOLLOW_function_name_in_function1173);
                    function_name137=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name137.getTree());

                    pushFollow(FOLLOW_lpar_in_function1175);
                    lpar138=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar138.getTree());

                    pushFollow(FOLLOW_parameters_in_function1177);
                    parameters139=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters139.getTree());

                    pushFollow(FOLLOW_rpar_in_function1179);
                    rpar140=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar140.getTree());

                    string_literal141=(Token)match(input,39,FOLLOW_39_in_function1181); 
                    string_literal141_tree = 
                    (CommonTree)adaptor.create(string_literal141)
                    ;
                    adaptor.addChild(root_0, string_literal141_tree);


                    pushFollow(FOLLOW_data_types_in_function1183);
                    data_types142=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types142.getTree());

                    }
                    break;

            }


            string_literal143=(Token)match(input,51,FOLLOW_51_in_function1204); 
            string_literal143_tree = 
            (CommonTree)adaptor.create(string_literal143)
            ;
            adaptor.addChild(root_0, string_literal143_tree);


            pushFollow(FOLLOW_statementList_in_function1211);
            statementList144=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList144.getTree());

            string_literal145=(Token)match(input,38,FOLLOW_38_in_function1218); 
            string_literal145_tree = 
            (CommonTree)adaptor.create(string_literal145)
            ;
            adaptor.addChild(root_0, string_literal145_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class global_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "global_declaration"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal149=null;
        malice_grammarParser.declaration_statements_return declaration_statements146 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions147 =null;

        malice_grammarParser.declaration_statements_return declaration_statements148 =null;


        CommonTree char_literal149_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==IDENT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1232);
            	    declaration_statements146=declaration_statements();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration_statements146.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:46: ( statement_conjunctions declaration_statements )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==18||LA28_0==32||LA28_0==37||LA28_0==61) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1235);
            	    	    statement_conjunctions147=statement_conjunctions();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement_conjunctions147.getTree());

            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1237);
            	    	    declaration_statements148=declaration_statements();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, declaration_statements148.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    char_literal149=(Token)match(input,20,FOLLOW_20_in_global_declaration1241); 
            	    char_literal149_tree = 
            	    (CommonTree)adaptor.create(char_literal149)
            	    ;
            	    adaptor.addChild(root_0, char_literal149_tree);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "global_declaration"


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF152=null;
        malice_grammarParser.global_declaration_return global_declaration150 =null;

        malice_grammarParser.function_return function151 =null;


        CommonTree EOF152_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_global_declaration_in_program1252);
            global_declaration150=global_declaration();

            state._fsp--;

            adaptor.addChild(root_0, global_declaration150.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:30: ( function )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:30: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1254);
            	    function151=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function151.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            EOF152=(Token)match(input,EOF,FOLLOW_EOF_in_program1257); 
            EOF152_tree = 
            (CommonTree)adaptor.create(EOF152)
            ;
            adaptor.addChild(root_0, EOF152_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_rule57 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14_in_lpar178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rpar185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_mono_op193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem263 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_array_elem265 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_array_elem267 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_array_elem269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_atom279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_in_expr377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_bracketexpr384 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bracketexpr386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_bracketexpr388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mono_op_in_ex396 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_ex_in_ex398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_ex403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_ex407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketexpr_in_ex411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr425 = new BitSet(new long[]{0x0000000007C00400L});
    public static final BitSet FOLLOW_relational_ops_in_bool_expr427 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_control_structure442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure444 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure446 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure448 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure450 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure457 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_48_in_control_structure465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure467 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure469 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure471 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure473 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure475 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure483 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure485 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41_in_control_structure500 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure502 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure504 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure506 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure508 = new BitSet(new long[]{0x00380A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure516 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure525 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure527 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43_in_control_structure550 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure552 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure556 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure558 = new BitSet(new long[]{0x00280E00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure566 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure574 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_control_structure582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements596 = new BitSet(new long[]{0x8000200000000000L});
    public static final BitSet FOLLOW_63_in_declaration_statements600 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements602 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_62_in_declaration_statements606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_declaration_statements610 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declaration_statements661 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_declaration_statements663 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_argument706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_argument710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions730 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arguments_to_functions733 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions735 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements758 = new BitSet(new long[]{0x0000010640000000L});
    public static final BitSet FOLLOW_30_in_rest_statements771 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_rest_statements773 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements775 = new BitSet(new long[]{0x0000010600000000L});
    public static final BitSet FOLLOW_34_in_rest_statements796 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rest_statements833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements908 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements912 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_STRING_in_rest_statements916 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_set_in_rest_statements920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rest_statements938 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rest_statements940 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements963 = new BitSet(new long[]{0x1100000000000002L});
    public static final BitSet FOLLOW_64_in_rest_statements980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements982 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rest_statements984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call996 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function_call998 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1000 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function_call1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statementList1054 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_nested_function_in_statementList1058 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_function_in_statementList1062 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1065 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1068 = new BitSet(new long[]{0x00000000100040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1070 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_statementList1074 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_59_in_parameter1085 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1102 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parameters1106 = new BitSet(new long[]{0x0A02400000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1108 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_nested_function1128 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_nested_function1130 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_nested_function1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function1139 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_47_in_function1145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1149 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1151 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1153 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55_in_function1171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1173 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1175 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1179 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1181 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_function1183 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function1204 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_function1211 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_function1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1232 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1237 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_global_declaration1241 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_global_declaration_in_program1252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_function_in_program1254 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_program1257 = new BitSet(new long[]{0x0000000000000002L});

}