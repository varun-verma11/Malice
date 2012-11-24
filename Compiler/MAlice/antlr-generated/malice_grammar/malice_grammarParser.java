// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-24 20:27:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "IDENT", "WS", "LINE_COMMENT", "LETTER", "STRING", "'('", "')'", "'\\'s'", "'piece'", "'number'", "'letter'", "'sentence'", "'!'", "'~'", "'-'", "'+'", "'*'", "'/'", "'%'", "'<='", "'<'", "'>'", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'perhaps'", "'so'", "'or'", "'maybe'", "'because'", "'Alice'", "'was'", "'unsure'", "'which'", "'either'", "'eventually'", "'enough'", "'times'", "'.'", "'a'", "'too'", "'of'", "'had'", "','", "'spoke'", "'said'", "'became'", "'ate'", "'drank'", "'found'", "'what'", "'?'", "'and'", "'then'", "'but'", "'spider'", "'opened'", "'closed'", "'The'", "'looking'", "'glass'", "'room'", "'contained'"
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
    public static final int LETTER=8;
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
    public static final int WS=6;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=9;

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


    public static class lpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal1=null;

        CommonTree char_literal1_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:5: ( '(' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal1=(Token)match(input,10,FOLLOW_10_in_lpar213); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal1_tree = (CommonTree)adaptor.create(char_literal1);
            adaptor.addChild(root_0, char_literal1_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:5: ( ')' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal2=(Token)match(input,11,FOLLOW_11_in_rpar220); if (state.failed) return retval;
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
    // $ANTLR end "rpar"

    public static class array_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_elem"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:1: array_elem : IDENT '\\'s' expr 'piece' ;
    public final malice_grammarParser.array_elem_return array_elem() throws RecognitionException {
        malice_grammarParser.array_elem_return retval = new malice_grammarParser.array_elem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT3=null;
        Token string_literal4=null;
        Token string_literal6=null;
        malice_grammarParser.expr_return expr5 = null;


        CommonTree IDENT3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree string_literal6_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:12: ( IDENT '\\'s' expr 'piece' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:14: IDENT '\\'s' expr 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
            adaptor.addChild(root_0, IDENT3_tree);
            }
            string_literal4=(Token)match(input,12,FOLLOW_12_in_array_elem230); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_array_elem233);
            expr5=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr5.getTree());
            string_literal6=(Token)match(input,13,FOLLOW_13_in_array_elem235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:1: atom : ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call );
    public final malice_grammarParser.atom_return atom() throws RecognitionException {
        malice_grammarParser.atom_return retval = new malice_grammarParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT7=null;
        Token string_literal8=null;
        Token string_literal10=null;
        Token NUMBER11=null;
        malice_grammarParser.expr_return expr9 = null;

        malice_grammarParser.function_call_return function_call12 = null;


        CommonTree IDENT7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal10_tree=null;
        CommonTree NUMBER11_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:5: ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=11 && LA2_1<=16)||(LA2_1>=19 && LA2_1<=34)||LA2_1==48||(LA2_1>=53 && LA2_1<=55)||(LA2_1>=62 && LA2_1<=64)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==10) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==NUMBER) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:7: IDENT ( '\\'s' expr 'piece' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT7_tree = (CommonTree)adaptor.create(IDENT7);
                    adaptor.addChild(root_0, IDENT7_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:13: ( '\\'s' expr 'piece' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:14: '\\'s' expr 'piece'
                            {
                            string_literal8=(Token)match(input,12,FOLLOW_12_in_atom244); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_atom247);
                            expr9=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr9.getTree());
                            string_literal10=(Token)match(input,13,FOLLOW_13_in_atom249); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
                            adaptor.addChild(root_0, string_literal10_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:38: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER11_tree = (CommonTree)adaptor.create(NUMBER11);
                    adaptor.addChild(root_0, NUMBER11_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:47: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_atom259);
                    function_call12=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call12.getTree());

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

    public static class data_types_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_types"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:1: data_types : ( 'number' | 'letter' | 'sentence' );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:12: ( 'number' | 'letter' | 'sentence' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=14 && input.LA(1)<=16) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set13));
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom14 = null;

        malice_grammarParser.lpar_return lpar15 = null;

        malice_grammarParser.expr_return expr16 = null;

        malice_grammarParser.rpar_return rpar17 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:6: ( atom | lpar expr rpar )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=NUMBER && LA3_0<=IDENT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==10) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_term285);
                    atom14=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:36:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_term289);
                    lpar15=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar15.getTree());
                    pushFollow(FOLLOW_expr_in_term291);
                    expr16=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr16.getTree());
                    pushFollow(FOLLOW_rpar_in_term293);
                    rpar17=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar17.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        malice_grammarParser.term_return term19 = null;


        CommonTree char_literal18_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:10: ( ( '!' )* term )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:12: ( '!' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:37:13: '!'
            	    {
            	    char_literal18=(Token)match(input,17,FOLLOW_17_in_bool_neg302); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal18_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_bool_neg307);
            term19=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term19.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
    public final malice_grammarParser.unary_op_return unary_op() throws RecognitionException {
        malice_grammarParser.unary_op_return retval = new malice_grammarParser.unary_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        malice_grammarParser.bool_neg_return bool_neg23 = null;


        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:10: ( ( '~' | '-' | '+' )* bool_neg )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:12: ( '~' | '-' | '+' )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt5=1;
                    }
                    break;
                case 19:
                    {
                    alt5=2;
                    }
                    break;
                case 20:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:13: '~'
            	    {
            	    char_literal20=(Token)match(input,18,FOLLOW_18_in_unary_op315); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:20: '-'
            	    {
            	    char_literal21=(Token)match(input,19,FOLLOW_19_in_unary_op320); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal21_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:38:27: '+'
            	    {
            	    char_literal22=(Token)match(input,20,FOLLOW_20_in_unary_op325); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal22_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_bool_neg_in_unary_op330);
            bool_neg23=bool_neg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg23.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
    public final malice_grammarParser.mult_return mult() throws RecognitionException {
        malice_grammarParser.mult_return retval = new malice_grammarParser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        malice_grammarParser.unary_op_return unary_op24 = null;

        malice_grammarParser.unary_op_return unary_op28 = null;


        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_op_in_mult337);
            unary_op24=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op24.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:17: ( '*' | '/' | '%' )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:18: '*'
            	            {
            	            char_literal25=(Token)match(input,21,FOLLOW_21_in_mult341); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:25: '/'
            	            {
            	            char_literal26=(Token)match(input,22,FOLLOW_22_in_mult346); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:39:32: '%'
            	            {
            	            char_literal27=(Token)match(input,23,FOLLOW_23_in_mult351); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_op_in_mult355);
            	    unary_op28=unary_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final malice_grammarParser.add_return add() throws RecognitionException {
        malice_grammarParser.add_return retval = new malice_grammarParser.add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal30=null;
        Token char_literal31=null;
        malice_grammarParser.mult_return mult29 = null;

        malice_grammarParser.mult_return mult32 = null;


        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:5: ( mult ( ( '+' | '-' ) mult )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add365);
            mult29=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult29.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:12: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:13: ( '+' | '-' ) mult
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:13: ( '+' | '-' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==19) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:14: '+'
            	            {
            	            char_literal30=(Token)match(input,20,FOLLOW_20_in_add369); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:40:21: '-'
            	            {
            	            char_literal31=(Token)match(input,19,FOLLOW_19_in_add374); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add378);
            	    mult32=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult32.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
    public final malice_grammarParser.bool_comp_return bool_comp() throws RecognitionException {
        malice_grammarParser.bool_comp_return retval = new malice_grammarParser.bool_comp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token string_literal37=null;
        malice_grammarParser.add_return add33 = null;

        malice_grammarParser.add_return add38 = null;


        CommonTree string_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree string_literal37_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_comp388);
            add33=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add33.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=24 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:18: ( '<=' | '<' | '>' | '>=' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:19: '<='
            	            {
            	            string_literal34=(Token)match(input,24,FOLLOW_24_in_bool_comp392); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal34_tree = (CommonTree)adaptor.create(string_literal34);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal34_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:27: '<'
            	            {
            	            char_literal35=(Token)match(input,25,FOLLOW_25_in_bool_comp397); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:34: '>'
            	            {
            	            char_literal36=(Token)match(input,26,FOLLOW_26_in_bool_comp402); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:41:41: '>='
            	            {
            	            string_literal37=(Token)match(input,27,FOLLOW_27_in_bool_comp407); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal37_tree = (CommonTree)adaptor.create(string_literal37);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal37_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_bool_comp411);
            	    add38=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
    public final malice_grammarParser.bool_eq_return bool_eq() throws RecognitionException {
        malice_grammarParser.bool_eq_return retval = new malice_grammarParser.bool_eq_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal40=null;
        Token string_literal41=null;
        malice_grammarParser.bool_comp_return bool_comp39 = null;

        malice_grammarParser.bool_comp_return bool_comp42 = null;


        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_comp_in_bool_eq421);
            bool_comp39=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp39.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:21: ( ( '==' | '!=' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:22: ( '==' | '!=' ) bool_comp
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:22: ( '==' | '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==28) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==29) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:23: '=='
            	            {
            	            string_literal40=(Token)match(input,28,FOLLOW_28_in_bool_eq425); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal40_tree = (CommonTree)adaptor.create(string_literal40);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:42:31: '!='
            	            {
            	            string_literal41=(Token)match(input,29,FOLLOW_29_in_bool_eq430); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal41_tree = (CommonTree)adaptor.create(string_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal41_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_comp_in_bool_eq434);
            	    bool_comp42=bool_comp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp42.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:43:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal44=null;
        malice_grammarParser.bool_eq_return bool_eq43 = null;

        malice_grammarParser.bool_eq_return bool_eq45 = null;


        CommonTree char_literal44_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:43:10: ( bool_eq ( '&' bool_eq )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:43:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_eq_in_bitw_and444);
            bool_eq43=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq43.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:43:20: ( '&' bool_eq )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:43:21: '&' bool_eq
            	    {
            	    char_literal44=(Token)match(input,30,FOLLOW_30_in_bitw_and447); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal44_tree = (CommonTree)adaptor.create(char_literal44);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal44_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_eq_in_bitw_and450);
            	    bool_eq45=bool_eq();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq45.getTree());

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
    // $ANTLR end "bitw_and"

    public static class bitw_xor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitw_xor"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:44:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal47=null;
        malice_grammarParser.bitw_and_return bitw_and46 = null;

        malice_grammarParser.bitw_and_return bitw_and48 = null;


        CommonTree char_literal47_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:44:10: ( bitw_and ( '^' bitw_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:44:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_and_in_bitw_xor460);
            bitw_and46=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and46.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:44:21: ( '^' bitw_and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:44:22: '^' bitw_and
            	    {
            	    char_literal47=(Token)match(input,31,FOLLOW_31_in_bitw_xor463); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal47_tree = (CommonTree)adaptor.create(char_literal47);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal47_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor466);
            	    bitw_and48=bitw_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and48.getTree());

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
    // $ANTLR end "bitw_xor"

    public static class bitw_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitw_or"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:45:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal50=null;
        malice_grammarParser.bitw_xor_return bitw_xor49 = null;

        malice_grammarParser.bitw_xor_return bitw_xor51 = null;


        CommonTree char_literal50_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:45:9: ( bitw_xor ( '|' bitw_xor )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:45:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_xor_in_bitw_or476);
            bitw_xor49=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor49.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:45:20: ( '|' bitw_xor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:45:21: '|' bitw_xor
            	    {
            	    char_literal50=(Token)match(input,32,FOLLOW_32_in_bitw_or479); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal50_tree = (CommonTree)adaptor.create(char_literal50);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or482);
            	    bitw_xor51=bitw_xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor51.getTree());

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
    // $ANTLR end "bitw_or"

    public static class bool_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:46:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal53=null;
        malice_grammarParser.bitw_or_return bitw_or52 = null;

        malice_grammarParser.bitw_or_return bitw_or54 = null;


        CommonTree string_literal53_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:46:10: ( bitw_or ( '&&' bitw_or )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:46:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_or_in_bool_and492);
            bitw_or52=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or52.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:46:20: ( '&&' bitw_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:46:21: '&&' bitw_or
            	    {
            	    string_literal53=(Token)match(input,33,FOLLOW_33_in_bool_and495); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal53_tree = (CommonTree)adaptor.create(string_literal53);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal53_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_or_in_bool_and498);
            	    bitw_or54=bitw_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or54.getTree());

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
    // $ANTLR end "bool_and"

    public static class bool_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_or"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:47:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal56=null;
        malice_grammarParser.bool_and_return bool_and55 = null;

        malice_grammarParser.bool_and_return bool_and57 = null;


        CommonTree string_literal56_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:47:9: ( bool_and ( '||' bool_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:47:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_in_bool_or508);
            bool_and55=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and55.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:47:20: ( '||' bool_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:47:21: '||' bool_and
            	    {
            	    string_literal56=(Token)match(input,34,FOLLOW_34_in_bool_or511); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal56_tree = (CommonTree)adaptor.create(string_literal56);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal56_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_and_in_bool_or514);
            	    bool_and57=bool_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and57.getTree());

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
    // $ANTLR end "bool_or"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:49:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or58 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:49:6: ( bool_or )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:49:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_in_expr525);
            bool_or58=bool_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or58.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr59 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:11: ( expr )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:51:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_bool_expr534);
            expr59=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr59.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:53:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal60=null;
        Token string_literal64=null;
        Token string_literal66=null;
        Token string_literal67=null;
        Token string_literal71=null;
        Token string_literal73=null;
        Token string_literal75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal84=null;
        Token string_literal86=null;
        Token string_literal88=null;
        Token string_literal89=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token string_literal97=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token char_literal101=null;
        malice_grammarParser.lpar_return lpar61 = null;

        malice_grammarParser.bool_expr_return bool_expr62 = null;

        malice_grammarParser.rpar_return rpar63 = null;

        malice_grammarParser.statementList_return statementList65 = null;

        malice_grammarParser.lpar_return lpar68 = null;

        malice_grammarParser.bool_expr_return bool_expr69 = null;

        malice_grammarParser.rpar_return rpar70 = null;

        malice_grammarParser.statementList_return statementList72 = null;

        malice_grammarParser.statementList_return statementList74 = null;

        malice_grammarParser.lpar_return lpar81 = null;

        malice_grammarParser.bool_expr_return bool_expr82 = null;

        malice_grammarParser.rpar_return rpar83 = null;

        malice_grammarParser.statementList_return statementList85 = null;

        malice_grammarParser.statementList_return statementList87 = null;

        malice_grammarParser.lpar_return lpar94 = null;

        malice_grammarParser.bool_expr_return bool_expr95 = null;

        malice_grammarParser.rpar_return rpar96 = null;

        malice_grammarParser.statementList_return statementList98 = null;


        CommonTree string_literal60_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree string_literal73_tree=null;
        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        CommonTree char_literal101_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:54:7: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:54:9: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:54:9: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 45:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:54:11: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal60=(Token)match(input,35,FOLLOW_35_in_control_structure551); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal60_tree = (CommonTree)adaptor.create(string_literal60);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal60_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure554);
                    lpar61=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar61.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure556);
                    bool_expr62=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr62.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure558);
                    rpar63=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar63.getTree());
                    string_literal64=(Token)match(input,36,FOLLOW_36_in_control_structure560); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure575);
                    statementList65=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList65.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:56:11: ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==37) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==38) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:56:12: 'or' 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal66=(Token)match(input,37,FOLLOW_37_in_control_structure589); if (state.failed) return retval;
                    	    string_literal67=(Token)match(input,38,FOLLOW_38_in_control_structure592); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lpar_in_control_structure595);
                    	    lpar68=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar68.getTree());
                    	    pushFollow(FOLLOW_bool_expr_in_control_structure597);
                    	    bool_expr69=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr69.getTree());
                    	    pushFollow(FOLLOW_rpar_in_control_structure599);
                    	    rpar70=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar70.getTree());
                    	    string_literal71=(Token)match(input,36,FOLLOW_36_in_control_structure601); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_statementList_in_control_structure604);
                    	    statementList72=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:57:11: ( 'or' statementList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==37) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:57:12: 'or' statementList
                            {
                            string_literal73=(Token)match(input,37,FOLLOW_37_in_control_structure619); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal73_tree = (CommonTree)adaptor.create(string_literal73);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal73_tree, root_0);
                            }
                            pushFollow(FOLLOW_statementList_in_control_structure622);
                            statementList74=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList74.getTree());

                            }
                            break;

                    }

                    string_literal75=(Token)match(input,39,FOLLOW_39_in_control_structure636); if (state.failed) return retval;
                    string_literal76=(Token)match(input,40,FOLLOW_40_in_control_structure639); if (state.failed) return retval;
                    string_literal77=(Token)match(input,41,FOLLOW_41_in_control_structure642); if (state.failed) return retval;
                    string_literal78=(Token)match(input,42,FOLLOW_42_in_control_structure645); if (state.failed) return retval;
                    string_literal79=(Token)match(input,43,FOLLOW_43_in_control_structure648); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:59:11: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal80=(Token)match(input,44,FOLLOW_44_in_control_structure661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal80_tree = (CommonTree)adaptor.create(string_literal80);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal80_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure664);
                    lpar81=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar81.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure666);
                    bool_expr82=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr82.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure668);
                    rpar83=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar83.getTree());
                    string_literal84=(Token)match(input,36,FOLLOW_36_in_control_structure670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal84_tree = (CommonTree)adaptor.create(string_literal84);
                    adaptor.addChild(root_0, string_literal84_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure682);
                    statementList85=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList85.getTree());
                    string_literal86=(Token)match(input,37,FOLLOW_37_in_control_structure695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure697);
                    statementList87=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList87.getTree());
                    string_literal88=(Token)match(input,39,FOLLOW_39_in_control_structure709); if (state.failed) return retval;
                    string_literal89=(Token)match(input,40,FOLLOW_40_in_control_structure712); if (state.failed) return retval;
                    string_literal90=(Token)match(input,41,FOLLOW_41_in_control_structure715); if (state.failed) return retval;
                    string_literal91=(Token)match(input,42,FOLLOW_42_in_control_structure718); if (state.failed) return retval;
                    string_literal92=(Token)match(input,43,FOLLOW_43_in_control_structure721); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:63:11: 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times'
                    {
                    string_literal93=(Token)match(input,45,FOLLOW_45_in_control_structure734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal93_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure737);
                    lpar94=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar94.getTree());
                    pushFollow(FOLLOW_bool_expr_in_control_structure739);
                    bool_expr95=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr95.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure741);
                    rpar96=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar96.getTree());
                    string_literal97=(Token)match(input,39,FOLLOW_39_in_control_structure743); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure756);
                    statementList98=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList98.getTree());
                    string_literal99=(Token)match(input,46,FOLLOW_46_in_control_structure768); if (state.failed) return retval;
                    string_literal100=(Token)match(input,47,FOLLOW_47_in_control_structure771); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:12: ( '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred31_malice_grammar()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: '.'
                    {
                    char_literal101=(Token)match(input,48,FOLLOW_48_in_control_structure782); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:1: declaration_statements : IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT102=null;
        Token string_literal103=null;
        Token char_literal104=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token LETTER108=null;
        Token STRING109=null;
        Token string_literal111=null;
        malice_grammarParser.data_types_return data_types105 = null;

        malice_grammarParser.expr_return expr110 = null;

        malice_grammarParser.atom_return atom112 = null;

        malice_grammarParser.data_types_return data_types113 = null;


        CommonTree IDENT102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree LETTER108_tree=null;
        CommonTree STRING109_tree=null;
        CommonTree string_literal111_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:24: ( IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:26: IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT102=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements792); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT102_tree = (CommonTree)adaptor.create(IDENT102);
            adaptor.addChild(root_0, IDENT102_tree);
            }
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:32: ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( (LA25_0==52) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:34: 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal103=(Token)match(input,41,FOLLOW_41_in_declaration_statements796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal103_tree, root_0);
                    }
                    char_literal104=(Token)match(input,49,FOLLOW_49_in_declaration_statements799); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_declaration_statements802);
                    data_types105=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types105.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:57: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==50) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==51) ) {
                        alt24=2;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:59: 'too'
                            {
                            string_literal106=(Token)match(input,50,FOLLOW_50_in_declaration_statements806); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = (CommonTree)adaptor.create(string_literal106);
                            adaptor.addChild(root_0, string_literal106_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:67: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal107=(Token)match(input,51,FOLLOW_51_in_declaration_statements810); if (state.failed) return retval;
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:73: ( LETTER | STRING | expr )
                            int alt23=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt23=1;
                                }
                                break;
                            case STRING:
                                {
                                alt23=2;
                                }
                                break;
                            case NUMBER:
                            case IDENT:
                            case 10:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                {
                                alt23=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 0, input);

                                throw nvae;
                            }

                            switch (alt23) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:74: LETTER
                                    {
                                    LETTER108=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements814); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER108_tree = (CommonTree)adaptor.create(LETTER108);
                                    adaptor.addChild(root_0, LETTER108_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:83: STRING
                                    {
                                    STRING109=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements818); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING109_tree = (CommonTree)adaptor.create(STRING109);
                                    adaptor.addChild(root_0, STRING109_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:68:92: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements822);
                                    expr110=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:69:35: 'had' atom data_types
                    {
                    string_literal111=(Token)match(input,52,FOLLOW_52_in_declaration_statements862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal111_tree = (CommonTree)adaptor.create(string_literal111);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal111_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_declaration_statements865);
                    atom112=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom112.getTree());
                    pushFollow(FOLLOW_data_types_in_declaration_statements867);
                    data_types113=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types113.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER115=null;
        Token STRING116=null;
        malice_grammarParser.expr_return expr114 = null;

        malice_grammarParser.array_elem_return array_elem117 = null;


        CommonTree LETTER115_tree=null;
        CommonTree STRING116_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:9: ( expr | LETTER | STRING | array_elem )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_argument933);
                    expr114=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LETTER115=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER115_tree = (CommonTree)adaptor.create(LETTER115);
                    adaptor.addChild(root_0, LETTER115_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_argument941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING116_tree = (CommonTree)adaptor.create(STRING116);
                    adaptor.addChild(root_0, STRING116_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_elem_in_argument945);
                    array_elem117=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem117.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal119=null;
        malice_grammarParser.argument_return argument118 = null;

        malice_grammarParser.argument_return argument120 = null;

        malice_grammarParser.function_call_return function_call121 = null;


        CommonTree char_literal119_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:26: ( argument ( ',' argument )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=NUMBER && LA28_0<=IDENT)||(LA28_0>=LETTER && LA28_0<=10)||(LA28_0>=17 && LA28_0<=20)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions953);
                            argument118=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument118.getTree());
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:36: ( ',' argument )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==53) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:37: ',' argument
                            	    {
                            	    char_literal119=(Token)match(input,53,FOLLOW_53_in_arguments_to_functions956); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions959);
                            	    argument120=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument120.getTree());

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
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:57: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_arguments_to_functions967);
                    function_call121=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call121.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:1: rest_statements : ( ( expr ( 'spoke' | 'said' 'Alice' ) )=> ( expr ( 'spoke' | 'said' 'Alice' ) ) | ( LETTER | STRING ) ( 'spoke' | 'said' 'Alice' ) | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token set126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token IDENT130=null;
        Token string_literal131=null;
        Token string_literal133=null;
        Token string_literal134=null;
        Token LETTER136=null;
        Token STRING137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token LETTER143=null;
        Token STRING144=null;
        malice_grammarParser.expr_return expr122 = null;

        malice_grammarParser.expr_return expr132 = null;

        malice_grammarParser.expr_return expr135 = null;

        malice_grammarParser.expr_return expr142 = null;


        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree set126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree IDENT130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree LETTER136_tree=null;
        CommonTree STRING137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree LETTER143_tree=null;
        CommonTree STRING144_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:17: ( ( expr ( 'spoke' | 'said' 'Alice' ) )=> ( expr ( 'spoke' | 'said' 'Alice' ) ) | ( LETTER | STRING ) ( 'spoke' | 'said' 'Alice' ) | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:21: ( expr ( 'spoke' | 'said' 'Alice' ) )=> ( expr ( 'spoke' | 'said' 'Alice' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:61: ( expr ( 'spoke' | 'said' 'Alice' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:62: expr ( 'spoke' | 'said' 'Alice' )
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements996);
                    expr122=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:67: ( 'spoke' | 'said' 'Alice' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==54) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==55) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:68: 'spoke'
                            {
                            string_literal123=(Token)match(input,54,FOLLOW_54_in_rest_statements999); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal123_tree = (CommonTree)adaptor.create(string_literal123);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal123_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:79: 'said' 'Alice'
                            {
                            string_literal124=(Token)match(input,55,FOLLOW_55_in_rest_statements1004); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal124_tree = (CommonTree)adaptor.create(string_literal124);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal124_tree, root_0);
                            }
                            string_literal125=(Token)match(input,40,FOLLOW_40_in_rest_statements1007); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal125_tree = (CommonTree)adaptor.create(string_literal125);
                            adaptor.addChild(root_0, string_literal125_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:9: ( LETTER | STRING ) ( 'spoke' | 'said' 'Alice' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set126=(Token)input.LT(1);
                    if ( (input.LA(1)>=LETTER && input.LA(1)<=STRING) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set126));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:27: ( 'spoke' | 'said' 'Alice' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==54) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==55) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:28: 'spoke'
                            {
                            string_literal127=(Token)match(input,54,FOLLOW_54_in_rest_statements1034); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal127_tree = (CommonTree)adaptor.create(string_literal127);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal127_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:39: 'said' 'Alice'
                            {
                            string_literal128=(Token)match(input,55,FOLLOW_55_in_rest_statements1039); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal128_tree = (CommonTree)adaptor.create(string_literal128);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal128_tree, root_0);
                            }
                            string_literal129=(Token)match(input,40,FOLLOW_40_in_rest_statements1042); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal129_tree = (CommonTree)adaptor.create(string_literal129);
                            adaptor.addChild(root_0, string_literal129_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT130_tree = (CommonTree)adaptor.create(IDENT130);
                    adaptor.addChild(root_0, IDENT130_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:11: ( '\\'s' expr 'piece' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==12) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:12: '\\'s' expr 'piece'
                            {
                            string_literal131=(Token)match(input,12,FOLLOW_12_in_rest_statements1065); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_rest_statements1068);
                            expr132=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());
                            string_literal133=(Token)match(input,13,FOLLOW_13_in_rest_statements1070); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal133_tree = (CommonTree)adaptor.create(string_literal133);
                            adaptor.addChild(root_0, string_literal133_tree);
                            }

                            }
                            break;

                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt34=1;
                        }
                        break;
                    case 57:
                        {
                        alt34=2;
                        }
                        break;
                    case 58:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:18: 'became' ( expr | LETTER | STRING )
                            {
                            string_literal134=(Token)match(input,56,FOLLOW_56_in_rest_statements1091); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal134_tree = (CommonTree)adaptor.create(string_literal134);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal134_tree, root_0);
                            }
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:29: ( expr | LETTER | STRING )
                            int alt33=3;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case IDENT:
                            case 10:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                {
                                alt33=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt33=2;
                                }
                                break;
                            case STRING:
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
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:30: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1096);
                                    expr135=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:37: LETTER
                                    {
                                    LETTER136=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1100); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER136_tree = (CommonTree)adaptor.create(LETTER136);
                                    adaptor.addChild(root_0, LETTER136_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:46: STRING
                                    {
                                    STRING137=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1104); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING137_tree = (CommonTree)adaptor.create(STRING137);
                                    adaptor.addChild(root_0, STRING137_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:18: 'ate'
                            {
                            string_literal138=(Token)match(input,57,FOLLOW_57_in_rest_statements1125); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal138_tree = (CommonTree)adaptor.create(string_literal138);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal138_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:18: 'drank'
                            {
                            string_literal139=(Token)match(input,58,FOLLOW_58_in_rest_statements1146); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal139_tree = (CommonTree)adaptor.create(string_literal139);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal139_tree, root_0);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:7: 'Alice' 'found' ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal140=(Token)match(input,40,FOLLOW_40_in_rest_statements1179); if (state.failed) return retval;
                    string_literal141=(Token)match(input,59,FOLLOW_59_in_rest_statements1182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (CommonTree)adaptor.create(string_literal141);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal141_tree, root_0);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:25: ( expr | LETTER | STRING )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case IDENT:
                    case 10:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        {
                        alt35=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt35=2;
                        }
                        break;
                    case STRING:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:26: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1186);
                            expr142=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr142.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:33: LETTER
                            {
                            LETTER143=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1190); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER143_tree = (CommonTree)adaptor.create(LETTER143);
                            adaptor.addChild(root_0, LETTER143_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:42: STRING
                            {
                            STRING144=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1194); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING144_tree = (CommonTree)adaptor.create(STRING144);
                            adaptor.addChild(root_0, STRING144_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:1: read_statement : 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )? ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal145=null;
        Token string_literal146=null;
        Token IDENT147=null;
        Token char_literal149=null;
        Token char_literal150=null;
        malice_grammarParser.array_elem_return array_elem148 = null;


        CommonTree string_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree IDENT147_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree char_literal150_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:16: ( 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:18: 'what' 'was' ( IDENT | array_elem ) '?' ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal145=(Token)match(input,60,FOLLOW_60_in_read_statement1209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal145_tree = (CommonTree)adaptor.create(string_literal145);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal145_tree, root_0);
            }
            string_literal146=(Token)match(input,41,FOLLOW_41_in_read_statement1212); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:33: ( IDENT | array_elem )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==12) ) {
                    alt37=2;
                }
                else if ( (LA37_1==61) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:34: IDENT
                    {
                    IDENT147=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT147_tree = (CommonTree)adaptor.create(IDENT147);
                    adaptor.addChild(root_0, IDENT147_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:42: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1220);
                    array_elem148=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem148.getTree());

                    }
                    break;

            }

            char_literal149=(Token)match(input,61,FOLLOW_61_in_read_statement1223); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:59: ( '.' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred58_malice_grammar()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:60: '.'
                    {
                    char_literal150=(Token)match(input,48,FOLLOW_48_in_read_statement1227); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:1: print : ( 'spoke' | 'said' 'Alice' );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal151=null;
        Token string_literal152=null;
        Token string_literal153=null;

        CommonTree string_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree string_literal153_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:6: ( 'spoke' | 'said' 'Alice' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            else if ( (LA39_0==55) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:5: 'spoke'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal151=(Token)match(input,54,FOLLOW_54_in_print1242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal151_tree = (CommonTree)adaptor.create(string_literal151);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal151_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:16: 'said' 'Alice'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal152=(Token)match(input,55,FOLLOW_55_in_print1247); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal152_tree = (CommonTree)adaptor.create(string_literal152);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal152_tree, root_0);
                    }
                    string_literal153=(Token)match(input,40,FOLLOW_40_in_print1250); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name154 = null;

        malice_grammarParser.lpar_return lpar155 = null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions156 = null;

        malice_grammarParser.rpar_return rpar157 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:17: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_name_in_function_call1264);
            function_name154=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(function_name154.getTree(), root_0);
            pushFollow(FOLLOW_lpar_in_function_call1267);
            lpar155=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar155.getTree());
            pushFollow(FOLLOW_arguments_to_functions_in_function_call1269);
            arguments_to_functions156=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions156.getTree());
            pushFollow(FOLLOW_rpar_in_function_call1271);
            rpar157=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar157.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements158 = null;

        malice_grammarParser.function_call_return function_call159 = null;

        malice_grammarParser.declaration_statements_return declaration_statements160 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:11: ( rest_statements | function_call | declaration_statements )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rest_statements_in_statement1279);
                    rest_statements158=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements158.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_statement1283);
                    function_call159=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call159.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:47: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statements_in_statement1287);
                    declaration_statements160=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements160.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:1: statement_conjunctions : ( 'and' | 'then' | 'but' | ',' | '.' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token char_literal164=null;
        Token char_literal165=null;

        CommonTree string_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal163_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree char_literal165_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:24: ( 'and' | 'then' | 'but' | ',' | '.' )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt41=1;
                }
                break;
            case 63:
                {
                alt41=2;
                }
                break;
            case 64:
                {
                alt41=3;
                }
                break;
            case 53:
                {
                alt41=4;
                }
                break;
            case 48:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:26: 'and'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal161=(Token)match(input,62,FOLLOW_62_in_statement_conjunctions1300); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:35: 'then'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal162=(Token)match(input,63,FOLLOW_63_in_statement_conjunctions1305); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:45: 'but'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal163=(Token)match(input,64,FOLLOW_64_in_statement_conjunctions1310); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:54: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal164=(Token)match(input,53,FOLLOW_53_in_statement_conjunctions1315); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:95:60: '.'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal165=(Token)match(input,48,FOLLOW_48_in_statement_conjunctions1319); if (state.failed) return retval;

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
    // $ANTLR end "statement_conjunctions"

    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementList"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:1: statementList : ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.statement_return statement166 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions167 = null;

        malice_grammarParser.control_structure_return control_structure168 = null;

        malice_grammarParser.read_statement_return read_statement169 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions170 = null;

        malice_grammarParser.nested_function_return nested_function171 = null;

        malice_grammarParser.function_return function172 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:15: ( ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            loop44:
            do {
                int alt44=6;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case LETTER:
                case STRING:
                case 10:
                case 17:
                case 18:
                case 19:
                case 20:
                case 40:
                case 48:
                case 53:
                case 62:
                case 63:
                case 64:
                    {
                    alt44=1;
                    }
                    break;
                case 35:
                case 44:
                case 45:
                    {
                    alt44=2;
                    }
                    break;
                case 60:
                    {
                    alt44=3;
                    }
                    break;
                case 66:
                    {
                    alt44=4;
                    }
                    break;
                case 68:
                    {
                    alt44=5;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:18: ( ( statement )? statement_conjunctions )
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:18: ( ( statement )? statement_conjunctions )
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:19: ( statement )? statement_conjunctions
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:19: ( statement )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( ((LA42_0>=NUMBER && LA42_0<=IDENT)||(LA42_0>=LETTER && LA42_0<=10)||(LA42_0>=17 && LA42_0<=20)||LA42_0==40) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1330);
            	            statement166=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement166.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1333);
            	    statement_conjunctions167=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions167.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:56: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1338);
            	    control_structure168=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure168.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:76: read_statement ( statement_conjunctions )?
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1342);
            	    read_statement169=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement169.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:91: ( statement_conjunctions )?
            	    int alt43=2;
            	    switch ( input.LA(1) ) {
            	        case 62:
            	            {
            	            int LA43_1 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt43=1;
            	            }
            	            }
            	            break;
            	        case 63:
            	            {
            	            int LA43_2 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt43=1;
            	            }
            	            }
            	            break;
            	        case 64:
            	            {
            	            int LA43_3 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt43=1;
            	            }
            	            }
            	            break;
            	        case 53:
            	            {
            	            int LA43_4 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt43=1;
            	            }
            	            }
            	            break;
            	        case 48:
            	            {
            	            int LA43_5 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt43=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement_conjunctions
            	            {
            	            pushFollow(FOLLOW_statement_conjunctions_in_statementList1344);
            	            statement_conjunctions170=statement_conjunctions();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions170.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:117: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1349);
            	    nested_function171=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function171.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:19: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1373);
            	    function172=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function172.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal173=null;
        Token IDENT175=null;
        malice_grammarParser.data_types_return data_types174 = null;


        CommonTree string_literal173_tree=null;
        CommonTree IDENT175_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:11: ( ( 'spider' )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:13: ( 'spider' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:14: 'spider'
                    {
                    string_literal173=(Token)match(input,65,FOLLOW_65_in_parameter1384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal173_tree = (CommonTree)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_data_types_in_parameter1388);
            data_types174=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(data_types174.getTree(), root_0);
            IDENT175=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT175_tree = (CommonTree)adaptor.create(IDENT175);
            adaptor.addChild(root_0, IDENT175_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal177=null;
        malice_grammarParser.parameter_return parameter176 = null;

        malice_grammarParser.parameter_return parameter178 = null;


        CommonTree char_literal177_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:14: ( parameter ( ',' parameter )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=14 && LA47_0<=16)||LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1401);
                    parameter176=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter176.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:25: ( ',' parameter )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==53) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:102:27: ',' parameter
                    	    {
                    	    char_literal177=(Token)match(input,53,FOLLOW_53_in_parameters1405); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal177_tree = (CommonTree)adaptor.create(char_literal177);
                    	    adaptor.addChild(root_0, char_literal177_tree);
                    	    }
                    	    pushFollow(FOLLOW_parameter_in_parameters1407);
                    	    parameter178=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT179=null;

        CommonTree IDENT179_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT179=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT179_tree = (CommonTree)adaptor.create(IDENT179);
            adaptor.addChild(root_0, IDENT179_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal180=null;
        Token string_literal182=null;
        malice_grammarParser.statementList_return statementList181 = null;


        CommonTree string_literal180_tree=null;
        CommonTree string_literal182_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal180=(Token)match(input,66,FOLLOW_66_in_nested_function1426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal180_tree, root_0);
            }
            pushFollow(FOLLOW_statementList_in_nested_function1429);
            statementList181=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList181.getTree());
            string_literal182=(Token)match(input,67,FOLLOW_67_in_nested_function1431); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:1: function : 'The' ( 'looking' '-' 'glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal183=null;
        Token string_literal184=null;
        Token char_literal185=null;
        Token string_literal186=null;
        Token string_literal191=null;
        Token string_literal196=null;
        Token char_literal197=null;
        Token string_literal199=null;
        Token string_literal201=null;
        malice_grammarParser.function_name_return function_name187 = null;

        malice_grammarParser.lpar_return lpar188 = null;

        malice_grammarParser.parameters_return parameters189 = null;

        malice_grammarParser.rpar_return rpar190 = null;

        malice_grammarParser.function_name_return function_name192 = null;

        malice_grammarParser.lpar_return lpar193 = null;

        malice_grammarParser.parameters_return parameters194 = null;

        malice_grammarParser.rpar_return rpar195 = null;

        malice_grammarParser.data_types_return data_types198 = null;

        malice_grammarParser.statementList_return statementList200 = null;


        CommonTree string_literal183_tree=null;
        CommonTree string_literal184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree char_literal197_tree=null;
        CommonTree string_literal199_tree=null;
        CommonTree string_literal201_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:9: ( 'The' ( 'looking' '-' 'glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:11: 'The' ( 'looking' '-' 'glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal183=(Token)match(input,68,FOLLOW_68_in_function1439); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:18: ( 'looking' '-' 'glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            else if ( (LA48_0==71) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:105:20: 'looking' '-' 'glass' function_name lpar parameters rpar
                    {
                    string_literal184=(Token)match(input,69,FOLLOW_69_in_function1444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal184_tree = (CommonTree)adaptor.create(string_literal184);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal184_tree, root_0);
                    }
                    char_literal185=(Token)match(input,19,FOLLOW_19_in_function1447); if (state.failed) return retval;
                    string_literal186=(Token)match(input,70,FOLLOW_70_in_function1450); if (state.failed) return retval;
                    pushFollow(FOLLOW_function_name_in_function1453);
                    function_name187=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name187.getTree());
                    pushFollow(FOLLOW_lpar_in_function1455);
                    lpar188=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar188.getTree());
                    pushFollow(FOLLOW_parameters_in_function1457);
                    parameters189=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters189.getTree());
                    pushFollow(FOLLOW_rpar_in_function1459);
                    rpar190=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar190.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:106:21: 'room' function_name lpar parameters rpar 'contained' 'a' data_types
                    {
                    string_literal191=(Token)match(input,71,FOLLOW_71_in_function1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal191_tree = (CommonTree)adaptor.create(string_literal191);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal191_tree, root_0);
                    }
                    pushFollow(FOLLOW_function_name_in_function1485);
                    function_name192=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name192.getTree());
                    pushFollow(FOLLOW_lpar_in_function1487);
                    lpar193=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar193.getTree());
                    pushFollow(FOLLOW_parameters_in_function1489);
                    parameters194=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters194.getTree());
                    pushFollow(FOLLOW_rpar_in_function1491);
                    rpar195=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar195.getTree());
                    string_literal196=(Token)match(input,72,FOLLOW_72_in_function1493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal196_tree = (CommonTree)adaptor.create(string_literal196);
                    adaptor.addChild(root_0, string_literal196_tree);
                    }
                    char_literal197=(Token)match(input,49,FOLLOW_49_in_function1495); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_function1498);
                    data_types198=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types198.getTree());

                    }
                    break;

            }

            string_literal199=(Token)match(input,66,FOLLOW_66_in_function1529); if (state.failed) return retval;
            pushFollow(FOLLOW_statementList_in_function1542);
            statementList200=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList200.getTree());
            string_literal201=(Token)match(input,67,FOLLOW_67_in_function1554); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal205=null;
        malice_grammarParser.declaration_statements_return declaration_statements202 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions203 = null;

        malice_grammarParser.declaration_statements_return declaration_statements204 = null;


        CommonTree char_literal205_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==IDENT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1585);
            	    declaration_statements202=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements202.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:46: ( statement_conjunctions declaration_statements )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==48) ) {
            	            int LA49_1 = input.LA(2);

            	            if ( (synpred77_malice_grammar()) ) {
            	                alt49=1;
            	            }


            	        }
            	        else if ( (LA49_0==53||(LA49_0>=62 && LA49_0<=64)) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1588);
            	    	    statement_conjunctions203=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions203.getTree());
            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1590);
            	    	    declaration_statements204=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements204.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    char_literal205=(Token)match(input,48,FOLLOW_48_in_global_declaration1594); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:114:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF208=null;
        malice_grammarParser.global_declaration_return global_declaration206 = null;

        malice_grammarParser.function_return function207 = null;


        CommonTree EOF208_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:114:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:114:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_program1605);
            global_declaration206=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration206.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:114:30: ( function )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==68) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1607);
            	    function207=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function207.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            EOF208=(Token)match(input,EOF,FOLLOW_EOF_in_program1610); if (state.failed) return retval;

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

    // $ANTLR start synpred31_malice_grammar
    public final void synpred31_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:9: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:9: '.'
        {
        match(input,48,FOLLOW_48_in_synpred31_malice_grammar782); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_malice_grammar

    // $ANTLR start synpred37_malice_grammar
    public final void synpred37_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:11: ( expr )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred37_malice_grammar933);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_malice_grammar

    // $ANTLR start synpred42_malice_grammar
    public final void synpred42_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:26: ( ( argument ( ',' argument )* )? )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:26: ( argument ( ',' argument )* )?
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:26: ( argument ( ',' argument )* )?
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( ((LA60_0>=NUMBER && LA60_0<=IDENT)||(LA60_0>=LETTER && LA60_0<=10)||(LA60_0>=17 && LA60_0<=20)) ) {
            alt60=1;
        }
        switch (alt60) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred42_malice_grammar953);
                argument();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:36: ( ',' argument )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==53) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:37: ',' argument
                	    {
                	    match(input,53,FOLLOW_53_in_synpred42_malice_grammar956); if (state.failed) return ;
                	    pushFollow(FOLLOW_argument_in_synpred42_malice_grammar959);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred42_malice_grammar

    // $ANTLR start synpred44_malice_grammar
    public final void synpred44_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:21: ( expr ( 'spoke' | 'said' 'Alice' ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:22: expr ( 'spoke' | 'said' 'Alice' )
        {
        pushFollow(FOLLOW_expr_in_synpred44_malice_grammar977);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:27: ( 'spoke' | 'said' 'Alice' )
        int alt61=2;
        int LA61_0 = input.LA(1);

        if ( (LA61_0==54) ) {
            alt61=1;
        }
        else if ( (LA61_0==55) ) {
            alt61=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 61, 0, input);

            throw nvae;
        }
        switch (alt61) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:28: 'spoke'
                {
                match(input,54,FOLLOW_54_in_synpred44_malice_grammar980); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:39: 'said' 'Alice'
                {
                match(input,55,FOLLOW_55_in_synpred44_malice_grammar985); if (state.failed) return ;
                match(input,40,FOLLOW_40_in_synpred44_malice_grammar988); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred44_malice_grammar

    // $ANTLR start synpred54_malice_grammar
    public final void synpred54_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:8: ( IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred54_malice_grammar1052); if (state.failed) return ;
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:11: ( '\\'s' expr 'piece' )?
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( (LA64_0==12) ) {
            alt64=1;
        }
        switch (alt64) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:12: '\\'s' expr 'piece'
                {
                match(input,12,FOLLOW_12_in_synpred54_malice_grammar1065); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred54_malice_grammar1068);
                expr();

                state._fsp--;
                if (state.failed) return ;
                match(input,13,FOLLOW_13_in_synpred54_malice_grammar1070); if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        int alt66=3;
        switch ( input.LA(1) ) {
        case 56:
            {
            alt66=1;
            }
            break;
        case 57:
            {
            alt66=2;
            }
            break;
        case 58:
            {
            alt66=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 66, 0, input);

            throw nvae;
        }

        switch (alt66) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:18: 'became' ( expr | LETTER | STRING )
                {
                match(input,56,FOLLOW_56_in_synpred54_malice_grammar1091); if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:29: ( expr | LETTER | STRING )
                int alt65=3;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case 10:
                case 17:
                case 18:
                case 19:
                case 20:
                    {
                    alt65=1;
                    }
                    break;
                case LETTER:
                    {
                    alt65=2;
                    }
                    break;
                case STRING:
                    {
                    alt65=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 0, input);

                    throw nvae;
                }

                switch (alt65) {
                    case 1 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:30: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred54_malice_grammar1096);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:37: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred54_malice_grammar1100); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:46: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred54_malice_grammar1104); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:18: 'ate'
                {
                match(input,57,FOLLOW_57_in_synpred54_malice_grammar1125); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:18: 'drank'
                {
                match(input,58,FOLLOW_58_in_synpred54_malice_grammar1146); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred54_malice_grammar

    // $ANTLR start synpred58_malice_grammar
    public final void synpred58_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:60: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:60: '.'
        {
        match(input,48,FOLLOW_48_in_synpred58_malice_grammar1227); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred60_malice_grammar
    public final void synpred60_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:13: ( rest_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred60_malice_grammar1279);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_malice_grammar

    // $ANTLR start synpred61_malice_grammar
    public final void synpred61_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:31: ( function_call )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred61_malice_grammar1283);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_malice_grammar

    // $ANTLR start synpred69_malice_grammar
    public final void synpred69_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:91: ( statement_conjunctions )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:97:91: statement_conjunctions
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred69_malice_grammar1344);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_malice_grammar

    // $ANTLR start synpred77_malice_grammar
    public final void synpred77_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:47: ( statement_conjunctions declaration_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:47: statement_conjunctions declaration_statements
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred77_malice_grammar1588);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declaration_statements_in_synpred77_malice_grammar1590);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_malice_grammar

    // Delegated rules

    public final boolean synpred69_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred61_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\4\4\uffff\1\0\5\uffff";
    static final String DFA26_maxS =
        "\1\24\4\uffff\1\0\5\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\4";
    static final String DFA26_specialS =
        "\5\uffff\1\0\5\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\5\2\uffff\1\10\1\11\1\1\6\uffff\4\1",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "73:1: argument : ( expr | LETTER | STRING | array_elem );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_malice_grammar()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\14\uffff";
    static final String DFA29_eofS =
        "\14\uffff";
    static final String DFA29_minS =
        "\1\4\4\uffff\1\0\6\uffff";
    static final String DFA29_maxS =
        "\1\24\4\uffff\1\0\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA29_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\5\2\uffff\4\1\5\uffff\4\1",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "74:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_malice_grammar()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\13\uffff";
    static final String DFA36_minS =
        "\1\4\4\uffff\1\0\5\uffff";
    static final String DFA36_maxS =
        "\1\50\4\uffff\1\0\5\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\4\1\1\uffff\2\1\1\2\1\4\1\3";
    static final String DFA36_specialS =
        "\1\0\4\uffff\1\1\5\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\6\1\5\2\uffff\2\10\1\7\6\uffff\1\4\1\1\1\2\1\3\23\uffff"+
            "\1\11",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "75:1: rest_statements : ( ( expr ( 'spoke' | 'said' 'Alice' ) )=> ( expr ( 'spoke' | 'said' 'Alice' ) ) | ( LETTER | STRING ) ( 'spoke' | 'said' 'Alice' ) | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==18) && (synpred44_malice_grammar())) {s = 1;}

                        else if ( (LA36_0==19) && (synpred44_malice_grammar())) {s = 2;}

                        else if ( (LA36_0==20) && (synpred44_malice_grammar())) {s = 3;}

                        else if ( (LA36_0==17) && (synpred44_malice_grammar())) {s = 4;}

                        else if ( (LA36_0==IDENT) ) {s = 5;}

                        else if ( (LA36_0==NUMBER) && (synpred44_malice_grammar())) {s = 6;}

                        else if ( (LA36_0==10) && (synpred44_malice_grammar())) {s = 7;}

                        else if ( ((LA36_0>=LETTER && LA36_0<=STRING)) ) {s = 8;}

                        else if ( (LA36_0==40) ) {s = 9;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_malice_grammar()) ) {s = 7;}

                        else if ( (synpred54_malice_grammar()) ) {s = 10;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\14\uffff";
    static final String DFA40_eofS =
        "\14\uffff";
    static final String DFA40_minS =
        "\1\4\4\uffff\1\0\6\uffff";
    static final String DFA40_maxS =
        "\1\50\4\uffff\1\0\6\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String DFA40_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\1\5\2\uffff\3\1\6\uffff\4\1\23\uffff\1\1",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "93:1: statement : ( rest_statements | function_call | declaration_statements );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_malice_grammar()) ) {s = 1;}

                        else if ( (synpred61_malice_grammar()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_10_in_lpar213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rpar220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_array_elem230 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_expr_in_array_elem233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_array_elem235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom241 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_atom244 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_expr_in_atom247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_atom249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data_types0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term289 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_expr_in_term291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_term293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_bool_neg302 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_term_in_bool_neg307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_unary_op315 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_19_in_unary_op320 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_20_in_unary_op325 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult337 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_mult341 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_22_in_mult346 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_23_in_mult351 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_unary_op_in_mult355 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_mult_in_add365 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20_in_add369 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_19_in_add374 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_mult_in_add378 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_add_in_bool_comp388 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_24_in_bool_comp392 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_25_in_bool_comp397 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_26_in_bool_comp402 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_27_in_bool_comp407 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_add_in_bool_comp411 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq421 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_bool_eq425 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_29_in_bool_eq430 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq434 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and444 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_bitw_and447 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and450 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor460 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_bitw_xor463 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor466 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or476 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_bitw_or479 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or482 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and492 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_bool_and495 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and498 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_bool_and_in_bool_or508 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_bool_or511 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_and_in_bool_or514 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_bool_or_in_expr525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control_structure551 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_control_structure554 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure558 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure560 = new BitSet(new long[]{0xD02131A8001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure575 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_control_structure589 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_control_structure592 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_control_structure595 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure597 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure599 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure601 = new BitSet(new long[]{0xD02131A8001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure604 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_control_structure619 = new BitSet(new long[]{0xD0213188001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure622 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure636 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_control_structure639 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_control_structure642 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure645 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure648 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_44_in_control_structure661 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_control_structure664 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure666 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure668 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure670 = new BitSet(new long[]{0xD0213128001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure682 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure695 = new BitSet(new long[]{0xD0213188001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure697 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure709 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_control_structure712 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_control_structure715 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure718 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure721 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45_in_control_structure734 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_control_structure737 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure739 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_control_structure741 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_control_structure743 = new BitSet(new long[]{0xD0217108001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_statementList_in_control_structure756 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_control_structure768 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_control_structure771 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_control_structure782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements792 = new BitSet(new long[]{0x0010020000000000L});
    public static final BitSet FOLLOW_41_in_declaration_statements796 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declaration_statements799 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements802 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_declaration_statements806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declaration_statements810 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_declaration_statements862 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_atom_in_declaration_statements865 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions953 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_arguments_to_functions956 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions959 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements996 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rest_statements1004 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rest_statements1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1025 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rest_statements1039 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rest_statements1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1052 = new BitSet(new long[]{0x0700000000001000L});
    public static final BitSet FOLLOW_12_in_rest_statements1065 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_expr_in_rest_statements1068 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rest_statements1070 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_56_in_rest_statements1091 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_expr_in_rest_statements1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rest_statements1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rest_statements1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements1179 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_rest_statements1182 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_expr_in_rest_statements1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_read_statement1209 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_read_statement1212 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1216 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1220 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_read_statement1223 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_read_statement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_print1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_print1247 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_print1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1264 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_function_call1267 = new BitSet(new long[]{0x00000000001E0F30L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1269 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function_call1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_statement_conjunctions1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_statement_conjunctions1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_statement_conjunctions1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_statement_conjunctions1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_statement_conjunctions1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1330 = new BitSet(new long[]{0xC0210100001E0730L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1333 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_control_structure_in_statementList1338 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_read_statement_in_statementList1342 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1344 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_nested_function_in_statementList1349 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_function_in_statementList1373 = new BitSet(new long[]{0xD0213108001E0732L,0x0000000000000015L});
    public static final BitSet FOLLOW_65_in_parameter1384 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_data_types_in_parameter1388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_parameter1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1401 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_parameters1405 = new BitSet(new long[]{0x000000000001C000L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1407 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_nested_function1426 = new BitSet(new long[]{0xD0213108001E0730L,0x000000000000001DL});
    public static final BitSet FOLLOW_statementList_in_nested_function1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_nested_function1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_function1439 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_69_in_function1444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_function1450 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_function_name_in_function1453 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_function1455 = new BitSet(new long[]{0x000000000001C800L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_function1457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_71_in_function1482 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_function_name_in_function1485 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_lpar_in_function1487 = new BitSet(new long[]{0x000000000001C800L,0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_function1489 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rpar_in_function1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_function1493 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function1495 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_data_types_in_function1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_function1529 = new BitSet(new long[]{0xD0213108001E0730L,0x000000000000001DL});
    public static final BitSet FOLLOW_statementList_in_function1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1585 = new BitSet(new long[]{0xC0210100001E0730L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1588 = new BitSet(new long[]{0x00000100001E0730L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1590 = new BitSet(new long[]{0xC0210100001E0730L,0x0000000000000001L});
    public static final BitSet FOLLOW_48_in_global_declaration1594 = new BitSet(new long[]{0x00000100001E0732L});
    public static final BitSet FOLLOW_global_declaration_in_program1605 = new BitSet(new long[]{0xD0213108001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_function_in_program1607 = new BitSet(new long[]{0xD0213108001E0730L,0x0000000000000015L});
    public static final BitSet FOLLOW_EOF_in_program1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred31_malice_grammar782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_malice_grammar933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar953 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_synpred42_malice_grammar956 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar959 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred44_malice_grammar977 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_synpred44_malice_grammar980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred44_malice_grammar985 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred44_malice_grammar988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred54_malice_grammar1052 = new BitSet(new long[]{0x0700000000001000L});
    public static final BitSet FOLLOW_12_in_synpred54_malice_grammar1065 = new BitSet(new long[]{0x00000000001E0430L});
    public static final BitSet FOLLOW_expr_in_synpred54_malice_grammar1068 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred54_malice_grammar1070 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_56_in_synpred54_malice_grammar1091 = new BitSet(new long[]{0x00000000001E0730L});
    public static final BitSet FOLLOW_expr_in_synpred54_malice_grammar1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred54_malice_grammar1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred54_malice_grammar1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred54_malice_grammar1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred54_malice_grammar1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred58_malice_grammar1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred60_malice_grammar1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred61_malice_grammar1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred69_malice_grammar1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred77_malice_grammar1588 = new BitSet(new long[]{0x00000100001E0730L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred77_malice_grammar1590 = new BitSet(new long[]{0x0000000000000002L});

}