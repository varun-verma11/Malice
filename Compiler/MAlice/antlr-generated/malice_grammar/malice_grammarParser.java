// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-26 17:04:05

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
    public String getGrammarFileName() { return "/home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g"; }


    public static class endif_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endif"
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:66:1: endif : BECAUSE ALICE WAS UNSURE WHICH ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:66:7: ( BECAUSE ALICE WAS UNSURE WHICH )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:66:9: BECAUSE ALICE WAS UNSURE WHICH
            {
            root_0 = (CommonTree)adaptor.nil();

            BECAUSE1=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_endif440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BECAUSE1_tree = (CommonTree)adaptor.create(BECAUSE1);
            adaptor.addChild(root_0, BECAUSE1_tree);
            }
            ALICE2=(Token)match(input,ALICE,FOLLOW_ALICE_in_endif442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALICE2_tree = (CommonTree)adaptor.create(ALICE2);
            adaptor.addChild(root_0, ALICE2_tree);
            }
            WAS3=(Token)match(input,WAS,FOLLOW_WAS_in_endif444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAS3_tree = (CommonTree)adaptor.create(WAS3);
            adaptor.addChild(root_0, WAS3_tree);
            }
            UNSURE4=(Token)match(input,UNSURE,FOLLOW_UNSURE_in_endif446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNSURE4_tree = (CommonTree)adaptor.create(UNSURE4);
            adaptor.addChild(root_0, UNSURE4_tree);
            }
            WHICH5=(Token)match(input,WHICH,FOLLOW_WHICH_in_endif448); if (state.failed) return retval;
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal6=null;

        CommonTree char_literal6_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:5: ( '(' )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal6=(Token)match(input,49,FOLLOW_49_in_lpar601); if (state.failed) return retval;
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal7=null;

        CommonTree char_literal7_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:5: ( ')' )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal7=(Token)match(input,50,FOLLOW_50_in_rpar608); if (state.failed) return retval;
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:1: array_elem : IDENT '\\'s' expr PIECE ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:12: ( IDENT '\\'s' expr PIECE )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:14: IDENT '\\'s' expr PIECE
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem616); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT8_tree = (CommonTree)adaptor.create(IDENT8);
            adaptor.addChild(root_0, IDENT8_tree);
            }
            string_literal9=(Token)match(input,51,FOLLOW_51_in_array_elem618); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_array_elem621);
            expr10=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr10.getTree());
            PIECE11=(Token)match(input,PIECE,FOLLOW_PIECE_in_array_elem623); if (state.failed) return retval;
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:1: atom : ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:5: ( IDENT ( '\\'s' expr PIECE )? | NUMBER | function_call )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:7: IDENT ( '\\'s' expr PIECE )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT12_tree = (CommonTree)adaptor.create(IDENT12);
                    adaptor.addChild(root_0, IDENT12_tree);
                    }
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:13: ( '\\'s' expr PIECE )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==51) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:14: '\\'s' expr PIECE
                            {
                            string_literal13=(Token)match(input,51,FOLLOW_51_in_atom632); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_atom635);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());
                            PIECE15=(Token)match(input,PIECE,FOLLOW_PIECE_in_atom637); if (state.failed) return retval;
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:36: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER16_tree = (CommonTree)adaptor.create(NUMBER16);
                    adaptor.addChild(root_0, NUMBER16_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:45: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_atom647);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:1: data_types : ( INT | CHAR | STR );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:12: ( INT | CHAR | STR )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 = null;

        malice_grammarParser.lpar_return lpar20 = null;

        malice_grammarParser.expr_return expr21 = null;

        malice_grammarParser.rpar_return rpar22 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:6: ( atom | lpar expr rpar )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_term673);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_term677);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_term680);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());
                    pushFollow(FOLLOW_rpar_in_term682);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal23=null;
        malice_grammarParser.term_return term24 = null;


        CommonTree char_literal23_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:10: ( ( '!' )* term )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:12: ( '!' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:13: '!'
            	    {
            	    char_literal23=(Token)match(input,52,FOLLOW_52_in_bool_neg692); if (state.failed) return retval;
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

            pushFollow(FOLLOW_term_in_bool_neg697);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:10: ( ( '~' | '-' | '+' )* bool_neg )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:12: ( '~' | '-' | '+' )*
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
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:13: '~'
            	    {
            	    char_literal25=(Token)match(input,53,FOLLOW_53_in_unary_op705); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:20: '-'
            	    {
            	    char_literal26=(Token)match(input,54,FOLLOW_54_in_unary_op710); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:27: '+'
            	    {
            	    char_literal27=(Token)match(input,55,FOLLOW_55_in_unary_op715); if (state.failed) return retval;
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

            pushFollow(FOLLOW_bool_neg_in_unary_op720);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_op_in_mult727);
            unary_op29=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op29.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=56 && LA7_0<=58)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:17: ( '*' | '/' | '%' )
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
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:18: '*'
            	            {
            	            char_literal30=(Token)match(input,56,FOLLOW_56_in_mult731); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:25: '/'
            	            {
            	            char_literal31=(Token)match(input,57,FOLLOW_57_in_mult736); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:32: '%'
            	            {
            	            char_literal32=(Token)match(input,58,FOLLOW_58_in_mult741); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_op_in_mult745);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:1: add : mult ( ( '+' | '-' ) mult )* ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:5: ( mult ( ( '+' | '-' ) mult )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add755);
            mult34=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult34.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:12: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=54 && LA9_0<=55)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:13: ( '+' | '-' ) mult
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:13: ( '+' | '-' )
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
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:14: '+'
            	            {
            	            char_literal35=(Token)match(input,55,FOLLOW_55_in_add759); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:21: '-'
            	            {
            	            char_literal36=(Token)match(input,54,FOLLOW_54_in_add764); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add768);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_comp778);
            add38=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=59 && LA11_0<=62)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:18: ( '<=' | '<' | '>' | '>=' )
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
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:19: '<='
            	            {
            	            string_literal39=(Token)match(input,59,FOLLOW_59_in_bool_comp782); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:27: '<'
            	            {
            	            char_literal40=(Token)match(input,60,FOLLOW_60_in_bool_comp787); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:34: '>'
            	            {
            	            char_literal41=(Token)match(input,61,FOLLOW_61_in_bool_comp792); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:41: '>='
            	            {
            	            string_literal42=(Token)match(input,62,FOLLOW_62_in_bool_comp797); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_bool_comp801);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_comp_in_bool_eq811);
            bool_comp44=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp44.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:21: ( ( '==' | '!=' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=63 && LA13_0<=64)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:22: ( '==' | '!=' ) bool_comp
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:22: ( '==' | '!=' )
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
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:23: '=='
            	            {
            	            string_literal45=(Token)match(input,63,FOLLOW_63_in_bool_eq815); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:90:31: '!='
            	            {
            	            string_literal46=(Token)match(input,64,FOLLOW_64_in_bool_eq820); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_comp_in_bool_eq824);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:91:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        malice_grammarParser.bool_eq_return bool_eq48 = null;

        malice_grammarParser.bool_eq_return bool_eq50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:91:10: ( bool_eq ( '&' bool_eq )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:91:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_eq_in_bitw_and834);
            bool_eq48=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq48.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:91:20: ( '&' bool_eq )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==65) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:91:21: '&' bool_eq
            	    {
            	    char_literal49=(Token)match(input,65,FOLLOW_65_in_bitw_and837); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_eq_in_bitw_and840);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:92:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        malice_grammarParser.bitw_and_return bitw_and51 = null;

        malice_grammarParser.bitw_and_return bitw_and53 = null;


        CommonTree char_literal52_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:92:10: ( bitw_and ( '^' bitw_and )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:92:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_and_in_bitw_xor850);
            bitw_and51=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and51.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:92:21: ( '^' bitw_and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==66) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:92:22: '^' bitw_and
            	    {
            	    char_literal52=(Token)match(input,66,FOLLOW_66_in_bitw_xor853); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor856);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:93:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        malice_grammarParser.bitw_xor_return bitw_xor54 = null;

        malice_grammarParser.bitw_xor_return bitw_xor56 = null;


        CommonTree char_literal55_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:93:9: ( bitw_xor ( '|' bitw_xor )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:93:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_xor_in_bitw_or866);
            bitw_xor54=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor54.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:93:20: ( '|' bitw_xor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==67) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:93:21: '|' bitw_xor
            	    {
            	    char_literal55=(Token)match(input,67,FOLLOW_67_in_bitw_or869); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or872);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:94:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        malice_grammarParser.bitw_or_return bitw_or57 = null;

        malice_grammarParser.bitw_or_return bitw_or59 = null;


        CommonTree string_literal58_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:94:10: ( bitw_or ( '&&' bitw_or )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:94:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitw_or_in_bool_and882);
            bitw_or57=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or57.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:94:20: ( '&&' bitw_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:94:21: '&&' bitw_or
            	    {
            	    string_literal58=(Token)match(input,68,FOLLOW_68_in_bool_and885); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitw_or_in_bool_and888);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:95:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        malice_grammarParser.bool_and_return bool_and60 = null;

        malice_grammarParser.bool_and_return bool_and62 = null;


        CommonTree string_literal61_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:95:9: ( bool_and ( '||' bool_and )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:95:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_in_bool_or898);
            bool_and60=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and60.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:95:20: ( '||' bool_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==69) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:95:21: '||' bool_and
            	    {
            	    string_literal61=(Token)match(input,69,FOLLOW_69_in_bool_or901); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bool_and_in_bool_or904);
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
        public CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:97:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or63 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:97:6: ( bool_or )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:97:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_in_expr915);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:99:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr64 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:99:11: ( expr )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:99:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_bool_expr924);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:101:1: control_structure : ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:102:7: ( ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )? )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:102:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:102:9: ( PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif | EITHER lpar bool_expr rpar SO statementList OR statementList endif | EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:102:11: PERHAPS lpar bool_expr rpar SO statementList ( OR MAYBE lpar bool_expr rpar SO statementList )* ( OR statementList )? endif
                    {
                    PERHAPS65=(Token)match(input,PERHAPS,FOLLOW_PERHAPS_in_control_structure941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERHAPS65_tree = (CommonTree)adaptor.create(PERHAPS65);
                    root_0 = (CommonTree)adaptor.becomeRoot(PERHAPS65_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure944);
                    lpar66=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure947);
                    bool_expr67=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr67.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure949);
                    rpar68=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO69=(Token)match(input,SO,FOLLOW_SO_in_control_structure952); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure966);
                    statementList70=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:11: ( OR MAYBE lpar bool_expr rpar SO statementList )*
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
                    	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:12: OR MAYBE lpar bool_expr rpar SO statementList
                    	    {
                    	    OR71=(Token)match(input,OR,FOLLOW_OR_in_control_structure979); if (state.failed) return retval;
                    	    MAYBE72=(Token)match(input,MAYBE,FOLLOW_MAYBE_in_control_structure982); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    MAYBE72_tree = (CommonTree)adaptor.create(MAYBE72);
                    	    adaptor.addChild(root_0, MAYBE72_tree);
                    	    }
                    	    pushFollow(FOLLOW_lpar_in_control_structure984);
                    	    lpar73=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    pushFollow(FOLLOW_bool_expr_in_control_structure987);
                    	    bool_expr74=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr74.getTree());
                    	    pushFollow(FOLLOW_rpar_in_control_structure989);
                    	    rpar75=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    SO76=(Token)match(input,SO,FOLLOW_SO_in_control_structure992); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_statementList_in_control_structure995);
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

                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:105:11: ( OR statementList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:105:12: OR statementList
                            {
                            OR78=(Token)match(input,OR,FOLLOW_OR_in_control_structure1010); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OR78_tree = (CommonTree)adaptor.create(OR78);
                            adaptor.addChild(root_0, OR78_tree);
                            }
                            pushFollow(FOLLOW_statementList_in_control_structure1012);
                            statementList79=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList79.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_endif_in_control_structure1026);
                    endif80=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:107:11: EITHER lpar bool_expr rpar SO statementList OR statementList endif
                    {
                    EITHER81=(Token)match(input,EITHER,FOLLOW_EITHER_in_control_structure1039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EITHER81_tree = (CommonTree)adaptor.create(EITHER81);
                    root_0 = (CommonTree)adaptor.becomeRoot(EITHER81_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1042);
                    lpar82=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1045);
                    bool_expr83=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr83.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1047);
                    rpar84=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    SO85=(Token)match(input,SO,FOLLOW_SO_in_control_structure1050); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1063);
                    statementList86=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList86.getTree());
                    OR87=(Token)match(input,OR,FOLLOW_OR_in_control_structure1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR87_tree = (CommonTree)adaptor.create(OR87);
                    adaptor.addChild(root_0, OR87_tree);
                    }
                    pushFollow(FOLLOW_statementList_in_control_structure1078);
                    statementList88=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList88.getTree());
                    pushFollow(FOLLOW_endif_in_control_structure1090);
                    endif89=endif();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:111:11: EVENTUALLY lpar bool_expr rpar BECAUSE statementList ENOUGH TIMES
                    {
                    EVENTUALLY90=(Token)match(input,EVENTUALLY,FOLLOW_EVENTUALLY_in_control_structure1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EVENTUALLY90_tree = (CommonTree)adaptor.create(EVENTUALLY90);
                    root_0 = (CommonTree)adaptor.becomeRoot(EVENTUALLY90_tree, root_0);
                    }
                    pushFollow(FOLLOW_lpar_in_control_structure1106);
                    lpar91=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_bool_expr_in_control_structure1109);
                    bool_expr92=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr92.getTree());
                    pushFollow(FOLLOW_rpar_in_control_structure1111);
                    rpar93=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    BECAUSE94=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_control_structure1114); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementList_in_control_structure1127);
                    statementList95=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList95.getTree());
                    ENOUGH96=(Token)match(input,ENOUGH,FOLLOW_ENOUGH_in_control_structure1139); if (state.failed) return retval;
                    TIMES97=(Token)match(input,TIMES,FOLLOW_TIMES_in_control_structure1142); if (state.failed) return retval;

                    }
                    break;

            }

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:114:12: ( '.' )?
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:0:0: '.'
                    {
                    char_literal98=(Token)match(input,70,FOLLOW_70_in_control_structure1153); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:1: declaration_statements : IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD atom data_types ) ;
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

        malice_grammarParser.atom_return atom109 = null;

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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:24: ( IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD atom data_types ) )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:26: IDENT ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT99_tree = (CommonTree)adaptor.create(IDENT99);
            adaptor.addChild(root_0, IDENT99_tree);
            }
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:32: ( WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )? | HAD atom data_types )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:34: WAS A data_types ( TOO | OF ( LETTER | STRING | expr ) )?
                    {
                    WAS100=(Token)match(input,WAS,FOLLOW_WAS_in_declaration_statements1167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WAS100_tree = (CommonTree)adaptor.create(WAS100);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAS100_tree, root_0);
                    }
                    A101=(Token)match(input,A,FOLLOW_A_in_declaration_statements1170); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_declaration_statements1173);
                    data_types102=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types102.getTree());
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:53: ( TOO | OF ( LETTER | STRING | expr ) )?
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
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:55: TOO
                            {
                            TOO103=(Token)match(input,TOO,FOLLOW_TOO_in_declaration_statements1177); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TOO103_tree = (CommonTree)adaptor.create(TOO103);
                            adaptor.addChild(root_0, TOO103_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:61: OF ( LETTER | STRING | expr )
                            {
                            OF104=(Token)match(input,OF,FOLLOW_OF_in_declaration_statements1181); if (state.failed) return retval;
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:65: ( LETTER | STRING | expr )
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
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:66: LETTER
                                    {
                                    LETTER105=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements1185); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER105_tree = (CommonTree)adaptor.create(LETTER105);
                                    adaptor.addChild(root_0, LETTER105_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:75: STRING
                                    {
                                    STRING106=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements1189); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING106_tree = (CommonTree)adaptor.create(STRING106);
                                    adaptor.addChild(root_0, STRING106_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:84: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements1193);
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:117:35: HAD atom data_types
                    {
                    HAD108=(Token)match(input,HAD,FOLLOW_HAD_in_declaration_statements1233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HAD108_tree = (CommonTree)adaptor.create(HAD108);
                    root_0 = (CommonTree)adaptor.becomeRoot(HAD108_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_declaration_statements1236);
                    atom109=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom109.getTree());
                    pushFollow(FOLLOW_data_types_in_declaration_statements1238);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:1: argument : ( expr | LETTER | STRING | array_elem );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:9: ( expr | LETTER | STRING | array_elem )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_argument1304);
                    expr111=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr111.getTree());

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LETTER112=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER112_tree = (CommonTree)adaptor.create(LETTER112);
                    adaptor.addChild(root_0, LETTER112_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING113=(Token)match(input,STRING,FOLLOW_STRING_in_argument1312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING113_tree = (CommonTree)adaptor.create(STRING113);
                    adaptor.addChild(root_0, STRING113_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_elem_in_argument1316);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:26: ( argument ( ',' argument )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=NUMBER && LA28_0<=IDENT)||(LA28_0>=LETTER && LA28_0<=49)||(LA28_0>=52 && LA28_0<=55)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions1324);
                            argument115=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument115.getTree());
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:36: ( ',' argument )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==71) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:37: ',' argument
                            	    {
                            	    char_literal116=(Token)match(input,71,FOLLOW_71_in_arguments_to_functions1327); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions1330);
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:57: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_arguments_to_functions1338);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:38: ( expr print )
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:39: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1357);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());
                    pushFollow(FOLLOW_print_in_rest_statements1359);
                    print120=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print120.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:124:9: ( LETTER | STRING ) print
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

                    pushFollow(FOLLOW_print_in_rest_statements1384);
                    print122=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print122.getTree());

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT123_tree = (CommonTree)adaptor.create(IDENT123);
                    adaptor.addChild(root_0, IDENT123_tree);
                    }
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
                    {
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: ( '\\'s' expr PIECE )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==51) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:12: '\\'s' expr PIECE
                            {
                            string_literal124=(Token)match(input,51,FOLLOW_51_in_rest_statements1406); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_rest_statements1409);
                            expr125=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());
                            PIECE126=(Token)match(input,PIECE,FOLLOW_PIECE_in_rest_statements1411); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PIECE126_tree = (CommonTree)adaptor.create(PIECE126);
                            adaptor.addChild(root_0, PIECE126_tree);
                            }

                            }
                            break;

                    }

                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
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
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:17: BECAME ( expr | LETTER | STRING )
                            {
                            BECAME127=(Token)match(input,BECAME,FOLLOW_BECAME_in_rest_statements1431); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BECAME127_tree = (CommonTree)adaptor.create(BECAME127);
                            root_0 = (CommonTree)adaptor.becomeRoot(BECAME127_tree, root_0);
                            }
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( expr | LETTER | STRING )
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
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:27: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1436);
                                    expr128=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:34: LETTER
                                    {
                                    LETTER129=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1440); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER129_tree = (CommonTree)adaptor.create(LETTER129);
                                    adaptor.addChild(root_0, LETTER129_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:43: STRING
                                    {
                                    STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1444); if (state.failed) return retval;
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
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:18: ATE
                            {
                            ATE131=(Token)match(input,ATE,FOLLOW_ATE_in_rest_statements1465); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ATE131_tree = (CommonTree)adaptor.create(ATE131);
                            root_0 = (CommonTree)adaptor.becomeRoot(ATE131_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:18: DRANK
                            {
                            DRANK132=(Token)match(input,DRANK,FOLLOW_DRANK_in_rest_statements1486); if (state.failed) return retval;
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:7: ALICE FOUND ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ALICE133=(Token)match(input,ALICE,FOLLOW_ALICE_in_rest_statements1519); if (state.failed) return retval;
                    FOUND134=(Token)match(input,FOUND,FOLLOW_FOUND_in_rest_statements1522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOUND134_tree = (CommonTree)adaptor.create(FOUND134);
                    root_0 = (CommonTree)adaptor.becomeRoot(FOUND134_tree, root_0);
                    }
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:21: ( expr | LETTER | STRING )
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
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1526);
                            expr135=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:29: LETTER
                            {
                            LETTER136=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1530); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER136_tree = (CommonTree)adaptor.create(LETTER136);
                            adaptor.addChild(root_0, LETTER136_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:38: STRING
                            {
                            STRING137=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1534); if (state.failed) return retval;
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:1: read_statement : WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? ;
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:16: ( WHAT WAS ( IDENT | array_elem ) '?' ( '.' )? )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:18: WHAT WAS ( IDENT | array_elem ) '?' ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            WHAT138=(Token)match(input,WHAT,FOLLOW_WHAT_in_read_statement1549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHAT138_tree = (CommonTree)adaptor.create(WHAT138);
            root_0 = (CommonTree)adaptor.becomeRoot(WHAT138_tree, root_0);
            }
            WAS139=(Token)match(input,WAS,FOLLOW_WAS_in_read_statement1552); if (state.failed) return retval;
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:29: ( IDENT | array_elem )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:30: IDENT
                    {
                    IDENT140=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1556); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT140_tree = (CommonTree)adaptor.create(IDENT140);
                    adaptor.addChild(root_0, IDENT140_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:38: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1560);
                    array_elem141=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem141.getTree());

                    }
                    break;

            }

            char_literal142=(Token)match(input,72,FOLLOW_72_in_read_statement1563); if (state.failed) return retval;
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:55: ( '.' )?
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:56: '.'
                    {
                    char_literal143=(Token)match(input,70,FOLLOW_70_in_read_statement1567); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:136:1: print : ( SPOKE | SAID ALICE );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:136:6: ( SPOKE | SAID ALICE )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:137:5: SPOKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SPOKE144=(Token)match(input,SPOKE,FOLLOW_SPOKE_in_print1582); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPOKE144_tree = (CommonTree)adaptor.create(SPOKE144);
                    root_0 = (CommonTree)adaptor.becomeRoot(SPOKE144_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:137:14: SAID ALICE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAID145=(Token)match(input,SAID,FOLLOW_SAID_in_print1587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAID145_tree = (CommonTree)adaptor.create(SAID145);
                    root_0 = (CommonTree)adaptor.becomeRoot(SAID145_tree, root_0);
                    }
                    ALICE146=(Token)match(input,ALICE,FOLLOW_ALICE_in_print1590); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:140:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name147 = null;

        malice_grammarParser.lpar_return lpar148 = null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions149 = null;

        malice_grammarParser.rpar_return rpar150 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:140:15: ( function_name lpar arguments_to_functions rpar )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:140:17: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_name_in_function_call1604);
            function_name147=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(function_name147.getTree(), root_0);
            pushFollow(FOLLOW_lpar_in_function_call1607);
            lpar148=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar148.getTree());
            pushFollow(FOLLOW_arguments_to_functions_in_function_call1609);
            arguments_to_functions149=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions149.getTree());
            pushFollow(FOLLOW_rpar_in_function_call1611);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements151 = null;

        malice_grammarParser.function_call_return function_call152 = null;

        malice_grammarParser.declaration_statements_return declaration_statements153 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:11: ( rest_statements | function_call | declaration_statements )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rest_statements_in_statement1619);
                    rest_statements151=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements151.getTree());

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_statement1623);
                    function_call152=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call152.getTree());

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:47: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statements_in_statement1627);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:1: statement_conjunctions : ( AND | THEN | BUT | ',' | '.' );
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
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:24: ( AND | THEN | BUT | ',' | '.' )
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:26: AND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AND154=(Token)match(input,AND,FOLLOW_AND_in_statement_conjunctions1640); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:33: THEN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    THEN155=(Token)match(input,THEN,FOLLOW_THEN_in_statement_conjunctions1645); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:41: BUT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BUT156=(Token)match(input,BUT,FOLLOW_BUT_in_statement_conjunctions1650); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:48: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal157=(Token)match(input,71,FOLLOW_71_in_statement_conjunctions1655); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:54: '.'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal158=(Token)match(input,70,FOLLOW_70_in_statement_conjunctions1659); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:1: statementList : ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        malice_grammarParser.statement_return statement159 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions160 = null;

        malice_grammarParser.control_structure_return control_structure161 = null;

        malice_grammarParser.read_statement_return read_statement162 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions163 = null;

        malice_grammarParser.nested_function_return nested_function164 = null;

        malice_grammarParser.function_return function165 = null;



        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:15: ( ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:17: ( ( ( statement )? statement_conjunctions ) | control_structure | read_statement ( statement_conjunctions )? | nested_function | function )*
            loop42:
            do {
                int alt42=6;
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
                    alt42=1;
                    }
                    break;
                case PERHAPS:
                case EVENTUALLY:
                case EITHER:
                    {
                    alt42=2;
                    }
                    break;
                case WHAT:
                    {
                    alt42=3;
                    }
                    break;
                case OPENED:
                    {
                    alt42=4;
                    }
                    break;
                case THE:
                    {
                    alt42=5;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:18: ( ( statement )? statement_conjunctions )
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:18: ( ( statement )? statement_conjunctions )
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:19: ( statement )? statement_conjunctions
            	    {
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:19: ( statement )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==ALICE||(LA40_0>=NUMBER && LA40_0<=IDENT)||(LA40_0>=LETTER && LA40_0<=49)||(LA40_0>=52 && LA40_0<=55)) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:0:0: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1670);
            	            statement159=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement159.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1673);
            	    statement_conjunctions160=statement_conjunctions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions160.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:56: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1678);
            	    control_structure161=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure161.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:76: read_statement ( statement_conjunctions )?
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1682);
            	    read_statement162=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement162.getTree());
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:91: ( statement_conjunctions )?
            	    int alt41=2;
            	    switch ( input.LA(1) ) {
            	        case AND:
            	            {
            	            int LA41_1 = input.LA(2);

            	            if ( (synpred66_malice_grammar()) ) {
            	                alt41=1;
            	            }
            	            }
            	            break;
            	        case THEN:
            	            {
            	            int LA41_2 = input.LA(2);

            	            if ( (synpred66_malice_grammar()) ) {
            	                alt41=1;
            	            }
            	            }
            	            break;
            	        case BUT:
            	            {
            	            int LA41_3 = input.LA(2);

            	            if ( (synpred66_malice_grammar()) ) {
            	                alt41=1;
            	            }
            	            }
            	            break;
            	        case 71:
            	            {
            	            int LA41_4 = input.LA(2);

            	            if ( (synpred66_malice_grammar()) ) {
            	                alt41=1;
            	            }
            	            }
            	            break;
            	        case 70:
            	            {
            	            int LA41_5 = input.LA(2);

            	            if ( (synpred66_malice_grammar()) ) {
            	                alt41=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:0:0: statement_conjunctions
            	            {
            	            pushFollow(FOLLOW_statement_conjunctions_in_statementList1684);
            	            statement_conjunctions163=statement_conjunctions();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions163.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:117: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1689);
            	    nested_function164=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function164.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:146:19: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1713);
            	    function165=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function165.getTree());

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:148:1: parameter : ( SPIDER )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPIDER166=null;
        Token IDENT168=null;
        malice_grammarParser.data_types_return data_types167 = null;


        CommonTree SPIDER166_tree=null;
        CommonTree IDENT168_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:148:11: ( ( SPIDER )? data_types IDENT )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:148:13: ( SPIDER )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:148:13: ( SPIDER )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SPIDER) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:148:14: SPIDER
                    {
                    SPIDER166=(Token)match(input,SPIDER,FOLLOW_SPIDER_in_parameter1724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPIDER166_tree = (CommonTree)adaptor.create(SPIDER166);
                    adaptor.addChild(root_0, SPIDER166_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_data_types_in_parameter1728);
            data_types167=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(data_types167.getTree(), root_0);
            IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT168_tree = (CommonTree)adaptor.create(IDENT168);
            adaptor.addChild(root_0, IDENT168_tree);
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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal170=null;
        malice_grammarParser.parameter_return parameter169 = null;

        malice_grammarParser.parameter_return parameter171 = null;


        CommonTree char_literal170_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:12: ( ( parameter ( ',' parameter )* )? )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:14: ( parameter ( ',' parameter )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=CHAR && LA45_0<=STR)||LA45_0==SPIDER) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1741);
                    parameter169=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter169.getTree());
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:25: ( ',' parameter )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==71) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:27: ',' parameter
                    	    {
                    	    char_literal170=(Token)match(input,71,FOLLOW_71_in_parameters1745); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_parameters1748);
                    	    parameter171=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter171.getTree());

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT172=null;

        CommonTree IDENT172_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:15: ( IDENT )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT172=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1760); if (state.failed) return retval;
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
    // $ANTLR end "function_name"

    public static class nested_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_function"
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:152:1: nested_function : OPENED statementList CLOSED ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPENED173=null;
        Token CLOSED175=null;
        malice_grammarParser.statementList_return statementList174 = null;


        CommonTree OPENED173_tree=null;
        CommonTree CLOSED175_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:152:17: ( OPENED statementList CLOSED )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:152:19: OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            OPENED173=(Token)match(input,OPENED,FOLLOW_OPENED_in_nested_function1767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPENED173_tree = (CommonTree)adaptor.create(OPENED173);
            root_0 = (CommonTree)adaptor.becomeRoot(OPENED173_tree, root_0);
            }
            pushFollow(FOLLOW_statementList_in_nested_function1770);
            statementList174=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList174.getTree());
            CLOSED175=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_nested_function1772); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:1: function : THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THE176=null;
        Token LOOKING177=null;
        Token char_literal178=null;
        Token GLASS179=null;
        Token ROOM184=null;
        Token CONTAINED189=null;
        Token A190=null;
        Token OPENED192=null;
        Token CLOSED194=null;
        malice_grammarParser.function_name_return function_name180 = null;

        malice_grammarParser.lpar_return lpar181 = null;

        malice_grammarParser.parameters_return parameters182 = null;

        malice_grammarParser.rpar_return rpar183 = null;

        malice_grammarParser.function_name_return function_name185 = null;

        malice_grammarParser.lpar_return lpar186 = null;

        malice_grammarParser.parameters_return parameters187 = null;

        malice_grammarParser.rpar_return rpar188 = null;

        malice_grammarParser.data_types_return data_types191 = null;

        malice_grammarParser.statementList_return statementList193 = null;


        CommonTree THE176_tree=null;
        CommonTree LOOKING177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree GLASS179_tree=null;
        CommonTree ROOM184_tree=null;
        CommonTree CONTAINED189_tree=null;
        CommonTree A190_tree=null;
        CommonTree OPENED192_tree=null;
        CommonTree CLOSED194_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:9: ( THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:11: THE ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types ) OPENED statementList CLOSED
            {
            root_0 = (CommonTree)adaptor.nil();

            THE176=(Token)match(input,THE,FOLLOW_THE_in_function1780); if (state.failed) return retval;
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:16: ( LOOKING '-' GLASS function_name lpar parameters rpar | ROOM function_name lpar parameters rpar CONTAINED A data_types )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LOOKING) ) {
                alt46=1;
            }
            else if ( (LA46_0==ROOM) ) {
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
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:18: LOOKING '-' GLASS function_name lpar parameters rpar
                    {
                    LOOKING177=(Token)match(input,LOOKING,FOLLOW_LOOKING_in_function1785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOOKING177_tree = (CommonTree)adaptor.create(LOOKING177);
                    root_0 = (CommonTree)adaptor.becomeRoot(LOOKING177_tree, root_0);
                    }
                    char_literal178=(Token)match(input,54,FOLLOW_54_in_function1788); if (state.failed) return retval;
                    GLASS179=(Token)match(input,GLASS,FOLLOW_GLASS_in_function1791); if (state.failed) return retval;
                    pushFollow(FOLLOW_function_name_in_function1794);
                    function_name180=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name180.getTree());
                    pushFollow(FOLLOW_lpar_in_function1796);
                    lpar181=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1799);
                    parameters182=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters182.getTree());
                    pushFollow(FOLLOW_rpar_in_function1801);
                    rpar183=rpar();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:154:21: ROOM function_name lpar parameters rpar CONTAINED A data_types
                    {
                    ROOM184=(Token)match(input,ROOM,FOLLOW_ROOM_in_function1825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ROOM184_tree = (CommonTree)adaptor.create(ROOM184);
                    root_0 = (CommonTree)adaptor.becomeRoot(ROOM184_tree, root_0);
                    }
                    pushFollow(FOLLOW_function_name_in_function1828);
                    function_name185=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name185.getTree());
                    pushFollow(FOLLOW_lpar_in_function1830);
                    lpar186=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parameters_in_function1833);
                    parameters187=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters187.getTree());
                    pushFollow(FOLLOW_rpar_in_function1835);
                    rpar188=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    CONTAINED189=(Token)match(input,CONTAINED,FOLLOW_CONTAINED_in_function1838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINED189_tree = (CommonTree)adaptor.create(CONTAINED189);
                    adaptor.addChild(root_0, CONTAINED189_tree);
                    }
                    A190=(Token)match(input,A,FOLLOW_A_in_function1840); if (state.failed) return retval;
                    pushFollow(FOLLOW_data_types_in_function1843);
                    data_types191=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types191.getTree());

                    }
                    break;

            }

            OPENED192=(Token)match(input,OPENED,FOLLOW_OPENED_in_function1874); if (state.failed) return retval;
            pushFollow(FOLLOW_statementList_in_function1887);
            statementList193=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList193.getTree());
            CLOSED194=(Token)match(input,CLOSED,FOLLOW_CLOSED_in_function1899); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal198=null;
        malice_grammarParser.declaration_statements_return declaration_statements195 = null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions196 = null;

        malice_grammarParser.declaration_statements_return declaration_statements197 = null;


        CommonTree char_literal198_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==IDENT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1930);
            	    declaration_statements195=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements195.getTree());
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:46: ( statement_conjunctions declaration_statements )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==70) ) {
            	            int LA47_1 = input.LA(2);

            	            if ( (synpred74_malice_grammar()) ) {
            	                alt47=1;
            	            }


            	        }
            	        else if ( ((LA47_0>=AND && LA47_0<=THEN)||LA47_0==71) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1933);
            	    	    statement_conjunctions196=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions196.getTree());
            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1935);
            	    	    declaration_statements197=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements197.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    char_literal198=(Token)match(input,70,FOLLOW_70_in_global_declaration1939); if (state.failed) return retval;

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
    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF201=null;
        malice_grammarParser.global_declaration_return global_declaration199 = null;

        malice_grammarParser.function_return function200 = null;


        CommonTree EOF201_tree=null;

        try {
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:9: ( global_declaration ( function )+ EOF )
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_global_declaration_in_program1950);
            global_declaration199=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration199.getTree());
            // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:30: ( function )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==THE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1952);
            	    function200=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function200.getTree());

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

            EOF201=(Token)match(input,EOF,FOLLOW_EOF_in_program1955); if (state.failed) return retval;

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
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:114:9: ( '.' )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:114:9: '.'
        {
        match(input,70,FOLLOW_70_in_synpred31_malice_grammar1153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_malice_grammar

    // $ANTLR start synpred37_malice_grammar
    public final void synpred37_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:11: ( expr )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred37_malice_grammar1304);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_malice_grammar

    // $ANTLR start synpred42_malice_grammar
    public final void synpred42_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:26: ( ( argument ( ',' argument )* )? )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:26: ( argument ( ',' argument )* )?
        {
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:26: ( argument ( ',' argument )* )?
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( ((LA58_0>=NUMBER && LA58_0<=IDENT)||(LA58_0>=LETTER && LA58_0<=49)||(LA58_0>=52 && LA58_0<=55)) ) {
            alt58=1;
        }
        switch (alt58) {
            case 1 :
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1324);
                argument();

                state._fsp--;
                if (state.failed) return ;
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:36: ( ',' argument )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==71) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:37: ',' argument
                	    {
                	    match(input,71,FOLLOW_71_in_synpred42_malice_grammar1327); if (state.failed) return ;
                	    pushFollow(FOLLOW_argument_in_synpred42_malice_grammar1330);
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
    // $ANTLR end synpred42_malice_grammar

    // $ANTLR start synpred43_malice_grammar
    public final void synpred43_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:21: ( expr print )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:123:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred43_malice_grammar1348);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_print_in_synpred43_malice_grammar1350);
        print();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_malice_grammar

    // $ANTLR start synpred51_malice_grammar
    public final void synpred51_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:8: ( IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:8: IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred51_malice_grammar1393); if (state.failed) return ;
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:9: ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        {
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: ( '\\'s' expr PIECE )?
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( (LA60_0==51) ) {
            alt60=1;
        }
        switch (alt60) {
            case 1 :
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:12: '\\'s' expr PIECE
                {
                match(input,51,FOLLOW_51_in_synpred51_malice_grammar1406); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred51_malice_grammar1409);
                expr();

                state._fsp--;
                if (state.failed) return ;
                match(input,PIECE,FOLLOW_PIECE_in_synpred51_malice_grammar1411); if (state.failed) return ;

                }
                break;

        }

        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:13: ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK )
        int alt62=3;
        switch ( input.LA(1) ) {
        case BECAME:
            {
            alt62=1;
            }
            break;
        case ATE:
            {
            alt62=2;
            }
            break;
        case DRANK:
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
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:17: BECAME ( expr | LETTER | STRING )
                {
                match(input,BECAME,FOLLOW_BECAME_in_synpred51_malice_grammar1431); if (state.failed) return ;
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( expr | LETTER | STRING )
                int alt61=3;
                switch ( input.LA(1) ) {
                case NUMBER:
                case IDENT:
                case 49:
                case 52:
                case 53:
                case 54:
                case 55:
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
                        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:27: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred51_malice_grammar1436);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:34: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred51_malice_grammar1440); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:43: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred51_malice_grammar1444); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:18: ATE
                {
                match(input,ATE,FOLLOW_ATE_in_synpred51_malice_grammar1465); if (state.failed) return ;

                }
                break;
            case 3 :
                // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:18: DRANK
                {
                match(input,DRANK,FOLLOW_DRANK_in_synpred51_malice_grammar1486); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred51_malice_grammar

    // $ANTLR start synpred55_malice_grammar
    public final void synpred55_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:56: ( '.' )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:135:56: '.'
        {
        match(input,70,FOLLOW_70_in_synpred55_malice_grammar1567); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_malice_grammar

    // $ANTLR start synpred57_malice_grammar
    public final void synpred57_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:13: ( rest_statements )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred57_malice_grammar1619);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_malice_grammar

    // $ANTLR start synpred58_malice_grammar
    public final void synpred58_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:31: ( function_call )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:141:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred58_malice_grammar1623);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred66_malice_grammar
    public final void synpred66_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:91: ( statement_conjunctions )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:91: statement_conjunctions
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred66_malice_grammar1684);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_malice_grammar

    // $ANTLR start synpred74_malice_grammar
    public final void synpred74_malice_grammar_fragment() throws RecognitionException {   
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:47: ( statement_conjunctions declaration_statements )
        // /home/ostwal/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:161:47: statement_conjunctions declaration_statements
        {
        pushFollow(FOLLOW_statement_conjunctions_in_synpred74_malice_grammar1933);
        statement_conjunctions();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declaration_statements_in_synpred74_malice_grammar1935);
        declaration_statements();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_malice_grammar

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
            return "121:1: argument : ( expr | LETTER | STRING | array_elem );";
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
            return "122:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );";
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
            return "123:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr PIECE )? ( BECAME ( expr | LETTER | STRING ) | ATE | DRANK ) ) | ALICE FOUND ( expr | LETTER | STRING ) );";
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
            return "141:1: statement : ( rest_statements | function_call | declaration_statements );";
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
 

    public static final BitSet FOLLOW_BECAUSE_in_endif440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_endif442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_endif444 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_UNSURE_in_endif446 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHICH_in_endif448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_lpar601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rpar608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem616 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_array_elem618 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_array_elem621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_array_elem623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom629 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_atom632 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_atom635 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_atom637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data_types0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term677 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_term680 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_term682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_bool_neg692 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_term_in_bool_neg697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unary_op705 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_unary_op710 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_55_in_unary_op715 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult727 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_56_in_mult731 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_57_in_mult736 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_58_in_mult741 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_unary_op_in_mult745 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_mult_in_add755 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_55_in_add759 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_54_in_add764 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_mult_in_add768 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_add_in_bool_comp778 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_59_in_bool_comp782 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_60_in_bool_comp787 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_61_in_bool_comp792 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_62_in_bool_comp797 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_add_in_bool_comp801 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq811 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_bool_eq815 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_64_in_bool_eq820 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq824 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_bitw_and837 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_bitw_xor853 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_bitw_or869 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_bool_and885 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_bool_and_in_bool_or898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_bool_or901 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_and_in_bool_or904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bool_or_in_expr915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERHAPS_in_control_structure941 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure944 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure947 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure949 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure952 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure966 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_OR_in_control_structure979 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MAYBE_in_control_structure982 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure984 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure987 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure989 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure992 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure995 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_OR_in_control_structure1010 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1012 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_endif_in_control_structure1026 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EITHER_in_control_structure1039 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1042 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1045 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SO_in_control_structure1050 = new BitSet(new long[]{0x00F39F0508903080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1063 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OR_in_control_structure1076 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1078 = new BitSet(new long[]{0x00F39F0508983080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_endif_in_control_structure1090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EVENTUALLY_in_control_structure1103 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_control_structure1106 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure1109 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_control_structure1111 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BECAUSE_in_control_structure1114 = new BitSet(new long[]{0x00F39F0509901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_control_structure1127 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENOUGH_in_control_structure1139 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_TIMES_in_control_structure1142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_control_structure1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements1163 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_WAS_in_declaration_statements1167 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_declaration_statements1170 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1173 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_TOO_in_declaration_statements1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OF_in_declaration_statements1181 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAD_in_declaration_statements1233 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_atom_in_declaration_statements1236 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arguments_to_functions1327 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1357 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_rest_statements1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1376 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_rest_statements1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1393 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_rest_statements1406 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_rest_statements1411 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_rest_statements1431 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_rest_statements1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_rest_statements1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALICE_in_rest_statements1519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FOUND_in_rest_statements1522 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_rest_statements1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHAT_in_read_statement1549 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WAS_in_read_statement1552 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_read_statement1563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_read_statement1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPOKE_in_print1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAID_in_print1587 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ALICE_in_print1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1604 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function_call1607 = new BitSet(new long[]{0x00F7980000000000L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1609 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function_call1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_statement_conjunctions1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_statement_conjunctions1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUT_in_statement_conjunctions1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_statement_conjunctions1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_statement_conjunctions1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1670 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1673 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_control_structure_in_statementList1678 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_read_statement_in_statementList1682 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1684 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_nested_function_in_statementList1689 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_function_in_statementList1713 = new BitSet(new long[]{0x00F39F0508901082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SPIDER_in_parameter1724 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_parameter1728 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameter1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parameters1745 = new BitSet(new long[]{0x0000008000000E00L});
    public static final BitSet FOLLOW_parameter_in_parameters1748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_function_name1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENED_in_nested_function1767 = new BitSet(new long[]{0x00F39F0708901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_nested_function1770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_nested_function1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_function1780 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_LOOKING_in_function1785 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function1788 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_GLASS_in_function1791 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1794 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1796 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1799 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ROOM_in_function1825 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_function_name_in_function1828 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_lpar_in_function1830 = new BitSet(new long[]{0x0004008000000E00L});
    public static final BitSet FOLLOW_parameters_in_function1833 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rpar_in_function1835 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_CONTAINED_in_function1838 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_A_in_function1840 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_data_types_in_function1843 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENED_in_function1874 = new BitSet(new long[]{0x00F39F0708901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statementList_in_function1887 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSED_in_function1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1930 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1933 = new BitSet(new long[]{0x00F3980000100000L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1935 = new BitSet(new long[]{0x00F39F0000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_global_declaration1939 = new BitSet(new long[]{0x00F3980000100002L});
    public static final BitSet FOLLOW_global_declaration_in_program1950 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_function_in_program1952 = new BitSet(new long[]{0x00F39F0508901080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_EOF_in_program1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred31_malice_grammar1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_malice_grammar1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred42_malice_grammar1327 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_argument_in_synpred42_malice_grammar1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred43_malice_grammar1348 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_print_in_synpred43_malice_grammar1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred51_malice_grammar1393 = new BitSet(new long[]{0x0008000000000070L});
    public static final BitSet FOLLOW_51_in_synpred51_malice_grammar1406 = new BitSet(new long[]{0x00F2180000000000L});
    public static final BitSet FOLLOW_expr_in_synpred51_malice_grammar1409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PIECE_in_synpred51_malice_grammar1411 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_BECAME_in_synpred51_malice_grammar1431 = new BitSet(new long[]{0x00F3980000000000L});
    public static final BitSet FOLLOW_expr_in_synpred51_malice_grammar1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred51_malice_grammar1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred51_malice_grammar1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATE_in_synpred51_malice_grammar1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRANK_in_synpred51_malice_grammar1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred55_malice_grammar1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred57_malice_grammar1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred58_malice_grammar1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred66_malice_grammar1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred74_malice_grammar1933 = new BitSet(new long[]{0x00F3980000100000L});
    public static final BitSet FOLLOW_declaration_statements_in_synpred74_malice_grammar1935 = new BitSet(new long[]{0x0000000000000002L});

}