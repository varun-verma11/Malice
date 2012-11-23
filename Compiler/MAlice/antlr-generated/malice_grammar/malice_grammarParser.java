// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-23 12:57:55

  package malice_grammar ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class malice_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LETTER", "LINE_COMMENT", "NUMBER", "STRING", "WS", "'!'", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'?'", "'Alice'", "'The'", "'\\'s'", "'^'", "'a'", "'and'", "'ate'", "'became'", "'because'", "'but'", "'closed'", "'contained'", "'drank'", "'either'", "'enough'", "'eventually'", "'found'", "'had'", "'letter'", "'looking-glass'", "'maybe'", "'number'", "'of'", "'opened'", "'or'", "'perhaps'", "'piece'", "'room'", "'said'", "'sentence'", "'so'", "'spider'", "'spoke'", "'then'", "'times'", "'too'", "'unsure'", "'was'", "'what'", "'which'", "'|'", "'||'", "'~'"
    };

    public static final int EOF=-1;
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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int IDENT=4;
    public static final int LETTER=5;
    public static final int LINE_COMMENT=6;
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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return malice_grammarParser.tokenNames; }
    public String getGrammarFileName() { return "/homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g"; }


    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:1: rule : ( STRING )* ;
    public final malice_grammarParser.rule_return rule() throws RecognitionException {
        malice_grammarParser.rule_return retval = new malice_grammarParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING1=null;

        CommonTree STRING1_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:5: ( ( STRING )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:7: ( STRING )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:7: ( STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:19:7: STRING
            	    {
            	    STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_rule68); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STRING1_tree = 
            	    (CommonTree)adaptor.create(STRING1)
            	    ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:5: ( '(' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:32:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal2=(Token)match(input,15,FOLLOW_15_in_lpar223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal3=null;

        CommonTree char_literal3_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:5: ( ')' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:33:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal3=(Token)match(input,16,FOLLOW_16_in_rpar230); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = 
            (CommonTree)adaptor.create(char_literal3)
            ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:1: mono_op : '~' ;
    public final malice_grammarParser.mono_op_return mono_op() throws RecognitionException {
        malice_grammarParser.mono_op_return retval = new malice_grammarParser.mono_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;

        CommonTree char_literal4_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:9: ( '~' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:34:11: '~'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal4=(Token)match(input,71,FOLLOW_71_in_mono_op238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = 
            (CommonTree)adaptor.create(char_literal4)
            ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:35:1: bin_op : ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' );
    public final malice_grammarParser.bin_op_return bin_op() throws RecognitionException {
        malice_grammarParser.bin_op_return retval = new malice_grammarParser.bin_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:35:8: ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set5=(Token)input.LT(1);

            if ( input.LA(1)==12||input.LA(1)==14||(input.LA(1) >= 17 && input.LA(1) <= 18)||input.LA(1)==20||input.LA(1)==22||input.LA(1)==32||input.LA(1)==69 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set5)
                );
                state.errorRecovery=false;
                state.failed=false;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:36:1: relational_ops : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final malice_grammarParser.relational_ops_return relational_ops() throws RecognitionException {
        malice_grammarParser.relational_ops_return retval = new malice_grammarParser.relational_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:36:16: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set6=(Token)input.LT(1);

            if ( input.LA(1)==11||(input.LA(1) >= 23 && input.LA(1) <= 27) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set6)
                );
                state.errorRecovery=false;
                state.failed=false;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:37:1: array_elem : IDENT '\\'s' expr 'piece' ;
    public final malice_grammarParser.array_elem_return array_elem() throws RecognitionException {
        malice_grammarParser.array_elem_return retval = new malice_grammarParser.array_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT7=null;
        Token string_literal8=null;
        Token string_literal10=null;
        malice_grammarParser.expr_return expr9 =null;


        CommonTree IDENT7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal10_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:37:12: ( IDENT '\\'s' expr 'piece' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:37:14: IDENT '\\'s' expr 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT7_tree = 
            (CommonTree)adaptor.create(IDENT7)
            ;
            adaptor.addChild(root_0, IDENT7_tree);
            }

            string_literal8=(Token)match(input,31,FOLLOW_31_in_array_elem310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal8_tree = 
            (CommonTree)adaptor.create(string_literal8)
            ;
            adaptor.addChild(root_0, string_literal8_tree);
            }

            pushFollow(FOLLOW_expr_in_array_elem312);
            expr9=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr9.getTree());

            string_literal10=(Token)match(input,55,FOLLOW_55_in_array_elem314); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = 
            (CommonTree)adaptor.create(string_literal10)
            ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:1: atom : ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call );
    public final malice_grammarParser.atom_return atom() throws RecognitionException {
        malice_grammarParser.atom_return retval = new malice_grammarParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT11=null;
        Token string_literal12=null;
        Token string_literal14=null;
        Token NUMBER15=null;
        malice_grammarParser.expr_return expr13 =null;

        malice_grammarParser.function_call_return function_call16 =null;


        CommonTree IDENT11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree NUMBER15_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:5: ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1 >= 11 && LA3_1 <= 14)||(LA3_1 >= 16 && LA3_1 <= 27)||(LA3_1 >= 31 && LA3_1 <= 32)||LA3_1==34||LA3_1==38||LA3_1==47||LA3_1==50||LA3_1==55||(LA3_1 >= 57 && LA3_1 <= 58)||(LA3_1 >= 61 && LA3_1 <= 62)||(LA3_1 >= 69 && LA3_1 <= 70)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==15) ) {
                    alt3=3;
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:7: IDENT ( '\\'s' expr 'piece' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT11_tree = 
                    (CommonTree)adaptor.create(IDENT11)
                    ;
                    adaptor.addChild(root_0, IDENT11_tree);
                    }

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:13: ( '\\'s' expr 'piece' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==31) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:14: '\\'s' expr 'piece'
                            {
                            string_literal12=(Token)match(input,31,FOLLOW_31_in_atom323); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal12_tree = 
                            (CommonTree)adaptor.create(string_literal12)
                            ;
                            adaptor.addChild(root_0, string_literal12_tree);
                            }

                            pushFollow(FOLLOW_expr_in_atom325);
                            expr13=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr13.getTree());

                            string_literal14=(Token)match(input,55,FOLLOW_55_in_atom327); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal14_tree = 
                            (CommonTree)adaptor.create(string_literal14)
                            ;
                            adaptor.addChild(root_0, string_literal14_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:37: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER15_tree = 
                    (CommonTree)adaptor.create(NUMBER15)
                    ;
                    adaptor.addChild(root_0, NUMBER15_tree);
                    }

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:38:46: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_atom337);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class logical_ops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_ops"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:64:1: logical_ops : ( '&&' | '||' | '!' );
    public final malice_grammarParser.logical_ops_return logical_ops() throws RecognitionException {
        malice_grammarParser.logical_ops_return retval = new malice_grammarParser.logical_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set17=null;

        CommonTree set17_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:64:13: ( '&&' | '||' | '!' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set17=(Token)input.LT(1);

            if ( input.LA(1)==10||input.LA(1)==13||input.LA(1)==70 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set17)
                );
                state.errorRecovery=false;
                state.failed=false;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:70:1: data_types : ( 'number' | 'letter' | 'sentence' );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:70:12: ( 'number' | 'letter' | 'sentence' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set18=(Token)input.LT(1);

            if ( input.LA(1)==47||input.LA(1)==50||input.LA(1)==58 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set18)
                );
                state.errorRecovery=false;
                state.failed=false;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_types"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:74:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 =null;

        malice_grammarParser.lpar_return lpar20 =null;

        malice_grammarParser.expr_return expr21 =null;

        malice_grammarParser.rpar_return rpar22 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:74:6: ( atom | lpar expr rpar )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT||LA4_0==NUMBER) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:74:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_term409);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:74:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lpar_in_term413);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar20.getTree());

                    pushFollow(FOLLOW_expr_in_term415);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());

                    pushFollow(FOLLOW_rpar_in_term417);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class bool_neg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_neg"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal23=null;
        malice_grammarParser.term_return term24 =null;


        CommonTree char_literal23_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:10: ( ( '!' )* term )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:12: ( '!' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==10) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:13: '!'
            	    {
            	    char_literal23=(Token)match(input,10,FOLLOW_10_in_bool_neg426); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal23_tree = 
            	    (CommonTree)adaptor.create(char_literal23)
            	    ;
            	    adaptor.addChild(root_0, char_literal23_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_bool_neg430);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_neg"


    public static class unary_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_op"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:1: unary_op : ( '~' | '-' | '+' )* bool_neg ;
    public final malice_grammarParser.unary_op_return unary_op() throws RecognitionException {
        malice_grammarParser.unary_op_return retval = new malice_grammarParser.unary_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set25=null;
        malice_grammarParser.bool_neg_return bool_neg26 =null;


        CommonTree set25_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:10: ( ( '~' | '-' | '+' )* bool_neg )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:12: ( '~' | '-' | '+' )* bool_neg
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:12: ( '~' | '-' | '+' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20||LA6_0==71) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
            	    set25=(Token)input.LT(1);

            	    if ( input.LA(1)==18||input.LA(1)==20||input.LA(1)==71 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set25)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_bool_neg_in_unary_op450);
            bool_neg26=bool_neg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg26.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_op"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
    public final malice_grammarParser.mult_return mult() throws RecognitionException {
        malice_grammarParser.mult_return retval = new malice_grammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set28=null;
        malice_grammarParser.unary_op_return unary_op27 =null;

        malice_grammarParser.unary_op_return unary_op29 =null;


        CommonTree set28_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_op_in_mult457);
            unary_op27=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op27.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||LA7_0==17||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    set28=(Token)input.LT(1);

            	    if ( input.LA(1)==12||input.LA(1)==17||input.LA(1)==22 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set28)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_op_in_mult472);
            	    unary_op29=unary_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op29.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final malice_grammarParser.add_return add() throws RecognitionException {
        malice_grammarParser.add_return retval = new malice_grammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set31=null;
        malice_grammarParser.mult_return mult30 =null;

        malice_grammarParser.mult_return mult32 =null;


        CommonTree set31_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:5: ( mult ( ( '+' | '-' ) mult )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add482);
            mult30=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult30.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:12: ( ( '+' | '-' ) mult )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:13: ( '+' | '-' ) mult
            	    {
            	    set31=(Token)input.LT(1);

            	    if ( input.LA(1)==18||input.LA(1)==20 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set31)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add493);
            	    mult32=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult32.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class bool_comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_comp"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:1: bool_comp : add ( ( '<=' | '<' | '>' | '>=' ) add )* ;
    public final malice_grammarParser.bool_comp_return bool_comp() throws RecognitionException {
        malice_grammarParser.bool_comp_return retval = new malice_grammarParser.bool_comp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set34=null;
        malice_grammarParser.add_return add33 =null;

        malice_grammarParser.add_return add35 =null;


        CommonTree set34_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:11: ( add ( ( '<=' | '<' | '>' | '>=' ) add )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:13: add ( ( '<=' | '<' | '>' | '>=' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_bool_comp503);
            add33=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add33.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:17: ( ( '<=' | '<' | '>' | '>=' ) add )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= 23 && LA9_0 <= 24)||(LA9_0 >= 26 && LA9_0 <= 27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:18: ( '<=' | '<' | '>' | '>=' ) add
            	    {
            	    set34=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 26 && input.LA(1) <= 27) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set34)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_bool_comp522);
            	    add35=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add35.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_comp"


    public static class bool_eq_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_eq"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:1: bool_eq : bool_comp ( ( '==' | '!=' ) bool_comp )* ;
    public final malice_grammarParser.bool_eq_return bool_eq() throws RecognitionException {
        malice_grammarParser.bool_eq_return retval = new malice_grammarParser.bool_eq_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set37=null;
        malice_grammarParser.bool_comp_return bool_comp36 =null;

        malice_grammarParser.bool_comp_return bool_comp38 =null;


        CommonTree set37_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:9: ( bool_comp ( ( '==' | '!=' ) bool_comp )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:11: bool_comp ( ( '==' | '!=' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_comp_in_bool_eq532);
            bool_comp36=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp36.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:21: ( ( '==' | '!=' ) bool_comp )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11||LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:22: ( '==' | '!=' ) bool_comp
            	    {
            	    set37=(Token)input.LT(1);

            	    if ( input.LA(1)==11||input.LA(1)==25 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set37)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bool_comp_in_bool_eq543);
            	    bool_comp38=bool_comp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp38.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_eq"


    public static class bitw_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_and"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:81:1: bitw_and : bool_eq ( '&' bool_eq )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal40=null;
        malice_grammarParser.bool_eq_return bool_eq39 =null;

        malice_grammarParser.bool_eq_return bool_eq41 =null;


        CommonTree char_literal40_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:81:10: ( bool_eq ( '&' bool_eq )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:81:12: bool_eq ( '&' bool_eq )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_eq_in_bitw_and553);
            bool_eq39=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq39.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:81:20: ( '&' bool_eq )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:81:21: '&' bool_eq
            	    {
            	    char_literal40=(Token)match(input,14,FOLLOW_14_in_bitw_and556); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal40_tree = 
            	    (CommonTree)adaptor.create(char_literal40)
            	    ;
            	    adaptor.addChild(root_0, char_literal40_tree);
            	    }

            	    pushFollow(FOLLOW_bool_eq_in_bitw_and558);
            	    bool_eq41=bool_eq();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq41.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitw_and"


    public static class bitw_xor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_xor"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal43=null;
        malice_grammarParser.bitw_and_return bitw_and42 =null;

        malice_grammarParser.bitw_and_return bitw_and44 =null;


        CommonTree char_literal43_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:10: ( bitw_and ( '^' bitw_and )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_and_in_bitw_xor568);
            bitw_and42=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and42.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:21: ( '^' bitw_and )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:22: '^' bitw_and
            	    {
            	    char_literal43=(Token)match(input,32,FOLLOW_32_in_bitw_xor571); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal43_tree = 
            	    (CommonTree)adaptor.create(char_literal43)
            	    ;
            	    adaptor.addChild(root_0, char_literal43_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor573);
            	    bitw_and44=bitw_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and44.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitw_xor"


    public static class bitw_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_or"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:83:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal46=null;
        malice_grammarParser.bitw_xor_return bitw_xor45 =null;

        malice_grammarParser.bitw_xor_return bitw_xor47 =null;


        CommonTree char_literal46_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:83:9: ( bitw_xor ( '|' bitw_xor )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:83:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_xor_in_bitw_or583);
            bitw_xor45=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor45.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:83:20: ( '|' bitw_xor )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==69) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:83:21: '|' bitw_xor
            	    {
            	    char_literal46=(Token)match(input,69,FOLLOW_69_in_bitw_or586); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal46_tree = 
            	    (CommonTree)adaptor.create(char_literal46)
            	    ;
            	    adaptor.addChild(root_0, char_literal46_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or588);
            	    bitw_xor47=bitw_xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor47.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitw_or"


    public static class bool_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_and"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:1: bool_and : bitw_or ( '&&' bitw_or )* ;
    public final malice_grammarParser.bool_and_return bool_and() throws RecognitionException {
        malice_grammarParser.bool_and_return retval = new malice_grammarParser.bool_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal49=null;
        malice_grammarParser.bitw_or_return bitw_or48 =null;

        malice_grammarParser.bitw_or_return bitw_or50 =null;


        CommonTree string_literal49_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:10: ( bitw_or ( '&&' bitw_or )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:12: bitw_or ( '&&' bitw_or )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_or_in_bool_and598);
            bitw_or48=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or48.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:20: ( '&&' bitw_or )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:21: '&&' bitw_or
            	    {
            	    string_literal49=(Token)match(input,13,FOLLOW_13_in_bool_and601); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal49_tree = 
            	    (CommonTree)adaptor.create(string_literal49)
            	    ;
            	    adaptor.addChild(root_0, string_literal49_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_or_in_bool_and603);
            	    bitw_or50=bitw_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or50.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_and"


    public static class bool_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_or"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:1: bool_or : bool_and ( '||' bool_and )* ;
    public final malice_grammarParser.bool_or_return bool_or() throws RecognitionException {
        malice_grammarParser.bool_or_return retval = new malice_grammarParser.bool_or_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal52=null;
        malice_grammarParser.bool_and_return bool_and51 =null;

        malice_grammarParser.bool_and_return bool_and53 =null;


        CommonTree string_literal52_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:9: ( bool_and ( '||' bool_and )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:11: bool_and ( '||' bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_and_in_bool_or613);
            bool_and51=bool_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and51.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:20: ( '||' bool_and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==70) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:21: '||' bool_and
            	    {
            	    string_literal52=(Token)match(input,70,FOLLOW_70_in_bool_or616); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal52_tree = 
            	    (CommonTree)adaptor.create(string_literal52)
            	    ;
            	    adaptor.addChild(root_0, string_literal52_tree);
            	    }

            	    pushFollow(FOLLOW_bool_and_in_bool_or618);
            	    bool_and53=bool_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and53.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_or"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:1: expr : bool_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.bool_or_return bool_or54 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:6: ( bool_or )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:87:8: bool_or
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_or_in_expr629);
            bool_or54=bool_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or54.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_expr"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:1: bool_expr : expr ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.expr_return expr55 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:11: ( expr )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:89:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_bool_expr638);
            expr55=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr55.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:103:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal56=null;
        Token string_literal60=null;
        Token string_literal62=null;
        Token string_literal63=null;
        Token string_literal67=null;
        Token string_literal69=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        Token string_literal80=null;
        Token string_literal82=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token string_literal86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        Token string_literal89=null;
        Token string_literal93=null;
        Token string_literal95=null;
        Token string_literal96=null;
        Token char_literal97=null;
        malice_grammarParser.lpar_return lpar57 =null;

        malice_grammarParser.bool_expr_return bool_expr58 =null;

        malice_grammarParser.rpar_return rpar59 =null;

        malice_grammarParser.statementList_return statementList61 =null;

        malice_grammarParser.lpar_return lpar64 =null;

        malice_grammarParser.bool_expr_return bool_expr65 =null;

        malice_grammarParser.rpar_return rpar66 =null;

        malice_grammarParser.statementList_return statementList68 =null;

        malice_grammarParser.statementList_return statementList70 =null;

        malice_grammarParser.lpar_return lpar77 =null;

        malice_grammarParser.bool_expr_return bool_expr78 =null;

        malice_grammarParser.rpar_return rpar79 =null;

        malice_grammarParser.statementList_return statementList81 =null;

        malice_grammarParser.statementList_return statementList83 =null;

        malice_grammarParser.lpar_return lpar90 =null;

        malice_grammarParser.bool_expr_return bool_expr91 =null;

        malice_grammarParser.rpar_return rpar92 =null;

        malice_grammarParser.statementList_return statementList94 =null;


        CommonTree string_literal56_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree string_literal73_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree char_literal97_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:4: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 44:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:104:8: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal56=(Token)match(input,54,FOLLOW_54_in_control_structure664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal56_tree = 
                    (CommonTree)adaptor.create(string_literal56)
                    ;
                    adaptor.addChild(root_0, string_literal56_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure666);
                    lpar57=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar57.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure668);
                    bool_expr58=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr58.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure670);
                    rpar59=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar59.getTree());

                    string_literal60=(Token)match(input,59,FOLLOW_59_in_control_structure672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal60_tree = 
                    (CommonTree)adaptor.create(string_literal60)
                    ;
                    adaptor.addChild(root_0, string_literal60_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure680);
                    statementList61=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList61.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:106:6: ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==53) ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1==49) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:106:7: 'or' 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal62=(Token)match(input,53,FOLLOW_53_in_control_structure689); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal62_tree = 
                    	    (CommonTree)adaptor.create(string_literal62)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal62_tree);
                    	    }

                    	    string_literal63=(Token)match(input,49,FOLLOW_49_in_control_structure691); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal63_tree = 
                    	    (CommonTree)adaptor.create(string_literal63)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal63_tree);
                    	    }

                    	    pushFollow(FOLLOW_lpar_in_control_structure693);
                    	    lpar64=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar64.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure695);
                    	    bool_expr65=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr65.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure697);
                    	    rpar66=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar66.getTree());

                    	    string_literal67=(Token)match(input,59,FOLLOW_59_in_control_structure699); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal67_tree = 
                    	    (CommonTree)adaptor.create(string_literal67)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal67_tree);
                    	    }

                    	    pushFollow(FOLLOW_statementList_in_control_structure701);
                    	    statementList68=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:107:6: ( 'or' statementList )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==53) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:107:7: 'or' statementList
                            {
                            string_literal69=(Token)match(input,53,FOLLOW_53_in_control_structure711); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal69_tree = 
                            (CommonTree)adaptor.create(string_literal69)
                            ;
                            adaptor.addChild(root_0, string_literal69_tree);
                            }

                            pushFollow(FOLLOW_statementList_in_control_structure713);
                            statementList70=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());

                            }
                            break;

                    }


                    string_literal71=(Token)match(input,37,FOLLOW_37_in_control_structure722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal71_tree = 
                    (CommonTree)adaptor.create(string_literal71)
                    ;
                    adaptor.addChild(root_0, string_literal71_tree);
                    }

                    string_literal72=(Token)match(input,29,FOLLOW_29_in_control_structure724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal72_tree = 
                    (CommonTree)adaptor.create(string_literal72)
                    ;
                    adaptor.addChild(root_0, string_literal72_tree);
                    }

                    string_literal73=(Token)match(input,66,FOLLOW_66_in_control_structure726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal73_tree = 
                    (CommonTree)adaptor.create(string_literal73)
                    ;
                    adaptor.addChild(root_0, string_literal73_tree);
                    }

                    string_literal74=(Token)match(input,65,FOLLOW_65_in_control_structure728); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = 
                    (CommonTree)adaptor.create(string_literal74)
                    ;
                    adaptor.addChild(root_0, string_literal74_tree);
                    }

                    string_literal75=(Token)match(input,68,FOLLOW_68_in_control_structure730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal75_tree = 
                    (CommonTree)adaptor.create(string_literal75)
                    ;
                    adaptor.addChild(root_0, string_literal75_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:109:8: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal76=(Token)match(input,42,FOLLOW_42_in_control_structure739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal76_tree = 
                    (CommonTree)adaptor.create(string_literal76)
                    ;
                    adaptor.addChild(root_0, string_literal76_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure741);
                    lpar77=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar77.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure743);
                    bool_expr78=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr78.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure745);
                    rpar79=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar79.getTree());

                    string_literal80=(Token)match(input,59,FOLLOW_59_in_control_structure747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal80_tree = 
                    (CommonTree)adaptor.create(string_literal80)
                    ;
                    adaptor.addChild(root_0, string_literal80_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure755);
                    statementList81=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList81.getTree());

                    string_literal82=(Token)match(input,53,FOLLOW_53_in_control_structure764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal82_tree = 
                    (CommonTree)adaptor.create(string_literal82)
                    ;
                    adaptor.addChild(root_0, string_literal82_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure766);
                    statementList83=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList83.getTree());

                    string_literal84=(Token)match(input,37,FOLLOW_37_in_control_structure774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal84_tree = 
                    (CommonTree)adaptor.create(string_literal84)
                    ;
                    adaptor.addChild(root_0, string_literal84_tree);
                    }

                    string_literal85=(Token)match(input,29,FOLLOW_29_in_control_structure776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal85_tree = 
                    (CommonTree)adaptor.create(string_literal85)
                    ;
                    adaptor.addChild(root_0, string_literal85_tree);
                    }

                    string_literal86=(Token)match(input,66,FOLLOW_66_in_control_structure778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal86_tree = 
                    (CommonTree)adaptor.create(string_literal86)
                    ;
                    adaptor.addChild(root_0, string_literal86_tree);
                    }

                    string_literal87=(Token)match(input,65,FOLLOW_65_in_control_structure780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal87_tree = 
                    (CommonTree)adaptor.create(string_literal87)
                    ;
                    adaptor.addChild(root_0, string_literal87_tree);
                    }

                    string_literal88=(Token)match(input,68,FOLLOW_68_in_control_structure782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal88_tree = 
                    (CommonTree)adaptor.create(string_literal88)
                    ;
                    adaptor.addChild(root_0, string_literal88_tree);
                    }

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:113:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times'
                    {
                    string_literal89=(Token)match(input,44,FOLLOW_44_in_control_structure797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal89_tree = 
                    (CommonTree)adaptor.create(string_literal89)
                    ;
                    adaptor.addChild(root_0, string_literal89_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure799);
                    lpar90=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar90.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure801);
                    bool_expr91=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr91.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure803);
                    rpar92=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar92.getTree());

                    string_literal93=(Token)match(input,37,FOLLOW_37_in_control_structure805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal93_tree = 
                    (CommonTree)adaptor.create(string_literal93)
                    ;
                    adaptor.addChild(root_0, string_literal93_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure813);
                    statementList94=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList94.getTree());

                    string_literal95=(Token)match(input,43,FOLLOW_43_in_control_structure821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal95_tree = 
                    (CommonTree)adaptor.create(string_literal95)
                    ;
                    adaptor.addChild(root_0, string_literal95_tree);
                    }

                    string_literal96=(Token)match(input,63,FOLLOW_63_in_control_structure823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = 
                    (CommonTree)adaptor.create(string_literal96)
                    ;
                    adaptor.addChild(root_0, string_literal96_tree);
                    }

                    }
                    break;

            }


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:6: ( '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred46_malice_grammar()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:6: '.'
                    {
                    char_literal97=(Token)match(input,21,FOLLOW_21_in_control_structure831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = 
                    (CommonTree)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:1: declaration_statements : IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT98=null;
        Token string_literal99=null;
        Token char_literal100=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token LETTER104=null;
        Token STRING105=null;
        Token string_literal107=null;
        malice_grammarParser.data_types_return data_types101 =null;

        malice_grammarParser.expr_return expr106 =null;

        malice_grammarParser.atom_return atom108 =null;

        malice_grammarParser.data_types_return data_types109 =null;


        CommonTree IDENT98_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree LETTER104_tree=null;
        CommonTree STRING105_tree=null;
        CommonTree string_literal107_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:24: ( IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:26: IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT98=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements846); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT98_tree = 
            (CommonTree)adaptor.create(IDENT98)
            ;
            adaptor.addChild(root_0, IDENT98_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:32: ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:34: 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal99=(Token)match(input,66,FOLLOW_66_in_declaration_statements850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal99_tree = 
                    (CommonTree)adaptor.create(string_literal99)
                    ;
                    adaptor.addChild(root_0, string_literal99_tree);
                    }

                    char_literal100=(Token)match(input,33,FOLLOW_33_in_declaration_statements852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = 
                    (CommonTree)adaptor.create(char_literal100)
                    ;
                    adaptor.addChild(root_0, char_literal100_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_declaration_statements854);
                    data_types101=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types101.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:55: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt21=3;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==64) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==51) ) {
                        alt21=2;
                    }
                    switch (alt21) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:57: 'too'
                            {
                            string_literal102=(Token)match(input,64,FOLLOW_64_in_declaration_statements858); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (CommonTree)adaptor.create(string_literal102)
                            ;
                            adaptor.addChild(root_0, string_literal102_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:65: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal103=(Token)match(input,51,FOLLOW_51_in_declaration_statements862); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (CommonTree)adaptor.create(string_literal103)
                            ;
                            adaptor.addChild(root_0, string_literal103_tree);
                            }

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:70: ( LETTER | STRING | expr )
                            int alt20=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt20=1;
                                }
                                break;
                            case STRING:
                                {
                                alt20=2;
                                }
                                break;
                            case IDENT:
                            case NUMBER:
                            case 10:
                            case 15:
                            case 18:
                            case 20:
                            case 71:
                                {
                                alt20=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 0, input);

                                throw nvae;

                            }

                            switch (alt20) {
                                case 1 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:71: LETTER
                                    {
                                    LETTER104=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements865); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER104_tree = 
                                    (CommonTree)adaptor.create(LETTER104)
                                    ;
                                    adaptor.addChild(root_0, LETTER104_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:80: STRING
                                    {
                                    STRING105=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements869); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING105_tree = 
                                    (CommonTree)adaptor.create(STRING105)
                                    ;
                                    adaptor.addChild(root_0, STRING105_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:89: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements873);
                                    expr106=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr106.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:122:35: 'had' atom data_types
                    {
                    string_literal107=(Token)match(input,46,FOLLOW_46_in_declaration_statements913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal107_tree = 
                    (CommonTree)adaptor.create(string_literal107)
                    ;
                    adaptor.addChild(root_0, string_literal107_tree);
                    }

                    pushFollow(FOLLOW_atom_in_declaration_statements915);
                    atom108=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom108.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements917);
                    data_types109=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types109.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER111=null;
        Token STRING112=null;
        malice_grammarParser.expr_return expr110 =null;

        malice_grammarParser.array_elem_return array_elem113 =null;


        CommonTree LETTER111_tree=null;
        CommonTree STRING112_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:9: ( expr | LETTER | STRING | array_elem )
            int alt23=4;
            switch ( input.LA(1) ) {
            case NUMBER:
            case 10:
            case 15:
            case 18:
            case 20:
            case 71:
                {
                alt23=1;
                }
                break;
            case IDENT:
                {
                int LA23_3 = input.LA(2);

                if ( (synpred52_malice_grammar()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;

                }
                }
                break;
            case LETTER:
                {
                alt23=2;
                }
                break;
            case STRING:
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_argument983);
                    expr110=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER111=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER111_tree = 
                    (CommonTree)adaptor.create(LETTER111)
                    ;
                    adaptor.addChild(root_0, LETTER111_tree);
                    }

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING112=(Token)match(input,STRING,FOLLOW_STRING_in_argument991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING112_tree = 
                    (CommonTree)adaptor.create(STRING112)
                    ;
                    adaptor.addChild(root_0, STRING112_tree);
                    }

                    }
                    break;
                case 4 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument995);
                    array_elem113=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem113.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal115=null;
        malice_grammarParser.argument_return argument114 =null;

        malice_grammarParser.argument_return argument116 =null;

        malice_grammarParser.function_call_return function_call117 =null;


        CommonTree char_literal115_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LETTER||(LA26_0 >= NUMBER && LA26_0 <= STRING)||LA26_0==10||(LA26_0 >= 15 && LA26_0 <= 16)||LA26_0==18||LA26_0==20||LA26_0==71) ) {
                alt26=1;
            }
            else if ( (LA26_0==IDENT) ) {
                int LA26_3 = input.LA(2);

                if ( (synpred57_malice_grammar()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( argument ( ',' argument )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0 >= IDENT && LA25_0 <= LETTER)||(LA25_0 >= NUMBER && LA25_0 <= STRING)||LA25_0==10||LA25_0==15||LA25_0==18||LA25_0==20||LA25_0==71) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions1003);
                            argument114=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument114.getTree());

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:36: ( ',' argument )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==19) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:37: ',' argument
                            	    {
                            	    char_literal115=(Token)match(input,19,FOLLOW_19_in_arguments_to_functions1006); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal115_tree = 
                            	    (CommonTree)adaptor.create(char_literal115)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal115_tree);
                            	    }

                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions1008);
                            	    argument116=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument116.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:56: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions1016);
                    function_call117=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call117.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | read_statement );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set120=null;
        Token IDENT122=null;
        Token string_literal123=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token LETTER128=null;
        Token STRING129=null;
        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        Token LETTER135=null;
        Token STRING136=null;
        malice_grammarParser.expr_return expr118 =null;

        malice_grammarParser.print_return print119 =null;

        malice_grammarParser.print_return print121 =null;

        malice_grammarParser.expr_return expr124 =null;

        malice_grammarParser.expr_return expr127 =null;

        malice_grammarParser.expr_return expr134 =null;

        malice_grammarParser.read_statement_return read_statement137 =null;


        CommonTree set120_tree=null;
        CommonTree IDENT122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree LETTER128_tree=null;
        CommonTree STRING129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree string_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree LETTER135_tree=null;
        CommonTree STRING136_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | read_statement )
            int alt31=5;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18||LA31_0==20||LA31_0==71) && (synpred58_malice_grammar())) {
                alt31=1;
            }
            else if ( (LA31_0==10) && (synpred58_malice_grammar())) {
                alt31=1;
            }
            else if ( (LA31_0==IDENT) ) {
                int LA31_3 = input.LA(2);

                if ( (synpred58_malice_grammar()) ) {
                    alt31=1;
                }
                else if ( (synpred66_malice_grammar()) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA31_0==NUMBER) && (synpred58_malice_grammar())) {
                alt31=1;
            }
            else if ( (LA31_0==15) && (synpred58_malice_grammar())) {
                alt31=1;
            }
            else if ( (LA31_0==LETTER||LA31_0==STRING) ) {
                alt31=2;
            }
            else if ( (LA31_0==29) ) {
                alt31=4;
            }
            else if ( (LA31_0==67) ) {
                alt31=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:38: ( expr print )
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:39: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1035);
                    expr118=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

                    pushFollow(FOLLOW_print_in_rest_statements1037);
                    print119=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print119.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:9: ( LETTER | STRING ) print
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set120=(Token)input.LT(1);

                    if ( input.LA(1)==LETTER||input.LA(1)==STRING ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set120)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_print_in_rest_statements1062);
                    print121=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print121.getTree());

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT122_tree = 
                    (CommonTree)adaptor.create(IDENT122)
                    ;
                    adaptor.addChild(root_0, IDENT122_tree);
                    }

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    {
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:11: ( '\\'s' expr 'piece' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:12: '\\'s' expr 'piece'
                            {
                            string_literal123=(Token)match(input,31,FOLLOW_31_in_rest_statements1084); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal123_tree = 
                            (CommonTree)adaptor.create(string_literal123)
                            ;
                            adaptor.addChild(root_0, string_literal123_tree);
                            }

                            pushFollow(FOLLOW_expr_in_rest_statements1086);
                            expr124=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());

                            string_literal125=(Token)match(input,55,FOLLOW_55_in_rest_statements1088); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal125_tree = 
                            (CommonTree)adaptor.create(string_literal125)
                            ;
                            adaptor.addChild(root_0, string_literal125_tree);
                            }

                            }
                            break;

                    }


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt29=1;
                        }
                        break;
                    case 35:
                        {
                        alt29=2;
                        }
                        break;
                    case 41:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }

                    switch (alt29) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:18: 'became' ( expr | LETTER | STRING )
                            {
                            string_literal126=(Token)match(input,36,FOLLOW_36_in_rest_statements1109); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal126_tree = 
                            (CommonTree)adaptor.create(string_literal126)
                            ;
                            adaptor.addChild(root_0, string_literal126_tree);
                            }

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:28: ( expr | LETTER | STRING )
                            int alt28=3;
                            switch ( input.LA(1) ) {
                            case IDENT:
                            case NUMBER:
                            case 10:
                            case 15:
                            case 18:
                            case 20:
                            case 71:
                                {
                                alt28=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt28=2;
                                }
                                break;
                            case STRING:
                                {
                                alt28=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;

                            }

                            switch (alt28) {
                                case 1 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1113);
                                    expr127=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:36: LETTER
                                    {
                                    LETTER128=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1117); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER128_tree = 
                                    (CommonTree)adaptor.create(LETTER128)
                                    ;
                                    adaptor.addChild(root_0, LETTER128_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:45: STRING
                                    {
                                    STRING129=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1121); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING129_tree = 
                                    (CommonTree)adaptor.create(STRING129)
                                    ;
                                    adaptor.addChild(root_0, STRING129_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:133:18: 'ate'
                            {
                            string_literal130=(Token)match(input,35,FOLLOW_35_in_rest_statements1142); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal130_tree = 
                            (CommonTree)adaptor.create(string_literal130)
                            ;
                            adaptor.addChild(root_0, string_literal130_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:134:18: 'drank'
                            {
                            string_literal131=(Token)match(input,41,FOLLOW_41_in_rest_statements1162); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal131_tree = 
                            (CommonTree)adaptor.create(string_literal131)
                            ;
                            adaptor.addChild(root_0, string_literal131_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:7: 'Alice' 'found' ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal132=(Token)match(input,29,FOLLOW_29_in_rest_statements1216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal132_tree = 
                    (CommonTree)adaptor.create(string_literal132)
                    ;
                    adaptor.addChild(root_0, string_literal132_tree);
                    }

                    string_literal133=(Token)match(input,45,FOLLOW_45_in_rest_statements1218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal133_tree = 
                    (CommonTree)adaptor.create(string_literal133)
                    ;
                    adaptor.addChild(root_0, string_literal133_tree);
                    }

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:23: ( expr | LETTER | STRING )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUMBER:
                    case 10:
                    case 15:
                    case 18:
                    case 20:
                    case 71:
                        {
                        alt30=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt30=2;
                        }
                        break;
                    case STRING:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }

                    switch (alt30) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1221);
                            expr134=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());

                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:31: LETTER
                            {
                            LETTER135=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1225); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER135_tree = 
                            (CommonTree)adaptor.create(LETTER135)
                            ;
                            adaptor.addChild(root_0, LETTER135_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:40: STRING
                            {
                            STRING136=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1229); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING136_tree = 
                            (CommonTree)adaptor.create(STRING136)
                            ;
                            adaptor.addChild(root_0, STRING136_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:140:7: read_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_read_statement_in_rest_statements1239);
                    read_statement137=read_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement137.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rest_statements"


    public static class read_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read_statement"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:1: read_statement : 'what' 'was' ( IDENT | array_elem ) '?' ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal138=null;
        Token string_literal139=null;
        Token IDENT140=null;
        Token char_literal142=null;
        malice_grammarParser.array_elem_return array_elem141 =null;


        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree IDENT140_tree=null;
        CommonTree char_literal142_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:16: ( 'what' 'was' ( IDENT | array_elem ) '?' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:18: 'what' 'was' ( IDENT | array_elem ) '?'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal138=(Token)match(input,67,FOLLOW_67_in_read_statement1256); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal138_tree = 
            (CommonTree)adaptor.create(string_literal138)
            ;
            adaptor.addChild(root_0, string_literal138_tree);
            }

            string_literal139=(Token)match(input,66,FOLLOW_66_in_read_statement1258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal139_tree = 
            (CommonTree)adaptor.create(string_literal139)
            ;
            adaptor.addChild(root_0, string_literal139_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:31: ( IDENT | array_elem )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==31) ) {
                    alt32=2;
                }
                else if ( (LA32_1==28) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:32: IDENT
                    {
                    IDENT140=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT140_tree = 
                    (CommonTree)adaptor.create(IDENT140)
                    ;
                    adaptor.addChild(root_0, IDENT140_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:40: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1265);
                    array_elem141=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem141.getTree());

                    }
                    break;

            }


            char_literal142=(Token)match(input,28,FOLLOW_28_in_read_statement1268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal142_tree = 
            (CommonTree)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read_statement"


    public static class print_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:1: print : ( 'spoke' | 'said' 'Alice' );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;

        CommonTree string_literal143_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:6: ( 'spoke' | 'said' 'Alice' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                alt33=1;
            }
            else if ( (LA33_0==57) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:146:5: 'spoke'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal143=(Token)match(input,61,FOLLOW_61_in_print1281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = 
                    (CommonTree)adaptor.create(string_literal143)
                    ;
                    adaptor.addChild(root_0, string_literal143_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:146:15: 'said' 'Alice'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal144=(Token)match(input,57,FOLLOW_57_in_print1285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal144_tree = 
                    (CommonTree)adaptor.create(string_literal144)
                    ;
                    adaptor.addChild(root_0, string_literal144_tree);
                    }

                    string_literal145=(Token)match(input,29,FOLLOW_29_in_print1287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal145_tree = 
                    (CommonTree)adaptor.create(string_literal145)
                    ;
                    adaptor.addChild(root_0, string_literal145_tree);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name146 =null;

        malice_grammarParser.lpar_return lpar147 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions148 =null;

        malice_grammarParser.rpar_return rpar149 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:15: ( function_name lpar arguments_to_functions rpar )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call1302);
            function_name146=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name146.getTree());

            pushFollow(FOLLOW_lpar_in_function_call1304);
            lpar147=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar147.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1306);
            arguments_to_functions148=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions148.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1308);
            rpar149=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar149.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements150 =null;

        malice_grammarParser.function_call_return function_call151 =null;

        malice_grammarParser.declaration_statements_return declaration_statements152 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:11: ( rest_statements | function_call | declaration_statements )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LETTER||(LA34_0 >= NUMBER && LA34_0 <= STRING)||LA34_0==10||LA34_0==15||LA34_0==18||LA34_0==20||LA34_0==29||LA34_0==67||LA34_0==71) ) {
                alt34=1;
            }
            else if ( (LA34_0==IDENT) ) {
                int LA34_3 = input.LA(2);

                if ( (synpred72_malice_grammar()) ) {
                    alt34=1;
                }
                else if ( (synpred73_malice_grammar()) ) {
                    alt34=2;
                }
                else if ( (true) ) {
                    alt34=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rest_statements_in_statement1316);
                    rest_statements150=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements150.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_statement1320);
                    function_call151=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call151.getTree());

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:46: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1323);
                    declaration_statements152=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements152.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:1: statement_conjunctions : ( ',' | 'and' | 'then' | 'but' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set153=null;

        CommonTree set153_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:153:24: ( ',' | 'and' | 'then' | 'but' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set153=(Token)input.LT(1);

            if ( input.LA(1)==19||input.LA(1)==34||input.LA(1)==38||input.LA(1)==62 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set153)
                );
                state.errorRecovery=false;
                state.failed=false;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:1: statementList : ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal157=null;
        malice_grammarParser.statement_return statement154 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions155 =null;

        malice_grammarParser.statement_return statement156 =null;

        malice_grammarParser.control_structure_return control_structure158 =null;

        malice_grammarParser.nested_function_return nested_function159 =null;

        malice_grammarParser.read_statement_return read_statement160 =null;

        malice_grammarParser.function_return function161 =null;


        CommonTree char_literal157_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:15: ( ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:17: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:17: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )*
            loop37:
            do {
                int alt37=6;
                switch ( input.LA(1) ) {
                case IDENT:
                case LETTER:
                case NUMBER:
                case STRING:
                case 10:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 29:
                case 34:
                case 38:
                case 62:
                case 71:
                    {
                    alt37=1;
                    }
                    break;
                case 67:
                    {
                    int LA37_13 = input.LA(2);

                    if ( (synpred79_malice_grammar()) ) {
                        alt37=1;
                    }
                    else if ( (synpred82_malice_grammar()) ) {
                        alt37=4;
                    }


                    }
                    break;
                case 42:
                case 44:
                case 54:
                    {
                    alt37=2;
                    }
                    break;
                case 52:
                    {
                    alt37=3;
                    }
                    break;
                case 30:
                    {
                    alt37=5;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
            	    {
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: ( statement )? ( statement_conjunctions statement )* '.'
            	    {
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: ( statement )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0 >= IDENT && LA35_0 <= LETTER)||(LA35_0 >= NUMBER && LA35_0 <= STRING)||LA35_0==10||LA35_0==15||LA35_0==18||LA35_0==20||LA35_0==29||LA35_0==67||LA35_0==71) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1365);
            	            statement154=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement154.getTree());

            	            }
            	            break;

            	    }


            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:30: ( statement_conjunctions statement )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==19||LA36_0==34||LA36_0==38||LA36_0==62) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:31: statement_conjunctions statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1369);
            	    	    statement_conjunctions155=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions155.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1371);
            	    	    statement156=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement156.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);


            	    char_literal157=(Token)match(input,21,FOLLOW_21_in_statementList1375); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal157_tree = 
            	    (CommonTree)adaptor.create(char_literal157)
            	    ;
            	    adaptor.addChild(root_0, char_literal157_tree);
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:73: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1380);
            	    control_structure158=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure158.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:93: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1384);
            	    nested_function159=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function159.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:111: read_statement
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1388);
            	    read_statement160=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement160.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:164:10: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1402);
            	    function161=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function161.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:167:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal162=null;
        Token IDENT164=null;
        malice_grammarParser.data_types_return data_types163 =null;


        CommonTree string_literal162_tree=null;
        CommonTree IDENT164_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:167:11: ( ( 'spider' )? data_types IDENT )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:167:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:167:13: ( 'spider' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:167:14: 'spider'
                    {
                    string_literal162=(Token)match(input,60,FOLLOW_60_in_parameter1414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal162_tree = 
                    (CommonTree)adaptor.create(string_literal162)
                    ;
                    adaptor.addChild(root_0, string_literal162_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1418);
            data_types163=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types163.getTree());

            IDENT164=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT164_tree = 
            (CommonTree)adaptor.create(IDENT164)
            ;
            adaptor.addChild(root_0, IDENT164_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal166=null;
        malice_grammarParser.parameter_return parameter165 =null;

        malice_grammarParser.parameter_return parameter167 =null;


        CommonTree char_literal166_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:12: ( ( parameter ( ',' parameter )* )? )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:14: ( parameter ( ',' parameter )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47||LA40_0==50||LA40_0==58||LA40_0==60) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1431);
                    parameter165=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter165.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:25: ( ',' parameter )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==19) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:27: ',' parameter
                    	    {
                    	    char_literal166=(Token)match(input,19,FOLLOW_19_in_parameters1435); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal166_tree = 
                    	    (CommonTree)adaptor.create(char_literal166)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal166_tree);
                    	    }

                    	    pushFollow(FOLLOW_parameter_in_parameters1437);
                    	    parameter167=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter167.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:171:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT168=null;

        CommonTree IDENT168_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:171:15: ( IDENT )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:171:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1449); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT168_tree = 
            (CommonTree)adaptor.create(IDENT168)
            ;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal169=null;
        Token string_literal171=null;
        malice_grammarParser.statementList_return statementList170 =null;


        CommonTree string_literal169_tree=null;
        CommonTree string_literal171_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:17: ( 'opened' statementList 'closed' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal169=(Token)match(input,52,FOLLOW_52_in_nested_function1457); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal169_tree = 
            (CommonTree)adaptor.create(string_literal169)
            ;
            adaptor.addChild(root_0, string_literal169_tree);
            }

            pushFollow(FOLLOW_statementList_in_nested_function1459);
            statementList170=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList170.getTree());

            string_literal171=(Token)match(input,39,FOLLOW_39_in_nested_function1461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal171_tree = 
            (CommonTree)adaptor.create(string_literal171)
            ;
            adaptor.addChild(root_0, string_literal171_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:1: function : 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal178=null;
        Token string_literal183=null;
        Token char_literal184=null;
        Token string_literal186=null;
        Token string_literal188=null;
        malice_grammarParser.function_name_return function_name174 =null;

        malice_grammarParser.lpar_return lpar175 =null;

        malice_grammarParser.parameters_return parameters176 =null;

        malice_grammarParser.rpar_return rpar177 =null;

        malice_grammarParser.function_name_return function_name179 =null;

        malice_grammarParser.lpar_return lpar180 =null;

        malice_grammarParser.parameters_return parameters181 =null;

        malice_grammarParser.rpar_return rpar182 =null;

        malice_grammarParser.data_types_return data_types185 =null;

        malice_grammarParser.statementList_return statementList187 =null;


        CommonTree string_literal172_tree=null;
        CommonTree string_literal173_tree=null;
        CommonTree string_literal178_tree=null;
        CommonTree string_literal183_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree string_literal188_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal172=(Token)match(input,30,FOLLOW_30_in_function1468); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal172_tree = 
            (CommonTree)adaptor.create(string_literal172)
            ;
            adaptor.addChild(root_0, string_literal172_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            else if ( (LA41_0==56) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal173=(Token)match(input,48,FOLLOW_48_in_function1474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal173_tree = 
                    (CommonTree)adaptor.create(string_literal173)
                    ;
                    adaptor.addChild(root_0, string_literal173_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1476);
                    function_name174=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name174.getTree());

                    pushFollow(FOLLOW_lpar_in_function1478);
                    lpar175=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar175.getTree());

                    pushFollow(FOLLOW_parameters_in_function1480);
                    parameters176=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters176.getTree());

                    pushFollow(FOLLOW_rpar_in_function1482);
                    rpar177=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar177.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:175:17: 'room' function_name lpar parameters rpar 'contained' 'a' data_types
                    {
                    string_literal178=(Token)match(input,56,FOLLOW_56_in_function1500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal178_tree = 
                    (CommonTree)adaptor.create(string_literal178)
                    ;
                    adaptor.addChild(root_0, string_literal178_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1502);
                    function_name179=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name179.getTree());

                    pushFollow(FOLLOW_lpar_in_function1504);
                    lpar180=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar180.getTree());

                    pushFollow(FOLLOW_parameters_in_function1506);
                    parameters181=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters181.getTree());

                    pushFollow(FOLLOW_rpar_in_function1508);
                    rpar182=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar182.getTree());

                    string_literal183=(Token)match(input,40,FOLLOW_40_in_function1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal183_tree = 
                    (CommonTree)adaptor.create(string_literal183)
                    ;
                    adaptor.addChild(root_0, string_literal183_tree);
                    }

                    char_literal184=(Token)match(input,33,FOLLOW_33_in_function1512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal184_tree = 
                    (CommonTree)adaptor.create(char_literal184)
                    ;
                    adaptor.addChild(root_0, char_literal184_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_function1514);
                    data_types185=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types185.getTree());

                    }
                    break;

            }


            string_literal186=(Token)match(input,52,FOLLOW_52_in_function1535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal186_tree = 
            (CommonTree)adaptor.create(string_literal186)
            ;
            adaptor.addChild(root_0, string_literal186_tree);
            }

            pushFollow(FOLLOW_statementList_in_function1542);
            statementList187=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList187.getTree());

            string_literal188=(Token)match(input,39,FOLLOW_39_in_function1549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal188_tree = 
            (CommonTree)adaptor.create(string_literal188)
            ;
            adaptor.addChild(root_0, string_literal188_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal192=null;
        malice_grammarParser.declaration_statements_return declaration_statements189 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions190 =null;

        malice_grammarParser.declaration_statements_return declaration_statements191 =null;


        CommonTree char_literal192_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==IDENT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1563);
            	    declaration_statements189=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements189.getTree());

            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:46: ( statement_conjunctions declaration_statements )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==19||LA42_0==34||LA42_0==38||LA42_0==62) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1566);
            	    	    statement_conjunctions190=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions190.getTree());

            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1568);
            	    	    declaration_statements191=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements191.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);


            	    char_literal192=(Token)match(input,21,FOLLOW_21_in_global_declaration1572); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal192_tree = 
            	    (CommonTree)adaptor.create(char_literal192)
            	    ;
            	    adaptor.addChild(root_0, char_literal192_tree);
            	    }

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:182:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF195=null;
        malice_grammarParser.global_declaration_return global_declaration193 =null;

        malice_grammarParser.function_return function194 =null;


        CommonTree EOF195_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:182:9: ( global_declaration ( function )+ EOF )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:182:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_global_declaration_in_program1583);
            global_declaration193=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration193.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:182:30: ( function )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:182:30: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1585);
            	    function194=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function194.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            EOF195=(Token)match(input,EOF,FOLLOW_EOF_in_program1588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF195_tree = 
            (CommonTree)adaptor.create(EOF195)
            ;
            adaptor.addChild(root_0, EOF195_tree);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"

    // $ANTLR start synpred46_malice_grammar
    public final void synpred46_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:6: ( '.' )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:116:6: '.'
        {
        match(input,21,FOLLOW_21_in_synpred46_malice_grammar831); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred46_malice_grammar

    // $ANTLR start synpred52_malice_grammar
    public final void synpred52_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: ( expr )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred52_malice_grammar983);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_malice_grammar

    // $ANTLR start synpred57_malice_grammar
    public final void synpred57_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( ( argument ( ',' argument )* )? )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( argument ( ',' argument )* )?
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:26: ( argument ( ',' argument )* )?
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( ((LA53_0 >= IDENT && LA53_0 <= LETTER)||(LA53_0 >= NUMBER && LA53_0 <= STRING)||LA53_0==10||LA53_0==15||LA53_0==18||LA53_0==20||LA53_0==71) ) {
            alt53=1;
        }
        switch (alt53) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred57_malice_grammar1003);
                argument();

                state._fsp--;
                if (state.failed) return ;

                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:36: ( ',' argument )*
                loop52:
                do {
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==19) ) {
                        alt52=1;
                    }


                    switch (alt52) {
                	case 1 :
                	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:37: ',' argument
                	    {
                	    match(input,19,FOLLOW_19_in_synpred57_malice_grammar1006); if (state.failed) return ;

                	    pushFollow(FOLLOW_argument_in_synpred57_malice_grammar1008);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop52;
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
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:21: ( expr print )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred58_malice_grammar1026);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_print_in_synpred58_malice_grammar1028);
        print();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_malice_grammar

    // $ANTLR start synpred66_malice_grammar
    public final void synpred66_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:8: ( IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred66_malice_grammar1071); if (state.failed) return ;

        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:11: ( '\\'s' expr 'piece' )?
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==31) ) {
            alt55=1;
        }
        switch (alt55) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:12: '\\'s' expr 'piece'
                {
                match(input,31,FOLLOW_31_in_synpred66_malice_grammar1084); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred66_malice_grammar1086);
                expr();

                state._fsp--;
                if (state.failed) return ;

                match(input,55,FOLLOW_55_in_synpred66_malice_grammar1088); if (state.failed) return ;

                }
                break;

        }


        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        int alt57=3;
        switch ( input.LA(1) ) {
        case 36:
            {
            alt57=1;
            }
            break;
        case 35:
            {
            alt57=2;
            }
            break;
        case 41:
            {
            alt57=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 57, 0, input);

            throw nvae;

        }

        switch (alt57) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:18: 'became' ( expr | LETTER | STRING )
                {
                match(input,36,FOLLOW_36_in_synpred66_malice_grammar1109); if (state.failed) return ;

                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:28: ( expr | LETTER | STRING )
                int alt56=3;
                switch ( input.LA(1) ) {
                case IDENT:
                case NUMBER:
                case 10:
                case 15:
                case 18:
                case 20:
                case 71:
                    {
                    alt56=1;
                    }
                    break;
                case LETTER:
                    {
                    alt56=2;
                    }
                    break;
                case STRING:
                    {
                    alt56=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 0, input);

                    throw nvae;

                }

                switch (alt56) {
                    case 1 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:29: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred66_malice_grammar1113);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:36: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred66_malice_grammar1117); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:45: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred66_malice_grammar1121); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:133:18: 'ate'
                {
                match(input,35,FOLLOW_35_in_synpred66_malice_grammar1142); if (state.failed) return ;

                }
                break;
            case 3 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:134:18: 'drank'
                {
                match(input,41,FOLLOW_41_in_synpred66_malice_grammar1162); if (state.failed) return ;

                }
                break;

        }


        }


        }

    }
    // $ANTLR end synpred66_malice_grammar

    // $ANTLR start synpred72_malice_grammar
    public final void synpred72_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:13: ( rest_statements )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred72_malice_grammar1316);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred72_malice_grammar

    // $ANTLR start synpred73_malice_grammar
    public final void synpred73_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:31: ( function_call )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:151:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred73_malice_grammar1320);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred73_malice_grammar

    // $ANTLR start synpred79_malice_grammar
    public final void synpred79_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:18: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: ( statement )? ( statement_conjunctions statement )* '.'
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: ( statement )?
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( ((LA59_0 >= IDENT && LA59_0 <= LETTER)||(LA59_0 >= NUMBER && LA59_0 <= STRING)||LA59_0==10||LA59_0==15||LA59_0==18||LA59_0==20||LA59_0==29||LA59_0==67||LA59_0==71) ) {
            alt59=1;
        }
        switch (alt59) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:19: statement
                {
                pushFollow(FOLLOW_statement_in_synpred79_malice_grammar1365);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:30: ( statement_conjunctions statement )*
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19||LA60_0==34||LA60_0==38||LA60_0==62) ) {
                alt60=1;
            }


            switch (alt60) {
        	case 1 :
        	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:31: statement_conjunctions statement
        	    {
        	    pushFollow(FOLLOW_statement_conjunctions_in_synpred79_malice_grammar1369);
        	    statement_conjunctions();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    pushFollow(FOLLOW_statement_in_synpred79_malice_grammar1371);
        	    statement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop60;
            }
        } while (true);


        match(input,21,FOLLOW_21_in_synpred79_malice_grammar1375); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred79_malice_grammar

    // $ANTLR start synpred82_malice_grammar
    public final void synpred82_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:111: ( read_statement )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:111: read_statement
        {
        pushFollow(FOLLOW_read_statement_in_synpred82_malice_grammar1388);
        read_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_malice_grammar

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
    public final boolean synpred79_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred82_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_malice_grammar_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_STRING_in_rule68 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_15_in_lpar223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rpar230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_mono_op238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem308 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_array_elem310 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_array_elem312 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_array_elem314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom320 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_atom323 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_atom325 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term413 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_term415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_term417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_bool_neg426 = new BitSet(new long[]{0x0000000000008490L});
    public static final BitSet FOLLOW_term_in_bool_neg430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_neg_in_unary_op450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult457 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_set_in_mult460 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_unary_op_in_mult472 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_mult_in_add482 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_set_in_add485 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_mult_in_add493 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_add_in_bool_comp503 = new BitSet(new long[]{0x000000000D800002L});
    public static final BitSet FOLLOW_set_in_bool_comp506 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_add_in_bool_comp522 = new BitSet(new long[]{0x000000000D800002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq532 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_set_in_bool_eq535 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq543 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and553 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_bitw_and556 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_eq_in_bitw_and558 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor568 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_bitw_xor571 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor573 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_bitw_or586 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and598 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_bool_and601 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bitw_or_in_bool_and603 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bool_and_in_bool_or613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_bool_or616 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_and_in_bool_or618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_bool_or_in_expr629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_bool_expr638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_control_structure664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure666 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure668 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure670 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure672 = new BitSet(new long[]{0x40701464603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure680 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_53_in_control_structure689 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_control_structure691 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure693 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure695 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure697 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure699 = new BitSet(new long[]{0x40701464603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure701 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_53_in_control_structure711 = new BitSet(new long[]{0x40501464603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure713 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure722 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_control_structure724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_control_structure726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_control_structure728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_control_structure730 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_42_in_control_structure739 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure741 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure743 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure745 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure747 = new BitSet(new long[]{0x40701444603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure755 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_control_structure764 = new BitSet(new long[]{0x40501464603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure766 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure774 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_control_structure776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_control_structure778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_control_structure780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_control_structure782 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_44_in_control_structure797 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure799 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure803 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure805 = new BitSet(new long[]{0x40501C44603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure813 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure821 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_control_structure823 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_control_structure831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements846 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_declaration_statements850 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_declaration_statements852 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements854 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_declaration_statements858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declaration_statements862 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_declaration_statements913 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_atom_in_declaration_statements915 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1003 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_arguments_to_functions1006 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions1008 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1035 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1054 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1071 = new BitSet(new long[]{0x0000021880000000L});
    public static final BitSet FOLLOW_31_in_rest_statements1084 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1086 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rest_statements1088 = new BitSet(new long[]{0x0000021800000000L});
    public static final BitSet FOLLOW_36_in_rest_statements1109 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rest_statements1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rest_statements1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rest_statements1216 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rest_statements1218 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_statement_in_rest_statements1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_read_statement1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_read_statement1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1261 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1265 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_read_statement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_print1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_print1285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_print1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function_call1304 = new BitSet(new long[]{0x00000000001585B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1306 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function_call1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1365 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1369 = new BitSet(new long[]{0x00000000201485B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statement_in_statementList1371 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_statementList1375 = new BitSet(new long[]{0x40501444603C85B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_control_structure_in_statementList1380 = new BitSet(new long[]{0x40501444603C85B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_nested_function_in_statementList1384 = new BitSet(new long[]{0x40501444603C85B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_read_statement_in_statementList1388 = new BitSet(new long[]{0x40501444603C85B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_function_in_statementList1402 = new BitSet(new long[]{0x40501444603C85B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_60_in_parameter1414 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1431 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_parameters1435 = new BitSet(new long[]{0x1404800000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1437 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_nested_function1457 = new BitSet(new long[]{0x405014C4603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_nested_function1459 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_nested_function1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_function1468 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_function1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function1478 = new BitSet(new long[]{0x1404800000010000L});
    public static final BitSet FOLLOW_parameters_in_function1480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function1482 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56_in_function1500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function1504 = new BitSet(new long[]{0x1404800000010000L});
    public static final BitSet FOLLOW_parameters_in_function1506 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function1508 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_function1510 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_function1512 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_function1514 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function1535 = new BitSet(new long[]{0x405014C4603C85B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_function1542 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1563 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1568 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_global_declaration1572 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_global_declaration_in_program1583 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_in_program1585 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EOF_in_program1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred46_malice_grammar831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_malice_grammar983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred57_malice_grammar1003 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_synpred57_malice_grammar1006 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_synpred57_malice_grammar1008 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expr_in_synpred58_malice_grammar1026 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_synpred58_malice_grammar1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred66_malice_grammar1071 = new BitSet(new long[]{0x0000021880000000L});
    public static final BitSet FOLLOW_31_in_synpred66_malice_grammar1084 = new BitSet(new long[]{0x0000000000148490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred66_malice_grammar1086 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred66_malice_grammar1088 = new BitSet(new long[]{0x0000021800000000L});
    public static final BitSet FOLLOW_36_in_synpred66_malice_grammar1109 = new BitSet(new long[]{0x00000000001485B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred66_malice_grammar1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred66_malice_grammar1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred66_malice_grammar1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred66_malice_grammar1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred66_malice_grammar1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred72_malice_grammar1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred73_malice_grammar1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred79_malice_grammar1365 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred79_malice_grammar1369 = new BitSet(new long[]{0x00000000201485B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statement_in_synpred79_malice_grammar1371 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_synpred79_malice_grammar1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_statement_in_synpred82_malice_grammar1388 = new BitSet(new long[]{0x0000000000000002L});

}