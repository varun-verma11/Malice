// $ANTLR 3.4 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-22 00:10:07

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:1: ex : ( mono_op ex | ( atom | array_elem | bracketexpr ) ( bin_op ex )* );
    public final malice_grammarParser.ex_return ex() throws RecognitionException {
        malice_grammarParser.ex_return retval = new malice_grammarParser.ex_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.mono_op_return mono_op20 =null;

        malice_grammarParser.ex_return ex21 =null;

        malice_grammarParser.atom_return atom22 =null;

        malice_grammarParser.array_elem_return array_elem23 =null;

        malice_grammarParser.bracketexpr_return bracketexpr24 =null;

        malice_grammarParser.bin_op_return bin_op25 =null;

        malice_grammarParser.ex_return ex26 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:4: ( mono_op ex | ( atom | array_elem | bracketexpr ) ( bin_op ex )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==67) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENT||LA5_0==NUMBER||LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:19: ( atom | array_elem | bracketexpr ) ( bin_op ex )*
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
                        else if ( ((LA3_2 >= 9 && LA3_2 <= 13)||(LA3_2 >= 15 && LA3_2 <= 26)||(LA3_2 >= 31 && LA3_2 <= 32)||LA3_2==37||LA3_2==56||LA3_2==58||(LA3_2 >= 60 && LA3_2 <= 61)||(LA3_2 >= 65 && LA3_2 <= 66)) ) {
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


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:53: ( bin_op ex )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==11||LA4_0==13||(LA4_0 >= 16 && LA4_0 <= 17)||LA4_0==19||LA4_0==21||LA4_0==31||LA4_0==65) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:54: bin_op ex
                    	    {
                    	    pushFollow(FOLLOW_bin_op_in_ex415);
                    	    bin_op25=bin_op();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bin_op25.getTree());

                    	    pushFollow(FOLLOW_ex_in_ex417);
                    	    ex26=ex();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ex26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:1: bool_expr : expr relational_ops expr ( logical_ops expr )* ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr27 =null;

        malice_grammarParser.relational_ops_return relational_ops28 =null;

        malice_grammarParser.expr_return expr29 =null;

        malice_grammarParser.logical_ops_return logical_ops30 =null;

        malice_grammarParser.expr_return expr31 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:11: ( expr relational_ops expr ( logical_ops expr )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:13: expr relational_ops expr ( logical_ops expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_bool_expr436);
            expr27=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr27.getTree());

            pushFollow(FOLLOW_relational_ops_in_bool_expr438);
            relational_ops28=relational_ops();

            state._fsp--;

            adaptor.addChild(root_0, relational_ops28.getTree());

            pushFollow(FOLLOW_expr_in_bool_expr440);
            expr29=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr29.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:38: ( logical_ops expr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==9||LA6_0==12||LA6_0==66) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:39: logical_ops expr
            	    {
            	    pushFollow(FOLLOW_logical_ops_in_bool_expr443);
            	    logical_ops30=logical_ops();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_ops30.getTree());

            	    pushFollow(FOLLOW_expr_in_bool_expr445);
            	    expr31=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "bool_expr"


    public static class control_structure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_structure"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        Token string_literal36=null;
        Token string_literal38=null;
        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal58=null;
        Token string_literal60=null;
        Token char_literal61=null;
        malice_grammarParser.lpar_return lpar33 =null;

        malice_grammarParser.bool_expr_return bool_expr34 =null;

        malice_grammarParser.rpar_return rpar35 =null;

        malice_grammarParser.statementList_return statementList37 =null;

        malice_grammarParser.lpar_return lpar39 =null;

        malice_grammarParser.bool_expr_return bool_expr40 =null;

        malice_grammarParser.rpar_return rpar41 =null;

        malice_grammarParser.statementList_return statementList43 =null;

        malice_grammarParser.statementList_return statementList45 =null;

        malice_grammarParser.bool_expr_return bool_expr48 =null;

        malice_grammarParser.statementList_return statementList50 =null;

        malice_grammarParser.statementList_return statementList52 =null;

        malice_grammarParser.lpar_return lpar55 =null;

        malice_grammarParser.bool_expr_return bool_expr56 =null;

        malice_grammarParser.rpar_return rpar57 =null;

        malice_grammarParser.statementList_return statementList59 =null;


        CommonTree string_literal32_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:3: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.'
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 43:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:7: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal32=(Token)match(input,53,FOLLOW_53_in_control_structure460); 
                    string_literal32_tree = 
                    (CommonTree)adaptor.create(string_literal32)
                    ;
                    adaptor.addChild(root_0, string_literal32_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure462);
                    lpar33=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar33.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure464);
                    bool_expr34=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr34.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure466);
                    rpar35=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar35.getTree());

                    string_literal36=(Token)match(input,58,FOLLOW_58_in_control_structure468); 
                    string_literal36_tree = 
                    (CommonTree)adaptor.create(string_literal36)
                    ;
                    adaptor.addChild(root_0, string_literal36_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure475);
                    statementList37=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList37.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:5: ( 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==48) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:6: 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal38=(Token)match(input,48,FOLLOW_48_in_control_structure483); 
                    	    string_literal38_tree = 
                    	    (CommonTree)adaptor.create(string_literal38)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal38_tree);


                    	    pushFollow(FOLLOW_lpar_in_control_structure485);
                    	    lpar39=lpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, lpar39.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure487);
                    	    bool_expr40=bool_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bool_expr40.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure489);
                    	    rpar41=rpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, rpar41.getTree());

                    	    string_literal42=(Token)match(input,58,FOLLOW_58_in_control_structure491); 
                    	    string_literal42_tree = 
                    	    (CommonTree)adaptor.create(string_literal42)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal42_tree);


                    	    pushFollow(FOLLOW_statementList_in_control_structure493);
                    	    statementList43=statementList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statementList43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    string_literal44=(Token)match(input,52,FOLLOW_52_in_control_structure501); 
                    string_literal44_tree = 
                    (CommonTree)adaptor.create(string_literal44)
                    ;
                    adaptor.addChild(root_0, string_literal44_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure503);
                    statementList45=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList45.getTree());

                    string_literal46=(Token)match(input,35,FOLLOW_35_in_control_structure509); 
                    string_literal46_tree = 
                    (CommonTree)adaptor.create(string_literal46)
                    ;
                    adaptor.addChild(root_0, string_literal46_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:8: 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal47=(Token)match(input,41,FOLLOW_41_in_control_structure518); 
                    string_literal47_tree = 
                    (CommonTree)adaptor.create(string_literal47)
                    ;
                    adaptor.addChild(root_0, string_literal47_tree);


                    pushFollow(FOLLOW_bool_expr_in_control_structure520);
                    bool_expr48=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr48.getTree());

                    string_literal49=(Token)match(input,58,FOLLOW_58_in_control_structure522); 
                    string_literal49_tree = 
                    (CommonTree)adaptor.create(string_literal49)
                    ;
                    adaptor.addChild(root_0, string_literal49_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure530);
                    statementList50=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList50.getTree());

                    string_literal51=(Token)match(input,52,FOLLOW_52_in_control_structure539); 
                    string_literal51_tree = 
                    (CommonTree)adaptor.create(string_literal51)
                    ;
                    adaptor.addChild(root_0, string_literal51_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure541);
                    statementList52=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList52.getTree());

                    string_literal53=(Token)match(input,35,FOLLOW_35_in_control_structure549); 
                    string_literal53_tree = 
                    (CommonTree)adaptor.create(string_literal53)
                    ;
                    adaptor.addChild(root_0, string_literal53_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough times'
                    {
                    string_literal54=(Token)match(input,43,FOLLOW_43_in_control_structure564); 
                    string_literal54_tree = 
                    (CommonTree)adaptor.create(string_literal54)
                    ;
                    adaptor.addChild(root_0, string_literal54_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure566);
                    lpar55=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar55.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure568);
                    bool_expr56=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr56.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure570);
                    rpar57=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar57.getTree());

                    string_literal58=(Token)match(input,36,FOLLOW_36_in_control_structure572); 
                    string_literal58_tree = 
                    (CommonTree)adaptor.create(string_literal58)
                    ;
                    adaptor.addChild(root_0, string_literal58_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure580);
                    statementList59=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList59.getTree());

                    string_literal60=(Token)match(input,42,FOLLOW_42_in_control_structure588); 
                    string_literal60_tree = 
                    (CommonTree)adaptor.create(string_literal60)
                    ;
                    adaptor.addChild(root_0, string_literal60_tree);


                    }
                    break;

            }


            char_literal61=(Token)match(input,20,FOLLOW_20_in_control_structure598); 
            char_literal61_tree = 
            (CommonTree)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


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

        Token IDENT62=null;
        Token string_literal63=null;
        Token string_literal65=null;
        Token string_literal66=null;
        Token LETTER67=null;
        Token STRING68=null;
        Token string_literal70=null;
        malice_grammarParser.data_types_return data_types64 =null;

        malice_grammarParser.expr_return expr69 =null;

        malice_grammarParser.atom_return atom71 =null;

        malice_grammarParser.data_types_return data_types72 =null;


        CommonTree IDENT62_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree LETTER67_tree=null;
        CommonTree STRING68_tree=null;
        CommonTree string_literal70_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:24: ( IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:26: IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements612); 
            IDENT62_tree = 
            (CommonTree)adaptor.create(IDENT62)
            ;
            adaptor.addChild(root_0, IDENT62_tree);


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:32: ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==63) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:34: 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal63=(Token)match(input,63,FOLLOW_63_in_declaration_statements616); 
                    string_literal63_tree = 
                    (CommonTree)adaptor.create(string_literal63)
                    ;
                    adaptor.addChild(root_0, string_literal63_tree);


                    pushFollow(FOLLOW_data_types_in_declaration_statements618);
                    data_types64=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types64.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:53: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==62) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==50) ) {
                        alt10=2;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:55: 'too'
                            {
                            string_literal65=(Token)match(input,62,FOLLOW_62_in_declaration_statements622); 
                            string_literal65_tree = 
                            (CommonTree)adaptor.create(string_literal65)
                            ;
                            adaptor.addChild(root_0, string_literal65_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:63: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal66=(Token)match(input,50,FOLLOW_50_in_declaration_statements626); 
                            string_literal66_tree = 
                            (CommonTree)adaptor.create(string_literal66)
                            ;
                            adaptor.addChild(root_0, string_literal66_tree);


                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:68: ( LETTER | STRING | expr )
                            int alt9=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt9=1;
                                }
                                break;
                            case STRING:
                                {
                                alt9=2;
                                }
                                break;
                            case IDENT:
                            case NUMBER:
                            case 14:
                            case 67:
                                {
                                alt9=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;

                            }

                            switch (alt9) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:69: LETTER
                                    {
                                    LETTER67=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements629); 
                                    LETTER67_tree = 
                                    (CommonTree)adaptor.create(LETTER67)
                                    ;
                                    adaptor.addChild(root_0, LETTER67_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:78: STRING
                                    {
                                    STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements633); 
                                    STRING68_tree = 
                                    (CommonTree)adaptor.create(STRING68)
                                    ;
                                    adaptor.addChild(root_0, STRING68_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:87: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements637);
                                    expr69=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr69.getTree());

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
                    string_literal70=(Token)match(input,45,FOLLOW_45_in_declaration_statements677); 
                    string_literal70_tree = 
                    (CommonTree)adaptor.create(string_literal70)
                    ;
                    adaptor.addChild(root_0, string_literal70_tree);


                    pushFollow(FOLLOW_atom_in_declaration_statements679);
                    atom71=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom71.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements681);
                    data_types72=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types72.getTree());

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

        Token IDENT73=null;
        Token NUMBER74=null;
        Token LETTER75=null;
        Token STRING76=null;
        malice_grammarParser.array_elem_return array_elem77 =null;


        CommonTree IDENT73_tree=null;
        CommonTree NUMBER74_tree=null;
        CommonTree LETTER75_tree=null;
        CommonTree STRING76_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:9: ( IDENT | NUMBER | LETTER | STRING | array_elem )
            int alt12=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==30) ) {
                    alt12=5;
                }
                else if ( (LA12_1==15||LA12_1==18) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt12=2;
                }
                break;
            case LETTER:
                {
                alt12=3;
                }
                break;
            case STRING:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:11: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT73=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument722); 
                    IDENT73_tree = 
                    (CommonTree)adaptor.create(IDENT73)
                    ;
                    adaptor.addChild(root_0, IDENT73_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:19: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER74=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_argument726); 
                    NUMBER74_tree = 
                    (CommonTree)adaptor.create(NUMBER74)
                    ;
                    adaptor.addChild(root_0, NUMBER74_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:28: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER75=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument730); 
                    LETTER75_tree = 
                    (CommonTree)adaptor.create(LETTER75)
                    ;
                    adaptor.addChild(root_0, LETTER75_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING76=(Token)match(input,STRING,FOLLOW_STRING_in_argument734); 
                    STRING76_tree = 
                    (CommonTree)adaptor.create(STRING76)
                    ;
                    adaptor.addChild(root_0, STRING76_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:46: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument738);
                    array_elem77=array_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, array_elem77.getTree());

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

        Token char_literal79=null;
        malice_grammarParser.argument_return argument78 =null;

        malice_grammarParser.argument_return argument80 =null;

        malice_grammarParser.function_call_return function_call81 =null;


        CommonTree char_literal79_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==15||LA15_1==18||LA15_1==30) ) {
                    alt15=1;
                }
                else if ( (LA15_1==14) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA15_0 >= LETTER && LA15_0 <= STRING)||LA15_0==15) ) {
                alt15=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0 >= IDENT && LA14_0 <= STRING)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions746);
                            argument78=argument();

                            state._fsp--;

                            adaptor.addChild(root_0, argument78.getTree());

                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:36: ( ',' argument )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==18) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:37: ',' argument
                            	    {
                            	    char_literal79=(Token)match(input,18,FOLLOW_18_in_arguments_to_functions749); 
                            	    char_literal79_tree = 
                            	    (CommonTree)adaptor.create(char_literal79)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal79_tree);


                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions751);
                            	    argument80=argument();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, argument80.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop13;
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


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions759);
                    function_call81=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call81.getTree());

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

        Token IDENT82=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token string_literal86=null;
        Token LETTER88=null;
        Token STRING89=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token LETTER94=null;
        Token STRING95=null;
        Token set96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        Token LETTER100=null;
        Token STRING101=null;
        Token set104=null;
        Token string_literal105=null;
        Token IDENT106=null;
        Token char_literal107=null;
        malice_grammarParser.atom_return atom84 =null;

        malice_grammarParser.expr_return expr87 =null;

        malice_grammarParser.function_call_return function_call90 =null;

        malice_grammarParser.expr_return expr93 =null;

        malice_grammarParser.expr_return expr99 =null;

        malice_grammarParser.function_call_return function_call102 =null;

        malice_grammarParser.function_call_return function_call103 =null;


        CommonTree IDENT82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree LETTER88_tree=null;
        CommonTree STRING89_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree LETTER94_tree=null;
        CommonTree STRING95_tree=null;
        CommonTree set96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree LETTER100_tree=null;
        CommonTree STRING101_tree=null;
        CommonTree set104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree IDENT106_tree=null;
        CommonTree char_literal107_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:17: ( IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) ) | ( expr | LETTER | STRING ) ( 'spoke' | 'said Alice' ) | 'Alice' 'found' ( expr | LETTER | STRING | function_call ) | function_call ( 'spoke' | 'said Alice' )? | 'what was' IDENT '?' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==NUMBER) ) {
                        int LA22_8 = input.LA(4);

                        if ( (LA22_8==54) ) {
                            int LA22_10 = input.LA(5);

                            if ( (LA22_10==11||LA22_10==13||(LA22_10 >= 16 && LA22_10 <= 17)||LA22_10==19||LA22_10==21||LA22_10==31||LA22_10==56||LA22_10==60||LA22_10==65) ) {
                                alt22=2;
                            }
                            else if ( ((LA22_10 >= 33 && LA22_10 <= 34)||LA22_10==40) ) {
                                alt22=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 8, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA22_5==IDENT) ) {
                        int LA22_9 = input.LA(4);

                        if ( (LA22_9==54) ) {
                            int LA22_10 = input.LA(5);

                            if ( (LA22_10==11||LA22_10==13||(LA22_10 >= 16 && LA22_10 <= 17)||LA22_10==19||LA22_10==21||LA22_10==31||LA22_10==56||LA22_10==60||LA22_10==65) ) {
                                alt22=2;
                            }
                            else if ( ((LA22_10 >= 33 && LA22_10 <= 34)||LA22_10==40) ) {
                                alt22=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 33:
                case 34:
                case 40:
                    {
                    alt22=1;
                    }
                    break;
                case 11:
                case 13:
                case 16:
                case 17:
                case 19:
                case 21:
                case 31:
                case 56:
                case 60:
                case 65:
                    {
                    alt22=2;
                    }
                    break;
                case 14:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

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
                alt22=2;
                }
                break;
            case 28:
                {
                alt22=3;
                }
                break;
            case 64:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:7: IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT82=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements774); 
                    IDENT82_tree = 
                    (CommonTree)adaptor.create(IDENT82)
                    ;
                    adaptor.addChild(root_0, IDENT82_tree);


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:9: ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:11: ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:11: ( '\\'s' atom 'piece' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==30) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:12: '\\'s' atom 'piece'
                            {
                            string_literal83=(Token)match(input,30,FOLLOW_30_in_rest_statements787); 
                            string_literal83_tree = 
                            (CommonTree)adaptor.create(string_literal83)
                            ;
                            adaptor.addChild(root_0, string_literal83_tree);


                            pushFollow(FOLLOW_atom_in_rest_statements789);
                            atom84=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom84.getTree());

                            string_literal85=(Token)match(input,54,FOLLOW_54_in_rest_statements791); 
                            string_literal85_tree = 
                            (CommonTree)adaptor.create(string_literal85)
                            ;
                            adaptor.addChild(root_0, string_literal85_tree);


                            }
                            break;

                    }


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:13: ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt18=1;
                        }
                        break;
                    case 33:
                        {
                        alt18=2;
                        }
                        break;
                    case 40:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:18: 'became' ( expr | LETTER | STRING | function_call )
                            {
                            string_literal86=(Token)match(input,34,FOLLOW_34_in_rest_statements812); 
                            string_literal86_tree = 
                            (CommonTree)adaptor.create(string_literal86)
                            ;
                            adaptor.addChild(root_0, string_literal86_tree);


                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:28: ( expr | LETTER | STRING | function_call )
                            int alt17=4;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case 14:
                            case 67:
                                {
                                alt17=1;
                                }
                                break;
                            case IDENT:
                                {
                                int LA17_2 = input.LA(2);

                                if ( (LA17_2==11||LA17_2==13||(LA17_2 >= 16 && LA17_2 <= 21)||(LA17_2 >= 30 && LA17_2 <= 32)||LA17_2==37||LA17_2==61||LA17_2==65) ) {
                                    alt17=1;
                                }
                                else if ( (LA17_2==14) ) {
                                    alt17=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 2, input);

                                    throw nvae;

                                }
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
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements816);
                                    expr87=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr87.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:36: LETTER
                                    {
                                    LETTER88=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements820); 
                                    LETTER88_tree = 
                                    (CommonTree)adaptor.create(LETTER88)
                                    ;
                                    adaptor.addChild(root_0, LETTER88_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:45: STRING
                                    {
                                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements824); 
                                    STRING89_tree = 
                                    (CommonTree)adaptor.create(STRING89)
                                    ;
                                    adaptor.addChild(root_0, STRING89_tree);


                                    }
                                    break;
                                case 4 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:54: function_call
                                    {
                                    pushFollow(FOLLOW_function_call_in_rest_statements828);
                                    function_call90=function_call();

                                    state._fsp--;

                                    adaptor.addChild(root_0, function_call90.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:18: 'ate'
                            {
                            string_literal91=(Token)match(input,33,FOLLOW_33_in_rest_statements849); 
                            string_literal91_tree = 
                            (CommonTree)adaptor.create(string_literal91)
                            ;
                            adaptor.addChild(root_0, string_literal91_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: 'drank'
                            {
                            string_literal92=(Token)match(input,40,FOLLOW_40_in_rest_statements869); 
                            string_literal92_tree = 
                            (CommonTree)adaptor.create(string_literal92)
                            ;
                            adaptor.addChild(root_0, string_literal92_tree);


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
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUMBER:
                    case 14:
                    case 67:
                        {
                        alt19=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt19=2;
                        }
                        break;
                    case STRING:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }

                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:8: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements924);
                            expr93=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr93.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:15: LETTER
                            {
                            LETTER94=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements928); 
                            LETTER94_tree = 
                            (CommonTree)adaptor.create(LETTER94)
                            ;
                            adaptor.addChild(root_0, LETTER94_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:24: STRING
                            {
                            STRING95=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements932); 
                            STRING95_tree = 
                            (CommonTree)adaptor.create(STRING95)
                            ;
                            adaptor.addChild(root_0, STRING95_tree);


                            }
                            break;

                    }


                    set96=(Token)input.LT(1);

                    if ( input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set96)
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


                    string_literal97=(Token)match(input,28,FOLLOW_28_in_rest_statements954); 
                    string_literal97_tree = 
                    (CommonTree)adaptor.create(string_literal97)
                    ;
                    adaptor.addChild(root_0, string_literal97_tree);


                    string_literal98=(Token)match(input,44,FOLLOW_44_in_rest_statements956); 
                    string_literal98_tree = 
                    (CommonTree)adaptor.create(string_literal98)
                    ;
                    adaptor.addChild(root_0, string_literal98_tree);


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:23: ( expr | LETTER | STRING | function_call )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case 14:
                    case 67:
                        {
                        alt20=1;
                        }
                        break;
                    case IDENT:
                        {
                        int LA20_2 = input.LA(2);

                        if ( (LA20_2==11||LA20_2==13||(LA20_2 >= 16 && LA20_2 <= 21)||(LA20_2 >= 30 && LA20_2 <= 32)||LA20_2==37||LA20_2==61||LA20_2==65) ) {
                            alt20=1;
                        }
                        else if ( (LA20_2==14) ) {
                            alt20=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LETTER:
                        {
                        alt20=2;
                        }
                        break;
                    case STRING:
                        {
                        alt20=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }

                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements959);
                            expr99=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr99.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:31: LETTER
                            {
                            LETTER100=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements963); 
                            LETTER100_tree = 
                            (CommonTree)adaptor.create(LETTER100)
                            ;
                            adaptor.addChild(root_0, LETTER100_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:40: STRING
                            {
                            STRING101=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements967); 
                            STRING101_tree = 
                            (CommonTree)adaptor.create(STRING101)
                            ;
                            adaptor.addChild(root_0, STRING101_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:48: function_call
                            {
                            pushFollow(FOLLOW_function_call_in_rest_statements970);
                            function_call102=function_call();

                            state._fsp--;

                            adaptor.addChild(root_0, function_call102.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:7: function_call ( 'spoke' | 'said Alice' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_rest_statements979);
                    function_call103=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call103.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:21: ( 'spoke' | 'said Alice' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==56||LA21_0==60) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
                            {
                            set104=(Token)input.LT(1);

                            if ( input.LA(1)==56||input.LA(1)==60 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (CommonTree)adaptor.create(set104)
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


                    string_literal105=(Token)match(input,64,FOLLOW_64_in_rest_statements996); 
                    string_literal105_tree = 
                    (CommonTree)adaptor.create(string_literal105)
                    ;
                    adaptor.addChild(root_0, string_literal105_tree);


                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements998); 
                    IDENT106_tree = 
                    (CommonTree)adaptor.create(IDENT106)
                    ;
                    adaptor.addChild(root_0, IDENT106_tree);


                    char_literal107=(Token)match(input,27,FOLLOW_27_in_rest_statements1000); 
                    char_literal107_tree = 
                    (CommonTree)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);


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

        malice_grammarParser.function_name_return function_name108 =null;

        malice_grammarParser.lpar_return lpar109 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions110 =null;

        malice_grammarParser.rpar_return rpar111 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call1012);
            function_name108=function_name();

            state._fsp--;

            adaptor.addChild(root_0, function_name108.getTree());

            pushFollow(FOLLOW_lpar_in_function_call1014);
            lpar109=lpar();

            state._fsp--;

            adaptor.addChild(root_0, lpar109.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1016);
            arguments_to_functions110=arguments_to_functions();

            state._fsp--;

            adaptor.addChild(root_0, arguments_to_functions110.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1018);
            rpar111=rpar();

            state._fsp--;

            adaptor.addChild(root_0, rpar111.getTree());

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

        malice_grammarParser.rest_statements_return rest_statements112 =null;

        malice_grammarParser.declaration_statements_return declaration_statements113 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:11: ( rest_statements | declaration_statements )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==11||(LA23_1 >= 13 && LA23_1 <= 14)||(LA23_1 >= 16 && LA23_1 <= 17)||LA23_1==19||LA23_1==21||(LA23_1 >= 30 && LA23_1 <= 31)||(LA23_1 >= 33 && LA23_1 <= 34)||LA23_1==40||LA23_1==56||LA23_1==60||LA23_1==65) ) {
                    alt23=1;
                }
                else if ( (LA23_1==45||LA23_1==63) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA23_0 >= LETTER && LA23_0 <= STRING)||LA23_0==14||LA23_0==28||LA23_0==64||LA23_0==67) ) {
                alt23=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rest_statements_in_statement1026);
                    rest_statements112=rest_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, rest_statements112.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1030);
                    declaration_statements113=declaration_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_statements113.getTree());

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

        Token set114=null;

        CommonTree set114_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:24: ( ',' | 'and' | 'then' | 'but' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set114=(Token)input.LT(1);

            if ( input.LA(1)==18||input.LA(1)==32||input.LA(1)==37||input.LA(1)==61 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set114)
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

        Token char_literal121=null;
        malice_grammarParser.control_structure_return control_structure115 =null;

        malice_grammarParser.nested_function_return nested_function116 =null;

        malice_grammarParser.function_return function117 =null;

        malice_grammarParser.statement_return statement118 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions119 =null;

        malice_grammarParser.statement_return statement120 =null;


        CommonTree char_literal121_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:15: ( ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            loop25:
            do {
                int alt25=5;
                switch ( input.LA(1) ) {
                case 41:
                case 43:
                case 53:
                    {
                    alt25=1;
                    }
                    break;
                case 51:
                    {
                    alt25=2;
                    }
                    break;
                case 29:
                    {
                    alt25=3;
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
                    alt25=4;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:18: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1070);
            	    control_structure115=control_structure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, control_structure115.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:38: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1074);
            	    nested_function116=nested_function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nested_function116.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:56: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1078);
            	    function117=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function117.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:66: statement ( statement_conjunctions statement )* '.'
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList1081);
            	    statement118=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement118.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:76: ( statement_conjunctions statement )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==18||LA24_0==32||LA24_0==37||LA24_0==61) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:77: statement_conjunctions statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1084);
            	    	    statement_conjunctions119=statement_conjunctions();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement_conjunctions119.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1086);
            	    	    statement120=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement120.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    char_literal121=(Token)match(input,20,FOLLOW_20_in_statementList1090); 
            	    char_literal121_tree = 
            	    (CommonTree)adaptor.create(char_literal121)
            	    ;
            	    adaptor.addChild(root_0, char_literal121_tree);


            	    }
            	    break;

            	default :
            	    break loop25;
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

        Token string_literal122=null;
        Token IDENT124=null;
        malice_grammarParser.data_types_return data_types123 =null;


        CommonTree string_literal122_tree=null;
        CommonTree IDENT124_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:11: ( ( 'spider' )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:13: ( 'spider' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==59) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:14: 'spider'
                    {
                    string_literal122=(Token)match(input,59,FOLLOW_59_in_parameter1101); 
                    string_literal122_tree = 
                    (CommonTree)adaptor.create(string_literal122)
                    ;
                    adaptor.addChild(root_0, string_literal122_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1105);
            data_types123=data_types();

            state._fsp--;

            adaptor.addChild(root_0, data_types123.getTree());

            IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1107); 
            IDENT124_tree = 
            (CommonTree)adaptor.create(IDENT124)
            ;
            adaptor.addChild(root_0, IDENT124_tree);


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

        Token char_literal126=null;
        malice_grammarParser.parameter_return parameter125 =null;

        malice_grammarParser.parameter_return parameter127 =null;


        CommonTree char_literal126_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:14: ( parameter ( ',' parameter )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46||LA28_0==49||LA28_0==57||LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1118);
                    parameter125=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter125.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:25: ( ',' parameter )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:27: ',' parameter
                    	    {
                    	    char_literal126=(Token)match(input,18,FOLLOW_18_in_parameters1122); 
                    	    char_literal126_tree = 
                    	    (CommonTree)adaptor.create(char_literal126)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal126_tree);


                    	    pushFollow(FOLLOW_parameter_in_parameters1124);
                    	    parameter127=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter127.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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

        Token IDENT128=null;

        CommonTree IDENT128_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT128=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1136); 
            IDENT128_tree = 
            (CommonTree)adaptor.create(IDENT128)
            ;
            adaptor.addChild(root_0, IDENT128_tree);


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

        Token string_literal129=null;
        Token string_literal131=null;
        malice_grammarParser.statementList_return statementList130 =null;


        CommonTree string_literal129_tree=null;
        CommonTree string_literal131_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal129=(Token)match(input,51,FOLLOW_51_in_nested_function1144); 
            string_literal129_tree = 
            (CommonTree)adaptor.create(string_literal129)
            ;
            adaptor.addChild(root_0, string_literal129_tree);


            pushFollow(FOLLOW_statementList_in_nested_function1146);
            statementList130=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList130.getTree());

            string_literal131=(Token)match(input,38,FOLLOW_38_in_nested_function1148); 
            string_literal131_tree = 
            (CommonTree)adaptor.create(string_literal131)
            ;
            adaptor.addChild(root_0, string_literal131_tree);


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

        Token string_literal132=null;
        Token string_literal133=null;
        Token string_literal138=null;
        Token string_literal143=null;
        Token string_literal145=null;
        Token string_literal147=null;
        malice_grammarParser.function_name_return function_name134 =null;

        malice_grammarParser.lpar_return lpar135 =null;

        malice_grammarParser.parameters_return parameters136 =null;

        malice_grammarParser.rpar_return rpar137 =null;

        malice_grammarParser.function_name_return function_name139 =null;

        malice_grammarParser.lpar_return lpar140 =null;

        malice_grammarParser.parameters_return parameters141 =null;

        malice_grammarParser.rpar_return rpar142 =null;

        malice_grammarParser.data_types_return data_types144 =null;

        malice_grammarParser.statementList_return statementList146 =null;


        CommonTree string_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal145_tree=null;
        CommonTree string_literal147_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal132=(Token)match(input,29,FOLLOW_29_in_function1155); 
            string_literal132_tree = 
            (CommonTree)adaptor.create(string_literal132)
            ;
            adaptor.addChild(root_0, string_literal132_tree);


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            else if ( (LA29_0==55) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal133=(Token)match(input,47,FOLLOW_47_in_function1161); 
                    string_literal133_tree = 
                    (CommonTree)adaptor.create(string_literal133)
                    ;
                    adaptor.addChild(root_0, string_literal133_tree);


                    pushFollow(FOLLOW_function_name_in_function1163);
                    function_name134=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name134.getTree());

                    pushFollow(FOLLOW_lpar_in_function1165);
                    lpar135=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar135.getTree());

                    pushFollow(FOLLOW_parameters_in_function1167);
                    parameters136=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters136.getTree());

                    pushFollow(FOLLOW_rpar_in_function1169);
                    rpar137=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar137.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:17: 'room' function_name lpar parameters rpar 'contained a' data_types
                    {
                    string_literal138=(Token)match(input,55,FOLLOW_55_in_function1187); 
                    string_literal138_tree = 
                    (CommonTree)adaptor.create(string_literal138)
                    ;
                    adaptor.addChild(root_0, string_literal138_tree);


                    pushFollow(FOLLOW_function_name_in_function1189);
                    function_name139=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name139.getTree());

                    pushFollow(FOLLOW_lpar_in_function1191);
                    lpar140=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar140.getTree());

                    pushFollow(FOLLOW_parameters_in_function1193);
                    parameters141=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters141.getTree());

                    pushFollow(FOLLOW_rpar_in_function1195);
                    rpar142=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar142.getTree());

                    string_literal143=(Token)match(input,39,FOLLOW_39_in_function1197); 
                    string_literal143_tree = 
                    (CommonTree)adaptor.create(string_literal143)
                    ;
                    adaptor.addChild(root_0, string_literal143_tree);


                    pushFollow(FOLLOW_data_types_in_function1199);
                    data_types144=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types144.getTree());

                    }
                    break;

            }


            string_literal145=(Token)match(input,51,FOLLOW_51_in_function1220); 
            string_literal145_tree = 
            (CommonTree)adaptor.create(string_literal145)
            ;
            adaptor.addChild(root_0, string_literal145_tree);


            pushFollow(FOLLOW_statementList_in_function1227);
            statementList146=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList146.getTree());

            string_literal147=(Token)match(input,38,FOLLOW_38_in_function1234); 
            string_literal147_tree = 
            (CommonTree)adaptor.create(string_literal147)
            ;
            adaptor.addChild(root_0, string_literal147_tree);


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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' ) ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal151=null;
        malice_grammarParser.declaration_statements_return declaration_statements148 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions149 =null;

        malice_grammarParser.declaration_statements_return declaration_statements150 =null;


        CommonTree char_literal151_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            {
            pushFollow(FOLLOW_declaration_statements_in_global_declaration1248);
            declaration_statements148=declaration_statements();

            state._fsp--;

            adaptor.addChild(root_0, declaration_statements148.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:46: ( statement_conjunctions declaration_statements )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18||LA30_0==32||LA30_0==37||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:47: statement_conjunctions declaration_statements
            	    {
            	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1251);
            	    statement_conjunctions149=statement_conjunctions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement_conjunctions149.getTree());

            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1253);
            	    declaration_statements150=declaration_statements();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration_statements150.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            char_literal151=(Token)match(input,20,FOLLOW_20_in_global_declaration1257); 
            char_literal151_tree = 
            (CommonTree)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


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
    // $ANTLR end "global_declaration"


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:1: program : ( global_declaration )? ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF154=null;
        malice_grammarParser.global_declaration_return global_declaration152 =null;

        malice_grammarParser.function_return function153 =null;


        CommonTree EOF154_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:9: ( ( global_declaration )? ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:11: ( global_declaration )? ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:11: ( global_declaration )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:11: global_declaration
                    {
                    pushFollow(FOLLOW_global_declaration_in_program1267);
                    global_declaration152=global_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, global_declaration152.getTree());

                    }
                    break;

            }


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:31: ( function )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:168:31: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1270);
            	    function153=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function153.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            EOF154=(Token)match(input,EOF,FOLLOW_EOF_in_program1273); 
            EOF154_tree = 
            (CommonTree)adaptor.create(EOF154)
            ;
            adaptor.addChild(root_0, EOF154_tree);


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
    public static final BitSet FOLLOW_atom_in_ex403 = new BitSet(new long[]{0x00000000802B2802L,0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_ex407 = new BitSet(new long[]{0x00000000802B2802L,0x0000000000000002L});
    public static final BitSet FOLLOW_bracketexpr_in_ex411 = new BitSet(new long[]{0x00000000802B2802L,0x0000000000000002L});
    public static final BitSet FOLLOW_bin_op_in_ex415 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_ex_in_ex417 = new BitSet(new long[]{0x00000000802B2802L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr436 = new BitSet(new long[]{0x0000000007C00400L});
    public static final BitSet FOLLOW_relational_ops_in_bool_expr438 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr440 = new BitSet(new long[]{0x0000000000001202L,0x0000000000000004L});
    public static final BitSet FOLLOW_logical_ops_in_bool_expr443 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr445 = new BitSet(new long[]{0x0000000000001202L,0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_control_structure460 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure462 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure464 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure466 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure468 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure475 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_48_in_control_structure483 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure485 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure487 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure489 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure491 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure493 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure501 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure503 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure509 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41_in_control_structure518 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure520 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure522 = new BitSet(new long[]{0x00380A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure530 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure539 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure541 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43_in_control_structure564 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure566 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure568 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure570 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure572 = new BitSet(new long[]{0x00280E00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure580 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure588 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_control_structure598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements612 = new BitSet(new long[]{0x8000200000000000L});
    public static final BitSet FOLLOW_63_in_declaration_statements616 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements618 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_62_in_declaration_statements622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_declaration_statements626 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declaration_statements677 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_declaration_statements679 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_argument722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_argument726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions746 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arguments_to_functions749 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions751 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements774 = new BitSet(new long[]{0x0000010640000000L});
    public static final BitSet FOLLOW_30_in_rest_statements787 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_rest_statements789 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements791 = new BitSet(new long[]{0x0000010600000000L});
    public static final BitSet FOLLOW_34_in_rest_statements812 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rest_statements849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements924 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements928 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_STRING_in_rest_statements932 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_set_in_rest_statements936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rest_statements954 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rest_statements956 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements979 = new BitSet(new long[]{0x1100000000000002L});
    public static final BitSet FOLLOW_64_in_rest_statements996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements998 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rest_statements1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1012 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function_call1014 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1016 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function_call1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statementList1070 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_nested_function_in_statementList1074 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_function_in_statementList1078 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1081 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1084 = new BitSet(new long[]{0x00000000100040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1086 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_statementList1090 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_59_in_parameter1101 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1118 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parameters1122 = new BitSet(new long[]{0x0A02400000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1124 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_nested_function1144 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_nested_function1146 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_nested_function1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function1155 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_47_in_function1161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1165 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1167 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1169 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55_in_function1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1191 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1195 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1197 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_function1199 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function1220 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_function1227 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_function1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1248 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1253 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_global_declaration1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_declaration_in_program1267 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_function_in_program1270 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_program1273 = new BitSet(new long[]{0x0000000000000002L});

}