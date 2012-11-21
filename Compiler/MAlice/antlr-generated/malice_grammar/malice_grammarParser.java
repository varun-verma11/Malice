// $ANTLR 3.4 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-21 23:17:22

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


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:50:1: expr : ( e | lpar e rpar );
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.e_return e14 =null;

        malice_grammarParser.lpar_return lpar15 =null;

        malice_grammarParser.e_return e16 =null;

        malice_grammarParser.rpar_return rpar17 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:50:6: ( e | lpar e rpar )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT||LA3_0==NUMBER||LA3_0==67) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:50:8: e
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_e_in_expr309);
                    e14=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:50:12: lpar e rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lpar_in_expr313);
                    lpar15=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar15.getTree());

                    pushFollow(FOLLOW_e_in_expr315);
                    e16=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e16.getTree());

                    pushFollow(FOLLOW_rpar_in_expr317);
                    rpar17=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar17.getTree());

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
    // $ANTLR end "expr"


    public static class e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "e"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:1: e : ( mono_op expr | atom | atom bin_op expr );
    public final malice_grammarParser.e_return e() throws RecognitionException {
        malice_grammarParser.e_return retval = new malice_grammarParser.e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.mono_op_return mono_op18 =null;

        malice_grammarParser.expr_return expr19 =null;

        malice_grammarParser.atom_return atom20 =null;

        malice_grammarParser.atom_return atom21 =null;

        malice_grammarParser.bin_op_return bin_op22 =null;

        malice_grammarParser.expr_return expr23 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:2: ( mono_op expr | atom | atom bin_op expr )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt4=1;
                }
                break;
            case NUMBER:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2 >= 9 && LA4_2 <= 10)||LA4_2==12||LA4_2==15||LA4_2==18||LA4_2==20||(LA4_2 >= 22 && LA4_2 <= 26)||LA4_2==32||LA4_2==37||LA4_2==56||LA4_2==58||(LA4_2 >= 60 && LA4_2 <= 61)||LA4_2==66) ) {
                    alt4=2;
                }
                else if ( (LA4_2==11||LA4_2==13||(LA4_2 >= 16 && LA4_2 <= 17)||LA4_2==19||LA4_2==21||LA4_2==31||LA4_2==65) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3 >= 9 && LA4_3 <= 10)||LA4_3==12||LA4_3==15||LA4_3==18||LA4_3==20||(LA4_3 >= 22 && LA4_3 <= 26)||LA4_3==32||LA4_3==37||LA4_3==56||LA4_3==58||(LA4_3 >= 60 && LA4_3 <= 61)||LA4_3==66) ) {
                    alt4=2;
                }
                else if ( (LA4_3==11||LA4_3==13||(LA4_3 >= 16 && LA4_3 <= 17)||LA4_3==19||LA4_3==21||LA4_3==31||LA4_3==65) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:4: mono_op expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mono_op_in_e324);
                    mono_op18=mono_op();

                    state._fsp--;

                    adaptor.addChild(root_0, mono_op18.getTree());

                    pushFollow(FOLLOW_expr_in_e326);
                    expr19=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:19: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_e330);
                    atom20=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom20.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:26: atom bin_op expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_e334);
                    atom21=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom21.getTree());

                    pushFollow(FOLLOW_bin_op_in_e336);
                    bin_op22=bin_op();

                    state._fsp--;

                    adaptor.addChild(root_0, bin_op22.getTree());

                    pushFollow(FOLLOW_expr_in_e338);
                    expr23=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr23.getTree());

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
    // $ANTLR end "e"


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

        Token set24=null;

        CommonTree set24_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:60:13: ( '&&' | '||' | '!' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set24=(Token)input.LT(1);

            if ( input.LA(1)==9||input.LA(1)==12||input.LA(1)==66 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set24)
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

        Token set25=null;

        CommonTree set25_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:12: ( 'number' | 'letter' | 'sentence' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set25=(Token)input.LT(1);

            if ( input.LA(1)==46||input.LA(1)==49||input.LA(1)==57 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set25)
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


    public static class not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not_expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:1: not_expr : '!' lpar bool_expr rpar ;
    public final malice_grammarParser.not_expr_return not_expr() throws RecognitionException {
        malice_grammarParser.not_expr_return retval = new malice_grammarParser.not_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal26=null;
        malice_grammarParser.lpar_return lpar27 =null;

        malice_grammarParser.bool_expr_return bool_expr28 =null;

        malice_grammarParser.rpar_return rpar29 =null;


        CommonTree char_literal26_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:10: ( '!' lpar bool_expr rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:12: '!' lpar bool_expr rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal26=(Token)match(input,9,FOLLOW_9_in_not_expr416); 
            char_literal26_tree = 
            (CommonTree)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);


            pushFollow(FOLLOW_lpar_in_not_expr418);
            lpar27=lpar();

            state._fsp--;

            adaptor.addChild(root_0, lpar27.getTree());

            pushFollow(FOLLOW_bool_expr_in_not_expr420);
            bool_expr28=bool_expr();

            state._fsp--;

            adaptor.addChild(root_0, bool_expr28.getTree());

            pushFollow(FOLLOW_rpar_in_not_expr422);
            rpar29=rpar();

            state._fsp--;

            adaptor.addChild(root_0, rpar29.getTree());

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
    // $ANTLR end "not_expr"


    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:1: bool_expr : expr relational_ops expr ( logical_ops ( expr | not_expr ) | relational_ops expr )* ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr30 =null;

        malice_grammarParser.relational_ops_return relational_ops31 =null;

        malice_grammarParser.expr_return expr32 =null;

        malice_grammarParser.logical_ops_return logical_ops33 =null;

        malice_grammarParser.expr_return expr34 =null;

        malice_grammarParser.not_expr_return not_expr35 =null;

        malice_grammarParser.relational_ops_return relational_ops36 =null;

        malice_grammarParser.expr_return expr37 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:11: ( expr relational_ops expr ( logical_ops ( expr | not_expr ) | relational_ops expr )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:13: expr relational_ops expr ( logical_ops ( expr | not_expr ) | relational_ops expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_bool_expr430);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            pushFollow(FOLLOW_relational_ops_in_bool_expr432);
            relational_ops31=relational_ops();

            state._fsp--;

            adaptor.addChild(root_0, relational_ops31.getTree());

            pushFollow(FOLLOW_expr_in_bool_expr434);
            expr32=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr32.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:38: ( logical_ops ( expr | not_expr ) | relational_ops expr )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==9||LA6_0==12||LA6_0==66) ) {
                    alt6=1;
                }
                else if ( (LA6_0==10||(LA6_0 >= 22 && LA6_0 <= 26)) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:39: logical_ops ( expr | not_expr )
            	    {
            	    pushFollow(FOLLOW_logical_ops_in_bool_expr437);
            	    logical_ops33=logical_ops();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_ops33.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:51: ( expr | not_expr )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==IDENT||LA5_0==NUMBER||LA5_0==14||LA5_0==67) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==9) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:52: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_bool_expr440);
            	            expr34=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr34.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:59: not_expr
            	            {
            	            pushFollow(FOLLOW_not_expr_in_bool_expr444);
            	            not_expr35=not_expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, not_expr35.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:71: relational_ops expr
            	    {
            	    pushFollow(FOLLOW_relational_ops_in_bool_expr449);
            	    relational_ops36=relational_ops();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_ops36.getTree());

            	    pushFollow(FOLLOW_expr_in_bool_expr451);
            	    expr37=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr37.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: control_structure : ( 'perhaps' bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal38=null;
        Token string_literal41=null;
        Token string_literal43=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token string_literal63=null;
        Token string_literal65=null;
        Token char_literal66=null;
        malice_grammarParser.bool_expr_return bool_expr39 =null;

        malice_grammarParser.rpar_return rpar40 =null;

        malice_grammarParser.statementList_return statementList42 =null;

        malice_grammarParser.lpar_return lpar44 =null;

        malice_grammarParser.bool_expr_return bool_expr45 =null;

        malice_grammarParser.rpar_return rpar46 =null;

        malice_grammarParser.statementList_return statementList48 =null;

        malice_grammarParser.statementList_return statementList50 =null;

        malice_grammarParser.bool_expr_return bool_expr53 =null;

        malice_grammarParser.statementList_return statementList55 =null;

        malice_grammarParser.statementList_return statementList57 =null;

        malice_grammarParser.lpar_return lpar60 =null;

        malice_grammarParser.bool_expr_return bool_expr61 =null;

        malice_grammarParser.rpar_return rpar62 =null;

        malice_grammarParser.statementList_return statementList64 =null;


        CommonTree string_literal38_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree char_literal66_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:3: ( ( 'perhaps' bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) '.'
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:5: ( 'perhaps' bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' )
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:7: 'perhaps' bool_expr rpar 'so' statementList ( 'maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal38=(Token)match(input,53,FOLLOW_53_in_control_structure468); 
                    string_literal38_tree = 
                    (CommonTree)adaptor.create(string_literal38)
                    ;
                    adaptor.addChild(root_0, string_literal38_tree);


                    pushFollow(FOLLOW_bool_expr_in_control_structure470);
                    bool_expr39=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr39.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure472);
                    rpar40=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar40.getTree());

                    string_literal41=(Token)match(input,58,FOLLOW_58_in_control_structure474); 
                    string_literal41_tree = 
                    (CommonTree)adaptor.create(string_literal41)
                    ;
                    adaptor.addChild(root_0, string_literal41_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure481);
                    statementList42=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList42.getTree());

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
                    	    string_literal43=(Token)match(input,48,FOLLOW_48_in_control_structure489); 
                    	    string_literal43_tree = 
                    	    (CommonTree)adaptor.create(string_literal43)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal43_tree);


                    	    pushFollow(FOLLOW_lpar_in_control_structure491);
                    	    lpar44=lpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, lpar44.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure493);
                    	    bool_expr45=bool_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bool_expr45.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure495);
                    	    rpar46=rpar();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, rpar46.getTree());

                    	    string_literal47=(Token)match(input,58,FOLLOW_58_in_control_structure497); 
                    	    string_literal47_tree = 
                    	    (CommonTree)adaptor.create(string_literal47)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal47_tree);


                    	    pushFollow(FOLLOW_statementList_in_control_structure499);
                    	    statementList48=statementList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statementList48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    string_literal49=(Token)match(input,52,FOLLOW_52_in_control_structure507); 
                    string_literal49_tree = 
                    (CommonTree)adaptor.create(string_literal49)
                    ;
                    adaptor.addChild(root_0, string_literal49_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure509);
                    statementList50=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList50.getTree());

                    string_literal51=(Token)match(input,35,FOLLOW_35_in_control_structure515); 
                    string_literal51_tree = 
                    (CommonTree)adaptor.create(string_literal51)
                    ;
                    adaptor.addChild(root_0, string_literal51_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:8: 'either' bool_expr 'so' statementList 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal52=(Token)match(input,41,FOLLOW_41_in_control_structure524); 
                    string_literal52_tree = 
                    (CommonTree)adaptor.create(string_literal52)
                    ;
                    adaptor.addChild(root_0, string_literal52_tree);


                    pushFollow(FOLLOW_bool_expr_in_control_structure526);
                    bool_expr53=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr53.getTree());

                    string_literal54=(Token)match(input,58,FOLLOW_58_in_control_structure528); 
                    string_literal54_tree = 
                    (CommonTree)adaptor.create(string_literal54)
                    ;
                    adaptor.addChild(root_0, string_literal54_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure536);
                    statementList55=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList55.getTree());

                    string_literal56=(Token)match(input,52,FOLLOW_52_in_control_structure545); 
                    string_literal56_tree = 
                    (CommonTree)adaptor.create(string_literal56)
                    ;
                    adaptor.addChild(root_0, string_literal56_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure547);
                    statementList57=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList57.getTree());

                    string_literal58=(Token)match(input,35,FOLLOW_35_in_control_structure555); 
                    string_literal58_tree = 
                    (CommonTree)adaptor.create(string_literal58)
                    ;
                    adaptor.addChild(root_0, string_literal58_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough times'
                    {
                    string_literal59=(Token)match(input,43,FOLLOW_43_in_control_structure570); 
                    string_literal59_tree = 
                    (CommonTree)adaptor.create(string_literal59)
                    ;
                    adaptor.addChild(root_0, string_literal59_tree);


                    pushFollow(FOLLOW_lpar_in_control_structure572);
                    lpar60=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar60.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure574);
                    bool_expr61=bool_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_expr61.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure576);
                    rpar62=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar62.getTree());

                    string_literal63=(Token)match(input,36,FOLLOW_36_in_control_structure578); 
                    string_literal63_tree = 
                    (CommonTree)adaptor.create(string_literal63)
                    ;
                    adaptor.addChild(root_0, string_literal63_tree);


                    pushFollow(FOLLOW_statementList_in_control_structure586);
                    statementList64=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList64.getTree());

                    string_literal65=(Token)match(input,42,FOLLOW_42_in_control_structure594); 
                    string_literal65_tree = 
                    (CommonTree)adaptor.create(string_literal65)
                    ;
                    adaptor.addChild(root_0, string_literal65_tree);


                    }
                    break;

            }


            char_literal66=(Token)match(input,20,FOLLOW_20_in_control_structure604); 
            char_literal66_tree = 
            (CommonTree)adaptor.create(char_literal66)
            ;
            adaptor.addChild(root_0, char_literal66_tree);


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

        Token IDENT67=null;
        Token string_literal68=null;
        Token string_literal70=null;
        Token string_literal71=null;
        Token LETTER72=null;
        Token STRING73=null;
        Token string_literal75=null;
        malice_grammarParser.data_types_return data_types69 =null;

        malice_grammarParser.expr_return expr74 =null;

        malice_grammarParser.atom_return atom76 =null;

        malice_grammarParser.data_types_return data_types77 =null;


        CommonTree IDENT67_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree LETTER72_tree=null;
        CommonTree STRING73_tree=null;
        CommonTree string_literal75_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:24: ( IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:26: IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements618); 
            IDENT67_tree = 
            (CommonTree)adaptor.create(IDENT67)
            ;
            adaptor.addChild(root_0, IDENT67_tree);


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
                    string_literal68=(Token)match(input,63,FOLLOW_63_in_declaration_statements622); 
                    string_literal68_tree = 
                    (CommonTree)adaptor.create(string_literal68)
                    ;
                    adaptor.addChild(root_0, string_literal68_tree);


                    pushFollow(FOLLOW_data_types_in_declaration_statements624);
                    data_types69=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types69.getTree());

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
                            string_literal70=(Token)match(input,62,FOLLOW_62_in_declaration_statements628); 
                            string_literal70_tree = 
                            (CommonTree)adaptor.create(string_literal70)
                            ;
                            adaptor.addChild(root_0, string_literal70_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:63: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal71=(Token)match(input,50,FOLLOW_50_in_declaration_statements632); 
                            string_literal71_tree = 
                            (CommonTree)adaptor.create(string_literal71)
                            ;
                            adaptor.addChild(root_0, string_literal71_tree);


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
                                    LETTER72=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements635); 
                                    LETTER72_tree = 
                                    (CommonTree)adaptor.create(LETTER72)
                                    ;
                                    adaptor.addChild(root_0, LETTER72_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:78: STRING
                                    {
                                    STRING73=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements639); 
                                    STRING73_tree = 
                                    (CommonTree)adaptor.create(STRING73)
                                    ;
                                    adaptor.addChild(root_0, STRING73_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:87: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements643);
                                    expr74=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr74.getTree());

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
                    string_literal75=(Token)match(input,45,FOLLOW_45_in_declaration_statements683); 
                    string_literal75_tree = 
                    (CommonTree)adaptor.create(string_literal75)
                    ;
                    adaptor.addChild(root_0, string_literal75_tree);


                    pushFollow(FOLLOW_atom_in_declaration_statements685);
                    atom76=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom76.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements687);
                    data_types77=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types77.getTree());

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

        Token IDENT78=null;
        Token NUMBER79=null;
        Token LETTER80=null;
        Token STRING81=null;
        malice_grammarParser.array_elem_return array_elem82 =null;


        CommonTree IDENT78_tree=null;
        CommonTree NUMBER79_tree=null;
        CommonTree LETTER80_tree=null;
        CommonTree STRING81_tree=null;

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


                    IDENT78=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument728); 
                    IDENT78_tree = 
                    (CommonTree)adaptor.create(IDENT78)
                    ;
                    adaptor.addChild(root_0, IDENT78_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:19: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER79=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_argument732); 
                    NUMBER79_tree = 
                    (CommonTree)adaptor.create(NUMBER79)
                    ;
                    adaptor.addChild(root_0, NUMBER79_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:28: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER80=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument736); 
                    LETTER80_tree = 
                    (CommonTree)adaptor.create(LETTER80)
                    ;
                    adaptor.addChild(root_0, LETTER80_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING81=(Token)match(input,STRING,FOLLOW_STRING_in_argument740); 
                    STRING81_tree = 
                    (CommonTree)adaptor.create(STRING81)
                    ;
                    adaptor.addChild(root_0, STRING81_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:46: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument744);
                    array_elem82=array_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, array_elem82.getTree());

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

        Token char_literal84=null;
        malice_grammarParser.argument_return argument83 =null;

        malice_grammarParser.argument_return argument85 =null;

        malice_grammarParser.function_call_return function_call86 =null;


        CommonTree char_literal84_tree=null;

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
                            pushFollow(FOLLOW_argument_in_arguments_to_functions752);
                            argument83=argument();

                            state._fsp--;

                            adaptor.addChild(root_0, argument83.getTree());

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
                            	    char_literal84=(Token)match(input,18,FOLLOW_18_in_arguments_to_functions755); 
                            	    char_literal84_tree = 
                            	    (CommonTree)adaptor.create(char_literal84)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal84_tree);


                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions757);
                            	    argument85=argument();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, argument85.getTree());

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


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions765);
                    function_call86=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call86.getTree());

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

        Token IDENT87=null;
        Token string_literal88=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token LETTER93=null;
        Token STRING94=null;
        Token string_literal96=null;
        Token string_literal97=null;
        Token LETTER99=null;
        Token STRING100=null;
        Token set101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token LETTER105=null;
        Token STRING106=null;
        Token set109=null;
        Token string_literal110=null;
        Token IDENT111=null;
        Token char_literal112=null;
        malice_grammarParser.atom_return atom89 =null;

        malice_grammarParser.expr_return expr92 =null;

        malice_grammarParser.function_call_return function_call95 =null;

        malice_grammarParser.expr_return expr98 =null;

        malice_grammarParser.expr_return expr104 =null;

        malice_grammarParser.function_call_return function_call107 =null;

        malice_grammarParser.function_call_return function_call108 =null;


        CommonTree IDENT87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree LETTER93_tree=null;
        CommonTree STRING94_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree LETTER99_tree=null;
        CommonTree STRING100_tree=null;
        CommonTree set101_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree LETTER105_tree=null;
        CommonTree STRING106_tree=null;
        CommonTree set109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree IDENT111_tree=null;
        CommonTree char_literal112_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:17: ( IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING | function_call ) | 'ate' | 'drank' ) ) | ( expr | LETTER | STRING ) ( 'spoke' | 'said Alice' ) | 'Alice' 'found' ( expr | LETTER | STRING | function_call ) | function_call ( 'spoke' | 'said Alice' )? | 'what was' IDENT '?' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case 30:
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


                    IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements780); 
                    IDENT87_tree = 
                    (CommonTree)adaptor.create(IDENT87)
                    ;
                    adaptor.addChild(root_0, IDENT87_tree);


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
                            string_literal88=(Token)match(input,30,FOLLOW_30_in_rest_statements793); 
                            string_literal88_tree = 
                            (CommonTree)adaptor.create(string_literal88)
                            ;
                            adaptor.addChild(root_0, string_literal88_tree);


                            pushFollow(FOLLOW_atom_in_rest_statements795);
                            atom89=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom89.getTree());

                            string_literal90=(Token)match(input,54,FOLLOW_54_in_rest_statements797); 
                            string_literal90_tree = 
                            (CommonTree)adaptor.create(string_literal90)
                            ;
                            adaptor.addChild(root_0, string_literal90_tree);


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
                            string_literal91=(Token)match(input,34,FOLLOW_34_in_rest_statements818); 
                            string_literal91_tree = 
                            (CommonTree)adaptor.create(string_literal91)
                            ;
                            adaptor.addChild(root_0, string_literal91_tree);


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

                                if ( (LA17_2==11||LA17_2==13||(LA17_2 >= 16 && LA17_2 <= 21)||(LA17_2 >= 31 && LA17_2 <= 32)||LA17_2==37||LA17_2==61||LA17_2==65) ) {
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
                                    pushFollow(FOLLOW_expr_in_rest_statements822);
                                    expr92=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr92.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:36: LETTER
                                    {
                                    LETTER93=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements826); 
                                    LETTER93_tree = 
                                    (CommonTree)adaptor.create(LETTER93)
                                    ;
                                    adaptor.addChild(root_0, LETTER93_tree);


                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:45: STRING
                                    {
                                    STRING94=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements830); 
                                    STRING94_tree = 
                                    (CommonTree)adaptor.create(STRING94)
                                    ;
                                    adaptor.addChild(root_0, STRING94_tree);


                                    }
                                    break;
                                case 4 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:54: function_call
                                    {
                                    pushFollow(FOLLOW_function_call_in_rest_statements834);
                                    function_call95=function_call();

                                    state._fsp--;

                                    adaptor.addChild(root_0, function_call95.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:18: 'ate'
                            {
                            string_literal96=(Token)match(input,33,FOLLOW_33_in_rest_statements855); 
                            string_literal96_tree = 
                            (CommonTree)adaptor.create(string_literal96)
                            ;
                            adaptor.addChild(root_0, string_literal96_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: 'drank'
                            {
                            string_literal97=(Token)match(input,40,FOLLOW_40_in_rest_statements875); 
                            string_literal97_tree = 
                            (CommonTree)adaptor.create(string_literal97)
                            ;
                            adaptor.addChild(root_0, string_literal97_tree);


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
                            pushFollow(FOLLOW_expr_in_rest_statements930);
                            expr98=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr98.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:15: LETTER
                            {
                            LETTER99=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements934); 
                            LETTER99_tree = 
                            (CommonTree)adaptor.create(LETTER99)
                            ;
                            adaptor.addChild(root_0, LETTER99_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:24: STRING
                            {
                            STRING100=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements938); 
                            STRING100_tree = 
                            (CommonTree)adaptor.create(STRING100)
                            ;
                            adaptor.addChild(root_0, STRING100_tree);


                            }
                            break;

                    }


                    set101=(Token)input.LT(1);

                    if ( input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set101)
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


                    string_literal102=(Token)match(input,28,FOLLOW_28_in_rest_statements960); 
                    string_literal102_tree = 
                    (CommonTree)adaptor.create(string_literal102)
                    ;
                    adaptor.addChild(root_0, string_literal102_tree);


                    string_literal103=(Token)match(input,44,FOLLOW_44_in_rest_statements962); 
                    string_literal103_tree = 
                    (CommonTree)adaptor.create(string_literal103)
                    ;
                    adaptor.addChild(root_0, string_literal103_tree);


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

                        if ( (LA20_2==11||LA20_2==13||(LA20_2 >= 16 && LA20_2 <= 21)||(LA20_2 >= 31 && LA20_2 <= 32)||LA20_2==37||LA20_2==61||LA20_2==65) ) {
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
                            pushFollow(FOLLOW_expr_in_rest_statements965);
                            expr104=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr104.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:31: LETTER
                            {
                            LETTER105=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements969); 
                            LETTER105_tree = 
                            (CommonTree)adaptor.create(LETTER105)
                            ;
                            adaptor.addChild(root_0, LETTER105_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:40: STRING
                            {
                            STRING106=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements973); 
                            STRING106_tree = 
                            (CommonTree)adaptor.create(STRING106)
                            ;
                            adaptor.addChild(root_0, STRING106_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:48: function_call
                            {
                            pushFollow(FOLLOW_function_call_in_rest_statements976);
                            function_call107=function_call();

                            state._fsp--;

                            adaptor.addChild(root_0, function_call107.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:7: function_call ( 'spoke' | 'said Alice' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_rest_statements985);
                    function_call108=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call108.getTree());

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
                            set109=(Token)input.LT(1);

                            if ( input.LA(1)==56||input.LA(1)==60 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (CommonTree)adaptor.create(set109)
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


                    string_literal110=(Token)match(input,64,FOLLOW_64_in_rest_statements1002); 
                    string_literal110_tree = 
                    (CommonTree)adaptor.create(string_literal110)
                    ;
                    adaptor.addChild(root_0, string_literal110_tree);


                    IDENT111=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1004); 
                    IDENT111_tree = 
                    (CommonTree)adaptor.create(IDENT111)
                    ;
                    adaptor.addChild(root_0, IDENT111_tree);


                    char_literal112=(Token)match(input,27,FOLLOW_27_in_rest_statements1006); 
                    char_literal112_tree = 
                    (CommonTree)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);


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

        malice_grammarParser.function_name_return function_name113 =null;

        malice_grammarParser.lpar_return lpar114 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions115 =null;

        malice_grammarParser.rpar_return rpar116 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call1018);
            function_name113=function_name();

            state._fsp--;

            adaptor.addChild(root_0, function_name113.getTree());

            pushFollow(FOLLOW_lpar_in_function_call1020);
            lpar114=lpar();

            state._fsp--;

            adaptor.addChild(root_0, lpar114.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1022);
            arguments_to_functions115=arguments_to_functions();

            state._fsp--;

            adaptor.addChild(root_0, arguments_to_functions115.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1024);
            rpar116=rpar();

            state._fsp--;

            adaptor.addChild(root_0, rpar116.getTree());

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

        malice_grammarParser.rest_statements_return rest_statements117 =null;

        malice_grammarParser.declaration_statements_return declaration_statements118 =null;



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


                    pushFollow(FOLLOW_rest_statements_in_statement1032);
                    rest_statements117=rest_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, rest_statements117.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1036);
                    declaration_statements118=declaration_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_statements118.getTree());

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

        Token set119=null;

        CommonTree set119_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:24: ( ',' | 'and' | 'then' | 'but' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set119=(Token)input.LT(1);

            if ( input.LA(1)==18||input.LA(1)==32||input.LA(1)==37||input.LA(1)==61 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set119)
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

        Token char_literal126=null;
        malice_grammarParser.control_structure_return control_structure120 =null;

        malice_grammarParser.nested_function_return nested_function121 =null;

        malice_grammarParser.function_return function122 =null;

        malice_grammarParser.statement_return statement123 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions124 =null;

        malice_grammarParser.statement_return statement125 =null;


        CommonTree char_literal126_tree=null;

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
            	    pushFollow(FOLLOW_control_structure_in_statementList1076);
            	    control_structure120=control_structure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, control_structure120.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:38: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1080);
            	    nested_function121=nested_function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nested_function121.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:56: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1084);
            	    function122=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function122.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:66: statement ( statement_conjunctions statement )* '.'
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList1087);
            	    statement123=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement123.getTree());

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
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1090);
            	    	    statement_conjunctions124=statement_conjunctions();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement_conjunctions124.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1092);
            	    	    statement125=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement125.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    char_literal126=(Token)match(input,20,FOLLOW_20_in_statementList1096); 
            	    char_literal126_tree = 
            	    (CommonTree)adaptor.create(char_literal126)
            	    ;
            	    adaptor.addChild(root_0, char_literal126_tree);


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

        Token string_literal127=null;
        Token IDENT129=null;
        malice_grammarParser.data_types_return data_types128 =null;


        CommonTree string_literal127_tree=null;
        CommonTree IDENT129_tree=null;

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
                    string_literal127=(Token)match(input,59,FOLLOW_59_in_parameter1107); 
                    string_literal127_tree = 
                    (CommonTree)adaptor.create(string_literal127)
                    ;
                    adaptor.addChild(root_0, string_literal127_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1111);
            data_types128=data_types();

            state._fsp--;

            adaptor.addChild(root_0, data_types128.getTree());

            IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1113); 
            IDENT129_tree = 
            (CommonTree)adaptor.create(IDENT129)
            ;
            adaptor.addChild(root_0, IDENT129_tree);


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

        Token char_literal131=null;
        malice_grammarParser.parameter_return parameter130 =null;

        malice_grammarParser.parameter_return parameter132 =null;


        CommonTree char_literal131_tree=null;

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
                    pushFollow(FOLLOW_parameter_in_parameters1124);
                    parameter130=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter130.getTree());

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
                    	    char_literal131=(Token)match(input,18,FOLLOW_18_in_parameters1128); 
                    	    char_literal131_tree = 
                    	    (CommonTree)adaptor.create(char_literal131)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal131_tree);


                    	    pushFollow(FOLLOW_parameter_in_parameters1130);
                    	    parameter132=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter132.getTree());

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

        Token IDENT133=null;

        CommonTree IDENT133_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT133=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1142); 
            IDENT133_tree = 
            (CommonTree)adaptor.create(IDENT133)
            ;
            adaptor.addChild(root_0, IDENT133_tree);


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

        Token string_literal134=null;
        Token string_literal136=null;
        malice_grammarParser.statementList_return statementList135 =null;


        CommonTree string_literal134_tree=null;
        CommonTree string_literal136_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal134=(Token)match(input,51,FOLLOW_51_in_nested_function1150); 
            string_literal134_tree = 
            (CommonTree)adaptor.create(string_literal134)
            ;
            adaptor.addChild(root_0, string_literal134_tree);


            pushFollow(FOLLOW_statementList_in_nested_function1152);
            statementList135=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList135.getTree());

            string_literal136=(Token)match(input,38,FOLLOW_38_in_nested_function1154); 
            string_literal136_tree = 
            (CommonTree)adaptor.create(string_literal136)
            ;
            adaptor.addChild(root_0, string_literal136_tree);


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

        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal143=null;
        Token string_literal148=null;
        Token string_literal150=null;
        Token string_literal152=null;
        malice_grammarParser.function_name_return function_name139 =null;

        malice_grammarParser.lpar_return lpar140 =null;

        malice_grammarParser.parameters_return parameters141 =null;

        malice_grammarParser.rpar_return rpar142 =null;

        malice_grammarParser.function_name_return function_name144 =null;

        malice_grammarParser.lpar_return lpar145 =null;

        malice_grammarParser.parameters_return parameters146 =null;

        malice_grammarParser.rpar_return rpar147 =null;

        malice_grammarParser.data_types_return data_types149 =null;

        malice_grammarParser.statementList_return statementList151 =null;


        CommonTree string_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree string_literal152_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal137=(Token)match(input,29,FOLLOW_29_in_function1161); 
            string_literal137_tree = 
            (CommonTree)adaptor.create(string_literal137)
            ;
            adaptor.addChild(root_0, string_literal137_tree);


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
                    string_literal138=(Token)match(input,47,FOLLOW_47_in_function1167); 
                    string_literal138_tree = 
                    (CommonTree)adaptor.create(string_literal138)
                    ;
                    adaptor.addChild(root_0, string_literal138_tree);


                    pushFollow(FOLLOW_function_name_in_function1169);
                    function_name139=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name139.getTree());

                    pushFollow(FOLLOW_lpar_in_function1171);
                    lpar140=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar140.getTree());

                    pushFollow(FOLLOW_parameters_in_function1173);
                    parameters141=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters141.getTree());

                    pushFollow(FOLLOW_rpar_in_function1175);
                    rpar142=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar142.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:17: 'room' function_name lpar parameters rpar 'contained a' data_types
                    {
                    string_literal143=(Token)match(input,55,FOLLOW_55_in_function1193); 
                    string_literal143_tree = 
                    (CommonTree)adaptor.create(string_literal143)
                    ;
                    adaptor.addChild(root_0, string_literal143_tree);


                    pushFollow(FOLLOW_function_name_in_function1195);
                    function_name144=function_name();

                    state._fsp--;

                    adaptor.addChild(root_0, function_name144.getTree());

                    pushFollow(FOLLOW_lpar_in_function1197);
                    lpar145=lpar();

                    state._fsp--;

                    adaptor.addChild(root_0, lpar145.getTree());

                    pushFollow(FOLLOW_parameters_in_function1199);
                    parameters146=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters146.getTree());

                    pushFollow(FOLLOW_rpar_in_function1201);
                    rpar147=rpar();

                    state._fsp--;

                    adaptor.addChild(root_0, rpar147.getTree());

                    string_literal148=(Token)match(input,39,FOLLOW_39_in_function1203); 
                    string_literal148_tree = 
                    (CommonTree)adaptor.create(string_literal148)
                    ;
                    adaptor.addChild(root_0, string_literal148_tree);


                    pushFollow(FOLLOW_data_types_in_function1205);
                    data_types149=data_types();

                    state._fsp--;

                    adaptor.addChild(root_0, data_types149.getTree());

                    }
                    break;

            }


            string_literal150=(Token)match(input,51,FOLLOW_51_in_function1226); 
            string_literal150_tree = 
            (CommonTree)adaptor.create(string_literal150)
            ;
            adaptor.addChild(root_0, string_literal150_tree);


            pushFollow(FOLLOW_statementList_in_function1233);
            statementList151=statementList();

            state._fsp--;

            adaptor.addChild(root_0, statementList151.getTree());

            string_literal152=(Token)match(input,38,FOLLOW_38_in_function1240); 
            string_literal152_tree = 
            (CommonTree)adaptor.create(string_literal152)
            ;
            adaptor.addChild(root_0, string_literal152_tree);


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

        Token char_literal156=null;
        malice_grammarParser.declaration_statements_return declaration_statements153 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions154 =null;

        malice_grammarParser.declaration_statements_return declaration_statements155 =null;


        CommonTree char_literal156_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            {
            pushFollow(FOLLOW_declaration_statements_in_global_declaration1254);
            declaration_statements153=declaration_statements();

            state._fsp--;

            adaptor.addChild(root_0, declaration_statements153.getTree());

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
            	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1257);
            	    statement_conjunctions154=statement_conjunctions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement_conjunctions154.getTree());

            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1259);
            	    declaration_statements155=declaration_statements();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration_statements155.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            char_literal156=(Token)match(input,20,FOLLOW_20_in_global_declaration1263); 
            char_literal156_tree = 
            (CommonTree)adaptor.create(char_literal156)
            ;
            adaptor.addChild(root_0, char_literal156_tree);


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

        Token EOF159=null;
        malice_grammarParser.global_declaration_return global_declaration157 =null;

        malice_grammarParser.function_return function158 =null;


        CommonTree EOF159_tree=null;

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
                    pushFollow(FOLLOW_global_declaration_in_program1273);
                    global_declaration157=global_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, global_declaration157.getTree());

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
            	    pushFollow(FOLLOW_function_in_program1276);
            	    function158=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function158.getTree());

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


            EOF159=(Token)match(input,EOF,FOLLOW_EOF_in_program1279); 
            EOF159_tree = 
            (CommonTree)adaptor.create(EOF159)
            ;
            adaptor.addChild(root_0, EOF159_tree);


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
    public static final BitSet FOLLOW_e_in_expr309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_expr313 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000008L});
    public static final BitSet FOLLOW_e_in_expr315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_expr317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mono_op_in_e324 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_e326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_e330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_e334 = new BitSet(new long[]{0x00000000802B2800L,0x0000000000000002L});
    public static final BitSet FOLLOW_bin_op_in_e336 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_e338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_not_expr416 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_not_expr418 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_not_expr420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_not_expr422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr430 = new BitSet(new long[]{0x0000000007C00400L});
    public static final BitSet FOLLOW_relational_ops_in_bool_expr432 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr434 = new BitSet(new long[]{0x0000000007C01602L,0x0000000000000004L});
    public static final BitSet FOLLOW_logical_ops_in_bool_expr437 = new BitSet(new long[]{0x0000000000004250L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr440 = new BitSet(new long[]{0x0000000007C01602L,0x0000000000000004L});
    public static final BitSet FOLLOW_not_expr_in_bool_expr444 = new BitSet(new long[]{0x0000000007C01602L,0x0000000000000004L});
    public static final BitSet FOLLOW_relational_ops_in_bool_expr449 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_bool_expr451 = new BitSet(new long[]{0x0000000007C01602L,0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_control_structure468 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure472 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure474 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure481 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_48_in_control_structure489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure491 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure495 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure497 = new BitSet(new long[]{0x00390A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure499 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure507 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure509 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure515 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41_in_control_structure524 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure526 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure528 = new BitSet(new long[]{0x00380A00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure536 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure545 = new BitSet(new long[]{0x00280A08300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure547 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure555 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43_in_control_structure570 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure572 = new BitSet(new long[]{0x0000000000004050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure574 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure576 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure578 = new BitSet(new long[]{0x00280E00300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure586 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure594 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_control_structure604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements618 = new BitSet(new long[]{0x8000200000000000L});
    public static final BitSet FOLLOW_63_in_declaration_statements622 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements624 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_62_in_declaration_statements628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_declaration_statements632 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declaration_statements683 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_declaration_statements685 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_argument728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_argument732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions752 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arguments_to_functions755 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions757 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements780 = new BitSet(new long[]{0x0000010640000000L});
    public static final BitSet FOLLOW_30_in_rest_statements793 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_rest_statements795 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements797 = new BitSet(new long[]{0x0000010600000000L});
    public static final BitSet FOLLOW_34_in_rest_statements818 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rest_statements855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements930 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements934 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_STRING_in_rest_statements938 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_set_in_rest_statements942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rest_statements960 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rest_statements962 = new BitSet(new long[]{0x00000000000040F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_rest_statements985 = new BitSet(new long[]{0x1100000000000002L});
    public static final BitSet FOLLOW_64_in_rest_statements1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1004 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rest_statements1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1018 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function_call1020 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1022 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function_call1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statementList1076 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_nested_function_in_statementList1080 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_function_in_statementList1084 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1087 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1090 = new BitSet(new long[]{0x00000000100040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1092 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_statementList1096 = new BitSet(new long[]{0x00280A00300040F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_59_in_parameter1107 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1124 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parameters1128 = new BitSet(new long[]{0x0A02400000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1130 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_nested_function1150 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_nested_function1152 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_nested_function1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function1161 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_47_in_function1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1169 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1171 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1175 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55_in_function1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1197 = new BitSet(new long[]{0x0A02400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1199 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1201 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1203 = new BitSet(new long[]{0x0202400000000000L});
    public static final BitSet FOLLOW_data_types_in_function1205 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function1226 = new BitSet(new long[]{0x00280A40300040F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_function1233 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_function1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1254 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1259 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_global_declaration1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_declaration_in_program1273 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_function_in_program1276 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_program1279 = new BitSet(new long[]{0x0000000000000002L});

}