// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-12-04 00:43:23

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATE", "DRANK", "BECAME", "WHAT", "PIECE", "CHAR", "INT", "STR", "PERHAPS", "OR", "MAYBE", "WAS", "HAD", "SPOKE", "FOUND", "BECAUSE", "ALICE", "UNSURE", "WHICH", "EVENTUALLY", "ENOUGH", "TIMES", "SO", "EITHER", "A", "TOO", "OF", "SAID", "OPENED", "CLOSED", "THE", "LOOKING", "GLASS", "ROOM", "CONTAINED", "SPIDER", "AND", "BUT", "THEN", "NUMBER", "IDENT", "WS", "LINE_COMMENT", "LETTER", "STRING", "'('", "')'", "'\\'s'", "'!'", "'~'", "'-'", "'+'", "'*'", "'/'", "'%'", "'<='", "'<'", "'>'", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'.'", "','", "'?'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int EVENTUALLY=23;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int WHAT=7;
    public static final int THE=34;
    public static final int LETTER=47;
    public static final int ENOUGH=24;
    public static final int PIECE=8;
    public static final int CHAR=9;
    public static final int AND=40;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int LOOKING=35;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int STR=11;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int THEN=42;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int EITHER=27;
    public static final int T__59=59;
    public static final int WAS=15;
    public static final int SPIDER=39;
    public static final int OPENED=32;
    public static final int HAD=16;
    public static final int IDENT=44;
    public static final int SAID=31;
    public static final int ALICE=20;
    public static final int T__50=50;
    public static final int GLASS=36;
    public static final int DRANK=5;
    public static final int WHICH=22;
    public static final int A=28;
    public static final int LINE_COMMENT=46;
    public static final int MAYBE=14;
    public static final int SPOKE=17;
    public static final int T__49=49;
    public static final int NUMBER=43;
    public static final int BUT=41;
    public static final int CONTAINED=38;
    public static final int INT=10;
    public static final int UNSURE=21;
    public static final int OF=30;
    public static final int PERHAPS=12;
    public static final int BECAUSE=19;
    public static final int ROOM=37;
    public static final int WS=45;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int ATE=4;
    public static final int T__70=70;
    public static final int SO=26;
    public static final int OR=13;
    public static final int FOUND=18;
    public static final int CLOSED=33;
    public static final int TOO=29;
    public static final int TIMES=25;
    public static final int BECAME=6;
    public static final int STRING=48;

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
    public String getGrammarFileName() { return "C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g"; }


    public static class endif_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endif"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:1: endif : BECAUSE ALICE WAS UNSURE WHICH ;
    public final malice_grammarParser.endif_return endif() throws RecognitionException {
        malice_grammarParser.endif_return retval = new malice_grammarParser.endif_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BECAUSE1=null;
        Token ALICE2=null;
        Token WAS3=null;
        Token UNSURE4=null;
        Token WHICH5=null;

        CommonTree BECAUSE1_tree=null;
        CommonTree ALICE2_tree=null;
        CommonTree WAS3_tree=null;
        CommonTree UNSURE4_tree=null;
        CommonTree WHICH5_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:7: ( BECAUSE ALICE WAS UNSURE WHICH )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:9: BECAUSE ALICE WAS UNSURE WHICH
            {
            root_0 = (CommonTree)adaptor.nil();

            BECAUSE1=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_endif429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BECAUSE1_tree = (CommonTree)adaptor.create(BECAUSE1);
            adaptor.addChild(root_0, BECAUSE1_tree);
            }
            ALICE2=(Token)match(input,ALICE,FOLLOW_ALICE_in_endif431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALICE2_tree = (CommonTree)adaptor.create(ALICE2);
            adaptor.addChild(root_0, ALICE2_tree);
            }
            WAS3=(Token)match(input,WAS,FOLLOW_WAS_in_endif433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAS3_tree = (CommonTree)adaptor.create(WAS3);
            adaptor.addChild(root_0, WAS3_tree);
            }
            UNSURE4=(Token)match(input,UNSURE,FOLLOW_UNSURE_in_endif435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNSURE4_tree = (CommonTree)adaptor.create(UNSURE4);
            adaptor.addChild(root_0, UNSURE4_tree);
            }
            WHICH5=(Token)match(input,WHICH,FOLLOW_WHICH_in_endif437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHICH5_tree = (CommonTree)adaptor.create(WHICH5);
            adaptor.addChild(root_0, WHICH5_tree);
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
    // $ANTLR end "endif"

    public static class lpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lpar"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal6=null;

        CommonTree char_literal6_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:5: ( '(' )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal6=(Token)match(input,49,FOLLOW_49_in_lpar590); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal7=null;

        CommonTree char_literal7_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:5: ( ')' )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal7=(Token)match(input,50,FOLLOW_50_in_rpar597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:1: array_elem : IDENT '\\'s' expr PIECE ;
    public final malice_grammarParser.array_elem_return array_elem() throws RecognitionException {
        malice_grammarParser.array_elem_return retval = new malice_grammarParser.array_elem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT8=null;
        Token string_literal9=null;
        Token PIECE11=null;
        malice_grammarParser.expr_return expr10 = null;


        CommonTree IDENT8_tree=null;
        CommonTree string_literal9_tree=null;
        CommonTree PIECE11_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:12: ( IDENT '\\'s' expr PIECE )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:14: IDENT '\\'s' expr PIECE
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem605); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT8_tree = (CommonTree)adaptor.create(IDENT8);
            adaptor.addChild(root_0, IDENT8_tree);
            }
            string_literal9=(Token)match(input,51,FOLLOW_51_in_array_elem607); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_array_elem610);
            expr10=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr10.getTree());
            PIECE11=(Token)match(input,PIECE,FOLLOW_PIECE_in_array_elem612); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PIECE11_tree = (CommonTree)adaptor.create(PIECE11);
            root_0 = (CommonTree)adaptor.becomeRoot(PIECE11_tree, root_0);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:1: atom : ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call );
    public final malice_grammarParser.atom_return atom() throws RecognitionException {
        malice_grammarParser.atom_return retval = new malice_grammarParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT12=null;
        Token string_literal13=null;
        Token PIECE15=null;
        Token NUMBER16=null;
        malice_grammarParser.expr_return expr14 = null;

        malice_grammarParser.function_call_return function_call17 = null;


        CommonTree IDENT12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree PIECE15_tree=null;
        CommonTree NUMBER16_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:5: ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=PIECE && LA2_1<=STR)||LA2_1==SPOKE||LA2_1==SAID||(LA2_1>=AND && LA2_1<=THEN)||(LA2_1>=50 && LA2_1<=51)||(LA2_1>=54 && LA2_1<=71)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==49) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:7: IDENT ( '\\'s' expr PIECE )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT12_tree = (CommonTree)adaptor.create(IDENT12);
                    adaptor.addChild(root_0, IDENT12_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( '\\'s' expr PIECE )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==51) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:14: '\\'s' expr PIECE
                            {
                            string_literal13=(Token)match(input,51,FOLLOW_51_in_atom622); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_atom625);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());
                            PIECE15=(Token)match(input,PIECE,FOLLOW_PIECE_in_atom627); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PIECE15_tree = (CommonTree)adaptor.create(PIECE15);
                            root_0 = (CommonTree)adaptor.becomeRoot(PIECE15_tree, root_0);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:37: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER16_tree = (CommonTree)adaptor.create(NUMBER16);
                    adaptor.addChild(root_0, NUMBER16_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:46: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_atom638);
                    function_call17=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call17.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:1: data_types : ( INT | CHAR | STR );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:12: ( INT | CHAR | STR )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=CHAR && input.LA(1)<=STR) ) {
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 = null;

        malice_grammarParser.lpar_return lpar20 = null;

        malice_grammarParser.expr_return expr21 = null;

        malice_grammarParser.rpar_return rpar22 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:6: ( atom | lpar expr rpar )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=NUMBER && LA3_0<=IDENT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==49) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_term664);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_term668);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_term671);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());
                    pushFollow(FOLLOW_rpar_in_term673);
                    rpar22=rpar();

                    state._fsp--;
                    if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal23=null;
        malice_grammarParser.term_return term24 = null;


        CommonTree char_literal23_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:10: ( ( '!' )* term )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:12: ( '!' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:13: '!'
            	    {
            	    char_literal23=(Token)match(input,52,FOLLOW_52_in_bool_neg683); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal23_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_bool_neg688);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:10: ( ( '~' | '-' | '+' )* bool_neg )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:12: ( '~' | '-' | '+' )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    alt5=1;
                    }
                    break;
                case 54:
                    {
                    alt5=2;
                    }
                    break;
                case 55:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:13: '~'
            	    {
            	    char_literal25=(Token)match(input,53,FOLLOW_53_in_unary_op696); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:20: '-'
            	    {
            	    char_literal26=(Token)match(input,54,FOLLOW_54_in_unary_op701); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:27: '+'
            	    {
            	    char_literal27=(Token)match(input,55,FOLLOW_55_in_unary_op706); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_bool_neg_in_unary_op711);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_op_in_mult718);
            unary_op29=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op29.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=56 && LA7_0<=58)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:17: ( '*' | '/' | '%' )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 58:
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
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:18: '*'
            	            {
            	            char_literal30=(Token)match(input,56,FOLLOW_56_in_mult722); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:25: '/'
            	            {
            	            char_literal31=(Token)match(input,57,FOLLOW_57_in_mult727); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:32: '%'
            	            {
            	            char_literal32=(Token)match(input,58,FOLLOW_58_in_mult732); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_op_in_mult736);
            	    unary_op33=unary_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op33.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:1: add : mult ( ( '+' | '-' ) mult )* ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:5: ( mult ( ( '+' | '-' ) mult )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add746);
            mult34=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult34.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:12: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=54 && LA9_0<=55)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:13: ( '+' | '-' ) mult
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:13: ( '+' | '-' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==55) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==54) ) {
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
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:14: '+'
            	            {
            	            char_literal35=(Token)match(input,55,FOLLOW_55_in_add750); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:21: '-'
            	            {
            	            char_literal36=(Token)match(input,54,FOLLOW_54_in_add755); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add759);
            	    mult37=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult37.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_comp769);
            add38=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=59 && LA11_0<=62)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:18: ( '<=' | '<' | '>' | '>=' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 62:
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
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:19: '<='
            	            {
            	            string_literal39=(Token)match(input,59,FOLLOW_59_in_bool_comp773); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:27: '<'
            	            {
            	            char_literal40=(Token)match(input,60,FOLLOW_60_in_bool_comp778); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:34: '>'
            	            {
            	            char_literal41=(Token)match(input,61,FOLLOW_61_in_bool_comp783); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:41: '>='
            	            {
            	            string_literal42=(Token)match(input,62,FOLLOW_62_in_bool_comp788); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_bool_comp792);
            	    add43=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add43.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_comp_in_bool_eq802);
            bool_comp44=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp44.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:21: ( ( '==' | '!=' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=63 && LA13_0<=64)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:22: ( '==' | '!=' ) bool_comp
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:22: ( '==' | '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==63) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==64) ) {
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
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:23: '=='
            	            {
            	            string_literal45=(Token)match(input,63,FOLLOW_63_in_bool_eq806); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:31: '!='
            	            {
            	            string_literal46=(Token)match(input,64,FOLLOW_64_in_bool_eq811); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_comp_in_bool_eq815);
            	    bool_comp47=bool_comp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp47.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        malice_grammarParser.bool_eq_return bool_eq48 = null;

        malice_grammarParser.bool_eq_return bool_eq50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:10: ( bool_eq ( '&' bool_eq )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_eq_in_bitw_and825);
            bool_eq48=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq48.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:20: ( '&' bool_eq )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==65) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:21: '&' bool_eq
            	    {
            	    char_literal49=(Token)match(input,65,FOLLOW_65_in_bitw_and828); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_eq_in_bitw_and831);
            	    bool_eq50=bool_eq();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq50.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        malice_grammarParser.bitw_and_return bitw_and51 = null;

        malice_grammarParser.bitw_and_return bitw_and53 = null;


        CommonTree char_literal52_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:10: ( bitw_and ( '^' bitw_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_and_in_bitw_xor841);
            bitw_and51=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and51.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:21: ( '^' bitw_and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==66) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:22: '^' bitw_and
            	    {
            	    char_literal52=(Token)match(input,66,FOLLOW_66_in_bitw_xor844); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor847);
            	    bitw_and53=bitw_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and53.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        malice_grammarParser.bitw_xor_return bitw_xor54 = null;

        malice_grammarParser.bitw_xor_return bitw_xor56 = null;


        CommonTree char_literal55_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:9: ( bitw_xor ( '|' bitw_xor )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_xor_in_bitw_or857);
            bitw_xor54=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor54.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:20: ( '|' bitw_xor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==67) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:21: '|' bitw_xor
            	    {
            	    char_literal55=(Token)match(input,67,FOLLOW_67_in_bitw_or860); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or863);
            	    bitw_xor56=bitw_xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor56.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        malice_grammarParser.bitw_or_return bitw_or57 = null;

        malice_grammarParser.bitw_or_return bitw_or59 = null;


        CommonTree string_literal58_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:10: ( bitw_or ( '&&' bitw_or )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_or_in_bool_and873);
            bitw_or57=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or57.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:20: ( '&&' bitw_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:21: '&&' bitw_or
            	    {
            	    string_literal58=(Token)match(input,68,FOLLOW_68_in_bool_and876); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_or_in_bool_and879);
            	    bitw_or59=bitw_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or59.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        malice_grammarParser.bool_and_return bool_and60 = null;

        malice_grammarParser.bool_and_return bool_and62 = null;


        CommonTree string_literal61_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:9: ( bool_and ( '||' bool_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_in_bool_or889);
            bool_and60=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and60.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:20: ( '||' bool_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==69) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:21: '||' bool_and
            	    {
            	    string_literal61=(Token)match(input,69,FOLLOW_69_in_bool_or892); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_and_in_bool_or895);
            	    bool_and62=bool_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and62.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or63 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:6: ( bool_or )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_in_expr906);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr64 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:11: ( expr )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_bool_expr915);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:1: control_structure : ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERHAPS65=null;
        Token SO69=null;
        Token OR71=null;
        Token MAYBE72=null;
        Token SO76=null;
        Token OR78=null;
        Token EITHER81=null;
        Token SO85=null;
        Token OR87=null;
        Token EVENTUALLY90=null;
        Token BECAUSE94=null;
        Token ENOUGH96=null;
        Token TIMES97=null;
        Token char_literal98=null;
        malice_grammarParser.lpar_return lpar66 = null;

        malice_grammarParser.bool_expr_return bool_expr67 = null;

        malice_grammarParser.rpar_return rpar68 = null;

        malice_grammarParser.statementList_return statementList70 = null;

        malice_grammarParser.lpar_return lpar73 = null;

        malice_grammarParser.bool_expr_return bool_expr74 = null;

        malice_grammarParser.rpar_return rpar75 = null;

        malice_grammarParser.statementList_return statementList77 = null;

        malice_grammarParser.statementList_return statementList79 = null;

        malice_grammarParser.endif_return endif80 = null;

        malice_grammarParser.lpar_return lpar82 = null;

        malice_grammarParser.bool_expr_return bool_expr83 = null;

        malice_grammarParser.rpar_return rpar84 = null;

        malice_grammarParser.statementList_return statementList86 = null;

        malice_grammarParser.statementList_return statementList88 = null;

        malice_grammarParser.endif_return endif89 = null;

        malice_grammarParser.lpar_return lpar91 = null;

        malice_grammarParser.bool_expr_return bool_expr92 = null;

        malice_grammarParser.rpar_return rpar93 = null;

        malice_grammarParser.statementList_return statementList95 = null;


        CommonTree PERHAPS65_tree=null;
        CommonTree SO69_tree=null;
        CommonTree OR71_tree=null;
        CommonTree MAYBE72_tree=null;
        CommonTree SO76_tree=null;
        CommonTree OR78_tree=null;
        CommonTree EITHER81_tree=null;
        CommonTree SO85_tree=null;
        CommonTree OR87_tree=null;
        CommonTree EVENTUALLY90_tree=null;
        CommonTree BECAUSE94_tree=null;
        CommonTree ENOUGH96_tree=null;
        CommonTree TIMES97_tree=null;
        CommonTree char_literal98_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:7: ( ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES )
            int alt21=3;
            switch ( input.LA(1) ) {
            case PERHAPS:
                {
                alt21=1;
                }
                break;
            case EITHER:
                {
                alt21=2;
                }
                break;
            case EVENTUALLY:
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:11: PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif
                    {
                    PERHAPS65=(Token)match(input,PERHAPS,FOLLOW_PERHAPS_in_control_structure932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERHAPS65_tree = (CommonTree)adaptor.create(PERHAPS65);
                    root_0 = (CommonTree)adaptor.becomeRoot(PERHAPS65_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure935);
                    lpar66=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure938);
                    bool_expr67=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr67.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure940);
                    rpar68=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO69=(Token)match(input,SO,FOLLOW_SO_in_control_structure943); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure957);
                    statementList70=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:11: ( OR MAYBE lpar bool_expr rpar SO statementList )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==OR) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==MAYBE) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:12: OR MAYBE lpar bool_expr rpar SO statementList
                    	    {
                    	    OR71=(Token)match(input,OR,FOLLOW_OR_in_control_structure970); if (state.failed) return retval;
                    	    MAYBE72=(Token)match(input,MAYBE,FOLLOW_MAYBE_in_control_structure973); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    MAYBE72_tree = (CommonTree)adaptor.create(MAYBE72);
                    	    adaptor.addChild(root_0, MAYBE72_tree);
                    	    }
                    	    pushFollow(FOLLOW_lpar_in_control_structure975);
                    	    lpar73=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    pushFollow(FOLLOW_bool_expr_in_control_structure978);
                    	    bool_expr74=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr74.getTree());
                    	    pushFollow(FOLLOW_rpar_in_control_structure980);
                    	    rpar75=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    SO76=(Token)match(input,SO,FOLLOW_SO_in_control_structure983); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_statementList_in_control_structure986);
                    	    statementList77=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:11: ( OR statementList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:12: OR statementList
                            {
                            OR78=(Token)match(input,OR,FOLLOW_OR_in_control_structure1001); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OR78_tree = (CommonTree)adaptor.create(OR78);
                            adaptor.addChild(root_0, OR78_tree);
                            }
                            pushFollow(FOLLOW_statementList_in_control_structure1003);
                            statementList79=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList79.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_endif_in_control_structure1017);
                    endif80=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:106:11: EITHER lpar bool_expr rpar SO statementList OR statementList endif
                    {
                    EITHER81=(Token)match(input,EITHER,FOLLOW_EITHER_in_control_structure1030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EITHER81_tree = (CommonTree)adaptor.create(EITHER81);
                    root_0 = (CommonTree)adaptor.becomeRoot(EITHER81_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1033);
                    lpar82=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1036);
                    bool_expr83=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr83.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1038);
                    rpar84=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO85=(Token)match(input,SO,FOLLOW_SO_in_control_structure1041); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1054);
                    statementList86=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList86.getTree());
                    OR87=(Token)match(input,OR,FOLLOW_OR_in_control_structure1067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR87_tree = (CommonTree)adaptor.create(OR87);
                    adaptor.addChild(root_0, OR87_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure1069);
                    statementList88=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList88.getTree());
                    pushFollow(FOLLOW_endif_in_control_structure1081);
                    endif89=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:110:11: EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES
                    {
                    EVENTUALLY90=(Token)match(input,EVENTUALLY,FOLLOW_EVENTUALLY_in_control_structure1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EVENTUALLY90_tree = (CommonTree)adaptor.create(EVENTUALLY90);
                    root_0 = (CommonTree)adaptor.becomeRoot(EVENTUALLY90_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1097);
                    lpar91=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1100);
                    bool_expr92=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr92.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1102);
                    rpar93=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    BECAUSE94=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_control_structure1105); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1118);
                    statementList95=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList95.getTree());
                    ENOUGH96=(Token)match(input,ENOUGH,FOLLOW_ENOUGH_in_control_structure1130); if (state.failed) return retval;
                    TIMES97=(Token)match(input,TIMES,FOLLOW_TIMES_in_control_structure1133); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:12: ( '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==70) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred31_malice_grammar()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: '.'
                    {
                    char_literal98=(Token)match(input,70,FOLLOW_70_in_control_structure1144); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:1: declaration_statements : ( IDENT ( WAS A data_types ( TOO )? | HAD expr data_types ) | declaration_init );
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT99=null;
        Token WAS100=null;
        Token A101=null;
        Token TOO103=null;
        Token HAD104=null;
        malice_grammarParser.data_types_return data_types102 = null;

        malice_grammarParser.expr_return expr105 = null;

        malice_grammarParser.data_types_return data_types106 = null;

        malice_grammarParser.declaration_init_return declaration_init107 = null;


        CommonTree IDENT99_tree=null;
        CommonTree WAS100_tree=null;
        CommonTree A101_tree=null;
        CommonTree TOO103_tree=null;
        CommonTree HAD104_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:24: ( IDENT ( WAS A data_types ( TOO )? | HAD expr data_types ) | declaration_init )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==WAS) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==A) ) {
                        int LA25_4 = input.LA(4);

                        if ( ((LA25_4>=CHAR && LA25_4<=STR)) ) {
                            int LA25_5 = input.LA(5);

                            if ( (LA25_5==OF) ) {
                                alt25=2;
                            }
                            else if ( (LA25_5==EOF||LA25_5==TOO||(LA25_5>=AND && LA25_5<=THEN)||(LA25_5>=70 && LA25_5<=71)) ) {
                                alt25=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA25_1==HAD) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:26: IDENT ( WAS A data_types ( TOO )? | HAD expr data_types )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements1154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT99_tree = (CommonTree)adaptor.create(IDENT99);
                    adaptor.addChild(root_0, IDENT99_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:32: ( WAS A data_types ( TOO )? | HAD expr data_types )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==WAS) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==HAD) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:34: WAS A data_types ( TOO )?
                            {
                            WAS100=(Token)match(input,WAS,FOLLOW_WAS_in_declaration_statements1158); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WAS100_tree = (CommonTree)adaptor.create(WAS100);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAS100_tree, root_0);
                            }
                            A101=(Token)match(input,A,FOLLOW_A_in_declaration_statements1161); if (state.failed) return retval;
                            pushFollow(FOLLOW_data_types_in_declaration_statements1164);
                            data_types102=data_types();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types102.getTree());
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:56: ( TOO )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==TOO) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: TOO
                                    {
                                    TOO103=(Token)match(input,TOO,FOLLOW_TOO_in_declaration_statements1166); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:35: HAD expr data_types
                            {
                            HAD104=(Token)match(input,HAD,FOLLOW_HAD_in_declaration_statements1205); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            HAD104_tree = (CommonTree)adaptor.create(HAD104);
                            root_0 = (CommonTree)adaptor.becomeRoot(HAD104_tree, root_0);
                            }
                            pushFollow(FOLLOW_expr_in_declaration_statements1208);
                            expr105=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr105.getTree());
                            pushFollow(FOLLOW_data_types_in_declaration_statements1210);
                            data_types106=data_types();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types106.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:118:28: declaration_init
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_init_in_declaration_statements1272);
                    declaration_init107=declaration_init();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_init107.getTree());

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
    // $ANTLR end "declaration_statements"

    public static class declaration_init_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration_init"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:1: declaration_init : IDENT WAS A data_types OF ( LETTER | STRING | expr ) ;
    public final malice_grammarParser.declaration_init_return declaration_init() throws RecognitionException {
        malice_grammarParser.declaration_init_return retval = new malice_grammarParser.declaration_init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT108=null;
        Token WAS109=null;
        Token A110=null;
        Token OF112=null;
        Token LETTER113=null;
        Token STRING114=null;
        malice_grammarParser.data_types_return data_types111 = null;

        malice_grammarParser.expr_return expr115 = null;


        CommonTree IDENT108_tree=null;
        CommonTree WAS109_tree=null;
        CommonTree A110_tree=null;
        CommonTree OF112_tree=null;
        CommonTree LETTER113_tree=null;
        CommonTree STRING114_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:18: ( IDENT WAS A data_types OF ( LETTER | STRING | expr ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:20: IDENT WAS A data_types OF ( LETTER | STRING | expr )
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT108=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_init1330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT108_tree = (CommonTree)adaptor.create(IDENT108);
            adaptor.addChild(root_0, IDENT108_tree);
            }
            WAS109=(Token)match(input,WAS,FOLLOW_WAS_in_declaration_init1332); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAS109_tree = (CommonTree)adaptor.create(WAS109);
            root_0 = (CommonTree)adaptor.becomeRoot(WAS109_tree, root_0);
            }
            A110=(Token)match(input,A,FOLLOW_A_in_declaration_init1335); if (state.failed) return retval;
            pushFollow(FOLLOW_data_types_in_declaration_init1338);
            data_types111=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types111.getTree());
            OF112=(Token)match(input,OF,FOLLOW_OF_in_declaration_init1340); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:49: ( LETTER | STRING | expr )
            int alt26=3;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt26=1;
                }
                break;
            case STRING:
                {
                alt26=2;
                }
                break;
            case NUMBER:
            case IDENT:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:50: LETTER
                    {
                    LETTER113=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_init1344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER113_tree = (CommonTree)adaptor.create(LETTER113);
                    adaptor.addChild(root_0, LETTER113_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:59: STRING
                    {
                    STRING114=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_init1348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING114_tree = (CommonTree)adaptor.create(STRING114);
                    adaptor.addChild(root_0, STRING114_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:68: expr
                    {
                    pushFollow(FOLLOW_expr_in_declaration_init1352);
                    expr115=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr115.getTree());

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
    // $ANTLR end "declaration_init"

    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER117=null;
        Token STRING118=null;
        malice_grammarParser.expr_return expr116 = null;

        malice_grammarParser.array_elem_return array_elem119 = null;


        CommonTree LETTER117_tree=null;
        CommonTree STRING118_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:9: ( expr | LETTER | STRING | array_elem )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_argument1361);
                    expr116=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr116.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LETTER117=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument1365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER117_tree = (CommonTree)adaptor.create(LETTER117);
                    adaptor.addChild(root_0, LETTER117_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING118=(Token)match(input,STRING,FOLLOW_STRING_in_argument1369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING118_tree = (CommonTree)adaptor.create(STRING118);
                    adaptor.addChild(root_0, STRING118_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_elem_in_argument1373);
                    array_elem119=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem119.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal121=null;
        malice_grammarParser.argument_return argument120 = null;

        malice_grammarParser.argument_return argument122 = null;

        malice_grammarParser.function_call_return function_call123 = null;


        CommonTree char_literal121_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:26: ( argument ( ',' argument )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=NUMBER && LA29_0<=IDENT)||(LA29_0>=LETTER && LA29_0<=49)||(LA29_0>=52 && LA29_0<=55)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions1381);
                            argument120=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument120.getTree());
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:36: ( ',' argument )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==71) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:37: ',' argument
                            	    {
                            	    char_literal121=(Token)match(input,71,FOLLOW_71_in_arguments_to_functions1384); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions1387);
                            	    argument122=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument122.getTree());

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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:57: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_arguments_to_functions1395);
                    function_call123=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call123.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) ( SPOKE | SAID ALICE ) | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set126=null;
        Token SPOKE127=null;
        Token SAID128=null;
        Token ALICE129=null;
        Token IDENT130=null;
        Token string_literal131=null;
        Token PIECE133=null;
        Token BECAME134=null;
        Token LETTER136=null;
        Token STRING137=null;
        Token ATE138=null;
        Token DRANK139=null;
        Token ALICE140=null;
        Token FOUND141=null;
        Token LETTER143=null;
        Token STRING144=null;
        malice_grammarParser.expr_return expr124 = null;

        malice_grammarParser.print_return print125 = null;

        malice_grammarParser.expr_return expr132 = null;

        malice_grammarParser.expr_return expr135 = null;

        malice_grammarParser.expr_return expr142 = null;


        CommonTree set126_tree=null;
        CommonTree SPOKE127_tree=null;
        CommonTree SAID128_tree=null;
        CommonTree ALICE129_tree=null;
        CommonTree IDENT130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree PIECE133_tree=null;
        CommonTree BECAME134_tree=null;
        CommonTree LETTER136_tree=null;
        CommonTree STRING137_tree=null;
        CommonTree ATE138_tree=null;
        CommonTree DRANK139_tree=null;
        CommonTree ALICE140_tree=null;
        CommonTree FOUND141_tree=null;
        CommonTree LETTER143_tree=null;
        CommonTree STRING144_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) ( SPOKE | SAID ALICE ) | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:39: ( expr print )
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:40: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1415);
                    expr124=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());
                    pushFollow(FOLLOW_print_in_rest_statements1417);
                    print125=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(print125.getTree(), root_0);

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:8: ( LETTER | STRING ) ( SPOKE | SAID ALICE )
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

                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:26: ( SPOKE | SAID ALICE )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==SPOKE) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==SAID) ) {
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:28: SPOKE
                            {
                            SPOKE127=(Token)match(input,SPOKE,FOLLOW_SPOKE_in_rest_statements1444); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SPOKE127_tree = (CommonTree)adaptor.create(SPOKE127);
                            root_0 = (CommonTree)adaptor.becomeRoot(SPOKE127_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:37: SAID ALICE
                            {
                            SAID128=(Token)match(input,SAID,FOLLOW_SAID_in_rest_statements1449); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SAID128_tree = (CommonTree)adaptor.create(SAID128);
                            root_0 = (CommonTree)adaptor.becomeRoot(SAID128_tree, root_0);
                            }
                            ALICE129=(Token)match(input,ALICE,FOLLOW_ALICE_in_rest_statements1452); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT130_tree = (CommonTree)adaptor.create(IDENT130);
                    adaptor.addChild(root_0, IDENT130_tree);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:11: ( '\\'s' expr PIECE )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==51) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:12: '\\'s' expr PIECE
                            {
                            string_literal131=(Token)match(input,51,FOLLOW_51_in_rest_statements1476); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_rest_statements1479);
                            expr132=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());
                            PIECE133=(Token)match(input,PIECE,FOLLOW_PIECE_in_rest_statements1481); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PIECE133_tree = (CommonTree)adaptor.create(PIECE133);
                            root_0 = (CommonTree)adaptor.becomeRoot(PIECE133_tree, root_0);
                            }

                            }
                            break;

                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case BECAME:
                        {
                        alt34=1;
                        }
                        break;
                    case ATE:
                        {
                        alt34=2;
                        }
                        break;
                    case DRANK:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:17: BECAME ( expr | LETTER | STRING )
                            {
                            BECAME134=(Token)match(input,BECAME,FOLLOW_BECAME_in_rest_statements1502); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BECAME134_tree = (CommonTree)adaptor.create(BECAME134);
                            root_0 = (CommonTree)adaptor.becomeRoot(BECAME134_tree, root_0);
                            }
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:26: ( expr | LETTER | STRING )
                            int alt33=3;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case IDENT:
                            case 49:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
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
                                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:27: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1507);
                                    expr135=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:34: LETTER
                                    {
                                    LETTER136=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1511); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER136_tree = (CommonTree)adaptor.create(LETTER136);
                                    adaptor.addChild(root_0, LETTER136_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:43: STRING
                                    {
                                    STRING137=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1515); if (state.failed) return retval;
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:130:18: ATE
                            {
                            ATE138=(Token)match(input,ATE,FOLLOW_ATE_in_rest_statements1536); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ATE138_tree = (CommonTree)adaptor.create(ATE138);
                            root_0 = (CommonTree)adaptor.becomeRoot(ATE138_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:18: DRANK
                            {
                            DRANK139=(Token)match(input,DRANK,FOLLOW_DRANK_in_rest_statements1557); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DRANK139_tree = (CommonTree)adaptor.create(DRANK139);
                            root_0 = (CommonTree)adaptor.becomeRoot(DRANK139_tree, root_0);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:7: ALICE FOUND ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ALICE140=(Token)match(input,ALICE,FOLLOW_ALICE_in_rest_statements1590); if (state.failed) return retval;
                    FOUND141=(Token)match(input,FOUND,FOLLOW_FOUND_in_rest_statements1593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOUND141_tree = (CommonTree)adaptor.create(FOUND141);
                    root_0 = (CommonTree)adaptor.becomeRoot(FOUND141_tree, root_0);
                    }
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:21: ( expr | LETTER | STRING )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case IDENT:
                    case 49:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1597);
                            expr142=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr142.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:29: LETTER
                            {
                            LETTER143=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1601); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER143_tree = (CommonTree)adaptor.create(LETTER143);
                            adaptor.addChild(root_0, LETTER143_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:38: STRING
                            {
                            STRING144=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1605); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:1: read_statement : WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHAT145=null;
        Token WAS146=null;
        Token IDENT147=null;
        Token char_literal149=null;
        Token char_literal150=null;
        malice_grammarParser.array_elem_return array_elem148 = null;


        CommonTree WHAT145_tree=null;
        CommonTree WAS146_tree=null;
        CommonTree IDENT147_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree char_literal150_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:16: ( WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:18: WHAT WAS ( IDENT | array_elem ) '?' ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            WHAT145=(Token)match(input,WHAT,FOLLOW_WHAT_in_read_statement1620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHAT145_tree = (CommonTree)adaptor.create(WHAT145);
            root_0 = (CommonTree)adaptor.becomeRoot(WHAT145_tree, root_0);
            }
            WAS146=(Token)match(input,WAS,FOLLOW_WAS_in_read_statement1623); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:29: ( IDENT | array_elem )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==51) ) {
                    alt37=2;
                }
                else if ( (LA37_1==72) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:30: IDENT
                    {
                    IDENT147=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1627); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT147_tree = (CommonTree)adaptor.create(IDENT147);
                    adaptor.addChild(root_0, IDENT147_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:38: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1631);
                    array_elem148=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem148.getTree());

                    }
                    break;

            }

            char_literal149=(Token)match(input,72,FOLLOW_72_in_read_statement1634); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:55: ( '.' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==70) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred56_malice_grammar()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:56: '.'
                    {
                    char_literal150=(Token)match(input,70,FOLLOW_70_in_read_statement1638); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:138:1: print : ( SPOKE | SAID ALICE );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPOKE151=null;
        Token SAID152=null;
        Token ALICE153=null;

        CommonTree SPOKE151_tree=null;
        CommonTree SAID152_tree=null;
        CommonTree ALICE153_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:138:6: ( SPOKE | SAID ALICE )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SPOKE) ) {
                alt39=1;
            }
            else if ( (LA39_0==SAID) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:5: SPOKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SPOKE151=(Token)match(input,SPOKE,FOLLOW_SPOKE_in_print1653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPOKE151_tree = (CommonTree)adaptor.create(SPOKE151);
                    root_0 = (CommonTree)adaptor.becomeRoot(SPOKE151_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:14: SAID ALICE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAID152=(Token)match(input,SAID,FOLLOW_SAID_in_print1658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAID152_tree = (CommonTree)adaptor.create(SAID152);
                    root_0 = (CommonTree)adaptor.becomeRoot(SAID152_tree, root_0);
                    }
                    ALICE153=(Token)match(input,ALICE,FOLLOW_ALICE_in_print1661); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name154 = null;

        malice_grammarParser.lpar_return lpar155 = null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions156 = null;

        malice_grammarParser.rpar_return rpar157 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:17: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_name_in_function_call1675);
            function_name154=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(function_name154.getTree(), root_0);
            pushFollow(FOLLOW_lpar_in_function_call1678);
            lpar155=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar155.getTree());
            pushFollow(FOLLOW_arguments_to_functions_in_function_call1680);
            arguments_to_functions156=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions156.getTree());
            pushFollow(FOLLOW_rpar_in_function_call1682);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:1: statement : ( rest_statements | function_call | declaration_init );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements158 = null;

        malice_grammarParser.function_call_return function_call159 = null;

        malice_grammarParser.declaration_init_return declaration_init160 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:11: ( rest_statements | function_call | declaration_init )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rest_statements_in_statement1690);
                    rest_statements158=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements158.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_statement1694);
                    function_call159=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call159.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:47: declaration_init
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_init_in_statement1698);
                    declaration_init160=declaration_init();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_init160.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:1: statement_conjunctions : ( AND | THEN | BUT | ',' | '.' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND161=null;
        Token THEN162=null;
        Token BUT163=null;
        Token char_literal164=null;
        Token char_literal165=null;

        CommonTree AND161_tree=null;
        CommonTree THEN162_tree=null;
        CommonTree BUT163_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree char_literal165_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:24: ( AND | THEN | BUT | ',' | '.' )
            int alt41=5;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt41=1;
                }
                break;
            case THEN:
                {
                alt41=2;
                }
                break;
            case BUT:
                {
                alt41=3;
                }
                break;
            case 71:
                {
                alt41=4;
                }
                break;
            case 70:
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:26: AND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AND161=(Token)match(input,AND,FOLLOW_AND_in_statement_conjunctions1711); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:33: THEN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    THEN162=(Token)match(input,THEN,FOLLOW_THEN_in_statement_conjunctions1716); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:41: BUT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BUT163=(Token)match(input,BUT,FOLLOW_BUT_in_statement_conjunctions1721); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:48: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal164=(Token)match(input,71,FOLLOW_71_in_statement_conjunctions1726); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:54: '.'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal165=(Token)match(input,70,FOLLOW_70_in_statement_conjunctions1730); if (state.failed) return retval;

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

    public static class declations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declations"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:1: declations : ( declaration_statements statement_conjunctions )* ;
    public final malice_grammarParser.declations_return declations() throws RecognitionException {
        malice_grammarParser.declations_return retval = new malice_grammarParser.declations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.declaration_statements_return declaration_statements166 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions167 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:12: ( ( declaration_statements statement_conjunctions )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:14: ( declaration_statements statement_conjunctions )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:14: ( declaration_statements statement_conjunctions )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==IDENT) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred64_malice_grammar()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:15: declaration_statements statement_conjunctions
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_declations1740);
            	    declaration_statements166=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements166.getTree());
            	    pushFollow(FOLLOW_statement_conjunctions_in_declations1742);
            	    statement_conjunctions167=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions167.getTree());

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
    // $ANTLR end "declations"

    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementList"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:148:1: statementList : declations ( function )* declations ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.declations_return declations168 = null;

        malice_grammarParser.function_return function169 = null;

        malice_grammarParser.declations_return declations170 = null;

        malice_grammarParser.statement_return statement171 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions172 = null;

        malice_grammarParser.control_structure_return control_structure173 = null;

        malice_grammarParser.read_statement_return read_statement174 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions175 = null;

        malice_grammarParser.nested_function_return nested_function176 = null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:148:15: ( declations ( function )* declations ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:148:17: declations ( function )* declations ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_declations_in_statementList1752);
            declations168=declations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declations168.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:148:28: ( function )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==THE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1754);
            	    function169=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function169.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            pushFollow(FOLLOW_declations_in_statementList1757);
            declations170=declations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declations170.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:149:15: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )*
            loop46:
            do {
                int alt46=5;
                switch ( input.LA(1) ) {
                case ALICE:
                case AND:
                case BUT:
                case THEN:
                case NUMBER:
                case IDENT:
                case LETTER:
                case STRING:
                case 49:
                case 52:
                case 53:
                case 54:
                case 55:
                case 70:
                case 71:
                    {
                    alt46=1;
                    }
                    break;
                case PERHAPS:
                case EVENTUALLY:
                case EITHER:
                    {
                    alt46=2;
                    }
                    break;
                case WHAT:
                    {
                    alt46=3;
                    }
                    break;
                case OPENED:
                    {
                    alt46=4;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:149:17: ( ( statement )? statement_conjunctions )
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:149:17: ( ( statement )? statement_conjunctions )
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:149:18: ( statement )? statement_conjunctions
            	    {
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:149:18: ( statement )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==ALICE||(LA44_0>=NUMBER && LA44_0<=IDENT)||(LA44_0>=LETTER && LA44_0<=49)||(LA44_0>=52 && LA44_0<=55)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1777);
            	            statement171=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement171.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1780);
            	    statement_conjunctions172=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions172.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:150:18: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1801);
            	    control_structure173=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure173.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:18: read_statement ( statement_conjunctions )?
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1821);
            	    read_statement174=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement174.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:33: ( statement_conjunctions )?
            	    int alt45=2;
            	    switch ( input.LA(1) ) {
            	        case AND:
            	            {
            	            int LA45_1 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt45=1;
            	            }
            	            }
            	            break;
            	        case THEN:
            	            {
            	            int LA45_2 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt45=1;
            	            }
            	            }
            	            break;
            	        case BUT:
            	            {
            	            int LA45_3 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt45=1;
            	            }
            	            }
            	            break;
            	        case 71:
            	            {
            	            int LA45_4 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt45=1;
            	            }
            	            }
            	            break;
            	        case 70:
            	            {
            	            int LA45_5 = input.LA(2);

            	            if ( (synpred69_malice_grammar()) ) {
            	                alt45=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt45) {
            	        case 1 :
            	            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement_conjunctions
            	            {
            	            pushFollow(FOLLOW_statement_conjunctions_in_statementList1823);
            	            statement_conjunctions175=statement_conjunctions();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions175.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:152:18: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1844);
            	    nested_function176=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function176.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:1: parameter : ( SPIDER )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPIDER177=null;
        Token IDENT179=null;
        malice_grammarParser.data_types_return data_types178 = null;


        CommonTree SPIDER177_tree=null;
        CommonTree IDENT179_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:11: ( ( SPIDER )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:13: ( SPIDER )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:13: ( SPIDER )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SPIDER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:14: SPIDER
                    {
                    SPIDER177=(Token)match(input,SPIDER,FOLLOW_SPIDER_in_parameter1871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPIDER177_tree = (CommonTree)adaptor.create(SPIDER177);
                    adaptor.addChild(root_0, SPIDER177_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_data_types_in_parameter1875);
            data_types178=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(data_types178.getTree(), root_0);
            IDENT179=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1878); if (state.failed) return retval;
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
    // $ANTLR end "parameter"

    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal181=null;
        malice_grammarParser.parameter_return parameter180 = null;

        malice_grammarParser.parameter_return parameter182 = null;


        CommonTree char_literal181_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:14: ( parameter ( ',' parameter )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=CHAR && LA49_0<=STR)||LA49_0==SPIDER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1888);
                    parameter180=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter180.getTree());
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:25: ( ',' parameter )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==71) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:27: ',' parameter
                    	    {
                    	    char_literal181=(Token)match(input,71,FOLLOW_71_in_parameters1892); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_parameters1895);
                    	    parameter182=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter182.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:158:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT183=null;

        CommonTree IDENT183_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:158:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:158:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT183=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT183_tree = (CommonTree)adaptor.create(IDENT183);
            adaptor.addChild(root_0, IDENT183_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:1: nested_function : OPENED statementList CLOSED ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPENED184=null;
        Token CLOSED186=null;
        malice_grammarParser.statementList_return statementList185 = null;


        CommonTree OPENED184_tree=null;
        CommonTree CLOSED186_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:17: ( OPENED statementList CLOSED )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:159:19: OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            OPENED184=(Token)match(input,OPENED,FOLLOW_OPENED_in_nested_function1914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPENED184_tree = (CommonTree)adaptor.create(OPENED184);
            root_0 = (CommonTree)adaptor.becomeRoot(OPENED184_tree, root_0);
            }
            pushFollow(FOLLOW_statementList_in_nested_function1917);
            statementList185=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList185.getTree());
            CLOSED186=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_nested_function1919); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:1: function : THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THE187=null;
        Token LOOKING188=null;
        Token char_literal189=null;
        Token GLASS190=null;
        Token ROOM195=null;
        Token CONTAINED200=null;
        Token A201=null;
        Token OPENED203=null;
        Token CLOSED205=null;
        malice_grammarParser.function_name_return function_name191 = null;

        malice_grammarParser.lpar_return lpar192 = null;

        malice_grammarParser.parameters_return parameters193 = null;

        malice_grammarParser.rpar_return rpar194 = null;

        malice_grammarParser.function_name_return function_name196 = null;

        malice_grammarParser.lpar_return lpar197 = null;

        malice_grammarParser.parameters_return parameters198 = null;

        malice_grammarParser.rpar_return rpar199 = null;

        malice_grammarParser.data_types_return data_types202 = null;

        malice_grammarParser.statementList_return statementList204 = null;


        CommonTree THE187_tree=null;
        CommonTree LOOKING188_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree GLASS190_tree=null;
        CommonTree ROOM195_tree=null;
        CommonTree CONTAINED200_tree=null;
        CommonTree A201_tree=null;
        CommonTree OPENED203_tree=null;
        CommonTree CLOSED205_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:9: ( THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:11: THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            THE187=(Token)match(input,THE,FOLLOW_THE_in_function1927); if (state.failed) return retval;
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:16: ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LOOKING) ) {
                alt50=1;
            }
            else if ( (LA50_0==ROOM) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:18: LOOKING '-' GLASS function_name lpar parameters rpar
                    {
                    LOOKING188=(Token)match(input,LOOKING,FOLLOW_LOOKING_in_function1932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOOKING188_tree = (CommonTree)adaptor.create(LOOKING188);
                    root_0 = (CommonTree)adaptor.becomeRoot(LOOKING188_tree, root_0);
                    }
                    char_literal189=(Token)match(input,54,FOLLOW_54_in_function1935); if (state.failed) return retval;
                    GLASS190=(Token)match(input,GLASS,FOLLOW_GLASS_in_function1938); if (state.failed) return retval;
                    pushFollow(FOLLOW_function_name_in_function1941);
                    function_name191=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name191.getTree());
                    pushFollow(FOLLOW_lpar_in_function1943);
                    lpar192=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1946);
                    parameters193=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters193.getTree());
                    pushFollow(FOLLOW_rpar_in_function1948);
                    rpar194=rpar();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:21: ROOM function_name lpar parameters rpar CONTAINED A data_types
                    {
                    ROOM195=(Token)match(input,ROOM,FOLLOW_ROOM_in_function1972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ROOM195_tree = (CommonTree)adaptor.create(ROOM195);
                    root_0 = (CommonTree)adaptor.becomeRoot(ROOM195_tree, root_0);
                    }
                    pushFollow(FOLLOW_function_name_in_function1975);
                    function_name196=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name196.getTree());
                    pushFollow(FOLLOW_lpar_in_function1977);
                    lpar197=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1980);
                    parameters198=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters198.getTree());
                    pushFollow(FOLLOW_rpar_in_function1982);
                    rpar199=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    CONTAINED200=(Token)match(input,CONTAINED,FOLLOW_CONTAINED_in_function1985); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINED200_tree = (CommonTree)adaptor.create(CONTAINED200);
                    adaptor.addChild(root_0, CONTAINED200_tree);
                    }
                    A201=(Token)match(input,A,FOLLOW_A_in_function1987); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_function1990);
                    data_types202=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types202.getTree());

                    }
                    break;

            }

            OPENED203=(Token)match(input,OPENED,FOLLOW_OPENED_in_function2021); if (state.failed) return retval;
            pushFollow(FOLLOW_statementList_in_function2034);
            statementList204=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList204.getTree());
            CLOSED205=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_function2046); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal209=null;
        malice_grammarParser.declaration_statements_return declaration_statements206 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions207 = null;

        malice_grammarParser.declaration_statements_return declaration_statements208 = null;


        CommonTree char_literal209_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==IDENT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration2068);
            	    declaration_statements206=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements206.getTree());
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:46: ( statement_conjunctions declaration_statements )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==70) ) {
            	            int LA51_1 = input.LA(2);

            	            if ( (synpred76_malice_grammar()) ) {
            	                alt51=1;
            	            }


            	        }
            	        else if ( ((LA51_0>=AND && LA51_0<=THEN)||LA51_0==71) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration2071);
            	    	    statement_conjunctions207=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions207.getTree());
            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration2073);
            	    	    declaration_statements208=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements208.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    char_literal209=(Token)match(input,70,FOLLOW_70_in_global_declaration2077); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF212=null;
        malice_grammarParser.global_declaration_return global_declaration210 = null;

        malice_grammarParser.function_return function211 = null;


        CommonTree EOF212_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_program2088);
            global_declaration210=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration210.getTree());
            // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:170:30: ( function )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==THE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program2090);
            	    function211=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function211.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            EOF212=(Token)match(input,EOF,FOLLOW_EOF_in_program2093); if (state.failed) return retval;

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
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:9: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:9: '.'
        {
        match(input,70,FOLLOW_70_in_synpred31_malice_grammar1144); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_malice_grammar

    // $ANTLR start synpred37_malice_grammar
    public final void synpred37_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:11: ( expr )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred37_malice_grammar1361);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_malice_grammar

    // $ANTLR start synpred42_malice_grammar
    public final void synpred42_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:26: ( ( argument ( ',' argument )* )? )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:26: ( argument ( ',' argument )* )?
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:26: ( argument ( ',' argument )* )?
        int alt62=2;
        int LA62_0 = input.LA(1);

        if ( ((LA62_0>=NUMBER && LA62_0<=IDENT)||(LA62_0>=LETTER && LA62_0<=49)||(LA62_0>=52 && LA62_0<=55)) ) {
            alt62=1;
        }
        switch (alt62) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1381);
                argument();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:36: ( ',' argument )*
                loop61:
                do {
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==71) ) {
                        alt61=1;
                    }


                    switch (alt61) {
                	case 1 :
                	    // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:37: ',' argument
                	    {
                	    match(input,71,FOLLOW_71_in_synpred42_malice_grammar1384); if (state.failed) return ;
                	    pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1387);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop61;
                    }
                } while (true);


                }
                break;

        }


        }
    }
    // $ANTLR end synpred42_malice_grammar

    // $ANTLR start synpred43_malice_grammar
    public final void synpred43_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:21: ( expr print )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred43_malice_grammar1405);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_print_in_synpred43_malice_grammar1407);
        print();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_malice_grammar

    // $ANTLR start synpred52_malice_grammar
    public final void synpred52_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:8: ( IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred52_malice_grammar1463); if (state.failed) return ;
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        {
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:11: ( '\\'s' expr PIECE )?
        int alt65=2;
        int LA65_0 = input.LA(1);

        if ( (LA65_0==51) ) {
            alt65=1;
        }
        switch (alt65) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:12: '\\'s' expr PIECE
                {
                match(input,51,FOLLOW_51_in_synpred52_malice_grammar1476); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred52_malice_grammar1479);
                expr();

                state._fsp--;
                if (state.failed) return ;
                match(input,PIECE,FOLLOW_PIECE_in_synpred52_malice_grammar1481); if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        int alt67=3;
        switch ( input.LA(1) ) {
        case BECAME:
            {
            alt67=1;
            }
            break;
        case ATE:
            {
            alt67=2;
            }
            break;
        case DRANK:
            {
            alt67=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 67, 0, input);

            throw nvae;
        }

        switch (alt67) {
            case 1 :
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:17: BECAME ( expr | LETTER | STRING )
                {
                match(input,BECAME,FOLLOW_BECAME_in_synpred52_malice_grammar1502); if (state.failed) return ;
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:26: ( expr | LETTER | STRING )
                int alt66=3;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case 49:
                case 52:
                case 53:
                case 54:
                case 55:
                    {
                    alt66=1;
                    }
                    break;
                case LETTER:
                    {
                    alt66=2;
                    }
                    break;
                case STRING:
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
                        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:27: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred52_malice_grammar1507);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:34: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred52_malice_grammar1511); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:43: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred52_malice_grammar1515); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:130:18: ATE
                {
                match(input,ATE,FOLLOW_ATE_in_synpred52_malice_grammar1536); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:18: DRANK
                {
                match(input,DRANK,FOLLOW_DRANK_in_synpred52_malice_grammar1557); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred52_malice_grammar

    // $ANTLR start synpred56_malice_grammar
    public final void synpred56_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:56: ( '.' )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:137:56: '.'
        {
        match(input,70,FOLLOW_70_in_synpred56_malice_grammar1638); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_malice_grammar

    // $ANTLR start synpred58_malice_grammar
    public final void synpred58_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:13: ( rest_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred58_malice_grammar1690);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred59_malice_grammar
    public final void synpred59_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:31: ( function_call )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred59_malice_grammar1694);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_malice_grammar

    // $ANTLR start synpred64_malice_grammar
    public final void synpred64_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:15: ( declaration_statements statement_conjunctions )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:15: declaration_statements statement_conjunctions
        {
        pushFollow(FOLLOW_declaration_statements_in_synpred64_malice_grammar1740);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statement_conjunctions_in_synpred64_malice_grammar1742);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_malice_grammar

    // $ANTLR start synpred69_malice_grammar
    public final void synpred69_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:33: ( statement_conjunctions )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:33: statement_conjunctions
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred69_malice_grammar1823);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_malice_grammar

    // $ANTLR start synpred76_malice_grammar
    public final void synpred76_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:47: ( statement_conjunctions declaration_statements )
        // C:\\Users\\varun\\Documents\\Malice\\malice_new_clone\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:169:47: statement_conjunctions declaration_statements
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred76_malice_grammar2071);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declaration_statements_in_synpred76_malice_grammar2073);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_malice_grammar

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
    public final boolean synpred76_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred59_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_malice_grammar_fragment(); // can never throw exception
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\13\uffff";
    static final String DFA27_minS =
        "\1\53\4\uffff\1\0\5\uffff";
    static final String DFA27_maxS =
        "\1\67\4\uffff\1\0\5\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\4";
    static final String DFA27_specialS =
        "\5\uffff\1\0\5\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\5\2\uffff\1\10\1\11\1\1\2\uffff\4\1",
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
            return "123:1: argument : ( expr | LETTER | STRING | array_elem );";
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
                        if ( (synpred37_malice_grammar()) ) {s = 1;}

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
        "\1\53\4\uffff\1\0\6\uffff";
    static final String DFA30_maxS =
        "\1\67\4\uffff\1\0\6\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA30_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\5\2\uffff\4\1\1\uffff\4\1",
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
            return "124:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );";
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
                        if ( (synpred42_malice_grammar()) ) {s = 1;}

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
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\13\uffff";
    static final String DFA36_minS =
        "\1\24\4\uffff\1\0\5\uffff";
    static final String DFA36_maxS =
        "\1\67\4\uffff\1\0\5\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\4\1\1\uffff\2\1\1\2\1\4\1\3";
    static final String DFA36_specialS =
        "\1\0\4\uffff\1\1\5\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\11\26\uffff\1\6\1\5\2\uffff\2\10\1\7\2\uffff\1\4\1\1\1\2"+
            "\1\3",
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
            return "125:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) ( SPOKE | SAID ALICE ) | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );";
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
                        if ( (LA36_0==53) && (synpred43_malice_grammar())) {s = 1;}

                        else if ( (LA36_0==54) && (synpred43_malice_grammar())) {s = 2;}

                        else if ( (LA36_0==55) && (synpred43_malice_grammar())) {s = 3;}

                        else if ( (LA36_0==52) && (synpred43_malice_grammar())) {s = 4;}

                        else if ( (LA36_0==IDENT) ) {s = 5;}

                        else if ( (LA36_0==NUMBER) && (synpred43_malice_grammar())) {s = 6;}

                        else if ( (LA36_0==49) && (synpred43_malice_grammar())) {s = 7;}

                        else if ( ((LA36_0>=LETTER && LA36_0<=STRING)) ) {s = 8;}

                        else if ( (LA36_0==ALICE) ) {s = 9;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_malice_grammar()) ) {s = 7;}

                        else if ( (synpred52_malice_grammar()) ) {s = 10;}

                         
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
        "\1\24\4\uffff\1\0\6\uffff";
    static final String DFA40_maxS =
        "\1\67\4\uffff\1\0\6\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String DFA40_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\26\uffff\1\1\1\5\2\uffff\3\1\2\uffff\4\1",
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
            return "143:1: statement : ( rest_statements | function_call | declaration_init );";
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
                        if ( (synpred58_malice_grammar()) ) {s = 1;}

                        else if ( (synpred59_malice_grammar()) ) {s = 10;}

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
 

    public static final BitSet FOLLOW_BECAUSE_in_endif429 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_endif431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_endif433 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_UNSURE_in_endif435 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHICH_in_endif437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_lpar590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rpar597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem605 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_array_elem607 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_array_elem610 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_array_elem612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom619 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_atom622 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_atom625 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_atom627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data_types0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term668 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_term671 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_term673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_bool_neg683 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_term_in_bool_neg688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unary_op696 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_unary_op701 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_55_in_unary_op706 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult718 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_56_in_mult722 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_57_in_mult727 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_58_in_mult732 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_unary_op_in_mult736 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_mult_in_add746 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_55_in_add750 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_add755 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_mult_in_add759 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_add_in_bool_comp769 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_59_in_bool_comp773 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_60_in_bool_comp778 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_61_in_bool_comp783 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_62_in_bool_comp788 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_add_in_bool_comp792 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq802 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_bool_eq806 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_64_in_bool_eq811 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq815 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_bitw_and828 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and831 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_bitw_xor844 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_bitw_or860 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_bool_and876 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_bool_and_in_bool_or889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_bool_or892 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_and_in_bool_or895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bool_or_in_expr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERHAPS_in_control_structure932 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure935 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure938 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure940 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure943 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure957 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_OR_in_control_structure970 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MAYBE_in_control_structure973 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure975 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure978 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure980 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure983 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure986 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_OR_in_control_structure1001 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1003 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_endif_in_control_structure1017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EITHER_in_control_structure1030 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1033 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1036 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1038 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure1041 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1054 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OR_in_control_structure1067 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1069 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_endif_in_control_structure1081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EVENTUALLY_in_control_structure1094 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1097 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1100 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1102 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BECAUSE_in_control_structure1105 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1118 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENOUGH_in_control_structure1130 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_TIMES_in_control_structure1133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_control_structure1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements1154 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_WAS_in_declaration_statements1158 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_declaration_statements1161 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1164 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TOO_in_declaration_statements1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAD_in_declaration_statements1205 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_declaration_statements1208 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_init_in_declaration_statements1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_init1330 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_declaration_init1332 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_declaration_init1335 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_init1338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OF_in_declaration_init1340 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_LETTER_in_declaration_init1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_init1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_init1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arguments_to_functions1384 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1415 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_rest_statements1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1434 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_SPOKE_in_rest_statements1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAID_in_rest_statements1449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_rest_statements1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1463 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_rest_statements1476 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_rest_statements1481 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_rest_statements1502 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_rest_statements1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_rest_statements1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALICE_in_rest_statements1590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FOUND_in_rest_statements1593 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHAT_in_read_statement1620 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_read_statement1623 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_read_statement1634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_read_statement1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPOKE_in_print1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAID_in_print1658 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_print1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1675 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function_call1678 = new BitSet(new long[]{0x00F7980000000000L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1680 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function_call1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_init_in_statement1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_statement_conjunctions1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_statement_conjunctions1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUT_in_statement_conjunctions1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_statement_conjunctions1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_statement_conjunctions1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_declations1740 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_declations1742 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_declations_in_statementList1752 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_function_in_statementList1754 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_declations_in_statementList1757 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_statementList1777 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1780 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_control_structure_in_statementList1801 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_read_statement_in_statementList1821 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1823 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_nested_function_in_statementList1844 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SPIDER_in_parameter1871 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_parameter1875 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameter1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parameters1892 = new BitSet(new long[]{0x0000008000000E00L});
    public static final BitSet FOLLOW_parameter_in_parameters1895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_function_name1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENED_in_nested_function1914 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_nested_function1917 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_nested_function1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_function1927 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_LOOKING_in_function1932 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function1935 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_GLASS_in_function1938 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1941 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1943 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1946 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1948 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ROOM_in_function1972 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1975 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1977 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1980 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1982 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_CONTAINED_in_function1985 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_function1987 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_function1990 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENED_in_function2021 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_function2034 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_function2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration2068 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration2071 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration2073 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_global_declaration2077 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_global_declaration_in_program2088 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_function_in_program2090 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EOF_in_program2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred31_malice_grammar1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_malice_grammar1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred42_malice_grammar1384 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred43_malice_grammar1405 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_synpred43_malice_grammar1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred52_malice_grammar1463 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_synpred52_malice_grammar1476 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_synpred52_malice_grammar1479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_synpred52_malice_grammar1481 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_synpred52_malice_grammar1502 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_synpred52_malice_grammar1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred52_malice_grammar1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred52_malice_grammar1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_synpred52_malice_grammar1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_synpred52_malice_grammar1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred56_malice_grammar1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred58_malice_grammar1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred59_malice_grammar1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred64_malice_grammar1740 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred64_malice_grammar1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred69_malice_grammar1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred76_malice_grammar2071 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred76_malice_grammar2073 = new BitSet(new long[]{0x0000000000000002L});

}