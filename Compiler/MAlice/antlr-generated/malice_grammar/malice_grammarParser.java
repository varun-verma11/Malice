// $ANTLR 3.4 /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g 2012-11-23 10:37:53

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


    public static class unary_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_op"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:1: unary_op : ( '~' | '-' )* term ;
    public final malice_grammarParser.unary_op_return unary_op() throws RecognitionException {
        malice_grammarParser.unary_op_return retval = new malice_grammarParser.unary_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set23=null;
        malice_grammarParser.term_return term24 =null;


        CommonTree set23_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:10: ( ( '~' | '-' )* term )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:12: ( '~' | '-' )* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:75:12: ( '~' | '-' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20||LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            	    {
            	    set23=(Token)input.LT(1);

            	    if ( input.LA(1)==20||input.LA(1)==71 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set23)
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
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary_op434);
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
    // $ANTLR end "unary_op"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
    public final malice_grammarParser.mult_return mult() throws RecognitionException {
        malice_grammarParser.mult_return retval = new malice_grammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set26=null;
        malice_grammarParser.unary_op_return unary_op25 =null;

        malice_grammarParser.unary_op_return unary_op27 =null;


        CommonTree set26_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_op_in_mult441);
            unary_op25=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op25.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==17||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:76:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    set26=(Token)input.LT(1);

            	    if ( input.LA(1)==12||input.LA(1)==17||input.LA(1)==22 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set26)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_op_in_mult456);
            	    unary_op27=unary_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op27.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final malice_grammarParser.add_return add() throws RecognitionException {
        malice_grammarParser.add_return retval = new malice_grammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;
        malice_grammarParser.mult_return mult28 =null;

        malice_grammarParser.mult_return mult30 =null;


        CommonTree set29_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:5: ( mult ( ( '+' | '-' ) mult )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add466);
            mult28=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult28.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:12: ( ( '+' | '-' ) mult )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:77:13: ( '+' | '-' ) mult
            	    {
            	    set29=(Token)input.LT(1);

            	    if ( input.LA(1)==18||input.LA(1)==20 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set29)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add477);
            	    mult30=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult30.getTree());

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
    // $ANTLR end "add"


    public static class bitw_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_and"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:1: bitw_and : add ( '&' add )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal32=null;
        malice_grammarParser.add_return add31 =null;

        malice_grammarParser.add_return add33 =null;


        CommonTree char_literal32_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:10: ( add ( '&' add )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:12: add ( '&' add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_bitw_and487);
            add31=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add31.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:16: ( '&' add )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:78:17: '&' add
            	    {
            	    char_literal32=(Token)match(input,14,FOLLOW_14_in_bitw_and490); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal32_tree = 
            	    (CommonTree)adaptor.create(char_literal32)
            	    ;
            	    adaptor.addChild(root_0, char_literal32_tree);
            	    }

            	    pushFollow(FOLLOW_add_in_bitw_and492);
            	    add33=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add33.getTree());

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
    // $ANTLR end "bitw_and"


    public static class bitw_xor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_xor"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal35=null;
        malice_grammarParser.bitw_and_return bitw_and34 =null;

        malice_grammarParser.bitw_and_return bitw_and36 =null;


        CommonTree char_literal35_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:10: ( bitw_and ( '^' bitw_and )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_and_in_bitw_xor502);
            bitw_and34=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and34.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:21: ( '^' bitw_and )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:79:22: '^' bitw_and
            	    {
            	    char_literal35=(Token)match(input,32,FOLLOW_32_in_bitw_xor505); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal35_tree = 
            	    (CommonTree)adaptor.create(char_literal35)
            	    ;
            	    adaptor.addChild(root_0, char_literal35_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor507);
            	    bitw_and36=bitw_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and36.getTree());

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
    // $ANTLR end "bitw_xor"


    public static class bitw_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitw_or"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        malice_grammarParser.bitw_xor_return bitw_xor37 =null;

        malice_grammarParser.bitw_xor_return bitw_xor39 =null;


        CommonTree char_literal38_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:9: ( bitw_xor ( '|' bitw_xor )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_xor_in_bitw_or517);
            bitw_xor37=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor37.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:20: ( '|' bitw_xor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==69) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:80:21: '|' bitw_xor
            	    {
            	    char_literal38=(Token)match(input,69,FOLLOW_69_in_bitw_or520); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal38_tree = 
            	    (CommonTree)adaptor.create(char_literal38)
            	    ;
            	    adaptor.addChild(root_0, char_literal38_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or522);
            	    bitw_xor39=bitw_xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor39.getTree());

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
    // $ANTLR end "bitw_or"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:1: expr : bitw_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.bitw_or_return bitw_or40 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:6: ( bitw_or )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:82:8: bitw_or
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_or_in_expr533);
            bitw_or40=bitw_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_or40.getTree());

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


    public static class bool_neg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_neg"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:1: bool_neg : ( '!' )* ( expr ) ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        malice_grammarParser.expr_return expr42 =null;


        CommonTree char_literal41_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:10: ( ( '!' )* ( expr ) )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:12: ( '!' )* ( expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:12: ( '!' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==10) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:12: '!'
            	    {
            	    char_literal41=(Token)match(input,10,FOLLOW_10_in_bool_neg542); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal41_tree = 
            	    (CommonTree)adaptor.create(char_literal41)
            	    ;
            	    adaptor.addChild(root_0, char_literal41_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:17: ( expr )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:84:18: expr
            {
            pushFollow(FOLLOW_expr_in_bool_neg546);
            expr42=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr42.getTree());

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
    // $ANTLR end "bool_neg"


    public static class bool_comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_comp"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:1: bool_comp : bool_neg ( ( '<=' | '<' | '>' | '>=' | '==' | '!=' ) bool_neg )* ;
    public final malice_grammarParser.bool_comp_return bool_comp() throws RecognitionException {
        malice_grammarParser.bool_comp_return retval = new malice_grammarParser.bool_comp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set44=null;
        malice_grammarParser.bool_neg_return bool_neg43 =null;

        malice_grammarParser.bool_neg_return bool_neg45 =null;


        CommonTree set44_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:11: ( bool_neg ( ( '<=' | '<' | '>' | '>=' | '==' | '!=' ) bool_neg )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:13: bool_neg ( ( '<=' | '<' | '>' | '>=' | '==' | '!=' ) bool_neg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_neg_in_bool_comp555);
            bool_neg43=bool_neg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg43.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:22: ( ( '<=' | '<' | '>' | '>=' | '==' | '!=' ) bool_neg )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11||(LA12_0 >= 23 && LA12_0 <= 27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:85:23: ( '<=' | '<' | '>' | '>=' | '==' | '!=' ) bool_neg
            	    {
            	    set44=(Token)input.LT(1);

            	    if ( input.LA(1)==11||(input.LA(1) >= 23 && input.LA(1) <= 27) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set44)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bool_neg_in_bool_comp582);
            	    bool_neg45=bool_neg();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg45.getTree());

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
    // $ANTLR end "bool_comp"


    public static class bool_eq_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_eq"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:1: bool_eq : bool_comp ( ( '&&' | '||' ) bool_comp )* ;
    public final malice_grammarParser.bool_eq_return bool_eq() throws RecognitionException {
        malice_grammarParser.bool_eq_return retval = new malice_grammarParser.bool_eq_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set47=null;
        malice_grammarParser.bool_comp_return bool_comp46 =null;

        malice_grammarParser.bool_comp_return bool_comp48 =null;


        CommonTree set47_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:9: ( bool_comp ( ( '&&' | '||' ) bool_comp )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:11: bool_comp ( ( '&&' | '||' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_comp_in_bool_eq592);
            bool_comp46=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp46.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:21: ( ( '&&' | '||' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13||LA13_0==70) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:86:22: ( '&&' | '||' ) bool_comp
            	    {
            	    set47=(Token)input.LT(1);

            	    if ( input.LA(1)==13||input.LA(1)==70 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set47)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bool_comp_in_bool_eq603);
            	    bool_comp48=bool_comp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp48.getTree());

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
    // $ANTLR end "bool_eq"


    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_expr"
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:1: bool_expr : bool_eq ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.bool_eq_return bool_eq49 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:11: ( bool_eq )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:88:13: bool_eq
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_eq_in_bool_expr614);
            bool_eq49=bool_eq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_eq49.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:102:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal50=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal57=null;
        Token string_literal61=null;
        Token string_literal63=null;
        Token string_literal65=null;
        Token string_literal66=null;
        Token string_literal67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        Token string_literal70=null;
        Token string_literal74=null;
        Token string_literal76=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        Token string_literal83=null;
        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal90=null;
        Token char_literal91=null;
        malice_grammarParser.lpar_return lpar51 =null;

        malice_grammarParser.bool_expr_return bool_expr52 =null;

        malice_grammarParser.rpar_return rpar53 =null;

        malice_grammarParser.statementList_return statementList55 =null;

        malice_grammarParser.lpar_return lpar58 =null;

        malice_grammarParser.bool_expr_return bool_expr59 =null;

        malice_grammarParser.rpar_return rpar60 =null;

        malice_grammarParser.statementList_return statementList62 =null;

        malice_grammarParser.statementList_return statementList64 =null;

        malice_grammarParser.lpar_return lpar71 =null;

        malice_grammarParser.bool_expr_return bool_expr72 =null;

        malice_grammarParser.rpar_return rpar73 =null;

        malice_grammarParser.statementList_return statementList75 =null;

        malice_grammarParser.statementList_return statementList77 =null;

        malice_grammarParser.lpar_return lpar84 =null;

        malice_grammarParser.bool_expr_return bool_expr85 =null;

        malice_grammarParser.rpar_return rpar86 =null;

        malice_grammarParser.statementList_return statementList88 =null;


        CommonTree string_literal50_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree char_literal91_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:103:4: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )? )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:103:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:103:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 44:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:103:8: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )* ( 'or' statementList )? 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal50=(Token)match(input,54,FOLLOW_54_in_control_structure640); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = 
                    (CommonTree)adaptor.create(string_literal50)
                    ;
                    adaptor.addChild(root_0, string_literal50_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure642);
                    lpar51=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar51.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure644);
                    bool_expr52=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr52.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure646);
                    rpar53=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar53.getTree());

                    string_literal54=(Token)match(input,59,FOLLOW_59_in_control_structure648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal54_tree = 
                    (CommonTree)adaptor.create(string_literal54)
                    ;
                    adaptor.addChild(root_0, string_literal54_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure656);
                    statementList55=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList55.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:105:6: ( 'or' 'maybe' lpar bool_expr rpar 'so' statementList )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==53) ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==49) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:105:7: 'or' 'maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal56=(Token)match(input,53,FOLLOW_53_in_control_structure665); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal56_tree = 
                    	    (CommonTree)adaptor.create(string_literal56)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal56_tree);
                    	    }

                    	    string_literal57=(Token)match(input,49,FOLLOW_49_in_control_structure667); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal57_tree = 
                    	    (CommonTree)adaptor.create(string_literal57)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal57_tree);
                    	    }

                    	    pushFollow(FOLLOW_lpar_in_control_structure669);
                    	    lpar58=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar58.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure671);
                    	    bool_expr59=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr59.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure673);
                    	    rpar60=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar60.getTree());

                    	    string_literal61=(Token)match(input,59,FOLLOW_59_in_control_structure675); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal61_tree = 
                    	    (CommonTree)adaptor.create(string_literal61)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal61_tree);
                    	    }

                    	    pushFollow(FOLLOW_statementList_in_control_structure677);
                    	    statementList62=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:106:6: ( 'or' statementList )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==53) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:106:7: 'or' statementList
                            {
                            string_literal63=(Token)match(input,53,FOLLOW_53_in_control_structure687); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal63_tree = 
                            (CommonTree)adaptor.create(string_literal63)
                            ;
                            adaptor.addChild(root_0, string_literal63_tree);
                            }

                            pushFollow(FOLLOW_statementList_in_control_structure689);
                            statementList64=statementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList64.getTree());

                            }
                            break;

                    }


                    string_literal65=(Token)match(input,37,FOLLOW_37_in_control_structure698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal65_tree = 
                    (CommonTree)adaptor.create(string_literal65)
                    ;
                    adaptor.addChild(root_0, string_literal65_tree);
                    }

                    string_literal66=(Token)match(input,29,FOLLOW_29_in_control_structure700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal66_tree = 
                    (CommonTree)adaptor.create(string_literal66)
                    ;
                    adaptor.addChild(root_0, string_literal66_tree);
                    }

                    string_literal67=(Token)match(input,66,FOLLOW_66_in_control_structure702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal67_tree = 
                    (CommonTree)adaptor.create(string_literal67)
                    ;
                    adaptor.addChild(root_0, string_literal67_tree);
                    }

                    string_literal68=(Token)match(input,65,FOLLOW_65_in_control_structure704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal68_tree = 
                    (CommonTree)adaptor.create(string_literal68)
                    ;
                    adaptor.addChild(root_0, string_literal68_tree);
                    }

                    string_literal69=(Token)match(input,68,FOLLOW_68_in_control_structure706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal69_tree = 
                    (CommonTree)adaptor.create(string_literal69)
                    ;
                    adaptor.addChild(root_0, string_literal69_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:108:8: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because' 'Alice' 'was' 'unsure' 'which'
                    {
                    string_literal70=(Token)match(input,42,FOLLOW_42_in_control_structure715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal70_tree = 
                    (CommonTree)adaptor.create(string_literal70)
                    ;
                    adaptor.addChild(root_0, string_literal70_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure717);
                    lpar71=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar71.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure719);
                    bool_expr72=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr72.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure721);
                    rpar73=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar73.getTree());

                    string_literal74=(Token)match(input,59,FOLLOW_59_in_control_structure723); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = 
                    (CommonTree)adaptor.create(string_literal74)
                    ;
                    adaptor.addChild(root_0, string_literal74_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure731);
                    statementList75=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList75.getTree());

                    string_literal76=(Token)match(input,53,FOLLOW_53_in_control_structure740); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal76_tree = 
                    (CommonTree)adaptor.create(string_literal76)
                    ;
                    adaptor.addChild(root_0, string_literal76_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure742);
                    statementList77=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList77.getTree());

                    string_literal78=(Token)match(input,37,FOLLOW_37_in_control_structure750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal78_tree = 
                    (CommonTree)adaptor.create(string_literal78)
                    ;
                    adaptor.addChild(root_0, string_literal78_tree);
                    }

                    string_literal79=(Token)match(input,29,FOLLOW_29_in_control_structure752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal79_tree = 
                    (CommonTree)adaptor.create(string_literal79)
                    ;
                    adaptor.addChild(root_0, string_literal79_tree);
                    }

                    string_literal80=(Token)match(input,66,FOLLOW_66_in_control_structure754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal80_tree = 
                    (CommonTree)adaptor.create(string_literal80)
                    ;
                    adaptor.addChild(root_0, string_literal80_tree);
                    }

                    string_literal81=(Token)match(input,65,FOLLOW_65_in_control_structure756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal81_tree = 
                    (CommonTree)adaptor.create(string_literal81)
                    ;
                    adaptor.addChild(root_0, string_literal81_tree);
                    }

                    string_literal82=(Token)match(input,68,FOLLOW_68_in_control_structure758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal82_tree = 
                    (CommonTree)adaptor.create(string_literal82)
                    ;
                    adaptor.addChild(root_0, string_literal82_tree);
                    }

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:112:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough' 'times'
                    {
                    string_literal83=(Token)match(input,44,FOLLOW_44_in_control_structure773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal83_tree = 
                    (CommonTree)adaptor.create(string_literal83)
                    ;
                    adaptor.addChild(root_0, string_literal83_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure775);
                    lpar84=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar84.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure777);
                    bool_expr85=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr85.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure779);
                    rpar86=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar86.getTree());

                    string_literal87=(Token)match(input,37,FOLLOW_37_in_control_structure781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal87_tree = 
                    (CommonTree)adaptor.create(string_literal87)
                    ;
                    adaptor.addChild(root_0, string_literal87_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure789);
                    statementList88=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList88.getTree());

                    string_literal89=(Token)match(input,43,FOLLOW_43_in_control_structure797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal89_tree = 
                    (CommonTree)adaptor.create(string_literal89)
                    ;
                    adaptor.addChild(root_0, string_literal89_tree);
                    }

                    string_literal90=(Token)match(input,63,FOLLOW_63_in_control_structure799); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal90_tree = 
                    (CommonTree)adaptor.create(string_literal90)
                    ;
                    adaptor.addChild(root_0, string_literal90_tree);
                    }

                    }
                    break;

            }


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:115:6: ( '.' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred45_malice_grammar()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:115:6: '.'
                    {
                    char_literal91=(Token)match(input,21,FOLLOW_21_in_control_structure807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (CommonTree)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:1: declaration_statements : IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT92=null;
        Token string_literal93=null;
        Token char_literal94=null;
        Token string_literal96=null;
        Token string_literal97=null;
        Token LETTER98=null;
        Token STRING99=null;
        Token string_literal101=null;
        malice_grammarParser.data_types_return data_types95 =null;

        malice_grammarParser.expr_return expr100 =null;

        malice_grammarParser.atom_return atom102 =null;

        malice_grammarParser.data_types_return data_types103 =null;


        CommonTree IDENT92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree LETTER98_tree=null;
        CommonTree STRING99_tree=null;
        CommonTree string_literal101_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:24: ( IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:26: IDENT ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT92=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements822); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT92_tree = 
            (CommonTree)adaptor.create(IDENT92)
            ;
            adaptor.addChild(root_0, IDENT92_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:32: ( 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==66) ) {
                alt20=1;
            }
            else if ( (LA20_0==46) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:34: 'was' 'a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal93=(Token)match(input,66,FOLLOW_66_in_declaration_statements826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal93_tree = 
                    (CommonTree)adaptor.create(string_literal93)
                    ;
                    adaptor.addChild(root_0, string_literal93_tree);
                    }

                    char_literal94=(Token)match(input,33,FOLLOW_33_in_declaration_statements828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal94_tree = 
                    (CommonTree)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_declaration_statements830);
                    data_types95=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types95.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:55: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt19=3;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==64) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==51) ) {
                        alt19=2;
                    }
                    switch (alt19) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:57: 'too'
                            {
                            string_literal96=(Token)match(input,64,FOLLOW_64_in_declaration_statements834); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal96_tree = 
                            (CommonTree)adaptor.create(string_literal96)
                            ;
                            adaptor.addChild(root_0, string_literal96_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:65: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal97=(Token)match(input,51,FOLLOW_51_in_declaration_statements838); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal97_tree = 
                            (CommonTree)adaptor.create(string_literal97)
                            ;
                            adaptor.addChild(root_0, string_literal97_tree);
                            }

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:70: ( LETTER | STRING | expr )
                            int alt18=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt18=1;
                                }
                                break;
                            case STRING:
                                {
                                alt18=2;
                                }
                                break;
                            case IDENT:
                            case NUMBER:
                            case 15:
                            case 20:
                            case 71:
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
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:71: LETTER
                                    {
                                    LETTER98=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements841); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER98_tree = 
                                    (CommonTree)adaptor.create(LETTER98)
                                    ;
                                    adaptor.addChild(root_0, LETTER98_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:80: STRING
                                    {
                                    STRING99=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements845); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING99_tree = 
                                    (CommonTree)adaptor.create(STRING99)
                                    ;
                                    adaptor.addChild(root_0, STRING99_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:120:89: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements849);
                                    expr100=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr100.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:121:35: 'had' atom data_types
                    {
                    string_literal101=(Token)match(input,46,FOLLOW_46_in_declaration_statements889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal101_tree = 
                    (CommonTree)adaptor.create(string_literal101)
                    ;
                    adaptor.addChild(root_0, string_literal101_tree);
                    }

                    pushFollow(FOLLOW_atom_in_declaration_statements891);
                    atom102=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom102.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements893);
                    data_types103=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types103.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:1: argument : ( expr | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER105=null;
        Token STRING106=null;
        malice_grammarParser.expr_return expr104 =null;

        malice_grammarParser.array_elem_return array_elem107 =null;


        CommonTree LETTER105_tree=null;
        CommonTree STRING106_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:9: ( expr | LETTER | STRING | array_elem )
            int alt21=4;
            switch ( input.LA(1) ) {
            case NUMBER:
            case 15:
            case 20:
            case 71:
                {
                alt21=1;
                }
                break;
            case IDENT:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred51_malice_grammar()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case LETTER:
                {
                alt21=2;
                }
                break;
            case STRING:
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:11: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_argument959);
                    expr104=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr104.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:18: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER105=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument963); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER105_tree = 
                    (CommonTree)adaptor.create(LETTER105)
                    ;
                    adaptor.addChild(root_0, LETTER105_tree);
                    }

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:27: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING106=(Token)match(input,STRING,FOLLOW_STRING_in_argument967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING106_tree = 
                    (CommonTree)adaptor.create(STRING106)
                    ;
                    adaptor.addChild(root_0, STRING106_tree);
                    }

                    }
                    break;
                case 4 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:36: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument971);
                    array_elem107=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem107.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal109=null;
        malice_grammarParser.argument_return argument108 =null;

        malice_grammarParser.argument_return argument110 =null;

        malice_grammarParser.function_call_return function_call111 =null;


        CommonTree char_literal109_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LETTER||(LA24_0 >= NUMBER && LA24_0 <= STRING)||(LA24_0 >= 15 && LA24_0 <= 16)||LA24_0==20||LA24_0==71) ) {
                alt24=1;
            }
            else if ( (LA24_0==IDENT) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred56_malice_grammar()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:26: ( argument ( ',' argument )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0 >= IDENT && LA23_0 <= LETTER)||(LA23_0 >= NUMBER && LA23_0 <= STRING)||LA23_0==15||LA23_0==20||LA23_0==71) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions979);
                            argument108=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument108.getTree());

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:36: ( ',' argument )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==19) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:37: ',' argument
                            	    {
                            	    char_literal109=(Token)match(input,19,FOLLOW_19_in_arguments_to_functions982); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal109_tree = 
                            	    (CommonTree)adaptor.create(char_literal109)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal109_tree);
                            	    }

                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions984);
                            	    argument110=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument110.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:56: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions992);
                    function_call111=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call111.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | read_statement );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set114=null;
        Token IDENT116=null;
        Token string_literal117=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token LETTER122=null;
        Token STRING123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token LETTER129=null;
        Token STRING130=null;
        malice_grammarParser.expr_return expr112 =null;

        malice_grammarParser.print_return print113 =null;

        malice_grammarParser.print_return print115 =null;

        malice_grammarParser.expr_return expr118 =null;

        malice_grammarParser.expr_return expr121 =null;

        malice_grammarParser.expr_return expr128 =null;

        malice_grammarParser.read_statement_return read_statement131 =null;


        CommonTree set114_tree=null;
        CommonTree IDENT116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree LETTER122_tree=null;
        CommonTree STRING123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree LETTER129_tree=null;
        CommonTree STRING130_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | read_statement )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20||LA29_0==71) && (synpred57_malice_grammar())) {
                alt29=1;
            }
            else if ( (LA29_0==IDENT) ) {
                int LA29_2 = input.LA(2);

                if ( (synpred57_malice_grammar()) ) {
                    alt29=1;
                }
                else if ( (synpred65_malice_grammar()) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA29_0==NUMBER) && (synpred57_malice_grammar())) {
                alt29=1;
            }
            else if ( (LA29_0==15) && (synpred57_malice_grammar())) {
                alt29=1;
            }
            else if ( (LA29_0==LETTER||LA29_0==STRING) ) {
                alt29=2;
            }
            else if ( (LA29_0==29) ) {
                alt29=4;
            }
            else if ( (LA29_0==67) ) {
                alt29=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:38: ( expr print )
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:39: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements1011);
                    expr112=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr112.getTree());

                    pushFollow(FOLLOW_print_in_rest_statements1013);
                    print113=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print113.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:128:9: ( LETTER | STRING ) print
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set114=(Token)input.LT(1);

                    if ( input.LA(1)==LETTER||input.LA(1)==STRING ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set114)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_print_in_rest_statements1038);
                    print115=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print115.getTree());

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT116=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT116_tree = 
                    (CommonTree)adaptor.create(IDENT116)
                    ;
                    adaptor.addChild(root_0, IDENT116_tree);
                    }

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    {
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:11: ( '\\'s' expr 'piece' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==31) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:12: '\\'s' expr 'piece'
                            {
                            string_literal117=(Token)match(input,31,FOLLOW_31_in_rest_statements1060); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal117_tree = 
                            (CommonTree)adaptor.create(string_literal117)
                            ;
                            adaptor.addChild(root_0, string_literal117_tree);
                            }

                            pushFollow(FOLLOW_expr_in_rest_statements1062);
                            expr118=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

                            string_literal119=(Token)match(input,55,FOLLOW_55_in_rest_statements1064); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal119_tree = 
                            (CommonTree)adaptor.create(string_literal119)
                            ;
                            adaptor.addChild(root_0, string_literal119_tree);
                            }

                            }
                            break;

                    }


                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt27=1;
                        }
                        break;
                    case 35:
                        {
                        alt27=2;
                        }
                        break;
                    case 41:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:18: 'became' ( expr | LETTER | STRING )
                            {
                            string_literal120=(Token)match(input,36,FOLLOW_36_in_rest_statements1085); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal120_tree = 
                            (CommonTree)adaptor.create(string_literal120)
                            ;
                            adaptor.addChild(root_0, string_literal120_tree);
                            }

                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:28: ( expr | LETTER | STRING )
                            int alt26=3;
                            switch ( input.LA(1) ) {
                            case IDENT:
                            case NUMBER:
                            case 15:
                            case 20:
                            case 71:
                                {
                                alt26=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt26=2;
                                }
                                break;
                            case STRING:
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
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1089);
                                    expr121=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr121.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:36: LETTER
                                    {
                                    LETTER122=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1093); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER122_tree = 
                                    (CommonTree)adaptor.create(LETTER122)
                                    ;
                                    adaptor.addChild(root_0, LETTER122_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:45: STRING
                                    {
                                    STRING123=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1097); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING123_tree = 
                                    (CommonTree)adaptor.create(STRING123)
                                    ;
                                    adaptor.addChild(root_0, STRING123_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:18: 'ate'
                            {
                            string_literal124=(Token)match(input,35,FOLLOW_35_in_rest_statements1118); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal124_tree = 
                            (CommonTree)adaptor.create(string_literal124)
                            ;
                            adaptor.addChild(root_0, string_literal124_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:133:18: 'drank'
                            {
                            string_literal125=(Token)match(input,41,FOLLOW_41_in_rest_statements1138); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal125_tree = 
                            (CommonTree)adaptor.create(string_literal125)
                            ;
                            adaptor.addChild(root_0, string_literal125_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:138:7: 'Alice' 'found' ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal126=(Token)match(input,29,FOLLOW_29_in_rest_statements1192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal126_tree = 
                    (CommonTree)adaptor.create(string_literal126)
                    ;
                    adaptor.addChild(root_0, string_literal126_tree);
                    }

                    string_literal127=(Token)match(input,45,FOLLOW_45_in_rest_statements1194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal127_tree = 
                    (CommonTree)adaptor.create(string_literal127)
                    ;
                    adaptor.addChild(root_0, string_literal127_tree);
                    }

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:138:23: ( expr | LETTER | STRING )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUMBER:
                    case 15:
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
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:138:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1197);
                            expr128=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                            }
                            break;
                        case 2 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:138:31: LETTER
                            {
                            LETTER129=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1201); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER129_tree = 
                            (CommonTree)adaptor.create(LETTER129)
                            ;
                            adaptor.addChild(root_0, LETTER129_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:138:40: STRING
                            {
                            STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1205); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING130_tree = 
                            (CommonTree)adaptor.create(STRING130)
                            ;
                            adaptor.addChild(root_0, STRING130_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:139:7: read_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_read_statement_in_rest_statements1215);
                    read_statement131=read_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement131.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:1: read_statement : 'what' 'was' ( IDENT | array_elem ) '?' ;
    public final malice_grammarParser.read_statement_return read_statement() throws RecognitionException {
        malice_grammarParser.read_statement_return retval = new malice_grammarParser.read_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal132=null;
        Token string_literal133=null;
        Token IDENT134=null;
        Token char_literal136=null;
        malice_grammarParser.array_elem_return array_elem135 =null;


        CommonTree string_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree IDENT134_tree=null;
        CommonTree char_literal136_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:16: ( 'what' 'was' ( IDENT | array_elem ) '?' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:18: 'what' 'was' ( IDENT | array_elem ) '?'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal132=(Token)match(input,67,FOLLOW_67_in_read_statement1232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal132_tree = 
            (CommonTree)adaptor.create(string_literal132)
            ;
            adaptor.addChild(root_0, string_literal132_tree);
            }

            string_literal133=(Token)match(input,66,FOLLOW_66_in_read_statement1234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal133_tree = 
            (CommonTree)adaptor.create(string_literal133)
            ;
            adaptor.addChild(root_0, string_literal133_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:31: ( IDENT | array_elem )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENT) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==31) ) {
                    alt30=2;
                }
                else if ( (LA30_1==28) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:32: IDENT
                    {
                    IDENT134=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_statement1237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT134_tree = 
                    (CommonTree)adaptor.create(IDENT134)
                    ;
                    adaptor.addChild(root_0, IDENT134_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:143:40: array_elem
                    {
                    pushFollow(FOLLOW_array_elem_in_read_statement1241);
                    array_elem135=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem135.getTree());

                    }
                    break;

            }


            char_literal136=(Token)match(input,28,FOLLOW_28_in_read_statement1244); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal136_tree = 
            (CommonTree)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:1: print : ( 'spoke' | 'said' 'Alice' );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;

        CommonTree string_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:144:6: ( 'spoke' | 'said' 'Alice' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            else if ( (LA31_0==57) ) {
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:5: 'spoke'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal137=(Token)match(input,61,FOLLOW_61_in_print1257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal137_tree = 
                    (CommonTree)adaptor.create(string_literal137)
                    ;
                    adaptor.addChild(root_0, string_literal137_tree);
                    }

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:145:15: 'said' 'Alice'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal138=(Token)match(input,57,FOLLOW_57_in_print1261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal138_tree = 
                    (CommonTree)adaptor.create(string_literal138)
                    ;
                    adaptor.addChild(root_0, string_literal138_tree);
                    }

                    string_literal139=(Token)match(input,29,FOLLOW_29_in_print1263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = 
                    (CommonTree)adaptor.create(string_literal139)
                    ;
                    adaptor.addChild(root_0, string_literal139_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:149:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name140 =null;

        malice_grammarParser.lpar_return lpar141 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions142 =null;

        malice_grammarParser.rpar_return rpar143 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:149:15: ( function_name lpar arguments_to_functions rpar )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:149:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call1278);
            function_name140=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name140.getTree());

            pushFollow(FOLLOW_lpar_in_function_call1280);
            lpar141=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar141.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1282);
            arguments_to_functions142=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions142.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1284);
            rpar143=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar143.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:1: statement : ( rest_statements | function_call | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements144 =null;

        malice_grammarParser.function_call_return function_call145 =null;

        malice_grammarParser.declaration_statements_return declaration_statements146 =null;



        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:11: ( rest_statements | function_call | declaration_statements )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LETTER||(LA32_0 >= NUMBER && LA32_0 <= STRING)||LA32_0==15||LA32_0==20||LA32_0==29||LA32_0==67||LA32_0==71) ) {
                alt32=1;
            }
            else if ( (LA32_0==IDENT) ) {
                int LA32_2 = input.LA(2);

                if ( (synpred71_malice_grammar()) ) {
                    alt32=1;
                }
                else if ( (synpred72_malice_grammar()) ) {
                    alt32=2;
                }
                else if ( (true) ) {
                    alt32=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rest_statements_in_statement1292);
                    rest_statements144=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements144.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:31: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_statement1296);
                    function_call145=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call145.getTree());

                    }
                    break;
                case 3 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:46: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1299);
                    declaration_statements146=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements146.getTree());

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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:152:1: statement_conjunctions : ( ',' | 'and' | 'then' | 'but' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set147=null;

        CommonTree set147_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:152:24: ( ',' | 'and' | 'then' | 'but' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set147=(Token)input.LT(1);

            if ( input.LA(1)==19||input.LA(1)==34||input.LA(1)==38||input.LA(1)==62 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set147)
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:1: statementList : ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal151=null;
        malice_grammarParser.statement_return statement148 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions149 =null;

        malice_grammarParser.statement_return statement150 =null;

        malice_grammarParser.control_structure_return control_structure152 =null;

        malice_grammarParser.nested_function_return nested_function153 =null;

        malice_grammarParser.read_statement_return read_statement154 =null;

        malice_grammarParser.function_return function155 =null;


        CommonTree char_literal151_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:15: ( ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:17: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:17: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) | control_structure | nested_function | read_statement | function )*
            loop35:
            do {
                int alt35=6;
                switch ( input.LA(1) ) {
                case IDENT:
                case LETTER:
                case NUMBER:
                case STRING:
                case 15:
                case 19:
                case 20:
                case 21:
                case 29:
                case 34:
                case 38:
                case 62:
                case 71:
                    {
                    alt35=1;
                    }
                    break;
                case 67:
                    {
                    int LA35_12 = input.LA(2);

                    if ( (synpred78_malice_grammar()) ) {
                        alt35=1;
                    }
                    else if ( (synpred81_malice_grammar()) ) {
                        alt35=4;
                    }


                    }
                    break;
                case 42:
                case 44:
                case 54:
                    {
                    alt35=2;
                    }
                    break;
                case 52:
                    {
                    alt35=3;
                    }
                    break;
                case 30:
                    {
                    alt35=5;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
            	    {
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: ( statement )? ( statement_conjunctions statement )* '.'
            	    {
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: ( statement )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0 >= IDENT && LA33_0 <= LETTER)||(LA33_0 >= NUMBER && LA33_0 <= STRING)||LA33_0==15||LA33_0==20||LA33_0==29||LA33_0==67||LA33_0==71) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1341);
            	            statement148=statement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement148.getTree());

            	            }
            	            break;

            	    }


            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:30: ( statement_conjunctions statement )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==19||LA34_0==34||LA34_0==38||LA34_0==62) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:31: statement_conjunctions statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1345);
            	    	    statement_conjunctions149=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions149.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1347);
            	    	    statement150=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement150.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    char_literal151=(Token)match(input,21,FOLLOW_21_in_statementList1351); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal151_tree = 
            	    (CommonTree)adaptor.create(char_literal151)
            	    ;
            	    adaptor.addChild(root_0, char_literal151_tree);
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:73: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1356);
            	    control_structure152=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure152.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:93: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1360);
            	    nested_function153=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function153.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:111: read_statement
            	    {
            	    pushFollow(FOLLOW_read_statement_in_statementList1364);
            	    read_statement154=read_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement154.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:163:10: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1378);
            	    function155=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function155.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:166:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal156=null;
        Token IDENT158=null;
        malice_grammarParser.data_types_return data_types157 =null;


        CommonTree string_literal156_tree=null;
        CommonTree IDENT158_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:166:11: ( ( 'spider' )? data_types IDENT )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:166:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:166:13: ( 'spider' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:166:14: 'spider'
                    {
                    string_literal156=(Token)match(input,60,FOLLOW_60_in_parameter1390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal156_tree = 
                    (CommonTree)adaptor.create(string_literal156)
                    ;
                    adaptor.addChild(root_0, string_literal156_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1394);
            data_types157=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types157.getTree());

            IDENT158=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1396); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT158_tree = 
            (CommonTree)adaptor.create(IDENT158)
            ;
            adaptor.addChild(root_0, IDENT158_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal160=null;
        malice_grammarParser.parameter_return parameter159 =null;

        malice_grammarParser.parameter_return parameter161 =null;


        CommonTree char_literal160_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:12: ( ( parameter ( ',' parameter )* )? )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:14: ( parameter ( ',' parameter )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47||LA38_0==50||LA38_0==58||LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1407);
                    parameter159=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter159.getTree());

                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:25: ( ',' parameter )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==19) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:169:27: ',' parameter
                    	    {
                    	    char_literal160=(Token)match(input,19,FOLLOW_19_in_parameters1411); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal160_tree = 
                    	    (CommonTree)adaptor.create(char_literal160)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal160_tree);
                    	    }

                    	    pushFollow(FOLLOW_parameter_in_parameters1413);
                    	    parameter161=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT162=null;

        CommonTree IDENT162_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:15: ( IDENT )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:170:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT162=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1425); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT162_tree = 
            (CommonTree)adaptor.create(IDENT162)
            ;
            adaptor.addChild(root_0, IDENT162_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:172:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal163=null;
        Token string_literal165=null;
        malice_grammarParser.statementList_return statementList164 =null;


        CommonTree string_literal163_tree=null;
        CommonTree string_literal165_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:172:17: ( 'opened' statementList 'closed' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:172:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal163=(Token)match(input,52,FOLLOW_52_in_nested_function1433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal163_tree = 
            (CommonTree)adaptor.create(string_literal163)
            ;
            adaptor.addChild(root_0, string_literal163_tree);
            }

            pushFollow(FOLLOW_statementList_in_nested_function1435);
            statementList164=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList164.getTree());

            string_literal165=(Token)match(input,39,FOLLOW_39_in_nested_function1437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal165_tree = 
            (CommonTree)adaptor.create(string_literal165)
            ;
            adaptor.addChild(root_0, string_literal165_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:1: function : 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal172=null;
        Token string_literal177=null;
        Token char_literal178=null;
        Token string_literal180=null;
        Token string_literal182=null;
        malice_grammarParser.function_name_return function_name168 =null;

        malice_grammarParser.lpar_return lpar169 =null;

        malice_grammarParser.parameters_return parameters170 =null;

        malice_grammarParser.rpar_return rpar171 =null;

        malice_grammarParser.function_name_return function_name173 =null;

        malice_grammarParser.lpar_return lpar174 =null;

        malice_grammarParser.parameters_return parameters175 =null;

        malice_grammarParser.rpar_return rpar176 =null;

        malice_grammarParser.data_types_return data_types179 =null;

        malice_grammarParser.statementList_return statementList181 =null;


        CommonTree string_literal166_tree=null;
        CommonTree string_literal167_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree string_literal182_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed' )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal166=(Token)match(input,30,FOLLOW_30_in_function1444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal166_tree = 
            (CommonTree)adaptor.create(string_literal166)
            ;
            adaptor.addChild(root_0, string_literal166_tree);
            }

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained' 'a' data_types )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            else if ( (LA39_0==56) ) {
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
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:173:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal167=(Token)match(input,48,FOLLOW_48_in_function1450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal167_tree = 
                    (CommonTree)adaptor.create(string_literal167)
                    ;
                    adaptor.addChild(root_0, string_literal167_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1452);
                    function_name168=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name168.getTree());

                    pushFollow(FOLLOW_lpar_in_function1454);
                    lpar169=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar169.getTree());

                    pushFollow(FOLLOW_parameters_in_function1456);
                    parameters170=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters170.getTree());

                    pushFollow(FOLLOW_rpar_in_function1458);
                    rpar171=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar171.getTree());

                    }
                    break;
                case 2 :
                    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:174:17: 'room' function_name lpar parameters rpar 'contained' 'a' data_types
                    {
                    string_literal172=(Token)match(input,56,FOLLOW_56_in_function1476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal172_tree = 
                    (CommonTree)adaptor.create(string_literal172)
                    ;
                    adaptor.addChild(root_0, string_literal172_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1478);
                    function_name173=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name173.getTree());

                    pushFollow(FOLLOW_lpar_in_function1480);
                    lpar174=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar174.getTree());

                    pushFollow(FOLLOW_parameters_in_function1482);
                    parameters175=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters175.getTree());

                    pushFollow(FOLLOW_rpar_in_function1484);
                    rpar176=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar176.getTree());

                    string_literal177=(Token)match(input,40,FOLLOW_40_in_function1486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal177_tree = 
                    (CommonTree)adaptor.create(string_literal177)
                    ;
                    adaptor.addChild(root_0, string_literal177_tree);
                    }

                    char_literal178=(Token)match(input,33,FOLLOW_33_in_function1488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = 
                    (CommonTree)adaptor.create(char_literal178)
                    ;
                    adaptor.addChild(root_0, char_literal178_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_function1490);
                    data_types179=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types179.getTree());

                    }
                    break;

            }


            string_literal180=(Token)match(input,52,FOLLOW_52_in_function1511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal180_tree = 
            (CommonTree)adaptor.create(string_literal180)
            ;
            adaptor.addChild(root_0, string_literal180_tree);
            }

            pushFollow(FOLLOW_statementList_in_function1518);
            statementList181=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList181.getTree());

            string_literal182=(Token)match(input,39,FOLLOW_39_in_function1525); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal182_tree = 
            (CommonTree)adaptor.create(string_literal182)
            ;
            adaptor.addChild(root_0, string_literal182_tree);
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal186=null;
        malice_grammarParser.declaration_statements_return declaration_statements183 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions184 =null;

        malice_grammarParser.declaration_statements_return declaration_statements185 =null;


        CommonTree char_literal186_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==IDENT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1539);
            	    declaration_statements183=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements183.getTree());

            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:46: ( statement_conjunctions declaration_statements )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==19||LA40_0==34||LA40_0==38||LA40_0==62) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:180:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1542);
            	    	    statement_conjunctions184=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions184.getTree());

            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1544);
            	    	    declaration_statements185=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements185.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);


            	    char_literal186=(Token)match(input,21,FOLLOW_21_in_global_declaration1548); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal186_tree = 
            	    (CommonTree)adaptor.create(char_literal186)
            	    ;
            	    adaptor.addChild(root_0, char_literal186_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF189=null;
        malice_grammarParser.global_declaration_return global_declaration187 =null;

        malice_grammarParser.function_return function188 =null;


        CommonTree EOF189_tree=null;

        try {
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:9: ( global_declaration ( function )+ EOF )
            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_global_declaration_in_program1559);
            global_declaration187=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration187.getTree());

            // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:30: ( function )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==30) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:181:30: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1561);
            	    function188=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function188.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            EOF189=(Token)match(input,EOF,FOLLOW_EOF_in_program1564); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF189_tree = 
            (CommonTree)adaptor.create(EOF189)
            ;
            adaptor.addChild(root_0, EOF189_tree);
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

    // $ANTLR start synpred45_malice_grammar
    public final void synpred45_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:115:6: ( '.' )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:115:6: '.'
        {
        match(input,21,FOLLOW_21_in_synpred45_malice_grammar807); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred45_malice_grammar

    // $ANTLR start synpred51_malice_grammar
    public final void synpred51_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:11: ( expr )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:125:11: expr
        {
        pushFollow(FOLLOW_expr_in_synpred51_malice_grammar959);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_malice_grammar

    // $ANTLR start synpred56_malice_grammar
    public final void synpred56_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:26: ( ( argument ( ',' argument )* )? )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:26: ( argument ( ',' argument )* )?
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:26: ( argument ( ',' argument )* )?
        int alt51=2;
        int LA51_0 = input.LA(1);

        if ( ((LA51_0 >= IDENT && LA51_0 <= LETTER)||(LA51_0 >= NUMBER && LA51_0 <= STRING)||LA51_0==15||LA51_0==20||LA51_0==71) ) {
            alt51=1;
        }
        switch (alt51) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:27: argument ( ',' argument )*
                {
                pushFollow(FOLLOW_argument_in_synpred56_malice_grammar979);
                argument();

                state._fsp--;
                if (state.failed) return ;

                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:36: ( ',' argument )*
                loop50:
                do {
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==19) ) {
                        alt50=1;
                    }


                    switch (alt50) {
                	case 1 :
                	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:126:37: ',' argument
                	    {
                	    match(input,19,FOLLOW_19_in_synpred56_malice_grammar982); if (state.failed) return ;

                	    pushFollow(FOLLOW_argument_in_synpred56_malice_grammar984);
                	    argument();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop50;
                    }
                } while (true);


                }
                break;

        }


        }

    }
    // $ANTLR end synpred56_malice_grammar

    // $ANTLR start synpred57_malice_grammar
    public final void synpred57_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:21: ( expr print )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:127:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred57_malice_grammar1002);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_print_in_synpred57_malice_grammar1004);
        print();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_malice_grammar

    // $ANTLR start synpred65_malice_grammar
    public final void synpred65_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:8: ( IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:129:8: IDENT ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred65_malice_grammar1047); if (state.failed) return ;

        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:9: ( ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:11: ( '\\'s' expr 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:11: ( '\\'s' expr 'piece' )?
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==31) ) {
            alt53=1;
        }
        switch (alt53) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:130:12: '\\'s' expr 'piece'
                {
                match(input,31,FOLLOW_31_in_synpred65_malice_grammar1060); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred65_malice_grammar1062);
                expr();

                state._fsp--;
                if (state.failed) return ;

                match(input,55,FOLLOW_55_in_synpred65_malice_grammar1064); if (state.failed) return ;

                }
                break;

        }


        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
        int alt55=3;
        switch ( input.LA(1) ) {
        case 36:
            {
            alt55=1;
            }
            break;
        case 35:
            {
            alt55=2;
            }
            break;
        case 41:
            {
            alt55=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;

        }

        switch (alt55) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:18: 'became' ( expr | LETTER | STRING )
                {
                match(input,36,FOLLOW_36_in_synpred65_malice_grammar1085); if (state.failed) return ;

                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:28: ( expr | LETTER | STRING )
                int alt54=3;
                switch ( input.LA(1) ) {
                case IDENT:
                case NUMBER:
                case 15:
                case 20:
                case 71:
                    {
                    alt54=1;
                    }
                    break;
                case LETTER:
                    {
                    alt54=2;
                    }
                    break;
                case STRING:
                    {
                    alt54=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 0, input);

                    throw nvae;

                }

                switch (alt54) {
                    case 1 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:29: expr
                        {
                        pushFollow(FOLLOW_expr_in_synpred65_malice_grammar1089);
                        expr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:36: LETTER
                        {
                        match(input,LETTER,FOLLOW_LETTER_in_synpred65_malice_grammar1093); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:131:45: STRING
                        {
                        match(input,STRING,FOLLOW_STRING_in_synpred65_malice_grammar1097); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:132:18: 'ate'
                {
                match(input,35,FOLLOW_35_in_synpred65_malice_grammar1118); if (state.failed) return ;

                }
                break;
            case 3 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:133:18: 'drank'
                {
                match(input,41,FOLLOW_41_in_synpred65_malice_grammar1138); if (state.failed) return ;

                }
                break;

        }


        }


        }

    }
    // $ANTLR end synpred65_malice_grammar

    // $ANTLR start synpred71_malice_grammar
    public final void synpred71_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:13: ( rest_statements )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:13: rest_statements
        {
        pushFollow(FOLLOW_rest_statements_in_synpred71_malice_grammar1292);
        rest_statements();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred71_malice_grammar

    // $ANTLR start synpred72_malice_grammar
    public final void synpred72_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:31: ( function_call )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:150:31: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred72_malice_grammar1296);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred72_malice_grammar

    // $ANTLR start synpred78_malice_grammar
    public final void synpred78_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:18: ( ( ( statement )? ( statement_conjunctions statement )* '.' ) )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:18: ( ( statement )? ( statement_conjunctions statement )* '.' )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: ( statement )? ( statement_conjunctions statement )* '.'
        {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: ( statement )?
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( ((LA57_0 >= IDENT && LA57_0 <= LETTER)||(LA57_0 >= NUMBER && LA57_0 <= STRING)||LA57_0==15||LA57_0==20||LA57_0==29||LA57_0==67||LA57_0==71) ) {
            alt57=1;
        }
        switch (alt57) {
            case 1 :
                // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:19: statement
                {
                pushFollow(FOLLOW_statement_in_synpred78_malice_grammar1341);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:30: ( statement_conjunctions statement )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==19||LA58_0==34||LA58_0==38||LA58_0==62) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:31: statement_conjunctions statement
        	    {
        	    pushFollow(FOLLOW_statement_conjunctions_in_synpred78_malice_grammar1345);
        	    statement_conjunctions();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    pushFollow(FOLLOW_statement_in_synpred78_malice_grammar1347);
        	    statement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);


        match(input,21,FOLLOW_21_in_synpred78_malice_grammar1351); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred78_malice_grammar

    // $ANTLR start synpred81_malice_grammar
    public final void synpred81_malice_grammar_fragment() throws RecognitionException {
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:111: ( read_statement )
        // /homes/vv311/Malice/malice/Compiler/MAlice/src/malice_grammar/malice_grammar.g:162:111: read_statement
        {
        pushFollow(FOLLOW_read_statement_in_synpred81_malice_grammar1364);
        read_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_malice_grammar

    // Delegated rules

    public final boolean synpred45_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred65_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred71_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_malice_grammar_fragment(); // can never throw exception
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
    public final boolean synpred78_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_malice_grammar_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_31_in_array_elem310 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_array_elem312 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_array_elem314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom320 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_atom323 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_atom325 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term413 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_term415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_term417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_unary_op434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult441 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_set_in_mult444 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_unary_op_in_mult456 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_mult_in_add466 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_set_in_add469 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_mult_in_add477 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_add_in_bitw_and487 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_bitw_and490 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_add_in_bitw_and492 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor502 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_bitw_xor505 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor507 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_bitw_or520 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bitw_or_in_expr533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_bool_neg542 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_bool_neg546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_neg_in_bool_comp555 = new BitSet(new long[]{0x000000000F800802L});
    public static final BitSet FOLLOW_set_in_bool_comp558 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_neg_in_bool_comp582 = new BitSet(new long[]{0x000000000F800802L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq592 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bool_eq595 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq603 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000040L});
    public static final BitSet FOLLOW_bool_eq_in_bool_expr614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_control_structure640 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure642 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure644 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure646 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure648 = new BitSet(new long[]{0x40701464603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure656 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_53_in_control_structure665 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_control_structure667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure669 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure673 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure675 = new BitSet(new long[]{0x40701464603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure677 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_53_in_control_structure687 = new BitSet(new long[]{0x40501464603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure689 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure698 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_control_structure700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_control_structure702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_control_structure704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_control_structure706 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_42_in_control_structure715 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure717 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure719 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure721 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_control_structure723 = new BitSet(new long[]{0x40701444603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure731 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_control_structure740 = new BitSet(new long[]{0x40501464603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure742 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure750 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_control_structure752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_control_structure754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_control_structure756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_control_structure758 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_44_in_control_structure773 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_control_structure775 = new BitSet(new long[]{0x0000000000108490L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure777 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_control_structure779 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control_structure781 = new BitSet(new long[]{0x40501C44603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_control_structure789 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_control_structure797 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_control_structure799 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_control_structure807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements822 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_declaration_statements826 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_declaration_statements828 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements830 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_declaration_statements834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declaration_statements838 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_declaration_statements889 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_atom_in_declaration_statements891 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions979 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_arguments_to_functions982 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions984 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements1011 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements1030 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1047 = new BitSet(new long[]{0x0000021880000000L});
    public static final BitSet FOLLOW_31_in_rest_statements1060 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1062 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rest_statements1064 = new BitSet(new long[]{0x0000021800000000L});
    public static final BitSet FOLLOW_36_in_rest_statements1085 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rest_statements1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rest_statements1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rest_statements1192 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rest_statements1194 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_rest_statements1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_statement_in_rest_statements1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_read_statement1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_read_statement1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_read_statement1237 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_array_elem_in_read_statement1241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_read_statement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_print1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_print1261 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_print1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1278 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function_call1280 = new BitSet(new long[]{0x00000000001181B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1282 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function_call1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_statement1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1341 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1345 = new BitSet(new long[]{0x00000000201081B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statement_in_statementList1347 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_statementList1351 = new BitSet(new long[]{0x40501444603881B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_control_structure_in_statementList1356 = new BitSet(new long[]{0x40501444603881B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_nested_function_in_statementList1360 = new BitSet(new long[]{0x40501444603881B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_read_statement_in_statementList1364 = new BitSet(new long[]{0x40501444603881B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_function_in_statementList1378 = new BitSet(new long[]{0x40501444603881B2L,0x0000000000000088L});
    public static final BitSet FOLLOW_60_in_parameter1390 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1407 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_parameters1411 = new BitSet(new long[]{0x1404800000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1413 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_nested_function1433 = new BitSet(new long[]{0x405014C4603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_nested_function1435 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_nested_function1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_function1444 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_function1450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1452 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function1454 = new BitSet(new long[]{0x1404800000010000L});
    public static final BitSet FOLLOW_parameters_in_function1456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function1458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56_in_function1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1478 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lpar_in_function1480 = new BitSet(new long[]{0x1404800000010000L});
    public static final BitSet FOLLOW_parameters_in_function1482 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rpar_in_function1484 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_function1486 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_function1488 = new BitSet(new long[]{0x0404800000000000L});
    public static final BitSet FOLLOW_data_types_in_function1490 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function1511 = new BitSet(new long[]{0x405014C4603881B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statementList_in_function1518 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1539 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1544 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_global_declaration1548 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_global_declaration_in_program1559 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_in_program1561 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EOF_in_program1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred45_malice_grammar807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred51_malice_grammar959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_synpred56_malice_grammar979 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_synpred56_malice_grammar982 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_synpred56_malice_grammar984 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expr_in_synpred57_malice_grammar1002 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_print_in_synpred57_malice_grammar1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred65_malice_grammar1047 = new BitSet(new long[]{0x0000021880000000L});
    public static final BitSet FOLLOW_31_in_synpred65_malice_grammar1060 = new BitSet(new long[]{0x0000000000108090L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred65_malice_grammar1062 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred65_malice_grammar1064 = new BitSet(new long[]{0x0000021800000000L});
    public static final BitSet FOLLOW_36_in_synpred65_malice_grammar1085 = new BitSet(new long[]{0x00000000001081B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_synpred65_malice_grammar1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_synpred65_malice_grammar1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred65_malice_grammar1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred65_malice_grammar1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred65_malice_grammar1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_synpred71_malice_grammar1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred72_malice_grammar1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred78_malice_grammar1341 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_synpred78_malice_grammar1345 = new BitSet(new long[]{0x00000000201081B0L,0x0000000000000088L});
    public static final BitSet FOLLOW_statement_in_synpred78_malice_grammar1347 = new BitSet(new long[]{0x4000004400280000L});
    public static final BitSet FOLLOW_21_in_synpred78_malice_grammar1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_statement_in_synpred81_malice_grammar1364 = new BitSet(new long[]{0x0000000000000002L});

}