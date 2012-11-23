// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-23 17:42:33

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "IDENT", "WS", "LINE_COMMENT", "LETTER", "'('", "')'", "'~'", "'+'", "'-'", "'%'", "'/'", "'*'", "'^'", "'&'", "'|'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'\\'s'", "'piece'", "'&&'", "'||'", "'!'", "'number'", "'letter'", "'sentence'", "'perhaps'", "'so'", "'or'", "'maybe'", "'because'", "'Alice'", "'was'", "'unsure'", "'which'", "'either'", "'eventually'", "'enough'", "'times'", "'.'", "'a'", "'too'", "'of'", "'had'", "','", "'became'", "'ate'", "'drank'", "'found'", "'what'", "'?'", "'spoke'", "'said'", "'and'", "'then'", "'but'", "'spider'", "'opened'", "'closed'", "'The'", "'looking-glass'", "'room'", "'contained'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int LETTER=9;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int IDENT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=7;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=4;

    // delegates
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:19:1: rule : ( STRING )* ;
    public final malice_grammarParser.rule_return rule() throws RecognitionException {
        malice_grammarParser.rule_return retval = new malice_grammarParser.rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING1=null;

        CommonTree STRING1_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:19:5: ( ( STRING )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:19:7: ( STRING )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:19:7: ( STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: STRING
            	    {
            	    STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_rule68); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STRING1_tree = (CommonTree)adaptor.create(STRING1);
            	    adaptor.addChild(root_0, STRING1_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class lpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:5: ( '(' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal2=(Token)match(input,10,FOLLOW_10_in_lpar224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal2_tree = (CommonTree)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lpar"

    public static class rpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal3=null;

        CommonTree char_literal3_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:5: ( ')' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal3=(Token)match(input,11,FOLLOW_11_in_rpar231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rpar"

    public static class mono_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mono_op"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:35:1: mono_op : '~' ;
    public final malice_grammarParser.mono_op_return mono_op() throws RecognitionException {
        malice_grammarParser.mono_op_return retval = new malice_grammarParser.mono_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal4=null;

        CommonTree char_literal4_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:35:9: ( '~' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:35:11: '~'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal4=(Token)match(input,12,FOLLOW_12_in_mono_op239); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mono_op"

    public static class bin_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bin_op"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:1: bin_op : ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' );
    public final malice_grammarParser.bin_op_return bin_op() throws RecognitionException {
        malice_grammarParser.bin_op_return retval = new malice_grammarParser.bin_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:8: ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set5=(Token)input.LT(1);
            if ( (input.LA(1)>=13 && input.LA(1)<=20) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set5));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bin_op"

    public static class relational_ops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_ops"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:1: relational_ops : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final malice_grammarParser.relational_ops_return relational_ops() throws RecognitionException {
        malice_grammarParser.relational_ops_return retval = new malice_grammarParser.relational_ops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:16: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set6=(Token)input.LT(1);
            if ( (input.LA(1)>=21 && input.LA(1)<=26) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set6));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_ops"

    public static class array_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_elem"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:1: array_elem : IDENT '\\'s' expr 'piece' ;
    public final malice_grammarParser.array_elem_return array_elem() throws RecognitionException {
        malice_grammarParser.array_elem_return retval = new malice_grammarParser.array_elem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT7=null;
        Token string_literal8=null;
        Token string_literal10=null;
        malice_grammarParser.expr_return expr9 = null;


        CommonTree IDENT7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal10_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:12: ( IDENT '\\'s' expr 'piece' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:14: IDENT '\\'s' expr 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem309); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT7_tree = (CommonTree)adaptor.create(IDENT7);
            adaptor.addChild(root_0, IDENT7_tree);
            }
            string_literal8=(Token)match(input,27,FOLLOW_27_in_array_elem311); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
            adaptor.addChild(root_0, string_literal8_tree);
            }
            pushFollow(FOLLOW_expr_in_array_elem313);
            expr9=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr9.getTree());
            string_literal10=(Token)match(input,28,FOLLOW_28_in_array_elem315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
            adaptor.addChild(root_0, string_literal10_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array_elem"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:1: atom : ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call );
    public final malice_grammarParser.atom_return atom() throws RecognitionException {
        malice_grammarParser.atom_return retval = new malice_grammarParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT11=null;
        Token string_literal12=null;
        Token string_literal14=null;
        Token NUMBER15=null;
        malice_grammarParser.expr_return expr13 = null;

        malice_grammarParser.function_call_return function_call16 = null;


        CommonTree IDENT11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree NUMBER15_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:5: ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==10) ) {
                    alt3=3;
                }
                else if ( (LA3_1==EOF||LA3_1==11||(LA3_1>=13 && LA3_1<=30)||(LA3_1>=32 && LA3_1<=34)||LA3_1==48||LA3_1==53||(LA3_1>=60 && LA3_1<=64)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==NUMBER) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:7: IDENT ( '\\'s' expr 'piece' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT11_tree = (CommonTree)adaptor.create(IDENT11);
                    adaptor.addChild(root_0, IDENT11_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:13: ( '\\'s' expr 'piece' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==27) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:14: '\\'s' expr 'piece'
                            {
                            string_literal12=(Token)match(input,27,FOLLOW_27_in_atom324); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal12_tree = (CommonTree)adaptor.create(string_literal12);
                            adaptor.addChild(root_0, string_literal12_tree);
                            }
                            pushFollow(FOLLOW_expr_in_atom326);
                            expr13=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr13.getTree());
                            string_literal14=(Token)match(input,28,FOLLOW_28_in_atom328); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal14_tree = (CommonTree)adaptor.create(string_literal14);
                            adaptor.addChild(root_0, string_literal14_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:37: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER15_tree = (CommonTree)adaptor.create(NUMBER15);
                    adaptor.addChild(root_0, NUMBER15_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:46: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_atom338);
                    function_call16=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call16.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class logical_ops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_ops"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:1: logical_ops : ( '&&' | '||' | '!' );
    public final malice_grammarParser.logical_ops_return logical_ops() throws RecognitionException {
        malice_grammarParser.logical_ops_return retval = new malice_grammarParser.logical_ops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set17=null;

        CommonTree set17_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:13: ( '&&' | '||' | '!' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set17=(Token)input.LT(1);
            if ( (input.LA(1)>=29 && input.LA(1)<=31) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set17));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_ops"

    public static class data_types_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_types"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:1: data_types : ( 'number' | 'letter' | 'sentence' );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:12: ( 'number' | 'letter' | 'sentence' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=32 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set18));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data_types"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 = null;

        malice_grammarParser.lpar_return lpar20 = null;

        malice_grammarParser.expr_return expr21 = null;

        malice_grammarParser.rpar_return rpar22 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:6: ( atom | lpar expr rpar )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=NUMBER && LA4_0<=IDENT)) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_term410);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_term414);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar20.getTree());
                    pushFollow(FOLLOW_expr_in_term416);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());
                    pushFollow(FOLLOW_rpar_in_term418);
                    rpar22=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar22.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class bool_neg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_neg"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal23=null;
        malice_grammarParser.term_return term24 = null;


        CommonTree char_literal23_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:10: ( ( '!' )* term )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:12: ( '!' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:13: '!'
            	    {
            	    char_literal23=(Token)match(input,31,FOLLOW_31_in_bool_neg427); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal23_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_bool_neg432);
            term24=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term24.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_neg"

    public static class unary_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_op"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
    public final malice_grammarParser.unary_op_return unary_op() throws RecognitionException {
        malice_grammarParser.unary_op_return retval = new malice_grammarParser.unary_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        malice_grammarParser.bool_neg_return bool_neg28 = null;


        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:10: ( ( '~' | '-' | '+' )* bool_neg )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:12: ( '~' | '-' | '+' )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt6=1;
                    }
                    break;
                case 14:
                    {
                    alt6=2;
                    }
                    break;
                case 13:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:13: '~'
            	    {
            	    char_literal25=(Token)match(input,12,FOLLOW_12_in_unary_op440); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:20: '-'
            	    {
            	    char_literal26=(Token)match(input,14,FOLLOW_14_in_unary_op445); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:27: '+'
            	    {
            	    char_literal27=(Token)match(input,13,FOLLOW_13_in_unary_op450); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_bool_neg_in_unary_op455);
            bool_neg28=bool_neg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg28.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_op"

    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
    public final malice_grammarParser.mult_return mult() throws RecognitionException {
        malice_grammarParser.mult_return retval = new malice_grammarParser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;
        malice_grammarParser.unary_op_return unary_op29 = null;

        malice_grammarParser.unary_op_return unary_op33 = null;


        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal32_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_op_in_mult462);
            unary_op29=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op29.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:17: ( '*' | '/' | '%' )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:18: '*'
            	            {
            	            char_literal30=(Token)match(input,17,FOLLOW_17_in_mult466); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:25: '/'
            	            {
            	            char_literal31=(Token)match(input,16,FOLLOW_16_in_mult471); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:32: '%'
            	            {
            	            char_literal32=(Token)match(input,15,FOLLOW_15_in_mult476); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_op_in_mult480);
            	    unary_op33=unary_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op33.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final malice_grammarParser.add_return add() throws RecognitionException {
        malice_grammarParser.add_return retval = new malice_grammarParser.add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal35=null;
        Token char_literal36=null;
        malice_grammarParser.mult_return mult34 = null;

        malice_grammarParser.mult_return mult37 = null;


        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:5: ( mult ( ( '+' | '-' ) mult )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add490);
            mult34=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult34.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:12: ( ( '+' | '-' ) mult )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( '+' | '-' ) mult
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( '+' | '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==13) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==14) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:14: '+'
            	            {
            	            char_literal35=(Token)match(input,13,FOLLOW_13_in_add494); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:21: '-'
            	            {
            	            char_literal36=(Token)match(input,14,FOLLOW_14_in_add499); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add503);
            	    mult37=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult37.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class bool_comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_comp"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
    public final malice_grammarParser.bool_comp_return bool_comp() throws RecognitionException {
        malice_grammarParser.bool_comp_return retval = new malice_grammarParser.bool_comp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token string_literal42=null;
        malice_grammarParser.add_return add38 = null;

        malice_grammarParser.add_return add43 = null;


        CommonTree string_literal39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree string_literal42_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_comp513);
            add38=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=23 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:18: ( '<=' | '<' | '>' | '>=' )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:19: '<='
            	            {
            	            string_literal39=(Token)match(input,25,FOLLOW_25_in_bool_comp517); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:27: '<'
            	            {
            	            char_literal40=(Token)match(input,23,FOLLOW_23_in_bool_comp522); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:34: '>'
            	            {
            	            char_literal41=(Token)match(input,24,FOLLOW_24_in_bool_comp527); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:41: '>='
            	            {
            	            string_literal42=(Token)match(input,26,FOLLOW_26_in_bool_comp532); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_bool_comp536);
            	    add43=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add43.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_comp"

    public static class bool_eq_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_eq"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
    public final malice_grammarParser.bool_eq_return bool_eq() throws RecognitionException {
        malice_grammarParser.bool_eq_return retval = new malice_grammarParser.bool_eq_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal45=null;
        Token string_literal46=null;
        malice_grammarParser.bool_comp_return bool_comp44 = null;

        malice_grammarParser.bool_comp_return bool_comp47 = null;


        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_comp_in_bool_eq546);
            bool_comp44=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp44.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:21: ( ( '==' | '!=' ) bool_comp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=21 && LA14_0<=22)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:22: ( '==' | '!=' ) bool_comp
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:22: ( '==' | '!=' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==21) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==22) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:23: '=='
            	            {
            	            string_literal45=(Token)match(input,21,FOLLOW_21_in_bool_eq550); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:31: '!='
            	            {
            	            string_literal46=(Token)match(input,22,FOLLOW_22_in_bool_eq555); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_comp_in_bool_eq559);
            	    bool_comp47=bool_comp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp47.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_eq"

    public static class bitw_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitw_and"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        malice_grammarParser.bool_eq_return bool_eq48 = null;

        malice_grammarParser.bool_eq_return bool_eq50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:10: ( bool_eq ( '&' bool_eq )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_eq_in_bitw_and569);
            bool_eq48=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq48.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:20: ( '&' bool_eq )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:21: '&' bool_eq
            	    {
            	    char_literal49=(Token)match(input,19,FOLLOW_19_in_bitw_and572); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_eq_in_bitw_and575);
            	    bool_eq50=bool_eq();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq50.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitw_and"

    public static class bitw_xor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitw_xor"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        malice_grammarParser.bitw_and_return bitw_and51 = null;

        malice_grammarParser.bitw_and_return bitw_and53 = null;


        CommonTree char_literal52_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:10: ( bitw_and ( '^' bitw_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_and_in_bitw_xor585);
            bitw_and51=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and51.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:21: ( '^' bitw_and )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:22: '^' bitw_and
            	    {
            	    char_literal52=(Token)match(input,18,FOLLOW_18_in_bitw_xor588); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor591);
            	    bitw_and53=bitw_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and53.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitw_xor"

    public static class bitw_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitw_or"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        malice_grammarParser.bitw_xor_return bitw_xor54 = null;

        malice_grammarParser.bitw_xor_return bitw_xor56 = null;


        CommonTree char_literal55_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:9: ( bitw_xor ( '|' bitw_xor )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_xor_in_bitw_or601);
            bitw_xor54=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor54.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:20: ( '|' bitw_xor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:21: '|' bitw_xor
            	    {
            	    char_literal55=(Token)match(input,20,FOLLOW_20_in_bitw_or604); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or607);
            	    bitw_xor56=bitw_xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor56.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitw_or"

    public static class bool_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        malice_grammarParser.bitw_or_return bitw_or57 = null;

        malice_grammarParser.bitw_or_return bitw_or59 = null;


        CommonTree string_literal58_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:10: ( bitw_or ( '&&' bitw_or )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_or_in_bool_and617);
            bitw_or57=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or57.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:20: ( '&&' bitw_or )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:21: '&&' bitw_or
            	    {
            	    string_literal58=(Token)match(input,29,FOLLOW_29_in_bool_and620); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_or_in_bool_and623);
            	    bitw_or59=bitw_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or59.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_and"

    public static class bool_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_or"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        malice_grammarParser.bool_and_return bool_and60 = null;

        malice_grammarParser.bool_and_return bool_and62 = null;


        CommonTree string_literal61_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:9: ( bool_and ( '||' bool_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_in_bool_or633);
            bool_and60=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and60.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:20: ( '||' bool_and )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:21: '||' bool_and
            	    {
            	    string_literal61=(Token)match(input,30,FOLLOW_30_in_bool_or636); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_and_in_bool_or639);
            	    bool_and62=bool_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and62.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_or"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or63 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:6: ( bool_or )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_in_expr650);
            bool_or63=bool_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or63.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr64 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:11: ( expr )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_bool_expr659);
            expr64=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr64.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_expr"

    public static class control_structure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_structure"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal69=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal76=null;
        Token string_literal78=null;
        Token string_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        Token string_literal83=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token string_literal93=null;
        Token string_literal94=null;
        Token string_literal95=null;
        Token string_literal96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        Token string_literal102=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token char_literal106=null;
        malice_grammarParser.lpar_return lpar66 = null;

        malice_grammarParser.bool_expr_return bool_expr67 = null;

        malice_grammarParser.rpar_return rpar68 = null;

        malice_grammarParser.statementList_return statementList70 = null;

        malice_grammarParser.lpar_return lpar73 = null;

        malice_grammarParser.bool_expr_return bool_expr74 = null;

        malice_grammarParser.rpar_return rpar75 = null;

        malice_grammarParser.statementList_return statementList77 = null;

        malice_grammarParser.statementList_return statementList79 = null;

        malice_grammarParser.lpar_return lpar86 = null;

        malice_grammarParser.bool_expr_return bool_expr87 = null;

        malice_grammarParser.rpar_return rpar88 = null;

        malice_grammarParser.statementList_return statementList90 = null;

        malice_grammarParser.statementList_return statementList92 = null;

        malice_grammarParser.lpar_return lpar99 = null;

        malice_grammarParser.bool_expr_return bool_expr100 = null;

        malice_grammarParser.rpar_return rpar101 = null;

        malice_grammarParser.statementList_return statementList103 = null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal94_tree=null;
        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree string_literal104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree char_literal106_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:7: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:9: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:9: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:11: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal65=(Token)match(input,35,FOLLOW_35_in_control_structure688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal65_tree = (CommonTree)adaptor.create(string_literal65);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal65_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure691);
                    lpar66=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar66.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure693);
                    bool_expr67=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(bool_expr67.getTree(), root_0);
                    pushFollow(FOLLOW_rpar_in_control_structure696);
                    rpar68=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar68.getTree());
                    string_literal69=(Token)match(input,36,FOLLOW_36_in_control_structure698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal69_tree = (CommonTree)adaptor.create(string_literal69);
                    adaptor.addChild(root_0, string_literal69_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure712);
                    statementList70=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:107:11: ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==37) ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1==38) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:107:12: 'or' 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal71=(Token)match(input,37,FOLLOW_37_in_control_structure726); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
                    	    adaptor.addChild(root_0, string_literal71_tree);
                    	    }
                    	    string_literal72=(Token)match(input,38,FOLLOW_38_in_control_structure728); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal72_tree = (CommonTree)adaptor.create(string_literal72);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal72_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lpar_in_control_structure731);
                    	    lpar73=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar73.getTree());
                    	    pushFollow(FOLLOW_bool_expr_in_control_structure733);
                    	    bool_expr74=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(bool_expr74.getTree(), root_0);
                    	    pushFollow(FOLLOW_rpar_in_control_structure736);
                    	    rpar75=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar75.getTree());
                    	    string_literal76=(Token)match(input,36,FOLLOW_36_in_control_structure738); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal76_tree = (CommonTree)adaptor.create(string_literal76);
                    	    adaptor.addChild(root_0, string_literal76_tree);
                    	    }
                    	    pushFollow(FOLLOW_statementList_in_control_structure740);
                    	    statementList77=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:11: ( 'or' statementList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==37) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:12: 'or' statementList
                            {
                            string_literal78=(Token)match(input,37,FOLLOW_37_in_control_structure755); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal78_tree, root_0);
                            }
                            pushFollow(FOLLOW_statementList_in_control_structure758);
                            statementList79=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList79.getTree());

                            }
                            break;

                    }

                    string_literal80=(Token)match(input,39,FOLLOW_39_in_control_structure772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal80_tree = (CommonTree)adaptor.create(string_literal80);
                    adaptor.addChild(root_0, string_literal80_tree);
                    }
                    string_literal81=(Token)match(input,40,FOLLOW_40_in_control_structure774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal81_tree = (CommonTree)adaptor.create(string_literal81);
                    adaptor.addChild(root_0, string_literal81_tree);
                    }
                    string_literal82=(Token)match(input,41,FOLLOW_41_in_control_structure776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);
                    }
                    string_literal83=(Token)match(input,42,FOLLOW_42_in_control_structure778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
                    adaptor.addChild(root_0, string_literal83_tree);
                    }
                    string_literal84=(Token)match(input,43,FOLLOW_43_in_control_structure780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal84_tree = (CommonTree)adaptor.create(string_literal84);
                    adaptor.addChild(root_0, string_literal84_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:110:11: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal85=(Token)match(input,44,FOLLOW_44_in_control_structure792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal85_tree = (CommonTree)adaptor.create(string_literal85);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal85_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure795);
                    lpar86=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar86.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure797);
                    bool_expr87=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(bool_expr87.getTree(), root_0);
                    pushFollow(FOLLOW_rpar_in_control_structure800);
                    rpar88=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar88.getTree());
                    string_literal89=(Token)match(input,36,FOLLOW_36_in_control_structure802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal89_tree = (CommonTree)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure814);
                    statementList90=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList90.getTree());
                    string_literal91=(Token)match(input,37,FOLLOW_37_in_control_structure827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal91_tree, root_0);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure830);
                    statementList92=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList92.getTree());
                    string_literal93=(Token)match(input,39,FOLLOW_39_in_control_structure842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
                    adaptor.addChild(root_0, string_literal93_tree);
                    }
                    string_literal94=(Token)match(input,40,FOLLOW_40_in_control_structure844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);
                    }
                    string_literal95=(Token)match(input,41,FOLLOW_41_in_control_structure846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal95_tree = (CommonTree)adaptor.create(string_literal95);
                    adaptor.addChild(root_0, string_literal95_tree);
                    }
                    string_literal96=(Token)match(input,42,FOLLOW_42_in_control_structure848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = (CommonTree)adaptor.create(string_literal96);
                    adaptor.addChild(root_0, string_literal96_tree);
                    }
                    string_literal97=(Token)match(input,43,FOLLOW_43_in_control_structure850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:114:11: 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times'
                    {
                    string_literal98=(Token)match(input,45,FOLLOW_45_in_control_structure872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal98_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure875);
                    lpar99=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar99.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure877);
                    bool_expr100=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(bool_expr100.getTree(), root_0);
                    pushFollow(FOLLOW_rpar_in_control_structure880);
                    rpar101=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar101.getTree());
                    string_literal102=(Token)match(input,39,FOLLOW_39_in_control_structure882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal102_tree = (CommonTree)adaptor.create(string_literal102);
                    adaptor.addChild(root_0, string_literal102_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure894);
                    statementList103=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList103.getTree());
                    string_literal104=(Token)match(input,46,FOLLOW_46_in_control_structure906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal104_tree = (CommonTree)adaptor.create(string_literal104);
                    adaptor.addChild(root_0, string_literal104_tree);
                    }
                    string_literal105=(Token)match(input,47,FOLLOW_47_in_control_structure908); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal105_tree = (CommonTree)adaptor.create(string_literal105);
                    adaptor.addChild(root_0, string_literal105_tree);
                    }

                    }
                    break;

            }

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:117:9: ( '.' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred46_malice_grammar()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: '.'
                    {
                    char_literal106=(Token)match(input,48,FOLLOW_48_in_control_structure918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
                    adaptor.addChild(root_0, char_literal106_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "control_structure"

    public static class declaration_statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration_statements"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:1: declaration_statements : IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT107=null;
        Token string_literal108=null;
        Token char_literal109=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token LETTER113=null;
        Token STRING114=null;
        Token string_literal116=null;
        malice_grammarParser.data_types_return data_types110 = null;

        malice_grammarParser.expr_return expr115 = null;

        malice_grammarParser.atom_return atom117 = null;

        malice_grammarParser.data_types_return data_types118 = null;


        CommonTree IDENT107_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree string_literal111_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree LETTER113_tree=null;
        CommonTree STRING114_tree=null;
        CommonTree string_literal116_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:24: ( IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:26: IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT107=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT107_tree = (CommonTree)adaptor.create(IDENT107);
            adaptor.addChild(root_0, IDENT107_tree);
            }
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:32: ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            else if ( (LA26_0==52) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:34: 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal108=(Token)match(input,41,FOLLOW_41_in_declaration_statements940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);
                    }
                    char_literal109=(Token)match(input,49,FOLLOW_49_in_declaration_statements942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
                    adaptor.addChild(root_0, char_literal109_tree);
                    }
                    pushFollow(FOLLOW_data_types_in_declaration_statements944);
                    data_types110=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types110.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:55: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt25=3;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==50) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==51) ) {
                        alt25=2;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:57: 'too'
                            {
                            string_literal111=(Token)match(input,50,FOLLOW_50_in_declaration_statements948); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = (CommonTree)adaptor.create(string_literal111);
                            adaptor.addChild(root_0, string_literal111_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:65: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal112=(Token)match(input,51,FOLLOW_51_in_declaration_statements952); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal112_tree = (CommonTree)adaptor.create(string_literal112);
                            adaptor.addChild(root_0, string_literal112_tree);
                            }
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:70: ( LETTER | STRING | expr )
                            int alt24=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt24=1;
                                }
                                break;
                            case STRING:
                                {
                                alt24=2;
                                }
                                break;
                            case NUMBER:
                            case IDENT:
                            case 10:
                            case 12:
                            case 13:
                            case 14:
                            case 31:
                                {
                                alt24=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 0, input);

                                throw nvae;
                            }

                            switch (alt24) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:71: LETTER
                                    {
                                    LETTER113=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements955); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER113_tree = (CommonTree)adaptor.create(LETTER113);
                                    adaptor.addChild(root_0, LETTER113_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:80: STRING
                                    {
                                    STRING114=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements959); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING114_tree = (CommonTree)adaptor.create(STRING114);
                                    adaptor.addChild(root_0, STRING114_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:89: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements963);
                                    expr115=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr115.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:35: 'had' atom data_types
                    {
                    string_literal116=(Token)match(input,52,FOLLOW_52_in_declaration_statements1003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal116_tree = (CommonTree)adaptor.create(string_literal116);
                    adaptor.addChild(root_0, string_literal116_tree);
                    }
                    pushFollow(FOLLOW_atom_in_declaration_statements1005);
                    atom117=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom117.getTree());
                    pushFollow(FOLLOW_data_types_in_declaration_statements1007);
                    data_types118=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types118.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration_statements"

    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER120=null;
        Token STRING121=null;
        malice_grammarParser.expr_return expr119 = null;

        malice_grammarParser.array_elem_return array_elem122 = null;


        CommonTree LETTER120_tree=null;
        CommonTree STRING121_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:9: ( expr | LETTER | STRING | array_elem )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_argument1073);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LETTER120=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument1077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER120_tree = (CommonTree)adaptor.create(LETTER120);
                    adaptor.addChild(root_0, LETTER120_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING121=(Token)match(input,STRING,FOLLOW_STRING_in_argument1081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING121_tree = (CommonTree)adaptor.create(STRING121);
                    adaptor.addChild(root_0, STRING121_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_elem_in_argument1085);
                    array_elem122=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument"

    public static class arguments_to_functions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments_to_functions"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal124=null;
        malice_grammarParser.argument_return argument123 = null;

        malice_grammarParser.argument_return argument125 = null;

        malice_grammarParser.function_call_return function_call126 = null;


        CommonTree char_literal124_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:26: ( argument ( ',' argument )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=STRING && LA29_0<=IDENT)||(LA29_0>=LETTER && LA29_0<=10)||(LA29_0>=12 && LA29_0<=14)||LA29_0==31) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions1093);
                            argument123=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument123.getTree());
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:36: ( ',' argument )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==53) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:37: ',' argument
                            	    {
                            	    char_literal124=(Token)match(input,53,FOLLOW_53_in_arguments_to_functions1096); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal124_tree = (CommonTree)adaptor.create(char_literal124);
                            	    adaptor.addChild(root_0, char_literal124_tree);
                            	    }
                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions1098);
                            	    argument125=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument125.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:56: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_arguments_to_functions1106);
                    function_call126=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments_to_functions"

    public static class rest_statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rest_statements"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set129=null;
        Token IDENT131=null;
        Token string_literal132=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token LETTER137=null;
        Token STRING138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token LETTER144=null;
        Token STRING145=null;
        malice_grammarParser.expr_return expr127 = null;

        malice_grammarParser.print_return print128 = null;

        malice_grammarParser.print_return print130 = null;

        malice_grammarParser.expr_return expr133 = null;

        malice_grammarParser.expr_return expr136 = null;

        malice_grammarParser.expr_return expr143 = null;


        CommonTree set129_tree=null;
        CommonTree IDENT131_tree=null;
        CommonTree string_literal132_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree LETTER137_tree=null;
        CommonTree STRING138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree LETTER144_tree=null;
        CommonTree STRING145_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:38: ( expr print )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:39: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1125);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
                    pushFollow(FOLLOW_print_in_rest_statements1127);
                    print128=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print128.getTree());

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:130:9: ( LETTER | STRING ) print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set129=(Token)input.LT(1);
                    if ( input.LA(1)==STRING||input.LA(1)==LETTER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set129));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_print_in_rest_statements1152);
                    print130=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print130.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT131=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT131_tree = (CommonTree)adaptor.create(IDENT131);
                    adaptor.addChild(root_0, IDENT131_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:11: ( '\\'s' expr 'piece' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==27) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:12: '\\'s' expr 'piece'
                            {
                            string_literal132=(Token)match(input,27,FOLLOW_27_in_rest_statements1174); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal132_tree = (CommonTree)adaptor.create(string_literal132);
                            adaptor.addChild(root_0, string_literal132_tree);
                            }
                            pushFollow(FOLLOW_expr_in_rest_statements1176);
                            expr133=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());
                            string_literal134=(Token)match(input,28,FOLLOW_28_in_rest_statements1178); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal134_tree = (CommonTree)adaptor.create(string_literal134);
                            adaptor.addChild(root_0, string_literal134_tree);
                            }

                            }
                            break;

                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    int alt33=3;
                    switch ( input.LA(1) ) {
                    case 54:
                        {
                        alt33=1;
                        }
                        break;
                    case 55:
                        {
                        alt33=2;
                        }
                        break;
                    case 56:
                        {
                        alt33=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:18: 'became' ( expr | LETTER | STRING )
                            {
                            string_literal135=(Token)match(input,54,FOLLOW_54_in_rest_statements1199); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal135_tree = (CommonTree)adaptor.create(string_literal135);
                            adaptor.addChild(root_0, string_literal135_tree);
                            }
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:28: ( expr | LETTER | STRING )
                            int alt32=3;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case IDENT:
                            case 10:
                            case 12:
                            case 13:
                            case 14:
                            case 31:
                                {
                                alt32=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt32=2;
                                }
                                break;
                            case STRING:
                                {
                                alt32=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }

                            switch (alt32) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1203);
                                    expr136=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr136.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:36: LETTER
                                    {
                                    LETTER137=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1207); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER137_tree = (CommonTree)adaptor.create(LETTER137);
                                    adaptor.addChild(root_0, LETTER137_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:45: STRING
                                    {
                                    STRING138=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1211); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING138_tree = (CommonTree)adaptor.create(STRING138);
                                    adaptor.addChild(root_0, STRING138_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:18: 'ate'
                            {
                            string_literal139=(Token)match(input,55,FOLLOW_55_in_rest_statements1232); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal139_tree = (CommonTree)adaptor.create(string_literal139);
                            adaptor.addChild(root_0, string_literal139_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:135:18: 'drank'
                            {
                            string_literal140=(Token)match(input,56,FOLLOW_56_in_rest_statements1252); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal140_tree = (CommonTree)adaptor.create(string_literal140);
                            adaptor.addChild(root_0, string_literal140_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:7: 'Alice' 'found' ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal141=(Token)match(input,40,FOLLOW_40_in_rest_statements1306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (CommonTree)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    string_literal142=(Token)match(input,57,FOLLOW_57_in_rest_statements1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (CommonTree)adaptor.create(string_literal142);
                    adaptor.addChild(root_0, string_literal142_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:23: ( expr | LETTER | STRING )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case IDENT:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 31:
                        {
                        alt34=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt34=2;
                        }
                        break;
                    case STRING:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1311);
                            expr143=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr143.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: LETTER
                            {
                            LETTER144=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1315); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER144_tree = (CommonTree)adaptor.create(LETTER144);
                            adaptor.addChild(root_0, LETTER144_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:40: STRING
                            {
                            STRING145=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1319); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING145_tree = (CommonTree)adaptor.create(STRING145);
                            adaptor.addChild(root_0, STRING145_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rest_statements"

    public static class read_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read_statement"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:1: read_statement : 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )? ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal146=null;
        Token string_literal147=null;
        Token IDENT148=null;
        Token char_literal150=null;
        Token char_literal151=null;
        malice_grammarParser.array_elem_return array_elem149 = null;


        CommonTree string_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        CommonTree IDENT148_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree char_literal151_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:16: ( 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:18: 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal146=(Token)match(input,58,FOLLOW_58_in_read_statement1339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = (CommonTree)adaptor.create(string_literal146);
            adaptor.addChild(root_0, string_literal146_tree);
            }
            string_literal147=(Token)match(input,41,FOLLOW_41_in_read_statement1341); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal147_tree = (CommonTree)adaptor.create(string_literal147);
            adaptor.addChild(root_0, string_literal147_tree);
            }
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:31: ( IDENT | array_elem )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENT) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==27) ) {
                    alt36=2;
                }
                else if ( (LA36_1==59) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:32: IDENT
                    {
                    IDENT148=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT148_tree = (CommonTree)adaptor.create(IDENT148);
                    adaptor.addChild(root_0, IDENT148_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:40: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1348);
                    array_elem149=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem149.getTree());

                    }
                    break;

            }

            char_literal150=(Token)match(input,59,FOLLOW_59_in_read_statement1351); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal150_tree = (CommonTree)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:56: ( '.' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred70_malice_grammar()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:57: '.'
                    {
                    char_literal151=(Token)match(input,48,FOLLOW_48_in_read_statement1354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = (CommonTree)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read_statement"

    public static class print_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:1: print : ( 'spoke' | 'said' 'Alice' );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal152=null;
        Token string_literal153=null;
        Token string_literal154=null;

        CommonTree string_literal152_tree=null;
        CommonTree string_literal153_tree=null;
        CommonTree string_literal154_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:6: ( 'spoke' | 'said' 'Alice' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            else if ( (LA38_0==61) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:146:5: 'spoke'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal152=(Token)match(input,60,FOLLOW_60_in_print1368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal152_tree = (CommonTree)adaptor.create(string_literal152);
                    adaptor.addChild(root_0, string_literal152_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:146:15: 'said' 'Alice'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal153=(Token)match(input,61,FOLLOW_61_in_print1372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal153_tree = (CommonTree)adaptor.create(string_literal153);
                    adaptor.addChild(root_0, string_literal153_tree);
                    }
                    string_literal154=(Token)match(input,40,FOLLOW_40_in_print1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal154_tree = (CommonTree)adaptor.create(string_literal154);
                    adaptor.addChild(root_0, string_literal154_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_call"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:150:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name155 = null;

        malice_grammarParser.lpar_return lpar156 = null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions157 = null;

        malice_grammarParser.rpar_return rpar158 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:150:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:150:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_name_in_function_call1389);
            function_name155=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name155.getTree());
            pushFollow(FOLLOW_lpar_in_function_call1391);
            lpar156=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar156.getTree());
            pushFollow(FOLLOW_arguments_to_functions_in_function_call1393);
            arguments_to_functions157=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions157.getTree());
            pushFollow(FOLLOW_rpar_in_function_call1395);
            rpar158=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar158.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_call"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements159 = null;

        malice_grammarParser.function_call_return function_call160 = null;

        malice_grammarParser.declaration_statements_return declaration_statements161 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:11: ( rest_statements | function_call | declaration_statements )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rest_statements_in_statement1403);
                    rest_statements159=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements159.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_statement1407);
                    function_call160=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call160.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:46: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statements_in_statement1410);
                    declaration_statements161=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statement_conjunctions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement_conjunctions"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:1: statement_conjunctions : ( 'and' | 'then' | 'but' | ',' | '.' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set162=null;

        CommonTree set162_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:24: ( 'and' | 'then' | 'but' | ',' | '.' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set162=(Token)input.LT(1);
            if ( input.LA(1)==48||input.LA(1)==53||(input.LA(1)>=62 && input.LA(1)<=64) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set162));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement_conjunctions"

    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementList"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:1: statementList : ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.statement_return statement163 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions164 = null;

        malice_grammarParser.control_structure_return control_structure165 = null;

        malice_grammarParser.read_statement_return read_statement166 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions167 = null;

        malice_grammarParser.nested_function_return nested_function168 = null;

        malice_grammarParser.function_return function169 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:15: ( ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            loop42:
            do {
                int alt42=6;
                switch ( input.LA(1) ) {
                case STRING:
                case NUMBER:
                case IDENT:
                case LETTER:
                case 10:
                case 12:
                case 13:
                case 14:
                case 31:
                case 40:
                case 48:
                case 53:
                case 62:
                case 63:
                case 64:
                    {
                    alt42=1;
                    }
                    break;
                case 35:
                case 44:
                case 45:
                    {
                    alt42=2;
                    }
                    break;
                case 58:
                    {
                    alt42=3;
                    }
                    break;
                case 66:
                    {
                    alt42=4;
                    }
                    break;
                case 68:
                    {
                    alt42=5;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:18: ( ( statement )? statement_conjunctions )
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:18: ( ( statement )? statement_conjunctions )
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:19: ( statement )? statement_conjunctions
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:19: ( statement )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( ((LA40_0>=STRING && LA40_0<=IDENT)||(LA40_0>=LETTER && LA40_0<=10)||(LA40_0>=12 && LA40_0<=14)||LA40_0==31||LA40_0==40) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1456);
            	            statement163=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement163.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1459);
            	    statement_conjunctions164=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions164.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:56: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1464);
            	    control_structure165=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure165.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:76: read_statement ( statement_conjunctions )?
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1468);
            	    read_statement166=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement166.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:91: ( statement_conjunctions )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==48||LA41_0==53||(LA41_0>=62 && LA41_0<=64)) ) {
            	        int LA41_1 = input.LA(2);

            	        if ( (synpred81_malice_grammar()) ) {
            	            alt41=1;
            	        }
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement_conjunctions
            	            {
            	            pushFollow(FOLLOW_statement_conjunctions_in_statementList1470);
            	            statement_conjunctions167=statement_conjunctions();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions167.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:117: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1475);
            	    nested_function168=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function168.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:19: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1499);
            	    function169=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function169.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementList"

    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal170=null;
        Token IDENT172=null;
        malice_grammarParser.data_types_return data_types171 = null;


        CommonTree string_literal170_tree=null;
        CommonTree IDENT172_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:11: ( ( 'spider' )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:13: ( 'spider' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:167:14: 'spider'
                    {
                    string_literal170=(Token)match(input,65,FOLLOW_65_in_parameter1511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal170_tree = (CommonTree)adaptor.create(string_literal170);
                    adaptor.addChild(root_0, string_literal170_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_data_types_in_parameter1515);
            data_types171=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types171.getTree());
            IDENT172=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT172_tree = (CommonTree)adaptor.create(IDENT172);
            adaptor.addChild(root_0, IDENT172_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal174=null;
        malice_grammarParser.parameter_return parameter173 = null;

        malice_grammarParser.parameter_return parameter175 = null;


        CommonTree char_literal174_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:14: ( parameter ( ',' parameter )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=32 && LA45_0<=34)||LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1528);
                    parameter173=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter173.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:25: ( ',' parameter )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==53) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:27: ',' parameter
                    	    {
                    	    char_literal174=(Token)match(input,53,FOLLOW_53_in_parameters1532); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal174_tree = (CommonTree)adaptor.create(char_literal174);
                    	    adaptor.addChild(root_0, char_literal174_tree);
                    	    }
                    	    pushFollow(FOLLOW_parameter_in_parameters1534);
                    	    parameter175=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameters"

    public static class function_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_name"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT176=null;

        CommonTree IDENT176_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT176=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1546); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT176_tree = (CommonTree)adaptor.create(IDENT176);
            adaptor.addChild(root_0, IDENT176_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_name"

    public static class nested_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_function"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:173:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal177=null;
        Token string_literal179=null;
        malice_grammarParser.statementList_return statementList178 = null;


        CommonTree string_literal177_tree=null;
        CommonTree string_literal179_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:173:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:173:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal177=(Token)match(input,66,FOLLOW_66_in_nested_function1554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal177_tree = (CommonTree)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);
            }
            pushFollow(FOLLOW_statementList_in_nested_function1556);
            statementList178=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList178.getTree());
            string_literal179=(Token)match(input,67,FOLLOW_67_in_nested_function1558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal179_tree = (CommonTree)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nested_function"

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:174:1: function : 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal180=null;
        Token string_literal181=null;
        Token string_literal186=null;
        Token string_literal191=null;
        Token char_literal192=null;
        Token string_literal194=null;
        Token string_literal196=null;
        malice_grammarParser.function_name_return function_name182 = null;

        malice_grammarParser.lpar_return lpar183 = null;

        malice_grammarParser.parameters_return parameters184 = null;

        malice_grammarParser.rpar_return rpar185 = null;

        malice_grammarParser.function_name_return function_name187 = null;

        malice_grammarParser.lpar_return lpar188 = null;

        malice_grammarParser.parameters_return parameters189 = null;

        malice_grammarParser.rpar_return rpar190 = null;

        malice_grammarParser.data_types_return data_types193 = null;

        malice_grammarParser.statementList_return statementList195 = null;


        CommonTree string_literal180_tree=null;
        CommonTree string_literal181_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree string_literal194_tree=null;
        CommonTree string_literal196_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:174:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:174:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal180=(Token)match(input,68,FOLLOW_68_in_function1565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
            adaptor.addChild(root_0, string_literal180_tree);
            }
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:174:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                alt46=1;
            }
            else if ( (LA46_0==70) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:174:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal181=(Token)match(input,69,FOLLOW_69_in_function1571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal181_tree = (CommonTree)adaptor.create(string_literal181);
                    adaptor.addChild(root_0, string_literal181_tree);
                    }
                    pushFollow(FOLLOW_function_name_in_function1573);
                    function_name182=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name182.getTree());
                    pushFollow(FOLLOW_lpar_in_function1575);
                    lpar183=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar183.getTree());
                    pushFollow(FOLLOW_parameters_in_function1577);
                    parameters184=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters184.getTree());
                    pushFollow(FOLLOW_rpar_in_function1579);
                    rpar185=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar185.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:175:21: 'room' function_name lpar parameters rpar 'contained' 'a' data_types
                    {
                    string_literal186=(Token)match(input,70,FOLLOW_70_in_function1602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal186_tree = (CommonTree)adaptor.create(string_literal186);
                    adaptor.addChild(root_0, string_literal186_tree);
                    }
                    pushFollow(FOLLOW_function_name_in_function1604);
                    function_name187=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name187.getTree());
                    pushFollow(FOLLOW_lpar_in_function1606);
                    lpar188=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar188.getTree());
                    pushFollow(FOLLOW_parameters_in_function1608);
                    parameters189=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters189.getTree());
                    pushFollow(FOLLOW_rpar_in_function1610);
                    rpar190=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar190.getTree());
                    string_literal191=(Token)match(input,71,FOLLOW_71_in_function1612); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal191_tree = (CommonTree)adaptor.create(string_literal191);
                    adaptor.addChild(root_0, string_literal191_tree);
                    }
                    char_literal192=(Token)match(input,49,FOLLOW_49_in_function1614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal192_tree = (CommonTree)adaptor.create(char_literal192);
                    adaptor.addChild(root_0, char_literal192_tree);
                    }
                    pushFollow(FOLLOW_data_types_in_function1616);
                    data_types193=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types193.getTree());

                    }
                    break;

            }

            string_literal194=(Token)match(input,66,FOLLOW_66_in_function1647); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal194_tree = (CommonTree)adaptor.create(string_literal194);
            adaptor.addChild(root_0, string_literal194_tree);
            }
            pushFollow(FOLLOW_statementList_in_function1659);
            statementList195=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList195.getTree());
            string_literal196=(Token)match(input,67,FOLLOW_67_in_function1671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal196_tree = (CommonTree)adaptor.create(string_literal196);
            adaptor.addChild(root_0, string_literal196_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class global_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_declaration"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal200=null;
        malice_grammarParser.declaration_statements_return declaration_statements197 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions198 = null;

        malice_grammarParser.declaration_statements_return declaration_statements199 = null;


        CommonTree char_literal200_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==IDENT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1690);
            	    declaration_statements197=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements197.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:46: ( statement_conjunctions declaration_statements )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==48) ) {
            	            int LA47_1 = input.LA(2);

            	            if ( (synpred89_malice_grammar()) ) {
            	                alt47=1;
            	            }


            	        }
            	        else if ( (LA47_0==53||(LA47_0>=62 && LA47_0<=64)) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1693);
            	    	    statement_conjunctions198=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions198.getTree());
            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1695);
            	    	    declaration_statements199=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements199.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    char_literal200=(Token)match(input,48,FOLLOW_48_in_global_declaration1699); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal200_tree = (CommonTree)adaptor.create(char_literal200);
            	    adaptor.addChild(root_0, char_literal200_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "global_declaration"

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:182:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF203=null;
        malice_grammarParser.global_declaration_return global_declaration201 = null;

        malice_grammarParser.function_return function202 = null;


        CommonTree EOF203_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:182:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:182:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_program1709);
            global_declaration201=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration201.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:182:30: ( function )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==68) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1711);
            	    function202=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function202.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            EOF203=(Token)match(input,EOF,FOLLOW_EOF_in_program1714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF203_tree = (CommonTree)adaptor.create(EOF203);
            adaptor.addChild(root_0, EOF203_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    // $ANTLR start synpred46_malice_grammar
    public final void synpred46_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:117:9: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:117:9: '.'
        {
        match(input,48,FOLLOW_48_in_synpred46_malice_grammar918); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_malice_grammar

    // $ANTLR start synpred52_malice_grammar
    public final void synpred52_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:11: ( expr )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred52_malice_grammar1073);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_malice_grammar

    // $ANTLR start synpred57_malice_grammar
    public final void synpred57_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:26: ( ( argument ( ',' argument )* )? )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:26: ( argument ( ',' argument )* )?
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:26: ( argument ( ',' argument )* )?
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( ((LA58_0>=STRING && LA58_0<=IDENT)||(LA58_0>=LETTER && LA58_0<=10)||(LA58_0>=12 && LA58_0<=14)||LA58_0==31) ) {
            alt58=1;
        }
        switch (alt58) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred57_malice_grammar1093);
                argument();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:36: ( ',' argument )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==53) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:37: ',' argument
                	    {
                	    match(input,53,FOLLOW_53_in_synpred57_malice_grammar1096); if (state.failed) return ;
                	    pushFollow(FOLLOW_argument_in_synpred57_malice_grammar1098);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop57;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred57_malice_grammar

    // $ANTLR start synpred58_malice_grammar
    public final void synpred58_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:21: ( expr print )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred58_malice_grammar1116);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_print_in_synpred58_malice_grammar1118);
        print();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred66_malice_grammar
    public final void synpred66_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:8: ( IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred66_malice_grammar1161); if (state.failed) return ;
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:11: ( '\\'s' expr 'piece' )?
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( (LA60_0==27) ) {
            alt60=1;
        }
        switch (alt60) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:132:12: '\\'s' expr 'piece'
                {
                match(input,27,FOLLOW_27_in_synpred66_malice_grammar1174); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred66_malice_grammar1176);
                expr();

                state._fsp--;
                if (state.failed) return ;
                match(input,28,FOLLOW_28_in_synpred66_malice_grammar1178); if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        int alt62=3;
        switch ( input.LA(1) ) {
        case 54:
            {
            alt62=1;
            }
            break;
        case 55:
            {
            alt62=2;
            }
            break;
        case 56:
            {
            alt62=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 62, 0, input);

            throw nvae;
        }

        switch (alt62) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:18: 'became' ( expr | LETTER | STRING )
                {
                match(input,54,FOLLOW_54_in_synpred66_malice_grammar1199); if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:28: ( expr | LETTER | STRING )
                int alt61=3;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case 10:
                case 12:
                case 13:
                case 14:
                case 31:
                    {
                    alt61=1;
                    }
                    break;
                case LETTER:
                    {
                    alt61=2;
                    }
                    break;
                case STRING:
                    {
                    alt61=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 0, input);

                    throw nvae;
                }

                switch (alt61) {
                    case 1 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:29: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred66_malice_grammar1203);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:36: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred66_malice_grammar1207); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:133:45: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred66_malice_grammar1211); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:18: 'ate'
                {
                match(input,55,FOLLOW_55_in_synpred66_malice_grammar1232); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:135:18: 'drank'
                {
                match(input,56,FOLLOW_56_in_synpred66_malice_grammar1252); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred66_malice_grammar

    // $ANTLR start synpred70_malice_grammar
    public final void synpred70_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:57: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:57: '.'
        {
        match(input,48,FOLLOW_48_in_synpred70_malice_grammar1354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_malice_grammar

    // $ANTLR start synpred72_malice_grammar
    public final void synpred72_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:13: ( rest_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred72_malice_grammar1403);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_malice_grammar

    // $ANTLR start synpred73_malice_grammar
    public final void synpred73_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:31: ( function_call )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred73_malice_grammar1407);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_malice_grammar

    // $ANTLR start synpred81_malice_grammar
    public final void synpred81_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:91: ( statement_conjunctions )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:91: statement_conjunctions
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred81_malice_grammar1470);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_malice_grammar

    // $ANTLR start synpred89_malice_grammar
    public final void synpred89_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:47: ( statement_conjunctions declaration_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:181:47: statement_conjunctions declaration_statements
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred89_malice_grammar1693);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declaration_statements_in_synpred89_malice_grammar1695);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_malice_grammar

    // Delegated rules

    public final boolean synpred66_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\13\uffff";
    static final String DFA27_minS =
        "\1\4\4\uffff\1\0\5\uffff";
    static final String DFA27_maxS =
        "\1\37\4\uffff\1\0\5\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\4";
    static final String DFA27_specialS =
        "\5\uffff\1\0\5\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\11\1\1\1\5\2\uffff\1\10\1\1\1\uffff\3\1\20\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
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
            return "127:1: argument : ( expr | LETTER | STRING | array_elem );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_malice_grammar()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\14\uffff";
    static final String DFA30_eofS =
        "\14\uffff";
    static final String DFA30_minS =
        "\1\4\4\uffff\1\0\6\uffff";
    static final String DFA30_maxS =
        "\1\37\4\uffff\1\0\6\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA30_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA30_transitionS = {
            "\2\1\1\5\2\uffff\6\1\20\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "128:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_malice_grammar()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\4\4\uffff\1\0\5\uffff";
    static final String DFA35_maxS =
        "\1\50\4\uffff\1\0\5\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\4\1\1\uffff\2\1\1\2\1\4\1\3";
    static final String DFA35_specialS =
        "\1\0\4\uffff\1\1\5\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\10\1\6\1\5\2\uffff\1\10\1\7\1\uffff\1\1\1\3\1\2\20\uffff"+
            "\1\4\10\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "129:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==12) && (synpred58_malice_grammar())) {s = 1;}

                        else if ( (LA35_0==14) && (synpred58_malice_grammar())) {s = 2;}

                        else if ( (LA35_0==13) && (synpred58_malice_grammar())) {s = 3;}

                        else if ( (LA35_0==31) && (synpred58_malice_grammar())) {s = 4;}

                        else if ( (LA35_0==IDENT) ) {s = 5;}

                        else if ( (LA35_0==NUMBER) && (synpred58_malice_grammar())) {s = 6;}

                        else if ( (LA35_0==10) && (synpred58_malice_grammar())) {s = 7;}

                        else if ( (LA35_0==STRING||LA35_0==LETTER) ) {s = 8;}

                        else if ( (LA35_0==40) ) {s = 9;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_malice_grammar()) ) {s = 7;}

                        else if ( (synpred66_malice_grammar()) ) {s = 10;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\14\uffff";
    static final String DFA39_eofS =
        "\14\uffff";
    static final String DFA39_minS =
        "\1\4\4\uffff\1\0\6\uffff";
    static final String DFA39_maxS =
        "\1\50\4\uffff\1\0\6\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String DFA39_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\1\1\5\2\uffff\2\1\1\uffff\3\1\20\uffff\1\1\10\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "151:1: statement : ( rest_statements | function_call | declaration_statements );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_malice_grammar()) ) {s = 1;}

                        else if ( (synpred73_malice_grammar()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_STRING_in_rule68 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10_in_lpar224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rpar231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_mono_op239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bin_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relational_ops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_array_elem311 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_expr_in_array_elem313 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_array_elem315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom321 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_atom324 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_expr_in_atom326 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_atom328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logical_ops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data_types0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term414 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_expr_in_term416 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_term418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_bool_neg427 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_term_in_bool_neg432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_unary_op440 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_14_in_unary_op445 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_13_in_unary_op450 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult462 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_17_in_mult466 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_16_in_mult471 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_15_in_mult476 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_unary_op_in_mult480 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_mult_in_add490 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_add494 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_14_in_add499 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_mult_in_add503 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_add_in_bool_comp513 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_25_in_bool_comp517 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_23_in_bool_comp522 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_24_in_bool_comp527 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_26_in_bool_comp532 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_add_in_bool_comp536 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq546 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_bool_eq550 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_22_in_bool_eq555 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq559 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and569 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_bitw_and572 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and575 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor585 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_bitw_xor588 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor591 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or601 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_bitw_or604 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or607 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and617 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_bool_and620 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and623 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_bool_and_in_bool_or633 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_bool_or636 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_and_in_bool_or639 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_bool_or_in_expr650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control_structure688 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_control_structure691 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure693 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure696 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure698 = new BitSet(new long[]{0xC42131A880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure712 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_control_structure726 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_control_structure728 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_control_structure731 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure733 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure736 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure738 = new BitSet(new long[]{0xC42131A880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure740 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_control_structure755 = new BitSet(new long[]{0xC421318880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure758 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure772 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_control_structure774 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_control_structure776 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure778 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure780 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_44_in_control_structure792 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_control_structure795 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure797 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure800 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure802 = new BitSet(new long[]{0xC421312880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure814 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure827 = new BitSet(new long[]{0xC421318880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure830 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure842 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_control_structure844 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_control_structure846 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure848 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure850 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45_in_control_structure872 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_control_structure875 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure877 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure880 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure882 = new BitSet(new long[]{0xC421710880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure894 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_control_structure906 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_control_structure908 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_control_structure918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements936 = new BitSet(new long[]{0x0010020000000000L});
    public static final BitSet FOLLOW_41_in_declaration_statements940 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declaration_statements942 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements944 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_declaration_statements948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declaration_statements952 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_declaration_statements1003 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_atom_in_declaration_statements1005 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1093 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_arguments_to_functions1096 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1098 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1125 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1144 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1161 = new BitSet(new long[]{0x01C0000008000000L});
    public static final BitSet FOLLOW_27_in_rest_statements1174 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_expr_in_rest_statements1176 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rest_statements1178 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements1199 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_expr_in_rest_statements1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rest_statements1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rest_statements1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements1306 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rest_statements1308 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_expr_in_rest_statements1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_read_statement1339 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_read_statement1341 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1344 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1348 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_read_statement1351 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_read_statement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_print1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_print1372 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_print1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1389 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_function_call1391 = new BitSet(new long[]{0x0000000080007E70L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function_call1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement_conjunctions0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1456 = new BitSet(new long[]{0xC021010080007670L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1459 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_control_structure_in_statementList1464 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_read_statement_in_statementList1468 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1470 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_nested_function_in_statementList1475 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_function_in_statementList1499 = new BitSet(new long[]{0xC421310880007672L,0x0000000000000015L});
    public static final BitSet FOLLOW_65_in_parameter1511 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_parameter1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1528 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_parameters1532 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1534 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_nested_function1554 = new BitSet(new long[]{0xC421310880007670L,0x000000000000001DL});
    public static final BitSet FOLLOW_statementList_in_nested_function1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_nested_function1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_function1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_function1571 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_function_name_in_function1573 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_function1575 = new BitSet(new long[]{0x0000000700000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_function1577 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_70_in_function1602 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_function_name_in_function1604 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_lpar_in_function1606 = new BitSet(new long[]{0x0000000700000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_function1608 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function1612 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function1614 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_data_types_in_function1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_function1647 = new BitSet(new long[]{0xC421310880007670L,0x000000000000001DL});
    public static final BitSet FOLLOW_statementList_in_function1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1690 = new BitSet(new long[]{0xC021010080007670L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1693 = new BitSet(new long[]{0x0000010080007670L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1695 = new BitSet(new long[]{0xC021010080007670L,0x0000000000000001L});
    public static final BitSet FOLLOW_48_in_global_declaration1699 = new BitSet(new long[]{0x0000010080007672L});
    public static final BitSet FOLLOW_global_declaration_in_program1709 = new BitSet(new long[]{0xC421310880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_function_in_program1711 = new BitSet(new long[]{0xC421310880007670L,0x0000000000000015L});
    public static final BitSet FOLLOW_EOF_in_program1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred46_malice_grammar918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_malice_grammar1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred57_malice_grammar1093 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_synpred57_malice_grammar1096 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_argument_in_synpred57_malice_grammar1098 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred58_malice_grammar1116 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_print_in_synpred58_malice_grammar1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred66_malice_grammar1161 = new BitSet(new long[]{0x01C0000008000000L});
    public static final BitSet FOLLOW_27_in_synpred66_malice_grammar1174 = new BitSet(new long[]{0x0000000080007460L});
    public static final BitSet FOLLOW_expr_in_synpred66_malice_grammar1176 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred66_malice_grammar1178 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_54_in_synpred66_malice_grammar1199 = new BitSet(new long[]{0x0000000080007670L});
    public static final BitSet FOLLOW_expr_in_synpred66_malice_grammar1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred66_malice_grammar1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred66_malice_grammar1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred66_malice_grammar1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred66_malice_grammar1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred70_malice_grammar1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred72_malice_grammar1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred73_malice_grammar1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred81_malice_grammar1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred89_malice_grammar1693 = new BitSet(new long[]{0x0000010080007670L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred89_malice_grammar1695 = new BitSet(new long[]{0x0000000000000002L});

}