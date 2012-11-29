// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-28 23:51:22

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
    public String getGrammarFileName() { return "C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g"; }


    public static class endif_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endif"
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:1: endif : BECAUSE ALICE WAS UNSURE WHICH ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:7: ( BECAUSE ALICE WAS UNSURE WHICH )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:65:9: BECAUSE ALICE WAS UNSURE WHICH
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal6=null;

        CommonTree char_literal6_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:5: ( '(' )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:7: '('
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal7=null;

        CommonTree char_literal7_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:5: ( ')' )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:77:7: ')'
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:1: array_elem : IDENT '\\'s' expr PIECE ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:12: ( IDENT '\\'s' expr PIECE )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:14: IDENT '\\'s' expr PIECE
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
            adaptor.addChild(root_0, PIECE11_tree);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:1: atom : ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call );
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:5: ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call )
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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:7: IDENT ( '\\'s' expr PIECE )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT12_tree = (CommonTree)adaptor.create(IDENT12);
                    adaptor.addChild(root_0, IDENT12_tree);
                    }
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:13: ( '\\'s' expr PIECE )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==51) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:14: '\\'s' expr PIECE
                            {
                            string_literal13=(Token)match(input,51,FOLLOW_51_in_atom621); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_atom624);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());
                            PIECE15=(Token)match(input,PIECE,FOLLOW_PIECE_in_atom626); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PIECE15_tree = (CommonTree)adaptor.create(PIECE15);
                            adaptor.addChild(root_0, PIECE15_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:36: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER16_tree = (CommonTree)adaptor.create(NUMBER16);
                    adaptor.addChild(root_0, NUMBER16_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:79:45: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_atom636);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:1: data_types : ( INT | CHAR | STR );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:12: ( INT | CHAR | STR )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 = null;

        malice_grammarParser.lpar_return lpar20 = null;

        malice_grammarParser.expr_return expr21 = null;

        malice_grammarParser.rpar_return rpar22 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:6: ( atom | lpar expr rpar )
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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_term662);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:83:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_term666);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_term669);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());
                    pushFollow(FOLLOW_rpar_in_term671);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal23=null;
        malice_grammarParser.term_return term24 = null;


        CommonTree char_literal23_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:10: ( ( '!' )* term )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:12: ( '!' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:13: '!'
            	    {
            	    char_literal23=(Token)match(input,52,FOLLOW_52_in_bool_neg681); if (state.failed) return retval;
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

            pushFollow(FOLLOW_term_in_bool_neg686);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:10: ( ( '~' | '-' | '+' )* bool_neg )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:12: ( '~' | '-' | '+' )*
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
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:13: '~'
            	    {
            	    char_literal25=(Token)match(input,53,FOLLOW_53_in_unary_op694); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:20: '-'
            	    {
            	    char_literal26=(Token)match(input,54,FOLLOW_54_in_unary_op699); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:85:27: '+'
            	    {
            	    char_literal27=(Token)match(input,55,FOLLOW_55_in_unary_op704); if (state.failed) return retval;
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

            pushFollow(FOLLOW_bool_neg_in_unary_op709);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_op_in_mult716);
            unary_op29=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op29.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=56 && LA7_0<=58)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:17: ( '*' | '/' | '%' )
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
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:18: '*'
            	            {
            	            char_literal30=(Token)match(input,56,FOLLOW_56_in_mult720); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:25: '/'
            	            {
            	            char_literal31=(Token)match(input,57,FOLLOW_57_in_mult725); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:86:32: '%'
            	            {
            	            char_literal32=(Token)match(input,58,FOLLOW_58_in_mult730); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_op_in_mult734);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:1: add : mult ( ( '+' | '-' ) mult )* ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:5: ( mult ( ( '+' | '-' ) mult )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add744);
            mult34=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult34.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:12: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=54 && LA9_0<=55)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:13: ( '+' | '-' ) mult
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:13: ( '+' | '-' )
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
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:14: '+'
            	            {
            	            char_literal35=(Token)match(input,55,FOLLOW_55_in_add748); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:87:21: '-'
            	            {
            	            char_literal36=(Token)match(input,54,FOLLOW_54_in_add753); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add757);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_comp767);
            add38=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=59 && LA11_0<=62)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:18: ( '<=' | '<' | '>' | '>=' )
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
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:19: '<='
            	            {
            	            string_literal39=(Token)match(input,59,FOLLOW_59_in_bool_comp771); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:27: '<'
            	            {
            	            char_literal40=(Token)match(input,60,FOLLOW_60_in_bool_comp776); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:34: '>'
            	            {
            	            char_literal41=(Token)match(input,61,FOLLOW_61_in_bool_comp781); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:88:41: '>='
            	            {
            	            string_literal42=(Token)match(input,62,FOLLOW_62_in_bool_comp786); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_bool_comp790);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_comp_in_bool_eq800);
            bool_comp44=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp44.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:21: ( ( '==' | '!=' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=63 && LA13_0<=64)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:22: ( '==' | '!=' ) bool_comp
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:22: ( '==' | '!=' )
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
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:23: '=='
            	            {
            	            string_literal45=(Token)match(input,63,FOLLOW_63_in_bool_eq804); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:89:31: '!='
            	            {
            	            string_literal46=(Token)match(input,64,FOLLOW_64_in_bool_eq809); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_comp_in_bool_eq813);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        malice_grammarParser.bool_eq_return bool_eq48 = null;

        malice_grammarParser.bool_eq_return bool_eq50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:10: ( bool_eq ( '&' bool_eq )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_eq_in_bitw_and823);
            bool_eq48=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq48.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:20: ( '&' bool_eq )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==65) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:90:21: '&' bool_eq
            	    {
            	    char_literal49=(Token)match(input,65,FOLLOW_65_in_bitw_and826); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_eq_in_bitw_and829);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        malice_grammarParser.bitw_and_return bitw_and51 = null;

        malice_grammarParser.bitw_and_return bitw_and53 = null;


        CommonTree char_literal52_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:10: ( bitw_and ( '^' bitw_and )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_and_in_bitw_xor839);
            bitw_and51=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and51.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:21: ( '^' bitw_and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==66) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:91:22: '^' bitw_and
            	    {
            	    char_literal52=(Token)match(input,66,FOLLOW_66_in_bitw_xor842); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor845);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        malice_grammarParser.bitw_xor_return bitw_xor54 = null;

        malice_grammarParser.bitw_xor_return bitw_xor56 = null;


        CommonTree char_literal55_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:9: ( bitw_xor ( '|' bitw_xor )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_xor_in_bitw_or855);
            bitw_xor54=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor54.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:20: ( '|' bitw_xor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==67) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:92:21: '|' bitw_xor
            	    {
            	    char_literal55=(Token)match(input,67,FOLLOW_67_in_bitw_or858); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or861);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        malice_grammarParser.bitw_or_return bitw_or57 = null;

        malice_grammarParser.bitw_or_return bitw_or59 = null;


        CommonTree string_literal58_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:10: ( bitw_or ( '&&' bitw_or )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_or_in_bool_and871);
            bitw_or57=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or57.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:20: ( '&&' bitw_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:93:21: '&&' bitw_or
            	    {
            	    string_literal58=(Token)match(input,68,FOLLOW_68_in_bool_and874); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_or_in_bool_and877);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        malice_grammarParser.bool_and_return bool_and60 = null;

        malice_grammarParser.bool_and_return bool_and62 = null;


        CommonTree string_literal61_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:9: ( bool_and ( '||' bool_and )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_in_bool_or887);
            bool_and60=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and60.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:20: ( '||' bool_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==69) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:94:21: '||' bool_and
            	    {
            	    string_literal61=(Token)match(input,69,FOLLOW_69_in_bool_or890); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_and_in_bool_or893);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or63 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:6: ( bool_or )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:96:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_in_expr904);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr64 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:11: ( expr )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_bool_expr913);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:100:1: control_structure : ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? ;
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
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:7: ( ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES )
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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:11: PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif
                    {
                    PERHAPS65=(Token)match(input,PERHAPS,FOLLOW_PERHAPS_in_control_structure930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERHAPS65_tree = (CommonTree)adaptor.create(PERHAPS65);
                    root_0 = (CommonTree)adaptor.becomeRoot(PERHAPS65_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure933);
                    lpar66=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure936);
                    bool_expr67=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr67.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure938);
                    rpar68=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO69=(Token)match(input,SO,FOLLOW_SO_in_control_structure941); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure955);
                    statementList70=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:11: ( OR MAYBE lpar bool_expr rpar SO statementList )*
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
                    	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:103:12: OR MAYBE lpar bool_expr rpar SO statementList
                    	    {
                    	    OR71=(Token)match(input,OR,FOLLOW_OR_in_control_structure968); if (state.failed) return retval;
                    	    MAYBE72=(Token)match(input,MAYBE,FOLLOW_MAYBE_in_control_structure971); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    MAYBE72_tree = (CommonTree)adaptor.create(MAYBE72);
                    	    adaptor.addChild(root_0, MAYBE72_tree);
                    	    }
                    	    pushFollow(FOLLOW_lpar_in_control_structure973);
                    	    lpar73=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    pushFollow(FOLLOW_bool_expr_in_control_structure976);
                    	    bool_expr74=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr74.getTree());
                    	    pushFollow(FOLLOW_rpar_in_control_structure978);
                    	    rpar75=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    SO76=(Token)match(input,SO,FOLLOW_SO_in_control_structure981); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_statementList_in_control_structure984);
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

                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:11: ( OR statementList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:12: OR statementList
                            {
                            OR78=(Token)match(input,OR,FOLLOW_OR_in_control_structure999); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OR78_tree = (CommonTree)adaptor.create(OR78);
                            adaptor.addChild(root_0, OR78_tree);
                            }
                            pushFollow(FOLLOW_statementList_in_control_structure1001);
                            statementList79=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList79.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_endif_in_control_structure1015);
                    endif80=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:106:11: EITHER lpar bool_expr rpar SO statementList OR statementList endif
                    {
                    EITHER81=(Token)match(input,EITHER,FOLLOW_EITHER_in_control_structure1028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EITHER81_tree = (CommonTree)adaptor.create(EITHER81);
                    root_0 = (CommonTree)adaptor.becomeRoot(EITHER81_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1031);
                    lpar82=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1034);
                    bool_expr83=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr83.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1036);
                    rpar84=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO85=(Token)match(input,SO,FOLLOW_SO_in_control_structure1039); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1052);
                    statementList86=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList86.getTree());
                    OR87=(Token)match(input,OR,FOLLOW_OR_in_control_structure1065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR87_tree = (CommonTree)adaptor.create(OR87);
                    adaptor.addChild(root_0, OR87_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure1067);
                    statementList88=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList88.getTree());
                    pushFollow(FOLLOW_endif_in_control_structure1079);
                    endif89=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:110:11: EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES
                    {
                    EVENTUALLY90=(Token)match(input,EVENTUALLY,FOLLOW_EVENTUALLY_in_control_structure1092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EVENTUALLY90_tree = (CommonTree)adaptor.create(EVENTUALLY90);
                    root_0 = (CommonTree)adaptor.becomeRoot(EVENTUALLY90_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1095);
                    lpar91=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1098);
                    bool_expr92=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr92.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1100);
                    rpar93=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    BECAUSE94=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_control_structure1103); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1116);
                    statementList95=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList95.getTree());
                    ENOUGH96=(Token)match(input,ENOUGH,FOLLOW_ENOUGH_in_control_structure1128); if (state.failed) return retval;
                    TIMES97=(Token)match(input,TIMES,FOLLOW_TIMES_in_control_structure1131); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:12: ( '.' )?
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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: '.'
                    {
                    char_literal98=(Token)match(input,70,FOLLOW_70_in_control_structure1142); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:1: declaration_statements : IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD expr data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT99=null;
        Token WAS100=null;
        Token A101=null;
        Token TOO103=null;
        Token OF104=null;
        Token LETTER105=null;
        Token STRING106=null;
        Token HAD108=null;
        malice_grammarParser.data_types_return data_types102 = null;

        malice_grammarParser.expr_return expr107 = null;

        malice_grammarParser.expr_return expr109 = null;

        malice_grammarParser.data_types_return data_types110 = null;


        CommonTree IDENT99_tree=null;
        CommonTree WAS100_tree=null;
        CommonTree A101_tree=null;
        CommonTree TOO103_tree=null;
        CommonTree OF104_tree=null;
        CommonTree LETTER105_tree=null;
        CommonTree STRING106_tree=null;
        CommonTree HAD108_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:24: ( IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD expr data_types ) )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:26: IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD expr data_types )
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements1152); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT99_tree = (CommonTree)adaptor.create(IDENT99);
            adaptor.addChild(root_0, IDENT99_tree);
            }
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:32: ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD expr data_types )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WAS) ) {
                alt25=1;
            }
            else if ( (LA25_0==HAD) ) {
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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:34: WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )?
                    {
                    WAS100=(Token)match(input,WAS,FOLLOW_WAS_in_declaration_statements1156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WAS100_tree = (CommonTree)adaptor.create(WAS100);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAS100_tree, root_0);
                    }
                    A101=(Token)match(input,A,FOLLOW_A_in_declaration_statements1159); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_declaration_statements1162);
                    data_types102=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types102.getTree());
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:53: ( TOO | OF ( LETTER | STRING | expr ) )?
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TOO) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==OF) ) {
                        alt24=2;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:55: TOO
                            {
                            TOO103=(Token)match(input,TOO,FOLLOW_TOO_in_declaration_statements1166); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:62: OF ( LETTER | STRING | expr )
                            {
                            OF104=(Token)match(input,OF,FOLLOW_OF_in_declaration_statements1171); if (state.failed) return retval;
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:66: ( LETTER | STRING | expr )
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
                            case 49:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
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
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:67: LETTER
                                    {
                                    LETTER105=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements1175); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER105_tree = (CommonTree)adaptor.create(LETTER105);
                                    adaptor.addChild(root_0, LETTER105_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:76: STRING
                                    {
                                    STRING106=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements1179); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING106_tree = (CommonTree)adaptor.create(STRING106);
                                    adaptor.addChild(root_0, STRING106_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:115:85: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements1183);
                                    expr107=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr107.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:35: HAD expr data_types
                    {
                    HAD108=(Token)match(input,HAD,FOLLOW_HAD_in_declaration_statements1223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HAD108_tree = (CommonTree)adaptor.create(HAD108);
                    root_0 = (CommonTree)adaptor.becomeRoot(HAD108_tree, root_0);
                    }
                    pushFollow(FOLLOW_expr_in_declaration_statements1226);
                    expr109=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr109.getTree());
                    pushFollow(FOLLOW_data_types_in_declaration_statements1228);
                    data_types110=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types110.getTree());

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER112=null;
        Token STRING113=null;
        malice_grammarParser.expr_return expr111 = null;

        malice_grammarParser.array_elem_return array_elem114 = null;


        CommonTree LETTER112_tree=null;
        CommonTree STRING113_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:9: ( expr | LETTER | STRING | array_elem )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_argument1294);
                    expr111=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr111.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LETTER112=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument1298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER112_tree = (CommonTree)adaptor.create(LETTER112);
                    adaptor.addChild(root_0, LETTER112_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING113=(Token)match(input,STRING,FOLLOW_STRING_in_argument1302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING113_tree = (CommonTree)adaptor.create(STRING113);
                    adaptor.addChild(root_0, STRING113_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_elem_in_argument1306);
                    array_elem114=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem114.getTree());

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal116=null;
        malice_grammarParser.argument_return argument115 = null;

        malice_grammarParser.argument_return argument117 = null;

        malice_grammarParser.function_call_return function_call118 = null;


        CommonTree char_literal116_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=NUMBER && LA28_0<=IDENT)||(LA28_0>=LETTER && LA28_0<=49)||(LA28_0>=52 && LA28_0<=55)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions1314);
                            argument115=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument115.getTree());
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:36: ( ',' argument )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==71) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:37: ',' argument
                            	    {
                            	    char_literal116=(Token)match(input,71,FOLLOW_71_in_arguments_to_functions1317); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions1320);
                            	    argument117=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument117.getTree());

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
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:57: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_arguments_to_functions1328);
                    function_call118=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call118.getTree());

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set121=null;
        Token IDENT123=null;
        Token string_literal124=null;
        Token PIECE126=null;
        Token BECAME127=null;
        Token LETTER129=null;
        Token STRING130=null;
        Token ATE131=null;
        Token DRANK132=null;
        Token ALICE133=null;
        Token FOUND134=null;
        Token LETTER136=null;
        Token STRING137=null;
        malice_grammarParser.expr_return expr119 = null;

        malice_grammarParser.print_return print120 = null;

        malice_grammarParser.print_return print122 = null;

        malice_grammarParser.expr_return expr125 = null;

        malice_grammarParser.expr_return expr128 = null;

        malice_grammarParser.expr_return expr135 = null;


        CommonTree set121_tree=null;
        CommonTree IDENT123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree PIECE126_tree=null;
        CommonTree BECAME127_tree=null;
        CommonTree LETTER129_tree=null;
        CommonTree STRING130_tree=null;
        CommonTree ATE131_tree=null;
        CommonTree DRANK132_tree=null;
        CommonTree ALICE133_tree=null;
        CommonTree FOUND134_tree=null;
        CommonTree LETTER136_tree=null;
        CommonTree STRING137_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:39: ( expr print )
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:40: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1348);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());
                    pushFollow(FOLLOW_print_in_rest_statements1350);
                    print120=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(print120.getTree(), root_0);

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:9: ( LETTER | STRING ) print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set121=(Token)input.LT(1);
                    if ( (input.LA(1)>=LETTER && input.LA(1)<=STRING) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set121));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_print_in_rest_statements1376);
                    print122=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print122.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT123_tree = (CommonTree)adaptor.create(IDENT123);
                    adaptor.addChild(root_0, IDENT123_tree);
                    }
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
                    {
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:11: ( '\\'s' expr PIECE )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==51) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:12: '\\'s' expr PIECE
                            {
                            string_literal124=(Token)match(input,51,FOLLOW_51_in_rest_statements1398); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_rest_statements1401);
                            expr125=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());
                            PIECE126=(Token)match(input,PIECE,FOLLOW_PIECE_in_rest_statements1403); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PIECE126_tree = (CommonTree)adaptor.create(PIECE126);
                            adaptor.addChild(root_0, PIECE126_tree);
                            }

                            }
                            break;

                    }

                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
                    int alt32=3;
                    switch ( input.LA(1) ) {
                    case BECAME:
                        {
                        alt32=1;
                        }
                        break;
                    case ATE:
                        {
                        alt32=2;
                        }
                        break;
                    case DRANK:
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
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:17: BECAME ( expr | LETTER | STRING )
                            {
                            BECAME127=(Token)match(input,BECAME,FOLLOW_BECAME_in_rest_statements1423); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BECAME127_tree = (CommonTree)adaptor.create(BECAME127);
                            root_0 = (CommonTree)adaptor.becomeRoot(BECAME127_tree, root_0);
                            }
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:26: ( expr | LETTER | STRING )
                            int alt31=3;
                            switch ( input.LA(1) ) {
                            case NUMBER:
                            case IDENT:
                            case 49:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                                {
                                alt31=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt31=2;
                                }
                                break;
                            case STRING:
                                {
                                alt31=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }

                            switch (alt31) {
                                case 1 :
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:27: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1428);
                                    expr128=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:34: LETTER
                                    {
                                    LETTER129=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1432); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER129_tree = (CommonTree)adaptor.create(LETTER129);
                                    adaptor.addChild(root_0, LETTER129_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:43: STRING
                                    {
                                    STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1436); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING130_tree = (CommonTree)adaptor.create(STRING130);
                                    adaptor.addChild(root_0, STRING130_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: ATE
                            {
                            ATE131=(Token)match(input,ATE,FOLLOW_ATE_in_rest_statements1457); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ATE131_tree = (CommonTree)adaptor.create(ATE131);
                            root_0 = (CommonTree)adaptor.becomeRoot(ATE131_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:18: DRANK
                            {
                            DRANK132=(Token)match(input,DRANK,FOLLOW_DRANK_in_rest_statements1478); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DRANK132_tree = (CommonTree)adaptor.create(DRANK132);
                            root_0 = (CommonTree)adaptor.becomeRoot(DRANK132_tree, root_0);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:7: ALICE FOUND ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ALICE133=(Token)match(input,ALICE,FOLLOW_ALICE_in_rest_statements1511); if (state.failed) return retval;
                    FOUND134=(Token)match(input,FOUND,FOLLOW_FOUND_in_rest_statements1514); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOUND134_tree = (CommonTree)adaptor.create(FOUND134);
                    root_0 = (CommonTree)adaptor.becomeRoot(FOUND134_tree, root_0);
                    }
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:21: ( expr | LETTER | STRING )
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
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1518);
                            expr135=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:29: LETTER
                            {
                            LETTER136=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1522); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER136_tree = (CommonTree)adaptor.create(LETTER136);
                            adaptor.addChild(root_0, LETTER136_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:131:38: STRING
                            {
                            STRING137=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1526); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING137_tree = (CommonTree)adaptor.create(STRING137);
                            adaptor.addChild(root_0, STRING137_tree);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:1: read_statement : WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHAT138=null;
        Token WAS139=null;
        Token IDENT140=null;
        Token char_literal142=null;
        Token char_literal143=null;
        malice_grammarParser.array_elem_return array_elem141 = null;


        CommonTree WHAT138_tree=null;
        CommonTree WAS139_tree=null;
        CommonTree IDENT140_tree=null;
        CommonTree char_literal142_tree=null;
        CommonTree char_literal143_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:16: ( WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:18: WHAT WAS ( IDENT | array_elem ) '?' ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            WHAT138=(Token)match(input,WHAT,FOLLOW_WHAT_in_read_statement1541); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHAT138_tree = (CommonTree)adaptor.create(WHAT138);
            root_0 = (CommonTree)adaptor.becomeRoot(WHAT138_tree, root_0);
            }
            WAS139=(Token)match(input,WAS,FOLLOW_WAS_in_read_statement1544); if (state.failed) return retval;
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:29: ( IDENT | array_elem )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==51) ) {
                    alt35=2;
                }
                else if ( (LA35_1==72) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:30: IDENT
                    {
                    IDENT140=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT140_tree = (CommonTree)adaptor.create(IDENT140);
                    adaptor.addChild(root_0, IDENT140_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:38: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1552);
                    array_elem141=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem141.getTree());

                    }
                    break;

            }

            char_literal142=(Token)match(input,72,FOLLOW_72_in_read_statement1555); if (state.failed) return retval;
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:55: ( '.' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==70) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred55_malice_grammar()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:56: '.'
                    {
                    char_literal143=(Token)match(input,70,FOLLOW_70_in_read_statement1559); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:135:1: print : ( SPOKE | SAID ALICE );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPOKE144=null;
        Token SAID145=null;
        Token ALICE146=null;

        CommonTree SPOKE144_tree=null;
        CommonTree SAID145_tree=null;
        CommonTree ALICE146_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:135:6: ( SPOKE | SAID ALICE )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SPOKE) ) {
                alt37=1;
            }
            else if ( (LA37_0==SAID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:136:5: SPOKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SPOKE144=(Token)match(input,SPOKE,FOLLOW_SPOKE_in_print1574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPOKE144_tree = (CommonTree)adaptor.create(SPOKE144);
                    root_0 = (CommonTree)adaptor.becomeRoot(SPOKE144_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:136:14: SAID ALICE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAID145=(Token)match(input,SAID,FOLLOW_SAID_in_print1579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAID145_tree = (CommonTree)adaptor.create(SAID145);
                    root_0 = (CommonTree)adaptor.becomeRoot(SAID145_tree, root_0);
                    }
                    ALICE146=(Token)match(input,ALICE,FOLLOW_ALICE_in_print1582); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name147 = null;

        malice_grammarParser.lpar_return lpar148 = null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions149 = null;

        malice_grammarParser.rpar_return rpar150 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:139:17: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_name_in_function_call1596);
            function_name147=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(function_name147.getTree(), root_0);
            pushFollow(FOLLOW_lpar_in_function_call1599);
            lpar148=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar148.getTree());
            pushFollow(FOLLOW_arguments_to_functions_in_function_call1601);
            arguments_to_functions149=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions149.getTree());
            pushFollow(FOLLOW_rpar_in_function_call1603);
            rpar150=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar150.getTree());

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements151 = null;

        malice_grammarParser.function_call_return function_call152 = null;

        malice_grammarParser.declaration_statements_return declaration_statements153 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:11: ( rest_statements | function_call | declaration_statements )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rest_statements_in_statement1611);
                    rest_statements151=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements151.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_statement1615);
                    function_call152=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call152.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:47: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statements_in_statement1619);
                    declaration_statements153=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements153.getTree());

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:1: statement_conjunctions : ( AND | THEN | BUT | ',' | '.' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND154=null;
        Token THEN155=null;
        Token BUT156=null;
        Token char_literal157=null;
        Token char_literal158=null;

        CommonTree AND154_tree=null;
        CommonTree THEN155_tree=null;
        CommonTree BUT156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal158_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:24: ( AND | THEN | BUT | ',' | '.' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt39=1;
                }
                break;
            case THEN:
                {
                alt39=2;
                }
                break;
            case BUT:
                {
                alt39=3;
                }
                break;
            case 71:
                {
                alt39=4;
                }
                break;
            case 70:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:26: AND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AND154=(Token)match(input,AND,FOLLOW_AND_in_statement_conjunctions1632); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:33: THEN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    THEN155=(Token)match(input,THEN,FOLLOW_THEN_in_statement_conjunctions1637); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:41: BUT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BUT156=(Token)match(input,BUT,FOLLOW_BUT_in_statement_conjunctions1642); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:48: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal157=(Token)match(input,71,FOLLOW_71_in_statement_conjunctions1647); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:142:54: '.'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal158=(Token)match(input,70,FOLLOW_70_in_statement_conjunctions1651); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:1: statementList : global_declaration ( function )* ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.global_declaration_return global_declaration159 = null;

        malice_grammarParser.function_return function160 = null;

        malice_grammarParser.statement_return statement161 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions162 = null;

        malice_grammarParser.control_structure_return control_structure163 = null;

        malice_grammarParser.read_statement_return read_statement164 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions165 = null;

        malice_grammarParser.nested_function_return nested_function166 = null;



        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:15: ( global_declaration ( function )* ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:17: global_declaration ( function )* ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_statementList1660);
            global_declaration159=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration159.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:36: ( function )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==THE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1662);
            	    function160=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function160.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:15: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function )*
            loop43:
            do {
                int alt43=5;
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
                    alt43=1;
                    }
                    break;
                case PERHAPS:
                case EVENTUALLY:
                case EITHER:
                    {
                    alt43=2;
                    }
                    break;
                case WHAT:
                    {
                    alt43=3;
                    }
                    break;
                case OPENED:
                    {
                    alt43=4;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:17: ( ( statement )? statement_conjunctions )
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:17: ( ( statement )? statement_conjunctions )
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:18: ( statement )? statement_conjunctions
            	    {
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:145:18: ( statement )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==ALICE||(LA41_0>=NUMBER && LA41_0<=IDENT)||(LA41_0>=LETTER && LA41_0<=49)||(LA41_0>=52 && LA41_0<=55)) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1683);
            	            statement161=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement161.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1686);
            	    statement_conjunctions162=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions162.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:146:17: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1706);
            	    control_structure163=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure163.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:17: read_statement ( statement_conjunctions )?
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1725);
            	    read_statement164=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement164.getTree());
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:32: ( statement_conjunctions )?
            	    int alt42=2;
            	    switch ( input.LA(1) ) {
            	        case AND:
            	            {
            	            int LA42_1 = input.LA(2);

            	            if ( (synpred67_malice_grammar()) ) {
            	                alt42=1;
            	            }
            	            }
            	            break;
            	        case THEN:
            	            {
            	            int LA42_2 = input.LA(2);

            	            if ( (synpred67_malice_grammar()) ) {
            	                alt42=1;
            	            }
            	            }
            	            break;
            	        case BUT:
            	            {
            	            int LA42_3 = input.LA(2);

            	            if ( (synpred67_malice_grammar()) ) {
            	                alt42=1;
            	            }
            	            }
            	            break;
            	        case 71:
            	            {
            	            int LA42_4 = input.LA(2);

            	            if ( (synpred67_malice_grammar()) ) {
            	                alt42=1;
            	            }
            	            }
            	            break;
            	        case 70:
            	            {
            	            int LA42_5 = input.LA(2);

            	            if ( (synpred67_malice_grammar()) ) {
            	                alt42=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: statement_conjunctions
            	            {
            	            pushFollow(FOLLOW_statement_conjunctions_in_statementList1727);
            	            statement_conjunctions165=statement_conjunctions();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions165.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:148:17: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1747);
            	    nested_function166=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function166.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:1: parameter : ( SPIDER )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPIDER167=null;
        Token IDENT169=null;
        malice_grammarParser.data_types_return data_types168 = null;


        CommonTree SPIDER167_tree=null;
        CommonTree IDENT169_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:11: ( ( SPIDER )? data_types IDENT )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:13: ( SPIDER )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:13: ( SPIDER )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SPIDER) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:151:14: SPIDER
                    {
                    SPIDER167=(Token)match(input,SPIDER,FOLLOW_SPIDER_in_parameter1774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPIDER167_tree = (CommonTree)adaptor.create(SPIDER167);
                    adaptor.addChild(root_0, SPIDER167_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_data_types_in_parameter1778);
            data_types168=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(data_types168.getTree(), root_0);
            IDENT169=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT169_tree = (CommonTree)adaptor.create(IDENT169);
            adaptor.addChild(root_0, IDENT169_tree);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal171=null;
        malice_grammarParser.parameter_return parameter170 = null;

        malice_grammarParser.parameter_return parameter172 = null;


        CommonTree char_literal171_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:14: ( parameter ( ',' parameter )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=CHAR && LA46_0<=STR)||LA46_0==SPIDER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1791);
                    parameter170=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter170.getTree());
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:25: ( ',' parameter )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==71) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:153:27: ',' parameter
                    	    {
                    	    char_literal171=(Token)match(input,71,FOLLOW_71_in_parameters1795); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_parameters1798);
                    	    parameter172=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:154:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT173=null;

        CommonTree IDENT173_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:154:15: ( IDENT )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:154:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT173=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1810); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT173_tree = (CommonTree)adaptor.create(IDENT173);
            adaptor.addChild(root_0, IDENT173_tree);
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:1: nested_function : OPENED statementList CLOSED ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPENED174=null;
        Token CLOSED176=null;
        malice_grammarParser.statementList_return statementList175 = null;


        CommonTree OPENED174_tree=null;
        CommonTree CLOSED176_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:17: ( OPENED statementList CLOSED )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:19: OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            OPENED174=(Token)match(input,OPENED,FOLLOW_OPENED_in_nested_function1817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPENED174_tree = (CommonTree)adaptor.create(OPENED174);
            root_0 = (CommonTree)adaptor.becomeRoot(OPENED174_tree, root_0);
            }
            pushFollow(FOLLOW_statementList_in_nested_function1820);
            statementList175=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList175.getTree());
            CLOSED176=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_nested_function1822); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:1: function : THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THE177=null;
        Token LOOKING178=null;
        Token char_literal179=null;
        Token GLASS180=null;
        Token ROOM185=null;
        Token CONTAINED190=null;
        Token A191=null;
        Token OPENED193=null;
        Token CLOSED195=null;
        malice_grammarParser.function_name_return function_name181 = null;

        malice_grammarParser.lpar_return lpar182 = null;

        malice_grammarParser.parameters_return parameters183 = null;

        malice_grammarParser.rpar_return rpar184 = null;

        malice_grammarParser.function_name_return function_name186 = null;

        malice_grammarParser.lpar_return lpar187 = null;

        malice_grammarParser.parameters_return parameters188 = null;

        malice_grammarParser.rpar_return rpar189 = null;

        malice_grammarParser.data_types_return data_types192 = null;

        malice_grammarParser.statementList_return statementList194 = null;


        CommonTree THE177_tree=null;
        CommonTree LOOKING178_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree GLASS180_tree=null;
        CommonTree ROOM185_tree=null;
        CommonTree CONTAINED190_tree=null;
        CommonTree A191_tree=null;
        CommonTree OPENED193_tree=null;
        CommonTree CLOSED195_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:9: ( THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:11: THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            THE177=(Token)match(input,THE,FOLLOW_THE_in_function1830); if (state.failed) return retval;
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:16: ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LOOKING) ) {
                alt47=1;
            }
            else if ( (LA47_0==ROOM) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:156:18: LOOKING '-' GLASS function_name lpar parameters rpar
                    {
                    LOOKING178=(Token)match(input,LOOKING,FOLLOW_LOOKING_in_function1835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOOKING178_tree = (CommonTree)adaptor.create(LOOKING178);
                    root_0 = (CommonTree)adaptor.becomeRoot(LOOKING178_tree, root_0);
                    }
                    char_literal179=(Token)match(input,54,FOLLOW_54_in_function1838); if (state.failed) return retval;
                    GLASS180=(Token)match(input,GLASS,FOLLOW_GLASS_in_function1841); if (state.failed) return retval;
                    pushFollow(FOLLOW_function_name_in_function1844);
                    function_name181=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name181.getTree());
                    pushFollow(FOLLOW_lpar_in_function1846);
                    lpar182=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1849);
                    parameters183=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters183.getTree());
                    pushFollow(FOLLOW_rpar_in_function1851);
                    rpar184=rpar();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:21: ROOM function_name lpar parameters rpar CONTAINED A data_types
                    {
                    ROOM185=(Token)match(input,ROOM,FOLLOW_ROOM_in_function1875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ROOM185_tree = (CommonTree)adaptor.create(ROOM185);
                    root_0 = (CommonTree)adaptor.becomeRoot(ROOM185_tree, root_0);
                    }
                    pushFollow(FOLLOW_function_name_in_function1878);
                    function_name186=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name186.getTree());
                    pushFollow(FOLLOW_lpar_in_function1880);
                    lpar187=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1883);
                    parameters188=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters188.getTree());
                    pushFollow(FOLLOW_rpar_in_function1885);
                    rpar189=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    CONTAINED190=(Token)match(input,CONTAINED,FOLLOW_CONTAINED_in_function1888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINED190_tree = (CommonTree)adaptor.create(CONTAINED190);
                    adaptor.addChild(root_0, CONTAINED190_tree);
                    }
                    A191=(Token)match(input,A,FOLLOW_A_in_function1890); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_function1893);
                    data_types192=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types192.getTree());

                    }
                    break;

            }

            OPENED193=(Token)match(input,OPENED,FOLLOW_OPENED_in_function1924); if (state.failed) return retval;
            pushFollow(FOLLOW_statementList_in_function1937);
            statementList194=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList194.getTree());
            CLOSED195=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_function1949); if (state.failed) return retval;

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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal199=null;
        malice_grammarParser.declaration_statements_return declaration_statements196 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions197 = null;

        malice_grammarParser.declaration_statements_return declaration_statements198 = null;


        CommonTree char_literal199_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1980);
            	    declaration_statements196=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements196.getTree());
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:46: ( statement_conjunctions declaration_statements )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==70) ) {
            	            int LA48_1 = input.LA(2);

            	            if ( (synpred74_malice_grammar()) ) {
            	                alt48=1;
            	            }


            	        }
            	        else if ( ((LA48_0>=AND && LA48_0<=THEN)||LA48_0==71) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1983);
            	    	    statement_conjunctions197=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions197.getTree());
            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1985);
            	    	    declaration_statements198=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements198.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);

            	    char_literal199=(Token)match(input,70,FOLLOW_70_in_global_declaration1989); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:165:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF202=null;
        malice_grammarParser.global_declaration_return global_declaration200 = null;

        malice_grammarParser.function_return function201 = null;


        CommonTree EOF202_tree=null;

        try {
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:165:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:165:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_program2000);
            global_declaration200=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration200.getTree());
            // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:165:30: ( function )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==THE) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program2002);
            	    function201=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function201.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            EOF202=(Token)match(input,EOF,FOLLOW_EOF_in_program2005); if (state.failed) return retval;

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
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:9: ( '.' )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:113:9: '.'
        {
        match(input,70,FOLLOW_70_in_synpred31_malice_grammar1142); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_malice_grammar

    // $ANTLR start synpred37_malice_grammar
    public final void synpred37_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:11: ( expr )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:120:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred37_malice_grammar1294);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_malice_grammar

    // $ANTLR start synpred42_malice_grammar
    public final void synpred42_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( ( argument ( ',' argument )* )? )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
        {
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:26: ( argument ( ',' argument )* )?
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( ((LA59_0>=NUMBER && LA59_0<=IDENT)||(LA59_0>=LETTER && LA59_0<=49)||(LA59_0>=52 && LA59_0<=55)) ) {
            alt59=1;
        }
        switch (alt59) {
            case 1 :
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1314);
                argument();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:36: ( ',' argument )*
                loop58:
                do {
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==71) ) {
                        alt58=1;
                    }


                    switch (alt58) {
                	case 1 :
                	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:37: ',' argument
                	    {
                	    match(input,71,FOLLOW_71_in_synpred42_malice_grammar1317); if (state.failed) return ;
                	    pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1320);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop58;
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
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:21: ( expr print )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred43_malice_grammar1338);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_print_in_synpred43_malice_grammar1340);
        print();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_malice_grammar

    // $ANTLR start synpred51_malice_grammar
    public final void synpred51_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:8: ( IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred51_malice_grammar1385); if (state.failed) return ;
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        {
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:11: ( '\\'s' expr PIECE )?
        int alt61=2;
        int LA61_0 = input.LA(1);

        if ( (LA61_0==51) ) {
            alt61=1;
        }
        switch (alt61) {
            case 1 :
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:12: '\\'s' expr PIECE
                {
                match(input,51,FOLLOW_51_in_synpred51_malice_grammar1398); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred51_malice_grammar1401);
                expr();

                state._fsp--;
                if (state.failed) return ;
                match(input,PIECE,FOLLOW_PIECE_in_synpred51_malice_grammar1403); if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        int alt63=3;
        switch ( input.LA(1) ) {
        case BECAME:
            {
            alt63=1;
            }
            break;
        case ATE:
            {
            alt63=2;
            }
            break;
        case DRANK:
            {
            alt63=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 63, 0, input);

            throw nvae;
        }

        switch (alt63) {
            case 1 :
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:17: BECAME ( expr | LETTER | STRING )
                {
                match(input,BECAME,FOLLOW_BECAME_in_synpred51_malice_grammar1423); if (state.failed) return ;
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:26: ( expr | LETTER | STRING )
                int alt62=3;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case 49:
                case 52:
                case 53:
                case 54:
                case 55:
                    {
                    alt62=1;
                    }
                    break;
                case LETTER:
                    {
                    alt62=2;
                    }
                    break;
                case STRING:
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
                        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:27: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred51_malice_grammar1428);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:34: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred51_malice_grammar1432); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:43: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred51_malice_grammar1436); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: ATE
                {
                match(input,ATE,FOLLOW_ATE_in_synpred51_malice_grammar1457); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:18: DRANK
                {
                match(input,DRANK,FOLLOW_DRANK_in_synpred51_malice_grammar1478); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred51_malice_grammar

    // $ANTLR start synpred55_malice_grammar
    public final void synpred55_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:56: ( '.' )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:56: '.'
        {
        match(input,70,FOLLOW_70_in_synpred55_malice_grammar1559); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_malice_grammar

    // $ANTLR start synpred57_malice_grammar
    public final void synpred57_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:13: ( rest_statements )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred57_malice_grammar1611);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_malice_grammar

    // $ANTLR start synpred58_malice_grammar
    public final void synpred58_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: ( function_call )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:140:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred58_malice_grammar1615);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred67_malice_grammar
    public final void synpred67_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:32: ( statement_conjunctions )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:147:32: statement_conjunctions
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred67_malice_grammar1727);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_malice_grammar

    // $ANTLR start synpred74_malice_grammar
    public final void synpred74_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:47: ( statement_conjunctions declaration_statements )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:47: statement_conjunctions declaration_statements
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred74_malice_grammar1983);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declaration_statements_in_synpred74_malice_grammar1985);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_malice_grammar

    // $ANTLR start synpred75_malice_grammar
    public final void synpred75_malice_grammar_fragment() throws RecognitionException {   
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:23: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
        {
        pushFollow(FOLLOW_declaration_statements_in_synpred75_malice_grammar1980);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:46: ( statement_conjunctions declaration_statements )*
        loop67:
        do {
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==70) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==IDENT) ) {
                    alt67=1;
                }


            }
            else if ( ((LA67_0>=AND && LA67_0<=THEN)||LA67_0==71) ) {
                alt67=1;
            }


            switch (alt67) {
        	case 1 :
        	    // C:\\Users\\varun\\Desktop\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:47: statement_conjunctions declaration_statements
        	    {
        	    pushFollow(FOLLOW_statement_conjunctions_in_synpred75_malice_grammar1983);
        	    statement_conjunctions();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_declaration_statements_in_synpred75_malice_grammar1985);
        	    declaration_statements();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop67;
            }
        } while (true);

        match(input,70,FOLLOW_70_in_synpred75_malice_grammar1989); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_malice_grammar

    // Delegated rules

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
    public final boolean synpred75_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred67_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_malice_grammar_fragment(); // can never throw exception
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
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\53\4\uffff\1\0\5\uffff";
    static final String DFA26_maxS =
        "\1\67\4\uffff\1\0\5\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\4";
    static final String DFA26_specialS =
        "\5\uffff\1\0\5\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "120:1: argument : ( expr | LETTER | STRING | array_elem );";
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
        "\1\53\4\uffff\1\0\6\uffff";
    static final String DFA29_maxS =
        "\1\67\4\uffff\1\0\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA29_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA29_transitionS = {
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
            return "121:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );";
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
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\13\uffff";
    static final String DFA34_minS =
        "\1\24\4\uffff\1\0\5\uffff";
    static final String DFA34_maxS =
        "\1\67\4\uffff\1\0\5\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\4\1\1\uffff\2\1\1\2\1\4\1\3";
    static final String DFA34_specialS =
        "\1\0\4\uffff\1\1\5\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "122:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==53) && (synpred43_malice_grammar())) {s = 1;}

                        else if ( (LA34_0==54) && (synpred43_malice_grammar())) {s = 2;}

                        else if ( (LA34_0==55) && (synpred43_malice_grammar())) {s = 3;}

                        else if ( (LA34_0==52) && (synpred43_malice_grammar())) {s = 4;}

                        else if ( (LA34_0==IDENT) ) {s = 5;}

                        else if ( (LA34_0==NUMBER) && (synpred43_malice_grammar())) {s = 6;}

                        else if ( (LA34_0==49) && (synpred43_malice_grammar())) {s = 7;}

                        else if ( ((LA34_0>=LETTER && LA34_0<=STRING)) ) {s = 8;}

                        else if ( (LA34_0==ALICE) ) {s = 9;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_malice_grammar()) ) {s = 7;}

                        else if ( (synpred51_malice_grammar()) ) {s = 10;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\14\uffff";
    static final String DFA38_eofS =
        "\14\uffff";
    static final String DFA38_minS =
        "\1\24\4\uffff\1\0\6\uffff";
    static final String DFA38_maxS =
        "\1\67\4\uffff\1\0\6\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String DFA38_specialS =
        "\5\uffff\1\0\6\uffff}>";
    static final String[] DFA38_transitionS = {
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "140:1: statement : ( rest_statements | function_call | declaration_statements );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_malice_grammar()) ) {s = 1;}

                        else if ( (synpred58_malice_grammar()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\33\uffff";
    static final String DFA49_eofS =
        "\1\1\32\uffff";
    static final String DFA49_minS =
        "\1\7\5\uffff\1\0\24\uffff";
    static final String DFA49_maxS =
        "\1\107\5\uffff\1\0\24\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\2\30\uffff\1\1";
    static final String DFA49_specialS =
        "\6\uffff\1\0\24\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\1\4\uffff\2\1\5\uffff\2\1\2\uffff\2\1\2\uffff\1\1\4\uffff"+
            "\3\1\5\uffff\4\1\1\6\2\uffff\3\1\2\uffff\4\1\16\uffff\2\1",
            "",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 164:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_malice_grammar()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
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
    public static final BitSet FOLLOW_IDENT_in_atom618 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_atom621 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_atom624 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_atom626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data_types0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term666 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_term669 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_term671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_bool_neg681 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_term_in_bool_neg686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unary_op694 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_unary_op699 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_55_in_unary_op704 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult716 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_56_in_mult720 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_57_in_mult725 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_58_in_mult730 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_unary_op_in_mult734 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_mult_in_add744 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_55_in_add748 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_add753 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_mult_in_add757 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_add_in_bool_comp767 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_59_in_bool_comp771 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_60_in_bool_comp776 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_61_in_bool_comp781 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_62_in_bool_comp786 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_add_in_bool_comp790 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq800 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_bool_eq804 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_64_in_bool_eq809 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq813 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_bitw_and826 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_bitw_xor842 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_bitw_or858 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_bool_and874 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_bool_and_in_bool_or887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_bool_or890 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_and_in_bool_or893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bool_or_in_expr904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERHAPS_in_control_structure930 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure933 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure938 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure941 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure955 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_OR_in_control_structure968 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MAYBE_in_control_structure971 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure973 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure976 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure978 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure981 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure984 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_OR_in_control_structure999 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1001 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_endif_in_control_structure1015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EITHER_in_control_structure1028 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1031 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1034 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1036 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure1039 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1052 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OR_in_control_structure1065 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1067 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_endif_in_control_structure1079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EVENTUALLY_in_control_structure1092 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1095 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1098 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BECAUSE_in_control_structure1103 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1116 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENOUGH_in_control_structure1128 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_TIMES_in_control_structure1131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_control_structure1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements1152 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_WAS_in_declaration_statements1156 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_declaration_statements1159 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1162 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_TOO_in_declaration_statements1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OF_in_declaration_statements1171 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAD_in_declaration_statements1223 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_declaration_statements1226 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arguments_to_functions1317 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1348 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_rest_statements1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1368 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_rest_statements1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1385 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_rest_statements1398 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_rest_statements1403 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_rest_statements1423 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_rest_statements1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_rest_statements1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALICE_in_rest_statements1511 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FOUND_in_rest_statements1514 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHAT_in_read_statement1541 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_read_statement1544 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_read_statement1555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_read_statement1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPOKE_in_print1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAID_in_print1579 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_print1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1596 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function_call1599 = new BitSet(new long[]{0x00F7980000000000L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1601 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function_call1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_statement_conjunctions1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_statement_conjunctions1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUT_in_statement_conjunctions1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_statement_conjunctions1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_statement_conjunctions1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_declaration_in_statementList1660 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_function_in_statementList1662 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_statementList1683 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1686 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_control_structure_in_statementList1706 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_read_statement_in_statementList1725 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1727 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_nested_function_in_statementList1747 = new BitSet(new long[]{0x00F39F0108901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SPIDER_in_parameter1774 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_parameter1778 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameter1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parameters1795 = new BitSet(new long[]{0x0000008000000E00L});
    public static final BitSet FOLLOW_parameter_in_parameters1798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_function_name1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENED_in_nested_function1817 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_nested_function1820 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_nested_function1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_function1830 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_LOOKING_in_function1835 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function1838 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_GLASS_in_function1841 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1844 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1846 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1849 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1851 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ROOM_in_function1875 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1878 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1880 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1883 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1885 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_CONTAINED_in_function1888 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_function1890 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_function1893 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENED_in_function1924 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_function1937 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_function1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1980 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1983 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1985 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_global_declaration1989 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_global_declaration_in_program2000 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_function_in_program2002 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EOF_in_program2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred31_malice_grammar1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_malice_grammar1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred42_malice_grammar1317 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred43_malice_grammar1338 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_synpred43_malice_grammar1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred51_malice_grammar1385 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_synpred51_malice_grammar1398 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_synpred51_malice_grammar1401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_synpred51_malice_grammar1403 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_synpred51_malice_grammar1423 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_synpred51_malice_grammar1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred51_malice_grammar1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred51_malice_grammar1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_synpred51_malice_grammar1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_synpred51_malice_grammar1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred55_malice_grammar1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred57_malice_grammar1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred58_malice_grammar1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred67_malice_grammar1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred74_malice_grammar1983 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred74_malice_grammar1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred75_malice_grammar1980 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred75_malice_grammar1983 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred75_malice_grammar1985 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_synpred75_malice_grammar1989 = new BitSet(new long[]{0x0000000000000002L});

}